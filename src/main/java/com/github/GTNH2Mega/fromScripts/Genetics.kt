package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.Mixer
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.forestry.handlers.Carpenter
import com.github.GTNH2Mega.VoltageLevels

class Genetics : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Genetics:database", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:machine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:machine", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:machine", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:machine", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:labMachine", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:labMachine", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:labMachine", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:labMachine", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:labMachine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:advMachine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:misc", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:analyst", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Genetics:registry", 0))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Genetics:database", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27533),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27533)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27533),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27533))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(2880), 60,
                ItemBracketHandler.getItem("dreamcraft:item.Display", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Genetics:database", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:database", 0)), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(4320),
                arrayOf(ItemBracketHandler.getItem("Genetics:misc", 9),
                        ItemBracketHandler.getItem("Forestry:treealyzer", 0),
                        ItemBracketHandler.getItem("Genetics:misc", 9),
                        ItemBracketHandler.getItem("Forestry:beealyzer", 0),
                        ItemBracketHandler.getItem("Genetics:misc", 10),
                        ItemBracketHandler.getItem("Forestry:flutterlyzer", 0),
                        ItemBracketHandler.getItem("Genetics:misc", 9),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("Genetics:misc", 9)),
                ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                ItemBracketHandler.getItem("Genetics:analyst", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(4320),
                arrayOf(ItemBracketHandler.getItem("Genetics:misc", 9),
                        ItemBracketHandler.getItem("ExtraTrees:database", 0),
                        ItemBracketHandler.getItem("Genetics:misc", 9),
                        ItemBracketHandler.getItem("Botany:database", 0),
                        ItemBracketHandler.getItem("Genetics:misc", 10),
                        ItemBracketHandler.getItem("ExtraBees:dictionary", 0),
                        ItemBracketHandler.getItem("Genetics:misc", 9),
                        ItemBracketHandler.getItem("ExtraTrees:databaseMoth", 0),
                        ItemBracketHandler.getItem("Genetics:misc", 9)),
                ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                ItemBracketHandler.getItem("Genetics:registry", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:misc", 9),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("Forestry:chipsets", 1),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("screwStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:machine", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Genetics:misc", 3), OreBracketHandler.getOre("chestIron"),
                        ItemBracketHandler.getItem("Genetics:misc", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 9),
                                ItemBracketHandler.getItem("Genetics:misc", 0),
                                ItemBracketHandler.getItem("Genetics:misc", 9)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:machine", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Genetics:misc", 2), OreBracketHandler.getOre("chestIron"),
                        ItemBracketHandler.getItem("Genetics:misc", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 9),
                                ItemBracketHandler.getItem("Genetics:misc", 0),
                                ItemBracketHandler.getItem("Genetics:misc", 9)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:machine", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Genetics:misc", 7), OreBracketHandler.getOre("chestIron"),
                        ItemBracketHandler.getItem("Genetics:misc", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 9),
                                ItemBracketHandler.getItem("Genetics:misc", 0),
                                ItemBracketHandler.getItem("Genetics:misc", 9)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:machine", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateEmerald"),
                        OreBracketHandler.getOre("chestIron"), OreBracketHandler.getOre("plateEmerald")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 9),
                                ItemBracketHandler.getItem("Genetics:misc", 0),
                                ItemBracketHandler.getItem("Genetics:misc", 9)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:labMachine", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Genetics:misc", 1), OreBracketHandler.getOre("chestIron"),
                        ItemBracketHandler.getItem("Genetics:misc", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 9),
                                ItemBracketHandler.getItem("Genetics:misc", 0),
                                ItemBracketHandler.getItem("Genetics:misc", 9)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:labMachine", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("craftingIronFurnace"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 9),
                                ItemBracketHandler.getItem("Genetics:misc", 0),
                                ItemBracketHandler.getItem("Genetics:misc", 9)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:labMachine", 3),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("chestIron"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 9),
                                ItemBracketHandler.getItem("Genetics:misc", 0),
                                ItemBracketHandler.getItem("Genetics:misc", 9)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:labMachine", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("bucketWater"),
                        OreBracketHandler.getOre("bucketLava"), OreBracketHandler.getOre("bucketWater")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 9),
                                ItemBracketHandler.getItem("Genetics:misc", 0),
                                ItemBracketHandler.getItem("Genetics:misc", 9)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:labMachine", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                        OreBracketHandler.getOre("paneGlass"), OreBracketHandler.getOre("plateStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("paneGlass"), ItemBracketHandler.getItem("Genetics:misc", 0),
                                OreBracketHandler.getOre("paneGlass")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("paneGlass"),
                                OreBracketHandler.getOre("plateStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Genetics:advMachine", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateKanthal"),
                        OreBracketHandler.getOre("chestDiamond"), OreBracketHandler.getOre("plateKanthal")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Genetics:misc", 10),
                                ItemBracketHandler.getItem("Genetics:misc", 11),
                                ItemBracketHandler.getItem("Genetics:misc", 10)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallDiamond"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                OreBracketHandler.getOre("gearGtSmallDiamond"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 0),
                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                OreBracketHandler.getOre("itemCasingAluminium").amount(8), 1200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 8),
                ItemBracketHandler.getItem("minecraft:glass_pane", 0).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 6).amount(0), 200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 5),
                ItemBracketHandler.getItem("minecraft:glass_pane", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0),
                LiquidBracketHandler.getLiquid("molten.gold").withAmount(288), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 6),
                ItemBracketHandler.getItem("minecraft:glass_pane", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0),
                LiquidBracketHandler.getLiquid("molten.gold").withAmount(144), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 7),
                ItemBracketHandler.getItem("Genetics:misc", 6).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 10).amount(0),
                LiquidBracketHandler.getLiquid("molten.gold").withAmount(576), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 9),
                ItemBracketHandler.getItem("Forestry:chipsets", 1),
                ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0).amount(2),
                LiquidBracketHandler.getLiquid("molten.stainlesssteel").withAmount(64), 400, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 9),
                ItemBracketHandler.getItem("Forestry:chipsets", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32082).amount(2),
                LiquidBracketHandler.getLiquid("molten.stainlesssteel").withAmount(64), 400, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 9),
                ItemBracketHandler.getItem("Forestry:chipsets", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32703).amount(2),
                LiquidBracketHandler.getLiquid("molten.stainlesssteel").withAmount(64), 400, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 11),
                ItemBracketHandler.getItem("Forestry:hardenedMachine", 0),
                ItemBracketHandler.getItem("Genetics:misc", 9).amount(8),
                LiquidBracketHandler.getLiquid("molten.glowstone").withAmount(288), 1500, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32104),
                ItemBracketHandler.getItem("Genetics:misc", 9).amount(8),
                LiquidBracketHandler.getLiquid("molten.glowstone").withAmount(144), 600, VoltageLevels.MV)
        Mixer.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 1), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1810).amount(4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1811).amount(4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32419)),
                LiquidBracketHandler.getLiquid("molten.blaze").withAmount(144), 100, VoltageLevels.LV)
        Mixer.addRecipe(ItemBracketHandler.getItem("Genetics:misc", 2), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1811).amount(4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1810).amount(4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32428),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32425)),
                LiquidBracketHandler.getLiquid("molten.blaze").withAmount(144), 100, VoltageLevels.LV)
    }
}