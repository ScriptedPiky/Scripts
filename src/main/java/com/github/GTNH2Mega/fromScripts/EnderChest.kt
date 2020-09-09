package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import net.minecraftforge.oredict.OreDictionary

class EnderChest : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderStorage:enderChest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderStorage:enderChest", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderStorage:enderPouch", OreDictionary.WILDCARD_VALUE))
    }
}