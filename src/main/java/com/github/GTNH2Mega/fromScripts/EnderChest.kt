package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler

class EnderChest : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderStorage:enderChest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderStorage:enderChest", 32767))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderStorage:enderPouch", 32767))
    }
}