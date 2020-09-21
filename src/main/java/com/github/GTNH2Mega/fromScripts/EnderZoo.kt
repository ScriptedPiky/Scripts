package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import com.github.GTNH2Mega.VoltageLevels

class EnderZoo : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderZoo:blockConfusingCharge", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderZoo:blockEnderCharge", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderZoo:blockConcussionCharge", 0))
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderZoo:blockConfusingCharge", 0),
                ItemBracketHandler.getItem("minecraft:tnt", 0),
                ItemBracketHandler.getItem("EnderZoo:confusingDust", 0).amount(4), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderZoo:blockEnderCharge", 0),
                ItemBracketHandler.getItem("minecraft:tnt", 0),
                ItemBracketHandler.getItem("EnderZoo:enderFragment", 0).amount(4), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderZoo:blockConcussionCharge", 0).amount(2),
                ItemBracketHandler.getItem("EnderZoo:blockConfusingCharge", 0),
                ItemBracketHandler.getItem("EnderZoo:blockEnderCharge", 0), 400, VoltageLevels.LV)
    }
}