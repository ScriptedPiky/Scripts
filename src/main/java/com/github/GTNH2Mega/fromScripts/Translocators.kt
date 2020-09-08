package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.ImplosionCompressor
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class Translocators : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Translocator:translocator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Translocator:translocator", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Translocator:diamondNugget", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Translocator:translocator", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAluminium"),
                        OreBracketHandler.getOre("plateRedAlloy"), OreBracketHandler.getOre("itemCasingAluminium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("pipeMediumBrass"),
                                OreBracketHandler.getOre("gemEnderPearl"), OreBracketHandler.getOre("pipeMediumBrass")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAluminium"),
                                OreBracketHandler.getOre("plateRedAlloy"),
                                OreBracketHandler.getOre("itemCasingAluminium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Translocator:translocator", 1).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAluminium"),
                        OreBracketHandler.getOre("plateRedAlloy"), OreBracketHandler.getOre("itemCasingAluminium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("pipeMediumSteel"),
                                OreBracketHandler.getOre("gemEnderPearl"), OreBracketHandler.getOre("pipeMediumSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAluminium"),
                                OreBracketHandler.getOre("plateRedAlloy"),
                                OreBracketHandler.getOre("itemCasingAluminium"))), null)
        ImplosionCompressor.addRecipe(arrayOf(ItemBracketHandler.getItem("Translocator:diamondNugget", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 816)),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1500), 2)
    }
}