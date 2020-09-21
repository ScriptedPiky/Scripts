package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.ChemicalReactor
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import com.github.GTNH2Mega.VoltageLevels

class WirelessRedstone : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Core:obsidianStick", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Core:stoneBowl", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Core:retherPearl", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Core:wirelessTransceiver", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Core:blazeTransceiver", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Core:recieverDish", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Core:blazeRecieverDish", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Addons:triangulator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Addons:remote", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Addons:sniffer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Addons:map", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Addons:tracker", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Addons:rep", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("WR-CBE|Addons:psniffer", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("WR-CBE|Core:stoneBowl", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateStone"), null,
                        OreBracketHandler.getOre("plateStone")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateStone"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateStone")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateStone"),
                                OreBracketHandler.getOre("plateStone"), OreBracketHandler.getOre("plateStone"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("WR-CBE|Addons:remote", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("WR-CBE|Core:wirelessTransceiver", 0),
                        OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingTungstenSteel"),
                                OreBracketHandler.getOre("screwTungstenSteel"),
                                OreBracketHandler.getOre("itemCasingTungstenSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("WR-CBE|Addons:sniffer", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("WR-CBE|Core:recieverDish", 0),
                        ItemBracketHandler.getItem("WR-CBE|Core:wirelessTransceiver", 0),
                        ItemBracketHandler.getItem("WR-CBE|Core:recieverDish", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingTungstenSteel"),
                                OreBracketHandler.getOre("stickTungstenSteel"),
                                OreBracketHandler.getOre("itemCasingTungstenSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("WR-CBE|Addons:psniffer", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("WR-CBE|Core:blazeRecieverDish", 0),
                        ItemBracketHandler.getItem("WR-CBE|Core:blazeTransceiver", 0),
                        ItemBracketHandler.getItem("WR-CBE|Core:blazeRecieverDish", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingTungstenSteel"),
                                OreBracketHandler.getOre("stickTungstenSteel"),
                                OreBracketHandler.getOre("itemCasingTungstenSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Core:wirelessTransceiver", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23316),
                ItemBracketHandler.getItem("WR-CBE|Core:retherPearl", 0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 600, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Core:blazeTransceiver", 0),
                ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                ItemBracketHandler.getItem("WR-CBE|Core:retherPearl", 0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 600, VoltageLevels.MV)

        //TODO Replace getLiquid("ender")
        //Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Core:recieverDish", 0),
        //        ItemBracketHandler.getItem("WR-CBE|Core:stoneBowl", 0),
        //        ItemBracketHandler.getItem("WR-CBE|Core:wirelessTransceiver", 0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(250), 600, VoltageLevels.LHV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Core:blazeRecieverDish", 0),
        //        ItemBracketHandler.getItem("WR-CBE|Core:stoneBowl", 0),
        //        ItemBracketHandler.getItem("WR-CBE|Core:blazeTransceiver", 0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(250), 600, VoltageLevels.LHV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 0),
        //        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0).amount(3),
        //        ItemBracketHandler.getItem("WR-CBE|Core:wirelessTransceiver", 0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(500), 600, VoltageLevels.LHV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 1),
        //        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0).amount(3),
        //        ItemBracketHandler.getItem("WR-CBE|Core:recieverDish", 0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(500), 600, VoltageLevels.LHV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 2),
        //        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0).amount(3),
        //        ItemBracketHandler.getItem("WR-CBE|Core:blazeTransceiver", 0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(250), 600, VoltageLevels.LHV)

        Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Addons:triangulator", 0),
                ItemBracketHandler.getItem("minecraft:compass", 0),
                ItemBracketHandler.getItem("WR-CBE|Core:wirelessTransceiver", 0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 600, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Addons:map", 0),
                ItemBracketHandler.getItem("WR-CBE|Addons:triangulator", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(8),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 300, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Addons:tracker", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804).amount(3),
                ItemBracketHandler.getItem("WR-CBE|Core:wirelessTransceiver", 0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 600, VoltageLevels.MV)

        //TODO Replace
        //Assembler.addRecipe(ItemBracketHandler.getItem("WR-CBE|Addons:rep", 0),
        //        ItemBracketHandler.getItem("WR-CBE|Core:blazeTransceiver", 0).amount(2),
        //        ItemBracketHandler.getItem("WR-CBE|Core:retherPearl", 0).amount(2),
        //        LiquidBracketHandler.getLiquid("obsidian.molten").withAmount(1440), 600, VoltageLevels.MV)

        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("WR-CBE|Core:retherPearl", 0), null,
                ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 1200, VoltageLevels.LV)
    }
}