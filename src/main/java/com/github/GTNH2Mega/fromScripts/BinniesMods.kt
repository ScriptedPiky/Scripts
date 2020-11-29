package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.api.item.IItemStack
import minetweaker.mods.nei.NEI
import minetweaker.mc1710.brackets.LiquidBracketHandler
import WayofTime.alchemicalWizardry.common.tweaker.BloodAltar
import WayofTime.alchemicalWizardry.common.tweaker.BloodOrb
import com.github.GTNH2Mega.VoltageLevels.LULV
import gttweaker.mods.gregtech.machines.*

class BinniesMods : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8502), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8503), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:dye", 4), null, false)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("Avaritia:Resource", 2).amount(9)), ItemBracketHandler.getItem("Avaritia:Resource", 3), intArrayOf(10000), 300, LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 501)), ItemBracketHandler.getItem("ExtraBees:misc", 2), intArrayOf(10000), 300, LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 502)), ItemBracketHandler.getItem("ExtraBees:misc", 3), intArrayOf(10000), 300, LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 503)), ItemBracketHandler.getItem("ExtraBees:misc", 4), intArrayOf(10000), 300, LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 526)), ItemBracketHandler.getItem("ExtraBees:misc", 5), intArrayOf(10000), 300, LULV)
    }
}