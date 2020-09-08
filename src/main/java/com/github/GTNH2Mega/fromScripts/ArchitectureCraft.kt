package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class ArchitectureCraft : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ArchitectureCraft:sawbench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ArchitectureCraft:sawblade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ArchitectureCraft:largePulley", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ArchitectureCraft:hammer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ArchitectureCraft:chisel", 0))

        //TODO Replace ("TConstruct:trap.barricade.oak", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ArchitectureCraft:sawbench", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"),
        //                ItemBracketHandler.getItem("minecraft:heavy_weighted_pressure_plate", 0),
        //                OreBracketHandler.getOre("screwSteel")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:trap.barricade.oak", 0),
        //                        ItemBracketHandler.getItem("ArchitectureCraft:sawblade", 0),
        //                        ItemBracketHandler.getItem("TConstruct:trap.barricade.oak", 0)),
        //                arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
        //                        ItemBracketHandler.getItem("ArchitectureCraft:largePulley", 0),
        //                        OreBracketHandler.getOre("craftingToolHardHammer"))), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("ArchitectureCraft:sawblade", 0),
                arrayOf<IIngredient>(OreBracketHandler.getOre("toolHeadBuzzSawAnyIron")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 15032),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ArchitectureCraft:sawblade", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ArchitectureCraft:largePulley", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtSmallAnyIron"),
                                OreBracketHandler.getOre("gearWood"), OreBracketHandler.getOre("gearGtSmallAnyIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("screwSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ArchitectureCraft:hammer", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("ingotIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("ingotIron")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("craftingToolHardHammer"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ArchitectureCraft:chisel", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("stickIron"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
    }
}