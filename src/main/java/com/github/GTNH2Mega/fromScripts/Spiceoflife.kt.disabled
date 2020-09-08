package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class Spiceoflife : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("SpiceOfLife:lunchbag", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("SpiceOfLife:lunchbox", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("SpiceOfLife:lunchbag", 0), arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:paper", 0), null, ItemBracketHandler.getItem("minecraft:paper", 0)), arrayOf<IIngredient?>(ItemBracketHandler.getItem("IC2:itemHarz", 0), ItemBracketHandler.getItem("minecraft:paper", 0), ItemBracketHandler.getItem("IC2:itemHarz", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("SpiceOfLife:lunchbox", 0), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDoubleIron"), OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("plateDoubleIron")), arrayOf<IIngredient>(OreBracketHandler.getOre("screwAnyIron"), OreBracketHandler.getOre("plateDoubleIron"), OreBracketHandler.getOre("screwAnyIron"))), null)
    }
}