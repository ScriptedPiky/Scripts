package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Brewery
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientCondition
import minetweaker.api.tooltip.IngredientTooltips
import minetweaker.expand.*
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import java.util.*

class AdvancedBackpacks : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:machete", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:adventureHat", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackHose", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:copterPack", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:pistonBoots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:adventureSuit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:adventurePants", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:clockworkCrossbow", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:coalJetpack", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("adventurebackpack:melonJuiceBottle", 0))
        val recipes = MineTweakerAPI.recipes
        val item = ItemBracketHandler.getItem("adventurebackpack:adventureBackpack", 0)
        val hashMap = HashMap<String, IData>()
        val s = "wearableData"
        val hashMap2 = HashMap<String, IData>()
        hashMap2["type"] = ExpandByte.asData(0.toByte())
        hashMap[s] = ExpandAnyDict.asData(hashMap2)
        recipes.addShaped(item.withTag(ExpandAnyDict.asData(hashMap)), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("materialHardenedleather"), OreBracketHandler.getOre("plateAluminium"), OreBracketHandler.getOre("materialHardenedleather")), arrayOf(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 2), OreBracketHandler.getOre("chestIron"), ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 2)), arrayOf(OreBracketHandler.getOre("materialHardenedleather"), ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 1), OreBracketHandler.getOre("materialHardenedleather"))), null)
        val recipes2 = MineTweakerAPI.recipes
        val item2 = ItemBracketHandler.getItem("adventurebackpack:adventureBackpack", 0)
        val hashMap3 = HashMap<String, IData>()
        val s2 = "wearableData"
        val hashMap4 = HashMap<String, IData>()
        hashMap4["type"] = ExpandByte.asData(0.toByte())
        hashMap3[s2] = ExpandAnyDict.asData(hashMap4)
        recipes2.addShaped(item2.withTag(ExpandAnyDict.asData(hashMap3)), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("materialHardenedleather"), OreBracketHandler.getOre("plateAluminium"), OreBracketHandler.getOre("materialHardenedleather")), arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0), OreBracketHandler.getOre("chestIron"), ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)), arrayOf(OreBracketHandler.getOre("materialHardenedleather"), ItemBracketHandler.getItem("sleepingbag:sleepingBag", 0), OreBracketHandler.getOre("materialHardenedleather"))), null)
        val recipes3 = MineTweakerAPI.recipes
        val item3 = ItemBracketHandler.getItem("adventurebackpack:adventureBackpack", 2)
        val hashMap5 = HashMap<String, IData>()
        val s3 = "wearableData"
        val hashMap6 = HashMap<String, IData>()
        hashMap6["type"] = ExpandByte.asData(2.toByte())
        hashMap5[s3] = ExpandAnyDict.asData(hashMap6)
        val withTag = item3.withTag(ExpandAnyDict.asData(hashMap5))
        val array = arrayOf(arrayOf(OreBracketHandler.getOre("itemLeather"), ItemBracketHandler.getItem("IC2:itemNightvisionGoggles", 1), OreBracketHandler.getOre("itemLeather")), null, null)
        val n = 1
        val array2 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:potion", 8262), null, null)
        val n2 = 1
        val item4 = ItemBracketHandler.getItem("adventurebackpack:adventureBackpack", 0)
        val hashMap7 = HashMap<String, IData>()
        val s4 = "wearableData"
        val hashMap8 = HashMap<String, IData>()
        hashMap8["type"] = ExpandByte.asData(0.toByte())
        hashMap7[s4] = ExpandAnyDict.asData(hashMap8)
        array2[n2] = IngredientCondition.onlyWithTag(item4, ExpandAnyDict.asData(hashMap7))
        array2[2] = ItemBracketHandler.getItem("minecraft:potion", 8262)
        array[n] = array2
        array[2] = arrayOf(OreBracketHandler.getOre("blockWoolBlack"), OreBracketHandler.getOre("blockWoolBlack"), OreBracketHandler.getOre("blockWoolBlack"))
        recipes3.addShaped(withTag, array, null)
        val recipes4 = MineTweakerAPI.recipes
        val item5 = ItemBracketHandler.getItem("adventurebackpack:adventureBackpack", 11)
        val hashMap9 = HashMap<String, IData>()
        val s5 = "wearableData"
        val hashMap10 = HashMap<String, IData>()
        hashMap10["type"] = ExpandByte.asData(11.toByte())
        hashMap9[s5] = ExpandAnyDict.asData(hashMap10)
        val withTag2 = item5.withTag(ExpandAnyDict.asData(hashMap9))
        val array3 = arrayOf(arrayOf(OreBracketHandler.getOre("itemLeather"), ItemBracketHandler.getItem("minecraft:red_flower", 0), OreBracketHandler.getOre("itemLeather")), null, null)
        val n3 = 1
        val array4 = arrayOfNulls<IIngredient>(3)
        val n4 = 0
        val item6 = ItemBracketHandler.getItem("minecraft:enchanted_book", 0)
        val hashMap11 = HashMap<String, IData>()
        val s6 = "StoredEnchantments"
        val array5 = arrayOf<IData?>(null)
        val n5 = 0
        val hashMap12 = HashMap<String, IData>()
        hashMap12["lvl"] = ExpandShort.asNBT(4.toShort())
        hashMap12["id"] = ExpandShort.asNBT(2.toShort())
        array5[n5] = ExpandAnyDict.asData(hashMap12)
        hashMap11[s6] = ExpandAnyArray.asData(array5)
        array4[n4] = IngredientCondition.onlyWithTag(item6, ExpandAnyDict.asData(hashMap11))
        val n6 = 1
        val item7 = ItemBracketHandler.getItem("adventurebackpack:adventureBackpack", 0)
        val hashMap13 = HashMap<String, IData>()
        val s7 = "wearableData"
        val hashMap14 = HashMap<String, IData>()
        hashMap14["type"] = ExpandByte.asData(0.toByte())
        hashMap13[s7] = ExpandAnyDict.asData(hashMap14)
        array4[n6] = IngredientCondition.onlyWithTag(item7, ExpandAnyDict.asData(hashMap13))
        val n7 = 2
        val item8 = ItemBracketHandler.getItem("minecraft:enchanted_book", 0)
        val hashMap15 = HashMap<String, IData>()
        val s8 = "StoredEnchantments"
        val array6 = arrayOf<IData?>(null)
        val n8 = 0
        val hashMap16 = HashMap<String, IData>()
        hashMap16["lvl"] = ExpandShort.asNBT(4.toShort())
        hashMap16["id"] = ExpandShort.asNBT(2.toShort())
        array6[n8] = ExpandAnyDict.asData(hashMap16)
        hashMap15[s8] = ExpandAnyArray.asData(array6)
        array4[n7] = IngredientCondition.onlyWithTag(item8, ExpandAnyDict.asData(hashMap15))
        array3[n3] = array4
        array3[2] = arrayOf(OreBracketHandler.getOre("plateIron"), ItemBracketHandler.getItem("IC2:itemArmorRubBoots", 0), OreBracketHandler.getOre("plateIron"))
        recipes4.addShaped(withTag2, array3, null)
        val recipes5 = MineTweakerAPI.recipes
        val item9 = ItemBracketHandler.getItem("adventurebackpack:adventureBackpack", 62)
        val hashMap17 = HashMap<String, IData>()
        val s9 = "wearableData"
        val hashMap18 = HashMap<String, IData>()
        hashMap18["type"] = ExpandByte.asData(62.toByte())
        hashMap17[s9] = ExpandAnyDict.asData(hashMap18)
        val withTag3 = item9.withTag(ExpandAnyDict.asData(hashMap17))
        val array7 = arrayOf(arrayOf(OreBracketHandler.getOre("itemLeather"), ItemBracketHandler.getItem("GalacticraftCore:item.oxygenMask", 0), OreBracketHandler.getOre("itemLeather")), null, null)
        val n9 = 1
        val array8 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:potion", 8269), null, null)
        val n10 = 1
        val item10 = ItemBracketHandler.getItem("adventurebackpack:adventureBackpack", 0)
        val hashMap19 = HashMap<String, IData>()
        val s10 = "wearableData"
        val hashMap20 = HashMap<String, IData>()
        hashMap20["type"] = ExpandByte.asData(0.toByte())
        hashMap19[s10] = ExpandAnyDict.asData(hashMap20)
        array8[n10] = IngredientCondition.onlyWithTag(item10, ExpandAnyDict.asData(hashMap19))
        array8[2] = ItemBracketHandler.getItem("minecraft:potion", 8269)
        array7[n9] = array8
        array7[2] = arrayOf(OreBracketHandler.getOre("blockWoolBlue"), ItemBracketHandler.getItem("minecraft:dye", 0), OreBracketHandler.getOre("blockWoolBlue"))
        recipes5.addShaped(withTag3, array7, null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 2), arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0), arrayOf<IIngredient>(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 1), arrayOf<IIngredient>(ItemBracketHandler.getItem("sleepingbag:sleepingBag", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:machete", 0), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwAnyIron"), OreBracketHandler.getOre("craftingToolFile"), OreBracketHandler.getOre("plateAnyIron")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("plateAnyIron"), OreBracketHandler.getOre("plateAnyIron")), arrayOf(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 4), OreBracketHandler.getOre("screwAnyIron"), OreBracketHandler.getOre("craftingToolHardHammer"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 4), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("dyeYellow"), OreBracketHandler.getOre("screwAnyIron"), OreBracketHandler.getOre("dyeYellow")), arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlue"), OreBracketHandler.getOre("stickAnyIron"), OreBracketHandler.getOre("dyeBlue")), arrayOf<IIngredient>(OreBracketHandler.getOre("dyeRed"), OreBracketHandler.getOre("dyeBlack"), OreBracketHandler.getOre("dyeRed"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:adventureHat", 0), arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolScrewdriver"), null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("Backpack:tannedLeather", 0), ItemBracketHandler.getItem("minecraft:leather_helmet", 0), ItemBracketHandler.getItem("Backpack:tannedLeather", 0)), arrayOf<IIngredient?>(null, OreBracketHandler.getOre("screwGold"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 3), arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("screwAnyIron"), OreBracketHandler.getOre("pipeTinyBronze"), OreBracketHandler.getOre("screwAnyIron")), arrayOf(OreBracketHandler.getOre("springSmallAnyIron"), ItemBracketHandler.getItem("minecraft:stone_button", 0), OreBracketHandler.getOre("springSmallAnyIron")), arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolScrewdriver"), null)), null)
        val recipes6 = MineTweakerAPI.recipes
        val item11 = ItemBracketHandler.getItem("adventurebackpack:backpackHose", 0)
        val hashMap21 = HashMap<String, IData>()
        hashMap21["mode"] = ExpandInt.toData(-1)
        hashMap21["amount"] = ExpandInt.toData(0)
        hashMap21["fluid"] = ExpandString.asData("None")
        hashMap21["tank"] = ExpandInt.toData(-1)
        recipes6.addShaped(item11.withTag(ExpandAnyDict.asData(hashMap21)), arrayOf(arrayOf(OreBracketHandler.getOre("plateAnyRubber"), ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 3), OreBracketHandler.getOre("plateAnyRubber")), arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("dyeGreen"), OreBracketHandler.getOre("plateAnyRubber")), arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("dyeGreen"), OreBracketHandler.getOre("plateAnyRubber"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 5), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateSteel")), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32641), OreBracketHandler.getOre("pipeLargeSteel"), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32641)), arrayOf(OreBracketHandler.getOre("plateSteel"), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1111), OreBracketHandler.getOre("plateSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 6), arrayOf(arrayOf(ItemBracketHandler.getItem("IC2:itemRecipePart", 12), OreBracketHandler.getOre("screwSteel"), ItemBracketHandler.getItem("IC2:itemRecipePart", 12)), arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("gearSteel"), OreBracketHandler.getOre("screwSteel")), arrayOf(ItemBracketHandler.getItem("IC2:itemRecipePart", 12), OreBracketHandler.getOre("craftingToolScrewdriver"), ItemBracketHandler.getItem("IC2:itemRecipePart", 12))), null)
        val recipes7 = MineTweakerAPI.recipes
        val item12 = ItemBracketHandler.getItem("adventurebackpack:copterPack", 0)
        val hashMap22 = HashMap<String, IData>()
        val s11 = "wearableData"
        val hashMap23 = HashMap<String, IData>()
        val s12 = "fuelTank"
        val hashMap24 = HashMap<String, IData>()
        hashMap24["Empty"] = ExpandString.asData("")
        hashMap23[s12] = ExpandAnyDict.asData(hashMap24)
        hashMap22[s11] = ExpandAnyDict.asData(hashMap23)
        recipes7.addShaped(item12.withTag(ExpandAnyDict.asData(hashMap22)), arrayOf(arrayOf(OreBracketHandler.getOre("screwDiamond"), ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 6), OreBracketHandler.getOre("screwDiamond")), arrayOf(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601), OreBracketHandler.getOre("pipeTinySteel")), arrayOf(OreBracketHandler.getOre("pipeTinySteel"), ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 5), OreBracketHandler.getOre("pipeTinySteel"))), null)
        val recipes8 = MineTweakerAPI.recipes
        val item13 = ItemBracketHandler.getItem("adventurebackpack:copterPack", 0)
        val hashMap25 = HashMap<String, IData>()
        val s13 = "wearableData"
        val hashMap26 = HashMap<String, IData>()
        val s14 = "fuelTank"
        val hashMap27 = HashMap<String, IData>()
        hashMap27["Empty"] = ExpandString.asData("")
        hashMap26[s14] = ExpandAnyDict.asData(hashMap27)
        hashMap25[s13] = ExpandAnyDict.asData(hashMap26)
        recipes8.addShaped(item13.withTag(ExpandAnyDict.asData(hashMap25)), arrayOf(arrayOf(OreBracketHandler.getOre("screwDiamond"), ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 6), OreBracketHandler.getOre("screwDiamond")), arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601), OreBracketHandler.getOre("pipeTinySteel")), arrayOf(OreBracketHandler.getOre("pipeTinySteel"), ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 5), OreBracketHandler.getOre("pipeTinySteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 7), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("plateAnyRubber")), arrayOf(OreBracketHandler.getOre("plateAnyRubber"), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610), OreBracketHandler.getOre("plateAnyRubber")), arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("plateAnyRubber"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 9), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("turbineBladeSteel"), OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("turbineBladeSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("gearGtSmallSteel"), OreBracketHandler.getOre("screwSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("turbineBladeSteel"), OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("turbineBladeSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:pistonBoots", 0), arrayOf(arrayOf(ItemBracketHandler.getItem("Backpack:tannedLeather", 0), OreBracketHandler.getOre("craftingToolScrewdriver"), ItemBracketHandler.getItem("Backpack:tannedLeather", 0)), arrayOf(OreBracketHandler.getOre("plateAnyRubber"), ItemBracketHandler.getItem("minecraft:leather_boots", 0), OreBracketHandler.getOre("plateAnyRubber")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingPiston"), OreBracketHandler.getOre("screwBronze"), OreBracketHandler.getOre("craftingPiston"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:adventureSuit", 0), arrayOf(arrayOf(ItemBracketHandler.getItem("Backpack:tannedLeather", 0), OreBracketHandler.getOre("craftingToolScrewdriver"), ItemBracketHandler.getItem("Backpack:tannedLeather", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), ItemBracketHandler.getItem("minecraft:leather_chestplate", 0), ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)), arrayOf(ItemBracketHandler.getItem("Backpack:tannedLeather", 0), OreBracketHandler.getOre("screwBronze"), ItemBracketHandler.getItem("Backpack:tannedLeather", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:adventurePants", 0), arrayOf(arrayOf(ItemBracketHandler.getItem("Backpack:tannedLeather", 0), OreBracketHandler.getOre("craftingToolScrewdriver"), ItemBracketHandler.getItem("Backpack:tannedLeather", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), ItemBracketHandler.getItem("minecraft:leather_leggings", 0), ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)), arrayOf(ItemBracketHandler.getItem("Backpack:tannedLeather", 0), OreBracketHandler.getOre("screwBronze"), ItemBracketHandler.getItem("Backpack:tannedLeather", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("adventurebackpack:clockworkCrossbow", 0), arrayOf(arrayOf(OreBracketHandler.getOre("springSmallSteel"), ItemBracketHandler.getItem("minecraft:bow", 0), OreBracketHandler.getOre("springSmallSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("wireFineSteel"), OreBracketHandler.getOre("stickSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel"))), null)
        val recipes9 = MineTweakerAPI.recipes
        val item14 = ItemBracketHandler.getItem("adventurebackpack:coalJetpack", 0)
        val hashMap28 = HashMap<String, IData>()
        val s15 = "wearableData"
        val hashMap29 = HashMap<String, IData>()
        val s16 = "waterTank"
        val hashMap30 = HashMap<String, IData>()
        hashMap30["Empty"] = ExpandString.asData("")
        hashMap29[s16] = ExpandAnyDict.asData(hashMap30)
        hashMap28[s15] = ExpandAnyDict.asData(hashMap29)
        recipes9.addShaped(item14.withTag(ExpandAnyDict.asData(hashMap28)), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAluminium"), OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("plateAluminium")), arrayOf<IIngredient>(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601), ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 2)), arrayOf(OreBracketHandler.getOre("pipeTinySteel"), ItemBracketHandler.getItem("Railcraft:machine.beta", 5), OreBracketHandler.getOre("pipeTinySteel"))), null)
        val recipes10 = MineTweakerAPI.recipes
        val item15 = ItemBracketHandler.getItem("adventurebackpack:coalJetpack", 0)
        val hashMap31 = HashMap<String, IData>()
        val s17 = "wearableData"
        val hashMap32 = HashMap<String, IData>()
        val s18 = "waterTank"
        val hashMap33 = HashMap<String, IData>()
        hashMap33["Empty"] = ExpandString.asData("")
        hashMap32[s18] = ExpandAnyDict.asData(hashMap33)
        hashMap31[s17] = ExpandAnyDict.asData(hashMap32)
        recipes10.addShaped(item15.withTag(ExpandAnyDict.asData(hashMap31)), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAluminium"), OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("plateAluminium")), arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601), ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)), arrayOf(OreBracketHandler.getOre("pipeTinySteel"), ItemBracketHandler.getItem("Railcraft:machine.beta", 5), OreBracketHandler.getOre("pipeTinySteel"))), null)
        Brewery.addRecipe(LiquidBracketHandler.getLiquid("melonjuice").withAmount(750), ItemBracketHandler.getItem("minecraft:melon", 0), LiquidBracketHandler.getLiquid("water").withAmount(750), false)
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("Backpack:backpack", 32767), MineTweakerAPI.format.red(ExpandString.asFormattedText("Idiots! Do not upgrade your backpack with important stuff inside - Dream 2017!")))
    }
}