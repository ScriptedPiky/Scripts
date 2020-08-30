package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI

class AdvSolarPanel : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:BlockMolecularTransformer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:advanced_solar_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:hybrid_solar_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:ultimate_solar_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11318), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 13))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 12), arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), ItemBracketHandler.getItem("IC2:reactorReflectorThick", 32767), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5)), arrayOf<IIngredient>(OreBracketHandler.getOre("plateTitanium"), OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("plateTitanium")), arrayOf<IIngredient>(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), ItemBracketHandler.getItem("IC2:reactorReflectorThick", 32767), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AdvancedSolarPanel:advanced_solar_helmet", 0), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"), ItemBracketHandler.getItem("AdvancedSolarPanel:BlockAdvSolarPanel", 0), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf(OreBracketHandler.getOre("circuitAdvanced"), ItemBracketHandler.getItem("IC2:itemArmorNanoHelmet", 32767), OreBracketHandler.getOre("circuitAdvanced")), arrayOf(OreBracketHandler.getOre("cableGt04Aluminium"), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 22), OreBracketHandler.getOre("cableGt04Aluminium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AdvancedSolarPanel:hybrid_solar_helmet", 0), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"), ItemBracketHandler.getItem("AdvancedSolarPanel:BlockAdvSolarPanel", 1), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf(OreBracketHandler.getOre("circuitMaster"), ItemBracketHandler.getItem("IC2:itemArmorQuantumHelmet", 32767), OreBracketHandler.getOre("circuitMaster")), arrayOf(OreBracketHandler.getOre("cableGt04Platinum"), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 23), OreBracketHandler.getOre("cableGt04Platinum"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AdvancedSolarPanel:ultimate_solar_helmet", 0), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("circuitUltimate"), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf(OreBracketHandler.getOre("craftingSolarPanelHV"), ItemBracketHandler.getItem("AdvancedSolarPanel:hybrid_solar_helmet", 32767), OreBracketHandler.getOre("craftingSolarPanelHV")), arrayOf(OreBracketHandler.getOre("cableGt04VanadiumGallium"), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 24), OreBracketHandler.getOre("cableGt04VanadiumGallium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5).amount(4), arrayOf(arrayOf(OreBracketHandler.getOre("glassReinforced"), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 2), OreBracketHandler.getOre("glassReinforced")), arrayOf(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 2), OreBracketHandler.getOre("plateGlowstone"), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 2)), arrayOf(OreBracketHandler.getOre("glassReinforced"), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 2), OreBracketHandler.getOre("glassReinforced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 13), arrayOf(arrayOf(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 4), OreBracketHandler.getOre("plateNetherStar"), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 4)), arrayOf(OreBracketHandler.getOre("plateNetherStar"), ItemBracketHandler.getItem("dreamcraft:item.NanoCircuit", 0), OreBracketHandler.getOre("plateNetherStar")), arrayOf(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 4), OreBracketHandler.getOre("plateNetherStar"), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32752), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"), ItemBracketHandler.getItem("AdvancedSolarPanel:BlockAdvSolarPanel", 0), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32753), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"), ItemBracketHandler.getItem("AdvancedSolarPanel:BlockAdvSolarPanel", 1), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32754), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"), ItemBracketHandler.getItem("AdvancedSolarPanel:BlockAdvSolarPanel", 2), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32755), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"), ItemBracketHandler.getItem("AdvancedSolarPanel:BlockAdvSolarPanel", 3), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("craftingToolFile"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11098), ItemBracketHandler.getItem("minecraft:glowstone", 0).amount(4), 600, 1920)
        Assembler.addRecipe(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 3), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 2).amount(8), 1200, 7680)
        Assembler.addRecipe(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 1), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17318).amount(4), ItemBracketHandler.getItem("IC2:itemPartIridium", 0).amount(8), 800, 30720)
        Assembler.addRecipe(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 4), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 1), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 3).amount(8), 1600, 122880)
        NEI.overrideName(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 8), "Irradiant Reinforced Iridium Plate")
    }
}