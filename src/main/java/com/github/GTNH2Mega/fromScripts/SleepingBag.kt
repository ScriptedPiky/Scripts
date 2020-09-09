package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary

class SleepingBag : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE)
        val ore = OreBracketHandler.getOre("blockWool")
        val item2 = ItemBracketHandler.getItem("Backpack:tannedLeather", 0)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("sleepingbag:sleepingBag", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("sleepingbag:sleepingBag", 0),
                arrayOf(arrayOf<IIngredient>(item, item, item), arrayOf<IIngredient>(ore, ore, ore),
                        arrayOf<IIngredient>(item2, item2, item2)), null)

        //TODO Replace ("adventurebackpack:backpackComponent", 1)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("sleepingbag:sleepingBag", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 1)), null)

        //TODO Replace ("adventurebackpack:backpackComponent", 1)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("adventurebackpack:backpackComponent", 1),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:sleepingBag", 0)), null)
    }
}