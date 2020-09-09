package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class AFSU : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AFSU:ALC", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AFSU:AFSU", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AFSU:AFSU", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01Platinum"),
                        OreBracketHandler.getOre("itemCasingTungstenSteel"),
                        OreBracketHandler.getOre("cableGt01Platinum")),
                        arrayOf(OreBracketHandler.getOre("itemCasingTungstenSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 15),
                                OreBracketHandler.getOre("itemCasingTungstenSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitMaster"), ItemBracketHandler.getItem("AFSU:ALC", 0),
                                OreBracketHandler.getOre("circuitMaster"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("AFSU:ALC", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32597), 2400, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AFSU:ALC", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32597), 2400, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AFSU:ALC", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32597), 2400, VoltageLevels.EV)
    }
}