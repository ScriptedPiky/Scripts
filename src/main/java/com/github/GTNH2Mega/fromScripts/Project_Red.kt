package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandLong
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import modtweaker2.mods.chisel.handlers.Groups
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Project_Red : Runnable {
    override fun run() {
        Groups.addGroup("ruby")
        Groups.addGroup("sapphire")
        Groups.addGroup("peridot")
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine1", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine1", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 5))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.solar_panel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.battery", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 11))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.backpack", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.barrel", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sawgold", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sawruby", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sawsapphire", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sawperidot", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.rubyboots", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.rubychestplate", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.rubyhelmet", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.rubyleggings", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sapphireboots", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sapphirechestplate", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sapphirehelmet", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sapphireleggings", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.peridotboots", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.peridotchestplate", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.peridothelmet", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.peridotleggings", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 9))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 11), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 12))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 13), null)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 14), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 41))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 42))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 43))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 40))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 57))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 58))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 55), null)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 59), null)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.jetpack", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 19))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 22))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 23))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 25))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 27))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 31))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 34))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.screwdriver", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.wiredebugger", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.datacard", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.electric_screwdriver", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 2))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 3))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 4))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 5))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 6))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 7))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 8))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 9))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 10))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 1))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 2))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 3))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 4))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 5))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 6))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 7))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 8))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routerutil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 9))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.integration.icblock", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.integration.icblock", 1))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.fabrication.icblueprint", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.fabrication.icchip", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MCFrames:mcframes.frame", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.plan", 0))

        //TODO Replace Smeltery
        //Smeltery.removeAlloy(LiquidBracketHandler.getLiquid("redmetal.molten"))
        //Smeltery.addAlloy(LiquidBracketHandler.getLiquid("redmetal.molten").withAmount(144),
        //        arrayOf(LiquidBracketHandler.getLiquid("redstone.molten").withAmount(576),
        //                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144)))

        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine1", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:brick_block", 0),
                        ItemBracketHandler.getItem("minecraft:brick_block", 0),
                        ItemBracketHandler.getItem("minecraft:brick_block", 0)),
                        arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                                OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                                OreBracketHandler.getOre("circuitBasic"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.DiamondDrillTip", 0),
                                ItemBracketHandler.getItem("IC2:blockMiningPipe", 0),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("gearSteel"), OreBracketHandler.getOre("itemCasingSteel"))),
                null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:blockbreaker", 0)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("pipeMediumTin"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("craftingPiston"),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                                OreBracketHandler.getOre("pipeMediumTin"), OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("craftingPiston"),
                                OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:blockPlacer", 0)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingAluminium"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        OreBracketHandler.getOre("itemCasingAluminium")),
                        arrayOf(OreBracketHandler.getOre("circuitGood"),
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 1),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32631)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAluminium"),
                                OreBracketHandler.getOre("craftingFilter"),
                                OreBracketHandler.getOre("itemCasingAluminium"))), null)

        //TODO Replace ("TConstruct:heavyPlate", 7)
        //MineTweakerAPI.recipes.addShaped(
        //        ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 4),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 7)),
        //                arrayOf(OreBracketHandler.getOre("circuitBasic"),
        //                        ItemBracketHandler.getItem("minecraft:flint_and_steel", 0),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
        //                        OreBracketHandler.getOre("craftingPiston"),
        //                        OreBracketHandler.getOre("itemCasingSteel"))), null)

        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 5),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                        OreBracketHandler.getOre("plateSteel")), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 11),
                        ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0)),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                                OreBracketHandler.getOre("plateSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.solar_panel", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2000)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sawgold", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 7086),
                                OreBracketHandler.getOre("stickSteel")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sawruby", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("dreamcraft:item.SawBladeRuby", 0),
                                OreBracketHandler.getOre("stickSteel")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sawsapphire", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("dreamcraft:item.SawBladeSapphire", 0),
                                OreBracketHandler.getOre("stickSteel")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sawperidot", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("dreamcraft:item.SawBladePeridot", 0),
                                OreBracketHandler.getOre("stickSteel")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.rubyboots", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateRuby"), null,
                        OreBracketHandler.getOre("plateRuby")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateRuby"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateRuby")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.rubychestplate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateRuby"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("plateRuby")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateRuby"),
                                OreBracketHandler.getOre("plateRuby"), OreBracketHandler.getOre("plateRuby")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateRuby"),
                                OreBracketHandler.getOre("plateRuby"), OreBracketHandler.getOre("plateRuby"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.rubyhelmet", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateRuby"),
                        OreBracketHandler.getOre("plateRuby"), OreBracketHandler.getOre("plateRuby")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateRuby"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateRuby")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.rubyleggings", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateRuby"),
                        OreBracketHandler.getOre("plateRuby"), OreBracketHandler.getOre("plateRuby")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateRuby"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateRuby")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateRuby"), null,
                                OreBracketHandler.getOre("plateRuby"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sapphireboots", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSapphire"), null,
                        OreBracketHandler.getOre("plateSapphire")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSapphire"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateSapphire")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sapphirechestplate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateSapphire"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("plateSapphire")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateSapphire"),
                                OreBracketHandler.getOre("plateSapphire"), OreBracketHandler.getOre("plateSapphire")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateSapphire"),
                                OreBracketHandler.getOre("plateSapphire"), OreBracketHandler.getOre("plateSapphire"))),
                null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sapphirehelmet", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSapphire"),
                        OreBracketHandler.getOre("plateSapphire"), OreBracketHandler.getOre("plateSapphire")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSapphire"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateSapphire")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.sapphireleggings", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSapphire"),
                        OreBracketHandler.getOre("plateSapphire"), OreBracketHandler.getOre("plateSapphire")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSapphire"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateSapphire")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSapphire"), null,
                                OreBracketHandler.getOre("plateSapphire"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.peridotboots", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("platePeridot"), null,
                        OreBracketHandler.getOre("platePeridot")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("platePeridot"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("platePeridot")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.peridotchestplate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("platePeridot"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("platePeridot")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("platePeridot"),
                                OreBracketHandler.getOre("platePeridot"), OreBracketHandler.getOre("platePeridot")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("platePeridot"),
                                OreBracketHandler.getOre("platePeridot"), OreBracketHandler.getOre("platePeridot"))),
                null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.peridothelmet", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("platePeridot"),
                        OreBracketHandler.getOre("platePeridot"), OreBracketHandler.getOre("platePeridot")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("platePeridot"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("platePeridot")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.peridotleggings", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("platePeridot"),
                        OreBracketHandler.getOre("platePeridot"), OreBracketHandler.getOre("platePeridot")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("platePeridot"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("platePeridot")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("platePeridot"), null,
                                OreBracketHandler.getOre("platePeridot"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                arrayOf(arrayOf(OreBracketHandler.getOre("wireGt01Gold"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("wireGt01Gold"),
                                OreBracketHandler.getOre("circuitPrimitive"), OreBracketHandler.getOre("wireGt01Gold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.screwdriver", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolFile"),
                        OreBracketHandler.getOre("stickSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickAnyRubber"),
                                OreBracketHandler.getOre("stickSteel"),
                                OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickAnyRubber"),
                                OreBracketHandler.getOre("stickAnyRubber"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.wiredebugger", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("wireGt01RedAlloy"),
                        OreBracketHandler.getOre("stickSteelMagnetic"), OreBracketHandler.getOre("wireGt01RedAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingSteel"),
                                OreBracketHandler.getOre("plateGlowstone"),
                                OreBracketHandler.getOre("itemCasingSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0),
                        OreBracketHandler.getOre("plateAnyRubber")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 1),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeWhite")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 1)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 2),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeOrange")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 2)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 3),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeMagenta")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 3)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 4),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeLightBlue")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 4)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 5),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeYellow")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 5)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 6),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeLime")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 6)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 7),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyePink")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 7)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 8),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeGray")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 8)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 9),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeLightGray")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 9)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 10),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeCyan")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 10)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 11),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyePurple")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 11)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 12),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeBlue")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 12)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 13),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeBrown")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 13)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 14),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeGreen")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 14)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 15),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                        OreBracketHandler.getOre("dyeRed")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 15)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 18),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeWhite")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 18)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 19),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeOrange")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 19)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 20),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeMagenta")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 20)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 21),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeLightBlue")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 21)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 22),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeYellow")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 22)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 23),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeLime")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 23)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 24),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyePink")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 24)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 25),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeGray")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 25)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 26),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeLightGray")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 26)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 27),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeCyan")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 27)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 28),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyePurple")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 28)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 29),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeBlue")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 29)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 30),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeBrown")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 30)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 31),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeGreen")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 31)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 32),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeRed")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 32)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 33),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                        OreBracketHandler.getOre("dyeBlack")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 33)), null)

        //TODO Replace ("TConstruct:GlassPane", 0)
        //MineTweakerAPI.recipes.addShaped(
        //        ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolFile"), null),
        //                arrayOf(OreBracketHandler.getOre("stickLongIron"),
        //                        ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                        OreBracketHandler.getOre("stickLongIron")),
        //                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSaw"), null)), null)

        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolFile"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickLongIron"),
                                OreBracketHandler.getOre("paneGlass"), OreBracketHandler.getOre("stickLongIron")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSaw"), null)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1).amount(4),
                arrayOf(arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 13),
                        ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0)),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33),
                                OreBracketHandler.getOre("plateDiamond"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32)),
                        arrayOf<IIngredient>(
                                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 13),
                                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe",
                                        0))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                        OreBracketHandler.getOre("wireGt01RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20)),
                        arrayOf(OreBracketHandler.getOre("plateCopper"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                                OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                        OreBracketHandler.getOre("wireGt01RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28)),
                        arrayOf(OreBracketHandler.getOre("plateBronze"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                                OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32),
                        OreBracketHandler.getOre("wireGt01RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32)),
                        arrayOf(OreBracketHandler.getOre("plateIron"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32),
                                OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 3),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                        OreBracketHandler.getOre("wireGt01RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26)),
                        arrayOf(OreBracketHandler.getOre("plateTin"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                                OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28),
                        OreBracketHandler.getOre("wireGt01RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28)),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28),
                                OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 5),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21),
                        OreBracketHandler.getOre("wireGt02RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21)),
                        arrayOf(OreBracketHandler.getOre("plateGold"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitGood")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21),
                                OreBracketHandler.getOre("wireGt02RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 6),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                        OreBracketHandler.getOre("wireGt02RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30)),
                        arrayOf(OreBracketHandler.getOre("plateDiamond"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitGood")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                                OreBracketHandler.getOre("wireGt02RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 7),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24),
                        OreBracketHandler.getOre("wireGt02RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24)),
                        arrayOf(OreBracketHandler.getOre("plateGlowstone"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitGood")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24),
                                OreBracketHandler.getOre("wireGt02RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 8),
                arrayOf(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33),
                        OreBracketHandler.getOre("wireGt02RedAlloy"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33)),
                        arrayOf(OreBracketHandler.getOre("plateRedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                                OreBracketHandler.getOre("circuitGood")),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33),
                                OreBracketHandler.getOre("wireGt02RedAlloy"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33))), null)
        val recipes = MineTweakerAPI.recipes
        val item = ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routerutil", 0)
        val array = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("wireGt01RedAlloy"),
                OreBracketHandler.getOre("itemCasingSteel"), OreBracketHandler.getOre("wireGt01RedAlloy")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateEmerald"),
                        OreBracketHandler.getOre("circuitGood")), null)
        val n = 2
        val array2 = arrayOf<IIngredient?>(OreBracketHandler.getOre("itemCasingSteel"), null, null)
        val n2 = 1
        val item2 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32510)
        val hashMap = HashMap<String, IData>()
        hashMap["GT.ItemCharge"] = ExpandLong.asData(18000L)
        array2[n2] = item2.withTag(ExpandAnyDict.asData(hashMap))
        array2[2] = OreBracketHandler.getOre("itemCasingSteel")
        array[n] = array2
        recipes.addShaped(item, array, null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.jetpack", 6400),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("circuitBasic"),
                        OreBracketHandler.getOre("wireGt04Gold"), OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                                ItemBracketHandler.getItem("minecraft:diamond_chestplate", 0),
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0)),
                        arrayOf(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                                OreBracketHandler.getOre("plateGlowstone"),
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0))),
                null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 6),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("wireGt04Copper"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("wireGt04Copper")),
                        arrayOf<IIngredient>(
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 11),
                                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0)),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 16),
                                OreBracketHandler.getOre("circuitBasic"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 8),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("circuitBasic"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 16),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 11),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 16)),
                        arrayOf(OreBracketHandler.getOre("wireGt04Copper"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("wireGt04Copper"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 9),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 59),
                        OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 16),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4401),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 16)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 18),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 59),
                                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 18))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.integration.icblock", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("BuildCraft|Factory:autoWorkbenchBlock", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.integration.icblock", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"),
                        OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("blockGlass")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateObsidian"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("plateObsidian")),
                        arrayOf(OreBracketHandler.getOre("stickSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 321),
                                OreBracketHandler.getOre("stickSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("MCFrames:mcframes.frame", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 10),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:factory2", 2)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 11),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:autoWorkbenchBlock", 0)), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.fabrication.icchip", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateNeutronium"),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("plateNeutronium"),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("plateNeutronium"),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("plateNeutronium"),
                        OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("plateNeutronium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("plateNeutronium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitUltimate"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("plateNeutronium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                OreBracketHandler.getOre("circuitInfinite"),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                OreBracketHandler.getOre("circuitUltimate"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("plateNeutronium")),
                        arrayOf(OreBracketHandler.getOre("plateNeutronium"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitInfinite"),
                                ItemBracketHandler.getItem("OpenComputers:item", 43),
                                OreBracketHandler.getOre("circuitInfinite"),
                                OreBracketHandler.getOre("circuitUltimate"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("plateNeutronium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                OreBracketHandler.getOre("circuitInfinite"),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                OreBracketHandler.getOre("circuitUltimate"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("plateNeutronium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("circuitUltimate"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("plateNeutronium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("plateNeutronium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("plateNeutronium"),
                                OreBracketHandler.getOre("plateNeutronium"))))
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 1),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 2),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 1),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 2),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 1),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2000), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 3),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 1),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 4),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 1),
                ItemBracketHandler.getItem("minecraft:redstone", 0).amount(3), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 5),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 1),
                ItemBracketHandler.getItem("minecraft:redstone_torch", 0), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 6),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24502), 500, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 6),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24512), 500, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 9),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 2).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23874).amount(4), 300, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.datacard", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 20879),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, VoltageLevels.LLV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.electric_screwdriver", 0),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.screwdriver", 0),
                ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.battery", 0), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880).amount(5), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17635).amount(5), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17471).amount(5), 300, VoltageLevels.LV)

        //TODO Replace ("TConstruct:GlassPane", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
        //        ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22032).amount(2), 100, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
                ItemBracketHandler.getItem("minecraft:glass_pane", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22032).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1).amount(4),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(
                        4), ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 13).amount(2),
                        OreBracketHandler.getOre("plateDiamond")), null, 800, 30)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 2),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086).amount(4),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 4),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(864), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 6),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1),
                ItemBracketHandler.getItem("minecraft:magma_cream", 0).amount(4),
                LiquidBracketHandler.getLiquid("lava").withAmount(4000), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 7),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 8),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 7),
                OreBracketHandler.getOre("plateObsidian"), 300, VoltageLevels.LV)

        //TODO Replace ("StevesCarts:ModuleComponents", 60)
        //Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 9),
        //        ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
        //        ItemBracketHandler.getItem("StevesCarts:ModuleComponents", 60), 200, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 10),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17299).amount(4), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.fabrication.icchip", 0),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Fabrication:projectred.fabrication.icblueprint", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32711),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526).amount(4),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.plan", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18879),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 100, VoltageLevels.ULV)
        CircuitAssembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44).amount(4),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0).amount(4),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("wireGt01Gold").amount(6)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 600, VoltageLevels.LV)
        CircuitAssembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44).amount(4),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0).amount(4),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("wireGt01Gold").amount(6)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 600, VoltageLevels.LV)
        CircuitAssembler.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44).amount(4),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0).amount(4),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("wireGt01Gold").amount(6)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 600, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 0),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateCopper"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20).amount(2)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 0),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateCopper"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20).amount(2)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 0),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateCopper"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20).amount(2)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 1),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateBronze"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 1),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateBronze"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 1),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateBronze"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 2),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32).amount(2)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 2),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32).amount(2)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 2),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32).amount(2)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 3),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateTin"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 3),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateTin"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 3),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateTin"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 4),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28).amount(2)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 4),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28).amount(2)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 4),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28).amount(2)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 5),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateGold"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21).amount(2)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 5),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateGold"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21).amount(2)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 5),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateGold"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21).amount(2)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 6),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30).amount(2)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 6),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30).amount(2)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 6),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30).amount(2)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 7),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateGlowstone"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24).amount(2)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 7),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateGlowstone"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24).amount(2)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 7),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateGlowstone"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24).amount(2)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 8),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateRedAlloy"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33).amount(2)),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(144), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 8),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateRedAlloy"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33).amount(2)),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(72), 900, VoltageLevels.LV)
        CircuitAssembler.addRecipe(
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.routingchip", 8),
                arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 44),
                        OreBracketHandler.getOre("circuitGood"), OreBracketHandler.getOre("plateRedAlloy"),
                        OreBracketHandler.getOre("wireGt01RedAlloy").amount(2),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33).amount(2)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36), 900, VoltageLevels.LV)
        Canner.addRecipe(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.emptybattery", 0),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32500), 100, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 15).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyered").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 14).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegreen").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 13).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyebrown").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 12).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblue").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 11).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepurple").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 10).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyecyan").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 9).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightgray").withAmount(144), intArrayOf(10000), 200,
                2)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 8).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegray").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 7).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepink").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 6).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelime").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 5).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeyellow").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 4).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightblue").withAmount(144), intArrayOf(10000), 200,
                2)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 3).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyemagenta").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 2).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeorange").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 1).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyewhite").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 33).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblack").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 32).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyered").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 31).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegreen").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 30).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyebrown").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 29).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblue").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 28).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepurple").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 27).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyecyan").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 26).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightgray").withAmount(288), intArrayOf(10000), 200,
                2)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 25).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegray").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 24).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepink").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 23).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelime").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 22).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeyellow").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 21).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightblue").withAmount(288), intArrayOf(10000), 200,
                2)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 20).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyemagenta").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 19).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeorange").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        ChemicalBath.addRecipe(
                arrayOf(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 18).amount(8)),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17).amount(8),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyewhite").withAmount(288), intArrayOf(10000), 200, VoltageLevels.LULV)
        Compressor.addRecipe(ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2812).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 55),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 57))
        FormingPress.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 7),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 13), 600, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 8),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 0),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 14), 600, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 12),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2020),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0), 200, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 13),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 42),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0), 600, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 14),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 43),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0), 600, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 59),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 58),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0), 600, VoltageLevels.LV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56).amount(9)),
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 11), intArrayOf(10000),
                300, 2)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 42),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 12),
                        ItemBracketHandler.getItem("minecraft:redstone", 0).amount(8)), 400, VoltageLevels.LV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 43),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2020),
                        ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(8)), 400, VoltageLevels.LV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 58),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2020),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56).amount(8)), 400, VoltageLevels.LV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 57),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56).amount(8)), 400, VoltageLevels.LV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 19),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 15).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 19),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 8).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 19),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ExtraBees:misc", 23).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 19),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 77).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 19),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 19),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 0).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 14).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32428).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 1).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 20),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 51).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 13).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 40).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 2).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 21),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32427).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 22),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 12).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 22),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 22).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 22),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 3).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 22),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32426).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 23),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 11).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 23),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ExtraBees:misc", 20).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 23),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 78).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 23),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 4).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 23),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32425).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 10).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 38).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 5).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32424).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 25),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 9).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 25),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 29).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 25),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 6).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 25),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32423).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 8).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 10).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32422).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 26),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 7).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 27),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 7).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 27),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 8).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 27),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32421).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 27),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 35).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 6).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 8).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32420).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 28),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 9).amount(2)),
                50, 8)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 5).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 20).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 10).amount(
                                2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 29),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32419).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 4).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 5).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ExtraBees:misc", 21).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 24).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 11).amount(
                                2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32410).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 31),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 6).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 31),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ExtraBees:misc", 25).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 31),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 3).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 31),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 65).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 31),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 31),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 12).amount(
                                2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 2).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 7).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ExtraBees:misc", 22).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 28).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 13).amount(
                                2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 32),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32416).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 1).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ExtraBees:misc", 19).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 59).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 14).amount(
                                2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 33),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32415).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 34),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("minecraft:dye", 0).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 34),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 9).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 34),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ExtraBees:misc", 24).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 34),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("Botany:pigment", 1).amount(2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 34),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.lilyseed", 15).amount(
                                2)), 50, VoltageLevels.ULV)
        Mixer.addRecipe(ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 34),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414).amount(2)), 50, VoltageLevels.ULV)
        Packer.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880), 100, VoltageLevels.ULV)
        Packer.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17635), 100, VoltageLevels.ULV)
        Packer.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17471), 100, VoltageLevels.ULV)
        Packer.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 34),
                ItemBracketHandler.getItem("dreamcraft:item.ElectrotineWire", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880), 100, VoltageLevels.ULV)
        Packer.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 34),
                ItemBracketHandler.getItem("dreamcraft:item.ElectrotineWire", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17635), 100, VoltageLevels.ULV)
        Packer.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 34),
                ItemBracketHandler.getItem("dreamcraft:item.ElectrotineWire", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17471), 100, VoltageLevels.ULV)
        Unpacker.addRecipe(ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 16), 100, VoltageLevels.ULV)
        Unpacker.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ElectrotineWire", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880),
                ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 34), 100, VoltageLevels.ULV)
        Groups.addVariation("ruby", ItemBracketHandler.getItem("BiomesOPlenty:gemOre", 3))
        Groups.addVariation("ruby", ItemBracketHandler.getItem("gregtech:gt.blockgem1", 9))
        Groups.addVariation("ruby", ItemBracketHandler.getItem("gregtech:gt.blockgem2", 11))
        Groups.addVariation("ruby", ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 5))
        Groups.addVariation("sapphire", ItemBracketHandler.getItem("BiomesOPlenty:gemOre", 13))
        Groups.addVariation("sapphire", ItemBracketHandler.getItem("gregtech:gt.blockgem2", 12))
        Groups.addVariation("sapphire",
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 6))
        Groups.addVariation("peridot", ItemBracketHandler.getItem("BiomesOPlenty:gemOre", 5))
        Groups.addVariation("peridot", ItemBracketHandler.getItem("gregtech:gt.blockgem2", 4))
        Groups.addVariation("peridot",
                ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 7))
    }
}