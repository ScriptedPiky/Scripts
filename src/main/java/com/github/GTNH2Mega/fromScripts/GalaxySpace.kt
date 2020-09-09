package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.Pulverizer
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandFloat
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import minetweaker.mods.nei.NEI
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class GalaxySpace : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.lead_boots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.lead_plate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.lead_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.lead_leg", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.cobaltum_boots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.cobaltum_plate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.cobaltum_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.cobaltum_leg", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.LeadBattery", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.SolarFlares", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.SolarFlares", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:solarwindpanel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.QuantBow", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.JetPack", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:geothermalgenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:fuelgenerator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:assemblymachine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:convertersurface", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.plasmasword", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.plasmapickaxe", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.plasmaaxe", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.plasmahoe", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.plasmashovel", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:ceresglowstone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:ioglowstone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:enceladusglowstone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:proteusglowstone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:plutoglowstone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.RocketParts", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.RocketParts", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.RocketParts", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.RocketParts", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:futureglass", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:machineframes", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:solarPanel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:storagemoduleT3", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:oxstoragemoduleT2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalacticraftMars:item.methaneCanisterPartial", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander2", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander3", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.lead_boots", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDesh"), null,
                        OreBracketHandler.getOre("plateDesh")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedLead"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("CompressedLead")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedLead"), null,
                                OreBracketHandler.getOre("CompressedLead"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.lead_plate", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedLead"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("CompressedLead")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedLead"),
                                OreBracketHandler.getOre("plateDesh"), OreBracketHandler.getOre("CompressedLead")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedLead"), null,
                                OreBracketHandler.getOre("CompressedLead"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.lead_helmet", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedLead"),
                        OreBracketHandler.getOre("CompressedLead"), OreBracketHandler.getOre("CompressedLead")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedLead"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("CompressedLead")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDesh"), null,
                                OreBracketHandler.getOre("plateDesh"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.lead_leg", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedLead"),
                        OreBracketHandler.getOre("CompressedLead"), OreBracketHandler.getOre("CompressedLead")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedLead"),
                                OreBracketHandler.getOre("plateDesh"), OreBracketHandler.getOre("CompressedLead")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedLead"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("CompressedLead"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.cobaltum_boots", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDesh"), null,
                        OreBracketHandler.getOre("plateDesh")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("CompressedCobaltum")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedCobaltum"), null,
                                OreBracketHandler.getOre("CompressedCobaltum"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.cobaltum_plate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedCobaltum"),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedCobaltum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("plateDesh"), OreBracketHandler.getOre("CompressedCobaltum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("CompressedCobaltum"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.cobaltum_helmet", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedCobaltum"),
                        OreBracketHandler.getOre("CompressedCobaltum"), OreBracketHandler.getOre("CompressedCobaltum")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("CompressedCobaltum")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDesh"), null,
                                OreBracketHandler.getOre("plateDesh"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.cobaltum_leg", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedCobaltum"),
                        OreBracketHandler.getOre("CompressedCobaltum"), OreBracketHandler.getOre("CompressedCobaltum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("plateDesh"), OreBracketHandler.getOre("CompressedCobaltum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("CompressedCobaltum"))), null)
        val recipes = MineTweakerAPI.recipes
        val item = ItemBracketHandler.getItem("GalaxySpace:item.plasmasword", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["electricity"] = ExpandFloat.asData(0.0.toFloat())
        val withTag = item.withTag(ExpandAnyDict.asData(hashMap))
        val array = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDesh"),
                OreBracketHandler.getOre("CompressedCobaltum"), OreBracketHandler.getOre("plateDesh")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                        OreBracketHandler.getOre("CompressedCobaltum"),
                        OreBracketHandler.getOre("craftingToolHardHammer")), null)
        val n = 2
        val array2 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDesh"), null, null)
        val n2 = 1
        val item2 = ItemBracketHandler.getItem("GalaxySpace:item.LeadBattery", 100)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["electricity"] = ExpandFloat.asData(0.0.toFloat())
        array2[n2] = item2.withTag(ExpandAnyDict.asData(hashMap2))
        array2[2] = ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1)
        array[n] = array2
        recipes.addShaped(withTag, array, null)
        val recipes2 = MineTweakerAPI.recipes
        val item3 = ItemBracketHandler.getItem("GalaxySpace:item.plasmapickaxe", 0)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["electricity"] = ExpandFloat.asData(0.0.toFloat())
        val withTag2 = item3.withTag(ExpandAnyDict.asData(hashMap3))
        val array3 = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedCobaltum"),
                OreBracketHandler.getOre("CompressedCobaltum"), OreBracketHandler.getOre("CompressedCobaltum")),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")), null)
        val n3 = 2
        val array4 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDesh"), null, null)
        val n4 = 1
        val item4 = ItemBracketHandler.getItem("GalaxySpace:item.LeadBattery", 100)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["electricity"] = ExpandFloat.asData(0.0.toFloat())
        array4[n4] = item4.withTag(ExpandAnyDict.asData(hashMap4))
        array4[2] = ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1)
        array3[n3] = array4
        recipes2.addShaped(withTag2, array3, null)
        val recipes3 = MineTweakerAPI.recipes
        val item5 = ItemBracketHandler.getItem("GalaxySpace:item.plasmaaxe", 0)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["electricity"] = ExpandFloat.asData(0.0.toFloat())
        val withTag3 = item5.withTag(ExpandAnyDict.asData(hashMap5))
        val array5 = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedCobaltum"),
                OreBracketHandler.getOre("CompressedCobaltum"), OreBracketHandler.getOre("craftingToolHardHammer")),
                arrayOf(OreBracketHandler.getOre("CompressedCobaltum"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0),
                        OreBracketHandler.getOre("plateDesh")), null)
        val n5 = 2
        val array6 = arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"), null, null)
        val n6 = 1
        val item6 = ItemBracketHandler.getItem("GalaxySpace:item.LeadBattery", 100)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["electricity"] = ExpandFloat.asData(0.0.toFloat())
        array6[n6] = item6.withTag(ExpandAnyDict.asData(hashMap6))
        array6[2] = ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1)
        array5[n5] = array6
        recipes3.addShaped(withTag3, array5, null)
        val recipes4 = MineTweakerAPI.recipes
        val item7 = ItemBracketHandler.getItem("GalaxySpace:item.plasmahoe", 0)
        val hashMap7 = HashMap<String, IData>()
        hashMap7["electricity"] = ExpandFloat.asData(0.0.toFloat())
        val withTag4 = item7.withTag(ExpandAnyDict.asData(hashMap7))
        val array7 = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedCobaltum"),
                OreBracketHandler.getOre("CompressedCobaltum"), OreBracketHandler.getOre("craftingToolHardHammer")),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0),
                        OreBracketHandler.getOre("plateDesh")), null)
        val n7 = 2
        val array8 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1), null,
                null)
        val n8 = 1
        val item8 = ItemBracketHandler.getItem("GalaxySpace:item.LeadBattery", 100)
        val hashMap8 = HashMap<String, IData>()
        hashMap8["electricity"] = ExpandFloat.asData(0.0.toFloat())
        array8[n8] = item8.withTag(ExpandAnyDict.asData(hashMap8))
        array8[2] = OreBracketHandler.getOre("plateDesh")
        array7[n7] = array8
        recipes4.addShaped(withTag4, array7, null)
        val recipes5 = MineTweakerAPI.recipes
        val item9 = ItemBracketHandler.getItem("GalaxySpace:item.plasmashovel", 0)
        val hashMap9 = HashMap<String, IData>()
        hashMap9["electricity"] = ExpandFloat.asData(0.0.toFloat())
        val withTag5 = item9.withTag(ExpandAnyDict.asData(hashMap9))
        val array9 = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                OreBracketHandler.getOre("CompressedCobaltum"), OreBracketHandler.getOre("craftingToolHardHammer")),
                arrayOf(OreBracketHandler.getOre("plateDesh"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0),
                        OreBracketHandler.getOre("plateDesh")), null)
        val n9 = 2
        val array10 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1), null,
                null)
        val n10 = 1
        val item10 = ItemBracketHandler.getItem("GalaxySpace:item.LeadBattery", 100)
        val hashMap10 = HashMap<String, IData>()
        hashMap10["electricity"] = ExpandFloat.asData(0.0.toFloat())
        array10[n10] = item10.withTag(ExpandAnyDict.asData(hashMap10))
        array10[2] = ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1)
        array9[n9] = array10
        recipes5.addShaped(withTag5, array9, null)

        //TODO Replace ("TConstruct:bowstring", 2)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.QuantBow", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("stickLongLead"),
        //                ItemBracketHandler.getItem("dreamcraft:item.MytrylCrystal", 0),
        //                ItemBracketHandler.getItem("TConstruct:bowstring", 2)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.MysteriousCrystal", 0), null,
        //                        ItemBracketHandler.getItem("TConstruct:bowstring", 2)),
        //                arrayOf(OreBracketHandler.getOre("stickLongLead"),
        //                        ItemBracketHandler.getItem("dreamcraft:item.MytrylCrystal", 0),
        //                        ItemBracketHandler.getItem("TConstruct:bowstring", 2))), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.RawSDHCAlloy", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedDualBronze", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedCoal", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedDualAluminium", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("screwStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedLead"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedLead"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("CompressedLead")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("CompressedLead"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 1),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedAdamantite"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedAdamantite"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("CompressedAdamantite")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("CompressedAdamantite"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 2),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedCobaltum"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("CompressedCobaltum")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("CompressedCobaltum"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 3),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedMagnesium"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedMagnesium"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("CompressedMagnesium")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("CompressedMagnesium"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 4),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedMithril"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedMithril"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("CompressedMithril")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("CompressedMithril"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 5),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedNickel"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedNickel"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("CompressedNickel")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("CompressedNickel"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 6),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedOriharukon"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedOriharukon"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("CompressedOriharukon")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("CompressedOriharukon"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 7),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("CompressedPlatinum"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("CompressedPlatinum"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("CompressedPlatinum")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("CompressedPlatinum"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 8),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolHardHammer"),
                        ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 9), null),
                        arrayOf(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 9),
                                OreBracketHandler.getOre("stone"),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 9)),
                        arrayOf(null, ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 9),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:metalsblock", 9),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("compressedCopper"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("compressedCopper"),
                                OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("compressedCopper")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("compressedCopper"),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:machineframes", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 5),
                        ItemBracketHandler.getItem("dreamcraft:item.WaferTier3", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings4", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:tile.aluminumWire", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 5),
                                ItemBracketHandler.getItem("dreamcraft:item.WaferTier3", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:storagemoduleT3", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 9),
                        ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 8),
                        ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.WaferTier3", 0),
                                ItemBracketHandler.getItem("GalaxySpace:machineframes", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.WaferTier3", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 9),
                                ItemBracketHandler.getItem("GalacticraftCore:tile.machineTiered", 8),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 9))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:oxstoragemoduleT2", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:tile.machine2", 8),
                        ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0),
                        ItemBracketHandler.getItem("GalacticraftCore:tile.machine2", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenPipe", 0),
                                ItemBracketHandler.getItem("GalaxySpace:machineframes", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:tile.oxygenPipe", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:tile.machine2", 8),
                                ItemBracketHandler.getItem("dreamcraft:item.WaferTier3", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:tile.machine2", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander2", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("foilGold"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.parachute", OreDictionary.WILDCARD_VALUE),
                        OreBracketHandler.getOre("foilGold")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0)),
                        arrayOf(OreBracketHandler.getOre("foilGold"),
                                ItemBracketHandler.getItem("GalacticraftCore:item.canvas", 0),
                                OreBracketHandler.getOre("foilGold"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander3", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                        ItemBracketHandler.getItem("GalacticraftMars:item.null", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander2", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.steelPole", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 5))), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsTier4", 0), null,
                        null, null, ItemBracketHandler.getItem("GalacticraftMars:item.heavyNoseCone", 0), null, null,
                        null, null), arrayOf<IIngredient?>(null, null, null,
                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2),
                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
                        ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.MediumFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.MediumFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.MediumFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null,
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.MediumFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2), null, null),
                        arrayOf<IIngredient?>(null, null,
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0), null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 2), null, null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1),
                                ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 1),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 1),
                                ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1),
                                ItemBracketHandler.getItem("GalacticraftCore:item.engine", 1), null)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", OreDictionary.WILDCARD_VALUE)), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsTier5", 0), null,
                        null, null, ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyNoseConeTier3", 0), null, null,
                        null, null), arrayOf<IIngredient?>(null, null, null,
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.MediumFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.MediumFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0), null, null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0), null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0), null)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", OreDictionary.WILDCARD_VALUE)), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsTier6", 0), null,
                        null, null, ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyNoseConeTier3", 0), null, null,
                        null, null), arrayOf<IIngredient?>(null, null, null,
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier5", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0), null, null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0), null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier2Booster", 0), null)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", OreDictionary.WILDCARD_VALUE)), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsTier7", 0), null,
                        null, null, ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyNoseConeTier4", 0), null, null,
                        null, null), arrayOf<IIngredient?>(null, null, null,
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("dreamcraft:item.Tier3Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier3Booster", 0), null, null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier3Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.ExtraLargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier3Booster", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier3Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.ExtraLargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier3Booster", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier3Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0), null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier3Booster", 0), null),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier6", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0), null)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", OreDictionary.WILDCARD_VALUE)), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SchematicsTier8", 0), null,
                        null, null, ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyNoseConeTier4", 0), null, null,
                        null, null), arrayOf<IIngredient?>(null, null, null,
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier7", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.ModuleLander3", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.ExtraLargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0), null, null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.ExtraLargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.ExtraLargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.ExtraLargeFuelCanister", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0), null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyPlateTier8", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketFinsTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.Tier4Booster", 0)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.HeavyDutyRocketEngineTier4", 0), null)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", OreDictionary.WILDCARD_VALUE)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_helmet", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.lead_helmet", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oxygenMask", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                                ItemBracketHandler.getItem("GalacticraftCore:item.oxygenConcentrator", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_plate", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.lead_plate", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 2),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_leg", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.lead_leg", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 2),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 2),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_boots", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.lead_boots", 0),
                        ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedSDHD120", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 2),
                                ItemBracketHandler.getItem("GalacticraftMars:item.null", 5),
                                ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 2))), null)
        val item11 = ItemBracketHandler.getItem("GalaxySpace:item.LeadBattery", 100)
        val hashMap11 = HashMap<String, IData>()
        hashMap11["electricity"] = ExpandFloat.asData(0.0.toFloat())
        Assembler.addRecipe(item11.withTag(ExpandAnyDict.asData(hashMap11)),
                ItemBracketHandler.getItem("GalacticraftCore:item.battery", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1),
                LiquidBracketHandler.getLiquid("molten.lead").withAmount(6000), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29028).amount(8),
                        ItemBracketHandler.getItem("dreamcraft:item.TungstenString", 0).amount(8),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.polybenzimidazole").withAmount(576), 600, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0).amount(5),
                        ItemBracketHandler.getItem("dreamcraft:item.TungstenString", 0).amount(5),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 5).amount(0)),
                LiquidBracketHandler.getLiquid("molten.polybenzimidazole").withAmount(1440), 1500, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0).amount(5),
                ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 360, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0).amount(8),
                        ItemBracketHandler.getItem("dreamcraft:item.TungstenString", 0).amount(8),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 8).amount(0)),
                LiquidBracketHandler.getLiquid("molten.polybenzimidazole").withAmount(2304), 2400, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0).amount(8),
                ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 1),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 600, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0).amount(7),
                        ItemBracketHandler.getItem("dreamcraft:item.TungstenString", 0).amount(7),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 7).amount(0)),
                LiquidBracketHandler.getLiquid("molten.polybenzimidazole").withAmount(2016), 2100, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0).amount(7),
                ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 520, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 3),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0).amount(4),
                        ItemBracketHandler.getItem("dreamcraft:item.TungstenString", 0).amount(4),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0)),
                LiquidBracketHandler.getLiquid("molten.polybenzimidazole").withAmount(1152), 1200, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.ThermalClothT2", 0).amount(4),
                ItemBracketHandler.getItem("GalaxySpace:item.ThermalPaddingT2", 3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 300, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:futureglass", 0),
                ItemBracketHandler.getItem("minecraft:glass", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23884).amount(8), 200,  VoltageLevels.HV)
        val item12 = ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_jetplate", 0)
        val hashMap12 = HashMap<String, IData>()
        hashMap12["electricity"] = ExpandFloat.asData(0.0.toFloat())
        Assembler.addRecipe(item12.withTag(ExpandAnyDict.asData(hashMap12)),
                ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_plate", 0),
                ItemBracketHandler.getItem("IC2:itemArmorJetpackElectric", 1),
                LiquidBracketHandler.getLiquid("molten.duralumin").withAmount(1440), 600, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_gravityboots", 0),
                ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_boots", 0),
                ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 4).amount(2),
                LiquidBracketHandler.getLiquid("molten.duralumin").withAmount(1440), 600, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_helmetglasses", 0),
                ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_helmet", 0),
                ItemBracketHandler.getItem("GalacticraftCore:item.sensorGlasses", 0),
                LiquidBracketHandler.getLiquid("molten.duralumin").withAmount(1440), 600, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", 1),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", 0), OreBracketHandler.getOre("chestCopper"),
                100, 4096)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", 2),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", 0), OreBracketHandler.getOre("chestIron"),
                100, 4096)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", 3),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier4Rocket", 0), OreBracketHandler.getOre("chestGold"),
                100, 4096)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", 1),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", 0), OreBracketHandler.getOre("chestCopper"),
                100, 7680)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", 2),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", 0), OreBracketHandler.getOre("chestIron"),
                100, 7680)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", 3),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier5Rocket", 0), OreBracketHandler.getOre("chestGold"),
                100, 7680)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", 1),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", 0), OreBracketHandler.getOre("chestCopper"),
                100, 16384)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", 2),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", 0), OreBracketHandler.getOre("chestIron"),
                100, 16384)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", 3),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier6Rocket", 0), OreBracketHandler.getOre("chestGold"),
                100, 16384)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", 1),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", 0), OreBracketHandler.getOre("chestCopper"),
                100, 30720)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", 2),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", 0), OreBracketHandler.getOre("chestIron"),
                100, 30720)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", 3),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier7Rocket", 0), OreBracketHandler.getOre("chestGold"),
                100, 30720)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", 1),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", 0), OreBracketHandler.getOre("chestCopper"),
                100, 65536)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", 2),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", 0), OreBracketHandler.getOre("chestIron"),
                100, 65536)
        Assembler.addRecipe(ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", 3),
                ItemBracketHandler.getItem("GalaxySpace:item.Tier8Rocket", 0), OreBracketHandler.getOre("chestGold"),
                100, 65536)
        Compressor.addRecipe(ItemBracketHandler.getItem("GalaxySpace:ceresglowstone", 0),
                ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 0).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("GalaxySpace:ioglowstone", 0),
                ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 1).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("GalaxySpace:enceladusglowstone", 0),
                ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 2).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("GalaxySpace:proteusglowstone", 0),
                ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 3).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("GalaxySpace:plutoglowstone", 0),
                ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 4).amount(4))
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 0).amount(4)),
                ItemBracketHandler.getItem("GalaxySpace:ceresglowstone", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 1).amount(4)),
                ItemBracketHandler.getItem("GalaxySpace:ioglowstone", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 2).amount(4)),
                ItemBracketHandler.getItem("GalaxySpace:enceladusglowstone", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 3).amount(4)),
                ItemBracketHandler.getItem("GalaxySpace:proteusglowstone", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("GalaxySpace:item.GlowstoneDusts", 4).amount(4)),
                ItemBracketHandler.getItem("GalaxySpace:plutoglowstone", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        NEI.overrideName(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 3), "Compressed Lead Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 6), "Compressed Nickel Plate")
    }
}