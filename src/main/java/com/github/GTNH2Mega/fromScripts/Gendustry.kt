package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Gendustry : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("gendustry:IndustrialApiary", 0)
        val item2 = ItemBracketHandler.getItem("gendustry:MutagenProducer", 0)
        val item3 = ItemBracketHandler.getItem("gendustry:Mutatron", 0)
        val item4 = ItemBracketHandler.getItem("gendustry:Imprinter", 0)
        val item5 = ItemBracketHandler.getItem("gendustry:Sampler", 0)
        val item6 = ItemBracketHandler.getItem("gendustry:MutatronAdv", 0)
        val item7 = ItemBracketHandler.getItem("gendustry:Liquifier", 0)
        val item8 = ItemBracketHandler.getItem("gendustry:Extractor", 0)
        val item9 = ItemBracketHandler.getItem("gendustry:Transposer", 0)
        val item10 = ItemBracketHandler.getItem("gendustry:Replicator", 0)
        val item11 = ItemBracketHandler.getItem("gendustry:GeneSampleBlank", 0)
        val item12 = ItemBracketHandler.getItem("gendustry:GeneTemplate", 0)
        val item13 = ItemBracketHandler.getItem("gendustry:Labware", 0)
        val item14 = ItemBracketHandler.getItem("gendustry:BeeReceptacle", 0)
        val item15 = ItemBracketHandler.getItem("gendustry:PowerModule", 0)
        val item16 = ItemBracketHandler.getItem("gendustry:MutagenTank", 0)
        val item17 = ItemBracketHandler.getItem("gendustry:GeneticsProcessor", 0)
        val item18 = ItemBracketHandler.getItem("gendustry:EnvProcessor", 0)
        val item19 = ItemBracketHandler.getItem("gendustry:UpgradeFrame", 0)
        val item20 = ItemBracketHandler.getItem("gendustry:ClimateModule", 0)
        ItemBracketHandler.getItem("Forestry:alveary", 0)
        ItemBracketHandler.getItem("Forestry:alveary", 3)
        ItemBracketHandler.getItem("Forestry:alveary", 4)
        ItemBracketHandler.getItem("Forestry:alveary", 5)
        ItemBracketHandler.getItem("Forestry:alveary", 6)
        ItemBracketHandler.getItem("Forestry:sturdyMachine", 0)
        val item21 = ItemBracketHandler.getItem("Forestry:hardenedMachine", 0)
        val item22 = ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)
        val item23 = ItemBracketHandler.getItem("Forestry:royalJelly", 0)
        val item24 = ItemBracketHandler.getItem("Forestry:grafter", 0)

        //TODO Replace ("TConstruct:GlassPane", 0)
        //val item25 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)

        OreBracketHandler.getOre("gearAluminium")
        OreBracketHandler.getOre("gearStainlessSteel")
        val ore = OreBracketHandler.getOre("gearTitanium")
        OreBracketHandler.getOre("gearPalladium")
        val ore2 = OreBracketHandler.getOre("gearNaquadahAlloy")
        OreBracketHandler.getOre("gearGtSmallTitanium")
        val ore3 = OreBracketHandler.getOre("gearGtSmallPalladium")
        OreBracketHandler.getOre("gearGtSmallNaquadahAlloy")
        val ore4 = OreBracketHandler.getOre("gearOsmium")
        val ore5 = OreBracketHandler.getOre("gearGtSmallOsmium")
        val ore6 = OreBracketHandler.getOre("rotorOsmium")
        OreBracketHandler.getOre("plateAluminium")
        val ore7 = OreBracketHandler.getOre("platePalladium")
        val ore8 = OreBracketHandler.getOre("plateRedAlloy")
        OreBracketHandler.getOre("plateStainlessSteel")
        OreBracketHandler.getOre("plateTitanium")
        OreBracketHandler.getOre("plateDiamond")
        OreBracketHandler.getOre("plateTin")
        OreBracketHandler.getOre("plateDenseSteel")
        OreBracketHandler.getOre("plateEnderEye")
        val ore9 = OreBracketHandler.getOre("plateEnderPearl")
        val item26 = ItemBracketHandler.getItem("dreamcraft:item.EngravedDiamondCrystalChip", 0)
        OreBracketHandler.getOre("plateTungstenSteel")
        val ore10 = OreBracketHandler.getOre("plateIron")
        OreBracketHandler.getOre("itemCasingAnyCopper")
        val item27 = ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0)
        OreBracketHandler.getOre("cableGt01Nichrome")
        val ore11 = OreBracketHandler.getOre("cableGt01VanadiumGallium")
        OreBracketHandler.getOre("circuitData")
        OreBracketHandler.getOre("circuitAdvanced")
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24)
        ItemBracketHandler.getItem("dreamcraft:item.NanoCircuit", 0)
        OreBracketHandler.getOre("screwTitanium")
        val ore12 = OreBracketHandler.getOre("screwOsmium")
        val ore13 = OreBracketHandler.getOre("screwHSSS")
        OreBracketHandler.getOre("stickTitanium")
        OreBracketHandler.getOre("stickDiamond")
        OreBracketHandler.getOre("stickTin")
        val ore14 = OreBracketHandler.getOre("stickPalladium")
        OreBracketHandler.getOre("dustRedAlloy")
        val item28 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32643)
        val item29 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32645)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604)
        val item30 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 9233)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32653)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32654)
        val item31 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32655)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32657)
        OreBracketHandler.getOre("craftingToolHardHammer")
        val ore15 = OreBracketHandler.getOre("craftingToolScoop")
        val ore16 = OreBracketHandler.getOre("craftingToolScrewdriver")
        ItemBracketHandler.getItem("Forestry:pipette", 0)
        OreBracketHandler.getOre("craftingToolWrench")
        val ore17 = OreBracketHandler.getOre("blockHopper")
        val item32 = ItemBracketHandler.getItem("minecraft:grass", 0)

        //TODO Replace ("ExtraUtilities:decorativeBlock2", 7)
        //val item33 = ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 7)

        ItemBracketHandler.getItem("Natura:heatsand", 0)
        val item34 = ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE)
        val item35 = ItemBracketHandler.getItem("minecraft:cactus", 0)
        val item36 = ItemBracketHandler.getItem("minecraft:water_bucket", 0)
        val item37 = ItemBracketHandler.getItem("minecraft:lava_bucket", 0)
        val item38 = ItemBracketHandler.getItem("minecraft:blaze_rod", 0)
        val item39 = ItemBracketHandler.getItem("minecraft:ghast_tear", 0)
        val item40 = ItemBracketHandler.getItem("minecraft:snow", 0)
        val item41 = ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0)
        val ore18 = OreBracketHandler.getOre("plateAnyRubber")
        val ore19 = OreBracketHandler.getOre("itemBeeswax")
        val item42 = ItemBracketHandler.getItem("minecraft:vine", 0)
        val item43 = ItemBracketHandler.getItem("minecraft:netherrack", 0)
        val item44 = ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)
        val item45 = ItemBracketHandler.getItem("dreamcraft:item.OsmiumBars", 0)
        val item46 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21028)
        val item47 = ItemBracketHandler.getItem("minecraft:sugar", 0)
        ItemBracketHandler.getItem("IC2:itemBatChargeAdv", 0)
        ItemBracketHandler.getItem("IC2:itemBatChargeRE", 0)
        ItemBracketHandler.getItem("IC2:itemBatChargeCrystal", 0)
        val item48 = ItemBracketHandler.getItem("irontank:diamondTank", 0)
        val item49 = ItemBracketHandler.getItem("IC2:itemRecipePart", 0)
        ItemBracketHandler.getItem("Forestry:apicultureChest", 0)
        OreBracketHandler.getOre("beeComb")
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(item8)
        MineTweakerAPI.recipes.remove(item9)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item19)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.removeShaped(item11, null)
        MineTweakerAPI.recipes.removeShaped(item12, null)
        MineTweakerAPI.recipes.remove(item16)
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(item17)
        MineTweakerAPI.recipes.remove(item18)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:IndustrialGrafter", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:IndustrialScoop", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:MutagenTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:BeeReceptacle", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:PowerModule", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:ClimateModule", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:GeneticsProcessor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:EnvProcessor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:UpgradeFrame", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:EjectCover", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:ImportCover", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gendustry:ErrorSensorCover", 0))
        ExtremeCrafting.addShaped(item2, arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                arrayOf(null, null, item16, OreBracketHandler.getOre("plateBlackPlutonium"), item15,
                        OreBracketHandler.getOre("plateBlackPlutonium"), item16, null, null),
                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32617),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32657), item17,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32657),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32617), null, null),
                arrayOf(null, null, item14, ore4, item21, ore4, item14, null, null),
                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32617),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32608), item17,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32608),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32617), null, null),
                arrayOf(null, null, item16, OreBracketHandler.getOre("plateBlackPlutonium"), item15,
                        OreBracketHandler.getOre("plateBlackPlutonium"), item16, null, null), arrayOfNulls(9),
                arrayOfNulls(9)))
        ExtremeCrafting.addShaped(item, arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                arrayOf(null, null, OreBracketHandler.getOre("gearTungstenSteel"),
                        ItemBracketHandler.getItem("Forestry:alveary", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606),
                        ItemBracketHandler.getItem("Forestry:alveary", 6),
                        OreBracketHandler.getOre("gearTungstenSteel"), null, null),
                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("Forestry:alveary", 5),
                        ItemBracketHandler.getItem("Forestry:alveary", 0),
                        ItemBracketHandler.getItem("Forestry:alveary", 7),
                        ItemBracketHandler.getItem("Forestry:alveary", 0),
                        ItemBracketHandler.getItem("Forestry:alveary", 4), null, null),
                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606),
                        ItemBracketHandler.getItem("Forestry:alveary", 2),
                        ItemBracketHandler.getItem("Forestry:apiculture", 0),
                        ItemBracketHandler.getItem("Forestry:alveary", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606), null, null),
                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("Forestry:alveary", 5),
                        ItemBracketHandler.getItem("Forestry:alveary", 0),
                        ItemBracketHandler.getItem("Forestry:alveary", 7),
                        ItemBracketHandler.getItem("Forestry:alveary", 0),
                        ItemBracketHandler.getItem("Forestry:alveary", 4), null, null),
                arrayOf(null, null, OreBracketHandler.getOre("gearTungstenSteel"),
                        ItemBracketHandler.getItem("Forestry:alveary", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32675),
                        ItemBracketHandler.getItem("Forestry:alveary", 3),
                        OreBracketHandler.getOre("gearTungstenSteel"), null, null), arrayOfNulls(9), arrayOfNulls(9)))
        ExtremeCrafting.addShaped(item3, arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                arrayOf(null, null, item16, OreBracketHandler.getOre("plateMysteriousCrystal"), item17,
                        OreBracketHandler.getOre("plateMysteriousCrystal"), item16, null, null),
                arrayOf(null, null, ore4, item14, ItemBracketHandler.getItem("gregtech:gt.comb", 79), item14, ore4,
                        null, null),
                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32656), item15,
                        item21, item15, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32656), null, null),
                arrayOf(null, null, ore4, item14, ItemBracketHandler.getItem("gregtech:gt.comb", 79), item14, ore4,
                        null, null),
                arrayOf(null, null, item16, OreBracketHandler.getOre("plateMysteriousCrystal"), item17,
                        OreBracketHandler.getOre("plateMysteriousCrystal"), item16, null, null), arrayOfNulls(9),
                arrayOfNulls(9)))
        MineTweakerAPI.recipes.addShaped(item4,
                arrayOf(arrayOf(item17, ore4, item17), arrayOf<IIngredient>(item14, item21, item14),
                        arrayOf(ore4, item15, ore4)), null)
        MineTweakerAPI.recipes.addShaped(item5,
                arrayOf(arrayOf<IIngredient>(item17, item14, item17), arrayOf<IIngredient>(item26, item21, item26),
                        arrayOf(ore4, item15, ore4)), null)
        ExtremeCrafting.addShaped(item6, arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                arrayOf(null, null, ore2, OreBracketHandler.getOre("plateCosmicNeutronium"), item15,
                        OreBracketHandler.getOre("plateCosmicNeutronium"), ore2, null, null),
                arrayOf(null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
                        ItemBracketHandler.getItem("gregtech:gt.comb", 85), item17,
                        ItemBracketHandler.getItem("gregtech:gt.comb", 85),
                        OreBracketHandler.getOre("plateCosmicNeutronium"), null, null),
                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32657), item17,
                        item3, item17, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32657), null, null),
                arrayOf(null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
                        ItemBracketHandler.getItem("gregtech:gt.comb", 85), item17,
                        ItemBracketHandler.getItem("gregtech:gt.comb", 85),
                        OreBracketHandler.getOre("plateCosmicNeutronium"), null, null),
                arrayOf(null, null, ore2, OreBracketHandler.getOre("plateCosmicNeutronium"), item15,
                        OreBracketHandler.getOre("plateCosmicNeutronium"), ore2, null, null), arrayOfNulls(9),
                arrayOfNulls(9)))
        MineTweakerAPI.recipes.addShaped(item7,
                arrayOf(arrayOf<IIngredient>(ore4, ore17, ore4), arrayOf<IIngredient>(item29, item21, item29),
                        arrayOf(ore4, item15, ore4)), null)
        MineTweakerAPI.recipes.addShaped(item8,
                arrayOf(arrayOf<IIngredient>(item29, item14, item29), arrayOf<IIngredient>(item17, item21, item17),
                        arrayOf(ore4, item15, ore4)), null)
        MineTweakerAPI.recipes.addShaped(item9,
                arrayOf(arrayOf(item31, ore4, item31), arrayOf<IIngredient>(item17, item21, item17),
                        arrayOf(ore4, item15, ore4)), null)
        MineTweakerAPI.recipes.addShaped(item10,
                arrayOf(arrayOf<IIngredient>(item31, item17, item31), arrayOf<IIngredient>(item15, item21, item15),
                        arrayOf(ore4, item17, ore4)), null)
        MineTweakerAPI.recipes.addShaped(item14,
                arrayOf(arrayOf(ore13, ItemBracketHandler.getItem("gregtech:gt.comb", 78), ore13),
                        arrayOf<IIngredient>(item27, item45, item27), arrayOf<IIngredient>(ore13, ore16, ore13)), null)
        MineTweakerAPI.recipes.addShaped(item15,
                arrayOf(arrayOf(ore11, ItemBracketHandler.getItem("gregtech:gt.comb", 79), ore11),
                        arrayOf(item27, OreBracketHandler.getOre("circuitMaster"), item27),
                        arrayOf(ore5, item30, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 17),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item32, item19, item32),
                        arrayOf(ore5, item18, ore5)), null)

        //TODO Replace ("ExtraUtilities:decorativeBlock2", 7) in item33
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 11),
        //        arrayOf(arrayOf(ore3, item33, ore3), arrayOf<IIngredient>(item33, item19, item33),
        //                arrayOf(ore5, item33, ore5)), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 2),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("minecraft:red_flower", 0), ore3),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Botany:pollen", OreDictionary.WILDCARD_VALUE), item19,
                                ItemBracketHandler.getItem("Botany:pollen", OreDictionary.WILDCARD_VALUE)),
                        arrayOf(ore5, ItemBracketHandler.getItem("minecraft:yellow_flower", 0), ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 20),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item41, item19, item41),
                        arrayOf(ore5, item18, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 5),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item34, item19, item34),
                        arrayOf(ore5, item37, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 14),
                arrayOf(arrayOf<IIngredient>(ore3, ore, ore3),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:redstone_torch", 0), item19,
                                ItemBracketHandler.getItem("minecraft:redstone_torch", 0)),
                        arrayOf(ore5, item28, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 4),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item35, item19, item35),
                        arrayOf(ore5, item36, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 13),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item38, item19, item39),
                        arrayOf(ore5, item18, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 22),
                arrayOf(arrayOf(ore3, item44, ore3), arrayOf<IIngredient>(item46, item19, item46),
                        arrayOf(ore5, item44, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 16),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item34, item19, item34),
                        arrayOf(ore5, item18, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 7),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item40, item19, item40),
                        arrayOf(ore5, item41, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 1),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("minecraft:fermented_spider_eye", 0), ore3),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:jarFilled", 1), item19,
                                ItemBracketHandler.getItem("BiomesOPlenty:jarFilled", 1)),
                        arrayOf(ore5, ItemBracketHandler.getItem("minecraft:fermented_spider_eye", 0), ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 10),
                arrayOf(arrayOf<IIngredient>(ore3, ore18, ore3), arrayOf(ore19, item19, ore19),
                        arrayOf<IIngredient>(ore5, ore18, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 19),
                arrayOf(arrayOf(ore3, item17, ore3), arrayOf(ore8, item19, ore8), arrayOf(ore5, item17, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 18),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item42, item19, item42),
                        arrayOf(ore5, item18, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 3),
                arrayOf(arrayOf<IIngredient>(ore3, ore10, ore3), arrayOf(ore9, item19, ore9),
                        arrayOf<IIngredient>(ore5, ore10, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 21),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item36, item19, item36),
                        arrayOf(ore5, item18, ore5)), null)

        //TODO Replace ("TConstruct:GlassPane", 0) in item25
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 12),
        //        arrayOf(arrayOf(ore3,
        //                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 27), ore3),
        //                arrayOf<IIngredient>(item25, item19, item25), arrayOf(ore5, item25, ore5)), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 6),
                arrayOf(arrayOf(ore3, item20, ore3), arrayOf<IIngredient>(item43, item19, item43),
                        arrayOf(ore5, item37, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 15),
                arrayOf(arrayOf(ore3, item22, ore3), arrayOf<IIngredient>(item44, item19, item44),
                        arrayOf(ore5, item22, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ApiaryUpgrade", 0),
                arrayOf(arrayOf(ore3, item47, ore3), arrayOf<IIngredient>(item23, item19, item23),
                        arrayOf(ore5, item47, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:IndustrialGrafter", 100),
                arrayOf(arrayOf(ore12, item24, ore12), arrayOf(ore5, item15, ore5),
                        arrayOf<IIngredient>(ore7, OreBracketHandler.getOre("batteryBasic"), ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:IndustrialScoop", 100),
                arrayOf(arrayOf<IIngredient>(ore12, ore15, ore12), arrayOf(ore5, item15, ore5),
                        arrayOf<IIngredient>(ore7, OreBracketHandler.getOre("batteryBasic"), ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gendustry:ClimateModule", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.comb", 70), item49,
                        ItemBracketHandler.getItem("gregtech:gt.comb", 77)), arrayOf<IIngredient>(ore14, ore6, ore14),
                        arrayOf<IIngredient>(item27, item30, item27)), null)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("gendustry:GeneSampleBlank", 0),
                ItemBracketHandler.getItem("gendustry:GeneSample", 0), 0.0)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("gendustry:GeneTemplate", 0),
                ItemBracketHandler.getItem("gendustry:GeneTemplate", 0), 0.0)
        Assembler.addRecipe(item13.amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28305),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(576), 200, VoltageLevels.IV)
        Assembler.addRecipe(item11, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17057).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2308),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 100, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gendustry:GeneTemplate", 0),
                ItemBracketHandler.getItem("gendustry:GeneSampleBlank", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 400, VoltageLevels.IV)
        Assembler.addRecipe(item16, item48, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18052),
                LiquidBracketHandler.getLiquid("molten.plutonium").withAmount(576), 300, VoltageLevels.IV)
        Assembler.addRecipe(item17, ItemBracketHandler.getItem("dreamcraft:item.GeneticCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                LiquidBracketHandler.getLiquid("mutagen").withAmount(500), 400, VoltageLevels.IV)
        Assembler.addRecipe(item17, ItemBracketHandler.getItem("dreamcraft:item.GeneticCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084),
                LiquidBracketHandler.getLiquid("mutagen").withAmount(500), 400, VoltageLevels.IV)
        Assembler.addRecipe(item17, ItemBracketHandler.getItem("dreamcraft:item.GeneticCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086),
                LiquidBracketHandler.getLiquid("mutagen").withAmount(500), 400, VoltageLevels.IV)
        Assembler.addRecipe(item17, ItemBracketHandler.getItem("dreamcraft:item.GeneticCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089),
                LiquidBracketHandler.getLiquid("mutagen").withAmount(500), 400, VoltageLevels.IV)
        Assembler.addRecipe(item18, ItemBracketHandler.getItem("dreamcraft:item.EnvironmentalCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                LiquidBracketHandler.getLiquid("liquiddna").withAmount(500), 400, VoltageLevels.IV)
        Assembler.addRecipe(item18, ItemBracketHandler.getItem("dreamcraft:item.EnvironmentalCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084),
                LiquidBracketHandler.getLiquid("liquiddna").withAmount(500), 400, VoltageLevels.IV)
        Assembler.addRecipe(item18, ItemBracketHandler.getItem("dreamcraft:item.EnvironmentalCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086),
                LiquidBracketHandler.getLiquid("liquiddna").withAmount(500), 400, VoltageLevels.IV)
        Assembler.addRecipe(item18, ItemBracketHandler.getItem("dreamcraft:item.EnvironmentalCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089),
                LiquidBracketHandler.getLiquid("liquiddna").withAmount(500), 400, VoltageLevels.IV)
        Assembler.addRecipe(item19, ItemBracketHandler.getItem("dreamcraft:item.IndustryFrame", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32087),
                LiquidBracketHandler.getLiquid("mutagen").withAmount(100), 400, VoltageLevels.IV)
        Assembler.addRecipe(item19, ItemBracketHandler.getItem("dreamcraft:item.IndustryFrame", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32092),
                LiquidBracketHandler.getLiquid("mutagen").withAmount(100), 400, VoltageLevels.IV)
        Assembler.addRecipe(item19, ItemBracketHandler.getItem("dreamcraft:item.IndustryFrame", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32096),
                LiquidBracketHandler.getLiquid("mutagen").withAmount(100), 400, VoltageLevels.IV)
        Assembler.addRecipe(item19, ItemBracketHandler.getItem("dreamcraft:item.IndustryFrame", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706),
                LiquidBracketHandler.getLiquid("mutagen").withAmount(100), 400, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gendustry:EjectCover", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17052),
                ItemBracketHandler.getItem("IC2:upgradeModule", 3), 200, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gendustry:ImportCover", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17052),
                ItemBracketHandler.getItem("IC2:upgradeModule", 6), 200, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gendustry:ErrorSensorCover", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17052),
                ItemBracketHandler.getItem("IC2:upgradeModule", 5), 200, VoltageLevels.IV)
    }
}