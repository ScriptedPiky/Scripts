package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.forestry.handlers.Carpenter
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class ExtraTrees5 : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:machine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:machine", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:machine", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:machine", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:machine", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:machine", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:machine", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:machine", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:hammer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:durableHammer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:misc", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:door", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:gate", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:fence", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraTrees:multifence", OreDictionary.WILDCARD_VALUE))
        Carpenter.addRecipe(ItemBracketHandler.getItem("ExtraTrees:database", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                        OreBracketHandler.getOre("itemCasingGold"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17501)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                                OreBracketHandler.getOre("itemCasingGold"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1440), 60,
                ItemBracketHandler.getItem("Forestry:treealyzer", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("ExtraTrees:database", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraTrees:database", 0)), null)
        Carpenter.addRecipe(ItemBracketHandler.getItem("ExtraTrees:databaseMoth", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                        OreBracketHandler.getOre("itemCasingGold"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17501),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                                OreBracketHandler.getOre("itemCasingGold"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1440), 60,
                ItemBracketHandler.getItem("Forestry:flutterlyzer", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("ExtraTrees:databaseMoth", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraTrees:databaseMoth", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ExtraTrees:machine", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32721)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraTrees:misc", 3),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                ItemBracketHandler.getItem("ExtraTrees:misc", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ExtraTrees:machine", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17889),
                        OreBracketHandler.getOre("plankWood"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17889)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:factory2", 2),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("Forestry:factory2", 2)),
                        arrayOf(ItemBracketHandler.getItem("ExtraTrees:misc", 3), OreBracketHandler.getOre("plankWood"),
                                ItemBracketHandler.getItem("ExtraTrees:misc", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ExtraTrees:machine", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17889),
                        OreBracketHandler.getOre("slabWood"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17889)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:factory2", 2),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("Forestry:factory2", 2)),
                        arrayOf(ItemBracketHandler.getItem("ExtraTrees:misc", 3), OreBracketHandler.getOre("slabWood"),
                                ItemBracketHandler.getItem("ExtraTrees:misc", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ExtraTrees:machine", 4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallBronze"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("gearGtSmallBronze"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ExtraTrees:misc", 3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:oakStick", 0),
                        ItemBracketHandler.getItem("Railcraft:cube", 8),
                        ItemBracketHandler.getItem("Forestry:oakStick", 0)),
                        arrayOf(ItemBracketHandler.getItem("Railcraft:cube", 8),
                                OreBracketHandler.getOre("craftingToolSaw"),
                                ItemBracketHandler.getItem("Railcraft:cube", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:oakStick", 0),
                                ItemBracketHandler.getItem("Railcraft:cube", 8),
                                ItemBracketHandler.getItem("Forestry:oakStick", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ExtraTrees:hammer", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plankWood"),
                        OreBracketHandler.getOre("plankWood"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotIron"),
                                OreBracketHandler.getOre("stickIron"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plankWood"),
                                OreBracketHandler.getOre("plankWood"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ExtraTrees:durableHammer", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateObsidian"),
                        OreBracketHandler.getOre("plateObsidian"), null), arrayOf(OreBracketHandler.getOre("ingotGold"),
                        ItemBracketHandler.getItem("RandomThings:ingredient", 1),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateObsidian"),
                                OreBracketHandler.getOre("plateObsidian"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ExtraTrees:misc", 5).amount(5),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickLongAnyIron"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("stickLongAnyIron")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickLongAnyIron"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickLongAnyIron"),
                                OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickLongAnyIron"))), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("ExtraTrees:database", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("ExtraTrees:databaseMoth", 0), null)
        val recipes = MineTweakerAPI.recipes
        val item = ItemBracketHandler.getItem("ExtraTrees:door", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["meta"] = ExpandInt.toData(0)
        recipes.addShaped(item.withTag(ExpandAnyDict.asData(hashMap)),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:wooden_door", 0), null, null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        val recipes2 = MineTweakerAPI.recipes
        val item2 = ItemBracketHandler.getItem("ExtraTrees:door", 256)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["meta"] = ExpandInt.toData(256)
        recipes2.addShaped(item2.withTag(ExpandAnyDict.asData(hashMap2)),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:wooden_door", 0), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        val recipes3 = MineTweakerAPI.recipes
        val item3 = ItemBracketHandler.getItem("ExtraTrees:door", 512)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["meta"] = ExpandInt.toData(512)
        recipes3.addShaped(item3.withTag(ExpandAnyDict.asData(hashMap3)),
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("minecraft:wooden_door", 0)),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        val recipes4 = MineTweakerAPI.recipes
        val item4 = ItemBracketHandler.getItem("ExtraTrees:door", 768)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["meta"] = ExpandInt.toData(768)
        recipes4.addShaped(item4.withTag(ExpandAnyDict.asData(hashMap4)), arrayOf(arrayOfNulls(3),
                arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:wooden_door", 0), null, null),
                arrayOfNulls(3)), null)
        val recipes25 = MineTweakerAPI.recipes
        val item25 = ItemBracketHandler.getItem("ExtraTrees:door", 32)
        val hashMap25 = HashMap<String, IData>()
        hashMap25["meta"] = ExpandInt.toData(32)
        val withTag = item25.withTag(ExpandAnyDict.asData(hashMap25))
        val array: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n = 0
        val array2 = arrayOfNulls<IIngredient>(3)
        val n2 = 0
        val item26 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap26 = HashMap<String, IData>()
        hashMap26["meta"] = ExpandInt.toData(0)
        array2[n2] = item26.withTag(ExpandAnyDict.asData(hashMap26))
        array2[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array2[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array[n] = array2
        val n3 = 1
        val array3 = arrayOfNulls<IIngredient>(3)
        val n4 = 0
        val item27 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap27 = HashMap<String, IData>()
        hashMap27["meta"] = ExpandInt.toData(0)
        array3[n4] = item27.withTag(ExpandAnyDict.asData(hashMap27))
        array3[1] = OreBracketHandler.getOre("ringAnyIron")
        array3[2] = OreBracketHandler.getOre("screwAnyIron")
        array[n3] = array3
        val n5 = 2
        val array4 = arrayOfNulls<IIngredient>(3)
        val n6 = 0
        val item28 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap28 = HashMap<String, IData>()
        hashMap28["meta"] = ExpandInt.toData(0)
        array4[n6] = item28.withTag(ExpandAnyDict.asData(hashMap28))
        val n7 = 1
        val item29 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap29 = HashMap<String, IData>()
        hashMap29["meta"] = ExpandInt.toData(0)
        array4[n7] = item29.withTag(ExpandAnyDict.asData(hashMap29))
        array4[2] = OreBracketHandler.getOre("craftingToolSaw")
        array[n5] = array4
        recipes25.addShaped(withTag, array, null)
        val recipes26 = MineTweakerAPI.recipes
        val item30 = ItemBracketHandler.getItem("ExtraTrees:door", 32)
        val hashMap30 = HashMap<String, IData>()
        hashMap30["meta"] = ExpandInt.toData(32)
        val withTag2 = item30.withTag(ExpandAnyDict.asData(hashMap30))
        val array5: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n8 = 0
        val array6 = arrayOfNulls<IIngredient>(3)
        val n9 = 0
        val item31 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap31 = HashMap<String, IData>()
        hashMap31["meta"] = ExpandInt.toData(0)
        array6[n9] = item31.withTag(ExpandAnyDict.asData(hashMap31))
        array6[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array6[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array5[n8] = array6
        val n10 = 1
        val array7 = arrayOfNulls<IIngredient>(3)
        val n11 = 0
        val item32 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap32 = HashMap<String, IData>()
        hashMap32["meta"] = ExpandInt.toData(0)
        array7[n11] = item32.withTag(ExpandAnyDict.asData(hashMap32))
        array7[1] = OreBracketHandler.getOre("ringCopper")
        array7[2] = OreBracketHandler.getOre("screwCopper")
        array5[n10] = array7
        val n12 = 2
        val array8 = arrayOfNulls<IIngredient>(3)
        val n13 = 0
        val item33 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap33 = HashMap<String, IData>()
        hashMap33["meta"] = ExpandInt.toData(0)
        array8[n13] = item33.withTag(ExpandAnyDict.asData(hashMap33))
        val n14 = 1
        val item34 = ItemBracketHandler.getItem("ExtraTrees:planks", 0)
        val hashMap34 = HashMap<String, IData>()
        hashMap34["meta"] = ExpandInt.toData(0)
        array8[n14] = item34.withTag(ExpandAnyDict.asData(hashMap34))
        array8[2] = OreBracketHandler.getOre("craftingToolSaw")
        array5[n12] = array8
        recipes26.addShaped(withTag2, array5, null)
        val recipes27 = MineTweakerAPI.recipes
        val item35 = ItemBracketHandler.getItem("ExtraTrees:door", 288)
        val hashMap35 = HashMap<String, IData>()
        hashMap35["meta"] = ExpandInt.toData(288)
        val withTag3 = item35.withTag(ExpandAnyDict.asData(hashMap35))
        val array9: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n15 = 0
        val array10 = arrayOf<IIngredient?>(null, null, null)
        val n16 = 1
        val item36 = ItemBracketHandler.getItem("ExtraTrees:door", 32)
        val hashMap36 = HashMap<String, IData>()
        hashMap36["meta"] = ExpandInt.toData(32)
        array10[n16] = item36.withTag(ExpandAnyDict.asData(hashMap36))
        array10[2] = null
        array9[n15] = array10
        array9[1] = arrayOfNulls(3)
        array9[2] = arrayOfNulls(3)
        recipes27.addShaped(withTag3, array9, null)
        val recipes28 = MineTweakerAPI.recipes
        val item37 = ItemBracketHandler.getItem("ExtraTrees:door", 544)
        val hashMap37 = HashMap<String, IData>()
        hashMap37["meta"] = ExpandInt.toData(544)
        val withTag4 = item37.withTag(ExpandAnyDict.asData(hashMap37))
        val array11: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n17 = 0
        val array12 = arrayOf<IIngredient?>(null, null, null)
        val n18 = 2
        val item38 = ItemBracketHandler.getItem("ExtraTrees:door", 32)
        val hashMap38 = HashMap<String, IData>()
        hashMap38["meta"] = ExpandInt.toData(32)
        array12[n18] = item38.withTag(ExpandAnyDict.asData(hashMap38))
        array11[n17] = array12
        array11[1] = arrayOfNulls(3)
        array11[2] = arrayOfNulls(3)
        recipes28.addShaped(withTag4, array11, null)
        val recipes29 = MineTweakerAPI.recipes
        val item39 = ItemBracketHandler.getItem("ExtraTrees:door", 790)
        val hashMap39 = HashMap<String, IData>()
        hashMap39["meta"] = ExpandInt.toData(790)
        val withTag5 = item39.withTag(ExpandAnyDict.asData(hashMap39))
        val array13 = arrayOf(arrayOf<IIngredient?>(null, null, null), null, null)
        val n19 = 1
        val array14 = arrayOfNulls<IIngredient>(3)
        val n20 = 0
        val item40 = ItemBracketHandler.getItem("ExtraTrees:door", 32)
        val hashMap40 = HashMap<String, IData>()
        hashMap40["meta"] = ExpandInt.toData(32)
        array14[n20] = item40.withTag(ExpandAnyDict.asData(hashMap40))
        array14[2] = null.also { array14[1] = it }
        array13[n19] = array14
        array13[2] = arrayOfNulls(3)
        recipes29.addShaped(withTag5, array13, null)
        val recipes30 = MineTweakerAPI.recipes
        val item41 = ItemBracketHandler.getItem("ExtraTrees:door", 33)
        val hashMap41 = HashMap<String, IData>()
        hashMap41["meta"] = ExpandInt.toData(33)
        val withTag6 = item41.withTag(ExpandAnyDict.asData(hashMap41))
        val array15: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n21 = 0
        val array16 = arrayOfNulls<IIngredient>(3)
        val n22 = 0
        val item42 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap42 = HashMap<String, IData>()
        hashMap42["meta"] = ExpandInt.toData(1)
        array16[n22] = item42.withTag(ExpandAnyDict.asData(hashMap42))
        array16[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array16[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array15[n21] = array16
        val n23 = 1
        val array17 = arrayOfNulls<IIngredient>(3)
        val n24 = 0
        val item43 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap43 = HashMap<String, IData>()
        hashMap43["meta"] = ExpandInt.toData(1)
        array17[n24] = item43.withTag(ExpandAnyDict.asData(hashMap43))
        array17[1] = OreBracketHandler.getOre("ringAnyIron")
        array17[2] = OreBracketHandler.getOre("screwAnyIron")
        array15[n23] = array17
        val n25 = 2
        val array18 = arrayOfNulls<IIngredient>(3)
        val n26 = 0
        val item44 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap44 = HashMap<String, IData>()
        hashMap44["meta"] = ExpandInt.toData(1)
        array18[n26] = item44.withTag(ExpandAnyDict.asData(hashMap44))
        val n27 = 1
        val item45 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap45 = HashMap<String, IData>()
        hashMap45["meta"] = ExpandInt.toData(1)
        array18[n27] = item45.withTag(ExpandAnyDict.asData(hashMap45))
        array18[2] = OreBracketHandler.getOre("craftingToolSaw")
        array15[n25] = array18
        recipes30.addShaped(withTag6, array15, null)
        val recipes31 = MineTweakerAPI.recipes
        val item46 = ItemBracketHandler.getItem("ExtraTrees:door", 33)
        val hashMap46 = HashMap<String, IData>()
        hashMap46["meta"] = ExpandInt.toData(33)
        val withTag7 = item46.withTag(ExpandAnyDict.asData(hashMap46))
        val array19: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n28 = 0
        val array20 = arrayOfNulls<IIngredient>(3)
        val n29 = 0
        val item47 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap47 = HashMap<String, IData>()
        hashMap47["meta"] = ExpandInt.toData(1)
        array20[n29] = item47.withTag(ExpandAnyDict.asData(hashMap47))
        array20[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array20[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array19[n28] = array20
        val n30 = 1
        val array21 = arrayOfNulls<IIngredient>(3)
        val n31 = 0
        val item48 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap48 = HashMap<String, IData>()
        hashMap48["meta"] = ExpandInt.toData(1)
        array21[n31] = item48.withTag(ExpandAnyDict.asData(hashMap48))
        array21[1] = OreBracketHandler.getOre("ringCopper")
        array21[2] = OreBracketHandler.getOre("screwCopper")
        array19[n30] = array21
        val n32 = 2
        val array22 = arrayOfNulls<IIngredient>(3)
        val n33 = 0
        val item49 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap49 = HashMap<String, IData>()
        hashMap49["meta"] = ExpandInt.toData(1)
        array22[n33] = item49.withTag(ExpandAnyDict.asData(hashMap49))
        val n34 = 1
        val item50 = ItemBracketHandler.getItem("ExtraTrees:planks", 1)
        val hashMap50 = HashMap<String, IData>()
        hashMap50["meta"] = ExpandInt.toData(1)
        array22[n34] = item50.withTag(ExpandAnyDict.asData(hashMap50))
        array22[2] = OreBracketHandler.getOre("craftingToolSaw")
        array19[n32] = array22
        recipes31.addShaped(withTag7, array19, null)
        val recipes32 = MineTweakerAPI.recipes
        val item51 = ItemBracketHandler.getItem("ExtraTrees:door", 289)
        val hashMap51 = HashMap<String, IData>()
        hashMap51["meta"] = ExpandInt.toData(289)
        val withTag8 = item51.withTag(ExpandAnyDict.asData(hashMap51))
        val array23: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n35 = 0
        val array24 = arrayOf<IIngredient?>(null, null, null)
        val n36 = 1
        val item52 = ItemBracketHandler.getItem("ExtraTrees:door", 33)
        val hashMap52 = HashMap<String, IData>()
        hashMap52["meta"] = ExpandInt.toData(33)
        array24[n36] = item52.withTag(ExpandAnyDict.asData(hashMap52))
        array24[2] = null
        array23[n35] = array24
        array23[1] = arrayOfNulls(3)
        array23[2] = arrayOfNulls(3)
        recipes32.addShaped(withTag8, array23, null)
        val recipes33 = MineTweakerAPI.recipes
        val item53 = ItemBracketHandler.getItem("ExtraTrees:door", 545)
        val hashMap53 = HashMap<String, IData>()
        hashMap53["meta"] = ExpandInt.toData(545)
        val withTag9 = item53.withTag(ExpandAnyDict.asData(hashMap53))
        val array25: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n37 = 0
        val array26 = arrayOf<IIngredient?>(null, null, null)
        val n38 = 2
        val item54 = ItemBracketHandler.getItem("ExtraTrees:door", 33)
        val hashMap54 = HashMap<String, IData>()
        hashMap54["meta"] = ExpandInt.toData(33)
        array26[n38] = item54.withTag(ExpandAnyDict.asData(hashMap54))
        array25[n37] = array26
        array25[1] = arrayOfNulls(3)
        array25[2] = arrayOfNulls(3)
        recipes33.addShaped(withTag9, array25, null)
        val recipes34 = MineTweakerAPI.recipes
        val item55 = ItemBracketHandler.getItem("ExtraTrees:door", 801)
        val hashMap55 = HashMap<String, IData>()
        hashMap55["meta"] = ExpandInt.toData(801)
        val withTag10 = item55.withTag(ExpandAnyDict.asData(hashMap55))
        val array27 = arrayOf(arrayOf<IIngredient?>(null, null, null), null, null)
        val n39 = 1
        val array28 = arrayOfNulls<IIngredient>(3)
        val n40 = 0
        val item56 = ItemBracketHandler.getItem("ExtraTrees:door", 33)
        val hashMap56 = HashMap<String, IData>()
        hashMap56["meta"] = ExpandInt.toData(33)
        array28[n40] = item56.withTag(ExpandAnyDict.asData(hashMap56))
        array28[2] = null.also { array28[1] = it }
        array27[n39] = array28
        array27[2] = arrayOfNulls(3)
        recipes34.addShaped(withTag10, array27, null)
        val recipes35 = MineTweakerAPI.recipes
        val item57 = ItemBracketHandler.getItem("ExtraTrees:door", 34)
        val hashMap57 = HashMap<String, IData>()
        hashMap57["meta"] = ExpandInt.toData(34)
        val withTag11 = item57.withTag(ExpandAnyDict.asData(hashMap57))
        val array29: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n41 = 0
        val array30 = arrayOfNulls<IIngredient>(3)
        val n42 = 0
        val item58 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap58 = HashMap<String, IData>()
        hashMap58["meta"] = ExpandInt.toData(2)
        array30[n42] = item58.withTag(ExpandAnyDict.asData(hashMap58))
        array30[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array30[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array29[n41] = array30
        val n43 = 1
        val array31 = arrayOfNulls<IIngredient>(3)
        val n44 = 0
        val item59 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap59 = HashMap<String, IData>()
        hashMap59["meta"] = ExpandInt.toData(2)
        array31[n44] = item59.withTag(ExpandAnyDict.asData(hashMap59))
        array31[1] = OreBracketHandler.getOre("ringAnyIron")
        array31[2] = OreBracketHandler.getOre("screwAnyIron")
        array29[n43] = array31
        val n45 = 2
        val array32 = arrayOfNulls<IIngredient>(3)
        val n46 = 0
        val item60 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap60 = HashMap<String, IData>()
        hashMap60["meta"] = ExpandInt.toData(2)
        array32[n46] = item60.withTag(ExpandAnyDict.asData(hashMap60))
        val n47 = 1
        val item61 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap61 = HashMap<String, IData>()
        hashMap61["meta"] = ExpandInt.toData(2)
        array32[n47] = item61.withTag(ExpandAnyDict.asData(hashMap61))
        array32[2] = OreBracketHandler.getOre("craftingToolSaw")
        array29[n45] = array32
        recipes35.addShaped(withTag11, array29, null)
        val recipes36 = MineTweakerAPI.recipes
        val item62 = ItemBracketHandler.getItem("ExtraTrees:door", 34)
        val hashMap62 = HashMap<String, IData>()
        hashMap62["meta"] = ExpandInt.toData(34)
        val withTag12 = item62.withTag(ExpandAnyDict.asData(hashMap62))
        val array33: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n48 = 0
        val array34 = arrayOfNulls<IIngredient>(3)
        val n49 = 0
        val item63 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap63 = HashMap<String, IData>()
        hashMap63["meta"] = ExpandInt.toData(2)
        array34[n49] = item63.withTag(ExpandAnyDict.asData(hashMap63))
        array34[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array34[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array33[n48] = array34
        val n50 = 1
        val array35 = arrayOfNulls<IIngredient>(3)
        val n51 = 0
        val item64 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap64 = HashMap<String, IData>()
        hashMap64["meta"] = ExpandInt.toData(2)
        array35[n51] = item64.withTag(ExpandAnyDict.asData(hashMap64))
        array35[1] = OreBracketHandler.getOre("ringCopper")
        array35[2] = OreBracketHandler.getOre("screwCopper")
        array33[n50] = array35
        val n52 = 2
        val array36 = arrayOfNulls<IIngredient>(3)
        val n53 = 0
        val item65 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap65 = HashMap<String, IData>()
        hashMap65["meta"] = ExpandInt.toData(2)
        array36[n53] = item65.withTag(ExpandAnyDict.asData(hashMap65))
        val n54 = 1
        val item66 = ItemBracketHandler.getItem("ExtraTrees:planks", 2)
        val hashMap66 = HashMap<String, IData>()
        hashMap66["meta"] = ExpandInt.toData(2)
        array36[n54] = item66.withTag(ExpandAnyDict.asData(hashMap66))
        array36[2] = OreBracketHandler.getOre("craftingToolSaw")
        array33[n52] = array36
        recipes36.addShaped(withTag12, array33, null)
        val recipes37 = MineTweakerAPI.recipes
        val item67 = ItemBracketHandler.getItem("ExtraTrees:door", 290)
        val hashMap67 = HashMap<String, IData>()
        hashMap67["meta"] = ExpandInt.toData(290)
        val withTag13 = item67.withTag(ExpandAnyDict.asData(hashMap67))
        val array37: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n55 = 0
        val array38 = arrayOf<IIngredient?>(null, null, null)
        val n56 = 1
        val item68 = ItemBracketHandler.getItem("ExtraTrees:door", 34)
        val hashMap68 = HashMap<String, IData>()
        hashMap68["meta"] = ExpandInt.toData(34)
        array38[n56] = item68.withTag(ExpandAnyDict.asData(hashMap68))
        array38[2] = null
        array37[n55] = array38
        array37[1] = arrayOfNulls(3)
        array37[2] = arrayOfNulls(3)
        recipes37.addShaped(withTag13, array37, null)
        val recipes38 = MineTweakerAPI.recipes
        val item69 = ItemBracketHandler.getItem("ExtraTrees:door", 546)
        val hashMap69 = HashMap<String, IData>()
        hashMap69["meta"] = ExpandInt.toData(546)
        val withTag14 = item69.withTag(ExpandAnyDict.asData(hashMap69))
        val array39: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n57 = 0
        val array40 = arrayOf<IIngredient?>(null, null, null)
        val n58 = 2
        val item70 = ItemBracketHandler.getItem("ExtraTrees:door", 34)
        val hashMap70 = HashMap<String, IData>()
        hashMap70["meta"] = ExpandInt.toData(34)
        array40[n58] = item70.withTag(ExpandAnyDict.asData(hashMap70))
        array39[n57] = array40
        array39[1] = arrayOfNulls(3)
        array39[2] = arrayOfNulls(3)
        recipes38.addShaped(withTag14, array39, null)
        val recipes39 = MineTweakerAPI.recipes
        val item71 = ItemBracketHandler.getItem("ExtraTrees:door", 802)
        val hashMap71 = HashMap<String, IData>()
        hashMap71["meta"] = ExpandInt.toData(802)
        val withTag15 = item71.withTag(ExpandAnyDict.asData(hashMap71))
        val array41 = arrayOf(arrayOf<IIngredient?>(null, null, null), null, null)
        val n59 = 1
        val array42 = arrayOfNulls<IIngredient>(3)
        val n60 = 0
        val item72 = ItemBracketHandler.getItem("ExtraTrees:door", 34)
        val hashMap72 = HashMap<String, IData>()
        hashMap72["meta"] = ExpandInt.toData(34)
        array42[n60] = item72.withTag(ExpandAnyDict.asData(hashMap72))
        array42[2] = null.also { array42[1] = it }
        array41[n59] = array42
        array41[2] = arrayOfNulls(3)
        recipes39.addShaped(withTag15, array41, null)
        val recipes40 = MineTweakerAPI.recipes
        val item73 = ItemBracketHandler.getItem("ExtraTrees:door", 35)
        val hashMap73 = HashMap<String, IData>()
        hashMap73["meta"] = ExpandInt.toData(35)
        val withTag16 = item73.withTag(ExpandAnyDict.asData(hashMap73))
        val array43: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n61 = 0
        val array44 = arrayOfNulls<IIngredient>(3)
        val n62 = 0
        val item74 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap74 = HashMap<String, IData>()
        hashMap74["meta"] = ExpandInt.toData(3)
        array44[n62] = item74.withTag(ExpandAnyDict.asData(hashMap74))
        array44[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array44[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array43[n61] = array44
        val n63 = 1
        val array45 = arrayOfNulls<IIngredient>(3)
        val n64 = 0
        val item75 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap75 = HashMap<String, IData>()
        hashMap75["meta"] = ExpandInt.toData(3)
        array45[n64] = item75.withTag(ExpandAnyDict.asData(hashMap75))
        array45[1] = OreBracketHandler.getOre("ringAnyIron")
        array45[2] = OreBracketHandler.getOre("screwAnyIron")
        array43[n63] = array45
        val n65 = 2
        val array46 = arrayOfNulls<IIngredient>(3)
        val n66 = 0
        val item76 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap76 = HashMap<String, IData>()
        hashMap76["meta"] = ExpandInt.toData(3)
        array46[n66] = item76.withTag(ExpandAnyDict.asData(hashMap76))
        val n67 = 1
        val item77 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap77 = HashMap<String, IData>()
        hashMap77["meta"] = ExpandInt.toData(3)
        array46[n67] = item77.withTag(ExpandAnyDict.asData(hashMap77))
        array46[2] = OreBracketHandler.getOre("craftingToolSaw")
        array43[n65] = array46
        recipes40.addShaped(withTag16, array43, null)
        val recipes41 = MineTweakerAPI.recipes
        val item78 = ItemBracketHandler.getItem("ExtraTrees:door", 35)
        val hashMap78 = HashMap<String, IData>()
        hashMap78["meta"] = ExpandInt.toData(35)
        val withTag17 = item78.withTag(ExpandAnyDict.asData(hashMap78))
        val array47: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n68 = 0
        val array48 = arrayOfNulls<IIngredient>(3)
        val n69 = 0
        val item79 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap79 = HashMap<String, IData>()
        hashMap79["meta"] = ExpandInt.toData(3)
        array48[n69] = item79.withTag(ExpandAnyDict.asData(hashMap79))
        array48[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array48[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array47[n68] = array48
        val n70 = 1
        val array49 = arrayOfNulls<IIngredient>(3)
        val n71 = 0
        val item80 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap80 = HashMap<String, IData>()
        hashMap80["meta"] = ExpandInt.toData(3)
        array49[n71] = item80.withTag(ExpandAnyDict.asData(hashMap80))
        array49[1] = OreBracketHandler.getOre("ringCopper")
        array49[2] = OreBracketHandler.getOre("screwCopper")
        array47[n70] = array49
        val n72 = 2
        val array50 = arrayOfNulls<IIngredient>(3)
        val n73 = 0
        val item81 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap81 = HashMap<String, IData>()
        hashMap81["meta"] = ExpandInt.toData(3)
        array50[n73] = item81.withTag(ExpandAnyDict.asData(hashMap81))
        val n74 = 1
        val item82 = ItemBracketHandler.getItem("ExtraTrees:planks", 3)
        val hashMap82 = HashMap<String, IData>()
        hashMap82["meta"] = ExpandInt.toData(3)
        array50[n74] = item82.withTag(ExpandAnyDict.asData(hashMap82))
        array50[2] = OreBracketHandler.getOre("craftingToolSaw")
        array47[n72] = array50
        recipes41.addShaped(withTag17, array47, null)
        val recipes42 = MineTweakerAPI.recipes
        val item83 = ItemBracketHandler.getItem("ExtraTrees:door", 291)
        val hashMap83 = HashMap<String, IData>()
        hashMap83["meta"] = ExpandInt.toData(291)
        val withTag18 = item83.withTag(ExpandAnyDict.asData(hashMap83))
        val array51: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n75 = 0
        val array52 = arrayOf<IIngredient?>(null, null, null)
        val n76 = 1
        val item84 = ItemBracketHandler.getItem("ExtraTrees:door", 35)
        val hashMap84 = HashMap<String, IData>()
        hashMap84["meta"] = ExpandInt.toData(35)
        array52[n76] = item84.withTag(ExpandAnyDict.asData(hashMap84))
        array52[2] = null
        array51[n75] = array52
        array51[1] = arrayOfNulls(3)
        array51[2] = arrayOfNulls(3)
        recipes42.addShaped(withTag18, array51, null)
        val recipes43 = MineTweakerAPI.recipes
        val item85 = ItemBracketHandler.getItem("ExtraTrees:door", 547)
        val hashMap85 = HashMap<String, IData>()
        hashMap85["meta"] = ExpandInt.toData(547)
        val withTag19 = item85.withTag(ExpandAnyDict.asData(hashMap85))
        val array53: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n77 = 0
        val array54 = arrayOf<IIngredient?>(null, null, null)
        val n78 = 2
        val item86 = ItemBracketHandler.getItem("ExtraTrees:door", 35)
        val hashMap86 = HashMap<String, IData>()
        hashMap86["meta"] = ExpandInt.toData(35)
        array54[n78] = item86.withTag(ExpandAnyDict.asData(hashMap86))
        array53[n77] = array54
        array53[1] = arrayOfNulls(3)
        array53[2] = arrayOfNulls(3)
        recipes43.addShaped(withTag19, array53, null)
        val recipes44 = MineTweakerAPI.recipes
        val item87 = ItemBracketHandler.getItem("ExtraTrees:door", 803)
        val hashMap87 = HashMap<String, IData>()
        hashMap87["meta"] = ExpandInt.toData(803)
        val withTag20 = item87.withTag(ExpandAnyDict.asData(hashMap87))
        val array55 = arrayOf(arrayOf<IIngredient?>(null, null, null), null, null)
        val n79 = 1
        val array56 = arrayOfNulls<IIngredient>(3)
        val n80 = 0
        val item88 = ItemBracketHandler.getItem("ExtraTrees:door", 35)
        val hashMap88 = HashMap<String, IData>()
        hashMap88["meta"] = ExpandInt.toData(35)
        array56[n80] = item88.withTag(ExpandAnyDict.asData(hashMap88))
        array56[2] = null.also { array56[1] = it }
        array55[n79] = array56
        array55[2] = arrayOfNulls(3)
        recipes44.addShaped(withTag20, array55, null)
        val recipes45 = MineTweakerAPI.recipes
        val item89 = ItemBracketHandler.getItem("ExtraTrees:door", 36)
        val hashMap89 = HashMap<String, IData>()
        hashMap89["meta"] = ExpandInt.toData(36)
        val withTag21 = item89.withTag(ExpandAnyDict.asData(hashMap89))
        val array57: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n81 = 0
        val array58 = arrayOfNulls<IIngredient>(3)
        val n82 = 0
        val item90 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap90 = HashMap<String, IData>()
        hashMap90["meta"] = ExpandInt.toData(4)
        array58[n82] = item90.withTag(ExpandAnyDict.asData(hashMap90))
        array58[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array58[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array57[n81] = array58
        val n83 = 1
        val array59 = arrayOfNulls<IIngredient>(3)
        val n84 = 0
        val item91 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap91 = HashMap<String, IData>()
        hashMap91["meta"] = ExpandInt.toData(4)
        array59[n84] = item91.withTag(ExpandAnyDict.asData(hashMap91))
        array59[1] = OreBracketHandler.getOre("ringAnyIron")
        array59[2] = OreBracketHandler.getOre("screwAnyIron")
        array57[n83] = array59
        val n85 = 2
        val array60 = arrayOfNulls<IIngredient>(3)
        val n86 = 0
        val item92 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap92 = HashMap<String, IData>()
        hashMap92["meta"] = ExpandInt.toData(4)
        array60[n86] = item92.withTag(ExpandAnyDict.asData(hashMap92))
        val n87 = 1
        val item93 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap93 = HashMap<String, IData>()
        hashMap93["meta"] = ExpandInt.toData(4)
        array60[n87] = item93.withTag(ExpandAnyDict.asData(hashMap93))
        array60[2] = OreBracketHandler.getOre("craftingToolSaw")
        array57[n85] = array60
        recipes45.addShaped(withTag21, array57, null)
        val recipes46 = MineTweakerAPI.recipes
        val item94 = ItemBracketHandler.getItem("ExtraTrees:door", 36)
        val hashMap94 = HashMap<String, IData>()
        hashMap94["meta"] = ExpandInt.toData(36)
        val withTag22 = item94.withTag(ExpandAnyDict.asData(hashMap94))
        val array61: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n88 = 0
        val array62 = arrayOfNulls<IIngredient>(3)
        val n89 = 0
        val item95 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap95 = HashMap<String, IData>()
        hashMap95["meta"] = ExpandInt.toData(4)
        array62[n89] = item95.withTag(ExpandAnyDict.asData(hashMap95))
        array62[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array62[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array61[n88] = array62
        val n90 = 1
        val array63 = arrayOfNulls<IIngredient>(3)
        val n91 = 0
        val item96 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap96 = HashMap<String, IData>()
        hashMap96["meta"] = ExpandInt.toData(4)
        array63[n91] = item96.withTag(ExpandAnyDict.asData(hashMap96))
        array63[1] = OreBracketHandler.getOre("ringCopper")
        array63[2] = OreBracketHandler.getOre("screwCopper")
        array61[n90] = array63
        val n92 = 2
        val array64 = arrayOfNulls<IIngredient>(3)
        val n93 = 0
        val item97 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap97 = HashMap<String, IData>()
        hashMap97["meta"] = ExpandInt.toData(4)
        array64[n93] = item97.withTag(ExpandAnyDict.asData(hashMap97))
        val n94 = 1
        val item98 = ItemBracketHandler.getItem("ExtraTrees:planks", 4)
        val hashMap98 = HashMap<String, IData>()
        hashMap98["meta"] = ExpandInt.toData(4)
        array64[n94] = item98.withTag(ExpandAnyDict.asData(hashMap98))
        array64[2] = OreBracketHandler.getOre("craftingToolSaw")
        array61[n92] = array64
        recipes46.addShaped(withTag22, array61, null)
        val recipes47 = MineTweakerAPI.recipes
        val item99 = ItemBracketHandler.getItem("ExtraTrees:door", 292)
        val hashMap99 = HashMap<String, IData>()
        hashMap99["meta"] = ExpandInt.toData(292)
        val withTag23 = item99.withTag(ExpandAnyDict.asData(hashMap99))
        val array65: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n95 = 0
        val array66 = arrayOf<IIngredient?>(null, null, null)
        val n96 = 1
        val item100 = ItemBracketHandler.getItem("ExtraTrees:door", 36)
        val hashMap100 = HashMap<String, IData>()
        hashMap100["meta"] = ExpandInt.toData(36)
        array66[n96] = item100.withTag(ExpandAnyDict.asData(hashMap100))
        array66[2] = null
        array65[n95] = array66
        array65[1] = arrayOfNulls(3)
        array65[2] = arrayOfNulls(3)
        recipes47.addShaped(withTag23, array65, null)
        val recipes48 = MineTweakerAPI.recipes
        val item101 = ItemBracketHandler.getItem("ExtraTrees:door", 548)
        val hashMap101 = HashMap<String, IData>()
        hashMap101["meta"] = ExpandInt.toData(548)
        val withTag24 = item101.withTag(ExpandAnyDict.asData(hashMap101))
        val array67: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n97 = 0
        val array68 = arrayOf<IIngredient?>(null, null, null)
        val n98 = 2
        val item102 = ItemBracketHandler.getItem("ExtraTrees:door", 36)
        val hashMap102 = HashMap<String, IData>()
        hashMap102["meta"] = ExpandInt.toData(36)
        array68[n98] = item102.withTag(ExpandAnyDict.asData(hashMap102))
        array67[n97] = array68
        array67[1] = arrayOfNulls(3)
        array67[2] = arrayOfNulls(3)
        recipes48.addShaped(withTag24, array67, null)
        val recipes49 = MineTweakerAPI.recipes
        val item103 = ItemBracketHandler.getItem("ExtraTrees:door", 804)
        val hashMap103 = HashMap<String, IData>()
        hashMap103["meta"] = ExpandInt.toData(804)
        val withTag25 = item103.withTag(ExpandAnyDict.asData(hashMap103))
        val array69 = arrayOf(arrayOf<IIngredient?>(null, null, null), null, null)
        val n99 = 1
        val array70 = arrayOfNulls<IIngredient>(3)
        val n100 = 0
        val item104 = ItemBracketHandler.getItem("ExtraTrees:door", 36)
        val hashMap104 = HashMap<String, IData>()
        hashMap104["meta"] = ExpandInt.toData(36)
        array70[n100] = item104.withTag(ExpandAnyDict.asData(hashMap104))
        array70[2] = null.also { array70[1] = it }
        array69[n99] = array70
        array69[2] = arrayOfNulls(3)
        recipes49.addShaped(withTag25, array69, null)
        val recipes50 = MineTweakerAPI.recipes
        val item105 = ItemBracketHandler.getItem("ExtraTrees:door", 37)
        val hashMap105 = HashMap<String, IData>()
        hashMap105["meta"] = ExpandInt.toData(37)
        val withTag26 = item105.withTag(ExpandAnyDict.asData(hashMap105))
        val array71: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n101 = 0
        val array72 = arrayOfNulls<IIngredient>(3)
        val n102 = 0
        val item106 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap106 = HashMap<String, IData>()
        hashMap106["meta"] = ExpandInt.toData(5)
        array72[n102] = item106.withTag(ExpandAnyDict.asData(hashMap106))
        array72[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array72[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array71[n101] = array72
        val n103 = 1
        val array73 = arrayOfNulls<IIngredient>(3)
        val n104 = 0
        val item107 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap107 = HashMap<String, IData>()
        hashMap107["meta"] = ExpandInt.toData(5)
        array73[n104] = item107.withTag(ExpandAnyDict.asData(hashMap107))
        array73[1] = OreBracketHandler.getOre("ringAnyIron")
        array73[2] = OreBracketHandler.getOre("screwAnyIron")
        array71[n103] = array73
        val n105 = 2
        val array74 = arrayOfNulls<IIngredient>(3)
        val n106 = 0
        val item108 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap108 = HashMap<String, IData>()
        hashMap108["meta"] = ExpandInt.toData(5)
        array74[n106] = item108.withTag(ExpandAnyDict.asData(hashMap108))
        val n107 = 1
        val item109 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap109 = HashMap<String, IData>()
        hashMap109["meta"] = ExpandInt.toData(5)
        array74[n107] = item109.withTag(ExpandAnyDict.asData(hashMap109))
        array74[2] = OreBracketHandler.getOre("craftingToolSaw")
        array71[n105] = array74
        recipes50.addShaped(withTag26, array71, null)
        val recipes51 = MineTweakerAPI.recipes
        val item110 = ItemBracketHandler.getItem("ExtraTrees:door", 37)
        val hashMap110 = HashMap<String, IData>()
        hashMap110["meta"] = ExpandInt.toData(37)
        val withTag27 = item110.withTag(ExpandAnyDict.asData(hashMap110))
        val array75: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n108 = 0
        val array76 = arrayOfNulls<IIngredient>(3)
        val n109 = 0
        val item111 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap111 = HashMap<String, IData>()
        hashMap111["meta"] = ExpandInt.toData(5)
        array76[n109] = item111.withTag(ExpandAnyDict.asData(hashMap111))
        array76[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array76[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array75[n108] = array76
        val n110 = 1
        val array77 = arrayOfNulls<IIngredient>(3)
        val n111 = 0
        val item112 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap112 = HashMap<String, IData>()
        hashMap112["meta"] = ExpandInt.toData(5)
        array77[n111] = item112.withTag(ExpandAnyDict.asData(hashMap112))
        array77[1] = OreBracketHandler.getOre("ringCopper")
        array77[2] = OreBracketHandler.getOre("screwCopper")
        array75[n110] = array77
        val n112 = 2
        val array78 = arrayOfNulls<IIngredient>(3)
        val n113 = 0
        val item113 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap113 = HashMap<String, IData>()
        hashMap113["meta"] = ExpandInt.toData(5)
        array78[n113] = item113.withTag(ExpandAnyDict.asData(hashMap113))
        val n114 = 1
        val item114 = ItemBracketHandler.getItem("ExtraTrees:planks", 5)
        val hashMap114 = HashMap<String, IData>()
        hashMap114["meta"] = ExpandInt.toData(5)
        array78[n114] = item114.withTag(ExpandAnyDict.asData(hashMap114))
        array78[2] = OreBracketHandler.getOre("craftingToolSaw")
        array75[n112] = array78
        recipes51.addShaped(withTag27, array75, null)
        val recipes52 = MineTweakerAPI.recipes
        val item115 = ItemBracketHandler.getItem("ExtraTrees:door", 293)
        val hashMap115 = HashMap<String, IData>()
        hashMap115["meta"] = ExpandInt.toData(293)
        val withTag28 = item115.withTag(ExpandAnyDict.asData(hashMap115))
        val array79: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n115 = 0
        val array80 = arrayOf<IIngredient?>(null, null, null)
        val n116 = 1
        val item116 = ItemBracketHandler.getItem("ExtraTrees:door", 37)
        val hashMap116 = HashMap<String, IData>()
        hashMap116["meta"] = ExpandInt.toData(37)
        array80[n116] = item116.withTag(ExpandAnyDict.asData(hashMap116))
        array80[2] = null
        array79[n115] = array80
        array79[1] = arrayOfNulls(3)
        array79[2] = arrayOfNulls(3)
        recipes52.addShaped(withTag28, array79, null)
        val recipes53 = MineTweakerAPI.recipes
        val item117 = ItemBracketHandler.getItem("ExtraTrees:door", 549)
        val hashMap117 = HashMap<String, IData>()
        hashMap117["meta"] = ExpandInt.toData(549)
        val withTag29 = item117.withTag(ExpandAnyDict.asData(hashMap117))
        val array81: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n117 = 0
        val array82 = arrayOf<IIngredient?>(null, null, null)
        val n118 = 2
        val item118 = ItemBracketHandler.getItem("ExtraTrees:door", 37)
        val hashMap118 = HashMap<String, IData>()
        hashMap118["meta"] = ExpandInt.toData(37)
        array82[n118] = item118.withTag(ExpandAnyDict.asData(hashMap118))
        array81[n117] = array82
        array81[1] = arrayOfNulls(3)
        array81[2] = arrayOfNulls(3)
        recipes53.addShaped(withTag29, array81, null)
        val recipes54 = MineTweakerAPI.recipes
        val item119 = ItemBracketHandler.getItem("ExtraTrees:door", 805)
        val hashMap119 = HashMap<String, IData>()
        hashMap119["meta"] = ExpandInt.toData(805)
        val withTag30 = item119.withTag(ExpandAnyDict.asData(hashMap119))
        val array83 = arrayOf(arrayOf<IIngredient?>(null, null, null), null, null)
        val n119 = 1
        val array84 = arrayOfNulls<IIngredient>(3)
        val n120 = 0
        val item120 = ItemBracketHandler.getItem("ExtraTrees:door", 37)
        val hashMap120 = HashMap<String, IData>()
        hashMap120["meta"] = ExpandInt.toData(37)
        array84[n120] = item120.withTag(ExpandAnyDict.asData(hashMap120))
        array84[2] = null.also { array84[1] = it }
        array83[n119] = array84
        array83[2] = arrayOfNulls(3)
        recipes54.addShaped(withTag30, array83, null)
        val recipes55 = MineTweakerAPI.recipes
        val item121 = ItemBracketHandler.getItem("ExtraTrees:door", 38)
        val hashMap121 = HashMap<String, IData>()
        hashMap121["meta"] = ExpandInt.toData(38)
        val withTag31 = item121.withTag(ExpandAnyDict.asData(hashMap121))
        val array85: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n121 = 0
        val array86 = arrayOfNulls<IIngredient>(3)
        val n122 = 0
        val item122 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap122 = HashMap<String, IData>()
        hashMap122["meta"] = ExpandInt.toData(6)
        array86[n122] = item122.withTag(ExpandAnyDict.asData(hashMap122))
        array86[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array86[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array85[n121] = array86
        val n123 = 1
        val array87 = arrayOfNulls<IIngredient>(3)
        val n124 = 0
        val item123 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap123 = HashMap<String, IData>()
        hashMap123["meta"] = ExpandInt.toData(6)
        array87[n124] = item123.withTag(ExpandAnyDict.asData(hashMap123))
        array87[1] = OreBracketHandler.getOre("ringAnyIron")
        array87[2] = OreBracketHandler.getOre("screwAnyIron")
        array85[n123] = array87
        val n125 = 2
        val array88 = arrayOfNulls<IIngredient>(3)
        val n126 = 0
        val item124 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap124 = HashMap<String, IData>()
        hashMap124["meta"] = ExpandInt.toData(6)
        array88[n126] = item124.withTag(ExpandAnyDict.asData(hashMap124))
        val n127 = 1
        val item125 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap125 = HashMap<String, IData>()
        hashMap125["meta"] = ExpandInt.toData(6)
        array88[n127] = item125.withTag(ExpandAnyDict.asData(hashMap125))
        array88[2] = OreBracketHandler.getOre("craftingToolSaw")
        array85[n125] = array88
        recipes55.addShaped(withTag31, array85, null)
        val recipes56 = MineTweakerAPI.recipes
        val item126 = ItemBracketHandler.getItem("ExtraTrees:door", 38)
        val hashMap126 = HashMap<String, IData>()
        hashMap126["meta"] = ExpandInt.toData(38)
        val withTag32 = item126.withTag(ExpandAnyDict.asData(hashMap126))
        val array89: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n128 = 0
        val array90 = arrayOfNulls<IIngredient>(3)
        val n129 = 0
        val item127 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap127 = HashMap<String, IData>()
        hashMap127["meta"] = ExpandInt.toData(6)
        array90[n129] = item127.withTag(ExpandAnyDict.asData(hashMap127))
        array90[1] = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        array90[2] = OreBracketHandler.getOre("craftingToolScrewdriver")
        array89[n128] = array90
        val n130 = 1
        val array91 = arrayOfNulls<IIngredient>(3)
        val n131 = 0
        val item128 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap128 = HashMap<String, IData>()
        hashMap128["meta"] = ExpandInt.toData(6)
        array91[n131] = item128.withTag(ExpandAnyDict.asData(hashMap128))
        array91[1] = OreBracketHandler.getOre("ringCopper")
        array91[2] = OreBracketHandler.getOre("screwCopper")
        array89[n130] = array91
        val n132 = 2
        val array92 = arrayOfNulls<IIngredient>(3)
        val n133 = 0
        val item129 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap129 = HashMap<String, IData>()
        hashMap129["meta"] = ExpandInt.toData(6)
        array92[n133] = item129.withTag(ExpandAnyDict.asData(hashMap129))
        val n134 = 1
        val item130 = ItemBracketHandler.getItem("ExtraTrees:planks", 6)
        val hashMap130 = HashMap<String, IData>()
        hashMap130["meta"] = ExpandInt.toData(6)
        array92[n134] = item130.withTag(ExpandAnyDict.asData(hashMap130))
        array92[2] = OreBracketHandler.getOre("craftingToolSaw")
        array89[n132] = array92
        recipes56.addShaped(withTag32, array89, null)
    }
}