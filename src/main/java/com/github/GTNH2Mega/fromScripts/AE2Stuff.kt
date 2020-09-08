package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class AE2Stuff : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ae2stuff:Encoder", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ae2stuff:Grower", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ae2stuff:Inscriber", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ae2stuff:Wireless", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ae2stuff:WirelessKit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ae2stuff:Visualiser", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ae2stuff:Encoder", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateTitanium"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 340),
                        OreBracketHandler.getOre("plateTitanium")), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23),
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23)),
                        arrayOf(OreBracketHandler.getOre("plateTitanium"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16),
                                OreBracketHandler.getOre("plateTitanium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ae2stuff:Grower", 0), arrayOf(arrayOf<IIngredient>(
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGrowthAccelerator", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGrowthAccelerator", 0)),
                arrayOf(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGrowthAccelerator", 0),
                        OreBracketHandler.getOre("chestIron"),
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGrowthAccelerator", 0)),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGrowthAccelerator", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGrowthAccelerator", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ae2stuff:Wireless", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("crystalPureFluix"),
                        OreBracketHandler.getOre("plateTitanium"), OreBracketHandler.getOre("crystalPureFluix")),
                        arrayOf<IIngredient>(
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 41),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("crystalPureFluix"),
                                OreBracketHandler.getOre("plateTitanium"),
                                OreBracketHandler.getOre("crystalPureFluix"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ae2stuff:WirelessKit", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 41),
                        OreBracketHandler.getOre("plateTitanium"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 41)),
                        arrayOf<IIngredient>(
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 180),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24)),
                        arrayOf(OreBracketHandler.getOre("crystalPureFluix"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16),
                                OreBracketHandler.getOre("crystalPureFluix"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ae2stuff:Visualiser", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("crystalPureFluix"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ToolNetworkTool", 0),
                        OreBracketHandler.getOre("crystalPureFluix")),
                        arrayOf(OreBracketHandler.getOre("screwTitanium"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 41),
                                OreBracketHandler.getOre("screwTitanium")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ae2stuff:Inscriber", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateTungstenSteel"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                        OreBracketHandler.getOre("plateTungstenSteel")), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22),
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockInscriber", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22)),
                        arrayOf(OreBracketHandler.getOre("plateTungstenSteel"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                                OreBracketHandler.getOre("plateTungstenSteel"))), null)
    }
}