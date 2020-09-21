package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.CuttingSaw
import gttweaker.mods.gregtech.machines.ForgeHammer
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

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
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:cobblestone", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Ztones:ofanix", 0)), false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Ztones:tile.mystBlock", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:stoneTile", 0).amount(8),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                        ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                        ItemBracketHandler.getItem("minecraft:stone_slab", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                                ItemBracketHandler.getItem("minecraft:stone", 0),
                                ItemBracketHandler.getItem("minecraft:stone_slab", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                                ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                                ItemBracketHandler.getItem("minecraft:stone_slab", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:minicharcoal", 0).amount(7),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSoftHammer"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("gemCharcoal"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:minicoal", 0).amount(7),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSoftHammer"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("gemCoal"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:auroraBlock", 0).amount(8),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"),
                        OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("blockGlass")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("dye"),
                                OreBracketHandler.getOre("blockGlass")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"),
                                OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("blockGlass"))), null)
        val ore = OreBracketHandler.getOre("blockMushroom")
        ore.add(ItemBracketHandler.getItem("minecraft:brown_mushroom_block", OreDictionary.WILDCARD_VALUE))
        ore.add(ItemBracketHandler.getItem("minecraft:red_mushroom_block", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Ztones:tile.mystBlock", 0).amount(8),
                arrayOf(arrayOf<IIngredient>(ore, ore, ore),
                        arrayOf(ore, ItemBracketHandler.getItem("Ztones:auroraBlock", 0), ore),
                        arrayOf<IIngredient>(ore, ore, ore)), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("Ztones:stoneTile", 0).amount(8),
                ItemBracketHandler.getItem("minecraft:stone", 0),
                ItemBracketHandler.getItem("minecraft:stone_slab", 0).amount(4), 160, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Ztones:cleanDirt", 0).amount(8),
                ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE).amount(4),
                ItemBracketHandler.getItem("minecraft:dirt", OreDictionary.WILDCARD_VALUE).amount(4),
                LiquidBracketHandler.getLiquid("seedoil").withAmount(5), 160, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Ztones:booster", 0),
                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("molten.blaze").withAmount(8), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Ztones:auroraBlock", 0).amount(8),
                ItemBracketHandler.getItem("minecraft:glass", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:dye", OreDictionary.WILDCARD_VALUE), 160, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampf", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 16),
                LiquidBracketHandler.getLiquid("water").withAmount(100), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampf", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 16),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(75), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampf", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 16),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(25), 100, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampt", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 24),
                LiquidBracketHandler.getLiquid("water").withAmount(100), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampt", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 24),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(75), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampt", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 24),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(25), 100, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampb", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 23),
                LiquidBracketHandler.getLiquid("water").withAmount(100), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampb", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 23),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(75), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Ztones:lampb", 0).amount(4)),
                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 23),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(25), 100, VoltageLevels.ULV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("Ztones:minicharcoal", 0).amount(9),
                ItemBracketHandler.getItem("minecraft:coal", 1), 50, VoltageLevels.ULV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("Ztones:minicoal", 0).amount(9),
                ItemBracketHandler.getItem("minecraft:coal", 0), 50, VoltageLevels.ULV)
    }
}