package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class ForgeMultipart : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ForgeMicroblock:sawStone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ForgeMicroblock:sawIron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ForgeMicroblock:sawDiamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ForgeMicroblock:stoneRod", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ForgeMicroblock:sawStone", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickStone"), OreBracketHandler.getOre("stickStone")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("dreamcraft:item.SawBladeStone", 0),
                                OreBracketHandler.getOre("stickStone")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ForgeMicroblock:sawIron", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickIron"), OreBracketHandler.getOre("stickIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("toolHeadSawIron"), OreBracketHandler.getOre("stickIron")),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ForgeMicroblock:sawDiamond", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("dreamcraft:item.SawBladeDiamond", 0),
                                OreBracketHandler.getOre("stickSteel")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ForgeMicroblock:stoneRod", 0).amount(2),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stone"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stone"), null, null), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ForgeMicroblock:stoneRod", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSaw"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stone"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stone"), null, null)), null)
    }
}