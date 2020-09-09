package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyArray
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandByte
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import modtweaker2.mods.thaumcraft.handlers.*
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Thaumcraft05Golemancy : Runnable {
    override fun run() {
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockChestHungry", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:TrunkSpawner", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 9))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", OreDictionary.WILDCARD_VALUE))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 2))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 1))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 3))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 4))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 8))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 10))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 5))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 6))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 9))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 11))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 7))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 4))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 5))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 4))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 5))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 6))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockTaint", 2))
        Arcane.addShaped("HUNGRYCHEST", ItemBracketHandler.getItem("Thaumcraft:blockChestHungry", 0),
                "aer 10, terra 10, ordo 5, perditio 5", arrayOf(arrayOf(OreBracketHandler.getOre("screwThaumium"),
                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 5),
                OreBracketHandler.getOre("screwThaumium")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        OreBracketHandler.getOre("chestWood"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0)),
                arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("screwThaumium"))))
        Research.setAspects("HUNGRYCHEST", "fames 9, vacuos 6, iter 3")
        Research.setComplexity("HUNGRYCHEST", 1)
        Infusion.addRecipe("TRAVELTRUNK", ItemBracketHandler.getItem("Thaumcraft:blockChestHungry", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17306),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28306),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27306),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27306),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28306)),
                "iter 16, motus 16, spiritus 16, vacuos 32", ItemBracketHandler.getItem("Thaumcraft:TrunkSpawner", 0),
                4)
        Research.setAspects("TRAVELTRUNK", "spiritus 12, vacuos 12, arbor 9, iter 6, terra 3")
        Research.setComplexity("TRAVELTRUNK", 3)
        Arcane.addShaped("GOLEMFETTER", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 9),
                "terra 15, ordo 15",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("blockRedstone"), OreBracketHandler.getOre("plateThaumium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6))))
        Research.setAspects("GOLEMFETTER", "vinculum 9, machina 9, cognitio 6, praecantatio 3")
        Research.setComplexity("GOLEMFETTER", 2)
        Crucible.addRecipe("GOLEMSTRAW", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 0),
                ItemBracketHandler.getItem("minecraft:hay_block", 0), "humanus 10, motus 10, spiritus 10")
        Research.setAspects("GOLEMSTRAW", "messis 9, permutatio 9, spiritus 9, motus 6, praecantatio 3")
        Research.setComplexity("GOLEMSTRAW", 2)
        Crucible.addRecipe("GOLEMWOOD", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 1),
                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0), "humanus 14, motus 14, spiritus 14")
        Research.setAspects("GOLEMWOOD", "arbor 12, permutatio 12, spiritus 9, motus 6, praecantatio 3")
        Research.setComplexity("GOLEMWOOD", 3)
        Research.clearPages("GOLEMTALLOW")
        Research.addPage("GOLEMTALLOW", "tc.research_page.GOLEMTALLOW.1")
        Crucible.addRecipe("GOLEMTALLOW", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 2),
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 5), "humanus 26, mortuus 26, spiritus 26")
        Research.addCruciblePage("GOLEMTALLOW", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 2))
        Research.setAspects("GOLEMTALLOW", "spiritus 12, permutatio 12, corpus 12, motus 9, praecantatio 6, corpus 3")
        Research.setComplexity("GOLEMTALLOW", 3)
        Crucible.addRecipe("GOLEMCLAY", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 3),
                ItemBracketHandler.getItem("minecraft:clay", 0), "humanus 20, motus 20, spiritus 20")
        Research.setAspects("GOLEMCLAY", "spiritus 12, permutatio 12, motus 12, terra 9, praecantatio 6, aqua 3")
        Research.setComplexity("GOLEMCLAY", 3)
        Research.clearPages("GOLEMFLESH")
        Research.addPage("GOLEMFLESH", "tc.research_page.GOLEMFLESH.1")
        Crucible.addRecipe("GOLEMFLESH", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 4),
                ItemBracketHandler.getItem("Thaumcraft:blockTaint", 2), "humanus 20, motus 20, spiritus 20")
        Research.addCruciblePage("GOLEMFLESH", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 4))
        Research.setAspects("GOLEMFLESH", "corpus 12, permutatio 12, spiritus 12, motus 9, praecantatio 6, mortuus 3")
        Research.setComplexity("GOLEMFLESH", 3)

        //TODO Replace ("ExtraUtilities:cobblestone_compressed", 0)
        //Crucible.addRecipe("GOLEMSTONE", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 5),
        //        ItemBracketHandler.getItem("ExtraUtilities:cobblestone_compressed", 0),
        //        "humanus 26, mortuus 26, spiritus 26")

        Research.setAspects("GOLEMSTONE", "spiritus 12, permutatio 12, motus 12, terra 9, praecantatio 6, perditio 3")
        Research.setComplexity("GOLEMSTONE", 3)
        Crucible.addRecipe("GOLEMIRON", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 6),
                ItemBracketHandler.getItem("minecraft:iron_block", 0), "humanus 32, mortuus 32, spiritus 32")
        Research.setAspects("GOLEMIRON",
                "permutatio 12, spiritus 12, motus 12, metallum 9, praecantatio 9, terra 6, humanus 3")
        Research.setComplexity("GOLEMIRON", 3)
        Research.clearPages("GOLEMTHAUMIUM")
        Research.addPage("GOLEMTHAUMIUM", "tc.research_page.GOLEMTHAUMIUM.1")
        Crucible.addRecipe("GOLEMTHAUMIUM", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 7),
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 4), "humanus 40, mortuus 40, spiritus 40")
        Research.addCruciblePage("GOLEMTHAUMIUM", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 7))
        Research.setAspects("GOLEMTHAUMIUM",
                "permutatio 12, spiritus 12, metallum 12, motus 9, praecantatio 9, terra 9, humanus 6, alienis 3")
        Research.setComplexity("GOLEMTHAUMIUM", 3)
        Research.setAspects("ADVANCEDGOLEM",
                "sensus 15, victus 15, cognitio 12, potentia 12, praecantatio 12, alienis 9, motus 6, terra 3")
        Research.setComplexity("ADVANCEDGOLEM", 4)
        Arcane.addShaped("COREGATHER", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100),
                "ordo 5, ignis 5, terra 5", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                OreBracketHandler.getOre("ingotBrickNether"), OreBracketHandler.getOre("plateThaumium")),
                arrayOf(OreBracketHandler.getOre("ingotBrick"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        OreBracketHandler.getOre("ingotBrick")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateNetherQuartz"),
                        OreBracketHandler.getOre("ingotBrickNether"), OreBracketHandler.getOre("plateNetherQuartz"))))
        Crucible.addRecipe("COREGATHER", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 2),
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100), "lucrum 10, terra 10")
        Crucible.addRecipe("COREEMPTY", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 1),
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100), "lucrum 10, vacuos 10")
        Research.setAspects("COREEMPTY", "lucrum 9, vacuos 9, permutatio 6, motus 6, praecantatio 3")
        Research.setComplexity("COREEMPTY", 2)
        Crucible.addRecipe("COREFILL", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100), "fames 10, vacuos 10")
        Research.setAspects("COREFILL", "fames 9, vacuos 9, permutatio 9, motus 6, praecantatio 3")
        Research.setComplexity("COREFILL", 2)
        Research.clearPages("COREHARVEST")
        Research.addPage("COREHARVEST", "tc.research_page.COREHARVEST.1")
        Infusion.addRecipe("COREHARVEST", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("minecraft:wheat_seeds", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemHoeThaumium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)), "messis 10, meto 10, herba 20",
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 3), 4)
        Research.addInfusionPage("COREHARVEST", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 3))
        Research.addPage("COREHARVEST", "tc.research_page.COREHARVEST.2")
        Research.setAspects("COREHARVEST", "meto 12, messis 12, iter 9, permutatio 9, motus 6, praecantatio 3")
        Research.setComplexity("COREHARVEST", 3)
        Research.clearPages("COREGUARD")
        Research.addPage("COREGUARD", "tc.research_page.COREGUARD.1")
        Infusion.addRecipe("COREGUARD", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("Thaumcraft:ItemSwordThaumium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)),
                "telum 20, vinculum 20, tutamen 20", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 4), 4)
        Research.addInfusionPage("COREGUARD", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 4))
        Research.addPage("COREGUARD", "tc.research_page.COREGUARD.2")
        Research.setAspects("COREGUARD", "sensus 12, telum 12, vinculum 12, permutatio 9, motus 6, praecantatio 3")
        Research.setComplexity("COREGUARD", 3)
        Infusion.addRecipe("COREUSE", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 1),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26),
                        ItemBracketHandler.getItem("minecraft:lever", 0),
                        ItemBracketHandler.getItem("minecraft:flint_and_steel", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                        ItemBracketHandler.getItem("minecraft:shears", 0)),
                "humanus 20, instrumentum 20, machina 20, lucrum 20",
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 8), 4)
        Research.setAspects("COREUSE", "humanus 12, instrumentum 12, machina 9, permutatio 9, motus 6, praecantatio 3")
        Research.setComplexity("COREUSE", 3)
        Infusion.addRecipe("CORESORTING", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 1),
                        ItemBracketHandler.getItem("minecraft:paper", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 0),
                        ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26)),
                "lucrum 20, fames 20, permutatio 20, vacuos 20",
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 10), 4)
        Research.setAspects("CORESORTING", "fames 12, vacuos 12, lucrum 12, permutatio 9, motus 6, praecantatio 3")
        Research.setComplexity("CORESORTING", 3)
        Research.clearPages("CORELIQUID")
        Research.addPage("CORELIQUID", "tc.research_page.CORELIQUID.1")

        //TODO Replace ("IguanaTweaksTConstruct:clayBucketFired", 0)
        //Infusion.addRecipe("CORELIQUID", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 0),
        //        arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
        //                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
        //                ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketFired", 0),
        //                ItemBracketHandler.getItem("minecraft:bucket", 0),
        //                ItemBracketHandler.getItem("Forestry:canEmpty", 0),
        //                ItemBracketHandler.getItem("IC2:itemFluidCell", 0)), "aqua 20, vacuos 20, metallum 20, iter 20",
        //        ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 5), 4)

        Research.addInfusionPage("CORELIQUID", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 5))
        Research.addPage("CORELIQUID", "tc.research_page.CORELIQUID.2")
        Research.setAspects("CORELIQUID", "iter 12, aqua 12, metallum 9, permutatio 9, motus 6, praecantatio 3")
        Research.setComplexity("CORELIQUID", 3)
        Infusion.addRecipe("COREALCHEMY", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 5),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("minecraft:potion", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("minecraft:potion", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0)),
                "aqua 32, motus 32, praecantatio 32, permutatio 32",
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 6), 7)
        Research.setAspects("COREALCHEMY", "potentia 12, aqua 12, iter 12, praecantatio 9, motus 6, alienis 3")
        Research.setComplexity("COREALCHEMY", 3)
        Research.clearPages("COREBUTCHER")
        Research.addPage("COREBUTCHER", "tc.research_page.COREBUTCHER.1")
        Infusion.addRecipe("COREBUTCHER", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 3),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metatool.01", 36),
                        ItemBracketHandler.getItem("minecraft:iron_sword", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("minecraft:bow", 0),
                        ItemBracketHandler.getItem("minecraft:arrow", 0)), "bestia 32, corpus 32, mortuus 32, telum 32",
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 9), 7)
        Research.addInfusionPage("COREBUTCHER", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 9))
        Research.setAspects("COREBUTCHER", "meto 12, telum 12, bestia 9, sensus 12, motus 6, praecantatio 3")
        Research.setComplexity("COREBUTCHER", 3)
        Warp.addToResearch("COREBUTCHER", 2)
        Infusion.addRecipe("COREFISHING", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 3),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("minecraft:fish", 0),
                        ItemBracketHandler.getItem("minecraft:fish", 2),
                        ItemBracketHandler.getItem("minecraft:fish", 3),
                        ItemBracketHandler.getItem("minecraft:fishing_rod", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metatool.01", 34)),
                "aqua 32, meto 20, bestia 32, fames 32", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 11), 7)
        Research.setAspects("COREFISHING", "fames 12, aqua 12, bestia 12, meto 9, motus 6, praecantatio 3")
        Research.setComplexity("COREFISHING", 3)
        Infusion.addRecipe("CORELUMBER", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 3),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeThaumium", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeThaumium", 0)),
                "arbor 32, instrumentum 32, meto 20, potentia 32",
                ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 7), 7)
        Research.setAspects("CORELUMBER", "potentia 12, arbor 12, instrumentum 9, meto 12, motus 6, praecantatio 3")
        Research.setComplexity("CORELUMBER", 3)
        Research.clearPages("GOLEMBELL")
        Research.addPage("GOLEMBELL", "tc.research_page.GOLEMBELL.1")
        Research.addPage("GOLEMBELL", "tc.research_page.GOLEMBELL.2")
        val s = "GOLEMBELL"
        val item = ItemBracketHandler.getItem("Thaumcraft:GolemBell", 0)
        val hashMap = HashMap<String, IData>()
        val s2 = "markers"
        val array = arrayOf<IData?>(null)
        val n = 0
        val hashMap2 = HashMap<String, IData>()
        hashMap2["side"] = ExpandByte.asData(1.toByte())
        array[n] = ExpandAnyDict.asData(hashMap2)
        hashMap[s2] = ExpandAnyArray.asData(array)
        Arcane.addShaped(s, item.withTag(ExpandAnyDict.asData(hashMap)), "ordo 10, aer 5",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("plateNetherQuartz"), OreBracketHandler.getOre("boltNetherQuartz")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("plateNetherQuartz"),
                                OreBracketHandler.getOre("plateNetherQuartz")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWoodSealed"),
                                OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("craftingToolFile"))))
        val s3 = "GOLEMBELL"
        val item2 = ItemBracketHandler.getItem("Thaumcraft:GolemBell", 0)
        val hashMap3 = HashMap<String, IData>()
        val s4 = "markers"
        val array2 = arrayOf<IData?>(null)
        val n2 = 0
        val hashMap4 = HashMap<String, IData>()
        hashMap4["side"] = ExpandByte.asData(1.toByte())
        array2[n2] = ExpandAnyDict.asData(hashMap4)
        hashMap3[s4] = ExpandAnyArray.asData(array2)
        Research.addArcanePage(s3, item2.withTag(ExpandAnyDict.asData(hashMap3)))
        Arcane.addShaped("UPGRADEAIR", ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 0), "aer 15, ordo 5",
                arrayOf(arrayOf(OreBracketHandler.getOre("nuggetGold"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5), OreBracketHandler.getOre("nuggetGold")),
                        arrayOf(OreBracketHandler.getOre("nuggetThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                                OreBracketHandler.getOre("nuggetThaumium")),
                        arrayOf(OreBracketHandler.getOre("nuggetGold"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5),
                                OreBracketHandler.getOre("nuggetGold"))))
        Research.setAspects("UPGRADEAIR", "motus 9, aer 6, praecantatio 3")
        Research.setComplexity("UPGRADEAIR", 2)
        Arcane.addShaped("UPGRADEEARTH", ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 1),
                "terra 15, ordo 5", arrayOf(arrayOf(OreBracketHandler.getOre("nuggetGold"),
                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5), OreBracketHandler.getOre("nuggetGold")),
                arrayOf(OreBracketHandler.getOre("nuggetThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        OreBracketHandler.getOre("nuggetThaumium")),
                arrayOf(OreBracketHandler.getOre("nuggetGold"), ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5),
                        OreBracketHandler.getOre("nuggetGold"))))
        Research.setAspects("UPGRADEEARTH", "victus 9, terra 6, praecantatio 3")
        Research.setComplexity("UPGRADEEARTH", 2)
        Arcane.addShaped("UPGRADEFIRE", ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 2),
                "ignis 15, ordo 5", arrayOf(arrayOf(OreBracketHandler.getOre("nuggetGold"),
                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5), OreBracketHandler.getOre("nuggetGold")),
                arrayOf(OreBracketHandler.getOre("nuggetThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        OreBracketHandler.getOre("nuggetThaumium")),
                arrayOf(OreBracketHandler.getOre("nuggetGold"), ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5),
                        OreBracketHandler.getOre("nuggetGold"))))
        Research.setAspects("UPGRADEFIRE", "potentia 9, ignis 6, praecantatio 3")
        Research.setComplexity("UPGRADEFIRE", 2)
        Arcane.addShaped("UPGRADEWATER", ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 3),
                "aqua 15, ordo 5", arrayOf(arrayOf(OreBracketHandler.getOre("nuggetGold"),
                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5), OreBracketHandler.getOre("nuggetGold")),
                arrayOf(OreBracketHandler.getOre("nuggetThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        OreBracketHandler.getOre("nuggetThaumium")),
                arrayOf(OreBracketHandler.getOre("nuggetGold"), ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5),
                        OreBracketHandler.getOre("nuggetGold"))))
        Research.setAspects("UPGRADEWATER", "sensus 9, aqua 6, praecantatio 3")
        Research.setComplexity("UPGRADEWATER", 2)
        Arcane.addShaped("UPGRADEORDER", ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 4), "ordo 20",
                arrayOf(arrayOf(OreBracketHandler.getOre("nuggetGold"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5), OreBracketHandler.getOre("nuggetGold")),
                        arrayOf(OreBracketHandler.getOre("nuggetThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                OreBracketHandler.getOre("nuggetThaumium")),
                        arrayOf(OreBracketHandler.getOre("nuggetGold"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5),
                                OreBracketHandler.getOre("nuggetGold"))))
        Research.setAspects("UPGRADEORDER", "cognitio 6, ordo 9, praecantatio 3")
        Research.setComplexity("UPGRADEORDER", 2)
        Arcane.addShaped("UPGRADEENTROPY", ItemBracketHandler.getItem("Thaumcraft:ItemGolemUpgrade", 5),
                "perditio 15, ordo 5", arrayOf(arrayOf(OreBracketHandler.getOre("nuggetGold"),
                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5), OreBracketHandler.getOre("nuggetGold")),
                arrayOf(OreBracketHandler.getOre("nuggetThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        OreBracketHandler.getOre("nuggetThaumium")),
                arrayOf(OreBracketHandler.getOre("nuggetGold"), ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5),
                        OreBracketHandler.getOre("nuggetGold"))))
        Research.setAspects("UPGRADEENTROPY", "cognitio 6, perditio 9, praecantatio 3")
        Research.setComplexity("UPGRADEENTROPY", 2)
        Arcane.addShaped("TINYHAT", ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 0),
                "ordo 10, ignis 10, terra 5",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWoolBlack"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("foilGold"),
                                OreBracketHandler.getOre("foilGold"), OreBracketHandler.getOre("foilGold")),
                        arrayOf(OreBracketHandler.getOre("blockWoolBlack"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                OreBracketHandler.getOre("blockWoolBlack"))))
        Research.setAspects("TINYHAT", "lucrum 9, pannus 9, victus 6, sano 3")
        Research.setComplexity("TINYHAT", 2)
        Arcane.addShaped("TINYGLASSES", ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 1),
                "aer 5, aqua 5, ordo 5", arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickIron"), null,
                OreBracketHandler.getOre("stickIron")),
                arrayOf(OreBracketHandler.getOre("screwIron"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        OreBracketHandler.getOre("screwIron")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("lensGlass"), OreBracketHandler.getOre("boltIron"),
                        OreBracketHandler.getOre("lensGlass"))))
        Research.setAspects("TINYGLASSES", "lucrum 9, pannus 6, sensus 6, ordo 3")
        Research.setComplexity("TINYGLASSES", 2)
        Arcane.addShaped("TINYBOWTIE", ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 2),
                "ordo 5, aer 5, terra 5", arrayOf(arrayOfNulls(3), arrayOf(OreBracketHandler.getOre("blockWoolBlack"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7), OreBracketHandler.getOre("blockWoolBlack")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("blockWoolBlack"), null,
                        OreBracketHandler.getOre("blockWoolBlack"))))
        Research.setAspects("TINYBOWTIE", "lucrum 9, pannus 9, iter 6, potentia 3")
        Research.setComplexity("TINYBOWTIE", 2)
        Arcane.addShaped("TINYFEZ", ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 3),
                "aer 5, aqua 5, terra 5",
                arrayOf(arrayOf(OreBracketHandler.getOre("blockWoolRed"), OreBracketHandler.getOre("blockWoolRed"),
                        ItemBracketHandler.getItem("minecraft:string", 0)),
                        arrayOf(OreBracketHandler.getOre("blockWoolRed"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                ItemBracketHandler.getItem("minecraft:string", 0)),
                        arrayOf(OreBracketHandler.getOre("blockWoolRed"), OreBracketHandler.getOre("blockWoolRed"),
                                ItemBracketHandler.getItem("minecraft:string", 0))))
        Research.setAspects("TINYFEZ", "lucrum 9, pannus 9, potentia 6, sano 3")
        Research.setComplexity("TINYFEZ", 2)
        Arcane.addShaped("TINYDART", ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 4),
                "aer 5, ignis 5, terra 5", arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:arrow", 0),
                OreBracketHandler.getOre("springSmallSteel"), ItemBracketHandler.getItem("minecraft:arrow", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:arrow", 0),
                        ItemBracketHandler.getItem("minecraft:dropper", 0),
                        ItemBracketHandler.getItem("minecraft:arrow", 0)),
                arrayOf(ItemBracketHandler.getItem("minecraft:arrow", 0), OreBracketHandler.getOre("springSmallSteel"),
                        ItemBracketHandler.getItem("minecraft:arrow", 0))))
        Research.setAspects("TINYDART", "lucrum 9, volatus 9, telum 6, potentia 3")
        Research.setComplexity("TINYDART", 2)
        Arcane.addShaped("TINYVISOR", ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 5),
                "aqua 5, ignis 5, terra 5",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("minecraft:iron_helmet", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSteel"),
                                OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateSteel")),
                        arrayOfNulls(3)))
        Research.setAspects("TINYVISOR", "lucrum 9, sensus 9, tutamen 6, cognitio 3")
        Research.setComplexity("TINYVISOR", 2)
        Arcane.addShaped("TINYARMOR", ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 6),
                "ordo 5, ignis 5, terra 10", arrayOf(arrayOfNulls(3), arrayOf(OreBracketHandler.getOre("plateSteel"),
                ItemBracketHandler.getItem("minecraft:iron_chestplate", 0), OreBracketHandler.getOre("plateSteel")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("plateSteel"))))
        Research.setAspects("TINYARMOR", "lucrum 9, metallum 9, tutamen 6, cognitio 3")
        Research.setComplexity("TINYARMOR", 2)
        Arcane.addShaped("TINYHAMMER", ItemBracketHandler.getItem("Thaumcraft:ItemGolemDecoration", 7),
                "ordo 5, ignis 5, terra 10", arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSteel"),
                OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateSteel")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("plateSteel")),
                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickWood"), null)))
        Research.setAspects("TINYHAMMER", "lucrum 9, metallum 9, telum 6, vinculum 3")
        Research.setComplexity("TINYHAMMER", 2)
        Compressor.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTaint", 2),
                ItemBracketHandler.getItem("minecraft:rotten_flesh", 0).amount(9))
        Research.refreshResearchRecipe("HUNGRYCHEST")
        Research.refreshResearchRecipe("TRAVELTRUNK")
        Research.refreshResearchRecipe("GOLEMFETTER")
        Research.refreshResearchRecipe("GOLEMSTRAW")
        Research.refreshResearchRecipe("GOLEMWOOD")
        Research.refreshResearchRecipe("GOLEMTALLOW")
        Research.refreshResearchRecipe("GOLEMCLAY")
        Research.refreshResearchRecipe("GOLEMFLESH")
        Research.refreshResearchRecipe("GOLEMSTONE")
        Research.refreshResearchRecipe("GOLEMIRON")
        Research.refreshResearchRecipe("GOLEMTHAUMIUM")
        Research.refreshResearchRecipe("ADVANCEDGOLEM")
        Research.refreshResearchRecipe("COREGATHER")
        Research.refreshResearchRecipe("COREEMPTY")
        Research.refreshResearchRecipe("COREFILL")
        Research.refreshResearchRecipe("COREHARVEST")
        Research.refreshResearchRecipe("COREGUARD")
        Research.refreshResearchRecipe("COREUSE")
        Research.refreshResearchRecipe("CORESORTING")
        Research.refreshResearchRecipe("CORELIQUID")
        Research.refreshResearchRecipe("COREALCHEMY")
        Research.refreshResearchRecipe("COREBUTCHER")
        Research.refreshResearchRecipe("COREFISHING")
        Research.refreshResearchRecipe("CORELUMBER")
        Research.refreshResearchRecipe("GOLEMBELL")
        Research.refreshResearchRecipe("UPGRADEAIR")
        Research.refreshResearchRecipe("UPGRADEEARTH")
        Research.refreshResearchRecipe("UPGRADEFIRE")
        Research.refreshResearchRecipe("UPGRADEWATER")
        Research.refreshResearchRecipe("UPGRADEORDER")
        Research.refreshResearchRecipe("UPGRADEENTROPY")
        Research.refreshResearchRecipe("TINYHAT")
        Research.refreshResearchRecipe("TINYGLASSES")
        Research.refreshResearchRecipe("TINYBOWTIE")
        Research.refreshResearchRecipe("TINYFEZ")
        Research.refreshResearchRecipe("TINYDART")
        Research.refreshResearchRecipe("TINYVISOR")
        Research.refreshResearchRecipe("TINYARMOR")
        Research.refreshResearchRecipe("TINYHAMMER")
    }
}