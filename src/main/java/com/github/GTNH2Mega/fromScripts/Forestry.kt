package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.Fuels
import gttweaker.mods.gregtech.machines.AlloySmelter
import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.FluidSolidifier
import gttweaker.mods.gregtech.machines.FormingPress
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.SemiFluidGenerator
import minetweaker.mods.nei.NEI
import modtweaker2.mods.forestry.handlers.Carpenter
import modtweaker2.mods.forestry.handlers.Centrifuge
import modtweaker2.mods.forestry.handlers.Fermenter
import modtweaker2.mods.forestry.handlers.ThermionicFabricator
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class Forestry : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:sturdyMachine", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:hardenedMachine", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:core", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory2", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:factory2", 2))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:core", 1), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:mail", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:mail", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:mulch", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:engine", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:ffarm", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:ffarm", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:ffarm", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:ffarm", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:ffarm", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:bronzePickaxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:kitPickaxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:bronzeShovel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:kitShovel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:infuser", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:canEmpty", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:waxCapsule", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:refractoryEmpty", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:gearBronze", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:gearCopper", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:gearTin", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:stamps", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:stamps", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:stamps", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:stamps", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:stamps", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:stamps", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:stamps", 6))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:stamps", 4), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:stamps", 5), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:stamps", 6), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:wrench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:pipette", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:naturalistHelmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:soil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:soil", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:craftingMaterial", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:fertilizerBio", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:iodineCapsule", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:craftingMaterial", 4), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:craftingMaterial", 6), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:bituminousPeat", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2530), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8530), null, false)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:chipsets", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:chipsets", 1), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:chipsets", 2), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:chipsets", 3), null)
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 0))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 3))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 5))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 6))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 7))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 8))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 9))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 10))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        ThermionicFabricator.removeCasts(ItemBracketHandler.getItem("Forestry:thermionicTubes", 12))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:carton", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:kitShovel", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:kitPickaxe", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:woodPulp", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:habitatLocator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:scoop", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:solderingIron", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:oakStick", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:frameUntreated", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:frameImpregnated", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:waxCast", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:apiaristHelmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:apiaristChest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:apiaristLegs", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:apiaristBoots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:candle", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:candle", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:honeyedSlice", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:ambrosia", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:honeyPot", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:stamps", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:stamps", 1), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:stamps", 2), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:stamps", 3), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:letters", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:fencesFireproof", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:catalogue", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:crate", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("minecraft:torch", 0), null)
        Centrifuge.removeRecipe(ItemBracketHandler.getItem("Forestry:beeCombs", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:apiaristBag", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:lepidopteristBag", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:minerBag", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:minerBagT2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:diggerBag", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:diggerBagT2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:foresterBag", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:foresterBagT2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:hunterBag", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:hunterBagT2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:adventurerBag", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:adventurerBagT2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:builderBag", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:builderBagT2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:apiculture", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:apiculture", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:apicultureChest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:alveary", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:alveary", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:alveary", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:alveary", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:alveary", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:alveary", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:alveary", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:arboriculture", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:lepidopterology", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:beealyzer", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:treealyzer", 0), null)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Forestry:flutterlyzer", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:fences", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Forestry:cart.beehouse", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingBronze"),
                        OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("itemCasingBronze")),
                        arrayOf(OreBracketHandler.getOre("screwSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                                OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingBronze"),
                                OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("itemCasingBronze"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:core", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:treealyzer", 0),
                        ItemBracketHandler.getItem("Forestry:beealyzer", 0),
                        ItemBracketHandler.getItem("Forestry:flutterlyzer", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("circuitBasic"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("plateCupronickel")),
                        arrayOf(OreBracketHandler.getOre("ringAnyRubber"),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                OreBracketHandler.getOre("ringAnyRubber")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("plateCupronickel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("plateCupronickel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21057),
                        OreBracketHandler.getOre("plateCupronickel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory", 4),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("plateCupronickel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21057),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21057)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory", 5),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("plateCupronickel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory", 6),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        OreBracketHandler.getOre("plateCupronickel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory", 7),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32691),
                        OreBracketHandler.getOre("plateCupronickel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32641),
                                ItemBracketHandler.getItem("Forestry:hardenedMachine", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32641)),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallAluminium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32681),
                                OreBracketHandler.getOre("gearGtSmallAluminium"))), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305)),
                ItemBracketHandler.getItem("Forestry:factory2", 2), ItemBracketHandler.getItem("Forestry:factory2", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory2", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("ringIron"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("ringIron"), OreBracketHandler.getOre("plateIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory2", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwIron"),
                        ItemBracketHandler.getItem("minecraft:bookshelf", 0), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                                ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(OreBracketHandler.getOre("screwIron"), ItemBracketHandler.getItem("minecraft:chest", 0),
                                OreBracketHandler.getOre("screwIron"))), null)

        //TODO Replace ("TConstruct:CraftingStation", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:factory2", 2),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("screwIron"),
        //                ItemBracketHandler.getItem("minecraft:bookshelf", 0), OreBracketHandler.getOre("screwIron")),
        //                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
        //                        ItemBracketHandler.getItem("TConstruct:CraftingStation", 0),
        //                        OreBracketHandler.getOre("craftingToolScrewdriver")),
        //                arrayOf(OreBracketHandler.getOre("screwIron"), ItemBracketHandler.getItem("minecraft:chest", 0),
        //                        OreBracketHandler.getOre("screwIron"))), null)

        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("minecraft:wooden_slab", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:wooden_slab", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:wooden_slab", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:fence", 0), null,
                        ItemBracketHandler.getItem("minecraft:fence", 0)), null,
                ItemBracketHandler.getItem("Forestry:core", 1))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:mail", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateIron"),
                        ItemBracketHandler.getItem("minecraft:iron_bars", 0), OreBracketHandler.getOre("plateIron")),
                        arrayOf(OreBracketHandler.getOre("dyeBlue"), ItemBracketHandler.getItem("IC2:blockMachine", 0),
                                OreBracketHandler.getOre("dyeBlue")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtSmallBronze"),
                                OreBracketHandler.getOre("chestWood"), OreBracketHandler.getOre("gearGtSmallBronze"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:mail", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 9),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 9)),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                                OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtSmallSteel"),
                                OreBracketHandler.getOre("circuitBasic"),
                                OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:engine", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateCupronickel"),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        OreBracketHandler.getOre("plateCupronickel")), arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                        OreBracketHandler.getOre("circuitBasic")), arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("gearGtSmallSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiculture", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WoodenCasing", 0),
                                ItemBracketHandler.getItem("Forestry:frameUntreated", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("beeComb"), OreBracketHandler.getOre("slabWood"),
                                OreBracketHandler.getOre("beeComb"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiculture", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WoodenCasing", 0),
                                ItemBracketHandler.getItem("Forestry:frameUntreated", 0)),
                        arrayOf(ItemBracketHandler.getItem("MagicBees:comb", 1), OreBracketHandler.getOre("slabWood"),
                                ItemBracketHandler.getItem("MagicBees:comb", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiculture", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WoodenCasing", 0),
                                ItemBracketHandler.getItem("Forestry:frameUntreated", 0)),
                        arrayOf(ItemBracketHandler.getItem("MagicBees:comb", 2), OreBracketHandler.getOre("slabWood"),
                                ItemBracketHandler.getItem("MagicBees:comb", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiculture", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WoodenCasing", 0),
                                ItemBracketHandler.getItem("Forestry:frameUntreated", 0)),
                        arrayOf(ItemBracketHandler.getItem("MagicBees:comb", 3), OreBracketHandler.getOre("slabWood"),
                                ItemBracketHandler.getItem("MagicBees:comb", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiculture", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WoodenCasing", 0),
                                ItemBracketHandler.getItem("Forestry:frameUntreated", 0)),
                        arrayOf(ItemBracketHandler.getItem("MagicBees:comb", 4), OreBracketHandler.getOre("slabWood"),
                                ItemBracketHandler.getItem("MagicBees:comb", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiculture", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WoodenCasing", 0),
                                ItemBracketHandler.getItem("Forestry:frameUntreated", 0)),
                        arrayOf(ItemBracketHandler.getItem("MagicBees:comb", 5), OreBracketHandler.getOre("slabWood"),
                                ItemBracketHandler.getItem("MagicBees:comb", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiculture", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WoodenCasing", 0),
                                ItemBracketHandler.getItem("Forestry:frameUntreated", 0)),
                        arrayOf(ItemBracketHandler.getItem("MagicBees:comb", 6), OreBracketHandler.getOre("slabWood"),
                                ItemBracketHandler.getItem("MagicBees:comb", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiculture", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WoodenCasing", 0),
                                ItemBracketHandler.getItem("Forestry:frameUntreated", 0)),
                        arrayOf(ItemBracketHandler.getItem("computronics:computronics.partsForestry", 0),
                                OreBracketHandler.getOre("slabWood"),
                                ItemBracketHandler.getItem("computronics:computronics.partsForestry", 0))), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("minecraft:wooden_slab", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                        ItemBracketHandler.getItem("Forestry:beeCombs", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                        ItemBracketHandler.getItem("minecraft:fence", 0),
                        ItemBracketHandler.getItem("minecraft:wooden_slab", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:fence", 0)),
                ItemBracketHandler.getItem("Forestry:apiculture", 2),
                ItemBracketHandler.getItem("Forestry:apiculture", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:beeCombs", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:beeCombs", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:beeCombs", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403)),
                ItemBracketHandler.getItem("minecraft:chest", 0),
                ItemBracketHandler.getItem("Forestry:apicultureChest", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:beeCombs", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:beeCombs", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:beeCombs", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("Forestry:crate", 0)),
                ItemBracketHandler.getItem("minecraft:chest", 0),
                ItemBracketHandler.getItem("Forestry:apicultureChest", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403)),
                ItemBracketHandler.getItem("minecraft:chest", 0),
                ItemBracketHandler.getItem("Forestry:arboriculture", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("minecraft:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("Forestry:crate", 0)),
                ItemBracketHandler.getItem("minecraft:chest", 0),
                ItemBracketHandler.getItem("Forestry:arboriculture", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403)),
                ItemBracketHandler.getItem("minecraft:chest", 0),
                ItemBracketHandler.getItem("Forestry:arboriculture", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("minecraft:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:sapling", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("Forestry:crate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("Forestry:crate", 0)),
                ItemBracketHandler.getItem("minecraft:chest", 0),
                ItemBracketHandler.getItem("Forestry:arboriculture", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:butterflyGE", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:butterflyGE", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:butterflyGE", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32403)),
                ItemBracketHandler.getItem("minecraft:chest", 0),
                ItemBracketHandler.getItem("Forestry:lepidopterology", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29351),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 5),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:frameProven", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29351),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 5)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("Forestry:alveary", 2))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21300),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 11)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("Forestry:alveary", 3))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 7),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 7),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 7)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("Forestry:alveary", 4))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:alveary", 5),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 6),
                        OreBracketHandler.getOre("circuitGood"),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5142),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 6),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("Forestry:thermionicTubes", 6))),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(5000), 60,
                ItemBracketHandler.getItem("Forestry:alveary", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzPlate", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32729),
                        ItemBracketHandler.getItem("Forestry:beealyzer", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32729),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzPlate", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("Forestry:alveary", 6))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 9),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 9),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:pollenFertile", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 9),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 9)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("Forestry:alveary", 7))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:beealyzer", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18057),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18057),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18057)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18057),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 60,
                ItemBracketHandler.getItem("dreamcraft:item.Display", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:beealyzer", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:beealyzer", 0)), null)
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:treealyzer", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 60,
                ItemBracketHandler.getItem("dreamcraft:item.Display", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:treealyzer", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:treealyzer", 0)), null)
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:flutterlyzer", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18300),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18300)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18300),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 60,
                ItemBracketHandler.getItem("dreamcraft:item.Display", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:flutterlyzer", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:flutterlyzer", 0)), null)
        val n = 20
        val withAmount = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item = ItemBracketHandler.getItem("minecraft:stonebrick", 0)
        val item2 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["FarmBlock"] = ExpandInt.toData(0)
        Carpenter.addRecipe(n, withAmount, array, item, item2.withTag(ExpandAnyDict.asData(hashMap)).amount(4))
        val n2 = 20
        val withAmount2 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array2 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val amount = ItemBracketHandler.getItem("minecraft:stonebrick", 1).amount(4)
        val item3 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["FarmBlock"] = ExpandInt.toData(1)
        Carpenter.addRecipe(n2, withAmount2, array2, amount, item3.withTag(ExpandAnyDict.asData(hashMap2)).amount(4))
        val n3 = 20
        val withAmount3 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array3 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item4 = ItemBracketHandler.getItem("minecraft:stonebrick", 2)
        val item5 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["FarmBlock"] = ExpandInt.toData(2)
        Carpenter.addRecipe(n3, withAmount3, array3, item4, item5.withTag(ExpandAnyDict.asData(hashMap3)).amount(4))
        val n4 = 20
        val withAmount4 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array4 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item6 = ItemBracketHandler.getItem("minecraft:brick_block", 0)
        val item7 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["FarmBlock"] = ExpandInt.toData(3)
        Carpenter.addRecipe(n4, withAmount4, array4, item6, item7.withTag(ExpandAnyDict.asData(hashMap4)).amount(4))
        val n5 = 20
        val withAmount5 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array5 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item8 = ItemBracketHandler.getItem("minecraft:sandstone", 2)
        val item9 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["FarmBlock"] = ExpandInt.toData(4)
        Carpenter.addRecipe(n5, withAmount5, array5, item8, item9.withTag(ExpandAnyDict.asData(hashMap5)).amount(4))
        val n6 = 20
        val withAmount6 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array6 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item10 = ItemBracketHandler.getItem("minecraft:sandstone", 1)
        val item11 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["FarmBlock"] = ExpandInt.toData(5)
        Carpenter.addRecipe(n6, withAmount6, array6, item10, item11.withTag(ExpandAnyDict.asData(hashMap6)).amount(4))
        val n7 = 20
        val withAmount7 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array7 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item12 = ItemBracketHandler.getItem("minecraft:nether_brick", 0)
        val item13 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap7 = HashMap<String, IData>()
        hashMap7["FarmBlock"] = ExpandInt.toData(6)
        Carpenter.addRecipe(n7, withAmount7, array7, item12, item13.withTag(ExpandAnyDict.asData(hashMap7)).amount(4))
        val n8 = 20
        val withAmount8 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array8 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item14 = ItemBracketHandler.getItem("minecraft:stonebrick", 3)
        val item15 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap8 = HashMap<String, IData>()
        hashMap8["FarmBlock"] = ExpandInt.toData(7)
        Carpenter.addRecipe(n8, withAmount8, array8, item14, item15.withTag(ExpandAnyDict.asData(hashMap8)).amount(4))
        val n9 = 20
        val withAmount9 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array9 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item16 = ItemBracketHandler.getItem("minecraft:quartz_block", 0)
        val item17 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap9 = HashMap<String, IData>()
        hashMap9["FarmBlock"] = ExpandInt.toData(8)
        Carpenter.addRecipe(n9, withAmount9, array9, item16, item17.withTag(ExpandAnyDict.asData(hashMap9)).amount(4))
        val n10 = 20
        val withAmount10 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array10 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item18 = ItemBracketHandler.getItem("minecraft:quartz_block", 1)
        val item19 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap10 = HashMap<String, IData>()
        hashMap10["FarmBlock"] = ExpandInt.toData(9)
        Carpenter.addRecipe(n10, withAmount10, array10, item18,
                item19.withTag(ExpandAnyDict.asData(hashMap10)).amount(4))
        val n11 = 20
        val withAmount11 = LiquidBracketHandler.getLiquid("creosote").withAmount(500)
        val array11 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18035),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))
        val item20 = ItemBracketHandler.getItem("minecraft:quartz_block", 2)
        val item21 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap11 = HashMap<String, IData>()
        hashMap11["FarmBlock"] = ExpandInt.toData(10)
        Carpenter.addRecipe(n11, withAmount11, array11, item20,
                item21.withTag(ExpandAnyDict.asData(hashMap11)).amount(4))
        val n12 = 60
        val withAmount12 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array12 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item22 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap12 = HashMap<String, IData>()
        hashMap12["FarmBlock"] = ExpandInt.toData(0)
        val withTag = item22.withTag(ExpandAnyDict.asData(hashMap12))
        val item23 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap13 = HashMap<String, IData>()
        hashMap13["FarmBlock"] = ExpandInt.toData(0)
        Carpenter.addRecipe(n12, withAmount12, array12, withTag,
                item23.withTag(ExpandAnyDict.asData(hashMap13)).amount(2))
        val n13 = 60
        val withAmount13 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array13 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item24 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap14 = HashMap<String, IData>()
        hashMap14["FarmBlock"] = ExpandInt.toData(1)
        val withTag2 = item24.withTag(ExpandAnyDict.asData(hashMap14))
        val item25 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap15 = HashMap<String, IData>()
        hashMap15["FarmBlock"] = ExpandInt.toData(1)
        Carpenter.addRecipe(n13, withAmount13, array13, withTag2,
                item25.withTag(ExpandAnyDict.asData(hashMap15)).amount(2))
        val n14 = 60
        val withAmount14 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array14 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item26 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap16 = HashMap<String, IData>()
        hashMap16["FarmBlock"] = ExpandInt.toData(2)
        val withTag3 = item26.withTag(ExpandAnyDict.asData(hashMap16))
        val item27 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap17 = HashMap<String, IData>()
        hashMap17["FarmBlock"] = ExpandInt.toData(2)
        Carpenter.addRecipe(n14, withAmount14, array14, withTag3,
                item27.withTag(ExpandAnyDict.asData(hashMap17)).amount(2))
        val n15 = 60
        val withAmount15 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array15 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item28 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap18 = HashMap<String, IData>()
        hashMap18["FarmBlock"] = ExpandInt.toData(3)
        val withTag4 = item28.withTag(ExpandAnyDict.asData(hashMap18))
        val item29 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap19 = HashMap<String, IData>()
        hashMap19["FarmBlock"] = ExpandInt.toData(3)
        Carpenter.addRecipe(n15, withAmount15, array15, withTag4,
                item29.withTag(ExpandAnyDict.asData(hashMap19)).amount(2))
        val n16 = 60
        val withAmount16 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array16 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item30 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap20 = HashMap<String, IData>()
        hashMap20["FarmBlock"] = ExpandInt.toData(4)
        val withTag5 = item30.withTag(ExpandAnyDict.asData(hashMap20))
        val item31 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap21 = HashMap<String, IData>()
        hashMap21["FarmBlock"] = ExpandInt.toData(4)
        Carpenter.addRecipe(n16, withAmount16, array16, withTag5,
                item31.withTag(ExpandAnyDict.asData(hashMap21)).amount(2))
        val n17 = 60
        val withAmount17 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array17 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item32 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap22 = HashMap<String, IData>()
        hashMap22["FarmBlock"] = ExpandInt.toData(5)
        val withTag6 = item32.withTag(ExpandAnyDict.asData(hashMap22))
        val item33 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap23 = HashMap<String, IData>()
        hashMap23["FarmBlock"] = ExpandInt.toData(5)
        Carpenter.addRecipe(n17, withAmount17, array17, withTag6,
                item33.withTag(ExpandAnyDict.asData(hashMap23)).amount(2))
        val n18 = 60
        val withAmount18 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array18 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item34 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap24 = HashMap<String, IData>()
        hashMap24["FarmBlock"] = ExpandInt.toData(6)
        val withTag7 = item34.withTag(ExpandAnyDict.asData(hashMap24))
        val item35 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap25 = HashMap<String, IData>()
        hashMap25["FarmBlock"] = ExpandInt.toData(6)
        Carpenter.addRecipe(n18, withAmount18, array18, withTag7,
                item35.withTag(ExpandAnyDict.asData(hashMap25)).amount(2))
        val n19 = 60
        val withAmount19 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array19 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item36 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap26 = HashMap<String, IData>()
        hashMap26["FarmBlock"] = ExpandInt.toData(7)
        val withTag8 = item36.withTag(ExpandAnyDict.asData(hashMap26))
        val item37 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap27 = HashMap<String, IData>()
        hashMap27["FarmBlock"] = ExpandInt.toData(7)
        Carpenter.addRecipe(n19, withAmount19, array19, withTag8,
                item37.withTag(ExpandAnyDict.asData(hashMap27)).amount(2))
        val n20 = 60
        val withAmount20 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array20 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item38 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap28 = HashMap<String, IData>()
        hashMap28["FarmBlock"] = ExpandInt.toData(8)
        val withTag9 = item38.withTag(ExpandAnyDict.asData(hashMap28))
        val item39 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap29 = HashMap<String, IData>()
        hashMap29["FarmBlock"] = ExpandInt.toData(8)
        Carpenter.addRecipe(n20, withAmount20, array20, withTag9,
                item39.withTag(ExpandAnyDict.asData(hashMap29)).amount(2))
        val n21 = 60
        val withAmount21 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array21 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item40 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap30 = HashMap<String, IData>()
        hashMap30["FarmBlock"] = ExpandInt.toData(9)
        val withTag10 = item40.withTag(ExpandAnyDict.asData(hashMap30))
        val item41 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap31 = HashMap<String, IData>()
        hashMap31["FarmBlock"] = ExpandInt.toData(9)
        Carpenter.addRecipe(n21, withAmount21, array21, withTag10,
                item41.withTag(ExpandAnyDict.asData(hashMap31)).amount(2))
        val n22 = 60
        val withAmount22 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array22 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2))
        val item42 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap32 = HashMap<String, IData>()
        hashMap32["FarmBlock"] = ExpandInt.toData(10)
        val withTag11 = item42.withTag(ExpandAnyDict.asData(hashMap32))
        val item43 = ItemBracketHandler.getItem("Forestry:ffarm", 2)
        val hashMap33 = HashMap<String, IData>()
        hashMap33["FarmBlock"] = ExpandInt.toData(10)
        Carpenter.addRecipe(n22, withAmount22, array22, withTag11,
                item43.withTag(ExpandAnyDict.asData(hashMap33)).amount(2))
        val n23 = 60
        val withAmount23 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array23 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item44 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap34 = HashMap<String, IData>()
        hashMap34["FarmBlock"] = ExpandInt.toData(0)
        val withTag12 = item44.withTag(ExpandAnyDict.asData(hashMap34))
        val item45 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap35 = HashMap<String, IData>()
        hashMap35["FarmBlock"] = ExpandInt.toData(0)
        Carpenter.addRecipe(n23, withAmount23, array23, withTag12,
                item45.withTag(ExpandAnyDict.asData(hashMap35)).amount(2))
        val n24 = 60
        val withAmount24 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array24 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item46 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap36 = HashMap<String, IData>()
        hashMap36["FarmBlock"] = ExpandInt.toData(1)
        val withTag13 = item46.withTag(ExpandAnyDict.asData(hashMap36))
        val item47 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap37 = HashMap<String, IData>()
        hashMap37["FarmBlock"] = ExpandInt.toData(1)
        Carpenter.addRecipe(n24, withAmount24, array24, withTag13,
                item47.withTag(ExpandAnyDict.asData(hashMap37)).amount(2))
        val n25 = 60
        val withAmount25 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array25 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item48 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap38 = HashMap<String, IData>()
        hashMap38["FarmBlock"] = ExpandInt.toData(2)
        val withTag14 = item48.withTag(ExpandAnyDict.asData(hashMap38))
        val item49 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap39 = HashMap<String, IData>()
        hashMap39["FarmBlock"] = ExpandInt.toData(2)
        Carpenter.addRecipe(n25, withAmount25, array25, withTag14,
                item49.withTag(ExpandAnyDict.asData(hashMap39)).amount(2))
        val n26 = 60
        val withAmount26 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array26 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item50 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap40 = HashMap<String, IData>()
        hashMap40["FarmBlock"] = ExpandInt.toData(3)
        val withTag15 = item50.withTag(ExpandAnyDict.asData(hashMap40))
        val item51 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap41 = HashMap<String, IData>()
        hashMap41["FarmBlock"] = ExpandInt.toData(3)
        Carpenter.addRecipe(n26, withAmount26, array26, withTag15,
                item51.withTag(ExpandAnyDict.asData(hashMap41)).amount(2))
        val n27 = 60
        val withAmount27 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array27 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item52 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap42 = HashMap<String, IData>()
        hashMap42["FarmBlock"] = ExpandInt.toData(4)
        val withTag16 = item52.withTag(ExpandAnyDict.asData(hashMap42))
        val item53 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap43 = HashMap<String, IData>()
        hashMap43["FarmBlock"] = ExpandInt.toData(4)
        Carpenter.addRecipe(n27, withAmount27, array27, withTag16,
                item53.withTag(ExpandAnyDict.asData(hashMap43)).amount(2))
        val n28 = 60
        val withAmount28 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array28 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item54 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap44 = HashMap<String, IData>()
        hashMap44["FarmBlock"] = ExpandInt.toData(5)
        val withTag17 = item54.withTag(ExpandAnyDict.asData(hashMap44))
        val item55 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap45 = HashMap<String, IData>()
        hashMap45["FarmBlock"] = ExpandInt.toData(5)
        Carpenter.addRecipe(n28, withAmount28, array28, withTag17,
                item55.withTag(ExpandAnyDict.asData(hashMap45)).amount(2))
        val n29 = 60
        val withAmount29 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array29 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item56 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap46 = HashMap<String, IData>()
        hashMap46["FarmBlock"] = ExpandInt.toData(6)
        val withTag18 = item56.withTag(ExpandAnyDict.asData(hashMap46))
        val item57 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap47 = HashMap<String, IData>()
        hashMap47["FarmBlock"] = ExpandInt.toData(6)
        Carpenter.addRecipe(n29, withAmount29, array29, withTag18,
                item57.withTag(ExpandAnyDict.asData(hashMap47)).amount(2))
        val n30 = 60
        val withAmount30 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array30 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item58 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap48 = HashMap<String, IData>()
        hashMap48["FarmBlock"] = ExpandInt.toData(7)
        val withTag19 = item58.withTag(ExpandAnyDict.asData(hashMap48))
        val item59 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap49 = HashMap<String, IData>()
        hashMap49["FarmBlock"] = ExpandInt.toData(7)
        Carpenter.addRecipe(n30, withAmount30, array30, withTag19,
                item59.withTag(ExpandAnyDict.asData(hashMap49)).amount(2))
        val n31 = 60
        val withAmount31 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array31 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item60 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap50 = HashMap<String, IData>()
        hashMap50["FarmBlock"] = ExpandInt.toData(8)
        val withTag20 = item60.withTag(ExpandAnyDict.asData(hashMap50))
        val item61 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap51 = HashMap<String, IData>()
        hashMap51["FarmBlock"] = ExpandInt.toData(8)
        Carpenter.addRecipe(n31, withAmount31, array31, withTag20,
                item61.withTag(ExpandAnyDict.asData(hashMap51)).amount(2))
        val n32 = 60
        val withAmount32 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array32 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item62 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap52 = HashMap<String, IData>()
        hashMap52["FarmBlock"] = ExpandInt.toData(9)
        val withTag21 = item62.withTag(ExpandAnyDict.asData(hashMap52))
        val item63 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap53 = HashMap<String, IData>()
        hashMap53["FarmBlock"] = ExpandInt.toData(9)
        Carpenter.addRecipe(n32, withAmount32, array32, withTag21,
                item63.withTag(ExpandAnyDict.asData(hashMap53)).amount(2))
        val n33 = 60
        val withAmount33 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array33 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                ItemBracketHandler.getItem("minecraft:hopper", 0),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1))
        val item64 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap54 = HashMap<String, IData>()
        hashMap54["FarmBlock"] = ExpandInt.toData(10)
        val withTag22 = item64.withTag(ExpandAnyDict.asData(hashMap54))
        val item65 = ItemBracketHandler.getItem("Forestry:ffarm", 3)
        val hashMap55 = HashMap<String, IData>()
        hashMap55["FarmBlock"] = ExpandInt.toData(10)
        Carpenter.addRecipe(n33, withAmount33, array33, withTag22,
                item65.withTag(ExpandAnyDict.asData(hashMap55)).amount(2))
        val n34 = 60
        val withAmount34 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array34 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item66 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap56 = HashMap<String, IData>()
        hashMap56["FarmBlock"] = ExpandInt.toData(0)
        val withTag23 = item66.withTag(ExpandAnyDict.asData(hashMap56))
        val item67 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap57 = HashMap<String, IData>()
        hashMap57["FarmBlock"] = ExpandInt.toData(0)
        Carpenter.addRecipe(n34, withAmount34, array34, withTag23,
                item67.withTag(ExpandAnyDict.asData(hashMap57)).amount(2))
        val n35 = 60
        val withAmount35 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array35 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item68 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap58 = HashMap<String, IData>()
        hashMap58["FarmBlock"] = ExpandInt.toData(1)
        val withTag24 = item68.withTag(ExpandAnyDict.asData(hashMap58))
        val item69 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap59 = HashMap<String, IData>()
        hashMap59["FarmBlock"] = ExpandInt.toData(1)
        Carpenter.addRecipe(n35, withAmount35, array35, withTag24,
                item69.withTag(ExpandAnyDict.asData(hashMap59)).amount(2))
        val n36 = 60
        val withAmount36 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array36 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item70 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap60 = HashMap<String, IData>()
        hashMap60["FarmBlock"] = ExpandInt.toData(2)
        val withTag25 = item70.withTag(ExpandAnyDict.asData(hashMap60))
        val item71 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap61 = HashMap<String, IData>()
        hashMap61["FarmBlock"] = ExpandInt.toData(2)
        Carpenter.addRecipe(n36, withAmount36, array36, withTag25,
                item71.withTag(ExpandAnyDict.asData(hashMap61)).amount(2))
        val n37 = 60
        val withAmount37 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array37 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item72 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap62 = HashMap<String, IData>()
        hashMap62["FarmBlock"] = ExpandInt.toData(3)
        val withTag26 = item72.withTag(ExpandAnyDict.asData(hashMap62))
        val item73 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap63 = HashMap<String, IData>()
        hashMap63["FarmBlock"] = ExpandInt.toData(3)
        Carpenter.addRecipe(n37, withAmount37, array37, withTag26,
                item73.withTag(ExpandAnyDict.asData(hashMap63)).amount(2))
        val n38 = 60
        val withAmount38 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array38 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item74 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap64 = HashMap<String, IData>()
        hashMap64["FarmBlock"] = ExpandInt.toData(4)
        val withTag27 = item74.withTag(ExpandAnyDict.asData(hashMap64))
        val item75 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap65 = HashMap<String, IData>()
        hashMap65["FarmBlock"] = ExpandInt.toData(4)
        Carpenter.addRecipe(n38, withAmount38, array38, withTag27,
                item75.withTag(ExpandAnyDict.asData(hashMap65)).amount(2))
        val n39 = 60
        val withAmount39 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array39 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item76 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap66 = HashMap<String, IData>()
        hashMap66["FarmBlock"] = ExpandInt.toData(5)
        val withTag28 = item76.withTag(ExpandAnyDict.asData(hashMap66))
        val item77 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap67 = HashMap<String, IData>()
        hashMap67["FarmBlock"] = ExpandInt.toData(5)
        Carpenter.addRecipe(n39, withAmount39, array39, withTag28,
                item77.withTag(ExpandAnyDict.asData(hashMap67)).amount(2))
        val n40 = 60
        val withAmount40 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array40 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item78 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap68 = HashMap<String, IData>()
        hashMap68["FarmBlock"] = ExpandInt.toData(6)
        val withTag29 = item78.withTag(ExpandAnyDict.asData(hashMap68))
        val item79 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap69 = HashMap<String, IData>()
        hashMap69["FarmBlock"] = ExpandInt.toData(6)
        Carpenter.addRecipe(n40, withAmount40, array40, withTag29,
                item79.withTag(ExpandAnyDict.asData(hashMap69)).amount(2))
        val n41 = 60
        val withAmount41 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array41 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item80 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap70 = HashMap<String, IData>()
        hashMap70["FarmBlock"] = ExpandInt.toData(7)
        val withTag30 = item80.withTag(ExpandAnyDict.asData(hashMap70))
        val item81 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap71 = HashMap<String, IData>()
        hashMap71["FarmBlock"] = ExpandInt.toData(7)
        Carpenter.addRecipe(n41, withAmount41, array41, withTag30,
                item81.withTag(ExpandAnyDict.asData(hashMap71)).amount(2))
        val n42 = 60
        val withAmount42 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array42 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item82 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap72 = HashMap<String, IData>()
        hashMap72["FarmBlock"] = ExpandInt.toData(8)
        val withTag31 = item82.withTag(ExpandAnyDict.asData(hashMap72))
        val item83 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap73 = HashMap<String, IData>()
        hashMap73["FarmBlock"] = ExpandInt.toData(8)
        Carpenter.addRecipe(n42, withAmount42, array42, withTag31,
                item83.withTag(ExpandAnyDict.asData(hashMap73)).amount(2))
        val n43 = 60
        val withAmount43 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array43 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item84 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap74 = HashMap<String, IData>()
        hashMap74["FarmBlock"] = ExpandInt.toData(9)
        val withTag32 = item84.withTag(ExpandAnyDict.asData(hashMap74))
        val item85 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap75 = HashMap<String, IData>()
        hashMap75["FarmBlock"] = ExpandInt.toData(9)
        Carpenter.addRecipe(n43, withAmount43, array43, withTag32,
                item85.withTag(ExpandAnyDict.asData(hashMap75)).amount(2))
        val n44 = 60
        val withAmount44 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val array44 = arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28880),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11))
        val item86 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap76 = HashMap<String, IData>()
        hashMap76["FarmBlock"] = ExpandInt.toData(10)
        val withTag33 = item86.withTag(ExpandAnyDict.asData(hashMap76))
        val item87 = ItemBracketHandler.getItem("Forestry:ffarm", 4)
        val hashMap77 = HashMap<String, IData>()
        hashMap77["FarmBlock"] = ExpandInt.toData(10)
        Carpenter.addRecipe(n44, withAmount44, array44, withTag33,
                item87.withTag(ExpandAnyDict.asData(hashMap77)).amount(2))
        val item88 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap78 = HashMap<String, IData>()
        hashMap78["FarmBlock"] = ExpandInt.toData(0)
        val amount2 = item88.withTag(ExpandAnyDict.asData(hashMap78)).amount(2)
        val array45 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount45 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n45 = 60
        val item89 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap79 = HashMap<String, IData>()
        hashMap79["FarmBlock"] = ExpandInt.toData(0)
        Carpenter.addRecipe(amount2, array45, withAmount45, n45,
                item89.withTag(ExpandAnyDict.asData(hashMap79)).amount(2))
        val item90 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap80 = HashMap<String, IData>()
        hashMap80["FarmBlock"] = ExpandInt.toData(1)
        val amount3 = item90.withTag(ExpandAnyDict.asData(hashMap80)).amount(2)
        val array46 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount46 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n46 = 60
        val item91 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap81 = HashMap<String, IData>()
        hashMap81["FarmBlock"] = ExpandInt.toData(1)
        Carpenter.addRecipe(amount3, array46, withAmount46, n46,
                item91.withTag(ExpandAnyDict.asData(hashMap81)).amount(2))
        val item92 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap82 = HashMap<String, IData>()
        hashMap82["FarmBlock"] = ExpandInt.toData(2)
        val amount4 = item92.withTag(ExpandAnyDict.asData(hashMap82)).amount(2)
        val array47 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount47 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n47 = 60
        val item93 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap83 = HashMap<String, IData>()
        hashMap83["FarmBlock"] = ExpandInt.toData(2)
        Carpenter.addRecipe(amount4, array47, withAmount47, n47,
                item93.withTag(ExpandAnyDict.asData(hashMap83)).amount(2))
        val item94 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap84 = HashMap<String, IData>()
        hashMap84["FarmBlock"] = ExpandInt.toData(3)
        val amount5 = item94.withTag(ExpandAnyDict.asData(hashMap84)).amount(2)
        val array48 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount48 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n48 = 60
        val item95 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap85 = HashMap<String, IData>()
        hashMap85["FarmBlock"] = ExpandInt.toData(3)
        Carpenter.addRecipe(amount5, array48, withAmount48, n48,
                item95.withTag(ExpandAnyDict.asData(hashMap85)).amount(2))
        val item96 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap86 = HashMap<String, IData>()
        hashMap86["FarmBlock"] = ExpandInt.toData(4)
        val amount6 = item96.withTag(ExpandAnyDict.asData(hashMap86)).amount(2)
        val array49 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount49 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n49 = 60
        val item97 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap87 = HashMap<String, IData>()
        hashMap87["FarmBlock"] = ExpandInt.toData(4)
        Carpenter.addRecipe(amount6, array49, withAmount49, n49,
                item97.withTag(ExpandAnyDict.asData(hashMap87)).amount(2))
        val item98 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap88 = HashMap<String, IData>()
        hashMap88["FarmBlock"] = ExpandInt.toData(5)
        val amount7 = item98.withTag(ExpandAnyDict.asData(hashMap88)).amount(2)
        val array50 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount50 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n50 = 60
        val item99 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap89 = HashMap<String, IData>()
        hashMap89["FarmBlock"] = ExpandInt.toData(5)
        Carpenter.addRecipe(amount7, array50, withAmount50, n50,
                item99.withTag(ExpandAnyDict.asData(hashMap89)).amount(2))
        val item100 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap90 = HashMap<String, IData>()
        hashMap90["FarmBlock"] = ExpandInt.toData(6)
        val amount8 = item100.withTag(ExpandAnyDict.asData(hashMap90)).amount(2)
        val array51 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount51 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n51 = 60
        val item101 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap91 = HashMap<String, IData>()
        hashMap91["FarmBlock"] = ExpandInt.toData(6)
        Carpenter.addRecipe(amount8, array51, withAmount51, n51,
                item101.withTag(ExpandAnyDict.asData(hashMap91)).amount(2))
        val item102 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap92 = HashMap<String, IData>()
        hashMap92["FarmBlock"] = ExpandInt.toData(7)
        val amount9 = item102.withTag(ExpandAnyDict.asData(hashMap92)).amount(2)
        val array52 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount52 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n52 = 60
        val item103 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap93 = HashMap<String, IData>()
        hashMap93["FarmBlock"] = ExpandInt.toData(7)
        Carpenter.addRecipe(amount9, array52, withAmount52, n52,
                item103.withTag(ExpandAnyDict.asData(hashMap93)).amount(2))
        val item104 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap94 = HashMap<String, IData>()
        hashMap94["FarmBlock"] = ExpandInt.toData(8)
        val amount10 = item104.withTag(ExpandAnyDict.asData(hashMap94)).amount(2)
        val array53 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount53 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n53 = 60
        val item105 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap95 = HashMap<String, IData>()
        hashMap95["FarmBlock"] = ExpandInt.toData(8)
        Carpenter.addRecipe(amount10, array53, withAmount53, n53,
                item105.withTag(ExpandAnyDict.asData(hashMap95)).amount(2))
        val item106 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap96 = HashMap<String, IData>()
        hashMap96["FarmBlock"] = ExpandInt.toData(9)
        val amount11 = item106.withTag(ExpandAnyDict.asData(hashMap96)).amount(2)
        val array54 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount54 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n54 = 60
        val item107 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap97 = HashMap<String, IData>()
        hashMap97["FarmBlock"] = ExpandInt.toData(9)
        Carpenter.addRecipe(amount11, array54, withAmount54, n54,
                item107.withTag(ExpandAnyDict.asData(hashMap97)).amount(2))
        val item108 = ItemBracketHandler.getItem("Forestry:ffarm", 5)
        val hashMap98 = HashMap<String, IData>()
        hashMap98["FarmBlock"] = ExpandInt.toData(10)
        val amount12 = item108.withTag(ExpandAnyDict.asData(hashMap98)).amount(2)
        val array55 = arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("circuitBasic")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 4),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 4)))
        val withAmount55 = LiquidBracketHandler.getLiquid("creosote").withAmount(1000)
        val n55 = 60
        val item109 = ItemBracketHandler.getItem("Forestry:ffarm", 0)
        val hashMap99 = HashMap<String, IData>()
        hashMap99["FarmBlock"] = ExpandInt.toData(10)
        Carpenter.addRecipe(amount12, array55, withAmount55, n55,
                item109.withTag(ExpandAnyDict.asData(hashMap99)).amount(2))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:infuser", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickBronze"), null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickIron"), null),
                        arrayOf(OreBracketHandler.getOre("craftingToolHardHammer"),
                                ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                                OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:pipette", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateAnyRubber"),
                        OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("cellEmpty"),
                                OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("boltGlass"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:naturalistHelmet", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("ringIron"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("lensGlass"), null,
                                OreBracketHandler.getOre("lensGlass")), arrayOfNulls(3)), null)
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(null, ItemBracketHandler.getItem("minecraft:wheat", 0), null,
                        ItemBracketHandler.getItem("minecraft:wheat", 0),
                        ItemBracketHandler.getItem("minecraft:dirt", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:wheat", 0), null,
                        ItemBracketHandler.getItem("minecraft:wheat", 0), null), null,
                ItemBracketHandler.getItem("Forestry:fertilizerBio", 0))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("minecraft:dirt", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null), null,
                ItemBracketHandler.getItem("Forestry:fertilizerBio", 0))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(null, ItemBracketHandler.getItem("Natura:barleyFood", 0), null,
                        ItemBracketHandler.getItem("Natura:barleyFood", 0),
                        ItemBracketHandler.getItem("minecraft:dirt", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Natura:barleyFood", 0), null,
                        ItemBracketHandler.getItem("Natura:barleyFood", 0), null), null,
                ItemBracketHandler.getItem("Forestry:fertilizerBio", 0))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(null, ItemBracketHandler.getItem("BiomesOPlenty:plants", 6), null,
                        ItemBracketHandler.getItem("BiomesOPlenty:plants", 6),
                        ItemBracketHandler.getItem("minecraft:dirt", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("BiomesOPlenty:plants", 6), null,
                        ItemBracketHandler.getItem("BiomesOPlenty:plants", 6), null), null,
                ItemBracketHandler.getItem("Forestry:fertilizerBio", 0))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(null, ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE), null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2530), null, null,
                        ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE), null), null,
                ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(5))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(null, ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE), null, null,
                        ItemBracketHandler.getItem("MagicBees:miscResources", 2), null, null,
                        ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE), null), null,
                ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(6))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2530),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815)), null,
                ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(10))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815)), null,
                ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(12))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("water").withAmount(100),
                arrayOf(null, ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE), null,
                        ItemBracketHandler.getItem("minecraft:dirt", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                        ItemBracketHandler.getItem("minecraft:dirt", OreDictionary.WILDCARD_VALUE), null,
                        ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE), null), null,
                ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(2))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)),
                ItemBracketHandler.getItem("Forestry:canEmpty", 0),
                ItemBracketHandler.getItem("Forestry:iodineCapsule", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("ExtraBees:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)),
                ItemBracketHandler.getItem("Forestry:canEmpty", 0),
                ItemBracketHandler.getItem("Forestry:iodineCapsule", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("MagicBees:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)),
                ItemBracketHandler.getItem("Forestry:canEmpty", 0),
                ItemBracketHandler.getItem("Forestry:iodineCapsule", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)),
                ItemBracketHandler.getItem("Forestry:canEmpty", 0),
                ItemBracketHandler.getItem("Forestry:craftingMaterial", 4))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("ExtraBees:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)),
                ItemBracketHandler.getItem("Forestry:canEmpty", 0),
                ItemBracketHandler.getItem("Forestry:craftingMaterial", 4))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("MagicBees:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)),
                ItemBracketHandler.getItem("Forestry:canEmpty", 0),
                ItemBracketHandler.getItem("Forestry:craftingMaterial", 4))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:craftingMaterial", 6),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19086),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19086)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:oakStick", 0),
                                ItemBracketHandler.getItem("Forestry:oakStick", 0),
                                ItemBracketHandler.getItem("Forestry:oakStick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:beeswax", 0),
                                ItemBracketHandler.getItem("Forestry:pollen", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("Forestry:beeswax", 0))),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(1000), 10, null)
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("creosote").withAmount(200),
                arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null,
                        ItemBracketHandler.getItem("Forestry:peat", 0),
                        ItemBracketHandler.getItem("Forestry:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:peat", 0), null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null), null,
                ItemBracketHandler.getItem("Forestry:bituminousPeat", 0))
        Carpenter.addRecipe(12, null, arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null,
                ItemBracketHandler.getItem("Forestry:peat", 0), ItemBracketHandler.getItem("ExtraBees:propolis", 7),
                ItemBracketHandler.getItem("Forestry:peat", 0), null,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null), null,
                ItemBracketHandler.getItem("Forestry:bituminousPeat", 0).amount(2))
        Carpenter.addRecipe(14, null, arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null,
                ItemBracketHandler.getItem("Forestry:peat", 0), ItemBracketHandler.getItem("ExtraBees:propolis", 1),
                ItemBracketHandler.getItem("Forestry:peat", 0), null,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null), null,
                ItemBracketHandler.getItem("Forestry:bituminousPeat", 0).amount(3))
        Carpenter.addRecipe(16, null, arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null,
                ItemBracketHandler.getItem("Forestry:peat", 0), ItemBracketHandler.getItem("ExtraBees:propolis", 2),
                ItemBracketHandler.getItem("Forestry:peat", 0), null,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815), null), null,
                ItemBracketHandler.getItem("Forestry:bituminousPeat", 0).amount(4))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:chipsets", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29032),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032)),
                        arrayOf(OreBracketHandler.getOre("circuitPrimitive"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19032),
                                OreBracketHandler.getOre("circuitPrimitive")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29032),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1152), 10,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32100))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:chipsets", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27300)),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19300),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27300),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29300),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27300))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1152), 20,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32100))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:chipsets", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305)),
                        arrayOf(OreBracketHandler.getOre("circuitGood"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19305),
                                OreBracketHandler.getOre("circuitGood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29305),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1152), 30,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32101))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Forestry:chipsets", 3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27303),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29303),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27303)),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19303),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27303),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29303),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27303))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1152), 40,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32101))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22035), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 0).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22057), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22057),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22300), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22300),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22032), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22032),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 3).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22086), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 4).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22500), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 5).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.LongObsidianRod", 0),
                        null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                        ItemBracketHandler.getItem("dreamcraft:item.LongObsidianRod", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 6).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22801), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22801),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 7).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22880), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22880),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 8).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22501), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22501),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 9).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22530), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22530),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 10).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22526), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22526),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 11).amount(2))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22533), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22533),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19035)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086))), null,
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 12).amount(2))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 18300),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27300)),
                ItemBracketHandler.getItem("minecraft:compass", 0),
                ItemBracketHandler.getItem("Forestry:habitatLocator", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305), null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305), null, null, null,
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 3)), null,
                ItemBracketHandler.getItem("Forestry:solderingIron", 0))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("seedoil").withAmount(100),
                arrayOf(ItemBracketHandler.getItem("minecraft:stick", 0), null, null, null, null, null, null, null,
                        null), null, ItemBracketHandler.getItem("Forestry:oakStick", 0))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("seedoil").withAmount(100),
                arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", OreDictionary.WILDCARD_VALUE), null, null, null, null, null, null,
                        null, null), null, ItemBracketHandler.getItem("Forestry:oakStick", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:string", 0), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("seedoil").withAmount(250),
        //        arrayOf(ItemBracketHandler.getItem("Railcraft:slab", 38),
        //                ItemBracketHandler.getItem("Railcraft:slab", 38),
        //                ItemBracketHandler.getItem("Railcraft:slab", 38),
        //                ItemBracketHandler.getItem("Forestry:oakStick", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("Forestry:oakStick", 0),
        //                ItemBracketHandler.getItem("Forestry:oakStick", 0),
        //                ItemBracketHandler.getItem("Forestry:oakStick", 0),
        //                ItemBracketHandler.getItem("Forestry:oakStick", 0)), null,
        //        ItemBracketHandler.getItem("Forestry:frameImpregnated", 0))

        Research.addResearch("PROVENFRAME", "MAGICBEES", "praecantatio 15, fabrico 12, cognitio 9, potentia 6", 7, 0, 4,
                ItemBracketHandler.getItem("Forestry:frameProven", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.PROVENFRAME", "Proven Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.PROVENFRAME", "[FR] Better than Impregnated Frames")
        Research.addPrereq("PROVENFRAME", "MB_EssenceArmor", false)
        Research.setConcealed("PROVENFRAME", true)
        Research.addPage("PROVENFRAME", "Forestry.research_page.PROVENFRAME")
        MineTweakerAPI.game.setLocalization("Forestry.research_page.PROVENFRAME",
                "The Proven Frame is an item used in an Apiary. Each frame doubles the bees productivity. Out of the three Forestry frames (Untreated, Impregnated and Proven), the Proven Frame has the longest durability.<BR> Proven Frames are normally only obtainable through trading with an Apiarist Villager. The Villager will trade six Proven Frames for one Emerald.<BR> Now you find a magical way put different Bee products and infuse a impregnated Frame to get a Proven Frame. In an Alveary structure, the Frame Housing can be added to make use of the Frame.")
        Arcane.addShaped("PROVENFRAME", ItemBracketHandler.getItem("Forestry:frameProven", 0),
                "ordo 15, terra 15, aer 15, perditio 15, ignis 15, aqua 15",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:propolis", 0),
                                ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                                ItemBracketHandler.getItem("Forestry:propolis", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
                                ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305))))
        Research.addArcanePage("PROVENFRAME", ItemBracketHandler.getItem("Forestry:frameProven", 0))
        Research.addResearch("PROVENGRAFTER", "MAGICBEES", "instrumentum 15, permutatio 12, metallum 9, arbor 6", -5,
                -3, 4, ItemBracketHandler.getItem("Forestry:grafterProven", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.PROVENGRAFTER", "Proven Grafter")
        MineTweakerAPI.game.setLocalization("tc.research_text.PROVENGRAFTER", "[FR] Better than a Bronze Grafter")
        Research.addPrereq("PROVENGRAFTER", "MB_Scoop", false)
        Research.setConcealed("PROVENGRAFTER", true)
        Research.addPage("PROVENGRAFTER", "Forestry.research_page.PROVENGRAFTER")
        MineTweakerAPI.game.setLocalization("Forestry.research_page.PROVENGRAFTER",
                "The Proven Grafter is significantly stronger than the Bronze Grafter and can be obtained by trading with villagers. Like its counterparts the Bronze Grafter and the Thaumium Grafter it makes it possible for one to achieve a 100% sapling drop rate from trees that have been bred with the Forestry mod.<BR> It does not work on ordinary trees, and when it breaks the last hit does not retrieve a sapling.<BR> Now you find a magical way to infuse a bronze Grafter with saplings and pollen to get a proven one.")
        Infusion.addRecipe("PROVENGRAFTER", ItemBracketHandler.getItem("Forestry:grafter", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:sapling", 1),
                        ItemBracketHandler.getItem("minecraft:sapling", 2),
                        ItemBracketHandler.getItem("Forestry:pollen", 0),
                        ItemBracketHandler.getItem("minecraft:sapling", 3),
                        ItemBracketHandler.getItem("minecraft:sapling", 4),
                        ItemBracketHandler.getItem("minecraft:sapling", 5),
                        ItemBracketHandler.getItem("Forestry:pollen", 1),
                        ItemBracketHandler.getItem("minecraft:sapling", 0)),
                "instrumentum 25, permutatio 25, metallum 20, arbor 10",
                ItemBracketHandler.getItem("Forestry:grafterProven", 0), 3)
        Research.addInfusionPage("PROVENGRAFTER", ItemBracketHandler.getItem("Forestry:grafterProven", 0))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("minecraft:string", 0), null, null,
                        ItemBracketHandler.getItem("Forestry:beeswax", 0), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(2))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:craftingMaterial", 2), null, null,
                        ItemBracketHandler.getItem("Forestry:beeswax", 0), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(4))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("minecraft:string", 0), null, null,
                        ItemBracketHandler.getItem("Forestry:refractoryWax", 0), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(4))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:craftingMaterial", 2), null, null,
                        ItemBracketHandler.getItem("Forestry:refractoryWax", 0), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(8))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("minecraft:string", 0), null, null,
                        ItemBracketHandler.getItem("MagicBees:wax", 0), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(4))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:craftingMaterial", 2), null, null,
                        ItemBracketHandler.getItem("MagicBees:wax", 0), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(8))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("minecraft:string", 0), null, null,
                        ItemBracketHandler.getItem("MagicBees:wax", 1), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(4))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:craftingMaterial", 2), null, null,
                        ItemBracketHandler.getItem("MagicBees:wax", 1), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(8))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("minecraft:string", 0), null, null,
                        ItemBracketHandler.getItem("MagicBees:wax", 2), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(4))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(100),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:craftingMaterial", 2), null, null,
                        ItemBracketHandler.getItem("MagicBees:wax", 2), null), null,
                ItemBracketHandler.getItem("Forestry:candle", 0).amount(8))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("for.honey").withAmount(800),
                arrayOf(null, null, null, null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32566), null), null,
                ItemBracketHandler.getItem("Forestry:honeyedSlice", 0))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("for.honey").withAmount(400),
                arrayOf(ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0),
                        ItemBracketHandler.getItem("Forestry:honeydew", 0)),
                ItemBracketHandler.getItem("Forestry:waxCapsule", 0),
                ItemBracketHandler.getItem("Forestry:ambrosia", 0))
        Carpenter.addRecipe(20, null, arrayOf(ItemBracketHandler.getItem("Forestry:honeyDrop", 0), null,
                ItemBracketHandler.getItem("Forestry:honeyDrop", 0), null,
                ItemBracketHandler.getItem("Forestry:honeyDrop", 0), null,
                ItemBracketHandler.getItem("Forestry:honeyDrop", 0), null,
                ItemBracketHandler.getItem("Forestry:honeyDrop", 0)),
                ItemBracketHandler.getItem("Forestry:waxCapsule", 0),
                ItemBracketHandler.getItem("Forestry:honeyPot", 0))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("seedoil").withAmount(200),
                arrayOf(null, ItemBracketHandler.getItem("minecraft:paper", 0), null,
                        ItemBracketHandler.getItem("minecraft:paper", 0),
                        ItemBracketHandler.getItem("Forestry:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:paper", 0), null,
                        ItemBracketHandler.getItem("minecraft:paper", 0), null),
                ItemBracketHandler.getItem("minecraft:paper", 0),
                ItemBracketHandler.getItem("Forestry:letters", 0).amount(4))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("seedoil").withAmount(200),
                arrayOf(null, ItemBracketHandler.getItem("minecraft:paper", 0), null,
                        ItemBracketHandler.getItem("minecraft:paper", 0),
                        ItemBracketHandler.getItem("ExtraBees:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:paper", 0), null,
                        ItemBracketHandler.getItem("minecraft:paper", 0), null),
                ItemBracketHandler.getItem("minecraft:paper", 0),
                ItemBracketHandler.getItem("Forestry:letters", 0).amount(4))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("seedoil").withAmount(200),
                arrayOf(null, ItemBracketHandler.getItem("minecraft:paper", 0), null,
                        ItemBracketHandler.getItem("minecraft:paper", 0),
                        ItemBracketHandler.getItem("MagicBees:propolis", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:paper", 0), null,
                        ItemBracketHandler.getItem("minecraft:paper", 0), null),
                ItemBracketHandler.getItem("minecraft:paper", 0),
                ItemBracketHandler.getItem("Forestry:letters", 0).amount(4))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("seedoil").withAmount(400),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:stamps", 0), null, null, null,
                        null), ItemBracketHandler.getItem("minecraft:book", 0),
                ItemBracketHandler.getItem("Forestry:catalogue", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("seedoil").withAmount(400),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:stamps", 1), null, null, null,
                        null), ItemBracketHandler.getItem("minecraft:book", 0),
                ItemBracketHandler.getItem("Forestry:catalogue", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("seedoil").withAmount(400),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:stamps", 2), null, null, null,
                        null), ItemBracketHandler.getItem("minecraft:book", 0),
                ItemBracketHandler.getItem("Forestry:catalogue", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("seedoil").withAmount(400),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:stamps", 3), null, null, null,
                        null), ItemBracketHandler.getItem("minecraft:book", 0),
                ItemBracketHandler.getItem("Forestry:catalogue", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("seedoil").withAmount(400),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:stamps", 4), null, null, null,
                        null), ItemBracketHandler.getItem("minecraft:book", 0),
                ItemBracketHandler.getItem("Forestry:catalogue", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("seedoil").withAmount(400),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:stamps", 5), null, null, null,
                        null), ItemBracketHandler.getItem("minecraft:book", 0),
                ItemBracketHandler.getItem("Forestry:catalogue", 0))
        Carpenter.addRecipe(40, LiquidBracketHandler.getLiquid("seedoil").withAmount(400),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("Forestry:stamps", 6), null, null, null,
                        null), ItemBracketHandler.getItem("minecraft:book", 0),
                ItemBracketHandler.getItem("Forestry:catalogue", 0))
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("creosote").withAmount(400),
                arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470), null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470), null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470), null), null,
                ItemBracketHandler.getItem("Forestry:crate", 0).amount(4))
        run2()
    }

    fun run2() {
        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:apiaristBag", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("Forestry:apicultureChest", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:apiaristBag", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:apiaristBag", 0)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:lepidopteristBag", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("Forestry:lepidopterology", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:lepidopteristBag", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:lepidopteristBag", 0)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:minerBag", 0),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                OreBracketHandler.getOre("ingotIron"),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("itemLeather"),
        //                        OreBracketHandler.getOre("ingotIron"), OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:minerBag", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:minerBag", 0)), null)

        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
                ItemBracketHandler.getItem("Forestry:minerBag", 0),
                ItemBracketHandler.getItem("Forestry:minerBagT2", 0))

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:diggerBag", 0),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                OreBracketHandler.getOre("stone"),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("itemLeather"), OreBracketHandler.getOre("stone"),
        //                        OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)
        //
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:diggerBag", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:diggerBag", 0)), null)
        //Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
        //        arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
        //        ItemBracketHandler.getItem("Forestry:diggerBag", 0),
        //        ItemBracketHandler.getItem("Forestry:diggerBagT2", 0))
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:foresterBag", 0),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                OreBracketHandler.getOre("logWood"),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("itemLeather"),
        //                        OreBracketHandler.getOre("logWood"), OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:foresterBag", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:foresterBag", 0)), null)
        //Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
        //        arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
        //        ItemBracketHandler.getItem("Forestry:foresterBag", 0),
        //        ItemBracketHandler.getItem("Forestry:foresterBagT2", 0))
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:hunterBag", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("minecraft:feather", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("minecraft:feather", 0),
        //                        OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:hunterBag", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:hunterBag", 0)), null)
        //Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
        //        arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
        //                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
        //        ItemBracketHandler.getItem("Forestry:hunterBag", 0),
        //        ItemBracketHandler.getItem("Forestry:hunterBagT2", 0))
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:builderBag", 0),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                OreBracketHandler.getOre("fenceWood"),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("itemLeather"),
        //                        OreBracketHandler.getOre("fenceWood"), OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:builderBag", 0),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:builderBag", 0)), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
                ItemBracketHandler.getItem("Forestry:builderBag", 0),
                ItemBracketHandler.getItem("Forestry:builderBagT2", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 0),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 1),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 1).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 1).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 1),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 2),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 2).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 2).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 2),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 3),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 3).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 3).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 3),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 4),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 4),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 4).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 4).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 4),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 5),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 5),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 5).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 5).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 5),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 6),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 6),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 6).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 6).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 6),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 7),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 7),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 7).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 7).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 7),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 8),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 8),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 8).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 8).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 8),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 9),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 9),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 9).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 9).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Forestry:planks", 9),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 10),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 10), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 10),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 10), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 10).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 10),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 10), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 10).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 10),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 10), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 11),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 11), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 11),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 11), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 11).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 11),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 11), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 11).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 11),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 11), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 12),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 12), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 12),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 12), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 12).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 12),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 12), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 12).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 12),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 12), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 13),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 13), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 13),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 13), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 13).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 13),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 13), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 13).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 13),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 13), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 14),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 14), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 14),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 14), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 14).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 14),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 14), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 14).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 14),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 14), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 15),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 15), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 15),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 15), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 15).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 15),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 15), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 15).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 15),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 15), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 16),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 16), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 16),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 16), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 16).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 16),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 16), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 16).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 16),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 16), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 17),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 17), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 17),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 17), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 17).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 17),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 17), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 17).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 17),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 17), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 18),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 18), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 18),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 18), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 18).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 18),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 18), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 18).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 18),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 18), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 19),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 19), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 19),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 19), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 19).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 19),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 19), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 19).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 19),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 19), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 20),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 20), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 20),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 20), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 20).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 20),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 20), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 20).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 20),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 20), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 21),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 21), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 21),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 21), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 21).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 21),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 21), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 21).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 21),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 21), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 22),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 22), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 22),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 22), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 22).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 22),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 22), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 22).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 22),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 22), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 23),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 23), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 23),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 23), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 23).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 23),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 23), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 23).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 23),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 23), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 24),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 24), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 24),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 24), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 24).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 24),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 24), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 24).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 24),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 24), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 25),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 25), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 25),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 25), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 25).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 25),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 25), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 25).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 25),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 25), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 26),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 26), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 26),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 26), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 26).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 26),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 26), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 26).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 26),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 26), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 27),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 27), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 27),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 27), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 27).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 27),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 27), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 27).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 27),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 27), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 28),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 28), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 28),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 28), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 28).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 28),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 28), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fences", 28).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planks", 28),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 28), OreBracketHandler.getOre("stickWood"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planks", 29), OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 0),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 0),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 0),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 0),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 0),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 0),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 1),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 1),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 1),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 1).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 1),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 1),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 1).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 1),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 1),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 2),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 2),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 2),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 2).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 2),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 2),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 2).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 2),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 2),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 3),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 3),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 3),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 3).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 3),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 3),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 3).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 3),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 3),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 4),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 4),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 4),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 4),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 4).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 4),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 4),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 4).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 4),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 4),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 5),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 5),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 5),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 5),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 5).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 5),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 5),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 5).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 5),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 5),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 6),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 6),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 6),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 6),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 6).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 6),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 6),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 6).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 6),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 6),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 7),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 7),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 7),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 7),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 7).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 7),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 7),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 7).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 7),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 7),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 8),
                arrayOf(arrayOfNulls(3), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 8),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 8),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 8).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 8),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 8),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 8).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 8),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 8),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 9),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 9),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 9),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 9),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 9).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 9),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 9),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 9).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 9),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 9),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 10),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 10),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 10),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 10),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 10).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 10),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 10),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 10).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 10),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 10),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 11),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 11),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 11),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 11),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 11).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 11),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 11),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 11).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 11),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 11),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 12),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 12),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 12),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 12),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 12).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 12),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 12),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 12).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 12),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 12),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 13),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 13),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 13),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 13),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 13).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 13),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 13),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 13).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 13),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 13),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 14),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 14),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 14),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 14),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 14).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 14),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 14),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 14).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 14),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 14),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 15),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 15),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 15),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 15),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 15).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 15),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 15),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 15).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 15),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 15),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 16),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 16),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 16),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 16),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 16).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 16),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 16),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 16).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 16),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 16),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 17),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 17),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 17),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 17),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 17).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 17),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 17),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 17).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 17),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 17),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 18),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 18),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 18),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 18),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 18).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 18),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 18),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 18).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 18),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 18),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 19),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 19),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 19),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 19),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 19).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 19),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 19),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 19).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 19),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 19),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 20),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 20),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 20),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 20),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 20).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 20),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 20),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 20).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 20),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 20),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 21),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 21),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 21),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 21),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 21).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 21),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 21),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 21).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 21),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 21),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 22),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 22),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 22),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 22),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 22).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 22),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 22),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 22).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 22),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 22),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 23),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 23),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 23),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 23),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 23).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 23),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 23),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 23).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 23),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 23),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 24),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 24),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 24),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 24),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 24).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 24),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 24),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 24).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 24),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 24),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 25),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 25),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 25),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 25),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 25).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 25),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 25),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 25).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 25),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 25),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 26),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 26),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 26),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 26),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 26).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 26),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 26),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 26).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 26),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 26),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 27),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 27),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 27),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 27),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 27).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 27),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 27),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 27).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 27),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 27),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 28),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 28),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 28),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 28),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 28).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 28),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 28),
                        OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:fencesFireproof", 28).amount(4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("Forestry:planksFireproof", 28),
                                OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("Forestry:planksFireproof", 28),
                        OreBracketHandler.getOre("stickWood"))), null)
        Carpenter.addRecipe(10, LiquidBracketHandler.getLiquid("creosote").withAmount(500),
                arrayOf(null, null, null, null, ItemBracketHandler.getItem("minecraft:wool", OreDictionary.WILDCARD_VALUE), null, null,
                        ItemBracketHandler.getItem("minecraft:stick", 0), null), null,
                ItemBracketHandler.getItem("minecraft:torch", 0).amount(5))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Forestry:factory2", 2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 10)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:cart.beehouse", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolScrewdriver"), null),
                        arrayOf(OreBracketHandler.getOre("screwSteel"),
                                ItemBracketHandler.getItem("Forestry:apiculture", 2),
                                OreBracketHandler.getOre("screwSteel")), arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("minecraft:minecart", 0), OreBracketHandler.getOre("screwSteel"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Forestry:cart.beehouse", 1),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolScrewdriver"), null),
                        arrayOf(OreBracketHandler.getOre("screwSteel"),
                                ItemBracketHandler.getItem("Forestry:apiculture", 0),
                                OreBracketHandler.getOre("screwSteel")), arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("minecraft:minecart", 0), OreBracketHandler.getOre("screwSteel"))),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:minecart", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:cart.beehouse", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:minecart", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:cart.beehouse", 1)), null)
        SemiFluidGenerator.addFluid(LiquidBracketHandler.getLiquid("short.mead").withAmount(20), 4)
        Fuels.addDieselFuel(ItemBracketHandler.getItem("minecraft:bucket", 0),
                ItemBracketHandler.getItem("Forestry:bucketShortMead", 0), 4)
        SemiFluidGenerator.addFluid(LiquidBracketHandler.getLiquid("fishoil").withAmount(20), 2)
        Fuels.addDieselFuel(ItemBracketHandler.getItem("IC2:itemCellEmpty", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30711), 2)
        Fuels.addDieselFuel(ItemBracketHandler.getItem("Forestry:canEmpty", 0),
                ItemBracketHandler.getItem("Forestry:canBiomass", 0), 8)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("Forestry:beeswax", 0).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("Forestry:refractoryWax", 0).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("MagicBees:wax", 0).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("MagicBees:wax", 1).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("MagicBees:wax", 2).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Forestry:letters", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2896).amount(6), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:alveary", 0),
                ItemBracketHandler.getItem("Forestry:impregnatedCasing", 0),
                ItemBracketHandler.getItem("Forestry:craftingMaterial", 6).amount(8), 1200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 1),
                OreBracketHandler.getOre("itemCasingBronze").amount(4), 800, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:hardenedMachine", 0),
                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500).amount(8), 1200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:engine", 1),
                ItemBracketHandler.getItem("dreamcraft:item.EngineCore", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032).amount(10), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:engine", 2),
                ItemBracketHandler.getItem("dreamcraft:item.EngineCore", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17300).amount(10), 800, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:engine", 4),
                ItemBracketHandler.getItem("dreamcraft:item.EngineCore", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17304).amount(10), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:canEmpty", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17057).amount(2),
                ItemBracketHandler.getItem("minecraft:glass_pane", 0), 120, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:apiaristHelmet", 0),
                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3).amount(5),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 5).amount(0), 1200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:apiaristChest", 0),
                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 8).amount(0), 1200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:apiaristLegs", 0),
                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3).amount(7),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 7).amount(0), 1200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:apiaristBoots", 0),
                ItemBracketHandler.getItem("Forestry:craftingMaterial", 3).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 1200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:cart.beehouse", 0),
                ItemBracketHandler.getItem("Forestry:apiculture", 2),
                ItemBracketHandler.getItem("minecraft:minecart", 0), 200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Forestry:cart.beehouse", 1),
                ItemBracketHandler.getItem("Forestry:apiculture", 0),
                ItemBracketHandler.getItem("minecraft:minecart", 0), 200, VoltageLevels.LLV)
        gttweaker.mods.gregtech.machines.Centrifuge.addRecipe(
                arrayOf(ItemBracketHandler.getItem("Forestry:propolis", 0)), null,
                ItemBracketHandler.getItem("BiomesOPlenty:hive", 1), null, null, intArrayOf(500), 400, VoltageLevels.LMV)
        FluidSolidifier.addRecipe(ItemBracketHandler.getItem("Forestry:honeyDrop", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32309).amount(0),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(200), 400, VoltageLevels.ULV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("Forestry:beeswax", 0).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 100, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("Forestry:refractoryWax", 0).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 100, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("MagicBees:wax", 0).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 100, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("MagicBees:wax", 1).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 100, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("Forestry:waxCast", 0),
                ItemBracketHandler.getItem("MagicBees:wax", 2).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 100, VoltageLevels.LV)
        MineTweakerAPI.oreDict["foodHoneydrop"].add(ItemBracketHandler.getItem("Forestry:honeyDrop", 0))
        MineTweakerAPI.oreDict["listAllsugar"].add(ItemBracketHandler.getItem("Forestry:honeyDrop", 0))
        NEI.overrideName(ItemBracketHandler.getItem("Forestry:alveary", 2), "Swarmer")
        NEI.overrideName(ItemBracketHandler.getItem("Forestry:alveary", 3), "Alveary Fan")
        NEI.overrideName(ItemBracketHandler.getItem("Forestry:alveary", 4), "Alveary Heater")
        NEI.overrideName(ItemBracketHandler.getItem("Forestry:alveary", 5), "Alveary Hygroregulator")
        NEI.overrideName(ItemBracketHandler.getItem("Forestry:alveary", 6), "Alveary Stabiliser")
        NEI.overrideName(ItemBracketHandler.getItem("Forestry:alveary", 7), "Alveary Sieve")
    }
}