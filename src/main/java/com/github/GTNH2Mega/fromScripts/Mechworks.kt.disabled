package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.Wiremill
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class Mechworks : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TMechworks:SignalBus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TMechworks:SignalTerminal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TMechworks:LengthWire", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TMechworks:SpoolWire", 32767))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 0), arrayOf(arrayOf(OreBracketHandler.getOre("plateBrass"), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630), OreBracketHandler.getOre("plateBrass")), arrayOf(OreBracketHandler.getOre("gearSteel"), ItemBracketHandler.getItem("minecraft:dispenser", 0), OreBracketHandler.getOre("gearSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("plateBrass"), OreBracketHandler.getOre("craftingPiston"), OreBracketHandler.getOre("plateBrass"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 1), arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 7), ItemBracketHandler.getItem("TConstruct:heavyPlate", 7), ItemBracketHandler.getItem("TConstruct:heavyPlate", 7)), arrayOf(OreBracketHandler.getOre("plateBrass"), ItemBracketHandler.getItem("minecraft:flint_and_steel", 0), OreBracketHandler.getOre("plateBrass")), arrayOf<IIngredient>(OreBracketHandler.getOre("plateBrass"), OreBracketHandler.getOre("plateBrass"), OreBracketHandler.getOre("plateBrass"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 2), ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 0), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 9241), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 600, 30)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 3), ItemBracketHandler.getItem("TMechworks:RedstoneMachine", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17033).amount(6), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1152), 1200, 64)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:SpoolWire", 256), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305), ItemBracketHandler.getItem("TMechworks:LengthWire", 0), 200, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:SpoolWire", 192), ItemBracketHandler.getItem("TMechworks:LengthWire", 0).amount(64), ItemBracketHandler.getItem("TMechworks:SpoolWire", 256), 1280, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:SpoolWire", 128), ItemBracketHandler.getItem("TMechworks:LengthWire", 0).amount(64), ItemBracketHandler.getItem("TMechworks:SpoolWire", 192), 1280, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:SpoolWire", 64), ItemBracketHandler.getItem("TMechworks:LengthWire", 0).amount(64), ItemBracketHandler.getItem("TMechworks:SpoolWire", 128), 1280, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:SpoolWire", 0), ItemBracketHandler.getItem("TMechworks:LengthWire", 0).amount(64), ItemBracketHandler.getItem("TMechworks:SpoolWire", 64), 1280, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:SignalBus", 0), ItemBracketHandler.getItem("TMechworks:LengthWire", 0).amount(3), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(432), 200, 30)
        Assembler.addRecipe(ItemBracketHandler.getItem("TMechworks:SignalTerminal", 0), ItemBracketHandler.getItem("TMechworks:SignalBus", 0).amount(2), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), LiquidBracketHandler.getLiquid("molten.glass").withAmount(288), 300, 30)
        Wiremill.addRecipe(ItemBracketHandler.getItem("TMechworks:LengthWire", 0).amount(2), ItemBracketHandler.getItem("TConstruct:materials", 14), 50, 16)
    }
}