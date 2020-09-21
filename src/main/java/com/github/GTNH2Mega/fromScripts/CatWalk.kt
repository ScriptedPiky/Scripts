package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.Pulverizer
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import com.github.GTNH2Mega.VoltageLevels

class CatWalk : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:support_column", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:sturdy_rail_powered", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:cagedLadder_north_unlit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:scaffold", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:sturdy_rail_detector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:catwalk_unlit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:sturdy_rail", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:sturdy_rail_activator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:ropeLight", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:steelgrate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("catwalks:blowtorch", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("catwalks:catwalk_unlit", 0).amount(6),
                arrayOf(arrayOf(ItemBracketHandler.getItem("catwalks:steelgrate", 0),
                        OreBracketHandler.getOre("stickSteel"), ItemBracketHandler.getItem("catwalks:steelgrate", 0)),
                        arrayOf(OreBracketHandler.getOre("screwSteel"),
                                ItemBracketHandler.getItem("catwalks:steelgrate", 0),
                                OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickSteel"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("catwalks:cagedLadder_north_unlit", 0).amount(6),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("catwalks:steelgrate", 0),
                        ItemBracketHandler.getItem("minecraft:ladder", 0),
                        ItemBracketHandler.getItem("catwalks:steelgrate", 0)),
                        arrayOf(OreBracketHandler.getOre("screwSteel"),
                                ItemBracketHandler.getItem("catwalks:steelgrate", 0),
                                OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickSteel"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("catwalks:scaffold", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("catwalks:steelgrate", 0), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("frameGtSteel"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("catwalks:scaffold", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("catwalks:scaffold", 1)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("catwalks:support_column", 0).amount(3),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickSteel"),
                        ItemBracketHandler.getItem("catwalks:steelgrate", 0), OreBracketHandler.getOre("stickSteel")),
                        arrayOf(OreBracketHandler.getOre("stickSteel"),
                                ItemBracketHandler.getItem("catwalks:steelgrate", 0),
                                OreBracketHandler.getOre("stickSteel")), arrayOf(OreBracketHandler.getOre("stickSteel"),
                        ItemBracketHandler.getItem("catwalks:steelgrate", 0), OreBracketHandler.getOre("stickSteel"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("catwalks:steelgrate", 0).amount(5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickSteel"),
                        OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("catwalks:blowtorch", 0),
                arrayOf(arrayOf(null, OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("minecraft:flint_and_steel", 0)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickSteel"),
                                OreBracketHandler.getOre("craftingToolWrench"), null)), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:steelgrate", 0).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305).amount(3), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:support_column", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(6),
                ItemBracketHandler.getItem("catwalks:steelgrate", 0).amount(4), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:catwalk_unlit", 0).amount(6),
                ItemBracketHandler.getItem("catwalks:steelgrate", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305).amount(2), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:scaffold", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4401),
                ItemBracketHandler.getItem("catwalks:steelgrate", 0), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:cagedLadder_north_unlit", 0).amount(6),
                ItemBracketHandler.getItem("catwalks:steelgrate", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:ladder", 0), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:sturdy_rail", 0),
                ItemBracketHandler.getItem("minecraft:rail", 0), ItemBracketHandler.getItem("catwalks:steelgrate", 0),
                150, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:sturdy_rail_activator", 0),
                ItemBracketHandler.getItem("minecraft:activator_rail", 0),
                ItemBracketHandler.getItem("catwalks:steelgrate", 0), 150, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:sturdy_rail_detector", 0),
                ItemBracketHandler.getItem("minecraft:detector_rail", 0),
                ItemBracketHandler.getItem("catwalks:steelgrate", 0), 150, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:sturdy_rail_powered", 0),
                ItemBracketHandler.getItem("minecraft:golden_rail", 0),
                ItemBracketHandler.getItem("catwalks:steelgrate", 0), 150, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("catwalks:ropeLight", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19305).amount(2),
                ItemBracketHandler.getItem("minecraft:glowstone_dust", 0), 100, VoltageLevels.LLV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 305).amount(6)),
                ItemBracketHandler.getItem("catwalks:support_column", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 305).amount(2)),
                ItemBracketHandler.getItem("catwalks:scaffold", 0), intArrayOf(10000, 10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 305).amount(2)),
                ItemBracketHandler.getItem("catwalks:scaffold", 1), intArrayOf(10000, 10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 305).amount(2)),
                ItemBracketHandler.getItem("catwalks:catwalk_unlit", 0), intArrayOf(10000, 10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(1)),
                ItemBracketHandler.getItem("catwalks:cagedLadder_north_unlit", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 305).amount(2)),
                ItemBracketHandler.getItem("catwalks:steelgrate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
    }
}