package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.LLV
import com.github.GTNH2Mega.VoltageLevels.LV
import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import gttweaker.mods.gregtech.machines.Assembler

class EnderZoo : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderZoo:blockConfusingCharge", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderZoo:blockEnderCharge", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderZoo:blockConcussionCharge", 0))
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderZoo:blockConfusingCharge", 0), ItemBracketHandler.getItem("minecraft:tnt", 0), ItemBracketHandler.getItem("EnderZoo:confusingDust", 0).amount(4), 400, LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderZoo:blockEnderCharge", 0), ItemBracketHandler.getItem("minecraft:tnt", 0), ItemBracketHandler.getItem("EnderZoo:enderFragment", 0).amount(4), 400, LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderZoo:blockConcussionCharge", 0).amount(2), ItemBracketHandler.getItem("EnderZoo:blockConfusingCharge", 0), ItemBracketHandler.getItem("EnderZoo:blockEnderCharge", 0), 400, LV)
    }
}