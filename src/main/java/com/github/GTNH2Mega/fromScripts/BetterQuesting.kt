package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class BetterQuesting : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterquesting:submit_station", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("questbook:ItemQuestBook", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("betterquesting:submit_station", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateWood"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"),
                                OreBracketHandler.getOre("gearSteel"), OreBracketHandler.getOre("plateSteel")),
                        arrayOf(OreBracketHandler.getOre("plateWood"), ItemBracketHandler.getItem("minecraft:chest", 0),
                                OreBracketHandler.getOre("plateWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("questbook:ItemQuestBook", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("minecraft:book", 0),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
    }
}