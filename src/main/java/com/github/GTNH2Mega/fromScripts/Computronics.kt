package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.item.IIngredient

class Computronics : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("computronics:computronics.ocParts", 32767) as IIngredient)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("computronics:computronics.droneStation", 0) as IIngredient)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("computronics:computronics.dockingUpgrade", 0) as IIngredient)
    }
}