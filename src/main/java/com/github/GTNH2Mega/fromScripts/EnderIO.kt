package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.ChemicalBath
import gttweaker.mods.gregtech.machines.FluidSolidifier
import gttweaker.mods.gregtech.machines.Pulverizer
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.tooltip.IngredientTooltips
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandByte
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class EnderIO : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600)
        val item2 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601)
        val item3 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602)
        val item4 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603)
        val item5 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606)
        val item6 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610)
        val item7 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32611)
        val item8 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612)
        val item9 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652)
        val item10 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32675)
        val ore = OreBracketHandler.getOre("circuitBasic")
        val ore2 = OreBracketHandler.getOre("circuitGood")
        val ore3 = OreBracketHandler.getOre("circuitAdvanced")
        val ore4 = OreBracketHandler.getOre("circuitData")
        val ore5 = OreBracketHandler.getOre("circuitMaster")
        val item11 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17367)
        val item12 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17378)
        val item13 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17366)
        val ore6 = OreBracketHandler.getOre("plateRedstone")
        val ore7 = OreBracketHandler.getOre("plateElectricalSteel")
        val ore8 = OreBracketHandler.getOre("plateEndSteel")
        val ore9 = OreBracketHandler.getOre("plateStellarAlloy")
        val ore10 = OreBracketHandler.getOre("ingotEndSteel")
        val ore11 = OreBracketHandler.getOre("ingotStellarAlloy")
        val item14 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 0)
        val item15 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 1)
        val item16 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 2)
        val item17 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 3)
        val item18 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 4)
        val item19 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 5)
        val item20 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 6)
        val item21 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 7)
        val item22 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 8)
        val item23 = ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 9)
        val ore12 = OreBracketHandler.getOre("itemCasingDarkSteel")
        val ore13 = OreBracketHandler.getOre("itemCasingEndSteel")
        val ore14 = OreBracketHandler.getOre("craftingIronFurnace")
        val item24 = ItemBracketHandler.getItem("EnderIO:itemMachinePart", 0)
        val item25 = ItemBracketHandler.getItem("EnderIO:itemMachinePart", 2)
        val item26 = ItemBracketHandler.getItem("EnderIO:itemMachinePart", 3)
        val ore15 = OreBracketHandler.getOre("itemCasingAnyIron")
        val ore16 = OreBracketHandler.getOre("itemCasingSteel")
        val ore17 = OreBracketHandler.getOre("itemCasingAluminium")
        val ore18 = OreBracketHandler.getOre("rotorIron")
        val ore19 = OreBracketHandler.getOre("rotorSteel")
        val item27 = ItemBracketHandler.getItem("EnderIO:blockTank", 0)
        val item28 = ItemBracketHandler.getItem("EnderIO:blockFusedQuartz", 0)
        val item29 = ItemBracketHandler.getItem("EnderIO:blockFusedQuartz", 2)
        val item30 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640)
        val ore20 = OreBracketHandler.getOre("plateDensePulsatingIron")
        OreBracketHandler.getOre("gearDiamond")
        val ore21 = OreBracketHandler.getOre("gearElectricalSteel")
        val item31 = ItemBracketHandler.getItem("minecraft:cauldron", 0)
        val item32 = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val item33 = ItemBracketHandler.getItem("dreamcraft:item.Display", 0)
        val item34 = ItemBracketHandler.getItem("EnderIO:itemConduitProbe", 0)
        val item35 = ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 0)
        val item36 = ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 0)
        val item37 = ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 1)
        val item38 = ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 2)
        val item39 = ItemBracketHandler.getItem("EnderIO:itemMaterial", 5)
        val item40 = ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 3)
        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)
        val item41 = ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)
        ItemBracketHandler.getItem("irontank:ironTank", 0)
        val item42 = ItemBracketHandler.getItem("EnderIO:blockDarkIronBars", 0)
        val ore22 = OreBracketHandler.getOre("plateDarkSteel")
        val item43 = ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 4)
        ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 5)
        val item44 = ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 6)
        val item45 = ItemBracketHandler.getItem("EnderIO:itemMaterial", 8)
        val ore23 = OreBracketHandler.getOre("chestWood")
        val item46 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630)
        val item47 = ItemBracketHandler.getItem("EnderIO:itemFunctionUpgrade", 0)
        val ore24 = OreBracketHandler.getOre("ringDarkSteel")
        val ore25 = OreBracketHandler.getOre("screwDarkSteel")
        val item48 = ItemBracketHandler.getItem("EnderIO:itemMaterial", 10)
        val ore26 = OreBracketHandler.getOre("lensEnderEye")
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32671)
        val ore27 = OreBracketHandler.getOre("plateSoularium")
        val item49 = ItemBracketHandler.getItem("minecraft:shears", 0)
        val item50 = ItemBracketHandler.getItem("minecraft:iron_axe", 0)
        val ore28 = OreBracketHandler.getOre("itemSkull")
        val item51 = ItemBracketHandler.getItem("EnderIO:itemMaterial", 9)
        val item52 = ItemBracketHandler.getItem("EnderIO:blockEndermanSkull", 2)
        val item53 = ItemBracketHandler.getItem("EnderIO:itemXpTransfer", 0)
        val ore29 = OreBracketHandler.getOre("bucketLava")
        val ore30 = OreBracketHandler.getOre("bucketWater")
        val item54 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 2)
        val item55 = ItemBracketHandler.getItem("minecraft:enchanting_table", 0)
        val ore31 = OreBracketHandler.getOre("craftingBook")
        val item56 = ItemBracketHandler.getItem("EnderIO:blockDarkIronBars", 0)
        val ore32 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore33 = OreBracketHandler.getOre("craftingToolFile")
        val ore34 = OreBracketHandler.getOre("craftingToolWrench")
        val ore35 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val ore36 = OreBracketHandler.getOre("screwSteel")
        val ore37 = OreBracketHandler.getOre("wireFineSteel")
        val ore38 = OreBracketHandler.getOre("plateSilicon")
        val item57 = ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0)
        val ore39 = OreBracketHandler.getOre("plateIron")
        val ore40 = OreBracketHandler.getOre("wireGt01RedAlloy")
        val ore41 = OreBracketHandler.getOre("blockObsidian")
        val ore42 = OreBracketHandler.getOre("gemEnderEye")
        val item58 = ItemBracketHandler.getItem("minecraft:compass", 0)
        OreBracketHandler.getOre("plateRedstoneAlloy")
        val item59 = ItemBracketHandler.getItem("EnderIO:itemMaterial", 1)
        val ore43 = OreBracketHandler.getOre("plateConductiveIron")
        val ore44 = OreBracketHandler.getOre("ingotElectricalSteel")
        val ore45 = OreBracketHandler.getOre("gearElectricalSteel")
        val item60 = ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26)
        val item61 = ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 2)
        val ore46 = OreBracketHandler.getOre("screwVibrantAlloy")
        val ore47 = OreBracketHandler.getOre("stickDarkSteel")
        val ore48 = OreBracketHandler.getOre("screwEnergeticAlloy")
        val ore49 = OreBracketHandler.getOre("stickSoularium")
        val ore50 = OreBracketHandler.getOre("itemLeather")
        val item62 = ItemBracketHandler.getItem("Backpack:tannedLeather", 0)
        val ore51 = OreBracketHandler.getOre("screwSteelMagnetic")
        val item63 = ItemBracketHandler.getItem("SGCraft:ic2Capacitor", 0)
        val item64 = ItemBracketHandler.getItem("EnderIO:itemMaterial", 12)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockStirlingGenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockCombustionGenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockZombieGenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockFrankenzombieGenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockEnderGenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockSagMill", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockAlloySmelter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockCapBank", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockPainter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockCrafter", 0))
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(item16)
        MineTweakerAPI.recipes.remove(item17)
        MineTweakerAPI.recipes.remove(item18)
        MineTweakerAPI.recipes.remove(item19)
        MineTweakerAPI.recipes.remove(item20)
        MineTweakerAPI.recipes.remove(item21)
        MineTweakerAPI.recipes.remove(item22)
        MineTweakerAPI.recipes.remove(item23)
        MineTweakerAPI.recipes.remove(item24)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockVat", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockPowerMonitor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockFarmStation", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockWirelessCharger", 0))
        MineTweakerAPI.recipes.remove(item27)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockTank", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockReservoir", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockVacuumChest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockTransceiver", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockBuffer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockBuffer", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockBuffer", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockInventoryPanel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMachinePart", 1))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("EnderIO:itemMaterial", 1), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMaterial", 2))
        MineTweakerAPI.recipes.remove(item39)
        MineTweakerAPI.recipes.remove(item32)
        MineTweakerAPI.recipes.remove(item32)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.endSteel_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.endSteel_chestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.endSteel_leggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.endSteel_boots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.endSteel_pickaxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.endSteel_axe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.endSteel_sword", 0))
        MineTweakerAPI.recipes.remove(item48)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockEnderIo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockTravelAnchor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockTelePad", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockSliceAndSplice", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockSoulBinder", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockPoweredSpawner", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockKillerJoe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockAttractor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockSpawnGuard", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockExperienceObelisk", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockWeatherObelisk", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockEnchanter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockDarkSteelPressurePlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockDarkSteelPressurePlate", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockDarkSteelAnvil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockDarkIronBars", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockSoulariumBars", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockEndSteelBars", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockDarkSteelLadder", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:blockReinforcedObsidian", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemCoordSelector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemFusedQuartzFrame", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemConduitFacade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemConduitFacade", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemLiquidConduit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemLiquidConduit", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemLiquidConduit", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemItemConduit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMEConduit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMEConduit", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemExistingItemFilter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemModItemFilter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemBigFilterUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemBigFilterUpgrade", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemPowerItemFilter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemExtractSpeedUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemExtractSpeedUpgrade", 1))
        MineTweakerAPI.recipes.remove(item47)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemYetaWrench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemConduitProbe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemTravelStaff", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemXpTransfer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemSoulVessel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGliderWing", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemGliderWing", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMagnet", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemOCConduit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMachinePart", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMachinePart", 3))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("EnderIO:itemAlloy", 6),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDarkSteel"),
                        OreBracketHandler.getOre("nuggetDarkSteel"), OreBracketHandler.getOre("nuggetDarkSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDarkSteel"),
                                OreBracketHandler.getOre("nuggetDarkSteel"),
                                OreBracketHandler.getOre("nuggetDarkSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDarkSteel"),
                                OreBracketHandler.getOre("nuggetDarkSteel"),
                                OreBracketHandler.getOre("nuggetDarkSteel"))))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("EnderIO:itemAlloy", 8),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemMaterial", 11),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 11),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemMaterial", 11),
                                ItemBracketHandler.getItem("EnderIO:itemMaterial", 11),
                                ItemBracketHandler.getItem("EnderIO:itemMaterial", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemMaterial", 11),
                                ItemBracketHandler.getItem("EnderIO:itemMaterial", 11),
                                ItemBracketHandler.getItem("EnderIO:itemMaterial", 11))))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5),
                        ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5),
                        ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5),
                                ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5),
                                ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5),
                                ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5),
                                ItemBracketHandler.getItem("EnderIO:itemPowderIngot", 5))))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("EnderZoo:enderFragment", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("EnderZoo:enderFragment", 0),
                                ItemBracketHandler.getItem("EnderZoo:enderFragment", 0),
                                ItemBracketHandler.getItem("EnderZoo:enderFragment", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("EnderZoo:enderFragment", 0), null)))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMaterial", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMaterial", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMaterial", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMaterial", 16))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:itemMaterial", 17))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.stellar_pickaxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.stellar_axe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.stellar_sword", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.stellar_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.stellar_chestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.stellar_leggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EnderIO:item.stellar_boots", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockStirlingGenerator", 0),
                arrayOf(arrayOf<IIngredient>(ore15, ore, ore15), arrayOf(ore18, item24, ore18),
                        arrayOf(item, ore14, item)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockCombustionGenerator", 0),
                arrayOf(arrayOf<IIngredient>(ore16, ore2, ore16), arrayOf(ore19, item24, ore19),
                        arrayOf<IIngredient>(item2, item27, item2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockZombieGenerator", 0),
                arrayOf(arrayOf<IIngredient>(ore16, ore2, ore16), arrayOf<IIngredient>(item28, item24, item28),
                        arrayOf<IIngredient>(item2, item36, item2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockFrankenzombieGenerator", 0),
                arrayOf(arrayOf<IIngredient>(ore12, ore3, ore12), arrayOf<IIngredient>(item28, item25, item28),
                        arrayOf<IIngredient>(item3, item37, item3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockEnderGenerator", 0),
                arrayOf(arrayOf<IIngredient>(ore13, ore4, ore13), arrayOf<IIngredient>(item28, item26, item28),
                        arrayOf<IIngredient>(item4, item40, item4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 0),
                arrayOf(arrayOf<IIngredient>(item11, item28, item11),
                        arrayOf<IIngredient>(item13, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                                item13), arrayOf<IIngredient>(item14, item28, item14)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 1),
                arrayOf(arrayOf<IIngredient>(item12, item28, item12),
                        arrayOf<IIngredient>(item11, ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 0), item11),
                        arrayOf<IIngredient>(item15, item28, item15)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 2),
                arrayOf(arrayOf(ore8, item29, ore8),
                        arrayOf<IIngredient>(item11, ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 1), item11),
                        arrayOf<IIngredient>(item16, item29, item16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockSagMill", 0),
                arrayOf(arrayOf(ore16, item30, ore16), arrayOf(ore, item24, ore),
                        arrayOf<IIngredient>(item, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32721), item)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockAlloySmelter", 0),
                arrayOf(arrayOf<IIngredient>(ore, ore14, ore), arrayOf(ore14, item24, ore14),
                        arrayOf<IIngredient>(item, item31, item)), null)
        val recipes = MineTweakerAPI.recipes
        val item65 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 1)
        val hashMap = HashMap<String, IData>()
        hashMap["type"] = ExpandString.asData("SIMPLE")
        hashMap["storedEnergyRF"] = ExpandInt.toData(0)
        recipes.addShaped(item65.withTag(ExpandAnyDict.asData(hashMap)),
                arrayOf(arrayOf(item14, ore, item14), arrayOf(ore6, item24, ore6),
                        arrayOf<IIngredient>(item14, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32527),
                                item14)), null)
        val recipes2 = MineTweakerAPI.recipes
        val item66 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 2)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["type"] = ExpandString.asData("ACTIVATED")
        hashMap2["storedEnergyRF"] = ExpandInt.toData(0)
        recipes2.addShaped(item66.withTag(ExpandAnyDict.asData(hashMap2)),
                arrayOf(arrayOf(item15, ore2, item15), arrayOf<IIngredient>(item13, item24, item13),
                        arrayOf<IIngredient>(item15, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32537),
                                item15)), null)
        val recipes3 = MineTweakerAPI.recipes
        val item67 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["type"] = ExpandString.asData("VIBRANT")
        hashMap3["storedEnergyRF"] = ExpandInt.toData(0)
        recipes3.addShaped(item67.withTag(ExpandAnyDict.asData(hashMap3)),
                arrayOf(arrayOf(item16, ore3, item16), arrayOf<IIngredient>(item32, item24, item32),
                        arrayOf<IIngredient>(item16, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32540),
                                item16)), null)
        val recipes4 = MineTweakerAPI.recipes
        val item68 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["type"] = ExpandString.asData("VIBRANT")
        hashMap4["storedEnergyRF"] = ExpandInt.toData(0)

        //TODO Replace ("miscutils:MU-metaitem.01", 32054)
        //recipes4.addShaped(item68.withTag(ExpandAnyDict.asData(hashMap4)),
        //        arrayOf(arrayOf(item16, ore3, item16), arrayOf<IIngredient>(item32, item24, item32),
        //                arrayOf<IIngredient>(item16, ItemBracketHandler.getItem("miscutils:MU-metaitem.01", 32054),
        //                        item16)), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockPainter", 0),
                arrayOf(arrayOf<IIngredient>(ore16, ore19, ore16), arrayOf(ore, item24, ore),
                        arrayOf(item, ore19, item)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockCrafter", 0),
                arrayOf(arrayOf(ore16, ItemBracketHandler.getItem("BuildCraft|Factory:autoWorkbenchBlock", 0), ore16),
                        arrayOf(ore, item24, ore),
                        arrayOf(ore16, ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 1), ore16)), null)
        MineTweakerAPI.recipes.addShaped(item24,
                arrayOf(arrayOf<IIngredient>(ore16, ore7, ore16), arrayOf(ore7, item14, ore7),
                        arrayOf<IIngredient>(ore16, ore7, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemMachinePart", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSoularium"),
                        OreBracketHandler.getOre("plateSoularium"), OreBracketHandler.getOre("itemCasingSoularium")),
                        arrayOf(OreBracketHandler.getOre("plateSoularium"), item15,
                                OreBracketHandler.getOre("plateSoularium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSoularium"),
                                OreBracketHandler.getOre("plateSoularium"),
                                OreBracketHandler.getOre("itemCasingSoularium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemMachinePart", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingEndSteel"),
                        OreBracketHandler.getOre("plateEndSteel"), OreBracketHandler.getOre("itemCasingEndSteel")),
                        arrayOf(OreBracketHandler.getOre("plateEndSteel"), item16,
                                OreBracketHandler.getOre("plateEndSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingEndSteel"),
                                OreBracketHandler.getOre("plateEndSteel"),
                                OreBracketHandler.getOre("itemCasingEndSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockVat", 0),
                arrayOf(arrayOf(ore16, item31, ore16), arrayOf<IIngredient>(item27, item24, item27),
                        arrayOf(item, ore14, item)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockPowerMonitor", 0),
                arrayOf(arrayOf(ore7, item33, ore7), arrayOf(ore, item24, ore),
                        arrayOf<IIngredient>(item35, item34, item35)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockFarmStation", 0),
                arrayOf(arrayOf(item9, ore20, item9), arrayOf<IIngredient>(item39, item24, item39),
                        arrayOf(ore21, item37, ore21)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockWirelessCharger", 0),
                arrayOf(arrayOf(ore7, item16, ore7), arrayOf(ore3, item24, ore3),
                        arrayOf<IIngredient>(item3, item40, item3)), null)
        MineTweakerAPI.recipes.addShaped(item27, arrayOf(arrayOf(ore16, item41, ore16),
                arrayOf<IIngredient>(item41, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4461), item41),
                arrayOf(ore16, item6, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockTank", 1),
                arrayOf(arrayOf(ore22, item42, ore22),
                        arrayOf<IIngredient>(item42, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4460),
                                item42), arrayOf(ore22, item7, ore22)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockReservoir", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(item28, item8, item28), arrayOf<IIngredient>(item28, item31, item28),
                        arrayOf<IIngredient>(item28, item8, item28)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockTransceiver", 0),
                arrayOf(arrayOf(item17, ore5, item17),
                        arrayOf(item45, OreBracketHandler.getOre("frameGtEnderium"), item45),
                        arrayOf<IIngredient>(item28, item43, item28)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockBuffer", 0),
                arrayOf(arrayOf<IIngredient>(ore7, ore23, ore7),
                        arrayOf(item46, OreBracketHandler.getOre("frameGtEnderium"), ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockBuffer", 1),
                arrayOf(arrayOf(ore7, item35, ore7),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32519),
                                OreBracketHandler.getOre("frameGtEnderium"), ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockInventoryPanel", 0),
                arrayOf(arrayOf(ore22, item47, ore22), arrayOf<IIngredient>(item39, item33, item39),
                        arrayOf(ore22, item37, ore22)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwElectricalSteel"),
                        OreBracketHandler.getOre("plateElectricalSteel"),
                        OreBracketHandler.getOre("screwElectricalSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateElectricalSteel"),
                                OreBracketHandler.getOre("ringElectricalSteel"),
                                OreBracketHandler.getOre("plateElectricalSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwElectricalSteel"),
                                OreBracketHandler.getOre("plateElectricalSteel"),
                                OreBracketHandler.getOre("screwElectricalSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 1).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwEnergeticAlloy"),
                        OreBracketHandler.getOre("plateEnergeticAlloy"),
                        OreBracketHandler.getOre("screwEnergeticAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateEnergeticAlloy"),
                                OreBracketHandler.getOre("ringEnergeticAlloy"),
                                OreBracketHandler.getOre("plateEnergeticAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwEnergeticAlloy"),
                                OreBracketHandler.getOre("plateEnergeticAlloy"),
                                OreBracketHandler.getOre("screwEnergeticAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 2).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwVibrantAlloy"),
                        OreBracketHandler.getOre("plateVibrantAlloy"), OreBracketHandler.getOre("screwVibrantAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateVibrantAlloy"),
                                OreBracketHandler.getOre("ringVibrantAlloy"),
                                OreBracketHandler.getOre("plateVibrantAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwVibrantAlloy"),
                                OreBracketHandler.getOre("plateVibrantAlloy"),
                                OreBracketHandler.getOre("screwVibrantAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 3).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwRedstoneAlloy"),
                        OreBracketHandler.getOre("plateRedstoneAlloy"), OreBracketHandler.getOre("screwRedstoneAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateRedstoneAlloy"),
                                OreBracketHandler.getOre("ringRedstoneAlloy"),
                                OreBracketHandler.getOre("plateRedstoneAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwRedstoneAlloy"),
                                OreBracketHandler.getOre("plateRedstoneAlloy"),
                                OreBracketHandler.getOre("screwRedstoneAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 4).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwConductiveIron"),
                        OreBracketHandler.getOre("plateConductiveIron"),
                        OreBracketHandler.getOre("screwConductiveIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateConductiveIron"),
                                OreBracketHandler.getOre("ringConductiveIron"),
                                OreBracketHandler.getOre("plateConductiveIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwConductiveIron"),
                                OreBracketHandler.getOre("plateConductiveIron"),
                                OreBracketHandler.getOre("screwConductiveIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 5).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwPulsatingIron"),
                        OreBracketHandler.getOre("platePulsatingIron"), OreBracketHandler.getOre("screwPulsatingIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("platePulsatingIron"),
                                OreBracketHandler.getOre("ringPulsatingIron"),
                                OreBracketHandler.getOre("platePulsatingIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwPulsatingIron"),
                                OreBracketHandler.getOre("platePulsatingIron"),
                                OreBracketHandler.getOre("screwPulsatingIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 6).amount(4),
                arrayOf(arrayOf<IIngredient>(ore25, ore22, ore25), arrayOf<IIngredient>(ore22, ore24, ore22),
                        arrayOf<IIngredient>(ore25, ore22, ore25)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 7).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSoularium"),
                        OreBracketHandler.getOre("plateSoularium"), OreBracketHandler.getOre("screwSoularium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateSoularium"),
                                OreBracketHandler.getOre("ringSoularium"), OreBracketHandler.getOre("plateSoularium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSoularium"),
                                OreBracketHandler.getOre("plateSoularium"),
                                OreBracketHandler.getOre("screwSoularium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 8).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwEndSteel"),
                        OreBracketHandler.getOre("plateEndSteel"), OreBracketHandler.getOre("screwEndSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateEndSteel"),
                                OreBracketHandler.getOre("ringEndSteel"), OreBracketHandler.getOre("plateEndSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwEndSteel"),
                                OreBracketHandler.getOre("plateEndSteel"), OreBracketHandler.getOre("screwEndSteel"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwCrudeSteel"),
                        OreBracketHandler.getOre("plateCrudeSteel"), OreBracketHandler.getOre("screwCrudeSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateCrudeSteel"),
                                OreBracketHandler.getOre("ringCrudeSteel"),
                                OreBracketHandler.getOre("plateCrudeSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwCrudeSteel"),
                                OreBracketHandler.getOre("plateCrudeSteel"),
                                OreBracketHandler.getOre("screwCrudeSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 1).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwCrystallineAlloy"),
                        OreBracketHandler.getOre("plateCrystallineAlloy"),
                        OreBracketHandler.getOre("screwCrystallineAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateCrystallineAlloy"),
                                OreBracketHandler.getOre("ringCrystallineAlloy"),
                                OreBracketHandler.getOre("plateCrystallineAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwCrystallineAlloy"),
                                OreBracketHandler.getOre("plateCrystallineAlloy"),
                                OreBracketHandler.getOre("screwCrystallineAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 2).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwMelodicAlloy"),
                        OreBracketHandler.getOre("plateMelodicAlloy"), OreBracketHandler.getOre("screwMelodicAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateMelodicAlloy"),
                                OreBracketHandler.getOre("ringMelodicAlloy"),
                                OreBracketHandler.getOre("plateMelodicAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwMelodicAlloy"),
                                OreBracketHandler.getOre("plateMelodicAlloy"),
                                OreBracketHandler.getOre("screwMelodicAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 3).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStellarAlloy"),
                        OreBracketHandler.getOre("plateStellarAlloy"), OreBracketHandler.getOre("screwStellarAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStellarAlloy"),
                                OreBracketHandler.getOre("ringStellarAlloy"),
                                OreBracketHandler.getOre("plateStellarAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwStellarAlloy"),
                                OreBracketHandler.getOre("plateStellarAlloy"),
                                OreBracketHandler.getOre("screwStellarAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 4).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwCrystallinePinkSlime"),
                        OreBracketHandler.getOre("plateCrystallinePinkSlime"),
                        OreBracketHandler.getOre("screwCrystallinePinkSlime")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateCrystallinePinkSlime"),
                                OreBracketHandler.getOre("ringCrystallinePinkSlime"),
                                OreBracketHandler.getOre("plateCrystallinePinkSlime")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwCrystallinePinkSlime"),
                                OreBracketHandler.getOre("plateCrystallinePinkSlime"),
                                OreBracketHandler.getOre("screwCrystallinePinkSlime"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 5).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwEnergeticSilver"),
                        OreBracketHandler.getOre("plateEnergeticSilver"),
                        OreBracketHandler.getOre("screwEnergeticSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateEnergeticSilver"),
                                OreBracketHandler.getOre("ringEnergeticSilver"),
                                OreBracketHandler.getOre("plateEnergeticSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwEnergeticSilver"),
                                OreBracketHandler.getOre("plateEnergeticSilver"),
                                OreBracketHandler.getOre("screwEnergeticSilver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 6).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwVividAlloy"),
                        OreBracketHandler.getOre("plateVividAlloy"), OreBracketHandler.getOre("screwVividAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateVividAlloy"),
                                OreBracketHandler.getOre("ringVividAlloy"),
                                OreBracketHandler.getOre("plateVividAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwVividAlloy"),
                                OreBracketHandler.getOre("plateVividAlloy"),
                                OreBracketHandler.getOre("screwVividAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockEnderIo", 0),
                arrayOf(arrayOf(ore7, item28, ore7), arrayOf(item28, ore26, item28), arrayOf(ore7, item28, ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockTravelAnchor", 0),
                arrayOf(arrayOf(ore7, item12, ore7), arrayOf<IIngredient>(item39, item24, item39),
                        arrayOf(ore7, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32670), ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockTelePad", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.StargateShieldingFoil", 0),
                        item28, ItemBracketHandler.getItem("dreamcraft:item.StargateShieldingFoil", 0)),
                        arrayOf<IIngredient>(item63, ItemBracketHandler.getItem("SGCraft:sgCoreCrystal", 0), item63),
                        arrayOf<IIngredient>(item5, item10, item5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockSliceAndSplice", 0),
                arrayOf(arrayOf(ore27, item49, ore27), arrayOf(ore2, item24, ore2),
                        arrayOf<IIngredient>(item2, item50, item2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockSoulBinder", 0),
                arrayOf(arrayOf(ore27, item40, ore27), arrayOf(ore3, item24, ore3),
                        arrayOf<IIngredient>(item3, item37, item3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockPoweredSpawner", 0),
                arrayOf(arrayOf<IIngredient>(ore22, ore28, ore22), arrayOf(ore27, item24, ore27),
                        arrayOf<IIngredient>(item45, item38, item45)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockKillerJoe", 0),
                arrayOf(arrayOf<IIngredient>(ore17, ore2, ore17), arrayOf<IIngredient>(item28, item24, item28),
                        arrayOf<IIngredient>(item2, item38, item2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockAttractor", 0),
                arrayOf(arrayOf<IIngredient?>(null, item51, null), arrayOf(item13, ore27, item13),
                        arrayOf(ore27, item24, ore27)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockSpawnGuard", 0),
                arrayOf(arrayOf<IIngredient?>(null, item52, null), arrayOf(item13, ore27, item13),
                        arrayOf(ore27, item24, ore27)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockExperienceObelisk", 0),
                arrayOf(arrayOf<IIngredient?>(null, item53, null), arrayOf(item13, ore27, item13),
                        arrayOf(ore27, item24, ore27)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockWeatherObelisk", 0),
                arrayOf(arrayOf<IIngredient?>(null, item48, null), arrayOf<IIngredient?>(ore29, ore27, ore30),
                        arrayOf(ore27, item54, ore27)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockEnchanter", 0),
                arrayOf(arrayOf(item39, ore31, item32), arrayOf<IIngredient?>(null, ore22, null),
                        arrayOf(ore22, item55, ore22)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockDarkIronBars", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(null, ore32, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23364),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23364),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23364)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23364),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23364),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23364))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockSoulariumBars", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(null, ore32, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23379),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23379),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23379)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23379),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23379),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23379))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockEndSteelBars", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(null, ore32, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23401),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23401),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23401)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23401),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23401),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23401))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockDarkSteelLadder", 0),
                arrayOf(arrayOf(item56, ore35, item56), arrayOf<IIngredient>(ore37, ore36, ore37),
                        arrayOf(item56, ore34, item56)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 0),
                arrayOf(arrayOf<IIngredient>(item28, item28, item28), arrayOf(ore38, item57, ore38),
                        arrayOf(ore, item14, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 2),
                arrayOf(arrayOf<IIngredient>(item28, item28, item28), arrayOf(ore38,
                        ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 0), ore38),
                        arrayOf<IIngredient>(ore39, ore40, ore39)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:blockReinforcedObsidian", 0),
                arrayOf(arrayOf(ore22, item42, ore22), arrayOf(item42, ore41, item42), arrayOf(ore22, item42, ore22)),
                null)
        val recipes5 = MineTweakerAPI.recipes
        val item69 = ItemBracketHandler.getItem("EnderIO:itemCoordSelector", 0)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["bc:x"] = ExpandInt.toData(0)
        hashMap5["default"] = ExpandByte.asData(1.toByte())
        hashMap5["bc:y"] = ExpandInt.toData(0)
        hashMap5["bc:z"] = ExpandInt.toData(0)
        recipes5.addShaped(item69.withTag(ExpandAnyDict.asData(hashMap5)),
                arrayOf(arrayOf<IIngredient>(ore7, ore42, ore7), arrayOf<IIngredient>(item12, item58, item12),
                        arrayOf<IIngredient>(ore7, ore42, ore7)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("EnderIO:itemExtractSpeedUpgrade", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemExtractSpeedUpgrade", 1)), null)
        MineTweakerAPI.recipes.addShaped(item47,
                arrayOf(arrayOf(ore38, item59, ore38), arrayOf<IIngredient>(ore3, ore42, ore3),
                        arrayOf<IIngredient>(ore38, ore7, ore38)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemYetaWrench", 0),
                arrayOf(arrayOf<IIngredient?>(ore44, ore32, ore44), arrayOf<IIngredient?>(ore44, ore45, ore44),
                        arrayOf<IIngredient?>(null, ore44, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemConduitProbe", 0),
                arrayOf(arrayOf(ore38, item35, ore38), arrayOf(ore, item60, ore), arrayOf(ore7, item61, ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemTravelStaff", 16),
                arrayOf(arrayOf(ore35, ore3, item45), arrayOf<IIngredient>(ore46, ore47, ore3),
                        arrayOf<IIngredient>(ore47, ore46, ore34)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemXpTransfer", 0),
                arrayOf(arrayOf(ore35, ore3, item39), arrayOf<IIngredient>(ore48, ore49, ore3),
                        arrayOf<IIngredient>(ore49, ore48, ore34)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGliderWing", 0),
                arrayOf(arrayOf<IIngredient>(ore32, ore47, ore50), arrayOf(ore47, item62, ore50),
                        arrayOf<IIngredient>(ore50, ore50, ore50)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemGliderWing", 1),
                arrayOf(arrayOf<IIngredient>(ore25, ore47, ore25),
                        arrayOf(ItemBracketHandler.getItem("EnderIO:itemGliderWing", 0), ore22,
                                ItemBracketHandler.getItem("EnderIO:itemGliderWing", 0)),
                        arrayOf<IIngredient>(ore34, ore47, ore35)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemMagnet", 16),
                arrayOf(arrayOf<IIngredient>(ore7, ore43, ore43), arrayOf(ore34, ore51, item32),
                        arrayOf<IIngredient>(ore7, ore43, ore43)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.endSteel_helmet", 0),
                arrayOf(arrayOf<IIngredient?>(ore8, ore8, ore8), arrayOf<IIngredient?>(ore8, ore32, ore8),
                        arrayOf<IIngredient?>(null, item44, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.endSteel_chestplate", 0),
                arrayOf(arrayOf<IIngredient>(ore8, ore32, ore8), arrayOf(ore8, item44, ore8),
                        arrayOf<IIngredient>(ore8, ore8, ore8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.endSteel_leggings", 0),
                arrayOf(arrayOf<IIngredient>(ore8, ore8, ore8), arrayOf<IIngredient>(ore8, ore32, ore8),
                        arrayOf(ore8, item44, ore8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.endSteel_boots", 0),
                arrayOf(arrayOf(ore8, item44, ore8), arrayOf<IIngredient?>(ore8, ore32, ore8), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.stellar_helmet", 0),
                arrayOf(arrayOf<IIngredient?>(ore9, ore9, ore9), arrayOf<IIngredient?>(ore9, ore32, ore9),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 4), null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.stellar_chestplate", 0),
                arrayOf(arrayOf<IIngredient>(ore9, ore32, ore9),
                        arrayOf(ore9, ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 4), ore9),
                        arrayOf<IIngredient>(ore9, ore9, ore9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.stellar_leggings", 0),
                arrayOf(arrayOf<IIngredient>(ore9, ore9, ore9), arrayOf<IIngredient>(ore9, ore32, ore9),
                        arrayOf(ore9, ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 4), ore9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.stellar_boots", 0),
                arrayOf(arrayOf(ore9, ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 4), ore9),
                        arrayOf<IIngredient?>(ore9, ore32, ore9), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.endSteel_pickaxe", 0),
                arrayOf(arrayOf<IIngredient?>(ore8, ore10, ore10), arrayOf(ore33, item64, ore32),
                        arrayOf<IIngredient?>(null, item64, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.endSteel_axe", 0),
                arrayOf(arrayOf<IIngredient?>(ore8, ore10, ore32), arrayOf(ore8, item64, ore8),
                        arrayOf(ore33, item64, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.endSteel_sword", 0),
                arrayOf(arrayOf<IIngredient?>(null, ore8, null), arrayOf<IIngredient?>(ore33, ore8, ore32),
                        arrayOf<IIngredient?>(null, item64, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.stellar_pickaxe", 0),
                arrayOf(arrayOf<IIngredient?>(ore9, ore11, ore11),
                        arrayOf(ore33, ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 4), ore32),
                        arrayOf<IIngredient?>(null, item64, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.stellar_axe", 0),
                arrayOf(arrayOf<IIngredient?>(ore9, ore11, ore32),
                        arrayOf(ore9, ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 4), ore9),
                        arrayOf(ore33, item64, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:item.stellar_sword", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 4), null),
                        arrayOf<IIngredient?>(ore33, ore9, ore32), arrayOf<IIngredient?>(null, item64, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("EnderIO:itemMaterial", 12),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("screwEndSteel"), OreBracketHandler.getOre("stickDarkSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwEndSteel"),
                                OreBracketHandler.getOre("stickDarkSteel"), OreBracketHandler.getOre("screwEndSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickDarkSteel"),
                                OreBracketHandler.getOre("screwEndSteel"),
                                OreBracketHandler.getOre("craftingToolHardHammer"))), null)
        val item70 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 0)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["type"] = ExpandString.asData("CREATIVE")
        hashMap6["storedEnergyRF"] = ExpandInt.toData(2500000)
        val withTag = item70.withTag(ExpandAnyDict.asData(hashMap6))
        val array: Array<Array<IIngredient?>?> = arrayOfNulls(9)
        val n = 0
        val array2 = arrayOfNulls<IIngredient>(9)
        val n2 = 0
        val item71 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap7 = HashMap<String, IData>()
        hashMap7["type"] = ExpandString.asData("VIBRANT")
        hashMap7["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n2] = item71.withTag(ExpandAnyDict.asData(hashMap7))
        val n3 = 1
        val item72 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap8 = HashMap<String, IData>()
        hashMap8["type"] = ExpandString.asData("VIBRANT")
        hashMap8["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n3] = item72.withTag(ExpandAnyDict.asData(hashMap8))
        val n4 = 2
        val item73 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap9 = HashMap<String, IData>()
        hashMap9["type"] = ExpandString.asData("VIBRANT")
        hashMap9["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n4] = item73.withTag(ExpandAnyDict.asData(hashMap9))
        val n5 = 3
        val item74 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap10 = HashMap<String, IData>()
        hashMap10["type"] = ExpandString.asData("VIBRANT")
        hashMap10["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n5] = item74.withTag(ExpandAnyDict.asData(hashMap10))
        val n6 = 4
        val item75 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap11 = HashMap<String, IData>()
        hashMap11["type"] = ExpandString.asData("VIBRANT")
        hashMap11["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n6] = item75.withTag(ExpandAnyDict.asData(hashMap11))
        val n7 = 5
        val item76 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap12 = HashMap<String, IData>()
        hashMap12["type"] = ExpandString.asData("VIBRANT")
        hashMap12["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n7] = item76.withTag(ExpandAnyDict.asData(hashMap12))
        val n8 = 6
        val item77 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap13 = HashMap<String, IData>()
        hashMap13["type"] = ExpandString.asData("VIBRANT")
        hashMap13["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n8] = item77.withTag(ExpandAnyDict.asData(hashMap13))
        val n9 = 7
        val item78 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap14 = HashMap<String, IData>()
        hashMap14["type"] = ExpandString.asData("VIBRANT")
        hashMap14["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n9] = item78.withTag(ExpandAnyDict.asData(hashMap14))
        val n10 = 8
        val item79 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap15 = HashMap<String, IData>()
        hashMap15["type"] = ExpandString.asData("VIBRANT")
        hashMap15["storedEnergyRF"] = ExpandInt.toData(25000000)
        array2[n10] = item79.withTag(ExpandAnyDict.asData(hashMap15))
        array[n] = array2
        val n11 = 1
        val array3 = arrayOfNulls<IIngredient>(9)
        val n12 = 0
        val item80 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap16 = HashMap<String, IData>()
        hashMap16["type"] = ExpandString.asData("VIBRANT")
        hashMap16["storedEnergyRF"] = ExpandInt.toData(25000000)
        array3[n12] = item80.withTag(ExpandAnyDict.asData(hashMap16))
        val n13 = 1
        val item81 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap17 = HashMap<String, IData>()
        hashMap17["type"] = ExpandString.asData("VIBRANT")
        hashMap17["storedEnergyRF"] = ExpandInt.toData(25000000)
        array3[n13] = item81.withTag(ExpandAnyDict.asData(hashMap17))
        array3[2] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        array3[3] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        array3[4] = OreBracketHandler.getOre("plateVibrantAlloy")
        array3[5] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        array3[6] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val n14 = 7
        val item82 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap18 = HashMap<String, IData>()
        hashMap18["type"] = ExpandString.asData("VIBRANT")
        hashMap18["storedEnergyRF"] = ExpandInt.toData(25000000)
        array3[n14] = item82.withTag(ExpandAnyDict.asData(hashMap18))
        val n15 = 8
        val item83 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap19 = HashMap<String, IData>()
        hashMap19["type"] = ExpandString.asData("VIBRANT")
        hashMap19["storedEnergyRF"] = ExpandInt.toData(25000000)
        array3[n15] = item83.withTag(ExpandAnyDict.asData(hashMap19))
        array[n11] = array3
        val n16 = 2
        val array4 = arrayOfNulls<IIngredient>(9)
        val n17 = 0
        val item84 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap20 = HashMap<String, IData>()
        hashMap20["type"] = ExpandString.asData("VIBRANT")
        hashMap20["storedEnergyRF"] = ExpandInt.toData(25000000)
        array4[n17] = item84.withTag(ExpandAnyDict.asData(hashMap20))
        array4[1] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val n18 = 2
        val item85 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap21 = HashMap<String, IData>()
        hashMap21["type"] = ExpandString.asData("VIBRANT")
        hashMap21["storedEnergyRF"] = ExpandInt.toData(25000000)
        array4[n18] = item85.withTag(ExpandAnyDict.asData(hashMap21))
        array4[3] = OreBracketHandler.getOre("plateNeutronium")
        array4[4] = OreBracketHandler.getOre("plateNeutronium")
        array4[5] = OreBracketHandler.getOre("plateNeutronium")
        val n19 = 6
        val item86 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap22 = HashMap<String, IData>()
        hashMap22["type"] = ExpandString.asData("VIBRANT")
        hashMap22["storedEnergyRF"] = ExpandInt.toData(25000000)
        array4[n19] = item86.withTag(ExpandAnyDict.asData(hashMap22))
        array4[7] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val n20 = 8
        val item87 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap23 = HashMap<String, IData>()
        hashMap23["type"] = ExpandString.asData("VIBRANT")
        hashMap23["storedEnergyRF"] = ExpandInt.toData(25000000)
        array4[n20] = item87.withTag(ExpandAnyDict.asData(hashMap23))
        array[n16] = array4
        val n21 = 3
        val array5 = arrayOfNulls<IIngredient>(9)
        val n22 = 0
        val item88 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap24 = HashMap<String, IData>()
        hashMap24["type"] = ExpandString.asData("VIBRANT")
        hashMap24["storedEnergyRF"] = ExpandInt.toData(25000000)
        array5[n22] = item88.withTag(ExpandAnyDict.asData(hashMap24))
        array5[1] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        array5[2] = OreBracketHandler.getOre("plateNeutronium")
        val n23 = 3
        val item89 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap25 = HashMap<String, IData>()
        hashMap25["type"] = ExpandString.asData("VIBRANT")
        hashMap25["storedEnergyRF"] = ExpandInt.toData(25000000)
        array5[n23] = item89.withTag(ExpandAnyDict.asData(hashMap25))
        val n24 = 4
        val item90 = ItemBracketHandler.getItem("DraconicEvolution:draconiumFluxCapacitor", 0)
        val hashMap26 = HashMap<String, IData>()
        hashMap26["Energy"] = ExpandInt.toData(80000000)
        array5[n24] = item90.withTag(ExpandAnyDict.asData(hashMap26))
        val n25 = 5
        val item91 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap27 = HashMap<String, IData>()
        hashMap27["type"] = ExpandString.asData("VIBRANT")
        hashMap27["storedEnergyRF"] = ExpandInt.toData(25000000)
        array5[n25] = item91.withTag(ExpandAnyDict.asData(hashMap27))
        array5[6] = OreBracketHandler.getOre("plateNeutronium")
        array5[7] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val n26 = 8
        val item92 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap28 = HashMap<String, IData>()
        hashMap28["type"] = ExpandString.asData("VIBRANT")
        hashMap28["storedEnergyRF"] = ExpandInt.toData(25000000)
        array5[n26] = item92.withTag(ExpandAnyDict.asData(hashMap28))
        array[n21] = array5
        val n27 = 4
        val array6 = arrayOfNulls<IIngredient>(9)
        val n28 = 0
        val item93 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap29 = HashMap<String, IData>()
        hashMap29["type"] = ExpandString.asData("VIBRANT")
        hashMap29["storedEnergyRF"] = ExpandInt.toData(25000000)
        array6[n28] = item93.withTag(ExpandAnyDict.asData(hashMap29))
        array6[1] = OreBracketHandler.getOre("plateVibrantAlloy")
        array6[2] = OreBracketHandler.getOre("plateNeutronium")
        val n29 = 3
        val item94 = ItemBracketHandler.getItem("DraconicEvolution:draconiumFluxCapacitor", 0)
        val hashMap30 = HashMap<String, IData>()
        hashMap30["Energy"] = ExpandInt.toData(80000000)
        array6[n29] = item94.withTag(ExpandAnyDict.asData(hashMap30))
        array6[4] = ItemBracketHandler.getItem("DraconicEvolution:chaoticCore", 0)
        val n30 = 5
        val item95 = ItemBracketHandler.getItem("DraconicEvolution:draconiumFluxCapacitor", 0)
        val hashMap31 = HashMap<String, IData>()
        hashMap31["Energy"] = ExpandInt.toData(80000000)
        array6[n30] = item95.withTag(ExpandAnyDict.asData(hashMap31))
        array6[6] = OreBracketHandler.getOre("plateNeutronium")
        array6[7] = OreBracketHandler.getOre("plateVibrantAlloy")
        val n31 = 8
        val item96 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap32 = HashMap<String, IData>()
        hashMap32["type"] = ExpandString.asData("VIBRANT")
        hashMap32["storedEnergyRF"] = ExpandInt.toData(25000000)
        array6[n31] = item96.withTag(ExpandAnyDict.asData(hashMap32))
        array[n27] = array6
        val n32 = 5
        val array7 = arrayOfNulls<IIngredient>(9)
        val n33 = 0
        val item97 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap33 = HashMap<String, IData>()
        hashMap33["type"] = ExpandString.asData("VIBRANT")
        hashMap33["storedEnergyRF"] = ExpandInt.toData(25000000)
        array7[n33] = item97.withTag(ExpandAnyDict.asData(hashMap33))
        array7[1] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        array7[2] = OreBracketHandler.getOre("plateNeutronium")
        val n34 = 3
        val item98 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap34 = HashMap<String, IData>()
        hashMap34["type"] = ExpandString.asData("VIBRANT")
        hashMap34["storedEnergyRF"] = ExpandInt.toData(25000000)
        array7[n34] = item98.withTag(ExpandAnyDict.asData(hashMap34))
        val n35 = 4
        val item99 = ItemBracketHandler.getItem("DraconicEvolution:draconiumFluxCapacitor", 0)
        val hashMap35 = HashMap<String, IData>()
        hashMap35["Energy"] = ExpandInt.toData(80000000)
        array7[n35] = item99.withTag(ExpandAnyDict.asData(hashMap35))
        val n36 = 5
        val item100 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap36 = HashMap<String, IData>()
        hashMap36["type"] = ExpandString.asData("VIBRANT")
        hashMap36["storedEnergyRF"] = ExpandInt.toData(25000000)
        array7[n36] = item100.withTag(ExpandAnyDict.asData(hashMap36))
        array7[6] = OreBracketHandler.getOre("plateNeutronium")
        array7[7] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val n37 = 8
        val item101 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap37 = HashMap<String, IData>()
        hashMap37["type"] = ExpandString.asData("VIBRANT")
        hashMap37["storedEnergyRF"] = ExpandInt.toData(25000000)
        array7[n37] = item101.withTag(ExpandAnyDict.asData(hashMap37))
        array[n32] = array7
        val n38 = 6
        val array8 = arrayOfNulls<IIngredient>(9)
        val n39 = 0
        val item102 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap38 = HashMap<String, IData>()
        hashMap38["type"] = ExpandString.asData("VIBRANT")
        hashMap38["storedEnergyRF"] = ExpandInt.toData(25000000)
        array8[n39] = item102.withTag(ExpandAnyDict.asData(hashMap38))
        array8[1] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val n40 = 2
        val item103 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap39 = HashMap<String, IData>()
        hashMap39["type"] = ExpandString.asData("VIBRANT")
        hashMap39["storedEnergyRF"] = ExpandInt.toData(25000000)
        array8[n40] = item103.withTag(ExpandAnyDict.asData(hashMap39))
        array8[3] = OreBracketHandler.getOre("plateNeutronium")
        array8[4] = OreBracketHandler.getOre("plateNeutronium")
        array8[5] = OreBracketHandler.getOre("plateNeutronium")
        val n41 = 6
        val item104 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap40 = HashMap<String, IData>()
        hashMap40["type"] = ExpandString.asData("VIBRANT")
        hashMap40["storedEnergyRF"] = ExpandInt.toData(25000000)
        array8[n41] = item104.withTag(ExpandAnyDict.asData(hashMap40))
        array8[7] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val n42 = 8
        val item105 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap41 = HashMap<String, IData>()
        hashMap41["type"] = ExpandString.asData("VIBRANT")
        hashMap41["storedEnergyRF"] = ExpandInt.toData(25000000)
        array8[n42] = item105.withTag(ExpandAnyDict.asData(hashMap41))
        array[n38] = array8
        val n43 = 7
        val array9 = arrayOfNulls<IIngredient>(9)
        val n44 = 0
        val item106 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap42 = HashMap<String, IData>()
        hashMap42["type"] = ExpandString.asData("VIBRANT")
        hashMap42["storedEnergyRF"] = ExpandInt.toData(25000000)
        array9[n44] = item106.withTag(ExpandAnyDict.asData(hashMap42))
        val n45 = 1
        val item107 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap43 = HashMap<String, IData>()
        hashMap43["type"] = ExpandString.asData("VIBRANT")
        hashMap43["storedEnergyRF"] = ExpandInt.toData(25000000)
        array9[n45] = item107.withTag(ExpandAnyDict.asData(hashMap43))
        array9[2] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        array9[3] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        array9[4] = OreBracketHandler.getOre("plateVibrantAlloy")
        array9[5] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        array9[6] = ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)
        val n46 = 7
        val item108 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap44 = HashMap<String, IData>()
        hashMap44["type"] = ExpandString.asData("VIBRANT")
        hashMap44["storedEnergyRF"] = ExpandInt.toData(25000000)
        array9[n46] = item108.withTag(ExpandAnyDict.asData(hashMap44))
        val n47 = 8
        val item109 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap45 = HashMap<String, IData>()
        hashMap45["type"] = ExpandString.asData("VIBRANT")
        hashMap45["storedEnergyRF"] = ExpandInt.toData(25000000)
        array9[n47] = item109.withTag(ExpandAnyDict.asData(hashMap45))
        array[n43] = array9
        val n48 = 8
        val array10 = arrayOfNulls<IIngredient>(9)
        val n49 = 0
        val item110 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap46 = HashMap<String, IData>()
        hashMap46["type"] = ExpandString.asData("VIBRANT")
        hashMap46["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n49] = item110.withTag(ExpandAnyDict.asData(hashMap46))
        val n50 = 1
        val item111 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap47 = HashMap<String, IData>()
        hashMap47["type"] = ExpandString.asData("VIBRANT")
        hashMap47["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n50] = item111.withTag(ExpandAnyDict.asData(hashMap47))
        val n51 = 2
        val item112 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap48 = HashMap<String, IData>()
        hashMap48["type"] = ExpandString.asData("VIBRANT")
        hashMap48["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n51] = item112.withTag(ExpandAnyDict.asData(hashMap48))
        val n52 = 3
        val item113 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap49 = HashMap<String, IData>()
        hashMap49["type"] = ExpandString.asData("VIBRANT")
        hashMap49["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n52] = item113.withTag(ExpandAnyDict.asData(hashMap49))
        val n53 = 4
        val item114 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap50 = HashMap<String, IData>()
        hashMap50["type"] = ExpandString.asData("VIBRANT")
        hashMap50["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n53] = item114.withTag(ExpandAnyDict.asData(hashMap50))
        val n54 = 5
        val item115 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap51 = HashMap<String, IData>()
        hashMap51["type"] = ExpandString.asData("VIBRANT")
        hashMap51["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n54] = item115.withTag(ExpandAnyDict.asData(hashMap51))
        val n55 = 6
        val item116 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap52 = HashMap<String, IData>()
        hashMap52["type"] = ExpandString.asData("VIBRANT")
        hashMap52["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n55] = item116.withTag(ExpandAnyDict.asData(hashMap52))
        val n56 = 7
        val item117 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap53 = HashMap<String, IData>()
        hashMap53["type"] = ExpandString.asData("VIBRANT")
        hashMap53["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n56] = item117.withTag(ExpandAnyDict.asData(hashMap53))
        val n57 = 8
        val item118 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap54 = HashMap<String, IData>()
        hashMap54["type"] = ExpandString.asData("VIBRANT")
        hashMap54["storedEnergyRF"] = ExpandInt.toData(25000000)
        array10[n57] = item118.withTag(ExpandAnyDict.asData(hashMap54))
        array[n48] = array10
        ExtremeCrafting.addShaped(withTag, array)
        Assembler.addRecipe(item14, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26080).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29031).amount(4),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(288), 200, VoltageLevels.LV)
        Assembler.addRecipe(item21, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26054).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29054).amount(4),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(288), 200, VoltageLevels.LV)
        Assembler.addRecipe(item15, item14.amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2535),
                LiquidBracketHandler.getLiquid("molten.energeticalloy").withAmount(864), 150, VoltageLevels.MV)
        Assembler.addRecipe(item22, item21.amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2535),
                LiquidBracketHandler.getLiquid("molten.energeticsilver").withAmount(864), 150, VoltageLevels.MV)
        Assembler.addRecipe(item16, item15.amount(2),
                ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.vibrantalloy").withAmount(864), 200,  VoltageLevels.HV)
        Assembler.addRecipe(item23, item22.amount(2),
                ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.vividalloy").withAmount(864), 200,  VoltageLevels.HV)
        Assembler.addRecipe(item17, item16.amount(2), ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                LiquidBracketHandler.getLiquid("molten.crystallinealloy").withAmount(864), 200, VoltageLevels.EV)
        Assembler.addRecipe(item17, item23.amount(2), ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                LiquidBracketHandler.getLiquid("molten.crystallinealloy").withAmount(864), 200, VoltageLevels.EV)
        Assembler.addRecipe(item18,
                arrayOf<IIngredient>(item17.amount(2), ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17401)),
                LiquidBracketHandler.getLiquid("molten.melodicalloy").withAmount(864), 200, VoltageLevels.IV)
        Assembler.addRecipe(item19,
                arrayOf<IIngredient>(item18.amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32726),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 13)),
                LiquidBracketHandler.getLiquid("molten.stellaralloy").withAmount(864), 200, VoltageLevels.LUV)

        //TODO Replace ("ExtraUtilities:enderCollector", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockVacuumChest", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 9231),
        //        ItemBracketHandler.getItem("ExtraUtilities:enderCollector", 0), 200, VoltageLevels.LMV)

        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockBuffer", 2),
                ItemBracketHandler.getItem("EnderIO:blockBuffer", 0),
                ItemBracketHandler.getItem("EnderIO:blockBuffer", 1), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemMaterial", 5),
                ItemBracketHandler.getItem("minecraft:diamond", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9378).amount(8), 600, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemMaterial", 6),
                ItemBracketHandler.getItem("minecraft:emerald", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9367).amount(8), 600, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17366),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17367),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17381),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17369),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17378),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17364),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 7),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17379),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17401),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBall", 9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17401),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17402),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17403),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17404),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17405),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17406),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17407),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemGrindingBallEndergy", 6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17408),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(item48, ItemBracketHandler.getItem("dreamcraft:item.ManyullynCrystal", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9321).amount(8), 200, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockDarkSteelPressurePlate", 0),
                ItemBracketHandler.getItem("minecraft:heavy_weighted_pressure_plate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17364).amount(2), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockDarkSteelPressurePlate", 1),
                ItemBracketHandler.getItem("EnderIO:blockDarkSteelPressurePlate", 0),
                ItemBracketHandler.getItem("IC2:blockRubber", 0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockDarkSteelLadder", 0).amount(2),
                ItemBracketHandler.getItem("EnderIO:blockDarkIronBars", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockDarkIronBars", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23364).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockSoulariumBars", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23379).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockEndSteelBars", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23401).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 1),
                ItemBracketHandler.getItem("EnderIO:blockElectricLight", 0),
                ItemBracketHandler.getItem("minecraft:redstone_torch", 0), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 3),
                ItemBracketHandler.getItem("EnderIO:blockElectricLight", 2),
                ItemBracketHandler.getItem("minecraft:redstone_torch", 0), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 4),
                ItemBracketHandler.getItem("EnderIO:blockElectricLight", 0), item40, 200, 256)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:blockElectricLight", 5),
                ItemBracketHandler.getItem("EnderIO:blockElectricLight", 4),
                ItemBracketHandler.getItem("minecraft:redstone_torch", 0), 200, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemFusedQuartzFrame", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 1).amount(4), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemConduitFacade", 0),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 1).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 8).amount(0), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 2),
                ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 0),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 1).amount(2), 100, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 1),
                ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 2),
                ItemBracketHandler.getItem("minecraft:lever", 0), 100, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2000),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17381), 100, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemRedstoneConduit", 2),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2000),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17381),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1420),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17369),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 1),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1580),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17366),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 2),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1620),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17367),
                LiquidBracketHandler.getLiquid("molten.epoxid").withAmount(144), 100,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2000),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17402),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(144), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 1),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1260),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(144), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 2),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1280),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17019),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(144), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 3),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1320),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(144), 100, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 4),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1380),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17035),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(144), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 5),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1440),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17054),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 6),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1540),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17303),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 7),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1660),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17407),
                LiquidBracketHandler.getLiquid("molten.epoxid").withAmount(144), 100, VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 8),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1700),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17403),
                LiquidBracketHandler.getLiquid("molten.epoxid").withAmount(144), 100, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 9),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1720),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17406),
                LiquidBracketHandler.getLiquid("molten.polytetrafluoroethylene").withAmount(144), 100, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 10),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1780),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17404),
                LiquidBracketHandler.getLiquid("molten.polytetrafluoroethylene").withAmount(144), 100, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerConduitEndergy", 11),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 11390),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17405),
                LiquidBracketHandler.getLiquid("molten.polybenzimidazole").withAmount(144), 100, VoltageLevels.LUV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemLiquidConduit", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5112),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemLiquidConduit", 1),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5132),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17364),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemLiquidConduit", 2),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5680),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17367),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemItemConduit", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5611),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17378),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemMEConduit", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17020),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemMEConduit", 1),
                ItemBracketHandler.getItem("EnderIO:itemMEConduit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17028),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemOCConduit", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17381),
                LiquidBracketHandler.getLiquid("molten.plastic").withAmount(144), 100,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32729),
                ItemBracketHandler.getItem("minecraft:iron_bars", 0), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 1),
                ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 0), item37, 300, 64)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemBigFilterUpgrade", 0),
                ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 1).amount(2),
                ItemBracketHandler.getItem("EnderIO:blockEndSteelBars", 0).amount(2), 300, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemBigFilterUpgrade", 1),
                ItemBracketHandler.getItem("EnderIO:itemBigFilterUpgrade", 0),
                ItemBracketHandler.getItem("EnderIO:itemFrankenSkull", 2), 300, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemExistingItemFilter", 0),
                ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 1), item60, 300, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemModItemFilter", 0),
                ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 0),
                ItemBracketHandler.getItem("EnderIO:itemYetaWrench", 0), 300, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemPowerItemFilter", 0),
                ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 0),
                ItemBracketHandler.getItem("EnderIO:itemConduitProbe", 0), 300, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemExtractSpeedUpgrade", 0),
                ItemBracketHandler.getItem("EnderIO:itemBasicFilterUpgrade", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640), 300, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemExtractSpeedUpgrade", 1),
                ItemBracketHandler.getItem("EnderIO:itemExtractSpeedUpgrade", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(144), 300, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("EnderIO:itemSoulVessel", 0),
                ItemBracketHandler.getItem("EnderIO:blockFusedQuartz", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 25379), 200, VoltageLevels.LMV)

        //TODO Replace getLiquid("obsidian.molten")
        //ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("EnderIO:itemConduitFacade", 1)),
        //        ItemBracketHandler.getItem("EnderIO:itemConduitFacade", 0),
        //        LiquidBracketHandler.getLiquid("obsidian.molten").withAmount(576), intArrayOf(10000), 200, VoltageLevels.LULV)

        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("EnderIO:itemMaterial", 1).amount(2),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 1).amount(2),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 1)),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 2),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(144), intArrayOf(10000, 9000, 5000), 200, VoltageLevels.LULV)
        FluidSolidifier.addRecipe(ItemBracketHandler.getItem("EnderIO:blockDarkSteelAnvil", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32314).amount(0),
                LiquidBracketHandler.getLiquid("molten.darksteel").withAmount(4464), 900, VoltageLevels.MV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("EnderIO:itemMaterial", 2).amount(9)),
                ItemBracketHandler.getItem("IC2:itemPartCFPowder", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("EnderIO:itemMaterial", 14),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 14),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 14),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 14)),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 5), intArrayOf(10000, 1000, 100, 10), 100,  VoltageLevels.HV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("EnderIO:itemMaterial", 15),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 15),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 15),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 15)),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 6), intArrayOf(10000, 1000, 100, 10), 300,  VoltageLevels.HV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("EnderIO:itemMaterial", 16),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 16),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 16),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 16)),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 8), intArrayOf(10000, 1000, 100, 10), 300,  VoltageLevels.HV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("EnderIO:itemMaterial", 17),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 17),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 17),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 17)),
                ItemBracketHandler.getItem("EnderIO:itemMaterial", 13), intArrayOf(10000, 1000, 100, 10), 300,  VoltageLevels.HV)
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("EnderIO:blockTravelAnchor", 0),
                ExpandString.asFormattedText("Cooldown 5 seconds"))
    }
}