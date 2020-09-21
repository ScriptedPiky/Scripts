package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import java.util.*

class ExtraTrees2 : Runnable {
    val ore = OreBracketHandler.getOre("craftingToolScrewdriver")
    val ore2 = OreBracketHandler.getOre("itemFlint")
    val ore3 = OreBracketHandler.getOre("screwIron")
    val ore4 = OreBracketHandler.getOre("screwSteel")
    override fun run() {
        OreBracketHandler.getOre("craftingToolSaw")
        val recipes = MineTweakerAPI.recipes
        val item = ItemBracketHandler.getItem("ExtraTrees:door", 152)
        val hashMap = HashMap<String, IData>()
        hashMap["meta"] = ExpandInt.toData(152)
        recipes.addShaped(item.withTag(ExpandAnyDict.asData(hashMap)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                        ItemBracketHandler.getItem("Forestry:planks", 24),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes2 = MineTweakerAPI.recipes
        val item2 = ItemBracketHandler.getItem("ExtraTrees:door", 152)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["meta"] = ExpandInt.toData(152)
        recipes2.addShaped(item2.withTag(ExpandAnyDict.asData(hashMap2)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                        ItemBracketHandler.getItem("Forestry:planks", 24),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes3 = MineTweakerAPI.recipes
        val item3 = ItemBracketHandler.getItem("ExtraTrees:door", 408)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["meta"] = ExpandInt.toData(408)
        val withTag = item3.withTag(ExpandAnyDict.asData(hashMap3))
        val array: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n = 0
        val array2 = arrayOf<IIngredient?>(null, null, null)
        val n2 = 1
        val item4 = ItemBracketHandler.getItem("ExtraTrees:door", 152)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["meta"] = ExpandInt.toData(152)
        array2[n2] = item4.withTag(ExpandAnyDict.asData(hashMap4))
        array2[2] = null
        array[n] = array2
        array[1] = arrayOf(null, null, null)
        array[2] = arrayOf(null, null, null)
        recipes3.addShaped(withTag, array, null)
        val recipes4 = MineTweakerAPI.recipes
        val item5 = ItemBracketHandler.getItem("ExtraTrees:door", 664)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["meta"] = ExpandInt.toData(664)
        val withTag2 = item5.withTag(ExpandAnyDict.asData(hashMap5))
        val array3: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n3 = 0
        val array4 = arrayOf<IIngredient?>(null, null, null)
        val n4 = 2
        val item6 = ItemBracketHandler.getItem("ExtraTrees:door", 152)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["meta"] = ExpandInt.toData(152)
        array4[n4] = item6.withTag(ExpandAnyDict.asData(hashMap6))
        array3[n3] = array4
        array3[1] = arrayOf(null, null, null)
        array3[2] = arrayOf(null, null, null)
        recipes4.addShaped(withTag2, array3, null)
        val recipes5 = MineTweakerAPI.recipes
        val item7 = ItemBracketHandler.getItem("ExtraTrees:door", 920)
        val hashMap7 = HashMap<String, IData>()
        hashMap7["meta"] = ExpandInt.toData(920)
        val withTag3 = item7.withTag(ExpandAnyDict.asData(hashMap7))
        val array5 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n5 = 1
        val array6 = arrayOfNulls<IIngredient>(3)
        val n6 = 0
        val item8 = ItemBracketHandler.getItem("ExtraTrees:door", 152)
        val hashMap8 = HashMap<String, IData>()
        hashMap8["meta"] = ExpandInt.toData(152)
        array6[n6] = item8.withTag(ExpandAnyDict.asData(hashMap8))
        array6[2] = null.also { array6[1] = it }
        array5[n5] = array6
        array5[2] = arrayOf(null, null, null)
        recipes5.addShaped(withTag3, array5, null)
        val recipes6 = MineTweakerAPI.recipes
        val item9 = ItemBracketHandler.getItem("ExtraTrees:door", 153)
        val hashMap9 = HashMap<String, IData>()
        hashMap9["meta"] = ExpandInt.toData(153)
        recipes6.addShaped(item9.withTag(ExpandAnyDict.asData(hashMap9)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                        ItemBracketHandler.getItem("Forestry:planks", 25),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes7 = MineTweakerAPI.recipes
        val item10 = ItemBracketHandler.getItem("ExtraTrees:door", 153)
        val hashMap10 = HashMap<String, IData>()
        hashMap10["meta"] = ExpandInt.toData(153)
        recipes7.addShaped(item10.withTag(ExpandAnyDict.asData(hashMap10)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                        ItemBracketHandler.getItem("Forestry:planks", 25),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes8 = MineTweakerAPI.recipes
        val item11 = ItemBracketHandler.getItem("ExtraTrees:door", 409)
        val hashMap11 = HashMap<String, IData>()
        hashMap11["meta"] = ExpandInt.toData(409)
        val withTag4 = item11.withTag(ExpandAnyDict.asData(hashMap11))
        val array7: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n7 = 0
        val array8 = arrayOf<IIngredient?>(null, null, null)
        val n8 = 1
        val item12 = ItemBracketHandler.getItem("ExtraTrees:door", 153)
        val hashMap12 = HashMap<String, IData>()
        hashMap12["meta"] = ExpandInt.toData(153)
        array8[n8] = item12.withTag(ExpandAnyDict.asData(hashMap12))
        array8[2] = null
        array7[n7] = array8
        array7[1] = arrayOf(null, null, null)
        array7[2] = arrayOf(null, null, null)
        recipes8.addShaped(withTag4, array7, null)
        val recipes9 = MineTweakerAPI.recipes
        val item13 = ItemBracketHandler.getItem("ExtraTrees:door", 665)
        val hashMap13 = HashMap<String, IData>()
        hashMap13["meta"] = ExpandInt.toData(665)
        val withTag5 = item13.withTag(ExpandAnyDict.asData(hashMap13))
        val array9: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n9 = 0
        val array10 = arrayOf<IIngredient?>(null, null, null)
        val n10 = 2
        val item14 = ItemBracketHandler.getItem("ExtraTrees:door", 153)
        val hashMap14 = HashMap<String, IData>()
        hashMap14["meta"] = ExpandInt.toData(153)
        array10[n10] = item14.withTag(ExpandAnyDict.asData(hashMap14))
        array9[n9] = array10
        array9[1] = arrayOf(null, null, null)
        array9[2] = arrayOf(null, null, null)
        recipes9.addShaped(withTag5, array9, null)
        val recipes10 = MineTweakerAPI.recipes
        val item15 = ItemBracketHandler.getItem("ExtraTrees:door", 921)
        val hashMap15 = HashMap<String, IData>()
        hashMap15["meta"] = ExpandInt.toData(921)
        val withTag6 = item15.withTag(ExpandAnyDict.asData(hashMap15))
        val array11 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n11 = 1
        val array12 = arrayOfNulls<IIngredient>(3)
        val n12 = 0
        val item16 = ItemBracketHandler.getItem("ExtraTrees:door", 153)
        val hashMap16 = HashMap<String, IData>()
        hashMap16["meta"] = ExpandInt.toData(153)
        array12[n12] = item16.withTag(ExpandAnyDict.asData(hashMap16))
        array12[2] = null.also { array12[1] = it }
        array11[n11] = array12
        array11[2] = arrayOf(null, null, null)
        recipes10.addShaped(withTag6, array11, null)
        val recipes11 = MineTweakerAPI.recipes
        val item17 = ItemBracketHandler.getItem("ExtraTrees:door", 154)
        val hashMap17 = HashMap<String, IData>()
        hashMap17["meta"] = ExpandInt.toData(154)
        recipes11.addShaped(item17.withTag(ExpandAnyDict.asData(hashMap17)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                        ItemBracketHandler.getItem("Forestry:planks", 26),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes12 = MineTweakerAPI.recipes
        val item18 = ItemBracketHandler.getItem("ExtraTrees:door", 154)
        val hashMap18 = HashMap<String, IData>()
        hashMap18["meta"] = ExpandInt.toData(154)
        recipes12.addShaped(item18.withTag(ExpandAnyDict.asData(hashMap18)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                        ItemBracketHandler.getItem("Forestry:planks", 26),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes13 = MineTweakerAPI.recipes
        val item19 = ItemBracketHandler.getItem("ExtraTrees:door", 410)
        val hashMap19 = HashMap<String, IData>()
        hashMap19["meta"] = ExpandInt.toData(410)
        val withTag7 = item19.withTag(ExpandAnyDict.asData(hashMap19))
        val array13: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n13 = 0
        val array14 = arrayOf<IIngredient?>(null, null, null)
        val n14 = 1
        val item20 = ItemBracketHandler.getItem("ExtraTrees:door", 154)
        val hashMap20 = HashMap<String, IData>()
        hashMap20["meta"] = ExpandInt.toData(154)
        array14[n14] = item20.withTag(ExpandAnyDict.asData(hashMap20))
        array14[2] = null
        array13[n13] = array14
        array13[1] = arrayOf(null, null, null)
        array13[2] = arrayOf(null, null, null)
        recipes13.addShaped(withTag7, array13, null)
        val recipes14 = MineTweakerAPI.recipes
        val item21 = ItemBracketHandler.getItem("ExtraTrees:door", 666)
        val hashMap21 = HashMap<String, IData>()
        hashMap21["meta"] = ExpandInt.toData(666)
        val withTag8 = item21.withTag(ExpandAnyDict.asData(hashMap21))
        val array15: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n15 = 0
        val array16 = arrayOf<IIngredient?>(null, null, null)
        val n16 = 2
        val item22 = ItemBracketHandler.getItem("ExtraTrees:door", 154)
        val hashMap22 = HashMap<String, IData>()
        hashMap22["meta"] = ExpandInt.toData(154)
        array16[n16] = item22.withTag(ExpandAnyDict.asData(hashMap22))
        array15[n15] = array16
        array15[1] = arrayOf(null, null, null)
        array15[2] = arrayOf(null, null, null)
        recipes14.addShaped(withTag8, array15, null)
        val recipes15 = MineTweakerAPI.recipes
        val item23 = ItemBracketHandler.getItem("ExtraTrees:door", 922)
        val hashMap23 = HashMap<String, IData>()
        hashMap23["meta"] = ExpandInt.toData(922)
        val withTag9 = item23.withTag(ExpandAnyDict.asData(hashMap23))
        val array17 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n17 = 1
        val array18 = arrayOfNulls<IIngredient>(3)
        val n18 = 0
        val item24 = ItemBracketHandler.getItem("ExtraTrees:door", 154)
        val hashMap24 = HashMap<String, IData>()
        hashMap24["meta"] = ExpandInt.toData(154)
        array18[n18] = item24.withTag(ExpandAnyDict.asData(hashMap24))
        array18[2] = null.also { array18[1] = it }
        array17[n17] = array18
        array17[2] = arrayOf(null, null, null)
        recipes15.addShaped(withTag9, array17, null)
        val recipes16 = MineTweakerAPI.recipes
        val item25 = ItemBracketHandler.getItem("ExtraTrees:door", 155)
        val hashMap25 = HashMap<String, IData>()
        hashMap25["meta"] = ExpandInt.toData(155)
        recipes16.addShaped(item25.withTag(ExpandAnyDict.asData(hashMap25)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                        ItemBracketHandler.getItem("Forestry:planks", 27),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes17 = MineTweakerAPI.recipes
        val item26 = ItemBracketHandler.getItem("ExtraTrees:door", 155)
        val hashMap26 = HashMap<String, IData>()
        hashMap26["meta"] = ExpandInt.toData(155)
        recipes17.addShaped(item26.withTag(ExpandAnyDict.asData(hashMap26)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                        ItemBracketHandler.getItem("Forestry:planks", 27),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes18 = MineTweakerAPI.recipes
        val item27 = ItemBracketHandler.getItem("ExtraTrees:door", 411)
        val hashMap27 = HashMap<String, IData>()
        hashMap27["meta"] = ExpandInt.toData(411)
        val withTag10 = item27.withTag(ExpandAnyDict.asData(hashMap27))
        val array19: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n19 = 0
        val array20 = arrayOf<IIngredient?>(null, null, null)
        val n20 = 1
        val item28 = ItemBracketHandler.getItem("ExtraTrees:door", 155)
        val hashMap28 = HashMap<String, IData>()
        hashMap28["meta"] = ExpandInt.toData(155)
        array20[n20] = item28.withTag(ExpandAnyDict.asData(hashMap28))
        array20[2] = null
        array19[n19] = array20
        array19[1] = arrayOf(null, null, null)
        array19[2] = arrayOf(null, null, null)
        recipes18.addShaped(withTag10, array19, null)
        val recipes19 = MineTweakerAPI.recipes
        val item29 = ItemBracketHandler.getItem("ExtraTrees:door", 667)
        val hashMap29 = HashMap<String, IData>()
        hashMap29["meta"] = ExpandInt.toData(667)
        val withTag11 = item29.withTag(ExpandAnyDict.asData(hashMap29))
        val array21: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n21 = 0
        val array22 = arrayOf<IIngredient?>(null, null, null)
        val n22 = 2
        val item30 = ItemBracketHandler.getItem("ExtraTrees:door", 155)
        val hashMap30 = HashMap<String, IData>()
        hashMap30["meta"] = ExpandInt.toData(155)
        array22[n22] = item30.withTag(ExpandAnyDict.asData(hashMap30))
        array21[n21] = array22
        array21[1] = arrayOf(null, null, null)
        array21[2] = arrayOf(null, null, null)
        recipes19.addShaped(withTag11, array21, null)
        val recipes20 = MineTweakerAPI.recipes
        val item31 = ItemBracketHandler.getItem("ExtraTrees:door", 923)
        val hashMap31 = HashMap<String, IData>()
        hashMap31["meta"] = ExpandInt.toData(923)
        val withTag12 = item31.withTag(ExpandAnyDict.asData(hashMap31))
        val array23 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n23 = 1
        val array24 = arrayOfNulls<IIngredient>(3)
        val n24 = 0
        val item32 = ItemBracketHandler.getItem("ExtraTrees:door", 155)
        val hashMap32 = HashMap<String, IData>()
        hashMap32["meta"] = ExpandInt.toData(155)
        array24[n24] = item32.withTag(ExpandAnyDict.asData(hashMap32))
        array24[2] = null.also { array24[1] = it }
        array23[n23] = array24
        array23[2] = arrayOf(null, null, null)
        recipes20.addShaped(withTag12, array23, null)
        val recipes21 = MineTweakerAPI.recipes
        val item33 = ItemBracketHandler.getItem("ExtraTrees:door", 156)
        val hashMap33 = HashMap<String, IData>()
        hashMap33["meta"] = ExpandInt.toData(156)
        recipes21.addShaped(item33.withTag(ExpandAnyDict.asData(hashMap33)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                        OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                        ItemBracketHandler.getItem("Forestry:planks", 28),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes22 = MineTweakerAPI.recipes
        val item34 = ItemBracketHandler.getItem("ExtraTrees:door", 156)
        val hashMap34 = HashMap<String, IData>()
        hashMap34["meta"] = ExpandInt.toData(156)
        recipes22.addShaped(item34.withTag(ExpandAnyDict.asData(hashMap34)), arrayOf(
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28), ItemBracketHandler.getItem(
                        "minecraft:trapdoor", 0), OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                        OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                        ItemBracketHandler.getItem("Forestry:planks", 28),
                        OreBracketHandler.getOre("craftingToolSaw"))),
                null)
        val recipes23 = MineTweakerAPI.recipes
        val item35 = ItemBracketHandler.getItem("ExtraTrees:door", 412)
        val hashMap35 = HashMap<String, IData>()
        hashMap35["meta"] = ExpandInt.toData(412)
        val withTag13 = item35.withTag(ExpandAnyDict.asData(hashMap35))
        val array25: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n25 = 0
        val array26 = arrayOf<IIngredient?>(null, null, null)
        val n26 = 1
        val item36 = ItemBracketHandler.getItem("ExtraTrees:door", 156)
        val hashMap36 = HashMap<String, IData>()
        hashMap36["meta"] = ExpandInt.toData(156)
        array26[n26] = item36.withTag(ExpandAnyDict.asData(hashMap36))
        array26[2] = null
        array25[n25] = array26
        array25[1] = arrayOf(null, null, null)
        array25[2] = arrayOf(null, null, null)
        recipes23.addShaped(withTag13, array25, null)
        val recipes24 = MineTweakerAPI.recipes
        val item37 = ItemBracketHandler.getItem("ExtraTrees:door", 668)
        val hashMap37 = HashMap<String, IData>()
        hashMap37["meta"] = ExpandInt.toData(668)
        val withTag14 = item37.withTag(ExpandAnyDict.asData(hashMap37))
        val array27: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n27 = 0
        val array28 = arrayOf<IIngredient?>(null, null, null)
        val n28 = 2
        val item38 = ItemBracketHandler.getItem("ExtraTrees:door", 156)
        val hashMap38 = HashMap<String, IData>()
        hashMap38["meta"] = ExpandInt.toData(156)
        array28[n28] = item38.withTag(ExpandAnyDict.asData(hashMap38))
        array27[n27] = array28
        array27[1] = arrayOf(null, null, null)
        array27[2] = arrayOf(null, null, null)
        recipes24.addShaped(withTag14, array27, null)
        val recipes25 = MineTweakerAPI.recipes
        val item39 = ItemBracketHandler.getItem("ExtraTrees:door", 924)
        val hashMap39 = HashMap<String, IData>()
        hashMap39["meta"] = ExpandInt.toData(924)
        val withTag15 = item39.withTag(ExpandAnyDict.asData(hashMap39))
        val array29 = arrayOf(
                arrayOf<IIngredient?>(null, null, null), null, null)
        val n29 = 1
        val array30 = arrayOfNulls<IIngredient>(3)
        val n30 = 0
        val item40 = ItemBracketHandler.getItem("ExtraTrees:door", 156)
        val hashMap40 = HashMap<String, IData>()
        hashMap40["meta"] = ExpandInt.toData(156)
        array30[n30] = item40.withTag(ExpandAnyDict.asData(hashMap40))
        array30[2] = null.also { array30[1] = it }
        array29[n29] = array30
        array29[2] = arrayOf(null, null, null)
        recipes25.addShaped(withTag15, array29, null)
        val recipes26 = MineTweakerAPI.recipes
        val item41 = ItemBracketHandler.getItem("ExtraTrees:gate", 1)
        val hashMap41 = HashMap<String, IData>()
        hashMap41["meta"] = ExpandInt.toData(1)
        recipes26.addShaped(item41.withTag(ExpandAnyDict.asData(hashMap41)), arrayOf(
                arrayOf<IIngredient?>(ItemBracketHandler.getItem("malisisdoors:spruceFenceGate", 0), null, null),
                arrayOf<IIngredient?>(null, null
                        , null), arrayOf<IIngredient?>(null, null, null)), null)
        val recipes27 = MineTweakerAPI.recipes
        val item42 = ItemBracketHandler.getItem("ExtraTrees:gate", 2)
        val hashMap42 = HashMap<String, IData>()
        hashMap42["meta"] = ExpandInt.toData(2)
        recipes27.addShaped(item42.withTag(ExpandAnyDict.asData(hashMap42)), arrayOf(
                arrayOf<IIngredient?>(ItemBracketHandler.getItem("malisisdoors:birchFenceGate", 0), null, null),
                arrayOf<IIngredient?>(null, null,
                        null), arrayOf<IIngredient?>(null, null, null)), null)
        val recipes28 = MineTweakerAPI.recipes
        val item43 = ItemBracketHandler.getItem("ExtraTrees:gate", 3)
        val hashMap43 = HashMap<String, IData>()
        hashMap43["meta"] = ExpandInt.toData(3)
        recipes28.addShaped(item43.withTag(ExpandAnyDict.asData(hashMap43)), arrayOf(
                arrayOf<IIngredient?>(ItemBracketHandler.getItem("malisisdoors:jungleFenceGate", 0), null, null),
                arrayOf<IIngredient?>(null, null
                        , null), arrayOf<IIngredient?>(null, null, null)), null)
        val recipes29 = MineTweakerAPI.recipes
        val item44 = ItemBracketHandler.getItem("ExtraTrees:gate", 4)
        val hashMap44 = HashMap<String, IData>()
        hashMap44["meta"] = ExpandInt.toData(4)
        recipes29.addShaped(item44.withTag(ExpandAnyDict.asData(hashMap44)), arrayOf(
                arrayOf<IIngredient?>(ItemBracketHandler.getItem("malisisdoors:acaciaFenceGate", 0), null, null),
                arrayOf<IIngredient?>(null, null
                        , null), arrayOf<IIngredient?>(null, null, null)), null)
        val recipes30 = MineTweakerAPI.recipes
        val item45 = ItemBracketHandler.getItem("ExtraTrees:gate", 5)
        val hashMap45 = HashMap<String, IData>()
        hashMap45["meta"] = ExpandInt.toData(5)
        recipes30.addShaped(item45.withTag(ExpandAnyDict.asData(hashMap45)), arrayOf(
                arrayOf<IIngredient?>(ItemBracketHandler.getItem("malisisdoors:darkOakFenceGate", 0), null, null),
                arrayOf<IIngredient?>(null,
                        null, null), arrayOf<IIngredient?>(null, null, null)), null)
        val recipes31 = MineTweakerAPI.recipes
        val item46 = ItemBracketHandler.getItem("ExtraTrees:gate", 32)
        val hashMap46 = HashMap<String, IData>()
        hashMap46["meta"] = ExpandInt.toData(32)
        val withTag16 = item46.withTag(ExpandAnyDict.asData(hashMap46))
        val array31 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n31 = 1
        val array32 = arrayOfNulls<IIngredient>(3)
        val n32 = 0
        val item47 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap47 = HashMap<String, IData>()
        hashMap47["meta"] = ExpandInt.toData(0)
        array32[n32] = item47.withTag(ExpandAnyDict.asData(hashMap47))
        array32[1] = OreBracketHandler.getOre("stickWood")
        val n33 = 2
        val item48 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap48 = HashMap<String, IData>()
        hashMap48["meta"] = ExpandInt.toData(0)
        array32[n33] = item48.withTag(ExpandAnyDict.asData(hashMap48))
        array31[n31] = array32
        val n34 = 2
        val array33 = arrayOfNulls<IIngredient>(3)
        val n35 = 0
        val item49 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap49 = HashMap<String, IData>()
        hashMap49["meta"] = ExpandInt.toData(0)
        array33[n35] = item49.withTag(ExpandAnyDict.asData(hashMap49))
        array33[1] = OreBracketHandler.getOre("stickWood")
        val n36 = 2
        val item50 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap50 = HashMap<String, IData>()
        hashMap50["meta"] = ExpandInt.toData(0)
        array33[n36] = item50.withTag(ExpandAnyDict.asData(hashMap50))
        array31[n34] = array33
        recipes31.addShaped(withTag16, array31, null)
        val recipes32 = MineTweakerAPI.recipes
        val item51 = ItemBracketHandler.getItem("ExtraTrees:gate", 32)
        val hashMap51 = HashMap<String, IData>()
        hashMap51["meta"] = ExpandInt.toData(32)
        val amount = item51.withTag(ExpandAnyDict.asData(hashMap51)).amount(2)
        val array34 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n37 = 1
        val array35 = arrayOfNulls<IIngredient>(3)
        val n38 = 0
        val item52 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap52 = HashMap<String, IData>()
        hashMap52["meta"] = ExpandInt.toData(0)
        array35[n38] = item52.withTag(ExpandAnyDict.asData(hashMap52))
        array35[1] = OreBracketHandler.getOre("stickWood")
        val n39 = 2
        val item53 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap53 = HashMap<String, IData>()
        hashMap53["meta"] = ExpandInt.toData(0)
        array35[n39] = item53.withTag(ExpandAnyDict.asData(hashMap53))
        array34[n37] = array35
        val n40 = 2
        val array36 = arrayOfNulls<IIngredient>(3)
        val n41 = 0
        val item54 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap54 = HashMap<String, IData>()
        hashMap54["meta"] = ExpandInt.toData(0)
        array36[n41] = item54.withTag(ExpandAnyDict.asData(hashMap54))
        array36[1] = OreBracketHandler.getOre("stickWood")
        val n42 = 2
        val item55 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap55 = HashMap<String, IData>()
        hashMap55["meta"] = ExpandInt.toData(0)
        array36[n42] = item55.withTag(ExpandAnyDict.asData(hashMap55))
        array34[n40] = array36
        recipes32.addShaped(amount, array34, null)
        val recipes33 = MineTweakerAPI.recipes
        val item56 = ItemBracketHandler.getItem("ExtraTrees:gate", 32)
        val hashMap56 = HashMap<String, IData>()
        hashMap56["meta"] = ExpandInt.toData(32)
        val amount2 = item56.withTag(ExpandAnyDict.asData(hashMap56)).amount(4)
        val array37 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n43 = 1
        val array38 = arrayOfNulls<IIngredient>(3)
        val n44 = 0
        val item57 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap57 = HashMap<String, IData>()
        hashMap57["meta"] = ExpandInt.toData(0)
        array38[n44] = item57.withTag(ExpandAnyDict.asData(hashMap57))
        array38[1] = OreBracketHandler.getOre("stickWood")
        val n45 = 2
        val item58 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap58 = HashMap<String, IData>()
        hashMap58["meta"] = ExpandInt.toData(0)
        array38[n45] = item58.withTag(ExpandAnyDict.asData(hashMap58))
        array37[n43] = array38
        val n46 = 2
        val array39 = arrayOfNulls<IIngredient>(3)
        val n47 = 0
        val item59 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap59 = HashMap<String, IData>()
        hashMap59["meta"] = ExpandInt.toData(0)
        array39[n47] = item59.withTag(ExpandAnyDict.asData(hashMap59))
        array39[1] = OreBracketHandler.getOre("stickWood")
        val n48 = 2
        val item60 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap60 = HashMap<String, IData>()
        hashMap60["meta"] = ExpandInt.toData(0)
        array39[n48] = item60.withTag(ExpandAnyDict.asData(hashMap60))
        array37[n46] = array39
        recipes33.addShaped(amount2, array37, null)
        val recipes34 = MineTweakerAPI.recipes
        val item61 = ItemBracketHandler.getItem("ExtraTrees:gate", 33)
        val hashMap61 = HashMap<String, IData>()
        hashMap61["meta"] = ExpandInt.toData(33)
        val withTag17 = item61.withTag(ExpandAnyDict.asData(hashMap61))
        val array40 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n49 = 1
        val array41 = arrayOfNulls<IIngredient>(3)
        val n50 = 0
        val item62 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap62 = HashMap<String, IData>()
        hashMap62["meta"] = ExpandInt.toData(1)
        array41[n50] = item62.withTag(ExpandAnyDict.asData(hashMap62))
        array41[1] = OreBracketHandler.getOre("stickWood")
        val n51 = 2
        val item63 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap63 = HashMap<String, IData>()
        hashMap63["meta"] = ExpandInt.toData(1)
        array41[n51] = item63.withTag(ExpandAnyDict.asData(hashMap63))
        array40[n49] = array41
        val n52 = 2
        val array42 = arrayOfNulls<IIngredient>(3)
        val n53 = 0
        val item64 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap64 = HashMap<String, IData>()
        hashMap64["meta"] = ExpandInt.toData(1)
        array42[n53] = item64.withTag(ExpandAnyDict.asData(hashMap64))
        array42[1] = OreBracketHandler.getOre("stickWood")
        val n54 = 2
        val item65 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap65 = HashMap<String, IData>()
        hashMap65["meta"] = ExpandInt.toData(1)
        array42[n54] = item65.withTag(ExpandAnyDict.asData(hashMap65))
        array40[n52] = array42
        recipes34.addShaped(withTag17, array40, null)
        val recipes35 = MineTweakerAPI.recipes
        val item66 = ItemBracketHandler.getItem("ExtraTrees:gate", 33)
        val hashMap66 = HashMap<String, IData>()
        hashMap66["meta"] = ExpandInt.toData(33)
        val amount3 = item66.withTag(ExpandAnyDict.asData(hashMap66)).amount(2)
        val array43 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n55 = 1
        val array44 = arrayOfNulls<IIngredient>(3)
        val n56 = 0
        val item67 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap67 = HashMap<String, IData>()
        hashMap67["meta"] = ExpandInt.toData(1)
        array44[n56] = item67.withTag(ExpandAnyDict.asData(hashMap67))
        array44[1] = OreBracketHandler.getOre("stickWood")
        val n57 = 2
        val item68 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap68 = HashMap<String, IData>()
        hashMap68["meta"] = ExpandInt.toData(1)
        array44[n57] = item68.withTag(ExpandAnyDict.asData(hashMap68))
        array43[n55] = array44
        val n58 = 2
        val array45 = arrayOfNulls<IIngredient>(3)
        val n59 = 0
        val item69 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap69 = HashMap<String, IData>()
        hashMap69["meta"] = ExpandInt.toData(1)
        array45[n59] = item69.withTag(ExpandAnyDict.asData(hashMap69))
        array45[1] = OreBracketHandler.getOre("stickWood")
        val n60 = 2
        val item70 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap70 = HashMap<String, IData>()
        hashMap70["meta"] = ExpandInt.toData(1)
        array45[n60] = item70.withTag(ExpandAnyDict.asData(hashMap70))
        array43[n58] = array45
        recipes35.addShaped(amount3, array43, null)
        val recipes36 = MineTweakerAPI.recipes
        val item71 = ItemBracketHandler.getItem("ExtraTrees:gate", 33)
        val hashMap71 = HashMap<String, IData>()
        hashMap71["meta"] = ExpandInt.toData(33)
        val amount4 = item71.withTag(ExpandAnyDict.asData(hashMap71)).amount(4)
        val array46 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n61 = 1
        val array47 = arrayOfNulls<IIngredient>(3)
        val n62 = 0
        val item72 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap72 = HashMap<String, IData>()
        hashMap72["meta"] = ExpandInt.toData(1)
        array47[n62] = item72.withTag(ExpandAnyDict.asData(hashMap72))
        array47[1] = OreBracketHandler.getOre("stickWood")
        val n63 = 2
        val item73 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap73 = HashMap<String, IData>()
        hashMap73["meta"] = ExpandInt.toData(1)
        array47[n63] = item73.withTag(ExpandAnyDict.asData(hashMap73))
        array46[n61] = array47
        val n64 = 2
        val array48 = arrayOfNulls<IIngredient>(3)
        val n65 = 0
        val item74 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap74 = HashMap<String, IData>()
        hashMap74["meta"] = ExpandInt.toData(1)
        array48[n65] = item74.withTag(ExpandAnyDict.asData(hashMap74))
        array48[1] = OreBracketHandler.getOre("stickWood")
        val n66 = 2
        val item75 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap75 = HashMap<String, IData>()
        hashMap75["meta"] = ExpandInt.toData(1)
        array48[n66] = item75.withTag(ExpandAnyDict.asData(hashMap75))
        array46[n64] = array48
        recipes36.addShaped(amount4, array46, null)
        val recipes37 = MineTweakerAPI.recipes
        val item76 = ItemBracketHandler.getItem("ExtraTrees:gate", 34)
        val hashMap76 = HashMap<String, IData>()
        hashMap76["meta"] = ExpandInt.toData(34)
        val withTag18 = item76.withTag(ExpandAnyDict.asData(hashMap76))
        val array49 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n67 = 1
        val array50 = arrayOfNulls<IIngredient>(3)
        val n68 = 0
        val item77 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap77 = HashMap<String, IData>()
        hashMap77["meta"] = ExpandInt.toData(2)
        array50[n68] = item77.withTag(ExpandAnyDict.asData(hashMap77))
        array50[1] = OreBracketHandler.getOre("stickWood")
        val n69 = 2
        val item78 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap78 = HashMap<String, IData>()
        hashMap78["meta"] = ExpandInt.toData(2)
        array50[n69] = item78.withTag(ExpandAnyDict.asData(hashMap78))
        array49[n67] = array50
        val n70 = 2
        val array51 = arrayOfNulls<IIngredient>(3)
        val n71 = 0
        val item79 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap79 = HashMap<String, IData>()
        hashMap79["meta"] = ExpandInt.toData(2)
        array51[n71] = item79.withTag(ExpandAnyDict.asData(hashMap79))
        array51[1] = OreBracketHandler.getOre("stickWood")
        val n72 = 2
        val item80 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap80 = HashMap<String, IData>()
        hashMap80["meta"] = ExpandInt.toData(2)
        array51[n72] = item80.withTag(ExpandAnyDict.asData(hashMap80))
        array49[n70] = array51
        recipes37.addShaped(withTag18, array49, null)
        val recipes38 = MineTweakerAPI.recipes
        val item81 = ItemBracketHandler.getItem("ExtraTrees:gate", 34)
        val hashMap81 = HashMap<String, IData>()
        hashMap81["meta"] = ExpandInt.toData(34)
        val amount5 = item81.withTag(ExpandAnyDict.asData(hashMap81)).amount(2)
        val array52 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n73 = 1
        val array53 = arrayOfNulls<IIngredient>(3)
        val n74 = 0
        val item82 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap82 = HashMap<String, IData>()
        hashMap82["meta"] = ExpandInt.toData(2)
        array53[n74] = item82.withTag(ExpandAnyDict.asData(hashMap82))
        array53[1] = OreBracketHandler.getOre("stickWood")
        val n75 = 2
        val item83 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap83 = HashMap<String, IData>()
        hashMap83["meta"] = ExpandInt.toData(2)
        array53[n75] = item83.withTag(ExpandAnyDict.asData(hashMap83))
        array52[n73] = array53
        val n76 = 2
        val array54 = arrayOfNulls<IIngredient>(3)
        val n77 = 0
        val item84 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap84 = HashMap<String, IData>()
        hashMap84["meta"] = ExpandInt.toData(2)
        array54[n77] = item84.withTag(ExpandAnyDict.asData(hashMap84))
        array54[1] = OreBracketHandler.getOre("stickWood")
        val n78 = 2
        val item85 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap85 = HashMap<String, IData>()
        hashMap85["meta"] = ExpandInt.toData(2)
        array54[n78] = item85.withTag(ExpandAnyDict.asData(hashMap85))
        array52[n76] = array54
        recipes38.addShaped(amount5, array52, null)
        val recipes39 = MineTweakerAPI.recipes
        val item86 = ItemBracketHandler.getItem("ExtraTrees:gate", 34)
        val hashMap86 = HashMap<String, IData>()
        hashMap86["meta"] = ExpandInt.toData(34)
        val amount6 = item86.withTag(ExpandAnyDict.asData(hashMap86)).amount(4)
        val array55 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n79 = 1
        val array56 = arrayOfNulls<IIngredient>(3)
        val n80 = 0
        val item87 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap87 = HashMap<String, IData>()
        hashMap87["meta"] = ExpandInt.toData(2)
        array56[n80] = item87.withTag(ExpandAnyDict.asData(hashMap87))
        array56[1] = OreBracketHandler.getOre("stickWood")
        val n81 = 2
        val item88 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap88 = HashMap<String, IData>()
        hashMap88["meta"] = ExpandInt.toData(2)
        array56[n81] = item88.withTag(ExpandAnyDict.asData(hashMap88))
        array55[n79] = array56
        val n82 = 2
        val array57 = arrayOfNulls<IIngredient>(3)
        val n83 = 0
        val item89 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap89 = HashMap<String, IData>()
        hashMap89["meta"] = ExpandInt.toData(2)
        array57[n83] = item89.withTag(ExpandAnyDict.asData(hashMap89))
        array57[1] = OreBracketHandler.getOre("stickWood")
        val n84 = 2
        val item90 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap90 = HashMap<String, IData>()
        hashMap90["meta"] = ExpandInt.toData(2)
        array57[n84] = item90.withTag(ExpandAnyDict.asData(hashMap90))
        array55[n82] = array57
        recipes39.addShaped(amount6, array55, null)
        val recipes40 = MineTweakerAPI.recipes
        val item91 = ItemBracketHandler.getItem("ExtraTrees:gate", 35)
        val hashMap91 = HashMap<String, IData>()
        hashMap91["meta"] = ExpandInt.toData(35)
        val withTag19 = item91.withTag(ExpandAnyDict.asData(hashMap91))
        val array58 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n85 = 1
        val array59 = arrayOfNulls<IIngredient>(3)
        val n86 = 0
        val item92 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap92 = HashMap<String, IData>()
        hashMap92["meta"] = ExpandInt.toData(3)
        array59[n86] = item92.withTag(ExpandAnyDict.asData(hashMap92))
        array59[1] = OreBracketHandler.getOre("stickWood")
        val n87 = 2
        val item93 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap93 = HashMap<String, IData>()
        hashMap93["meta"] = ExpandInt.toData(3)
        array59[n87] = item93.withTag(ExpandAnyDict.asData(hashMap93))
        array58[n85] = array59
        val n88 = 2
        val array60 = arrayOfNulls<IIngredient>(3)
        val n89 = 0
        val item94 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap94 = HashMap<String, IData>()
        hashMap94["meta"] = ExpandInt.toData(3)
        array60[n89] = item94.withTag(ExpandAnyDict.asData(hashMap94))
        array60[1] = OreBracketHandler.getOre("stickWood")
        val n90 = 2
        val item95 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap95 = HashMap<String, IData>()
        hashMap95["meta"] = ExpandInt.toData(3)
        array60[n90] = item95.withTag(ExpandAnyDict.asData(hashMap95))
        array58[n88] = array60
        recipes40.addShaped(withTag19, array58, null)
        val recipes41 = MineTweakerAPI.recipes
        val item96 = ItemBracketHandler.getItem("ExtraTrees:gate", 35)
        val hashMap96 = HashMap<String, IData>()
        hashMap96["meta"] = ExpandInt.toData(35)
        val amount7 = item96.withTag(ExpandAnyDict.asData(hashMap96)).amount(2)
        val array61 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n91 = 1
        val array62 = arrayOfNulls<IIngredient>(3)
        val n92 = 0
        val item97 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap97 = HashMap<String, IData>()
        hashMap97["meta"] = ExpandInt.toData(3)
        array62[n92] = item97.withTag(ExpandAnyDict.asData(hashMap97))
        array62[1] = OreBracketHandler.getOre("stickWood")
        val n93 = 2
        val item98 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap98 = HashMap<String, IData>()
        hashMap98["meta"] = ExpandInt.toData(3)
        array62[n93] = item98.withTag(ExpandAnyDict.asData(hashMap98))
        array61[n91] = array62
        val n94 = 2
        val array63 = arrayOfNulls<IIngredient>(3)
        val n95 = 0
        val item99 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap99 = HashMap<String, IData>()
        hashMap99["meta"] = ExpandInt.toData(3)
        array63[n95] = item99.withTag(ExpandAnyDict.asData(hashMap99))
        array63[1] = OreBracketHandler.getOre("stickWood")
        val n96 = 2
        val item100 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap100 = HashMap<String, IData>()
        hashMap100["meta"] = ExpandInt.toData(3)
        array63[n96] = item100.withTag(ExpandAnyDict.asData(hashMap100))
        array61[n94] = array63
        recipes41.addShaped(amount7, array61, null)
        val recipes42 = MineTweakerAPI.recipes
        val item101 = ItemBracketHandler.getItem("ExtraTrees:gate", 35)
        val hashMap101 = HashMap<String, IData>()
        hashMap101["meta"] = ExpandInt.toData(35)
        val amount8 = item101.withTag(ExpandAnyDict.asData(hashMap101)).amount(4)
        val array64 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n97 = 1
        val array65 = arrayOfNulls<IIngredient>(3)
        val n98 = 0
        val item102 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap102 = HashMap<String, IData>()
        hashMap102["meta"] = ExpandInt.toData(3)
        array65[n98] = item102.withTag(ExpandAnyDict.asData(hashMap102))
        array65[1] = OreBracketHandler.getOre("stickWood")
        val n99 = 2
        val item103 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap103 = HashMap<String, IData>()
        hashMap103["meta"] = ExpandInt.toData(3)
        array65[n99] = item103.withTag(ExpandAnyDict.asData(hashMap103))
        array64[n97] = array65
        val n100 = 2
        val array66 = arrayOfNulls<IIngredient>(3)
        val n101 = 0
        val item104 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap104 = HashMap<String, IData>()
        hashMap104["meta"] = ExpandInt.toData(3)
        array66[n101] = item104.withTag(ExpandAnyDict.asData(hashMap104))
        array66[1] = OreBracketHandler.getOre("stickWood")
        val n102 = 2
        val item105 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap105 = HashMap<String, IData>()
        hashMap105["meta"] = ExpandInt.toData(3)
        array66[n102] = item105.withTag(ExpandAnyDict.asData(hashMap105))
        array64[n100] = array66
        recipes42.addShaped(amount8, array64, null)
        val recipes43 = MineTweakerAPI.recipes
        val item106 = ItemBracketHandler.getItem("ExtraTrees:gate", 36)
        val hashMap106 = HashMap<String, IData>()
        hashMap106["meta"] = ExpandInt.toData(36)
        val withTag20 = item106.withTag(ExpandAnyDict.asData(hashMap106))
        val array67 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n103 = 1
        val array68 = arrayOfNulls<IIngredient>(3)
        val n104 = 0
        val item107 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap107 = HashMap<String, IData>()
        hashMap107["meta"] = ExpandInt.toData(4)
        array68[n104] = item107.withTag(ExpandAnyDict.asData(hashMap107))
        array68[1] = OreBracketHandler.getOre("stickWood")
        val n105 = 2
        val item108 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap108 = HashMap<String, IData>()
        hashMap108["meta"] = ExpandInt.toData(4)
        array68[n105] = item108.withTag(ExpandAnyDict.asData(hashMap108))
        array67[n103] = array68
        val n106 = 2
        val array69 = arrayOfNulls<IIngredient>(3)
        val n107 = 0
        val item109 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap109 = HashMap<String, IData>()
        hashMap109["meta"] = ExpandInt.toData(4)
        array69[n107] = item109.withTag(ExpandAnyDict.asData(hashMap109))
        array69[1] = OreBracketHandler.getOre("stickWood")
        val n108 = 2
        val item110 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap110 = HashMap<String, IData>()
        hashMap110["meta"] = ExpandInt.toData(4)
        array69[n108] = item110.withTag(ExpandAnyDict.asData(hashMap110))
        array67[n106] = array69
        recipes43.addShaped(withTag20, array67, null)
        val recipes44 = MineTweakerAPI.recipes
        val item111 = ItemBracketHandler.getItem("ExtraTrees:gate", 36)
        val hashMap111 = HashMap<String, IData>()
        hashMap111["meta"] = ExpandInt.toData(36)
        val amount9 = item111.withTag(ExpandAnyDict.asData(hashMap111)).amount(2)
        val array70 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n109 = 1
        val array71 = arrayOfNulls<IIngredient>(3)
        val n110 = 0
        val item112 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap112 = HashMap<String, IData>()
        hashMap112["meta"] = ExpandInt.toData(4)
        array71[n110] = item112.withTag(ExpandAnyDict.asData(hashMap112))
        array71[1] = OreBracketHandler.getOre("stickWood")
        val n111 = 2
        val item113 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap113 = HashMap<String, IData>()
        hashMap113["meta"] = ExpandInt.toData(4)
        array71[n111] = item113.withTag(ExpandAnyDict.asData(hashMap113))
        array70[n109] = array71
        val n112 = 2
        val array72 = arrayOfNulls<IIngredient>(3)
        val n113 = 0
        val item114 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap114 = HashMap<String, IData>()
        hashMap114["meta"] = ExpandInt.toData(4)
        array72[n113] = item114.withTag(ExpandAnyDict.asData(hashMap114))
        array72[1] = OreBracketHandler.getOre("stickWood")
        val n114 = 2
        val item115 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap115 = HashMap<String, IData>()
        hashMap115["meta"] = ExpandInt.toData(4)
        array72[n114] = item115.withTag(ExpandAnyDict.asData(hashMap115))
        array70[n112] = array72
        recipes44.addShaped(amount9, array70, null)
        val recipes45 = MineTweakerAPI.recipes
        val item116 = ItemBracketHandler.getItem("ExtraTrees:gate", 36)
        val hashMap116 = HashMap<String, IData>()
        hashMap116["meta"] = ExpandInt.toData(36)
        val amount10 = item116.withTag(ExpandAnyDict.asData(hashMap116)).amount(4)
        val array73 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n115 = 1
        val array74 = arrayOfNulls<IIngredient>(3)
        val n116 = 0
        val item117 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap117 = HashMap<String, IData>()
        hashMap117["meta"] = ExpandInt.toData(4)
        array74[n116] = item117.withTag(ExpandAnyDict.asData(hashMap117))
        array74[1] = OreBracketHandler.getOre("stickWood")
        val n117 = 2
        val item118 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap118 = HashMap<String, IData>()
        hashMap118["meta"] = ExpandInt.toData(4)
        array74[n117] = item118.withTag(ExpandAnyDict.asData(hashMap118))
        array73[n115] = array74
        val n118 = 2
        val array75 = arrayOfNulls<IIngredient>(3)
        val n119 = 0
        val item119 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap119 = HashMap<String, IData>()
        hashMap119["meta"] = ExpandInt.toData(4)
        array75[n119] = item119.withTag(ExpandAnyDict.asData(hashMap119))
        array75[1] = OreBracketHandler.getOre("stickWood")
        val n120 = 2
        val item120 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap120 = HashMap<String, IData>()
        hashMap120["meta"] = ExpandInt.toData(4)
        array75[n120] = item120.withTag(ExpandAnyDict.asData(hashMap120))
        array73[n118] = array75
        recipes45.addShaped(amount10, array73, null)
        val recipes46 = MineTweakerAPI.recipes
        val item121 = ItemBracketHandler.getItem("ExtraTrees:gate", 37)
        val hashMap121 = HashMap<String, IData>()
        hashMap121["meta"] = ExpandInt.toData(37)
        val withTag21 = item121.withTag(ExpandAnyDict.asData(hashMap121))
        val array76 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n121 = 1
        val array77 = arrayOfNulls<IIngredient>(3)
        val n122 = 0
        val item122 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap122 = HashMap<String, IData>()
        hashMap122["meta"] = ExpandInt.toData(5)
        array77[n122] = item122.withTag(ExpandAnyDict.asData(hashMap122))
        array77[1] = OreBracketHandler.getOre("stickWood")
        val n123 = 2
        val item123 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap123 = HashMap<String, IData>()
        hashMap123["meta"] = ExpandInt.toData(5)
        array77[n123] = item123.withTag(ExpandAnyDict.asData(hashMap123))
        array76[n121] = array77
        val n124 = 2
        val array78 = arrayOfNulls<IIngredient>(3)
        val n125 = 0
        val item124 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap124 = HashMap<String, IData>()
        hashMap124["meta"] = ExpandInt.toData(5)
        array78[n125] = item124.withTag(ExpandAnyDict.asData(hashMap124))
        array78[1] = OreBracketHandler.getOre("stickWood")
        val n126 = 2
        val item125 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap125 = HashMap<String, IData>()
        hashMap125["meta"] = ExpandInt.toData(5)
        array78[n126] = item125.withTag(ExpandAnyDict.asData(hashMap125))
        array76[n124] = array78
        recipes46.addShaped(withTag21, array76, null)
        val recipes47 = MineTweakerAPI.recipes
        val item126 = ItemBracketHandler.getItem("ExtraTrees:gate", 37)
        val hashMap126 = HashMap<String, IData>()
        hashMap126["meta"] = ExpandInt.toData(37)
        val amount11 = item126.withTag(ExpandAnyDict.asData(hashMap126)).amount(2)
        val array79 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n127 = 1
        val array80 = arrayOfNulls<IIngredient>(3)
        val n128 = 0
        val item127 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap127 = HashMap<String, IData>()
        hashMap127["meta"] = ExpandInt.toData(5)
        array80[n128] = item127.withTag(ExpandAnyDict.asData(hashMap127))
        array80[1] = OreBracketHandler.getOre("stickWood")
        val n129 = 2
        val item128 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap128 = HashMap<String, IData>()
        hashMap128["meta"] = ExpandInt.toData(5)
        array80[n129] = item128.withTag(ExpandAnyDict.asData(hashMap128))
        array79[n127] = array80
        val n130 = 2
        val array81 = arrayOfNulls<IIngredient>(3)
        val n131 = 0
        val item129 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap129 = HashMap<String, IData>()
        hashMap129["meta"] = ExpandInt.toData(5)
        array81[n131] = item129.withTag(ExpandAnyDict.asData(hashMap129))
        array81[1] = OreBracketHandler.getOre("stickWood")
        val n132 = 2
        val item130 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap130 = HashMap<String, IData>()
        hashMap130["meta"] = ExpandInt.toData(5)
        array81[n132] = item130.withTag(ExpandAnyDict.asData(hashMap130))
        array79[n130] = array81
        recipes47.addShaped(amount11, array79, null)
        val recipes48 = MineTweakerAPI.recipes
        val item131 = ItemBracketHandler.getItem("ExtraTrees:gate", 37)
        val hashMap131 = HashMap<String, IData>()
        hashMap131["meta"] = ExpandInt.toData(37)
        val amount12 = item131.withTag(ExpandAnyDict.asData(hashMap131)).amount(4)
        val array82 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n133 = 1
        val array83 = arrayOfNulls<IIngredient>(3)
        val n134 = 0
        val item132 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap132 = HashMap<String, IData>()
        hashMap132["meta"] = ExpandInt.toData(5)
        array83[n134] = item132.withTag(ExpandAnyDict.asData(hashMap132))
        array83[1] = OreBracketHandler.getOre("stickWood")
        val n135 = 2
        val item133 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap133 = HashMap<String, IData>()
        hashMap133["meta"] = ExpandInt.toData(5)
        array83[n135] = item133.withTag(ExpandAnyDict.asData(hashMap133))
        array82[n133] = array83
        val n136 = 2
        val array84 = arrayOfNulls<IIngredient>(3)
        val n137 = 0
        val item134 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap134 = HashMap<String, IData>()
        hashMap134["meta"] = ExpandInt.toData(5)
        array84[n137] = item134.withTag(ExpandAnyDict.asData(hashMap134))
        array84[1] = OreBracketHandler.getOre("stickWood")
        val n138 = 2
        val item135 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap135 = HashMap<String, IData>()
        hashMap135["meta"] = ExpandInt.toData(5)
        array84[n138] = item135.withTag(ExpandAnyDict.asData(hashMap135))
        array82[n136] = array84
        recipes48.addShaped(amount12, array82, null)
        val recipes49 = MineTweakerAPI.recipes
        val item136 = ItemBracketHandler.getItem("ExtraTrees:gate", 38)
        val hashMap136 = HashMap<String, IData>()
        hashMap136["meta"] = ExpandInt.toData(38)
        val withTag22 = item136.withTag(ExpandAnyDict.asData(hashMap136))
        val array85 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n139 = 1
        val array86 = arrayOfNulls<IIngredient>(3)
        val n140 = 0
        val item137 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap137 = HashMap<String, IData>()
        hashMap137["meta"] = ExpandInt.toData(6)
        array86[n140] = item137.withTag(ExpandAnyDict.asData(hashMap137))
        array86[1] = OreBracketHandler.getOre("stickWood")
        val n141 = 2
        val item138 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap138 = HashMap<String, IData>()
        hashMap138["meta"] = ExpandInt.toData(6)
        array86[n141] = item138.withTag(ExpandAnyDict.asData(hashMap138))
        array85[n139] = array86
        val n142 = 2
        val array87 = arrayOfNulls<IIngredient>(3)
        val n143 = 0
        val item139 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap139 = HashMap<String, IData>()
        hashMap139["meta"] = ExpandInt.toData(6)
        array87[n143] = item139.withTag(ExpandAnyDict.asData(hashMap139))
        array87[1] = OreBracketHandler.getOre("stickWood")
        val n144 = 2
        val item140 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap140 = HashMap<String, IData>()
        hashMap140["meta"] = ExpandInt.toData(6)
        array87[n144] = item140.withTag(ExpandAnyDict.asData(hashMap140))
        array85[n142] = array87
        recipes49.addShaped(withTag22, array85, null)
        val recipes50 = MineTweakerAPI.recipes
        val item141 = ItemBracketHandler.getItem("ExtraTrees:gate", 38)
        val hashMap141 = HashMap<String, IData>()
        hashMap141["meta"] = ExpandInt.toData(38)
        val amount13 = item141.withTag(ExpandAnyDict.asData(hashMap141)).amount(2)
        val array88 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n145 = 1
        val array89 = arrayOfNulls<IIngredient>(3)
        val n146 = 0
        val item142 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap142 = HashMap<String, IData>()
        hashMap142["meta"] = ExpandInt.toData(6)
        array89[n146] = item142.withTag(ExpandAnyDict.asData(hashMap142))
        array89[1] = OreBracketHandler.getOre("stickWood")
        val n147 = 2
        val item143 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap143 = HashMap<String, IData>()
        hashMap143["meta"] = ExpandInt.toData(6)
        array89[n147] = item143.withTag(ExpandAnyDict.asData(hashMap143))
        array88[n145] = array89
        val n148 = 2
        val array90 = arrayOfNulls<IIngredient>(3)
        val n149 = 0
        val item144 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap144 = HashMap<String, IData>()
        hashMap144["meta"] = ExpandInt.toData(6)
        array90[n149] = item144.withTag(ExpandAnyDict.asData(hashMap144))
        array90[1] = OreBracketHandler.getOre("stickWood")
        val n150 = 2
        val item145 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap145 = HashMap<String, IData>()
        hashMap145["meta"] = ExpandInt.toData(6)
        array90[n150] = item145.withTag(ExpandAnyDict.asData(hashMap145))
        array88[n148] = array90
        recipes50.addShaped(amount13, array88, null)
        val recipes51 = MineTweakerAPI.recipes
        val item146 = ItemBracketHandler.getItem("ExtraTrees:gate", 38)
        val hashMap146 = HashMap<String, IData>()
        hashMap146["meta"] = ExpandInt.toData(38)
        val amount14 = item146.withTag(ExpandAnyDict.asData(hashMap146)).amount(4)
        val array91 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n151 = 1
        val array92 = arrayOfNulls<IIngredient>(3)
        val n152 = 0
        val item147 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap147 = HashMap<String, IData>()
        hashMap147["meta"] = ExpandInt.toData(6)
        array92[n152] = item147.withTag(ExpandAnyDict.asData(hashMap147))
        array92[1] = OreBracketHandler.getOre("stickWood")
        val n153 = 2
        val item148 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap148 = HashMap<String, IData>()
        hashMap148["meta"] = ExpandInt.toData(6)
        array92[n153] = item148.withTag(ExpandAnyDict.asData(hashMap148))
        array91[n151] = array92
        val n154 = 2
        val array93 = arrayOfNulls<IIngredient>(3)
        val n155 = 0
        val item149 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap149 = HashMap<String, IData>()
        hashMap149["meta"] = ExpandInt.toData(6)
        array93[n155] = item149.withTag(ExpandAnyDict.asData(hashMap149))
        array93[1] = OreBracketHandler.getOre("stickWood")
        val n156 = 2
        val item150 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap150 = HashMap<String, IData>()
        hashMap150["meta"] = ExpandInt.toData(6)
        array93[n156] = item150.withTag(ExpandAnyDict.asData(hashMap150))
        array91[n154] = array93
        recipes51.addShaped(amount14, array91, null)
        val recipes52 = MineTweakerAPI.recipes
        val item151 = ItemBracketHandler.getItem("ExtraTrees:gate", 39)
        val hashMap151 = HashMap<String, IData>()
        hashMap151["meta"] = ExpandInt.toData(39)
        val withTag23 = item151.withTag(ExpandAnyDict.asData(hashMap151))
        val array94 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n157 = 1
        val array95 = arrayOfNulls<IIngredient>(3)
        val n158 = 0
        val item152 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap152 = HashMap<String, IData>()
        hashMap152["meta"] = ExpandInt.toData(7)
        array95[n158] = item152.withTag(ExpandAnyDict.asData(hashMap152))
        array95[1] = OreBracketHandler.getOre("stickWood")
        val n159 = 2
        val item153 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap153 = HashMap<String, IData>()
        hashMap153["meta"] = ExpandInt.toData(7)
        array95[n159] = item153.withTag(ExpandAnyDict.asData(hashMap153))
        array94[n157] = array95
        val n160 = 2
        val array96 = arrayOfNulls<IIngredient>(3)
        val n161 = 0
        val item154 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap154 = HashMap<String, IData>()
        hashMap154["meta"] = ExpandInt.toData(7)
        array96[n161] = item154.withTag(ExpandAnyDict.asData(hashMap154))
        array96[1] = OreBracketHandler.getOre("stickWood")
        val n162 = 2
        val item155 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap155 = HashMap<String, IData>()
        hashMap155["meta"] = ExpandInt.toData(7)
        array96[n162] = item155.withTag(ExpandAnyDict.asData(hashMap155))
        array94[n160] = array96
        recipes52.addShaped(withTag23, array94, null)
        val recipes53 = MineTweakerAPI.recipes
        val item156 = ItemBracketHandler.getItem("ExtraTrees:gate", 39)
        val hashMap156 = HashMap<String, IData>()
        hashMap156["meta"] = ExpandInt.toData(39)
        val amount15 = item156.withTag(ExpandAnyDict.asData(hashMap156)).amount(2)
        val array97 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n163 = 1
        val array98 = arrayOfNulls<IIngredient>(3)
        val n164 = 0
        val item157 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap157 = HashMap<String, IData>()
        hashMap157["meta"] = ExpandInt.toData(7)
        array98[n164] = item157.withTag(ExpandAnyDict.asData(hashMap157))
        array98[1] = OreBracketHandler.getOre("stickWood")
        val n165 = 2
        val item158 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap158 = HashMap<String, IData>()
        hashMap158["meta"] = ExpandInt.toData(7)
        array98[n165] = item158.withTag(ExpandAnyDict.asData(hashMap158))
        array97[n163] = array98
        val n166 = 2
        val array99 = arrayOfNulls<IIngredient>(3)
        val n167 = 0
        val item159 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap159 = HashMap<String, IData>()
        hashMap159["meta"] = ExpandInt.toData(7)
        array99[n167] = item159.withTag(ExpandAnyDict.asData(hashMap159))
        array99[1] = OreBracketHandler.getOre("stickWood")
        val n168 = 2
        val item160 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap160 = HashMap<String, IData>()
        hashMap160["meta"] = ExpandInt.toData(7)
        array99[n168] = item160.withTag(ExpandAnyDict.asData(hashMap160))
        array97[n166] = array99
        recipes53.addShaped(amount15, array97, null)
        val recipes54 = MineTweakerAPI.recipes
        val item161 = ItemBracketHandler.getItem("ExtraTrees:gate", 39)
        val hashMap161 = HashMap<String, IData>()
        hashMap161["meta"] = ExpandInt.toData(39)
        val amount16 = item161.withTag(ExpandAnyDict.asData(hashMap161)).amount(4)
        val array100 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n169 = 1
        val array101 = arrayOfNulls<IIngredient>(3)
        val n170 = 0
        val item162 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap162 = HashMap<String, IData>()
        hashMap162["meta"] = ExpandInt.toData(7)
        array101[n170] = item162.withTag(ExpandAnyDict.asData(hashMap162))
        array101[1] = OreBracketHandler.getOre("stickWood")
        val n171 = 2
        val item163 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap163 = HashMap<String, IData>()
        hashMap163["meta"] = ExpandInt.toData(7)
        array101[n171] = item163.withTag(ExpandAnyDict.asData(hashMap163))
        array100[n169] = array101
        val n172 = 2
        val array102 = arrayOfNulls<IIngredient>(3)
        val n173 = 0
        val item164 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap164 = HashMap<String, IData>()
        hashMap164["meta"] = ExpandInt.toData(7)
        array102[n173] = item164.withTag(ExpandAnyDict.asData(hashMap164))
        array102[1] = OreBracketHandler.getOre("stickWood")
        val n174 = 2
        val item165 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap165 = HashMap<String, IData>()
        hashMap165["meta"] = ExpandInt.toData(7)
        array102[n174] = item165.withTag(ExpandAnyDict.asData(hashMap165))
        array100[n172] = array102
        recipes54.addShaped(amount16, array100, null)
        val recipes55 = MineTweakerAPI.recipes
        val item166 = ItemBracketHandler.getItem("ExtraTrees:gate", 40)
        val hashMap166 = HashMap<String, IData>()
        hashMap166["meta"] = ExpandInt.toData(40)
        val withTag24 = item166.withTag(ExpandAnyDict.asData(hashMap166))
        val array103 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n175 = 1
        val array104 = arrayOfNulls<IIngredient>(3)
        val n176 = 0
        val item167 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap167 = HashMap<String, IData>()
        hashMap167["meta"] = ExpandInt.toData(8)
        array104[n176] = item167.withTag(ExpandAnyDict.asData(hashMap167))
        array104[1] = OreBracketHandler.getOre("stickWood")
        val n177 = 2
        val item168 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap168 = HashMap<String, IData>()
        hashMap168["meta"] = ExpandInt.toData(8)
        array104[n177] = item168.withTag(ExpandAnyDict.asData(hashMap168))
        array103[n175] = array104
        val n178 = 2
        val array105 = arrayOfNulls<IIngredient>(3)
        val n179 = 0
        val item169 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap169 = HashMap<String, IData>()
        hashMap169["meta"] = ExpandInt.toData(8)
        array105[n179] = item169.withTag(ExpandAnyDict.asData(hashMap169))
        array105[1] = OreBracketHandler.getOre("stickWood")
        val n180 = 2
        val item170 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap170 = HashMap<String, IData>()
        hashMap170["meta"] = ExpandInt.toData(8)
        array105[n180] = item170.withTag(ExpandAnyDict.asData(hashMap170))
        array103[n178] = array105
        recipes55.addShaped(withTag24, array103, null)
        val recipes56 = MineTweakerAPI.recipes
        val item171 = ItemBracketHandler.getItem("ExtraTrees:gate", 40)
        val hashMap171 = HashMap<String, IData>()
        hashMap171["meta"] = ExpandInt.toData(40)
        val amount17 = item171.withTag(ExpandAnyDict.asData(hashMap171)).amount(2)
        val array106 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n181 = 1
        val array107 = arrayOfNulls<IIngredient>(3)
        val n182 = 0
        val item172 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap172 = HashMap<String, IData>()
        hashMap172["meta"] = ExpandInt.toData(8)
        array107[n182] = item172.withTag(ExpandAnyDict.asData(hashMap172))
        array107[1] = OreBracketHandler.getOre("stickWood")
        val n183 = 2
        val item173 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap173 = HashMap<String, IData>()
        hashMap173["meta"] = ExpandInt.toData(8)
        array107[n183] = item173.withTag(ExpandAnyDict.asData(hashMap173))
        array106[n181] = array107
        val n184 = 2
        val array108 = arrayOfNulls<IIngredient>(3)
        val n185 = 0
        val item174 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap174 = HashMap<String, IData>()
        hashMap174["meta"] = ExpandInt.toData(8)
        array108[n185] = item174.withTag(ExpandAnyDict.asData(hashMap174))
        array108[1] = OreBracketHandler.getOre("stickWood")
        val n186 = 2
        val item175 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap175 = HashMap<String, IData>()
        hashMap175["meta"] = ExpandInt.toData(8)
        array108[n186] = item175.withTag(ExpandAnyDict.asData(hashMap175))
        array106[n184] = array108
        recipes56.addShaped(amount17, array106, null)
        val recipes57 = MineTweakerAPI.recipes
        val item176 = ItemBracketHandler.getItem("ExtraTrees:gate", 40)
        val hashMap176 = HashMap<String, IData>()
        hashMap176["meta"] = ExpandInt.toData(40)
        val amount18 = item176.withTag(ExpandAnyDict.asData(hashMap176)).amount(4)
        val array109 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n187 = 1
        val array110 = arrayOfNulls<IIngredient>(3)
        val n188 = 0
        val item177 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap177 = HashMap<String, IData>()
        hashMap177["meta"] = ExpandInt.toData(8)
        array110[n188] = item177.withTag(ExpandAnyDict.asData(hashMap177))
        array110[1] = OreBracketHandler.getOre("stickWood")
        val n189 = 2
        val item178 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap178 = HashMap<String, IData>()
        hashMap178["meta"] = ExpandInt.toData(8)
        array110[n189] = item178.withTag(ExpandAnyDict.asData(hashMap178))
        array109[n187] = array110
        val n190 = 2
        val array111 = arrayOfNulls<IIngredient>(3)
        val n191 = 0
        val item179 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap179 = HashMap<String, IData>()
        hashMap179["meta"] = ExpandInt.toData(8)
        array111[n191] = item179.withTag(ExpandAnyDict.asData(hashMap179))
        array111[1] = OreBracketHandler.getOre("stickWood")
        val n192 = 2
        val item180 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap180 = HashMap<String, IData>()
        hashMap180["meta"] = ExpandInt.toData(8)
        array111[n192] = item180.withTag(ExpandAnyDict.asData(hashMap180))
        array109[n190] = array111
        recipes57.addShaped(amount18, array109, null)
        val recipes58 = MineTweakerAPI.recipes
        val item181 = ItemBracketHandler.getItem("ExtraTrees:gate", 41)
        val hashMap181 = HashMap<String, IData>()
        hashMap181["meta"] = ExpandInt.toData(41)
        val withTag25 = item181.withTag(ExpandAnyDict.asData(hashMap181))
        val array112 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n193 = 1
        val array113 = arrayOfNulls<IIngredient>(3)
        val n194 = 0
        val item182 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap182 = HashMap<String, IData>()
        hashMap182["meta"] = ExpandInt.toData(9)
        array113[n194] = item182.withTag(ExpandAnyDict.asData(hashMap182))
        array113[1] = OreBracketHandler.getOre("stickWood")
        val n195 = 2
        val item183 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap183 = HashMap<String, IData>()
        hashMap183["meta"] = ExpandInt.toData(9)
        array113[n195] = item183.withTag(ExpandAnyDict.asData(hashMap183))
        array112[n193] = array113
        val n196 = 2
        val array114 = arrayOfNulls<IIngredient>(3)
        val n197 = 0
        val item184 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap184 = HashMap<String, IData>()
        hashMap184["meta"] = ExpandInt.toData(9)
        array114[n197] = item184.withTag(ExpandAnyDict.asData(hashMap184))
        array114[1] = OreBracketHandler.getOre("stickWood")
        val n198 = 2
        val item185 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap185 = HashMap<String, IData>()
        hashMap185["meta"] = ExpandInt.toData(9)
        array114[n198] = item185.withTag(ExpandAnyDict.asData(hashMap185))
        array112[n196] = array114
        recipes58.addShaped(withTag25, array112, null)
        val recipes59 = MineTweakerAPI.recipes
        val item186 = ItemBracketHandler.getItem("ExtraTrees:gate", 41)
        val hashMap186 = HashMap<String, IData>()
        hashMap186["meta"] = ExpandInt.toData(41)
        val amount19 = item186.withTag(ExpandAnyDict.asData(hashMap186)).amount(2)
        val array115 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n199 = 1
        val array116 = arrayOfNulls<IIngredient>(3)
        val n200 = 0
        val item187 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap187 = HashMap<String, IData>()
        hashMap187["meta"] = ExpandInt.toData(9)
        array116[n200] = item187.withTag(ExpandAnyDict.asData(hashMap187))
        array116[1] = OreBracketHandler.getOre("stickWood")
        val n201 = 2
        val item188 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap188 = HashMap<String, IData>()
        hashMap188["meta"] = ExpandInt.toData(9)
        array116[n201] = item188.withTag(ExpandAnyDict.asData(hashMap188))
        array115[n199] = array116
        val n202 = 2
        val array117 = arrayOfNulls<IIngredient>(3)
        val n203 = 0
        val item189 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap189 = HashMap<String, IData>()
        hashMap189["meta"] = ExpandInt.toData(9)
        array117[n203] = item189.withTag(ExpandAnyDict.asData(hashMap189))
        array117[1] = OreBracketHandler.getOre("stickWood")
        val n204 = 2
        val item190 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap190 = HashMap<String, IData>()
        hashMap190["meta"] = ExpandInt.toData(9)
        array117[n204] = item190.withTag(ExpandAnyDict.asData(hashMap190))
        array115[n202] = array117
        recipes59.addShaped(amount19, array115, null)
        val recipes60 = MineTweakerAPI.recipes
        val item191 = ItemBracketHandler.getItem("ExtraTrees:gate", 41)
        val hashMap191 = HashMap<String, IData>()
        hashMap191["meta"] = ExpandInt.toData(41)
        val amount20 = item191.withTag(ExpandAnyDict.asData(hashMap191)).amount(4)
        val array118 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n205 = 1
        val array119 = arrayOfNulls<IIngredient>(3)
        val n206 = 0
        val item192 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap192 = HashMap<String, IData>()
        hashMap192["meta"] = ExpandInt.toData(9)
        array119[n206] = item192.withTag(ExpandAnyDict.asData(hashMap192))
        array119[1] = OreBracketHandler.getOre("stickWood")
        val n207 = 2
        val item193 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap193 = HashMap<String, IData>()
        hashMap193["meta"] = ExpandInt.toData(9)
        array119[n207] = item193.withTag(ExpandAnyDict.asData(hashMap193))
        array118[n205] = array119
        val n208 = 2
        val array120 = arrayOfNulls<IIngredient>(3)
        val n209 = 0
        val item194 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap194 = HashMap<String, IData>()
        hashMap194["meta"] = ExpandInt.toData(9)
        array120[n209] = item194.withTag(ExpandAnyDict.asData(hashMap194))
        array120[1] = OreBracketHandler.getOre("stickWood")
        val n210 = 2
        val item195 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap195 = HashMap<String, IData>()
        hashMap195["meta"] = ExpandInt.toData(9)
        array120[n210] = item195.withTag(ExpandAnyDict.asData(hashMap195))
        array118[n208] = array120
        recipes60.addShaped(amount20, array118, null)
        val recipes61 = MineTweakerAPI.recipes
        val item196 = ItemBracketHandler.getItem("ExtraTrees:gate", 42)
        val hashMap196 = HashMap<String, IData>()
        hashMap196["meta"] = ExpandInt.toData(42)
        val withTag26 = item196.withTag(ExpandAnyDict.asData(hashMap196))
        val array121 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n211 = 1
        val array122 = arrayOfNulls<IIngredient>(3)
        val n212 = 0
        val item197 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap197 = HashMap<String, IData>()
        hashMap197["meta"] = ExpandInt.toData(10)
        array122[n212] = item197.withTag(ExpandAnyDict.asData(hashMap197))
        array122[1] = OreBracketHandler.getOre("stickWood")
        val n213 = 2
        val item198 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap198 = HashMap<String, IData>()
        hashMap198["meta"] = ExpandInt.toData(10)
        array122[n213] = item198.withTag(ExpandAnyDict.asData(hashMap198))
        array121[n211] = array122
        val n214 = 2
        val array123 = arrayOfNulls<IIngredient>(3)
        val n215 = 0
        val item199 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap199 = HashMap<String, IData>()
        hashMap199["meta"] = ExpandInt.toData(10)
        array123[n215] = item199.withTag(ExpandAnyDict.asData(hashMap199))
        array123[1] = OreBracketHandler.getOre("stickWood")
        val n216 = 2
        val item200 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap200 = HashMap<String, IData>()
        hashMap200["meta"] = ExpandInt.toData(10)
        array123[n216] = item200.withTag(ExpandAnyDict.asData(hashMap200))
        array121[n214] = array123
        recipes61.addShaped(withTag26, array121, null)
        val recipes62 = MineTweakerAPI.recipes
        val item201 = ItemBracketHandler.getItem("ExtraTrees:gate", 42)
        val hashMap201 = HashMap<String, IData>()
        hashMap201["meta"] = ExpandInt.toData(42)
        val amount21 = item201.withTag(ExpandAnyDict.asData(hashMap201)).amount(2)
        val array124 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n217 = 1
        val array125 = arrayOfNulls<IIngredient>(3)
        val n218 = 0
        val item202 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap202 = HashMap<String, IData>()
        hashMap202["meta"] = ExpandInt.toData(10)
        array125[n218] = item202.withTag(ExpandAnyDict.asData(hashMap202))
        array125[1] = OreBracketHandler.getOre("stickWood")
        val n219 = 2
        val item203 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap203 = HashMap<String, IData>()
        hashMap203["meta"] = ExpandInt.toData(10)
        array125[n219] = item203.withTag(ExpandAnyDict.asData(hashMap203))
        array124[n217] = array125
        val n220 = 2
        val array126 = arrayOfNulls<IIngredient>(3)
        val n221 = 0
        val item204 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap204 = HashMap<String, IData>()
        hashMap204["meta"] = ExpandInt.toData(10)
        array126[n221] = item204.withTag(ExpandAnyDict.asData(hashMap204))
        array126[1] = OreBracketHandler.getOre("stickWood")
        val n222 = 2
        val item205 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap205 = HashMap<String, IData>()
        hashMap205["meta"] = ExpandInt.toData(10)
        array126[n222] = item205.withTag(ExpandAnyDict.asData(hashMap205))
        array124[n220] = array126
        recipes62.addShaped(amount21, array124, null)
        val recipes63 = MineTweakerAPI.recipes
        val item206 = ItemBracketHandler.getItem("ExtraTrees:gate", 42)
        val hashMap206 = HashMap<String, IData>()
        hashMap206["meta"] = ExpandInt.toData(42)
        val amount22 = item206.withTag(ExpandAnyDict.asData(hashMap206)).amount(4)
        val array127 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n223 = 1
        val array128 = arrayOfNulls<IIngredient>(3)
        val n224 = 0
        val item207 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap207 = HashMap<String, IData>()
        hashMap207["meta"] = ExpandInt.toData(10)
        array128[n224] = item207.withTag(ExpandAnyDict.asData(hashMap207))
        array128[1] = OreBracketHandler.getOre("stickWood")
        val n225 = 2
        val item208 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap208 = HashMap<String, IData>()
        hashMap208["meta"] = ExpandInt.toData(10)
        array128[n225] = item208.withTag(ExpandAnyDict.asData(hashMap208))
        array127[n223] = array128
        val n226 = 2
        val array129 = arrayOfNulls<IIngredient>(3)
        val n227 = 0
        val item209 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap209 = HashMap<String, IData>()
        hashMap209["meta"] = ExpandInt.toData(10)
        array129[n227] = item209.withTag(ExpandAnyDict.asData(hashMap209))
        array129[1] = OreBracketHandler.getOre("stickWood")
        val n228 = 2
        val item210 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap210 = HashMap<String, IData>()
        hashMap210["meta"] = ExpandInt.toData(10)
        array129[n228] = item210.withTag(ExpandAnyDict.asData(hashMap210))
        array127[n226] = array129
        recipes63.addShaped(amount22, array127, null)
        val recipes64 = MineTweakerAPI.recipes
        val item211 = ItemBracketHandler.getItem("ExtraTrees:gate", 43)
        val hashMap211 = HashMap<String, IData>()
        hashMap211["meta"] = ExpandInt.toData(43)
        val withTag27 = item211.withTag(ExpandAnyDict.asData(hashMap211))
        val array130 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n229 = 1
        val array131 = arrayOfNulls<IIngredient>(3)
        val n230 = 0
        val item212 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap212 = HashMap<String, IData>()
        hashMap212["meta"] = ExpandInt.toData(11)
        array131[n230] = item212.withTag(ExpandAnyDict.asData(hashMap212))
        array131[1] = OreBracketHandler.getOre("stickWood")
        val n231 = 2
        val item213 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap213 = HashMap<String, IData>()
        hashMap213["meta"] = ExpandInt.toData(11)
        array131[n231] = item213.withTag(ExpandAnyDict.asData(hashMap213))
        array130[n229] = array131
        val n232 = 2
        val array132 = arrayOfNulls<IIngredient>(3)
        val n233 = 0
        val item214 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap214 = HashMap<String, IData>()
        hashMap214["meta"] = ExpandInt.toData(11)
        array132[n233] = item214.withTag(ExpandAnyDict.asData(hashMap214))
        array132[1] = OreBracketHandler.getOre("stickWood")
        val n234 = 2
        val item215 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap215 = HashMap<String, IData>()
        hashMap215["meta"] = ExpandInt.toData(11)
        array132[n234] = item215.withTag(ExpandAnyDict.asData(hashMap215))
        array130[n232] = array132
        recipes64.addShaped(withTag27, array130, null)
        val recipes65 = MineTweakerAPI.recipes
        val item216 = ItemBracketHandler.getItem("ExtraTrees:gate", 43)
        val hashMap216 = HashMap<String, IData>()
        hashMap216["meta"] = ExpandInt.toData(43)
        val amount23 = item216.withTag(ExpandAnyDict.asData(hashMap216)).amount(2)
        val array133 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n235 = 1
        val array134 = arrayOfNulls<IIngredient>(3)
        val n236 = 0
        val item217 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap217 = HashMap<String, IData>()
        hashMap217["meta"] = ExpandInt.toData(11)
        array134[n236] = item217.withTag(ExpandAnyDict.asData(hashMap217))
        array134[1] = OreBracketHandler.getOre("stickWood")
        val n237 = 2
        val item218 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap218 = HashMap<String, IData>()
        hashMap218["meta"] = ExpandInt.toData(11)
        array134[n237] = item218.withTag(ExpandAnyDict.asData(hashMap218))
        array133[n235] = array134
        val n238 = 2
        val array135 = arrayOfNulls<IIngredient>(3)
        val n239 = 0
        val item219 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap219 = HashMap<String, IData>()
        hashMap219["meta"] = ExpandInt.toData(11)
        array135[n239] = item219.withTag(ExpandAnyDict.asData(hashMap219))
        array135[1] = OreBracketHandler.getOre("stickWood")
        val n240 = 2
        val item220 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap220 = HashMap<String, IData>()
        hashMap220["meta"] = ExpandInt.toData(11)
        array135[n240] = item220.withTag(ExpandAnyDict.asData(hashMap220))
        array133[n238] = array135
        recipes65.addShaped(amount23, array133, null)
        val recipes66 = MineTweakerAPI.recipes
        val item221 = ItemBracketHandler.getItem("ExtraTrees:gate", 43)
        val hashMap221 = HashMap<String, IData>()
        hashMap221["meta"] = ExpandInt.toData(43)
        val amount24 = item221.withTag(ExpandAnyDict.asData(hashMap221)).amount(4)
        val array136 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n241 = 1
        val array137 = arrayOfNulls<IIngredient>(3)
        val n242 = 0
        val item222 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap222 = HashMap<String, IData>()
        hashMap222["meta"] = ExpandInt.toData(11)
        array137[n242] = item222.withTag(ExpandAnyDict.asData(hashMap222))
        array137[1] = OreBracketHandler.getOre("stickWood")
        val n243 = 2
        val item223 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap223 = HashMap<String, IData>()
        hashMap223["meta"] = ExpandInt.toData(11)
        array137[n243] = item223.withTag(ExpandAnyDict.asData(hashMap223))
        array136[n241] = array137
        val n244 = 2
        val array138 = arrayOfNulls<IIngredient>(3)
        val n245 = 0
        val item224 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap224 = HashMap<String, IData>()
        hashMap224["meta"] = ExpandInt.toData(11)
        array138[n245] = item224.withTag(ExpandAnyDict.asData(hashMap224))
        array138[1] = OreBracketHandler.getOre("stickWood")
        val n246 = 2
        val item225 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap225 = HashMap<String, IData>()
        hashMap225["meta"] = ExpandInt.toData(11)
        array138[n246] = item225.withTag(ExpandAnyDict.asData(hashMap225))
        array136[n244] = array138
        recipes66.addShaped(amount24, array136, null)
        val recipes67 = MineTweakerAPI.recipes
        val item226 = ItemBracketHandler.getItem("ExtraTrees:gate", 44)
        val hashMap226 = HashMap<String, IData>()
        hashMap226["meta"] = ExpandInt.toData(44)
        val withTag28 = item226.withTag(ExpandAnyDict.asData(hashMap226))
        val array139 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n247 = 1
        val array140 = arrayOfNulls<IIngredient>(3)
        val n248 = 0
        val item227 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap227 = HashMap<String, IData>()
        hashMap227["meta"] = ExpandInt.toData(12)
        array140[n248] = item227.withTag(ExpandAnyDict.asData(hashMap227))
        array140[1] = OreBracketHandler.getOre("stickWood")
        val n249 = 2
        val item228 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap228 = HashMap<String, IData>()
        hashMap228["meta"] = ExpandInt.toData(12)
        array140[n249] = item228.withTag(ExpandAnyDict.asData(hashMap228))
        array139[n247] = array140
        val n250 = 2
        val array141 = arrayOfNulls<IIngredient>(3)
        val n251 = 0
        val item229 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap229 = HashMap<String, IData>()
        hashMap229["meta"] = ExpandInt.toData(12)
        array141[n251] = item229.withTag(ExpandAnyDict.asData(hashMap229))
        array141[1] = OreBracketHandler.getOre("stickWood")
        val n252 = 2
        val item230 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap230 = HashMap<String, IData>()
        hashMap230["meta"] = ExpandInt.toData(12)
        array141[n252] = item230.withTag(ExpandAnyDict.asData(hashMap230))
        array139[n250] = array141
        recipes67.addShaped(withTag28, array139, null)
        val recipes68 = MineTweakerAPI.recipes
        val item231 = ItemBracketHandler.getItem("ExtraTrees:gate", 44)
        val hashMap231 = HashMap<String, IData>()
        hashMap231["meta"] = ExpandInt.toData(44)
        val amount25 = item231.withTag(ExpandAnyDict.asData(hashMap231)).amount(2)
        val array142 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n253 = 1
        val array143 = arrayOfNulls<IIngredient>(3)
        val n254 = 0
        val item232 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap232 = HashMap<String, IData>()
        hashMap232["meta"] = ExpandInt.toData(12)
        array143[n254] = item232.withTag(ExpandAnyDict.asData(hashMap232))
        array143[1] = OreBracketHandler.getOre("stickWood")
        val n255 = 2
        val item233 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap233 = HashMap<String, IData>()
        hashMap233["meta"] = ExpandInt.toData(12)
        array143[n255] = item233.withTag(ExpandAnyDict.asData(hashMap233))
        array142[n253] = array143
        val n256 = 2
        val array144 = arrayOfNulls<IIngredient>(3)
        val n257 = 0
        val item234 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap234 = HashMap<String, IData>()
        hashMap234["meta"] = ExpandInt.toData(12)
        array144[n257] = item234.withTag(ExpandAnyDict.asData(hashMap234))
        array144[1] = OreBracketHandler.getOre("stickWood")
        val n258 = 2
        val item235 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap235 = HashMap<String, IData>()
        hashMap235["meta"] = ExpandInt.toData(12)
        array144[n258] = item235.withTag(ExpandAnyDict.asData(hashMap235))
        array142[n256] = array144
        recipes68.addShaped(amount25, array142, null)
        val recipes69 = MineTweakerAPI.recipes
        val item236 = ItemBracketHandler.getItem("ExtraTrees:gate", 44)
        val hashMap236 = HashMap<String, IData>()
        hashMap236["meta"] = ExpandInt.toData(44)
        val amount26 = item236.withTag(ExpandAnyDict.asData(hashMap236)).amount(4)
        val array145 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n259 = 1
        val array146 = arrayOfNulls<IIngredient>(3)
        val n260 = 0
        val item237 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap237 = HashMap<String, IData>()
        hashMap237["meta"] = ExpandInt.toData(12)
        array146[n260] = item237.withTag(ExpandAnyDict.asData(hashMap237))
        array146[1] = OreBracketHandler.getOre("stickWood")
        val n261 = 2
        val item238 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap238 = HashMap<String, IData>()
        hashMap238["meta"] = ExpandInt.toData(12)
        array146[n261] = item238.withTag(ExpandAnyDict.asData(hashMap238))
        array145[n259] = array146
        val n262 = 2
        val array147 = arrayOfNulls<IIngredient>(3)
        val n263 = 0
        val item239 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap239 = HashMap<String, IData>()
        hashMap239["meta"] = ExpandInt.toData(12)
        array147[n263] = item239.withTag(ExpandAnyDict.asData(hashMap239))
        array147[1] = OreBracketHandler.getOre("stickWood")
        val n264 = 2
        val item240 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap240 = HashMap<String, IData>()
        hashMap240["meta"] = ExpandInt.toData(12)
        array147[n264] = item240.withTag(ExpandAnyDict.asData(hashMap240))
        array145[n262] = array147
        recipes69.addShaped(amount26, array145, null)
        val recipes70 = MineTweakerAPI.recipes
        val item241 = ItemBracketHandler.getItem("ExtraTrees:gate", 45)
        val hashMap241 = HashMap<String, IData>()
        hashMap241["meta"] = ExpandInt.toData(45)
        val withTag29 = item241.withTag(ExpandAnyDict.asData(hashMap241))
        val array148 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n265 = 1
        val array149 = arrayOfNulls<IIngredient>(3)
        val n266 = 0
        val item242 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap242 = HashMap<String, IData>()
        hashMap242["meta"] = ExpandInt.toData(13)
        array149[n266] = item242.withTag(ExpandAnyDict.asData(hashMap242))
        array149[1] = OreBracketHandler.getOre("stickWood")
        val n267 = 2
        val item243 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap243 = HashMap<String, IData>()
        hashMap243["meta"] = ExpandInt.toData(13)
        array149[n267] = item243.withTag(ExpandAnyDict.asData(hashMap243))
        array148[n265] = array149
        val n268 = 2
        val array150 = arrayOfNulls<IIngredient>(3)
        val n269 = 0
        val item244 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap244 = HashMap<String, IData>()
        hashMap244["meta"] = ExpandInt.toData(13)
        array150[n269] = item244.withTag(ExpandAnyDict.asData(hashMap244))
        array150[1] = OreBracketHandler.getOre("stickWood")
        val n270 = 2
        val item245 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap245 = HashMap<String, IData>()
        hashMap245["meta"] = ExpandInt.toData(13)
        array150[n270] = item245.withTag(ExpandAnyDict.asData(hashMap245))
        array148[n268] = array150
        recipes70.addShaped(withTag29, array148, null)
        val recipes71 = MineTweakerAPI.recipes
        val item246 = ItemBracketHandler.getItem("ExtraTrees:gate", 45)
        val hashMap246 = HashMap<String, IData>()
        hashMap246["meta"] = ExpandInt.toData(45)
        val amount27 = item246.withTag(ExpandAnyDict.asData(hashMap246)).amount(2)
        val array151 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n271 = 1
        val array152 = arrayOfNulls<IIngredient>(3)
        val n272 = 0
        val item247 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap247 = HashMap<String, IData>()
        hashMap247["meta"] = ExpandInt.toData(13)
        array152[n272] = item247.withTag(ExpandAnyDict.asData(hashMap247))
        array152[1] = OreBracketHandler.getOre("stickWood")
        val n273 = 2
        val item248 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap248 = HashMap<String, IData>()
        hashMap248["meta"] = ExpandInt.toData(13)
        array152[n273] = item248.withTag(ExpandAnyDict.asData(hashMap248))
        array151[n271] = array152
        val n274 = 2
        val array153 = arrayOfNulls<IIngredient>(3)
        val n275 = 0
        val item249 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap249 = HashMap<String, IData>()
        hashMap249["meta"] = ExpandInt.toData(13)
        array153[n275] = item249.withTag(ExpandAnyDict.asData(hashMap249))
        array153[1] = OreBracketHandler.getOre("stickWood")
        val n276 = 2
        val item250 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap250 = HashMap<String, IData>()
        hashMap250["meta"] = ExpandInt.toData(13)
        array153[n276] = item250.withTag(ExpandAnyDict.asData(hashMap250))
        array151[n274] = array153
        recipes71.addShaped(amount27, array151, null)
        val recipes72 = MineTweakerAPI.recipes
        val item251 = ItemBracketHandler.getItem("ExtraTrees:gate", 45)
        val hashMap251 = HashMap<String, IData>()
        hashMap251["meta"] = ExpandInt.toData(45)
        val amount28 = item251.withTag(ExpandAnyDict.asData(hashMap251)).amount(4)
        val array154 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n277 = 1
        val array155 = arrayOfNulls<IIngredient>(3)
        val n278 = 0
        val item252 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap252 = HashMap<String, IData>()
        hashMap252["meta"] = ExpandInt.toData(13)
        array155[n278] = item252.withTag(ExpandAnyDict.asData(hashMap252))
        array155[1] = OreBracketHandler.getOre("stickWood")
        val n279 = 2
        val item253 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap253 = HashMap<String, IData>()
        hashMap253["meta"] = ExpandInt.toData(13)
        array155[n279] = item253.withTag(ExpandAnyDict.asData(hashMap253))
        array154[n277] = array155
        val n280 = 2
        val array156 = arrayOfNulls<IIngredient>(3)
        val n281 = 0
        val item254 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap254 = HashMap<String, IData>()
        hashMap254["meta"] = ExpandInt.toData(13)
        array156[n281] = item254.withTag(ExpandAnyDict.asData(hashMap254))
        array156[1] = OreBracketHandler.getOre("stickWood")
        val n282 = 2
        val item255 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap255 = HashMap<String, IData>()
        hashMap255["meta"] = ExpandInt.toData(13)
        array156[n282] = item255.withTag(ExpandAnyDict.asData(hashMap255))
        array154[n280] = array156
        recipes72.addShaped(amount28, array154, null)
        val recipes73 = MineTweakerAPI.recipes
        val item256 = ItemBracketHandler.getItem("ExtraTrees:gate", 46)
        val hashMap256 = HashMap<String, IData>()
        hashMap256["meta"] = ExpandInt.toData(46)
        val withTag30 = item256.withTag(ExpandAnyDict.asData(hashMap256))
        val array157 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n283 = 1
        val array158 = arrayOfNulls<IIngredient>(3)
        val n284 = 0
        val item257 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap257 = HashMap<String, IData>()
        hashMap257["meta"] = ExpandInt.toData(14)
        array158[n284] = item257.withTag(ExpandAnyDict.asData(hashMap257))
        array158[1] = OreBracketHandler.getOre("stickWood")
        val n285 = 2
        val item258 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap258 = HashMap<String, IData>()
        hashMap258["meta"] = ExpandInt.toData(14)
        array158[n285] = item258.withTag(ExpandAnyDict.asData(hashMap258))
        array157[n283] = array158
        val n286 = 2
        val array159 = arrayOfNulls<IIngredient>(3)
        val n287 = 0
        val item259 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap259 = HashMap<String, IData>()
        hashMap259["meta"] = ExpandInt.toData(14)
        array159[n287] = item259.withTag(ExpandAnyDict.asData(hashMap259))
        array159[1] = OreBracketHandler.getOre("stickWood")
        val n288 = 2
        val item260 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap260 = HashMap<String, IData>()
        hashMap260["meta"] = ExpandInt.toData(14)
        array159[n288] = item260.withTag(ExpandAnyDict.asData(hashMap260))
        array157[n286] = array159
        recipes73.addShaped(withTag30, array157, null)
        val recipes74 = MineTweakerAPI.recipes
        val item261 = ItemBracketHandler.getItem("ExtraTrees:gate", 46)
        val hashMap261 = HashMap<String, IData>()
        hashMap261["meta"] = ExpandInt.toData(46)
        val amount29 = item261.withTag(ExpandAnyDict.asData(hashMap261)).amount(2)
        val array160 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n289 = 1
        val array161 = arrayOfNulls<IIngredient>(3)
        val n290 = 0
        val item262 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap262 = HashMap<String, IData>()
        hashMap262["meta"] = ExpandInt.toData(14)
        array161[n290] = item262.withTag(ExpandAnyDict.asData(hashMap262))
        array161[1] = OreBracketHandler.getOre("stickWood")
        val n291 = 2
        val item263 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap263 = HashMap<String, IData>()
        hashMap263["meta"] = ExpandInt.toData(14)
        array161[n291] = item263.withTag(ExpandAnyDict.asData(hashMap263))
        array160[n289] = array161
        val n292 = 2
        val array162 = arrayOfNulls<IIngredient>(3)
        val n293 = 0
        val item264 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap264 = HashMap<String, IData>()
        hashMap264["meta"] = ExpandInt.toData(14)
        array162[n293] = item264.withTag(ExpandAnyDict.asData(hashMap264))
        array162[1] = OreBracketHandler.getOre("stickWood")
        val n294 = 2
        val item265 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap265 = HashMap<String, IData>()
        hashMap265["meta"] = ExpandInt.toData(14)
        array162[n294] = item265.withTag(ExpandAnyDict.asData(hashMap265))
        array160[n292] = array162
        recipes74.addShaped(amount29, array160, null)
        val recipes75 = MineTweakerAPI.recipes
        val item266 = ItemBracketHandler.getItem("ExtraTrees:gate", 46)
        val hashMap266 = HashMap<String, IData>()
        hashMap266["meta"] = ExpandInt.toData(46)
        val amount30 = item266.withTag(ExpandAnyDict.asData(hashMap266)).amount(4)
        val array163 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n295 = 1
        val array164 = arrayOfNulls<IIngredient>(3)
        val n296 = 0
        val item267 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap267 = HashMap<String, IData>()
        hashMap267["meta"] = ExpandInt.toData(14)
        array164[n296] = item267.withTag(ExpandAnyDict.asData(hashMap267))
        array164[1] = OreBracketHandler.getOre("stickWood")
        val n297 = 2
        val item268 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap268 = HashMap<String, IData>()
        hashMap268["meta"] = ExpandInt.toData(14)
        array164[n297] = item268.withTag(ExpandAnyDict.asData(hashMap268))
        array163[n295] = array164
        val n298 = 2
        val array165 = arrayOfNulls<IIngredient>(3)
        val n299 = 0
        val item269 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap269 = HashMap<String, IData>()
        hashMap269["meta"] = ExpandInt.toData(14)
        array165[n299] = item269.withTag(ExpandAnyDict.asData(hashMap269))
        array165[1] = OreBracketHandler.getOre("stickWood")
        val n300 = 2
        val item270 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap270 = HashMap<String, IData>()
        hashMap270["meta"] = ExpandInt.toData(14)
        array165[n300] = item270.withTag(ExpandAnyDict.asData(hashMap270))
        array163[n298] = array165
        recipes75.addShaped(amount30, array163, null)
        val recipes76 = MineTweakerAPI.recipes
        val item271 = ItemBracketHandler.getItem("ExtraTrees:gate", 47)
        val hashMap271 = HashMap<String, IData>()
        hashMap271["meta"] = ExpandInt.toData(47)
        val withTag31 = item271.withTag(ExpandAnyDict.asData(hashMap271))
        val array166 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n301 = 1
        val array167 = arrayOfNulls<IIngredient>(3)
        val n302 = 0
        val item272 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap272 = HashMap<String, IData>()
        hashMap272["meta"] = ExpandInt.toData(15)
        array167[n302] = item272.withTag(ExpandAnyDict.asData(hashMap272))
        array167[1] = OreBracketHandler.getOre("stickWood")
        val n303 = 2
        val item273 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap273 = HashMap<String, IData>()
        hashMap273["meta"] = ExpandInt.toData(15)
        array167[n303] = item273.withTag(ExpandAnyDict.asData(hashMap273))
        array166[n301] = array167
        val n304 = 2
        val array168 = arrayOfNulls<IIngredient>(3)
        val n305 = 0
        val item274 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap274 = HashMap<String, IData>()
        hashMap274["meta"] = ExpandInt.toData(15)
        array168[n305] = item274.withTag(ExpandAnyDict.asData(hashMap274))
        array168[1] = OreBracketHandler.getOre("stickWood")
        val n306 = 2
        val item275 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap275 = HashMap<String, IData>()
        hashMap275["meta"] = ExpandInt.toData(15)
        array168[n306] = item275.withTag(ExpandAnyDict.asData(hashMap275))
        array166[n304] = array168
        recipes76.addShaped(withTag31, array166, null)
        val recipes77 = MineTweakerAPI.recipes
        val item276 = ItemBracketHandler.getItem("ExtraTrees:gate", 47)
        val hashMap276 = HashMap<String, IData>()
        hashMap276["meta"] = ExpandInt.toData(47)
        val amount31 = item276.withTag(ExpandAnyDict.asData(hashMap276)).amount(2)
        val array169 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n307 = 1
        val array170 = arrayOfNulls<IIngredient>(3)
        val n308 = 0
        val item277 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap277 = HashMap<String, IData>()
        hashMap277["meta"] = ExpandInt.toData(15)
        array170[n308] = item277.withTag(ExpandAnyDict.asData(hashMap277))
        array170[1] = OreBracketHandler.getOre("stickWood")
        val n309 = 2
        val item278 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap278 = HashMap<String, IData>()
        hashMap278["meta"] = ExpandInt.toData(15)
        array170[n309] = item278.withTag(ExpandAnyDict.asData(hashMap278))
        array169[n307] = array170
        val n310 = 2
        val array171 = arrayOfNulls<IIngredient>(3)
        val n311 = 0
        val item279 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap279 = HashMap<String, IData>()
        hashMap279["meta"] = ExpandInt.toData(15)
        array171[n311] = item279.withTag(ExpandAnyDict.asData(hashMap279))
        array171[1] = OreBracketHandler.getOre("stickWood")
        val n312 = 2
        val item280 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap280 = HashMap<String, IData>()
        hashMap280["meta"] = ExpandInt.toData(15)
        array171[n312] = item280.withTag(ExpandAnyDict.asData(hashMap280))
        array169[n310] = array171
        recipes77.addShaped(amount31, array169, null)
        val recipes78 = MineTweakerAPI.recipes
        val item281 = ItemBracketHandler.getItem("ExtraTrees:gate", 47)
        val hashMap281 = HashMap<String, IData>()
        hashMap281["meta"] = ExpandInt.toData(47)
        val amount32 = item281.withTag(ExpandAnyDict.asData(hashMap281)).amount(4)
        val array172 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n313 = 1
        val array173 = arrayOfNulls<IIngredient>(3)
        val n314 = 0
        val item282 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap282 = HashMap<String, IData>()
        hashMap282["meta"] = ExpandInt.toData(15)
        array173[n314] = item282.withTag(ExpandAnyDict.asData(hashMap282))
        array173[1] = OreBracketHandler.getOre("stickWood")
        val n315 = 2
        val item283 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap283 = HashMap<String, IData>()
        hashMap283["meta"] = ExpandInt.toData(15)
        array173[n315] = item283.withTag(ExpandAnyDict.asData(hashMap283))
        array172[n313] = array173
        val n316 = 2
        val array174 = arrayOfNulls<IIngredient>(3)
        val n317 = 0
        val item284 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap284 = HashMap<String, IData>()
        hashMap284["meta"] = ExpandInt.toData(15)
        array174[n317] = item284.withTag(ExpandAnyDict.asData(hashMap284))
        array174[1] = OreBracketHandler.getOre("stickWood")
        val n318 = 2
        val item285 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap285 = HashMap<String, IData>()
        hashMap285["meta"] = ExpandInt.toData(15)
        array174[n318] = item285.withTag(ExpandAnyDict.asData(hashMap285))
        array172[n316] = array174
        recipes78.addShaped(amount32, array172, null)
        val recipes79 = MineTweakerAPI.recipes
        val item286 = ItemBracketHandler.getItem("ExtraTrees:gate", 48)
        val hashMap286 = HashMap<String, IData>()
        hashMap286["meta"] = ExpandInt.toData(48)
        val withTag32 = item286.withTag(ExpandAnyDict.asData(hashMap286))
        val array175 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n319 = 1
        val array176 = arrayOfNulls<IIngredient>(3)
        val n320 = 0
        val item287 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap287 = HashMap<String, IData>()
        hashMap287["meta"] = ExpandInt.toData(16)
        array176[n320] = item287.withTag(ExpandAnyDict.asData(hashMap287))
        array176[1] = OreBracketHandler.getOre("stickWood")
        val n321 = 2
        val item288 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap288 = HashMap<String, IData>()
        hashMap288["meta"] = ExpandInt.toData(16)
        array176[n321] = item288.withTag(ExpandAnyDict.asData(hashMap288))
        array175[n319] = array176
        val n322 = 2
        val array177 = arrayOfNulls<IIngredient>(3)
        val n323 = 0
        val item289 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap289 = HashMap<String, IData>()
        hashMap289["meta"] = ExpandInt.toData(16)
        array177[n323] = item289.withTag(ExpandAnyDict.asData(hashMap289))
        array177[1] = OreBracketHandler.getOre("stickWood")
        val n324 = 2
        val item290 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap290 = HashMap<String, IData>()
        hashMap290["meta"] = ExpandInt.toData(16)
        array177[n324] = item290.withTag(ExpandAnyDict.asData(hashMap290))
        array175[n322] = array177
        recipes79.addShaped(withTag32, array175, null)
        val recipes80 = MineTweakerAPI.recipes
        val item291 = ItemBracketHandler.getItem("ExtraTrees:gate", 48)
        val hashMap291 = HashMap<String, IData>()
        hashMap291["meta"] = ExpandInt.toData(48)
        val amount33 = item291.withTag(ExpandAnyDict.asData(hashMap291)).amount(2)
        val array178 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n325 = 1
        val array179 = arrayOfNulls<IIngredient>(3)
        val n326 = 0
        val item292 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap292 = HashMap<String, IData>()
        hashMap292["meta"] = ExpandInt.toData(16)
        array179[n326] = item292.withTag(ExpandAnyDict.asData(hashMap292))
        array179[1] = OreBracketHandler.getOre("stickWood")
        val n327 = 2
        val item293 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap293 = HashMap<String, IData>()
        hashMap293["meta"] = ExpandInt.toData(16)
        array179[n327] = item293.withTag(ExpandAnyDict.asData(hashMap293))
        array178[n325] = array179
        val n328 = 2
        val array180 = arrayOfNulls<IIngredient>(3)
        val n329 = 0
        val item294 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap294 = HashMap<String, IData>()
        hashMap294["meta"] = ExpandInt.toData(16)
        array180[n329] = item294.withTag(ExpandAnyDict.asData(hashMap294))
        array180[1] = OreBracketHandler.getOre("stickWood")
        val n330 = 2
        val item295 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap295 = HashMap<String, IData>()
        hashMap295["meta"] = ExpandInt.toData(16)
        array180[n330] = item295.withTag(ExpandAnyDict.asData(hashMap295))
        array178[n328] = array180
        recipes80.addShaped(amount33, array178, null)
        val recipes81 = MineTweakerAPI.recipes
        val item296 = ItemBracketHandler.getItem("ExtraTrees:gate", 48)
        val hashMap296 = HashMap<String, IData>()
        hashMap296["meta"] = ExpandInt.toData(48)
        val amount34 = item296.withTag(ExpandAnyDict.asData(hashMap296)).amount(4)
        val array181 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n331 = 1
        val array182 = arrayOfNulls<IIngredient>(3)
        val n332 = 0
        val item297 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap297 = HashMap<String, IData>()
        hashMap297["meta"] = ExpandInt.toData(16)
        array182[n332] = item297.withTag(ExpandAnyDict.asData(hashMap297))
        array182[1] = OreBracketHandler.getOre("stickWood")
        val n333 = 2
        val item298 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap298 = HashMap<String, IData>()
        hashMap298["meta"] = ExpandInt.toData(16)
        array182[n333] = item298.withTag(ExpandAnyDict.asData(hashMap298))
        array181[n331] = array182
        val n334 = 2
        val array183 = arrayOfNulls<IIngredient>(3)
        val n335 = 0
        val item299 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap299 = HashMap<String, IData>()
        hashMap299["meta"] = ExpandInt.toData(16)
        array183[n335] = item299.withTag(ExpandAnyDict.asData(hashMap299))
        array183[1] = OreBracketHandler.getOre("stickWood")
        val n336 = 2
        val item300 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap300 = HashMap<String, IData>()
        hashMap300["meta"] = ExpandInt.toData(16)
        array183[n336] = item300.withTag(ExpandAnyDict.asData(hashMap300))
        array181[n334] = array183
        recipes81.addShaped(amount34, array181, null)
        val recipes82 = MineTweakerAPI.recipes
        val item301 = ItemBracketHandler.getItem("ExtraTrees:gate", 49)
        val hashMap301 = HashMap<String, IData>()
        hashMap301["meta"] = ExpandInt.toData(49)
        val withTag33 = item301.withTag(ExpandAnyDict.asData(hashMap301))
        val array184 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n337 = 1
        val array185 = arrayOfNulls<IIngredient>(3)
        val n338 = 0
        val item302 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap302 = HashMap<String, IData>()
        hashMap302["meta"] = ExpandInt.toData(17)
        array185[n338] = item302.withTag(ExpandAnyDict.asData(hashMap302))
        array185[1] = OreBracketHandler.getOre("stickWood")
        val n339 = 2
        val item303 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap303 = HashMap<String, IData>()
        hashMap303["meta"] = ExpandInt.toData(17)
        array185[n339] = item303.withTag(ExpandAnyDict.asData(hashMap303))
        array184[n337] = array185
        val n340 = 2
        val array186 = arrayOfNulls<IIngredient>(3)
        val n341 = 0
        val item304 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap304 = HashMap<String, IData>()
        hashMap304["meta"] = ExpandInt.toData(17)
        array186[n341] = item304.withTag(ExpandAnyDict.asData(hashMap304))
        array186[1] = OreBracketHandler.getOre("stickWood")
        val n342 = 2
        val item305 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap305 = HashMap<String, IData>()
        hashMap305["meta"] = ExpandInt.toData(17)
        array186[n342] = item305.withTag(ExpandAnyDict.asData(hashMap305))
        array184[n340] = array186
        recipes82.addShaped(withTag33, array184, null)
        val recipes83 = MineTweakerAPI.recipes
        val item306 = ItemBracketHandler.getItem("ExtraTrees:gate", 49)
        val hashMap306 = HashMap<String, IData>()
        hashMap306["meta"] = ExpandInt.toData(49)
        val amount35 = item306.withTag(ExpandAnyDict.asData(hashMap306)).amount(2)
        val array187 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n343 = 1
        val array188 = arrayOfNulls<IIngredient>(3)
        val n344 = 0
        val item307 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap307 = HashMap<String, IData>()
        hashMap307["meta"] = ExpandInt.toData(17)
        array188[n344] = item307.withTag(ExpandAnyDict.asData(hashMap307))
        array188[1] = OreBracketHandler.getOre("stickWood")
        val n345 = 2
        val item308 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap308 = HashMap<String, IData>()
        hashMap308["meta"] = ExpandInt.toData(17)
        array188[n345] = item308.withTag(ExpandAnyDict.asData(hashMap308))
        array187[n343] = array188
        val n346 = 2
        val array189 = arrayOfNulls<IIngredient>(3)
        val n347 = 0
        val item309 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap309 = HashMap<String, IData>()
        hashMap309["meta"] = ExpandInt.toData(17)
        array189[n347] = item309.withTag(ExpandAnyDict.asData(hashMap309))
        array189[1] = OreBracketHandler.getOre("stickWood")
        val n348 = 2
        val item310 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap310 = HashMap<String, IData>()
        hashMap310["meta"] = ExpandInt.toData(17)
        array189[n348] = item310.withTag(ExpandAnyDict.asData(hashMap310))
        array187[n346] = array189
        recipes83.addShaped(amount35, array187, null)
        val recipes84 = MineTweakerAPI.recipes
        val item311 = ItemBracketHandler.getItem("ExtraTrees:gate", 49)
        val hashMap311 = HashMap<String, IData>()
        hashMap311["meta"] = ExpandInt.toData(49)
        val amount36 = item311.withTag(ExpandAnyDict.asData(hashMap311)).amount(4)
        val array190 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n349 = 1
        val array191 = arrayOfNulls<IIngredient>(3)
        val n350 = 0
        val item312 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap312 = HashMap<String, IData>()
        hashMap312["meta"] = ExpandInt.toData(17)
        array191[n350] = item312.withTag(ExpandAnyDict.asData(hashMap312))
        array191[1] = OreBracketHandler.getOre("stickWood")
        val n351 = 2
        val item313 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap313 = HashMap<String, IData>()
        hashMap313["meta"] = ExpandInt.toData(17)
        array191[n351] = item313.withTag(ExpandAnyDict.asData(hashMap313))
        array190[n349] = array191
        val n352 = 2
        val array192 = arrayOfNulls<IIngredient>(3)
        val n353 = 0
        val item314 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap314 = HashMap<String, IData>()
        hashMap314["meta"] = ExpandInt.toData(17)
        array192[n353] = item314.withTag(ExpandAnyDict.asData(hashMap314))
        array192[1] = OreBracketHandler.getOre("stickWood")
        val n354 = 2
        val item315 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap315 = HashMap<String, IData>()
        hashMap315["meta"] = ExpandInt.toData(17)
        array192[n354] = item315.withTag(ExpandAnyDict.asData(hashMap315))
        array190[n352] = array192
        recipes84.addShaped(amount36, array190, null)
        val recipes85 = MineTweakerAPI.recipes
        val item316 = ItemBracketHandler.getItem("ExtraTrees:gate", 50)
        val hashMap316 = HashMap<String, IData>()
        hashMap316["meta"] = ExpandInt.toData(50)
        val withTag34 = item316.withTag(ExpandAnyDict.asData(hashMap316))
        val array193 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n355 = 1
        val array194 = arrayOfNulls<IIngredient>(3)
        val n356 = 0
        val item317 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap317 = HashMap<String, IData>()
        hashMap317["meta"] = ExpandInt.toData(18)
        array194[n356] = item317.withTag(ExpandAnyDict.asData(hashMap317))
        array194[1] = OreBracketHandler.getOre("stickWood")
        val n357 = 2
        val item318 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap318 = HashMap<String, IData>()
        hashMap318["meta"] = ExpandInt.toData(18)
        array194[n357] = item318.withTag(ExpandAnyDict.asData(hashMap318))
        array193[n355] = array194
        val n358 = 2
        val array195 = arrayOfNulls<IIngredient>(3)
        val n359 = 0
        val item319 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap319 = HashMap<String, IData>()
        hashMap319["meta"] = ExpandInt.toData(18)
        array195[n359] = item319.withTag(ExpandAnyDict.asData(hashMap319))
        array195[1] = OreBracketHandler.getOre("stickWood")
        val n360 = 2
        val item320 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap320 = HashMap<String, IData>()
        hashMap320["meta"] = ExpandInt.toData(18)
        array195[n360] = item320.withTag(ExpandAnyDict.asData(hashMap320))
        array193[n358] = array195
        recipes85.addShaped(withTag34, array193, null)
        val recipes86 = MineTweakerAPI.recipes
        val item321 = ItemBracketHandler.getItem("ExtraTrees:gate", 50)
        val hashMap321 = HashMap<String, IData>()
        hashMap321["meta"] = ExpandInt.toData(50)
        val amount37 = item321.withTag(ExpandAnyDict.asData(hashMap321)).amount(2)
        val array196 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n361 = 1
        val array197 = arrayOfNulls<IIngredient>(3)
        val n362 = 0
        val item322 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap322 = HashMap<String, IData>()
        hashMap322["meta"] = ExpandInt.toData(18)
        array197[n362] = item322.withTag(ExpandAnyDict.asData(hashMap322))
        array197[1] = OreBracketHandler.getOre("stickWood")
        val n363 = 2
        val item323 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap323 = HashMap<String, IData>()
        hashMap323["meta"] = ExpandInt.toData(18)
        array197[n363] = item323.withTag(ExpandAnyDict.asData(hashMap323))
        array196[n361] = array197
        val n364 = 2
        val array198 = arrayOfNulls<IIngredient>(3)
        val n365 = 0
        val item324 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap324 = HashMap<String, IData>()
        hashMap324["meta"] = ExpandInt.toData(18)
        array198[n365] = item324.withTag(ExpandAnyDict.asData(hashMap324))
        array198[1] = OreBracketHandler.getOre("stickWood")
        val n366 = 2
        val item325 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap325 = HashMap<String, IData>()
        hashMap325["meta"] = ExpandInt.toData(18)
        array198[n366] = item325.withTag(ExpandAnyDict.asData(hashMap325))
        array196[n364] = array198
        recipes86.addShaped(amount37, array196, null)
        val recipes87 = MineTweakerAPI.recipes
        val item326 = ItemBracketHandler.getItem("ExtraTrees:gate", 50)
        val hashMap326 = HashMap<String, IData>()
        hashMap326["meta"] = ExpandInt.toData(50)
        val amount38 = item326.withTag(ExpandAnyDict.asData(hashMap326)).amount(4)
        val array199 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n367 = 1
        val array200 = arrayOfNulls<IIngredient>(3)
        val n368 = 0
        val item327 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap327 = HashMap<String, IData>()
        hashMap327["meta"] = ExpandInt.toData(18)
        array200[n368] = item327.withTag(ExpandAnyDict.asData(hashMap327))
        array200[1] = OreBracketHandler.getOre("stickWood")
        val n369 = 2
        val item328 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap328 = HashMap<String, IData>()
        hashMap328["meta"] = ExpandInt.toData(18)
        array200[n369] = item328.withTag(ExpandAnyDict.asData(hashMap328))
        array199[n367] = array200
        val n370 = 2
        val array201 = arrayOfNulls<IIngredient>(3)
        val n371 = 0
        val item329 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap329 = HashMap<String, IData>()
        hashMap329["meta"] = ExpandInt.toData(18)
        array201[n371] = item329.withTag(ExpandAnyDict.asData(hashMap329))
        array201[1] = OreBracketHandler.getOre("stickWood")
        val n372 = 2
        val item330 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap330 = HashMap<String, IData>()
        hashMap330["meta"] = ExpandInt.toData(18)
        array201[n372] = item330.withTag(ExpandAnyDict.asData(hashMap330))
        array199[n370] = array201
        recipes87.addShaped(amount38, array199, null)
        val recipes88 = MineTweakerAPI.recipes
        val item331 = ItemBracketHandler.getItem("ExtraTrees:gate", 51)
        val hashMap331 = HashMap<String, IData>()
        hashMap331["meta"] = ExpandInt.toData(51)
        val withTag35 = item331.withTag(ExpandAnyDict.asData(hashMap331))
        val array202 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n373 = 1
        val array203 = arrayOfNulls<IIngredient>(3)
        val n374 = 0
        val item332 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap332 = HashMap<String, IData>()
        hashMap332["meta"] = ExpandInt.toData(19)
        array203[n374] = item332.withTag(ExpandAnyDict.asData(hashMap332))
        array203[1] = OreBracketHandler.getOre("stickWood")
        val n375 = 2
        val item333 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap333 = HashMap<String, IData>()
        hashMap333["meta"] = ExpandInt.toData(19)
        array203[n375] = item333.withTag(ExpandAnyDict.asData(hashMap333))
        array202[n373] = array203
        val n376 = 2
        val array204 = arrayOfNulls<IIngredient>(3)
        val n377 = 0
        val item334 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap334 = HashMap<String, IData>()
        hashMap334["meta"] = ExpandInt.toData(19)
        array204[n377] = item334.withTag(ExpandAnyDict.asData(hashMap334))
        array204[1] = OreBracketHandler.getOre("stickWood")
        val n378 = 2
        val item335 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap335 = HashMap<String, IData>()
        hashMap335["meta"] = ExpandInt.toData(19)
        array204[n378] = item335.withTag(ExpandAnyDict.asData(hashMap335))
        array202[n376] = array204
        recipes88.addShaped(withTag35, array202, null)
        val recipes89 = MineTweakerAPI.recipes
        val item336 = ItemBracketHandler.getItem("ExtraTrees:gate", 51)
        val hashMap336 = HashMap<String, IData>()
        hashMap336["meta"] = ExpandInt.toData(51)
        val amount39 = item336.withTag(ExpandAnyDict.asData(hashMap336)).amount(2)
        val array205 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n379 = 1
        val array206 = arrayOfNulls<IIngredient>(3)
        val n380 = 0
        val item337 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap337 = HashMap<String, IData>()
        hashMap337["meta"] = ExpandInt.toData(19)
        array206[n380] = item337.withTag(ExpandAnyDict.asData(hashMap337))
        array206[1] = OreBracketHandler.getOre("stickWood")
        val n381 = 2
        val item338 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap338 = HashMap<String, IData>()
        hashMap338["meta"] = ExpandInt.toData(19)
        array206[n381] = item338.withTag(ExpandAnyDict.asData(hashMap338))
        array205[n379] = array206
        val n382 = 2
        val array207 = arrayOfNulls<IIngredient>(3)
        val n383 = 0
        val item339 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap339 = HashMap<String, IData>()
        hashMap339["meta"] = ExpandInt.toData(19)
        array207[n383] = item339.withTag(ExpandAnyDict.asData(hashMap339))
        array207[1] = OreBracketHandler.getOre("stickWood")
        val n384 = 2
        val item340 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap340 = HashMap<String, IData>()
        hashMap340["meta"] = ExpandInt.toData(19)
        array207[n384] = item340.withTag(ExpandAnyDict.asData(hashMap340))
        array205[n382] = array207
        recipes89.addShaped(amount39, array205, null)
        val recipes90 = MineTweakerAPI.recipes
        val item341 = ItemBracketHandler.getItem("ExtraTrees:gate", 51)
        val hashMap341 = HashMap<String, IData>()
        hashMap341["meta"] = ExpandInt.toData(51)
        val amount40 = item341.withTag(ExpandAnyDict.asData(hashMap341)).amount(4)
        val array208 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n385 = 1
        val array209 = arrayOfNulls<IIngredient>(3)
        val n386 = 0
        val item342 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap342 = HashMap<String, IData>()
        hashMap342["meta"] = ExpandInt.toData(19)
        array209[n386] = item342.withTag(ExpandAnyDict.asData(hashMap342))
        array209[1] = OreBracketHandler.getOre("stickWood")
        val n387 = 2
        val item343 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap343 = HashMap<String, IData>()
        hashMap343["meta"] = ExpandInt.toData(19)
        array209[n387] = item343.withTag(ExpandAnyDict.asData(hashMap343))
        array208[n385] = array209
        val n388 = 2
        val array210 = arrayOfNulls<IIngredient>(3)
        val n389 = 0
        val item344 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap344 = HashMap<String, IData>()
        hashMap344["meta"] = ExpandInt.toData(19)
        array210[n389] = item344.withTag(ExpandAnyDict.asData(hashMap344))
        array210[1] = OreBracketHandler.getOre("stickWood")
        val n390 = 2
        val item345 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap345 = HashMap<String, IData>()
        hashMap345["meta"] = ExpandInt.toData(19)
        array210[n390] = item345.withTag(ExpandAnyDict.asData(hashMap345))
        array208[n388] = array210
        recipes90.addShaped(amount40, array208, null)
        val recipes91 = MineTweakerAPI.recipes
        val item346 = ItemBracketHandler.getItem("ExtraTrees:gate", 52)
        val hashMap346 = HashMap<String, IData>()
        hashMap346["meta"] = ExpandInt.toData(52)
        val withTag36 = item346.withTag(ExpandAnyDict.asData(hashMap346))
        val array211 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n391 = 1
        val array212 = arrayOfNulls<IIngredient>(3)
        val n392 = 0
        val item347 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap347 = HashMap<String, IData>()
        hashMap347["meta"] = ExpandInt.toData(20)
        array212[n392] = item347.withTag(ExpandAnyDict.asData(hashMap347))
        array212[1] = OreBracketHandler.getOre("stickWood")
        val n393 = 2
        val item348 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap348 = HashMap<String, IData>()
        hashMap348["meta"] = ExpandInt.toData(20)
        array212[n393] = item348.withTag(ExpandAnyDict.asData(hashMap348))
        array211[n391] = array212
        val n394 = 2
        val array213 = arrayOfNulls<IIngredient>(3)
        val n395 = 0
        val item349 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap349 = HashMap<String, IData>()
        hashMap349["meta"] = ExpandInt.toData(20)
        array213[n395] = item349.withTag(ExpandAnyDict.asData(hashMap349))
        array213[1] = OreBracketHandler.getOre("stickWood")
        val n396 = 2
        val item350 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap350 = HashMap<String, IData>()
        hashMap350["meta"] = ExpandInt.toData(20)
        array213[n396] = item350.withTag(ExpandAnyDict.asData(hashMap350))
        array211[n394] = array213
        recipes91.addShaped(withTag36, array211, null)
        val recipes92 = MineTweakerAPI.recipes
        val item351 = ItemBracketHandler.getItem("ExtraTrees:gate", 52)
        val hashMap351 = HashMap<String, IData>()
        hashMap351["meta"] = ExpandInt.toData(52)
        val amount41 = item351.withTag(ExpandAnyDict.asData(hashMap351)).amount(2)
        val array214 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n397 = 1
        val array215 = arrayOfNulls<IIngredient>(3)
        val n398 = 0
        val item352 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap352 = HashMap<String, IData>()
        hashMap352["meta"] = ExpandInt.toData(20)
        array215[n398] = item352.withTag(ExpandAnyDict.asData(hashMap352))
        array215[1] = OreBracketHandler.getOre("stickWood")
        val n399 = 2
        val item353 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap353 = HashMap<String, IData>()
        hashMap353["meta"] = ExpandInt.toData(20)
        array215[n399] = item353.withTag(ExpandAnyDict.asData(hashMap353))
        array214[n397] = array215
        val n400 = 2
        val array216 = arrayOfNulls<IIngredient>(3)
        val n401 = 0
        val item354 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap354 = HashMap<String, IData>()
        hashMap354["meta"] = ExpandInt.toData(20)
        array216[n401] = item354.withTag(ExpandAnyDict.asData(hashMap354))
        array216[1] = OreBracketHandler.getOre("stickWood")
        val n402 = 2
        val item355 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap355 = HashMap<String, IData>()
        hashMap355["meta"] = ExpandInt.toData(20)
        array216[n402] = item355.withTag(ExpandAnyDict.asData(hashMap355))
        array214[n400] = array216
        recipes92.addShaped(amount41, array214, null)
        val recipes93 = MineTweakerAPI.recipes
        val item356 = ItemBracketHandler.getItem("ExtraTrees:gate", 52)
        val hashMap356 = HashMap<String, IData>()
        hashMap356["meta"] = ExpandInt.toData(52)
        val amount42 = item356.withTag(ExpandAnyDict.asData(hashMap356)).amount(4)
        val array217 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n403 = 1
        val array218 = arrayOfNulls<IIngredient>(3)
        val n404 = 0
        val item357 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap357 = HashMap<String, IData>()
        hashMap357["meta"] = ExpandInt.toData(20)
        array218[n404] = item357.withTag(ExpandAnyDict.asData(hashMap357))
        array218[1] = OreBracketHandler.getOre("stickWood")
        val n405 = 2
        val item358 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap358 = HashMap<String, IData>()
        hashMap358["meta"] = ExpandInt.toData(20)
        array218[n405] = item358.withTag(ExpandAnyDict.asData(hashMap358))
        array217[n403] = array218
        val n406 = 2
        val array219 = arrayOfNulls<IIngredient>(3)
        val n407 = 0
        val item359 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap359 = HashMap<String, IData>()
        hashMap359["meta"] = ExpandInt.toData(20)
        array219[n407] = item359.withTag(ExpandAnyDict.asData(hashMap359))
        array219[1] = OreBracketHandler.getOre("stickWood")
        val n408 = 2
        val item360 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap360 = HashMap<String, IData>()
        hashMap360["meta"] = ExpandInt.toData(20)
        array219[n408] = item360.withTag(ExpandAnyDict.asData(hashMap360))
        array217[n406] = array219
        recipes93.addShaped(amount42, array217, null)
        val recipes94 = MineTweakerAPI.recipes
        val item361 = ItemBracketHandler.getItem("ExtraTrees:gate", 53)
        val hashMap361 = HashMap<String, IData>()
        hashMap361["meta"] = ExpandInt.toData(53)
        val withTag37 = item361.withTag(ExpandAnyDict.asData(hashMap361))
        val array220 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n409 = 1
        val array221 = arrayOfNulls<IIngredient>(3)
        val n410 = 0
        val item362 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap362 = HashMap<String, IData>()
        hashMap362["meta"] = ExpandInt.toData(21)
        array221[n410] = item362.withTag(ExpandAnyDict.asData(hashMap362))
        array221[1] = OreBracketHandler.getOre("stickWood")
        val n411 = 2
        val item363 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap363 = HashMap<String, IData>()
        hashMap363["meta"] = ExpandInt.toData(21)
        array221[n411] = item363.withTag(ExpandAnyDict.asData(hashMap363))
        array220[n409] = array221
        val n412 = 2
        val array222 = arrayOfNulls<IIngredient>(3)
        val n413 = 0
        val item364 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap364 = HashMap<String, IData>()
        hashMap364["meta"] = ExpandInt.toData(21)
        array222[n413] = item364.withTag(ExpandAnyDict.asData(hashMap364))
        array222[1] = OreBracketHandler.getOre("stickWood")
        val n414 = 2
        val item365 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap365 = HashMap<String, IData>()
        hashMap365["meta"] = ExpandInt.toData(21)
        array222[n414] = item365.withTag(ExpandAnyDict.asData(hashMap365))
        array220[n412] = array222
        recipes94.addShaped(withTag37, array220, null)
        val recipes95 = MineTweakerAPI.recipes
        val item366 = ItemBracketHandler.getItem("ExtraTrees:gate", 53)
        val hashMap366 = HashMap<String, IData>()
        hashMap366["meta"] = ExpandInt.toData(53)
        val amount43 = item366.withTag(ExpandAnyDict.asData(hashMap366)).amount(2)
        val array223 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n415 = 1
        val array224 = arrayOfNulls<IIngredient>(3)
        val n416 = 0
        val item367 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap367 = HashMap<String, IData>()
        hashMap367["meta"] = ExpandInt.toData(21)
        array224[n416] = item367.withTag(ExpandAnyDict.asData(hashMap367))
        array224[1] = OreBracketHandler.getOre("stickWood")
        val n417 = 2
        val item368 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap368 = HashMap<String, IData>()
        hashMap368["meta"] = ExpandInt.toData(21)
        array224[n417] = item368.withTag(ExpandAnyDict.asData(hashMap368))
        array223[n415] = array224
        val n418 = 2
        val array225 = arrayOfNulls<IIngredient>(3)
        val n419 = 0
        val item369 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap369 = HashMap<String, IData>()
        hashMap369["meta"] = ExpandInt.toData(21)
        array225[n419] = item369.withTag(ExpandAnyDict.asData(hashMap369))
        array225[1] = OreBracketHandler.getOre("stickWood")
        val n420 = 2
        val item370 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap370 = HashMap<String, IData>()
        hashMap370["meta"] = ExpandInt.toData(21)
        array225[n420] = item370.withTag(ExpandAnyDict.asData(hashMap370))
        array223[n418] = array225
        recipes95.addShaped(amount43, array223, null)
        val recipes96 = MineTweakerAPI.recipes
        val item371 = ItemBracketHandler.getItem("ExtraTrees:gate", 53)
        val hashMap371 = HashMap<String, IData>()
        hashMap371["meta"] = ExpandInt.toData(53)
        val amount44 = item371.withTag(ExpandAnyDict.asData(hashMap371)).amount(4)
        val array226 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n421 = 1
        val array227 = arrayOfNulls<IIngredient>(3)
        val n422 = 0
        val item372 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap372 = HashMap<String, IData>()
        hashMap372["meta"] = ExpandInt.toData(21)
        array227[n422] = item372.withTag(ExpandAnyDict.asData(hashMap372))
        array227[1] = OreBracketHandler.getOre("stickWood")
        val n423 = 2
        val item373 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap373 = HashMap<String, IData>()
        hashMap373["meta"] = ExpandInt.toData(21)
        array227[n423] = item373.withTag(ExpandAnyDict.asData(hashMap373))
        array226[n421] = array227
        val n424 = 2
        val array228 = arrayOfNulls<IIngredient>(3)
        val n425 = 0
        val item374 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap374 = HashMap<String, IData>()
        hashMap374["meta"] = ExpandInt.toData(21)
        array228[n425] = item374.withTag(ExpandAnyDict.asData(hashMap374))
        array228[1] = OreBracketHandler.getOre("stickWood")
        val n426 = 2
        val item375 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap375 = HashMap<String, IData>()
        hashMap375["meta"] = ExpandInt.toData(21)
        array228[n426] = item375.withTag(ExpandAnyDict.asData(hashMap375))
        array226[n424] = array228
        recipes96.addShaped(amount44, array226, null)
        val recipes97 = MineTweakerAPI.recipes
        val item376 = ItemBracketHandler.getItem("ExtraTrees:gate", 54)
        val hashMap376 = HashMap<String, IData>()
        hashMap376["meta"] = ExpandInt.toData(54)
        val withTag38 = item376.withTag(ExpandAnyDict.asData(hashMap376))
        val array229 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n427 = 1
        val array230 = arrayOfNulls<IIngredient>(3)
        val n428 = 0
        val item377 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap377 = HashMap<String, IData>()
        hashMap377["meta"] = ExpandInt.toData(22)
        array230[n428] = item377.withTag(ExpandAnyDict.asData(hashMap377))
        array230[1] = OreBracketHandler.getOre("stickWood")
        val n429 = 2
        val item378 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap378 = HashMap<String, IData>()
        hashMap378["meta"] = ExpandInt.toData(22)
        array230[n429] = item378.withTag(ExpandAnyDict.asData(hashMap378))
        array229[n427] = array230
        val n430 = 2
        val array231 = arrayOfNulls<IIngredient>(3)
        val n431 = 0
        val item379 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap379 = HashMap<String, IData>()
        hashMap379["meta"] = ExpandInt.toData(22)
        array231[n431] = item379.withTag(ExpandAnyDict.asData(hashMap379))
        array231[1] = OreBracketHandler.getOre("stickWood")
        val n432 = 2
        val item380 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap380 = HashMap<String, IData>()
        hashMap380["meta"] = ExpandInt.toData(22)
        array231[n432] = item380.withTag(ExpandAnyDict.asData(hashMap380))
        array229[n430] = array231
        recipes97.addShaped(withTag38, array229, null)
        val recipes98 = MineTweakerAPI.recipes
        val item381 = ItemBracketHandler.getItem("ExtraTrees:gate", 54)
        val hashMap381 = HashMap<String, IData>()
        hashMap381["meta"] = ExpandInt.toData(54)
        val amount45 = item381.withTag(ExpandAnyDict.asData(hashMap381)).amount(2)
        val array232 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n433 = 1
        val array233 = arrayOfNulls<IIngredient>(3)
        val n434 = 0
        val item382 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap382 = HashMap<String, IData>()
        hashMap382["meta"] = ExpandInt.toData(22)
        array233[n434] = item382.withTag(ExpandAnyDict.asData(hashMap382))
        array233[1] = OreBracketHandler.getOre("stickWood")
        val n435 = 2
        val item383 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap383 = HashMap<String, IData>()
        hashMap383["meta"] = ExpandInt.toData(22)
        array233[n435] = item383.withTag(ExpandAnyDict.asData(hashMap383))
        array232[n433] = array233
        val n436 = 2
        val array234 = arrayOfNulls<IIngredient>(3)
        val n437 = 0
        val item384 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap384 = HashMap<String, IData>()
        hashMap384["meta"] = ExpandInt.toData(22)
        array234[n437] = item384.withTag(ExpandAnyDict.asData(hashMap384))
        array234[1] = OreBracketHandler.getOre("stickWood")
        val n438 = 2
        val item385 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap385 = HashMap<String, IData>()
        hashMap385["meta"] = ExpandInt.toData(22)
        array234[n438] = item385.withTag(ExpandAnyDict.asData(hashMap385))
        array232[n436] = array234
        recipes98.addShaped(amount45, array232, null)
        val recipes99 = MineTweakerAPI.recipes
        val item386 = ItemBracketHandler.getItem("ExtraTrees:gate", 54)
        val hashMap386 = HashMap<String, IData>()
        hashMap386["meta"] = ExpandInt.toData(54)
        val amount46 = item386.withTag(ExpandAnyDict.asData(hashMap386)).amount(4)
        val array235 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n439 = 1
        val array236 = arrayOfNulls<IIngredient>(3)
        val n440 = 0
        val item387 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap387 = HashMap<String, IData>()
        hashMap387["meta"] = ExpandInt.toData(22)
        array236[n440] = item387.withTag(ExpandAnyDict.asData(hashMap387))
        array236[1] = OreBracketHandler.getOre("stickWood")
        val n441 = 2
        val item388 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap388 = HashMap<String, IData>()
        hashMap388["meta"] = ExpandInt.toData(22)
        array236[n441] = item388.withTag(ExpandAnyDict.asData(hashMap388))
        array235[n439] = array236
        val n442 = 2
        val array237 = arrayOfNulls<IIngredient>(3)
        val n443 = 0
        val item389 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap389 = HashMap<String, IData>()
        hashMap389["meta"] = ExpandInt.toData(22)
        array237[n443] = item389.withTag(ExpandAnyDict.asData(hashMap389))
        array237[1] = OreBracketHandler.getOre("stickWood")
        val n444 = 2
        val item390 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap390 = HashMap<String, IData>()
        hashMap390["meta"] = ExpandInt.toData(22)
        array237[n444] = item390.withTag(ExpandAnyDict.asData(hashMap390))
        array235[n442] = array237
        recipes99.addShaped(amount46, array235, null)
        val recipes100 = MineTweakerAPI.recipes
        val item391 = ItemBracketHandler.getItem("ExtraTrees:gate", 55)
        val hashMap391 = HashMap<String, IData>()
        hashMap391["meta"] = ExpandInt.toData(55)
        val withTag39 = item391.withTag(ExpandAnyDict.asData(hashMap391))
        val array238 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n445 = 1
        val array239 = arrayOfNulls<IIngredient>(3)
        val n446 = 0
        val item392 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap392 = HashMap<String, IData>()
        hashMap392["meta"] = ExpandInt.toData(23)
        array239[n446] = item392.withTag(ExpandAnyDict.asData(hashMap392))
        array239[1] = OreBracketHandler.getOre("stickWood")
        val n447 = 2
        val item393 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap393 = HashMap<String, IData>()
        hashMap393["meta"] = ExpandInt.toData(23)
        array239[n447] = item393.withTag(ExpandAnyDict.asData(hashMap393))
        array238[n445] = array239
        val n448 = 2
        val array240 = arrayOfNulls<IIngredient>(3)
        val n449 = 0
        val item394 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap394 = HashMap<String, IData>()
        hashMap394["meta"] = ExpandInt.toData(23)
        array240[n449] = item394.withTag(ExpandAnyDict.asData(hashMap394))
        array240[1] = OreBracketHandler.getOre("stickWood")
        val n450 = 2
        val item395 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap395 = HashMap<String, IData>()
        hashMap395["meta"] = ExpandInt.toData(23)
        array240[n450] = item395.withTag(ExpandAnyDict.asData(hashMap395))
        array238[n448] = array240
        recipes100.addShaped(withTag39, array238, null)
        val recipes101 = MineTweakerAPI.recipes
        val item396 = ItemBracketHandler.getItem("ExtraTrees:gate", 55)
        val hashMap396 = HashMap<String, IData>()
        hashMap396["meta"] = ExpandInt.toData(55)
        val amount47 = item396.withTag(ExpandAnyDict.asData(hashMap396)).amount(2)
        val array241 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n451 = 1
        val array242 = arrayOfNulls<IIngredient>(3)
        val n452 = 0
        val item397 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap397 = HashMap<String, IData>()
        hashMap397["meta"] = ExpandInt.toData(23)
        array242[n452] = item397.withTag(ExpandAnyDict.asData(hashMap397))
        array242[1] = OreBracketHandler.getOre("stickWood")
        val n453 = 2
        val item398 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap398 = HashMap<String, IData>()
        hashMap398["meta"] = ExpandInt.toData(23)
        array242[n453] = item398.withTag(ExpandAnyDict.asData(hashMap398))
        array241[n451] = array242
        val n454 = 2
        val array243 = arrayOfNulls<IIngredient>(3)
        val n455 = 0
        val item399 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap399 = HashMap<String, IData>()
        hashMap399["meta"] = ExpandInt.toData(23)
        array243[n455] = item399.withTag(ExpandAnyDict.asData(hashMap399))
        array243[1] = OreBracketHandler.getOre("stickWood")
        val n456 = 2
        val item400 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap400 = HashMap<String, IData>()
        hashMap400["meta"] = ExpandInt.toData(23)
        array243[n456] = item400.withTag(ExpandAnyDict.asData(hashMap400))
        array241[n454] = array243
        recipes101.addShaped(amount47, array241, null)
        val recipes102 = MineTweakerAPI.recipes
        val item401 = ItemBracketHandler.getItem("ExtraTrees:gate", 55)
        val hashMap401 = HashMap<String, IData>()
        hashMap401["meta"] = ExpandInt.toData(55)
        val amount48 = item401.withTag(ExpandAnyDict.asData(hashMap401)).amount(4)
        val array244 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n457 = 1
        val array245 = arrayOfNulls<IIngredient>(3)
        val n458 = 0
        val item402 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap402 = HashMap<String, IData>()
        hashMap402["meta"] = ExpandInt.toData(23)
        array245[n458] = item402.withTag(ExpandAnyDict.asData(hashMap402))
        array245[1] = OreBracketHandler.getOre("stickWood")
        val n459 = 2
        val item403 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap403 = HashMap<String, IData>()
        hashMap403["meta"] = ExpandInt.toData(23)
        array245[n459] = item403.withTag(ExpandAnyDict.asData(hashMap403))
        array244[n457] = array245
        val n460 = 2
        val array246 = arrayOfNulls<IIngredient>(3)
        val n461 = 0
        val item404 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap404 = HashMap<String, IData>()
        hashMap404["meta"] = ExpandInt.toData(23)
        array246[n461] = item404.withTag(ExpandAnyDict.asData(hashMap404))
        array246[1] = OreBracketHandler.getOre("stickWood")
        val n462 = 2
        val item405 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap405 = HashMap<String, IData>()
        hashMap405["meta"] = ExpandInt.toData(23)
        array246[n462] = item405.withTag(ExpandAnyDict.asData(hashMap405))
        array244[n460] = array246
        recipes102.addShaped(amount48, array244, null)
        val recipes103 = MineTweakerAPI.recipes
        val item406 = ItemBracketHandler.getItem("ExtraTrees:gate", 56)
        val hashMap406 = HashMap<String, IData>()
        hashMap406["meta"] = ExpandInt.toData(56)
        val withTag40 = item406.withTag(ExpandAnyDict.asData(hashMap406))
        val array247 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n463 = 1
        val array248 = arrayOfNulls<IIngredient>(3)
        val n464 = 0
        val item407 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap407 = HashMap<String, IData>()
        hashMap407["meta"] = ExpandInt.toData(24)
        array248[n464] = item407.withTag(ExpandAnyDict.asData(hashMap407))
        array248[1] = OreBracketHandler.getOre("stickWood")
        val n465 = 2
        val item408 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap408 = HashMap<String, IData>()
        hashMap408["meta"] = ExpandInt.toData(24)
        array248[n465] = item408.withTag(ExpandAnyDict.asData(hashMap408))
        array247[n463] = array248
        val n466 = 2
        val array249 = arrayOfNulls<IIngredient>(3)
        val n467 = 0
        val item409 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap409 = HashMap<String, IData>()
        hashMap409["meta"] = ExpandInt.toData(24)
        array249[n467] = item409.withTag(ExpandAnyDict.asData(hashMap409))
        array249[1] = OreBracketHandler.getOre("stickWood")
        val n468 = 2
        val item410 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap410 = HashMap<String, IData>()
        hashMap410["meta"] = ExpandInt.toData(24)
        array249[n468] = item410.withTag(ExpandAnyDict.asData(hashMap410))
        array247[n466] = array249
        recipes103.addShaped(withTag40, array247, null)
        val recipes104 = MineTweakerAPI.recipes
        val item411 = ItemBracketHandler.getItem("ExtraTrees:gate", 56)
        val hashMap411 = HashMap<String, IData>()
        hashMap411["meta"] = ExpandInt.toData(56)
        val amount49 = item411.withTag(ExpandAnyDict.asData(hashMap411)).amount(2)
        val array250 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n469 = 1
        val array251 = arrayOfNulls<IIngredient>(3)
        val n470 = 0
        val item412 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap412 = HashMap<String, IData>()
        hashMap412["meta"] = ExpandInt.toData(24)
        array251[n470] = item412.withTag(ExpandAnyDict.asData(hashMap412))
        array251[1] = OreBracketHandler.getOre("stickWood")
        val n471 = 2
        val item413 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap413 = HashMap<String, IData>()
        hashMap413["meta"] = ExpandInt.toData(24)
        array251[n471] = item413.withTag(ExpandAnyDict.asData(hashMap413))
        array250[n469] = array251
        val n472 = 2
        val array252 = arrayOfNulls<IIngredient>(3)
        val n473 = 0
        val item414 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap414 = HashMap<String, IData>()
        hashMap414["meta"] = ExpandInt.toData(24)
        array252[n473] = item414.withTag(ExpandAnyDict.asData(hashMap414))
        array252[1] = OreBracketHandler.getOre("stickWood")
        val n474 = 2
        val item415 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap415 = HashMap<String, IData>()
        hashMap415["meta"] = ExpandInt.toData(24)
        array252[n474] = item415.withTag(ExpandAnyDict.asData(hashMap415))
        array250[n472] = array252
        recipes104.addShaped(amount49, array250, null)
        val recipes105 = MineTweakerAPI.recipes
        val item416 = ItemBracketHandler.getItem("ExtraTrees:gate", 56)
        val hashMap416 = HashMap<String, IData>()
        hashMap416["meta"] = ExpandInt.toData(56)
        val amount50 = item416.withTag(ExpandAnyDict.asData(hashMap416)).amount(4)
        val array253 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n475 = 1
        val array254 = arrayOfNulls<IIngredient>(3)
        val n476 = 0
        val item417 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap417 = HashMap<String, IData>()
        hashMap417["meta"] = ExpandInt.toData(24)
        array254[n476] = item417.withTag(ExpandAnyDict.asData(hashMap417))
        array254[1] = OreBracketHandler.getOre("stickWood")
        val n477 = 2
        val item418 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap418 = HashMap<String, IData>()
        hashMap418["meta"] = ExpandInt.toData(24)
        array254[n477] = item418.withTag(ExpandAnyDict.asData(hashMap418))
        array253[n475] = array254
        val n478 = 2
        val array255 = arrayOfNulls<IIngredient>(3)
        val n479 = 0
        val item419 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap419 = HashMap<String, IData>()
        hashMap419["meta"] = ExpandInt.toData(24)
        array255[n479] = item419.withTag(ExpandAnyDict.asData(hashMap419))
        array255[1] = OreBracketHandler.getOre("stickWood")
        val n480 = 2
        val item420 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap420 = HashMap<String, IData>()
        hashMap420["meta"] = ExpandInt.toData(24)
        array255[n480] = item420.withTag(ExpandAnyDict.asData(hashMap420))
        array253[n478] = array255
        recipes105.addShaped(amount50, array253, null)
        val recipes106 = MineTweakerAPI.recipes
        val item421 = ItemBracketHandler.getItem("ExtraTrees:gate", 57)
        val hashMap421 = HashMap<String, IData>()
        hashMap421["meta"] = ExpandInt.toData(57)
        val withTag41 = item421.withTag(ExpandAnyDict.asData(hashMap421))
        val array256 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n481 = 1
        val array257 = arrayOfNulls<IIngredient>(3)
        val n482 = 0
        val item422 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap422 = HashMap<String, IData>()
        hashMap422["meta"] = ExpandInt.toData(25)
        array257[n482] = item422.withTag(ExpandAnyDict.asData(hashMap422))
        array257[1] = OreBracketHandler.getOre("stickWood")
        val n483 = 2
        val item423 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap423 = HashMap<String, IData>()
        hashMap423["meta"] = ExpandInt.toData(25)
        array257[n483] = item423.withTag(ExpandAnyDict.asData(hashMap423))
        array256[n481] = array257
        val n484 = 2
        val array258 = arrayOfNulls<IIngredient>(3)
        val n485 = 0
        val item424 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap424 = HashMap<String, IData>()
        hashMap424["meta"] = ExpandInt.toData(25)
        array258[n485] = item424.withTag(ExpandAnyDict.asData(hashMap424))
        array258[1] = OreBracketHandler.getOre("stickWood")
        val n486 = 2
        val item425 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap425 = HashMap<String, IData>()
        hashMap425["meta"] = ExpandInt.toData(25)
        array258[n486] = item425.withTag(ExpandAnyDict.asData(hashMap425))
        array256[n484] = array258
        recipes106.addShaped(withTag41, array256, null)
        val recipes107 = MineTweakerAPI.recipes
        val item426 = ItemBracketHandler.getItem("ExtraTrees:gate", 57)
        val hashMap426 = HashMap<String, IData>()
        hashMap426["meta"] = ExpandInt.toData(57)
        val amount51 = item426.withTag(ExpandAnyDict.asData(hashMap426)).amount(2)
        val array259 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n487 = 1
        val array260 = arrayOfNulls<IIngredient>(3)
        val n488 = 0
        val item427 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap427 = HashMap<String, IData>()
        hashMap427["meta"] = ExpandInt.toData(25)
        array260[n488] = item427.withTag(ExpandAnyDict.asData(hashMap427))
        array260[1] = OreBracketHandler.getOre("stickWood")
        val n489 = 2
        val item428 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap428 = HashMap<String, IData>()
        hashMap428["meta"] = ExpandInt.toData(25)
        array260[n489] = item428.withTag(ExpandAnyDict.asData(hashMap428))
        array259[n487] = array260
        val n490 = 2
        val array261 = arrayOfNulls<IIngredient>(3)
        val n491 = 0
        val item429 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap429 = HashMap<String, IData>()
        hashMap429["meta"] = ExpandInt.toData(25)
        array261[n491] = item429.withTag(ExpandAnyDict.asData(hashMap429))
        array261[1] = OreBracketHandler.getOre("stickWood")
        val n492 = 2
        val item430 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap430 = HashMap<String, IData>()
        hashMap430["meta"] = ExpandInt.toData(25)
        array261[n492] = item430.withTag(ExpandAnyDict.asData(hashMap430))
        array259[n490] = array261
        recipes107.addShaped(amount51, array259, null)
        val recipes108 = MineTweakerAPI.recipes
        val item431 = ItemBracketHandler.getItem("ExtraTrees:gate", 57)
        val hashMap431 = HashMap<String, IData>()
        hashMap431["meta"] = ExpandInt.toData(57)
        val amount52 = item431.withTag(ExpandAnyDict.asData(hashMap431)).amount(4)
        val array262 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n493 = 1
        val array263 = arrayOfNulls<IIngredient>(3)
        val n494 = 0
        val item432 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap432 = HashMap<String, IData>()
        hashMap432["meta"] = ExpandInt.toData(25)
        array263[n494] = item432.withTag(ExpandAnyDict.asData(hashMap432))
        array263[1] = OreBracketHandler.getOre("stickWood")
        val n495 = 2
        val item433 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap433 = HashMap<String, IData>()
        hashMap433["meta"] = ExpandInt.toData(25)
        array263[n495] = item433.withTag(ExpandAnyDict.asData(hashMap433))
        array262[n493] = array263
        val n496 = 2
        val array264 = arrayOfNulls<IIngredient>(3)
        val n497 = 0
        val item434 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap434 = HashMap<String, IData>()
        hashMap434["meta"] = ExpandInt.toData(25)
        array264[n497] = item434.withTag(ExpandAnyDict.asData(hashMap434))
        array264[1] = OreBracketHandler.getOre("stickWood")
        val n498 = 2
        val item435 = ItemBracketHandler.getItem("ExtraTrees:planks", 25)
        val hashMap435 = HashMap<String, IData>()
        hashMap435["meta"] = ExpandInt.toData(25)
        array264[n498] = item435.withTag(ExpandAnyDict.asData(hashMap435))
        array262[n496] = array264
        recipes108.addShaped(amount52, array262, null)
        val recipes109 = MineTweakerAPI.recipes
        val item436 = ItemBracketHandler.getItem("ExtraTrees:gate", 58)
        val hashMap436 = HashMap<String, IData>()
        hashMap436["meta"] = ExpandInt.toData(58)
        val withTag42 = item436.withTag(ExpandAnyDict.asData(hashMap436))
        val array265 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n499 = 1
        val array266 = arrayOfNulls<IIngredient>(3)
        val n500 = 0
        val item437 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap437 = HashMap<String, IData>()
        hashMap437["meta"] = ExpandInt.toData(26)
        array266[n500] = item437.withTag(ExpandAnyDict.asData(hashMap437))
        array266[1] = OreBracketHandler.getOre("stickWood")
        val n501 = 2
        val item438 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap438 = HashMap<String, IData>()
        hashMap438["meta"] = ExpandInt.toData(26)
        array266[n501] = item438.withTag(ExpandAnyDict.asData(hashMap438))
        array265[n499] = array266
        val n502 = 2
        val array267 = arrayOfNulls<IIngredient>(3)
        val n503 = 0
        val item439 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap439 = HashMap<String, IData>()
        hashMap439["meta"] = ExpandInt.toData(26)
        array267[n503] = item439.withTag(ExpandAnyDict.asData(hashMap439))
        array267[1] = OreBracketHandler.getOre("stickWood")
        val n504 = 2
        val item440 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap440 = HashMap<String, IData>()
        hashMap440["meta"] = ExpandInt.toData(26)
        array267[n504] = item440.withTag(ExpandAnyDict.asData(hashMap440))
        array265[n502] = array267
        recipes109.addShaped(withTag42, array265, null)
        val recipes110 = MineTweakerAPI.recipes
        val item441 = ItemBracketHandler.getItem("ExtraTrees:gate", 58)
        val hashMap441 = HashMap<String, IData>()
        hashMap441["meta"] = ExpandInt.toData(58)
        val amount53 = item441.withTag(ExpandAnyDict.asData(hashMap441)).amount(2)
        val array268 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n505 = 1
        val array269 = arrayOfNulls<IIngredient>(3)
        val n506 = 0
        val item442 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap442 = HashMap<String, IData>()
        hashMap442["meta"] = ExpandInt.toData(26)
        array269[n506] = item442.withTag(ExpandAnyDict.asData(hashMap442))
        array269[1] = OreBracketHandler.getOre("stickWood")
        val n507 = 2
        val item443 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap443 = HashMap<String, IData>()
        hashMap443["meta"] = ExpandInt.toData(26)
        array269[n507] = item443.withTag(ExpandAnyDict.asData(hashMap443))
        array268[n505] = array269
        val n508 = 2
        val array270 = arrayOfNulls<IIngredient>(3)
        val n509 = 0
        val item444 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap444 = HashMap<String, IData>()
        hashMap444["meta"] = ExpandInt.toData(26)
        array270[n509] = item444.withTag(ExpandAnyDict.asData(hashMap444))
        array270[1] = OreBracketHandler.getOre("stickWood")
        val n510 = 2
        val item445 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap445 = HashMap<String, IData>()
        hashMap445["meta"] = ExpandInt.toData(26)
        array270[n510] = item445.withTag(ExpandAnyDict.asData(hashMap445))
        array268[n508] = array270
        recipes110.addShaped(amount53, array268, null)
        val recipes111 = MineTweakerAPI.recipes
        val item446 = ItemBracketHandler.getItem("ExtraTrees:gate", 58)
        val hashMap446 = HashMap<String, IData>()
        hashMap446["meta"] = ExpandInt.toData(58)
        val amount54 = item446.withTag(ExpandAnyDict.asData(hashMap446)).amount(4)
        val array271 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n511 = 1
        val array272 = arrayOfNulls<IIngredient>(3)
        val n512 = 0
        val item447 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap447 = HashMap<String, IData>()
        hashMap447["meta"] = ExpandInt.toData(26)
        array272[n512] = item447.withTag(ExpandAnyDict.asData(hashMap447))
        array272[1] = OreBracketHandler.getOre("stickWood")
        val n513 = 2
        val item448 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap448 = HashMap<String, IData>()
        hashMap448["meta"] = ExpandInt.toData(26)
        array272[n513] = item448.withTag(ExpandAnyDict.asData(hashMap448))
        array271[n511] = array272
        val n514 = 2
        val array273 = arrayOfNulls<IIngredient>(3)
        val n515 = 0
        val item449 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap449 = HashMap<String, IData>()
        hashMap449["meta"] = ExpandInt.toData(26)
        array273[n515] = item449.withTag(ExpandAnyDict.asData(hashMap449))
        array273[1] = OreBracketHandler.getOre("stickWood")
        val n516 = 2
        val item450 = ItemBracketHandler.getItem("ExtraTrees:planks", 26)
        val hashMap450 = HashMap<String, IData>()
        hashMap450["meta"] = ExpandInt.toData(26)
        array273[n516] = item450.withTag(ExpandAnyDict.asData(hashMap450))
        array271[n514] = array273
        recipes111.addShaped(amount54, array271, null)
        val recipes112 = MineTweakerAPI.recipes
        val item451 = ItemBracketHandler.getItem("ExtraTrees:gate", 59)
        val hashMap451 = HashMap<String, IData>()
        hashMap451["meta"] = ExpandInt.toData(59)
        val withTag43 = item451.withTag(ExpandAnyDict.asData(hashMap451))
        val array274 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n517 = 1
        val array275 = arrayOfNulls<IIngredient>(3)
        val n518 = 0
        val item452 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap452 = HashMap<String, IData>()
        hashMap452["meta"] = ExpandInt.toData(27)
        array275[n518] = item452.withTag(ExpandAnyDict.asData(hashMap452))
        array275[1] = OreBracketHandler.getOre("stickWood")
        val n519 = 2
        val item453 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap453 = HashMap<String, IData>()
        hashMap453["meta"] = ExpandInt.toData(27)
        array275[n519] = item453.withTag(ExpandAnyDict.asData(hashMap453))
        array274[n517] = array275
        val n520 = 2
        val array276 = arrayOfNulls<IIngredient>(3)
        val n521 = 0
        val item454 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap454 = HashMap<String, IData>()
        hashMap454["meta"] = ExpandInt.toData(27)
        array276[n521] = item454.withTag(ExpandAnyDict.asData(hashMap454))
        array276[1] = OreBracketHandler.getOre("stickWood")
        val n522 = 2
        val item455 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap455 = HashMap<String, IData>()
        hashMap455["meta"] = ExpandInt.toData(27)
        array276[n522] = item455.withTag(ExpandAnyDict.asData(hashMap455))
        array274[n520] = array276
        recipes112.addShaped(withTag43, array274, null)
        val recipes113 = MineTweakerAPI.recipes
        val item456 = ItemBracketHandler.getItem("ExtraTrees:gate", 59)
        val hashMap456 = HashMap<String, IData>()
        hashMap456["meta"] = ExpandInt.toData(59)
        val amount55 = item456.withTag(ExpandAnyDict.asData(hashMap456)).amount(2)
        val array277 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n523 = 1
        val array278 = arrayOfNulls<IIngredient>(3)
        val n524 = 0
        val item457 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap457 = HashMap<String, IData>()
        hashMap457["meta"] = ExpandInt.toData(27)
        array278[n524] = item457.withTag(ExpandAnyDict.asData(hashMap457))
        array278[1] = OreBracketHandler.getOre("stickWood")
        val n525 = 2
        val item458 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap458 = HashMap<String, IData>()
        hashMap458["meta"] = ExpandInt.toData(27)
        array278[n525] = item458.withTag(ExpandAnyDict.asData(hashMap458))
        array277[n523] = array278
        val n526 = 2
        val array279 = arrayOfNulls<IIngredient>(3)
        val n527 = 0
        val item459 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap459 = HashMap<String, IData>()
        hashMap459["meta"] = ExpandInt.toData(27)
        array279[n527] = item459.withTag(ExpandAnyDict.asData(hashMap459))
        array279[1] = OreBracketHandler.getOre("stickWood")
        val n528 = 2
        val item460 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap460 = HashMap<String, IData>()
        hashMap460["meta"] = ExpandInt.toData(27)
        array279[n528] = item460.withTag(ExpandAnyDict.asData(hashMap460))
        array277[n526] = array279
        recipes113.addShaped(amount55, array277, null)
        val recipes114 = MineTweakerAPI.recipes
        val item461 = ItemBracketHandler.getItem("ExtraTrees:gate", 59)
        val hashMap461 = HashMap<String, IData>()
        hashMap461["meta"] = ExpandInt.toData(59)
        val amount56 = item461.withTag(ExpandAnyDict.asData(hashMap461)).amount(4)
        val array280 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n529 = 1
        val array281 = arrayOfNulls<IIngredient>(3)
        val n530 = 0
        val item462 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap462 = HashMap<String, IData>()
        hashMap462["meta"] = ExpandInt.toData(27)
        array281[n530] = item462.withTag(ExpandAnyDict.asData(hashMap462))
        array281[1] = OreBracketHandler.getOre("stickWood")
        val n531 = 2
        val item463 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap463 = HashMap<String, IData>()
        hashMap463["meta"] = ExpandInt.toData(27)
        array281[n531] = item463.withTag(ExpandAnyDict.asData(hashMap463))
        array280[n529] = array281
        val n532 = 2
        val array282 = arrayOfNulls<IIngredient>(3)
        val n533 = 0
        val item464 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap464 = HashMap<String, IData>()
        hashMap464["meta"] = ExpandInt.toData(27)
        array282[n533] = item464.withTag(ExpandAnyDict.asData(hashMap464))
        array282[1] = OreBracketHandler.getOre("stickWood")
        val n534 = 2
        val item465 = ItemBracketHandler.getItem("ExtraTrees:planks", 27)
        val hashMap465 = HashMap<String, IData>()
        hashMap465["meta"] = ExpandInt.toData(27)
        array282[n534] = item465.withTag(ExpandAnyDict.asData(hashMap465))
        array280[n532] = array282
        recipes114.addShaped(amount56, array280, null)
        val recipes115 = MineTweakerAPI.recipes
        val item466 = ItemBracketHandler.getItem("ExtraTrees:gate", 60)
        val hashMap466 = HashMap<String, IData>()
        hashMap466["meta"] = ExpandInt.toData(60)
        val withTag44 = item466.withTag(ExpandAnyDict.asData(hashMap466))
        val array283 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n535 = 1
        val array284 = arrayOfNulls<IIngredient>(3)
        val n536 = 0
        val item467 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap467 = HashMap<String, IData>()
        hashMap467["meta"] = ExpandInt.toData(28)
        array284[n536] = item467.withTag(ExpandAnyDict.asData(hashMap467))
        array284[1] = OreBracketHandler.getOre("stickWood")
        val n537 = 2
        val item468 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap468 = HashMap<String, IData>()
        hashMap468["meta"] = ExpandInt.toData(28)
        array284[n537] = item468.withTag(ExpandAnyDict.asData(hashMap468))
        array283[n535] = array284
        val n538 = 2
        val array285 = arrayOfNulls<IIngredient>(3)
        val n539 = 0
        val item469 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap469 = HashMap<String, IData>()
        hashMap469["meta"] = ExpandInt.toData(28)
        array285[n539] = item469.withTag(ExpandAnyDict.asData(hashMap469))
        array285[1] = OreBracketHandler.getOre("stickWood")
        val n540 = 2
        val item470 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap470 = HashMap<String, IData>()
        hashMap470["meta"] = ExpandInt.toData(28)
        array285[n540] = item470.withTag(ExpandAnyDict.asData(hashMap470))
        array283[n538] = array285
        recipes115.addShaped(withTag44, array283, null)
        val recipes116 = MineTweakerAPI.recipes
        val item471 = ItemBracketHandler.getItem("ExtraTrees:gate", 60)
        val hashMap471 = HashMap<String, IData>()
        hashMap471["meta"] = ExpandInt.toData(60)
        val amount57 = item471.withTag(ExpandAnyDict.asData(hashMap471)).amount(2)
        val array286 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n541 = 1
        val array287 = arrayOfNulls<IIngredient>(3)
        val n542 = 0
        val item472 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap472 = HashMap<String, IData>()
        hashMap472["meta"] = ExpandInt.toData(28)
        array287[n542] = item472.withTag(ExpandAnyDict.asData(hashMap472))
        array287[1] = OreBracketHandler.getOre("stickWood")
        val n543 = 2
        val item473 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap473 = HashMap<String, IData>()
        hashMap473["meta"] = ExpandInt.toData(28)
        array287[n543] = item473.withTag(ExpandAnyDict.asData(hashMap473))
        array286[n541] = array287
        val n544 = 2
        val array288 = arrayOfNulls<IIngredient>(3)
        val n545 = 0
        val item474 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap474 = HashMap<String, IData>()
        hashMap474["meta"] = ExpandInt.toData(28)
        array288[n545] = item474.withTag(ExpandAnyDict.asData(hashMap474))
        array288[1] = OreBracketHandler.getOre("stickWood")
        val n546 = 2
        val item475 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap475 = HashMap<String, IData>()
        hashMap475["meta"] = ExpandInt.toData(28)
        array288[n546] = item475.withTag(ExpandAnyDict.asData(hashMap475))
        array286[n544] = array288
        recipes116.addShaped(amount57, array286, null)
        val recipes117 = MineTweakerAPI.recipes
        val item476 = ItemBracketHandler.getItem("ExtraTrees:gate", 60)
        val hashMap476 = HashMap<String, IData>()
        hashMap476["meta"] = ExpandInt.toData(60)
        val amount58 = item476.withTag(ExpandAnyDict.asData(hashMap476)).amount(4)
        val array289 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n547 = 1
        val array290 = arrayOfNulls<IIngredient>(3)
        val n548 = 0
        val item477 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap477 = HashMap<String, IData>()
        hashMap477["meta"] = ExpandInt.toData(28)
        array290[n548] = item477.withTag(ExpandAnyDict.asData(hashMap477))
        array290[1] = OreBracketHandler.getOre("stickWood")
        val n549 = 2
        val item478 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap478 = HashMap<String, IData>()
        hashMap478["meta"] = ExpandInt.toData(28)
        array290[n549] = item478.withTag(ExpandAnyDict.asData(hashMap478))
        array289[n547] = array290
        val n550 = 2
        val array291 = arrayOfNulls<IIngredient>(3)
        val n551 = 0
        val item479 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap479 = HashMap<String, IData>()
        hashMap479["meta"] = ExpandInt.toData(28)
        array291[n551] = item479.withTag(ExpandAnyDict.asData(hashMap479))
        array291[1] = OreBracketHandler.getOre("stickWood")
        val n552 = 2
        val item480 = ItemBracketHandler.getItem("ExtraTrees:planks", 28)
        val hashMap480 = HashMap<String, IData>()
        hashMap480["meta"] = ExpandInt.toData(28)
        array291[n552] = item480.withTag(ExpandAnyDict.asData(hashMap480))
        array289[n550] = array291
        recipes117.addShaped(amount58, array289, null)
        val recipes118 = MineTweakerAPI.recipes
        val item481 = ItemBracketHandler.getItem("ExtraTrees:gate", 61)
        val hashMap481 = HashMap<String, IData>()
        hashMap481["meta"] = ExpandInt.toData(61)
        val withTag45 = item481.withTag(ExpandAnyDict.asData(hashMap481))
        val array292 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n553 = 1
        val array293 = arrayOfNulls<IIngredient>(3)
        val n554 = 0
        val item482 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap482 = HashMap<String, IData>()
        hashMap482["meta"] = ExpandInt.toData(29)
        array293[n554] = item482.withTag(ExpandAnyDict.asData(hashMap482))
        array293[1] = OreBracketHandler.getOre("stickWood")
        val n555 = 2
        val item483 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap483 = HashMap<String, IData>()
        hashMap483["meta"] = ExpandInt.toData(29)
        array293[n555] = item483.withTag(ExpandAnyDict.asData(hashMap483))
        array292[n553] = array293
        val n556 = 2
        val array294 = arrayOfNulls<IIngredient>(3)
        val n557 = 0
        val item484 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap484 = HashMap<String, IData>()
        hashMap484["meta"] = ExpandInt.toData(29)
        array294[n557] = item484.withTag(ExpandAnyDict.asData(hashMap484))
        array294[1] = OreBracketHandler.getOre("stickWood")
        val n558 = 2
        val item485 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap485 = HashMap<String, IData>()
        hashMap485["meta"] = ExpandInt.toData(29)
        array294[n558] = item485.withTag(ExpandAnyDict.asData(hashMap485))
        array292[n556] = array294
        recipes118.addShaped(withTag45, array292, null)
        val recipes119 = MineTweakerAPI.recipes
        val item486 = ItemBracketHandler.getItem("ExtraTrees:gate", 61)
        val hashMap486 = HashMap<String, IData>()
        hashMap486["meta"] = ExpandInt.toData(61)
        val amount59 = item486.withTag(ExpandAnyDict.asData(hashMap486)).amount(2)
        val array295 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n559 = 1
        val array296 = arrayOfNulls<IIngredient>(3)
        val n560 = 0
        val item487 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap487 = HashMap<String, IData>()
        hashMap487["meta"] = ExpandInt.toData(29)
        array296[n560] = item487.withTag(ExpandAnyDict.asData(hashMap487))
        array296[1] = OreBracketHandler.getOre("stickWood")
        val n561 = 2
        val item488 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap488 = HashMap<String, IData>()
        hashMap488["meta"] = ExpandInt.toData(29)
        array296[n561] = item488.withTag(ExpandAnyDict.asData(hashMap488))
        array295[n559] = array296
        val n562 = 2
        val array297 = arrayOfNulls<IIngredient>(3)
        val n563 = 0
        val item489 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap489 = HashMap<String, IData>()
        hashMap489["meta"] = ExpandInt.toData(29)
        array297[n563] = item489.withTag(ExpandAnyDict.asData(hashMap489))
        array297[1] = OreBracketHandler.getOre("stickWood")
        val n564 = 2
        val item490 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap490 = HashMap<String, IData>()
        hashMap490["meta"] = ExpandInt.toData(29)
        array297[n564] = item490.withTag(ExpandAnyDict.asData(hashMap490))
        array295[n562] = array297
        recipes119.addShaped(amount59, array295, null)
        val recipes120 = MineTweakerAPI.recipes
        val item491 = ItemBracketHandler.getItem("ExtraTrees:gate", 61)
        val hashMap491 = HashMap<String, IData>()
        hashMap491["meta"] = ExpandInt.toData(61)
        val amount60 = item491.withTag(ExpandAnyDict.asData(hashMap491)).amount(4)
        val array298 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n565 = 1
        val array299 = arrayOfNulls<IIngredient>(3)
        val n566 = 0
        val item492 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap492 = HashMap<String, IData>()
        hashMap492["meta"] = ExpandInt.toData(29)
        array299[n566] = item492.withTag(ExpandAnyDict.asData(hashMap492))
        array299[1] = OreBracketHandler.getOre("stickWood")
        val n567 = 2
        val item493 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap493 = HashMap<String, IData>()
        hashMap493["meta"] = ExpandInt.toData(29)
        array299[n567] = item493.withTag(ExpandAnyDict.asData(hashMap493))
        array298[n565] = array299
        val n568 = 2
        val array300 = arrayOfNulls<IIngredient>(3)
        val n569 = 0
        val item494 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap494 = HashMap<String, IData>()
        hashMap494["meta"] = ExpandInt.toData(29)
        array300[n569] = item494.withTag(ExpandAnyDict.asData(hashMap494))
        array300[1] = OreBracketHandler.getOre("stickWood")
        val n570 = 2
        val item495 = ItemBracketHandler.getItem("ExtraTrees:planks", 29)
        val hashMap495 = HashMap<String, IData>()
        hashMap495["meta"] = ExpandInt.toData(29)
        array300[n570] = item495.withTag(ExpandAnyDict.asData(hashMap495))
        array298[n568] = array300
        recipes120.addShaped(amount60, array298, null)
        val recipes121 = MineTweakerAPI.recipes
        val item496 = ItemBracketHandler.getItem("ExtraTrees:gate", 62)
        val hashMap496 = HashMap<String, IData>()
        hashMap496["meta"] = ExpandInt.toData(62)
        val withTag46 = item496.withTag(ExpandAnyDict.asData(hashMap496))
        val array301 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n571 = 1
        val array302 = arrayOfNulls<IIngredient>(3)
        val n572 = 0
        val item497 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap497 = HashMap<String, IData>()
        hashMap497["meta"] = ExpandInt.toData(30)
        array302[n572] = item497.withTag(ExpandAnyDict.asData(hashMap497))
        array302[1] = OreBracketHandler.getOre("stickWood")
        val n573 = 2
        val item498 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap498 = HashMap<String, IData>()
        hashMap498["meta"] = ExpandInt.toData(30)
        array302[n573] = item498.withTag(ExpandAnyDict.asData(hashMap498))
        array301[n571] = array302
        val n574 = 2
        val array303 = arrayOfNulls<IIngredient>(3)
        val n575 = 0
        val item499 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap499 = HashMap<String, IData>()
        hashMap499["meta"] = ExpandInt.toData(30)
        array303[n575] = item499.withTag(ExpandAnyDict.asData(hashMap499))
        array303[1] = OreBracketHandler.getOre("stickWood")
        val n576 = 2
        val item500 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap500 = HashMap<String, IData>()
        hashMap500["meta"] = ExpandInt.toData(30)
        array303[n576] = item500.withTag(ExpandAnyDict.asData(hashMap500))
        array301[n574] = array303
        recipes121.addShaped(withTag46, array301, null)

        run2()
        run3()
    }

    private fun run2() {
        val recipes122 = MineTweakerAPI.recipes
        val item501 = ItemBracketHandler.getItem("ExtraTrees:gate", 62)
        val hashMap501 = HashMap<String, IData>()
        hashMap501["meta"] = ExpandInt.toData(62)
        val amount61 = item501.withTag(ExpandAnyDict.asData(hashMap501)).amount(2)
        val array304 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n577 = 1
        val array305 = arrayOfNulls<IIngredient>(3)
        val n578 = 0
        val item502 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap502 = HashMap<String, IData>()
        hashMap502["meta"] = ExpandInt.toData(30)
        array305[n578] = item502.withTag(ExpandAnyDict.asData(hashMap502))
        array305[1] = OreBracketHandler.getOre("stickWood")
        val n579 = 2
        val item503 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap503 = HashMap<String, IData>()
        hashMap503["meta"] = ExpandInt.toData(30)
        array305[n579] = item503.withTag(ExpandAnyDict.asData(hashMap503))
        array304[n577] = array305
        val n580 = 2
        val array306 = arrayOfNulls<IIngredient>(3)
        val n581 = 0
        val item504 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap504 = HashMap<String, IData>()
        hashMap504["meta"] = ExpandInt.toData(30)
        array306[n581] = item504.withTag(ExpandAnyDict.asData(hashMap504))
        array306[1] = OreBracketHandler.getOre("stickWood")
        val n582 = 2
        val item505 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap505 = HashMap<String, IData>()
        hashMap505["meta"] = ExpandInt.toData(30)
        array306[n582] = item505.withTag(ExpandAnyDict.asData(hashMap505))
        array304[n580] = array306
        recipes122.addShaped(amount61, array304, null)
        val recipes123 = MineTweakerAPI.recipes
        val item506 = ItemBracketHandler.getItem("ExtraTrees:gate", 62)
        val hashMap506 = HashMap<String, IData>()
        hashMap506["meta"] = ExpandInt.toData(62)
        val amount62 = item506.withTag(ExpandAnyDict.asData(hashMap506)).amount(4)
        val array307 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n583 = 1
        val array308 = arrayOfNulls<IIngredient>(3)
        val n584 = 0
        val item507 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap507 = HashMap<String, IData>()
        hashMap507["meta"] = ExpandInt.toData(30)
        array308[n584] = item507.withTag(ExpandAnyDict.asData(hashMap507))
        array308[1] = OreBracketHandler.getOre("stickWood")
        val n585 = 2
        val item508 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap508 = HashMap<String, IData>()
        hashMap508["meta"] = ExpandInt.toData(30)
        array308[n585] = item508.withTag(ExpandAnyDict.asData(hashMap508))
        array307[n583] = array308
        val n586 = 2
        val array309 = arrayOfNulls<IIngredient>(3)
        val n587 = 0
        val item509 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap509 = HashMap<String, IData>()
        hashMap509["meta"] = ExpandInt.toData(30)
        array309[n587] = item509.withTag(ExpandAnyDict.asData(hashMap509))
        array309[1] = OreBracketHandler.getOre("stickWood")
        val n588 = 2
        val item510 = ItemBracketHandler.getItem("ExtraTrees:planks", 30)
        val hashMap510 = HashMap<String, IData>()
        hashMap510["meta"] = ExpandInt.toData(30)
        array309[n588] = item510.withTag(ExpandAnyDict.asData(hashMap510))
        array307[n586] = array309
        recipes123.addShaped(amount62, array307, null)
        val recipes124 = MineTweakerAPI.recipes
        val item511 = ItemBracketHandler.getItem("ExtraTrees:gate", 63)
        val hashMap511 = HashMap<String, IData>()
        hashMap511["meta"] = ExpandInt.toData(63)
        val withTag47 = item511.withTag(ExpandAnyDict.asData(hashMap511))
        val array310 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n589 = 1
        val array311 = arrayOfNulls<IIngredient>(3)
        val n590 = 0
        val item512 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap512 = HashMap<String, IData>()
        hashMap512["meta"] = ExpandInt.toData(31)
        array311[n590] = item512.withTag(ExpandAnyDict.asData(hashMap512))
        array311[1] = OreBracketHandler.getOre("stickWood")
        val n591 = 2
        val item513 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap513 = HashMap<String, IData>()
        hashMap513["meta"] = ExpandInt.toData(31)
        array311[n591] = item513.withTag(ExpandAnyDict.asData(hashMap513))
        array310[n589] = array311
        val n592 = 2
        val array312 = arrayOfNulls<IIngredient>(3)
        val n593 = 0
        val item514 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap514 = HashMap<String, IData>()
        hashMap514["meta"] = ExpandInt.toData(31)
        array312[n593] = item514.withTag(ExpandAnyDict.asData(hashMap514))
        array312[1] = OreBracketHandler.getOre("stickWood")
        val n594 = 2
        val item515 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap515 = HashMap<String, IData>()
        hashMap515["meta"] = ExpandInt.toData(31)
        array312[n594] = item515.withTag(ExpandAnyDict.asData(hashMap515))
        array310[n592] = array312
        recipes124.addShaped(withTag47, array310, null)
        val recipes125 = MineTweakerAPI.recipes
        val item516 = ItemBracketHandler.getItem("ExtraTrees:gate", 63)
        val hashMap516 = HashMap<String, IData>()
        hashMap516["meta"] = ExpandInt.toData(63)
        val amount63 = item516.withTag(ExpandAnyDict.asData(hashMap516)).amount(2)
        val array313 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n595 = 1
        val array314 = arrayOfNulls<IIngredient>(3)
        val n596 = 0
        val item517 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap517 = HashMap<String, IData>()
        hashMap517["meta"] = ExpandInt.toData(31)
        array314[n596] = item517.withTag(ExpandAnyDict.asData(hashMap517))
        array314[1] = OreBracketHandler.getOre("stickWood")
        val n597 = 2
        val item518 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap518 = HashMap<String, IData>()
        hashMap518["meta"] = ExpandInt.toData(31)
        array314[n597] = item518.withTag(ExpandAnyDict.asData(hashMap518))
        array313[n595] = array314
        val n598 = 2
        val array315 = arrayOfNulls<IIngredient>(3)
        val n599 = 0
        val item519 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap519 = HashMap<String, IData>()
        hashMap519["meta"] = ExpandInt.toData(31)
        array315[n599] = item519.withTag(ExpandAnyDict.asData(hashMap519))
        array315[1] = OreBracketHandler.getOre("stickWood")
        val n600 = 2
        val item520 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap520 = HashMap<String, IData>()
        hashMap520["meta"] = ExpandInt.toData(31)
        array315[n600] = item520.withTag(ExpandAnyDict.asData(hashMap520))
        array313[n598] = array315
        recipes125.addShaped(amount63, array313, null)
        val recipes126 = MineTweakerAPI.recipes
        val item521 = ItemBracketHandler.getItem("ExtraTrees:gate", 63)
        val hashMap521 = HashMap<String, IData>()
        hashMap521["meta"] = ExpandInt.toData(63)
        val amount64 = item521.withTag(ExpandAnyDict.asData(hashMap521)).amount(4)
        val array316 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n601 = 1
        val array317 = arrayOfNulls<IIngredient>(3)
        val n602 = 0
        val item522 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap522 = HashMap<String, IData>()
        hashMap522["meta"] = ExpandInt.toData(31)
        array317[n602] = item522.withTag(ExpandAnyDict.asData(hashMap522))
        array317[1] = OreBracketHandler.getOre("stickWood")
        val n603 = 2
        val item523 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap523 = HashMap<String, IData>()
        hashMap523["meta"] = ExpandInt.toData(31)
        array317[n603] = item523.withTag(ExpandAnyDict.asData(hashMap523))
        array316[n601] = array317
        val n604 = 2
        val array318 = arrayOfNulls<IIngredient>(3)
        val n605 = 0
        val item524 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap524 = HashMap<String, IData>()
        hashMap524["meta"] = ExpandInt.toData(31)
        array318[n605] = item524.withTag(ExpandAnyDict.asData(hashMap524))
        array318[1] = OreBracketHandler.getOre("stickWood")
        val n606 = 2
        val item525 = ItemBracketHandler.getItem("ExtraTrees:planks", 31)
        val hashMap525 = HashMap<String, IData>()
        hashMap525["meta"] = ExpandInt.toData(31)
        array318[n606] = item525.withTag(ExpandAnyDict.asData(hashMap525))
        array316[n604] = array318
        recipes126.addShaped(amount64, array316, null)
        val recipes127 = MineTweakerAPI.recipes
        val item526 = ItemBracketHandler.getItem("ExtraTrees:gate", 64)
        val hashMap526 = HashMap<String, IData>()
        hashMap526["meta"] = ExpandInt.toData(64)
        val withTag48 = item526.withTag(ExpandAnyDict.asData(hashMap526))
        val array319 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n607 = 1
        val array320 = arrayOfNulls<IIngredient>(3)
        val n608 = 0
        val item527 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap527 = HashMap<String, IData>()
        hashMap527["meta"] = ExpandInt.toData(32)
        array320[n608] = item527.withTag(ExpandAnyDict.asData(hashMap527))
        array320[1] = OreBracketHandler.getOre("stickWood")
        val n609 = 2
        val item528 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap528 = HashMap<String, IData>()
        hashMap528["meta"] = ExpandInt.toData(32)
        array320[n609] = item528.withTag(ExpandAnyDict.asData(hashMap528))
        array319[n607] = array320
        val n610 = 2
        val array321 = arrayOfNulls<IIngredient>(3)
        val n611 = 0
        val item529 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap529 = HashMap<String, IData>()
        hashMap529["meta"] = ExpandInt.toData(32)
        array321[n611] = item529.withTag(ExpandAnyDict.asData(hashMap529))
        array321[1] = OreBracketHandler.getOre("stickWood")
        val n612 = 2
        val item530 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap530 = HashMap<String, IData>()
        hashMap530["meta"] = ExpandInt.toData(32)
        array321[n612] = item530.withTag(ExpandAnyDict.asData(hashMap530))
        array319[n610] = array321
        recipes127.addShaped(withTag48, array319, null)
        val recipes128 = MineTweakerAPI.recipes
        val item531 = ItemBracketHandler.getItem("ExtraTrees:gate", 64)
        val hashMap531 = HashMap<String, IData>()
        hashMap531["meta"] = ExpandInt.toData(64)
        val amount65 = item531.withTag(ExpandAnyDict.asData(hashMap531)).amount(2)
        val array322 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n613 = 1
        val array323 = arrayOfNulls<IIngredient>(3)
        val n614 = 0
        val item532 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap532 = HashMap<String, IData>()
        hashMap532["meta"] = ExpandInt.toData(32)
        array323[n614] = item532.withTag(ExpandAnyDict.asData(hashMap532))
        array323[1] = OreBracketHandler.getOre("stickWood")
        val n615 = 2
        val item533 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap533 = HashMap<String, IData>()
        hashMap533["meta"] = ExpandInt.toData(32)
        array323[n615] = item533.withTag(ExpandAnyDict.asData(hashMap533))
        array322[n613] = array323
        val n616 = 2
        val array324 = arrayOfNulls<IIngredient>(3)
        val n617 = 0
        val item534 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap534 = HashMap<String, IData>()
        hashMap534["meta"] = ExpandInt.toData(32)
        array324[n617] = item534.withTag(ExpandAnyDict.asData(hashMap534))
        array324[1] = OreBracketHandler.getOre("stickWood")
        val n618 = 2
        val item535 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap535 = HashMap<String, IData>()
        hashMap535["meta"] = ExpandInt.toData(32)
        array324[n618] = item535.withTag(ExpandAnyDict.asData(hashMap535))
        array322[n616] = array324
        recipes128.addShaped(amount65, array322, null)
        val recipes129 = MineTweakerAPI.recipes
        val item536 = ItemBracketHandler.getItem("ExtraTrees:gate", 64)
        val hashMap536 = HashMap<String, IData>()
        hashMap536["meta"] = ExpandInt.toData(64)
        val amount66 = item536.withTag(ExpandAnyDict.asData(hashMap536)).amount(4)
        val array325 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n619 = 1
        val array326 = arrayOfNulls<IIngredient>(3)
        val n620 = 0
        val item537 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap537 = HashMap<String, IData>()
        hashMap537["meta"] = ExpandInt.toData(32)
        array326[n620] = item537.withTag(ExpandAnyDict.asData(hashMap537))
        array326[1] = OreBracketHandler.getOre("stickWood")
        val n621 = 2
        val item538 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap538 = HashMap<String, IData>()
        hashMap538["meta"] = ExpandInt.toData(32)
        array326[n621] = item538.withTag(ExpandAnyDict.asData(hashMap538))
        array325[n619] = array326
        val n622 = 2
        val array327 = arrayOfNulls<IIngredient>(3)
        val n623 = 0
        val item539 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap539 = HashMap<String, IData>()
        hashMap539["meta"] = ExpandInt.toData(32)
        array327[n623] = item539.withTag(ExpandAnyDict.asData(hashMap539))
        array327[1] = OreBracketHandler.getOre("stickWood")
        val n624 = 2
        val item540 = ItemBracketHandler.getItem("ExtraTrees:planks", 32)
        val hashMap540 = HashMap<String, IData>()
        hashMap540["meta"] = ExpandInt.toData(32)
        array327[n624] = item540.withTag(ExpandAnyDict.asData(hashMap540))
        array325[n622] = array327
        recipes129.addShaped(amount66, array325, null)
        val recipes130 = MineTweakerAPI.recipes
        val item541 = ItemBracketHandler.getItem("ExtraTrees:gate", 65)
        val hashMap541 = HashMap<String, IData>()
        hashMap541["meta"] = ExpandInt.toData(65)
        val withTag49 = item541.withTag(ExpandAnyDict.asData(hashMap541))
        val array328 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n625 = 1
        val array329 = arrayOfNulls<IIngredient>(3)
        val n626 = 0
        val item542 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap542 = HashMap<String, IData>()
        hashMap542["meta"] = ExpandInt.toData(33)
        array329[n626] = item542.withTag(ExpandAnyDict.asData(hashMap542))
        array329[1] = OreBracketHandler.getOre("stickWood")
        val n627 = 2
        val item543 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap543 = HashMap<String, IData>()
        hashMap543["meta"] = ExpandInt.toData(33)
        array329[n627] = item543.withTag(ExpandAnyDict.asData(hashMap543))
        array328[n625] = array329
        val n628 = 2
        val array330 = arrayOfNulls<IIngredient>(3)
        val n629 = 0
        val item544 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap544 = HashMap<String, IData>()
        hashMap544["meta"] = ExpandInt.toData(33)
        array330[n629] = item544.withTag(ExpandAnyDict.asData(hashMap544))
        array330[1] = OreBracketHandler.getOre("stickWood")
        val n630 = 2
        val item545 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap545 = HashMap<String, IData>()
        hashMap545["meta"] = ExpandInt.toData(33)
        array330[n630] = item545.withTag(ExpandAnyDict.asData(hashMap545))
        array328[n628] = array330
        recipes130.addShaped(withTag49, array328, null)
        val recipes131 = MineTweakerAPI.recipes
        val item546 = ItemBracketHandler.getItem("ExtraTrees:gate", 65)
        val hashMap546 = HashMap<String, IData>()
        hashMap546["meta"] = ExpandInt.toData(65)
        val amount67 = item546.withTag(ExpandAnyDict.asData(hashMap546)).amount(2)
        val array331 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n631 = 1
        val array332 = arrayOfNulls<IIngredient>(3)
        val n632 = 0
        val item547 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap547 = HashMap<String, IData>()
        hashMap547["meta"] = ExpandInt.toData(33)
        array332[n632] = item547.withTag(ExpandAnyDict.asData(hashMap547))
        array332[1] = OreBracketHandler.getOre("stickWood")
        val n633 = 2
        val item548 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap548 = HashMap<String, IData>()
        hashMap548["meta"] = ExpandInt.toData(33)
        array332[n633] = item548.withTag(ExpandAnyDict.asData(hashMap548))
        array331[n631] = array332
        val n634 = 2
        val array333 = arrayOfNulls<IIngredient>(3)
        val n635 = 0
        val item549 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap549 = HashMap<String, IData>()
        hashMap549["meta"] = ExpandInt.toData(33)
        array333[n635] = item549.withTag(ExpandAnyDict.asData(hashMap549))
        array333[1] = OreBracketHandler.getOre("stickWood")
        val n636 = 2
        val item550 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap550 = HashMap<String, IData>()
        hashMap550["meta"] = ExpandInt.toData(33)
        array333[n636] = item550.withTag(ExpandAnyDict.asData(hashMap550))
        array331[n634] = array333
        recipes131.addShaped(amount67, array331, null)
        val recipes132 = MineTweakerAPI.recipes
        val item551 = ItemBracketHandler.getItem("ExtraTrees:gate", 65)
        val hashMap551 = HashMap<String, IData>()
        hashMap551["meta"] = ExpandInt.toData(65)
        val amount68 = item551.withTag(ExpandAnyDict.asData(hashMap551)).amount(4)
        val array334 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n637 = 1
        val array335 = arrayOfNulls<IIngredient>(3)
        val n638 = 0
        val item552 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap552 = HashMap<String, IData>()
        hashMap552["meta"] = ExpandInt.toData(33)
        array335[n638] = item552.withTag(ExpandAnyDict.asData(hashMap552))
        array335[1] = OreBracketHandler.getOre("stickWood")
        val n639 = 2
        val item553 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap553 = HashMap<String, IData>()
        hashMap553["meta"] = ExpandInt.toData(33)
        array335[n639] = item553.withTag(ExpandAnyDict.asData(hashMap553))
        array334[n637] = array335
        val n640 = 2
        val array336 = arrayOfNulls<IIngredient>(3)
        val n641 = 0
        val item554 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap554 = HashMap<String, IData>()
        hashMap554["meta"] = ExpandInt.toData(33)
        array336[n641] = item554.withTag(ExpandAnyDict.asData(hashMap554))
        array336[1] = OreBracketHandler.getOre("stickWood")
        val n642 = 2
        val item555 = ItemBracketHandler.getItem("ExtraTrees:planks", 33)
        val hashMap555 = HashMap<String, IData>()
        hashMap555["meta"] = ExpandInt.toData(33)
        array336[n642] = item555.withTag(ExpandAnyDict.asData(hashMap555))
        array334[n640] = array336
        recipes132.addShaped(amount68, array334, null)
        val recipes133 = MineTweakerAPI.recipes
        val item556 = ItemBracketHandler.getItem("ExtraTrees:gate", 66)
        val hashMap556 = HashMap<String, IData>()
        hashMap556["meta"] = ExpandInt.toData(66)
        val withTag50 = item556.withTag(ExpandAnyDict.asData(hashMap556))
        val array337 = arrayOf(
                arrayOf<IIngredient?>(ore2, null, ore2), null, null)
        val n643 = 1
        val array338 = arrayOfNulls<IIngredient>(3)
        val n644 = 0
        val item557 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap557 = HashMap<String, IData>()
        hashMap557["meta"] = ExpandInt.toData(34)
        array338[n644] = item557.withTag(ExpandAnyDict.asData(hashMap557))
        array338[1] = OreBracketHandler.getOre("stickWood")
        val n645 = 2
        val item558 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap558 = HashMap<String, IData>()
        hashMap558["meta"] = ExpandInt.toData(34)
        array338[n645] = item558.withTag(ExpandAnyDict.asData(hashMap558))
        array337[n643] = array338
        val n646 = 2
        val array339 = arrayOfNulls<IIngredient>(3)
        val n647 = 0
        val item559 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap559 = HashMap<String, IData>()
        hashMap559["meta"] = ExpandInt.toData(34)
        array339[n647] = item559.withTag(ExpandAnyDict.asData(hashMap559))
        array339[1] = OreBracketHandler.getOre("stickWood")
        val n648 = 2
        val item560 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap560 = HashMap<String, IData>()
        hashMap560["meta"] = ExpandInt.toData(34)
        array339[n648] = item560.withTag(ExpandAnyDict.asData(hashMap560))
        array337[n646] = array339
        recipes133.addShaped(withTag50, array337, null)
        val recipes134 = MineTweakerAPI.recipes
        val item561 = ItemBracketHandler.getItem("ExtraTrees:gate", 66)
        val hashMap561 = HashMap<String, IData>()
        hashMap561["meta"] = ExpandInt.toData(66)
        val amount69 = item561.withTag(ExpandAnyDict.asData(hashMap561)).amount(2)
        val array340 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n649 = 1
        val array341 = arrayOfNulls<IIngredient>(3)
        val n650 = 0
        val item562 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap562 = HashMap<String, IData>()
        hashMap562["meta"] = ExpandInt.toData(34)
        array341[n650] = item562.withTag(ExpandAnyDict.asData(hashMap562))
        array341[1] = OreBracketHandler.getOre("stickWood")
        val n651 = 2
        val item563 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap563 = HashMap<String, IData>()
        hashMap563["meta"] = ExpandInt.toData(34)
        array341[n651] = item563.withTag(ExpandAnyDict.asData(hashMap563))
        array340[n649] = array341
        val n652 = 2
        val array342 = arrayOfNulls<IIngredient>(3)
        val n653 = 0
        val item564 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap564 = HashMap<String, IData>()
        hashMap564["meta"] = ExpandInt.toData(34)
        array342[n653] = item564.withTag(ExpandAnyDict.asData(hashMap564))
        array342[1] = OreBracketHandler.getOre("stickWood")
        val n654 = 2
        val item565 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap565 = HashMap<String, IData>()
        hashMap565["meta"] = ExpandInt.toData(34)
        array342[n654] = item565.withTag(ExpandAnyDict.asData(hashMap565))
        array340[n652] = array342
        recipes134.addShaped(amount69, array340, null)
        val recipes135 = MineTweakerAPI.recipes
        val item566 = ItemBracketHandler.getItem("ExtraTrees:gate", 66)
        val hashMap566 = HashMap<String, IData>()
        hashMap566["meta"] = ExpandInt.toData(66)
        val amount70 = item566.withTag(ExpandAnyDict.asData(hashMap566)).amount(4)
        val array343 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n655 = 1
        val array344 = arrayOfNulls<IIngredient>(3)
        val n656 = 0
        val item567 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap567 = HashMap<String, IData>()
        hashMap567["meta"] = ExpandInt.toData(34)
        array344[n656] = item567.withTag(ExpandAnyDict.asData(hashMap567))
        array344[1] = OreBracketHandler.getOre("stickWood")
        val n657 = 2
        val item568 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap568 = HashMap<String, IData>()
        hashMap568["meta"] = ExpandInt.toData(34)
        array344[n657] = item568.withTag(ExpandAnyDict.asData(hashMap568))
        array343[n655] = array344
        val n658 = 2
        val array345 = arrayOfNulls<IIngredient>(3)
        val n659 = 0
        val item569 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap569 = HashMap<String, IData>()
        hashMap569["meta"] = ExpandInt.toData(34)
        array345[n659] = item569.withTag(ExpandAnyDict.asData(hashMap569))
        array345[1] = OreBracketHandler.getOre("stickWood")
        val n660 = 2
        val item570 = ItemBracketHandler.getItem("ExtraTrees:planks", 34)
        val hashMap570 = HashMap<String, IData>()
        hashMap570["meta"] = ExpandInt.toData(34)
        array345[n660] = item570.withTag(ExpandAnyDict.asData(hashMap570))
        array343[n658] = array345
        recipes135.addShaped(amount70, array343, null)
        val recipes136 = MineTweakerAPI.recipes
        val item571 = ItemBracketHandler.getItem("ExtraTrees:gate", 128)
        val hashMap571 = HashMap<String, IData>()
        hashMap571["meta"] = ExpandInt.toData(128)
        recipes136.addShaped(item571.withTag(ExpandAnyDict.asData(hashMap571)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 0)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 0))), null)
        val recipes137 = MineTweakerAPI.recipes
        val item572 = ItemBracketHandler.getItem("ExtraTrees:gate", 128)
        val hashMap572 = HashMap<String, IData>()
        hashMap572["meta"] = ExpandInt.toData(128)
        recipes137.addShaped(item572.withTag(ExpandAnyDict.asData(hashMap572)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 0)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 0))), null)
        val recipes138 = MineTweakerAPI.recipes
        val item573 = ItemBracketHandler.getItem("ExtraTrees:gate", 128)
        val hashMap573 = HashMap<String, IData>()
        hashMap573["meta"] = ExpandInt.toData(128)
        recipes138.addShaped(item573.withTag(ExpandAnyDict.asData(hashMap573)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 0)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 0))), null)
        val recipes139 = MineTweakerAPI.recipes
        val item574 = ItemBracketHandler.getItem("ExtraTrees:gate", 129)
        val hashMap574 = HashMap<String, IData>()
        hashMap574["meta"] = ExpandInt.toData(129)
        recipes139.addShaped(item574.withTag(ExpandAnyDict.asData(hashMap574)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 1)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 1))), null)
        val recipes140 = MineTweakerAPI.recipes
        val item575 = ItemBracketHandler.getItem("ExtraTrees:gate", 129)
        val hashMap575 = HashMap<String, IData>()
        hashMap575["meta"] = ExpandInt.toData(129)
        recipes140.addShaped(item575.withTag(ExpandAnyDict.asData(hashMap575)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 1)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 1))), null)
        val recipes141 = MineTweakerAPI.recipes
        val item576 = ItemBracketHandler.getItem("ExtraTrees:gate", 129)
        val hashMap576 = HashMap<String, IData>()
        hashMap576["meta"] = ExpandInt.toData(129)
        recipes141.addShaped(item576.withTag(ExpandAnyDict.asData(hashMap576)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 1)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 1))), null)
        val recipes142 = MineTweakerAPI.recipes
        val item577 = ItemBracketHandler.getItem("ExtraTrees:gate", 130)
        val hashMap577 = HashMap<String, IData>()
        hashMap577["meta"] = ExpandInt.toData(130)
        recipes142.addShaped(item577.withTag(ExpandAnyDict.asData(hashMap577)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 2)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 2))), null)
        val recipes143 = MineTweakerAPI.recipes
        val item578 = ItemBracketHandler.getItem("ExtraTrees:gate", 130)
        val hashMap578 = HashMap<String, IData>()
        hashMap578["meta"] = ExpandInt.toData(130)
        recipes143.addShaped(item578.withTag(ExpandAnyDict.asData(hashMap578)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 2)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 2))), null)
        val recipes144 = MineTweakerAPI.recipes
        val item579 = ItemBracketHandler.getItem("ExtraTrees:gate", 130)
        val hashMap579 = HashMap<String, IData>()
        hashMap579["meta"] = ExpandInt.toData(130)
        recipes144.addShaped(item579.withTag(ExpandAnyDict.asData(hashMap579)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 2)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 2))), null)
        val recipes145 = MineTweakerAPI.recipes
        val item580 = ItemBracketHandler.getItem("ExtraTrees:gate", 131)
        val hashMap580 = HashMap<String, IData>()
        hashMap580["meta"] = ExpandInt.toData(131)
        recipes145.addShaped(item580.withTag(ExpandAnyDict.asData(hashMap580)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 3)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 3))), null)
        val recipes146 = MineTweakerAPI.recipes
        val item581 = ItemBracketHandler.getItem("ExtraTrees:gate", 131)
        val hashMap581 = HashMap<String, IData>()
        hashMap581["meta"] = ExpandInt.toData(131)
        recipes146.addShaped(item581.withTag(ExpandAnyDict.asData(hashMap581)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 3)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 3))), null)
        val recipes147 = MineTweakerAPI.recipes
        val item582 = ItemBracketHandler.getItem("ExtraTrees:gate", 131)
        val hashMap582 = HashMap<String, IData>()
        hashMap582["meta"] = ExpandInt.toData(131)
        recipes147.addShaped(item582.withTag(ExpandAnyDict.asData(hashMap582)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 3)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 3))), null)
        val recipes148 = MineTweakerAPI.recipes
        val item583 = ItemBracketHandler.getItem("ExtraTrees:gate", 132)
        val hashMap583 = HashMap<String, IData>()
        hashMap583["meta"] = ExpandInt.toData(132)
        recipes148.addShaped(item583.withTag(ExpandAnyDict.asData(hashMap583)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 4)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 4))), null)
        val recipes149 = MineTweakerAPI.recipes
        val item584 = ItemBracketHandler.getItem("ExtraTrees:gate", 132)
        val hashMap584 = HashMap<String, IData>()
        hashMap584["meta"] = ExpandInt.toData(132)
        recipes149.addShaped(item584.withTag(ExpandAnyDict.asData(hashMap584)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 4)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 4))), null)
        val recipes150 = MineTweakerAPI.recipes
        val item585 = ItemBracketHandler.getItem("ExtraTrees:gate", 132)
        val hashMap585 = HashMap<String, IData>()
        hashMap585["meta"] = ExpandInt.toData(132)
        recipes150.addShaped(item585.withTag(ExpandAnyDict.asData(hashMap585)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 4)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 4))), null)
        val recipes151 = MineTweakerAPI.recipes
        val item586 = ItemBracketHandler.getItem("ExtraTrees:gate", 133)
        val hashMap586 = HashMap<String, IData>()
        hashMap586["meta"] = ExpandInt.toData(133)
        recipes151.addShaped(item586.withTag(ExpandAnyDict.asData(hashMap586)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 5)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 5))), null)
        val recipes152 = MineTweakerAPI.recipes
        val item587 = ItemBracketHandler.getItem("ExtraTrees:gate", 133)
        val hashMap587 = HashMap<String, IData>()
        hashMap587["meta"] = ExpandInt.toData(133)
        recipes152.addShaped(item587.withTag(ExpandAnyDict.asData(hashMap587)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 5)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 5))), null)
        val recipes153 = MineTweakerAPI.recipes
        val item588 = ItemBracketHandler.getItem("ExtraTrees:gate", 133)
        val hashMap588 = HashMap<String, IData>()
        hashMap588["meta"] = ExpandInt.toData(133)
        recipes153.addShaped(item588.withTag(ExpandAnyDict.asData(hashMap588)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 5)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 5))), null)
        val recipes154 = MineTweakerAPI.recipes
        val item589 = ItemBracketHandler.getItem("ExtraTrees:gate", 134)
        val hashMap589 = HashMap<String, IData>()
        hashMap589["meta"] = ExpandInt.toData(134)
        recipes154.addShaped(item589.withTag(ExpandAnyDict.asData(hashMap589)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 6)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 6))), null)
        val recipes155 = MineTweakerAPI.recipes
        val item590 = ItemBracketHandler.getItem("ExtraTrees:gate", 134)
        val hashMap590 = HashMap<String, IData>()
        hashMap590["meta"] = ExpandInt.toData(134)
        recipes155.addShaped(item590.withTag(ExpandAnyDict.asData(hashMap590)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 6)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 6))), null)
        val recipes156 = MineTweakerAPI.recipes
        val item591 = ItemBracketHandler.getItem("ExtraTrees:gate", 134)
        val hashMap591 = HashMap<String, IData>()
        hashMap591["meta"] = ExpandInt.toData(134)
        recipes156.addShaped(item591.withTag(ExpandAnyDict.asData(hashMap591)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 6)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 6))), null)
        val recipes157 = MineTweakerAPI.recipes
        val item592 = ItemBracketHandler.getItem("ExtraTrees:gate", 135)
        val hashMap592 = HashMap<String, IData>()
        hashMap592["meta"] = ExpandInt.toData(135)
        recipes157.addShaped(item592.withTag(ExpandAnyDict.asData(hashMap592)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 7)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 7))), null)
        val recipes158 = MineTweakerAPI.recipes
        val item593 = ItemBracketHandler.getItem("ExtraTrees:gate", 135)
        val hashMap593 = HashMap<String, IData>()
        hashMap593["meta"] = ExpandInt.toData(135)
        recipes158.addShaped(item593.withTag(ExpandAnyDict.asData(hashMap593)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 7)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 7))), null)
        val recipes159 = MineTweakerAPI.recipes
        val item594 = ItemBracketHandler.getItem("ExtraTrees:gate", 135)
        val hashMap594 = HashMap<String, IData>()
        hashMap594["meta"] = ExpandInt.toData(135)
        recipes159.addShaped(item594.withTag(ExpandAnyDict.asData(hashMap594)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 7)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 7))), null)
        val recipes160 = MineTweakerAPI.recipes
        val item595 = ItemBracketHandler.getItem("ExtraTrees:gate", 136)
        val hashMap595 = HashMap<String, IData>()
        hashMap595["meta"] = ExpandInt.toData(136)
        recipes160.addShaped(item595.withTag(ExpandAnyDict.asData(hashMap595)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 8)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 8))), null)
        val recipes161 = MineTweakerAPI.recipes
        val item596 = ItemBracketHandler.getItem("ExtraTrees:gate", 136)
        val hashMap596 = HashMap<String, IData>()
        hashMap596["meta"] = ExpandInt.toData(136)
        recipes161.addShaped(item596.withTag(ExpandAnyDict.asData(hashMap596)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 8)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 8))), null)
        val recipes162 = MineTweakerAPI.recipes
        val item597 = ItemBracketHandler.getItem("ExtraTrees:gate", 136)
        val hashMap597 = HashMap<String, IData>()
        hashMap597["meta"] = ExpandInt.toData(136)
        recipes162.addShaped(item597.withTag(ExpandAnyDict.asData(hashMap597)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 8)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 8))), null)
        val recipes163 = MineTweakerAPI.recipes
        val item598 = ItemBracketHandler.getItem("ExtraTrees:gate", 137)
        val hashMap598 = HashMap<String, IData>()
        hashMap598["meta"] = ExpandInt.toData(137)
        recipes163.addShaped(item598.withTag(ExpandAnyDict.asData(hashMap598)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 9)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 9))), null)
        val recipes164 = MineTweakerAPI.recipes
        val item599 = ItemBracketHandler.getItem("ExtraTrees:gate", 137)
        val hashMap599 = HashMap<String, IData>()
        hashMap599["meta"] = ExpandInt.toData(137)
        recipes164.addShaped(item599.withTag(ExpandAnyDict.asData(hashMap599)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 9)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 9))), null)
        val recipes165 = MineTweakerAPI.recipes
        val item600 = ItemBracketHandler.getItem("ExtraTrees:gate", 137)
        val hashMap600 = HashMap<String, IData>()
        hashMap600["meta"] = ExpandInt.toData(137)
        recipes165.addShaped(item600.withTag(ExpandAnyDict.asData(hashMap600)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 9)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 9))), null)
        val recipes166 = MineTweakerAPI.recipes
        val item601 = ItemBracketHandler.getItem("ExtraTrees:gate", 138)
        val hashMap601 = HashMap<String, IData>()
        hashMap601["meta"] = ExpandInt.toData(138)
        recipes166.addShaped(item601.withTag(ExpandAnyDict.asData(hashMap601)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 10)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 10))), null)
        val recipes167 = MineTweakerAPI.recipes
        val item602 = ItemBracketHandler.getItem("ExtraTrees:gate", 138)
        val hashMap602 = HashMap<String, IData>()
        hashMap602["meta"] = ExpandInt.toData(138)
        recipes167.addShaped(item602.withTag(ExpandAnyDict.asData(hashMap602)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 10)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 10))), null)
        val recipes168 = MineTweakerAPI.recipes
        val item603 = ItemBracketHandler.getItem("ExtraTrees:gate", 138)
        val hashMap603 = HashMap<String, IData>()
        hashMap603["meta"] = ExpandInt.toData(138)
        recipes168.addShaped(item603.withTag(ExpandAnyDict.asData(hashMap603)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 10)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 10),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 10))), null)
        val recipes169 = MineTweakerAPI.recipes
        val item604 = ItemBracketHandler.getItem("ExtraTrees:gate", 139)
        val hashMap604 = HashMap<String, IData>()
        hashMap604["meta"] = ExpandInt.toData(139)
        recipes169.addShaped(item604.withTag(ExpandAnyDict.asData(hashMap604)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 11)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 11))), null)
        val recipes170 = MineTweakerAPI.recipes
        val item605 = ItemBracketHandler.getItem("ExtraTrees:gate", 139)
        val hashMap605 = HashMap<String, IData>()
        hashMap605["meta"] = ExpandInt.toData(139)
        recipes170.addShaped(item605.withTag(ExpandAnyDict.asData(hashMap605)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 11)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 11))), null)
        val recipes171 = MineTweakerAPI.recipes
        val item606 = ItemBracketHandler.getItem("ExtraTrees:gate", 139)
        val hashMap606 = HashMap<String, IData>()
        hashMap606["meta"] = ExpandInt.toData(139)
        recipes171.addShaped(item606.withTag(ExpandAnyDict.asData(hashMap606)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 11)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 11),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 11))), null)
        val recipes172 = MineTweakerAPI.recipes
        val item607 = ItemBracketHandler.getItem("ExtraTrees:gate", 140)
        val hashMap607 = HashMap<String, IData>()
        hashMap607["meta"] = ExpandInt.toData(140)
        recipes172.addShaped(item607.withTag(ExpandAnyDict.asData(hashMap607)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 12)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 12))), null)
        val recipes173 = MineTweakerAPI.recipes
        val item608 = ItemBracketHandler.getItem("ExtraTrees:gate", 140)
        val hashMap608 = HashMap<String, IData>()
        hashMap608["meta"] = ExpandInt.toData(140)
        recipes173.addShaped(item608.withTag(ExpandAnyDict.asData(hashMap608)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 12)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 12))), null)
        val recipes174 = MineTweakerAPI.recipes
        val item609 = ItemBracketHandler.getItem("ExtraTrees:gate", 140)
        val hashMap609 = HashMap<String, IData>()
        hashMap609["meta"] = ExpandInt.toData(140)
        recipes174.addShaped(item609.withTag(ExpandAnyDict.asData(hashMap609)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 12)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 12),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 12))), null)
        val recipes175 = MineTweakerAPI.recipes
        val item610 = ItemBracketHandler.getItem("ExtraTrees:gate", 141)
        val hashMap610 = HashMap<String, IData>()
        hashMap610["meta"] = ExpandInt.toData(141)
        recipes175.addShaped(item610.withTag(ExpandAnyDict.asData(hashMap610)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 13)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 13))), null)
        val recipes176 = MineTweakerAPI.recipes
        val item611 = ItemBracketHandler.getItem("ExtraTrees:gate", 141)
        val hashMap611 = HashMap<String, IData>()
        hashMap611["meta"] = ExpandInt.toData(141)
        recipes176.addShaped(item611.withTag(ExpandAnyDict.asData(hashMap611)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 13)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 13))), null)
        val recipes177 = MineTweakerAPI.recipes
        val item612 = ItemBracketHandler.getItem("ExtraTrees:gate", 141)
        val hashMap612 = HashMap<String, IData>()
        hashMap612["meta"] = ExpandInt.toData(141)
        recipes177.addShaped(item612.withTag(ExpandAnyDict.asData(hashMap612)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 13)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 13),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 13))), null)
        val recipes178 = MineTweakerAPI.recipes
        val item613 = ItemBracketHandler.getItem("ExtraTrees:gate", 142)
        val hashMap613 = HashMap<String, IData>()
        hashMap613["meta"] = ExpandInt.toData(142)
        recipes178.addShaped(item613.withTag(ExpandAnyDict.asData(hashMap613)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 14)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 14))), null)
        val recipes179 = MineTweakerAPI.recipes
        val item614 = ItemBracketHandler.getItem("ExtraTrees:gate", 142)
        val hashMap614 = HashMap<String, IData>()
        hashMap614["meta"] = ExpandInt.toData(142)
        recipes179.addShaped(item614.withTag(ExpandAnyDict.asData(hashMap614)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 14)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 14))), null)
        val recipes180 = MineTweakerAPI.recipes
        val item615 = ItemBracketHandler.getItem("ExtraTrees:gate", 142)
        val hashMap615 = HashMap<String, IData>()
        hashMap615["meta"] = ExpandInt.toData(142)
        recipes180.addShaped(item615.withTag(ExpandAnyDict.asData(hashMap615)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 14)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 14),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 14))), null)
        val recipes181 = MineTweakerAPI.recipes
        val item616 = ItemBracketHandler.getItem("ExtraTrees:gate", 143)
        val hashMap616 = HashMap<String, IData>()
        hashMap616["meta"] = ExpandInt.toData(143)
        recipes181.addShaped(item616.withTag(ExpandAnyDict.asData(hashMap616)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 15)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 15))), null)
        val recipes182 = MineTweakerAPI.recipes
        val item617 = ItemBracketHandler.getItem("ExtraTrees:gate", 143)
        val hashMap617 = HashMap<String, IData>()
        hashMap617["meta"] = ExpandInt.toData(143)
        recipes182.addShaped(item617.withTag(ExpandAnyDict.asData(hashMap617)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 15)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 15))), null)
        val recipes183 = MineTweakerAPI.recipes
        val item618 = ItemBracketHandler.getItem("ExtraTrees:gate", 143)
        val hashMap618 = HashMap<String, IData>()
        hashMap618["meta"] = ExpandInt.toData(143)
        recipes183.addShaped(item618.withTag(ExpandAnyDict.asData(hashMap618)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 15)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 15),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 15))), null)
        val recipes184 = MineTweakerAPI.recipes
        val item619 = ItemBracketHandler.getItem("ExtraTrees:gate", 144)
        val hashMap619 = HashMap<String, IData>()
        hashMap619["meta"] = ExpandInt.toData(144)
        recipes184.addShaped(item619.withTag(ExpandAnyDict.asData(hashMap619)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 16)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 16))), null)
        val recipes185 = MineTweakerAPI.recipes
        val item620 = ItemBracketHandler.getItem("ExtraTrees:gate", 144)
        val hashMap620 = HashMap<String, IData>()
        hashMap620["meta"] = ExpandInt.toData(144)
        recipes185.addShaped(item620.withTag(ExpandAnyDict.asData(hashMap620)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 16)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 16))), null)
        val recipes186 = MineTweakerAPI.recipes
        val item621 = ItemBracketHandler.getItem("ExtraTrees:gate", 144)
        val hashMap621 = HashMap<String, IData>()
        hashMap621["meta"] = ExpandInt.toData(144)
        recipes186.addShaped(item621.withTag(ExpandAnyDict.asData(hashMap621)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 16)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 16),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 16))), null)
        val recipes187 = MineTweakerAPI.recipes
        val item622 = ItemBracketHandler.getItem("ExtraTrees:gate", 145)
        val hashMap622 = HashMap<String, IData>()
        hashMap622["meta"] = ExpandInt.toData(145)
        recipes187.addShaped(item622.withTag(ExpandAnyDict.asData(hashMap622)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 17)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 17))), null)
        val recipes188 = MineTweakerAPI.recipes
        val item623 = ItemBracketHandler.getItem("ExtraTrees:gate", 145)
        val hashMap623 = HashMap<String, IData>()
        hashMap623["meta"] = ExpandInt.toData(145)
        recipes188.addShaped(item623.withTag(ExpandAnyDict.asData(hashMap623)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 17)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 17))), null)
        val recipes189 = MineTweakerAPI.recipes
        val item624 = ItemBracketHandler.getItem("ExtraTrees:gate", 145)
        val hashMap624 = HashMap<String, IData>()
        hashMap624["meta"] = ExpandInt.toData(145)
        recipes189.addShaped(item624.withTag(ExpandAnyDict.asData(hashMap624)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 17)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 17),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 17))), null)
        val recipes190 = MineTweakerAPI.recipes
        val item625 = ItemBracketHandler.getItem("ExtraTrees:gate", 146)
        val hashMap625 = HashMap<String, IData>()
        hashMap625["meta"] = ExpandInt.toData(146)
        recipes190.addShaped(item625.withTag(ExpandAnyDict.asData(hashMap625)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 18)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 18))), null)
        val recipes191 = MineTweakerAPI.recipes
        val item626 = ItemBracketHandler.getItem("ExtraTrees:gate", 146)
        val hashMap626 = HashMap<String, IData>()
        hashMap626["meta"] = ExpandInt.toData(146)
        recipes191.addShaped(item626.withTag(ExpandAnyDict.asData(hashMap626)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 18)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 18))), null)
        val recipes192 = MineTweakerAPI.recipes
        val item627 = ItemBracketHandler.getItem("ExtraTrees:gate", 146)
        val hashMap627 = HashMap<String, IData>()
        hashMap627["meta"] = ExpandInt.toData(146)
        recipes192.addShaped(item627.withTag(ExpandAnyDict.asData(hashMap627)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 18)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 18),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 18))), null)
        val recipes193 = MineTweakerAPI.recipes
        val item628 = ItemBracketHandler.getItem("ExtraTrees:gate", 147)
        val hashMap628 = HashMap<String, IData>()
        hashMap628["meta"] = ExpandInt.toData(147)
        recipes193.addShaped(item628.withTag(ExpandAnyDict.asData(hashMap628)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 19)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 19))), null)
        val recipes194 = MineTweakerAPI.recipes
        val item629 = ItemBracketHandler.getItem("ExtraTrees:gate", 147)
        val hashMap629 = HashMap<String, IData>()
        hashMap629["meta"] = ExpandInt.toData(147)
        recipes194.addShaped(item629.withTag(ExpandAnyDict.asData(hashMap629)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 19)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 19))), null)
        val recipes195 = MineTweakerAPI.recipes
        val item630 = ItemBracketHandler.getItem("ExtraTrees:gate", 147)
        val hashMap630 = HashMap<String, IData>()
        hashMap630["meta"] = ExpandInt.toData(147)
        recipes195.addShaped(item630.withTag(ExpandAnyDict.asData(hashMap630)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 19)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 19),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 19))), null)
        val recipes196 = MineTweakerAPI.recipes
        val item631 = ItemBracketHandler.getItem("ExtraTrees:gate", 148)
        val hashMap631 = HashMap<String, IData>()
        hashMap631["meta"] = ExpandInt.toData(148)
        recipes196.addShaped(item631.withTag(ExpandAnyDict.asData(hashMap631)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 20)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 20))), null)
        val recipes197 = MineTweakerAPI.recipes
        val item632 = ItemBracketHandler.getItem("ExtraTrees:gate", 148)
        val hashMap632 = HashMap<String, IData>()
        hashMap632["meta"] = ExpandInt.toData(148)
        recipes197.addShaped(item632.withTag(ExpandAnyDict.asData(hashMap632)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 20)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 20))), null)
        val recipes198 = MineTweakerAPI.recipes
        val item633 = ItemBracketHandler.getItem("ExtraTrees:gate", 148)
        val hashMap633 = HashMap<String, IData>()
        hashMap633["meta"] = ExpandInt.toData(148)
        recipes198.addShaped(item633.withTag(ExpandAnyDict.asData(hashMap633)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 20)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 20),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 20))), null)
        val recipes199 = MineTweakerAPI.recipes
        val item634 = ItemBracketHandler.getItem("ExtraTrees:gate", 149)
        val hashMap634 = HashMap<String, IData>()
        hashMap634["meta"] = ExpandInt.toData(149)
        recipes199.addShaped(item634.withTag(ExpandAnyDict.asData(hashMap634)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 21)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 21))), null)
        val recipes200 = MineTweakerAPI.recipes
        val item635 = ItemBracketHandler.getItem("ExtraTrees:gate", 149)
        val hashMap635 = HashMap<String, IData>()
        hashMap635["meta"] = ExpandInt.toData(149)
        recipes200.addShaped(item635.withTag(ExpandAnyDict.asData(hashMap635)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 21)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 21))), null)
        val recipes201 = MineTweakerAPI.recipes
        val item636 = ItemBracketHandler.getItem("ExtraTrees:gate", 149)
        val hashMap636 = HashMap<String, IData>()
        hashMap636["meta"] = ExpandInt.toData(149)
        recipes201.addShaped(item636.withTag(ExpandAnyDict.asData(hashMap636)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 21)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 21),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 21))), null)
        val recipes202 = MineTweakerAPI.recipes
        val item637 = ItemBracketHandler.getItem("ExtraTrees:gate", 150)
        val hashMap637 = HashMap<String, IData>()
        hashMap637["meta"] = ExpandInt.toData(150)
        recipes202.addShaped(item637.withTag(ExpandAnyDict.asData(hashMap637)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 22)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 22))), null)
        val recipes203 = MineTweakerAPI.recipes
        val item638 = ItemBracketHandler.getItem("ExtraTrees:gate", 150)
        val hashMap638 = HashMap<String, IData>()
        hashMap638["meta"] = ExpandInt.toData(150)
        recipes203.addShaped(item638.withTag(ExpandAnyDict.asData(hashMap638)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 22)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 22))), null)
        val recipes204 = MineTweakerAPI.recipes
        val item639 = ItemBracketHandler.getItem("ExtraTrees:gate", 150)
        val hashMap639 = HashMap<String, IData>()
        hashMap639["meta"] = ExpandInt.toData(150)
        recipes204.addShaped(item639.withTag(ExpandAnyDict.asData(hashMap639)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 22)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 22),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 22))), null)
        val recipes205 = MineTweakerAPI.recipes
        val item640 = ItemBracketHandler.getItem("ExtraTrees:gate", 151)
        val hashMap640 = HashMap<String, IData>()
        hashMap640["meta"] = ExpandInt.toData(151)
        recipes205.addShaped(item640.withTag(ExpandAnyDict.asData(hashMap640)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 23)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 23))), null)
        val recipes206 = MineTweakerAPI.recipes
        val item641 = ItemBracketHandler.getItem("ExtraTrees:gate", 151)
        val hashMap641 = HashMap<String, IData>()
        hashMap641["meta"] = ExpandInt.toData(151)
        recipes206.addShaped(item641.withTag(ExpandAnyDict.asData(hashMap641)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 23)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 23))), null)
        val recipes207 = MineTweakerAPI.recipes
        val item642 = ItemBracketHandler.getItem("ExtraTrees:gate", 151)
        val hashMap642 = HashMap<String, IData>()
        hashMap642["meta"] = ExpandInt.toData(151)
        recipes207.addShaped(item642.withTag(ExpandAnyDict.asData(hashMap642)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 23)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 23),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 23))), null)
        val recipes208 = MineTweakerAPI.recipes
        val item643 = ItemBracketHandler.getItem("ExtraTrees:gate", 152)
        val hashMap643 = HashMap<String, IData>()
        hashMap643["meta"] = ExpandInt.toData(152)
        recipes208.addShaped(item643.withTag(ExpandAnyDict.asData(hashMap643)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 24)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 24))), null)
        val recipes209 = MineTweakerAPI.recipes
        val item644 = ItemBracketHandler.getItem("ExtraTrees:gate", 152)
        val hashMap644 = HashMap<String, IData>()
        hashMap644["meta"] = ExpandInt.toData(152)
        recipes209.addShaped(item644.withTag(ExpandAnyDict.asData(hashMap644)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 24)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 24))), null)
        val recipes210 = MineTweakerAPI.recipes
        val item645 = ItemBracketHandler.getItem("ExtraTrees:gate", 152)
        val hashMap645 = HashMap<String, IData>()
        hashMap645["meta"] = ExpandInt.toData(152)
        recipes210.addShaped(item645.withTag(ExpandAnyDict.asData(hashMap645)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 24)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 24),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 24))), null)
        val recipes211 = MineTweakerAPI.recipes
        val item646 = ItemBracketHandler.getItem("ExtraTrees:gate", 153)
        val hashMap646 = HashMap<String, IData>()
        hashMap646["meta"] = ExpandInt.toData(153)
        recipes211.addShaped(item646.withTag(ExpandAnyDict.asData(hashMap646)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 25)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 25))), null)
        val recipes212 = MineTweakerAPI.recipes
        val item647 = ItemBracketHandler.getItem("ExtraTrees:gate", 153)
        val hashMap647 = HashMap<String, IData>()
        hashMap647["meta"] = ExpandInt.toData(153)
        recipes212.addShaped(item647.withTag(ExpandAnyDict.asData(hashMap647)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 25)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 25))), null)
        val recipes213 = MineTweakerAPI.recipes
        val item648 = ItemBracketHandler.getItem("ExtraTrees:gate", 153)
        val hashMap648 = HashMap<String, IData>()
        hashMap648["meta"] = ExpandInt.toData(153)
        recipes213.addShaped(item648.withTag(ExpandAnyDict.asData(hashMap648)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 25)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 25),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 25))), null)
        val recipes214 = MineTweakerAPI.recipes
        val item649 = ItemBracketHandler.getItem("ExtraTrees:gate", 154)
        val hashMap649 = HashMap<String, IData>()
        hashMap649["meta"] = ExpandInt.toData(154)
        recipes214.addShaped(item649.withTag(ExpandAnyDict.asData(hashMap649)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 26)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 26))), null)
        val recipes215 = MineTweakerAPI.recipes
        val item650 = ItemBracketHandler.getItem("ExtraTrees:gate", 154)
        val hashMap650 = HashMap<String, IData>()
        hashMap650["meta"] = ExpandInt.toData(154)
        recipes215.addShaped(item650.withTag(ExpandAnyDict.asData(hashMap650)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 26)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 26))), null)
        val recipes216 = MineTweakerAPI.recipes
        val item651 = ItemBracketHandler.getItem("ExtraTrees:gate", 154)
        val hashMap651 = HashMap<String, IData>()
        hashMap651["meta"] = ExpandInt.toData(154)
        recipes216.addShaped(item651.withTag(ExpandAnyDict.asData(hashMap651)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 26)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 26),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 26))), null)
        val recipes217 = MineTweakerAPI.recipes
        val item652 = ItemBracketHandler.getItem("ExtraTrees:gate", 155)
        val hashMap652 = HashMap<String, IData>()
        hashMap652["meta"] = ExpandInt.toData(155)
        recipes217.addShaped(item652.withTag(ExpandAnyDict.asData(hashMap652)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 27)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 27))), null)
        val recipes218 = MineTweakerAPI.recipes
        val item653 = ItemBracketHandler.getItem("ExtraTrees:gate", 155)
        val hashMap653 = HashMap<String, IData>()
        hashMap653["meta"] = ExpandInt.toData(155)
        recipes218.addShaped(item653.withTag(ExpandAnyDict.asData(hashMap653)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 27)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 27))), null)
        val recipes219 = MineTweakerAPI.recipes
        val item654 = ItemBracketHandler.getItem("ExtraTrees:gate", 155)
        val hashMap654 = HashMap<String, IData>()
        hashMap654["meta"] = ExpandInt.toData(155)
        recipes219.addShaped(item654.withTag(ExpandAnyDict.asData(hashMap654)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 27)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 27),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 27))), null)
        val recipes220 = MineTweakerAPI.recipes
        val item655 = ItemBracketHandler.getItem("ExtraTrees:gate", 156)
        val hashMap655 = HashMap<String, IData>()
        hashMap655["meta"] = ExpandInt.toData(156)
        recipes220.addShaped(item655.withTag(ExpandAnyDict.asData(hashMap655)),
                arrayOf(arrayOf<IIngredient?>(ore2, null,
                        ore2), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 28)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 28))), null)
        val recipes221 = MineTweakerAPI.recipes
        val item656 = ItemBracketHandler.getItem("ExtraTrees:gate", 156)
        val hashMap656 = HashMap<String, IData>()
        hashMap656["meta"] = ExpandInt.toData(156)
        recipes221.addShaped(item656.withTag(ExpandAnyDict.asData(hashMap656)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore3,
                        ore, ore3), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 28)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 28))), null)
        val recipes222 = MineTweakerAPI.recipes
        val item657 = ItemBracketHandler.getItem("ExtraTrees:gate", 156)
        val hashMap657 = HashMap<String, IData>()
        hashMap657["meta"] = ExpandInt.toData(156)
        recipes222.addShaped(item657.withTag(ExpandAnyDict.asData(hashMap657)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore4,
                        ore, ore4), arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                        OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 28)),
                        arrayOf(ItemBracketHandler.getItem("Forestry:planks", 28),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 28))), null)
        val recipes223 = MineTweakerAPI.recipes
        val item658 = ItemBracketHandler.getItem("ExtraTrees:fence", 32)
        val hashMap658 = HashMap<String, IData>()
        hashMap658["meta"] = ExpandInt.toData(32)
        val withTag51 = item658.withTag(ExpandAnyDict.asData(hashMap658))
        val array346: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n661 = 0
        val array347 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n662 = 1
        val item659 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap659 = HashMap<String, IData>()
        hashMap659["meta"] = ExpandInt.toData(0)
        array347[n662] = item659.withTag(ExpandAnyDict.asData(hashMap659))
        array347[2] = OreBracketHandler.getOre("stickWood")
        array346[n661] = array347
        val n663 = 1
        val array348 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n664 = 1
        val item660 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap660 = HashMap<String, IData>()
        hashMap660["meta"] = ExpandInt.toData(0)
        array348[n664] = item660.withTag(ExpandAnyDict.asData(hashMap660))
        array348[2] = OreBracketHandler.getOre("stickWood")
        array346[n663] = array348
        val n665 = 2
        val array349 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n666 = 1
        val item661 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap661 = HashMap<String, IData>()
        hashMap661["meta"] = ExpandInt.toData(0)
        array349[n666] = item661.withTag(ExpandAnyDict.asData(hashMap661))
        array349[2] = OreBracketHandler.getOre("stickWood")
        array346[n665] = array349
        recipes223.addShaped(withTag51, array346, null)
        val recipes224 = MineTweakerAPI.recipes
        val item662 = ItemBracketHandler.getItem("ExtraTrees:fence", 32)
        val hashMap662 = HashMap<String, IData>()
        hashMap662["meta"] = ExpandInt.toData(32)
        val amount71 = item662.withTag(ExpandAnyDict.asData(hashMap662)).amount(2)
        val array350 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n667 = 1
        val array351 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n668 = 1
        val item663 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap663 = HashMap<String, IData>()
        hashMap663["meta"] = ExpandInt.toData(0)
        array351[n668] = item663.withTag(ExpandAnyDict.asData(hashMap663))
        array351[2] = OreBracketHandler.getOre("stickWood")
        array350[n667] = array351
        val n669 = 2
        val array352 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n670 = 1
        val item664 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap664 = HashMap<String, IData>()
        hashMap664["meta"] = ExpandInt.toData(0)
        array352[n670] = item664.withTag(ExpandAnyDict.asData(hashMap664))
        array352[2] = OreBracketHandler.getOre("stickWood")
        array350[n669] = array352
        recipes224.addShaped(amount71, array350, null)
        val recipes225 = MineTweakerAPI.recipes
        val item665 = ItemBracketHandler.getItem("ExtraTrees:fence", 32)
        val hashMap665 = HashMap<String, IData>()
        hashMap665["meta"] = ExpandInt.toData(32)
        val amount72 = item665.withTag(ExpandAnyDict.asData(hashMap665)).amount(4)
        val array353 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n671 = 1
        val array354 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n672 = 1
        val item666 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap666 = HashMap<String, IData>()
        hashMap666["meta"] = ExpandInt.toData(0)
        array354[n672] = item666.withTag(ExpandAnyDict.asData(hashMap666))
        array354[2] = OreBracketHandler.getOre("stickWood")
        array353[n671] = array354
        val n673 = 2
        val array355 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n674 = 1
        val item667 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap667 = HashMap<String, IData>()
        hashMap667["meta"] = ExpandInt.toData(0)
        array355[n674] = item667.withTag(ExpandAnyDict.asData(hashMap667))
        array355[2] = OreBracketHandler.getOre("stickWood")
        array353[n673] = array355
        recipes225.addShaped(amount72, array353, null)
        val recipes226 = MineTweakerAPI.recipes
        val item668 = ItemBracketHandler.getItem("ExtraTrees:fence", 33)
        val hashMap668 = HashMap<String, IData>()
        hashMap668["meta"] = ExpandInt.toData(33)
        val withTag52 = item668.withTag(ExpandAnyDict.asData(hashMap668))
        val array356: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n675 = 0
        val array357 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n676 = 1
        val item669 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap669 = HashMap<String, IData>()
        hashMap669["meta"] = ExpandInt.toData(1)
        array357[n676] = item669.withTag(ExpandAnyDict.asData(hashMap669))
        array357[2] = OreBracketHandler.getOre("stickWood")
        array356[n675] = array357
        val n677 = 1
        val array358 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n678 = 1
        val item670 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap670 = HashMap<String, IData>()
        hashMap670["meta"] = ExpandInt.toData(1)
        array358[n678] = item670.withTag(ExpandAnyDict.asData(hashMap670))
        array358[2] = OreBracketHandler.getOre("stickWood")
        array356[n677] = array358
        val n679 = 2
        val array359 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n680 = 1
        val item671 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap671 = HashMap<String, IData>()
        hashMap671["meta"] = ExpandInt.toData(1)
        array359[n680] = item671.withTag(ExpandAnyDict.asData(hashMap671))
        array359[2] = OreBracketHandler.getOre("stickWood")
        array356[n679] = array359
        recipes226.addShaped(withTag52, array356, null)
        val recipes227 = MineTweakerAPI.recipes
        val item672 = ItemBracketHandler.getItem("ExtraTrees:fence", 33)
        val hashMap672 = HashMap<String, IData>()
        hashMap672["meta"] = ExpandInt.toData(33)
        val amount73 = item672.withTag(ExpandAnyDict.asData(hashMap672)).amount(2)
        val array360 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n681 = 1
        val array361 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n682 = 1
        val item673 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap673 = HashMap<String, IData>()
        hashMap673["meta"] = ExpandInt.toData(1)
        array361[n682] = item673.withTag(ExpandAnyDict.asData(hashMap673))
        array361[2] = OreBracketHandler.getOre("stickWood")
        array360[n681] = array361
        val n683 = 2
        val array362 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n684 = 1
        val item674 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap674 = HashMap<String, IData>()
        hashMap674["meta"] = ExpandInt.toData(1)
        array362[n684] = item674.withTag(ExpandAnyDict.asData(hashMap674))
        array362[2] = OreBracketHandler.getOre("stickWood")
        array360[n683] = array362
        recipes227.addShaped(amount73, array360, null)
        val recipes228 = MineTweakerAPI.recipes
        val item675 = ItemBracketHandler.getItem("ExtraTrees:fence", 33)
        val hashMap675 = HashMap<String, IData>()
        hashMap675["meta"] = ExpandInt.toData(33)
        val amount74 = item675.withTag(ExpandAnyDict.asData(hashMap675)).amount(4)
        val array363 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n685 = 1
        val array364 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n686 = 1
        val item676 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap676 = HashMap<String, IData>()
        hashMap676["meta"] = ExpandInt.toData(1)
        array364[n686] = item676.withTag(ExpandAnyDict.asData(hashMap676))
        array364[2] = OreBracketHandler.getOre("stickWood")
        array363[n685] = array364
        val n687 = 2
        val array365 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n688 = 1
        val item677 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap677 = HashMap<String, IData>()
        hashMap677["meta"] = ExpandInt.toData(1)
        array365[n688] = item677.withTag(ExpandAnyDict.asData(hashMap677))
        array365[2] = OreBracketHandler.getOre("stickWood")
        array363[n687] = array365
        recipes228.addShaped(amount74, array363, null)
        val recipes229 = MineTweakerAPI.recipes
        val item678 = ItemBracketHandler.getItem("ExtraTrees:fence", 34)
        val hashMap678 = HashMap<String, IData>()
        hashMap678["meta"] = ExpandInt.toData(34)
        val withTag53 = item678.withTag(ExpandAnyDict.asData(hashMap678))
        val array366: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n689 = 0
        val array367 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n690 = 1
        val item679 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap679 = HashMap<String, IData>()
        hashMap679["meta"] = ExpandInt.toData(2)
        array367[n690] = item679.withTag(ExpandAnyDict.asData(hashMap679))
        array367[2] = OreBracketHandler.getOre("stickWood")
        array366[n689] = array367
        val n691 = 1
        val array368 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n692 = 1
        val item680 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap680 = HashMap<String, IData>()
        hashMap680["meta"] = ExpandInt.toData(2)
        array368[n692] = item680.withTag(ExpandAnyDict.asData(hashMap680))
        array368[2] = OreBracketHandler.getOre("stickWood")
        array366[n691] = array368
        val n693 = 2
        val array369 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n694 = 1
        val item681 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap681 = HashMap<String, IData>()
        hashMap681["meta"] = ExpandInt.toData(2)
        array369[n694] = item681.withTag(ExpandAnyDict.asData(hashMap681))
        array369[2] = OreBracketHandler.getOre("stickWood")
        array366[n693] = array369
        recipes229.addShaped(withTag53, array366, null)
        val recipes230 = MineTweakerAPI.recipes
        val item682 = ItemBracketHandler.getItem("ExtraTrees:fence", 34)
        val hashMap682 = HashMap<String, IData>()
        hashMap682["meta"] = ExpandInt.toData(34)
        val amount75 = item682.withTag(ExpandAnyDict.asData(hashMap682)).amount(2)
        val array370 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n695 = 1
        val array371 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n696 = 1
        val item683 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap683 = HashMap<String, IData>()
        hashMap683["meta"] = ExpandInt.toData(2)
        array371[n696] = item683.withTag(ExpandAnyDict.asData(hashMap683))
        array371[2] = OreBracketHandler.getOre("stickWood")
        array370[n695] = array371
        val n697 = 2
        val array372 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n698 = 1
        val item684 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap684 = HashMap<String, IData>()
        hashMap684["meta"] = ExpandInt.toData(2)
        array372[n698] = item684.withTag(ExpandAnyDict.asData(hashMap684))
        array372[2] = OreBracketHandler.getOre("stickWood")
        array370[n697] = array372
        recipes230.addShaped(amount75, array370, null)
        val recipes231 = MineTweakerAPI.recipes
        val item685 = ItemBracketHandler.getItem("ExtraTrees:fence", 34)
        val hashMap685 = HashMap<String, IData>()
        hashMap685["meta"] = ExpandInt.toData(34)
        val amount76 = item685.withTag(ExpandAnyDict.asData(hashMap685)).amount(4)
        val array373 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n699 = 1
        val array374 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n700 = 1
        val item686 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap686 = HashMap<String, IData>()
        hashMap686["meta"] = ExpandInt.toData(2)
        array374[n700] = item686.withTag(ExpandAnyDict.asData(hashMap686))
        array374[2] = OreBracketHandler.getOre("stickWood")
        array373[n699] = array374
        val n701 = 2
        val array375 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n702 = 1
        val item687 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap687 = HashMap<String, IData>()
        hashMap687["meta"] = ExpandInt.toData(2)
        array375[n702] = item687.withTag(ExpandAnyDict.asData(hashMap687))
        array375[2] = OreBracketHandler.getOre("stickWood")
        array373[n701] = array375
        recipes231.addShaped(amount76, array373, null)
        val recipes232 = MineTweakerAPI.recipes
        val item688 = ItemBracketHandler.getItem("ExtraTrees:fence", 35)
        val hashMap688 = HashMap<String, IData>()
        hashMap688["meta"] = ExpandInt.toData(35)
        val withTag54 = item688.withTag(ExpandAnyDict.asData(hashMap688))
        val array376: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n703 = 0
        val array377 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n704 = 1
        val item689 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap689 = HashMap<String, IData>()
        hashMap689["meta"] = ExpandInt.toData(3)
        array377[n704] = item689.withTag(ExpandAnyDict.asData(hashMap689))
        array377[2] = OreBracketHandler.getOre("stickWood")
        array376[n703] = array377
        val n705 = 1
        val array378 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n706 = 1
        val item690 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap690 = HashMap<String, IData>()
        hashMap690["meta"] = ExpandInt.toData(3)
        array378[n706] = item690.withTag(ExpandAnyDict.asData(hashMap690))
        array378[2] = OreBracketHandler.getOre("stickWood")
        array376[n705] = array378
        val n707 = 2
        val array379 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n708 = 1
        val item691 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap691 = HashMap<String, IData>()
        hashMap691["meta"] = ExpandInt.toData(3)
        array379[n708] = item691.withTag(ExpandAnyDict.asData(hashMap691))
        array379[2] = OreBracketHandler.getOre("stickWood")
        array376[n707] = array379
        recipes232.addShaped(withTag54, array376, null)
        val recipes233 = MineTweakerAPI.recipes
        val item692 = ItemBracketHandler.getItem("ExtraTrees:fence", 35)
        val hashMap692 = HashMap<String, IData>()
        hashMap692["meta"] = ExpandInt.toData(35)
        val amount77 = item692.withTag(ExpandAnyDict.asData(hashMap692)).amount(2)
        val array380 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n709 = 1
        val array381 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n710 = 1
        val item693 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap693 = HashMap<String, IData>()
        hashMap693["meta"] = ExpandInt.toData(3)
        array381[n710] = item693.withTag(ExpandAnyDict.asData(hashMap693))
        array381[2] = OreBracketHandler.getOre("stickWood")
        array380[n709] = array381
        val n711 = 2
        val array382 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n712 = 1
        val item694 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap694 = HashMap<String, IData>()
        hashMap694["meta"] = ExpandInt.toData(3)
        array382[n712] = item694.withTag(ExpandAnyDict.asData(hashMap694))
        array382[2] = OreBracketHandler.getOre("stickWood")
        array380[n711] = array382
        recipes233.addShaped(amount77, array380, null)
        val recipes234 = MineTweakerAPI.recipes
        val item695 = ItemBracketHandler.getItem("ExtraTrees:fence", 35)
        val hashMap695 = HashMap<String, IData>()
        hashMap695["meta"] = ExpandInt.toData(35)
        val amount78 = item695.withTag(ExpandAnyDict.asData(hashMap695)).amount(4)
        val array383 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n713 = 1
        val array384 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n714 = 1
        val item696 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap696 = HashMap<String, IData>()
        hashMap696["meta"] = ExpandInt.toData(3)
        array384[n714] = item696.withTag(ExpandAnyDict.asData(hashMap696))
        array384[2] = OreBracketHandler.getOre("stickWood")
        array383[n713] = array384
        val n715 = 2
        val array385 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n716 = 1
        val item697 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap697 = HashMap<String, IData>()
        hashMap697["meta"] = ExpandInt.toData(3)
        array385[n716] = item697.withTag(ExpandAnyDict.asData(hashMap697))
        array385[2] = OreBracketHandler.getOre("stickWood")
        array383[n715] = array385
        recipes234.addShaped(amount78, array383, null)
        val recipes235 = MineTweakerAPI.recipes
        val item698 = ItemBracketHandler.getItem("ExtraTrees:fence", 36)
        val hashMap698 = HashMap<String, IData>()
        hashMap698["meta"] = ExpandInt.toData(36)
        val withTag55 = item698.withTag(ExpandAnyDict.asData(hashMap698))
        val array386: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n717 = 0
        val array387 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n718 = 1
        val item699 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap699 = HashMap<String, IData>()
        hashMap699["meta"] = ExpandInt.toData(4)
        array387[n718] = item699.withTag(ExpandAnyDict.asData(hashMap699))
        array387[2] = OreBracketHandler.getOre("stickWood")
        array386[n717] = array387
        val n719 = 1
        val array388 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n720 = 1
        val item700 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap700 = HashMap<String, IData>()
        hashMap700["meta"] = ExpandInt.toData(4)
        array388[n720] = item700.withTag(ExpandAnyDict.asData(hashMap700))
        array388[2] = OreBracketHandler.getOre("stickWood")
        array386[n719] = array388
        val n721 = 2
        val array389 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n722 = 1
        val item701 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap701 = HashMap<String, IData>()
        hashMap701["meta"] = ExpandInt.toData(4)
        array389[n722] = item701.withTag(ExpandAnyDict.asData(hashMap701))
        array389[2] = OreBracketHandler.getOre("stickWood")
        array386[n721] = array389
        recipes235.addShaped(withTag55, array386, null)
        val recipes236 = MineTweakerAPI.recipes
        val item702 = ItemBracketHandler.getItem("ExtraTrees:fence", 36)
        val hashMap702 = HashMap<String, IData>()
        hashMap702["meta"] = ExpandInt.toData(36)
        val amount79 = item702.withTag(ExpandAnyDict.asData(hashMap702)).amount(2)
        val array390 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n723 = 1
        val array391 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n724 = 1
        val item703 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap703 = HashMap<String, IData>()
        hashMap703["meta"] = ExpandInt.toData(4)
        array391[n724] = item703.withTag(ExpandAnyDict.asData(hashMap703))
        array391[2] = OreBracketHandler.getOre("stickWood")
        array390[n723] = array391
        val n725 = 2
        val array392 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n726 = 1
        val item704 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap704 = HashMap<String, IData>()
        hashMap704["meta"] = ExpandInt.toData(4)
        array392[n726] = item704.withTag(ExpandAnyDict.asData(hashMap704))
        array392[2] = OreBracketHandler.getOre("stickWood")
        array390[n725] = array392
        recipes236.addShaped(amount79, array390, null)
        val recipes237 = MineTweakerAPI.recipes
        val item705 = ItemBracketHandler.getItem("ExtraTrees:fence", 36)
        val hashMap705 = HashMap<String, IData>()
        hashMap705["meta"] = ExpandInt.toData(36)
        val amount80 = item705.withTag(ExpandAnyDict.asData(hashMap705)).amount(4)
        val array393 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n727 = 1
        val array394 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n728 = 1
        val item706 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap706 = HashMap<String, IData>()
        hashMap706["meta"] = ExpandInt.toData(4)
        array394[n728] = item706.withTag(ExpandAnyDict.asData(hashMap706))
        array394[2] = OreBracketHandler.getOre("stickWood")
        array393[n727] = array394
        val n729 = 2
        val array395 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n730 = 1
        val item707 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap707 = HashMap<String, IData>()
        hashMap707["meta"] = ExpandInt.toData(4)
        array395[n730] = item707.withTag(ExpandAnyDict.asData(hashMap707))
        array395[2] = OreBracketHandler.getOre("stickWood")
        array393[n729] = array395
        recipes237.addShaped(amount80, array393, null)
        val recipes238 = MineTweakerAPI.recipes
        val item708 = ItemBracketHandler.getItem("ExtraTrees:fence", 37)
        val hashMap708 = HashMap<String, IData>()
        hashMap708["meta"] = ExpandInt.toData(37)
        val withTag56 = item708.withTag(ExpandAnyDict.asData(hashMap708))
        val array396: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n731 = 0
        val array397 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n732 = 1
        val item709 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap709 = HashMap<String, IData>()
        hashMap709["meta"] = ExpandInt.toData(5)
        array397[n732] = item709.withTag(ExpandAnyDict.asData(hashMap709))
        array397[2] = OreBracketHandler.getOre("stickWood")
        array396[n731] = array397
        val n733 = 1
        val array398 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n734 = 1
        val item710 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap710 = HashMap<String, IData>()
        hashMap710["meta"] = ExpandInt.toData(5)
        array398[n734] = item710.withTag(ExpandAnyDict.asData(hashMap710))
        array398[2] = OreBracketHandler.getOre("stickWood")
        array396[n733] = array398
        val n735 = 2
        val array399 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n736 = 1
        val item711 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap711 = HashMap<String, IData>()
        hashMap711["meta"] = ExpandInt.toData(5)
        array399[n736] = item711.withTag(ExpandAnyDict.asData(hashMap711))
        array399[2] = OreBracketHandler.getOre("stickWood")
        array396[n735] = array399
        recipes238.addShaped(withTag56, array396, null)
        val recipes239 = MineTweakerAPI.recipes
        val item712 = ItemBracketHandler.getItem("ExtraTrees:fence", 37)
        val hashMap712 = HashMap<String, IData>()
        hashMap712["meta"] = ExpandInt.toData(37)
        val amount81 = item712.withTag(ExpandAnyDict.asData(hashMap712)).amount(2)
        val array400 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n737 = 1
        val array401 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n738 = 1
        val item713 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap713 = HashMap<String, IData>()
        hashMap713["meta"] = ExpandInt.toData(5)
        array401[n738] = item713.withTag(ExpandAnyDict.asData(hashMap713))
        array401[2] = OreBracketHandler.getOre("stickWood")
        array400[n737] = array401
        val n739 = 2
        val array402 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n740 = 1
        val item714 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap714 = HashMap<String, IData>()
        hashMap714["meta"] = ExpandInt.toData(5)
        array402[n740] = item714.withTag(ExpandAnyDict.asData(hashMap714))
        array402[2] = OreBracketHandler.getOre("stickWood")
        array400[n739] = array402
        recipes239.addShaped(amount81, array400, null)
        val recipes240 = MineTweakerAPI.recipes
        val item715 = ItemBracketHandler.getItem("ExtraTrees:fence", 37)
        val hashMap715 = HashMap<String, IData>()
        hashMap715["meta"] = ExpandInt.toData(37)
        val amount82 = item715.withTag(ExpandAnyDict.asData(hashMap715)).amount(4)
        val array403 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n741 = 1
        val array404 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n742 = 1
        val item716 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap716 = HashMap<String, IData>()
        hashMap716["meta"] = ExpandInt.toData(5)
        array404[n742] = item716.withTag(ExpandAnyDict.asData(hashMap716))
        array404[2] = OreBracketHandler.getOre("stickWood")
        array403[n741] = array404
        val n743 = 2
        val array405 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n744 = 1
        val item717 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap717 = HashMap<String, IData>()
        hashMap717["meta"] = ExpandInt.toData(5)
        array405[n744] = item717.withTag(ExpandAnyDict.asData(hashMap717))
        array405[2] = OreBracketHandler.getOre("stickWood")
        array403[n743] = array405
        recipes240.addShaped(amount82, array403, null)
        val recipes241 = MineTweakerAPI.recipes
        val item718 = ItemBracketHandler.getItem("ExtraTrees:fence", 38)
        val hashMap718 = HashMap<String, IData>()
        hashMap718["meta"] = ExpandInt.toData(38)
        val withTag57 = item718.withTag(ExpandAnyDict.asData(hashMap718))
        val array406: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n745 = 0
        val array407 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n746 = 1
        val item719 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap719 = HashMap<String, IData>()
        hashMap719["meta"] = ExpandInt.toData(6)
        array407[n746] = item719.withTag(ExpandAnyDict.asData(hashMap719))
        array407[2] = OreBracketHandler.getOre("stickWood")
        array406[n745] = array407
        val n747 = 1
        val array408 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n748 = 1
        val item720 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap720 = HashMap<String, IData>()
        hashMap720["meta"] = ExpandInt.toData(6)
        array408[n748] = item720.withTag(ExpandAnyDict.asData(hashMap720))
        array408[2] = OreBracketHandler.getOre("stickWood")
        array406[n747] = array408
        val n749 = 2
        val array409 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n750 = 1
        val item721 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap721 = HashMap<String, IData>()
        hashMap721["meta"] = ExpandInt.toData(6)
        array409[n750] = item721.withTag(ExpandAnyDict.asData(hashMap721))
        array409[2] = OreBracketHandler.getOre("stickWood")
        array406[n749] = array409
        recipes241.addShaped(withTag57, array406, null)
        val recipes242 = MineTweakerAPI.recipes
        val item722 = ItemBracketHandler.getItem("ExtraTrees:fence", 38)
        val hashMap722 = HashMap<String, IData>()
        hashMap722["meta"] = ExpandInt.toData(38)
        val amount83 = item722.withTag(ExpandAnyDict.asData(hashMap722)).amount(2)
        val array410 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n751 = 1
        val array411 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n752 = 1
        val item723 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap723 = HashMap<String, IData>()
        hashMap723["meta"] = ExpandInt.toData(6)
        array411[n752] = item723.withTag(ExpandAnyDict.asData(hashMap723))
        array411[2] = OreBracketHandler.getOre("stickWood")
        array410[n751] = array411
        val n753 = 2
        val array412 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n754 = 1
        val item724 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap724 = HashMap<String, IData>()
        hashMap724["meta"] = ExpandInt.toData(6)
        array412[n754] = item724.withTag(ExpandAnyDict.asData(hashMap724))
        array412[2] = OreBracketHandler.getOre("stickWood")
        array410[n753] = array412
        recipes242.addShaped(amount83, array410, null)
        val recipes243 = MineTweakerAPI.recipes
        val item725 = ItemBracketHandler.getItem("ExtraTrees:fence", 38)
        val hashMap725 = HashMap<String, IData>()
        hashMap725["meta"] = ExpandInt.toData(38)
        val amount84 = item725.withTag(ExpandAnyDict.asData(hashMap725)).amount(4)
        val array413 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n755 = 1
        val array414 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n756 = 1
        val item726 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap726 = HashMap<String, IData>()
        hashMap726["meta"] = ExpandInt.toData(6)
        array414[n756] = item726.withTag(ExpandAnyDict.asData(hashMap726))
        array414[2] = OreBracketHandler.getOre("stickWood")
        array413[n755] = array414
        val n757 = 2
        val array415 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n758 = 1
        val item727 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap727 = HashMap<String, IData>()
        hashMap727["meta"] = ExpandInt.toData(6)
        array415[n758] = item727.withTag(ExpandAnyDict.asData(hashMap727))
        array415[2] = OreBracketHandler.getOre("stickWood")
        array413[n757] = array415
        recipes243.addShaped(amount84, array413, null)
        val recipes244 = MineTweakerAPI.recipes
        val item728 = ItemBracketHandler.getItem("ExtraTrees:fence", 39)
        val hashMap728 = HashMap<String, IData>()
        hashMap728["meta"] = ExpandInt.toData(39)
        val withTag58 = item728.withTag(ExpandAnyDict.asData(hashMap728))
        val array416: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n759 = 0
        val array417 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n760 = 1
        val item729 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap729 = HashMap<String, IData>()
        hashMap729["meta"] = ExpandInt.toData(7)
        array417[n760] = item729.withTag(ExpandAnyDict.asData(hashMap729))
        array417[2] = OreBracketHandler.getOre("stickWood")
        array416[n759] = array417
        val n761 = 1
        val array418 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n762 = 1
        val item730 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap730 = HashMap<String, IData>()
        hashMap730["meta"] = ExpandInt.toData(7)
        array418[n762] = item730.withTag(ExpandAnyDict.asData(hashMap730))
        array418[2] = OreBracketHandler.getOre("stickWood")
        array416[n761] = array418
        val n763 = 2
        val array419 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n764 = 1
        val item731 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap731 = HashMap<String, IData>()
        hashMap731["meta"] = ExpandInt.toData(7)
        array419[n764] = item731.withTag(ExpandAnyDict.asData(hashMap731))
        array419[2] = OreBracketHandler.getOre("stickWood")
        array416[n763] = array419
        recipes244.addShaped(withTag58, array416, null)
        val recipes245 = MineTweakerAPI.recipes
        val item732 = ItemBracketHandler.getItem("ExtraTrees:fence", 39)
        val hashMap732 = HashMap<String, IData>()
        hashMap732["meta"] = ExpandInt.toData(39)
        val amount85 = item732.withTag(ExpandAnyDict.asData(hashMap732)).amount(2)
        val array420 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n765 = 1
        val array421 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n766 = 1
        val item733 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap733 = HashMap<String, IData>()
        hashMap733["meta"] = ExpandInt.toData(7)
        array421[n766] = item733.withTag(ExpandAnyDict.asData(hashMap733))
        array421[2] = OreBracketHandler.getOre("stickWood")
        array420[n765] = array421
        val n767 = 2
        val array422 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n768 = 1
        val item734 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap734 = HashMap<String, IData>()
        hashMap734["meta"] = ExpandInt.toData(7)
        array422[n768] = item734.withTag(ExpandAnyDict.asData(hashMap734))
        array422[2] = OreBracketHandler.getOre("stickWood")
        array420[n767] = array422
        recipes245.addShaped(amount85, array420, null)
        val recipes246 = MineTweakerAPI.recipes
        val item735 = ItemBracketHandler.getItem("ExtraTrees:fence", 39)
        val hashMap735 = HashMap<String, IData>()
        hashMap735["meta"] = ExpandInt.toData(39)
        val amount86 = item735.withTag(ExpandAnyDict.asData(hashMap735)).amount(4)
        val array423 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n769 = 1
        val array424 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n770 = 1
        val item736 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap736 = HashMap<String, IData>()
        hashMap736["meta"] = ExpandInt.toData(7)
        array424[n770] = item736.withTag(ExpandAnyDict.asData(hashMap736))
        array424[2] = OreBracketHandler.getOre("stickWood")
        array423[n769] = array424
        val n771 = 2
        val array425 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n772 = 1
        val item737 = ItemBracketHandler.getItem("ExtraTrees:planks", 7)
        val hashMap737 = HashMap<String, IData>()
        hashMap737["meta"] = ExpandInt.toData(7)
        array425[n772] = item737.withTag(ExpandAnyDict.asData(hashMap737))
        array425[2] = OreBracketHandler.getOre("stickWood")
        array423[n771] = array425
        recipes246.addShaped(amount86, array423, null)
        val recipes247 = MineTweakerAPI.recipes
        val item738 = ItemBracketHandler.getItem("ExtraTrees:fence", 40)
        val hashMap738 = HashMap<String, IData>()
        hashMap738["meta"] = ExpandInt.toData(40)
        val withTag59 = item738.withTag(ExpandAnyDict.asData(hashMap738))
        val array426: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n773 = 0
        val array427 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n774 = 1
        val item739 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap739 = HashMap<String, IData>()
        hashMap739["meta"] = ExpandInt.toData(8)
        array427[n774] = item739.withTag(ExpandAnyDict.asData(hashMap739))
        array427[2] = OreBracketHandler.getOre("stickWood")
        array426[n773] = array427
        val n775 = 1
        val array428 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n776 = 1
        val item740 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap740 = HashMap<String, IData>()
        hashMap740["meta"] = ExpandInt.toData(8)
        array428[n776] = item740.withTag(ExpandAnyDict.asData(hashMap740))
        array428[2] = OreBracketHandler.getOre("stickWood")
        array426[n775] = array428
        val n777 = 2
        val array429 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n778 = 1
        val item741 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap741 = HashMap<String, IData>()
        hashMap741["meta"] = ExpandInt.toData(8)
        array429[n778] = item741.withTag(ExpandAnyDict.asData(hashMap741))
        array429[2] = OreBracketHandler.getOre("stickWood")
        array426[n777] = array429
        recipes247.addShaped(withTag59, array426, null)
        val recipes248 = MineTweakerAPI.recipes
        val item742 = ItemBracketHandler.getItem("ExtraTrees:fence", 40)
        val hashMap742 = HashMap<String, IData>()
        hashMap742["meta"] = ExpandInt.toData(40)
        val amount87 = item742.withTag(ExpandAnyDict.asData(hashMap742)).amount(2)
        val array430 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n779 = 1
        val array431 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n780 = 1
        val item743 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap743 = HashMap<String, IData>()
        hashMap743["meta"] = ExpandInt.toData(8)
        array431[n780] = item743.withTag(ExpandAnyDict.asData(hashMap743))
        array431[2] = OreBracketHandler.getOre("stickWood")
        array430[n779] = array431
        val n781 = 2
        val array432 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n782 = 1
        val item744 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap744 = HashMap<String, IData>()
        hashMap744["meta"] = ExpandInt.toData(8)
        array432[n782] = item744.withTag(ExpandAnyDict.asData(hashMap744))
        array432[2] = OreBracketHandler.getOre("stickWood")
        array430[n781] = array432
        recipes248.addShaped(amount87, array430, null)
    }

    private fun run3() {
        val recipes249 = MineTweakerAPI.recipes
        val item745 = ItemBracketHandler.getItem("ExtraTrees:fence", 40)
        val hashMap745 = HashMap<String, IData>()
        hashMap745["meta"] = ExpandInt.toData(40)
        val amount88 = item745.withTag(ExpandAnyDict.asData(hashMap745)).amount(4)
        val array433 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n783 = 1
        val array434 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n784 = 1
        val item746 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap746 = HashMap<String, IData>()
        hashMap746["meta"] = ExpandInt.toData(8)
        array434[n784] = item746.withTag(ExpandAnyDict.asData(hashMap746))
        array434[2] = OreBracketHandler.getOre("stickWood")
        array433[n783] = array434
        val n785 = 2
        val array435 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n786 = 1
        val item747 = ItemBracketHandler.getItem("ExtraTrees:planks", 8)
        val hashMap747 = HashMap<String, IData>()
        hashMap747["meta"] = ExpandInt.toData(8)
        array435[n786] = item747.withTag(ExpandAnyDict.asData(hashMap747))
        array435[2] = OreBracketHandler.getOre("stickWood")
        array433[n785] = array435
        recipes249.addShaped(amount88, array433, null)
        val recipes250 = MineTweakerAPI.recipes
        val item748 = ItemBracketHandler.getItem("ExtraTrees:fence", 41)
        val hashMap748 = HashMap<String, IData>()
        hashMap748["meta"] = ExpandInt.toData(41)
        val withTag60 = item748.withTag(ExpandAnyDict.asData(hashMap748))
        val array436: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n787 = 0
        val array437 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n788 = 1
        val item749 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap749 = HashMap<String, IData>()
        hashMap749["meta"] = ExpandInt.toData(9)
        array437[n788] = item749.withTag(ExpandAnyDict.asData(hashMap749))
        array437[2] = OreBracketHandler.getOre("stickWood")
        array436[n787] = array437
        val n789 = 1
        val array438 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n790 = 1
        val item750 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap750 = HashMap<String, IData>()
        hashMap750["meta"] = ExpandInt.toData(9)
        array438[n790] = item750.withTag(ExpandAnyDict.asData(hashMap750))
        array438[2] = OreBracketHandler.getOre("stickWood")
        array436[n789] = array438
        val n791 = 2
        val array439 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n792 = 1
        val item751 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap751 = HashMap<String, IData>()
        hashMap751["meta"] = ExpandInt.toData(9)
        array439[n792] = item751.withTag(ExpandAnyDict.asData(hashMap751))
        array439[2] = OreBracketHandler.getOre("stickWood")
        array436[n791] = array439
        recipes250.addShaped(withTag60, array436, null)
        val recipes251 = MineTweakerAPI.recipes
        val item752 = ItemBracketHandler.getItem("ExtraTrees:fence", 41)
        val hashMap752 = HashMap<String, IData>()
        hashMap752["meta"] = ExpandInt.toData(41)
        val amount89 = item752.withTag(ExpandAnyDict.asData(hashMap752)).amount(2)
        val array440 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n793 = 1
        val array441 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n794 = 1
        val item753 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap753 = HashMap<String, IData>()
        hashMap753["meta"] = ExpandInt.toData(9)
        array441[n794] = item753.withTag(ExpandAnyDict.asData(hashMap753))
        array441[2] = OreBracketHandler.getOre("stickWood")
        array440[n793] = array441
        val n795 = 2
        val array442 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n796 = 1
        val item754 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap754 = HashMap<String, IData>()
        hashMap754["meta"] = ExpandInt.toData(9)
        array442[n796] = item754.withTag(ExpandAnyDict.asData(hashMap754))
        array442[2] = OreBracketHandler.getOre("stickWood")
        array440[n795] = array442
        recipes251.addShaped(amount89, array440, null)
        val recipes252 = MineTweakerAPI.recipes
        val item755 = ItemBracketHandler.getItem("ExtraTrees:fence", 41)
        val hashMap755 = HashMap<String, IData>()
        hashMap755["meta"] = ExpandInt.toData(41)
        val amount90 = item755.withTag(ExpandAnyDict.asData(hashMap755)).amount(4)
        val array443 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n797 = 1
        val array444 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n798 = 1
        val item756 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap756 = HashMap<String, IData>()
        hashMap756["meta"] = ExpandInt.toData(9)
        array444[n798] = item756.withTag(ExpandAnyDict.asData(hashMap756))
        array444[2] = OreBracketHandler.getOre("stickWood")
        array443[n797] = array444
        val n799 = 2
        val array445 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n800 = 1
        val item757 = ItemBracketHandler.getItem("ExtraTrees:planks", 9)
        val hashMap757 = HashMap<String, IData>()
        hashMap757["meta"] = ExpandInt.toData(9)
        array445[n800] = item757.withTag(ExpandAnyDict.asData(hashMap757))
        array445[2] = OreBracketHandler.getOre("stickWood")
        array443[n799] = array445
        recipes252.addShaped(amount90, array443, null)
        val recipes253 = MineTweakerAPI.recipes
        val item758 = ItemBracketHandler.getItem("ExtraTrees:fence", 42)
        val hashMap758 = HashMap<String, IData>()
        hashMap758["meta"] = ExpandInt.toData(42)
        val withTag61 = item758.withTag(ExpandAnyDict.asData(hashMap758))
        val array446: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n801 = 0
        val array447 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n802 = 1
        val item759 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap759 = HashMap<String, IData>()
        hashMap759["meta"] = ExpandInt.toData(10)
        array447[n802] = item759.withTag(ExpandAnyDict.asData(hashMap759))
        array447[2] = OreBracketHandler.getOre("stickWood")
        array446[n801] = array447
        val n803 = 1
        val array448 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n804 = 1
        val item760 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap760 = HashMap<String, IData>()
        hashMap760["meta"] = ExpandInt.toData(10)
        array448[n804] = item760.withTag(ExpandAnyDict.asData(hashMap760))
        array448[2] = OreBracketHandler.getOre("stickWood")
        array446[n803] = array448
        val n805 = 2
        val array449 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n806 = 1
        val item761 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap761 = HashMap<String, IData>()
        hashMap761["meta"] = ExpandInt.toData(10)
        array449[n806] = item761.withTag(ExpandAnyDict.asData(hashMap761))
        array449[2] = OreBracketHandler.getOre("stickWood")
        array446[n805] = array449
        recipes253.addShaped(withTag61, array446, null)
        val recipes254 = MineTweakerAPI.recipes
        val item762 = ItemBracketHandler.getItem("ExtraTrees:fence", 42)
        val hashMap762 = HashMap<String, IData>()
        hashMap762["meta"] = ExpandInt.toData(42)
        val amount91 = item762.withTag(ExpandAnyDict.asData(hashMap762)).amount(2)
        val array450 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n807 = 1
        val array451 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n808 = 1
        val item763 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap763 = HashMap<String, IData>()
        hashMap763["meta"] = ExpandInt.toData(10)
        array451[n808] = item763.withTag(ExpandAnyDict.asData(hashMap763))
        array451[2] = OreBracketHandler.getOre("stickWood")
        array450[n807] = array451
        val n809 = 2
        val array452 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n810 = 1
        val item764 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap764 = HashMap<String, IData>()
        hashMap764["meta"] = ExpandInt.toData(10)
        array452[n810] = item764.withTag(ExpandAnyDict.asData(hashMap764))
        array452[2] = OreBracketHandler.getOre("stickWood")
        array450[n809] = array452
        recipes254.addShaped(amount91, array450, null)
        val recipes255 = MineTweakerAPI.recipes
        val item765 = ItemBracketHandler.getItem("ExtraTrees:fence", 42)
        val hashMap765 = HashMap<String, IData>()
        hashMap765["meta"] = ExpandInt.toData(42)
        val amount92 = item765.withTag(ExpandAnyDict.asData(hashMap765)).amount(4)
        val array453 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n811 = 1
        val array454 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n812 = 1
        val item766 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap766 = HashMap<String, IData>()
        hashMap766["meta"] = ExpandInt.toData(10)
        array454[n812] = item766.withTag(ExpandAnyDict.asData(hashMap766))
        array454[2] = OreBracketHandler.getOre("stickWood")
        array453[n811] = array454
        val n813 = 2
        val array455 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n814 = 1
        val item767 = ItemBracketHandler.getItem("ExtraTrees:planks", 10)
        val hashMap767 = HashMap<String, IData>()
        hashMap767["meta"] = ExpandInt.toData(10)
        array455[n814] = item767.withTag(ExpandAnyDict.asData(hashMap767))
        array455[2] = OreBracketHandler.getOre("stickWood")
        array453[n813] = array455
        recipes255.addShaped(amount92, array453, null)
        val recipes256 = MineTweakerAPI.recipes
        val item768 = ItemBracketHandler.getItem("ExtraTrees:fence", 43)
        val hashMap768 = HashMap<String, IData>()
        hashMap768["meta"] = ExpandInt.toData(43)
        val withTag62 = item768.withTag(ExpandAnyDict.asData(hashMap768))
        val array456: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n815 = 0
        val array457 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n816 = 1
        val item769 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap769 = HashMap<String, IData>()
        hashMap769["meta"] = ExpandInt.toData(11)
        array457[n816] = item769.withTag(ExpandAnyDict.asData(hashMap769))
        array457[2] = OreBracketHandler.getOre("stickWood")
        array456[n815] = array457
        val n817 = 1
        val array458 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n818 = 1
        val item770 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap770 = HashMap<String, IData>()
        hashMap770["meta"] = ExpandInt.toData(11)
        array458[n818] = item770.withTag(ExpandAnyDict.asData(hashMap770))
        array458[2] = OreBracketHandler.getOre("stickWood")
        array456[n817] = array458
        val n819 = 2
        val array459 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n820 = 1
        val item771 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap771 = HashMap<String, IData>()
        hashMap771["meta"] = ExpandInt.toData(11)
        array459[n820] = item771.withTag(ExpandAnyDict.asData(hashMap771))
        array459[2] = OreBracketHandler.getOre("stickWood")
        array456[n819] = array459
        recipes256.addShaped(withTag62, array456, null)
        val recipes257 = MineTweakerAPI.recipes
        val item772 = ItemBracketHandler.getItem("ExtraTrees:fence", 43)
        val hashMap772 = HashMap<String, IData>()
        hashMap772["meta"] = ExpandInt.toData(43)
        val amount93 = item772.withTag(ExpandAnyDict.asData(hashMap772)).amount(2)
        val array460 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n821 = 1
        val array461 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n822 = 1
        val item773 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap773 = HashMap<String, IData>()
        hashMap773["meta"] = ExpandInt.toData(11)
        array461[n822] = item773.withTag(ExpandAnyDict.asData(hashMap773))
        array461[2] = OreBracketHandler.getOre("stickWood")
        array460[n821] = array461
        val n823 = 2
        val array462 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n824 = 1
        val item774 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap774 = HashMap<String, IData>()
        hashMap774["meta"] = ExpandInt.toData(11)
        array462[n824] = item774.withTag(ExpandAnyDict.asData(hashMap774))
        array462[2] = OreBracketHandler.getOre("stickWood")
        array460[n823] = array462
        recipes257.addShaped(amount93, array460, null)
        val recipes258 = MineTweakerAPI.recipes
        val item775 = ItemBracketHandler.getItem("ExtraTrees:fence", 43)
        val hashMap775 = HashMap<String, IData>()
        hashMap775["meta"] = ExpandInt.toData(43)
        val amount94 = item775.withTag(ExpandAnyDict.asData(hashMap775)).amount(4)
        val array463 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n825 = 1
        val array464 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n826 = 1
        val item776 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap776 = HashMap<String, IData>()
        hashMap776["meta"] = ExpandInt.toData(11)
        array464[n826] = item776.withTag(ExpandAnyDict.asData(hashMap776))
        array464[2] = OreBracketHandler.getOre("stickWood")
        array463[n825] = array464
        val n827 = 2
        val array465 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n828 = 1
        val item777 = ItemBracketHandler.getItem("ExtraTrees:planks", 11)
        val hashMap777 = HashMap<String, IData>()
        hashMap777["meta"] = ExpandInt.toData(11)
        array465[n828] = item777.withTag(ExpandAnyDict.asData(hashMap777))
        array465[2] = OreBracketHandler.getOre("stickWood")
        array463[n827] = array465
        recipes258.addShaped(amount94, array463, null)
        val recipes259 = MineTweakerAPI.recipes
        val item778 = ItemBracketHandler.getItem("ExtraTrees:fence", 44)
        val hashMap778 = HashMap<String, IData>()
        hashMap778["meta"] = ExpandInt.toData(44)
        val withTag63 = item778.withTag(ExpandAnyDict.asData(hashMap778))
        val array466: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n829 = 0
        val array467 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n830 = 1
        val item779 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap779 = HashMap<String, IData>()
        hashMap779["meta"] = ExpandInt.toData(12)
        array467[n830] = item779.withTag(ExpandAnyDict.asData(hashMap779))
        array467[2] = OreBracketHandler.getOre("stickWood")
        array466[n829] = array467
        val n831 = 1
        val array468 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n832 = 1
        val item780 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap780 = HashMap<String, IData>()
        hashMap780["meta"] = ExpandInt.toData(12)
        array468[n832] = item780.withTag(ExpandAnyDict.asData(hashMap780))
        array468[2] = OreBracketHandler.getOre("stickWood")
        array466[n831] = array468
        val n833 = 2
        val array469 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n834 = 1
        val item781 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap781 = HashMap<String, IData>()
        hashMap781["meta"] = ExpandInt.toData(12)
        array469[n834] = item781.withTag(ExpandAnyDict.asData(hashMap781))
        array469[2] = OreBracketHandler.getOre("stickWood")
        array466[n833] = array469
        recipes259.addShaped(withTag63, array466, null)
        val recipes260 = MineTweakerAPI.recipes
        val item782 = ItemBracketHandler.getItem("ExtraTrees:fence", 44)
        val hashMap782 = HashMap<String, IData>()
        hashMap782["meta"] = ExpandInt.toData(44)
        val amount95 = item782.withTag(ExpandAnyDict.asData(hashMap782)).amount(2)
        val array470 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n835 = 1
        val array471 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n836 = 1
        val item783 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap783 = HashMap<String, IData>()
        hashMap783["meta"] = ExpandInt.toData(12)
        array471[n836] = item783.withTag(ExpandAnyDict.asData(hashMap783))
        array471[2] = OreBracketHandler.getOre("stickWood")
        array470[n835] = array471
        val n837 = 2
        val array472 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n838 = 1
        val item784 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap784 = HashMap<String, IData>()
        hashMap784["meta"] = ExpandInt.toData(12)
        array472[n838] = item784.withTag(ExpandAnyDict.asData(hashMap784))
        array472[2] = OreBracketHandler.getOre("stickWood")
        array470[n837] = array472
        recipes260.addShaped(amount95, array470, null)
        val recipes261 = MineTweakerAPI.recipes
        val item785 = ItemBracketHandler.getItem("ExtraTrees:fence", 44)
        val hashMap785 = HashMap<String, IData>()
        hashMap785["meta"] = ExpandInt.toData(44)
        val amount96 = item785.withTag(ExpandAnyDict.asData(hashMap785)).amount(4)
        val array473 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n839 = 1
        val array474 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n840 = 1
        val item786 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap786 = HashMap<String, IData>()
        hashMap786["meta"] = ExpandInt.toData(12)
        array474[n840] = item786.withTag(ExpandAnyDict.asData(hashMap786))
        array474[2] = OreBracketHandler.getOre("stickWood")
        array473[n839] = array474
        val n841 = 2
        val array475 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n842 = 1
        val item787 = ItemBracketHandler.getItem("ExtraTrees:planks", 12)
        val hashMap787 = HashMap<String, IData>()
        hashMap787["meta"] = ExpandInt.toData(12)
        array475[n842] = item787.withTag(ExpandAnyDict.asData(hashMap787))
        array475[2] = OreBracketHandler.getOre("stickWood")
        array473[n841] = array475
        recipes261.addShaped(amount96, array473, null)
        val recipes262 = MineTweakerAPI.recipes
        val item788 = ItemBracketHandler.getItem("ExtraTrees:fence", 45)
        val hashMap788 = HashMap<String, IData>()
        hashMap788["meta"] = ExpandInt.toData(45)
        val withTag64 = item788.withTag(ExpandAnyDict.asData(hashMap788))
        val array476: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n843 = 0
        val array477 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n844 = 1
        val item789 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap789 = HashMap<String, IData>()
        hashMap789["meta"] = ExpandInt.toData(13)
        array477[n844] = item789.withTag(ExpandAnyDict.asData(hashMap789))
        array477[2] = OreBracketHandler.getOre("stickWood")
        array476[n843] = array477
        val n845 = 1
        val array478 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n846 = 1
        val item790 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap790 = HashMap<String, IData>()
        hashMap790["meta"] = ExpandInt.toData(13)
        array478[n846] = item790.withTag(ExpandAnyDict.asData(hashMap790))
        array478[2] = OreBracketHandler.getOre("stickWood")
        array476[n845] = array478
        val n847 = 2
        val array479 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n848 = 1
        val item791 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap791 = HashMap<String, IData>()
        hashMap791["meta"] = ExpandInt.toData(13)
        array479[n848] = item791.withTag(ExpandAnyDict.asData(hashMap791))
        array479[2] = OreBracketHandler.getOre("stickWood")
        array476[n847] = array479
        recipes262.addShaped(withTag64, array476, null)
        val recipes263 = MineTweakerAPI.recipes
        val item792 = ItemBracketHandler.getItem("ExtraTrees:fence", 45)
        val hashMap792 = HashMap<String, IData>()
        hashMap792["meta"] = ExpandInt.toData(45)
        val amount97 = item792.withTag(ExpandAnyDict.asData(hashMap792)).amount(2)
        val array480 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n849 = 1
        val array481 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n850 = 1
        val item793 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap793 = HashMap<String, IData>()
        hashMap793["meta"] = ExpandInt.toData(13)
        array481[n850] = item793.withTag(ExpandAnyDict.asData(hashMap793))
        array481[2] = OreBracketHandler.getOre("stickWood")
        array480[n849] = array481
        val n851 = 2
        val array482 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n852 = 1
        val item794 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap794 = HashMap<String, IData>()
        hashMap794["meta"] = ExpandInt.toData(13)
        array482[n852] = item794.withTag(ExpandAnyDict.asData(hashMap794))
        array482[2] = OreBracketHandler.getOre("stickWood")
        array480[n851] = array482
        recipes263.addShaped(amount97, array480, null)
        val recipes264 = MineTweakerAPI.recipes
        val item795 = ItemBracketHandler.getItem("ExtraTrees:fence", 45)
        val hashMap795 = HashMap<String, IData>()
        hashMap795["meta"] = ExpandInt.toData(45)
        val amount98 = item795.withTag(ExpandAnyDict.asData(hashMap795)).amount(4)
        val array483 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n853 = 1
        val array484 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n854 = 1
        val item796 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap796 = HashMap<String, IData>()
        hashMap796["meta"] = ExpandInt.toData(13)
        array484[n854] = item796.withTag(ExpandAnyDict.asData(hashMap796))
        array484[2] = OreBracketHandler.getOre("stickWood")
        array483[n853] = array484
        val n855 = 2
        val array485 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n856 = 1
        val item797 = ItemBracketHandler.getItem("ExtraTrees:planks", 13)
        val hashMap797 = HashMap<String, IData>()
        hashMap797["meta"] = ExpandInt.toData(13)
        array485[n856] = item797.withTag(ExpandAnyDict.asData(hashMap797))
        array485[2] = OreBracketHandler.getOre("stickWood")
        array483[n855] = array485
        recipes264.addShaped(amount98, array483, null)
        val recipes265 = MineTweakerAPI.recipes
        val item798 = ItemBracketHandler.getItem("ExtraTrees:fence", 46)
        val hashMap798 = HashMap<String, IData>()
        hashMap798["meta"] = ExpandInt.toData(46)
        val withTag65 = item798.withTag(ExpandAnyDict.asData(hashMap798))
        val array486: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n857 = 0
        val array487 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n858 = 1
        val item799 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap799 = HashMap<String, IData>()
        hashMap799["meta"] = ExpandInt.toData(14)
        array487[n858] = item799.withTag(ExpandAnyDict.asData(hashMap799))
        array487[2] = OreBracketHandler.getOre("stickWood")
        array486[n857] = array487
        val n859 = 1
        val array488 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n860 = 1
        val item800 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap800 = HashMap<String, IData>()
        hashMap800["meta"] = ExpandInt.toData(14)
        array488[n860] = item800.withTag(ExpandAnyDict.asData(hashMap800))
        array488[2] = OreBracketHandler.getOre("stickWood")
        array486[n859] = array488
        val n861 = 2
        val array489 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n862 = 1
        val item801 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap801 = HashMap<String, IData>()
        hashMap801["meta"] = ExpandInt.toData(14)
        array489[n862] = item801.withTag(ExpandAnyDict.asData(hashMap801))
        array489[2] = OreBracketHandler.getOre("stickWood")
        array486[n861] = array489
        recipes265.addShaped(withTag65, array486, null)
        val recipes266 = MineTweakerAPI.recipes
        val item802 = ItemBracketHandler.getItem("ExtraTrees:fence", 46)
        val hashMap802 = HashMap<String, IData>()
        hashMap802["meta"] = ExpandInt.toData(46)
        val amount99 = item802.withTag(ExpandAnyDict.asData(hashMap802)).amount(2)
        val array490 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n863 = 1
        val array491 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n864 = 1
        val item803 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap803 = HashMap<String, IData>()
        hashMap803["meta"] = ExpandInt.toData(14)
        array491[n864] = item803.withTag(ExpandAnyDict.asData(hashMap803))
        array491[2] = OreBracketHandler.getOre("stickWood")
        array490[n863] = array491
        val n865 = 2
        val array492 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n866 = 1
        val item804 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap804 = HashMap<String, IData>()
        hashMap804["meta"] = ExpandInt.toData(14)
        array492[n866] = item804.withTag(ExpandAnyDict.asData(hashMap804))
        array492[2] = OreBracketHandler.getOre("stickWood")
        array490[n865] = array492
        recipes266.addShaped(amount99, array490, null)
        val recipes267 = MineTweakerAPI.recipes
        val item805 = ItemBracketHandler.getItem("ExtraTrees:fence", 46)
        val hashMap805 = HashMap<String, IData>()
        hashMap805["meta"] = ExpandInt.toData(46)
        val amount100 = item805.withTag(ExpandAnyDict.asData(hashMap805)).amount(4)
        val array493 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n867 = 1
        val array494 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n868 = 1
        val item806 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap806 = HashMap<String, IData>()
        hashMap806["meta"] = ExpandInt.toData(14)
        array494[n868] = item806.withTag(ExpandAnyDict.asData(hashMap806))
        array494[2] = OreBracketHandler.getOre("stickWood")
        array493[n867] = array494
        val n869 = 2
        val array495 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n870 = 1
        val item807 = ItemBracketHandler.getItem("ExtraTrees:planks", 14)
        val hashMap807 = HashMap<String, IData>()
        hashMap807["meta"] = ExpandInt.toData(14)
        array495[n870] = item807.withTag(ExpandAnyDict.asData(hashMap807))
        array495[2] = OreBracketHandler.getOre("stickWood")
        array493[n869] = array495
        recipes267.addShaped(amount100, array493, null)
        val recipes268 = MineTweakerAPI.recipes
        val item808 = ItemBracketHandler.getItem("ExtraTrees:fence", 47)
        val hashMap808 = HashMap<String, IData>()
        hashMap808["meta"] = ExpandInt.toData(47)
        val withTag66 = item808.withTag(ExpandAnyDict.asData(hashMap808))
        val array496: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n871 = 0
        val array497 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n872 = 1
        val item809 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap809 = HashMap<String, IData>()
        hashMap809["meta"] = ExpandInt.toData(15)
        array497[n872] = item809.withTag(ExpandAnyDict.asData(hashMap809))
        array497[2] = OreBracketHandler.getOre("stickWood")
        array496[n871] = array497
        val n873 = 1
        val array498 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n874 = 1
        val item810 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap810 = HashMap<String, IData>()
        hashMap810["meta"] = ExpandInt.toData(15)
        array498[n874] = item810.withTag(ExpandAnyDict.asData(hashMap810))
        array498[2] = OreBracketHandler.getOre("stickWood")
        array496[n873] = array498
        val n875 = 2
        val array499 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n876 = 1
        val item811 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap811 = HashMap<String, IData>()
        hashMap811["meta"] = ExpandInt.toData(15)
        array499[n876] = item811.withTag(ExpandAnyDict.asData(hashMap811))
        array499[2] = OreBracketHandler.getOre("stickWood")
        array496[n875] = array499
        recipes268.addShaped(withTag66, array496, null)
        val recipes269 = MineTweakerAPI.recipes
        val item812 = ItemBracketHandler.getItem("ExtraTrees:fence", 47)
        val hashMap812 = HashMap<String, IData>()
        hashMap812["meta"] = ExpandInt.toData(47)
        val amount101 = item812.withTag(ExpandAnyDict.asData(hashMap812)).amount(2)
        val array500 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n877 = 1
        val array501 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n878 = 1
        val item813 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap813 = HashMap<String, IData>()
        hashMap813["meta"] = ExpandInt.toData(15)
        array501[n878] = item813.withTag(ExpandAnyDict.asData(hashMap813))
        array501[2] = OreBracketHandler.getOre("stickWood")
        array500[n877] = array501
        val n879 = 2
        val array502 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n880 = 1
        val item814 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap814 = HashMap<String, IData>()
        hashMap814["meta"] = ExpandInt.toData(15)
        array502[n880] = item814.withTag(ExpandAnyDict.asData(hashMap814))
        array502[2] = OreBracketHandler.getOre("stickWood")
        array500[n879] = array502
        recipes269.addShaped(amount101, array500, null)
        val recipes270 = MineTweakerAPI.recipes
        val item815 = ItemBracketHandler.getItem("ExtraTrees:fence", 47)
        val hashMap815 = HashMap<String, IData>()
        hashMap815["meta"] = ExpandInt.toData(47)
        val amount102 = item815.withTag(ExpandAnyDict.asData(hashMap815)).amount(4)
        val array503 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n881 = 1
        val array504 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n882 = 1
        val item816 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap816 = HashMap<String, IData>()
        hashMap816["meta"] = ExpandInt.toData(15)
        array504[n882] = item816.withTag(ExpandAnyDict.asData(hashMap816))
        array504[2] = OreBracketHandler.getOre("stickWood")
        array503[n881] = array504
        val n883 = 2
        val array505 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n884 = 1
        val item817 = ItemBracketHandler.getItem("ExtraTrees:planks", 15)
        val hashMap817 = HashMap<String, IData>()
        hashMap817["meta"] = ExpandInt.toData(15)
        array505[n884] = item817.withTag(ExpandAnyDict.asData(hashMap817))
        array505[2] = OreBracketHandler.getOre("stickWood")
        array503[n883] = array505
        recipes270.addShaped(amount102, array503, null)
        val recipes271 = MineTweakerAPI.recipes
        val item818 = ItemBracketHandler.getItem("ExtraTrees:fence", 48)
        val hashMap818 = HashMap<String, IData>()
        hashMap818["meta"] = ExpandInt.toData(48)
        val withTag67 = item818.withTag(ExpandAnyDict.asData(hashMap818))
        val array506: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n885 = 0
        val array507 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n886 = 1
        val item819 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap819 = HashMap<String, IData>()
        hashMap819["meta"] = ExpandInt.toData(16)
        array507[n886] = item819.withTag(ExpandAnyDict.asData(hashMap819))
        array507[2] = OreBracketHandler.getOre("stickWood")
        array506[n885] = array507
        val n887 = 1
        val array508 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n888 = 1
        val item820 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap820 = HashMap<String, IData>()
        hashMap820["meta"] = ExpandInt.toData(16)
        array508[n888] = item820.withTag(ExpandAnyDict.asData(hashMap820))
        array508[2] = OreBracketHandler.getOre("stickWood")
        array506[n887] = array508
        val n889 = 2
        val array509 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n890 = 1
        val item821 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap821 = HashMap<String, IData>()
        hashMap821["meta"] = ExpandInt.toData(16)
        array509[n890] = item821.withTag(ExpandAnyDict.asData(hashMap821))
        array509[2] = OreBracketHandler.getOre("stickWood")
        array506[n889] = array509
        recipes271.addShaped(withTag67, array506, null)
        val recipes272 = MineTweakerAPI.recipes
        val item822 = ItemBracketHandler.getItem("ExtraTrees:fence", 48)
        val hashMap822 = HashMap<String, IData>()
        hashMap822["meta"] = ExpandInt.toData(48)
        val amount103 = item822.withTag(ExpandAnyDict.asData(hashMap822)).amount(2)
        val array510 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n891 = 1
        val array511 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n892 = 1
        val item823 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap823 = HashMap<String, IData>()
        hashMap823["meta"] = ExpandInt.toData(16)
        array511[n892] = item823.withTag(ExpandAnyDict.asData(hashMap823))
        array511[2] = OreBracketHandler.getOre("stickWood")
        array510[n891] = array511
        val n893 = 2
        val array512 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n894 = 1
        val item824 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap824 = HashMap<String, IData>()
        hashMap824["meta"] = ExpandInt.toData(16)
        array512[n894] = item824.withTag(ExpandAnyDict.asData(hashMap824))
        array512[2] = OreBracketHandler.getOre("stickWood")
        array510[n893] = array512
        recipes272.addShaped(amount103, array510, null)
        val recipes273 = MineTweakerAPI.recipes
        val item825 = ItemBracketHandler.getItem("ExtraTrees:fence", 48)
        val hashMap825 = HashMap<String, IData>()
        hashMap825["meta"] = ExpandInt.toData(48)
        val amount104 = item825.withTag(ExpandAnyDict.asData(hashMap825)).amount(4)
        val array513 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n895 = 1
        val array514 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n896 = 1
        val item826 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap826 = HashMap<String, IData>()
        hashMap826["meta"] = ExpandInt.toData(16)
        array514[n896] = item826.withTag(ExpandAnyDict.asData(hashMap826))
        array514[2] = OreBracketHandler.getOre("stickWood")
        array513[n895] = array514
        val n897 = 2
        val array515 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n898 = 1
        val item827 = ItemBracketHandler.getItem("ExtraTrees:planks", 16)
        val hashMap827 = HashMap<String, IData>()
        hashMap827["meta"] = ExpandInt.toData(16)
        array515[n898] = item827.withTag(ExpandAnyDict.asData(hashMap827))
        array515[2] = OreBracketHandler.getOre("stickWood")
        array513[n897] = array515
        recipes273.addShaped(amount104, array513, null)
        val recipes274 = MineTweakerAPI.recipes
        val item828 = ItemBracketHandler.getItem("ExtraTrees:fence", 49)
        val hashMap828 = HashMap<String, IData>()
        hashMap828["meta"] = ExpandInt.toData(49)
        val withTag68 = item828.withTag(ExpandAnyDict.asData(hashMap828))
        val array516: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n899 = 0
        val array517 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n900 = 1
        val item829 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap829 = HashMap<String, IData>()
        hashMap829["meta"] = ExpandInt.toData(17)
        array517[n900] = item829.withTag(ExpandAnyDict.asData(hashMap829))
        array517[2] = OreBracketHandler.getOre("stickWood")
        array516[n899] = array517
        val n901 = 1
        val array518 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n902 = 1
        val item830 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap830 = HashMap<String, IData>()
        hashMap830["meta"] = ExpandInt.toData(17)
        array518[n902] = item830.withTag(ExpandAnyDict.asData(hashMap830))
        array518[2] = OreBracketHandler.getOre("stickWood")
        array516[n901] = array518
        val n903 = 2
        val array519 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n904 = 1
        val item831 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap831 = HashMap<String, IData>()
        hashMap831["meta"] = ExpandInt.toData(17)
        array519[n904] = item831.withTag(ExpandAnyDict.asData(hashMap831))
        array519[2] = OreBracketHandler.getOre("stickWood")
        array516[n903] = array519
        recipes274.addShaped(withTag68, array516, null)
        val recipes275 = MineTweakerAPI.recipes
        val item832 = ItemBracketHandler.getItem("ExtraTrees:fence", 49)
        val hashMap832 = HashMap<String, IData>()
        hashMap832["meta"] = ExpandInt.toData(49)
        val amount105 = item832.withTag(ExpandAnyDict.asData(hashMap832)).amount(2)
        val array520 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n905 = 1
        val array521 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n906 = 1
        val item833 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap833 = HashMap<String, IData>()
        hashMap833["meta"] = ExpandInt.toData(17)
        array521[n906] = item833.withTag(ExpandAnyDict.asData(hashMap833))
        array521[2] = OreBracketHandler.getOre("stickWood")
        array520[n905] = array521
        val n907 = 2
        val array522 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n908 = 1
        val item834 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap834 = HashMap<String, IData>()
        hashMap834["meta"] = ExpandInt.toData(17)
        array522[n908] = item834.withTag(ExpandAnyDict.asData(hashMap834))
        array522[2] = OreBracketHandler.getOre("stickWood")
        array520[n907] = array522
        recipes275.addShaped(amount105, array520, null)
        val recipes276 = MineTweakerAPI.recipes
        val item835 = ItemBracketHandler.getItem("ExtraTrees:fence", 49)
        val hashMap835 = HashMap<String, IData>()
        hashMap835["meta"] = ExpandInt.toData(49)
        val amount106 = item835.withTag(ExpandAnyDict.asData(hashMap835)).amount(4)
        val array523 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n909 = 1
        val array524 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n910 = 1
        val item836 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap836 = HashMap<String, IData>()
        hashMap836["meta"] = ExpandInt.toData(17)
        array524[n910] = item836.withTag(ExpandAnyDict.asData(hashMap836))
        array524[2] = OreBracketHandler.getOre("stickWood")
        array523[n909] = array524
        val n911 = 2
        val array525 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n912 = 1
        val item837 = ItemBracketHandler.getItem("ExtraTrees:planks", 17)
        val hashMap837 = HashMap<String, IData>()
        hashMap837["meta"] = ExpandInt.toData(17)
        array525[n912] = item837.withTag(ExpandAnyDict.asData(hashMap837))
        array525[2] = OreBracketHandler.getOre("stickWood")
        array523[n911] = array525
        recipes276.addShaped(amount106, array523, null)
        val recipes277 = MineTweakerAPI.recipes
        val item838 = ItemBracketHandler.getItem("ExtraTrees:fence", 50)
        val hashMap838 = HashMap<String, IData>()
        hashMap838["meta"] = ExpandInt.toData(50)
        val withTag69 = item838.withTag(ExpandAnyDict.asData(hashMap838))
        val array526: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n913 = 0
        val array527 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n914 = 1
        val item839 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap839 = HashMap<String, IData>()
        hashMap839["meta"] = ExpandInt.toData(18)
        array527[n914] = item839.withTag(ExpandAnyDict.asData(hashMap839))
        array527[2] = OreBracketHandler.getOre("stickWood")
        array526[n913] = array527
        val n915 = 1
        val array528 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n916 = 1
        val item840 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap840 = HashMap<String, IData>()
        hashMap840["meta"] = ExpandInt.toData(18)
        array528[n916] = item840.withTag(ExpandAnyDict.asData(hashMap840))
        array528[2] = OreBracketHandler.getOre("stickWood")
        array526[n915] = array528
        val n917 = 2
        val array529 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n918 = 1
        val item841 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap841 = HashMap<String, IData>()
        hashMap841["meta"] = ExpandInt.toData(18)
        array529[n918] = item841.withTag(ExpandAnyDict.asData(hashMap841))
        array529[2] = OreBracketHandler.getOre("stickWood")
        array526[n917] = array529
        recipes277.addShaped(withTag69, array526, null)
        val recipes278 = MineTweakerAPI.recipes
        val item842 = ItemBracketHandler.getItem("ExtraTrees:fence", 50)
        val hashMap842 = HashMap<String, IData>()
        hashMap842["meta"] = ExpandInt.toData(50)
        val amount107 = item842.withTag(ExpandAnyDict.asData(hashMap842)).amount(2)
        val array530 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n919 = 1
        val array531 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n920 = 1
        val item843 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap843 = HashMap<String, IData>()
        hashMap843["meta"] = ExpandInt.toData(18)
        array531[n920] = item843.withTag(ExpandAnyDict.asData(hashMap843))
        array531[2] = OreBracketHandler.getOre("stickWood")
        array530[n919] = array531
        val n921 = 2
        val array532 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n922 = 1
        val item844 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap844 = HashMap<String, IData>()
        hashMap844["meta"] = ExpandInt.toData(18)
        array532[n922] = item844.withTag(ExpandAnyDict.asData(hashMap844))
        array532[2] = OreBracketHandler.getOre("stickWood")
        array530[n921] = array532
        recipes278.addShaped(amount107, array530, null)
        val recipes279 = MineTweakerAPI.recipes
        val item845 = ItemBracketHandler.getItem("ExtraTrees:fence", 50)
        val hashMap845 = HashMap<String, IData>()
        hashMap845["meta"] = ExpandInt.toData(50)
        val amount108 = item845.withTag(ExpandAnyDict.asData(hashMap845)).amount(4)
        val array533 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n923 = 1
        val array534 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n924 = 1
        val item846 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap846 = HashMap<String, IData>()
        hashMap846["meta"] = ExpandInt.toData(18)
        array534[n924] = item846.withTag(ExpandAnyDict.asData(hashMap846))
        array534[2] = OreBracketHandler.getOre("stickWood")
        array533[n923] = array534
        val n925 = 2
        val array535 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n926 = 1
        val item847 = ItemBracketHandler.getItem("ExtraTrees:planks", 18)
        val hashMap847 = HashMap<String, IData>()
        hashMap847["meta"] = ExpandInt.toData(18)
        array535[n926] = item847.withTag(ExpandAnyDict.asData(hashMap847))
        array535[2] = OreBracketHandler.getOre("stickWood")
        array533[n925] = array535
        recipes279.addShaped(amount108, array533, null)
        val recipes280 = MineTweakerAPI.recipes
        val item848 = ItemBracketHandler.getItem("ExtraTrees:fence", 51)
        val hashMap848 = HashMap<String, IData>()
        hashMap848["meta"] = ExpandInt.toData(51)
        val withTag70 = item848.withTag(ExpandAnyDict.asData(hashMap848))
        val array536: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n927 = 0
        val array537 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n928 = 1
        val item849 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap849 = HashMap<String, IData>()
        hashMap849["meta"] = ExpandInt.toData(19)
        array537[n928] = item849.withTag(ExpandAnyDict.asData(hashMap849))
        array537[2] = OreBracketHandler.getOre("stickWood")
        array536[n927] = array537
        val n929 = 1
        val array538 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n930 = 1
        val item850 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap850 = HashMap<String, IData>()
        hashMap850["meta"] = ExpandInt.toData(19)
        array538[n930] = item850.withTag(ExpandAnyDict.asData(hashMap850))
        array538[2] = OreBracketHandler.getOre("stickWood")
        array536[n929] = array538
        val n931 = 2
        val array539 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n932 = 1
        val item851 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap851 = HashMap<String, IData>()
        hashMap851["meta"] = ExpandInt.toData(19)
        array539[n932] = item851.withTag(ExpandAnyDict.asData(hashMap851))
        array539[2] = OreBracketHandler.getOre("stickWood")
        array536[n931] = array539
        recipes280.addShaped(withTag70, array536, null)
        val recipes281 = MineTweakerAPI.recipes
        val item852 = ItemBracketHandler.getItem("ExtraTrees:fence", 51)
        val hashMap852 = HashMap<String, IData>()
        hashMap852["meta"] = ExpandInt.toData(51)
        val amount109 = item852.withTag(ExpandAnyDict.asData(hashMap852)).amount(2)
        val array540 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n933 = 1
        val array541 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n934 = 1
        val item853 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap853 = HashMap<String, IData>()
        hashMap853["meta"] = ExpandInt.toData(19)
        array541[n934] = item853.withTag(ExpandAnyDict.asData(hashMap853))
        array541[2] = OreBracketHandler.getOre("stickWood")
        array540[n933] = array541
        val n935 = 2
        val array542 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n936 = 1
        val item854 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap854 = HashMap<String, IData>()
        hashMap854["meta"] = ExpandInt.toData(19)
        array542[n936] = item854.withTag(ExpandAnyDict.asData(hashMap854))
        array542[2] = OreBracketHandler.getOre("stickWood")
        array540[n935] = array542
        recipes281.addShaped(amount109, array540, null)
        val recipes282 = MineTweakerAPI.recipes
        val item855 = ItemBracketHandler.getItem("ExtraTrees:fence", 51)
        val hashMap855 = HashMap<String, IData>()
        hashMap855["meta"] = ExpandInt.toData(51)
        val amount110 = item855.withTag(ExpandAnyDict.asData(hashMap855)).amount(4)
        val array543 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n937 = 1
        val array544 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n938 = 1
        val item856 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap856 = HashMap<String, IData>()
        hashMap856["meta"] = ExpandInt.toData(19)
        array544[n938] = item856.withTag(ExpandAnyDict.asData(hashMap856))
        array544[2] = OreBracketHandler.getOre("stickWood")
        array543[n937] = array544
        val n939 = 2
        val array545 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n940 = 1
        val item857 = ItemBracketHandler.getItem("ExtraTrees:planks", 19)
        val hashMap857 = HashMap<String, IData>()
        hashMap857["meta"] = ExpandInt.toData(19)
        array545[n940] = item857.withTag(ExpandAnyDict.asData(hashMap857))
        array545[2] = OreBracketHandler.getOre("stickWood")
        array543[n939] = array545
        recipes282.addShaped(amount110, array543, null)
        val recipes283 = MineTweakerAPI.recipes
        val item858 = ItemBracketHandler.getItem("ExtraTrees:fence", 52)
        val hashMap858 = HashMap<String, IData>()
        hashMap858["meta"] = ExpandInt.toData(52)
        val withTag71 = item858.withTag(ExpandAnyDict.asData(hashMap858))
        val array546: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n941 = 0
        val array547 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n942 = 1
        val item859 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap859 = HashMap<String, IData>()
        hashMap859["meta"] = ExpandInt.toData(20)
        array547[n942] = item859.withTag(ExpandAnyDict.asData(hashMap859))
        array547[2] = OreBracketHandler.getOre("stickWood")
        array546[n941] = array547
        val n943 = 1
        val array548 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n944 = 1
        val item860 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap860 = HashMap<String, IData>()
        hashMap860["meta"] = ExpandInt.toData(20)
        array548[n944] = item860.withTag(ExpandAnyDict.asData(hashMap860))
        array548[2] = OreBracketHandler.getOre("stickWood")
        array546[n943] = array548
        val n945 = 2
        val array549 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n946 = 1
        val item861 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap861 = HashMap<String, IData>()
        hashMap861["meta"] = ExpandInt.toData(20)
        array549[n946] = item861.withTag(ExpandAnyDict.asData(hashMap861))
        array549[2] = OreBracketHandler.getOre("stickWood")
        array546[n945] = array549
        recipes283.addShaped(withTag71, array546, null)
        val recipes284 = MineTweakerAPI.recipes
        val item862 = ItemBracketHandler.getItem("ExtraTrees:fence", 52)
        val hashMap862 = HashMap<String, IData>()
        hashMap862["meta"] = ExpandInt.toData(52)
        val amount111 = item862.withTag(ExpandAnyDict.asData(hashMap862)).amount(2)
        val array550 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n947 = 1
        val array551 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n948 = 1
        val item863 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap863 = HashMap<String, IData>()
        hashMap863["meta"] = ExpandInt.toData(20)
        array551[n948] = item863.withTag(ExpandAnyDict.asData(hashMap863))
        array551[2] = OreBracketHandler.getOre("stickWood")
        array550[n947] = array551
        val n949 = 2
        val array552 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n950 = 1
        val item864 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap864 = HashMap<String, IData>()
        hashMap864["meta"] = ExpandInt.toData(20)
        array552[n950] = item864.withTag(ExpandAnyDict.asData(hashMap864))
        array552[2] = OreBracketHandler.getOre("stickWood")
        array550[n949] = array552
        recipes284.addShaped(amount111, array550, null)
        val recipes285 = MineTweakerAPI.recipes
        val item865 = ItemBracketHandler.getItem("ExtraTrees:fence", 52)
        val hashMap865 = HashMap<String, IData>()
        hashMap865["meta"] = ExpandInt.toData(52)
        val amount112 = item865.withTag(ExpandAnyDict.asData(hashMap865)).amount(4)
        val array553 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n951 = 1
        val array554 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n952 = 1
        val item866 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap866 = HashMap<String, IData>()
        hashMap866["meta"] = ExpandInt.toData(20)
        array554[n952] = item866.withTag(ExpandAnyDict.asData(hashMap866))
        array554[2] = OreBracketHandler.getOre("stickWood")
        array553[n951] = array554
        val n953 = 2
        val array555 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n954 = 1
        val item867 = ItemBracketHandler.getItem("ExtraTrees:planks", 20)
        val hashMap867 = HashMap<String, IData>()
        hashMap867["meta"] = ExpandInt.toData(20)
        array555[n954] = item867.withTag(ExpandAnyDict.asData(hashMap867))
        array555[2] = OreBracketHandler.getOre("stickWood")
        array553[n953] = array555
        recipes285.addShaped(amount112, array553, null)
        val recipes286 = MineTweakerAPI.recipes
        val item868 = ItemBracketHandler.getItem("ExtraTrees:fence", 53)
        val hashMap868 = HashMap<String, IData>()
        hashMap868["meta"] = ExpandInt.toData(53)
        val withTag72 = item868.withTag(ExpandAnyDict.asData(hashMap868))
        val array556: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n955 = 0
        val array557 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n956 = 1
        val item869 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap869 = HashMap<String, IData>()
        hashMap869["meta"] = ExpandInt.toData(21)
        array557[n956] = item869.withTag(ExpandAnyDict.asData(hashMap869))
        array557[2] = OreBracketHandler.getOre("stickWood")
        array556[n955] = array557
        val n957 = 1
        val array558 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n958 = 1
        val item870 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap870 = HashMap<String, IData>()
        hashMap870["meta"] = ExpandInt.toData(21)
        array558[n958] = item870.withTag(ExpandAnyDict.asData(hashMap870))
        array558[2] = OreBracketHandler.getOre("stickWood")
        array556[n957] = array558
        val n959 = 2
        val array559 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n960 = 1
        val item871 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap871 = HashMap<String, IData>()
        hashMap871["meta"] = ExpandInt.toData(21)
        array559[n960] = item871.withTag(ExpandAnyDict.asData(hashMap871))
        array559[2] = OreBracketHandler.getOre("stickWood")
        array556[n959] = array559
        recipes286.addShaped(withTag72, array556, null)
        val recipes287 = MineTweakerAPI.recipes
        val item872 = ItemBracketHandler.getItem("ExtraTrees:fence", 53)
        val hashMap872 = HashMap<String, IData>()
        hashMap872["meta"] = ExpandInt.toData(53)
        val amount113 = item872.withTag(ExpandAnyDict.asData(hashMap872)).amount(2)
        val array560 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n961 = 1
        val array561 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n962 = 1
        val item873 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap873 = HashMap<String, IData>()
        hashMap873["meta"] = ExpandInt.toData(21)
        array561[n962] = item873.withTag(ExpandAnyDict.asData(hashMap873))
        array561[2] = OreBracketHandler.getOre("stickWood")
        array560[n961] = array561
        val n963 = 2
        val array562 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n964 = 1
        val item874 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap874 = HashMap<String, IData>()
        hashMap874["meta"] = ExpandInt.toData(21)
        array562[n964] = item874.withTag(ExpandAnyDict.asData(hashMap874))
        array562[2] = OreBracketHandler.getOre("stickWood")
        array560[n963] = array562
        recipes287.addShaped(amount113, array560, null)
        val recipes288 = MineTweakerAPI.recipes
        val item875 = ItemBracketHandler.getItem("ExtraTrees:fence", 53)
        val hashMap875 = HashMap<String, IData>()
        hashMap875["meta"] = ExpandInt.toData(53)
        val amount114 = item875.withTag(ExpandAnyDict.asData(hashMap875)).amount(4)
        val array563 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n965 = 1
        val array564 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n966 = 1
        val item876 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap876 = HashMap<String, IData>()
        hashMap876["meta"] = ExpandInt.toData(21)
        array564[n966] = item876.withTag(ExpandAnyDict.asData(hashMap876))
        array564[2] = OreBracketHandler.getOre("stickWood")
        array563[n965] = array564
        val n967 = 2
        val array565 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n968 = 1
        val item877 = ItemBracketHandler.getItem("ExtraTrees:planks", 21)
        val hashMap877 = HashMap<String, IData>()
        hashMap877["meta"] = ExpandInt.toData(21)
        array565[n968] = item877.withTag(ExpandAnyDict.asData(hashMap877))
        array565[2] = OreBracketHandler.getOre("stickWood")
        array563[n967] = array565
        recipes288.addShaped(amount114, array563, null)
        val recipes289 = MineTweakerAPI.recipes
        val item878 = ItemBracketHandler.getItem("ExtraTrees:fence", 54)
        val hashMap878 = HashMap<String, IData>()
        hashMap878["meta"] = ExpandInt.toData(54)
        val withTag73 = item878.withTag(ExpandAnyDict.asData(hashMap878))
        val array566: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n969 = 0
        val array567 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n970 = 1
        val item879 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap879 = HashMap<String, IData>()
        hashMap879["meta"] = ExpandInt.toData(22)
        array567[n970] = item879.withTag(ExpandAnyDict.asData(hashMap879))
        array567[2] = OreBracketHandler.getOre("stickWood")
        array566[n969] = array567
        val n971 = 1
        val array568 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n972 = 1
        val item880 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap880 = HashMap<String, IData>()
        hashMap880["meta"] = ExpandInt.toData(22)
        array568[n972] = item880.withTag(ExpandAnyDict.asData(hashMap880))
        array568[2] = OreBracketHandler.getOre("stickWood")
        array566[n971] = array568
        val n973 = 2
        val array569 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n974 = 1
        val item881 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap881 = HashMap<String, IData>()
        hashMap881["meta"] = ExpandInt.toData(22)
        array569[n974] = item881.withTag(ExpandAnyDict.asData(hashMap881))
        array569[2] = OreBracketHandler.getOre("stickWood")
        array566[n973] = array569
        recipes289.addShaped(withTag73, array566, null)
        val recipes290 = MineTweakerAPI.recipes
        val item882 = ItemBracketHandler.getItem("ExtraTrees:fence", 54)
        val hashMap882 = HashMap<String, IData>()
        hashMap882["meta"] = ExpandInt.toData(54)
        val amount115 = item882.withTag(ExpandAnyDict.asData(hashMap882)).amount(2)
        val array570 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n975 = 1
        val array571 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n976 = 1
        val item883 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap883 = HashMap<String, IData>()
        hashMap883["meta"] = ExpandInt.toData(22)
        array571[n976] = item883.withTag(ExpandAnyDict.asData(hashMap883))
        array571[2] = OreBracketHandler.getOre("stickWood")
        array570[n975] = array571
        val n977 = 2
        val array572 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n978 = 1
        val item884 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap884 = HashMap<String, IData>()
        hashMap884["meta"] = ExpandInt.toData(22)
        array572[n978] = item884.withTag(ExpandAnyDict.asData(hashMap884))
        array572[2] = OreBracketHandler.getOre("stickWood")
        array570[n977] = array572
        recipes290.addShaped(amount115, array570, null)
        val recipes291 = MineTweakerAPI.recipes
        val item885 = ItemBracketHandler.getItem("ExtraTrees:fence", 54)
        val hashMap885 = HashMap<String, IData>()
        hashMap885["meta"] = ExpandInt.toData(54)
        val amount116 = item885.withTag(ExpandAnyDict.asData(hashMap885)).amount(4)
        val array573 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n979 = 1
        val array574 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n980 = 1
        val item886 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap886 = HashMap<String, IData>()
        hashMap886["meta"] = ExpandInt.toData(22)
        array574[n980] = item886.withTag(ExpandAnyDict.asData(hashMap886))
        array574[2] = OreBracketHandler.getOre("stickWood")
        array573[n979] = array574
        val n981 = 2
        val array575 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n982 = 1
        val item887 = ItemBracketHandler.getItem("ExtraTrees:planks", 22)
        val hashMap887 = HashMap<String, IData>()
        hashMap887["meta"] = ExpandInt.toData(22)
        array575[n982] = item887.withTag(ExpandAnyDict.asData(hashMap887))
        array575[2] = OreBracketHandler.getOre("stickWood")
        array573[n981] = array575
        recipes291.addShaped(amount116, array573, null)
        val recipes292 = MineTweakerAPI.recipes
        val item888 = ItemBracketHandler.getItem("ExtraTrees:fence", 55)
        val hashMap888 = HashMap<String, IData>()
        hashMap888["meta"] = ExpandInt.toData(55)
        val withTag74 = item888.withTag(ExpandAnyDict.asData(hashMap888))
        val array576: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n983 = 0
        val array577 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n984 = 1
        val item889 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap889 = HashMap<String, IData>()
        hashMap889["meta"] = ExpandInt.toData(23)
        array577[n984] = item889.withTag(ExpandAnyDict.asData(hashMap889))
        array577[2] = OreBracketHandler.getOre("stickWood")
        array576[n983] = array577
        val n985 = 1
        val array578 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n986 = 1
        val item890 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap890 = HashMap<String, IData>()
        hashMap890["meta"] = ExpandInt.toData(23)
        array578[n986] = item890.withTag(ExpandAnyDict.asData(hashMap890))
        array578[2] = OreBracketHandler.getOre("stickWood")
        array576[n985] = array578
        val n987 = 2
        val array579 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n988 = 1
        val item891 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap891 = HashMap<String, IData>()
        hashMap891["meta"] = ExpandInt.toData(23)
        array579[n988] = item891.withTag(ExpandAnyDict.asData(hashMap891))
        array579[2] = OreBracketHandler.getOre("stickWood")
        array576[n987] = array579
        recipes292.addShaped(withTag74, array576, null)
        val recipes293 = MineTweakerAPI.recipes
        val item892 = ItemBracketHandler.getItem("ExtraTrees:fence", 55)
        val hashMap892 = HashMap<String, IData>()
        hashMap892["meta"] = ExpandInt.toData(55)
        val amount117 = item892.withTag(ExpandAnyDict.asData(hashMap892)).amount(2)
        val array580 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n989 = 1
        val array581 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n990 = 1
        val item893 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap893 = HashMap<String, IData>()
        hashMap893["meta"] = ExpandInt.toData(23)
        array581[n990] = item893.withTag(ExpandAnyDict.asData(hashMap893))
        array581[2] = OreBracketHandler.getOre("stickWood")
        array580[n989] = array581
        val n991 = 2
        val array582 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n992 = 1
        val item894 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap894 = HashMap<String, IData>()
        hashMap894["meta"] = ExpandInt.toData(23)
        array582[n992] = item894.withTag(ExpandAnyDict.asData(hashMap894))
        array582[2] = OreBracketHandler.getOre("stickWood")
        array580[n991] = array582
        recipes293.addShaped(amount117, array580, null)
        val recipes294 = MineTweakerAPI.recipes
        val item895 = ItemBracketHandler.getItem("ExtraTrees:fence", 55)
        val hashMap895 = HashMap<String, IData>()
        hashMap895["meta"] = ExpandInt.toData(55)
        val amount118 = item895.withTag(ExpandAnyDict.asData(hashMap895)).amount(4)
        val array583 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n993 = 1
        val array584 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n994 = 1
        val item896 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap896 = HashMap<String, IData>()
        hashMap896["meta"] = ExpandInt.toData(23)
        array584[n994] = item896.withTag(ExpandAnyDict.asData(hashMap896))
        array584[2] = OreBracketHandler.getOre("stickWood")
        array583[n993] = array584
        val n995 = 2
        val array585 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n996 = 1
        val item897 = ItemBracketHandler.getItem("ExtraTrees:planks", 23)
        val hashMap897 = HashMap<String, IData>()
        hashMap897["meta"] = ExpandInt.toData(23)
        array585[n996] = item897.withTag(ExpandAnyDict.asData(hashMap897))
        array585[2] = OreBracketHandler.getOre("stickWood")
        array583[n995] = array585
        recipes294.addShaped(amount118, array583, null)
        val recipes295 = MineTweakerAPI.recipes
        val item898 = ItemBracketHandler.getItem("ExtraTrees:fence", 56)
        val hashMap898 = HashMap<String, IData>()
        hashMap898["meta"] = ExpandInt.toData(56)
        val withTag75 = item898.withTag(ExpandAnyDict.asData(hashMap898))
        val array586: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n997 = 0
        val array587 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n998 = 1
        val item899 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap899 = HashMap<String, IData>()
        hashMap899["meta"] = ExpandInt.toData(24)
        array587[n998] = item899.withTag(ExpandAnyDict.asData(hashMap899))
        array587[2] = OreBracketHandler.getOre("stickWood")
        array586[n997] = array587
        val n999 = 1
        val array588 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n1000 = 1
        val item900 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap900 = HashMap<String, IData>()
        hashMap900["meta"] = ExpandInt.toData(24)
        array588[n1000] = item900.withTag(ExpandAnyDict.asData(hashMap900))
        array588[2] = OreBracketHandler.getOre("stickWood")
        array586[n999] = array588
        val n1001 = 2
        val array589 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n1002 = 1
        val item901 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap901 = HashMap<String, IData>()
        hashMap901["meta"] = ExpandInt.toData(24)
        array589[n1002] = item901.withTag(ExpandAnyDict.asData(hashMap901))
        array589[2] = OreBracketHandler.getOre("stickWood")
        array586[n1001] = array589
        recipes295.addShaped(withTag75, array586, null)
        val recipes296 = MineTweakerAPI.recipes
        val item902 = ItemBracketHandler.getItem("ExtraTrees:fence", 56)
        val hashMap902 = HashMap<String, IData>()
        hashMap902["meta"] = ExpandInt.toData(56)
        val amount119 = item902.withTag(ExpandAnyDict.asData(hashMap902)).amount(2)
        val array590 = arrayOf(
                arrayOf<IIngredient?>(ore3, ore, ore3), null, null)
        val n1003 = 1
        val array591 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n1004 = 1
        val item903 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap903 = HashMap<String, IData>()
        hashMap903["meta"] = ExpandInt.toData(24)
        array591[n1004] = item903.withTag(ExpandAnyDict.asData(hashMap903))
        array591[2] = OreBracketHandler.getOre("stickWood")
        array590[n1003] = array591
        val n1005 = 2
        val array592 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n1006 = 1
        val item904 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap904 = HashMap<String, IData>()
        hashMap904["meta"] = ExpandInt.toData(24)
        array592[n1006] = item904.withTag(ExpandAnyDict.asData(hashMap904))
        array592[2] = OreBracketHandler.getOre("stickWood")
        array590[n1005] = array592
        recipes296.addShaped(amount119, array590, null)
        val recipes297 = MineTweakerAPI.recipes
        val item905 = ItemBracketHandler.getItem("ExtraTrees:fence", 56)
        val hashMap905 = HashMap<String, IData>()
        hashMap905["meta"] = ExpandInt.toData(56)
        val amount120 = item905.withTag(ExpandAnyDict.asData(hashMap905)).amount(4)
        val array593 = arrayOf(
                arrayOf<IIngredient?>(ore4, ore, ore4), null, null)
        val n1007 = 1
        val array594 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n1008 = 1
        val item906 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap906 = HashMap<String, IData>()
        hashMap906["meta"] = ExpandInt.toData(24)
        array594[n1008] = item906.withTag(ExpandAnyDict.asData(hashMap906))
        array594[2] = OreBracketHandler.getOre("stickWood")
        array593[n1007] = array594
        val n1009 = 2
        val array595 = arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                null)
        val n1010 = 1
        val item907 = ItemBracketHandler.getItem("ExtraTrees:planks", 24)
        val hashMap907 = HashMap<String, IData>()
        hashMap907["meta"] = ExpandInt.toData(24)
        array595[n1010] = item907.withTag(ExpandAnyDict.asData(hashMap907))
        array595[2] = OreBracketHandler.getOre("stickWood")
        array593[n1009] = array595
        recipes297.addShaped(amount120, array593, null)
    }
}