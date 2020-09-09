package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import com.github.GTNH2Mega.VoltageLevels

class FloodLight : Runnable {
    override fun run() {
        val ore = OreBracketHandler.getOre("plateSteel")
        val ore2 = OreBracketHandler.getOre("wireGt01Copper")
        val ore3 = OreBracketHandler.getOre("circuitBasic")
        val ore4 = OreBracketHandler.getOre("lensGlass")
        val ore5 = OreBracketHandler.getOre("lensDiamond")
        val ore6 = OreBracketHandler.getOre("paneGlass")
        val item = ItemBracketHandler.getItem("FloodLights:mantle", 0)
        val ore7 = OreBracketHandler.getOre("plateTitanium")
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:electricFloodlight", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:carbonFloodlight", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:uvFloodlight", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:rawFilament", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("FloodLights:glowingFilament", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:carbonDissolver", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:carbonLantern", 0))
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:growLight", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:electricFloodlight", 0),
                arrayOf(arrayOf<IIngredient>(ore, ore4, ore),
                        arrayOf(ore3, ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0), ore3),
                        arrayOf<IIngredient>(ore, ore2, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:carbonFloodlight", 0),
                arrayOf(arrayOf<IIngredient>(ore, ore4, ore),
                        arrayOf(ore3, ItemBracketHandler.getItem("FloodLights:carbonLantern", 0), ore3),
                        arrayOf<IIngredient>(ore, ore2, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:uvFloodlight", 0),
                arrayOf(arrayOf<IIngredient>(ore, ore5, ore),
                        arrayOf(ore3, ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0), ore3),
                        arrayOf<IIngredient>(ore, ore2, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:carbonLantern", 0),
                arrayOf(arrayOf<IIngredient>(ore6, ore6, ore6),
                        arrayOf<IIngredient>(item, ItemBracketHandler.getItem("FloodLights:carbonDissolver", 0), item),
                        arrayOf(ore6, ItemBracketHandler.getItem("minecraft:flint_and_steel", 0), ore6)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 0).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 1)),
                null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 0),
                        ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:growLight", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 8),
                        ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0)),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(ore7, OreBracketHandler.getOre("wireGt01Cobalt"), ore7)), null)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:redstone", 0),
                ItemBracketHandler.getItem("minecraft:string", 0).amount(8), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19081),
                ItemBracketHandler.getItem("minecraft:glass_pane", 0).amount(2),
                LiquidBracketHandler.getLiquid("argon").withAmount(1), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("FloodLights:carbonDissolver", 0),
                ItemBracketHandler.getItem("minecraft:glass_pane", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 1),
                ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28032).amount(2),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(288), 200, VoltageLevels.MV)
    }
}
