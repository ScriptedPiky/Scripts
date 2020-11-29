package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import minetweaker.api.item.IItemStack
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.oredict.IOreDictEntry
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient

class SleepingBag : Runnable {
    override fun run() {
        val iItemStack = ItemBracketHandler.getItem("minecraft:carpet", 32767)
        val iOreDictEntry = OreBracketHandler.getOre("blockWool")
        val iItemStack2 = ItemBracketHandler.getItem("Backpack:tannedLeather", 0)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("sleepingbag:sleepingBag", 0) as IIngredient)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("sleepingbag:sleepingBag", 0), arrayOf(arrayOf<IIngredient>(iItemStack, iItemStack, iItemStack), arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry, iOreDictEntry), arrayOf<IIngredient>(iItemStack2, iItemStack2, iItemStack2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("sleepingbag:sleepingBag", 0), arrayOf<IIngredient>(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 1), arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:sleepingBag", 0)), null)
    }
}