package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.CuttingSaw
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class ThaumicBases01Main : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6)
        val item2 = ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0)
        val item3 = ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1)
        val item4 = ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)
        val item5 = ItemBracketHandler.getItem("thaumicbases:resource", 2)
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:relocator", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:relocator", 6))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:advAlchFurnace", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:thaumicAnvil", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:resource", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:bloodyChest", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:bloodyLeggings", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:bloodyBoots", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:spike", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:spike", 2))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:voidAnvil", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:voidSeed", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:fociExperience", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:fociActivation", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:fociDrain", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:fociFlux", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:cryingObsidian", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:castingBracelet", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:castingBracelet", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:nodeFoci", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:nodeManipulator", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:resource", 4))
        Infusion.removeRecipe(ItemBracketHandler.getItem("thaumicbases:entityDeconstructor", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:nodeLinker", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("thaumicbases:crystalSlab", OreDictionary.WILDCARD_VALUE), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("thaumicbases:genericSlab", OreDictionary.WILDCARD_VALUE), null)
        Arcane.addShaped("TB.Relocator", ItemBracketHandler.getItem("thaumicbases:relocator", 0),
                "aer 20, terra 10, aqua 5", arrayOf(arrayOf(item, OreBracketHandler.getOre("plateInfusedAir"), item),
                arrayOf(item3, OreBracketHandler.getOre("rotorThaumium"), item3),
                arrayOf(item, OreBracketHandler.getOre("plateInfusedWater"), item)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("thaumicbases:relocator", 0),
                arrayOf<IIngredient>(item3, ItemBracketHandler.getItem("thaumicbases:relocator", 6), item3), null)
        Arcane.addShaped("TB.Relocator", ItemBracketHandler.getItem("thaumicbases:relocator", 6),
                "aer 20, terra 10, aqua 5", arrayOf(arrayOf(item, OreBracketHandler.getOre("plateInfusedWater"), item),
                arrayOf(item2, OreBracketHandler.getOre("rotorThaumium"), item2),
                arrayOf(item, OreBracketHandler.getOre("plateInfusedAir"), item)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("thaumicbases:relocator", 6),
                arrayOf<IIngredient>(item2, ItemBracketHandler.getItem("thaumicbases:relocator", 0), item2), null)
        Infusion.addRecipe("TB.AdvAlc", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 0),
                arrayOf(ItemBracketHandler.getItem("Railcraft:machine.beta", 4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22305),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22305)),
                "ignis 48, potentia 32, machina 16, metallum 16, praecantatio 24",
                ItemBracketHandler.getItem("thaumicbases:advAlchFurnace", 0), 6)
        Arcane.addShaped("TB.ThaumicAnvil", ItemBracketHandler.getItem("thaumicbases:thaumicAnvil", 0),
                "aer 50, ignis 50, aqua 50, terra 50, ordo 50, perditio 50",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("blockThaumium"),
                        OreBracketHandler.getOre("blockThaumium"), OreBracketHandler.getOre("blockThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                                OreBracketHandler.getOre("blockThaumium"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("blockThaumium"), OreBracketHandler.getOre("plateThaumium"))))
        Infusion.addRecipe("ROD_tbthaumium", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330),
                arrayOf(item4, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330), item4,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330), item4,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330), item4,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330), item4,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330), item4,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330)),
                "praecantatio 32, auram 16, metallum 16, vitreus 16, instrumentum 32",
                ItemBracketHandler.getItem("thaumicbases:resource", 3), 6)
        Arcane.addShaped("TB.BloodyRobes", ItemBracketHandler.getItem("thaumicbases:bloodyChest", 0),
                "aer 25, ignis 25, aqua 25, ordo 25",
                arrayOf(arrayOf(ItemBracketHandler.getItem("thaumicbases:resource", 8),
                        OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("thaumicbases:resource", 8)),
                        arrayOf(ItemBracketHandler.getItem("thaumicbases:resource", 8),
                                OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("thaumicbases:resource", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicbases:resource", 8),
                                ItemBracketHandler.getItem("thaumicbases:resource", 8),
                                ItemBracketHandler.getItem("thaumicbases:resource", 8))))
        Arcane.addShaped("TB.BloodyRobes", ItemBracketHandler.getItem("thaumicbases:bloodyLeggings", 0),
                "aer 25, ignis 25, aqua 25, perditio 25",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicbases:resource", 8),
                        ItemBracketHandler.getItem("thaumicbases:resource", 8),
                        ItemBracketHandler.getItem("thaumicbases:resource", 8)),
                        arrayOf(ItemBracketHandler.getItem("thaumicbases:resource", 8),
                                OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("thaumicbases:resource", 8)),
                        arrayOf(ItemBracketHandler.getItem("thaumicbases:resource", 8),
                                OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("thaumicbases:resource", 8))))
        Arcane.addShaped("TB.BloodyRobes", ItemBracketHandler.getItem("thaumicbases:bloodyBoots", 0),
                "aer 25, ignis 25, aqua 25, terra 25", arrayOf(arrayOfNulls(3),
                arrayOf(ItemBracketHandler.getItem("thaumicbases:resource", 8),
                        OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("thaumicbases:resource", 8)),
                arrayOf(ItemBracketHandler.getItem("thaumicbases:resource", 8),
                        OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("thaumicbases:resource", 8))))
        Arcane.addShaped("TB.Spike.Iron", ItemBracketHandler.getItem("thaumicbases:spike", 0),
                "perditio 20,ignis 20,aer 15, terra 10",
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSaw"), null,
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("ingotSteel"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotSteel"),
                                OreBracketHandler.getOre("blockSteel"), OreBracketHandler.getOre("ingotSteel"))))
        Arcane.addShaped("TB.Spike.Thaumic", ItemBracketHandler.getItem("thaumicbases:spike", 2),
                "perditio 50,ignis 50,aer 30, terra 20",
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSaw"), null,
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("screwThaumium"),
                                OreBracketHandler.getOre("ingotThaumium"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotThaumium"),
                                OreBracketHandler.getOre("blockThaumium"), OreBracketHandler.getOre("ingotThaumium"))))
        Infusion.addRecipe("TB.Spike.Void", ItemBracketHandler.getItem("thaumicbases:spike", 2),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 14970),
                        ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0),
                        ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 14970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "telum 32, instrumentum 32, tenebrae 16, alienis 16, metallum 16, mortuus 16",
                ItemBracketHandler.getItem("thaumicbases:spike", 4), 5)
        Infusion.addRecipe("TB.VoidAnvil", ItemBracketHandler.getItem("thaumicbases:thaumicAnvil", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("thaumicbases:voidBlock", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("thaumicbases:voidBlock", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("thaumicbases:voidBlock", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("thaumicbases:voidBlock", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "telum 32, instrumentum 32, fabrico 32, alienis 32, tenebrae 16, vacuos 16, metallum 16, praecantatio 16",
                ItemBracketHandler.getItem("thaumicbases:voidAnvil", 0), 9)
        Infusion.addRecipe("TB.VoidSeed", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17),
                arrayOf(ItemBracketHandler.getItem("thaumicbases:lazulliaSeeds", 0),
                        ItemBracketHandler.getItem("thaumicbases:lucriteSeeds", 0),
                        ItemBracketHandler.getItem("thaumicbases:redlonSeeds", 0),
                        ItemBracketHandler.getItem("thaumicbases:rainbowCactus", 0),
                        ItemBracketHandler.getItem("thaumicbases:metalleatSeeds", 0),
                        ItemBracketHandler.getItem("thaumicbases:plaxSeed", 0),
                        ItemBracketHandler.getItem("thaumicbases:briar", 0),
                        ItemBracketHandler.getItem("thaumicbases:aurelia", 0),
                        ItemBracketHandler.getItem("thaumicbases:ashroom", 0),
                        ItemBracketHandler.getItem("thaumicbases:knoseSeed", 0),
                        ItemBracketHandler.getItem("thaumicbases:flaxium", 0),
                        ItemBracketHandler.getItem("thaumicbases:glieoniaSeed", 0)),
                "messis 64, herba 64, victus 32, auram 32, praecantatio 16, alienis 16, tenebrae 16, desidia 8, nebrisum 8",
                ItemBracketHandler.getItem("thaumicbases:voidSeed", 0), 10)
        Infusion.addRecipe("CAP_thauminite", ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                arrayOf(ItemBracketHandler.getItem("thaumicbases:resource", 1), item4,
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("thaumicbases:resource", 1), item4,
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("thaumicbases:resource", 1), item4,
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3)),
                "praecantatio 32, auram 16, metallum 16, vitreus 16, instrumentum 32", item5, 6)
        Infusion.addRecipe("TB.Foci.Experience", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24501),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                "lucrum 32, vitreus 32, cognitio 16, permutatio 16",
                ItemBracketHandler.getItem("thaumicbases:fociExperience", 0), 6)
        Infusion.addRecipe("TB.Foci.Activation", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24545),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32680),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32690),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
                "motus 32, vitreus 32, iter 16, sensus 16",
                ItemBracketHandler.getItem("thaumicbases:fociActivation", 0), 4)

        //TODO Replace ("ExtraUtilities:trashcan", 1)
        //Infusion.addRecipe("TB.Foci.Drain", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24543),
        //        arrayOf(ItemBracketHandler.getItem("minecraft:bucket", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
        //                ItemBracketHandler.getItem("Thaumcraft:blockJar", 3),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
        //                ItemBracketHandler.getItem("irontank:ironTank", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
        //                ItemBracketHandler.getItem("ExtraUtilities:trashcan", 1),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)), "vacuos 32, perditio 32, aqua 16",
        //        ItemBracketHandler.getItem("thaumicbases:fociDrain", 0), 5)

        Infusion.addRecipe("TB.Foci.Flux", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24533),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                "vitium 32, perditio 32, ordo 16, praecantatio 16, sano 16",
                ItemBracketHandler.getItem("thaumicbases:fociFlux", 0), 7)

        //TODO Replace ("miscutils:blockCompressedObsidian", 1)
        //Infusion.addRecipe("TB.CryingObs", ItemBracketHandler.getItem("miscutils:blockCompressedObsidian", 1),
        //        arrayOf(ItemBracketHandler.getItem("IC2:itemDensePlates", 8),
        //                ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersBed", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22330)),
        //        "iter 32,vinculum 32, desidia 16,sensus 16",
        //        ItemBracketHandler.getItem("thaumicbases:cryingObsidian", 0), 5)

        Infusion.addRecipe("TB.TaintFlask", ItemBracketHandler.getItem("Thaumcraft:ItemBottleTaint", 0),
                arrayOf(ItemBracketHandler.getItem("thaumicbases:knoseFragment", 7), item4,
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 7), item4,
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 7)),
                "vitium 64,venenum 32, perditio 16", ItemBracketHandler.getItem("thaumicbases:concentratedTaint", 0),
                10)
        Infusion.addRecipe("TB.EntityDec", ItemBracketHandler.getItem("Thaumcraft:blockTable", 14),
                arrayOf(ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24540),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24541),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24543),
                        ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24542),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24544),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24545)),
                "cognitio 32, spiritus 24, mortuus 16, praecantatio 16",
                ItemBracketHandler.getItem("thaumicbases:entityDeconstructor", 0), 5)
        Infusion.addRecipe("ROD_tbvoid", ItemBracketHandler.getItem("thaumicbases:resource", 3),
                arrayOf(ItemBracketHandler.getItem("thaumicbases:knoseFragment", 7),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 7),
                        ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 7),
                        ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "praecantatio 64, auram 32, vitreus 16, instrumentum 32, potentia 40,vacuos 24",
                ItemBracketHandler.getItem("thaumicbases:resource", 4), 8)
        Infusion.addRecipe("TB.NodeMan", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 11),
                arrayOf(ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32683),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17362),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 10),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32693),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32693),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 10),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17362),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32683)),
                "alienis 64,auram 48,praecantatio 40, potentia 32, vacuos 32, tenebrae 24",
                ItemBracketHandler.getItem("thaumicbases:nodeManipulator", 0), 9)
        Infusion.addRecipe("TB.NodeLinker", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 11),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32681),
                        ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassLense", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassLense", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32681)),
                "potentia 64,machina 48,instrumentum 40, ordo 32, electrum 32",
                ItemBracketHandler.getItem("thaumicbases:nodeLinker", 0), 5)
        Arcane.addShaped("TB.Bracelet.Iron", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 0),
                "aer 30, ignis 30, aqua 30, terra 30, ordo 30, perditio 30",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("TwilightForest:item.nagaScale", 0),
                        OreBracketHandler.getOre("screwAluminium")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandCap", 0),
                                OreBracketHandler.getOre("stickIron"),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltIron"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltIron"))))
        Arcane.addShaped("TB.Bracelet.Gold", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 1),
                "aer 60, ignis 60, aqua 60, terra 60, ordo 60, perditio 60",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                        ItemBracketHandler.getItem("dreamcraft:item.LichBone", 0),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandCap", 1),
                                OreBracketHandler.getOre("stickGold"),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltGold"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltGold"))))
        Arcane.addShaped("TB.Bracelet.Greatwood", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 2),
                "aer 90, ignis 90, aqua 90, terra 90, ordo 90, perditio 90",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                        ItemBracketHandler.getItem("dreamcraft:item.LichBone", 0),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 1),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltRoseGold"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltRoseGold"))))
        Arcane.addShaped("TB.Bracelet.Reed", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 5),
                "aer 120,ignis 120, aqua 120, terra 120, ordo 120, perditio 120",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTitanium"),
                        ItemBracketHandler.getItem("TwilightForest:item.fieryBlood", 0),
                        OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 5),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltThaumium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltThaumium"))))
        Arcane.addShaped("TB.Bracelet.Bone", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 6),
                "aer 120,ignis 120, aqua 120, terra 120, ordo 120, perditio 120",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTitanium"),
                        ItemBracketHandler.getItem("TwilightForest:item.fieryBlood", 0),
                        OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 7),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltThaumium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltThaumium"))))
        Arcane.addShaped("TB.Bracelet.Obsidian", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 7),
                "aer 120,ignis 120, aqua 120, terra 120, ordo 120, perditio 120",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTitanium"),
                        ItemBracketHandler.getItem("TwilightForest:item.fieryBlood", 0),
                        OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 1),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltThaumium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltThaumium"))))
        Arcane.addShaped("TB.Bracelet.Blaze", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 8),
                "aer 120,ignis 120, aqua 120, terra 120, ordo 120, perditio 120",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTitanium"),
                        ItemBracketHandler.getItem("TwilightForest:item.fieryBlood", 0),
                        OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 6),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltThaumium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltThaumium"))))
        Arcane.addShaped("TB.Bracelet.Ice", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 9),
                "aer 120,ignis 120, aqua 120, terra 120, ordo 120, perditio 120",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTitanium"),
                        ItemBracketHandler.getItem("TwilightForest:item.fieryBlood", 0),
                        OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 3),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltThaumium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltThaumium"))))
        Arcane.addShaped("TB.Bracelet.Quartz", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 10),
                "aer 120,ignis 120, aqua 120, terra 120, ordo 120, perditio 120",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTitanium"),
                        ItemBracketHandler.getItem("TwilightForest:item.fieryBlood", 0),
                        OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 4),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltThaumium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltThaumium"))))
        Arcane.addShaped("TB.Bracelet.Thaumium", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 3),
                "aer 135,ignis 135, aqua 135, terra 135, ordo 135, perditio 135",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTitanium"),
                        ItemBracketHandler.getItem("TwilightForest:item.fieryTears", 0),
                        OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(item5, ItemBracketHandler.getItem("thaumicbases:resource", 3), item5),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltThaumium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltThaumium"))))
        Arcane.addShaped("TB.Bracelet.Silverwood", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 4),
                "aer 150,ignis 150, aqua 150, terra 150, ordo 150, perditio 150",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTungstenSteel"),
                        ItemBracketHandler.getItem("TwilightForest:item.carminite", 0),
                        OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 7),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 7)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltVoid"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltVoid"))))
        Arcane.addShaped("TB.Bracelet.Void", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 11),
                "aer 150,ignis 150, aqua 150, terra 150, ordo 150, perditio 150",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTungstenSteel"),
                        ItemBracketHandler.getItem("TwilightForest:item.carminite", 0),
                        OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandCap", 7),
                                ItemBracketHandler.getItem("thaumicbases:resource", 4),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 7)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltVoid"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("boltVoid"))))
        Infusion.addRecipe("TB.Bracelet.Primal", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 4),
                arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 4),
                        ItemBracketHandler.getItem("dreamcraft:item.SnowQueenBlood", 0),
                        ItemBracketHandler.getItem("thaumicbases:castingBracelet", 5),
                        ItemBracketHandler.getItem("thaumicbases:castingBracelet", 6),
                        ItemBracketHandler.getItem("thaumicbases:castingBracelet", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27084),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27084),
                        ItemBracketHandler.getItem("thaumicbases:castingBracelet", 8),
                        ItemBracketHandler.getItem("thaumicbases:castingBracelet", 9),
                        ItemBracketHandler.getItem("thaumicbases:castingBracelet", 10),
                        ItemBracketHandler.getItem("dreamcraft:item.SnowQueenBlood", 0)),
                "aer 64, ignis 64, aqua 64, terra 64, ordo 64, perditio 64, praecantatio 32, alienis 32",
                ItemBracketHandler.getItem("thaumicbases:castingBracelet", 12), 10)
        Infusion.addRecipe("TB.NodeFoci.Bright", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                        ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                        ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                        ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                        ItemBracketHandler.getItem("thaumicbases:blockSalisMundus", 0)),
                "auram 256 ,lux 192, potentia 128, superbia 64 ,nebrisum 32",
                ItemBracketHandler.getItem("thaumicbases:nodeFoci", 0), 10)

        //TODO Replace ("miscutils:blockCompressedObsidian", 1)
        //Infusion.addRecipe("TB.NodeFoci.Destr", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:FocusPrimal", 0),
        //                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 5),
        //                ItemBracketHandler.getItem("miscutils:blockCompressedObsidian", 1),
        //                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 5),
        //                ItemBracketHandler.getItem("miscutils:blockCompressedObsidian", 1),
        //                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 5),
        //                ItemBracketHandler.getItem("miscutils:blockCompressedObsidian", 1),
        //                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 5)),
        //        "auram 128 ,perditio 96, vacuos 64, mortuus 32", ItemBracketHandler.getItem("thaumicbases:nodeFoci", 1),
        //        8)

        Infusion.addRecipe("TB.NodeFoci.Efficiency", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 1)),
                "auram 128 ,potentia 96, electrum 64, machina 64",
                ItemBracketHandler.getItem("thaumicbases:nodeFoci", 2), 7)
        Infusion.addRecipe("TB.NodeFoci.Hunger", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                        ItemBracketHandler.getItem("thaumicbases:voidBlock", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 11),
                        ItemBracketHandler.getItem("thaumicbases:voidBlock", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 11),
                        ItemBracketHandler.getItem("thaumicbases:voidBlock", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 11),
                        ItemBracketHandler.getItem("thaumicbases:voidBlock", 0)),
                "auram 256 ,fames 192, lucrum 128, vacuos 96, gula 64",
                ItemBracketHandler.getItem("thaumicbases:nodeFoci", 3), 10)
        Infusion.addRecipe("TB.NodeFoci.Unstable", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 2)),
                "auram 128 ,alienis 96, vacuos 64, perditio 32", ItemBracketHandler.getItem("thaumicbases:nodeFoci", 4),
                8)
        Infusion.addRecipe("TB.NodeFoci.Purity", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 1),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 1),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 1),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 6)),
                "auram 128 ,sano 96, victus 64, vitreus 32", ItemBracketHandler.getItem("thaumicbases:nodeFoci", 5), 8)
        Infusion.addRecipe("TB.NodeFoci.Sinister", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemCompassStone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("minecraft:skull", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("minecraft:skull", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("minecraft:skull", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1)),
                "auram 128 ,tenebrae 96, exanimis 64, spiritus 32",
                ItemBracketHandler.getItem("thaumicbases:nodeFoci", 6), 9)
        Infusion.addRecipe("TB.NodeFoci.Speed", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("minecraft:sugar", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 2),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 2),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 2),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 0)),
                "auram 128 ,potentia 96, motus 64, aer 32", ItemBracketHandler.getItem("thaumicbases:nodeFoci", 7), 8)
        Infusion.addRecipe("TB.NodeFoci.Stability", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 4),
                        ItemBracketHandler.getItem("thaumicbases:thauminiteBlock", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 4),
                        ItemBracketHandler.getItem("thaumicbases:thauminiteBlock", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 4),
                        ItemBracketHandler.getItem("thaumicbases:thauminiteBlock", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 4)),
                "auram 128 ,cognitio 96, instrumentum 64, ordo 32",
                ItemBracketHandler.getItem("thaumicbases:nodeFoci", 8), 7)
        Infusion.addRecipe("TB.NodeFoci.Taint", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7),
                        ItemBracketHandler.getItem("thaumicbases:concentratedTaint", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7),
                        ItemBracketHandler.getItem("thaumicbases:concentratedTaint", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7),
                        ItemBracketHandler.getItem("thaumicbases:concentratedTaint", 0),
                        ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7)),
                "auram 256 , vitium 192, venenum 128, perditio 64, strontio 32",
                ItemBracketHandler.getItem("thaumicbases:nodeFoci", 9), 10)
        Crucible.addRecipe("TB.SM", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                "aer 4, aqua 4, ignis 4, praecantatio 4, ordo 4, perditio 4, terra 4")
        Crucible.addRecipe("TB.Amber", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                ItemBracketHandler.getItem("minecraft:sapling", 1), "vinculum 4")
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 0).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:eldritchArk", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 0).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:eldritchArk", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 0).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:eldritchArk", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 1).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldBrick", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 1).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldBrick", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 1).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldBrick", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 2).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldCobble", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 2).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldCobble", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 2).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldCobble", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 3).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldCobbleMossy", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 3).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldCobbleMossy", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 3).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldCobbleMossy", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 4).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldDiamond", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 4).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldDiamond", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 4).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldDiamond", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 5).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldGold", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 5).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldGold", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 5).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldGold", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 6).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldIron", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 6).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldIron", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 6).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldIron", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 7).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldLapis", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 7).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldLapis", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:genericSlab", 7).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:oldLapis", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 0).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 0).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 0).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 1).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 1),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 1).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 1),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 1).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 1),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 2).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 2),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 2).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 2),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 2).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 2),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 3).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 3),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 3).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 3),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 3).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 3),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 4).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 4),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 4).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 4),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 4).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 4),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 5).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 5),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 5).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 5),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 5).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 5),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 6).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 6),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 6).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 6),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 6).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 6),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 7).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 7).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("thaumicbases:crystalSlab", 7).amount(2)),
                ItemBracketHandler.getItem("thaumicbases:crystalBlock", 7),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        Research.refreshResearchRecipe("TB.Relocator")
        Research.clearPages("TB.AdvAlc")
        Research.addPage("TB.AdvAlc", "tb.rec.advAlc.page.0")
        Research.addInfusionPage("TB.AdvAlc", ItemBracketHandler.getItem("thaumicbases:advAlchFurnace", 0))
        Research.refreshResearchRecipe("TB.ThaumicAnvil")
        Warp.addToResearch("TB.ThaumicAnvil", 1)
        Research.clearPages("ROD_tbthaumium")
        Research.addPage("ROD_tbthaumium", "tb.rec.thaumRod.page.0")
        Research.addInfusionPage("ROD_tbthaumium", ItemBracketHandler.getItem("thaumicbases:resource", 3))
        Research.refreshResearchRecipe("TB.BloodyRobes")
        Warp.addToResearch("TB.BloodyRobes", 3)
        Research.refreshResearchRecipe("TB.Spike.Iron")
        Research.refreshResearchRecipe("TB.Spike.Thaumic")
        Warp.addToResearch("TB.Spike.Thaumic", 2)
        Research.clearPages("TB.Spike.Void")
        Research.addPage("TB.Spike.Void", "tb.rec.spikeVoid.page.0")
        Research.addInfusionPage("TB.Spike.Void", ItemBracketHandler.getItem("thaumicbases:spike", 4))
        Warp.addToResearch("TB.Spike.Void", 3)
        Research.refreshResearchRecipe("TB.VoidAnvil")
        Warp.addToResearch("TB.VoidAnvil", 4)
        Research.refreshResearchRecipe("TB.VoidSeed")
        Warp.addToResearch("TB.VoidSeed", 5)
        Research.clearPages("CAP_thauminite")
        Research.addPage("CAP_thauminite", "tb.rec.capthauminite.page.NH.0")
        Research.addPage("CAP_thauminite", "tb.rec.capthauminite.page.NH.1")
        MineTweakerAPI.game.setLocalization("tb.rec.capthauminite.page.NH.0",
                "A thaumaturge always seeks for a way to give discovered materials a real purpose. That metal you've just unlocked, thauminite works just as thaumium, so why not use it as a wand cap ? Well, thauminite doesn't seem to be as bendable as thaumium, due to the high amount of vitreus in it. However, that property can be used to enhance regular thaumium caps. The infusion is capable of turning the thauminite into small pieces, making it able to re-crystalise directly on the thaumium caps. To ensure that cap and thauminite are bound together for  ...forever you'll also need some quicksilver and also a bit of salis mundus to reduce thauminites crystalisation time.")
        Research.addInfusionPage("CAP_thauminite", item5)
        MineTweakerAPI.game.setLocalization("tb.rec.capthauminite.page.NH.1",
                "These new caps seem to better than thaumium caps, but you feel something within them... maybe there is something more to them?")
        Warp.addToResearch("CAP_thauminite", 2)
        Research.refreshResearchRecipe("TB.Foci.Experience")
        Research.refreshResearchRecipe("TB.Foci.Activation")
        Research.refreshResearchRecipe("TB.Foci.Drain")
        Research.refreshResearchRecipe("TB.Foci.Flux")
        Research.refreshResearchRecipe("TB.CryingObs")
        Research.refreshResearchRecipe("TB.Bracelet.Iron")
        Research.refreshResearchRecipe("TB.Bracelet.Gold")
        Research.refreshResearchRecipe("TB.Bracelet.Greatwood")
        Research.refreshResearchRecipe("TB.Bracelet.Thaumium")
        Research.refreshResearchRecipe("TB.Bracelet.Primal")
        Research.clearPages("TB.Bracelet.Silverwood")
        Research.addPage("TB.Bracelet.Silverwood", "tb.rec.bracelet.silverwood.page.0")
        Research.addArcanePage("TB.Bracelet.Silverwood", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 4))
        Research.clearPages("TB.Bracelet.Void")
        Research.addPage("TB.Bracelet.Void", "tb.rec.bracelet.void.page.0")
        Research.addArcanePage("TB.Bracelet.Void", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 11))
        Research.clearPages("TB.Bracelet.Blaze")
        Research.addPage("TB.Bracelet.Blaze", "tb.rec.bracelet.blaze.page.0")
        Research.addArcanePage("TB.Bracelet.Blaze", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 8))
        Research.clearPages("TB.Bracelet.Reed")
        Research.addPage("TB.Bracelet.Reed", "tb.rec.bracelet.reed.page.0")
        Research.addArcanePage("TB.Bracelet.Reed", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 5))
        Research.clearPages("TB.Bracelet.Bone")
        Research.addPage("TB.Bracelet.Bone", "tb.rec.bracelet.bone.page.0")
        Research.addArcanePage("TB.Bracelet.Bone", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 6))
        Research.clearPages("TB.Bracelet.Obsidian")
        Research.addPage("TB.Bracelet.Obsidian", "tb.rec.bracelet.obsidian.page.0")
        Research.addArcanePage("TB.Bracelet.Obsidian", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 7))
        Research.clearPages("TB.Bracelet.Quartz")
        Research.addPage("TB.Bracelet.Quartz", "tb.rec.bracelet.quartz.page.0")
        Research.addArcanePage("TB.Bracelet.Quartz", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 10))
        Research.clearPages("TB.Bracelet.Ice")
        Research.addPage("TB.Bracelet.Ice", "tb.rec.bracelet.ice.page.0")
        Research.addArcanePage("TB.Bracelet.Ice", ItemBracketHandler.getItem("thaumicbases:castingBracelet", 9))
        Research.refreshResearchRecipe("TB.NodeMan")
        Research.refreshResearchRecipe("TB.NodeFoci.Bright")
        Research.refreshResearchRecipe("TB.NodeFoci.Speed")
        Research.refreshResearchRecipe("TB.NodeFoci.Unstable")
        Research.refreshResearchRecipe("TB.NodeFoci.Efficiency")
        Research.refreshResearchRecipe("TB.NodeFoci.Hunger")
        Research.refreshResearchRecipe("TB.NodeFoci.Stability")
        Research.refreshResearchRecipe("TB.NodeFoci.Purity")
        Research.refreshResearchRecipe("TB.NodeFoci.Destr")
        Research.refreshResearchRecipe("TB.NodeFoci.Sinister")
        Research.refreshResearchRecipe("TB.NodeFoci.Taint")
        Research.addResearch("TB.TaintFlask", "THAUMICBASES", "vitium 10, alienis 15, perditio 8, permutatio 12", 1, -1,
                8, ItemBracketHandler.getItem("thaumicbases:concentratedTaint", 0))
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.TB.TaintFlask", "Concentrated Taint")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.TB.TaintFlask", "What could go wrong ?")
        Research.addPage("TB.TaintFlask", "tb.rec.TB.TaintFlask.page.NH.0")
        MineTweakerAPI.game.setLocalization("en_US", "tb.rec.TB.TaintFlask.page.NH.0",
                " Your experiments with taint were quite successful, but you know that you can do much better. So you tried to feed the bottled taint with some vitium essentia. The result is quite nice, it grows and gets even stronger, so why not trying this with a full jar of vitium. Since you definitly dont want to taint you whole home you'll need a controlled enviroment, like the infusion. However, you should better stabilise the flask with some salis mundus, just to make sure that no taint escapes.")
        Research.addInfusionPage("TB.TaintFlask", ItemBracketHandler.getItem("thaumicbases:concentratedTaint", 0))
        Research.addPrereq("TB.TaintFlask", "TB.INFUSION", false)
        Research.addPrereq("TB.TaintFlask", "BOTTLETAINT", true)
        Warp.addToResearch("TB.TaintFlask", 5)
        Warp.addToItem(ItemBracketHandler.getItem("thaumicbases:concentratedTaint", 0), 3)
        Research.refreshResearchRecipe("ROD_tbvoid")
        Warp.addToResearch("ROD_tbvoid", 4)
        Research.refreshResearchRecipe("TB.EntityDec")
        Research.clearPages("TB.NodeLinker")
        Research.addPage("TB.NodeLinker", "tb.rec.nodeLink.page.0")
        Research.addPage("TB.NodeLinker", "tb.rec.nodeLink.page.1")
        Research.addPage("TB.NodeLinker", "tb.rec.nodeLink.page.2")
        Research.addInfusionPage("TB.NodeLinker", ItemBracketHandler.getItem("thaumicbases:nodeLinker", 0))
        Research.refreshResearchRecipe("TB.SM")
        MineTweakerAPI.oreDict["gravel"].remove(ItemBracketHandler.getItem("thaumicbases:oldGravel", 0))
    }
}