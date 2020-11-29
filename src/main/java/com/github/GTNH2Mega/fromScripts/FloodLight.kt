package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.LMV
import com.github.GTNH2Mega.VoltageLevels.LV
import com.github.GTNH2Mega.VoltageLevels.MV
import java.lang.Runnable
import minetweaker.api.oredict.IOreDictEntry
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.api.item.IItemStack
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.mc1710.brackets.LiquidBracketHandler

class FloodLight : Runnable {
    override fun run() {
        val iOreDictEntry = OreBracketHandler.getOre("plateSteel")
        val iOreDictEntry2 = OreBracketHandler.getOre("wireGt01Copper")
        val iOreDictEntry3 = OreBracketHandler.getOre("circuitBasic")
        val iOreDictEntry4 = OreBracketHandler.getOre("lensGlass")
        val iOreDictEntry5 = OreBracketHandler.getOre("lensDiamond")
        val iOreDictEntry6 = OreBracketHandler.getOre("paneGlass")
        val iItemStack = ItemBracketHandler.getItem("FloodLights:mantle", 0)
        val iOreDictEntry7 = OreBracketHandler.getOre("plateTitanium")
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
        MineTweakerAPI.recipes.remove(iItemStack)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("FloodLights:growLight", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:electricFloodlight", 0), arrayOf(arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry4, iOreDictEntry), arrayOf(iOreDictEntry3, ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0), iOreDictEntry3), arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry2, iOreDictEntry)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:carbonFloodlight", 0), arrayOf(arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry4, iOreDictEntry), arrayOf(iOreDictEntry3, ItemBracketHandler.getItem("FloodLights:carbonLantern", 0), iOreDictEntry3), arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry2, iOreDictEntry)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:uvFloodlight", 0), arrayOf(arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry5, iOreDictEntry), arrayOf(iOreDictEntry3, ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0), iOreDictEntry3), arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry2, iOreDictEntry)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:carbonLantern", 0), arrayOf(arrayOf<IIngredient>(iOreDictEntry6, iOreDictEntry6, iOreDictEntry6), arrayOf<IIngredient>(iItemStack, ItemBracketHandler.getItem("FloodLights:carbonDissolver", 0), iItemStack), arrayOf(iOreDictEntry6, ItemBracketHandler.getItem("minecraft:flint_and_steel", 0), iOreDictEntry6)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 0).amount(2), arrayOf<IIngredient>(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 1), arrayOf<IIngredient>(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 0), ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("FloodLights:growLight", 0), arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0), ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 8), ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0)), arrayOf(OreBracketHandler.getOre("circuitAdvanced"), ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0), OreBracketHandler.getOre("circuitAdvanced")), arrayOf<IIngredient>(iOreDictEntry7, OreBracketHandler.getOre("wireGt01Cobalt"), iOreDictEntry7)), null)
        Assembler.addRecipe(iItemStack, ItemBracketHandler.getItem("minecraft:redstone", 0), ItemBracketHandler.getItem("minecraft:string", 0).amount(8), 100, LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19081), ItemBracketHandler.getItem("minecraft:glass_pane", 0).amount(2), LiquidBracketHandler.getLiquid("argon").withAmount(1), 200, MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("FloodLights:carbonDissolver", 0), ItemBracketHandler.getItem("minecraft:glass_pane", 0).amount(3), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305).amount(2), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 200, LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("FloodLights:smallElectricFloodlightMetaBlock", 1), ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28032).amount(2), LiquidBracketHandler.getLiquid("molten.glass").withAmount(288), 200, MV)
    }
}