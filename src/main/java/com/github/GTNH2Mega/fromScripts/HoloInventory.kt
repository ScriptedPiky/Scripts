package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.api.tooltip.IngredientTooltips
import minetweaker.expand.ExpandString
import minetweaker.api.formatting.IFormattedText

class HoloInventory : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("holoinventory:Hologlasses", 0), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("stickSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("ringSteel"), OreBracketHandler.getOre("boltSteel"), OreBracketHandler.getOre("ringSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("lensInfusedEntropy"), OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("lensInfusedEntropy"))), null)
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("holoinventory:Hologlasses", 0) as IIngredient, ExpandString.asFormattedText("<Hold Shift>") as IFormattedText)
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("holoinventory:Hologlasses", 0) as IIngredient, ExpandString.add("Info:", MineTweakerAPI.format.red(ExpandString.asFormattedText("Adds Holographic inventory screen for all blocks with an inventory")) as IFormattedText) as IFormattedText)
    }
}