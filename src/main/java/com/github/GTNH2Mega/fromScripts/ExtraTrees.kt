package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Mixer
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import java.util.*

class ExtraTrees : Runnable {
    fun run2() {
        val recipes57 = MineTweakerAPI.recipes
        val item131 = ItemBracketHandler.getItem("ExtraTrees:door", 294)
        val hashMap131 = HashMap<String, IData>()
        hashMap131["meta"] = ExpandInt.toData(294)
        val withTag33 = item131.withTag(ExpandAnyDict.asData(hashMap131))
        val array93: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n135 = 0
        val array94 = arrayOf<IIngredient?>(null, null, null)
        val n136 = 1
        val item132 = ItemBracketHandler.getItem("ExtraTrees:door", 38)
        val hashMap132 = HashMap<String, IData>()
        hashMap132["meta"] = ExpandInt.toData(38)
        array94[n136] = item132.withTag(ExpandAnyDict.asData(hashMap132))
        array94[2] = null
        array93[n135] = array94
        array93[1] = arrayOf(null, null, null)
        array93[2] = arrayOf(null, null, null)
        recipes57.addShaped(withTag33, array93, null)
        val recipes58 = MineTweakerAPI.recipes
        val item133 = ItemBracketHandler.getItem("ExtraTrees:door", 550)
        val hashMap133 = HashMap<String, IData>()
        hashMap133["meta"] = ExpandInt.toData(550)
        val withTag34 = item133.withTag(ExpandAnyDict.asData(hashMap133))
        val array95: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n137 = 0
        val array96 = arrayOf<IIngredient?>(null, null, null)
        val n138 = 2
        val item134 = ItemBracketHandler.getItem("ExtraTrees:door", 38)
        val hashMap134 = HashMap<String, IData>()
        hashMap134["meta"] = ExpandInt.toData(38)
        array96[n138] = item134.withTag(ExpandAnyDict.asData(hashMap134))
        array95[n137] = array96
        array95[1] = arrayOf(null, null, null)
        array95[2] = arrayOf(null, null, null)
        recipes58.addShaped(withTag34, array95, null)
        val recipes59 = MineTweakerAPI.recipes
        val item135 = ItemBracketHandler.getItem("ExtraTrees:door", 806)
        val hashMap135 = HashMap<String, IData>()
        hashMap135["meta"] = ExpandInt.toData(806)
        val withTag35 = item135.withTag(ExpandAnyDict.asData(hashMap135))
        val array97 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n139 = 1
        val array98 = arrayOfNulls<IIngredient>(3)
        val n140 = 0
        val item136 = ItemBracketHandler.getItem("ExtraTrees:door", 38)
        val hashMap136 = HashMap<String, IData>()
        hashMap136["meta"] = ExpandInt.toData(38)
        array98[n140] = item136.withTag(ExpandAnyDict.asData(hashMap136))
        array98[2] = null.also { array98[1] = it }
        array97[n139] = array98
        array97[2] = arrayOf(null, null, null)
        recipes59.addShaped(withTag35, array97, null)
        val recipes60 = MineTweakerAPI.recipes
        val item137 = ItemBracketHandler.getItem("ExtraTrees:door", 39)
        val hashMap137 = HashMap<String, IData>()
        hashMap137["meta"] = ExpandInt.toData(39)
        val withTag36 = item137.withTag(ExpandAnyDict.asData(hashMap137))
        val array99: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n141 = 0
        val array100 = arrayOfNulls<IIngredient>(3)
        val n142 = 0
        val item138 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap138 = HashMap<String, IData>()
        hashMap138["meta"] = ExpandInt.toData(7)
        array100[n142] = item138.withTag(ExpandAnyDict.asData(hashMap138))
        array100[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array100[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array99[n141] = array100
        val n143 = 1
        val array101 = arrayOfNulls<IIngredient>(3)
        val n144 = 0
        val item139 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap139 = HashMap<String, IData>()
        hashMap139["meta"] = ExpandInt.toData(7)
        array101[n144] = item139.withTag(ExpandAnyDict.asData(hashMap139))
        array101[1] = OreBracketHandler.getOre("ringAnyIron")
        array101[2] = OreBracketHandler.getOre("screwAnyIron")
        array99[n143] = array101
        val n145 = 2
        val array102 = arrayOfNulls<IIngredient>(3)
        val n146 = 0
        val item140 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap140 = HashMap<String, IData>()
        hashMap140["meta"] = ExpandInt.toData(7)
        array102[n146] = item140.withTag(ExpandAnyDict.asData(hashMap140))
        val n147 = 1
        val item141 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap141 = HashMap<String, IData>()
        hashMap141["meta"] = ExpandInt.toData(7)
        array102[n147] = item141.withTag(ExpandAnyDict.asData(hashMap141))
        array102[2] = OreBracketHandler.getOre("craftingToolSaw")
        array99[n145] = array102
        recipes60.addShaped(withTag36, array99, null)
        val recipes61 = MineTweakerAPI.recipes
        val item142 = ItemBracketHandler.getItem("ExtraTrees:door", 39)
        val hashMap142 = HashMap<String, IData>()
        hashMap142["meta"] = ExpandInt.toData(39)
        val withTag37 = item142.withTag(ExpandAnyDict.asData(hashMap142))
        val array103: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n148 = 0
        val array104 = arrayOfNulls<IIngredient>(3)
        val n149 = 0
        val item143 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap143 = HashMap<String, IData>()
        hashMap143["meta"] = ExpandInt.toData(7)
        array104[n149] = item143.withTag(ExpandAnyDict.asData(hashMap143))
        array104[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array104[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array103[n148] = array104
        val n150 = 1
        val array105 = arrayOfNulls<IIngredient>(3)
        val n151 = 0
        val item144 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap144 = HashMap<String, IData>()
        hashMap144["meta"] = ExpandInt.toData(7)
        array105[n151] = item144.withTag(ExpandAnyDict.asData(hashMap144))
        array105[1] = OreBracketHandler.getOre("ringCopper")
        array105[2] = OreBracketHandler.getOre("screwCopper")
        array103[n150] = array105
        val n152 = 2
        val array106 = arrayOfNulls<IIngredient>(3)
        val n153 = 0
        val item145 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap145 = HashMap<String, IData>()
        hashMap145["meta"] = ExpandInt.toData(7)
        array106[n153] = item145.withTag(ExpandAnyDict.asData(hashMap145))
        val n154 = 1
        val item146 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap146 = HashMap<String, IData>()
        hashMap146["meta"] = ExpandInt.toData(7)
        array106[n154] = item146.withTag(ExpandAnyDict.asData(hashMap146))
        array106[2] = OreBracketHandler.getOre("craftingToolSaw")
        array103[n152] = array106
        recipes61.addShaped(withTag37, array103, null)
        val recipes97 = MineTweakerAPI.recipes
        val item259 = ItemBracketHandler.getItem("ExtraTrees:door", 302)
        val hashMap259 = HashMap<String, IData>()
        hashMap259["meta"] = ExpandInt.toData(302)
        val withTag73 = item259.withTag(ExpandAnyDict.asData(hashMap259))
        val array205: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n295 = 0
        val array206 = arrayOf<IIngredient?>(null, null, null)
        val n296 = 1
        val item260 = ItemBracketHandler.getItem("ExtraTrees:door", 46)
        val hashMap260 = HashMap<String, IData>()
        hashMap260["meta"] = ExpandInt.toData(46)
        array206[n296] = item260.withTag(ExpandAnyDict.asData(hashMap260))
        array206[2] = null
        array205[n295] = array206
        array205[1] = arrayOf(null, null, null)
        array205[2] = arrayOf(null, null, null)
        recipes97.addShaped(withTag73, array205, null)
        val recipes98 = MineTweakerAPI.recipes
        val item261 = ItemBracketHandler.getItem("ExtraTrees:door", 558)
        val hashMap261 = HashMap<String, IData>()
        hashMap261["meta"] = ExpandInt.toData(558)
        val withTag74 = item261.withTag(ExpandAnyDict.asData(hashMap261))
        val array207: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n297 = 0
        val array208 = arrayOf<IIngredient?>(null, null, null)
        val n298 = 2
        val item262 = ItemBracketHandler.getItem("ExtraTrees:door", 46)
        val hashMap262 = HashMap<String, IData>()
        hashMap262["meta"] = ExpandInt.toData(46)
        array208[n298] = item262.withTag(ExpandAnyDict.asData(hashMap262))
        array207[n297] = array208
        array207[1] = arrayOf(null, null, null)
        array207[2] = arrayOf(null, null, null)
        recipes98.addShaped(withTag74, array207, null)
        val recipes99 = MineTweakerAPI.recipes
        val item263 = ItemBracketHandler.getItem("ExtraTrees:door", 814)
        val hashMap263 = HashMap<String, IData>()
        hashMap263["meta"] = ExpandInt.toData(814)
        val withTag75 = item263.withTag(ExpandAnyDict.asData(hashMap263))
        val array209 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n299 = 1
        val array210 = arrayOfNulls<IIngredient>(3)
        val n300 = 0
        val item264 = ItemBracketHandler.getItem("ExtraTrees:door", 46)
        val hashMap264 = HashMap<String, IData>()
        hashMap264["meta"] = ExpandInt.toData(46)
        array210[n300] = item264.withTag(ExpandAnyDict.asData(hashMap264))
        array210[2] = null.also { array210[1] = it }
        array209[n299] = array210
        array209[2] = arrayOf(null, null, null)
        recipes99.addShaped(withTag75, array209, null)
        val recipes100 = MineTweakerAPI.recipes
        val item265 = ItemBracketHandler.getItem("ExtraTrees:door", 47)
        val hashMap265 = HashMap<String, IData>()
        hashMap265["meta"] = ExpandInt.toData(47)
        val withTag76 = item265.withTag(ExpandAnyDict.asData(hashMap265))
        val array211: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n301 = 0
        val array212 = arrayOfNulls<IIngredient>(3)
        val n302 = 0
        val item266 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap266 = HashMap<String, IData>()
        hashMap266["meta"] = ExpandInt.toData(15)
        array212[n302] = item266.withTag(ExpandAnyDict.asData(hashMap266))
        array212[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array212[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array211[n301] = array212
        val n303 = 1
        val array213 = arrayOfNulls<IIngredient>(3)
        val n304 = 0
        val item267 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap267 = HashMap<String, IData>()
        hashMap267["meta"] = ExpandInt.toData(15)
        array213[n304] = item267.withTag(ExpandAnyDict.asData(hashMap267))
        array213[1] = OreBracketHandler.getOre("ringAnyIron")
        array213[2] = OreBracketHandler.getOre("screwAnyIron")
        array211[n303] = array213
        val n305 = 2
        val array214 = arrayOfNulls<IIngredient>(3)
        val n306 = 0
        val item268 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap268 = HashMap<String, IData>()
        hashMap268["meta"] = ExpandInt.toData(15)
        array214[n306] = item268.withTag(ExpandAnyDict.asData(hashMap268))
        val n307 = 1
        val item269 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap269 = HashMap<String, IData>()
        hashMap269["meta"] = ExpandInt.toData(15)
        array214[n307] = item269.withTag(ExpandAnyDict.asData(hashMap269))
        array214[2] = OreBracketHandler.getOre("craftingToolSaw")
        array211[n305] = array214
        recipes100.addShaped(withTag76, array211, null)
        val recipes101 = MineTweakerAPI.recipes
        val item270 = ItemBracketHandler.getItem("ExtraTrees:door", 47)
        val hashMap270 = HashMap<String, IData>()
        hashMap270["meta"] = ExpandInt.toData(47)
        val withTag77 = item270.withTag(ExpandAnyDict.asData(hashMap270))
        val array215: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n308 = 0
        val array216 = arrayOfNulls<IIngredient>(3)
        val n309 = 0
        val item271 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap271 = HashMap<String, IData>()
        hashMap271["meta"] = ExpandInt.toData(15)
        array216[n309] = item271.withTag(ExpandAnyDict.asData(hashMap271))
        array216[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array216[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array215[n308] = array216
        val n310 = 1
        val array217 = arrayOfNulls<IIngredient>(3)
        val n311 = 0
        val item272 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap272 = HashMap<String, IData>()
        hashMap272["meta"] = ExpandInt.toData(15)
        array217[n311] = item272.withTag(ExpandAnyDict.asData(hashMap272))
        array217[1] = OreBracketHandler.getOre("ringCopper")
        array217[2] = OreBracketHandler.getOre("screwCopper")
        array215[n310] = array217
        val n312 = 2
        val array218 = arrayOfNulls<IIngredient>(3)
        val n313 = 0
        val item273 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap273 = HashMap<String, IData>()
        hashMap273["meta"] = ExpandInt.toData(15)
        array218[n313] = item273.withTag(ExpandAnyDict.asData(hashMap273))
        val n314 = 1
        val item274 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap274 = HashMap<String, IData>()
        hashMap274["meta"] = ExpandInt.toData(15)
        array218[n314] = item274.withTag(ExpandAnyDict.asData(hashMap274))
        array218[2] = OreBracketHandler.getOre("craftingToolSaw")
        array215[n312] = array218
        recipes101.addShaped(withTag77, array215, null)
        val recipes102 = MineTweakerAPI.recipes
        val item275 = ItemBracketHandler.getItem("ExtraTrees:door", 303)
        val hashMap275 = HashMap<String, IData>()
        hashMap275["meta"] = ExpandInt.toData(303)
        val withTag78 = item275.withTag(ExpandAnyDict.asData(hashMap275))
        val array219: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n315 = 0
        val array220 = arrayOf<IIngredient?>(null, null, null)
        val n316 = 1
        val item276 = ItemBracketHandler.getItem("ExtraTrees:door", 47)
        val hashMap276 = HashMap<String, IData>()
        hashMap276["meta"] = ExpandInt.toData(47)
        array220[n316] = item276.withTag(ExpandAnyDict.asData(hashMap276))
        array220[2] = null
        array219[n315] = array220
        array219[1] = arrayOf(null, null, null)
        array219[2] = arrayOf(null, null, null)
        recipes102.addShaped(withTag78, array219, null)
        val recipes103 = MineTweakerAPI.recipes
        val item277 = ItemBracketHandler.getItem("ExtraTrees:door", 559)
        val hashMap277 = HashMap<String, IData>()
        hashMap277["meta"] = ExpandInt.toData(559)
        val withTag79 = item277.withTag(ExpandAnyDict.asData(hashMap277))
        val array221: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n317 = 0
        val array222 = arrayOf<IIngredient?>(null, null, null)
        val n318 = 2
        val item278 = ItemBracketHandler.getItem("ExtraTrees:door", 47)
        val hashMap278 = HashMap<String, IData>()
        hashMap278["meta"] = ExpandInt.toData(47)
        array222[n318] = item278.withTag(ExpandAnyDict.asData(hashMap278))
        array221[n317] = array222
        array221[1] = arrayOf(null, null, null)
        array221[2] = arrayOf(null, null, null)
        recipes103.addShaped(withTag79, array221, null)
        val recipes104 = MineTweakerAPI.recipes
        val item279 = ItemBracketHandler.getItem("ExtraTrees:door", 815)
        val hashMap279 = HashMap<String, IData>()
        hashMap279["meta"] = ExpandInt.toData(815)
        val withTag80 = item279.withTag(ExpandAnyDict.asData(hashMap279))
        val array223 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n319 = 1
        val array224 = arrayOfNulls<IIngredient>(3)
        val n320 = 0
        val item280 = ItemBracketHandler.getItem("ExtraTrees:door", 47)
        val hashMap280 = HashMap<String, IData>()
        hashMap280["meta"] = ExpandInt.toData(47)
        array224[n320] = item280.withTag(ExpandAnyDict.asData(hashMap280))
        array224[2] = null.also { array224[1] = it }
        array223[n319] = array224
        array223[2] = arrayOf(null, null, null)
        recipes104.addShaped(withTag80, array223, null)
        val recipes105 = MineTweakerAPI.recipes
        val item281 = ItemBracketHandler.getItem("ExtraTrees:door", 48)
        val hashMap281 = HashMap<String, IData>()
        hashMap281["meta"] = ExpandInt.toData(48)
        val withTag81 = item281.withTag(ExpandAnyDict.asData(hashMap281))
        val array225: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n321 = 0
        val array226 = arrayOfNulls<IIngredient>(3)
        val n322 = 0
        val item282 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap282 = HashMap<String, IData>()
        hashMap282["meta"] = ExpandInt.toData(16)
        array226[n322] = item282.withTag(ExpandAnyDict.asData(hashMap282))
        array226[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array226[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array225[n321] = array226
        val n323 = 1
        val array227 = arrayOfNulls<IIngredient>(3)
        val n324 = 0
        val item283 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap283 = HashMap<String, IData>()
        hashMap283["meta"] = ExpandInt.toData(16)
        array227[n324] = item283.withTag(ExpandAnyDict.asData(hashMap283))
        array227[1] = OreBracketHandler.getOre("ringAnyIron")
        array227[2] = OreBracketHandler.getOre("screwAnyIron")
        array225[n323] = array227
        val n325 = 2
        val array228 = arrayOfNulls<IIngredient>(3)
        val n326 = 0
        val item284 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap284 = HashMap<String, IData>()
        hashMap284["meta"] = ExpandInt.toData(16)
        array228[n326] = item284.withTag(ExpandAnyDict.asData(hashMap284))
        val n327 = 1
        val item285 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap285 = HashMap<String, IData>()
        hashMap285["meta"] = ExpandInt.toData(16)
        array228[n327] = item285.withTag(ExpandAnyDict.asData(hashMap285))
        array228[2] = OreBracketHandler.getOre("craftingToolSaw")
        array225[n325] = array228
        recipes105.addShaped(withTag81, array225, null)
        val recipes106 = MineTweakerAPI.recipes
        val item286 = ItemBracketHandler.getItem("ExtraTrees:door", 48)
        val hashMap286 = HashMap<String, IData>()
        hashMap286["meta"] = ExpandInt.toData(48)
        val withTag82 = item286.withTag(ExpandAnyDict.asData(hashMap286))
        val array229: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n328 = 0
        val array230 = arrayOfNulls<IIngredient>(3)
        val n329 = 0
        val item287 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap287 = HashMap<String, IData>()
        hashMap287["meta"] = ExpandInt.toData(16)
        array230[n329] = item287.withTag(ExpandAnyDict.asData(hashMap287))
        array230[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array230[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array229[n328] = array230
        val n330 = 1
        val array231 = arrayOfNulls<IIngredient>(3)
        val n331 = 0
        val item288 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap288 = HashMap<String, IData>()
        hashMap288["meta"] = ExpandInt.toData(16)
        array231[n331] = item288.withTag(ExpandAnyDict.asData(hashMap288))
        array231[1] = OreBracketHandler.getOre("ringCopper")
        array231[2] = OreBracketHandler.getOre("screwCopper")
        array229[n330] = array231
        val n332 = 2
        val array232 = arrayOfNulls<IIngredient>(3)
        val n333 = 0
        val item289 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap289 = HashMap<String, IData>()
        hashMap289["meta"] = ExpandInt.toData(16)
        array232[n333] = item289.withTag(ExpandAnyDict.asData(hashMap289))
        val n334 = 1
        val item290 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap290 = HashMap<String, IData>()
        hashMap290["meta"] = ExpandInt.toData(16)
        array232[n334] = item290.withTag(ExpandAnyDict.asData(hashMap290))
        array232[2] = OreBracketHandler.getOre("craftingToolSaw")
        array229[n332] = array232
        recipes106.addShaped(withTag82, array229, null)
        val recipes107 = MineTweakerAPI.recipes
        val item291 = ItemBracketHandler.getItem("ExtraTrees:door", 304)
        val hashMap291 = HashMap<String, IData>()
        hashMap291["meta"] = ExpandInt.toData(304)
        val withTag83 = item291.withTag(ExpandAnyDict.asData(hashMap291))
        val array233: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n335 = 0
        val array234 = arrayOf<IIngredient?>(null, null, null)
        val n336 = 1
        val item292 = ItemBracketHandler.getItem("ExtraTrees:door", 48)
        val hashMap292 = HashMap<String, IData>()
        hashMap292["meta"] = ExpandInt.toData(48)
        array234[n336] = item292.withTag(ExpandAnyDict.asData(hashMap292))
        array234[2] = null
        array233[n335] = array234
        array233[1] = arrayOf(null, null, null)
        array233[2] = arrayOf(null, null, null)
        recipes107.addShaped(withTag83, array233, null)
        val recipes108 = MineTweakerAPI.recipes
        val item293 = ItemBracketHandler.getItem("ExtraTrees:door", 560)
        val hashMap293 = HashMap<String, IData>()
        hashMap293["meta"] = ExpandInt.toData(560)
        val withTag84 = item293.withTag(ExpandAnyDict.asData(hashMap293))
        val array235: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n337 = 0
        val array236 = arrayOf<IIngredient?>(null, null, null)
        val n338 = 2
        val item294 = ItemBracketHandler.getItem("ExtraTrees:door", 48)
        val hashMap294 = HashMap<String, IData>()
        hashMap294["meta"] = ExpandInt.toData(48)
        array236[n338] = item294.withTag(ExpandAnyDict.asData(hashMap294))
        array235[n337] = array236
        array235[1] = arrayOf(null, null, null)
        array235[2] = arrayOf(null, null, null)
        recipes108.addShaped(withTag84, array235, null)
        val recipes109 = MineTweakerAPI.recipes
        val item295 = ItemBracketHandler.getItem("ExtraTrees:door", 816)
        val hashMap295 = HashMap<String, IData>()
        hashMap295["meta"] = ExpandInt.toData(816)
        val withTag85 = item295.withTag(ExpandAnyDict.asData(hashMap295))
        val array237 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n339 = 1
        val array238 = arrayOfNulls<IIngredient>(3)
        val n340 = 0
        val item296 = ItemBracketHandler.getItem("ExtraTrees:door", 48)
        val hashMap296 = HashMap<String, IData>()
        hashMap296["meta"] = ExpandInt.toData(48)
        array238[n340] = item296.withTag(ExpandAnyDict.asData(hashMap296))
        array238[2] = null.also { array238[1] = it }
        array237[n339] = array238
        array237[2] = arrayOf(null, null, null)
        recipes109.addShaped(withTag85, array237, null)
        val recipes110 = MineTweakerAPI.recipes
        val item297 = ItemBracketHandler.getItem("ExtraTrees:door", 49)
        val hashMap297 = HashMap<String, IData>()
        hashMap297["meta"] = ExpandInt.toData(49)
        val withTag86 = item297.withTag(ExpandAnyDict.asData(hashMap297))
        val array239: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n341 = 0
        val array240 = arrayOfNulls<IIngredient>(3)
        val n342 = 0
        val item298 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap298 = HashMap<String, IData>()
        hashMap298["meta"] = ExpandInt.toData(17)
        array240[n342] = item298.withTag(ExpandAnyDict.asData(hashMap298))
        array240[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array240[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array239[n341] = array240
        val n343 = 1
        val array241 = arrayOfNulls<IIngredient>(3)
        val n344 = 0
        val item299 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap299 = HashMap<String, IData>()
        hashMap299["meta"] = ExpandInt.toData(17)
        array241[n344] = item299.withTag(ExpandAnyDict.asData(hashMap299))
        array241[1] = OreBracketHandler.getOre("ringAnyIron")
        array241[2] = OreBracketHandler.getOre("screwAnyIron")
        array239[n343] = array241
        val n345 = 2
        val array242 = arrayOfNulls<IIngredient>(3)
        val n346 = 0
        val item300 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap300 = HashMap<String, IData>()
        hashMap300["meta"] = ExpandInt.toData(17)
        array242[n346] = item300.withTag(ExpandAnyDict.asData(hashMap300))
        val n347 = 1
        val item301 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap301 = HashMap<String, IData>()
        hashMap301["meta"] = ExpandInt.toData(17)
        array242[n347] = item301.withTag(ExpandAnyDict.asData(hashMap301))
        array242[2] = OreBracketHandler.getOre("craftingToolSaw")
        array239[n345] = array242
        recipes110.addShaped(withTag86, array239, null)
        val recipes111 = MineTweakerAPI.recipes
        val item302 = ItemBracketHandler.getItem("ExtraTrees:door", 49)
        val hashMap302 = HashMap<String, IData>()
        hashMap302["meta"] = ExpandInt.toData(49)
        val withTag87 = item302.withTag(ExpandAnyDict.asData(hashMap302))
        val array243: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n348 = 0
        val array244 = arrayOfNulls<IIngredient>(3)
        val n349 = 0
        val item303 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap303 = HashMap<String, IData>()
        hashMap303["meta"] = ExpandInt.toData(17)
        array244[n349] = item303.withTag(ExpandAnyDict.asData(hashMap303))
        array244[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array244[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array243[n348] = array244
        val n350 = 1
        val array245 = arrayOfNulls<IIngredient>(3)
        val n351 = 0
        val item304 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap304 = HashMap<String, IData>()
        hashMap304["meta"] = ExpandInt.toData(17)
        array245[n351] = item304.withTag(ExpandAnyDict.asData(hashMap304))
        array245[1] = OreBracketHandler.getOre("ringCopper")
        array245[2] = OreBracketHandler.getOre("screwCopper")
        array243[n350] = array245
        val n352 = 2
        val array246 = arrayOfNulls<IIngredient>(3)
        val n353 = 0
        val item305 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap305 = HashMap<String, IData>()
        hashMap305["meta"] = ExpandInt.toData(17)
        array246[n353] = item305.withTag(ExpandAnyDict.asData(hashMap305))
        val n354 = 1
        val item306 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap306 = HashMap<String, IData>()
        hashMap306["meta"] = ExpandInt.toData(17)
        array246[n354] = item306.withTag(ExpandAnyDict.asData(hashMap306))
        array246[2] = OreBracketHandler.getOre("craftingToolSaw")
        array243[n352] = array246
        recipes111.addShaped(withTag87, array243, null)
        val recipes112 = MineTweakerAPI.recipes
        val item307 = ItemBracketHandler.getItem("ExtraTrees:door", 305)
        val hashMap307 = HashMap<String, IData>()
        hashMap307["meta"] = ExpandInt.toData(305)
        val withTag88 = item307.withTag(ExpandAnyDict.asData(hashMap307))
        val array247: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n355 = 0
        val array248 = arrayOf<IIngredient?>(null, null, null)
        val n356 = 1
        val item308 = ItemBracketHandler.getItem("ExtraTrees:door", 49)
        val hashMap308 = HashMap<String, IData>()
        hashMap308["meta"] = ExpandInt.toData(49)
        array248[n356] = item308.withTag(ExpandAnyDict.asData(hashMap308))
        array248[2] = null
        array247[n355] = array248
        array247[1] = arrayOf(null, null, null)
        array247[2] = arrayOf(null, null, null)
        recipes112.addShaped(withTag88, array247, null)
        val recipes113 = MineTweakerAPI.recipes
        val item309 = ItemBracketHandler.getItem("ExtraTrees:door", 561)
        val hashMap309 = HashMap<String, IData>()
        hashMap309["meta"] = ExpandInt.toData(561)
        val withTag89 = item309.withTag(ExpandAnyDict.asData(hashMap309))
        val array249: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n357 = 0
        val array250 = arrayOf<IIngredient?>(null, null, null)
        val n358 = 2
        val item310 = ItemBracketHandler.getItem("ExtraTrees:door", 49)
        val hashMap310 = HashMap<String, IData>()
        hashMap310["meta"] = ExpandInt.toData(49)
        array250[n358] = item310.withTag(ExpandAnyDict.asData(hashMap310))
        array249[n357] = array250
        array249[1] = arrayOf(null, null, null)
        array249[2] = arrayOf(null, null, null)
        recipes113.addShaped(withTag89, array249, null)
        val recipes114 = MineTweakerAPI.recipes
        val item311 = ItemBracketHandler.getItem("ExtraTrees:door", 817)
        val hashMap311 = HashMap<String, IData>()
        hashMap311["meta"] = ExpandInt.toData(817)
        val withTag90 = item311.withTag(ExpandAnyDict.asData(hashMap311))
        val array251 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n359 = 1
        val array252 = arrayOfNulls<IIngredient>(3)
        val n360 = 0
        val item312 = ItemBracketHandler.getItem("ExtraTrees:door", 49)
        val hashMap312 = HashMap<String, IData>()
        hashMap312["meta"] = ExpandInt.toData(49)
        array252[n360] = item312.withTag(ExpandAnyDict.asData(hashMap312))
        array252[2] = null.also { array252[1] = it }
        array251[n359] = array252
        array251[2] = arrayOf(null, null, null)
        recipes114.addShaped(withTag90, array251, null)
        val recipes115 = MineTweakerAPI.recipes
        val item313 = ItemBracketHandler.getItem("ExtraTrees:door", 50)
        val hashMap313 = HashMap<String, IData>()
        hashMap313["meta"] = ExpandInt.toData(50)
        val withTag91 = item313.withTag(ExpandAnyDict.asData(hashMap313))
        val array253: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n361 = 0
        val array254 = arrayOfNulls<IIngredient>(3)
        val n362 = 0
        val item314 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap314 = HashMap<String, IData>()
        hashMap314["meta"] = ExpandInt.toData(18)
        array254[n362] = item314.withTag(ExpandAnyDict.asData(hashMap314))
        array254[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array254[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array253[n361] = array254
        val n363 = 1
        val array255 = arrayOfNulls<IIngredient>(3)
        val n364 = 0
        val item315 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap315 = HashMap<String, IData>()
        hashMap315["meta"] = ExpandInt.toData(18)
        array255[n364] = item315.withTag(ExpandAnyDict.asData(hashMap315))
        array255[1] = OreBracketHandler.getOre("ringAnyIron")
        array255[2] = OreBracketHandler.getOre("screwAnyIron")
        array253[n363] = array255
        val n365 = 2
        val array256 = arrayOfNulls<IIngredient>(3)
        val n366 = 0
        val item316 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap316 = HashMap<String, IData>()
        hashMap316["meta"] = ExpandInt.toData(18)
        array256[n366] = item316.withTag(ExpandAnyDict.asData(hashMap316))
        val n367 = 1
        val item317 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap317 = HashMap<String, IData>()
        hashMap317["meta"] = ExpandInt.toData(18)
        array256[n367] = item317.withTag(ExpandAnyDict.asData(hashMap317))
        array256[2] = OreBracketHandler.getOre("craftingToolSaw")
        array253[n365] = array256
        recipes115.addShaped(withTag91, array253, null)
        val recipes116 = MineTweakerAPI.recipes
        val item318 = ItemBracketHandler.getItem("ExtraTrees:door", 50)
        val hashMap318 = HashMap<String, IData>()
        hashMap318["meta"] = ExpandInt.toData(50)
        val withTag92 = item318.withTag(ExpandAnyDict.asData(hashMap318))
        val array257: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n368 = 0
        val array258 = arrayOfNulls<IIngredient>(3)
        val n369 = 0
        val item319 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap319 = HashMap<String, IData>()
        hashMap319["meta"] = ExpandInt.toData(18)
        array258[n369] = item319.withTag(ExpandAnyDict.asData(hashMap319))
        array258[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array258[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array257[n368] = array258
        val n370 = 1
        val array259 = arrayOfNulls<IIngredient>(3)
        val n371 = 0
        val item320 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap320 = HashMap<String, IData>()
        hashMap320["meta"] = ExpandInt.toData(18)
        array259[n371] = item320.withTag(ExpandAnyDict.asData(hashMap320))
        array259[1] = OreBracketHandler.getOre("ringCopper")
        array259[2] = OreBracketHandler.getOre("screwCopper")
        array257[n370] = array259
        val n372 = 2
        val array260 = arrayOfNulls<IIngredient>(3)
        val n373 = 0
        val item321 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap321 = HashMap<String, IData>()
        hashMap321["meta"] = ExpandInt.toData(18)
        array260[n373] = item321.withTag(ExpandAnyDict.asData(hashMap321))
        val n374 = 1
        val item322 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap322 = HashMap<String, IData>()
        hashMap322["meta"] = ExpandInt.toData(18)
        array260[n374] = item322.withTag(ExpandAnyDict.asData(hashMap322))
        array260[2] = OreBracketHandler.getOre("craftingToolSaw")
        array257[n372] = array260
        recipes116.addShaped(withTag92, array257, null)
        val recipes117 = MineTweakerAPI.recipes
        val item323 = ItemBracketHandler.getItem("ExtraTrees:door", 306)
        val hashMap323 = HashMap<String, IData>()
        hashMap323["meta"] = ExpandInt.toData(306)
        val withTag93 = item323.withTag(ExpandAnyDict.asData(hashMap323))
        val array261: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n375 = 0
        val array262 = arrayOf<IIngredient?>(null, null, null)
        val n376 = 1
        val item324 = ItemBracketHandler.getItem("ExtraTrees:door", 50)
        val hashMap324 = HashMap<String, IData>()
        hashMap324["meta"] = ExpandInt.toData(50)
        array262[n376] = item324.withTag(ExpandAnyDict.asData(hashMap324))
        array262[2] = null
        array261[n375] = array262
        array261[1] = arrayOf(null, null, null)
        array261[2] = arrayOf(null, null, null)
        recipes117.addShaped(withTag93, array261, null)
        val recipes118 = MineTweakerAPI.recipes
        val item325 = ItemBracketHandler.getItem("ExtraTrees:door", 562)
        val hashMap325 = HashMap<String, IData>()
        hashMap325["meta"] = ExpandInt.toData(562)
        val withTag94 = item325.withTag(ExpandAnyDict.asData(hashMap325))
        val array263: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n377 = 0
        val array264 = arrayOf<IIngredient?>(null, null, null)
        val n378 = 2
        val item326 = ItemBracketHandler.getItem("ExtraTrees:door", 50)
        val hashMap326 = HashMap<String, IData>()
        hashMap326["meta"] = ExpandInt.toData(50)
        array264[n378] = item326.withTag(ExpandAnyDict.asData(hashMap326))
        array263[n377] = array264
        array263[1] = arrayOf(null, null, null)
        array263[2] = arrayOf(null, null, null)
        recipes118.addShaped(withTag94, array263, null)
        val recipes119 = MineTweakerAPI.recipes
        val item327 = ItemBracketHandler.getItem("ExtraTrees:door", 818)
        val hashMap327 = HashMap<String, IData>()
        hashMap327["meta"] = ExpandInt.toData(818)
        val withTag95 = item327.withTag(ExpandAnyDict.asData(hashMap327))
        val array265 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n379 = 1
        val array266 = arrayOfNulls<IIngredient>(3)
        val n380 = 0
        val item328 = ItemBracketHandler.getItem("ExtraTrees:door", 50)
        val hashMap328 = HashMap<String, IData>()
        hashMap328["meta"] = ExpandInt.toData(50)
        array266[n380] = item328.withTag(ExpandAnyDict.asData(hashMap328))
        array266[2] = null.also { array266[1] = it }
        array265[n379] = array266
        array265[2] = arrayOf(null, null, null)
        recipes119.addShaped(withTag95, array265, null)
        val recipes120 = MineTweakerAPI.recipes
        val item329 = ItemBracketHandler.getItem("ExtraTrees:door", 51)
        val hashMap329 = HashMap<String, IData>()
        hashMap329["meta"] = ExpandInt.toData(51)
        val withTag96 = item329.withTag(ExpandAnyDict.asData(hashMap329))
        val array267: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n381 = 0
        val array268 = arrayOfNulls<IIngredient>(3)
        val n382 = 0
        val item330 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap330 = HashMap<String, IData>()
        hashMap330["meta"] = ExpandInt.toData(19)
        array268[n382] = item330.withTag(ExpandAnyDict.asData(hashMap330))
        array268[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array268[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array267[n381] = array268
        val n383 = 1
        val array269 = arrayOfNulls<IIngredient>(3)
        val n384 = 0
        val item331 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap331 = HashMap<String, IData>()
        hashMap331["meta"] = ExpandInt.toData(19)
        array269[n384] = item331.withTag(ExpandAnyDict.asData(hashMap331))
        array269[1] = OreBracketHandler.getOre("ringAnyIron")
        array269[2] = OreBracketHandler.getOre("screwAnyIron")
        array267[n383] = array269
        val n385 = 2
        val array270 = arrayOfNulls<IIngredient>(3)
        val n386 = 0
        val item332 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap332 = HashMap<String, IData>()
        hashMap332["meta"] = ExpandInt.toData(19)
        array270[n386] = item332.withTag(ExpandAnyDict.asData(hashMap332))
        val n387 = 1
        val item333 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap333 = HashMap<String, IData>()
        hashMap333["meta"] = ExpandInt.toData(19)
        array270[n387] = item333.withTag(ExpandAnyDict.asData(hashMap333))
        array270[2] = OreBracketHandler.getOre("craftingToolSaw")
        array267[n385] = array270
        recipes120.addShaped(withTag96, array267, null)
        val recipes121 = MineTweakerAPI.recipes
        val item334 = ItemBracketHandler.getItem("ExtraTrees:door", 51)
        val hashMap334 = HashMap<String, IData>()
        hashMap334["meta"] = ExpandInt.toData(51)
        val withTag97 = item334.withTag(ExpandAnyDict.asData(hashMap334))
        val array271: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n388 = 0
        val array272 = arrayOfNulls<IIngredient>(3)
        val n389 = 0
        val item335 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap335 = HashMap<String, IData>()
        hashMap335["meta"] = ExpandInt.toData(19)
        array272[n389] = item335.withTag(ExpandAnyDict.asData(hashMap335))
        array272[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array272[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array271[n388] = array272
        val n390 = 1
        val array273 = arrayOfNulls<IIngredient>(3)
        val n391 = 0
        val item336 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap336 = HashMap<String, IData>()
        hashMap336["meta"] = ExpandInt.toData(19)
        array273[n391] = item336.withTag(ExpandAnyDict.asData(hashMap336))
        array273[1] = OreBracketHandler.getOre("ringCopper")
        array273[2] = OreBracketHandler.getOre("screwCopper")
        array271[n390] = array273
        val n392 = 2
        val array274 = arrayOfNulls<IIngredient>(3)
        val n393 = 0
        val item337 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap337 = HashMap<String, IData>()
        hashMap337["meta"] = ExpandInt.toData(19)
        array274[n393] = item337.withTag(ExpandAnyDict.asData(hashMap337))
        val n394 = 1
        val item338 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap338 = HashMap<String, IData>()
        hashMap338["meta"] = ExpandInt.toData(19)
        array274[n394] = item338.withTag(ExpandAnyDict.asData(hashMap338))
        array274[2] = OreBracketHandler.getOre("craftingToolSaw")
        array271[n392] = array274
        recipes121.addShaped(withTag97, array271, null)
        val recipes122 = MineTweakerAPI.recipes
        val item339 = ItemBracketHandler.getItem("ExtraTrees:door", 307)
        val hashMap339 = HashMap<String, IData>()
        hashMap339["meta"] = ExpandInt.toData(307)
        val withTag98 = item339.withTag(ExpandAnyDict.asData(hashMap339))
        val array275: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n395 = 0
        val array276 = arrayOf<IIngredient?>(null, null, null)
        val n396 = 1
        val item340 = ItemBracketHandler.getItem("ExtraTrees:door", 51)
        val hashMap340 = HashMap<String, IData>()
        hashMap340["meta"] = ExpandInt.toData(51)
        array276[n396] = item340.withTag(ExpandAnyDict.asData(hashMap340))
        array276[2] = null
        array275[n395] = array276
        array275[1] = arrayOf(null, null, null)
        array275[2] = arrayOf(null, null, null)
        recipes122.addShaped(withTag98, array275, null)
        val recipes123 = MineTweakerAPI.recipes
        val item341 = ItemBracketHandler.getItem("ExtraTrees:door", 563)
        val hashMap341 = HashMap<String, IData>()
        hashMap341["meta"] = ExpandInt.toData(563)
        val withTag99 = item341.withTag(ExpandAnyDict.asData(hashMap341))
        val array277: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n397 = 0
        val array278 = arrayOf<IIngredient?>(null, null, null)
        val n398 = 2
        val item342 = ItemBracketHandler.getItem("ExtraTrees:door", 51)
        val hashMap342 = HashMap<String, IData>()
        hashMap342["meta"] = ExpandInt.toData(51)
        array278[n398] = item342.withTag(ExpandAnyDict.asData(hashMap342))
        array277[n397] = array278
        array277[1] = arrayOf(null, null, null)
        array277[2] = arrayOf(null, null, null)
        recipes123.addShaped(withTag99, array277, null)
        val recipes124 = MineTweakerAPI.recipes
        val item343 = ItemBracketHandler.getItem("ExtraTrees:door", 819)
        val hashMap343 = HashMap<String, IData>()
        hashMap343["meta"] = ExpandInt.toData(819)
        val withTag100 = item343.withTag(ExpandAnyDict.asData(hashMap343))
        val array279 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n399 = 1
        val array280 = arrayOfNulls<IIngredient>(3)
        val n400 = 0
        val item344 = ItemBracketHandler.getItem("ExtraTrees:door", 51)
        val hashMap344 = HashMap<String, IData>()
        hashMap344["meta"] = ExpandInt.toData(51)
        array280[n400] = item344.withTag(ExpandAnyDict.asData(hashMap344))
        array280[2] = null.also { array280[1] = it }
        array279[n399] = array280
        array279[2] = arrayOf(null, null, null)
        recipes124.addShaped(withTag100, array279, null)
        val recipes125 = MineTweakerAPI.recipes
        val item345 = ItemBracketHandler.getItem("ExtraTrees:door", 52)
        val hashMap345 = HashMap<String, IData>()
        hashMap345["meta"] = ExpandInt.toData(52)
        val withTag101 = item345.withTag(ExpandAnyDict.asData(hashMap345))
        val array281: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n401 = 0
        val array282 = arrayOfNulls<IIngredient>(3)
        val n402 = 0
        val item346 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap346 = HashMap<String, IData>()
        hashMap346["meta"] = ExpandInt.toData(20)
        array282[n402] = item346.withTag(ExpandAnyDict.asData(hashMap346))
        array282[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array282[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array281[n401] = array282
        val n403 = 1
        val array283 = arrayOfNulls<IIngredient>(3)
        val n404 = 0
        val item347 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap347 = HashMap<String, IData>()
        hashMap347["meta"] = ExpandInt.toData(20)
        array283[n404] = item347.withTag(ExpandAnyDict.asData(hashMap347))
        array283[1] = OreBracketHandler.getOre("ringAnyIron")
        array283[2] = OreBracketHandler.getOre("screwAnyIron")
        array281[n403] = array283
        val n405 = 2
        val array284 = arrayOfNulls<IIngredient>(3)
        val n406 = 0
        val item348 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap348 = HashMap<String, IData>()
        hashMap348["meta"] = ExpandInt.toData(20)
        array284[n406] = item348.withTag(ExpandAnyDict.asData(hashMap348))
        val n407 = 1
        val item349 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap349 = HashMap<String, IData>()
        hashMap349["meta"] = ExpandInt.toData(20)
        array284[n407] = item349.withTag(ExpandAnyDict.asData(hashMap349))
        array284[2] = OreBracketHandler.getOre("craftingToolSaw")
        array281[n405] = array284
        recipes125.addShaped(withTag101, array281, null)
        val recipes126 = MineTweakerAPI.recipes
        val item350 = ItemBracketHandler.getItem("ExtraTrees:door", 52)
        val hashMap350 = HashMap<String, IData>()
        hashMap350["meta"] = ExpandInt.toData(52)
        val withTag102 = item350.withTag(ExpandAnyDict.asData(hashMap350))
        val array285: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n408 = 0
        val array286 = arrayOfNulls<IIngredient>(3)
        val n409 = 0
        val item351 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap351 = HashMap<String, IData>()
        hashMap351["meta"] = ExpandInt.toData(20)
        array286[n409] = item351.withTag(ExpandAnyDict.asData(hashMap351))
        array286[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array286[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array285[n408] = array286
        val n410 = 1
        val array287 = arrayOfNulls<IIngredient>(3)
        val n411 = 0
        val item352 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap352 = HashMap<String, IData>()
        hashMap352["meta"] = ExpandInt.toData(20)
        array287[n411] = item352.withTag(ExpandAnyDict.asData(hashMap352))
        array287[1] = OreBracketHandler.getOre("ringCopper")
        array287[2] = OreBracketHandler.getOre("screwCopper")
        array285[n410] = array287
        val n412 = 2
        val array288 = arrayOfNulls<IIngredient>(3)
        val n413 = 0
        val item353 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap353 = HashMap<String, IData>()
        hashMap353["meta"] = ExpandInt.toData(20)
        array288[n413] = item353.withTag(ExpandAnyDict.asData(hashMap353))
        val n414 = 1
        val item354 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap354 = HashMap<String, IData>()
        hashMap354["meta"] = ExpandInt.toData(20)
        array288[n414] = item354.withTag(ExpandAnyDict.asData(hashMap354))
        array288[2] = OreBracketHandler.getOre("craftingToolSaw")
        array285[n412] = array288
        recipes126.addShaped(withTag102, array285, null)
        val recipes127 = MineTweakerAPI.recipes
        val item355 = ItemBracketHandler.getItem("ExtraTrees:door", 308)
        val hashMap355 = HashMap<String, IData>()
        hashMap355["meta"] = ExpandInt.toData(308)
        val withTag103 = item355.withTag(ExpandAnyDict.asData(hashMap355))
        val array289: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n415 = 0
        val array290 = arrayOf<IIngredient?>(null, null, null)
        val n416 = 1
        val item356 = ItemBracketHandler.getItem("ExtraTrees:door", 52)
        val hashMap356 = HashMap<String, IData>()
        hashMap356["meta"] = ExpandInt.toData(52)
        array290[n416] = item356.withTag(ExpandAnyDict.asData(hashMap356))
        array290[2] = null
        array289[n415] = array290
        array289[1] = arrayOf(null, null, null)
        array289[2] = arrayOf(null, null, null)
        recipes127.addShaped(withTag103, array289, null)
        val recipes128 = MineTweakerAPI.recipes
        val item357 = ItemBracketHandler.getItem("ExtraTrees:door", 564)
        val hashMap357 = HashMap<String, IData>()
        hashMap357["meta"] = ExpandInt.toData(564)
        val withTag104 = item357.withTag(ExpandAnyDict.asData(hashMap357))
        val array291: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n417 = 0
        val array292 = arrayOf<IIngredient?>(null, null, null)
        val n418 = 2
        val item358 = ItemBracketHandler.getItem("ExtraTrees:door", 52)
        val hashMap358 = HashMap<String, IData>()
        hashMap358["meta"] = ExpandInt.toData(52)
        array292[n418] = item358.withTag(ExpandAnyDict.asData(hashMap358))
        array291[n417] = array292
        array291[1] = arrayOf(null, null, null)
        array291[2] = arrayOf(null, null, null)
        recipes128.addShaped(withTag104, array291, null)
        val recipes129 = MineTweakerAPI.recipes
        val item359 = ItemBracketHandler.getItem("ExtraTrees:door", 820)
        val hashMap359 = HashMap<String, IData>()
        hashMap359["meta"] = ExpandInt.toData(820)
        val withTag105 = item359.withTag(ExpandAnyDict.asData(hashMap359))
        val array293 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n419 = 1
        val array294 = arrayOfNulls<IIngredient>(3)
        val n420 = 0
        val item360 = ItemBracketHandler.getItem("ExtraTrees:door", 52)
        val hashMap360 = HashMap<String, IData>()
        hashMap360["meta"] = ExpandInt.toData(52)
        array294[n420] = item360.withTag(ExpandAnyDict.asData(hashMap360))
        array294[2] = null.also { array294[1] = it }
        array293[n419] = array294
        array293[2] = arrayOf(null, null, null)
        recipes129.addShaped(withTag105, array293, null)
        val recipes130 = MineTweakerAPI.recipes
        val item361 = ItemBracketHandler.getItem("ExtraTrees:door", 53)
        val hashMap361 = HashMap<String, IData>()
        hashMap361["meta"] = ExpandInt.toData(53)
        val withTag106 = item361.withTag(ExpandAnyDict.asData(hashMap361))
        val array295: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n421 = 0
        val array296 = arrayOfNulls<IIngredient>(3)
        val n422 = 0
        val item362 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap362 = HashMap<String, IData>()
        hashMap362["meta"] = ExpandInt.toData(21)
        array296[n422] = item362.withTag(ExpandAnyDict.asData(hashMap362))
        array296[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array296[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array295[n421] = array296
        val n423 = 1
        val array297 = arrayOfNulls<IIngredient>(3)
        val n424 = 0
        val item363 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap363 = HashMap<String, IData>()
        hashMap363["meta"] = ExpandInt.toData(21)
        array297[n424] = item363.withTag(ExpandAnyDict.asData(hashMap363))
        array297[1] = OreBracketHandler.getOre("ringAnyIron")
        array297[2] = OreBracketHandler.getOre("screwAnyIron")
        array295[n423] = array297
        val n425 = 2
        val array298 = arrayOfNulls<IIngredient>(3)
        val n426 = 0
        val item364 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap364 = HashMap<String, IData>()
        hashMap364["meta"] = ExpandInt.toData(21)
        array298[n426] = item364.withTag(ExpandAnyDict.asData(hashMap364))
        val n427 = 1
        val item365 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap365 = HashMap<String, IData>()
        hashMap365["meta"] = ExpandInt.toData(21)
        array298[n427] = item365.withTag(ExpandAnyDict.asData(hashMap365))
        array298[2] = OreBracketHandler.getOre("craftingToolSaw")
        array295[n425] = array298
        recipes130.addShaped(withTag106, array295, null)
        val recipes131 = MineTweakerAPI.recipes
        val item366 = ItemBracketHandler.getItem("ExtraTrees:door", 53)
        val hashMap366 = HashMap<String, IData>()
        hashMap366["meta"] = ExpandInt.toData(53)
        val withTag107 = item366.withTag(ExpandAnyDict.asData(hashMap366))
        val array299: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n428 = 0
        val array300 = arrayOfNulls<IIngredient>(3)
        val n429 = 0
        val item367 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap367 = HashMap<String, IData>()
        hashMap367["meta"] = ExpandInt.toData(21)
        array300[n429] = item367.withTag(ExpandAnyDict.asData(hashMap367))
        array300[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array300[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array299[n428] = array300
        val n430 = 1
        val array301 = arrayOfNulls<IIngredient>(3)
        val n431 = 0
        val item368 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap368 = HashMap<String, IData>()
        hashMap368["meta"] = ExpandInt.toData(21)
        array301[n431] = item368.withTag(ExpandAnyDict.asData(hashMap368))
        array301[1] = OreBracketHandler.getOre("ringCopper")
        array301[2] = OreBracketHandler.getOre("screwCopper")
        array299[n430] = array301
        val n432 = 2
        val array302 = arrayOfNulls<IIngredient>(3)
        val n433 = 0
        val item369 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap369 = HashMap<String, IData>()
        hashMap369["meta"] = ExpandInt.toData(21)
        array302[n433] = item369.withTag(ExpandAnyDict.asData(hashMap369))
        val n434 = 1
        val item370 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap370 = HashMap<String, IData>()
        hashMap370["meta"] = ExpandInt.toData(21)
        array302[n434] = item370.withTag(ExpandAnyDict.asData(hashMap370))
        array302[2] = OreBracketHandler.getOre("craftingToolSaw")
        array299[n432] = array302
        recipes131.addShaped(withTag107, array299, null)
        val recipes132 = MineTweakerAPI.recipes
        val item371 = ItemBracketHandler.getItem("ExtraTrees:door", 309)
        val hashMap371 = HashMap<String, IData>()
        hashMap371["meta"] = ExpandInt.toData(309)
        val withTag108 = item371.withTag(ExpandAnyDict.asData(hashMap371))
        val array303: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n435 = 0
        val array304 = arrayOf<IIngredient?>(null, null, null)
        val n436 = 1
        val item372 = ItemBracketHandler.getItem("ExtraTrees:door", 53)
        val hashMap372 = HashMap<String, IData>()
        hashMap372["meta"] = ExpandInt.toData(53)
        array304[n436] = item372.withTag(ExpandAnyDict.asData(hashMap372))
        array304[2] = null
        array303[n435] = array304
        array303[1] = arrayOf(null, null, null)
        array303[2] = arrayOf(null, null, null)
        recipes132.addShaped(withTag108, array303, null)
        val recipes133 = MineTweakerAPI.recipes
        val item373 = ItemBracketHandler.getItem("ExtraTrees:door", 565)
        val hashMap373 = HashMap<String, IData>()
        hashMap373["meta"] = ExpandInt.toData(565)
        val withTag109 = item373.withTag(ExpandAnyDict.asData(hashMap373))
        val array305: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n437 = 0
        val array306 = arrayOf<IIngredient?>(null, null, null)
        val n438 = 2
        val item374 = ItemBracketHandler.getItem("ExtraTrees:door", 53)
        val hashMap374 = HashMap<String, IData>()
        hashMap374["meta"] = ExpandInt.toData(53)
        array306[n438] = item374.withTag(ExpandAnyDict.asData(hashMap374))
        array305[n437] = array306
        array305[1] = arrayOf(null, null, null)
        array305[2] = arrayOf(null, null, null)
        recipes133.addShaped(withTag109, array305, null)
        val recipes134 = MineTweakerAPI.recipes
        val item375 = ItemBracketHandler.getItem("ExtraTrees:door", 821)
        val hashMap375 = HashMap<String, IData>()
        hashMap375["meta"] = ExpandInt.toData(821)
        val withTag110 = item375.withTag(ExpandAnyDict.asData(hashMap375))
        val array307 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n439 = 1
        val array308 = arrayOfNulls<IIngredient>(3)
        val n440 = 0
        val item376 = ItemBracketHandler.getItem("ExtraTrees:door", 53)
        val hashMap376 = HashMap<String, IData>()
        hashMap376["meta"] = ExpandInt.toData(53)
        array308[n440] = item376.withTag(ExpandAnyDict.asData(hashMap376))
        array308[2] = null.also { array308[1] = it }
        array307[n439] = array308
        array307[2] = arrayOf(null, null, null)
        recipes134.addShaped(withTag110, array307, null)
        val recipes135 = MineTweakerAPI.recipes
        val item377 = ItemBracketHandler.getItem("ExtraTrees:door", 54)
        val hashMap377 = HashMap<String, IData>()
        hashMap377["meta"] = ExpandInt.toData(54)
        val withTag111 = item377.withTag(ExpandAnyDict.asData(hashMap377))
        val array309: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n441 = 0
        val array310 = arrayOfNulls<IIngredient>(3)
        val n442 = 0
        val item378 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap378 = HashMap<String, IData>()
        hashMap378["meta"] = ExpandInt.toData(22)
        array310[n442] = item378.withTag(ExpandAnyDict.asData(hashMap378))
        array310[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array310[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array309[n441] = array310
        val n443 = 1
        val array311 = arrayOfNulls<IIngredient>(3)
        val n444 = 0
        val item379 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap379 = HashMap<String, IData>()
        hashMap379["meta"] = ExpandInt.toData(22)
        array311[n444] = item379.withTag(ExpandAnyDict.asData(hashMap379))
        array311[1] = OreBracketHandler.getOre("ringAnyIron")
        array311[2] = OreBracketHandler.getOre("screwAnyIron")
        array309[n443] = array311
        val n445 = 2
        val array312 = arrayOfNulls<IIngredient>(3)
        val n446 = 0
        val item380 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap380 = HashMap<String, IData>()
        hashMap380["meta"] = ExpandInt.toData(22)
        array312[n446] = item380.withTag(ExpandAnyDict.asData(hashMap380))
        val n447 = 1
        val item381 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap381 = HashMap<String, IData>()
        hashMap381["meta"] = ExpandInt.toData(22)
        array312[n447] = item381.withTag(ExpandAnyDict.asData(hashMap381))
        array312[2] = OreBracketHandler.getOre("craftingToolSaw")
        array309[n445] = array312
        recipes135.addShaped(withTag111, array309, null)
        val recipes136 = MineTweakerAPI.recipes
        val item382 = ItemBracketHandler.getItem("ExtraTrees:door", 54)
        val hashMap382 = HashMap<String, IData>()
        hashMap382["meta"] = ExpandInt.toData(54)
        val withTag112 = item382.withTag(ExpandAnyDict.asData(hashMap382))
        val array313: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n448 = 0
        val array314 = arrayOfNulls<IIngredient>(3)
        val n449 = 0
        val item383 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap383 = HashMap<String, IData>()
        hashMap383["meta"] = ExpandInt.toData(22)
        array314[n449] = item383.withTag(ExpandAnyDict.asData(hashMap383))
        array314[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array314[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array313[n448] = array314
        val n450 = 1
        val array315 = arrayOfNulls<IIngredient>(3)
        val n451 = 0
        val item384 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap384 = HashMap<String, IData>()
        hashMap384["meta"] = ExpandInt.toData(22)
        array315[n451] = item384.withTag(ExpandAnyDict.asData(hashMap384))
        array315[1] = OreBracketHandler.getOre("ringCopper")
        array315[2] = OreBracketHandler.getOre("screwCopper")
        array313[n450] = array315
        val n452 = 2
        val array316 = arrayOfNulls<IIngredient>(3)
        val n453 = 0
        val item385 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap385 = HashMap<String, IData>()
        hashMap385["meta"] = ExpandInt.toData(22)
        array316[n453] = item385.withTag(ExpandAnyDict.asData(hashMap385))
        val n454 = 1
        val item386 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap386 = HashMap<String, IData>()
        hashMap386["meta"] = ExpandInt.toData(22)
        array316[n454] = item386.withTag(ExpandAnyDict.asData(hashMap386))
        array316[2] = OreBracketHandler.getOre("craftingToolSaw")
        array313[n452] = array316
        recipes136.addShaped(withTag112, array313, null)
        val recipes137 = MineTweakerAPI.recipes
        val item387 = ItemBracketHandler.getItem("ExtraTrees:door", 310)
        val hashMap387 = HashMap<String, IData>()
        hashMap387["meta"] = ExpandInt.toData(310)
        val withTag113 = item387.withTag(ExpandAnyDict.asData(hashMap387))
        val array317: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n455 = 0
        val array318 = arrayOf<IIngredient?>(null, null, null)
        val n456 = 1
        val item388 = ItemBracketHandler.getItem("ExtraTrees:door", 54)
        val hashMap388 = HashMap<String, IData>()
        hashMap388["meta"] = ExpandInt.toData(54)
        array318[n456] = item388.withTag(ExpandAnyDict.asData(hashMap388))
        array318[2] = null
        array317[n455] = array318
        array317[1] = arrayOf(null, null, null)
        array317[2] = arrayOf(null, null, null)
        recipes137.addShaped(withTag113, array317, null)
        val recipes138 = MineTweakerAPI.recipes
        val item389 = ItemBracketHandler.getItem("ExtraTrees:door", 566)
        val hashMap389 = HashMap<String, IData>()
        hashMap389["meta"] = ExpandInt.toData(566)
        val withTag114 = item389.withTag(ExpandAnyDict.asData(hashMap389))
        val array319: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n457 = 0
        val array320 = arrayOf<IIngredient?>(null, null, null)
        val n458 = 2
        val item390 = ItemBracketHandler.getItem("ExtraTrees:door", 54)
        val hashMap390 = HashMap<String, IData>()
        hashMap390["meta"] = ExpandInt.toData(54)
        array320[n458] = item390.withTag(ExpandAnyDict.asData(hashMap390))
        array319[n457] = array320
        array319[1] = arrayOf(null, null, null)
        array319[2] = arrayOf(null, null, null)
        recipes138.addShaped(withTag114, array319, null)
        val recipes139 = MineTweakerAPI.recipes
        val item391 = ItemBracketHandler.getItem("ExtraTrees:door", 822)
        val hashMap391 = HashMap<String, IData>()
        hashMap391["meta"] = ExpandInt.toData(822)
        val withTag115 = item391.withTag(ExpandAnyDict.asData(hashMap391))
        val array321 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n459 = 1
        val array322 = arrayOfNulls<IIngredient>(3)
        val n460 = 0
        val item392 = ItemBracketHandler.getItem("ExtraTrees:door", 54)
        val hashMap392 = HashMap<String, IData>()
        hashMap392["meta"] = ExpandInt.toData(54)
        array322[n460] = item392.withTag(ExpandAnyDict.asData(hashMap392))
        array322[2] = null.also { array322[1] = it }
        array321[n459] = array322
        array321[2] = arrayOf(null, null, null)
        recipes139.addShaped(withTag115, array321, null)
        val recipes140 = MineTweakerAPI.recipes
        val item393 = ItemBracketHandler.getItem("ExtraTrees:door", 55)
        val hashMap393 = HashMap<String, IData>()
        hashMap393["meta"] = ExpandInt.toData(55)
        val withTag116 = item393.withTag(ExpandAnyDict.asData(hashMap393))
        val array323: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n461 = 0
        val array324 = arrayOfNulls<IIngredient>(3)
        val n462 = 0
        val item394 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap394 = HashMap<String, IData>()
        hashMap394["meta"] = ExpandInt.toData(23)
        array324[n462] = item394.withTag(ExpandAnyDict.asData(hashMap394))
        array324[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array324[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array323[n461] = array324
        val n463 = 1
        val array325 = arrayOfNulls<IIngredient>(3)
        val n464 = 0
        val item395 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap395 = HashMap<String, IData>()
        hashMap395["meta"] = ExpandInt.toData(23)
        array325[n464] = item395.withTag(ExpandAnyDict.asData(hashMap395))
        array325[1] = OreBracketHandler.getOre("ringAnyIron")
        array325[2] = OreBracketHandler.getOre("screwAnyIron")
        array323[n463] = array325
        val n465 = 2
        val array326 = arrayOfNulls<IIngredient>(3)
        val n466 = 0
        val item396 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap396 = HashMap<String, IData>()
        hashMap396["meta"] = ExpandInt.toData(23)
        array326[n466] = item396.withTag(ExpandAnyDict.asData(hashMap396))
        val n467 = 1
        val item397 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap397 = HashMap<String, IData>()
        hashMap397["meta"] = ExpandInt.toData(23)
        array326[n467] = item397.withTag(ExpandAnyDict.asData(hashMap397))
        array326[2] = OreBracketHandler.getOre("craftingToolSaw")
        array323[n465] = array326
        recipes140.addShaped(withTag116, array323, null)
        val recipes141 = MineTweakerAPI.recipes
        val item398 = ItemBracketHandler.getItem("ExtraTrees:door", 55)
        val hashMap398 = HashMap<String, IData>()
        hashMap398["meta"] = ExpandInt.toData(55)
        val withTag117 = item398.withTag(ExpandAnyDict.asData(hashMap398))
        val array327: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n468 = 0
        val array328 = arrayOfNulls<IIngredient>(3)
        val n469 = 0
        val item399 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap399 = HashMap<String, IData>()
        hashMap399["meta"] = ExpandInt.toData(23)
        array328[n469] = item399.withTag(ExpandAnyDict.asData(hashMap399))
        array328[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array328[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array327[n468] = array328
        val n470 = 1
        val array329 = arrayOfNulls<IIngredient>(3)
        val n471 = 0
        val item400 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap400 = HashMap<String, IData>()
        hashMap400["meta"] = ExpandInt.toData(23)
        array329[n471] = item400.withTag(ExpandAnyDict.asData(hashMap400))
        array329[1] = OreBracketHandler.getOre("ringCopper")
        array329[2] = OreBracketHandler.getOre("screwCopper")
        array327[n470] = array329
        val n472 = 2
        val array330 = arrayOfNulls<IIngredient>(3)
        val n473 = 0
        val item401 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap401 = HashMap<String, IData>()
        hashMap401["meta"] = ExpandInt.toData(23)
        array330[n473] = item401.withTag(ExpandAnyDict.asData(hashMap401))
        val n474 = 1
        val item402 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap402 = HashMap<String, IData>()
        hashMap402["meta"] = ExpandInt.toData(23)
        array330[n474] = item402.withTag(ExpandAnyDict.asData(hashMap402))
        array330[2] = OreBracketHandler.getOre("craftingToolSaw")
        array327[n472] = array330
        recipes141.addShaped(withTag117, array327, null)
        val recipes142 = MineTweakerAPI.recipes
        val item403 = ItemBracketHandler.getItem("ExtraTrees:door", 311)
        val hashMap403 = HashMap<String, IData>()
        hashMap403["meta"] = ExpandInt.toData(311)
        val withTag118 = item403.withTag(ExpandAnyDict.asData(hashMap403))
        val array331: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n475 = 0
        val array332 = arrayOf<IIngredient?>(null, null, null)
        val n476 = 1
        val item404 = ItemBracketHandler.getItem("ExtraTrees:door", 55)
        val hashMap404 = HashMap<String, IData>()
        hashMap404["meta"] = ExpandInt.toData(55)
        array332[n476] = item404.withTag(ExpandAnyDict.asData(hashMap404))
        array332[2] = null
        array331[n475] = array332
        array331[1] = arrayOf(null, null, null)
        array331[2] = arrayOf(null, null, null)
        recipes142.addShaped(withTag118, array331, null)
        val recipes143 = MineTweakerAPI.recipes
        val item405 = ItemBracketHandler.getItem("ExtraTrees:door", 567)
        val hashMap405 = HashMap<String, IData>()
        hashMap405["meta"] = ExpandInt.toData(567)
        val withTag119 = item405.withTag(ExpandAnyDict.asData(hashMap405))
        val array333: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n477 = 0
        val array334 = arrayOf<IIngredient?>(null, null, null)
        val n478 = 2
        val item406 = ItemBracketHandler.getItem("ExtraTrees:door", 55)
        val hashMap406 = HashMap<String, IData>()
        hashMap406["meta"] = ExpandInt.toData(55)
        array334[n478] = item406.withTag(ExpandAnyDict.asData(hashMap406))
        array333[n477] = array334
        array333[1] = arrayOf(null, null, null)
        array333[2] = arrayOf(null, null, null)
        recipes143.addShaped(withTag119, array333, null)
        val recipes144 = MineTweakerAPI.recipes
        val item407 = ItemBracketHandler.getItem("ExtraTrees:door", 823)
        val hashMap407 = HashMap<String, IData>()
        hashMap407["meta"] = ExpandInt.toData(823)
        val withTag120 = item407.withTag(ExpandAnyDict.asData(hashMap407))
        val array335 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n479 = 1
        val array336 = arrayOfNulls<IIngredient>(3)
        val n480 = 0
        val item408 = ItemBracketHandler.getItem("ExtraTrees:door", 55)
        val hashMap408 = HashMap<String, IData>()
        hashMap408["meta"] = ExpandInt.toData(55)
        array336[n480] = item408.withTag(ExpandAnyDict.asData(hashMap408))
        array336[2] = null.also { array336[1] = it }
        array335[n479] = array336
        array335[2] = arrayOf(null, null, null)
        recipes144.addShaped(withTag120, array335, null)
        val recipes145 = MineTweakerAPI.recipes
        val item409 = ItemBracketHandler.getItem("ExtraTrees:door", 56)
        val hashMap409 = HashMap<String, IData>()
        hashMap409["meta"] = ExpandInt.toData(56)
        val withTag121 = item409.withTag(ExpandAnyDict.asData(hashMap409))
        val array337: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n481 = 0
        val array338 = arrayOfNulls<IIngredient>(3)
        val n482 = 0
        val item410 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap410 = HashMap<String, IData>()
        hashMap410["meta"] = ExpandInt.toData(24)
        array338[n482] = item410.withTag(ExpandAnyDict.asData(hashMap410))
        array338[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array338[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array337[n481] = array338
        val n483 = 1
        val array339 = arrayOfNulls<IIngredient>(3)
        val n484 = 0
        val item411 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap411 = HashMap<String, IData>()
        hashMap411["meta"] = ExpandInt.toData(24)
        array339[n484] = item411.withTag(ExpandAnyDict.asData(hashMap411))
        array339[1] = OreBracketHandler.getOre("ringAnyIron")
        array339[2] = OreBracketHandler.getOre("screwAnyIron")
        array337[n483] = array339
        val n485 = 2
        val array340 = arrayOfNulls<IIngredient>(3)
        val n486 = 0
        val item412 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap412 = HashMap<String, IData>()
        hashMap412["meta"] = ExpandInt.toData(24)
        array340[n486] = item412.withTag(ExpandAnyDict.asData(hashMap412))
        val n487 = 1
        val item413 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap413 = HashMap<String, IData>()
        hashMap413["meta"] = ExpandInt.toData(24)
        array340[n487] = item413.withTag(ExpandAnyDict.asData(hashMap413))
        array340[2] = OreBracketHandler.getOre("craftingToolSaw")
        array337[n485] = array340
        recipes145.addShaped(withTag121, array337, null)
        val recipes146 = MineTweakerAPI.recipes
        val item414 = ItemBracketHandler.getItem("ExtraTrees:door", 56)
        val hashMap414 = HashMap<String, IData>()
        hashMap414["meta"] = ExpandInt.toData(56)
        val withTag122 = item414.withTag(ExpandAnyDict.asData(hashMap414))
        val array341: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n488 = 0
        val array342 = arrayOfNulls<IIngredient>(3)
        val n489 = 0
        val item415 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap415 = HashMap<String, IData>()
        hashMap415["meta"] = ExpandInt.toData(24)
        array342[n489] = item415.withTag(ExpandAnyDict.asData(hashMap415))
        array342[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array342[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array341[n488] = array342
        val n490 = 1
        val array343 = arrayOfNulls<IIngredient>(3)
        val n491 = 0
        val item416 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap416 = HashMap<String, IData>()
        hashMap416["meta"] = ExpandInt.toData(24)
        array343[n491] = item416.withTag(ExpandAnyDict.asData(hashMap416))
        array343[1] = OreBracketHandler.getOre("ringCopper")
        array343[2] = OreBracketHandler.getOre("screwCopper")
        array341[n490] = array343
        val n492 = 2
        val array344 = arrayOfNulls<IIngredient>(3)
        val n493 = 0
        val item417 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap417 = HashMap<String, IData>()
        hashMap417["meta"] = ExpandInt.toData(24)
        array344[n493] = item417.withTag(ExpandAnyDict.asData(hashMap417))
        val n494 = 1
        val item418 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap418 = HashMap<String, IData>()
        hashMap418["meta"] = ExpandInt.toData(24)
        array344[n494] = item418.withTag(ExpandAnyDict.asData(hashMap418))
        array344[2] = OreBracketHandler.getOre("craftingToolSaw")
        array341[n492] = array344
        recipes146.addShaped(withTag122, array341, null)
        val recipes147 = MineTweakerAPI.recipes
        val item419 = ItemBracketHandler.getItem("ExtraTrees:door", 312)
        val hashMap419 = HashMap<String, IData>()
        hashMap419["meta"] = ExpandInt.toData(312)
        val withTag123 = item419.withTag(ExpandAnyDict.asData(hashMap419))
        val array345: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n495 = 0
        val array346 = arrayOf<IIngredient?>(null, null, null)
        val n496 = 1
        val item420 = ItemBracketHandler.getItem("ExtraTrees:door", 56)
        val hashMap420 = HashMap<String, IData>()
        hashMap420["meta"] = ExpandInt.toData(56)
        array346[n496] = item420.withTag(ExpandAnyDict.asData(hashMap420))
        array346[2] = null
        array345[n495] = array346
        array345[1] = arrayOf(null, null, null)
        array345[2] = arrayOf(null, null, null)
        recipes147.addShaped(withTag123, array345, null)
        val recipes148 = MineTweakerAPI.recipes
        val item421 = ItemBracketHandler.getItem("ExtraTrees:door", 568)
        val hashMap421 = HashMap<String, IData>()
        hashMap421["meta"] = ExpandInt.toData(568)
        val withTag124 = item421.withTag(ExpandAnyDict.asData(hashMap421))
        val array347: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n497 = 0
        val array348 = arrayOf<IIngredient?>(null, null, null)
        val n498 = 2
        val item422 = ItemBracketHandler.getItem("ExtraTrees:door", 56)
        val hashMap422 = HashMap<String, IData>()
        hashMap422["meta"] = ExpandInt.toData(56)
        array348[n498] = item422.withTag(ExpandAnyDict.asData(hashMap422))
        array347[n497] = array348
        array347[1] = arrayOf(null, null, null)
        array347[2] = arrayOf(null, null, null)
        recipes148.addShaped(withTag124, array347, null)
        val recipes149 = MineTweakerAPI.recipes
        val item423 = ItemBracketHandler.getItem("ExtraTrees:door", 824)
        val hashMap423 = HashMap<String, IData>()
        hashMap423["meta"] = ExpandInt.toData(824)
        val withTag125 = item423.withTag(ExpandAnyDict.asData(hashMap423))
        val array349 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n499 = 1
        val array350 = arrayOfNulls<IIngredient>(3)
        val n500 = 0
        val item424 = ItemBracketHandler.getItem("ExtraTrees:door", 56)
        val hashMap424 = HashMap<String, IData>()
        hashMap424["meta"] = ExpandInt.toData(56)
        array350[n500] = item424.withTag(ExpandAnyDict.asData(hashMap424))
        array350[2] = null.also { array350[1] = it }
        array349[n499] = array350
        array349[2] = arrayOf(null, null, null)
        recipes149.addShaped(withTag125, array349, null)
        val recipes150 = MineTweakerAPI.recipes
        val item425 = ItemBracketHandler.getItem("ExtraTrees:door", 57)
        val hashMap425 = HashMap<String, IData>()
        hashMap425["meta"] = ExpandInt.toData(57)
        val withTag126 = item425.withTag(ExpandAnyDict.asData(hashMap425))
        val array351: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n501 = 0
        val array352 = arrayOfNulls<IIngredient>(3)
        val n502 = 0
        val item426 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap426 = HashMap<String, IData>()
        hashMap426["meta"] = ExpandInt.toData(25)
        array352[n502] = item426.withTag(ExpandAnyDict.asData(hashMap426))
        array352[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array352[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array351[n501] = array352
        val n503 = 1
        val array353 = arrayOfNulls<IIngredient>(3)
        val n504 = 0
        val item427 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap427 = HashMap<String, IData>()
        hashMap427["meta"] = ExpandInt.toData(25)
        array353[n504] = item427.withTag(ExpandAnyDict.asData(hashMap427))
        array353[1] = OreBracketHandler.getOre("ringAnyIron")
        array353[2] = OreBracketHandler.getOre("screwAnyIron")
        array351[n503] = array353
        val n505 = 2
        val array354 = arrayOfNulls<IIngredient>(3)
        val n506 = 0
        val item428 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap428 = HashMap<String, IData>()
        hashMap428["meta"] = ExpandInt.toData(25)
        array354[n506] = item428.withTag(ExpandAnyDict.asData(hashMap428))
        val n507 = 1
        val item429 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap429 = HashMap<String, IData>()
        hashMap429["meta"] = ExpandInt.toData(25)
        array354[n507] = item429.withTag(ExpandAnyDict.asData(hashMap429))
        array354[2] = OreBracketHandler.getOre("craftingToolSaw")
        array351[n505] = array354
        recipes150.addShaped(withTag126, array351, null)
        val recipes151 = MineTweakerAPI.recipes
        val item430 = ItemBracketHandler.getItem("ExtraTrees:door", 57)
        val hashMap430 = HashMap<String, IData>()
        hashMap430["meta"] = ExpandInt.toData(57)
        val withTag127 = item430.withTag(ExpandAnyDict.asData(hashMap430))
        val array355: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n508 = 0
        val array356 = arrayOfNulls<IIngredient>(3)
        val n509 = 0
        val item431 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap431 = HashMap<String, IData>()
        hashMap431["meta"] = ExpandInt.toData(25)
        array356[n509] = item431.withTag(ExpandAnyDict.asData(hashMap431))
        array356[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array356[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array355[n508] = array356
        val n510 = 1
        val array357 = arrayOfNulls<IIngredient>(3)
        val n511 = 0
        val item432 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap432 = HashMap<String, IData>()
        hashMap432["meta"] = ExpandInt.toData(25)
        array357[n511] = item432.withTag(ExpandAnyDict.asData(hashMap432))
        array357[1] = OreBracketHandler.getOre("ringCopper")
        array357[2] = OreBracketHandler.getOre("screwCopper")
        array355[n510] = array357
        val n512 = 2
        val array358 = arrayOfNulls<IIngredient>(3)
        val n513 = 0
        val item433 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap433 = HashMap<String, IData>()
        hashMap433["meta"] = ExpandInt.toData(25)
        array358[n513] = item433.withTag(ExpandAnyDict.asData(hashMap433))
        val n514 = 1
        val item434 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap434 = HashMap<String, IData>()
        hashMap434["meta"] = ExpandInt.toData(25)
        array358[n514] = item434.withTag(ExpandAnyDict.asData(hashMap434))
        array358[2] = OreBracketHandler.getOre("craftingToolSaw")
        array355[n512] = array358
        recipes151.addShaped(withTag127, array355, null)
        val recipes152 = MineTweakerAPI.recipes
        val item435 = ItemBracketHandler.getItem("ExtraTrees:door", 313)
        val hashMap435 = HashMap<String, IData>()
        hashMap435["meta"] = ExpandInt.toData(313)
        val withTag128 = item435.withTag(ExpandAnyDict.asData(hashMap435))
        val array359: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n515 = 0
        val array360 = arrayOf<IIngredient?>(null, null, null)
        val n516 = 1
        val item436 = ItemBracketHandler.getItem("ExtraTrees:door", 57)
        val hashMap436 = HashMap<String, IData>()
        hashMap436["meta"] = ExpandInt.toData(57)
        array360[n516] = item436.withTag(ExpandAnyDict.asData(hashMap436))
        array360[2] = null
        array359[n515] = array360
        array359[1] = arrayOf(null, null, null)
        array359[2] = arrayOf(null, null, null)
        recipes152.addShaped(withTag128, array359, null)
        val recipes153 = MineTweakerAPI.recipes
        val item437 = ItemBracketHandler.getItem("ExtraTrees:door", 569)
        val hashMap437 = HashMap<String, IData>()
        hashMap437["meta"] = ExpandInt.toData(569)
        val withTag129 = item437.withTag(ExpandAnyDict.asData(hashMap437))
        val array361: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n517 = 0
        val array362 = arrayOf<IIngredient?>(null, null, null)
        val n518 = 2
        val item438 = ItemBracketHandler.getItem("ExtraTrees:door", 57)
        val hashMap438 = HashMap<String, IData>()
        hashMap438["meta"] = ExpandInt.toData(57)
        array362[n518] = item438.withTag(ExpandAnyDict.asData(hashMap438))
        array361[n517] = array362
        array361[1] = arrayOf(null, null, null)
        array361[2] = arrayOf(null, null, null)
        recipes153.addShaped(withTag129, array361, null)
        val recipes154 = MineTweakerAPI.recipes
        val item439 = ItemBracketHandler.getItem("ExtraTrees:door", 825)
        val hashMap439 = HashMap<String, IData>()
        hashMap439["meta"] = ExpandInt.toData(825)
        val withTag130 = item439.withTag(ExpandAnyDict.asData(hashMap439))
        val array363 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n519 = 1
        val array364 = arrayOfNulls<IIngredient>(3)
        val n520 = 0
        val item440 = ItemBracketHandler.getItem("ExtraTrees:door", 57)
        val hashMap440 = HashMap<String, IData>()
        hashMap440["meta"] = ExpandInt.toData(57)
        array364[n520] = item440.withTag(ExpandAnyDict.asData(hashMap440))
        array364[2] = null.also { array364[1] = it }
        array363[n519] = array364
        array363[2] = arrayOf(null, null, null)
        recipes154.addShaped(withTag130, array363, null)
        val recipes155 = MineTweakerAPI.recipes
        val item441 = ItemBracketHandler.getItem("ExtraTrees:door", 58)
        val hashMap441 = HashMap<String, IData>()
        hashMap441["meta"] = ExpandInt.toData(58)
        val withTag131 = item441.withTag(ExpandAnyDict.asData(hashMap441))
        val array365: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n521 = 0
        val array366 = arrayOfNulls<IIngredient>(3)
        val n522 = 0
        val item442 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap442 = HashMap<String, IData>()
        hashMap442["meta"] = ExpandInt.toData(26)
        array366[n522] = item442.withTag(ExpandAnyDict.asData(hashMap442))
        array366[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array366[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array365[n521] = array366
        val n523 = 1
        val array367 = arrayOfNulls<IIngredient>(3)
        val n524 = 0
        val item443 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap443 = HashMap<String, IData>()
        hashMap443["meta"] = ExpandInt.toData(26)
        array367[n524] = item443.withTag(ExpandAnyDict.asData(hashMap443))
        array367[1] = OreBracketHandler.getOre("ringAnyIron")
        array367[2] = OreBracketHandler.getOre("screwAnyIron")
        array365[n523] = array367
        val n525 = 2
        val array368 = arrayOfNulls<IIngredient>(3)
        val n526 = 0
        val item444 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap444 = HashMap<String, IData>()
        hashMap444["meta"] = ExpandInt.toData(26)
        array368[n526] = item444.withTag(ExpandAnyDict.asData(hashMap444))
        val n527 = 1
        val item445 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap445 = HashMap<String, IData>()
        hashMap445["meta"] = ExpandInt.toData(26)
        array368[n527] = item445.withTag(ExpandAnyDict.asData(hashMap445))
        array368[2] = OreBracketHandler.getOre("craftingToolSaw")
        array365[n525] = array368
        recipes155.addShaped(withTag131, array365, null)
        val recipes156 = MineTweakerAPI.recipes
        val item446 = ItemBracketHandler.getItem("ExtraTrees:door", 58)
        val hashMap446 = HashMap<String, IData>()
        hashMap446["meta"] = ExpandInt.toData(58)
        val withTag132 = item446.withTag(ExpandAnyDict.asData(hashMap446))
        val array369: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n528 = 0
        val array370 = arrayOfNulls<IIngredient>(3)
        val n529 = 0
        val item447 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap447 = HashMap<String, IData>()
        hashMap447["meta"] = ExpandInt.toData(26)
        array370[n529] = item447.withTag(ExpandAnyDict.asData(hashMap447))
        array370[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array370[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array369[n528] = array370
        val n530 = 1
        val array371 = arrayOfNulls<IIngredient>(3)
        val n531 = 0
        val item448 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap448 = HashMap<String, IData>()
        hashMap448["meta"] = ExpandInt.toData(26)
        array371[n531] = item448.withTag(ExpandAnyDict.asData(hashMap448))
        array371[1] = OreBracketHandler.getOre("ringCopper")
        array371[2] = OreBracketHandler.getOre("screwCopper")
        array369[n530] = array371
        val n532 = 2
        val array372 = arrayOfNulls<IIngredient>(3)
        val n533 = 0
        val item449 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap449 = HashMap<String, IData>()
        hashMap449["meta"] = ExpandInt.toData(26)
        array372[n533] = item449.withTag(ExpandAnyDict.asData(hashMap449))
        val n534 = 1
        val item450 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap450 = HashMap<String, IData>()
        hashMap450["meta"] = ExpandInt.toData(26)
        array372[n534] = item450.withTag(ExpandAnyDict.asData(hashMap450))
        array372[2] = OreBracketHandler.getOre("craftingToolSaw")
        array369[n532] = array372
        recipes156.addShaped(withTag132, array369, null)
        val recipes157 = MineTweakerAPI.recipes
        val item451 = ItemBracketHandler.getItem("ExtraTrees:door", 314)
        val hashMap451 = HashMap<String, IData>()
        hashMap451["meta"] = ExpandInt.toData(314)
        val withTag133 = item451.withTag(ExpandAnyDict.asData(hashMap451))
        val array373: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n535 = 0
        val array374 = arrayOf<IIngredient?>(null, null, null)
        val n536 = 1
        val item452 = ItemBracketHandler.getItem("ExtraTrees:door", 58)
        val hashMap452 = HashMap<String, IData>()
        hashMap452["meta"] = ExpandInt.toData(58)
        array374[n536] = item452.withTag(ExpandAnyDict.asData(hashMap452))
        array374[2] = null
        array373[n535] = array374
        array373[1] = arrayOf(null, null, null)
        array373[2] = arrayOf(null, null, null)
        recipes157.addShaped(withTag133, array373, null)
        val recipes158 = MineTweakerAPI.recipes
        val item453 = ItemBracketHandler.getItem("ExtraTrees:door", 570)
        val hashMap453 = HashMap<String, IData>()
        hashMap453["meta"] = ExpandInt.toData(570)
        val withTag134 = item453.withTag(ExpandAnyDict.asData(hashMap453))
        val array375: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n537 = 0
        val array376 = arrayOf<IIngredient?>(null, null, null)
        val n538 = 2
        val item454 = ItemBracketHandler.getItem("ExtraTrees:door", 58)
        val hashMap454 = HashMap<String, IData>()
        hashMap454["meta"] = ExpandInt.toData(58)
        array376[n538] = item454.withTag(ExpandAnyDict.asData(hashMap454))
        array375[n537] = array376
        array375[1] = arrayOf(null, null, null)
        array375[2] = arrayOf(null, null, null)
        recipes158.addShaped(withTag134, array375, null)
        val recipes159 = MineTweakerAPI.recipes
        val item455 = ItemBracketHandler.getItem("ExtraTrees:door", 826)
        val hashMap455 = HashMap<String, IData>()
        hashMap455["meta"] = ExpandInt.toData(826)
        val withTag135 = item455.withTag(ExpandAnyDict.asData(hashMap455))
        val array377 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n539 = 1
        val array378 = arrayOfNulls<IIngredient>(3)
        val n540 = 0
        val item456 = ItemBracketHandler.getItem("ExtraTrees:door", 58)
        val hashMap456 = HashMap<String, IData>()
        hashMap456["meta"] = ExpandInt.toData(58)
        array378[n540] = item456.withTag(ExpandAnyDict.asData(hashMap456))
        array378[2] = null.also { array378[1] = it }
        array377[n539] = array378
        array377[2] = arrayOf(null, null, null)
        recipes159.addShaped(withTag135, array377, null)
        val recipes160 = MineTweakerAPI.recipes
        val item457 = ItemBracketHandler.getItem("ExtraTrees:door", 59)
        val hashMap457 = HashMap<String, IData>()
        hashMap457["meta"] = ExpandInt.toData(59)
        val withTag136 = item457.withTag(ExpandAnyDict.asData(hashMap457))
        val array379: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n541 = 0
        val array380 = arrayOfNulls<IIngredient>(3)
        val n542 = 0
        val item458 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap458 = HashMap<String, IData>()
        hashMap458["meta"] = ExpandInt.toData(27)
        array380[n542] = item458.withTag(ExpandAnyDict.asData(hashMap458))
        array380[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array380[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array379[n541] = array380
        val n543 = 1
        val array381 = arrayOfNulls<IIngredient>(3)
        val n544 = 0
        val item459 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap459 = HashMap<String, IData>()
        hashMap459["meta"] = ExpandInt.toData(27)
        array381[n544] = item459.withTag(ExpandAnyDict.asData(hashMap459))
        array381[1] = OreBracketHandler.getOre("ringAnyIron")
        array381[2] = OreBracketHandler.getOre("screwAnyIron")
        array379[n543] = array381
        val n545 = 2
        val array382 = arrayOfNulls<IIngredient>(3)
        val n546 = 0
        val item460 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap460 = HashMap<String, IData>()
        hashMap460["meta"] = ExpandInt.toData(27)
        array382[n546] = item460.withTag(ExpandAnyDict.asData(hashMap460))
        val n547 = 1
        val item461 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap461 = HashMap<String, IData>()
        hashMap461["meta"] = ExpandInt.toData(27)
        array382[n547] = item461.withTag(ExpandAnyDict.asData(hashMap461))
        array382[2] = OreBracketHandler.getOre("craftingToolSaw")
        array379[n545] = array382
        recipes160.addShaped(withTag136, array379, null)
        val recipes161 = MineTweakerAPI.recipes
        val item462 = ItemBracketHandler.getItem("ExtraTrees:door", 59)
        val hashMap462 = HashMap<String, IData>()
        hashMap462["meta"] = ExpandInt.toData(59)
        val withTag137 = item462.withTag(ExpandAnyDict.asData(hashMap462))
        val array383: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n548 = 0
        val array384 = arrayOfNulls<IIngredient>(3)
        val n549 = 0
        val item463 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap463 = HashMap<String, IData>()
        hashMap463["meta"] = ExpandInt.toData(27)
        array384[n549] = item463.withTag(ExpandAnyDict.asData(hashMap463))
        array384[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array384[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array383[n548] = array384
        val n550 = 1
        val array385 = arrayOfNulls<IIngredient>(3)
        val n551 = 0
        val item464 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap464 = HashMap<String, IData>()
        hashMap464["meta"] = ExpandInt.toData(27)
        array385[n551] = item464.withTag(ExpandAnyDict.asData(hashMap464))
        array385[1] = OreBracketHandler.getOre("ringCopper")
        array385[2] = OreBracketHandler.getOre("screwCopper")
        array383[n550] = array385
        val n552 = 2
        val array386 = arrayOfNulls<IIngredient>(3)
        val n553 = 0
        val item465 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap465 = HashMap<String, IData>()
        hashMap465["meta"] = ExpandInt.toData(27)
        array386[n553] = item465.withTag(ExpandAnyDict.asData(hashMap465))
        val n554 = 1
        val item466 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap466 = HashMap<String, IData>()
        hashMap466["meta"] = ExpandInt.toData(27)
        array386[n554] = item466.withTag(ExpandAnyDict.asData(hashMap466))
        array386[2] = OreBracketHandler.getOre("craftingToolSaw")
        array383[n552] = array386
        recipes161.addShaped(withTag137, array383, null)
        val recipes162 = MineTweakerAPI.recipes
        val item467 = ItemBracketHandler.getItem("ExtraTrees:door", 315)
        val hashMap467 = HashMap<String, IData>()
        hashMap467["meta"] = ExpandInt.toData(315)
        val withTag138 = item467.withTag(ExpandAnyDict.asData(hashMap467))
        val array387: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n555 = 0
        val array388 = arrayOf<IIngredient?>(null, null, null)
        val n556 = 1
        val item468 = ItemBracketHandler.getItem("ExtraTrees:door", 59)
        val hashMap468 = HashMap<String, IData>()
        hashMap468["meta"] = ExpandInt.toData(59)
        array388[n556] = item468.withTag(ExpandAnyDict.asData(hashMap468))
        array388[2] = null
        array387[n555] = array388
        array387[1] = arrayOf(null, null, null)
        array387[2] = arrayOf(null, null, null)
        recipes162.addShaped(withTag138, array387, null)
        val recipes163 = MineTweakerAPI.recipes
        val item469 = ItemBracketHandler.getItem("ExtraTrees:door", 571)
        val hashMap469 = HashMap<String, IData>()
        hashMap469["meta"] = ExpandInt.toData(571)
        val withTag139 = item469.withTag(ExpandAnyDict.asData(hashMap469))
        val array389: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n557 = 0
        val array390 = arrayOf<IIngredient?>(null, null, null)
        val n558 = 2
        val item470 = ItemBracketHandler.getItem("ExtraTrees:door", 59)
        val hashMap470 = HashMap<String, IData>()
        hashMap470["meta"] = ExpandInt.toData(59)
        array390[n558] = item470.withTag(ExpandAnyDict.asData(hashMap470))
        array389[n557] = array390
        array389[1] = arrayOf(null, null, null)
        array389[2] = arrayOf(null, null, null)
        recipes163.addShaped(withTag139, array389, null)
        val recipes164 = MineTweakerAPI.recipes
        val item471 = ItemBracketHandler.getItem("ExtraTrees:door", 827)
        val hashMap471 = HashMap<String, IData>()
        hashMap471["meta"] = ExpandInt.toData(827)
        val withTag140 = item471.withTag(ExpandAnyDict.asData(hashMap471))
        val array391 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n559 = 1
        val array392 = arrayOfNulls<IIngredient>(3)
        val n560 = 0
        val item472 = ItemBracketHandler.getItem("ExtraTrees:door", 59)
        val hashMap472 = HashMap<String, IData>()
        hashMap472["meta"] = ExpandInt.toData(59)
        array392[n560] = item472.withTag(ExpandAnyDict.asData(hashMap472))
        array392[2] = null.also { array392[1] = it }
        array391[n559] = array392
        array391[2] = arrayOf(null, null, null)
        recipes164.addShaped(withTag140, array391, null)
        val recipes165 = MineTweakerAPI.recipes
        val item473 = ItemBracketHandler.getItem("ExtraTrees:door", 60)
        val hashMap473 = HashMap<String, IData>()
        hashMap473["meta"] = ExpandInt.toData(60)
        val withTag141 = item473.withTag(ExpandAnyDict.asData(hashMap473))
        val array393: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n561 = 0
        val array394 = arrayOfNulls<IIngredient>(3)
        val n562 = 0
        val item474 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap474 = HashMap<String, IData>()
        hashMap474["meta"] = ExpandInt.toData(28)
        array394[n562] = item474.withTag(ExpandAnyDict.asData(hashMap474))
        array394[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array394[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array393[n561] = array394
        val n563 = 1
        val array395 = arrayOfNulls<IIngredient>(3)
        val n564 = 0
        val item475 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap475 = HashMap<String, IData>()
        hashMap475["meta"] = ExpandInt.toData(28)
        array395[n564] = item475.withTag(ExpandAnyDict.asData(hashMap475))
        array395[1] = OreBracketHandler.getOre("ringAnyIron")
        array395[2] = OreBracketHandler.getOre("screwAnyIron")
        array393[n563] = array395
        val n565 = 2
        val array396 = arrayOfNulls<IIngredient>(3)
        val n566 = 0
        val item476 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap476 = HashMap<String, IData>()
        hashMap476["meta"] = ExpandInt.toData(28)
        array396[n566] = item476.withTag(ExpandAnyDict.asData(hashMap476))
        val n567 = 1
        val item477 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap477 = HashMap<String, IData>()
        hashMap477["meta"] = ExpandInt.toData(28)
        array396[n567] = item477.withTag(ExpandAnyDict.asData(hashMap477))
        array396[2] = OreBracketHandler.getOre("craftingToolSaw")
        array393[n565] = array396
        recipes165.addShaped(withTag141, array393, null)
        val recipes166 = MineTweakerAPI.recipes
        val item478 = ItemBracketHandler.getItem("ExtraTrees:door", 60)
        val hashMap478 = HashMap<String, IData>()
        hashMap478["meta"] = ExpandInt.toData(60)
        val withTag142 = item478.withTag(ExpandAnyDict.asData(hashMap478))
        val array397: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n568 = 0
        val array398 = arrayOfNulls<IIngredient>(3)
        val n569 = 0
        val item479 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap479 = HashMap<String, IData>()
        hashMap479["meta"] = ExpandInt.toData(28)
        array398[n569] = item479.withTag(ExpandAnyDict.asData(hashMap479))
        array398[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array398[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array397[n568] = array398
        val n570 = 1
        val array399 = arrayOfNulls<IIngredient>(3)
        val n571 = 0
        val item480 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap480 = HashMap<String, IData>()
        hashMap480["meta"] = ExpandInt.toData(28)
        array399[n571] = item480.withTag(ExpandAnyDict.asData(hashMap480))
        array399[1] = OreBracketHandler.getOre("ringCopper")
        array399[2] = OreBracketHandler.getOre("screwCopper")
        array397[n570] = array399
        val n572 = 2
        val array400 = arrayOfNulls<IIngredient>(3)
        val n573 = 0
        val item481 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap481 = HashMap<String, IData>()
        hashMap481["meta"] = ExpandInt.toData(28)
        array400[n573] = item481.withTag(ExpandAnyDict.asData(hashMap481))
        val n574 = 1
        val item482 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap482 = HashMap<String, IData>()
        hashMap482["meta"] = ExpandInt.toData(28)
        array400[n574] = item482.withTag(ExpandAnyDict.asData(hashMap482))
        array400[2] = OreBracketHandler.getOre("craftingToolSaw")
        array397[n572] = array400
        recipes166.addShaped(withTag142, array397, null)
        val recipes167 = MineTweakerAPI.recipes
        val item483 = ItemBracketHandler.getItem("ExtraTrees:door", 316)
        val hashMap483 = HashMap<String, IData>()
        hashMap483["meta"] = ExpandInt.toData(316)
        val withTag143 = item483.withTag(ExpandAnyDict.asData(hashMap483))
        val array401: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n575 = 0
        val array402 = arrayOf<IIngredient?>(null, null, null)
        val n576 = 1
        val item484 = ItemBracketHandler.getItem("ExtraTrees:door", 60)
        val hashMap484 = HashMap<String, IData>()
        hashMap484["meta"] = ExpandInt.toData(60)
        array402[n576] = item484.withTag(ExpandAnyDict.asData(hashMap484))
        array402[2] = null
        array401[n575] = array402
        array401[1] = arrayOf(null, null, null)
        array401[2] = arrayOf(null, null, null)
        recipes167.addShaped(withTag143, array401, null)
        val recipes168 = MineTweakerAPI.recipes
        val item485 = ItemBracketHandler.getItem("ExtraTrees:door", 572)
        val hashMap485 = HashMap<String, IData>()
        hashMap485["meta"] = ExpandInt.toData(572)
        val withTag144 = item485.withTag(ExpandAnyDict.asData(hashMap485))
        val array403: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n577 = 0
        val array404 = arrayOf<IIngredient?>(null, null, null)
        val n578 = 2
        val item486 = ItemBracketHandler.getItem("ExtraTrees:door", 60)
        val hashMap486 = HashMap<String, IData>()
        hashMap486["meta"] = ExpandInt.toData(60)
        array404[n578] = item486.withTag(ExpandAnyDict.asData(hashMap486))
        array403[n577] = array404
        array403[1] = arrayOf(null, null, null)
        array403[2] = arrayOf(null, null, null)
        recipes168.addShaped(withTag144, array403, null)
        val recipes169 = MineTweakerAPI.recipes
        val item487 = ItemBracketHandler.getItem("ExtraTrees:door", 828)
        val hashMap487 = HashMap<String, IData>()
        hashMap487["meta"] = ExpandInt.toData(828)
        val withTag145 = item487.withTag(ExpandAnyDict.asData(hashMap487))
        val array405 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n579 = 1
        val array406 = arrayOfNulls<IIngredient>(3)
        val n580 = 0
        val item488 = ItemBracketHandler.getItem("ExtraTrees:door", 60)
        val hashMap488 = HashMap<String, IData>()
        hashMap488["meta"] = ExpandInt.toData(60)
        array406[n580] = item488.withTag(ExpandAnyDict.asData(hashMap488))
        array406[2] = null.also { array406[1] = it }
        array405[n579] = array406
        array405[2] = arrayOf(null, null, null)
        recipes169.addShaped(withTag145, array405, null)
        val recipes170 = MineTweakerAPI.recipes
        val item489 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap489 = HashMap<String, IData>()
        hashMap489["meta"] = ExpandInt.toData(61)
        val withTag146 = item489.withTag(ExpandAnyDict.asData(hashMap489))
        val array407: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n581 = 0
        val array408 = arrayOfNulls<IIngredient>(3)
        val n582 = 0
        val item490 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap490 = HashMap<String, IData>()
        hashMap490["meta"] = ExpandInt.toData(29)
        array408[n582] = item490.withTag(ExpandAnyDict.asData(hashMap490))
        array408[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array408[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array407[n581] = array408
        val n583 = 1
        val array409 = arrayOfNulls<IIngredient>(3)
        val n584 = 0
        val item491 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap491 = HashMap<String, IData>()
        hashMap491["meta"] = ExpandInt.toData(29)
        array409[n584] = item491.withTag(ExpandAnyDict.asData(hashMap491))
        array409[1] = OreBracketHandler.getOre("ringAnyIron")
        array409[2] = OreBracketHandler.getOre("screwAnyIron")
        array407[n583] = array409
        val n585 = 2
        val array410 = arrayOfNulls<IIngredient>(3)
        val n586 = 0
        val item492 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap492 = HashMap<String, IData>()
        hashMap492["meta"] = ExpandInt.toData(29)
        array410[n586] = item492.withTag(ExpandAnyDict.asData(hashMap492))
        val n587 = 1
        val item493 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap493 = HashMap<String, IData>()
        hashMap493["meta"] = ExpandInt.toData(29)
        array410[n587] = item493.withTag(ExpandAnyDict.asData(hashMap493))
        array410[2] = OreBracketHandler.getOre("craftingToolSaw")
        array407[n585] = array410
        recipes170.addShaped(withTag146, array407, null)
        val recipes171 = MineTweakerAPI.recipes
        val item494 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap494 = HashMap<String, IData>()
        hashMap494["meta"] = ExpandInt.toData(61)
        val withTag147 = item494.withTag(ExpandAnyDict.asData(hashMap494))
        val array411: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n588 = 0
        val array412 = arrayOfNulls<IIngredient>(3)
        val n589 = 0
        val item495 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap495 = HashMap<String, IData>()
        hashMap495["meta"] = ExpandInt.toData(29)
        array412[n589] = item495.withTag(ExpandAnyDict.asData(hashMap495))
        array412[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array412[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array411[n588] = array412
        val n590 = 1
        val array413 = arrayOfNulls<IIngredient>(3)
        val n591 = 0
        val item496 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap496 = HashMap<String, IData>()
        hashMap496["meta"] = ExpandInt.toData(29)
        array413[n591] = item496.withTag(ExpandAnyDict.asData(hashMap496))
        array413[1] = OreBracketHandler.getOre("ringCopper")
        array413[2] = OreBracketHandler.getOre("screwCopper")
        array411[n590] = array413
        val n592 = 2
        val array414 = arrayOfNulls<IIngredient>(3)
        val n593 = 0
        val item497 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap497 = HashMap<String, IData>()
        hashMap497["meta"] = ExpandInt.toData(29)
        array414[n593] = item497.withTag(ExpandAnyDict.asData(hashMap497))
        val n594 = 1
        val item498 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap498 = HashMap<String, IData>()
        hashMap498["meta"] = ExpandInt.toData(29)
        array414[n594] = item498.withTag(ExpandAnyDict.asData(hashMap498))
        array414[2] = OreBracketHandler.getOre("craftingToolSaw")
        array411[n592] = array414
        recipes171.addShaped(withTag147, array411, null)
        val recipes172 = MineTweakerAPI.recipes
        val item499 = ItemBracketHandler.getItem("ExtraTrees:door", 317)
        val hashMap499 = HashMap<String, IData>()
        hashMap499["meta"] = ExpandInt.toData(317)
        val withTag148 = item499.withTag(ExpandAnyDict.asData(hashMap499))
        val array415: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n595 = 0
        val array416 = arrayOf<IIngredient?>(null, null, null)
        val n596 = 1
        val item500 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap500 = HashMap<String, IData>()
        hashMap500["meta"] = ExpandInt.toData(61)
        array416[n596] = item500.withTag(ExpandAnyDict.asData(hashMap500))
        array416[2] = null
        array415[n595] = array416
        array415[1] = arrayOf(null, null, null)
        array415[2] = arrayOf(null, null, null)
        recipes172.addShaped(withTag148, array415, null)
        val recipes173 = MineTweakerAPI.recipes
        val item501 = ItemBracketHandler.getItem("ExtraTrees:door", 573)
        val hashMap501 = HashMap<String, IData>()
        hashMap501["meta"] = ExpandInt.toData(573)
        val withTag149 = item501.withTag(ExpandAnyDict.asData(hashMap501))
        val array417: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n597 = 0
        val array418 = arrayOf<IIngredient?>(null, null, null)
        val n598 = 2
        val item502 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap502 = HashMap<String, IData>()
        hashMap502["meta"] = ExpandInt.toData(61)
        array418[n598] = item502.withTag(ExpandAnyDict.asData(hashMap502))
        array417[n597] = array418
        array417[1] = arrayOf(null, null, null)
        array417[2] = arrayOf(null, null, null)
        recipes173.addShaped(withTag149, array417, null)
        val recipes174 = MineTweakerAPI.recipes
        val item503 = ItemBracketHandler.getItem("ExtraTrees:door", 829)
        val hashMap503 = HashMap<String, IData>()
        hashMap503["meta"] = ExpandInt.toData(829)
        val withTag150 = item503.withTag(ExpandAnyDict.asData(hashMap503))
        val array419 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n599 = 1
        val array420 = arrayOfNulls<IIngredient>(3)
        val n600 = 0
        val item504 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap504 = HashMap<String, IData>()
        hashMap504["meta"] = ExpandInt.toData(61)
        array420[n600] = item504.withTag(ExpandAnyDict.asData(hashMap504))
        array420[2] = null.also { array420[1] = it }
        array419[n599] = array420
        array419[2] = arrayOf(null, null, null)
        recipes174.addShaped(withTag150, array419, null)
        val recipes175 = MineTweakerAPI.recipes
        val item505 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap505 = HashMap<String, IData>()
        hashMap505["meta"] = ExpandInt.toData(62)
        val withTag151 = item505.withTag(ExpandAnyDict.asData(hashMap505))
        val array421: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n601 = 0
        val array422 = arrayOfNulls<IIngredient>(3)
        val n602 = 0
        val item506 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap506 = HashMap<String, IData>()
        hashMap506["meta"] = ExpandInt.toData(30)
        array422[n602] = item506.withTag(ExpandAnyDict.asData(hashMap506))
        array422[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array422[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array421[n601] = array422
        val n603 = 1
        val array423 = arrayOfNulls<IIngredient>(3)
        val n604 = 0
        val item507 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap507 = HashMap<String, IData>()
        hashMap507["meta"] = ExpandInt.toData(30)
        array423[n604] = item507.withTag(ExpandAnyDict.asData(hashMap507))
        array423[1] = OreBracketHandler.getOre("ringAnyIron")
        array423[2] = OreBracketHandler.getOre("screwAnyIron")
        array421[n603] = array423
        val n605 = 2
        val array424 = arrayOfNulls<IIngredient>(3)
        val n606 = 0
        val item508 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap508 = HashMap<String, IData>()
        hashMap508["meta"] = ExpandInt.toData(30)
        array424[n606] = item508.withTag(ExpandAnyDict.asData(hashMap508))
        val n607 = 1
        val item509 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap509 = HashMap<String, IData>()
        hashMap509["meta"] = ExpandInt.toData(30)
        array424[n607] = item509.withTag(ExpandAnyDict.asData(hashMap509))
        array424[2] = OreBracketHandler.getOre("craftingToolSaw")
        array421[n605] = array424
        recipes175.addShaped(withTag151, array421, null)
        val recipes176 = MineTweakerAPI.recipes
        val item510 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap510 = HashMap<String, IData>()
        hashMap510["meta"] = ExpandInt.toData(62)
        val withTag152 = item510.withTag(ExpandAnyDict.asData(hashMap510))
        val array425: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n608 = 0
        val array426 = arrayOfNulls<IIngredient>(3)
        val n609 = 0
        val item511 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap511 = HashMap<String, IData>()
        hashMap511["meta"] = ExpandInt.toData(30)
        array426[n609] = item511.withTag(ExpandAnyDict.asData(hashMap511))
        array426[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array426[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array425[n608] = array426
        val n610 = 1
        val array427 = arrayOfNulls<IIngredient>(3)
        val n611 = 0
        val item512 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap512 = HashMap<String, IData>()
        hashMap512["meta"] = ExpandInt.toData(30)
        array427[n611] = item512.withTag(ExpandAnyDict.asData(hashMap512))
        array427[1] = OreBracketHandler.getOre("ringCopper")
        array427[2] = OreBracketHandler.getOre("screwCopper")
        array425[n610] = array427
        val n612 = 2
        val array428 = arrayOfNulls<IIngredient>(3)
        val n613 = 0
        val item513 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap513 = HashMap<String, IData>()
        hashMap513["meta"] = ExpandInt.toData(30)
        array428[n613] = item513.withTag(ExpandAnyDict.asData(hashMap513))
        val n614 = 1
        val item514 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap514 = HashMap<String, IData>()
        hashMap514["meta"] = ExpandInt.toData(30)
        array428[n614] = item514.withTag(ExpandAnyDict.asData(hashMap514))
        array428[2] = OreBracketHandler.getOre("craftingToolSaw")
        array425[n612] = array428
        recipes176.addShaped(withTag152, array425, null)
        val recipes177 = MineTweakerAPI.recipes
        val item515 = ItemBracketHandler.getItem("ExtraTrees:door", 318)
        val hashMap515 = HashMap<String, IData>()
        hashMap515["meta"] = ExpandInt.toData(318)
        val withTag153 = item515.withTag(ExpandAnyDict.asData(hashMap515))
        val array429: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n615 = 0
        val array430 = arrayOf<IIngredient?>(null, null, null)
        val n616 = 1
        val item516 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap516 = HashMap<String, IData>()
        hashMap516["meta"] = ExpandInt.toData(62)
        array430[n616] = item516.withTag(ExpandAnyDict.asData(hashMap516))
        array430[2] = null
        array429[n615] = array430
        array429[1] = arrayOf(null, null, null)
        array429[2] = arrayOf(null, null, null)
        recipes177.addShaped(withTag153, array429, null)
        val recipes178 = MineTweakerAPI.recipes
        val item517 = ItemBracketHandler.getItem("ExtraTrees:door", 574)
        val hashMap517 = HashMap<String, IData>()
        hashMap517["meta"] = ExpandInt.toData(574)
        val withTag154 = item517.withTag(ExpandAnyDict.asData(hashMap517))
        val array431: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n617 = 0
        val array432 = arrayOf<IIngredient?>(null, null, null)
        val n618 = 2
        val item518 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap518 = HashMap<String, IData>()
        hashMap518["meta"] = ExpandInt.toData(62)
        array432[n618] = item518.withTag(ExpandAnyDict.asData(hashMap518))
        array431[n617] = array432
        array431[1] = arrayOf(null, null, null)
        array431[2] = arrayOf(null, null, null)
        recipes178.addShaped(withTag154, array431, null)
        val recipes179 = MineTweakerAPI.recipes
        val item519 = ItemBracketHandler.getItem("ExtraTrees:door", 830)
        val hashMap519 = HashMap<String, IData>()
        hashMap519["meta"] = ExpandInt.toData(830)
        val withTag155 = item519.withTag(ExpandAnyDict.asData(hashMap519))
        val array433 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n619 = 1
        val array434 = arrayOfNulls<IIngredient>(3)
        val n620 = 0
        val item520 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap520 = HashMap<String, IData>()
        hashMap520["meta"] = ExpandInt.toData(62)
        array434[n620] = item520.withTag(ExpandAnyDict.asData(hashMap520))
        array434[2] = null.also { array434[1] = it }
        array433[n619] = array434
        array433[2] = arrayOf(null, null, null)
        recipes179.addShaped(withTag155, array433, null)
        val recipes180 = MineTweakerAPI.recipes
        val item521 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap521 = HashMap<String, IData>()
        hashMap521["meta"] = ExpandInt.toData(63)
        val withTag156 = item521.withTag(ExpandAnyDict.asData(hashMap521))
        val array435: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n621 = 0
        val array436 = arrayOfNulls<IIngredient>(3)
        val n622 = 0
        val item522 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap522 = HashMap<String, IData>()
        hashMap522["meta"] = ExpandInt.toData(31)
        array436[n622] = item522.withTag(ExpandAnyDict.asData(hashMap522))
        array436[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array436[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array435[n621] = array436
        val n623 = 1
        val array437 = arrayOfNulls<IIngredient>(3)
        val n624 = 0
        val item523 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap523 = HashMap<String, IData>()
        hashMap523["meta"] = ExpandInt.toData(31)
        array437[n624] = item523.withTag(ExpandAnyDict.asData(hashMap523))
        array437[1] = OreBracketHandler.getOre("ringAnyIron")
        array437[2] = OreBracketHandler.getOre("screwAnyIron")
        array435[n623] = array437
        val n625 = 2
        val array438 = arrayOfNulls<IIngredient>(3)
        val n626 = 0
        val item524 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap524 = HashMap<String, IData>()
        hashMap524["meta"] = ExpandInt.toData(31)
        array438[n626] = item524.withTag(ExpandAnyDict.asData(hashMap524))
        val n627 = 1
        val item525 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap525 = HashMap<String, IData>()
        hashMap525["meta"] = ExpandInt.toData(31)
        array438[n627] = item525.withTag(ExpandAnyDict.asData(hashMap525))
        array438[2] = OreBracketHandler.getOre("craftingToolSaw")
        array435[n625] = array438
        recipes180.addShaped(withTag156, array435, null)
        val recipes181 = MineTweakerAPI.recipes
        val item526 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap526 = HashMap<String, IData>()
        hashMap526["meta"] = ExpandInt.toData(63)
        val withTag157 = item526.withTag(ExpandAnyDict.asData(hashMap526))
        val array439: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n628 = 0
        val array440 = arrayOfNulls<IIngredient>(3)
        val n629 = 0
        val item527 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap527 = HashMap<String, IData>()
        hashMap527["meta"] = ExpandInt.toData(31)
        array440[n629] = item527.withTag(ExpandAnyDict.asData(hashMap527))
        array440[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array440[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array439[n628] = array440
        val n630 = 1
        val array441 = arrayOfNulls<IIngredient>(3)
        val n631 = 0
        val item528 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap528 = HashMap<String, IData>()
        hashMap528["meta"] = ExpandInt.toData(31)
        array441[n631] = item528.withTag(ExpandAnyDict.asData(hashMap528))
        array441[1] = OreBracketHandler.getOre("ringCopper")
        array441[2] = OreBracketHandler.getOre("screwCopper")
        array439[n630] = array441
        val n632 = 2
        val array442 = arrayOfNulls<IIngredient>(3)
        val n633 = 0
        val item529 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap529 = HashMap<String, IData>()
        hashMap529["meta"] = ExpandInt.toData(31)
        array442[n633] = item529.withTag(ExpandAnyDict.asData(hashMap529))
        val n634 = 1
        val item530 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap530 = HashMap<String, IData>()
        hashMap530["meta"] = ExpandInt.toData(31)
        array442[n634] = item530.withTag(ExpandAnyDict.asData(hashMap530))
        array442[2] = OreBracketHandler.getOre("craftingToolSaw")
        array439[n632] = array442
        recipes181.addShaped(withTag157, array439, null)
        val recipes182 = MineTweakerAPI.recipes
        val item531 = ItemBracketHandler.getItem("ExtraTrees:door", 319)
        val hashMap531 = HashMap<String, IData>()
        hashMap531["meta"] = ExpandInt.toData(319)
        val withTag158 = item531.withTag(ExpandAnyDict.asData(hashMap531))
        val array443: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n635 = 0
        val array444 = arrayOf<IIngredient?>(null, null, null)
        val n636 = 1
        val item532 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap532 = HashMap<String, IData>()
        hashMap532["meta"] = ExpandInt.toData(63)
        array444[n636] = item532.withTag(ExpandAnyDict.asData(hashMap532))
        array444[2] = null
        array443[n635] = array444
        array443[1] = arrayOf(null, null, null)
        array443[2] = arrayOf(null, null, null)
        recipes182.addShaped(withTag158, array443, null)
        val recipes183 = MineTweakerAPI.recipes
        val item533 = ItemBracketHandler.getItem("ExtraTrees:door", 575)
        val hashMap533 = HashMap<String, IData>()
        hashMap533["meta"] = ExpandInt.toData(575)
        val withTag159 = item533.withTag(ExpandAnyDict.asData(hashMap533))
        val array445: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n637 = 0
        val array446 = arrayOf<IIngredient?>(null, null, null)
        val n638 = 2
        val item534 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap534 = HashMap<String, IData>()
        hashMap534["meta"] = ExpandInt.toData(63)
        array446[n638] = item534.withTag(ExpandAnyDict.asData(hashMap534))
        array445[n637] = array446
        array445[1] = arrayOf(null, null, null)
        array445[2] = arrayOf(null, null, null)
        recipes183.addShaped(withTag159, array445, null)
        val recipes184 = MineTweakerAPI.recipes
        val item535 = ItemBracketHandler.getItem("ExtraTrees:door", 831)
        val hashMap535 = HashMap<String, IData>()
        hashMap535["meta"] = ExpandInt.toData(831)
        val withTag160 = item535.withTag(ExpandAnyDict.asData(hashMap535))
        val array447 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n639 = 1
        val array448 = arrayOfNulls<IIngredient>(3)
        val n640 = 0
        val item536 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap536 = HashMap<String, IData>()
        hashMap536["meta"] = ExpandInt.toData(63)
        array448[n640] = item536.withTag(ExpandAnyDict.asData(hashMap536))
        array448[2] = null.also { array448[1] = it }
        array447[n639] = array448
        array447[2] = arrayOf(null, null, null)
        recipes184.addShaped(withTag160, array447, null)
        val recipes185 = MineTweakerAPI.recipes
        val item537 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap537 = HashMap<String, IData>()
        hashMap537["meta"] = ExpandInt.toData(64)
        val withTag161 = item537.withTag(ExpandAnyDict.asData(hashMap537))
        val array449: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n641 = 0
        val array450 = arrayOfNulls<IIngredient>(3)
        val n642 = 0
        val item538 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap538 = HashMap<String, IData>()
        hashMap538["meta"] = ExpandInt.toData(32)
        array450[n642] = item538.withTag(ExpandAnyDict.asData(hashMap538))
        array450[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array450[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array449[n641] = array450
        val n643 = 1
        val array451 = arrayOfNulls<IIngredient>(3)
        val n644 = 0
        val item539 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap539 = HashMap<String, IData>()
        hashMap539["meta"] = ExpandInt.toData(32)
        array451[n644] = item539.withTag(ExpandAnyDict.asData(hashMap539))
        array451[1] = OreBracketHandler.getOre("ringAnyIron")
        array451[2] = OreBracketHandler.getOre("screwAnyIron")
        array449[n643] = array451
        val n645 = 2
        val array452 = arrayOfNulls<IIngredient>(3)
        val n646 = 0
        val item540 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap540 = HashMap<String, IData>()
        hashMap540["meta"] = ExpandInt.toData(32)
        array452[n646] = item540.withTag(ExpandAnyDict.asData(hashMap540))
        val n647 = 1
        val item541 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap541 = HashMap<String, IData>()
        hashMap541["meta"] = ExpandInt.toData(32)
        array452[n647] = item541.withTag(ExpandAnyDict.asData(hashMap541))
        array452[2] = OreBracketHandler.getOre("craftingToolSaw")
        array449[n645] = array452
        recipes185.addShaped(withTag161, array449, null)
        val recipes186 = MineTweakerAPI.recipes
        val item542 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap542 = HashMap<String, IData>()
        hashMap542["meta"] = ExpandInt.toData(64)
        val withTag162 = item542.withTag(ExpandAnyDict.asData(hashMap542))
        val array453: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n648 = 0
        val array454 = arrayOfNulls<IIngredient>(3)
        val n649 = 0
        val item543 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap543 = HashMap<String, IData>()
        hashMap543["meta"] = ExpandInt.toData(32)
        array454[n649] = item543.withTag(ExpandAnyDict.asData(hashMap543))
        array454[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array454[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array453[n648] = array454
        val n650 = 1
        val array455 = arrayOfNulls<IIngredient>(3)
        val n651 = 0
        val item544 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap544 = HashMap<String, IData>()
        hashMap544["meta"] = ExpandInt.toData(32)
        array455[n651] = item544.withTag(ExpandAnyDict.asData(hashMap544))
        array455[1] = OreBracketHandler.getOre("ringCopper")
        array455[2] = OreBracketHandler.getOre("screwCopper")
        array453[n650] = array455
        val n652 = 2
        val array456 = arrayOfNulls<IIngredient>(3)
        val n653 = 0
        val item545 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap545 = HashMap<String, IData>()
        hashMap545["meta"] = ExpandInt.toData(32)
        array456[n653] = item545.withTag(ExpandAnyDict.asData(hashMap545))
        val n654 = 1
        val item546 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap546 = HashMap<String, IData>()
        hashMap546["meta"] = ExpandInt.toData(32)
        array456[n654] = item546.withTag(ExpandAnyDict.asData(hashMap546))
        array456[2] = OreBracketHandler.getOre("craftingToolSaw")
        array453[n652] = array456
        recipes186.addShaped(withTag162, array453, null)
        val recipes187 = MineTweakerAPI.recipes
        val item547 = ItemBracketHandler.getItem("ExtraTrees:door", 320)
        val hashMap547 = HashMap<String, IData>()
        hashMap547["meta"] = ExpandInt.toData(320)
        val withTag163 = item547.withTag(ExpandAnyDict.asData(hashMap547))
        val array457: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n655 = 0
        val array458 = arrayOf<IIngredient?>(null, null, null)
        val n656 = 1
        val item548 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap548 = HashMap<String, IData>()
        hashMap548["meta"] = ExpandInt.toData(64)
        array458[n656] = item548.withTag(ExpandAnyDict.asData(hashMap548))
        array458[2] = null
        array457[n655] = array458
        array457[1] = arrayOf(null, null, null)
        array457[2] = arrayOf(null, null, null)
        recipes187.addShaped(withTag163, array457, null)
        val recipes188 = MineTweakerAPI.recipes
        val item549 = ItemBracketHandler.getItem("ExtraTrees:door", 576)
        val hashMap549 = HashMap<String, IData>()
        hashMap549["meta"] = ExpandInt.toData(576)
        val withTag164 = item549.withTag(ExpandAnyDict.asData(hashMap549))
        val array459: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n657 = 0
        val array460 = arrayOf<IIngredient?>(null, null, null)
        val n658 = 2
        val item550 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap550 = HashMap<String, IData>()
        hashMap550["meta"] = ExpandInt.toData(64)
        array460[n658] = item550.withTag(ExpandAnyDict.asData(hashMap550))
        array459[n657] = array460
        array459[1] = arrayOf(null, null, null)
        array459[2] = arrayOf(null, null, null)
        recipes188.addShaped(withTag164, array459, null)
        val recipes189 = MineTweakerAPI.recipes
        val item551 = ItemBracketHandler.getItem("ExtraTrees:door", 832)
        val hashMap551 = HashMap<String, IData>()
        hashMap551["meta"] = ExpandInt.toData(832)
        val withTag165 = item551.withTag(ExpandAnyDict.asData(hashMap551))
        val array461 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n659 = 1
        val array462 = arrayOfNulls<IIngredient>(3)
        val n660 = 0
        val item552 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap552 = HashMap<String, IData>()
        hashMap552["meta"] = ExpandInt.toData(64)
        array462[n660] = item552.withTag(ExpandAnyDict.asData(hashMap552))
        array462[2] = null.also { array462[1] = it }
        array461[n659] = array462
        array461[2] = arrayOf(null, null, null)
        recipes189.addShaped(withTag165, array461, null)
        val recipes190 = MineTweakerAPI.recipes
        val item553 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap553 = HashMap<String, IData>()
        hashMap553["meta"] = ExpandInt.toData(65)
        val withTag166 = item553.withTag(ExpandAnyDict.asData(hashMap553))
        val array463: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n661 = 0
        val array464 = arrayOfNulls<IIngredient>(3)
        val n662 = 0
        val item554 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap554 = HashMap<String, IData>()
        hashMap554["meta"] = ExpandInt.toData(33)
        array464[n662] = item554.withTag(ExpandAnyDict.asData(hashMap554))
        array464[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array464[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array463[n661] = array464
        val n663 = 1
        val array465 = arrayOfNulls<IIngredient>(3)
        val n664 = 0
        val item555 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap555 = HashMap<String, IData>()
        hashMap555["meta"] = ExpandInt.toData(33)
        array465[n664] = item555.withTag(ExpandAnyDict.asData(hashMap555))
        array465[1] = OreBracketHandler.getOre("ringAnyIron")
        array465[2] = OreBracketHandler.getOre("screwAnyIron")
        array463[n663] = array465
        val n665 = 2
        val array466 = arrayOfNulls<IIngredient>(3)
        val n666 = 0
        val item556 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap556 = HashMap<String, IData>()
        hashMap556["meta"] = ExpandInt.toData(33)
        array466[n666] = item556.withTag(ExpandAnyDict.asData(hashMap556))
        val n667 = 1
        val item557 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap557 = HashMap<String, IData>()
        hashMap557["meta"] = ExpandInt.toData(33)
        array466[n667] = item557.withTag(ExpandAnyDict.asData(hashMap557))
        array466[2] = OreBracketHandler.getOre("craftingToolSaw")
        array463[n665] = array466
        recipes190.addShaped(withTag166, array463, null)
        val recipes191 = MineTweakerAPI.recipes
        val item558 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap558 = HashMap<String, IData>()
        hashMap558["meta"] = ExpandInt.toData(65)
        val withTag167 = item558.withTag(ExpandAnyDict.asData(hashMap558))
        val array467: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n668 = 0
        val array468 = arrayOfNulls<IIngredient>(3)
        val n669 = 0
        val item559 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap559 = HashMap<String, IData>()
        hashMap559["meta"] = ExpandInt.toData(33)
        array468[n669] = item559.withTag(ExpandAnyDict.asData(hashMap559))
        array468[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array468[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array467[n668] = array468
        val n670 = 1
        val array469 = arrayOfNulls<IIngredient>(3)
        val n671 = 0
        val item560 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap560 = HashMap<String, IData>()
        hashMap560["meta"] = ExpandInt.toData(33)
        array469[n671] = item560.withTag(ExpandAnyDict.asData(hashMap560))
        array469[1] = OreBracketHandler.getOre("ringCopper")
        array469[2] = OreBracketHandler.getOre("screwCopper")
        array467[n670] = array469
        val n672 = 2
        val array470 = arrayOfNulls<IIngredient>(3)
        val n673 = 0
        val item561 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap561 = HashMap<String, IData>()
        hashMap561["meta"] = ExpandInt.toData(33)
        array470[n673] = item561.withTag(ExpandAnyDict.asData(hashMap561))
        val n674 = 1
        val item562 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap562 = HashMap<String, IData>()
        hashMap562["meta"] = ExpandInt.toData(33)
        array470[n674] = item562.withTag(ExpandAnyDict.asData(hashMap562))
        array470[2] = OreBracketHandler.getOre("craftingToolSaw")
        array467[n672] = array470
        recipes191.addShaped(withTag167, array467, null)
        val recipes192 = MineTweakerAPI.recipes
        val item563 = ItemBracketHandler.getItem("ExtraTrees:door", 321)
        val hashMap563 = HashMap<String, IData>()
        hashMap563["meta"] = ExpandInt.toData(321)
        val withTag168 = item563.withTag(ExpandAnyDict.asData(hashMap563))
        val array471: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n675 = 0
        val array472 = arrayOf<IIngredient?>(null, null, null)
        val n676 = 1
        val item564 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap564 = HashMap<String, IData>()
        hashMap564["meta"] = ExpandInt.toData(65)
        array472[n676] = item564.withTag(ExpandAnyDict.asData(hashMap564))
        array472[2] = null
        array471[n675] = array472
        array471[1] = arrayOf(null, null, null)
        array471[2] = arrayOf(null, null, null)
        recipes192.addShaped(withTag168, array471, null)
        val recipes193 = MineTweakerAPI.recipes
        val item565 = ItemBracketHandler.getItem("ExtraTrees:door", 577)
        val hashMap565 = HashMap<String, IData>()
        hashMap565["meta"] = ExpandInt.toData(577)
        val withTag169 = item565.withTag(ExpandAnyDict.asData(hashMap565))
        val array473: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n677 = 0
        val array474 = arrayOf<IIngredient?>(null, null, null)
        val n678 = 2
        val item566 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap566 = HashMap<String, IData>()
        hashMap566["meta"] = ExpandInt.toData(65)
        array474[n678] = item566.withTag(ExpandAnyDict.asData(hashMap566))
        array473[n677] = array474
        array473[1] = arrayOf(null, null, null)
        array473[2] = arrayOf(null, null, null)
        recipes193.addShaped(withTag169, array473, null)
        val recipes194 = MineTweakerAPI.recipes
        val item567 = ItemBracketHandler.getItem("ExtraTrees:door", 833)
        val hashMap567 = HashMap<String, IData>()
        hashMap567["meta"] = ExpandInt.toData(833)
        val withTag170 = item567.withTag(ExpandAnyDict.asData(hashMap567))
        val array475 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n679 = 1
        val array476 = arrayOfNulls<IIngredient>(3)
        val n680 = 0
        val item568 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap568 = HashMap<String, IData>()
        hashMap568["meta"] = ExpandInt.toData(65)
        array476[n680] = item568.withTag(ExpandAnyDict.asData(hashMap568))
        array476[2] = null.also { array476[1] = it }
        array475[n679] = array476
        array475[2] = arrayOf(null, null, null)
        recipes194.addShaped(withTag170, array475, null)
        val recipes195 = MineTweakerAPI.recipes
        val item569 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap569 = HashMap<String, IData>()
        hashMap569["meta"] = ExpandInt.toData(66)
        val withTag171 = item569.withTag(ExpandAnyDict.asData(hashMap569))
        val array477: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n681 = 0
        val array478 = arrayOfNulls<IIngredient>(3)
        val n682 = 0
        val item570 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap570 = HashMap<String, IData>()
        hashMap570["meta"] = ExpandInt.toData(34)
        array478[n682] = item570.withTag(ExpandAnyDict.asData(hashMap570))
        array478[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array478[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array477[n681] = array478
        val n683 = 1
        val array479 = arrayOfNulls<IIngredient>(3)
        val n684 = 0
        val item571 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap571 = HashMap<String, IData>()
        hashMap571["meta"] = ExpandInt.toData(34)
        array479[n684] = item571.withTag(ExpandAnyDict.asData(hashMap571))
        array479[1] = OreBracketHandler.getOre("ringAnyIron")
        array479[2] = OreBracketHandler.getOre("screwAnyIron")
        array477[n683] = array479
        val n685 = 2
        val array480 = arrayOfNulls<IIngredient>(3)
        val n686 = 0
        val item572 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap572 = HashMap<String, IData>()
        hashMap572["meta"] = ExpandInt.toData(34)
        array480[n686] = item572.withTag(ExpandAnyDict.asData(hashMap572))
        val n687 = 1
        val item573 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap573 = HashMap<String, IData>()
        hashMap573["meta"] = ExpandInt.toData(34)
        array480[n687] = item573.withTag(ExpandAnyDict.asData(hashMap573))
        array480[2] = OreBracketHandler.getOre("craftingToolSaw")
        array477[n685] = array480
        recipes195.addShaped(withTag171, array477, null)
        val recipes196 = MineTweakerAPI.recipes
        val item574 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap574 = HashMap<String, IData>()
        hashMap574["meta"] = ExpandInt.toData(66)
        val withTag172 = item574.withTag(ExpandAnyDict.asData(hashMap574))
        val array481: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n688 = 0
        val array482 = arrayOfNulls<IIngredient>(3)
        val n689 = 0
        val item575 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap575 = HashMap<String, IData>()
        hashMap575["meta"] = ExpandInt.toData(34)
        array482[n689] = item575.withTag(ExpandAnyDict.asData(hashMap575))
        array482[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array482[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array481[n688] = array482
        val n690 = 1
        val array483 = arrayOfNulls<IIngredient>(3)
        val n691 = 0
        val item576 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap576 = HashMap<String, IData>()
        hashMap576["meta"] = ExpandInt.toData(34)
        array483[n691] = item576.withTag(ExpandAnyDict.asData(hashMap576))
        array483[1] = OreBracketHandler.getOre("ringCopper")
        array483[2] = OreBracketHandler.getOre("screwCopper")
        array481[n690] = array483
        val n692 = 2
        val array484 = arrayOfNulls<IIngredient>(3)
        val n693 = 0
        val item577 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap577 = HashMap<String, IData>()
        hashMap577["meta"] = ExpandInt.toData(34)
        array484[n693] = item577.withTag(ExpandAnyDict.asData(hashMap577))
        val n694 = 1
        val item578 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap578 = HashMap<String, IData>()
        hashMap578["meta"] = ExpandInt.toData(34)
        array484[n694] = item578.withTag(ExpandAnyDict.asData(hashMap578))
        array484[2] = OreBracketHandler.getOre("craftingToolSaw")
        array481[n692] = array484
        recipes196.addShaped(withTag172, array481, null)
        val recipes197 = MineTweakerAPI.recipes
        val item579 = ItemBracketHandler.getItem("ExtraTrees:door", 322)
        val hashMap579 = HashMap<String, IData>()
        hashMap579["meta"] = ExpandInt.toData(322)
        val withTag173 = item579.withTag(ExpandAnyDict.asData(hashMap579))
        val array485: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n695 = 0
        val array486 = arrayOf<IIngredient?>(null, null, null)
        val n696 = 1
        val item580 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap580 = HashMap<String, IData>()
        hashMap580["meta"] = ExpandInt.toData(66)
        array486[n696] = item580.withTag(ExpandAnyDict.asData(hashMap580))
        array486[2] = null
        array485[n695] = array486
        array485[1] = arrayOf(null, null, null)
        array485[2] = arrayOf(null, null, null)
        recipes197.addShaped(withTag173, array485, null)
        val recipes198 = MineTweakerAPI.recipes
        val item581 = ItemBracketHandler.getItem("ExtraTrees:door", 578)
        val hashMap581 = HashMap<String, IData>()
        hashMap581["meta"] = ExpandInt.toData(578)
        val withTag174 = item581.withTag(ExpandAnyDict.asData(hashMap581))
        val array487: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n697 = 0
        val array488 = arrayOf<IIngredient?>(null, null, null)
        val n698 = 2
        val item582 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap582 = HashMap<String, IData>()
        hashMap582["meta"] = ExpandInt.toData(66)
        array488[n698] = item582.withTag(ExpandAnyDict.asData(hashMap582))
        array487[n697] = array488
        array487[1] = arrayOf(null, null, null)
        array487[2] = arrayOf(null, null, null)
        recipes198.addShaped(withTag174, array487, null)
        val recipes199 = MineTweakerAPI.recipes
        val item583 = ItemBracketHandler.getItem("ExtraTrees:door", 834)
        val hashMap583 = HashMap<String, IData>()
        hashMap583["meta"] = ExpandInt.toData(834)
        val withTag175 = item583.withTag(ExpandAnyDict.asData(hashMap583))
        val array489 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n699 = 1
        val array490 = arrayOfNulls<IIngredient>(3)
        val n700 = 0
        val item584 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap584 = HashMap<String, IData>()
        hashMap584["meta"] = ExpandInt.toData(66)
        array490[n700] = item584.withTag(ExpandAnyDict.asData(hashMap584))
        array490[2] = null.also { array490[1] = it }
        array489[n699] = array490
        array489[2] = arrayOf(null, null, null)
        recipes199.addShaped(withTag175, array489, null)
        val recipes200 = MineTweakerAPI.recipes
        val item585 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap585 = HashMap<String, IData>()
        hashMap585["meta"] = ExpandInt.toData(128)
        recipes200.addShaped(item585.withTag(ExpandAnyDict.asData(hashMap585)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 0), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                ItemBracketHandler.getItem("Forestry:planks", 0), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes201 = MineTweakerAPI.recipes
        val item586 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap586 = HashMap<String, IData>()
        hashMap586["meta"] = ExpandInt.toData(128)
        recipes201.addShaped(item586.withTag(ExpandAnyDict.asData(hashMap586)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 0), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                ItemBracketHandler.getItem("Forestry:planks", 0), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes202 = MineTweakerAPI.recipes
        val item587 = ItemBracketHandler.getItem("ExtraTrees:door", 384)
        val hashMap587 = HashMap<String, IData>()
        hashMap587["meta"] = ExpandInt.toData(384)
        val withTag176 = item587.withTag(ExpandAnyDict.asData(hashMap587))
        val array491: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n701 = 0
        val array492 = arrayOf<IIngredient?>(null, null, null)
        val n702 = 1
        val item588 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap588 = HashMap<String, IData>()
        hashMap588["meta"] = ExpandInt.toData(128)
        array492[n702] = item588.withTag(ExpandAnyDict.asData(hashMap588))
        array492[2] = null
        array491[n701] = array492
        array491[1] = arrayOf(null, null, null)
        array491[2] = arrayOf(null, null, null)
        recipes202.addShaped(withTag176, array491, null)
        val recipes203 = MineTweakerAPI.recipes
        val item589 = ItemBracketHandler.getItem("ExtraTrees:door", 640)
        val hashMap589 = HashMap<String, IData>()
        hashMap589["meta"] = ExpandInt.toData(640)
        val withTag177 = item589.withTag(ExpandAnyDict.asData(hashMap589))
        val array493: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n703 = 0
        val array494 = arrayOf<IIngredient?>(null, null, null)
        val n704 = 2
        val item590 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap590 = HashMap<String, IData>()
        hashMap590["meta"] = ExpandInt.toData(128)
        array494[n704] = item590.withTag(ExpandAnyDict.asData(hashMap590))
        array493[n703] = array494
        array493[1] = arrayOf(null, null, null)
        array493[2] = arrayOf(null, null, null)
        recipes203.addShaped(withTag177, array493, null)
        val recipes204 = MineTweakerAPI.recipes
        val item591 = ItemBracketHandler.getItem("ExtraTrees:door", 896)
        val hashMap591 = HashMap<String, IData>()
        hashMap591["meta"] = ExpandInt.toData(896)
        val withTag178 = item591.withTag(ExpandAnyDict.asData(hashMap591))
        val array495 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n705 = 1
        val array496 = arrayOfNulls<IIngredient>(3)
        val n706 = 0
        val item592 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap592 = HashMap<String, IData>()
        hashMap592["meta"] = ExpandInt.toData(128)
        array496[n706] = item592.withTag(ExpandAnyDict.asData(hashMap592))
        array496[2] = null.also { array496[1] = it }
        array495[n705] = array496
        array495[2] = arrayOf(null, null, null)
        recipes204.addShaped(withTag178, array495, null)
        val recipes205 = MineTweakerAPI.recipes
        val item593 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap593 = HashMap<String, IData>()
        hashMap593["meta"] = ExpandInt.toData(129)
        recipes205.addShaped(item593.withTag(ExpandAnyDict.asData(hashMap593)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 1), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                ItemBracketHandler.getItem("Forestry:planks", 1), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes206 = MineTweakerAPI.recipes
        val item594 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap594 = HashMap<String, IData>()
        hashMap594["meta"] = ExpandInt.toData(129)
        recipes206.addShaped(item594.withTag(ExpandAnyDict.asData(hashMap594)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 1), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                ItemBracketHandler.getItem("Forestry:planks", 1), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes207 = MineTweakerAPI.recipes
        val item595 = ItemBracketHandler.getItem("ExtraTrees:door", 385)
        val hashMap595 = HashMap<String, IData>()
        hashMap595["meta"] = ExpandInt.toData(385)
        val withTag179 = item595.withTag(ExpandAnyDict.asData(hashMap595))
        val array497: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n707 = 0
        val array498 = arrayOf<IIngredient?>(null, null, null)
        val n708 = 1
        val item596 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap596 = HashMap<String, IData>()
        hashMap596["meta"] = ExpandInt.toData(129)
        array498[n708] = item596.withTag(ExpandAnyDict.asData(hashMap596))
        array498[2] = null
        array497[n707] = array498
        array497[1] = arrayOf(null, null, null)
        array497[2] = arrayOf(null, null, null)
        recipes207.addShaped(withTag179, array497, null)
        val recipes208 = MineTweakerAPI.recipes
        val item597 = ItemBracketHandler.getItem("ExtraTrees:door", 641)
        val hashMap597 = HashMap<String, IData>()
        hashMap597["meta"] = ExpandInt.toData(641)
        val withTag180 = item597.withTag(ExpandAnyDict.asData(hashMap597))
        val array499: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n709 = 0
        val array500 = arrayOf<IIngredient?>(null, null, null)
        val n710 = 2
        val item598 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap598 = HashMap<String, IData>()
        hashMap598["meta"] = ExpandInt.toData(129)
        array500[n710] = item598.withTag(ExpandAnyDict.asData(hashMap598))
        array499[n709] = array500
        array499[1] = arrayOf(null, null, null)
        array499[2] = arrayOf(null, null, null)
        recipes208.addShaped(withTag180, array499, null)
        val recipes209 = MineTweakerAPI.recipes
        val item599 = ItemBracketHandler.getItem("ExtraTrees:door", 897)
        val hashMap599 = HashMap<String, IData>()
        hashMap599["meta"] = ExpandInt.toData(897)
        val withTag181 = item599.withTag(ExpandAnyDict.asData(hashMap599))
        val array501 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n711 = 1
        val array502 = arrayOfNulls<IIngredient>(3)
        val n712 = 0
        val item600 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap600 = HashMap<String, IData>()
        hashMap600["meta"] = ExpandInt.toData(129)
        array502[n712] = item600.withTag(ExpandAnyDict.asData(hashMap600))
        array502[2] = null.also { array502[1] = it }
        array501[n711] = array502
        array501[2] = arrayOf(null, null, null)
        recipes209.addShaped(withTag181, array501, null)
        val recipes210 = MineTweakerAPI.recipes
        val item601 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap601 = HashMap<String, IData>()
        hashMap601["meta"] = ExpandInt.toData(130)
        recipes210.addShaped(item601.withTag(ExpandAnyDict.asData(hashMap601)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 2), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                ItemBracketHandler.getItem("Forestry:planks", 2), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes211 = MineTweakerAPI.recipes
        val item602 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap602 = HashMap<String, IData>()
        hashMap602["meta"] = ExpandInt.toData(130)
        recipes211.addShaped(item602.withTag(ExpandAnyDict.asData(hashMap602)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 2), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                ItemBracketHandler.getItem("Forestry:planks", 2), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes212 = MineTweakerAPI.recipes
        val item603 = ItemBracketHandler.getItem("ExtraTrees:door", 386)
        val hashMap603 = HashMap<String, IData>()
        hashMap603["meta"] = ExpandInt.toData(386)
        val withTag182 = item603.withTag(ExpandAnyDict.asData(hashMap603))
        val array503: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n713 = 0
        val array504 = arrayOf<IIngredient?>(null, null, null)
        val n714 = 1
        val item604 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap604 = HashMap<String, IData>()
        hashMap604["meta"] = ExpandInt.toData(130)
        array504[n714] = item604.withTag(ExpandAnyDict.asData(hashMap604))
        array504[2] = null
        array503[n713] = array504
        array503[1] = arrayOf(null, null, null)
        array503[2] = arrayOf(null, null, null)
        recipes212.addShaped(withTag182, array503, null)
        val recipes213 = MineTweakerAPI.recipes
        val item605 = ItemBracketHandler.getItem("ExtraTrees:door", 642)
        val hashMap605 = HashMap<String, IData>()
        hashMap605["meta"] = ExpandInt.toData(642)
        val withTag183 = item605.withTag(ExpandAnyDict.asData(hashMap605))
        val array505: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n715 = 0
        val array506 = arrayOf<IIngredient?>(null, null, null)
        val n716 = 2
        val item606 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap606 = HashMap<String, IData>()
        hashMap606["meta"] = ExpandInt.toData(130)
        array506[n716] = item606.withTag(ExpandAnyDict.asData(hashMap606))
        array505[n715] = array506
        array505[1] = arrayOf(null, null, null)
        array505[2] = arrayOf(null, null, null)
        recipes213.addShaped(withTag183, array505, null)
        val recipes214 = MineTweakerAPI.recipes
        val item607 = ItemBracketHandler.getItem("ExtraTrees:door", 898)
        val hashMap607 = HashMap<String, IData>()
        hashMap607["meta"] = ExpandInt.toData(898)
        val withTag184 = item607.withTag(ExpandAnyDict.asData(hashMap607))
        val array507 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n717 = 1
        val array508 = arrayOfNulls<IIngredient>(3)
        val n718 = 0
        val item608 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap608 = HashMap<String, IData>()
        hashMap608["meta"] = ExpandInt.toData(130)
        array508[n718] = item608.withTag(ExpandAnyDict.asData(hashMap608))
        array508[2] = null.also { array508[1] = it }
        array507[n717] = array508
        array507[2] = arrayOf(null, null, null)
        recipes214.addShaped(withTag184, array507, null)
        val recipes215 = MineTweakerAPI.recipes
        val item609 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap609 = HashMap<String, IData>()
        hashMap609["meta"] = ExpandInt.toData(131)
        recipes215.addShaped(item609.withTag(ExpandAnyDict.asData(hashMap609)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 3), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                ItemBracketHandler.getItem("Forestry:planks", 3), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes216 = MineTweakerAPI.recipes
        val item610 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap610 = HashMap<String, IData>()
        hashMap610["meta"] = ExpandInt.toData(131)
        recipes216.addShaped(item610.withTag(ExpandAnyDict.asData(hashMap610)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 3), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                ItemBracketHandler.getItem("Forestry:planks", 3), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes217 = MineTweakerAPI.recipes
        val item611 = ItemBracketHandler.getItem("ExtraTrees:door", 387)
        val hashMap611 = HashMap<String, IData>()
        hashMap611["meta"] = ExpandInt.toData(387)
        val withTag185 = item611.withTag(ExpandAnyDict.asData(hashMap611))
        val array509: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n719 = 0
        val array510 = arrayOf<IIngredient?>(null, null, null)
        val n720 = 1
        val item612 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap612 = HashMap<String, IData>()
        hashMap612["meta"] = ExpandInt.toData(131)
        array510[n720] = item612.withTag(ExpandAnyDict.asData(hashMap612))
        array510[2] = null
        array509[n719] = array510
        array509[1] = arrayOf(null, null, null)
        array509[2] = arrayOf(null, null, null)
        recipes217.addShaped(withTag185, array509, null)
        val recipes218 = MineTweakerAPI.recipes
        val item613 = ItemBracketHandler.getItem("ExtraTrees:door", 643)
        val hashMap613 = HashMap<String, IData>()
        hashMap613["meta"] = ExpandInt.toData(643)
        val withTag186 = item613.withTag(ExpandAnyDict.asData(hashMap613))
        val array511: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n721 = 0
        val array512 = arrayOf<IIngredient?>(null, null, null)
        val n722 = 2
        val item614 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap614 = HashMap<String, IData>()
        hashMap614["meta"] = ExpandInt.toData(131)
        array512[n722] = item614.withTag(ExpandAnyDict.asData(hashMap614))
        array511[n721] = array512
        array511[1] = arrayOf(null, null, null)
        array511[2] = arrayOf(null, null, null)
        recipes218.addShaped(withTag186, array511, null)
        val recipes219 = MineTweakerAPI.recipes
        val item615 = ItemBracketHandler.getItem("ExtraTrees:door", 899)
        val hashMap615 = HashMap<String, IData>()
        hashMap615["meta"] = ExpandInt.toData(899)
        val withTag187 = item615.withTag(ExpandAnyDict.asData(hashMap615))
        val array513 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n723 = 1
        val array514 = arrayOfNulls<IIngredient>(3)
        val n724 = 0
        val item616 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap616 = HashMap<String, IData>()
        hashMap616["meta"] = ExpandInt.toData(131)
        array514[n724] = item616.withTag(ExpandAnyDict.asData(hashMap616))
        array514[2] = null.also { array514[1] = it }
        array513[n723] = array514
        array513[2] = arrayOf(null, null, null)
        recipes219.addShaped(withTag187, array513, null)
        val recipes220 = MineTweakerAPI.recipes
        val item617 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap617 = HashMap<String, IData>()
        hashMap617["meta"] = ExpandInt.toData(132)
        recipes220.addShaped(item617.withTag(ExpandAnyDict.asData(hashMap617)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 4), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                ItemBracketHandler.getItem("Forestry:planks", 4), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes221 = MineTweakerAPI.recipes
        val item618 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap618 = HashMap<String, IData>()
        hashMap618["meta"] = ExpandInt.toData(132)
        recipes221.addShaped(item618.withTag(ExpandAnyDict.asData(hashMap618)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 4), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                ItemBracketHandler.getItem("Forestry:planks", 4), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes222 = MineTweakerAPI.recipes
        val item619 = ItemBracketHandler.getItem("ExtraTrees:door", 388)
        val hashMap619 = HashMap<String, IData>()
        hashMap619["meta"] = ExpandInt.toData(388)
        val withTag188 = item619.withTag(ExpandAnyDict.asData(hashMap619))
        val array515: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n725 = 0
        val array516 = arrayOf<IIngredient?>(null, null, null)
        val n726 = 1
        val item620 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap620 = HashMap<String, IData>()
        hashMap620["meta"] = ExpandInt.toData(132)
        array516[n726] = item620.withTag(ExpandAnyDict.asData(hashMap620))
        array516[2] = null
        array515[n725] = array516
        array515[1] = arrayOf(null, null, null)
        array515[2] = arrayOf(null, null, null)
        recipes222.addShaped(withTag188, array515, null)
        val recipes223 = MineTweakerAPI.recipes
        val item621 = ItemBracketHandler.getItem("ExtraTrees:door", 644)
        val hashMap621 = HashMap<String, IData>()
        hashMap621["meta"] = ExpandInt.toData(644)
        val withTag189 = item621.withTag(ExpandAnyDict.asData(hashMap621))
        val array517: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n727 = 0
        val array518 = arrayOf<IIngredient?>(null, null, null)
        val n728 = 2
        val item622 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap622 = HashMap<String, IData>()
        hashMap622["meta"] = ExpandInt.toData(132)
        array518[n728] = item622.withTag(ExpandAnyDict.asData(hashMap622))
        array517[n727] = array518
        array517[1] = arrayOf(null, null, null)
        array517[2] = arrayOf(null, null, null)
        recipes223.addShaped(withTag189, array517, null)
        val recipes224 = MineTweakerAPI.recipes
        val item623 = ItemBracketHandler.getItem("ExtraTrees:door", 900)
        val hashMap623 = HashMap<String, IData>()
        hashMap623["meta"] = ExpandInt.toData(900)
        val withTag190 = item623.withTag(ExpandAnyDict.asData(hashMap623))
        val array519 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n729 = 1
        val array520 = arrayOfNulls<IIngredient>(3)
        val n730 = 0
        val item624 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap624 = HashMap<String, IData>()
        hashMap624["meta"] = ExpandInt.toData(132)
        array520[n730] = item624.withTag(ExpandAnyDict.asData(hashMap624))
        array520[2] = null.also { array520[1] = it }
        array519[n729] = array520
        array519[2] = arrayOf(null, null, null)
        recipes224.addShaped(withTag190, array519, null)
        val recipes225 = MineTweakerAPI.recipes
        val item625 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap625 = HashMap<String, IData>()
        hashMap625["meta"] = ExpandInt.toData(133)
        recipes225.addShaped(item625.withTag(ExpandAnyDict.asData(hashMap625)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 5), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                ItemBracketHandler.getItem("Forestry:planks", 5), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes226 = MineTweakerAPI.recipes
        val item626 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap626 = HashMap<String, IData>()
        hashMap626["meta"] = ExpandInt.toData(133)
        recipes226.addShaped(item626.withTag(ExpandAnyDict.asData(hashMap626)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 5), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                ItemBracketHandler.getItem("Forestry:planks", 5), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes227 = MineTweakerAPI.recipes
        val item627 = ItemBracketHandler.getItem("ExtraTrees:door", 389)
        val hashMap627 = HashMap<String, IData>()
        hashMap627["meta"] = ExpandInt.toData(389)
        val withTag191 = item627.withTag(ExpandAnyDict.asData(hashMap627))
        val array521: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n731 = 0
        val array522 = arrayOf<IIngredient?>(null, null, null)
        val n732 = 1
        val item628 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap628 = HashMap<String, IData>()
        hashMap628["meta"] = ExpandInt.toData(133)
        array522[n732] = item628.withTag(ExpandAnyDict.asData(hashMap628))
        array522[2] = null
        array521[n731] = array522
        array521[1] = arrayOf(null, null, null)
        array521[2] = arrayOf(null, null, null)
        recipes227.addShaped(withTag191, array521, null)
        val recipes228 = MineTweakerAPI.recipes
        val item629 = ItemBracketHandler.getItem("ExtraTrees:door", 645)
        val hashMap629 = HashMap<String, IData>()
        hashMap629["meta"] = ExpandInt.toData(645)
        val withTag192 = item629.withTag(ExpandAnyDict.asData(hashMap629))
        val array523: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n733 = 0
        val array524 = arrayOf<IIngredient?>(null, null, null)
        val n734 = 2
        val item630 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap630 = HashMap<String, IData>()
        hashMap630["meta"] = ExpandInt.toData(133)
        array524[n734] = item630.withTag(ExpandAnyDict.asData(hashMap630))
        array523[n733] = array524
        array523[1] = arrayOf(null, null, null)
        array523[2] = arrayOf(null, null, null)
        recipes228.addShaped(withTag192, array523, null)
        val recipes229 = MineTweakerAPI.recipes
        val item631 = ItemBracketHandler.getItem("ExtraTrees:door", 901)
        val hashMap631 = HashMap<String, IData>()
        hashMap631["meta"] = ExpandInt.toData(901)
        val withTag193 = item631.withTag(ExpandAnyDict.asData(hashMap631))
        val array525 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n735 = 1
        val array526 = arrayOfNulls<IIngredient>(3)
        val n736 = 0
        val item632 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap632 = HashMap<String, IData>()
        hashMap632["meta"] = ExpandInt.toData(133)
        array526[n736] = item632.withTag(ExpandAnyDict.asData(hashMap632))
        array526[2] = null.also { array526[1] = it }
        array525[n735] = array526
        array525[2] = arrayOf(null, null, null)
        recipes229.addShaped(withTag193, array525, null)
        val recipes230 = MineTweakerAPI.recipes
        val item633 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap633 = HashMap<String, IData>()
        hashMap633["meta"] = ExpandInt.toData(134)
        recipes230.addShaped(item633.withTag(ExpandAnyDict.asData(hashMap633)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 6), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                ItemBracketHandler.getItem("Forestry:planks", 6), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes231 = MineTweakerAPI.recipes
        val item634 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap634 = HashMap<String, IData>()
        hashMap634["meta"] = ExpandInt.toData(134)
        recipes231.addShaped(item634.withTag(ExpandAnyDict.asData(hashMap634)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 6), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                ItemBracketHandler.getItem("Forestry:planks", 6), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes232 = MineTweakerAPI.recipes
        val item635 = ItemBracketHandler.getItem("ExtraTrees:door", 390)
        val hashMap635 = HashMap<String, IData>()
        hashMap635["meta"] = ExpandInt.toData(390)
        val withTag194 = item635.withTag(ExpandAnyDict.asData(hashMap635))
        val array527: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n737 = 0
        val array528 = arrayOf<IIngredient?>(null, null, null)
        val n738 = 1
        val item636 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap636 = HashMap<String, IData>()
        hashMap636["meta"] = ExpandInt.toData(134)
        array528[n738] = item636.withTag(ExpandAnyDict.asData(hashMap636))
        array528[2] = null
        array527[n737] = array528
        array527[1] = arrayOf(null, null, null)
        array527[2] = arrayOf(null, null, null)
        recipes232.addShaped(withTag194, array527, null)
        val recipes233 = MineTweakerAPI.recipes
        val item637 = ItemBracketHandler.getItem("ExtraTrees:door", 646)
        val hashMap637 = HashMap<String, IData>()
        hashMap637["meta"] = ExpandInt.toData(646)
        val withTag195 = item637.withTag(ExpandAnyDict.asData(hashMap637))
        val array529: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n739 = 0
        val array530 = arrayOf<IIngredient?>(null, null, null)
        val n740 = 2
        val item638 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap638 = HashMap<String, IData>()
        hashMap638["meta"] = ExpandInt.toData(134)
        array530[n740] = item638.withTag(ExpandAnyDict.asData(hashMap638))
        array529[n739] = array530
        array529[1] = arrayOf(null, null, null)
        array529[2] = arrayOf(null, null, null)
        recipes233.addShaped(withTag195, array529, null)
        val recipes234 = MineTweakerAPI.recipes
        val item639 = ItemBracketHandler.getItem("ExtraTrees:door", 902)
        val hashMap639 = HashMap<String, IData>()
        hashMap639["meta"] = ExpandInt.toData(902)
        val withTag196 = item639.withTag(ExpandAnyDict.asData(hashMap639))
        val array531 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n741 = 1
        val array532 = arrayOfNulls<IIngredient>(3)
        val n742 = 0
        val item640 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap640 = HashMap<String, IData>()
        hashMap640["meta"] = ExpandInt.toData(134)
        array532[n742] = item640.withTag(ExpandAnyDict.asData(hashMap640))
        array532[2] = null.also { array532[1] = it }
        array531[n741] = array532
        array531[2] = arrayOf(null, null, null)
        recipes234.addShaped(withTag196, array531, null)
        val recipes235 = MineTweakerAPI.recipes
        val item641 = ItemBracketHandler.getItem("ExtraTrees:door", 135)
        val hashMap641 = HashMap<String, IData>()
        hashMap641["meta"] = ExpandInt.toData(135)
        recipes235.addShaped(item641.withTag(ExpandAnyDict.asData(hashMap641)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 7), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                ItemBracketHandler.getItem("Forestry:planks", 7), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        run3()
    }

    private fun run3() {
        val recipes62 = MineTweakerAPI.recipes
        val item147 = ItemBracketHandler.getItem("ExtraTrees:door", 295)
        val hashMap147 = HashMap<String, IData>()
        hashMap147["meta"] = ExpandInt.toData(295)
        val withTag38 = item147.withTag(ExpandAnyDict.asData(hashMap147))
        val array107: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n155 = 0
        val array108 = arrayOf<IIngredient?>(null, null, null)
        val n156 = 1
        val item148 = ItemBracketHandler.getItem("ExtraTrees:door", 39)
        val hashMap148 = HashMap<String, IData>()
        hashMap148["meta"] = ExpandInt.toData(39)
        array108[n156] = item148.withTag(ExpandAnyDict.asData(hashMap148))
        array108[2] = null
        array107[n155] = array108
        array107[1] = arrayOf(null, null, null)
        array107[2] = arrayOf(null, null, null)
        recipes62.addShaped(withTag38, array107, null)
        val recipes63 = MineTweakerAPI.recipes
        val item149 = ItemBracketHandler.getItem("ExtraTrees:door", 551)
        val hashMap149 = HashMap<String, IData>()
        hashMap149["meta"] = ExpandInt.toData(551)
        val withTag39 = item149.withTag(ExpandAnyDict.asData(hashMap149))
        val array109: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n157 = 0
        val array110 = arrayOf<IIngredient?>(null, null, null)
        val n158 = 2
        val item150 = ItemBracketHandler.getItem("ExtraTrees:door", 39)
        val hashMap150 = HashMap<String, IData>()
        hashMap150["meta"] = ExpandInt.toData(39)
        array110[n158] = item150.withTag(ExpandAnyDict.asData(hashMap150))
        array109[n157] = array110
        array109[1] = arrayOf(null, null, null)
        array109[2] = arrayOf(null, null, null)
        recipes63.addShaped(withTag39, array109, null)
        val recipes64 = MineTweakerAPI.recipes
        val item151 = ItemBracketHandler.getItem("ExtraTrees:door", 807)
        val hashMap151 = HashMap<String, IData>()
        hashMap151["meta"] = ExpandInt.toData(807)
        val withTag40 = item151.withTag(ExpandAnyDict.asData(hashMap151))
        val array111 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n159 = 1
        val array112 = arrayOfNulls<IIngredient>(3)
        val n160 = 0
        val item152 = ItemBracketHandler.getItem("ExtraTrees:door", 39)
        val hashMap152 = HashMap<String, IData>()
        hashMap152["meta"] = ExpandInt.toData(39)
        array112[n160] = item152.withTag(ExpandAnyDict.asData(hashMap152))
        array112[2] = null.also { array112[1] = it }
        array111[n159] = array112
        array111[2] = arrayOf(null, null, null)
        recipes64.addShaped(withTag40, array111, null)
        val recipes65 = MineTweakerAPI.recipes
        val item153 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap153 = HashMap<String, IData>()
        hashMap153["meta"] = ExpandInt.toData(40)
        val withTag41 = item153.withTag(ExpandAnyDict.asData(hashMap153))
        val array113: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n161 = 0
        val array114 = arrayOfNulls<IIngredient>(3)
        val n162 = 0
        val item154 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap154 = HashMap<String, IData>()
        hashMap154["meta"] = ExpandInt.toData(8)
        array114[n162] = item154.withTag(ExpandAnyDict.asData(hashMap154))
        array114[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array114[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array113[n161] = array114
        val n163 = 1
        val array115 = arrayOfNulls<IIngredient>(3)
        val n164 = 0
        val item155 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap155 = HashMap<String, IData>()
        hashMap155["meta"] = ExpandInt.toData(8)
        array115[n164] = item155.withTag(ExpandAnyDict.asData(hashMap155))
        array115[1] = OreBracketHandler.getOre("ringAnyIron")
        array115[2] = OreBracketHandler.getOre("screwAnyIron")
        array113[n163] = array115
        val n165 = 2
        val array116 = arrayOfNulls<IIngredient>(3)
        val n166 = 0
        val item156 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap156 = HashMap<String, IData>()
        hashMap156["meta"] = ExpandInt.toData(8)
        array116[n166] = item156.withTag(ExpandAnyDict.asData(hashMap156))
        val n167 = 1
        val item157 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap157 = HashMap<String, IData>()
        hashMap157["meta"] = ExpandInt.toData(8)
        array116[n167] = item157.withTag(ExpandAnyDict.asData(hashMap157))
        array116[2] = OreBracketHandler.getOre("craftingToolSaw")
        array113[n165] = array116
        recipes65.addShaped(withTag41, array113, null)
        val recipes66 = MineTweakerAPI.recipes
        val item158 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap158 = HashMap<String, IData>()
        hashMap158["meta"] = ExpandInt.toData(40)
        val withTag42 = item158.withTag(ExpandAnyDict.asData(hashMap158))
        val array117: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n168 = 0
        val array118 = arrayOfNulls<IIngredient>(3)
        val n169 = 0
        val item159 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap159 = HashMap<String, IData>()
        hashMap159["meta"] = ExpandInt.toData(8)
        array118[n169] = item159.withTag(ExpandAnyDict.asData(hashMap159))
        array118[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array118[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array117[n168] = array118
        val n170 = 1
        val array119 = arrayOfNulls<IIngredient>(3)
        val n171 = 0
        val item160 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap160 = HashMap<String, IData>()
        hashMap160["meta"] = ExpandInt.toData(8)
        array119[n171] = item160.withTag(ExpandAnyDict.asData(hashMap160))
        array119[1] = OreBracketHandler.getOre("ringCopper")
        array119[2] = OreBracketHandler.getOre("screwCopper")
        array117[n170] = array119
        val n172 = 2
        val array120 = arrayOfNulls<IIngredient>(3)
        val n173 = 0
        val item161 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap161 = HashMap<String, IData>()
        hashMap161["meta"] = ExpandInt.toData(8)
        array120[n173] = item161.withTag(ExpandAnyDict.asData(hashMap161))
        val n174 = 1
        val item162 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap162 = HashMap<String, IData>()
        hashMap162["meta"] = ExpandInt.toData(8)
        array120[n174] = item162.withTag(ExpandAnyDict.asData(hashMap162))
        array120[2] = OreBracketHandler.getOre("craftingToolSaw")
        array117[n172] = array120
        recipes66.addShaped(withTag42, array117, null)
        val recipes67 = MineTweakerAPI.recipes
        val item163 = ItemBracketHandler.getItem("ExtraTrees:door", 296)
        val hashMap163 = HashMap<String, IData>()
        hashMap163["meta"] = ExpandInt.toData(296)
        val withTag43 = item163.withTag(ExpandAnyDict.asData(hashMap163))
        val array121: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n175 = 0
        val array122 = arrayOf<IIngredient?>(null, null, null)
        val n176 = 1
        val item164 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap164 = HashMap<String, IData>()
        hashMap164["meta"] = ExpandInt.toData(40)
        array122[n176] = item164.withTag(ExpandAnyDict.asData(hashMap164))
        array122[2] = null
        array121[n175] = array122
        array121[1] = arrayOf(null, null, null)
        array121[2] = arrayOf(null, null, null)
        recipes67.addShaped(withTag43, array121, null)
        val recipes68 = MineTweakerAPI.recipes
        val item165 = ItemBracketHandler.getItem("ExtraTrees:door", 552)
        val hashMap165 = HashMap<String, IData>()
        hashMap165["meta"] = ExpandInt.toData(552)
        val withTag44 = item165.withTag(ExpandAnyDict.asData(hashMap165))
        val array123: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n177 = 0
        val array124 = arrayOf<IIngredient?>(null, null, null)
        val n178 = 2
        val item166 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap166 = HashMap<String, IData>()
        hashMap166["meta"] = ExpandInt.toData(40)
        array124[n178] = item166.withTag(ExpandAnyDict.asData(hashMap166))
        array123[n177] = array124
        array123[1] = arrayOf(null, null, null)
        array123[2] = arrayOf(null, null, null)
        recipes68.addShaped(withTag44, array123, null)
        val recipes69 = MineTweakerAPI.recipes
        val item167 = ItemBracketHandler.getItem("ExtraTrees:door", 808)
        val hashMap167 = HashMap<String, IData>()
        hashMap167["meta"] = ExpandInt.toData(808)
        val withTag45 = item167.withTag(ExpandAnyDict.asData(hashMap167))
        val array125 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n179 = 1
        val array126 = arrayOfNulls<IIngredient>(3)
        val n180 = 0
        val item168 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap168 = HashMap<String, IData>()
        hashMap168["meta"] = ExpandInt.toData(40)
        array126[n180] = item168.withTag(ExpandAnyDict.asData(hashMap168))
        array126[2] = null.also { array126[1] = it }
        array125[n179] = array126
        array125[2] = arrayOf(null, null, null)
        recipes69.addShaped(withTag45, array125, null)
        val recipes70 = MineTweakerAPI.recipes
        val item169 = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap169 = HashMap<String, IData>()
        hashMap169["meta"] = ExpandInt.toData(41)
        val withTag46 = item169.withTag(ExpandAnyDict.asData(hashMap169))
        val array127: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n181 = 0
        val array128 = arrayOfNulls<IIngredient>(3)
        val n182 = 0
        val item170 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap170 = HashMap<String, IData>()
        hashMap170["meta"] = ExpandInt.toData(9)
        array128[n182] = item170.withTag(ExpandAnyDict.asData(hashMap170))
        array128[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array128[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array127[n181] = array128
        val n183 = 1
        val array129 = arrayOfNulls<IIngredient>(3)
        val n184 = 0
        val item171 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap171 = HashMap<String, IData>()
        hashMap171["meta"] = ExpandInt.toData(9)
        array129[n184] = item171.withTag(ExpandAnyDict.asData(hashMap171))
        array129[1] = OreBracketHandler.getOre("ringAnyIron")
        array129[2] = OreBracketHandler.getOre("screwAnyIron")
        array127[n183] = array129
        val n185 = 2
        val array130 = arrayOfNulls<IIngredient>(3)
        val n186 = 0
        val item172 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap172 = HashMap<String, IData>()
        hashMap172["meta"] = ExpandInt.toData(9)
        array130[n186] = item172.withTag(ExpandAnyDict.asData(hashMap172))
        val n187 = 1
        val item173 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap173 = HashMap<String, IData>()
        hashMap173["meta"] = ExpandInt.toData(9)
        array130[n187] = item173.withTag(ExpandAnyDict.asData(hashMap173))
        array130[2] = OreBracketHandler.getOre("craftingToolSaw")
        array127[n185] = array130
        recipes70.addShaped(withTag46, array127, null)
        val recipes71 = MineTweakerAPI.recipes
        val item174 = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap174 = HashMap<String, IData>()
        hashMap174["meta"] = ExpandInt.toData(41)
        val withTag47 = item174.withTag(ExpandAnyDict.asData(hashMap174))
        val array131: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n188 = 0
        val array132 = arrayOfNulls<IIngredient>(3)
        val n189 = 0
        val item175 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap175 = HashMap<String, IData>()
        hashMap175["meta"] = ExpandInt.toData(9)
        array132[n189] = item175.withTag(ExpandAnyDict.asData(hashMap175))
        array132[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array132[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array131[n188] = array132
        val n190 = 1
        val array133 = arrayOfNulls<IIngredient>(3)
        val n191 = 0
        val item176 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap176 = HashMap<String, IData>()
        hashMap176["meta"] = ExpandInt.toData(9)
        array133[n191] = item176.withTag(ExpandAnyDict.asData(hashMap176))
        array133[1] = OreBracketHandler.getOre("ringCopper")
        array133[2] = OreBracketHandler.getOre("screwCopper")
        array131[n190] = array133
        val n192 = 2
        val array134 = arrayOfNulls<IIngredient>(3)
        val n193 = 0
        val item177 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap177 = HashMap<String, IData>()
        hashMap177["meta"] = ExpandInt.toData(9)
        array134[n193] = item177.withTag(ExpandAnyDict.asData(hashMap177))
        val n194 = 1
        val item178 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap178 = HashMap<String, IData>()
        hashMap178["meta"] = ExpandInt.toData(9)
        array134[n194] = item178.withTag(ExpandAnyDict.asData(hashMap178))
        array134[2] = OreBracketHandler.getOre("craftingToolSaw")
        array131[n192] = array134
        recipes71.addShaped(withTag47, array131, null)
        val recipes72 = MineTweakerAPI.recipes
        val item179 = ItemBracketHandler.getItem("ExtraTrees:door", 297)
        val hashMap179 = HashMap<String, IData>()
        hashMap179["meta"] = ExpandInt.toData(297)
        val withTag48 = item179.withTag(ExpandAnyDict.asData(hashMap179))
        val array135: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n195 = 0
        val array136 = arrayOf<IIngredient?>(null, null, null)
        val n196 = 1
        val item180 = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap180 = HashMap<String, IData>()
        hashMap180["meta"] = ExpandInt.toData(41)
        array136[n196] = item180.withTag(ExpandAnyDict.asData(hashMap180))
        array136[2] = null
        array135[n195] = array136
        array135[1] = arrayOf(null, null, null)
        array135[2] = arrayOf(null, null, null)
        recipes72.addShaped(withTag48, array135, null)
        val recipes73 = MineTweakerAPI.recipes
        val item181 = ItemBracketHandler.getItem("ExtraTrees:door", 553)
        val hashMap181 = HashMap<String, IData>()
        hashMap181["meta"] = ExpandInt.toData(553)
        val withTag49 = item181.withTag(ExpandAnyDict.asData(hashMap181))
        val array137: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n197 = 0
        val array138 = arrayOf<IIngredient?>(null, null, null)
        val n198 = 2
        val item182 = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap182 = HashMap<String, IData>()
        hashMap182["meta"] = ExpandInt.toData(41)
        array138[n198] = item182.withTag(ExpandAnyDict.asData(hashMap182))
        array137[n197] = array138
        array137[1] = arrayOf(null, null, null)
        array137[2] = arrayOf(null, null, null)
        recipes73.addShaped(withTag49, array137, null)
        val recipes74 = MineTweakerAPI.recipes
        val item183 = ItemBracketHandler.getItem("ExtraTrees:door", 809)
        val hashMap183 = HashMap<String, IData>()
        hashMap183["meta"] = ExpandInt.toData(809)
        val withTag50 = item183.withTag(ExpandAnyDict.asData(hashMap183))
        val array139 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n199 = 1
        val array140 = arrayOfNulls<IIngredient>(3)
        val n200 = 0
        val item184 = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap184 = HashMap<String, IData>()
        hashMap184["meta"] = ExpandInt.toData(41)
        array140[n200] = item184.withTag(ExpandAnyDict.asData(hashMap184))
        array140[2] = null.also { array140[1] = it }
        array139[n199] = array140
        array139[2] = arrayOf(null, null, null)
        recipes74.addShaped(withTag50, array139, null)
        val recipes75 = MineTweakerAPI.recipes
        val item185 = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap185 = HashMap<String, IData>()
        hashMap185["meta"] = ExpandInt.toData(42)
        val withTag51 = item185.withTag(ExpandAnyDict.asData(hashMap185))
        val array141: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n201 = 0
        val array142 = arrayOfNulls<IIngredient>(3)
        val n202 = 0
        val item186 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap186 = HashMap<String, IData>()
        hashMap186["meta"] = ExpandInt.toData(10)
        array142[n202] = item186.withTag(ExpandAnyDict.asData(hashMap186))
        array142[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array142[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array141[n201] = array142
        val n203 = 1
        val array143 = arrayOfNulls<IIngredient>(3)
        val n204 = 0
        val item187 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap187 = HashMap<String, IData>()
        hashMap187["meta"] = ExpandInt.toData(10)
        array143[n204] = item187.withTag(ExpandAnyDict.asData(hashMap187))
        array143[1] = OreBracketHandler.getOre("ringAnyIron")
        array143[2] = OreBracketHandler.getOre("screwAnyIron")
        array141[n203] = array143
        val n205 = 2
        val array144 = arrayOfNulls<IIngredient>(3)
        val n206 = 0
        val item188 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap188 = HashMap<String, IData>()
        hashMap188["meta"] = ExpandInt.toData(10)
        array144[n206] = item188.withTag(ExpandAnyDict.asData(hashMap188))
        val n207 = 1
        val item189 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap189 = HashMap<String, IData>()
        hashMap189["meta"] = ExpandInt.toData(10)
        array144[n207] = item189.withTag(ExpandAnyDict.asData(hashMap189))
        array144[2] = OreBracketHandler.getOre("craftingToolSaw")
        array141[n205] = array144
        recipes75.addShaped(withTag51, array141, null)
        val recipes76 = MineTweakerAPI.recipes
        val item190 = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap190 = HashMap<String, IData>()
        hashMap190["meta"] = ExpandInt.toData(42)
        val withTag52 = item190.withTag(ExpandAnyDict.asData(hashMap190))
        val array145: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n208 = 0
        val array146 = arrayOfNulls<IIngredient>(3)
        val n209 = 0
        val item191 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap191 = HashMap<String, IData>()
        hashMap191["meta"] = ExpandInt.toData(10)
        array146[n209] = item191.withTag(ExpandAnyDict.asData(hashMap191))
        array146[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array146[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array145[n208] = array146
        val n210 = 1
        val array147 = arrayOfNulls<IIngredient>(3)
        val n211 = 0
        val item192 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap192 = HashMap<String, IData>()
        hashMap192["meta"] = ExpandInt.toData(10)
        array147[n211] = item192.withTag(ExpandAnyDict.asData(hashMap192))
        array147[1] = OreBracketHandler.getOre("ringCopper")
        array147[2] = OreBracketHandler.getOre("screwCopper")
        array145[n210] = array147
        val n212 = 2
        val array148 = arrayOfNulls<IIngredient>(3)
        val n213 = 0
        val item193 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap193 = HashMap<String, IData>()
        hashMap193["meta"] = ExpandInt.toData(10)
        array148[n213] = item193.withTag(ExpandAnyDict.asData(hashMap193))
        val n214 = 1
        val item194 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap194 = HashMap<String, IData>()
        hashMap194["meta"] = ExpandInt.toData(10)
        array148[n214] = item194.withTag(ExpandAnyDict.asData(hashMap194))
        array148[2] = OreBracketHandler.getOre("craftingToolSaw")
        array145[n212] = array148
        recipes76.addShaped(withTag52, array145, null)
        val recipes77 = MineTweakerAPI.recipes
        val item195 = ItemBracketHandler.getItem("ExtraTrees:door", 298)
        val hashMap195 = HashMap<String, IData>()
        hashMap195["meta"] = ExpandInt.toData(298)
        val withTag53 = item195.withTag(ExpandAnyDict.asData(hashMap195))
        val array149: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n215 = 0
        val array150 = arrayOf<IIngredient?>(null, null, null)
        val n216 = 1
        val item196 = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap196 = HashMap<String, IData>()
        hashMap196["meta"] = ExpandInt.toData(42)
        array150[n216] = item196.withTag(ExpandAnyDict.asData(hashMap196))
        array150[2] = null
        array149[n215] = array150
        array149[1] = arrayOf(null, null, null)
        array149[2] = arrayOf(null, null, null)
        recipes77.addShaped(withTag53, array149, null)
        val recipes78 = MineTweakerAPI.recipes
        val item197 = ItemBracketHandler.getItem("ExtraTrees:door", 554)
        val hashMap197 = HashMap<String, IData>()
        hashMap197["meta"] = ExpandInt.toData(554)
        val withTag54 = item197.withTag(ExpandAnyDict.asData(hashMap197))
        val array151: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n217 = 0
        val array152 = arrayOf<IIngredient?>(null, null, null)
        val n218 = 2
        val item198 = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap198 = HashMap<String, IData>()
        hashMap198["meta"] = ExpandInt.toData(42)
        array152[n218] = item198.withTag(ExpandAnyDict.asData(hashMap198))
        array151[n217] = array152
        array151[1] = arrayOf(null, null, null)
        array151[2] = arrayOf(null, null, null)
        recipes78.addShaped(withTag54, array151, null)
        val recipes79 = MineTweakerAPI.recipes
        val item199 = ItemBracketHandler.getItem("ExtraTrees:door", 810)
        val hashMap199 = HashMap<String, IData>()
        hashMap199["meta"] = ExpandInt.toData(810)
        val withTag55 = item199.withTag(ExpandAnyDict.asData(hashMap199))
        val array153 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n219 = 1
        val array154 = arrayOfNulls<IIngredient>(3)
        val n220 = 0
        val item200 = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap200 = HashMap<String, IData>()
        hashMap200["meta"] = ExpandInt.toData(42)
        array154[n220] = item200.withTag(ExpandAnyDict.asData(hashMap200))
        array154[2] = null.also { array154[1] = it }
        array153[n219] = array154
        array153[2] = arrayOf(null, null, null)
        recipes79.addShaped(withTag55, array153, null)
        val recipes80 = MineTweakerAPI.recipes
        val item201 = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap201 = HashMap<String, IData>()
        hashMap201["meta"] = ExpandInt.toData(43)
        val withTag56 = item201.withTag(ExpandAnyDict.asData(hashMap201))
        val array155: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n221 = 0
        val array156 = arrayOfNulls<IIngredient>(3)
        val n222 = 0
        val item202 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap202 = HashMap<String, IData>()
        hashMap202["meta"] = ExpandInt.toData(11)
        array156[n222] = item202.withTag(ExpandAnyDict.asData(hashMap202))
        array156[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array156[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array155[n221] = array156
        val n223 = 1
        val array157 = arrayOfNulls<IIngredient>(3)
        val n224 = 0
        val item203 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap203 = HashMap<String, IData>()
        hashMap203["meta"] = ExpandInt.toData(11)
        array157[n224] = item203.withTag(ExpandAnyDict.asData(hashMap203))
        array157[1] = OreBracketHandler.getOre("ringAnyIron")
        array157[2] = OreBracketHandler.getOre("screwAnyIron")
        array155[n223] = array157
        val n225 = 2
        val array158 = arrayOfNulls<IIngredient>(3)
        val n226 = 0
        val item204 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap204 = HashMap<String, IData>()
        hashMap204["meta"] = ExpandInt.toData(11)
        array158[n226] = item204.withTag(ExpandAnyDict.asData(hashMap204))
        val n227 = 1
        val item205 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap205 = HashMap<String, IData>()
        hashMap205["meta"] = ExpandInt.toData(11)
        array158[n227] = item205.withTag(ExpandAnyDict.asData(hashMap205))
        array158[2] = OreBracketHandler.getOre("craftingToolSaw")
        array155[n225] = array158
        recipes80.addShaped(withTag56, array155, null)
        val recipes81 = MineTweakerAPI.recipes
        val item206 = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap206 = HashMap<String, IData>()
        hashMap206["meta"] = ExpandInt.toData(43)
        val withTag57 = item206.withTag(ExpandAnyDict.asData(hashMap206))
        val array159: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n228 = 0
        val array160 = arrayOfNulls<IIngredient>(3)
        val n229 = 0
        val item207 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap207 = HashMap<String, IData>()
        hashMap207["meta"] = ExpandInt.toData(11)
        array160[n229] = item207.withTag(ExpandAnyDict.asData(hashMap207))
        array160[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array160[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array159[n228] = array160
        val n230 = 1
        val array161 = arrayOfNulls<IIngredient>(3)
        val n231 = 0
        val item208 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap208 = HashMap<String, IData>()
        hashMap208["meta"] = ExpandInt.toData(11)
        array161[n231] = item208.withTag(ExpandAnyDict.asData(hashMap208))
        array161[1] = OreBracketHandler.getOre("ringCopper")
        array161[2] = OreBracketHandler.getOre("screwCopper")
        array159[n230] = array161
        val n232 = 2
        val array162 = arrayOfNulls<IIngredient>(3)
        val n233 = 0
        val item209 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap209 = HashMap<String, IData>()
        hashMap209["meta"] = ExpandInt.toData(11)
        array162[n233] = item209.withTag(ExpandAnyDict.asData(hashMap209))
        val n234 = 1
        val item210 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap210 = HashMap<String, IData>()
        hashMap210["meta"] = ExpandInt.toData(11)
        array162[n234] = item210.withTag(ExpandAnyDict.asData(hashMap210))
        array162[2] = OreBracketHandler.getOre("craftingToolSaw")
        array159[n232] = array162
        recipes81.addShaped(withTag57, array159, null)
        val recipes82 = MineTweakerAPI.recipes
        val item211 = ItemBracketHandler.getItem("ExtraTrees:door", 299)
        val hashMap211 = HashMap<String, IData>()
        hashMap211["meta"] = ExpandInt.toData(299)
        val withTag58 = item211.withTag(ExpandAnyDict.asData(hashMap211))
        val array163: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n235 = 0
        val array164 = arrayOf<IIngredient?>(null, null, null)
        val n236 = 1
        val item212 = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap212 = HashMap<String, IData>()
        hashMap212["meta"] = ExpandInt.toData(43)
        array164[n236] = item212.withTag(ExpandAnyDict.asData(hashMap212))
        array164[2] = null
        array163[n235] = array164
        array163[1] = arrayOf(null, null, null)
        array163[2] = arrayOf(null, null, null)
        recipes82.addShaped(withTag58, array163, null)
        val recipes83 = MineTweakerAPI.recipes
        val item213 = ItemBracketHandler.getItem("ExtraTrees:door", 555)
        val hashMap213 = HashMap<String, IData>()
        hashMap213["meta"] = ExpandInt.toData(555)
        val withTag59 = item213.withTag(ExpandAnyDict.asData(hashMap213))
        val array165: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n237 = 0
        val array166 = arrayOf<IIngredient?>(null, null, null)
        val n238 = 2
        val item214 = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap214 = HashMap<String, IData>()
        hashMap214["meta"] = ExpandInt.toData(43)
        array166[n238] = item214.withTag(ExpandAnyDict.asData(hashMap214))
        array165[n237] = array166
        array165[1] = arrayOf(null, null, null)
        array165[2] = arrayOf(null, null, null)
        recipes83.addShaped(withTag59, array165, null)
        val recipes84 = MineTweakerAPI.recipes
        val item215 = ItemBracketHandler.getItem("ExtraTrees:door", 811)
        val hashMap215 = HashMap<String, IData>()
        hashMap215["meta"] = ExpandInt.toData(811)
        val withTag60 = item215.withTag(ExpandAnyDict.asData(hashMap215))
        val array167 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n239 = 1
        val array168 = arrayOfNulls<IIngredient>(3)
        val n240 = 0
        val item216 = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap216 = HashMap<String, IData>()
        hashMap216["meta"] = ExpandInt.toData(43)
        array168[n240] = item216.withTag(ExpandAnyDict.asData(hashMap216))
        array168[2] = null.also { array168[1] = it }
        array167[n239] = array168
        array167[2] = arrayOf(null, null, null)
        recipes84.addShaped(withTag60, array167, null)
        val recipes85 = MineTweakerAPI.recipes
        val item217 = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap217 = HashMap<String, IData>()
        hashMap217["meta"] = ExpandInt.toData(44)
        val withTag61 = item217.withTag(ExpandAnyDict.asData(hashMap217))
        val array169: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n241 = 0
        val array170 = arrayOfNulls<IIngredient>(3)
        val n242 = 0
        val item218 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap218 = HashMap<String, IData>()
        hashMap218["meta"] = ExpandInt.toData(12)
        array170[n242] = item218.withTag(ExpandAnyDict.asData(hashMap218))
        array170[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array170[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array169[n241] = array170
        val n243 = 1
        val array171 = arrayOfNulls<IIngredient>(3)
        val n244 = 0
        val item219 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap219 = HashMap<String, IData>()
        hashMap219["meta"] = ExpandInt.toData(12)
        array171[n244] = item219.withTag(ExpandAnyDict.asData(hashMap219))
        array171[1] = OreBracketHandler.getOre("ringAnyIron")
        array171[2] = OreBracketHandler.getOre("screwAnyIron")
        array169[n243] = array171
        val n245 = 2
        val array172 = arrayOfNulls<IIngredient>(3)
        val n246 = 0
        val item220 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap220 = HashMap<String, IData>()
        hashMap220["meta"] = ExpandInt.toData(12)
        array172[n246] = item220.withTag(ExpandAnyDict.asData(hashMap220))
        val n247 = 1
        val item221 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap221 = HashMap<String, IData>()
        hashMap221["meta"] = ExpandInt.toData(12)
        array172[n247] = item221.withTag(ExpandAnyDict.asData(hashMap221))
        array172[2] = OreBracketHandler.getOre("craftingToolSaw")
        array169[n245] = array172
        recipes85.addShaped(withTag61, array169, null)
        val recipes86 = MineTweakerAPI.recipes
        val item222 = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap222 = HashMap<String, IData>()
        hashMap222["meta"] = ExpandInt.toData(44)
        val withTag62 = item222.withTag(ExpandAnyDict.asData(hashMap222))
        val array173: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n248 = 0
        val array174 = arrayOfNulls<IIngredient>(3)
        val n249 = 0
        val item223 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap223 = HashMap<String, IData>()
        hashMap223["meta"] = ExpandInt.toData(12)
        array174[n249] = item223.withTag(ExpandAnyDict.asData(hashMap223))
        array174[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array174[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array173[n248] = array174
        val n250 = 1
        val array175 = arrayOfNulls<IIngredient>(3)
        val n251 = 0
        val item224 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap224 = HashMap<String, IData>()
        hashMap224["meta"] = ExpandInt.toData(12)
        array175[n251] = item224.withTag(ExpandAnyDict.asData(hashMap224))
        array175[1] = OreBracketHandler.getOre("ringCopper")
        array175[2] = OreBracketHandler.getOre("screwCopper")
        array173[n250] = array175
        val n252 = 2
        val array176 = arrayOfNulls<IIngredient>(3)
        val n253 = 0
        val item225 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap225 = HashMap<String, IData>()
        hashMap225["meta"] = ExpandInt.toData(12)
        array176[n253] = item225.withTag(ExpandAnyDict.asData(hashMap225))
        val n254 = 1
        val item226 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap226 = HashMap<String, IData>()
        hashMap226["meta"] = ExpandInt.toData(12)
        array176[n254] = item226.withTag(ExpandAnyDict.asData(hashMap226))
        array176[2] = OreBracketHandler.getOre("craftingToolSaw")
        array173[n252] = array176
        recipes86.addShaped(withTag62, array173, null)
        val recipes87 = MineTweakerAPI.recipes
        val item227 = ItemBracketHandler.getItem("ExtraTrees:door", 300)
        val hashMap227 = HashMap<String, IData>()
        hashMap227["meta"] = ExpandInt.toData(300)
        val withTag63 = item227.withTag(ExpandAnyDict.asData(hashMap227))
        val array177: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n255 = 0
        val array178 = arrayOf<IIngredient?>(null, null, null)
        val n256 = 1
        val item228 = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap228 = HashMap<String, IData>()
        hashMap228["meta"] = ExpandInt.toData(44)
        array178[n256] = item228.withTag(ExpandAnyDict.asData(hashMap228))
        array178[2] = null
        array177[n255] = array178
        array177[1] = arrayOf(null, null, null)
        array177[2] = arrayOf(null, null, null)
        recipes87.addShaped(withTag63, array177, null)
        val recipes88 = MineTweakerAPI.recipes
        val item229 = ItemBracketHandler.getItem("ExtraTrees:door", 556)
        val hashMap229 = HashMap<String, IData>()
        hashMap229["meta"] = ExpandInt.toData(556)
        val withTag64 = item229.withTag(ExpandAnyDict.asData(hashMap229))
        val array179: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n257 = 0
        val array180 = arrayOf<IIngredient?>(null, null, null)
        val n258 = 2
        val item230 = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap230 = HashMap<String, IData>()
        hashMap230["meta"] = ExpandInt.toData(44)
        array180[n258] = item230.withTag(ExpandAnyDict.asData(hashMap230))
        array179[n257] = array180
        array179[1] = arrayOf(null, null, null)
        array179[2] = arrayOf(null, null, null)
        recipes88.addShaped(withTag64, array179, null)
        val recipes89 = MineTweakerAPI.recipes
        val item231 = ItemBracketHandler.getItem("ExtraTrees:door", 812)
        val hashMap231 = HashMap<String, IData>()
        hashMap231["meta"] = ExpandInt.toData(812)
        val withTag65 = item231.withTag(ExpandAnyDict.asData(hashMap231))
        val array181 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n259 = 1
        val array182 = arrayOfNulls<IIngredient>(3)
        val n260 = 0
        val item232 = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap232 = HashMap<String, IData>()
        hashMap232["meta"] = ExpandInt.toData(44)
        array182[n260] = item232.withTag(ExpandAnyDict.asData(hashMap232))
        array182[2] = null.also { array182[1] = it }
        array181[n259] = array182
        array181[2] = arrayOf(null, null, null)
        recipes89.addShaped(withTag65, array181, null)
        val recipes90 = MineTweakerAPI.recipes
        val item233 = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap233 = HashMap<String, IData>()
        hashMap233["meta"] = ExpandInt.toData(45)
        val withTag66 = item233.withTag(ExpandAnyDict.asData(hashMap233))
        val array183: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n261 = 0
        val array184 = arrayOfNulls<IIngredient>(3)
        val n262 = 0
        val item234 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap234 = HashMap<String, IData>()
        hashMap234["meta"] = ExpandInt.toData(13)
        array184[n262] = item234.withTag(ExpandAnyDict.asData(hashMap234))
        array184[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array184[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array183[n261] = array184
        val n263 = 1
        val array185 = arrayOfNulls<IIngredient>(3)
        val n264 = 0
        val item235 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap235 = HashMap<String, IData>()
        hashMap235["meta"] = ExpandInt.toData(13)
        array185[n264] = item235.withTag(ExpandAnyDict.asData(hashMap235))
        array185[1] = OreBracketHandler.getOre("ringAnyIron")
        array185[2] = OreBracketHandler.getOre("screwAnyIron")
        array183[n263] = array185
        val n265 = 2
        val array186 = arrayOfNulls<IIngredient>(3)
        val n266 = 0
        val item236 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap236 = HashMap<String, IData>()
        hashMap236["meta"] = ExpandInt.toData(12)
        array186[n266] = item236.withTag(ExpandAnyDict.asData(hashMap236))
        val n267 = 1
        val item237 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap237 = HashMap<String, IData>()
        hashMap237["meta"] = ExpandInt.toData(13)
        array186[n267] = item237.withTag(ExpandAnyDict.asData(hashMap237))
        array186[2] = OreBracketHandler.getOre("craftingToolSaw")
        array183[n265] = array186
        recipes90.addShaped(withTag66, array183, null)
        val recipes91 = MineTweakerAPI.recipes
        val item238 = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap238 = HashMap<String, IData>()
        hashMap238["meta"] = ExpandInt.toData(45)
        val withTag67 = item238.withTag(ExpandAnyDict.asData(hashMap238))
        val array187: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n268 = 0
        val array188 = arrayOfNulls<IIngredient>(3)
        val n269 = 0
        val item239 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap239 = HashMap<String, IData>()
        hashMap239["meta"] = ExpandInt.toData(13)
        array188[n269] = item239.withTag(ExpandAnyDict.asData(hashMap239))
        array188[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array188[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array187[n268] = array188
        val n270 = 1
        val array189 = arrayOfNulls<IIngredient>(3)
        val n271 = 0
        val item240 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap240 = HashMap<String, IData>()
        hashMap240["meta"] = ExpandInt.toData(13)
        array189[n271] = item240.withTag(ExpandAnyDict.asData(hashMap240))
        array189[1] = OreBracketHandler.getOre("ringCopper")
        array189[2] = OreBracketHandler.getOre("screwCopper")
        array187[n270] = array189
        val n272 = 2
        val array190 = arrayOfNulls<IIngredient>(3)
        val n273 = 0
        val item241 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap241 = HashMap<String, IData>()
        hashMap241["meta"] = ExpandInt.toData(13)
        array190[n273] = item241.withTag(ExpandAnyDict.asData(hashMap241))
        val n274 = 1
        val item242 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap242 = HashMap<String, IData>()
        hashMap242["meta"] = ExpandInt.toData(13)
        array190[n274] = item242.withTag(ExpandAnyDict.asData(hashMap242))
        array190[2] = OreBracketHandler.getOre("craftingToolSaw")
        array187[n272] = array190
        recipes91.addShaped(withTag67, array187, null)
        val recipes92 = MineTweakerAPI.recipes
        val item243 = ItemBracketHandler.getItem("ExtraTrees:door", 301)
        val hashMap243 = HashMap<String, IData>()
        hashMap243["meta"] = ExpandInt.toData(301)
        val withTag68 = item243.withTag(ExpandAnyDict.asData(hashMap243))
        val array191: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n275 = 0
        val array192 = arrayOf<IIngredient?>(null, null, null)
        val n276 = 1
        val item244 = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap244 = HashMap<String, IData>()
        hashMap244["meta"] = ExpandInt.toData(45)
        array192[n276] = item244.withTag(ExpandAnyDict.asData(hashMap244))
        array192[2] = null
        array191[n275] = array192
        array191[1] = arrayOf(null, null, null)
        array191[2] = arrayOf(null, null, null)
        recipes92.addShaped(withTag68, array191, null)
        val recipes93 = MineTweakerAPI.recipes
        val item245 = ItemBracketHandler.getItem("ExtraTrees:door", 557)
        val hashMap245 = HashMap<String, IData>()
        hashMap245["meta"] = ExpandInt.toData(557)
        val withTag69 = item245.withTag(ExpandAnyDict.asData(hashMap245))
        val array193: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n277 = 0
        val array194 = arrayOf<IIngredient?>(null, null, null)
        val n278 = 2
        val item246 = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap246 = HashMap<String, IData>()
        hashMap246["meta"] = ExpandInt.toData(45)
        array194[n278] = item246.withTag(ExpandAnyDict.asData(hashMap246))
        array193[n277] = array194
        array193[1] = arrayOf(null, null, null)
        array193[2] = arrayOf(null, null, null)
        recipes93.addShaped(withTag69, array193, null)
        val recipes94 = MineTweakerAPI.recipes
        val item247 = ItemBracketHandler.getItem("ExtraTrees:door", 813)
        val hashMap247 = HashMap<String, IData>()
        hashMap247["meta"] = ExpandInt.toData(813)
        val withTag70 = item247.withTag(ExpandAnyDict.asData(hashMap247))
        val array195 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n279 = 1
        val array196 = arrayOfNulls<IIngredient>(3)
        val n280 = 0
        val item248 = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap248 = HashMap<String, IData>()
        hashMap248["meta"] = ExpandInt.toData(45)
        array196[n280] = item248.withTag(ExpandAnyDict.asData(hashMap248))
        array196[2] = null.also { array196[1] = it }
        array195[n279] = array196
        array195[2] = arrayOf(null, null, null)
        recipes94.addShaped(withTag70, array195, null)
        val recipes95 = MineTweakerAPI.recipes
        val item249 = ItemBracketHandler.getItem("ExtraTrees:door", 46)
        val hashMap249 = HashMap<String, IData>()
        hashMap249["meta"] = ExpandInt.toData(46)
        val withTag71 = item249.withTag(ExpandAnyDict.asData(hashMap249))
        val array197: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n281 = 0
        val array198 = arrayOfNulls<IIngredient>(3)
        val n282 = 0
        val item250 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap250 = HashMap<String, IData>()
        hashMap250["meta"] = ExpandInt.toData(14)
        array198[n282] = item250.withTag(ExpandAnyDict.asData(hashMap250))
        array198[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array198[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array197[n281] = array198
        val n283 = 1
        val array199 = arrayOfNulls<IIngredient>(3)
        val n284 = 0
        val item251 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap251 = HashMap<String, IData>()
        hashMap251["meta"] = ExpandInt.toData(14)
        array199[n284] = item251.withTag(ExpandAnyDict.asData(hashMap251))
        array199[1] = OreBracketHandler.getOre("ringAnyIron")
        array199[2] = OreBracketHandler.getOre("screwAnyIron")
        array197[n283] = array199
        val n285 = 2
        val array200 = arrayOfNulls<IIngredient>(3)
        val n286 = 0
        val item252 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap252 = HashMap<String, IData>()
        hashMap252["meta"] = ExpandInt.toData(14)
        array200[n286] = item252.withTag(ExpandAnyDict.asData(hashMap252))
        val n287 = 1
        val item253 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap253 = HashMap<String, IData>()
        hashMap253["meta"] = ExpandInt.toData(14)
        array200[n287] = item253.withTag(ExpandAnyDict.asData(hashMap253))
        array200[2] = OreBracketHandler.getOre("craftingToolSaw")
        array197[n285] = array200
        recipes95.addShaped(withTag71, array197, null)
        val recipes96 = MineTweakerAPI.recipes
        val item254 = ItemBracketHandler.getItem("ExtraTrees:door", 46)
        val hashMap254 = HashMap<String, IData>()
        hashMap254["meta"] = ExpandInt.toData(46)
        val withTag72 = item254.withTag(ExpandAnyDict.asData(hashMap254))
        val array201: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n288 = 0
        val array202 = arrayOfNulls<IIngredient>(3)
        val n289 = 0
        val item255 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap255 = HashMap<String, IData>()
        hashMap255["meta"] = ExpandInt.toData(14)
        array202[n289] = item255.withTag(ExpandAnyDict.asData(hashMap255))
        array202[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array202[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array201[n288] = array202
        val n290 = 1
        val array203 = arrayOfNulls<IIngredient>(3)
        val n291 = 0
        val item256 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap256 = HashMap<String, IData>()
        hashMap256["meta"] = ExpandInt.toData(14)
        array203[n291] = item256.withTag(ExpandAnyDict.asData(hashMap256))
        array203[1] = OreBracketHandler.getOre("ringCopper")
        array203[2] = OreBracketHandler.getOre("screwCopper")
        array201[n290] = array203
        val n292 = 2
        val array204 = arrayOfNulls<IIngredient>(3)
        val n293 = 0
        val item257 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap257 = HashMap<String, IData>()
        hashMap257["meta"] = ExpandInt.toData(14)
        array204[n293] = item257.withTag(ExpandAnyDict.asData(hashMap257))
        val n294 = 1
        val item258 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap258 = HashMap<String, IData>()
        hashMap258["meta"] = ExpandInt.toData(14)
        array204[n294] = item258.withTag(ExpandAnyDict.asData(hashMap258))
        array204[2] = OreBracketHandler.getOre("craftingToolSaw")
        array201[n292] = array204
        recipes96.addShaped(withTag72, array201, null)
    }

    override fun run() {
        val recipes236 = MineTweakerAPI.recipes
        val item642 = ItemBracketHandler.getItem("ExtraTrees:door", 135)
        val hashMap642 = HashMap<String, IData>()
        hashMap642["meta"] = ExpandInt.toData(135)
        recipes236.addShaped(item642.withTag(ExpandAnyDict.asData(hashMap642)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 7), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                ItemBracketHandler.getItem("Forestry:planks", 7), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes237 = MineTweakerAPI.recipes
        val item643 = ItemBracketHandler.getItem("ExtraTrees:door", 391)
        val hashMap643 = HashMap<String, IData>()
        hashMap643["meta"] = ExpandInt.toData(391)
        val withTag197 = item643.withTag(ExpandAnyDict.asData(hashMap643))
        val array533: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n743 = 0
        val array534 = arrayOf<IIngredient?>(null, null, null)
        val n744 = 1
        val item644 = ItemBracketHandler.getItem("ExtraTrees:door", 135)
        val hashMap644 = HashMap<String, IData>()
        hashMap644["meta"] = ExpandInt.toData(135)
        array534[n744] = item644.withTag(ExpandAnyDict.asData(hashMap644))
        array534[2] = null
        array533[n743] = array534
        array533[1] = arrayOf(null, null, null)
        array533[2] = arrayOf(null, null, null)
        recipes237.addShaped(withTag197, array533, null)
        val recipes238 = MineTweakerAPI.recipes
        val item645 = ItemBracketHandler.getItem("ExtraTrees:door", 647)
        val hashMap645 = HashMap<String, IData>()
        hashMap645["meta"] = ExpandInt.toData(647)
        val withTag198 = item645.withTag(ExpandAnyDict.asData(hashMap645))
        val array535: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n745 = 0
        val array536 = arrayOf<IIngredient?>(null, null, null)
        val n746 = 2
        val item646 = ItemBracketHandler.getItem("ExtraTrees:door", 135)
        val hashMap646 = HashMap<String, IData>()
        hashMap646["meta"] = ExpandInt.toData(135)
        array536[n746] = item646.withTag(ExpandAnyDict.asData(hashMap646))
        array535[n745] = array536
        array535[1] = arrayOf(null, null, null)
        array535[2] = arrayOf(null, null, null)
        recipes238.addShaped(withTag198, array535, null)
        val recipes239 = MineTweakerAPI.recipes
        val item647 = ItemBracketHandler.getItem("ExtraTrees:door", 903)
        val hashMap647 = HashMap<String, IData>()
        hashMap647["meta"] = ExpandInt.toData(903)
        val withTag199 = item647.withTag(ExpandAnyDict.asData(hashMap647))
        val array537 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n747 = 1
        val array538 = arrayOfNulls<IIngredient>(3)
        val n748 = 0
        val item648 = ItemBracketHandler.getItem("ExtraTrees:door", 135)
        val hashMap648 = HashMap<String, IData>()
        hashMap648["meta"] = ExpandInt.toData(135)
        array538[n748] = item648.withTag(ExpandAnyDict.asData(hashMap648))
        array538[2] = null.also { array538[1] = it }
        array537[n747] = array538
        array537[2] = arrayOf(null, null, null)
        recipes239.addShaped(withTag199, array537, null)
        val recipes240 = MineTweakerAPI.recipes
        val item649 = ItemBracketHandler.getItem("ExtraTrees:door", 136)
        val hashMap649 = HashMap<String, IData>()
        hashMap649["meta"] = ExpandInt.toData(136)
        recipes240.addShaped(item649.withTag(ExpandAnyDict.asData(hashMap649)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 8), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                ItemBracketHandler.getItem("Forestry:planks", 8), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes241 = MineTweakerAPI.recipes
        val item650 = ItemBracketHandler.getItem("ExtraTrees:door", 136)
        val hashMap650 = HashMap<String, IData>()
        hashMap650["meta"] = ExpandInt.toData(136)
        recipes241.addShaped(item650.withTag(ExpandAnyDict.asData(hashMap650)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 8), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                ItemBracketHandler.getItem("Forestry:planks", 8), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes242 = MineTweakerAPI.recipes
        val item651 = ItemBracketHandler.getItem("ExtraTrees:door", 392)
        val hashMap651 = HashMap<String, IData>()
        hashMap651["meta"] = ExpandInt.toData(392)
        val withTag200 = item651.withTag(ExpandAnyDict.asData(hashMap651))
        val array539: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n749 = 0
        val array540 = arrayOf<IIngredient?>(null, null, null)
        val n750 = 1
        val item652 = ItemBracketHandler.getItem("ExtraTrees:door", 136)
        val hashMap652 = HashMap<String, IData>()
        hashMap652["meta"] = ExpandInt.toData(136)
        array540[n750] = item652.withTag(ExpandAnyDict.asData(hashMap652))
        array540[2] = null
        array539[n749] = array540
        array539[1] = arrayOf(null, null, null)
        array539[2] = arrayOf(null, null, null)
        recipes242.addShaped(withTag200, array539, null)
        val recipes243 = MineTweakerAPI.recipes
        val item653 = ItemBracketHandler.getItem("ExtraTrees:door", 648)
        val hashMap653 = HashMap<String, IData>()
        hashMap653["meta"] = ExpandInt.toData(648)
        val withTag201 = item653.withTag(ExpandAnyDict.asData(hashMap653))
        val array541: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n751 = 0
        val array542 = arrayOf<IIngredient?>(null, null, null)
        val n752 = 2
        val item654 = ItemBracketHandler.getItem("ExtraTrees:door", 136)
        val hashMap654 = HashMap<String, IData>()
        hashMap654["meta"] = ExpandInt.toData(136)
        array542[n752] = item654.withTag(ExpandAnyDict.asData(hashMap654))
        array541[n751] = array542
        array541[1] = arrayOf(null, null, null)
        array541[2] = arrayOf(null, null, null)
        recipes243.addShaped(withTag201, array541, null)
        val recipes244 = MineTweakerAPI.recipes
        val item655 = ItemBracketHandler.getItem("ExtraTrees:door", 904)
        val hashMap655 = HashMap<String, IData>()
        hashMap655["meta"] = ExpandInt.toData(904)
        val withTag202 = item655.withTag(ExpandAnyDict.asData(hashMap655))
        val array543 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n753 = 1
        val array544 = arrayOfNulls<IIngredient>(3)
        val n754 = 0
        val item656 = ItemBracketHandler.getItem("ExtraTrees:door", 136)
        val hashMap656 = HashMap<String, IData>()
        hashMap656["meta"] = ExpandInt.toData(136)
        array544[n754] = item656.withTag(ExpandAnyDict.asData(hashMap656))
        array544[2] = null.also { array544[1] = it }
        array543[n753] = array544
        array543[2] = arrayOf(null, null, null)
        recipes244.addShaped(withTag202, array543, null)
        val recipes245 = MineTweakerAPI.recipes
        val item657 = ItemBracketHandler.getItem("ExtraTrees:door", 137)
        val hashMap657 = HashMap<String, IData>()
        hashMap657["meta"] = ExpandInt.toData(137)
        recipes245.addShaped(item657.withTag(ExpandAnyDict.asData(hashMap657)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 9), OreBracketHandler.getOre("ringAnyIron"), OreBracketHandler.getOre(
                        "screwAnyIron")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                ItemBracketHandler.getItem("Forestry:planks", 9), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes246 = MineTweakerAPI.recipes
        val item658 = ItemBracketHandler.getItem("ExtraTrees:door", 137)
        val hashMap658 = HashMap<String, IData>()
        hashMap658["meta"] = ExpandInt.toData(137)
        recipes246.addShaped(item658.withTag(ExpandAnyDict.asData(hashMap658)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                        ItemBracketHandler.getItem("minecraft" +
                                ":trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem(
                        "Forestry:planks", 9), OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre(
                        "screwCopper")), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                ItemBracketHandler.getItem("Forestry:planks", 9), OreBracketHandler.getOre(
                "craftingToolSaw"))), null)
        val recipes247 = MineTweakerAPI.recipes
        val item659 = ItemBracketHandler.getItem("ExtraTrees:door", 393)
        val hashMap659 = HashMap<String, IData>()
        hashMap659["meta"] = ExpandInt.toData(393)
        val withTag203 = item659.withTag(ExpandAnyDict.asData(hashMap659))
        val array545: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n755 = 0
        val array546 = arrayOf<IIngredient?>(null, null, null)
        val n756 = 1
        val item660 = ItemBracketHandler.getItem("ExtraTrees:door", 137)
        val hashMap660 = HashMap<String, IData>()
        hashMap660["meta"] = ExpandInt.toData(137)
        array546[n756] = item660.withTag(ExpandAnyDict.asData(hashMap660))
        array546[2] = null
        array545[n755] = array546
        array545[1] = arrayOf(null, null, null)
        array545[2] = arrayOf(null, null, null)
        recipes247.addShaped(withTag203, array545, null)
        val recipes248 = MineTweakerAPI.recipes
        val item661 = ItemBracketHandler.getItem("ExtraTrees:door", 649)
        val hashMap661 = HashMap<String, IData>()
        hashMap661["meta"] = ExpandInt.toData(649)
        val withTag204 = item661.withTag(ExpandAnyDict.asData(hashMap661))
        val array547: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n757 = 0
        val array548 = arrayOf<IIngredient?>(null, null, null)
        val n758 = 2
        val item662 = ItemBracketHandler.getItem("ExtraTrees:door", 137)
        val hashMap662 = HashMap<String, IData>()
        hashMap662["meta"] = ExpandInt.toData(137)
        array548[n758] = item662.withTag(ExpandAnyDict.asData(hashMap662))
        array547[n757] = array548
        array547[1] = arrayOf(null, null, null)
        array547[2] = arrayOf(null, null, null)
        recipes248.addShaped(withTag204, array547, null)
        val recipes249 = MineTweakerAPI.recipes
        val item663 = ItemBracketHandler.getItem("ExtraTrees:door", 905)
        val hashMap663 = HashMap<String, IData>()
        hashMap663["meta"] = ExpandInt.toData(905)
        val withTag205 = item663.withTag(ExpandAnyDict.asData(hashMap663))
        val array549 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n759 = 1
        val array550 = arrayOfNulls<IIngredient>(3)
        val n760 = 0
        val item664 = ItemBracketHandler.getItem("ExtraTrees:door", 137)
        val hashMap664 = HashMap<String, IData>()
        hashMap664["meta"] = ExpandInt.toData(137)
        array550[n760] = item664.withTag(ExpandAnyDict.asData(hashMap664))
        array550[2] = null.also { array550[1] = it }
        array549[n759] = array550
        array549[2] = arrayOf(null, null, null)
        recipes249.addShaped(withTag205, array549, null)
        val recipes250 = MineTweakerAPI.recipes
        val item665 = ItemBracketHandler.getItem("ExtraTrees:door", 138)
        val hashMap665 = HashMap<String, IData>()
        hashMap665["meta"] = ExpandInt.toData(138)
        recipes250.addShaped(item665.withTag(ExpandAnyDict.asData(hashMap665)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                        ItemBracketHandler.getItem("Forestry:planks", 10),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes251 = MineTweakerAPI.recipes
        val item666 = ItemBracketHandler.getItem("ExtraTrees:door", 138)
        val hashMap666 = HashMap<String, IData>()
        hashMap666["meta"] = ExpandInt.toData(138)
        recipes251.addShaped(item666.withTag(ExpandAnyDict.asData(hashMap666)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                        ItemBracketHandler.getItem("Forestry:planks", 10),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes252 = MineTweakerAPI.recipes
        val item667 = ItemBracketHandler.getItem("ExtraTrees:door", 394)
        val hashMap667 = HashMap<String, IData>()
        hashMap667["meta"] = ExpandInt.toData(394)
        val withTag206 = item667.withTag(ExpandAnyDict.asData(hashMap667))
        val array551: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n761 = 0
        val array552 = arrayOf<IIngredient?>(null, null, null)
        val n762 = 1
        val item668 = ItemBracketHandler.getItem("ExtraTrees:door", 138)
        val hashMap668 = HashMap<String, IData>()
        hashMap668["meta"] = ExpandInt.toData(138)
        array552[n762] = item668.withTag(ExpandAnyDict.asData(hashMap668))
        array552[2] = null
        array551[n761] = array552
        array551[1] = arrayOf(null, null, null)
        array551[2] = arrayOf(null, null, null)
        recipes252.addShaped(withTag206, array551, null)
        val recipes253 = MineTweakerAPI.recipes
        val item669 = ItemBracketHandler.getItem("ExtraTrees:door", 650)
        val hashMap669 = HashMap<String, IData>()
        hashMap669["meta"] = ExpandInt.toData(650)
        val withTag207 = item669.withTag(ExpandAnyDict.asData(hashMap669))
        val array553: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n763 = 0
        val array554 = arrayOf<IIngredient?>(null, null, null)
        val n764 = 2
        val item670 = ItemBracketHandler.getItem("ExtraTrees:door", 138)
        val hashMap670 = HashMap<String, IData>()
        hashMap670["meta"] = ExpandInt.toData(138)
        array554[n764] = item670.withTag(ExpandAnyDict.asData(hashMap670))
        array553[n763] = array554
        array553[1] = arrayOf(null, null, null)
        array553[2] = arrayOf(null, null, null)
        recipes253.addShaped(withTag207, array553, null)
        val recipes254 = MineTweakerAPI.recipes
        val item671 = ItemBracketHandler.getItem("ExtraTrees:door", 906)
        val hashMap671 = HashMap<String, IData>()
        hashMap671["meta"] = ExpandInt.toData(906)
        val withTag208 = item671.withTag(ExpandAnyDict.asData(hashMap671))
        val array555 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n765 = 1
        val array556 = arrayOfNulls<IIngredient>(3)
        val n766 = 0
        val item672 = ItemBracketHandler.getItem("ExtraTrees:door", 138)
        val hashMap672 = HashMap<String, IData>()
        hashMap672["meta"] = ExpandInt.toData(138)
        array556[n766] = item672.withTag(ExpandAnyDict.asData(hashMap672))
        array556[2] = null.also { array556[1] = it }
        array555[n765] = array556
        array555[2] = arrayOf(null, null, null)
        recipes254.addShaped(withTag208, array555, null)
        val recipes255 = MineTweakerAPI.recipes
        val item673 = ItemBracketHandler.getItem("ExtraTrees:door", 139)
        val hashMap673 = HashMap<String, IData>()
        hashMap673["meta"] = ExpandInt.toData(139)
        recipes255.addShaped(item673.withTag(ExpandAnyDict.asData(hashMap673)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                        ItemBracketHandler.getItem("Forestry:planks", 11),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes256 = MineTweakerAPI.recipes
        val item674 = ItemBracketHandler.getItem("ExtraTrees:door", 139)
        val hashMap674 = HashMap<String, IData>()
        hashMap674["meta"] = ExpandInt.toData(139)
        recipes256.addShaped(item674.withTag(ExpandAnyDict.asData(hashMap674)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                        ItemBracketHandler.getItem("Forestry:planks", 11),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes257 = MineTweakerAPI.recipes
        val item675 = ItemBracketHandler.getItem("ExtraTrees:door", 395)
        val hashMap675 = HashMap<String, IData>()
        hashMap675["meta"] = ExpandInt.toData(395)
        val withTag209 = item675.withTag(ExpandAnyDict.asData(hashMap675))
        val array557: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n767 = 0
        val array558 = arrayOf<IIngredient?>(null, null, null)
        val n768 = 1
        val item676 = ItemBracketHandler.getItem("ExtraTrees:door", 139)
        val hashMap676 = HashMap<String, IData>()
        hashMap676["meta"] = ExpandInt.toData(139)
        array558[n768] = item676.withTag(ExpandAnyDict.asData(hashMap676))
        array558[2] = null
        array557[n767] = array558
        array557[1] = arrayOf(null, null, null)
        array557[2] = arrayOf(null, null, null)
        recipes257.addShaped(withTag209, array557, null)
        val recipes258 = MineTweakerAPI.recipes
        val item677 = ItemBracketHandler.getItem("ExtraTrees:door", 651)
        val hashMap677 = HashMap<String, IData>()
        hashMap677["meta"] = ExpandInt.toData(651)
        val withTag210 = item677.withTag(ExpandAnyDict.asData(hashMap677))
        val array559: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n769 = 0
        val array560 = arrayOf<IIngredient?>(null, null, null)
        val n770 = 2
        val item678 = ItemBracketHandler.getItem("ExtraTrees:door", 139)
        val hashMap678 = HashMap<String, IData>()
        hashMap678["meta"] = ExpandInt.toData(139)
        array560[n770] = item678.withTag(ExpandAnyDict.asData(hashMap678))
        array559[n769] = array560
        array559[1] = arrayOf(null, null, null)
        array559[2] = arrayOf(null, null, null)
        recipes258.addShaped(withTag210, array559, null)
        val recipes259 = MineTweakerAPI.recipes
        val item679 = ItemBracketHandler.getItem("ExtraTrees:door", 907)
        val hashMap679 = HashMap<String, IData>()
        hashMap679["meta"] = ExpandInt.toData(907)
        val withTag211 = item679.withTag(ExpandAnyDict.asData(hashMap679))
        val array561 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n771 = 1
        val array562 = arrayOfNulls<IIngredient>(3)
        val n772 = 0
        val item680 = ItemBracketHandler.getItem("ExtraTrees:door", 139)
        val hashMap680 = HashMap<String, IData>()
        hashMap680["meta"] = ExpandInt.toData(139)
        array562[n772] = item680.withTag(ExpandAnyDict.asData(hashMap680))
        array562[2] = null.also { array562[1] = it }
        array561[n771] = array562
        array561[2] = arrayOf(null, null, null)
        recipes259.addShaped(withTag211, array561, null)
        val recipes260 = MineTweakerAPI.recipes
        val item681 = ItemBracketHandler.getItem("ExtraTrees:door", 140)
        val hashMap681 = HashMap<String, IData>()
        hashMap681["meta"] = ExpandInt.toData(140)
        recipes260.addShaped(item681.withTag(ExpandAnyDict.asData(hashMap681)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                        ItemBracketHandler.getItem("Forestry:planks", 12),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes261 = MineTweakerAPI.recipes
        val item682 = ItemBracketHandler.getItem("ExtraTrees:door", 140)
        val hashMap682 = HashMap<String, IData>()
        hashMap682["meta"] = ExpandInt.toData(140)
        recipes261.addShaped(item682.withTag(ExpandAnyDict.asData(hashMap682)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                        ItemBracketHandler.getItem("Forestry:planks", 12),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes262 = MineTweakerAPI.recipes
        val item683 = ItemBracketHandler.getItem("ExtraTrees:door", 396)
        val hashMap683 = HashMap<String, IData>()
        hashMap683["meta"] = ExpandInt.toData(396)
        val withTag212 = item683.withTag(ExpandAnyDict.asData(hashMap683))
        val array563: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n773 = 0
        val array564 = arrayOf<IIngredient?>(null, null, null)
        val n774 = 1
        val item684 = ItemBracketHandler.getItem("ExtraTrees:door", 140)
        val hashMap684 = HashMap<String, IData>()
        hashMap684["meta"] = ExpandInt.toData(140)
        array564[n774] = item684.withTag(ExpandAnyDict.asData(hashMap684))
        array564[2] = null
        array563[n773] = array564
        array563[1] = arrayOf(null, null, null)
        array563[2] = arrayOf(null, null, null)
        recipes262.addShaped(withTag212, array563, null)
        val recipes263 = MineTweakerAPI.recipes
        val item685 = ItemBracketHandler.getItem("ExtraTrees:door", 652)
        val hashMap685 = HashMap<String, IData>()
        hashMap685["meta"] = ExpandInt.toData(652)
        val withTag213 = item685.withTag(ExpandAnyDict.asData(hashMap685))
        val array565: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n775 = 0
        val array566 = arrayOf<IIngredient?>(null, null, null)
        val n776 = 2
        val item686 = ItemBracketHandler.getItem("ExtraTrees:door", 140)
        val hashMap686 = HashMap<String, IData>()
        hashMap686["meta"] = ExpandInt.toData(140)
        array566[n776] = item686.withTag(ExpandAnyDict.asData(hashMap686))
        array565[n775] = array566
        array565[1] = arrayOf(null, null, null)
        array565[2] = arrayOf(null, null, null)
        recipes263.addShaped(withTag213, array565, null)
        val recipes264 = MineTweakerAPI.recipes
        val item687 = ItemBracketHandler.getItem("ExtraTrees:door", 908)
        val hashMap687 = HashMap<String, IData>()
        hashMap687["meta"] = ExpandInt.toData(908)
        val withTag214 = item687.withTag(ExpandAnyDict.asData(hashMap687))
        val array567 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n777 = 1
        val array568 = arrayOfNulls<IIngredient>(3)
        val n778 = 0
        val item688 = ItemBracketHandler.getItem("ExtraTrees:door", 140)
        val hashMap688 = HashMap<String, IData>()
        hashMap688["meta"] = ExpandInt.toData(140)
        array568[n778] = item688.withTag(ExpandAnyDict.asData(hashMap688))
        array568[2] = null.also { array568[1] = it }
        array567[n777] = array568
        array567[2] = arrayOf(null, null, null)
        recipes264.addShaped(withTag214, array567, null)
        val recipes265 = MineTweakerAPI.recipes
        val item689 = ItemBracketHandler.getItem("ExtraTrees:door", 141)
        val hashMap689 = HashMap<String, IData>()
        hashMap689["meta"] = ExpandInt.toData(141)
        recipes265.addShaped(item689.withTag(ExpandAnyDict.asData(hashMap689)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                        ItemBracketHandler.getItem("Forestry:planks", 13),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes266 = MineTweakerAPI.recipes
        val item690 = ItemBracketHandler.getItem("ExtraTrees:door", 141)
        val hashMap690 = HashMap<String, IData>()
        hashMap690["meta"] = ExpandInt.toData(141)
        recipes266.addShaped(item690.withTag(ExpandAnyDict.asData(hashMap690)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                        ItemBracketHandler.getItem("Forestry:planks", 13),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes267 = MineTweakerAPI.recipes
        val item691 = ItemBracketHandler.getItem("ExtraTrees:door", 397)
        val hashMap691 = HashMap<String, IData>()
        hashMap691["meta"] = ExpandInt.toData(397)
        val withTag215 = item691.withTag(ExpandAnyDict.asData(hashMap691))
        val array569: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n779 = 0
        val array570 = arrayOf<IIngredient?>(null, null, null)
        val n780 = 1
        val item692 = ItemBracketHandler.getItem("ExtraTrees:door", 141)
        val hashMap692 = HashMap<String, IData>()
        hashMap692["meta"] = ExpandInt.toData(141)
        array570[n780] = item692.withTag(ExpandAnyDict.asData(hashMap692))
        array570[2] = null
        array569[n779] = array570
        array569[1] = arrayOf(null, null, null)
        array569[2] = arrayOf(null, null, null)
        recipes267.addShaped(withTag215, array569, null)
        val recipes268 = MineTweakerAPI.recipes
        val item693 = ItemBracketHandler.getItem("ExtraTrees:door", 653)
        val hashMap693 = HashMap<String, IData>()
        hashMap693["meta"] = ExpandInt.toData(653)
        val withTag216 = item693.withTag(ExpandAnyDict.asData(hashMap693))
        val array571: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n781 = 0
        val array572 = arrayOf<IIngredient?>(null, null, null)
        val n782 = 2
        val item694 = ItemBracketHandler.getItem("ExtraTrees:door", 141)
        val hashMap694 = HashMap<String, IData>()
        hashMap694["meta"] = ExpandInt.toData(141)
        array572[n782] = item694.withTag(ExpandAnyDict.asData(hashMap694))
        array571[n781] = array572
        array571[1] = arrayOf(null, null, null)
        array571[2] = arrayOf(null, null, null)
        recipes268.addShaped(withTag216, array571, null)
        val recipes269 = MineTweakerAPI.recipes
        val item695 = ItemBracketHandler.getItem("ExtraTrees:door", 909)
        val hashMap695 = HashMap<String, IData>()
        hashMap695["meta"] = ExpandInt.toData(909)
        val withTag217 = item695.withTag(ExpandAnyDict.asData(hashMap695))
        val array573 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n783 = 1
        val array574 = arrayOfNulls<IIngredient>(3)
        val n784 = 0
        val item696 = ItemBracketHandler.getItem("ExtraTrees:door", 141)
        val hashMap696 = HashMap<String, IData>()
        hashMap696["meta"] = ExpandInt.toData(141)
        array574[n784] = item696.withTag(ExpandAnyDict.asData(hashMap696))
        array574[2] = null.also { array574[1] = it }
        array573[n783] = array574
        array573[2] = arrayOf(null, null, null)
        recipes269.addShaped(withTag217, array573, null)
        val recipes270 = MineTweakerAPI.recipes
        val item697 = ItemBracketHandler.getItem("ExtraTrees:door", 142)
        val hashMap697 = HashMap<String, IData>()
        hashMap697["meta"] = ExpandInt.toData(142)
        recipes270.addShaped(item697.withTag(ExpandAnyDict.asData(hashMap697)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                        ItemBracketHandler.getItem("Forestry:planks", 14),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes271 = MineTweakerAPI.recipes
        val item698 = ItemBracketHandler.getItem("ExtraTrees:door", 142)
        val hashMap698 = HashMap<String, IData>()
        hashMap698["meta"] = ExpandInt.toData(142)
        recipes271.addShaped(item698.withTag(ExpandAnyDict.asData(hashMap698)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                        ItemBracketHandler.getItem("Forestry:planks", 14),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes272 = MineTweakerAPI.recipes
        val item699 = ItemBracketHandler.getItem("ExtraTrees:door", 398)
        val hashMap699 = HashMap<String, IData>()
        hashMap699["meta"] = ExpandInt.toData(398)
        val withTag218 = item699.withTag(ExpandAnyDict.asData(hashMap699))
        val array575: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n785 = 0
        val array576 = arrayOf<IIngredient?>(null, null, null)
        val n786 = 1
        val item700 = ItemBracketHandler.getItem("ExtraTrees:door", 142)
        val hashMap700 = HashMap<String, IData>()
        hashMap700["meta"] = ExpandInt.toData(142)
        array576[n786] = item700.withTag(ExpandAnyDict.asData(hashMap700))
        array576[2] = null
        array575[n785] = array576
        array575[1] = arrayOf(null, null, null)
        array575[2] = arrayOf(null, null, null)
        recipes272.addShaped(withTag218, array575, null)
        val recipes273 = MineTweakerAPI.recipes
        val item701 = ItemBracketHandler.getItem("ExtraTrees:door", 654)
        val hashMap701 = HashMap<String, IData>()
        hashMap701["meta"] = ExpandInt.toData(654)
        val withTag219 = item701.withTag(ExpandAnyDict.asData(hashMap701))
        val array577: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n787 = 0
        val array578 = arrayOf<IIngredient?>(null, null, null)
        val n788 = 2
        val item702 = ItemBracketHandler.getItem("ExtraTrees:door", 142)
        val hashMap702 = HashMap<String, IData>()
        hashMap702["meta"] = ExpandInt.toData(142)
        array578[n788] = item702.withTag(ExpandAnyDict.asData(hashMap702))
        array577[n787] = array578
        array577[1] = arrayOf(null, null, null)
        array577[2] = arrayOf(null, null, null)
        recipes273.addShaped(withTag219, array577, null)
        val recipes274 = MineTweakerAPI.recipes
        val item703 = ItemBracketHandler.getItem("ExtraTrees:door", 910)
        val hashMap703 = HashMap<String, IData>()
        hashMap703["meta"] = ExpandInt.toData(910)
        val withTag220 = item703.withTag(ExpandAnyDict.asData(hashMap703))
        val array579 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n789 = 1
        val array580 = arrayOfNulls<IIngredient>(3)
        val n790 = 0
        val item704 = ItemBracketHandler.getItem("ExtraTrees:door", 142)
        val hashMap704 = HashMap<String, IData>()
        hashMap704["meta"] = ExpandInt.toData(142)
        array580[n790] = item704.withTag(ExpandAnyDict.asData(hashMap704))
        array580[2] = null.also { array580[1] = it }
        array579[n789] = array580
        array579[2] = arrayOf(null, null, null)
        recipes274.addShaped(withTag220, array579, null)
        val recipes275 = MineTweakerAPI.recipes
        val item705 = ItemBracketHandler.getItem("ExtraTrees:door", 143)
        val hashMap705 = HashMap<String, IData>()
        hashMap705["meta"] = ExpandInt.toData(143)
        recipes275.addShaped(item705.withTag(ExpandAnyDict.asData(hashMap705)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                        ItemBracketHandler.getItem("Forestry:planks", 15),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes276 = MineTweakerAPI.recipes
        val item706 = ItemBracketHandler.getItem("ExtraTrees:door", 143)
        val hashMap706 = HashMap<String, IData>()
        hashMap706["meta"] = ExpandInt.toData(143)
        recipes276.addShaped(item706.withTag(ExpandAnyDict.asData(hashMap706)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                        ItemBracketHandler.getItem("Forestry:planks", 15),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes277 = MineTweakerAPI.recipes
        val item707 = ItemBracketHandler.getItem("ExtraTrees:door", 399)
        val hashMap707 = HashMap<String, IData>()
        hashMap707["meta"] = ExpandInt.toData(399)
        val withTag221 = item707.withTag(ExpandAnyDict.asData(hashMap707))
        val array581: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n791 = 0
        val array582 = arrayOf<IIngredient?>(null, null, null)
        val n792 = 1
        val item708 = ItemBracketHandler.getItem("ExtraTrees:door", 143)
        val hashMap708 = HashMap<String, IData>()
        hashMap708["meta"] = ExpandInt.toData(143)
        array582[n792] = item708.withTag(ExpandAnyDict.asData(hashMap708))
        array582[2] = null
        array581[n791] = array582
        array581[1] = arrayOf(null, null, null)
        array581[2] = arrayOf(null, null, null)
        recipes277.addShaped(withTag221, array581, null)
        val recipes278 = MineTweakerAPI.recipes
        val item709 = ItemBracketHandler.getItem("ExtraTrees:door", 655)
        val hashMap709 = HashMap<String, IData>()
        hashMap709["meta"] = ExpandInt.toData(655)
        val withTag222 = item709.withTag(ExpandAnyDict.asData(hashMap709))
        val array583: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n793 = 0
        val array584 = arrayOf<IIngredient?>(null, null, null)
        val n794 = 2
        val item710 = ItemBracketHandler.getItem("ExtraTrees:door", 143)
        val hashMap710 = HashMap<String, IData>()
        hashMap710["meta"] = ExpandInt.toData(143)
        array584[n794] = item710.withTag(ExpandAnyDict.asData(hashMap710))
        array583[n793] = array584
        array583[1] = arrayOf(null, null, null)
        array583[2] = arrayOf(null, null, null)
        recipes278.addShaped(withTag222, array583, null)
        val recipes279 = MineTweakerAPI.recipes
        val item711 = ItemBracketHandler.getItem("ExtraTrees:door", 911)
        val hashMap711 = HashMap<String, IData>()
        hashMap711["meta"] = ExpandInt.toData(911)
        val withTag223 = item711.withTag(ExpandAnyDict.asData(hashMap711))
        val array585 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n795 = 1
        val array586 = arrayOfNulls<IIngredient>(3)
        val n796 = 0
        val item712 = ItemBracketHandler.getItem("ExtraTrees:door", 143)
        val hashMap712 = HashMap<String, IData>()
        hashMap712["meta"] = ExpandInt.toData(143)
        array586[n796] = item712.withTag(ExpandAnyDict.asData(hashMap712))
        array586[2] = null.also { array586[1] = it }
        array585[n795] = array586
        array585[2] = arrayOf(null, null, null)
        recipes279.addShaped(withTag223, array585, null)
        val recipes280 = MineTweakerAPI.recipes
        val item713 = ItemBracketHandler.getItem("ExtraTrees:door", 144)
        val hashMap713 = HashMap<String, IData>()
        hashMap713["meta"] = ExpandInt.toData(144)
        recipes280.addShaped(item713.withTag(ExpandAnyDict.asData(hashMap713)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                        ItemBracketHandler.getItem("Forestry:planks", 16),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes281 = MineTweakerAPI.recipes
        val item714 = ItemBracketHandler.getItem("ExtraTrees:door", 144)
        val hashMap714 = HashMap<String, IData>()
        hashMap714["meta"] = ExpandInt.toData(144)
        recipes281.addShaped(item714.withTag(ExpandAnyDict.asData(hashMap714)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                        ItemBracketHandler.getItem("Forestry:planks", 16),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes282 = MineTweakerAPI.recipes
        val item715 = ItemBracketHandler.getItem("ExtraTrees:door", 400)
        val hashMap715 = HashMap<String, IData>()
        hashMap715["meta"] = ExpandInt.toData(400)
        val withTag224 = item715.withTag(ExpandAnyDict.asData(hashMap715))
        val array587: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n797 = 0
        val array588 = arrayOf<IIngredient?>(null, null, null)
        val n798 = 1
        val item716 = ItemBracketHandler.getItem("ExtraTrees:door", 144)
        val hashMap716 = HashMap<String, IData>()
        hashMap716["meta"] = ExpandInt.toData(144)
        array588[n798] = item716.withTag(ExpandAnyDict.asData(hashMap716))
        array588[2] = null
        array587[n797] = array588
        array587[1] = arrayOf(null, null, null)
        array587[2] = arrayOf(null, null, null)
        recipes282.addShaped(withTag224, array587, null)
        val recipes283 = MineTweakerAPI.recipes
        val item717 = ItemBracketHandler.getItem("ExtraTrees:door", 656)
        val hashMap717 = HashMap<String, IData>()
        hashMap717["meta"] = ExpandInt.toData(656)
        val withTag225 = item717.withTag(ExpandAnyDict.asData(hashMap717))
        val array589: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n799 = 0
        val array590 = arrayOf<IIngredient?>(null, null, null)
        val n800 = 2
        val item718 = ItemBracketHandler.getItem("ExtraTrees:door", 144)
        val hashMap718 = HashMap<String, IData>()
        hashMap718["meta"] = ExpandInt.toData(144)
        array590[n800] = item718.withTag(ExpandAnyDict.asData(hashMap718))
        array589[n799] = array590
        array589[1] = arrayOf(null, null, null)
        array589[2] = arrayOf(null, null, null)
        recipes283.addShaped(withTag225, array589, null)
        val recipes284 = MineTweakerAPI.recipes
        val item719 = ItemBracketHandler.getItem("ExtraTrees:door", 912)
        val hashMap719 = HashMap<String, IData>()
        hashMap719["meta"] = ExpandInt.toData(912)
        val withTag226 = item719.withTag(ExpandAnyDict.asData(hashMap719))
        val array591 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n801 = 1
        val array592 = arrayOfNulls<IIngredient>(3)
        val n802 = 0
        val item720 = ItemBracketHandler.getItem("ExtraTrees:door", 144)
        val hashMap720 = HashMap<String, IData>()
        hashMap720["meta"] = ExpandInt.toData(144)
        array592[n802] = item720.withTag(ExpandAnyDict.asData(hashMap720))
        array592[2] = null.also { array592[1] = it }
        array591[n801] = array592
        array591[2] = arrayOf(null, null, null)
        recipes284.addShaped(withTag226, array591, null)
        val recipes285 = MineTweakerAPI.recipes
        val item721 = ItemBracketHandler.getItem("ExtraTrees:door", 145)
        val hashMap721 = HashMap<String, IData>()
        hashMap721["meta"] = ExpandInt.toData(145)
        recipes285.addShaped(item721.withTag(ExpandAnyDict.asData(hashMap721)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                        ItemBracketHandler.getItem("Forestry:planks", 17),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes286 = MineTweakerAPI.recipes
        val item722 = ItemBracketHandler.getItem("ExtraTrees:door", 145)
        val hashMap722 = HashMap<String, IData>()
        hashMap722["meta"] = ExpandInt.toData(145)
        recipes286.addShaped(item722.withTag(ExpandAnyDict.asData(hashMap722)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                        ItemBracketHandler.getItem("Forestry:planks", 17),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes287 = MineTweakerAPI.recipes
        val item723 = ItemBracketHandler.getItem("ExtraTrees:door", 401)
        val hashMap723 = HashMap<String, IData>()
        hashMap723["meta"] = ExpandInt.toData(401)
        val withTag227 = item723.withTag(ExpandAnyDict.asData(hashMap723))
        val array593: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n803 = 0
        val array594 = arrayOf<IIngredient?>(null, null, null)
        val n804 = 1
        val item724 = ItemBracketHandler.getItem("ExtraTrees:door", 145)
        val hashMap724 = HashMap<String, IData>()
        hashMap724["meta"] = ExpandInt.toData(145)
        array594[n804] = item724.withTag(ExpandAnyDict.asData(hashMap724))
        array594[2] = null
        array593[n803] = array594
        array593[1] = arrayOf(null, null, null)
        array593[2] = arrayOf(null, null, null)
        recipes287.addShaped(withTag227, array593, null)
        val recipes288 = MineTweakerAPI.recipes
        val item725 = ItemBracketHandler.getItem("ExtraTrees:door", 657)
        val hashMap725 = HashMap<String, IData>()
        hashMap725["meta"] = ExpandInt.toData(657)
        val withTag228 = item725.withTag(ExpandAnyDict.asData(hashMap725))
        val array595: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n805 = 0
        val array596 = arrayOf<IIngredient?>(null, null, null)
        val n806 = 2
        val item726 = ItemBracketHandler.getItem("ExtraTrees:door", 145)
        val hashMap726 = HashMap<String, IData>()
        hashMap726["meta"] = ExpandInt.toData(145)
        array596[n806] = item726.withTag(ExpandAnyDict.asData(hashMap726))
        array595[n805] = array596
        array595[1] = arrayOf(null, null, null)
        array595[2] = arrayOf(null, null, null)
        recipes288.addShaped(withTag228, array595, null)
        val recipes289 = MineTweakerAPI.recipes
        val item727 = ItemBracketHandler.getItem("ExtraTrees:door", 913)
        val hashMap727 = HashMap<String, IData>()
        hashMap727["meta"] = ExpandInt.toData(913)
        val withTag229 = item727.withTag(ExpandAnyDict.asData(hashMap727))
        val array597 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n807 = 1
        val array598 = arrayOfNulls<IIngredient>(3)
        val n808 = 0
        val item728 = ItemBracketHandler.getItem("ExtraTrees:door", 145)
        val hashMap728 = HashMap<String, IData>()
        hashMap728["meta"] = ExpandInt.toData(145)
        array598[n808] = item728.withTag(ExpandAnyDict.asData(hashMap728))
        array598[2] = null.also { array598[1] = it }
        array597[n807] = array598
        array597[2] = arrayOf(null, null, null)
        recipes289.addShaped(withTag229, array597, null)
        val recipes290 = MineTweakerAPI.recipes
        val item729 = ItemBracketHandler.getItem("ExtraTrees:door", 146)
        val hashMap729 = HashMap<String, IData>()
        hashMap729["meta"] = ExpandInt.toData(146)
        recipes290.addShaped(item729.withTag(ExpandAnyDict.asData(hashMap729)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                        ItemBracketHandler.getItem("Forestry:planks", 18),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes291 = MineTweakerAPI.recipes
        val item730 = ItemBracketHandler.getItem("ExtraTrees:door", 146)
        val hashMap730 = HashMap<String, IData>()
        hashMap730["meta"] = ExpandInt.toData(146)
        recipes291.addShaped(item730.withTag(ExpandAnyDict.asData(hashMap730)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                        ItemBracketHandler.getItem("Forestry:planks", 18),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes292 = MineTweakerAPI.recipes
        val item731 = ItemBracketHandler.getItem("ExtraTrees:door", 402)
        val hashMap731 = HashMap<String, IData>()
        hashMap731["meta"] = ExpandInt.toData(402)
        val withTag230 = item731.withTag(ExpandAnyDict.asData(hashMap731))
        val array599: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n809 = 0
        val array600 = arrayOf<IIngredient?>(null, null, null)
        val n810 = 1
        val item732 = ItemBracketHandler.getItem("ExtraTrees:door", 146)
        val hashMap732 = HashMap<String, IData>()
        hashMap732["meta"] = ExpandInt.toData(146)
        array600[n810] = item732.withTag(ExpandAnyDict.asData(hashMap732))
        array600[2] = null
        array599[n809] = array600
        array599[1] = arrayOf(null, null, null)
        array599[2] = arrayOf(null, null, null)
        recipes292.addShaped(withTag230, array599, null)
        val recipes293 = MineTweakerAPI.recipes
        val item733 = ItemBracketHandler.getItem("ExtraTrees:door", 658)
        val hashMap733 = HashMap<String, IData>()
        hashMap733["meta"] = ExpandInt.toData(658)
        val withTag231 = item733.withTag(ExpandAnyDict.asData(hashMap733))
        val array601: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n811 = 0
        val array602 = arrayOf<IIngredient?>(null, null, null)
        val n812 = 2
        val item734 = ItemBracketHandler.getItem("ExtraTrees:door", 146)
        val hashMap734 = HashMap<String, IData>()
        hashMap734["meta"] = ExpandInt.toData(146)
        array602[n812] = item734.withTag(ExpandAnyDict.asData(hashMap734))
        array601[n811] = array602
        array601[1] = arrayOf(null, null, null)
        array601[2] = arrayOf(null, null, null)
        recipes293.addShaped(withTag231, array601, null)
        val recipes294 = MineTweakerAPI.recipes
        val item735 = ItemBracketHandler.getItem("ExtraTrees:door", 914)
        val hashMap735 = HashMap<String, IData>()
        hashMap735["meta"] = ExpandInt.toData(914)
        val withTag232 = item735.withTag(ExpandAnyDict.asData(hashMap735))
        val array603 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n813 = 1
        val array604 = arrayOfNulls<IIngredient>(3)
        val n814 = 0
        val item736 = ItemBracketHandler.getItem("ExtraTrees:door", 146)
        val hashMap736 = HashMap<String, IData>()
        hashMap736["meta"] = ExpandInt.toData(146)
        array604[n814] = item736.withTag(ExpandAnyDict.asData(hashMap736))
        array604[2] = null.also { array604[1] = it }
        array603[n813] = array604
        array603[2] = arrayOf(null, null, null)
        recipes294.addShaped(withTag232, array603, null)
        val recipes295 = MineTweakerAPI.recipes
        val item737 = ItemBracketHandler.getItem("ExtraTrees:door", 147)
        val hashMap737 = HashMap<String, IData>()
        hashMap737["meta"] = ExpandInt.toData(147)
        recipes295.addShaped(item737.withTag(ExpandAnyDict.asData(hashMap737)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                        ItemBracketHandler.getItem("Forestry:planks", 19),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes296 = MineTweakerAPI.recipes
        val item738 = ItemBracketHandler.getItem("ExtraTrees:door", 147)
        val hashMap738 = HashMap<String, IData>()
        hashMap738["meta"] = ExpandInt.toData(147)
        recipes296.addShaped(item738.withTag(ExpandAnyDict.asData(hashMap738)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                        ItemBracketHandler.getItem("Forestry:planks", 19),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes297 = MineTweakerAPI.recipes
        val item739 = ItemBracketHandler.getItem("ExtraTrees:door", 403)
        val hashMap739 = HashMap<String, IData>()
        hashMap739["meta"] = ExpandInt.toData(403)
        val withTag233 = item739.withTag(ExpandAnyDict.asData(hashMap739))
        val array605: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n815 = 0
        val array606 = arrayOf<IIngredient?>(null, null, null)
        val n816 = 1
        val item740 = ItemBracketHandler.getItem("ExtraTrees:door", 147)
        val hashMap740 = HashMap<String, IData>()
        hashMap740["meta"] = ExpandInt.toData(147)
        array606[n816] = item740.withTag(ExpandAnyDict.asData(hashMap740))
        array606[2] = null
        array605[n815] = array606
        array605[1] = arrayOf(null, null, null)
        array605[2] = arrayOf(null, null, null)
        recipes297.addShaped(withTag233, array605, null)
        val recipes298 = MineTweakerAPI.recipes
        val item741 = ItemBracketHandler.getItem("ExtraTrees:door", 659)
        val hashMap741 = HashMap<String, IData>()
        hashMap741["meta"] = ExpandInt.toData(659)
        val withTag234 = item741.withTag(ExpandAnyDict.asData(hashMap741))
        val array607: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n817 = 0
        val array608 = arrayOf<IIngredient?>(null, null, null)
        val n818 = 2
        val item742 = ItemBracketHandler.getItem("ExtraTrees:door", 147)
        val hashMap742 = HashMap<String, IData>()
        hashMap742["meta"] = ExpandInt.toData(147)
        array608[n818] = item742.withTag(ExpandAnyDict.asData(hashMap742))
        array607[n817] = array608
        array607[1] = arrayOf(null, null, null)
        array607[2] = arrayOf(null, null, null)
        recipes298.addShaped(withTag234, array607, null)
        val recipes299 = MineTweakerAPI.recipes
        val item743 = ItemBracketHandler.getItem("ExtraTrees:door", 915)
        val hashMap743 = HashMap<String, IData>()
        hashMap743["meta"] = ExpandInt.toData(915)
        val withTag235 = item743.withTag(ExpandAnyDict.asData(hashMap743))
        val array609 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n819 = 1
        val array610 = arrayOfNulls<IIngredient>(3)
        val n820 = 0
        val item744 = ItemBracketHandler.getItem("ExtraTrees:door", 147)
        val hashMap744 = HashMap<String, IData>()
        hashMap744["meta"] = ExpandInt.toData(147)
        array610[n820] = item744.withTag(ExpandAnyDict.asData(hashMap744))
        array610[2] = null.also { array610[1] = it }
        array609[n819] = array610
        array609[2] = arrayOf(null, null, null)
        recipes299.addShaped(withTag235, array609, null)
        val recipes300 = MineTweakerAPI.recipes
        val item745 = ItemBracketHandler.getItem("ExtraTrees:door", 148)
        val hashMap745 = HashMap<String, IData>()
        hashMap745["meta"] = ExpandInt.toData(148)
        recipes300.addShaped(item745.withTag(ExpandAnyDict.asData(hashMap745)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                        ItemBracketHandler.getItem("Forestry:planks", 20),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes301 = MineTweakerAPI.recipes
        val item746 = ItemBracketHandler.getItem("ExtraTrees:door", 148)
        val hashMap746 = HashMap<String, IData>()
        hashMap746["meta"] = ExpandInt.toData(148)
        recipes301.addShaped(item746.withTag(ExpandAnyDict.asData(hashMap746)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                        ItemBracketHandler.getItem("Forestry:planks", 20),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes302 = MineTweakerAPI.recipes
        val item747 = ItemBracketHandler.getItem("ExtraTrees:door", 404)
        val hashMap747 = HashMap<String, IData>()
        hashMap747["meta"] = ExpandInt.toData(404)
        val withTag236 = item747.withTag(ExpandAnyDict.asData(hashMap747))
        val array611: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n821 = 0
        val array612 = arrayOf<IIngredient?>(null, null, null)
        val n822 = 1
        val item748 = ItemBracketHandler.getItem("ExtraTrees:door", 148)
        val hashMap748 = HashMap<String, IData>()
        hashMap748["meta"] = ExpandInt.toData(148)
        array612[n822] = item748.withTag(ExpandAnyDict.asData(hashMap748))
        array612[2] = null
        array611[n821] = array612
        array611[1] = arrayOf(null, null, null)
        array611[2] = arrayOf(null, null, null)
        recipes302.addShaped(withTag236, array611, null)
        val recipes303 = MineTweakerAPI.recipes
        val item749 = ItemBracketHandler.getItem("ExtraTrees:door", 660)
        val hashMap749 = HashMap<String, IData>()
        hashMap749["meta"] = ExpandInt.toData(660)
        val withTag237 = item749.withTag(ExpandAnyDict.asData(hashMap749))
        val array613: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n823 = 0
        val array614 = arrayOf<IIngredient?>(null, null, null)
        val n824 = 2
        val item750 = ItemBracketHandler.getItem("ExtraTrees:door", 148)
        val hashMap750 = HashMap<String, IData>()
        hashMap750["meta"] = ExpandInt.toData(148)
        array614[n824] = item750.withTag(ExpandAnyDict.asData(hashMap750))
        array613[n823] = array614
        array613[1] = arrayOf(null, null, null)
        array613[2] = arrayOf(null, null, null)
        recipes303.addShaped(withTag237, array613, null)
        val recipes304 = MineTweakerAPI.recipes
        val item751 = ItemBracketHandler.getItem("ExtraTrees:door", 916)
        val hashMap751 = HashMap<String, IData>()
        hashMap751["meta"] = ExpandInt.toData(916)
        val withTag238 = item751.withTag(ExpandAnyDict.asData(hashMap751))
        val array615 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n825 = 1
        val array616 = arrayOfNulls<IIngredient>(3)
        val n826 = 0
        val item752 = ItemBracketHandler.getItem("ExtraTrees:door", 148)
        val hashMap752 = HashMap<String, IData>()
        hashMap752["meta"] = ExpandInt.toData(148)
        array616[n826] = item752.withTag(ExpandAnyDict.asData(hashMap752))
        array616[2] = null.also { array616[1] = it }
        array615[n825] = array616
        array615[2] = arrayOf(null, null, null)
        recipes304.addShaped(withTag238, array615, null)
        val recipes305 = MineTweakerAPI.recipes
        val item753 = ItemBracketHandler.getItem("ExtraTrees:door", 149)
        val hashMap753 = HashMap<String, IData>()
        hashMap753["meta"] = ExpandInt.toData(149)
        recipes305.addShaped(item753.withTag(ExpandAnyDict.asData(hashMap753)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                        ItemBracketHandler.getItem("Forestry:planks", 21),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes306 = MineTweakerAPI.recipes
        val item754 = ItemBracketHandler.getItem("ExtraTrees:door", 149)
        val hashMap754 = HashMap<String, IData>()
        hashMap754["meta"] = ExpandInt.toData(149)
        recipes306.addShaped(item754.withTag(ExpandAnyDict.asData(hashMap754)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                        ItemBracketHandler.getItem("Forestry:planks", 21),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes307 = MineTweakerAPI.recipes
        val item755 = ItemBracketHandler.getItem("ExtraTrees:door", 405)
        val hashMap755 = HashMap<String, IData>()
        hashMap755["meta"] = ExpandInt.toData(405)
        val withTag239 = item755.withTag(ExpandAnyDict.asData(hashMap755))
        val array617: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n827 = 0
        val array618 = arrayOf<IIngredient?>(null, null, null)
        val n828 = 1
        val item756 = ItemBracketHandler.getItem("ExtraTrees:door", 149)
        val hashMap756 = HashMap<String, IData>()
        hashMap756["meta"] = ExpandInt.toData(149)
        array618[n828] = item756.withTag(ExpandAnyDict.asData(hashMap756))
        array618[2] = null
        array617[n827] = array618
        array617[1] = arrayOf(null, null, null)
        array617[2] = arrayOf(null, null, null)
        recipes307.addShaped(withTag239, array617, null)
        val recipes308 = MineTweakerAPI.recipes
        val item757 = ItemBracketHandler.getItem("ExtraTrees:door", 661)
        val hashMap757 = HashMap<String, IData>()
        hashMap757["meta"] = ExpandInt.toData(661)
        val withTag240 = item757.withTag(ExpandAnyDict.asData(hashMap757))
        val array619: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n829 = 0
        val array620 = arrayOf<IIngredient?>(null, null, null)
        val n830 = 2
        val item758 = ItemBracketHandler.getItem("ExtraTrees:door", 149)
        val hashMap758 = HashMap<String, IData>()
        hashMap758["meta"] = ExpandInt.toData(149)
        array620[n830] = item758.withTag(ExpandAnyDict.asData(hashMap758))
        array619[n829] = array620
        array619[1] = arrayOf(null, null, null)
        array619[2] = arrayOf(null, null, null)
        recipes308.addShaped(withTag240, array619, null)
        val recipes309 = MineTweakerAPI.recipes
        val item759 = ItemBracketHandler.getItem("ExtraTrees:door", 917)
        val hashMap759 = HashMap<String, IData>()
        hashMap759["meta"] = ExpandInt.toData(917)
        val withTag241 = item759.withTag(ExpandAnyDict.asData(hashMap759))
        val array621 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n831 = 1
        val array622 = arrayOfNulls<IIngredient>(3)
        val n832 = 0
        val item760 = ItemBracketHandler.getItem("ExtraTrees:door", 149)
        val hashMap760 = HashMap<String, IData>()
        hashMap760["meta"] = ExpandInt.toData(149)
        array622[n832] = item760.withTag(ExpandAnyDict.asData(hashMap760))
        array622[2] = null.also { array622[1] = it }
        array621[n831] = array622
        array621[2] = arrayOf(null, null, null)
        recipes309.addShaped(withTag241, array621, null)
        val recipes310 = MineTweakerAPI.recipes
        val item761 = ItemBracketHandler.getItem("ExtraTrees:door", 150)
        val hashMap761 = HashMap<String, IData>()
        hashMap761["meta"] = ExpandInt.toData(150)
        recipes310.addShaped(item761.withTag(ExpandAnyDict.asData(hashMap761)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                        ItemBracketHandler.getItem("Forestry:planks", 22),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes311 = MineTweakerAPI.recipes
        val item762 = ItemBracketHandler.getItem("ExtraTrees:door", 150)
        val hashMap762 = HashMap<String, IData>()
        hashMap762["meta"] = ExpandInt.toData(150)
        recipes311.addShaped(item762.withTag(ExpandAnyDict.asData(hashMap762)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                        ItemBracketHandler.getItem("Forestry:planks", 22),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes312 = MineTweakerAPI.recipes
        val item763 = ItemBracketHandler.getItem("ExtraTrees:door", 406)
        val hashMap763 = HashMap<String, IData>()
        hashMap763["meta"] = ExpandInt.toData(406)
        val withTag242 = item763.withTag(ExpandAnyDict.asData(hashMap763))
        val array623: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n833 = 0
        val array624 = arrayOf<IIngredient?>(null, null, null)
        val n834 = 1
        val item764 = ItemBracketHandler.getItem("ExtraTrees:door", 150)
        val hashMap764 = HashMap<String, IData>()
        hashMap764["meta"] = ExpandInt.toData(150)
        array624[n834] = item764.withTag(ExpandAnyDict.asData(hashMap764))
        array624[2] = null
        array623[n833] = array624
        array623[1] = arrayOf(null, null, null)
        array623[2] = arrayOf(null, null, null)
        recipes312.addShaped(withTag242, array623, null)
        val recipes313 = MineTweakerAPI.recipes
        val item765 = ItemBracketHandler.getItem("ExtraTrees:door", 662)
        val hashMap765 = HashMap<String, IData>()
        hashMap765["meta"] = ExpandInt.toData(662)
        val withTag243 = item765.withTag(ExpandAnyDict.asData(hashMap765))
        val array625: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n835 = 0
        val array626 = arrayOf<IIngredient?>(null, null, null)
        val n836 = 2
        val item766 = ItemBracketHandler.getItem("ExtraTrees:door", 150)
        val hashMap766 = HashMap<String, IData>()
        hashMap766["meta"] = ExpandInt.toData(150)
        array626[n836] = item766.withTag(ExpandAnyDict.asData(hashMap766))
        array625[n835] = array626
        array625[1] = arrayOf(null, null, null)
        array625[2] = arrayOf(null, null, null)
        recipes313.addShaped(withTag243, array625, null)
        val recipes314 = MineTweakerAPI.recipes
        val item767 = ItemBracketHandler.getItem("ExtraTrees:door", 918)
        val hashMap767 = HashMap<String, IData>()
        hashMap767["meta"] = ExpandInt.toData(918)
        val withTag244 = item767.withTag(ExpandAnyDict.asData(hashMap767))
        val array627 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n837 = 1
        val array628 = arrayOfNulls<IIngredient>(3)
        val n838 = 0
        val item768 = ItemBracketHandler.getItem("ExtraTrees:door", 150)
        val hashMap768 = HashMap<String, IData>()
        hashMap768["meta"] = ExpandInt.toData(150)
        array628[n838] = item768.withTag(ExpandAnyDict.asData(hashMap768))
        array628[2] = null.also { array628[1] = it }
        array627[n837] = array628
        array627[2] = arrayOf(null, null, null)
        recipes314.addShaped(withTag244, array627, null)
        val recipes315 = MineTweakerAPI.recipes
        val item769 = ItemBracketHandler.getItem("ExtraTrees:door", 151)
        val hashMap769 = HashMap<String, IData>()
        hashMap769["meta"] = ExpandInt.toData(151)
        recipes315.addShaped(item769.withTag(ExpandAnyDict.asData(hashMap769)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                        ItemBracketHandler.getItem("Forestry:planks", 23),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes316 = MineTweakerAPI.recipes
        val item770 = ItemBracketHandler.getItem("ExtraTrees:door", 151)
        val hashMap770 = HashMap<String, IData>()
        hashMap770["meta"] = ExpandInt.toData(151)
        recipes316.addShaped(item770.withTag(ExpandAnyDict.asData(hashMap770)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                        ItemBracketHandler.getItem("Forestry:planks", 23),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes317 = MineTweakerAPI.recipes
        val item771 = ItemBracketHandler.getItem("ExtraTrees:door", 407)
        val hashMap771 = HashMap<String, IData>()
        hashMap771["meta"] = ExpandInt.toData(407)
        val withTag245 = item771.withTag(ExpandAnyDict.asData(hashMap771))
        val array629: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n839 = 0
        val array630 = arrayOf<IIngredient?>(null, null, null)
        val n840 = 1
        val item772 = ItemBracketHandler.getItem("ExtraTrees:door", 151)
        val hashMap772 = HashMap<String, IData>()
        hashMap772["meta"] = ExpandInt.toData(151)
        array630[n840] = item772.withTag(ExpandAnyDict.asData(hashMap772))
        array630[2] = null
        array629[n839] = array630
        array629[1] = arrayOf(null, null, null)
        array629[2] = arrayOf(null, null, null)
        recipes317.addShaped(withTag245, array629, null)
        val recipes318 = MineTweakerAPI.recipes
        val item773 = ItemBracketHandler.getItem("ExtraTrees:door", 663)
        val hashMap773 = HashMap<String, IData>()
        hashMap773["meta"] = ExpandInt.toData(663)
        val withTag246 = item773.withTag(ExpandAnyDict.asData(hashMap773))
        val array631: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n841 = 0
        val array632 = arrayOf<IIngredient?>(null, null, null)
        val n842 = 2
        val item774 = ItemBracketHandler.getItem("ExtraTrees:door", 151)
        val hashMap774 = HashMap<String, IData>()
        hashMap774["meta"] = ExpandInt.toData(151)
        array632[n842] = item774.withTag(ExpandAnyDict.asData(hashMap774))
        array631[n841] = array632
        array631[1] = arrayOf(null, null, null)
        array631[2] = arrayOf(null, null, null)
        recipes318.addShaped(withTag246, array631, null)
        val recipes319 = MineTweakerAPI.recipes
        val item775 = ItemBracketHandler.getItem("ExtraTrees:door", 919)
        val hashMap775 = HashMap<String, IData>()
        hashMap775["meta"] = ExpandInt.toData(919)
        val withTag247 = item775.withTag(ExpandAnyDict.asData(hashMap775))
        val array633 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n843 = 1
        val array634 = arrayOfNulls<IIngredient>(3)
        val n844 = 0
        val item776 = ItemBracketHandler.getItem("ExtraTrees:door", 151)
        val hashMap776 = HashMap<String, IData>()
        hashMap776["meta"] = ExpandInt.toData(151)
        array634[n844] = item776.withTag(ExpandAnyDict.asData(hashMap776))
        array634[2] = null.also { array634[1] = it }
        array633[n843] = array634
        array633[2] = arrayOf(null, null, null)
        recipes319.addShaped(withTag247, array633, null)
        Mixer.addRecipe(ItemBracketHandler.getItem("ExtraTrees:misc", 6), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.MushroomPowder", 0).amount(5)),
                LiquidBracketHandler.getLiquid("potion.wheatyjuice").withAmount(1000), 400, 16)
        Mixer.addRecipe(ItemBracketHandler.getItem("ExtraTrees:misc", 7), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraTrees:misc", 6),
                        ItemBracketHandler.getItem("ExtraTrees" +
                                ":misc", 12).amount(4)), LiquidBracketHandler.getLiquid("water").withAmount(1000), 600,
                16)
        run2()
    }
}