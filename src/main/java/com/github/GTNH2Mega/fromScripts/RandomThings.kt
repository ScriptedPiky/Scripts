package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.BlastFurnace
import gttweaker.mods.gregtech.machines.ChemicalReactor
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class RandomThings : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32691)
        val ore = OreBracketHandler.getOre("circuitGood")
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:onlineDetector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:moonSensor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:bloodMoonSensor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:lapisLamp", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:imbuingStation", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:energyDistributor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:enderEnergyDistributor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:itemCollector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:advancedItemCollector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:dyeingMachine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:playerinterface", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:filter", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:ingredient", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:fertilizedDirt", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:fluidDisplay", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:advancedFluidDisplay", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:wirelessLever", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:voidStone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:dropFilter", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RandomThings:spectreKey", 0))
        MineTweakerAPI.recipes.addShapedMirrored(ItemBracketHandler.getItem("RandomThings:bloodMoonSensor", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:stained_glass_pane", 14), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:daylight_detector", 0), null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RandomThings:lapisLamp", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("chisel:iron_bars", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("chisel:iron_bars", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("chisel:iron_bars", 2),
                                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 27),
                                ItemBracketHandler.getItem("chisel:iron_bars", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("chisel:iron_bars", 2),
                                ItemBracketHandler.getItem("minecraft:redstone_torch", 0),
                                ItemBracketHandler.getItem("chisel:iron_bars", 2))), null)
        MineTweakerAPI.recipes.addShapedMirrored(ItemBracketHandler.getItem("RandomThings:moonSensor", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:stained_glass_pane", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:daylight_detector", 0), null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RandomThings:onlineDetector", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("chisel:iron_bars", 2), item,
                        ItemBracketHandler.getItem("chisel:iron_bars", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("chisel:iron_bars", 2),
                                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 30),
                                ItemBracketHandler.getItem("chisel:iron_bars", 2)),
                        arrayOf(ItemBracketHandler.getItem("chisel:iron_bars", 2), ore,
                                ItemBracketHandler.getItem("chisel:iron_bars", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RandomThings:onlineDetector", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:iron_bars", 0), item,
                        ItemBracketHandler.getItem("minecraft:iron_bars", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 30),
                                ItemBracketHandler.getItem("minecraft:iron_bars", 0)),
                        arrayOf(ItemBracketHandler.getItem("minecraft:iron_bars", 0), ore,
                                ItemBracketHandler.getItem("minecraft:iron_bars", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RandomThings:imbuingStation", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:vine", 0),
                        ItemBracketHandler.getItem("minecraft:brewing_stand", 0),
                        ItemBracketHandler.getItem("minecraft:vine", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:tallgrass", 1),
                                ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 5),
                                ItemBracketHandler.getItem("minecraft:tallgrass", 1)),
                        arrayOf(ItemBracketHandler.getItem("minecraft:waterlily", 0),
                                OreBracketHandler.getOre("blockEmerald"),
                                ItemBracketHandler.getItem("minecraft:waterlily", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RandomThings:enderEnergyDistributor", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateEnderPearl"),
                        ItemBracketHandler.getItem("RandomThings:ingredient", 6),
                        OreBracketHandler.getOre("plateEnderPearl")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("RandomThings:ingredient", 6),
                                ItemBracketHandler.getItem("RandomThings:energyDistributor", 0),
                                ItemBracketHandler.getItem("RandomThings:ingredient", 6)),
                        arrayOf(OreBracketHandler.getOre("plateEnderPearl"),
                                ItemBracketHandler.getItem("EnderIO:blockWirelessCharger", 0),
                                OreBracketHandler.getOre("plateEnderPearl"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RandomThings:energyDistributor", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("blockRedstone"),
                        ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 10),
                        OreBracketHandler.getOre("blockRedstone")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 0),
                                ItemBracketHandler.getItem("RandomThings:ingredient", 7),
                                ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 0)),
                        arrayOf(OreBracketHandler.getOre("plateBlackSteel"),
                                ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 10),
                                OreBracketHandler.getOre("plateBlackSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RandomThings:itemCollector", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("gemDiamond"), null),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650),
                                OreBracketHandler.getOre("stickObsidian"), OreBracketHandler.getOre("blockHopper")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateRedstone"), null)), null)

        //TODO Replace ("ExtraUtilities:enderCollector", 0)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("RandomThings:advancedItemCollector", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraUtilities:enderCollector", 0)), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RandomThings:dyeingMachine", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 11),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("RandomThings:playerinterface", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("RIO:tile.remote_interface", 0),
                        ItemBracketHandler.getItem("RandomThings:ingredient", 0)), null)

        //TODO Replace ("ExtraUtilities:trashcan", 0)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("RandomThings:voidStone", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraUtilities:trashcan", 0),
        //                ItemBracketHandler.getItem("minecraft:ender_pearl", 0)), null)

        Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:ingredient", 5),
                ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                ItemBracketHandler.getItem("minecraft:nether_wart", 0), 150, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:ingredient", 0),
                ItemBracketHandler.getItem("minecraft:emerald", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(4), 250,  VoltageLevels.HV)

        //TODO Replace (TConstruct:GlassPane)
        //Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:fluidDisplay", 0).amount(8),
        //        ItemBracketHandler.getItem("TConstruct:GlassPane", 0).amount(16),
        //        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
        //        LiquidBracketHandler.getLiquid("refinedglue").withAmount(72), 200, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:advancedFluidDisplay", 0),
                ItemBracketHandler.getItem("RandomThings:fluidDisplay", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(144), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:filter", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32729),
                ItemBracketHandler.getItem("minecraft:stone", 0), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:filter", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32729),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:filter", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32729),
                ItemBracketHandler.getItem("minecraft:porkchop", 0), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:filter", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32729),
                ItemBracketHandler.getItem("minecraft:ender_pearl", 0), 200, VoltageLevels.MV)

        //TODO Replace getLiquid("ender")
        //Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:wirelessLever", 0),
        //        ItemBracketHandler.getItem("minecraft:lever", 0),
        //        ItemBracketHandler.getItem("minecraft:redstone_block", 0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 300, VoltageLevels.LV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:whitestone", 0),
        //        ItemBracketHandler.getItem("TwilightForest:item.charmOfKeeping3", 0).amount(4),
        //        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(4000), 1200,  VoltageLevels.HV)

        //TODO Replace ("ExtraUtilities:trashcan", 0) and getLiquid("ender")
        //Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:dropFilter", 1),
        //        ItemBracketHandler.getItem("ExtraUtilities:trashcan", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(250), 300, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("RandomThings:spectreKey", 0),
                ItemBracketHandler.getItem("RandomThings:ingredient", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23028),
                LiquidBracketHandler.getLiquid("bacterialsludge").withAmount(1000), 600, VoltageLevels.LEV)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("RandomThings:ingredient", 4)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2032),
                        ItemBracketHandler.getItem("RandomThings:ingredient", 3)), 1200, 480, 2500)

        //TODO Replace getLiquid("ender")
        //ChemicalReactor.addRecipe(ItemBracketHandler.getItem("RandomThings:ingredient", 6), null,
        //        ItemBracketHandler.getItem("minecraft:diamond", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 1200, VoltageLevels.LV)

        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("RandomThings:fertilizedDirt", 0), null,
                ItemBracketHandler.getItem("minecraft:dirt", 0),
                ItemBracketHandler.getItem("minecraft:dye", 15).amount(4),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 100, VoltageLevels.LV)
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("RandomThings:fertilizedDirt", 0), null,
                ItemBracketHandler.getItem("minecraft:dirt", 0),
                ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(2),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 100, VoltageLevels.LV)
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("RandomThings:fertilizedDirt", 0), null,
                ItemBracketHandler.getItem("minecraft:dirt", 0),
                ItemBracketHandler.getItem("IC2:itemFertilizer", 0).amount(2),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 100, VoltageLevels.LV)
    }
}