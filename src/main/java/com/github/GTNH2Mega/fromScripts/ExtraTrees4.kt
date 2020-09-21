package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IItemStack
import minetweaker.api.recipes.IRecipeManager
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import java.util.*

class ExtraTrees4 : Runnable {

    override fun run() {
        val ore = OreBracketHandler.getOre("craftingToolScrewdriver")
        val ore2 = OreBracketHandler.getOre("screwIron")
        val ore3 = OreBracketHandler.getOre("screwSteel")
        val recipes18 = MineTweakerAPI.recipes
        val item58 = ItemBracketHandler.getItem("ExtraTrees:fence", 62)
        val hashMap58 = HashMap<String, IData>()
        hashMap58["meta"] = ExpandInt.toData(62)
        val amount12 = item58.withTag(ExpandAnyDict.asData(hashMap58)).amount(4)
        val array58 = arrayOf(arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n81 = 1
        val array59 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n82 = 1
        val item59 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap59 = HashMap<String, IData>()
        hashMap59["meta"] = ExpandInt.toData(30)
        array59[n82] = item59.withTag(ExpandAnyDict.asData(hashMap59))
        array59[2] = OreBracketHandler.getOre("stickWood")
        array58[n81] = array59
        val n83 = 2
        val array60 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n84 = 1
        val item60 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap60 = HashMap<String, IData>()
        hashMap60["meta"] = ExpandInt.toData(30)
        array60[n84] = item60.withTag(ExpandAnyDict.asData(hashMap60))
        array60[2] = OreBracketHandler.getOre("stickWood")
        array58[n83] = array60
        recipes18.addShaped(amount12, array58, null)
        val recipes19 = MineTweakerAPI.recipes
        val item61 = ItemBracketHandler.getItem("ExtraTrees:fence", 63)
        val hashMap61 = HashMap<String, IData>()
        hashMap61["meta"] = ExpandInt.toData(63)
        val withTag7 = item61.withTag(ExpandAnyDict.asData(hashMap61))
        val array61: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n85 = 0
        val array62 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n86 = 1
        val item62 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap62 = HashMap<String, IData>()
        hashMap62["meta"] = ExpandInt.toData(31)
        array62[n86] = item62.withTag(ExpandAnyDict.asData(hashMap62))
        array62[2] = OreBracketHandler.getOre("stickWood")
        array61[n85] = array62
        val n87 = 1
        val array63 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n88 = 1
        val item63 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap63 = HashMap<String, IData>()
        hashMap63["meta"] = ExpandInt.toData(31)
        array63[n88] = item63.withTag(ExpandAnyDict.asData(hashMap63))
        array63[2] = OreBracketHandler.getOre("stickWood")
        array61[n87] = array63
        val n89 = 2
        val array64 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n90 = 1
        val item64 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap64 = HashMap<String, IData>()
        hashMap64["meta"] = ExpandInt.toData(31)
        array64[n90] = item64.withTag(ExpandAnyDict.asData(hashMap64))
        array64[2] = OreBracketHandler.getOre("stickWood")
        array61[n89] = array64
        recipes19.addShaped(withTag7, array61, null)
        val recipes20 = MineTweakerAPI.recipes
        val item65 = ItemBracketHandler.getItem("ExtraTrees:fence", 63)
        val hashMap65 = HashMap<String, IData>()
        hashMap65["meta"] = ExpandInt.toData(63)
        val amount13 = item65.withTag(ExpandAnyDict.asData(hashMap65)).amount(2)
        val array65 = arrayOf(arrayOf<IIngredient?>(ore2, ore, ore2), null, null)
        val n91 = 1
        val array66 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n92 = 1
        val item66 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap66 = HashMap<String, IData>()
        hashMap66["meta"] = ExpandInt.toData(31)
        array66[n92] = item66.withTag(ExpandAnyDict.asData(hashMap66))
        array66[2] = OreBracketHandler.getOre("stickWood")
        array65[n91] = array66
        val n93 = 2
        val array67 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n94 = 1
        val item67 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap67 = HashMap<String, IData>()
        hashMap67["meta"] = ExpandInt.toData(31)
        array67[n94] = item67.withTag(ExpandAnyDict.asData(hashMap67))
        array67[2] = OreBracketHandler.getOre("stickWood")
        array65[n93] = array67
        recipes20.addShaped(amount13, array65, null)
        val recipes21 = MineTweakerAPI.recipes
        val item68 = ItemBracketHandler.getItem("ExtraTrees:fence", 63)
        val hashMap68 = HashMap<String, IData>()
        hashMap68["meta"] = ExpandInt.toData(63)
        val amount14 = item68.withTag(ExpandAnyDict.asData(hashMap68)).amount(4)
        val array68 = arrayOf(arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n95 = 1
        val array69 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n96 = 1
        val item69 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap69 = HashMap<String, IData>()
        hashMap69["meta"] = ExpandInt.toData(31)
        array69[n96] = item69.withTag(ExpandAnyDict.asData(hashMap69))
        array69[2] = OreBracketHandler.getOre("stickWood")
        array68[n95] = array69
        val n97 = 2
        val array70 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n98 = 1
        val item70 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap70 = HashMap<String, IData>()
        hashMap70["meta"] = ExpandInt.toData(31)
        array70[n98] = item70.withTag(ExpandAnyDict.asData(hashMap70))
        array70[2] = OreBracketHandler.getOre("stickWood")
        array68[n97] = array70
        recipes21.addShaped(amount14, array68, null)
        val recipes22 = MineTweakerAPI.recipes
        val item71 = ItemBracketHandler.getItem("ExtraTrees:fence", 64)
        val hashMap71 = HashMap<String, IData>()
        hashMap71["meta"] = ExpandInt.toData(64)
        val withTag8 = item71.withTag(ExpandAnyDict.asData(hashMap71))
        val array71: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n99 = 0
        val array72 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n100 = 1
        val item72 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap72 = HashMap<String, IData>()
        hashMap72["meta"] = ExpandInt.toData(32)
        array72[n100] = item72.withTag(ExpandAnyDict.asData(hashMap72))
        array72[2] = OreBracketHandler.getOre("stickWood")
        array71[n99] = array72
        val n101 = 1
        val array73 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n102 = 1
        val item73 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap73 = HashMap<String, IData>()
        hashMap73["meta"] = ExpandInt.toData(32)
        array73[n102] = item73.withTag(ExpandAnyDict.asData(hashMap73))
        array73[2] = OreBracketHandler.getOre("stickWood")
        array71[n101] = array73
        val n103 = 2
        val array74 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n104 = 1
        val item74 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap74 = HashMap<String, IData>()
        hashMap74["meta"] = ExpandInt.toData(32)
        array74[n104] = item74.withTag(ExpandAnyDict.asData(hashMap74))
        array74[2] = OreBracketHandler.getOre("stickWood")
        array71[n103] = array74
        recipes22.addShaped(withTag8, array71, null)
        val recipes23 = MineTweakerAPI.recipes
        val item75 = ItemBracketHandler.getItem("ExtraTrees:fence", 64)
        val hashMap75 = HashMap<String, IData>()
        hashMap75["meta"] = ExpandInt.toData(64)
        val amount15 = item75.withTag(ExpandAnyDict.asData(hashMap75)).amount(2)
        val array75 = arrayOf(arrayOf<IIngredient?>(ore2, ore, ore2), null, null)
        val n105 = 1
        val array76 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n106 = 1
        val item76 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap76 = HashMap<String, IData>()
        hashMap76["meta"] = ExpandInt.toData(32)
        array76[n106] = item76.withTag(ExpandAnyDict.asData(hashMap76))
        array76[2] = OreBracketHandler.getOre("stickWood")
        array75[n105] = array76
        val n107 = 2
        val array77 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n108 = 1
        val item77 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap77 = HashMap<String, IData>()
        hashMap77["meta"] = ExpandInt.toData(32)
        array77[n108] = item77.withTag(ExpandAnyDict.asData(hashMap77))
        array77[2] = OreBracketHandler.getOre("stickWood")
        array75[n107] = array77
        recipes23.addShaped(amount15, array75, null)
        val recipes24 = MineTweakerAPI.recipes
        val item78 = ItemBracketHandler.getItem("ExtraTrees:fence", 64)
        val hashMap78 = HashMap<String, IData>()
        hashMap78["meta"] = ExpandInt.toData(64)
        val amount16 = item78.withTag(ExpandAnyDict.asData(hashMap78)).amount(4)
        val array78 = arrayOf(arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n109 = 1
        val array79 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n110 = 1
        val item79 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap79 = HashMap<String, IData>()
        hashMap79["meta"] = ExpandInt.toData(32)
        array79[n110] = item79.withTag(ExpandAnyDict.asData(hashMap79))
        array79[2] = OreBracketHandler.getOre("stickWood")
        array78[n109] = array79
        val n111 = 2
        val array80 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n112 = 1
        val item80 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap80 = HashMap<String, IData>()
        hashMap80["meta"] = ExpandInt.toData(32)
        array80[n112] = item80.withTag(ExpandAnyDict.asData(hashMap80))
        array80[2] = OreBracketHandler.getOre("stickWood")
        array78[n111] = array80
        recipes24.addShaped(amount16, array78, null)
        val recipes25 = MineTweakerAPI.recipes
        val item81 = ItemBracketHandler.getItem("ExtraTrees:fence", 65)
        val hashMap81 = HashMap<String, IData>()
        hashMap81["meta"] = ExpandInt.toData(65)
        val withTag9 = item81.withTag(ExpandAnyDict.asData(hashMap81))
        val array81: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n113 = 0
        val array82 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n114 = 1
        val item82 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap82 = HashMap<String, IData>()
        hashMap82["meta"] = ExpandInt.toData(33)
        array82[n114] = item82.withTag(ExpandAnyDict.asData(hashMap82))
        array82[2] = OreBracketHandler.getOre("stickWood")
        array81[n113] = array82
        val n115 = 1
        val array83 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n116 = 1
        val item83 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap83 = HashMap<String, IData>()
        hashMap83["meta"] = ExpandInt.toData(33)
        array83[n116] = item83.withTag(ExpandAnyDict.asData(hashMap83))
        array83[2] = OreBracketHandler.getOre("stickWood")
        array81[n115] = array83
        val n117 = 2
        val array84 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n118 = 1
        val item84 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap84 = HashMap<String, IData>()
        hashMap84["meta"] = ExpandInt.toData(33)
        array84[n118] = item84.withTag(ExpandAnyDict.asData(hashMap84))
        array84[2] = OreBracketHandler.getOre("stickWood")
        array81[n117] = array84
        recipes25.addShaped(withTag9, array81, null)
        val recipes26 = MineTweakerAPI.recipes
        val item85 = ItemBracketHandler.getItem("ExtraTrees:fence", 65)
        val hashMap85 = HashMap<String, IData>()
        hashMap85["meta"] = ExpandInt.toData(65)
        val amount17 = item85.withTag(ExpandAnyDict.asData(hashMap85)).amount(2)
        val array85 = arrayOf(arrayOf<IIngredient?>(ore2, ore, ore2), null, null)
        val n119 = 1
        val array86 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n120 = 1
        val item86 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap86 = HashMap<String, IData>()
        hashMap86["meta"] = ExpandInt.toData(33)
        array86[n120] = item86.withTag(ExpandAnyDict.asData(hashMap86))
        array86[2] = OreBracketHandler.getOre("stickWood")
        array85[n119] = array86
        val n121 = 2
        val array87 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n122 = 1
        val item87 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap87 = HashMap<String, IData>()
        hashMap87["meta"] = ExpandInt.toData(33)
        array87[n122] = item87.withTag(ExpandAnyDict.asData(hashMap87))
        array87[2] = OreBracketHandler.getOre("stickWood")
        array85[n121] = array87
        recipes26.addShaped(amount17, array85, null)
        val recipes27 = MineTweakerAPI.recipes
        val item88 = ItemBracketHandler.getItem("ExtraTrees:fence", 65)
        val hashMap88 = HashMap<String, IData>()
        hashMap88["meta"] = ExpandInt.toData(65)
        val amount18 = item88.withTag(ExpandAnyDict.asData(hashMap88)).amount(4)
        val array88 = arrayOf(arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n123 = 1
        val array89 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n124 = 1
        val item89 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap89 = HashMap<String, IData>()
        hashMap89["meta"] = ExpandInt.toData(33)
        array89[n124] = item89.withTag(ExpandAnyDict.asData(hashMap89))
        array89[2] = OreBracketHandler.getOre("stickWood")
        array88[n123] = array89
        val n125 = 2
        val array90 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n126 = 1
        val item90 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap90 = HashMap<String, IData>()
        hashMap90["meta"] = ExpandInt.toData(33)
        array90[n126] = item90.withTag(ExpandAnyDict.asData(hashMap90))
        array90[2] = OreBracketHandler.getOre("stickWood")
        array88[n125] = array90
        recipes27.addShaped(amount18, array88, null)
        val recipes28 = MineTweakerAPI.recipes
        val item91 = ItemBracketHandler.getItem("ExtraTrees:fence", 66)
        val hashMap91 = HashMap<String, IData>()
        hashMap91["meta"] = ExpandInt.toData(66)
        val withTag10 = item91.withTag(ExpandAnyDict.asData(hashMap91))
        val array91: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n127 = 0
        val array92 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n128 = 1
        val item92 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap92 = HashMap<String, IData>()
        hashMap92["meta"] = ExpandInt.toData(34)
        array92[n128] = item92.withTag(ExpandAnyDict.asData(hashMap92))
        array92[2] = OreBracketHandler.getOre("stickWood")
        array91[n127] = array92
        val n129 = 1
        val array93 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n130 = 1
        val item93 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap93 = HashMap<String, IData>()
        hashMap93["meta"] = ExpandInt.toData(34)
        array93[n130] = item93.withTag(ExpandAnyDict.asData(hashMap93))
        array93[2] = OreBracketHandler.getOre("stickWood")
        array91[n129] = array93
        val n131 = 2
        val array94 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n132 = 1
        val item94 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap94 = HashMap<String, IData>()
        hashMap94["meta"] = ExpandInt.toData(34)
        array94[n132] = item94.withTag(ExpandAnyDict.asData(hashMap94))
        array94[2] = OreBracketHandler.getOre("stickWood")
        array91[n131] = array94
        recipes28.addShaped(withTag10, array91, null)
        val recipes29 = MineTweakerAPI.recipes
        val item95 = ItemBracketHandler.getItem("ExtraTrees:fence", 66)
        val hashMap95 = HashMap<String, IData>()
        hashMap95["meta"] = ExpandInt.toData(66)
        val amount19 = item95.withTag(ExpandAnyDict.asData(hashMap95)).amount(2)
        val array95 = arrayOf(arrayOf<IIngredient?>(ore2, ore, ore2), null, null)
        val n133 = 1
        val array96 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n134 = 1
        val item96 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap96 = HashMap<String, IData>()
        hashMap96["meta"] = ExpandInt.toData(34)
        array96[n134] = item96.withTag(ExpandAnyDict.asData(hashMap96))
        array96[2] = OreBracketHandler.getOre("stickWood")
        array95[n133] = array96
        val n135 = 2
        val array97 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n136 = 1
        val item97 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap97 = HashMap<String, IData>()
        hashMap97["meta"] = ExpandInt.toData(34)
        array97[n136] = item97.withTag(ExpandAnyDict.asData(hashMap97))
        array97[2] = OreBracketHandler.getOre("stickWood")
        array95[n135] = array97
        recipes29.addShaped(amount19, array95, null)
        val recipes30 = MineTweakerAPI.recipes
        val item98 = ItemBracketHandler.getItem("ExtraTrees:fence", 66)
        val hashMap98 = HashMap<String, IData>()
        hashMap98["meta"] = ExpandInt.toData(66)
        val amount20 = item98.withTag(ExpandAnyDict.asData(hashMap98)).amount(4)
        val array98 = arrayOf(arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n137 = 1
        val array99 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n138 = 1
        val item99 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap99 = HashMap<String, IData>()
        hashMap99["meta"] = ExpandInt.toData(34)
        array99[n138] = item99.withTag(ExpandAnyDict.asData(hashMap99))
        array99[2] = OreBracketHandler.getOre("stickWood")
        array98[n137] = array99
        val n139 = 2
        val array100 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)
        val n140 = 1
        val item100 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap100 = HashMap<String, IData>()
        hashMap100["meta"] = ExpandInt.toData(34)
        array100[n140] = item100.withTag(ExpandAnyDict.asData(hashMap100))
        array100[2] = OreBracketHandler.getOre("stickWood")
        array98[n139] = array100
        recipes30.addShaped(amount20, array98, null)
        val recipes31 = MineTweakerAPI.recipes
        val item101 = ItemBracketHandler.getItem("ExtraTrees:multifence", 0)
        val hashMap101 = HashMap<String, IData>()
        hashMap101["meta"] = ExpandInt.toData(0)
        recipes31.addShapeless(item101.withTag(ExpandAnyDict.asData(hashMap101)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:fence", 0)), null)
        val recipes32 = MineTweakerAPI.recipes
        val item102 = ItemBracketHandler.getItem("ExtraTrees:fence", 1)
        val hashMap102 = HashMap<String, IData>()
        hashMap102["meta"] = ExpandInt.toData(1)
        recipes32.addShaped(item102.withTag(ExpandAnyDict.asData(hashMap102)),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 1), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 1),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 1), OreBracketHandler.getOre("stickWood"))),
                null)
        val recipes33 = MineTweakerAPI.recipes
        val item103 = ItemBracketHandler.getItem("ExtraTrees:fence", 1)
        val hashMap103 = HashMap<String, IData>()
        hashMap103["meta"] = ExpandInt.toData(1)
        recipes33.addShaped(item103.withTag(ExpandAnyDict.asData(hashMap103)).amount(2),
                arrayOf(arrayOf(ore2, ore, ore2), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 1), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 1),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes34 = MineTweakerAPI.recipes
        val item104 = ItemBracketHandler.getItem("ExtraTrees:fence", 1)
        val hashMap104 = HashMap<String, IData>()
        hashMap104["meta"] = ExpandInt.toData(1)
        recipes34.addShaped(item104.withTag(ExpandAnyDict.asData(hashMap104)).amount(4),
                arrayOf(arrayOf(ore3, ore, ore3), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 1), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 1),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes35 = MineTweakerAPI.recipes
        val item105 = ItemBracketHandler.getItem("ExtraTrees:fence", 2)
        val hashMap105 = HashMap<String, IData>()
        hashMap105["meta"] = ExpandInt.toData(2)
        recipes35.addShaped(item105.withTag(ExpandAnyDict.asData(hashMap105)),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 2), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 2),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 2), OreBracketHandler.getOre("stickWood"))),
                null)
        val recipes36 = MineTweakerAPI.recipes
        val item106 = ItemBracketHandler.getItem("ExtraTrees:fence", 2)
        val hashMap106 = HashMap<String, IData>()
        hashMap106["meta"] = ExpandInt.toData(2)
        recipes36.addShaped(item106.withTag(ExpandAnyDict.asData(hashMap106)).amount(2),
                arrayOf(arrayOf(ore2, ore, ore2), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 2), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 2),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes37 = MineTweakerAPI.recipes
        val item107 = ItemBracketHandler.getItem("ExtraTrees:fence", 2)
        val hashMap107 = HashMap<String, IData>()
        hashMap107["meta"] = ExpandInt.toData(2)
        recipes37.addShaped(item107.withTag(ExpandAnyDict.asData(hashMap107)).amount(4),
                arrayOf(arrayOf(ore3, ore, ore3), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 2), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 2),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes38 = MineTweakerAPI.recipes
        val item108 = ItemBracketHandler.getItem("ExtraTrees:fence", 3)
        val hashMap108 = HashMap<String, IData>()
        hashMap108["meta"] = ExpandInt.toData(3)
        recipes38.addShaped(item108.withTag(ExpandAnyDict.asData(hashMap108)),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 3), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 3),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 3), OreBracketHandler.getOre("stickWood"))),
                null)
        val recipes39 = MineTweakerAPI.recipes
        val item109 = ItemBracketHandler.getItem("ExtraTrees:fence", 3)
        val hashMap109 = HashMap<String, IData>()
        hashMap109["meta"] = ExpandInt.toData(3)
        recipes39.addShaped(item109.withTag(ExpandAnyDict.asData(hashMap109)).amount(2),
                arrayOf(arrayOf(ore2, ore, ore2), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 3), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 3),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes40 = MineTweakerAPI.recipes
        val item110 = ItemBracketHandler.getItem("ExtraTrees:fence", 3)
        val hashMap110 = HashMap<String, IData>()
        hashMap110["meta"] = ExpandInt.toData(3)
        recipes40.addShaped(item110.withTag(ExpandAnyDict.asData(hashMap110)).amount(4),
                arrayOf(arrayOf(ore3, ore, ore3), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 3), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 3),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes41 = MineTweakerAPI.recipes
        val item111 = ItemBracketHandler.getItem("ExtraTrees:fence", 4)
        val hashMap111 = HashMap<String, IData>()
        hashMap111["meta"] = ExpandInt.toData(4)
        recipes41.addShaped(item111.withTag(ExpandAnyDict.asData(hashMap111)),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 4), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 4),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 4), OreBracketHandler.getOre("stickWood"))),
                null)
        val recipes42 = MineTweakerAPI.recipes
        val item112 = ItemBracketHandler.getItem("ExtraTrees:fence", 4)
        val hashMap112 = HashMap<String, IData>()
        hashMap112["meta"] = ExpandInt.toData(4)
        recipes42.addShaped(item112.withTag(ExpandAnyDict.asData(hashMap112)).amount(2),
                arrayOf(arrayOf(ore2, ore, ore2), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 4), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 4),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes43 = MineTweakerAPI.recipes
        val item113 = ItemBracketHandler.getItem("ExtraTrees:fence", 4)
        val hashMap113 = HashMap<String, IData>()
        hashMap113["meta"] = ExpandInt.toData(4)
        recipes43.addShaped(item113.withTag(ExpandAnyDict.asData(hashMap113)).amount(4),
                arrayOf(arrayOf(ore3, ore, ore3), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 4), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 4),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes44 = MineTweakerAPI.recipes
        val item114 = ItemBracketHandler.getItem("ExtraTrees:fence", 5)
        val hashMap114 = HashMap<String, IData>()
        hashMap114["meta"] = ExpandInt.toData(5)
        recipes44.addShaped(item114.withTag(ExpandAnyDict.asData(hashMap114)),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 5), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 5),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 5), OreBracketHandler.getOre("stickWood"))),
                null)
        val recipes45 = MineTweakerAPI.recipes
        val item115 = ItemBracketHandler.getItem("ExtraTrees:fence", 5)
        val hashMap115 = HashMap<String, IData>()
        hashMap115["meta"] = ExpandInt.toData(5)
        recipes45.addShaped(item115.withTag(ExpandAnyDict.asData(hashMap115)).amount(2),
                arrayOf(arrayOf(ore2, ore, ore2), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 5), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 5),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes46 = MineTweakerAPI.recipes
        val item116 = ItemBracketHandler.getItem("ExtraTrees:fence", 5)
        val hashMap116 = HashMap<String, IData>()
        hashMap116["meta"] = ExpandInt.toData(5)
        recipes46.addShaped(item116.withTag(ExpandAnyDict.asData(hashMap116)).amount(4),
                arrayOf(arrayOf(ore3, ore, ore3), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:planks", 5), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:planks", 5),
                                OreBracketHandler.getOre("stickWood"))), null)
        val recipes167 = MineTweakerAPI.recipes
        val item483 = ItemBracketHandler.getItem("ExtraTrees:door", 316)
        val hashMap483 = HashMap<String, IData>()
        hashMap483["meta"] = ExpandInt.toData(316)
        val withTag143 = item483.withTag(ExpandAnyDict.asData(hashMap483))
        val array401: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n575 = 0
        val array402 = arrayOf<IIngredient?>(null, null, null)
        val n576 = 1
        val item484 = ItemBracketHandler.getItem("ExtraTrees:door", 60)
        val hashMap484 = HashMap<String, IData>()
        hashMap484["meta"] = ExpandInt.toData(60)
        array402[n576] = item484.withTag(ExpandAnyDict.asData(hashMap484))
        array402[2] = null
        array401[n575] = array402
        array401[1] = arrayOfNulls(3)
        array401[2] = arrayOfNulls(3)
        recipes167.addShaped(withTag143, array401, null)
        val recipes168 = MineTweakerAPI.recipes
        val item485 = ItemBracketHandler.getItem("ExtraTrees:door", 572)
        val hashMap485 = HashMap<String, IData>()
        hashMap485["meta"] = ExpandInt.toData(572)
        val withTag144 = item485.withTag(ExpandAnyDict.asData(hashMap485))
        val array403: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n577 = 0
        val array404 = arrayOf<IIngredient?>(null, null, null)
        val n578 = 2
        val item486 = ItemBracketHandler.getItem("ExtraTrees:door", 60)
        val hashMap486 = HashMap<String, IData>()
        hashMap486["meta"] = ExpandInt.toData(60)
        array404[n578] = item486.withTag(ExpandAnyDict.asData(hashMap486))
        array403[n577] = array404
        array403[1] = arrayOfNulls(3)
        array403[2] = arrayOfNulls(3)
        recipes168.addShaped(withTag144, array403, null)
        val recipes169 = MineTweakerAPI.recipes
        val item487 = ItemBracketHandler.getItem("ExtraTrees:door", 828)
        val hashMap487 = HashMap<String, IData>()
        hashMap487["meta"] = ExpandInt.toData(828)
        val withTag145 = item487.withTag(ExpandAnyDict.asData(hashMap487))
        val array405 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n579 = 1
        val array406 = arrayOfNulls<IIngredient>(3)
        val n580 = 0
        val item488 = ItemBracketHandler.getItem("ExtraTrees:door", 60)
        val hashMap488 = HashMap<String, IData>()
        hashMap488["meta"] = ExpandInt.toData(60)
        array406[n580] = item488.withTag(ExpandAnyDict.asData(hashMap488))
        array406[2] = (null.also { array406[1] = it })
        array405[n579] = array406
        array405[2] = arrayOfNulls(3)
        recipes169.addShaped(withTag145, array405, null)
        val recipes170 = MineTweakerAPI.recipes
        val item489 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap489 = HashMap<String, IData>()
        hashMap489["meta"] = ExpandInt.toData(61)
        val withTag146 = item489.withTag(ExpandAnyDict.asData(hashMap489))
        val array407: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array411: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array415: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n595 = 0
        val array416 = arrayOf<IIngredient?>(null, null, null)
        val n596 = 1
        val item500 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap500 = HashMap<String, IData>()
        hashMap500["meta"] = ExpandInt.toData(61)
        array416[n596] = item500.withTag(ExpandAnyDict.asData(hashMap500))
        array416[2] = null
        array415[n595] = array416
        array415[1] = arrayOfNulls(3)
        array415[2] = arrayOfNulls(3)
        recipes172.addShaped(withTag148, array415, null)
        val recipes173 = MineTweakerAPI.recipes
        val item501 = ItemBracketHandler.getItem("ExtraTrees:door", 573)
        val hashMap501 = HashMap<String, IData>()
        hashMap501["meta"] = ExpandInt.toData(573)
        val withTag149 = item501.withTag(ExpandAnyDict.asData(hashMap501))
        val array417: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n597 = 0
        val array418 = arrayOf<IIngredient?>(null, null, null)
        val n598 = 2
        val item502 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap502 = HashMap<String, IData>()
        hashMap502["meta"] = ExpandInt.toData(61)
        array418[n598] = item502.withTag(ExpandAnyDict.asData(hashMap502))
        array417[n597] = array418
        array417[1] = arrayOfNulls(3)
        array417[2] = arrayOfNulls(3)
        recipes173.addShaped(withTag149, array417, null)
        val recipes174 = MineTweakerAPI.recipes
        val item503 = ItemBracketHandler.getItem("ExtraTrees:door", 829)
        val hashMap503 = HashMap<String, IData>()
        hashMap503["meta"] = ExpandInt.toData(829)
        val withTag150 = item503.withTag(ExpandAnyDict.asData(hashMap503))
        val array419 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n599 = 1
        val array420 = arrayOfNulls<IIngredient>(3)
        val n600 = 0
        val item504 = ItemBracketHandler.getItem("ExtraTrees:door", 61)
        val hashMap504 = HashMap<String, IData>()
        hashMap504["meta"] = ExpandInt.toData(61)
        array420[n600] = item504.withTag(ExpandAnyDict.asData(hashMap504))
        array420[2] = (null.also { array420[1] = it })
        array419[n599] = array420
        array419[2] = arrayOfNulls(3)
        recipes174.addShaped(withTag150, array419, null)
        val recipes175 = MineTweakerAPI.recipes
        val item505 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap505 = HashMap<String, IData>()
        hashMap505["meta"] = ExpandInt.toData(62)
        val withTag151 = item505.withTag(ExpandAnyDict.asData(hashMap505))
        val array421: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array425: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array429: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n615 = 0
        val array430 = arrayOf<IIngredient?>(null, null, null)
        val n616 = 1
        val item516 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap516 = HashMap<String, IData>()
        hashMap516["meta"] = ExpandInt.toData(62)
        array430[n616] = item516.withTag(ExpandAnyDict.asData(hashMap516))
        array430[2] = null
        array429[n615] = array430
        array429[1] = arrayOfNulls(3)
        array429[2] = arrayOfNulls(3)
        recipes177.addShaped(withTag153, array429, null)
        val recipes178 = MineTweakerAPI.recipes
        val item517 = ItemBracketHandler.getItem("ExtraTrees:door", 574)
        val hashMap517 = HashMap<String, IData>()
        hashMap517["meta"] = ExpandInt.toData(574)
        val withTag154 = item517.withTag(ExpandAnyDict.asData(hashMap517))
        val array431: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n617 = 0
        val array432 = arrayOf<IIngredient?>(null, null, null)
        val n618 = 2
        val item518 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap518 = HashMap<String, IData>()
        hashMap518["meta"] = ExpandInt.toData(62)
        array432[n618] = item518.withTag(ExpandAnyDict.asData(hashMap518))
        array431[n617] = array432
        array431[1] = arrayOfNulls(3)
        array431[2] = arrayOfNulls(3)
        recipes178.addShaped(withTag154, array431, null)
        val recipes179 = MineTweakerAPI.recipes
        val item519 = ItemBracketHandler.getItem("ExtraTrees:door", 830)
        val hashMap519 = HashMap<String, IData>()
        hashMap519["meta"] = ExpandInt.toData(830)
        val withTag155 = item519.withTag(ExpandAnyDict.asData(hashMap519))
        val array433 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n619 = 1
        val array434 = arrayOfNulls<IIngredient>(3)
        val n620 = 0
        val item520 = ItemBracketHandler.getItem("ExtraTrees:door", 62)
        val hashMap520 = HashMap<String, IData>()
        hashMap520["meta"] = ExpandInt.toData(62)
        array434[n620] = item520.withTag(ExpandAnyDict.asData(hashMap520))
        array434[2] = (null.also { array434[1] = it })
        array433[n619] = array434
        array433[2] = arrayOfNulls(3)
        recipes179.addShaped(withTag155, array433, null)
        val recipes180 = MineTweakerAPI.recipes
        val item521 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap521 = HashMap<String, IData>()
        hashMap521["meta"] = ExpandInt.toData(63)
        val withTag156 = item521.withTag(ExpandAnyDict.asData(hashMap521))
        val array435: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array439: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array443: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n635 = 0
        val array444 = arrayOf<IIngredient?>(null, null, null)
        val n636 = 1
        val item532 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap532 = HashMap<String, IData>()
        hashMap532["meta"] = ExpandInt.toData(63)
        array444[n636] = item532.withTag(ExpandAnyDict.asData(hashMap532))
        array444[2] = null
        array443[n635] = array444
        array443[1] = arrayOfNulls(3)
        array443[2] = arrayOfNulls(3)
        recipes182.addShaped(withTag158, array443, null)
        val recipes183 = MineTweakerAPI.recipes
        val item533 = ItemBracketHandler.getItem("ExtraTrees:door", 575)
        val hashMap533 = HashMap<String, IData>()
        hashMap533["meta"] = ExpandInt.toData(575)
        val withTag159 = item533.withTag(ExpandAnyDict.asData(hashMap533))
        val array445: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n637 = 0
        val array446 = arrayOf<IIngredient?>(null, null, null)
        val n638 = 2
        val item534 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap534 = HashMap<String, IData>()
        hashMap534["meta"] = ExpandInt.toData(63)
        array446[n638] = item534.withTag(ExpandAnyDict.asData(hashMap534))
        array445[n637] = array446
        array445[1] = arrayOfNulls(3)
        array445[2] = arrayOfNulls(3)
        recipes183.addShaped(withTag159, array445, null)
        val recipes184 = MineTweakerAPI.recipes
        val item535 = ItemBracketHandler.getItem("ExtraTrees:door", 831)
        val hashMap535 = HashMap<String, IData>()
        hashMap535["meta"] = ExpandInt.toData(831)
        val withTag160 = item535.withTag(ExpandAnyDict.asData(hashMap535))
        val array447 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n639 = 1
        val array448 = arrayOfNulls<IIngredient>(3)
        val n640 = 0
        val item536 = ItemBracketHandler.getItem("ExtraTrees:door", 63)
        val hashMap536 = HashMap<String, IData>()
        hashMap536["meta"] = ExpandInt.toData(63)
        array448[n640] = item536.withTag(ExpandAnyDict.asData(hashMap536))
        array448[2] = (null.also { array448[1] = it })
        array447[n639] = array448
        array447[2] = arrayOfNulls(3)
        recipes184.addShaped(withTag160, array447, null)
        val recipes185 = MineTweakerAPI.recipes
        val item537 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap537 = HashMap<String, IData>()
        hashMap537["meta"] = ExpandInt.toData(64)
        val withTag161 = item537.withTag(ExpandAnyDict.asData(hashMap537))
        val array449: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array453: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array457: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n655 = 0
        val array458 = arrayOf<IIngredient?>(null, null, null)
        val n656 = 1
        val item548 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap548 = HashMap<String, IData>()
        hashMap548["meta"] = ExpandInt.toData(64)
        array458[n656] = item548.withTag(ExpandAnyDict.asData(hashMap548))
        array458[2] = null
        array457[n655] = array458
        array457[1] = arrayOfNulls(3)
        array457[2] = arrayOfNulls(3)
        recipes187.addShaped(withTag163, array457, null)
        val recipes188 = MineTweakerAPI.recipes
        val item549 = ItemBracketHandler.getItem("ExtraTrees:door", 576)
        val hashMap549 = HashMap<String, IData>()
        hashMap549["meta"] = ExpandInt.toData(576)
        val withTag164 = item549.withTag(ExpandAnyDict.asData(hashMap549))
        val array459: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n657 = 0
        val array460 = arrayOf<IIngredient?>(null, null, null)
        val n658 = 2
        val item550 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap550 = HashMap<String, IData>()
        hashMap550["meta"] = ExpandInt.toData(64)
        array460[n658] = item550.withTag(ExpandAnyDict.asData(hashMap550))
        array459[n657] = array460
        array459[1] = arrayOfNulls(3)
        array459[2] = arrayOfNulls(3)
        recipes188.addShaped(withTag164, array459, null)
        val recipes189 = MineTweakerAPI.recipes
        val item551 = ItemBracketHandler.getItem("ExtraTrees:door", 832)
        val hashMap551 = HashMap<String, IData>()
        hashMap551["meta"] = ExpandInt.toData(832)
        val withTag165 = item551.withTag(ExpandAnyDict.asData(hashMap551))
        val array461 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n659 = 1
        val array462 = arrayOfNulls<IIngredient>(3)
        val n660 = 0
        val item552 = ItemBracketHandler.getItem("ExtraTrees:door", 64)
        val hashMap552 = HashMap<String, IData>()
        hashMap552["meta"] = ExpandInt.toData(64)
        array462[n660] = item552.withTag(ExpandAnyDict.asData(hashMap552))
        array462[2] = (null.also { array462[1] = it })
        array461[n659] = array462
        array461[2] = arrayOfNulls(3)
        recipes189.addShaped(withTag165, array461, null)
        val recipes190 = MineTweakerAPI.recipes
        val item553 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap553 = HashMap<String, IData>()
        hashMap553["meta"] = ExpandInt.toData(65)
        val withTag166 = item553.withTag(ExpandAnyDict.asData(hashMap553))
        val array463: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array467: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array471: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n675 = 0
        val array472 = arrayOf<IIngredient?>(null, null, null)
        val n676 = 1
        val item564 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap564 = HashMap<String, IData>()
        hashMap564["meta"] = ExpandInt.toData(65)
        array472[n676] = item564.withTag(ExpandAnyDict.asData(hashMap564))
        array472[2] = null
        array471[n675] = array472
        array471[1] = arrayOfNulls(3)
        array471[2] = arrayOfNulls(3)
        recipes192.addShaped(withTag168, array471, null)
        val recipes193 = MineTweakerAPI.recipes
        val item565 = ItemBracketHandler.getItem("ExtraTrees:door", 577)
        val hashMap565 = HashMap<String, IData>()
        hashMap565["meta"] = ExpandInt.toData(577)
        val withTag169 = item565.withTag(ExpandAnyDict.asData(hashMap565))
        val array473: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n677 = 0
        val array474 = arrayOf<IIngredient?>(null, null, null)
        val n678 = 2
        val item566 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap566 = HashMap<String, IData>()
        hashMap566["meta"] = ExpandInt.toData(65)
        array474[n678] = item566.withTag(ExpandAnyDict.asData(hashMap566))
        array473[n677] = array474
        array473[1] = arrayOfNulls(3)
        array473[2] = arrayOfNulls(3)
        recipes193.addShaped(withTag169, array473, null)
        val recipes194 = MineTweakerAPI.recipes
        val item567 = ItemBracketHandler.getItem("ExtraTrees:door", 833)
        val hashMap567 = HashMap<String, IData>()
        hashMap567["meta"] = ExpandInt.toData(833)
        val withTag170 = item567.withTag(ExpandAnyDict.asData(hashMap567))
        val array475 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n679 = 1
        val array476 = arrayOfNulls<IIngredient>(3)
        val n680 = 0
        val item568 = ItemBracketHandler.getItem("ExtraTrees:door", 65)
        val hashMap568 = HashMap<String, IData>()
        hashMap568["meta"] = ExpandInt.toData(65)
        array476[n680] = item568.withTag(ExpandAnyDict.asData(hashMap568))
        array476[2] = (null.also { array476[1] = it })
        array475[n679] = array476
        array475[2] = arrayOfNulls(3)
        recipes194.addShaped(withTag170, array475, null)
        val recipes195 = MineTweakerAPI.recipes
        val item569 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap569 = HashMap<String, IData>()
        hashMap569["meta"] = ExpandInt.toData(66)
        val withTag171 = item569.withTag(ExpandAnyDict.asData(hashMap569))
        val array477: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array481: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array485: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n695 = 0
        val array486 = arrayOf<IIngredient?>(null, null, null)
        val n696 = 1
        val item580 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap580 = HashMap<String, IData>()
        hashMap580["meta"] = ExpandInt.toData(66)
        array486[n696] = item580.withTag(ExpandAnyDict.asData(hashMap580))
        array486[2] = null
        array485[n695] = array486
        array485[1] = arrayOfNulls(3)
        array485[2] = arrayOfNulls(3)
        recipes197.addShaped(withTag173, array485, null)
        val recipes198 = MineTweakerAPI.recipes
        val item581 = ItemBracketHandler.getItem("ExtraTrees:door", 578)
        val hashMap581 = HashMap<String, IData>()
        hashMap581["meta"] = ExpandInt.toData(578)
        val withTag174 = item581.withTag(ExpandAnyDict.asData(hashMap581))
        val array487: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n697 = 0
        val array488 = arrayOf<IIngredient?>(null, null, null)
        val n698 = 2
        val item582 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap582 = HashMap<String, IData>()
        hashMap582["meta"] = ExpandInt.toData(66)
        array488[n698] = item582.withTag(ExpandAnyDict.asData(hashMap582))
        array487[n697] = array488
        array487[1] = arrayOfNulls(3)
        array487[2] = arrayOfNulls(3)
        recipes198.addShaped(withTag174, array487, null)
        val recipes199 = MineTweakerAPI.recipes
        val item583 = ItemBracketHandler.getItem("ExtraTrees:door", 834)
        val hashMap583 = HashMap<String, IData>()
        hashMap583["meta"] = ExpandInt.toData(834)
        val withTag175 = item583.withTag(ExpandAnyDict.asData(hashMap583))
        val array489 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n699 = 1
        val array490 = arrayOfNulls<IIngredient>(3)
        val n700 = 0
        val item584 = ItemBracketHandler.getItem("ExtraTrees:door", 66)
        val hashMap584 = HashMap<String, IData>()
        hashMap584["meta"] = ExpandInt.toData(66)
        array490[n700] = item584.withTag(ExpandAnyDict.asData(hashMap584))
        array490[2] = (null.also { array490[1] = it })
        array489[n699] = array490
        array489[2] = arrayOfNulls(3)
        recipes199.addShaped(withTag175, array489, null)
        val recipes200 = MineTweakerAPI.recipes
        val item585 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap585 = HashMap<String, IData>()
        hashMap585["meta"] = ExpandInt.toData(128)
        recipes200.addShaped(item585.withTag(ExpandAnyDict.asData(hashMap585)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        ItemBracketHandler.getItem("Forestry:planks", 0), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes201 = MineTweakerAPI.recipes
        val item586 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap586 = HashMap<String, IData>()
        hashMap586["meta"] = ExpandInt.toData(128)
        recipes201.addShaped(item586.withTag(ExpandAnyDict.asData(hashMap586)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        ItemBracketHandler.getItem("Forestry:planks", 0), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes202 = MineTweakerAPI.recipes
        val item587 = ItemBracketHandler.getItem("ExtraTrees:door", 384)
        val hashMap587 = HashMap<String, IData>()
        hashMap587["meta"] = ExpandInt.toData(384)
        val withTag176 = item587.withTag(ExpandAnyDict.asData(hashMap587))
        val array491: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n701 = 0
        val array492 = arrayOf<IIngredient?>(null, null, null)
        val n702 = 1
        val item588 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap588 = HashMap<String, IData>()
        hashMap588["meta"] = ExpandInt.toData(128)
        array492[n702] = item588.withTag(ExpandAnyDict.asData(hashMap588))
        array492[2] = null
        array491[n701] = array492
        array491[1] = arrayOfNulls(3)
        array491[2] = arrayOfNulls(3)
        recipes202.addShaped(withTag176, array491, null)
        val recipes203 = MineTweakerAPI.recipes
        val item589 = ItemBracketHandler.getItem("ExtraTrees:door", 640)
        val hashMap589 = HashMap<String, IData>()
        hashMap589["meta"] = ExpandInt.toData(640)
        val withTag177 = item589.withTag(ExpandAnyDict.asData(hashMap589))
        val array493: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n703 = 0
        val array494 = arrayOf<IIngredient?>(null, null, null)
        val n704 = 2
        val item590 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap590 = HashMap<String, IData>()
        hashMap590["meta"] = ExpandInt.toData(128)
        array494[n704] = item590.withTag(ExpandAnyDict.asData(hashMap590))
        array493[n703] = array494
        array493[1] = arrayOfNulls(3)
        array493[2] = arrayOfNulls(3)
        recipes203.addShaped(withTag177, array493, null)
        val recipes204 = MineTweakerAPI.recipes
        val item591 = ItemBracketHandler.getItem("ExtraTrees:door", 896)
        val hashMap591 = HashMap<String, IData>()
        hashMap591["meta"] = ExpandInt.toData(896)
        val withTag178 = item591.withTag(ExpandAnyDict.asData(hashMap591))
        val array495 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n705 = 1
        val array496 = arrayOfNulls<IIngredient>(3)
        val n706 = 0
        val item592 = ItemBracketHandler.getItem("ExtraTrees:door", 128)
        val hashMap592 = HashMap<String, IData>()
        hashMap592["meta"] = ExpandInt.toData(128)
        array496[n706] = item592.withTag(ExpandAnyDict.asData(hashMap592))
        array496[2] = (null.also { array496[1] = it })
        array495[n705] = array496
        array495[2] = arrayOfNulls(3)
        recipes204.addShaped(withTag178, array495, null)
        val recipes205 = MineTweakerAPI.recipes
        val item593 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap593 = HashMap<String, IData>()
        hashMap593["meta"] = ExpandInt.toData(129)
        recipes205.addShaped(item593.withTag(ExpandAnyDict.asData(hashMap593)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        ItemBracketHandler.getItem("Forestry:planks", 1), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes206 = MineTweakerAPI.recipes
        val item594 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap594 = HashMap<String, IData>()
        hashMap594["meta"] = ExpandInt.toData(129)
        recipes206.addShaped(item594.withTag(ExpandAnyDict.asData(hashMap594)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        ItemBracketHandler.getItem("Forestry:planks", 1), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes207 = MineTweakerAPI.recipes
        val item595 = ItemBracketHandler.getItem("ExtraTrees:door", 385)
        val hashMap595 = HashMap<String, IData>()
        hashMap595["meta"] = ExpandInt.toData(385)
        val withTag179 = item595.withTag(ExpandAnyDict.asData(hashMap595))
        val array497: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n707 = 0
        val array498 = arrayOf<IIngredient?>(null, null, null)
        val n708 = 1
        val item596 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap596 = HashMap<String, IData>()
        hashMap596["meta"] = ExpandInt.toData(129)
        array498[n708] = item596.withTag(ExpandAnyDict.asData(hashMap596))
        array498[2] = null
        array497[n707] = array498
        array497[1] = arrayOfNulls(3)
        array497[2] = arrayOfNulls(3)
        recipes207.addShaped(withTag179, array497, null)
        val recipes208 = MineTweakerAPI.recipes
        val item597 = ItemBracketHandler.getItem("ExtraTrees:door", 641)
        val hashMap597 = HashMap<String, IData>()
        hashMap597["meta"] = ExpandInt.toData(641)
        val withTag180 = item597.withTag(ExpandAnyDict.asData(hashMap597))
        val array499: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n709 = 0
        val array500 = arrayOf<IIngredient?>(null, null, null)
        val n710 = 2
        val item598 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap598 = HashMap<String, IData>()
        hashMap598["meta"] = ExpandInt.toData(129)
        array500[n710] = item598.withTag(ExpandAnyDict.asData(hashMap598))
        array499[n709] = array500
        array499[1] = arrayOfNulls(3)
        array499[2] = arrayOfNulls(3)
        recipes208.addShaped(withTag180, array499, null)
        val recipes209 = MineTweakerAPI.recipes
        val item599 = ItemBracketHandler.getItem("ExtraTrees:door", 897)
        val hashMap599 = HashMap<String, IData>()
        hashMap599["meta"] = ExpandInt.toData(897)
        val withTag181 = item599.withTag(ExpandAnyDict.asData(hashMap599))
        val array501 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n711 = 1
        val array502 = arrayOfNulls<IIngredient>(3)
        val n712 = 0
        val item600 = ItemBracketHandler.getItem("ExtraTrees:door", 129)
        val hashMap600 = HashMap<String, IData>()
        hashMap600["meta"] = ExpandInt.toData(129)
        array502[n712] = item600.withTag(ExpandAnyDict.asData(hashMap600))
        array502[2] = (null.also { array502[1] = it })
        array501[n711] = array502
        array501[2] = arrayOfNulls(3)
        recipes209.addShaped(withTag181, array501, null)
        val recipes210 = MineTweakerAPI.recipes
        val item601 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap601 = HashMap<String, IData>()
        hashMap601["meta"] = ExpandInt.toData(130)
        recipes210.addShaped(item601.withTag(ExpandAnyDict.asData(hashMap601)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        ItemBracketHandler.getItem("Forestry:planks", 2), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes211 = MineTweakerAPI.recipes
        val item602 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap602 = HashMap<String, IData>()
        hashMap602["meta"] = ExpandInt.toData(130)
        recipes211.addShaped(item602.withTag(ExpandAnyDict.asData(hashMap602)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        ItemBracketHandler.getItem("Forestry:planks", 2), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes212 = MineTweakerAPI.recipes
        val item603 = ItemBracketHandler.getItem("ExtraTrees:door", 386)
        val hashMap603 = HashMap<String, IData>()
        hashMap603["meta"] = ExpandInt.toData(386)
        val withTag182 = item603.withTag(ExpandAnyDict.asData(hashMap603))
        val array503: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n713 = 0
        val array504 = arrayOf<IIngredient?>(null, null, null)
        val n714 = 1
        val item604 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap604 = HashMap<String, IData>()
        hashMap604["meta"] = ExpandInt.toData(130)
        array504[n714] = item604.withTag(ExpandAnyDict.asData(hashMap604))
        array504[2] = null
        array503[n713] = array504
        array503[1] = arrayOfNulls(3)
        array503[2] = arrayOfNulls(3)
        recipes212.addShaped(withTag182, array503, null)
        val recipes213 = MineTweakerAPI.recipes
        val item605 = ItemBracketHandler.getItem("ExtraTrees:door", 642)
        val hashMap605 = HashMap<String, IData>()
        hashMap605["meta"] = ExpandInt.toData(642)
        val withTag183 = item605.withTag(ExpandAnyDict.asData(hashMap605))
        val array505: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n715 = 0
        val array506 = arrayOf<IIngredient?>(null, null, null)
        val n716 = 2
        val item606 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap606 = HashMap<String, IData>()
        hashMap606["meta"] = ExpandInt.toData(130)
        array506[n716] = item606.withTag(ExpandAnyDict.asData(hashMap606))
        array505[n715] = array506
        array505[1] = arrayOfNulls(3)
        array505[2] = arrayOfNulls(3)
        recipes213.addShaped(withTag183, array505, null)
        val recipes214 = MineTweakerAPI.recipes
        val item607 = ItemBracketHandler.getItem("ExtraTrees:door", 898)
        val hashMap607 = HashMap<String, IData>()
        hashMap607["meta"] = ExpandInt.toData(898)
        val withTag184 = item607.withTag(ExpandAnyDict.asData(hashMap607))
        val array507 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n717 = 1
        val array508 = arrayOfNulls<IIngredient>(3)
        val n718 = 0
        val item608 = ItemBracketHandler.getItem("ExtraTrees:door", 130)
        val hashMap608 = HashMap<String, IData>()
        hashMap608["meta"] = ExpandInt.toData(130)
        array508[n718] = item608.withTag(ExpandAnyDict.asData(hashMap608))
        array508[2] = (null.also { array508[1] = it })
        array507[n717] = array508
        array507[2] = arrayOfNulls(3)
        recipes214.addShaped(withTag184, array507, null)
        val recipes215 = MineTweakerAPI.recipes
        val item609 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap609 = HashMap<String, IData>()
        hashMap609["meta"] = ExpandInt.toData(131)
        recipes215.addShaped(item609.withTag(ExpandAnyDict.asData(hashMap609)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        ItemBracketHandler.getItem("Forestry:planks", 3), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes216 = MineTweakerAPI.recipes
        val item610 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap610 = HashMap<String, IData>()
        hashMap610["meta"] = ExpandInt.toData(131)
        recipes216.addShaped(item610.withTag(ExpandAnyDict.asData(hashMap610)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        ItemBracketHandler.getItem("Forestry:planks", 3), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes217 = MineTweakerAPI.recipes
        val item611 = ItemBracketHandler.getItem("ExtraTrees:door", 387)
        val hashMap611 = HashMap<String, IData>()
        hashMap611["meta"] = ExpandInt.toData(387)
        val withTag185 = item611.withTag(ExpandAnyDict.asData(hashMap611))
        val array509: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n719 = 0
        val array510 = arrayOf<IIngredient?>(null, null, null)
        val n720 = 1
        val item612 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap612 = HashMap<String, IData>()
        hashMap612["meta"] = ExpandInt.toData(131)
        array510[n720] = item612.withTag(ExpandAnyDict.asData(hashMap612))
        array510[2] = null
        array509[n719] = array510
        array509[1] = arrayOfNulls(3)
        array509[2] = arrayOfNulls(3)
        recipes217.addShaped(withTag185, array509, null)
        val recipes218 = MineTweakerAPI.recipes
        val item613 = ItemBracketHandler.getItem("ExtraTrees:door", 643)
        val hashMap613 = HashMap<String, IData>()
        hashMap613["meta"] = ExpandInt.toData(643)
        val withTag186 = item613.withTag(ExpandAnyDict.asData(hashMap613))
        val array511: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n721 = 0
        val array512 = arrayOf<IIngredient?>(null, null, null)
        val n722 = 2
        val item614 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap614 = HashMap<String, IData>()
        hashMap614["meta"] = ExpandInt.toData(131)
        array512[n722] = item614.withTag(ExpandAnyDict.asData(hashMap614))
        array511[n721] = array512
        array511[1] = arrayOfNulls(3)
        array511[2] = arrayOfNulls(3)
        recipes218.addShaped(withTag186, array511, null)
        val recipes219 = MineTweakerAPI.recipes
        val item615 = ItemBracketHandler.getItem("ExtraTrees:door", 899)
        val hashMap615 = HashMap<String, IData>()
        hashMap615["meta"] = ExpandInt.toData(899)
        val withTag187 = item615.withTag(ExpandAnyDict.asData(hashMap615))
        val array513 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n723 = 1
        val array514 = arrayOfNulls<IIngredient>(3)
        val n724 = 0
        val item616 = ItemBracketHandler.getItem("ExtraTrees:door", 131)
        val hashMap616 = HashMap<String, IData>()
        hashMap616["meta"] = ExpandInt.toData(131)
        array514[n724] = item616.withTag(ExpandAnyDict.asData(hashMap616))
        array514[2] = (null.also { array514[1] = it })
        array513[n723] = array514
        array513[2] = arrayOfNulls(3)
        recipes219.addShaped(withTag187, array513, null)
        val recipes220 = MineTweakerAPI.recipes
        val item617 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap617 = HashMap<String, IData>()
        hashMap617["meta"] = ExpandInt.toData(132)
        recipes220.addShaped(item617.withTag(ExpandAnyDict.asData(hashMap617)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        ItemBracketHandler.getItem("Forestry:planks", 4), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes221 = MineTweakerAPI.recipes
        val item618 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap618 = HashMap<String, IData>()
        hashMap618["meta"] = ExpandInt.toData(132)
        recipes221.addShaped(item618.withTag(ExpandAnyDict.asData(hashMap618)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        ItemBracketHandler.getItem("Forestry:planks", 4), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes222 = MineTweakerAPI.recipes
        val item619 = ItemBracketHandler.getItem("ExtraTrees:door", 388)
        val hashMap619 = HashMap<String, IData>()
        hashMap619["meta"] = ExpandInt.toData(388)
        val withTag188 = item619.withTag(ExpandAnyDict.asData(hashMap619))
        val array515: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n725 = 0
        val array516 = arrayOf<IIngredient?>(null, null, null)
        val n726 = 1
        val item620 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap620 = HashMap<String, IData>()
        hashMap620["meta"] = ExpandInt.toData(132)
        array516[n726] = item620.withTag(ExpandAnyDict.asData(hashMap620))
        array516[2] = null
        array515[n725] = array516
        array515[1] = arrayOfNulls(3)
        array515[2] = arrayOfNulls(3)
        recipes222.addShaped(withTag188, array515, null)
        val recipes223 = MineTweakerAPI.recipes
        val item621 = ItemBracketHandler.getItem("ExtraTrees:door", 644)
        val hashMap621 = HashMap<String, IData>()
        hashMap621["meta"] = ExpandInt.toData(644)
        val withTag189 = item621.withTag(ExpandAnyDict.asData(hashMap621))
        val array517: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n727 = 0
        val array518 = arrayOf<IIngredient?>(null, null, null)
        val n728 = 2
        val item622 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap622 = HashMap<String, IData>()
        hashMap622["meta"] = ExpandInt.toData(132)
        array518[n728] = item622.withTag(ExpandAnyDict.asData(hashMap622))
        array517[n727] = array518
        array517[1] = arrayOfNulls(3)
        array517[2] = arrayOfNulls(3)
        recipes223.addShaped(withTag189, array517, null)
        val recipes224 = MineTweakerAPI.recipes
        val item623 = ItemBracketHandler.getItem("ExtraTrees:door", 900)
        val hashMap623 = HashMap<String, IData>()
        hashMap623["meta"] = ExpandInt.toData(900)
        val withTag190 = item623.withTag(ExpandAnyDict.asData(hashMap623))
        val array519 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n729 = 1
        val array520 = arrayOfNulls<IIngredient>(3)
        val n730 = 0
        val item624 = ItemBracketHandler.getItem("ExtraTrees:door", 132)
        val hashMap624 = HashMap<String, IData>()
        hashMap624["meta"] = ExpandInt.toData(132)
        array520[n730] = item624.withTag(ExpandAnyDict.asData(hashMap624))
        array520[2] = (null.also { array520[1] = it })
        array519[n729] = array520
        array519[2] = arrayOfNulls(3)
        recipes224.addShaped(withTag190, array519, null)
        val recipes225 = MineTweakerAPI.recipes
        val item625 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap625 = HashMap<String, IData>()
        hashMap625["meta"] = ExpandInt.toData(133)
        recipes225.addShaped(item625.withTag(ExpandAnyDict.asData(hashMap625)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        ItemBracketHandler.getItem("Forestry:planks", 5), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes226 = MineTweakerAPI.recipes
        val item626 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap626 = HashMap<String, IData>()
        hashMap626["meta"] = ExpandInt.toData(133)
        recipes226.addShaped(item626.withTag(ExpandAnyDict.asData(hashMap626)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        ItemBracketHandler.getItem("Forestry:planks", 5), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes227 = MineTweakerAPI.recipes
        val item627 = ItemBracketHandler.getItem("ExtraTrees:door", 389)
        val hashMap627 = HashMap<String, IData>()
        hashMap627["meta"] = ExpandInt.toData(389)
        val withTag191 = item627.withTag(ExpandAnyDict.asData(hashMap627))
        val array521: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n731 = 0
        val array522 = arrayOf<IIngredient?>(null, null, null)
        val n732 = 1
        val item628 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap628 = HashMap<String, IData>()
        hashMap628["meta"] = ExpandInt.toData(133)
        array522[n732] = item628.withTag(ExpandAnyDict.asData(hashMap628))
        array522[2] = null
        array521[n731] = array522
        array521[1] = arrayOfNulls(3)
        array521[2] = arrayOfNulls(3)
        recipes227.addShaped(withTag191, array521, null)
        val recipes228 = MineTweakerAPI.recipes
        val item629 = ItemBracketHandler.getItem("ExtraTrees:door", 645)
        val hashMap629 = HashMap<String, IData>()
        hashMap629["meta"] = ExpandInt.toData(645)
        val withTag192 = item629.withTag(ExpandAnyDict.asData(hashMap629))
        val array523: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n733 = 0
        val array524 = arrayOf<IIngredient?>(null, null, null)
        val n734 = 2
        val item630 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap630 = HashMap<String, IData>()
        hashMap630["meta"] = ExpandInt.toData(133)
        array524[n734] = item630.withTag(ExpandAnyDict.asData(hashMap630))
        array523[n733] = array524
        array523[1] = arrayOfNulls(3)
        array523[2] = arrayOfNulls(3)
        recipes228.addShaped(withTag192, array523, null)
        val recipes229 = MineTweakerAPI.recipes
        val item631 = ItemBracketHandler.getItem("ExtraTrees:door", 901)
        val hashMap631 = HashMap<String, IData>()
        hashMap631["meta"] = ExpandInt.toData(901)
        val withTag193 = item631.withTag(ExpandAnyDict.asData(hashMap631))
        val array525 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n735 = 1
        val array526 = arrayOfNulls<IIngredient>(3)
        val n736 = 0
        val item632 = ItemBracketHandler.getItem("ExtraTrees:door", 133)
        val hashMap632 = HashMap<String, IData>()
        hashMap632["meta"] = ExpandInt.toData(133)
        array526[n736] = item632.withTag(ExpandAnyDict.asData(hashMap632))
        array526[2] = (null.also { array526[1] = it })
        array525[n735] = array526
        array525[2] = arrayOfNulls(3)
        recipes229.addShaped(withTag193, array525, null)
        val recipes230 = MineTweakerAPI.recipes
        val item633 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap633 = HashMap<String, IData>()
        hashMap633["meta"] = ExpandInt.toData(134)
        recipes230.addShaped(item633.withTag(ExpandAnyDict.asData(hashMap633)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        ItemBracketHandler.getItem("Forestry:planks", 6), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes231 = MineTweakerAPI.recipes
        val item634 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap634 = HashMap<String, IData>()
        hashMap634["meta"] = ExpandInt.toData(134)
        recipes231.addShaped(item634.withTag(ExpandAnyDict.asData(hashMap634)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        ItemBracketHandler.getItem("Forestry:planks", 6), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes232 = MineTweakerAPI.recipes
        val item635 = ItemBracketHandler.getItem("ExtraTrees:door", 390)
        val hashMap635 = HashMap<String, IData>()
        hashMap635["meta"] = ExpandInt.toData(390)
        val withTag194 = item635.withTag(ExpandAnyDict.asData(hashMap635))
        val array527: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n737 = 0
        val array528 = arrayOf<IIngredient?>(null, null, null)
        val n738 = 1
        val item636 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap636 = HashMap<String, IData>()
        hashMap636["meta"] = ExpandInt.toData(134)
        array528[n738] = item636.withTag(ExpandAnyDict.asData(hashMap636))
        array528[2] = null
        array527[n737] = array528
        array527[1] = arrayOfNulls(3)
        array527[2] = arrayOfNulls(3)
        recipes232.addShaped(withTag194, array527, null)
        val recipes233 = MineTweakerAPI.recipes
        val item637 = ItemBracketHandler.getItem("ExtraTrees:door", 646)
        val hashMap637 = HashMap<String, IData>()
        hashMap637["meta"] = ExpandInt.toData(646)
        val withTag195 = item637.withTag(ExpandAnyDict.asData(hashMap637))
        val array529: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n739 = 0
        val array530 = arrayOf<IIngredient?>(null, null, null)
        val n740 = 2
        val item638 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap638 = HashMap<String, IData>()
        hashMap638["meta"] = ExpandInt.toData(134)
        array530[n740] = item638.withTag(ExpandAnyDict.asData(hashMap638))
        array529[n739] = array530
        array529[1] = arrayOfNulls(3)
        array529[2] = arrayOfNulls(3)
        recipes233.addShaped(withTag195, array529, null)
        val recipes234 = MineTweakerAPI.recipes
        val item639 = ItemBracketHandler.getItem("ExtraTrees:door", 902)
        val hashMap639 = HashMap<String, IData>()
        hashMap639["meta"] = ExpandInt.toData(902)
        val withTag196 = item639.withTag(ExpandAnyDict.asData(hashMap639))
        val array531 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n741 = 1
        val array532 = arrayOfNulls<IIngredient>(3)
        val n742 = 0
        val item640 = ItemBracketHandler.getItem("ExtraTrees:door", 134)
        val hashMap640 = HashMap<String, IData>()
        hashMap640["meta"] = ExpandInt.toData(134)
        array532[n742] = item640.withTag(ExpandAnyDict.asData(hashMap640))
        array532[2] = (null.also { array532[1] = it })
        array531[n741] = array532
        array531[2] = arrayOfNulls(3)
        recipes234.addShaped(withTag196, array531, null)
        val recipes235 = MineTweakerAPI.recipes
        val item641 = ItemBracketHandler.getItem("ExtraTrees:door", 135)
        val hashMap641 = HashMap<String, IData>()
        hashMap641["meta"] = ExpandInt.toData(135)
        recipes235.addShaped(item641.withTag(ExpandAnyDict.asData(hashMap641)), arrayOf<Array<IIngredient>>(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                        ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                        ItemBracketHandler.getItem("Forestry:planks", 7), OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        run3()
    }

    private fun run3() {
        val recipes62 = MineTweakerAPI.recipes
        val item147 = ItemBracketHandler.getItem("ExtraTrees:door", 295)
        val hashMap147 = HashMap<String, IData>()
        hashMap147["meta"] = ExpandInt.toData(295)
        val withTag38 = item147.withTag(ExpandAnyDict.asData(hashMap147))
        val array107: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n155 = 0
        val array108 = arrayOf<IIngredient?>(null, null, null)
        val n156 = 1
        val item148 = ItemBracketHandler.getItem("ExtraTrees:door", 39)
        val hashMap148 = HashMap<String, IData>()
        hashMap148["meta"] = ExpandInt.toData(39)
        array108[n156] = item148.withTag(ExpandAnyDict.asData(hashMap148))
        array108[2] = null
        array107[n155] = array108
        array107[1] = arrayOfNulls(3)
        array107[2] = arrayOfNulls(3)
        recipes62.addShaped(withTag38, array107, null)
        val recipes63 = MineTweakerAPI.recipes
        val item149 = ItemBracketHandler.getItem("ExtraTrees:door", 551)
        val hashMap149 = HashMap<String, IData>()
        hashMap149["meta"] = ExpandInt.toData(551)
        val withTag39 = item149.withTag(ExpandAnyDict.asData(hashMap149))
        val array109: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n157 = 0
        val array110 = arrayOf<IIngredient?>(null, null, null)
        val n158 = 2
        val item150 = ItemBracketHandler.getItem("ExtraTrees:door", 39)
        val hashMap150 = HashMap<String, IData>()
        hashMap150["meta"] = ExpandInt.toData(39)
        array110[n158] = item150.withTag(ExpandAnyDict.asData(hashMap150))
        array109[n157] = array110
        array109[1] = arrayOfNulls(3)
        array109[2] = arrayOfNulls(3)
        recipes63.addShaped(withTag39, array109, null)
        val recipes64 = MineTweakerAPI.recipes
        val item151 = ItemBracketHandler.getItem("ExtraTrees:door", 807)
        val hashMap151 = HashMap<String, IData>()
        hashMap151["meta"] = ExpandInt.toData(807)
        val withTag40 = item151.withTag(ExpandAnyDict.asData(hashMap151))
        val array111 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n159 = 1
        val array112 = arrayOfNulls<IIngredient>(3)
        val n160 = 0
        val item152 = ItemBracketHandler.getItem("ExtraTrees:door", 39)
        val hashMap152 = HashMap<String, IData>()
        hashMap152["meta"] = ExpandInt.toData(39)
        array112[n160] = item152.withTag(ExpandAnyDict.asData(hashMap152))
        array112[2] = (null.also { array112[1] = it })
        array111[n159] = array112
        array111[2] = arrayOfNulls(3)
        recipes64.addShaped(withTag40, array111, null)
        val recipes65 = MineTweakerAPI.recipes
        val item153 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap153 = HashMap<String, IData>()
        hashMap153["meta"] = ExpandInt.toData(40)
        val withTag41 = item153.withTag(ExpandAnyDict.asData(hashMap153))
        val array113: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array117: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val array121: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n175 = 0
        val array122 = arrayOf<IIngredient?>(null, null, null)
        val n176 = 1
        val item164 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap164 = HashMap<String, IData>()
        hashMap164["meta"] = ExpandInt.toData(40)
        array122[n176] = item164.withTag(ExpandAnyDict.asData(hashMap164))
        array122[2] = null
        array121[n175] = array122
        array121[1] = arrayOfNulls(3)
        array121[2] = arrayOfNulls(3)
        recipes67.addShaped(withTag43, array121, null)
        val recipes68 = MineTweakerAPI.recipes
        val item165 = ItemBracketHandler.getItem("ExtraTrees:door", 552)
        val hashMap165 = HashMap<String, IData>()
        hashMap165["meta"] = ExpandInt.toData(552)
        val withTag44 = item165.withTag(ExpandAnyDict.asData(hashMap165))
        val array123: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n177 = 0
        val array124 = arrayOf<IIngredient?>(null, null, null)
        val n178 = 2
        val item166 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap166 = HashMap<String, IData>()
        hashMap166["meta"] = ExpandInt.toData(40)
        array124[n178] = item166.withTag(ExpandAnyDict.asData(hashMap166))
        array123[n177] = array124
        array123[1] = arrayOfNulls(3)
        array123[2] = arrayOfNulls(3)
        recipes68.addShaped(withTag44, array123, null)
        val recipes69 = MineTweakerAPI.recipes
        val item167 = ItemBracketHandler.getItem("ExtraTrees:door", 808)
        val hashMap167 = HashMap<String, IData>()
        hashMap167["meta"] = ExpandInt.toData(808)
        val withTag45 = item167.withTag(ExpandAnyDict.asData(hashMap167))
        val array125 = arrayOf<Array<IIngredient?>?>(arrayOfNulls(3), null, null)
        val n179 = 1
        val array126 = arrayOfNulls<IIngredient>(3)
        val n180 = 0
        val item168 = ItemBracketHandler.getItem("ExtraTrees:door", 40)
        val hashMap168 = HashMap<String, IData>()
        hashMap168["meta"] = ExpandInt.toData(40)
        array126[n180] = item168.withTag(ExpandAnyDict.asData(hashMap168))
        array126[2] = (null.also { array126[1] = it })
        array125[n179] = array126
        array125[2] = arrayOfNulls(3)
        recipes69.addShaped(withTag45, array125, null)
        val recipes70 = MineTweakerAPI.recipes
        val item169 = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap169 = HashMap<String, IData>()
        hashMap169["meta"] = ExpandInt.toData(41)
        val withTag46 = item169.withTag(ExpandAnyDict.asData(hashMap169))
        val array127: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
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
        val hashMap173: HashMap<String, IData> = HashMap<String, IData>()
        hashMap173["meta"] = ExpandInt.toData(9)
        array130[n187] = item173.withTag(ExpandAnyDict.asData(hashMap173))
        array130[2] = OreBracketHandler.getOre("craftingToolSaw")
        array127[n185] = array130
        recipes70.addShaped(withTag46, array127, null)
        val recipes71: IRecipeManager = MineTweakerAPI.recipes
        val item174: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap174: HashMap<String, IData> = HashMap<String, IData>()
        hashMap174["meta"] = ExpandInt.toData(41)
        val withTag47: IItemStack = item174.withTag(ExpandAnyDict.asData(hashMap174))
        val array131: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n188 = 0
        val array132: Array<IIngredient?> = arrayOfNulls(3)
        val n189 = 0
        val item175: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap175: HashMap<String, IData> = HashMap<String, IData>()
        hashMap175["meta"] = ExpandInt.toData(9)
        array132[n189] = item175.withTag(ExpandAnyDict.asData(hashMap175))
        array132[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array132[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array131[n188] = array132
        val n190 = 1
        val array133: Array<IIngredient?> = arrayOfNulls(3)
        val n191 = 0
        val item176: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap176: HashMap<String, IData> = HashMap<String, IData>()
        hashMap176["meta"] = ExpandInt.toData(9)
        array133[n191] = item176.withTag(ExpandAnyDict.asData(hashMap176))
        array133[1] = OreBracketHandler.getOre("ringCopper")
        array133[2] = OreBracketHandler.getOre("screwCopper")
        array131[n190] = array133
        val n192 = 2
        val array134: Array<IIngredient?> = arrayOfNulls(3)
        val n193 = 0
        val item177: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap177: HashMap<String, IData> = HashMap<String, IData>()
        hashMap177["meta"] = ExpandInt.toData(9)
        array134[n193] = item177.withTag(ExpandAnyDict.asData(hashMap177))
        val n194 = 1
        val item178: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap178: HashMap<String, IData> = HashMap<String, IData>()
        hashMap178["meta"] = ExpandInt.toData(9)
        array134[n194] = item178.withTag(ExpandAnyDict.asData(hashMap178))
        array134[2] = OreBracketHandler.getOre("craftingToolSaw")
        array131[n192] = array134
        recipes71.addShaped(withTag47, array131, null)
        val recipes72: IRecipeManager = MineTweakerAPI.recipes
        val item179: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 297)
        val hashMap179: HashMap<String, IData> = HashMap<String, IData>()
        hashMap179["meta"] = ExpandInt.toData(297)
        val withTag48: IItemStack = item179.withTag(ExpandAnyDict.asData(hashMap179))
        val array135: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n195 = 0
        val array136: Array<IIngredient?> = arrayOfNulls(3)
        val n196 = 1
        val item180: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap180: HashMap<String, IData> = HashMap<String, IData>()
        hashMap180["meta"] = ExpandInt.toData(41)
        array136[n196] = item180.withTag(ExpandAnyDict.asData(hashMap180))
        array136[2] = null
        array135[n195] = array136
        array135[1] = arrayOfNulls(3)
        array135[2] = arrayOfNulls(3)
        recipes72.addShaped(withTag48, array135, null)
        val recipes73: IRecipeManager = MineTweakerAPI.recipes
        val item181: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 553)
        val hashMap181: HashMap<String, IData> = HashMap<String, IData>()
        hashMap181["meta"] = ExpandInt.toData(553)
        val withTag49: IItemStack = item181.withTag(ExpandAnyDict.asData(hashMap181))
        val array137: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n197 = 0
        val array138: Array<IIngredient?> = arrayOfNulls(3)
        val n198 = 2
        val item182: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap182: HashMap<String, IData> = HashMap<String, IData>()
        hashMap182["meta"] = ExpandInt.toData(41)
        array138[n198] = item182.withTag(ExpandAnyDict.asData(hashMap182))
        array137[n197] = array138
        array137[1] = arrayOfNulls(3)
        array137[2] = arrayOfNulls(3)
        recipes73.addShaped(withTag49, array137, null)
        val recipes74: IRecipeManager = MineTweakerAPI.recipes
        val item183: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 809)
        val hashMap183: HashMap<String, IData> = HashMap<String, IData>()
        hashMap183["meta"] = ExpandInt.toData(809)
        val withTag50: IItemStack = item183.withTag(ExpandAnyDict.asData(hashMap183))
        val array139: Array<Array<IIngredient?>?> = arrayOf(arrayOfNulls(3), null, null)
        val n199 = 1
        val array140: Array<IIngredient?> = arrayOfNulls(3)
        val n200 = 0
        val item184: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 41)
        val hashMap184: HashMap<String, IData> = HashMap<String, IData>()
        hashMap184["meta"] = ExpandInt.toData(41)
        array140[n200] = item184.withTag(ExpandAnyDict.asData(hashMap184))
        array140[2] = (null.also { array140[1] = it })
        array139[n199] = array140
        array139[2] = arrayOfNulls(3)
        recipes74.addShaped(withTag50, array139, null)
        val recipes75: IRecipeManager = MineTweakerAPI.recipes
        val item185: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap185: HashMap<String, IData> = HashMap<String, IData>()
        hashMap185["meta"] = ExpandInt.toData(42)
        val withTag51: IItemStack = item185.withTag(ExpandAnyDict.asData(hashMap185))
        val array141: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n201 = 0
        val array142: Array<IIngredient?> = arrayOfNulls(3)
        val n202 = 0
        val item186: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap186: HashMap<String, IData> = HashMap<String, IData>()
        hashMap186["meta"] = ExpandInt.toData(10)
        array142[n202] = item186.withTag(ExpandAnyDict.asData(hashMap186))
        array142[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array142[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array141[n201] = array142
        val n203 = 1
        val array143: Array<IIngredient?> = arrayOfNulls(3)
        val n204 = 0
        val item187: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap187: HashMap<String, IData> = HashMap<String, IData>()
        hashMap187["meta"] = ExpandInt.toData(10)
        array143[n204] = item187.withTag(ExpandAnyDict.asData(hashMap187))
        array143[1] = OreBracketHandler.getOre("ringAnyIron")
        array143[2] = OreBracketHandler.getOre("screwAnyIron")
        array141[n203] = array143
        val n205 = 2
        val array144: Array<IIngredient?> = arrayOfNulls(3)
        val n206 = 0
        val item188: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap188: HashMap<String, IData> = HashMap<String, IData>()
        hashMap188["meta"] = ExpandInt.toData(10)
        array144[n206] = item188.withTag(ExpandAnyDict.asData(hashMap188))
        val n207 = 1
        val item189: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap189: HashMap<String, IData> = HashMap<String, IData>()
        hashMap189["meta"] = ExpandInt.toData(10)
        array144[n207] = item189.withTag(ExpandAnyDict.asData(hashMap189))
        array144[2] = OreBracketHandler.getOre("craftingToolSaw")
        array141[n205] = array144
        recipes75.addShaped(withTag51, array141, null)
        val recipes76: IRecipeManager = MineTweakerAPI.recipes
        val item190: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap190: HashMap<String, IData> = HashMap<String, IData>()
        hashMap190["meta"] = ExpandInt.toData(42)
        val withTag52: IItemStack = item190.withTag(ExpandAnyDict.asData(hashMap190))
        val array145: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n208 = 0
        val array146: Array<IIngredient?> = arrayOfNulls(3)
        val n209 = 0
        val item191: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap191: HashMap<String, IData> = HashMap<String, IData>()
        hashMap191["meta"] = ExpandInt.toData(10)
        array146[n209] = item191.withTag(ExpandAnyDict.asData(hashMap191))
        array146[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array146[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array145[n208] = array146
        val n210 = 1
        val array147: Array<IIngredient?> = arrayOfNulls(3)
        val n211 = 0
        val item192: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap192: HashMap<String, IData> = HashMap<String, IData>()
        hashMap192["meta"] = ExpandInt.toData(10)
        array147[n211] = item192.withTag(ExpandAnyDict.asData(hashMap192))
        array147[1] = OreBracketHandler.getOre("ringCopper")
        array147[2] = OreBracketHandler.getOre("screwCopper")
        array145[n210] = array147
        val n212 = 2
        val array148: Array<IIngredient?> = arrayOfNulls(3)
        val n213 = 0
        val item193: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap193: HashMap<String, IData> = HashMap<String, IData>()
        hashMap193["meta"] = ExpandInt.toData(10)
        array148[n213] = item193.withTag(ExpandAnyDict.asData(hashMap193))
        val n214 = 1
        val item194: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap194: HashMap<String, IData> = HashMap<String, IData>()
        hashMap194["meta"] = ExpandInt.toData(10)
        array148[n214] = item194.withTag(ExpandAnyDict.asData(hashMap194))
        array148[2] = OreBracketHandler.getOre("craftingToolSaw")
        array145[n212] = array148
        recipes76.addShaped(withTag52, array145, null)
        val recipes77: IRecipeManager = MineTweakerAPI.recipes
        val item195: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 298)
        val hashMap195: HashMap<String, IData> = HashMap<String, IData>()
        hashMap195["meta"] = ExpandInt.toData(298)
        val withTag53: IItemStack = item195.withTag(ExpandAnyDict.asData(hashMap195))
        val array149: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n215 = 0
        val array150: Array<IIngredient?> = arrayOfNulls(3)
        val n216 = 1
        val item196: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap196: HashMap<String, IData> = HashMap<String, IData>()
        hashMap196["meta"] = ExpandInt.toData(42)
        array150[n216] = item196.withTag(ExpandAnyDict.asData(hashMap196))
        array150[2] = null
        array149[n215] = array150
        array149[1] = arrayOfNulls(3)
        array149[2] = arrayOfNulls(3)
        recipes77.addShaped(withTag53, array149, null)
        val recipes78: IRecipeManager = MineTweakerAPI.recipes
        val item197: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 554)
        val hashMap197: HashMap<String, IData> = HashMap<String, IData>()
        hashMap197["meta"] = ExpandInt.toData(554)
        val withTag54: IItemStack = item197.withTag(ExpandAnyDict.asData(hashMap197))
        val array151: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n217 = 0
        val array152: Array<IIngredient?> = arrayOfNulls(3)
        val n218 = 2
        val item198: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap198: HashMap<String, IData> = HashMap<String, IData>()
        hashMap198["meta"] = ExpandInt.toData(42)
        array152[n218] = item198.withTag(ExpandAnyDict.asData(hashMap198))
        array151[n217] = array152
        array151[1] = arrayOfNulls(3)
        array151[2] = arrayOfNulls(3)
        recipes78.addShaped(withTag54, array151, null)
        val recipes79: IRecipeManager = MineTweakerAPI.recipes
        val item199: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 810)
        val hashMap199: HashMap<String, IData> = HashMap<String, IData>()
        hashMap199["meta"] = ExpandInt.toData(810)
        val withTag55: IItemStack = item199.withTag(ExpandAnyDict.asData(hashMap199))
        val array153: Array<Array<IIngredient?>?> = arrayOf(arrayOfNulls(3), null, null)
        val n219 = 1
        val array154: Array<IIngredient?> = arrayOfNulls(3)
        val n220 = 0
        val item200: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 42)
        val hashMap200: HashMap<String, IData> = HashMap<String, IData>()
        hashMap200["meta"] = ExpandInt.toData(42)
        array154[n220] = item200.withTag(ExpandAnyDict.asData(hashMap200))
        array154[2] = (null.also { array154[1] = it })
        array153[n219] = array154
        array153[2] = arrayOfNulls(3)
        recipes79.addShaped(withTag55, array153, null)
        val recipes80: IRecipeManager = MineTweakerAPI.recipes
        val item201: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap201: HashMap<String, IData> = HashMap<String, IData>()
        hashMap201["meta"] = ExpandInt.toData(43)
        val withTag56: IItemStack = item201.withTag(ExpandAnyDict.asData(hashMap201))
        val array155: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n221 = 0
        val array156: Array<IIngredient?> = arrayOfNulls(3)
        val n222 = 0
        val item202: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap202: HashMap<String, IData> = HashMap<String, IData>()
        hashMap202["meta"] = ExpandInt.toData(11)
        array156[n222] = item202.withTag(ExpandAnyDict.asData(hashMap202))
        array156[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array156[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array155[n221] = array156
        val n223 = 1
        val array157: Array<IIngredient?> = arrayOfNulls(3)
        val n224 = 0
        val item203: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap203: HashMap<String, IData> = HashMap<String, IData>()
        hashMap203["meta"] = ExpandInt.toData(11)
        array157[n224] = item203.withTag(ExpandAnyDict.asData(hashMap203))
        array157[1] = OreBracketHandler.getOre("ringAnyIron")
        array157[2] = OreBracketHandler.getOre("screwAnyIron")
        array155[n223] = array157
        val n225 = 2
        val array158: Array<IIngredient?> = arrayOfNulls(3)
        val n226 = 0
        val item204: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap204: HashMap<String, IData> = HashMap<String, IData>()
        hashMap204["meta"] = ExpandInt.toData(11)
        array158[n226] = item204.withTag(ExpandAnyDict.asData(hashMap204))
        val n227 = 1
        val item205: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap205: HashMap<String, IData> = HashMap<String, IData>()
        hashMap205["meta"] = ExpandInt.toData(11)
        array158[n227] = item205.withTag(ExpandAnyDict.asData(hashMap205))
        array158[2] = OreBracketHandler.getOre("craftingToolSaw")
        array155[n225] = array158
        recipes80.addShaped(withTag56, array155, null)
        val recipes81: IRecipeManager = MineTweakerAPI.recipes
        val item206: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap206: HashMap<String, IData> = HashMap<String, IData>()
        hashMap206["meta"] = ExpandInt.toData(43)
        val withTag57: IItemStack = item206.withTag(ExpandAnyDict.asData(hashMap206))
        val array159: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n228 = 0
        val array160: Array<IIngredient?> = arrayOfNulls(3)
        val n229 = 0
        val item207: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap207: HashMap<String, IData> = HashMap<String, IData>()
        hashMap207["meta"] = ExpandInt.toData(11)
        array160[n229] = item207.withTag(ExpandAnyDict.asData(hashMap207))
        array160[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array160[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array159[n228] = array160
        val n230 = 1
        val array161: Array<IIngredient?> = arrayOfNulls(3)
        val n231 = 0
        val item208: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap208: HashMap<String, IData> = HashMap<String, IData>()
        hashMap208["meta"] = ExpandInt.toData(11)
        array161[n231] = item208.withTag(ExpandAnyDict.asData(hashMap208))
        array161[1] = OreBracketHandler.getOre("ringCopper")
        array161[2] = OreBracketHandler.getOre("screwCopper")
        array159[n230] = array161
        val n232 = 2
        val array162: Array<IIngredient?> = arrayOfNulls(3)
        val n233 = 0
        val item209: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap209: HashMap<String, IData> = HashMap<String, IData>()
        hashMap209["meta"] = ExpandInt.toData(11)
        array162[n233] = item209.withTag(ExpandAnyDict.asData(hashMap209))
        val n234 = 1
        val item210: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap210: HashMap<String, IData> = HashMap<String, IData>()
        hashMap210["meta"] = ExpandInt.toData(11)
        array162[n234] = item210.withTag(ExpandAnyDict.asData(hashMap210))
        array162[2] = OreBracketHandler.getOre("craftingToolSaw")
        array159[n232] = array162
        recipes81.addShaped(withTag57, array159, null)
        val recipes82: IRecipeManager = MineTweakerAPI.recipes
        val item211: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 299)
        val hashMap211: HashMap<String, IData> = HashMap<String, IData>()
        hashMap211["meta"] = ExpandInt.toData(299)
        val withTag58: IItemStack = item211.withTag(ExpandAnyDict.asData(hashMap211))
        val array163: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n235 = 0
        val array164: Array<IIngredient?> = arrayOfNulls(3)
        val n236 = 1
        val item212: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap212: HashMap<String, IData> = HashMap<String, IData>()
        hashMap212["meta"] = ExpandInt.toData(43)
        array164[n236] = item212.withTag(ExpandAnyDict.asData(hashMap212))
        array164[2] = null
        array163[n235] = array164
        array163[1] = arrayOfNulls(3)
        array163[2] = arrayOfNulls(3)
        recipes82.addShaped(withTag58, array163, null)
        val recipes83: IRecipeManager = MineTweakerAPI.recipes
        val item213: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 555)
        val hashMap213: HashMap<String, IData> = HashMap<String, IData>()
        hashMap213["meta"] = ExpandInt.toData(555)
        val withTag59: IItemStack = item213.withTag(ExpandAnyDict.asData(hashMap213))
        val array165: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n237 = 0
        val array166: Array<IIngredient?> = arrayOfNulls(3)
        val n238 = 2
        val item214: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap214: HashMap<String, IData> = HashMap<String, IData>()
        hashMap214["meta"] = ExpandInt.toData(43)
        array166[n238] = item214.withTag(ExpandAnyDict.asData(hashMap214))
        array165[n237] = array166
        array165[1] = arrayOfNulls(3)
        array165[2] = arrayOfNulls(3)
        recipes83.addShaped(withTag59, array165, null)
        val recipes84: IRecipeManager = MineTweakerAPI.recipes
        val item215: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 811)
        val hashMap215: HashMap<String, IData> = HashMap<String, IData>()
        hashMap215["meta"] = ExpandInt.toData(811)
        val withTag60: IItemStack = item215.withTag(ExpandAnyDict.asData(hashMap215))
        val array167: Array<Array<IIngredient?>?> = arrayOf(arrayOfNulls(3), null, null)
        val n239 = 1
        val array168: Array<IIngredient?> = arrayOfNulls(3)
        val n240 = 0
        val item216: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 43)
        val hashMap216: HashMap<String, IData> = HashMap<String, IData>()
        hashMap216["meta"] = ExpandInt.toData(43)
        array168[n240] = item216.withTag(ExpandAnyDict.asData(hashMap216))
        array168[2] = (null.also { array168[1] = it })
        array167[n239] = array168
        array167[2] = arrayOfNulls(3)
        recipes84.addShaped(withTag60, array167, null)
        val recipes85: IRecipeManager = MineTweakerAPI.recipes
        val item217: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap217: HashMap<String, IData> = HashMap<String, IData>()
        hashMap217["meta"] = ExpandInt.toData(44)
        val withTag61: IItemStack = item217.withTag(ExpandAnyDict.asData(hashMap217))
        val array169: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n241 = 0
        val array170: Array<IIngredient?> = arrayOfNulls(3)
        val n242 = 0
        val item218: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap218: HashMap<String, IData> = HashMap<String, IData>()
        hashMap218["meta"] = ExpandInt.toData(12)
        array170[n242] = item218.withTag(ExpandAnyDict.asData(hashMap218))
        array170[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array170[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array169[n241] = array170
        val n243 = 1
        val array171: Array<IIngredient?> = arrayOfNulls(3)
        val n244 = 0
        val item219: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap219: HashMap<String, IData> = HashMap<String, IData>()
        hashMap219["meta"] = ExpandInt.toData(12)
        array171[n244] = item219.withTag(ExpandAnyDict.asData(hashMap219))
        array171[1] = OreBracketHandler.getOre("ringAnyIron")
        array171[2] = OreBracketHandler.getOre("screwAnyIron")
        array169[n243] = array171
        val n245 = 2
        val array172: Array<IIngredient?> = arrayOfNulls(3)
        val n246 = 0
        val item220: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap220: HashMap<String, IData> = HashMap<String, IData>()
        hashMap220["meta"] = ExpandInt.toData(12)
        array172[n246] = item220.withTag(ExpandAnyDict.asData(hashMap220))
        val n247 = 1
        val item221: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap221: HashMap<String, IData> = HashMap<String, IData>()
        hashMap221["meta"] = ExpandInt.toData(12)
        array172[n247] = item221.withTag(ExpandAnyDict.asData(hashMap221))
        array172[2] = OreBracketHandler.getOre("craftingToolSaw")
        array169[n245] = array172
        recipes85.addShaped(withTag61, array169, null)
        val recipes86: IRecipeManager = MineTweakerAPI.recipes
        val item222: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap222: HashMap<String, IData> = HashMap<String, IData>()
        hashMap222["meta"] = ExpandInt.toData(44)
        val withTag62: IItemStack = item222.withTag(ExpandAnyDict.asData(hashMap222))
        val array173: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n248 = 0
        val array174: Array<IIngredient?> = arrayOfNulls(3)
        val n249 = 0
        val item223: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap223: HashMap<String, IData> = HashMap<String, IData>()
        hashMap223["meta"] = ExpandInt.toData(12)
        array174[n249] = item223.withTag(ExpandAnyDict.asData(hashMap223))
        array174[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array174[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array173[n248] = array174
        val n250 = 1
        val array175: Array<IIngredient?> = arrayOfNulls(3)
        val n251 = 0
        val item224: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap224: HashMap<String, IData> = HashMap<String, IData>()
        hashMap224["meta"] = ExpandInt.toData(12)
        array175[n251] = item224.withTag(ExpandAnyDict.asData(hashMap224))
        array175[1] = OreBracketHandler.getOre("ringCopper")
        array175[2] = OreBracketHandler.getOre("screwCopper")
        array173[n250] = array175
        val n252 = 2
        val array176: Array<IIngredient?> = arrayOfNulls(3)
        val n253 = 0
        val item225: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap225: HashMap<String, IData> = HashMap<String, IData>()
        hashMap225["meta"] = ExpandInt.toData(12)
        array176[n253] = item225.withTag(ExpandAnyDict.asData(hashMap225))
        val n254 = 1
        val item226: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap226: HashMap<String, IData> = HashMap<String, IData>()
        hashMap226["meta"] = ExpandInt.toData(12)
        array176[n254] = item226.withTag(ExpandAnyDict.asData(hashMap226))
        array176[2] = OreBracketHandler.getOre("craftingToolSaw")
        array173[n252] = array176
        recipes86.addShaped(withTag62, array173, null)
        val recipes87: IRecipeManager = MineTweakerAPI.recipes
        val item227: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 300)
        val hashMap227: HashMap<String, IData> = HashMap<String, IData>()
        hashMap227["meta"] = ExpandInt.toData(300)
        val withTag63: IItemStack = item227.withTag(ExpandAnyDict.asData(hashMap227))
        val array177: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n255 = 0
        val array178: Array<IIngredient?> = arrayOfNulls(3)
        val n256 = 1
        val item228: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap228: HashMap<String, IData> = HashMap<String, IData>()
        hashMap228["meta"] = ExpandInt.toData(44)
        array178[n256] = item228.withTag(ExpandAnyDict.asData(hashMap228))
        array178[2] = null
        array177[n255] = array178
        array177[1] = arrayOfNulls(3)
        array177[2] = arrayOfNulls(3)
        recipes87.addShaped(withTag63, array177, null)
        val recipes88: IRecipeManager = MineTweakerAPI.recipes
        val item229: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 556)
        val hashMap229: HashMap<String, IData> = HashMap<String, IData>()
        hashMap229["meta"] = ExpandInt.toData(556)
        val withTag64: IItemStack = item229.withTag(ExpandAnyDict.asData(hashMap229))
        val array179: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n257 = 0
        val array180: Array<IIngredient?> = arrayOfNulls(3)
        val n258 = 2
        val item230: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap230: HashMap<String, IData> = HashMap<String, IData>()
        hashMap230["meta"] = ExpandInt.toData(44)
        array180[n258] = item230.withTag(ExpandAnyDict.asData(hashMap230))
        array179[n257] = array180
        array179[1] = arrayOfNulls(3)
        array179[2] = arrayOfNulls(3)
        recipes88.addShaped(withTag64, array179, null)
        val recipes89: IRecipeManager = MineTweakerAPI.recipes
        val item231: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 812)
        val hashMap231: HashMap<String, IData> = HashMap<String, IData>()
        hashMap231["meta"] = ExpandInt.toData(812)
        val withTag65: IItemStack = item231.withTag(ExpandAnyDict.asData(hashMap231))
        val array181: Array<Array<IIngredient?>?> = arrayOf(arrayOfNulls(3), null, null)
        val n259 = 1
        val array182: Array<IIngredient?> = arrayOfNulls(3)
        val n260 = 0
        val item232: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 44)
        val hashMap232: HashMap<String, IData> = HashMap<String, IData>()
        hashMap232["meta"] = ExpandInt.toData(44)
        array182[n260] = item232.withTag(ExpandAnyDict.asData(hashMap232))
        array182[2] = (null.also { array182[1] = it })
        array181[n259] = array182
        array181[2] = arrayOfNulls(3)
        recipes89.addShaped(withTag65, array181, null)
        val recipes90: IRecipeManager = MineTweakerAPI.recipes
        val item233: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap233: HashMap<String, IData> = HashMap<String, IData>()
        hashMap233["meta"] = ExpandInt.toData(45)
        val withTag66: IItemStack = item233.withTag(ExpandAnyDict.asData(hashMap233))
        val array183: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n261 = 0
        val array184: Array<IIngredient?> = arrayOfNulls(3)
        val n262 = 0
        val item234: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap234: HashMap<String, IData> = HashMap<String, IData>()
        hashMap234["meta"] = ExpandInt.toData(13)
        array184[n262] = item234.withTag(ExpandAnyDict.asData(hashMap234))
        array184[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array184[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array183[n261] = array184
        val n263 = 1
        val array185: Array<IIngredient?> = arrayOfNulls(3)
        val n264 = 0
        val item235: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap235: HashMap<String, IData> = HashMap<String, IData>()
        hashMap235["meta"] = ExpandInt.toData(13)
        array185[n264] = item235.withTag(ExpandAnyDict.asData(hashMap235))
        array185[1] = OreBracketHandler.getOre("ringAnyIron")
        array185[2] = OreBracketHandler.getOre("screwAnyIron")
        array183[n263] = array185
        val n265 = 2
        val array186: Array<IIngredient?> = arrayOfNulls(3)
        val n266 = 0
        val item236: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap236: HashMap<String, IData> = HashMap<String, IData>()
        hashMap236["meta"] = ExpandInt.toData(12)
        array186[n266] = item236.withTag(ExpandAnyDict.asData(hashMap236))
        val n267 = 1
        val item237: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap237: HashMap<String, IData> = HashMap<String, IData>()
        hashMap237["meta"] = ExpandInt.toData(13)
        array186[n267] = item237.withTag(ExpandAnyDict.asData(hashMap237))
        array186[2] = OreBracketHandler.getOre("craftingToolSaw")
        array183[n265] = array186
        recipes90.addShaped(withTag66, array183, null)
        val recipes91: IRecipeManager = MineTweakerAPI.recipes
        val item238: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap238: HashMap<String, IData> = HashMap<String, IData>()
        hashMap238["meta"] = ExpandInt.toData(45)
        val withTag67: IItemStack = item238.withTag(ExpandAnyDict.asData(hashMap238))
        val array187: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n268 = 0
        val array188: Array<IIngredient?> = arrayOfNulls(3)
        val n269 = 0
        val item239: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap239: HashMap<String, IData> = HashMap<String, IData>()
        hashMap239["meta"] = ExpandInt.toData(13)
        array188[n269] = item239.withTag(ExpandAnyDict.asData(hashMap239))
        array188[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array188[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array187[n268] = array188
        val n270 = 1
        val array189: Array<IIngredient?> = arrayOfNulls(3)
        val n271 = 0
        val item240: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap240: HashMap<String, IData> = HashMap<String, IData>()
        hashMap240["meta"] = ExpandInt.toData(13)
        array189[n271] = item240.withTag(ExpandAnyDict.asData(hashMap240))
        array189[1] = OreBracketHandler.getOre("ringCopper")
        array189[2] = OreBracketHandler.getOre("screwCopper")
        array187[n270] = array189
        val n272 = 2
        val array190: Array<IIngredient?> = arrayOfNulls(3)
        val n273 = 0
        val item241: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap241: HashMap<String, IData> = HashMap<String, IData>()
        hashMap241["meta"] = ExpandInt.toData(13)
        array190[n273] = item241.withTag(ExpandAnyDict.asData(hashMap241))
        val n274 = 1
        val item242: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap242: HashMap<String, IData> = HashMap<String, IData>()
        hashMap242["meta"] = ExpandInt.toData(13)
        array190[n274] = item242.withTag(ExpandAnyDict.asData(hashMap242))
        array190[2] = OreBracketHandler.getOre("craftingToolSaw")
        array187[n272] = array190
        recipes91.addShaped(withTag67, array187, null)
        val recipes92: IRecipeManager = MineTweakerAPI.recipes
        val item243: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 301)
        val hashMap243: HashMap<String, IData> = HashMap<String, IData>()
        hashMap243["meta"] = ExpandInt.toData(301)
        val withTag68: IItemStack = item243.withTag(ExpandAnyDict.asData(hashMap243))
        val array191: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n275 = 0
        val array192: Array<IIngredient?> = arrayOfNulls(3)
        val n276 = 1
        val item244: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap244: HashMap<String, IData> = HashMap<String, IData>()
        hashMap244["meta"] = ExpandInt.toData(45)
        array192[n276] = item244.withTag(ExpandAnyDict.asData(hashMap244))
        array192[2] = null
        array191[n275] = array192
        array191[1] = arrayOfNulls(3)
        array191[2] = arrayOfNulls(3)
        recipes92.addShaped(withTag68, array191, null)
        val recipes93: IRecipeManager = MineTweakerAPI.recipes
        val item245: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 557)
        val hashMap245: HashMap<String, IData> = HashMap<String, IData>()
        hashMap245["meta"] = ExpandInt.toData(557)
        val withTag69: IItemStack = item245.withTag(ExpandAnyDict.asData(hashMap245))
        val array193: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n277 = 0
        val array194: Array<IIngredient?> = arrayOfNulls(3)
        val n278 = 2
        val item246: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap246: HashMap<String, IData> = HashMap<String, IData>()
        hashMap246["meta"] = ExpandInt.toData(45)
        array194[n278] = item246.withTag(ExpandAnyDict.asData(hashMap246))
        array193[n277] = array194
        array193[1] = arrayOfNulls(3)
        array193[2] = arrayOfNulls(3)
        recipes93.addShaped(withTag69, array193, null)
        val recipes94: IRecipeManager = MineTweakerAPI.recipes
        val item247: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 813)
        val hashMap247: HashMap<String, IData> = HashMap<String, IData>()
        hashMap247["meta"] = ExpandInt.toData(813)
        val withTag70: IItemStack = item247.withTag(ExpandAnyDict.asData(hashMap247))
        val array195: Array<Array<IIngredient?>?> = arrayOf(arrayOfNulls(3), null, null)
        val n279 = 1
        val array196: Array<IIngredient?> = arrayOfNulls(3)
        val n280 = 0
        val item248: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 45)
        val hashMap248: HashMap<String, IData> = HashMap<String, IData>()
        hashMap248["meta"] = ExpandInt.toData(45)
        array196[n280] = item248.withTag(ExpandAnyDict.asData(hashMap248))
        array196[2] = (null.also { array196[1] = it })
        array195[n279] = array196
        array195[2] = arrayOfNulls(3)
        recipes94.addShaped(withTag70, array195, null)
        val recipes95: IRecipeManager = MineTweakerAPI.recipes
        val item249: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 46)
        val hashMap249: HashMap<String, IData> = HashMap<String, IData>()
        hashMap249["meta"] = ExpandInt.toData(46)
        val withTag71: IItemStack = item249.withTag(ExpandAnyDict.asData(hashMap249))
        val array197: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n281 = 0
        val array198: Array<IIngredient?> = arrayOfNulls(3)
        val n282 = 0
        val item250: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap250: HashMap<String, IData> = HashMap<String, IData>()
        hashMap250["meta"] = ExpandInt.toData(14)
        array198[n282] = item250.withTag(ExpandAnyDict.asData(hashMap250))
        array198[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array198[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array197[n281] = array198
        val n283 = 1
        val array199: Array<IIngredient?> = arrayOfNulls(3)
        val n284 = 0
        val item251: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap251: HashMap<String, IData> = HashMap<String, IData>()
        hashMap251["meta"] = ExpandInt.toData(14)
        array199[n284] = item251.withTag(ExpandAnyDict.asData(hashMap251))
        array199[1] = OreBracketHandler.getOre("ringAnyIron")
        array199[2] = OreBracketHandler.getOre("screwAnyIron")
        array197[n283] = array199
        val n285 = 2
        val array200: Array<IIngredient?> = arrayOfNulls(3)
        val n286 = 0
        val item252: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap252: HashMap<String, IData> = HashMap<String, IData>()
        hashMap252["meta"] = ExpandInt.toData(14)
        array200[n286] = item252.withTag(ExpandAnyDict.asData(hashMap252))
        val n287 = 1
        val item253: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap253: HashMap<String, IData> = HashMap<String, IData>()
        hashMap253["meta"] = ExpandInt.toData(14)
        array200[n287] = item253.withTag(ExpandAnyDict.asData(hashMap253))
        array200[2] = OreBracketHandler.getOre("craftingToolSaw")
        array197[n285] = array200
        recipes95.addShaped(withTag71, array197, null)
        val recipes96: IRecipeManager = MineTweakerAPI.recipes
        val item254: IItemStack = ItemBracketHandler.getItem("ExtraTrees:door", 46)
        val hashMap254: HashMap<String, IData> = HashMap<String, IData>()
        hashMap254["meta"] = ExpandInt.toData(46)
        val withTag72: IItemStack = item254.withTag(ExpandAnyDict.asData(hashMap254))
        val array201: Array<Array<IIngredient?>?> = arrayOfNulls<Array<IIngredient?>?>(3)
        val n288 = 0
        val array202: Array<IIngredient?> = arrayOfNulls(3)
        val n289 = 0
        val item255: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap255: HashMap<String, IData> = HashMap<String, IData>()
        hashMap255["meta"] = ExpandInt.toData(14)
        array202[n289] = item255.withTag(ExpandAnyDict.asData(hashMap255))
        array202[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array202[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array201[n288] = array202
        val n290 = 1
        val array203: Array<IIngredient?> = arrayOfNulls(3)
        val n291 = 0
        val item256: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap256: HashMap<String, IData> = HashMap<String, IData>()
        hashMap256["meta"] = ExpandInt.toData(14)
        array203[n291] = item256.withTag(ExpandAnyDict.asData(hashMap256))
        array203[1] = OreBracketHandler.getOre("ringCopper")
        array203[2] = OreBracketHandler.getOre("screwCopper")
        array201[n290] = array203
        val n292 = 2
        val array204: Array<IIngredient?> = arrayOfNulls(3)
        val n293 = 0
        val item257: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap257: HashMap<String, IData> = HashMap<String, IData>()
        hashMap257["meta"] = ExpandInt.toData(14)
        array204[n293] = item257.withTag(ExpandAnyDict.asData(hashMap257))
        val n294 = 1
        val item258: IItemStack = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap258: HashMap<String, IData> = HashMap<String, IData>()
        hashMap258["meta"] = ExpandInt.toData(14)
        array204[n294] = item258.withTag(ExpandAnyDict.asData(hashMap258))
        array204[2] = OreBracketHandler.getOre("craftingToolSaw")
        array201[n292] = array204
        recipes96.addShaped(withTag72, array201, null)
    }
}