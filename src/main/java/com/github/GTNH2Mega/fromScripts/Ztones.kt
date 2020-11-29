package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.LULV
import com.github.GTNH2Mega.VoltageLevels.LV
import com.github.GTNH2Mega.VoltageLevels.ULV
import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.api.oredict.IOreDictEntry
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import gttweaker.mods.gregtech.machines.CuttingSaw
import minetweaker.api.item.IItemStack
import gttweaker.mods.gregtech.machines.ForgeHammer

class Ztones : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:stoneTile", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:cleanDirt", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:booster", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:lampf", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:lampt", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:lampb", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:auroraBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:minicharcoal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:minicoal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:ofanix", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:cobblestone", 0), arrayOf<IIngredient>(ItemBracketHandler.getItem("Ztones:ofanix", 0)), false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:tile.mystBlock", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:stoneTile", 0).amount(8), arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone_slab", 0), ItemBracketHandler.getItem("minecraft:stone_slab", 0), ItemBracketHandler.getItem("minecraft:stone_slab", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone_slab", 0), ItemBracketHandler.getItem("minecraft:stone", 0), ItemBracketHandler.getItem("minecraft:stone_slab", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone_slab", 0), ItemBracketHandler.getItem("minecraft:stone_slab", 0), ItemBracketHandler.getItem("minecraft:stone_slab", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:minicharcoal", 0).amount(7), arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSoftHammer"), null, null), arrayOf<IIngredient?>(OreBracketHandler.getOre("gemCharcoal"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:minicoal", 0).amount(7), arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSoftHammer"), null, null), arrayOf<IIngredient?>(OreBracketHandler.getOre("gemCoal"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:auroraBlock", 0).amount(8), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("blockGlass")), arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("dye"), OreBracketHandler.getOre("blockGlass")), arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("blockGlass"))), null)
        val iOreDictEntry = OreBracketHandler.getOre("blockMushroom")
        iOreDictEntry.add(ItemBracketHandler.getItem("minecraft:brown_mushroom_block", 32767))
        iOreDictEntry.add(ItemBracketHandler.getItem("minecraft:red_mushroom_block", 32767))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:tile.mystBlock", 0).amount(8), arrayOf(arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry, iOreDictEntry), arrayOf(iOreDictEntry, ItemBracketHandler.getItem("Ztones:auroraBlock", 0), iOreDictEntry), arrayOf<IIngredient>(iOreDictEntry, iOreDictEntry, iOreDictEntry)), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("Ztones:stoneTile", 0).amount(8), ItemBracketHandler.getItem("minecraft:stone", 0), ItemBracketHandler.getItem("minecraft:stone_slab", 0).amount(4), 160, LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Ztones:cleanDirt", 0).amount(8), ItemBracketHandler.getItem("minecraft:sand", 32767).amount(4), ItemBracketHandler.getItem("minecraft:dirt", 32767).amount(4), LiquidBracketHandler.getLiquid("seedoil").withAmount(5), 160, LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Ztones:booster", 0), ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), LiquidBracketHandler.getLiquid("molten.blaze").withAmount(8), 100, LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Ztones:auroraBlock", 0).amount(8), ItemBracketHandler.getItem("minecraft:glass", 0).amount(4), ItemBracketHandler.getItem("minecraft:dye", 32767), 160, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampf", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 16), LiquidBracketHandler.getLiquid("water").withAmount(100), 200, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampf", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 16), LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(75), 200, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampf", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 16), LiquidBracketHandler.getLiquid("lubricant").withAmount(25), 100, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampt", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 24), LiquidBracketHandler.getLiquid("water").withAmount(100), 200, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampt", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 24), LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(75), 200, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampt", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 24), LiquidBracketHandler.getLiquid("lubricant").withAmount(25), 100, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampb", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 23), LiquidBracketHandler.getLiquid("water").withAmount(100), 200, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampb", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 23), LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(75), 200, LULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampb", 0).amount(4)), ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 23), LiquidBracketHandler.getLiquid("lubricant").withAmount(25), 100, LULV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("Ztones:minicharcoal", 0).amount(9), ItemBracketHandler.getItem("minecraft:coal", 1), 50, ULV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("Ztones:minicoal", 0).amount(9), ItemBracketHandler.getItem("minecraft:coal", 0), 50, ULV)
    }
}