package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.Fuels
import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandLong
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class IC2 : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("IC2:blockMachine", 1)
        val ore = OreBracketHandler.getOre("plateAnyIron")
        val item2 = ItemBracketHandler.getItem("minecraft:furnace", 0)
        val ore2 = OreBracketHandler.getOre("craftingToolWrench")
        val item3 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32675)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockGenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockGenerator", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockHeatGenerator", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockGenerator", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockReactorChamber", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockHeatGenerator", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockGenerator", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockElectric", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockElectric", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockElectric", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockElectric", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockElectric", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockElectric", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockElectric", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockElectric", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockScaffold", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockIronScaffold", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMetal", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolMiningLaser", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockITNT", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorPlating", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorPlatingHeat", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorPlatingExplosive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolCutter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemCable", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemCable", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemCable", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemCable", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemPartCoalChunk", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemPartCarbonMesh", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockAlloyGlass", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolDrill", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolDDrill", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolIridiumDrill", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolChainsaw", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolWrenchElectric", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTreetapElectric", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolHoe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:windmeter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemwoodrotor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemironrotor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemsteelrotor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemwcarbonrotor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolWrench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemupgradekit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemFluidCell", 0))
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("minecraft:log", 3), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorReflector", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorReflectorThick", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorVent", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorVentCore", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorVentGold", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorVentDiamond", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorVentSpread", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorHeatSwitch", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorHeatSwitchCore", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorHeatSwitchSpread", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorHeatSwitchDiamond", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorCondensator", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorCondensatorLap", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTreetap", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockRubber", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 6))
        MineTweakerAPI.oreDict["plateSteel"].remove(ItemBracketHandler.getItem("IC2:itemPlates", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemSteamTurbineBlade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemSteamTurbine", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("IC2:itemHarz", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemIronBlockCuttingBlade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemAdvIronBlockCuttingBlade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemDiamondBlockCuttingBlade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemBarrel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemMugEmpty", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("IC2:itemCofeePowder", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemCofeeBeans", 0)), false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemMugCoffee", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("IC2:itemMugCoffee", OreDictionary.WILDCARD_VALUE), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemMugCoffee", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemMugCoffee", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemBoat", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemBoat", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemBoat", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemDynamiteSticky", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemDynamite", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemWeedingTrowel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemCropnalyzer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolMEter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemScrapbox", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemPartCoalBall", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemPartCFPowder", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorUraniumDual", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.reactorUraniumDual", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorUraniumQuad", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.reactorUraniumQuad", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorMOXDual", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.reactorMOXDual", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorMOXQuad", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.reactorMOXQuad", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemDoorAlloy", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterBlack", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterRed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterGreen", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterBrown", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterBlue", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterPurple", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterCyan", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterLightGrey", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterDarkGrey", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterPink", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterLime", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterYellow", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterCloud", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterMagenta", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterOrange", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolPainterWhite", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemBatSU", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 4))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("IC2:itemcrystalmemory", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRemote", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemFreq", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:upgradeModule", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:upgradeModule", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:upgradeModule", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:upgradeModule", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:upgradeModule", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:upgradeModule", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:upgradeModule", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTFBP", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTFBPCultivation", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTFBPIrrigation", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTFBPChilling", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTFBPDesertification", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTFBPFlatification", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTFBPMushroom", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemArmorHazmatHelmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemArmorHazmatChestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemArmorHazmatLeggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemArmorHazmatLeggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorCoolantSimple", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorCoolantTriple", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:reactorCoolantSix", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemArmorRubBoots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemStaticBoots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockGenerator", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockGenerator", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockHeatGenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockHeatGenerator", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockGenerator", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockPersonal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockCrop", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemFoamSprayer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemArmorCFPack", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemArmorAlloyChestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemNanoSaber", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:obscurator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemScanner", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemScannerAdv", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemOreIridium", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemPlutonium", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemUran235small", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemUran235", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemLathingTool", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTurningBlanksWood", 209715))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemTurningBlanks", 349525))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemContainmentbox", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemToolbox", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemPlutoniumSmall", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemMOX", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemUran", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRecipePart", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockNuke", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockLuminatorDark", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockLuminator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine3", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockPersonal", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockPersonal", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine3", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine3", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine3", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine3", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine3", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMachine", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockChargepad", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockChargepad", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockChargepad", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockChargepad", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockreactorvessel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockReactorFluidPort", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockReactorAccessHatch", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockReactorRedstonePort", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:blockGenerator", 5))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11084),
                ItemBracketHandler.getItem("IC2:itemOreIridium", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17084))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 3084))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 4084))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 12084))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 1084))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 13084))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 84))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 7084))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 2084))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemDust2", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemPartCFPowder", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:blockMiningTip", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockHeatGenerator", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("cableGt01AnyCopper"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32501),
                        OreBracketHandler.getOre("cableGt01AnyCopper")),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 2),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 5),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockGenerator", 8),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0),
                        OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 12),
                                ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0)),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 5),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockReactorChamber", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseLead"),
                        OreBracketHandler.getOre("plateAlloyAdvanced"), OreBracketHandler.getOre("plateDenseLead")),
                        arrayOf(OreBracketHandler.getOre("plateDenseTitanium"),
                                ItemBracketHandler.getItem("IC2:blockMachine", 12),
                                OreBracketHandler.getOre("plateDenseTitanium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseLead"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateDenseLead"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemRecipePart", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"),
                        OreBracketHandler.getOre("plateCopper"), OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateCopper"),
                                OreBracketHandler.getOre("plateSilver"), OreBracketHandler.getOre("plateCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"),
                                OreBracketHandler.getOre("plateCopper"), OreBracketHandler.getOre("plateAnyRubber"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockElectric", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01Tin"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("cableGt01Tin")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 11),
                                ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0)),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0),
                                OreBracketHandler.getOre("plateSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockElectric", 7),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01AnyCopper"),
                        OreBracketHandler.getOre("plateBronze"), OreBracketHandler.getOre("cableGt01AnyCopper")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemAdvBat", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 12),
                                ItemBracketHandler.getItem("IC2:itemAdvBat", OreDictionary.WILDCARD_VALUE)),
                        arrayOf(OreBracketHandler.getOre("plateBronze"),
                                ItemBracketHandler.getItem("IC2:itemAdvBat", OreDictionary.WILDCARD_VALUE),
                                OreBracketHandler.getOre("plateBronze"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockElectric", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01Gold"),
                        OreBracketHandler.getOre("batteryElite"), OreBracketHandler.getOre("cableGt01Gold")),
                        arrayOf(OreBracketHandler.getOre("batteryElite"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                OreBracketHandler.getOre("batteryElite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("batteryElite"),
                                OreBracketHandler.getOre("plateStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockElectric", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01TungstenSteel"),
                        OreBracketHandler.getOre("batteryMaster"), OreBracketHandler.getOre("cableGt01TungstenSteel")),
                        arrayOf(OreBracketHandler.getOre("batteryMaster"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 14),
                                OreBracketHandler.getOre("batteryMaster")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitData"),
                                OreBracketHandler.getOre("batteryMaster"), OreBracketHandler.getOre("circuitData"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockRubber", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateAnyRubber"),
                        OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateAnyRubber"),
                                OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockScaffold", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwIron"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("frameGtWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockIronScaffold", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("frameGtIron"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemToolMiningLaser", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateTitanium"),
                        ItemBracketHandler.getItem("dreamcraft:item.LaserEmitter", 0),
                        OreBracketHandler.getOre("plateTitanium")), arrayOf(OreBracketHandler.getOre("circuitMaster"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32527),
                        OreBracketHandler.getOre("circuitMaster")),
                        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 2),
                                OreBracketHandler.getOre("craftingToolHardHammer"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorPlating", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateAlloyAdvanced"), OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateDenseLead"),
                                OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorPlatingHeat", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseCopper"),
                        OreBracketHandler.getOre("plateCopper"), OreBracketHandler.getOre("plateDenseCopper")),
                        arrayOf(OreBracketHandler.getOre("plateSilver"),
                                ItemBracketHandler.getItem("IC2:reactorPlating", 0),
                                OreBracketHandler.getOre("plateSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseCopper"),
                                OreBracketHandler.getOre("plateCopper"), OreBracketHandler.getOre("plateDenseCopper"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorPlatingExplosive", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseLead"),
                        OreBracketHandler.getOre("plateAlloyAdvanced"), OreBracketHandler.getOre("plateDenseLead")),
                        arrayOf(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                ItemBracketHandler.getItem("IC2:reactorPlating", 0),
                                OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseLead"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateDenseLead"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemRecipePart", 7),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                OreBracketHandler.getOre("ringStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemwoodrotor", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 7),
                        OreBracketHandler.getOre("craftingToolWrench")),
                        arrayOf(ItemBracketHandler.getItem("IC2:itemRecipePart", 7),
                                OreBracketHandler.getOre("ringStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 7)),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 7),
                                OreBracketHandler.getOre("screwSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemRecipePart", 8),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("ringTitanium"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("plateIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemironrotor", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("IC2:itemRecipePart", 11),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 8),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(ItemBracketHandler.getItem("IC2:itemRecipePart", 8),
                                OreBracketHandler.getOre("ringTitanium"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 8)),
                        arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 8),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 11))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemRecipePart", 10),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                        OreBracketHandler.getOre("plateStainlessSteel"),
                        OreBracketHandler.getOre("plateStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("ringTungstenSteel"),
                                OreBracketHandler.getOre("plateStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("plateStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:itemRecipePart", 10),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Railcraft:part.turbine.blade", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemsteelrotor", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 10),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(ItemBracketHandler.getItem("IC2:itemRecipePart", 10),
                                OreBracketHandler.getOre("ringTungstenSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 10)),
                        arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 10),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemRecipePart", 9),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                        ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                        ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0)),
                        arrayOf(ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                                OreBracketHandler.getOre("ringIridium"),
                                ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                                ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                                ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0))), null)

        //TODO Replace ("miscutils:itemTungstenSteelShaft", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemwcarbonrotor", 1),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("miscutils:itemTungstenSteelShaft", 0),
        //                ItemBracketHandler.getItem("IC2:itemRecipePart", 9),
        //                OreBracketHandler.getOre("craftingToolHardHammer")),
        //                arrayOf(ItemBracketHandler.getItem("IC2:itemRecipePart", 9),
        //                        OreBracketHandler.getOre("ringIridium"),
        //                        ItemBracketHandler.getItem("IC2:itemRecipePart", 9)),
        //                arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
        //                        ItemBracketHandler.getItem("IC2:itemRecipePart", 9),
        //                        ItemBracketHandler.getItem("miscutils:itemTungstenSteelShaft", 0))), null)

        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 4),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612),
                                OreBracketHandler.getOre("cableGt01Platinum"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 3),
                                OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                OreBracketHandler.getOre("gearGtSmallTitanium"),
                                OreBracketHandler.getOre("cableGt01Platinum"),
                                OreBracketHandler.getOre("gearGtSmallTitanium"),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 5),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601)),
                        arrayOf(OreBracketHandler.getOre("circuitGood"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 11),
                                OreBracketHandler.getOre("circuitGood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 5),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:itemSteamTurbineBlade", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Railcraft:part.turbine.disk", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:itemSteamTurbine", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Railcraft:part.turbine.rotor", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemSteamTurbine", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("IC2:itemSteamTurbineBlade", 0),
                        ItemBracketHandler.getItem("IC2:itemSteamTurbineBlade", 0),
                        ItemBracketHandler.getItem("IC2:itemSteamTurbineBlade", 0)),
                        arrayOf<IIngredient?>(null, ore2, null)), null)
        MineTweakerAPI.recipes.addShaped(item,
                arrayOf(arrayOf<IIngredient>(ore, ore, ore), arrayOf<IIngredient>(ore, ore2, ore),
                        arrayOf(ore, item2, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorReflector", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateTin"),
                        OreBracketHandler.getOre("plateAlloyCarbon"), OreBracketHandler.getOre("plateTin")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dustGraphite"),
                                OreBracketHandler.getOre("plateDenseCopper"), OreBracketHandler.getOre("dustGraphite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateTin"),
                                OreBracketHandler.getOre("plateAlloyCarbon"), OreBracketHandler.getOre("plateTin"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorReflector", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateTin"),
                        OreBracketHandler.getOre("plateAlloyCarbon"), OreBracketHandler.getOre("plateTin")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dustGraphite"),
                                OreBracketHandler.getOre("plateDenseSteel"), OreBracketHandler.getOre("dustGraphite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateTin"),
                                OreBracketHandler.getOre("plateAlloyCarbon"), OreBracketHandler.getOre("plateTin"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorReflector", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateTin"),
                        OreBracketHandler.getOre("plateAlloyCarbon"), OreBracketHandler.getOre("plateTin")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dustGraphite"),
                                OreBracketHandler.getOre("plateDoubleBeryllium"),
                                OreBracketHandler.getOre("dustGraphite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateTin"),
                                OreBracketHandler.getOre("plateAlloyCarbon"), OreBracketHandler.getOre("plateTin"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorVent", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateAluminium"),
                        ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                        OreBracketHandler.getOre("plateAluminium")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                                OreBracketHandler.getOre("craftingToolWrench"),
                                ItemBracketHandler.getItem("minecraft:iron_bars", 0)),
                        arrayOf(OreBracketHandler.getOre("plateAluminium"),
                                ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                                OreBracketHandler.getOre("plateAluminium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorVentCore", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDoubleCopper"),
                        OreBracketHandler.getOre("plateSilver"), OreBracketHandler.getOre("plateDoubleCopper")),
                        arrayOf(OreBracketHandler.getOre("plateSilver"),
                                ItemBracketHandler.getItem("IC2:reactorVent", 1),
                                OreBracketHandler.getOre("plateSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDoubleCopper"),
                                OreBracketHandler.getOre("plateSilver"),
                                OreBracketHandler.getOre("plateDoubleCopper"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorVentGold", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("plateGold"), OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("plateGold"),
                                ItemBracketHandler.getItem("IC2:reactorVentCore", 1),
                                OreBracketHandler.getOre("plateGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("plateGold"),
                                OreBracketHandler.getOre("screwStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorVentDiamond", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("IC2:reactorVentGold", 1),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                                ItemBracketHandler.getItem("IC2:itemPartIndustrialDiamond", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                                ItemBracketHandler.getItem("IC2:reactorVentGold", 1),
                                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorVentSpread", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        OreBracketHandler.getOre("plateDenseTin"),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                        arrayOf(OreBracketHandler.getOre("plateDenseTin"),
                                ItemBracketHandler.getItem("IC2:reactorVent", 1),
                                OreBracketHandler.getOre("plateDenseTin")),
                        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                                OreBracketHandler.getOre("plateDenseTin"),
                                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorHeatSwitch", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateSilver"),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAluminium"),
                                OreBracketHandler.getOre("plateCopper"), OreBracketHandler.getOre("plateAluminium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateSilver"),
                                OreBracketHandler.getOre("plateAluminium"), OreBracketHandler.getOre("plateSilver"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorHeatSwitchCore", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDoubleCopper"),
                        OreBracketHandler.getOre("plateSilver"), OreBracketHandler.getOre("plateDoubleCopper")),
                        arrayOf(OreBracketHandler.getOre("plateSilver"),
                                ItemBracketHandler.getItem("IC2:reactorHeatSwitch", 1),
                                OreBracketHandler.getOre("plateSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDoubleCopper"),
                                OreBracketHandler.getOre("plateSilver"),
                                OreBracketHandler.getOre("plateDoubleCopper"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorHeatSwitchSpread", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("plateGold"), OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("plateGold"),
                                ItemBracketHandler.getItem("IC2:reactorHeatSwitchCore", 1),
                                OreBracketHandler.getOre("plateGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("plateGold"),
                                OreBracketHandler.getOre("screwStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorHeatSwitchDiamond", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateLapis"),
                        OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("plateLapis")),
                        arrayOf(ItemBracketHandler.getItem("IC2:reactorHeatSwitchSpread", 1),
                                OreBracketHandler.getOre("plateDiamond"),
                                ItemBracketHandler.getItem("IC2:reactorHeatSwitchSpread", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateLapis"),
                                OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("plateLapis"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorCondensator", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateRedAlloy"),
                        ItemBracketHandler.getItem("IC2:reactorHeatSwitchCore", 1),
                        OreBracketHandler.getOre("plateRedAlloy")), arrayOf(OreBracketHandler.getOre("plateRedAlloy"),
                        ItemBracketHandler.getItem("IC2:reactorVentCore", 1),
                        OreBracketHandler.getOre("plateRedAlloy")), arrayOf(OreBracketHandler.getOre("plateRedAlloy"),
                        ItemBracketHandler.getItem("IC2:reactorHeatSwitchCore", 1),
                        OreBracketHandler.getOre("plateRedAlloy"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:reactorCondensator", 1),
                arrayOf(ItemBracketHandler.getItem("IC2:reactorCondensator", OreDictionary.WILDCARD_VALUE),
                        OreBracketHandler.getOre("dustRedAlloy"), OreBracketHandler.getOre("dustRedAlloy"),
                        OreBracketHandler.getOre("dustRedAlloy"), OreBracketHandler.getOre("dustRedAlloy"),
                        OreBracketHandler.getOre("dustRedAlloy"), OreBracketHandler.getOre("dustRedAlloy"),
                        OreBracketHandler.getOre("dustRedAlloy"), OreBracketHandler.getOre("dustRedAlloy")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:reactorCondensatorLap", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateDoubleRedAlloy"),
                        ItemBracketHandler.getItem("IC2:reactorVentGold", 1),
                        OreBracketHandler.getOre("plateDoubleRedAlloy")),
                        arrayOf(ItemBracketHandler.getItem("IC2:reactorCondensator", 1),
                                OreBracketHandler.getOre("plateDenseLapis"),
                                ItemBracketHandler.getItem("IC2:reactorCondensator", 1)),
                        arrayOf(OreBracketHandler.getOre("plateDoubleRedAlloy"),
                                ItemBracketHandler.getItem("IC2:reactorHeatSwitchSpread", 1),
                                OreBracketHandler.getOre("plateDoubleRedAlloy"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:reactorCondensatorLap", 1),
                arrayOf(ItemBracketHandler.getItem("IC2:reactorCondensatorLap", OreDictionary.WILDCARD_VALUE),
                        OreBracketHandler.getOre("dustLapis"), OreBracketHandler.getOre("dustLapis"),
                        OreBracketHandler.getOre("dustLapis"), OreBracketHandler.getOre("dustLapis"),
                        OreBracketHandler.getOre("dustLapis"), OreBracketHandler.getOre("dustLapis"),
                        OreBracketHandler.getOre("dustLapis"), OreBracketHandler.getOre("dustLapis")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemTreetap", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolSoftHammer"),
                        OreBracketHandler.getOre("screwWood"), OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("pipeMediumWood"),
                                OreBracketHandler.getOre("pipeMediumWood"), OreBracketHandler.getOre("pipeSmallWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("pipeLargeWood"),
                                OreBracketHandler.getOre("craftingToolSaw"),
                                OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemRecipePart", 6),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyCopper"),
                        OreBracketHandler.getOre("itemCasingAnyCopper"),
                        OreBracketHandler.getOre("itemCasingAnyCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwCopper"),
                                OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("screwCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyCopper"),
                                OreBracketHandler.getOre("itemCasingAnyCopper"),
                                OreBracketHandler.getOre("itemCasingAnyCopper"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemBarrel", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        OreBracketHandler.getOre("ringIron"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                OreBracketHandler.getOre("ringIron"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemMugEmpty", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateStone"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("plateStone")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateStone"), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:itemCofeePowder", 0),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolMortar"),
                        OreBracketHandler.getOre("cropCoffee")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemBoat", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                                ItemBracketHandler.getItem("dreamcraft:item.ElectricBoatHull", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21057),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21057))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemBoat", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"),
                                OreBracketHandler.getOre("craftingToolSoftHammer"),
                                OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"),
                                OreBracketHandler.getOre("plateAnyRubber"),
                                OreBracketHandler.getOre("plateAnyRubber"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:itemBoat", 1),
                arrayOf(ItemBracketHandler.getItem("IC2:itemBoat", 2), OreBracketHandler.getOre("plateAnyRubber"),
                        OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("craftingToolHardHammer")),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemTreetapElectric", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                        ItemBracketHandler.getItem("IC2:itemTreetap", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 3),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("batteryBasic"),
                                OreBracketHandler.getOre("plateStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemToolHoe", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("toolHeadHoeStainlessSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 3),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("batteryBasic"),
                                OreBracketHandler.getOre("plateStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:windmeter", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("rotorAluminium"),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 3),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("batteryBasic"),
                                OreBracketHandler.getOre("plateStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemDoorAlloy", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                        ItemBracketHandler.getItem("IC2:blockAlloyGlass", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                                OreBracketHandler.getOre("ringLead"), OreBracketHandler.getOre("screwLead")),
                        arrayOf(ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                                OreBracketHandler.getOre("plateDenseLead"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockWool"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("blockWool")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickSteel"), null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickSteel"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemBatChargeRE", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("circuitBasic"),
                        OreBracketHandler.getOre("batteryBasic"), OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(OreBracketHandler.getOre("batteryBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17315),
                                OreBracketHandler.getOre("batteryBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitBasic"),
                                OreBracketHandler.getOre("batteryBasic"), OreBracketHandler.getOre("circuitBasic"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockPersonal", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("chestIron"), OreBracketHandler.getOre("screwIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockCrop", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickLongWood"), null,
                        OreBracketHandler.getOre("stickLongWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickLongWood"), null,
                                OreBracketHandler.getOre("stickLongWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemFoamSprayer", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("pipeSmallSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("pipeSmallSteel"),
                                ItemBracketHandler.getItem("IC2:itemFluidCell", 0)),
                        arrayOf(OreBracketHandler.getOre("screwIron"),
                                ItemBracketHandler.getItem("minecraft:stone_button", 0),
                                OreBracketHandler.getOre("circuitBasic"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemArmorAlloyChestplate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                ItemBracketHandler.getItem("Railcraft:armor.steel.plate", 0),
                                OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                ItemBracketHandler.getItem("minecraft:leather_chestplate", 0),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemArmorAlloyChestplate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                ItemBracketHandler.getItem("minecraft:leather_chestplate", 0),
                                OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                ItemBracketHandler.getItem("Railcraft:armor.steel.plate", 0),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                OreBracketHandler.getOre("screwSteel"),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)

        //TODO Replace ("TGregworks:tGregToolPartLargeSwordBlade", 1529)
        //val recipes = MineTweakerAPI.recipes
        //val item4 = ItemBracketHandler.getItem("IC2:itemNanoSaber", 0)
        //val array: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        //val n = 0
        //val array2 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateAlloyIridium"), null, null)
        //val n2 = 1
        //val item5 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargeSwordBlade", 1529)
        //val hashMap = HashMap<String, IData>()
        //hashMap["material"] = ExpandString.asData("TungstenSteel")
        //array2[n2] = item5.withTag(ExpandAnyDict.asData(hashMap))
        //array2[2] = OreBracketHandler.getOre("plateAlloyIridium")
        //array[n] = array2
        //array[1] = arrayOf(OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("batteryMaster"),
        //        OreBracketHandler.getOre("circuitMaster"))
        //array[2] = arrayOf(OreBracketHandler.getOre("craftingToolFile"),
        //        ItemBracketHandler.getItem("IC2:itemRecipePart", 2), OreBracketHandler.getOre("craftingToolHardHammer"))
        //recipes.addShaped(item4, array, null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:obscurator", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("cableGt01Gold"),
                                ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                                OreBracketHandler.getOre("cableGt01Gold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                                OreBracketHandler.getOre("batteryAdvanced"),
                                OreBracketHandler.getOre("itemCasingAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemScanner", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingGold"),
                        OreBracketHandler.getOre("plateStainlessSteel"), OreBracketHandler.getOre("itemCasingGold")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01Gold"),
                                OreBracketHandler.getOre("batteryElite"), OreBracketHandler.getOre("cableGt01Gold"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemScannerAdv", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingTitanium"),
                        ItemBracketHandler.getItem("IC2:itemScanner", OreDictionary.WILDCARD_VALUE),
                        OreBracketHandler.getOre("itemCasingTitanium")),
                        arrayOf(OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                                OreBracketHandler.getOre("circuitData")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01Nichrome"),
                                OreBracketHandler.getOre("batteryMaster"),
                                OreBracketHandler.getOre("cableGt01Nichrome"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemRecipePart", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01AnyCopper"),
                        OreBracketHandler.getOre("itemCasingSteel"), OreBracketHandler.getOre("cableGt01AnyCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("circuitBasic"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemRecipePart", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt02Gold"),
                        OreBracketHandler.getOre("itemCasingStainlessSteel"),
                        OreBracketHandler.getOre("cableGt02Gold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("itemCasingStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("circuitAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockPersonal", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockPersonal", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0),
                        OreBracketHandler.getOre("screwSteel")), arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                        OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(OreBracketHandler.getOre("craftingToolHardHammer"),
                                ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine2", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("chestIron"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("circuitBasic"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine3", 6),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                        OreBracketHandler.getOre("itemCasingAnyIron"), OreBracketHandler.getOre("itemCasingAnyIron")),
                        arrayOf(OreBracketHandler.getOre("craftingChest"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                OreBracketHandler.getOre("craftingChest")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                                OreBracketHandler.getOre("itemCasingAnyIron"),
                                OreBracketHandler.getOre("itemCasingAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine3", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("itemCasingAnyIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:upgradeModule", 3),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                ItemBracketHandler.getItem("IC2:upgradeModule", 3)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                                OreBracketHandler.getOre("craftingChest"),
                                OreBracketHandler.getOre("itemCasingAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine3", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("itemCasingAnyIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:upgradeModule", 4),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                ItemBracketHandler.getItem("IC2:upgradeModule", 4)),
                        arrayOf(OreBracketHandler.getOre("pipeLargeSteel"),
                                ItemBracketHandler.getItem("IC2:itemFluidCell", 0),
                                OreBracketHandler.getOre("pipeLargeSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine3", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingAnyIron"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                        OreBracketHandler.getOre("itemCasingAnyIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                                OreBracketHandler.getOre("circuitBasic"),
                                OreBracketHandler.getOre("itemCasingAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine3", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(OreBracketHandler.getOre("pipeMediumSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 6),
                                OreBracketHandler.getOre("pipeMediumSteel")),
                        arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 5),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine2", 15),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorCoolantSimple", 1),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("IC2:reactorCoolantSimple", 1)),
                        arrayOf(OreBracketHandler.getOre("pipeMediumSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 6),
                                OreBracketHandler.getOre("pipeMediumSteel")),
                        arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine2", 14),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                        OreBracketHandler.getOre("itemCasingSteel"), OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(OreBracketHandler.getOre("pipeMediumSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32611),
                                OreBracketHandler.getOre("pipeMediumSteel")),
                        arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine2", 12),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                        OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                OreBracketHandler.getOre("chestSteel"),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("itemCasingSteel"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine2", 11),
                arrayOf(arrayOf(OreBracketHandler.getOre("circuitElite"),
                        ItemBracketHandler.getItem("IC2:blockElectric", 2), OreBracketHandler.getOre("circuitElite")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604),
                                ItemBracketHandler.getItem("IC2:blockMachine", 12),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32654),
                                ItemBracketHandler.getItem("IC2:blockMachine2", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32654))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine2", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                                ItemBracketHandler.getItem("IC2:blockElectric", 4),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("cableGt04Gold"),
                                OreBracketHandler.getOre("circuitAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine2", 0),
                arrayOf(arrayOf(item3, OreBracketHandler.getOre("lensDiamond"), item3),
                        arrayOf(OreBracketHandler.getOre("circuitElite"),
                                ItemBracketHandler.getItem("IC2:blockElectric", 5),
                                OreBracketHandler.getOre("circuitElite")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604),
                                OreBracketHandler.getOre("cableGt04Platinum"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockMachine", 9),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateRedAlloy"),
                        OreBracketHandler.getOre("itemCasingSteel"), OreBracketHandler.getOre("plateRedAlloy")),
                        arrayOf(OreBracketHandler.getOre("springSteelMagnetic"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                OreBracketHandler.getOre("springSteelMagnetic")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockChargepad", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                        ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("IC2:blockElectric", 2),
                                OreBracketHandler.getOre("circuitData")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockChargepad", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("minecraft:heavy_weighted_pressure_plate", 0),
                        OreBracketHandler.getOre("screwAluminium")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("IC2:blockElectric", 1),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAluminium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("itemCasingAluminium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockChargepad", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                        OreBracketHandler.getOre("screwSteel")), arrayOf(OreBracketHandler.getOre("circuitGood"),
                        ItemBracketHandler.getItem("IC2:blockElectric", 7), OreBracketHandler.getOre("circuitGood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockChargepad", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwIron"),
                        ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0),
                        OreBracketHandler.getOre("screwIron")), arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("IC2:blockElectric", 0), OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("itemCasingAnyIron"))), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("IC2:blockGenerator", 9),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("rotorStainlessSteel"),
                                OreBracketHandler.getOre("gearTitanium"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                OreBracketHandler.getOre("gearTitanium"),
                                OreBracketHandler.getOre("rotorStainlessSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("cableGt01Platinum"),
                                OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 11),
                                OreBracketHandler.getOre("circuitData"), OreBracketHandler.getOre("cableGt01Platinum"),
                                null, null), arrayOf(null, null, OreBracketHandler.getOre("rotorStainlessSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32538),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                        OreBracketHandler.getOre("rotorStainlessSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockGenerator", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseLead"),
                        OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("plateDenseLead")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:blockReactorChamber", 0),
                                ItemBracketHandler.getItem("IC2:blockReactorChamber", 0),
                                ItemBracketHandler.getItem("IC2:blockReactorChamber", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseTitanium"),
                                OreBracketHandler.getOre("cableGt08Platinum"),
                                OreBracketHandler.getOre("plateDenseTitanium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockHeatGenerator", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 5),
                        OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(OreBracketHandler.getOre("pipeMediumSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings3", 14),
                                OreBracketHandler.getOre("pipeMediumSteel")),
                        arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockHeatGenerator", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 5),
                        OreBracketHandler.getOre("itemCasingSteel")), arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.blockcasings3", 14),
                        OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("craftingIronFurnace"),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:itemRecipePart", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemRecipePart", 1)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                        OreBracketHandler.getOre("rotorStainlessSteel"),
                        OreBracketHandler.getOre("itemCasingStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt04Gold"),
                                OreBracketHandler.getOre("rotorStainlessSteel"),
                                OreBracketHandler.getOre("cableGt04Gold"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                        OreBracketHandler.getOre("rotorStainlessSteel"),
                        OreBracketHandler.getOre("itemCasingStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                ItemBracketHandler.getItem("Railcraft:machine.beta", 4),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("rotorStainlessSteel"),
                                OreBracketHandler.getOre("circuitAdvanced"))), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("IC2:blockKineticGenerator", 0),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                OreBracketHandler.getOre("gearGtSmallTitanium"),
                                OreBracketHandler.getOre("cableGt01Platinum"),
                                OreBracketHandler.getOre("gearGtSmallTitanium"),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 3),
                                OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                OreBracketHandler.getOre("cableGt01Platinum"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 12),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"),
                                OreBracketHandler.getOre("plateDoubleStainlessSteel"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:blockGenerator", 7),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2006),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 11),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2006)),
                        arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17084),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotIridium"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotIridium"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17084),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 13084), null,
                                null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17084).amount(16),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 3084),
                        OreBracketHandler.getOre("craftingToolCrowbar"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 3084),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIridium"),
                        OreBracketHandler.getOre("ingotIridium"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIridium"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 4084),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIridium"),
                        OreBracketHandler.getOre("ingotIridium"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 12084),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIridium"),
                        OreBracketHandler.getOre("plateIridium"), OreBracketHandler.getOre("ingotIridium")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("craftingToolFile"), null)), null)
        val recipes2 = MineTweakerAPI.recipes
        val item6 = ItemBracketHandler.getItem("gregtech:gt.metatool.01", 12)
        val hashMap2 = HashMap<String, IData>()
        val s = "GT.ToolStats"
        val hashMap3 = HashMap<String, IData>()
        hashMap3["PrimaryMaterial"] = ExpandString.asData("Iridium")
        hashMap3["MaxDamage"] = ExpandLong.asData(512000L)
        hashMap3["SecondaryMaterial"] = ExpandString.asData("Steel")
        hashMap2[s] = ExpandAnyDict.asData(hashMap3)
        recipes2.addShaped(item6.withTag(ExpandAnyDict.asData(hashMap2)),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotIridium"),
                        OreBracketHandler.getOre("ingotIridium"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotIridium"),
                                OreBracketHandler.getOre("ingotIridium"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotIridium"),
                                OreBracketHandler.getOre("ingotIridium"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 1084),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIridium"),
                        OreBracketHandler.getOre("ingotIridium"), OreBracketHandler.getOre("ingotIridium")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"), null,
                                OreBracketHandler.getOre("craftingToolHardHammer")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 13084),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIridium"),
                        OreBracketHandler.getOre("plateIridium"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIridium"),
                                OreBracketHandler.getOre("plateIridium"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("craftingToolFile"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 84),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateIridium"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("plateIridium"),
                                OreBracketHandler.getOre("craftingToolHardHammer")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 7084),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIridium"),
                        OreBracketHandler.getOre("plateIridium"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("craftingToolHardHammer"), null), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 2084),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolFile"),
                        OreBracketHandler.getOre("plateIridium"), OreBracketHandler.getOre("craftingToolHardHammer"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11084).amount(16),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 1084),
                        OreBracketHandler.getOre("craftingToolCrowbar"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemWeedingTrowel", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickSteel"),
                                OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("screwSteel"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"),
                        ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:itemFluidCell", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemCellEmpty", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("IC2:itemCellEmpty", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemFluidCell", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemPartCFPowder", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("dustCalcite"),
                        OreBracketHandler.getOre("dustCalcite"), OreBracketHandler.getOre("dustStone")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("dustClay"),
                                OreBracketHandler.getOre("dustQuartzSand"), null), arrayOfNulls(3)), null)

        //TODO Replace ("TConstruct:buckets", 25)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemArmorRubBoots", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("plateRubber"),
        //                ItemBracketHandler.getItem("IC2:itemArmorRubBoots", OreDictionary.WILDCARD_VALUE),
        //                OreBracketHandler.getOre("plateRubber")),
        //                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null),
        //                arrayOf(null, IngredientTransform.giveBack(ItemBracketHandler.getItem("TConstruct:buckets", 25),
        //                        ItemBracketHandler.getItem("minecraft:bucket", 0)), null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemArmorHazmatHelmet", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("plateRubber"),
        //                ItemBracketHandler.getItem("IC2:itemArmorHazmatHelmet", OreDictionary.WILDCARD_VALUE),
        //                OreBracketHandler.getOre("plateRubber")),
        //                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null),
        //                arrayOf(null, IngredientTransform.giveBack(ItemBracketHandler.getItem("TConstruct:buckets", 25),
        //                        ItemBracketHandler.getItem("minecraft:bucket", 0)), null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemArmorHazmatChestplate", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("plateRubber"),
        //                ItemBracketHandler.getItem("IC2:itemArmorHazmatChestplate", OreDictionary.WILDCARD_VALUE),
        //                OreBracketHandler.getOre("plateRubber")),
        //                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null),
        //                arrayOf(null, IngredientTransform.giveBack(ItemBracketHandler.getItem("TConstruct:buckets", 25),
        //                        ItemBracketHandler.getItem("minecraft:bucket", 0)), null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemArmorHazmatLeggings", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("plateRubber"),
        //                ItemBracketHandler.getItem("IC2:itemArmorHazmatLeggings", OreDictionary.WILDCARD_VALUE),
        //                OreBracketHandler.getOre("plateRubber")),
        //                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null),
        //                arrayOf(null, IngredientTransform.giveBack(ItemBracketHandler.getItem("TConstruct:buckets", 25),
        //                        ItemBracketHandler.getItem("minecraft:bucket", 0)), null)), null)

        val item7 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val item8 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap4 = HashMap<String, IData>()
        val s2 = "Fluid"
        val hashMap5 = HashMap<String, IData>()
        hashMap5["FluidName"] = ExpandString.asData("ic2biogas")
        hashMap5["Amount"] = ExpandInt.toData(1000)
        hashMap4[s2] = ExpandAnyDict.asData(hashMap5)
        Fuels.addGasTurbineFuel(item7, item8.withTag(ExpandAnyDict.asData(hashMap4)), 40)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorRubBoots", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2880).amount(6),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0).amount(0), 300, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorRubBoots", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880).amount(6),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0).amount(0), 200, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorBronzeBoots", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0).amount(0), 400, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorBronzeChestplate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(8),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0).amount(0), 400, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorBronzeHelmet", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(5),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0).amount(0), 400, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorBronzeLegs", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(7),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0).amount(0), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockMachine", 6),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 231),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 431), 1200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockHeatGenerator", 2),
                ItemBracketHandler.getItem("IC2:blockGenerator", 5),
                ItemBracketHandler.getItem("IC2:itemRecipePart", 5).amount(3),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(576), 600, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockGenerator", 6),
                ItemBracketHandler.getItem("IC2:blockGenerator", 5),
                ItemBracketHandler.getItem("IC2:blockGenerator", 8),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(576), 600, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockElectric", 3),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 21),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246).amount(2), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockElectric", 4),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 22),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1367).amount(2), 250, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockElectric", 5),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 23),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1428).amount(2), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockElectric", 6),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 24),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1529).amount(2), 100, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23355),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1360).amount(16), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemPartCoalChunk", 0),
                ItemBracketHandler.getItem("minecraft:coal_block", 0),
                ItemBracketHandler.getItem("IC2:itemPartCoalBlock", 0).amount(8), 1200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemTreetap", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5102).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27809), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockScaffold", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809), 200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockIronScaffold", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4128),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemBoat", 1),
                ItemBracketHandler.getItem("IC2:itemBoat", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880), 20, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemWeedingTrowel", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(144), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemCropnalyzer", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32702),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 1200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemToolMEter", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0).amount(2),
                LiquidBracketHandler.getLiquid("molten.glowstone").withAmount(288), 600, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.reactorUraniumDual", 0),
                ItemBracketHandler.getItem("gregtech:gt.reactorUraniumSimple", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(4), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.reactorUraniumQuad", 0),
                ItemBracketHandler.getItem("gregtech:gt.reactorUraniumDual", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(4), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.reactorUraniumQuad", 0),
                ItemBracketHandler.getItem("gregtech:gt.reactorUraniumSimple", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22305).amount(6), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.reactorMOXDual", 0),
                ItemBracketHandler.getItem("gregtech:gt.reactorMOXSimple", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(4), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.reactorMOXQuad", 0),
                ItemBracketHandler.getItem("gregtech:gt.reactorMOXDual", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(4), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.reactorMOXQuad", 0),
                ItemBracketHandler.getItem("gregtech:gt.reactorMOXSimple", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22305).amount(6), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemDoorAlloy", 0),
                ItemBracketHandler.getItem("IC2:itemPartAlloy", 0).amount(3),
                ItemBracketHandler.getItem("IC2:blockAlloyGlass", 0),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(720), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemRemote", 0),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), ItemBracketHandler.getItem("IC2:upgradeModule", 0), 1200,
                4)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemFreq", 0),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1466).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 1200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:upgradeModule", 0),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                ItemBracketHandler.getItem("IC2:reactorCoolantTriple", 1),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(144), 1200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:upgradeModule", 1),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                ItemBracketHandler.getItem("IC2:itemRecipePart", 0).amount(2),
                LiquidBracketHandler.getLiquid("molten.gold").withAmount(288), 1200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:upgradeModule", 2),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(144), 1200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:upgradeModule", 3),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(144), 1200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:upgradeModule", 4),
                ItemBracketHandler.getItem("IC2:upgradeModule", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(144), 1200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:upgradeModule", 5),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(144), 1200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:upgradeModule", 6),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(144), 1200, VoltageLevels.LLV)

        //TODO Replace getLiquid("glue")
        //Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorHazmatHelmet", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880).amount(5),
        //        ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassLense", 0).amount(2),
        //        LiquidBracketHandler.getLiquid("glue").withAmount(144), 500, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorHazmatHelmet", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880).amount(5),
                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassLense", 0).amount(2),
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(144), 500, VoltageLevels.LV)

        //TODO Replace getLiquid("glue")
        //Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorHazmatChestplate", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880).amount(8),
        //        ItemBracketHandler.getItem("minecraft:wool", 1).amount(4),
        //        LiquidBracketHandler.getLiquid("glue").withAmount(144), 500, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorHazmatChestplate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880).amount(8),
                ItemBracketHandler.getItem("minecraft:wool", 1).amount(4),
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(144), 500, VoltageLevels.LV)

        //TODO Replace getLiquid("glue")
        //Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorHazmatLeggings", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880).amount(7),
        //        ItemBracketHandler.getItem("minecraft:carpet", 1).amount(4),
        //        LiquidBracketHandler.getLiquid("glue").withAmount(144), 500, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemArmorHazmatLeggings", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880).amount(7),
                ItemBracketHandler.getItem("minecraft:carpet", 1).amount(4),
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(144), 500, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemSolarHelmet", 0),
                ItemBracketHandler.getItem("minecraft:iron_helmet", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(288), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemSolarHelmet", 0),
                ItemBracketHandler.getItem("minecraft:iron_helmet", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(144), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemSolarHelmet", 0),
                ItemBracketHandler.getItem("minecraft:iron_helmet", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(72), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemContainmentbox", 0),
                ItemBracketHandler.getItem("minecraft:chest", 0), OreBracketHandler.getOre("itemCasingLead").amount(8),
                300, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemToolbox", 0),
                ItemBracketHandler.getItem("minecraft:chest", 0),
                OreBracketHandler.getOre("itemCasingBronze").amount(5), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemMOX", 0),
                ItemBracketHandler.getItem("IC2:itemUran238", 0).amount(6),
                ItemBracketHandler.getItem("IC2:itemPlutonium", 0).amount(3),
                LiquidBracketHandler.getLiquid("ic2coolant").withAmount(1000), 400, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemUran", 0),
                ItemBracketHandler.getItem("IC2:itemUran238", 0).amount(6),
                ItemBracketHandler.getItem("IC2:itemUran235small", 0).amount(3),
                LiquidBracketHandler.getLiquid("ic2coolant").withAmount(1000), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockreactorvessel", 0),
                ItemBracketHandler.getItem("IC2:blockAlloy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17089).amount(2), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockReactorFluidPort", 0),
                ItemBracketHandler.getItem("IC2:blockreactorvessel", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockReactorAccessHatch", 0),
                ItemBracketHandler.getItem("IC2:blockreactorvessel", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32632), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockReactorRedstonePort", 0),
                ItemBracketHandler.getItem("IC2:blockreactorvessel", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32731), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockLuminatorDark", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30087),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1360).amount(8),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(1152), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockLuminatorDark", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30004),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1360).amount(16),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(1152), 400, VoltageLevels.LMV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:furnace", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032).amount(5), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:blockCrop", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22809).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 150, VoltageLevels.LV)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemPartCoalChunk", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.BioChunk", 0)), 1200, VoltageLevels.MV, 1000)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemPartCarbonMesh", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.BioOrganicMesh", 0)), 600, VoltageLevels.MV, 1000)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.BioCarbonPlate", 0)), 600, VoltageLevels.MV, 1000)
        Brewery.addRecipe(LiquidBracketHandler.getLiquid("ic2biomass").withAmount(1000),
                ItemBracketHandler.getItem("IC2:itemBiochaff", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), false)
        Canner.addRecipe(ItemBracketHandler.getItem("IC2:reactorUraniumSimple", 1),
                ItemBracketHandler.getItem("IC2:itemUran", 0), ItemBracketHandler.getItem("IC2:itemFuelRod", 0), 200,
                VoltageLevels.LMV)
        Canner.addRecipe(ItemBracketHandler.getItem("IC2:reactorMOXSimple", 1),
                ItemBracketHandler.getItem("IC2:itemMOX", 0), ItemBracketHandler.getItem("IC2:itemFuelRod", 0), 200, VoltageLevels.LMV)
        Canner.addRecipe(ItemBracketHandler.getItem("gregtech:gt.Thoriumcell", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2096),
                ItemBracketHandler.getItem("IC2:itemFuelRod", 0), 200, VoltageLevels.LMV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterBlack", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblack").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterRed", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyered").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterGreen", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegreen").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterBrown", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyebrown").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterBlue", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblue").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterPurple", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepurple").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterCyan", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyecyan").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterLightGrey", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightgray").withAmount(144), intArrayOf(10000), 200,
                VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterDarkGrey", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegray").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterPink", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepink").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterLime", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelime").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterYellow", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeyellow").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterCloud", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightblue").withAmount(144), intArrayOf(10000), 200,
                VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterMagenta", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyemagenta").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterOrange", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeorange").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("IC2:itemToolPainterWhite", 0)),
                ItemBracketHandler.getItem("IC2:itemToolPainter", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyewhite").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:blockMetal", 3),
                ItemBracketHandler.getItem("IC2:itemUran238", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("minecraft:reeds", 0).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("minecraft:sapling", OreDictionary.WILDCARD_VALUE).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("BiomesOPlenty:saplings", OreDictionary.WILDCARD_VALUE).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("BiomesOPlenty:colorizedSaplings", OreDictionary.WILDCARD_VALUE).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("IC2:blockRubSapling", 0).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("Forestry:sapling", OreDictionary.WILDCARD_VALUE).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("Natura:florasapling", OreDictionary.WILDCARD_VALUE).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("Natura:RareSapling", OreDictionary.WILDCARD_VALUE).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 0).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 1).amount(8))
        Compressor.addRecipe(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0),
                ItemBracketHandler.getItem("TwilightForest:tile.TFSapling", OreDictionary.WILDCARD_VALUE).amount(8))
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:itemBoat", 0),
                ItemBracketHandler.getItem("IC2:itemPartCarbonMesh", 0).amount(8),
                ItemBracketHandler.getItem("dreamcraft:item.ExtruderShapeBoat", 0).amount(0), 600, VoltageLevels.LV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:itemBoat", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11880).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.ExtruderShapeBoat", 0).amount(0), 200, VoltageLevels.LLV)
        Extruder.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ElectricBoatHull", 0),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(8),
                ItemBracketHandler.getItem("dreamcraft:item.ExtruderShapeBoat", 0).amount(0), 1200, VoltageLevels.LV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5130),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 1, VoltageLevels.LMV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5131),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 4, VoltageLevels.LMV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5132),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 8, VoltageLevels.LMV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5133),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 16, VoltageLevels.LMV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5134),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 32, VoltageLevels.LMV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5140),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 4, VoltageLevels.MV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5141),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 8, VoltageLevels.MV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5142),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 16, VoltageLevels.MV)
        Extruder.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5143),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358).amount(0), 32, VoltageLevels.MV)
        FluidCanner.addRecipe(ItemBracketHandler.getItem("IC2:itemMugCoffee", 1),
                ItemBracketHandler.getItem("IC2:itemMugEmpty", 0), null,
                LiquidBracketHandler.getLiquid("potion.darkcoffee").withAmount(500))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("IC2:itemMugCoffee", 2),
                ItemBracketHandler.getItem("IC2:itemMugEmpty", 0), null,
                LiquidBracketHandler.getLiquid("potion.cafeaulait").withAmount(500))
        val item9 = ItemBracketHandler.getItem("IC2:itemFoamSprayer", 0)
        val hashMap6 = HashMap<String, IData>()
        val s3 = "Fluid"
        val hashMap7 = HashMap<String, IData>()
        hashMap7["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap7["Amount"] = ExpandInt.toData(8000)
        hashMap6[s3] = ExpandAnyDict.asData(hashMap7)
        FluidCanner.addRecipe(item9.withTag(ExpandAnyDict.asData(hashMap6)),
                ItemBracketHandler.getItem("IC2:itemFoamSprayer", 0), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(8000))
        val item10 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 24)
        val hashMap8 = HashMap<String, IData>()
        val s4 = "Fluid"
        val hashMap9 = HashMap<String, IData>()
        hashMap9["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap9["Amount"] = ExpandInt.toData(8000)
        hashMap8[s4] = ExpandAnyDict.asData(hashMap9)
        FluidCanner.addRecipe(item10.withTag(ExpandAnyDict.asData(hashMap8)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(8000))
        val item11 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 21)
        val hashMap10 = HashMap<String, IData>()
        val s5 = "Fluid"
        val hashMap11 = HashMap<String, IData>()
        hashMap11["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap11["Amount"] = ExpandInt.toData(16000)
        hashMap10[s5] = ExpandAnyDict.asData(hashMap11)
        FluidCanner.addRecipe(item11.withTag(ExpandAnyDict.asData(hashMap10)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(16000))
        val item12 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 19)
        val hashMap12 = HashMap<String, IData>()
        val s6 = "Fluid"
        val hashMap13 = HashMap<String, IData>()
        hashMap13["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap13["Amount"] = ExpandInt.toData(24000)
        hashMap12[s6] = ExpandAnyDict.asData(hashMap13)
        FluidCanner.addRecipe(item12.withTag(ExpandAnyDict.asData(hashMap12)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(24000))
        val item13 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 16)
        val hashMap14 = HashMap<String, IData>()
        val s7 = "Fluid"
        val hashMap15 = HashMap<String, IData>()
        hashMap15["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap15["Amount"] = ExpandInt.toData(32000)
        hashMap14[s7] = ExpandAnyDict.asData(hashMap15)
        FluidCanner.addRecipe(item13.withTag(ExpandAnyDict.asData(hashMap14)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(32000))
        val item14 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 13)
        val hashMap16 = HashMap<String, IData>()
        val s8 = "Fluid"
        val hashMap17 = HashMap<String, IData>()
        hashMap17["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap17["Amount"] = ExpandInt.toData(40000)
        hashMap16[s8] = ExpandAnyDict.asData(hashMap17)
        FluidCanner.addRecipe(item14.withTag(ExpandAnyDict.asData(hashMap16)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(40000))
        val item15 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 10)
        val hashMap18 = HashMap<String, IData>()
        val s9 = "Fluid"
        val hashMap19 = HashMap<String, IData>()
        hashMap19["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap19["Amount"] = ExpandInt.toData(48000)
        hashMap18[s9] = ExpandAnyDict.asData(hashMap19)
        FluidCanner.addRecipe(item15.withTag(ExpandAnyDict.asData(hashMap18)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(48000))
        val item16 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 7)
        val hashMap20 = HashMap<String, IData>()
        val s10 = "Fluid"
        val hashMap21 = HashMap<String, IData>()
        hashMap21["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap21["Amount"] = ExpandInt.toData(54000)
        hashMap20[s10] = ExpandAnyDict.asData(hashMap21)
        FluidCanner.addRecipe(item16.withTag(ExpandAnyDict.asData(hashMap20)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(54000))
        val item17 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 4)
        val hashMap22 = HashMap<String, IData>()
        val s11 = "Fluid"
        val hashMap23 = HashMap<String, IData>()
        hashMap23["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap23["Amount"] = ExpandInt.toData(62000)
        hashMap22[s11] = ExpandAnyDict.asData(hashMap23)
        FluidCanner.addRecipe(item17.withTag(ExpandAnyDict.asData(hashMap22)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(62000))
        val item18 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 1)
        val hashMap24 = HashMap<String, IData>()
        val s12 = "Fluid"
        val hashMap25 = HashMap<String, IData>()
        hashMap25["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap25["Amount"] = ExpandInt.toData(70000)
        hashMap24[s12] = ExpandAnyDict.asData(hashMap25)
        FluidCanner.addRecipe(item18.withTag(ExpandAnyDict.asData(hashMap24)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(70000))
        val item19 = ItemBracketHandler.getItem("IC2:itemArmorCFPack", 1)
        val hashMap26 = HashMap<String, IData>()
        val s13 = "Fluid"
        val hashMap27 = HashMap<String, IData>()
        hashMap27["FluidName"] = ExpandString.asData("ic2constructionfoam")
        hashMap27["Amount"] = ExpandInt.toData(80000)
        hashMap26[s13] = ExpandAnyDict.asData(hashMap27)
        FluidCanner.addRecipe(item19.withTag(ExpandAnyDict.asData(hashMap26)),
                ItemBracketHandler.getItem("IC2:itemArmorCFPack", 26), null,
                LiquidBracketHandler.getLiquid("ic2constructionfoam").withAmount(80000))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("IC2:reactorCoolantSimple", 1),
                ItemBracketHandler.getItem("dreamcraft:item.TenKCell", 0), null,
                LiquidBracketHandler.getLiquid("ic2coolant").withAmount(1000))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("IC2:reactorCoolantTriple", 1),
                ItemBracketHandler.getItem("dreamcraft:item.ThirtyKCell", 0), null,
                LiquidBracketHandler.getLiquid("ic2coolant").withAmount(3000))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("IC2:reactorCoolantSix", 1),
                ItemBracketHandler.getItem("dreamcraft:item.SixtyKCell", 0), null,
                LiquidBracketHandler.getLiquid("ic2coolant").withAmount(6000))
        Lathe.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23500),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1500).amount(2)),
                ItemBracketHandler.getItem("IC2:itemPartIndustrialDiamond", 0), 3830, VoltageLevels.LLV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("IC2:itemDensePlates", 7),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804).amount(9), 3600, VoltageLevels.MV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("IC2:itemDensePlates", 8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(9), 3600, VoltageLevels.MV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2844)),
                ItemBracketHandler.getItem("IC2:blockBasalt", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.LapotronDust", 0).amount(30)),
                ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE), intArrayOf(10000), 300, VoltageLevels.LULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("IC2:itemPartCoalBall", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemDust", 2).amount(8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2802),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)), 100, VoltageLevels.LLV)
        Polarizer.addRecipe(ItemBracketHandler.getItem("IC2:itemStaticBoots", 0),
                ItemBracketHandler.getItem("minecraft:iron_boots", 0), 600, VoltageLevels.LV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5130), 100, VoltageLevels.ULV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5131), 150, VoltageLevels.ULV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5132), 200, VoltageLevels.LLV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5133), 250, VoltageLevels.LV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5134), 300, VoltageLevels.LMV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5140), 200, VoltageLevels.LMV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5141), 250, VoltageLevels.MV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5142), 300, VoltageLevels.MV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("IC2:blockMiningPipe", 0).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5143), 350, VoltageLevels.LHV)
        val item20 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap28 = HashMap<String, IData>()
        val s14 = "Fluid"
        val hashMap29 = HashMap<String, IData>()
        hashMap29["FluidName"] = ExpandString.asData("ic2coolant")
        hashMap29["Amount"] = ExpandInt.toData(1000)
        hashMap28[s14] = ExpandAnyDict.asData(hashMap29)
        val withTag = item20.withTag(ExpandAnyDict.asData(hashMap28))
        val item21 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap30 = HashMap<String, IData>()
        val s15 = "Fluid"
        val hashMap31 = HashMap<String, IData>()
        hashMap31["FluidName"] = ExpandString.asData("ic2hotcoolant")
        hashMap31["Amount"] = ExpandInt.toData(1000)
        hashMap30[s15] = ExpandAnyDict.asData(hashMap31)
        VacuumFreezer.addRecipe(withTag, item21.withTag(ExpandAnyDict.asData(hashMap30)), 200)
    }
}