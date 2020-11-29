package com.github.GTNH2Mega

import cpw.mods.fml.common.FMLCommonHandler
import minetweaker.MineTweakerImplementationAPI
import minetweaker.util.IEventHandler

object RegisterReloadHandler : IEventHandler<MineTweakerImplementationAPI.ReloadEvent> {
    
    var wasAdded = false

    override fun handle(p0: MineTweakerImplementationAPI.ReloadEvent?) {
        if (wasAdded)
            return
        val classes = GTNH2MegaScripts.getClassesForPackage("com.github.GTNH2Mega.fromScripts")
        classes.forEach {
            try {
                (it.newInstance() as Runnable).run()
            } catch (e : Throwable) {
                e.printStackTrace()
            }
        }
        if (FMLCommonHandler.instance().side.isClient)
            ZZClientOnly.script()
        wasAdded = true
    }
}