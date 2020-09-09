package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class JABBA : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("minecraft:chest", 0)
        val item2 = ItemBracketHandler.getItem("JABBA:barrel", 0)
        val ore = OreBracketHandler.getOre("logWood")
        ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("ExtraTrees:log", 0)
        ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("IC2:blockRubWood", 0)
        ItemBracketHandler.getItem("Natura:tree", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Natura:redwood", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Natura:willow", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Natura:bloodwood", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Natura:DarkTree", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Natura:RareTree", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("TwilightForest:tile.TFLog", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("TwilightForest:tile.TFMagicLog", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("minecraft:wooden_slab", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab2", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("ExtraTrees:slab", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Forestry:slabs", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Natura:plankSlab1", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("Natura:plankSlab2", OreDictionary.WILDCARD_VALUE)
        val item3 = ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE)
        val item4 = ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE)
        val item5 = ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE)

        //TODO Replace ("ExtraUtilities:colorWoodPlanks", OreDictionary.WILDCARD_VALUE)
        //val item6 = ItemBracketHandler.getItem("ExtraUtilities:colorWoodPlanks", OreDictionary.WILDCARD_VALUE)

        val item7 = ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE)
        val item8 = ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE)
        val item9 = ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE)
        val item10 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 0)
        val item11 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 1)
        val item12 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 2)
        val item13 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 3)
        val item14 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 4)
        val item15 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 5)
        val item16 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 6)
        val item17 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 7)
        val item18 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 8)
        val item19 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 9)
        val item20 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 10)
        val item21 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 11)
        val item22 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 12)
        val item23 = ItemBracketHandler.getItem("JABBA:upgradeStructural", 13)
        val item24 = ItemBracketHandler.getItem("minecraft:piston", 0)
        ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0)
        val ore2 = OreBracketHandler.getOre("plateCopper")
        val ore3 = OreBracketHandler.getOre("plateIron")
        val ore4 = OreBracketHandler.getOre("plateBronze")
        val ore5 = OreBracketHandler.getOre("plateSteel")
        val ore6 = OreBracketHandler.getOre("plateAluminium")
        val ore7 = OreBracketHandler.getOre("plateStainlessSteel")
        val ore8 = OreBracketHandler.getOre("plateTungstenSteel")
        val ore9 = OreBracketHandler.getOre("plateTitanium")
        val ore10 = OreBracketHandler.getOre("plateChrome")
        val ore11 = OreBracketHandler.getOre("plateIridium")
        val ore12 = OreBracketHandler.getOre("plateOsmium")
        val ore13 = OreBracketHandler.getOre("plateNeutronium")
        val ore14 = OreBracketHandler.getOre("stickCopper")
        val ore15 = OreBracketHandler.getOre("stickIron")
        val ore16 = OreBracketHandler.getOre("stickBronze")
        val ore17 = OreBracketHandler.getOre("stickSteel")
        val ore18 = OreBracketHandler.getOre("stickAluminium")
        val ore19 = OreBracketHandler.getOre("stickStainlessSteel")
        val ore20 = OreBracketHandler.getOre("stickTungstenSteel")
        val ore21 = OreBracketHandler.getOre("stickTitanium")
        val ore22 = OreBracketHandler.getOre("stickChrome")
        val ore23 = OreBracketHandler.getOre("stickIridium")
        val ore24 = OreBracketHandler.getOre("stickOsmium")
        val ore25 = OreBracketHandler.getOre("stickNeutronium")
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032)
        val ore26 = OreBracketHandler.getOre("plateEnderEye")
        ItemBracketHandler.getItem("minecraft:ender_chest", 0)
        val item25 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32100)
        val item26 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32101)
        val ore27 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore28 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val ore29 = OreBracketHandler.getOre("plateRedAlloy")
        val ore30 = OreBracketHandler.getOre("screwSteel")
        val ore31 = OreBracketHandler.getOre("plateBlackPlutonium")
        val ore32 = OreBracketHandler.getOre("stickBlackPlutonium")
        val item27 = ItemBracketHandler.getItem("JABBA:upgradeCore", 1)
        val item28 = ItemBracketHandler.getItem("JABBA:upgradeCore", 2)
        val item29 = ItemBracketHandler.getItem("JABBA:upgradeCore", 3)
        val item30 = ItemBracketHandler.getItem("JABBA:upgradeCore", 7)
        val item31 = ItemBracketHandler.getItem("JABBA:mover", 0)
        val item32 = ItemBracketHandler.getItem("JABBA:moverDiamond", 0)
        val item33 = ItemBracketHandler.getItem("JABBA:tuningFork", 0)
        val item34 = ItemBracketHandler.getItem("JABBA:upgradeCore", 0)
        val item35 = ItemBracketHandler.getItem("JABBA:upgradeCore", 4)
        val item36 = ItemBracketHandler.getItem("JABBA:upgradeCore", 5)
        val item37 = ItemBracketHandler.getItem("JABBA:upgradeCore", 6)
        val item38 = ItemBracketHandler.getItem("JABBA:upgradeCore", 8)
        val item39 = ItemBracketHandler.getItem("JABBA:upgradeCore", 9)
        val ore33 = OreBracketHandler.getOre("craftingToolScrewdriver")
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item31)
        MineTweakerAPI.recipes.remove(item32)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("JABBA:hammer", 0))
        MineTweakerAPI.recipes.remove(item33)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(item16)
        MineTweakerAPI.recipes.remove(item17)
        MineTweakerAPI.recipes.remove(item18)
        MineTweakerAPI.recipes.remove(item19)
        MineTweakerAPI.recipes.remove(item20)
        MineTweakerAPI.recipes.remove(item21)
        MineTweakerAPI.recipes.remove(item22)
        MineTweakerAPI.recipes.remove(item23)
        MineTweakerAPI.recipes.remove(item34)
        MineTweakerAPI.recipes.remove(item35)
        MineTweakerAPI.recipes.remove(item36)
        MineTweakerAPI.recipes.remove(item37)
        MineTweakerAPI.recipes.remove(item38)
        MineTweakerAPI.recipes.remove(item39)
        MineTweakerAPI.recipes.remove(item27)
        MineTweakerAPI.recipes.remove(item28)
        MineTweakerAPI.recipes.remove(item29)
        MineTweakerAPI.recipes.remove(item30)
        MineTweakerAPI.recipes.addShaped(item2,
                arrayOf(arrayOf<IIngredient>(ore, OreBracketHandler.getOre("slabWood"), ore), arrayOf(ore, item, ore),
                        arrayOf<IIngredient>(ore, ore, ore)), null)
        MineTweakerAPI.recipes.addShaped(item31, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickAnyIron"),
                OreBracketHandler.getOre("stickAnyIron"), OreBracketHandler.getOre("roundAnyRubber")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("stickAnyIron"),
                        OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("roundAnyRubber")),
                arrayOf(item25, OreBracketHandler.getOre("plateSteel"), item25)), null)
        MineTweakerAPI.recipes.addShaped(item32, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickDiamond"),
                OreBracketHandler.getOre("stickDiamond"), OreBracketHandler.getOre("roundPlastic")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("stickDiamond"),
                        OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("roundPlastic")),
                arrayOf(item26, OreBracketHandler.getOre("plateNetherStar"), item26)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("JABBA:hammer", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ingotIron"),
                        OreBracketHandler.getOre("plateAnyIron"), OreBracketHandler.getOre("ingotIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwAnyIron"),
                                OreBracketHandler.getOre("stickAnyIron"), OreBracketHandler.getOre("screwAnyIron")),
                        arrayOf<IIngredient>(ore27, OreBracketHandler.getOre("stickAnyIron"), ore28)), null)
        MineTweakerAPI.recipes.addShaped(item33,
                arrayOf(arrayOf<IIngredient?>(ore28, OreBracketHandler.getOre("stickAnyIron"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("screwAnyIron"),
                                OreBracketHandler.getOre("plateAnyIron"), OreBracketHandler.getOre("stickAnyIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickAnyIron"),
                                OreBracketHandler.getOre("screwAnyIron"), ore27)), null)
        MineTweakerAPI.recipes.addShaped(item10, arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809), OreBracketHandler.getOre("stickWood")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809), item2,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(item11,
                arrayOf(arrayOf<IIngredient>(ore14, ore2, ore14), arrayOf(ore2, item2, ore2),
                        arrayOf<IIngredient>(ore14, ore2, ore14)), null)
        MineTweakerAPI.recipes.addShaped(item12,
                arrayOf(arrayOf<IIngredient>(ore15, ore3, ore15), arrayOf(ore3, item2, ore3),
                        arrayOf<IIngredient>(ore15, ore3, ore15)), null)
        MineTweakerAPI.recipes.addShaped(item13,
                arrayOf(arrayOf<IIngredient>(ore16, ore4, ore16), arrayOf(ore4, item2, ore4),
                        arrayOf<IIngredient>(ore16, ore4, ore16)), null)
        MineTweakerAPI.recipes.addShaped(item14,
                arrayOf(arrayOf<IIngredient>(ore17, ore5, ore17), arrayOf(ore5, item2, ore5),
                        arrayOf<IIngredient>(ore17, ore5, ore17)), null)
        MineTweakerAPI.recipes.addShaped(item15,
                arrayOf(arrayOf<IIngredient>(ore18, ore6, ore18), arrayOf(ore6, item2, ore6),
                        arrayOf<IIngredient>(ore18, ore6, ore18)), null)
        MineTweakerAPI.recipes.addShaped(item16,
                arrayOf(arrayOf<IIngredient>(ore19, ore7, ore19), arrayOf(ore7, item2, ore7),
                        arrayOf<IIngredient>(ore19, ore7, ore19)), null)
        MineTweakerAPI.recipes.addShaped(item17,
                arrayOf(arrayOf<IIngredient>(ore21, ore9, ore21), arrayOf(ore9, item2, ore9),
                        arrayOf<IIngredient>(ore21, ore9, ore21)), null)
        MineTweakerAPI.recipes.addShaped(item18,
                arrayOf(arrayOf<IIngredient>(ore20, ore8, ore20), arrayOf(ore8, item2, ore8),
                        arrayOf<IIngredient>(ore20, ore8, ore20)), null)
        MineTweakerAPI.recipes.addShaped(item19,
                arrayOf(arrayOf<IIngredient>(ore22, ore10, ore22), arrayOf(ore10, item2, ore10),
                        arrayOf<IIngredient>(ore22, ore10, ore22)), null)
        MineTweakerAPI.recipes.addShaped(item20,
                arrayOf(arrayOf<IIngredient>(ore23, ore11, ore23), arrayOf(ore11, item2, ore11),
                        arrayOf<IIngredient>(ore23, ore11, ore23)), null)
        MineTweakerAPI.recipes.addShaped(item21,
                arrayOf(arrayOf<IIngredient>(ore24, ore12, ore24), arrayOf(ore12, item2, ore12),
                        arrayOf<IIngredient>(ore24, ore12, ore24)), null)
        MineTweakerAPI.recipes.addShaped(item22,
                arrayOf(arrayOf<IIngredient>(ore25, ore13, ore25), arrayOf(ore13, item2, ore13),
                        arrayOf<IIngredient>(ore25, ore13, ore25)), null)
        MineTweakerAPI.recipes.addShaped(item23,
                arrayOf(arrayOf<IIngredient>(ore32, ore31, ore32), arrayOf(ore31, item2, ore31),
                        arrayOf<IIngredient>(ore32, ore31, ore32)), null)
        MineTweakerAPI.recipes.addShaped(item27.amount(2), arrayOf(arrayOf(ore26, item24, ore26),
                arrayOf<IIngredient>(item24, ItemBracketHandler.getItem("EnderStorage:enderChest", 0), item24),
                arrayOf(ore26, item24, ore26)), null)
        MineTweakerAPI.recipes.addShaped(item28, arrayOf(arrayOf(ore29, item24, ore29),
                arrayOf<IIngredient>(item24, ItemBracketHandler.getItem("minecraft:redstone_block", 0), item24),
                arrayOf(ore29, item24, ore29)), null)
        MineTweakerAPI.recipes.addShaped(item29, arrayOf(arrayOf(ore3, item24, ore3),
                arrayOf<IIngredient>(item24, ItemBracketHandler.getItem("minecraft:hopper", 0), item24),
                arrayOf(ore3, item24, ore3)), null)
        MineTweakerAPI.recipes.addShaped(item30, arrayOf(arrayOf(ore3, item24, ore3),
                arrayOf<IIngredient>(item24, ItemBracketHandler.getItem("Railcraft:machine.beta", 11), item24),
                arrayOf(ore3, item24, ore3)), null)
        MineTweakerAPI.recipes.addShaped(item34, arrayOf(arrayOf(ore30, item24, ore30), arrayOf(ore30, item2, ore30),
                arrayOf<IIngredient?>(null, ore33, null)), null)
        Assembler.addRecipe(item2, item3.amount(8), item, 200, 16)
        Assembler.addRecipe(item2, item4.amount(8), item, 200, 16)
        Assembler.addRecipe(item2, item5.amount(8), item, 200, 16)

        //TODO Replace ("ExtraUtilities:colorWoodPlanks", OreDictionary.WILDCARD_VALUE) in item6
        //Assembler.addRecipe(item2, item6.amount(8), item, 200, 16)

        Assembler.addRecipe(item2, item7.amount(8), item, 200, 16)
        Assembler.addRecipe(item2, item8.amount(8), item, 200, 16)
        Assembler.addRecipe(item2, item9.amount(8), item, 200, 16)
        Assembler.addRecipe(item34, item2, item24, 1200, 16)
        Assembler.addRecipe(item35, item34.amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 900, VoltageLevels.LV)
        Assembler.addRecipe(item36, item35.amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 600, VoltageLevels.LMV)
        Assembler.addRecipe(item37, item36.amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 400, VoltageLevels.MV)
        Assembler.addRecipe(item38, item37.amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 200, VoltageLevels.LHV)
        Assembler.addRecipe(item39, item38.amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 150,  VoltageLevels.HV)
    }
}