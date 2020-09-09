package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.CuttingSaw
import gttweaker.mods.gregtech.machines.PrecisionLaser
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import modtweaker2.mods.thaumcraft.handlers.Warp
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Thaumcraft04Artifice : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemThaumometer", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGoggles", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockTable", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 5))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemChestplateRobe", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsRobe", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemBootsRobe", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 8))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 13))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockLifter", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemArcaneDoor", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ArcaneDoorKey", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ArcaneDoorKey", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemCompassStone", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 14))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:BootsTraveller", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemAmuletRunic", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemAmuletRunic", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemRingRunic", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemRingRunic", 2))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemRingRunic", 3))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGirdleRunic", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGirdleRunic", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 4))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 5))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemHoeElemental", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:HoverHarness", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemGirdleHover", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMirror", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:HandMirror", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMirror", 6))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockJar", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemHelmetFortress", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemChestplateFortress", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsFortress", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemBowBone", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:glass_bottle", 0),
                        ItemBracketHandler.getItem("minecraft:feather", 0), OreBracketHandler.getOre("dyeBlack")),
                false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0),
                        ItemBracketHandler.getItem("minecraft:feather", 0), OreBracketHandler.getOre("dyeBlack")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Thaumcraft:ItemThaumometer", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingGold"),
                                OreBracketHandler.getOre("lensDiamond"), OreBracketHandler.getOre("itemCasingGold")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5))), null)
        Research.clearPages("RESEARCH")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.1")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.2")
        Research.addCraftingPage("RESEARCH", ItemBracketHandler.getItem("Thaumcraft:ItemThaumometer", 0))
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.3")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.4")
        Research.addCraftingPage("RESEARCH", ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0))
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.5")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.6")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.7")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.8")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.9")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.10")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.11")
        Research.addPage("RESEARCH", "tc.research_page.RESEARCH.12")

        //TODO Replace ("harvestcraft:hardenedleatherItem", 0)
        //Arcane.addShaped("GOGGLES", ItemBracketHandler.getItem("Thaumcraft:ItemGoggles", 0),
        //        "aer 30, terra 30, ignis 30, aqua 30, ordo 30, perditio 30",
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                OreBracketHandler.getOre("screwGold"),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("ringGold"),
        //                        OreBracketHandler.getOre("craftingToolScrewdriver"),
        //                        OreBracketHandler.getOre("ringGold")),
        //                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemThaumometer", 0),
        //                        OreBracketHandler.getOre("stickGold"),
        //                        ItemBracketHandler.getItem("Thaumcraft:ItemThaumometer", 0))))
        //Research.setAspects("GOGGLES", "auram 3, praecantatio 9, sensus 9, instrumentum 6")
        //Research.setComplexity("GOGGLES", 2)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Thaumcraft:blockTable", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("screwAnyIron"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("slabWood"))), null)
        Research.clearPages("BASICARTIFACE")
        Research.addPage("BASICARTIFACE", "tc.research_page.BASICARTIFACE.1")
        Arcane.addShaped("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                "aer 50, terra 50, ignis 50, aqua 50, ordo 50, perditio 50",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28351),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28351)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.addArcanePage("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15))
        Arcane.addShaped("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 0),
                "terra 5, ignis 10, ordo 10", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("wireFineGold"),
                OreBracketHandler.getOre("wireFineGold"), OreBracketHandler.getOre("wireFineGold")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("wireFineGold"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("wireFineGold")),
                arrayOf(OreBracketHandler.getOre("screwGold"), ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        OreBracketHandler.getOre("screwGold"))))
        Research.addArcanePage("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 0))
        Arcane.addShaped("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1),
                "terra 10, ignis 10, ordo 5", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                OreBracketHandler.getOre("stickGold"), OreBracketHandler.getOre("screwGold")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("stickGold"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("stickGold")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"), OreBracketHandler.getOre("stickGold"),
                        OreBracketHandler.getOre("screwGold"))))
        Research.addArcanePage("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1))
        Arcane.addShaped("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
                "terra 10, ignis 5, ordo 10", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                OreBracketHandler.getOre("materialHardenedleather"), OreBracketHandler.getOre("screwGold")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("materialHardenedleather"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("materialHardenedleather")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"), OreBracketHandler.getOre("ringGold"),
                        OreBracketHandler.getOre("screwGold"))))
        Research.addArcanePage("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2))
        Arcane.addShaped("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                "aer 30, terra 30, ignis 30,", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("bucketEnder"),
                OreBracketHandler.getOre("gemMercury"), OreBracketHandler.getOre("bucketEnder")),
                arrayOf(OreBracketHandler.getOre("gemMercury"), ItemBracketHandler.getItem("minecraft:glass_pane", 0),
                        OreBracketHandler.getOre("gemMercury")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("bucketEnder"), OreBracketHandler.getOre("gemMercury"),
                        OreBracketHandler.getOre("bucketEnder"))))
        Research.addArcanePage("BASICARTIFACE", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10))
        Arcane.addShaped("ARCANESTONE", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6).amount(8),
                "aer 8, terra 8, ignis 8, aqua 8, ordo 8, perditio 8",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("stone"),
                        OreBracketHandler.getOre("stone")), arrayOf(OreBracketHandler.getOre("stone"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", OreDictionary.WILDCARD_VALUE),
                        OreBracketHandler.getOre("stone")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stone"), OreBracketHandler.getOre("stone"),
                                OreBracketHandler.getOre("stone"))))
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 0).amount(2),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        OreBracketHandler.getOre("craftingToolSaw")), null)
        Research.clearPages("ARCANESTONE")
        Research.addPage("ARCANESTONE", "tc.research_page.ARCANESTONE.1")
        Research.addArcanePage("ARCANESTONE", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6))
        Research.addCraftingPage("ARCANESTONE", ItemBracketHandler.getItem("Thaumcraft:blockStairsArcaneStone", 0))
        Research.addCraftingPage("ARCANESTONE", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 0))
        Arcane.addShaped("INFUSION", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 2),
                "aer 40, terra 40, ignis 40, aqua 40, ordo 40, perditio 40",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                                ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7))))
        Arcane.addShaped("INFUSION", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 1), "aer 20",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6))))
        Research.setAspects("INFUSION", "fabrico 9, machina 9, praecantatio 6, cognitio 6, motus 3")
        Research.setComplexity("INFUSION", 2)
        Research.clearPages("PAVETRAVEL")
        Research.addPage("PAVETRAVEL", "tc.research_page.PAVETRAVEL.1")
        Arcane.addShaped("PAVETRAVEL", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 2).amount(4),
                "aer 12, ordo 12, terra 12", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateInfusedAir"),
                OreBracketHandler.getOre("plateInfusedEarth"), OreBracketHandler.getOre("plateInfusedAir")),
                arrayOf(OreBracketHandler.getOre("plateInfusedEarth"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        OreBracketHandler.getOre("plateInfusedEarth")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateInfusedAir"),
                        OreBracketHandler.getOre("plateInfusedEarth"), OreBracketHandler.getOre("plateInfusedAir"))))
        Research.addArcanePage("PAVETRAVEL", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 2))
        Research.setAspects("PAVETRAVEL", "iter 9, volatus 6, terra 6, motus 3")
        Research.setComplexity("PAVETRAVEL", 2)
        Research.clearPages("PAVEWARD")
        Research.addPage("PAVEWARD", "tc.research_page.PAVEWARD.1")
        Arcane.addShaped("PAVEWARD", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 3).amount(4),
                "ignis 12, ordo 12, terra 12",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateInfusedOrder"),
                        OreBracketHandler.getOre("plateInfusedFire"), OreBracketHandler.getOre("plateInfusedOrder")),
                        arrayOf(OreBracketHandler.getOre("plateInfusedFire"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                OreBracketHandler.getOre("plateInfusedFire")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateInfusedOrder"),
                                OreBracketHandler.getOre("plateInfusedFire"),
                                OreBracketHandler.getOre("plateInfusedOrder"))))
        Research.addArcanePage("PAVEWARD", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 3))
        Research.addPage("PAVEWARD", "tc.research_page.PAVEWARD.2")
        Research.setAspects("PAVEWARD", "motus 6, bestia 9, vinculum 3, telum 6")
        Research.setComplexity("PAVEWARD", 2)
        Research.clearPages("GRATE")
        Research.addPage("GRATE", "tc.research_page.GRATE.1")
        Arcane.addShaped("GRATE", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 5),
                "aer 5, ignis 5, ordo 5", arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"),
                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0), OreBracketHandler.getOre("screwSteel")),
                arrayOf(OreBracketHandler.getOre("wireGt01RedAlloy"),
                        ItemBracketHandler.getItem("dreamcraft:item.AluminiumBars", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        OreBracketHandler.getOre("screwSteel"))))
        Research.addArcanePage("GRATE", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 5))
        Research.clearPages("ENCHFABRIC")
        Research.addPage("ENCHFABRIC", "tc.research_page.ENCHFABRIC.1")

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //Arcane.addShaped("ENCHFABRIC", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //        "aer 5, terra 5, ignis 5, aqua 5, ordo 5, perditio 5",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:string", 0),
        //                ItemBracketHandler.getItem("minecraft:string", 0),
        //                ItemBracketHandler.getItem("minecraft:string", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:string", 0),
        //                        ItemBracketHandler.getItem("minecraft:string", 0),
        //                        ItemBracketHandler.getItem("minecraft:string", 0))))

        Research.setAspects("ENCHFABRIC", "pannus 6, praecantatio 6, tutamen 3")
        Research.setComplexity("ENCHFABRIC", 1)
        Research.addArcanePage("ENCHFABRIC", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7))
        Research.addPage("ENCHFABRIC", "tc.research_page.ENCHFABRIC.2")
        Arcane.addShaped("ENCHFABRIC", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateRobe", 0),
                "aer 15, ignis 15, aqua 15, ordo 15",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7))))
        Research.addArcanePage("ENCHFABRIC", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateRobe", 0))
        Arcane.addShaped("ENCHFABRIC", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsRobe", 0),
                "aer 15, ignis 15, aqua 15, perditio 15",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7))))
        Research.addArcanePage("ENCHFABRIC", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsRobe", 0))
        Arcane.addShaped("ENCHFABRIC", ItemBracketHandler.getItem("Thaumcraft:ItemBootsRobe", 0),
                "aer 15, terra 15, ignis 15, aqua 15", arrayOf(arrayOfNulls(3),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7))))
        Research.addArcanePage("ENCHFABRIC", ItemBracketHandler.getItem("Thaumcraft:ItemBootsRobe", 0))
        Arcane.addShaped("ARCANELAMP", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                "aer 10, perditio 5, ignis 15, aqua 5", arrayOf(arrayOf(OreBracketHandler.getOre("paneGlassColorless"),
                ItemBracketHandler.getItem("minecraft:daylight_detector", 0),
                OreBracketHandler.getOre("paneGlassColorless")), arrayOf(OreBracketHandler.getOre("plateSteel"),
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 0),
                OreBracketHandler.getOre("plateSteel")), arrayOf(OreBracketHandler.getOre("paneGlassColorless"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                OreBracketHandler.getOre("paneGlassColorless"))))
        Research.setAspects("ARCANELAMP", "lux 6, tenebrae 3, sensus 6")
        Research.setComplexity("ARCANELAMP", 1)
        Infusion.addRecipe("LAMPGROWTH", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("minecraft:dye", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("minecraft:dye", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                "herba 20, lux 10, victus 20, messis 10", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 8),
                5)
        Research.setAspects("LAMPGROWTH", "messis 9, lux 3, herba 6, victus 9")
        Research.setComplexity("LAMPGROWTH", 2)
        Infusion.addRecipe("LAMPFERTILITY", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 7),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("minecraft:wheat", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("minecraft:golden_carrot", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)),
                "bestia 20, lux 10, victus 20, sano 10", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 13),
                5)
        Research.setAspects("LAMPFERTILITY", "bestia 9, lux 3, victus 9, sano 6")
        Research.setComplexity("LAMPFERTILITY", 2)
        Arcane.addShaped("LEVITATOR", ItemBracketHandler.getItem("Thaumcraft:blockLifter", 0),
                "aer 20, terra 10, ordo 5",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        OreBracketHandler.getOre("plateInfusedAir"),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                                OreBracketHandler.getOre("rotorThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                                OreBracketHandler.getOre("plateInfusedEarth"),
                                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6))))
        Research.setAspects("LEVITATOR", "aer 3, volatus 6, praecantatio 3, motus 6")
        Research.setComplexity("LEVITATOR", 1)
        Arcane.addShaped("WARDEDARCANA", ItemBracketHandler.getItem("Thaumcraft:ItemArcaneDoor", 0),
                "terra 15, ignis 5, ordo 20, perditio 10",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                                OreBracketHandler.getOre("ringThaumium"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                                OreBracketHandler.getOre("craftingToolSaw"))))
        Research.setAspects("WARDEDARCANA", "tutamen 6, instrumentum 6, machina 6, motus 3")
        Research.setComplexity("WARDEDARCANA", 1)
        Arcane.addShaped("WARDEDARCANA", ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 2),
                "terra 15, ignis 5, ordo 20, perditio 10",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabWood", 0),
                                ItemBracketHandler.getItem("minecraft:heavy_weighted_pressure_plate", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabWood", 0)),
                        arrayOf(OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                                OreBracketHandler.getOre("plateThaumium"))))
        Arcane.addShaped("WARDEDARCANA", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2).amount(4),
                "aer 10, aqua 10, ignis 10, terra 10",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"),
                        OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("blockGlass")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockGlass"),
                                OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("blockGlass"))))
        Arcane.addShaped("WARDEDARCANA", ItemBracketHandler.getItem("Thaumcraft:ArcaneDoorKey", 0).amount(2),
                "aer 5, ignis 5, ordo 5", arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickIron"),
                OreBracketHandler.getOre("stickIron"), OreBracketHandler.getOre("ringIron")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("boltIron"), OreBracketHandler.getOre("boltIron"),
                        OreBracketHandler.getOre("plateSteel")),
                arrayOf(OreBracketHandler.getOre("boltIron"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        null)))
        Arcane.addShaped("WARDEDARCANA", ItemBracketHandler.getItem("Thaumcraft:ArcaneDoorKey", 1).amount(2),
                "aer 10, ignis 10, ordo 10", arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickGold"),
                OreBracketHandler.getOre("stickGold"), OreBracketHandler.getOre("ringGold")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("boltGold"), OreBracketHandler.getOre("boltGold"),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("boltGold"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), null)))
        Arcane.addShaped("ARCANEEAR", ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 1),
                "aer 10, terra 10, ordo 10", arrayOf(arrayOf(OreBracketHandler.getOre("plateThaumium"),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32690),
                OreBracketHandler.getOre("plateThaumium")), arrayOf(OreBracketHandler.getOre("plateGold"),
                ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0), OreBracketHandler.getOre("plateGold")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        OreBracketHandler.getOre("wireGt01RedAlloy"),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6))))
        Research.setAspects("ARCANEEAR", "aer 9, sensus 9, praecantatio 3, potentia 6")
        Research.setComplexity("ARCANEEAR", 2)
        Infusion.addRecipe("SINSTONE", ItemBracketHandler.getItem("minecraft:flint", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 9),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6)),
                "alienis 10, auram 10, sensus 10, tenebrae 10, ordo 10",
                ItemBracketHandler.getItem("Thaumcraft:ItemCompassStone", 0), 4)
        Research.setAspects("SINSTONE", "auram 6, sensus 3, tenebrae 6, alienis 6")
        Research.setComplexity("SINSTONE", 2)
        Warp.addToResearch("SINSTONE", 1)
        Arcane.addShaped("BELLOWS", ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 0), "aer 10, ordo 10",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabWood", 0),
                        OreBracketHandler.getOre("shardAir"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabWood", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                                ItemBracketHandler.getItem("Backpack:tannedLeather", 0)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabWood", 0),
                                OreBracketHandler.getOre("shardAir"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabWood", 0))))
        Research.setAspects("BELLOWS", "motus 6, aer 12, praecantatio 3, machina 9")
        Research.setComplexity("BELLOWS", 2)
        Research.clearPages("FLUXSCRUB")
        Research.addPage("FLUXSCRUB", "tc.research_page.FLUXSCRUB.1")
        Infusion.addRecipe("FLUXSCRUB", ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                "aqua 25, aer 20, praecantatio 15, vinculum 10, vitium 5",
                ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 14), 4)
        Research.addInfusionPage("FLUXSCRUB", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 14))
        Research.setAspects("FLUXSCRUB", "aqua 15, praecantatio 12, aer 9, vinculum 6, vitium 3")
        Research.setComplexity("FLUXSCRUB", 3)
        Infusion.addRecipe("BOOTSTRAVELLER", ItemBracketHandler.getItem("minecraft:leather_boots", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("minecraft:feather", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("minecraft:fish", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                "volatus 25, aer 25, iter 25, aqua 5", ItemBracketHandler.getItem("Thaumcraft:BootsTraveller", 0), 2)
        Research.setAspects("BOOTSTRAVELLER", "aqua 9, iter 15, terra 6, volatus 12, aer 3")
        Research.setComplexity("BOOTSTRAVELLER", 3)
        Infusion.addRecipe("RUNICARMOR", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514)),
                "potentia 25, tutamen 25, praecantatio 25, alienis 5",
                ItemBracketHandler.getItem("Thaumcraft:ItemRingRunic", 1), 2)
        Research.setAspects("RUNICARMOR", "cognitio 15, tutamen 12, aer 9, potentia 9, praecantatio 6, alienis 3")
        Research.setComplexity("RUNICARMOR", 3)
        Infusion.addRecipe("RUNICCHARGED", ItemBracketHandler.getItem("Thaumcraft:ItemRingRunic", 1),
                arrayOf(ItemBracketHandler.getItem("minecraft:potion", 8226),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("minecraft:potion", 8226),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)),
                "potentia 64, tutamen 32, praecantatio 32, alienis 16, aer 8",
                ItemBracketHandler.getItem("Thaumcraft:ItemRingRunic", 2), 6)
        Research.setAspects("RUNICCHARGED",
                "praecantatio 15, potentia 12, tutamen 9, alienis 12, aer 9, cognitio 6, terra 3")
        Research.setComplexity("RUNICCHARGED", 3)
        Infusion.addRecipe("RUNICHEALING", ItemBracketHandler.getItem("Thaumcraft:ItemRingRunic", 1),
                arrayOf(ItemBracketHandler.getItem("minecraft:potion", 8225),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("minecraft:potion", 8225),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                "aqua 64, praecantatio 32, sano 32, tutamen 32, aer 8",
                ItemBracketHandler.getItem("Thaumcraft:ItemRingRunic", 3), 6)
        Research.setAspects("RUNICHEALING",
                "praecantatio 18, aqua 15, sano 12, tutamen 9, alienis 9, aer 6, cognitio 3")
        Research.setComplexity("RUNICHEALING", 3)
        Infusion.addRecipe("RUNICARMOR", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514)),
                "potentia 40, tutamen 40, praecantatio 40, alienis 20",
                ItemBracketHandler.getItem("Thaumcraft:ItemAmuletRunic", 0), 4)
        Infusion.addRecipe("RUNICEMERGENCY", ItemBracketHandler.getItem("Thaumcraft:ItemAmuletRunic", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:potion", 8233),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("minecraft:potion", 8233),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                "praecantatio 64, terra 64, tutamen 64, vacuos 32, sano 8",
                ItemBracketHandler.getItem("Thaumcraft:ItemAmuletRunic", 1), 8)
        Research.setAspects("RUNICEMERGENCY",
                "vacuos 15, praecantatio 12, terra 9, tutamen 9, alienis 6, sano 6, cognitio 3")
        Research.setComplexity("RUNICEMERGENCY", 3)
        Infusion.addRecipe("RUNICARMOR", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514)),
                "potentia 55, tutamen 55, praecantatio 55, alienis 35",
                ItemBracketHandler.getItem("Thaumcraft:ItemGirdleRunic", 0), 4)
        Infusion.addRecipe("RUNICKINETIC", ItemBracketHandler.getItem("Thaumcraft:ItemGirdleRunic", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:potion", 16428),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("minecraft:potion", 16428),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                "aer 64, praecantatio 64, tutamen 64, bestia 32, telum 8",
                ItemBracketHandler.getItem("Thaumcraft:ItemGirdleRunic", 1), 8)
        Research.setAspects("RUNICKINETIC",
                "aer 18, praecantatio 15, tutamen 12, telum 9, alienis 9, bestia 6, cognitio 3")
        Research.setComplexity("RUNICKINETIC", 3)
        Infusion.addRecipe("ARCANEBORE", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32641),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24500),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShovelThaumium", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24500),
                        ItemBracketHandler.getItem("Thaumcraft:ItemPickThaumium", 0)),
                "machina 64, motus 32, perditio 64, potentia 32, vacuos 32",
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 5), 6)
        Research.setAspects("ARCANEBORE", "instrumentum 15, perfodio 12, machina 9, motus 9, vacuos 3, cognitio 6")
        Research.setComplexity("ARCANEBORE", 3)
        Arcane.addShaped("ARCANEBORE", ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 4),
                "aer 30, ordo 30, terra 30",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabWood", 0),
                        OreBracketHandler.getOre("pipeSmallSteel"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabWood", 0)),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("minecraft:dispenser", 0),
                                OreBracketHandler.getOre("plateSteel")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                                OreBracketHandler.getOre("wireFineSteel"),
                                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6))))
        Infusion.addRecipe("ELEMENTALPICK", ItemBracketHandler.getItem("Thaumcraft:ItemPickThaumium", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29502),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)),
                "ignis 20, perfodio 20, sensus 20, lucrum 20",
                ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0), 3)
        Research.setAspects("ELEMENTALPICK", "instrumentum 15, ignis 12, perfodio 9, lucrum 6, praecantatio 3")
        Research.setComplexity("ELEMENTALPICK", 3)
        Infusion.addRecipe("ELEMENTALAXE", ItemBracketHandler.getItem("Thaumcraft:ItemAxeThaumium", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29503),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                "aqua 10, arbor 20, fabrico 20, motus 20", ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0),
                3)
        Research.setAspects("ELEMENTALAXE", "instrumentum 15, motus 12, fabrico 9, aqua 6, praecantatio 3")
        Research.setComplexity("ELEMENTALAXE", 3)
        Infusion.addRecipe("ELEMENTALSWORD", ItemBracketHandler.getItem("Thaumcraft:ItemSwordThaumium", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29528),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                "aer 20, motus 20, potentia 20, telum 20",
                ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0), 3)
        Research.setAspects("ELEMENTALSWORD", "instrumentum 15, telum 12, potentia 9, aer 6, praecantatio 3")
        Research.setComplexity("ELEMENTALSWORD", 3)
        Infusion.addRecipe("ELEMENTALSHOVEL", ItemBracketHandler.getItem("Thaumcraft:ItemShovelThaumium", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                "fabrico 20, terra 20, perfodio 10, praecantatio 20",
                ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0), 3)
        Research.setAspects("ELEMENTALSHOVEL", "instrumentum 15, terra 12, perfodio 9, fabrico 6, praecantatio 3")
        Research.setComplexity("ELEMENTALSHOVEL", 3)
        Infusion.addRecipe("ELEMENTALHOE", ItemBracketHandler.getItem("Thaumcraft:ItemHoeThaumium", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
                "meto 10, herba 20, terra 20, messis 20", ItemBracketHandler.getItem("Thaumcraft:ItemHoeElemental", 0),
                3)
        Research.setAspects("ELEMENTALHOE", "instrumentum 15, victus 12, meto 9, messis 6, praecantatio 3")
        Research.setComplexity("ELEMENTALHOE", 3)
        Infusion.addRecipe("HOVERHARNESS", ItemBracketHandler.getItem("minecraft:leather_chestplate", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17019),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17019),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6)),
                "iter 32, machina 64, potentia 32, volatus 32, tutamen 16",
                ItemBracketHandler.getItem("Thaumcraft:HoverHarness", 0), 6)
        Research.setAspects("HOVERHARNESS", "volatus 15, machina 12, iter 9, aer 9, praecantatio 6, tutamen 3")
        Research.setComplexity("HOVERHARNESS", 3)
        Infusion.addRecipe("HOVERGIRDLE", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("minecraft:feather", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17019),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17019),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("TwilightForest:item.tfFeather", 0)),
                "aer 64, iter 32, potentia 32, volatus 32, tutamen 16",
                ItemBracketHandler.getItem("Thaumcraft:ItemGirdleHover", 0), 8)
        Research.setAspects("HOVERGIRDLE", "volatus 15, motus 12, iter 9, aer 9, praecantatio 6, tutamen 3")
        Research.setComplexity("HOVERGIRDLE", 3)
        Research.setAspects("RUNICARMOR",
                "praecantatio 15, lucrum 12, permutatio 9, tutamen 9, cognitio 6, alienis 6, potentia 3")
        Research.setComplexity("RUNICARMOR", 3)
        Infusion.addRecipe("MIRROR", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17321),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17321),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330)),
                "iter 32, permutatio 24, tenebrae 16, alienis 8",
                ItemBracketHandler.getItem("Thaumcraft:blockMirror", 0), 6)
        Research.setAspects("MIRROR", "vitreus 15, iter 12, tenebrae 9, alienis 9, cognitio 6, potentia 3")
        Research.setComplexity("MIRROR", 3)
        Warp.addToResearch("MIRROR", 2)
        Infusion.addRecipe("MIRRORHAND", ItemBracketHandler.getItem("Thaumcraft:blockMirror", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:compass", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("minecraft:map", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330)),
                "instrumentum 64, iter 32, motus 24, alienis 16, potentia 8",
                ItemBracketHandler.getItem("Thaumcraft:HandMirror", 0), 9)
        Research.setAspects("MIRRORHAND",
                "iter 18, instrumentum 15, vitreus 12, alienis 9, cognitio 6, potentia 6, praecantatio 3")
        Research.setComplexity("MIRRORHAND", 3)
        Warp.addToResearch("MIRRORHAND", 3)
        Infusion.addRecipe("MIRRORESSENTIA", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17321),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17321),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330)),
                "aqua 24, iter 32, permutatio 16, vitreus 8", ItemBracketHandler.getItem("Thaumcraft:blockMirror", 6),
                2)
        Research.setAspects("MIRRORESSENTIA",
                "praecantatio 15, iter 12, vitreus 9, alienis 9, cognitio 6, potentia 6, aqua 3")
        Research.setComplexity("MIRRORESSENTIA", 3)
        Warp.addToResearch("MIRRORESSENTIA", 3)
        Infusion.addRecipe("JARBRAIN", ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("minecraft:poisonous_potato", 0),
                        ItemBracketHandler.getItem("minecraft:spider_eye", 0),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:spider_eye", 0),
                        ItemBracketHandler.getItem("minecraft:poisonous_potato", 0)),
                "cognitio 15, exanimis 30, sensus 15, alienis 10", ItemBracketHandler.getItem("Thaumcraft:blockJar", 1),
                5)
        Research.setAspects("JARBRAIN", "lucrum 15, fames 12, exanimis 9, cognitio 9, alienis 6, potentia 3")
        Research.setComplexity("JARBRAIN", 3)
        Research.setAspects("INFUSIONENCHANTMENT",
                "instrumentum 15, praecantatio 15, tutamen 12, cognitio 12, telum 9, potentia 9, alienis 6, potentia 3")
        Research.setComplexity("INFUSIONENCHANTMENT", 4)

        //TODO Relace ("harvestcraft:hardenedleatherItem", 0)
        //Infusion.addRecipe("ARMORFORTRESS", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetThaumium", 0),
        //        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)),
        //        "metallum 32, praecantatio 32, tutamen 32, victus 16",
        //        ItemBracketHandler.getItem("Thaumcraft:ItemHelmetFortress", 0), 4)
        //Research.setAspects("ARMORFORTRESS", "fabrico 15, metallum 12, tutamen 9, alienis 9, cognitio 6, potentia 3")
        //Research.setComplexity("ARMORFORTRESS", 3)
        //Infusion.addRecipe("ARMORFORTRESS", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateThaumium", 0),
        //        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330)),
        //        "metallum 32, praecantatio 32, tutamen 40, cognitio 16",
        //        ItemBracketHandler.getItem("Thaumcraft:ItemChestplateFortress", 0), 4)
        //Infusion.addRecipe("ARMORFORTRESS", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsThaumium", 0),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)),
        //        "metallum 32, praecantatio 32, tutamen 24, terra 16",
        //        ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsFortress", 0), 4)

        Research.setAspects("HELMGOGGLES", "tutamen 15, sensus 12, auram 9, alienis 9, praecantatio 6, fabrico 3")
        Research.setComplexity("HELMGOGGLES", 3)
        Research.setAspects("MASKGRINNINGDEVIL",
                "tutamen 15, sano 12, cognitio 9, alienis 9, praecantatio 6, fabrico 3")
        Research.setComplexity("MASKGRINNINGDEVIL", 3)
        Warp.addToResearch("MASKGRINNINGDEVIL", 1)
        Research.setAspects("MASKANGRYGHOST",
                "tutamen 15, perditio 12, mortuus 9, alienis 9, praecantatio 6, fabrico 3")
        Research.setComplexity("MASKANGRYGHOST", 3)
        Warp.addToResearch("MASKANGRYGHOST", 1)
        Research.setAspects("MASKSIPPINGFIEND", "tutamen 15, exanimis 12, victus 9, alienis 9, cognitio 6, potentia 3")
        Research.setComplexity("MASKSIPPINGFIEND", 3)
        Warp.addToResearch("MASKSIPPINGFIEND", 2)
        Arcane.addShaped("BONEBOW", ItemBracketHandler.getItem("Thaumcraft:ItemBowBone", 0),
                "aer 32, perditio 32, terra 32", arrayOf(arrayOf(ItemBracketHandler.getItem("Natura:barleyFood", 7),
                ItemBracketHandler.getItem("minecraft:bone", 0), OreBracketHandler.getOre("screwThaumium")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:barleyFood", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("dreamcraft:item.LichBone", 0)),
                arrayOf(ItemBracketHandler.getItem("Natura:barleyFood", 7),
                        ItemBracketHandler.getItem("minecraft:bone", 0), OreBracketHandler.getOre("screwThaumium"))))
        Research.setAspects("BONEBOW", "telum 12, motus 9, aer 6, exanimis 3")
        Research.setComplexity("BONEBOW", 2)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 0).amount(4), null,
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 400, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 0).amount(4), null,
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 400, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 0).amount(4), null,
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                OreBracketHandler.getOre("craftingLensRed").amount(0), 600, VoltageLevels.MV)
        Research.refreshResearchRecipe("THAUMOMETER")
        Research.refreshResearchRecipe("GOGGLES")
        Research.refreshResearchRecipe("TABLE")
        Research.refreshResearchRecipe("ARCANESTONE")
        Research.refreshResearchRecipe("INFUSION")
        Research.refreshResearchRecipe("ARCANELAMP")
        Research.refreshResearchRecipe("LAMPGROWTH")
        Research.refreshResearchRecipe("LAMPFERTILITY")
        Research.refreshResearchRecipe("PAVETRAVEL")
        Research.refreshResearchRecipe("PAVEWARD")
        Research.refreshResearchRecipe("LEVITATOR")
        Research.refreshResearchRecipe("WARDEDARCANA")
        Research.refreshResearchRecipe("ARCANEEAR")
        Research.refreshResearchRecipe("SINSTONE")
        Research.refreshResearchRecipe("BELLOWS")
        Research.refreshResearchRecipe("FLUXSCRUB")
        Research.refreshResearchRecipe("BOOTSTRAVELLER")
        Research.refreshResearchRecipe("RUNICARMOR")
        Research.refreshResearchRecipe("RUNICKINETIC")
        Research.refreshResearchRecipe("RUNICEMERGENCY")
        Research.refreshResearchRecipe("RUNICCHARGED")
        Research.refreshResearchRecipe("RUNICHEALING")
        Research.refreshResearchRecipe("ARCANEBORE")
        Research.refreshResearchRecipe("ELEMENTALPICK")
        Research.refreshResearchRecipe("ELEMENTALAXE")
        Research.refreshResearchRecipe("ELEMENTALSWORD")
        Research.refreshResearchRecipe("ELEMENTALSHOVEL")
        Research.refreshResearchRecipe("ELEMENTALHOE")
        Research.refreshResearchRecipe("HOVERHARNESS")
        Research.refreshResearchRecipe("HOVERGIRDLE")
        Research.refreshResearchRecipe("RUNICARMOR")
        Research.refreshResearchRecipe("MIRROR")
        Research.refreshResearchRecipe("MIRRORHAND")
        Research.refreshResearchRecipe("MIRRORESSENTIA")
        Research.refreshResearchRecipe("JARBRAIN")
        Research.refreshResearchRecipe("INFUSIONENCHANTMENT")
        Research.refreshResearchRecipe("ARMORFORTRESS")
        Research.refreshResearchRecipe("HELMGOGGLES")
        Research.refreshResearchRecipe("MASKGRINNINGDEVIL")
        Research.refreshResearchRecipe("MASKANGRYGHOST")
        Research.refreshResearchRecipe("MASKSIPPINGFIEND")
        Research.refreshResearchRecipe("BONEBOW")
    }
}