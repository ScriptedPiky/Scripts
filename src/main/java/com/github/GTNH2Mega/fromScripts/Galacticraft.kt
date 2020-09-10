package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.Fuels
import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientAny
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class Galacticraft : Runnable {
    override fun run() {
        val ore = OreBracketHandler.getOre("compressedAluminium")
        val ore2 = OreBracketHandler.getOre("compressedIron")
        val ore3 = OreBracketHandler.getOre("compressedSteel")
        val ore4 = OreBracketHandler.getOre("compressedBronze")
        val ore5 = OreBracketHandler.getOre("compressedTin")
        val ore6 = OreBracketHandler.getOre("compressedCopper")
        val ore7 = OreBracketHandler.getOre("compressedTitanium")
        val ore8 = OreBracketHandler.getOre("compressedDesh")
        val ore9 = OreBracketHandler.getOre("waferBasic")
        val ore10 = OreBracketHandler.getOre("waferAdvanced")
        val item = ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 0)
        val item2 = ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1)
        val item3 = ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenPipe", 0)
        val item4 = ItemBracketHandler.getItem("GalacticraftCore:item.airVent", 0)
        val item5 = ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0)
        val item6 = ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0)
        val item7 = ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 4)
        val item8 = ItemBracketHandler.getItem("GalacticraftCore:item.sensorLens", 0)
        val item9 = ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0)
        val ore11 = OreBracketHandler.getOre("plateAlloyAdvanced")
        val item10 = ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronIngot", 1)
        val ore12 = OreBracketHandler.getOre("screwMeteoricSteel")
        val ore13 = OreBracketHandler.getOre("screwSteel")
        OreBracketHandler.getOre("boltStainlessSteel")
        OreBracketHandler.getOre("boltTungstenSteel")
        val item11 = ItemBracketHandler.getItem("GalacticraftMars:item.null", 5)
        val ore14 = OreBracketHandler.getOre("ringDesh")
        OreBracketHandler.getOre("foilAluminium")
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32631)
        val item12 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32632)
        val item13 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610)
        val item14 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612)
        val item15 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21305)
        val item16 = ItemBracketHandler.getItem("IC2:blockRubber", 0)
        OreBracketHandler.getOre("glassReinforced")
        val ore15 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore16 = OreBracketHandler.getOre("craftingToolWrench")
        val ore17 = OreBracketHandler.getOre("craftingToolFile")
        val item17 = ItemBracketHandler.getItem("minecraft:iron_bars", 0)
        val ore18 = OreBracketHandler.getOre("stickWood")
        OreBracketHandler.getOre("blockWool")
        ItemBracketHandler.getItem("minecraft:string", 0)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.landingPad", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.landingPad", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenCollector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenCompressor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenCompressor", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machine2", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.distributor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.sealer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenDetector", 0))
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.refinery", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.fuelLoader", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.fuelLoader", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.cargo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.cargo", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.rocketWorkbench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 3))
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.airLockFrame", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.airLockFrame", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 15))
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.solar", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.solar", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machine", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machine2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machine2", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.glowstoneTorch", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.spinThruster", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.viewScreen", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.telemetry", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.arclamp", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenMask", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenGear", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankLightFull", 900))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankMedFull", 1800))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 2700))
        MineTweakerAPI.recipes.remove(item8)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.sensorGlasses", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_pickaxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_axe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_hoe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_shovel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_sword", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_chestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_leggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.steel_boots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.canister", 1))
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.airFan", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.noseCone", 0))
        MineTweakerAPI.recipes.remove(item9)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.oilCanisterPartial", 1001))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.oilExtractor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.standardWrench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 16))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 17))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 18))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 19))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.battery", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_pickaxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_axe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_hoe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_shovel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_sword", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_chestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_leggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_boots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.mars", 8))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("ingotDesh"))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.null", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachineT2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachineT2", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachineT2", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.walkway", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.walkwayWire", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.walkwayOxygenPipe", 0),
                null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.atmosphericValve", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.heavyNoseCone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.null", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.beamReflector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.beamReceiver", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.telepadShort", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachine", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachine", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.grapple", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.hydrogenPipe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.carbonFragments", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshHelmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshChestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshLeggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshBoots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshPick", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshAxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshHoe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshSpade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.deshSword", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:tile.minerBase", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.orionDrive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0))
        MineTweakerAPI.furnace.remove(IngredientAny.INSTANCE,
                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 4))
        MineTweakerAPI.furnace.remove(IngredientAny.INSTANCE,
                ItemBracketHandler.getItem("GalacticraftMars:tile.asteroidsBlock", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 20))
        MineTweakerAPI.furnace.remove(OreBracketHandler.getOre("ingotMeteoricIron"),
                ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronRaw", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftCore:item.parachute", 0))
        MineTweakerAPI.furnace.remove(IngredientAny.INSTANCE,
                ItemBracketHandler.getItem("GalacticraftMars:item.null", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.landingPad", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ore2, ore2, ore2), arrayOf<IIngredient>(ore11, ore11, ore11),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockIron"),
                                OreBracketHandler.getOre("blockIron"), OreBracketHandler.getOre("blockIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.landingPad", 1).amount(3),
                arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore11, ore11, ore11),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockSteel"),
                                OreBracketHandler.getOre("blockSteel"), OreBracketHandler.getOre("blockSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenCollector", 0),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0), ore),
                        arrayOf<IIngredient>(item4, ItemBracketHandler.getItem("GalacticraftCore:item.airFan", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602)),
                        arrayOf<IIngredient>(ore3, OreBracketHandler.getOre("cableGt02Aluminium"), ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenCompressor", 0),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0), ore),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oilCanisterPartial", 1001),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602)),
                        arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenCompressor", 4),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0), ore),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oilCanisterPartial", 1001),
                                ItemBracketHandler.getItem("GalacticraftCore:item.airFan", 0)),
                        arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.machine2", 8),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 2700),
                        ore3), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 2700),
                        ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 0),
                        ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 2700)),
                        arrayOf(ore3, ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 2700),
                                ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.distributor", 0),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("GalacticraftCore:item.airFan", 0), ore),
                        arrayOf<IIngredient>(item4, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                item4),
                        arrayOf(ore3, ItemBracketHandler.getItem("GalacticraftCore:item.airFan", 0), ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.sealer", 0),
                arrayOf(arrayOf(ore, item4, ore),
                        arrayOf<IIngredient>(item4, ItemBracketHandler.getItem("GalacticraftCore:tile.distributor", 0),
                                item4),
                        arrayOf(ore8, ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenDetector", 0), ore8)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenDetector", 0),
                arrayOf(arrayOf<IIngredient>(ore8, ore3, ore8),
                        arrayOf<IIngredient>(item4, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32692),
                                item4),
                        arrayOf(ore, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2000), ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.fuelLoader", 0),
                arrayOf(arrayOf<IIngredient>(ore3, ore9, ore3),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32405),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602)),
                        arrayOf<IIngredient>(ore, OreBracketHandler.getOre("pipeMediumSteel"), ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.cargo", 0),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("minecraft:hopper", 0), ore),
                        arrayOf<IIngredient>(item12, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 9233),
                                item12), arrayOf<IIngredient>(ore8, OreBracketHandler.getOre("pipeMediumBrass"), ore8)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.cargo", 4),
                arrayOf(arrayOf<IIngredient>(ore8, OreBracketHandler.getOre("pipeMediumBrass"), ore8),
                        arrayOf<IIngredient>(item12, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 9233),
                                item12), arrayOf(ore, ItemBracketHandler.getItem("minecraft:hopper", 0), ore)), null)
        MineTweakerAPI.recipes.addShaped(item7, arrayOf(arrayOf<IIngredient?>(ore15, ore5, null),
                arrayOf<IIngredient?>(ore5, OreBracketHandler.getOre("stone"), ore5),
                arrayOf<IIngredient?>(null, ore5, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 3),
                arrayOf(arrayOf<IIngredient?>(null, ore5, ore15),
                        arrayOf<IIngredient?>(ore5, OreBracketHandler.getOre("stone"), ore5),
                        arrayOf<IIngredient?>(ore16, ore5, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.airLockFrame", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore8, OreBracketHandler.getOre("screwStainlessSteel"), ore8),
                        arrayOf(item4, OreBracketHandler.getOre("craftingToolScrewdriver"), item4),
                        arrayOf<IIngredient>(ore, OreBracketHandler.getOre("screwStainlessSteel"), ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.airLockFrame", 1),
                arrayOf(arrayOf(ore8, ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0), ore8),
                        arrayOf<IIngredient>(item4, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                                item4),
                        arrayOf<IIngredient>(ore10, OreBracketHandler.getOre("wireGt01RedAlloy"), ore10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 1),
                arrayOf(arrayOf(ore15, item3, null), arrayOf<IIngredient?>(item3, item7, item3),
                        arrayOf(null, item3, ore17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 13),
                arrayOf(arrayOf(ore15, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 11), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 11),
                                item7, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 11)),
                        arrayOf(null, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 11), ore17)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 14),
                arrayOf(arrayOf(ore15, item, null), arrayOf<IIngredient?>(item, item7, item),
                        arrayOf(null, item, ore17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 15),
                arrayOf(arrayOf(ore15, item2, null), arrayOf<IIngredient?>(item2, item7, item2),
                        arrayOf(null, item2, ore17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 11),
                arrayOf(arrayOf(ore15,
                        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerstone", 0), null),
                        arrayOf<IIngredient?>(
                                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerstone",
                                        0), item7,
                                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerstone",
                                        0)), arrayOf(null,
                        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerstone", 0),
                        ore17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.enclosed", 12),
                arrayOf(arrayOf(ore15,
                        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowergold", 0), null),
                        arrayOf<IIngredient?>(
                                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowergold", 0),
                                item7,
                                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowergold",
                                        0)), arrayOf(null,
                        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowergold", 0),
                        ore17)), null)
        MineTweakerAPI.recipes.addShapeless(item, arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01Aluminium")),
                null)
        MineTweakerAPI.recipes.addShaped(item2.amount(3),
                arrayOf(arrayOf<IIngredient>(ore, ore, ore), arrayOf<IIngredient>(item, item, item),
                        arrayOf<IIngredient>(ore, ore, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.solar", 0),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 1), ore),
                        arrayOf<IIngredient>(item, item9, item), arrayOf<IIngredient>(ore3, ore9, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.solar", 4),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 1), ore),
                        arrayOf<IIngredient>(item2, item9, item2),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600), ore10,
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32690))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 0),
                        ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 0),
                        ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 0)), arrayOf(item, ore9, item),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 0),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("IC2:itemBatChargeRE", 26), ore3),
                        arrayOf(OreBracketHandler.getOre("cableGt01AnyCopper"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 12),
                                OreBracketHandler.getOre("cableGt01AnyCopper")),
                        arrayOf(ore9, ItemBracketHandler.getItem("IC2:itemBatChargeRE", 26), ore9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 8),
                arrayOf(arrayOf(ore7, ItemBracketHandler.getItem("IC2:itemBatChargeAdv", 26), ore7),
                        arrayOf(OreBracketHandler.getOre("cableGt02Gold"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                OreBracketHandler.getOre("cableGt02Gold")),
                        arrayOf(ore10, ItemBracketHandler.getItem("IC2:itemBatChargeAdv", 26), ore10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.spinThruster", 0),
                arrayOf(arrayOf<IIngredient>(ore7, ore7, ore7),
                        arrayOf(ItemBracketHandler.getItem("GalacticraftCore:item.fuelCanisterPartial", 1), ore10,
                                ItemBracketHandler.getItem("GalacticraftCore:item.fuelCanisterPartial", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0), item5,
                                ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.viewScreen", 0),
                arrayOf(arrayOf(ore3, item13, ore3),
                        arrayOf(ore9, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740), ore9),
                        arrayOf<IIngredient>(ore3, ore3, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.telemetry", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 19), ore5,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32682)),
                        arrayOf<IIngredient>(ore9, ore5, ore9), arrayOf<IIngredient>(ore5, ore6, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:tile.arclamp", 0),
                arrayOf(arrayOf<IIngredient>(item11, item11, item11),
                        arrayOf<IIngredient>(item11, ItemBracketHandler.getItem("GalacticraftCore:item.battery", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 16)),
                        arrayOf<IIngredient>(item11, item11, item11)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenGear", 0),
                arrayOf(arrayOf<IIngredient>(item3, item3, item3), arrayOf<IIngredient>(item14,
                        ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0), item14),
                        arrayOf<IIngredient>(item3, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                item3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankLightFull", 900),
                arrayOf(arrayOf(ore, item3, ore), arrayOf<IIngredient>(ore, OreBracketHandler.getOre("cellEmpty"), ore),
                        arrayOf<IIngredient>(ore, ore, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankLightFull", 900),
                arrayOf(arrayOf(ore, item3, ore), arrayOf(ore, ItemBracketHandler.getItem("IC2:itemFluidCell", 0), ore),
                        arrayOf<IIngredient>(ore, ore, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankLightFull", 900),
                arrayOf(arrayOf(ore, item3, ore),
                        arrayOf(ore, ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0), ore),
                        arrayOf<IIngredient>(ore, ore, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankLightFull", 900),
                arrayOf(arrayOf(ore, item3, ore),
                        arrayOf(ore, ItemBracketHandler.getItem("GalacticraftCore:item.canister", 1), ore),
                        arrayOf<IIngredient>(ore, ore, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankMedFull", 1800),
                arrayOf(arrayOf<IIngredient>(item10, item3, item10),
                        arrayOf<IIngredient>(item10, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32405),
                                item10), arrayOf<IIngredient>(item10, item10, item10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 2700),
                arrayOf(arrayOf<IIngredient>(item11, item3, item11),
                        arrayOf<IIngredient>(item11, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32406),
                                item11), arrayOf<IIngredient>(item11, item11, item11)), null)
        MineTweakerAPI.recipes.addShaped(item8, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ringRedAlloy"),
                OreBracketHandler.getOre("lensDiamond"), OreBracketHandler.getOre("ringRedAlloy")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("circuitAdvanced"),
                        OreBracketHandler.getOre("lensReinforcedGlass"), OreBracketHandler.getOre("circuitAdvanced")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("screwStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.sensorGlasses", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("circuitData"), ore12,
                        OreBracketHandler.getOre("circuitData")),
                        arrayOf<IIngredient>(ore14, OreBracketHandler.getOre("boltDesh"), ore14),
                        arrayOf(item8, OreBracketHandler.getOre("craftingToolScrewdriver"), item8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_pickaxe", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, ore3, ore3), arrayOf<IIngredient?>(ore17, ore18, ore15),
                        arrayOf<IIngredient?>(null, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_axe", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, ore3, ore15), arrayOf<IIngredient?>(ore3, ore18, null),
                        arrayOf<IIngredient?>(ore17, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_hoe", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, ore3, ore15), arrayOf<IIngredient?>(ore17, ore18, null),
                        arrayOf<IIngredient?>(null, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_shovel", 0),
                arrayOf(arrayOf<IIngredient?>(ore17, ore3, ore15), arrayOf<IIngredient?>(null, ore18, null),
                        arrayOf<IIngredient?>(null, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_sword", 0),
                arrayOf(arrayOf<IIngredient?>(null, ore3, null), arrayOf<IIngredient?>(ore17, ore3, ore15),
                        arrayOf<IIngredient?>(null, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_helmet", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, ore3, ore3), arrayOf<IIngredient?>(ore3, ore15, ore3),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_chestplate", 0),
                arrayOf(arrayOf<IIngredient>(ore3, ore15, ore3), arrayOf<IIngredient>(ore3, ore3, ore3),
                        arrayOf<IIngredient>(ore3, ore3, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_leggings", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, ore3, ore3), arrayOf<IIngredient?>(ore3, ore15, ore3),
                        arrayOf<IIngredient?>(ore3, null, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.steel_boots", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3), arrayOf<IIngredient?>(ore3, ore15, ore3),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshHelmet", 0),
                arrayOf(arrayOf<IIngredient?>(item11, item11, item11), arrayOf(item11, ore15, item11), arrayOfNulls(3)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshChestplate", 0),
                arrayOf(arrayOf(item11, ore15, item11), arrayOf<IIngredient>(item11, item11, item11),
                        arrayOf<IIngredient>(item11, item11, item11)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshLeggings", 0),
                arrayOf(arrayOf<IIngredient?>(item11, item11, item11), arrayOf(item11, ore15, item11),
                        arrayOf<IIngredient?>(item11, null, item11)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshBoots", 0),
                arrayOf(arrayOf<IIngredient?>(item11, null, item11), arrayOf(item11, ore15, item11), arrayOfNulls(3)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_pickaxe", 0),
                arrayOf(arrayOf<IIngredient?>(ore7, ore7, ore7), arrayOf<IIngredient?>(ore17, ore18, ore15),
                        arrayOf<IIngredient?>(null, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_axe", 0),
                arrayOf(arrayOf<IIngredient?>(ore7, ore7, ore15), arrayOf<IIngredient?>(ore7, ore18, null),
                        arrayOf<IIngredient?>(ore17, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_hoe", 0),
                arrayOf(arrayOf<IIngredient?>(ore7, ore7, ore15), arrayOf<IIngredient?>(ore17, ore18, null),
                        arrayOf<IIngredient?>(null, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_shovel", 0),
                arrayOf(arrayOf<IIngredient?>(ore17, ore7, ore15), arrayOf<IIngredient?>(null, ore18, null),
                        arrayOf<IIngredient?>(null, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_sword", 0),
                arrayOf(arrayOf<IIngredient?>(null, ore7, null), arrayOf<IIngredient?>(ore17, ore7, ore15),
                        arrayOf<IIngredient?>(null, ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshPick", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502), item11,
                        item11), arrayOf(ore17, OreBracketHandler.getOre("stickDesh"), item11),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickDesh"), ore15)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshAxe", 0),
                arrayOf(arrayOf<IIngredient?>(item11, item11,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502)),
                        arrayOf(item11, OreBracketHandler.getOre("stickDesh"), ore15),
                        arrayOf<IIngredient?>(ore17, OreBracketHandler.getOre("stickDesh"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshHoe", 0),
                arrayOf(arrayOf<IIngredient?>(item11, item11,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502)),
                        arrayOf<IIngredient?>(ore17, OreBracketHandler.getOre("stickDesh"), ore15),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickDesh"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshSpade", 0),
                arrayOf(arrayOf(ore17, item11, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickDesh"), ore15),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickDesh"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.deshSword", 0),
                arrayOf(arrayOf<IIngredient?>(null, item11,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502)), arrayOf(ore17, item11, ore15),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickDesh"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_helmet", 0),
                arrayOf(arrayOf<IIngredient?>(ore7, ore7, ore7), arrayOf<IIngredient?>(ore7, ore15, ore7),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_chestplate", 0),
                arrayOf(arrayOf<IIngredient>(ore7, ore15, ore7), arrayOf<IIngredient>(ore7, ore7, ore7),
                        arrayOf<IIngredient>(ore7, ore7, ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_leggings", 0),
                arrayOf(arrayOf<IIngredient?>(ore7, ore7, ore7), arrayOf<IIngredient?>(ore7, ore15, ore7),
                        arrayOf<IIngredient?>(ore7, null, ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.titanium_boots", 0),
                arrayOf(arrayOf<IIngredient?>(ore7, null, ore7), arrayOf<IIngredient?>(ore7, ore15, ore7),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(item4,
                arrayOf(arrayOf(item17, ore5, item17), arrayOf<IIngredient>(ore5, ore3, ore5),
                        arrayOf(item17, ore5, item17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.airFan", 0),
                arrayOf(arrayOf<IIngredient>(ore13, OreBracketHandler.getOre("craftingToolScrewdriver"), ore13),
                        arrayOf(item15, OreBracketHandler.getOre("stickLongStainlessSteel"), item15),
                        arrayOf<IIngredient>(ore13, OreBracketHandler.getOre("craftingToolWrench"), ore13)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0),
                arrayOf(arrayOf(ore3, item4, ore3),
                        arrayOf(ore3, ItemBracketHandler.getItem("GalacticraftCore:item.airFan", 0), ore3),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0), item14,
                                ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0))), null)

        //TODO Replace ("GalaxySpace:item.CompressedSDHD120", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
        //                ItemBracketHandler.getItem("GalacticraftCore:item.oilCanisterPartial", 1001),
        //                ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0)),
        //                arrayOf<IIngredient>(item5, ItemBracketHandler.getItem("gregtech:gt.blockcasings3", 14), item5),
        //                arrayOf<IIngredient>(item5, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32731),
        //                        item5)), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronIngot", 1),
                        ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronIngot", 1),
                        ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronIngot", 1)),
                        arrayOf<IIngredient>(item5,
                                ItemBracketHandler.getItem("GalacticraftCore:item.fuelCanisterPartial", 1), item5),
                        arrayOf<IIngredient>(item5, item4, item5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.noseCone", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.cagelamp2.inv", 14),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("screwStainlessSteel"), item5,
                                OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf<IIngredient>(item5, item5, item5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolHardHammer"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 9),
                        OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 9),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0)),
                        arrayOf(ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                OreBracketHandler.getOre("craftingToolSaw"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolHardHammer"),
                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                        OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf<IIngredient>(item6, ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), item6),
                        arrayOf(item6, OreBracketHandler.getOre("craftingToolSaw"), item6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.oilExtractor", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("pipeTinySteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oilCanisterPartial", 1001), ore4),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lightbutton",
                                14), ore4, ore4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 0),
                arrayOf(arrayOf<IIngredient>(ore3, OreBracketHandler.getOre("plateAnyRubber"), ore3),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"), ore7,
                                OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOf<IIngredient>(ore3, OreBracketHandler.getOre("plateAnyRubber"), ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 1),
                arrayOf(arrayOf(null, item16, ore3), arrayOf(item16, item16, ore3),
                        arrayOf<IIngredient?>(ore3, ore3, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 2),
                arrayOf(arrayOf(ore3, item16, ore3),
                        arrayOf(ore3, ItemBracketHandler.getItem("IronChest:BlockIronChest", 0), ore3),
                        arrayOf<IIngredient>(ore3, ore3, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 19),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32692), ore),
                        arrayOf(ore9, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740), ore9),
                        arrayOf(ore5, ItemBracketHandler.getItem("GalacticraftCore:item.battery", 0), ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 19),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32692), ore),
                        arrayOf(ore9, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740), ore9),
                        arrayOf(ore5, ItemBracketHandler.getItem("GalacticraftCore:item.battery", OreDictionary.WILDCARD_VALUE), ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.walkway", 0).amount(2),
                arrayOf(arrayOf<IIngredient?>(item11, item11, item11),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockDesh"), null),
                        arrayOf<IIngredient?>(item11, item11, item11)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftMars:item.null", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23884)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23884),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.null", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftCore:item.battery", OreDictionary.WILDCARD_VALUE),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32500)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.standardWrench", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("craftingToolFile"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1), item6,
                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1)),
                        arrayOf<IIngredient>(item6, item6, item6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0), item6,
                                ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.heavyNoseCone", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.noseCone", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("screwTitanium"), item6,
                                OreBracketHandler.getOre("screwTitanium")), arrayOf<IIngredient>(item6, item6, item6)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ringRedAlloy"), ore2,
                        OreBracketHandler.getOre("ringRedAlloy")),
                        arrayOf<IIngredient>(ore2, OreBracketHandler.getOre("lensDiamond"), ore2),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringRedAlloy"), ore2,
                                OreBracketHandler.getOre("ringRedAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.beamReflector", 0),
                arrayOf(arrayOf(ore14, ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8),
                        ore14), arrayOf<IIngredient>(OreBracketHandler.getOre("screwDesh"),
                        OreBracketHandler.getOre("stickDesh"), OreBracketHandler.getOre("screwDesh")),
                        arrayOf(item11, OreBracketHandler.getOre("blockDesh"), item11)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.beamReceiver", 0),
                arrayOf(arrayOf<IIngredient>(ore5, ore14, ore5),
                        arrayOf(ore14, ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8),
                                ore14), arrayOf<IIngredient>(ore5, ore14, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.telepadShort", 0),
                arrayOf(arrayOf(ore7, item11, ore7),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32672),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8)),
                        arrayOf(ore7, item11, ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachine", 4),
                arrayOf(arrayOf<IIngredient>(item6, ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 2), item6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                                ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersBed", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3)),
                        arrayOf<IIngredient>(item6, ItemBracketHandler.getItem("minecraft:clock", 0), item6)), null)

        //TODO Replace ("extracells:certustank", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachine", 0),
        //        arrayOf(arrayOf(ore7, ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0), ore7),
        //                arrayOf<IIngredient>(item11, ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 4),
        //                        item11),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
        //                        ItemBracketHandler.getItem("extracells:certustank", 0),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612))), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.marsMachine", 8),
                arrayOf(arrayOf(ore10, ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 19), ore10),
                        arrayOf<IIngredient>(item11, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                item11), arrayOf(OreBracketHandler.getOre("cableGt02Aluminium"), item11,
                        OreBracketHandler.getOre("cableGt02Aluminium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.grapple", 0),
                arrayOf(arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("toolHeadArrowMeteoricSteel")),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.MeteoricIronString", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.MeteoricIronString", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.MeteoricIronString", 0)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ringMeteoricSteel"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:tile.minerBase", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("compressedTitanium"),
                        OreBracketHandler.getOre("chestSteel"), OreBracketHandler.getOre("compressedTitanium")),
                        arrayOf(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8),
                                OreBracketHandler.getOre("frameGtTungsten"),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8)),
                        arrayOf(OreBracketHandler.getOre("compressedDesh"),
                                ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 0),
                                OreBracketHandler.getOre("compressedDesh"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.orionDrive", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("compressedTitanium"),
                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8),
                        OreBracketHandler.getOre("compressedTitanium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("oc:hdd3"), OreBracketHandler.getOre("circuitMaster")),
                        arrayOf(OreBracketHandler.getOre("compressedSteel"),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8),
                                OreBracketHandler.getOre("compressedSteel"))), null)

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0),
        //        arrayOf(arrayOf(null, ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                OreBracketHandler.getOre("stickPlastic")),
        //                arrayOf(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        OreBracketHandler.getOre("stickPlastic"),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("stickPlastic"),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), null)), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 20),
                arrayOf(arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.airVent", 0),
                        OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 10),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 9),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 8),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 13),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 8))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftCore:item.schematic", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.schematic", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftCore:item.schematic", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.schematic", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 1),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 0), null,
                        null), arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 2),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 0),
                        null), arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 1), null,
                        null), arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 2),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 1),
                        null), arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 2), null,
                        null), arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 1),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("GalacticraftMars:item.schematic", 2),
                        null), arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.parachute", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0),
                        ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0),
                        ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("wireFineSteel"), null,
                                OreBracketHandler.getOre("wireFineSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("wireFineSteel"),
                                OreBracketHandler.getOre("wireFineSteel"), OreBracketHandler.getOre("wireFineSteel"))),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronRaw", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronRaw", OreDictionary.WILDCARD_VALUE)), null)

        //TODO Replace ("GalaxySpace:item.ModuleLander", 0) and ("GalaxySpace:item.ModuleSmallFuelCanister", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 0),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsTier1", 0), null,
        //                null, null, null, null, null, null, null), arrayOf<IIngredient?>(null, null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftCore:item.noseCone", 0), null, null, null, null),
        //                arrayOf<IIngredient?>(null, null, null, null, OreBracketHandler.getOre("compressedSteel"), null,
        //                        null, null, null), arrayOf<IIngredient?>(null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
        //                ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander", 0),
        //                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null, null, null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf(null, null, ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        OreBracketHandler.getOre("compressedSteel"),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0),
        //                        OreBracketHandler.getOre("compressedSteel"),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOfNulls(9)))

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", OreDictionary.WILDCARD_VALUE)), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsMoonBuggy", 0),
                        null, null, null, null, null, null, null, null),
                        arrayOf(null, ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 0),
                                OreBracketHandler.getOre("stickStainlessSteel"),
                                OreBracketHandler.getOre("compressedMeteoricIron"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 19),
                                OreBracketHandler.getOre("compressedMeteoricIron"),
                                OreBracketHandler.getOre("stickStainlessSteel"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 0), null),
                        arrayOf(null, OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("screwStainlessSteel"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("screwStainlessSteel"), null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 1),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null, null, null),
                        arrayOf(null, OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("screwStainlessSteel"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
                                OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("screwStainlessSteel"), null),
                        arrayOf(null, ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 0),
                                OreBracketHandler.getOre("stickStainlessSteel"),
                                OreBracketHandler.getOre("compressedMeteoricIron"),
                                OreBracketHandler.getOre("compressedMeteoricIron"),
                                OreBracketHandler.getOre("compressedMeteoricIron"),
                                OreBracketHandler.getOre("stickStainlessSteel"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.buggymat", 0), null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.buggy", OreDictionary.WILDCARD_VALUE)), null)

        //TODO Replace ("GalaxySpace:item.ModuleLander2", 0) and
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsTier2", 0), null,
        //                null, null, ItemBracketHandler.getItem("GalacticraftCore:item.noseCone", 0), null, null, null,
        //                null), arrayOf<IIngredient?>(null, null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null, null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander2", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1), null, null),
        //                arrayOfNulls(9)))
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 1)), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 2)), null)

        //TODO Replace ("GalaxySpace:item.ModuleLander3", 0) and ("GalaxySpace:item.ModuleSmallFuelCanister", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 0),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsTier3", 0), null,
        //                null, null, ItemBracketHandler.getItem("GalacticraftMars:item.heavyNoseCone", 0), null, null,
        //                null, null), arrayOf<IIngredient?>(null, null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander3", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0), null, null,
        //                        null), arrayOf<IIngredient?>(null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
        //                ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0), null, null,
        //                        null), arrayOf<IIngredient?>(null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
        //                ItemBracketHandler.getItem("dreamcraft:item.MediumFuelCanister", 0),
        //                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0), null, null, null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
        //                        ItemBracketHandler.getItem("dreamcraft:item.MediumFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2), null, null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0), null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2), null, null),
        //                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 1),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1), null, null)))
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", OreDictionary.WILDCARD_VALUE)), null)

        //TODO Replace ("GalaxySpace:item.ModuleSmallFuelCanister", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 11),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsCargoRocket", 0),
        //                null, null, null, null, null, null, null, null), arrayOf<IIngredient?>(null, null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftCore:item.noseCone", 0), null, null, null, null),
        //                arrayOf<IIngredient?>(null, null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 14), null, null, null,
        //                        null), arrayOf<IIngredient?>(null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf(null, null, ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        OreBracketHandler.getOre("chestCopper"),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf<IIngredient?>(null, null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0), null, null, null, null),
        //                arrayOfNulls(9)))
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 11),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 12)), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 11),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 13)), null)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 12),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsCargoRocket", 0),
        //                null, null, null, null, null, null, null, null), arrayOf<IIngredient?>(null, null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftCore:item.noseCone", 0), null, null, null, null),
        //                arrayOf<IIngredient?>(null, null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 14), null, null, null,
        //                        null), arrayOf<IIngredient?>(null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf(null, null, ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        OreBracketHandler.getOre("chestIron"),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf<IIngredient?>(null, null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0), null, null, null, null),
        //                arrayOfNulls(9)))
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 12),
        //        arrayOf(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 11),
        //                OreBracketHandler.getOre("chestIron")), null)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 13),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsCargoRocket", 0),
        //                null, null, null, null, null, null, null, null), arrayOf<IIngredient?>(null, null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftCore:item.noseCone", 0), null, null, null, null),
        //                arrayOf<IIngredient?>(null, null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 14), null, null, null,
        //                        null), arrayOf<IIngredient?>(null, null, null,
        //                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3), null, null, null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalaxySpace:item.ModuleSmallFuelCanister", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf(null, null, ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        OreBracketHandler.getOre("chestGold"),
        //                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.rocketFins", 0), null, null),
        //                arrayOf<IIngredient?>(null, null, null, null,
        //                        ItemBracketHandler.getItem("GalacticraftCore:item.engine", 0), null, null, null, null),
        //                arrayOfNulls(9)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 13),
                arrayOf(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 11),
                        OreBracketHandler.getOre("chestGold")), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftMars:item.itemAstroMiner", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsAstroMiner", 0),
                        null, null, null, null, null, null, null, null), arrayOf<IIngredient?>(null, null, null,
                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                        ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0), null),
                        arrayOf<IIngredient?>(null, null,
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.orionDrive", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.orionDrive", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 14),
                                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 14),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null),
                        arrayOf(null, ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.orionDrive", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.orionDrive", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.orionDrive", 0),
                                OreBracketHandler.getOre("chestGold"), OreBracketHandler.getOre("chestGold"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null),
                        arrayOf<IIngredient?>(null, null,
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 8),
                                ItemBracketHandler.getItem("GalacticraftMars:tile.beamReceiver", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                                ItemBracketHandler.getItem("GalacticraftCore:item.heavyPlating", 0), null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 3),
                                ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0), null),
                        arrayOfNulls(9), arrayOfNulls(9), arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalacticraftCore:item.infiniteOxygen", 0),
                arrayOf(arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("ingotInfinity"),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("plateNeutronium"),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("ingotInfinity"), null,
                        null), arrayOf(null, OreBracketHandler.getOre("ingotInfinity"),
                        OreBracketHandler.getOre("plateNeutronium"),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("ingotInfinity"), null),
                        arrayOf(null, OreBracketHandler.getOre("plateNeutronium"),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32616),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                OreBracketHandler.getOre("plateNeutronium"), null),
                        arrayOf(null, OreBracketHandler.getOre("plateNeutronium"),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32105),
                                OreBracketHandler.getOre("pipeSmallInfinity"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32105),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                OreBracketHandler.getOre("plateNeutronium"), null),
                        arrayOf(null, OreBracketHandler.getOre("plateNeutronium"),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 122),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                OreBracketHandler.getOre("plateNeutronium"), null),
                        arrayOf(null, OreBracketHandler.getOre("plateNeutronium"),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32105),
                                OreBracketHandler.getOre("pipeSmallInfinity"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32105),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                OreBracketHandler.getOre("plateNeutronium"), null),
                        arrayOf(null, OreBracketHandler.getOre("plateNeutronium"),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32616),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oxygenTankHeavyFull", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                OreBracketHandler.getOre("plateNeutronium"), null),
                        arrayOf(null, OreBracketHandler.getOre("ingotInfinity"),
                                OreBracketHandler.getOre("plateNeutronium"),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("ingotInfinity"),
                                null), arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("ingotInfinity"),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("plateNeutronium"),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("ingotInfinity"), null,
                        null)))
        val item18 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val item19 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap = HashMap<String, IData>()
        val s = "Fluid"
        val hashMap2 = HashMap<String, IData>()
        hashMap2["FluidName"] = ExpandString.asData("oil")
        hashMap2["Amount"] = ExpandInt.toData(1000)
        hashMap[s] = ExpandAnyDict.asData(hashMap2)
        Fuels.addDieselFuel(item18, item19.withTag(ExpandAnyDict.asData(hashMap)), 16)
        Fuels.addDieselFuel(ItemBracketHandler.getItem("IC2:itemCellEmpty", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30707), 16)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 0),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(2000), intArrayOf(10000, 10000, 10000), 1200, VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 1),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(2000), intArrayOf(10000, 10000, 10000), 1200, VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 2),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(2000), intArrayOf(10000, 10000, 10000), 1200, VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 3),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(2000), intArrayOf(10000, 10000, 10000), 1200, VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(4000), intArrayOf(10000, 10000, 10000, 10000), 2400,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 1),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(4000), intArrayOf(10000, 10000, 10000, 10000), 2400,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 2),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(4000), intArrayOf(10000, 10000, 10000, 10000), 2400,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 3),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(4000), intArrayOf(10000, 10000, 10000, 10000), 2400,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 0),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 3600,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 1),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 3600,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 2),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 3600,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 3),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 3600,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 11),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(4000), intArrayOf(10000, 10000, 10000, 10000), 2400,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 12),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(4000), intArrayOf(10000, 10000, 10000, 10000), 2400,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 13),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(4000), intArrayOf(10000, 10000, 10000, 10000), 2400,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11028).amount(10)),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemAstroMiner", 0),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 3600,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(21),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 0),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 1200,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(28),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 1),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 1200,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(35),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 2),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 1200,
                VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(42),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 3),
                LiquidBracketHandler.getLiquid("oxygen").withAmount(6000), intArrayOf(10000, 10000, 10000, 10000), 1200,
                VoltageLevels.LV)

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0).amount(8),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29019).amount(8),
        //                ItemBracketHandler.getItem("dreamcraft:item.MeteoricIronString", 0).amount(8),
        //                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
        //        LiquidBracketHandler.getLiquid("molten.silicone").withAmount(144), 300,  VoltageLevels.HV)

        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:tile.glowstoneTorch", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23010),
                ItemBracketHandler.getItem("minecraft:glowstone_dust", 0), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.oilCanisterPartial", 1001),
                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 9).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28305).amount(4), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:tile.hydrogenPipe", 0), item3,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28035).amount(4), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 0), arrayOf<IIngredient>(
                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7).amount(5),
                ItemBracketHandler.getItem("dreamcraft:item.MeteoricIronString", 0).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 5).amount(0)),
                LiquidBracketHandler.getLiquid("molten.silicone").withAmount(720), 750, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7).amount(5),
                ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 180, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 1), arrayOf<IIngredient>(
                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7).amount(8),
                ItemBracketHandler.getItem("dreamcraft:item.MeteoricIronString", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 8).amount(0)),
                LiquidBracketHandler.getLiquid("molten.silicone").withAmount(1152), 1200, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7).amount(8),
                ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 1),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 300, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 2), arrayOf<IIngredient>(
                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7).amount(7),
                ItemBracketHandler.getItem("dreamcraft:item.MeteoricIronString", 0).amount(7),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 7).amount(0)),
                LiquidBracketHandler.getLiquid("molten.silicone").withAmount(1008), 1050, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7).amount(7),
                ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 260, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 3), arrayOf<IIngredient>(
                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.MeteoricIronString", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0)),
                LiquidBracketHandler.getLiquid("molten.silicone").withAmount(576), 600, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7).amount(4),
                ItemBracketHandler.getItem("GalacticraftMars:item.thermalPadding", 3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 150, VoltageLevels.LHV)

        //TODO Replace getLiquid("glue")
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenMask", 0),
        //        ItemBracketHandler.getItem("IC2:itemArmorHazmatHelmet", 0),
        //        ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0).amount(16),
        //        LiquidBracketHandler.getLiquid("glue").withAmount(144), 400, VoltageLevels.MV)

        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenMask", 0),
                ItemBracketHandler.getItem("IC2:itemArmorHazmatHelmet", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0).amount(16),
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(144), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.oxygenMask", 0),
                ItemBracketHandler.getItem("IC2:itemArmorHazmatHelmet", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0).amount(16),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(72), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 0), item13,
                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 9), 200, VoltageLevels.MV)

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0),
        //        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23874).amount(2), 300,  VoltageLevels.HV)

        Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.parachute", 0),
                ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19305).amount(3), 300,  VoltageLevels.HV)

        //TODO Replace Galaxyspace rocket capacity upgrades
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 1),
        //        ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 0),
        //        OreBracketHandler.getOre("chestCopper"), 100,  VoltageLevels.HV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 2),
        //        ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 0), OreBracketHandler.getOre("chestIron"),
        //        100, 480)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 3),
        //        ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 0), OreBracketHandler.getOre("chestGold"),
        //        100, 480)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 1),
        //        ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
        //        OreBracketHandler.getOre("chestCopper"), 100, VoltageLevels.LEV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 2),
        //        ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
        //        OreBracketHandler.getOre("chestIron"), 100, VoltageLevels.LEV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 3),
        //        ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
        //        OreBracketHandler.getOre("chestGold"), 100, VoltageLevels.LEV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 1),
        //        ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 0),
        //        OreBracketHandler.getOre("chestCopper"), 100, VoltageLevels.EV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 2),
        //        ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 0),
        //        OreBracketHandler.getOre("chestIron"), 100, VoltageLevels.EV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 3),
        //        ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 0),
        //        OreBracketHandler.getOre("chestGold"), 100, VoltageLevels.EV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 1),
        //        ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 0), OreBracketHandler.getOre("chestCopper"),
        //        100, 480)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 1),
        //        ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 0), OreBracketHandler.getOre("chestIron"),
        //        100, 480)
        //Assembler.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 1),
        //        ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 0), OreBracketHandler.getOre("chestGold"),
        //        100, 480)

        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11028)),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 4).amount(2)), 1500, 120,
                1500)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronRaw", 0)), 1200, 120,
                1000)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(2)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:tile.fallenMeteor", 0)), 1200, 120,
                1000)
        Canner.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 15),
                ItemBracketHandler.getItem("minecraft:apple", 0).amount(6),
                ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0), 800, VoltageLevels.LULV)
        Canner.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 16),
                ItemBracketHandler.getItem("minecraft:carrot", 0).amount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0), 800, VoltageLevels.LULV)
        Canner.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 17),
                ItemBracketHandler.getItem("minecraft:melon", 0).amount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0), 800, VoltageLevels.LULV)
        Canner.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 18),
                ItemBracketHandler.getItem("minecraft:potato", 0).amount(16),
                ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0), 800, VoltageLevels.LULV)
        Compressor.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 12),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:tile.moonBlock", 2),
                ItemBracketHandler.getItem("GalacticraftCore:item.cheeseCurd", 0).amount(9))
        Extruder.addRecipe(item3.amount(2), ItemBracketHandler.getItem("IC2:blockAlloyGlass", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32359).amount(0), 120, VoltageLevels.MV)
        Extruder.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0),
                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 7),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32354).amount(0), 120, VoltageLevels.LV)
        Extruder.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.canister", 1),
                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32354).amount(0), 120, VoltageLevels.LV)
        Extruder.addRecipe(item9, ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 9).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32352).amount(0), 600, VoltageLevels.LV)
        FluidCanner.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.fuelCanisterPartial", 1),
                ItemBracketHandler.getItem("GalacticraftCore:item.fuelCanisterPartial", 1001), null,
                LiquidBracketHandler.getLiquid("fuel").withAmount(1000))
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2340).amount(9)),
                ItemBracketHandler.getItem("GalacticraftCore:tile.gcBlockCore", 12), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2884)),
                ItemBracketHandler.getItem("GalacticraftMars:item.null", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("GalacticraftMars:item.null", 0).amount(2)),
                ItemBracketHandler.getItem("GalacticraftMars:tile.mars", 2), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronRaw", 0).amount(2)),
                ItemBracketHandler.getItem("GalacticraftCore:tile.fallenMeteor", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(
                arrayOf(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 4).amount(2)),
                ItemBracketHandler.getItem("GalacticraftMars:tile.asteroidsBlock", 4), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2020)),
                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 2), intArrayOf(10000), 300, VoltageLevels.LULV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 0),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(8), intArrayOf(10000, 10000, 10000), 65,
                VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                LiquidBracketHandler.getLiquid("argon").withAmount(3),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 0),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(3), intArrayOf(10000, 10000, 10000), 65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 1),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(8), intArrayOf(10000, 10000, 10000), 65,
                VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                LiquidBracketHandler.getLiquid("argon").withAmount(3),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 1),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(3), intArrayOf(10000, 10000, 10000), 65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 2),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(8), intArrayOf(10000, 10000, 10000), 65,
                VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                LiquidBracketHandler.getLiquid("argon").withAmount(3),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 2),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(3), intArrayOf(10000, 10000, 10000), 65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 3),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(8), intArrayOf(10000, 10000, 10000), 65,
                VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(20),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64)),
                LiquidBracketHandler.getLiquid("argon").withAmount(3),
                ItemBracketHandler.getItem("GalacticraftCore:item.spaceship", 3),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(3), intArrayOf(10000, 10000, 10000), 65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(17),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(17),
                intArrayOf(10000, 10000, 10000, 10000), 130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                LiquidBracketHandler.getLiquid("argon").withAmount(6),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 0),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(6), intArrayOf(10000, 10000, 10000, 10000),
                130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(17),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 1),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(17),
                intArrayOf(10000, 10000, 10000, 10000), 130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                LiquidBracketHandler.getLiquid("argon").withAmount(6),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 1),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(6), intArrayOf(10000, 10000, 10000, 10000),
                130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(17),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 2),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(17),
                intArrayOf(10000, 10000, 10000, 10000), 130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                LiquidBracketHandler.getLiquid("argon").withAmount(6),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 2),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(6), intArrayOf(10000, 10000, 10000, 10000),
                130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(17),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 3),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(17),
                intArrayOf(10000, 10000, 10000, 10000), 130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(41),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(6)),
                LiquidBracketHandler.getLiquid("argon").withAmount(6),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 3),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(6), intArrayOf(10000, 10000, 10000, 10000),
                130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(26),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 0),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(26),
                intArrayOf(10000, 10000, 10000, 10000), 200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                LiquidBracketHandler.getLiquid("argon").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 0),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(26),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 1),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(26),
                intArrayOf(10000, 10000, 10000, 10000), 200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                LiquidBracketHandler.getLiquid("argon").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 1),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(26),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 2),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(26),
                intArrayOf(10000, 10000, 10000, 10000), 200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                LiquidBracketHandler.getLiquid("argon").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 2),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(26),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 3),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(26),
                intArrayOf(10000, 10000, 10000, 10000), 200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(37),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(12)),
                LiquidBracketHandler.getLiquid("argon").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemTier3Rocket", 3),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(17),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 11),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(17),
                intArrayOf(10000, 10000, 10000, 10000), 130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                LiquidBracketHandler.getLiquid("argon").withAmount(6),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 11),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(6), intArrayOf(10000, 10000, 10000, 10000),
                130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(17),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 12),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(17),
                intArrayOf(10000, 10000, 10000, 10000), 130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                LiquidBracketHandler.getLiquid("argon").withAmount(6),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 12),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(6), intArrayOf(10000, 10000, 10000, 10000),
                130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(17),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 13),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(17),
                intArrayOf(10000, 10000, 10000, 10000), 130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(40),
                ItemBracketHandler.getItem("minecraft:diamond", 0).amount(4)),
                LiquidBracketHandler.getLiquid("argon").withAmount(6),
                ItemBracketHandler.getItem("GalacticraftMars:item.spaceshipTier2", 13),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(6), intArrayOf(10000, 10000, 10000, 10000),
                130, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11028).amount(10)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(26),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemAstroMiner", 0),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(26),
                intArrayOf(10000, 10000, 10000, 10000), 200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32464).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32463).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11028).amount(10)),
                LiquidBracketHandler.getLiquid("argon").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemAstroMiner", 0),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                200, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(21),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 0),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(21),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                LiquidBracketHandler.getLiquid("argon").withAmount(3),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 0),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(3), intArrayOf(10000, 10000, 10000, 10000),
                65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(28),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 1),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(28),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                LiquidBracketHandler.getLiquid("argon").withAmount(3),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 1),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(3), intArrayOf(10000, 10000, 10000, 10000),
                65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(35),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 2),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(35),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                LiquidBracketHandler.getLiquid("argon").withAmount(3),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 2),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(3), intArrayOf(10000, 10000, 10000, 10000),
                65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(42),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                LiquidBracketHandler.getLiquid("nitrogen").withAmount(8),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 3),
                LiquidBracketHandler.getLiquid("plasma.nitrogen").withAmount(8), intArrayOf(10000, 10000, 10000, 10000),
                65, VoltageLevels.LV)
        PlasmaArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32462).amount(11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(42),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11306).amount(4)),
                LiquidBracketHandler.getLiquid("argon").withAmount(3),
                ItemBracketHandler.getItem("GalacticraftCore:item.buggy", 3),
                LiquidBracketHandler.getLiquid("plasma.argon").withAmount(3), intArrayOf(10000, 10000, 10000, 10000),
                65, VoltageLevels.LV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.canister", 0),
                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 7).amount(2), 200, VoltageLevels.ULV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("GalacticraftCore:item.canister", 1),
                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 6).amount(2), 200, VoltageLevels.ULV)
    }
}