package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.tooltip.IngredientTooltips
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import java.util.*

class Renaming : Runnable {
    override fun run() {
        ItemBracketHandler.getItem("minecraft:ender_chest", 0).displayName = "Personal Ender Chest"
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("minecraft:ender_chest", 0),
                MineTweakerAPI.format.darkAqua(ExpandString.asFormattedText("Only For Personal Use")))
        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCreativeEnergyCell",
                0).displayName = "Neutronium Energy Cell"
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCreativeEnergyCell", 0),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("Infinite Energy")))
        val item = ItemBracketHandler.getItem("EnderIO:blockCapBank", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["type"] = ExpandString.asData("CREATIVE")
        hashMap["storedEnergyRF"] = ExpandInt.toData(2500000)
        item.withTag(ExpandAnyDict.asData(hashMap)).displayName = "Chaotic Capacitor Bank"
        val item2 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 0)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["type"] = ExpandString.asData("CREATIVE")
        hashMap2["storedEnergyRF"] = ExpandInt.toData(2500000)
        IngredientTooltips.addTooltip(item2.withTag(ExpandAnyDict.asData(hashMap2)),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("Infinite Energy")))
    }
}