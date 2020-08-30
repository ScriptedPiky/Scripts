@file:Suppress("unused", "PackageName", "MemberVisibilityCanBePrivate")

package com.github.GTNH2Mega

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLServerAboutToStartEvent
import sun.net.www.protocol.file.FileURLConnection
import java.io.File
import java.io.IOException
import java.io.UnsupportedEncodingException
import java.net.JarURLConnection
import java.net.URL
import java.net.URLConnection
import java.net.URLDecoder
import java.util.*
import java.util.jar.JarEntry
import java.util.jar.JarFile

@Mod(
        modid = GTNH2MegaScripts.MODID,
        name = GTNH2MegaScripts.MODNAME,
        version = GTNH2MegaScripts.VERSION,
        modLanguageAdapter = GTNH2MegaScripts.MODLANGUAGEADAPTER,
        dependencies = GTNH2MegaScripts.DEPENDENCIES
)
object GTNH2MegaScripts {

    const val MODID = "GTNH2MEGASCRIPTS"
    const val MODNAME = "GTNH2 Mega Scripts"
    const val VERSION = "1.0"
    const val MODLANGUAGEADAPTER = "net.shadowfacts.forgelin.KotlinAdapter"
    const val DEPENDENCIES = "required-after:forgelin;required-after:MineTweaker3;"

    @Mod.EventHandler
    fun onServerAboutToStart(ev : FMLServerAboutToStartEvent) {
        val classes = getClassesForPackage("com.github.GTNH2Mega.fromScripts")
        classes.forEach {
            try {
                (it.newInstance() as Runnable).run()
            }catch (e : Throwable) {
                e.printStackTrace()
            }
        }
    }

    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    @Throws(ClassNotFoundException::class)
    private fun checkDirectory(directory: File, pckgname: String,
                               classes: ArrayList<Class<*>>) {
        var tmpDirectory: File
        if (directory.exists() && directory.isDirectory) {
            val files: Array<String> = directory.list()
            for (file in files) {
                if (file.endsWith(".class")) {
                    try {
                        classes.add(Class.forName(pckgname + '.'
                                + file.substring(0, file.length - 6)))
                    } catch (e: NoClassDefFoundError) {
                        // do nothing. this class hasn't been found by the
                        // loader, and we don't care.
                    }
                } else if (File(directory, file).also { tmpDirectory = it }
                                .isDirectory) {
                    checkDirectory(tmpDirectory, "$pckgname.$file", classes)
                }
            }
        }
    }

    /**
     * Private helper method.
     *
     * @param connection
     * the connection to the jar
     * @param pckgname
     * the package name to search for
     * @param classes
     * the current ArrayList of all classes. This method will simply
     * add new classes.
     * @throws ClassNotFoundException
     * if a file isn't loaded but still is in the jar file
     * @throws IOException
     * if it can't correctly read from the jar file.
     */
    @Throws(ClassNotFoundException::class, IOException::class)
    private fun checkJarFile(connection: JarURLConnection,
                             pckgname: String, classes: ArrayList<Class<*>>) {
        val jarFile: JarFile = connection.jarFile
        val entries: Enumeration<JarEntry> = jarFile.entries()
        var name: String
        var jarEntry: JarEntry? = null
        while (entries.hasMoreElements()
                && entries.nextElement().also { jarEntry = it } != null) {
            name = jarEntry!!.name
            if (name.contains(".class")) {
                name = name.substring(0, name.length - 6).replace('/', '.')
                if (name.contains(pckgname)) {
                    classes.add(Class.forName(name))
                }
            }
        }
    }

    /**
     * Attempts to list all the classes in the specified package as determined
     * by the context class loader
     *
     * @param pckgname
     * the package name to search
     * @return a list of classes that exist within that package
     * @throws ClassNotFoundException
     * if something went wrong
     */
    @Throws(ClassNotFoundException::class)
    fun getClassesForPackage(pckgname: String): ArrayList<Class<*>> {
        val classes = ArrayList<Class<*>>()
        try {
            val cld = Thread.currentThread()
                    .contextClassLoader
                    ?: throw ClassNotFoundException("Can't get class loader.")
            val resources: Enumeration<URL> = cld.getResources(pckgname
                    .replace('.', '/'))
            var connection: URLConnection
            var url: URL? = null
            while (resources.hasMoreElements()
                    && resources.nextElement().also { url = it } != null) {
                try {
                    connection = url!!.openConnection()
                    when (connection) {
                        is JarURLConnection -> {
                            checkJarFile(connection, pckgname,
                                    classes)
                        }
                        is FileURLConnection -> {
                            try {
                                checkDirectory(
                                        File(URLDecoder.decode(url!!.path,
                                                "UTF-8")), pckgname, classes)
                            } catch (ex: UnsupportedEncodingException) {
                                throw ClassNotFoundException(pckgname
                                        + " does not appear to be a valid package (Unsupported encoding)",
                                        ex)
                            }
                        }
                        else -> throw ClassNotFoundException(pckgname + " ("
                                + url!!.path
                                + ") does not appear to be a valid package")
                    }
                } catch (ioex: IOException) {
                    throw ClassNotFoundException("IOException was thrown when trying to get all resources for "
                            + pckgname, ioex)
                }
            }
        } catch (ex: NullPointerException) {
            throw ClassNotFoundException(pckgname
                    + " does not appear to be a valid package (Null pointer exception)",
                    ex)
        } catch (ioex: IOException) {
            throw ClassNotFoundException("IOException was thrown when trying to get all resources for "
                    + pckgname, ioex)
        }
        return classes
    }
}