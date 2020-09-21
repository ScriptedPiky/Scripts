package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Pulverizer
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import modtweaker2.mods.thaumcraft.handlers.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Thaumcraft03Alchemy : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotThaumium"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetThaumium"),
                        OreBracketHandler.getOre("nuggetThaumium"), OreBracketHandler.getOre("nuggetThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetThaumium"),
                                OreBracketHandler.getOre("nuggetThaumium"), OreBracketHandler.getOre("nuggetThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetThaumium"),
                                OreBracketHandler.getOre("nuggetThaumium"),
                                OreBracketHandler.getOre("nuggetThaumium"))))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 6))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTube", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTube", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTube", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTube", 5))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTube", 6))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTube", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTube", 4))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResonator", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTube", 7))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockJar", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockJar", 3))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemBathSalts", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemSanitySoap", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                arrayOf(OreBracketHandler.getOre("craftingToolMortar"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6)), null)
        Research.clearPages("PHIAL")
        Research.addPage("PHIAL", "tc.research_page.PHIAL.1")
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:glass_bottle", 0),
                        OreBracketHandler.getOre("roundAnyRubber")), null)
        Research.addCraftingPage("PHIAL", ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0))
        Crucible.addRecipe("TALLOW", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2877), "praecantatio 2, corpus 4, mortuus 2")
        Research.setAspects("TALLOW", "corpus 6, praecantatio 6, motus 3")
        Research.setComplexity("TALLOW", 1)
        Research.clearPages("TALLOW")
        Research.addPage("TALLOW", "tc.research_page.TALLOW.1")
        Arcane.addShaped("TALLOW", ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0),
                "ignis 3, ordo 1, perditio 1, aer 3",
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:string", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), null)))
        Research.addCruciblePage("TALLOW", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4))
        Research.addArcanePage("TALLOW", ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0))
        Crucible.addRecipe("NITOR", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                ItemBracketHandler.getItem("minecraft:glowstone_dust", 0), "ignis 4, lux 4, potentia 4")
        Research.setAspects("NITOR", "lux 6, ignis 3, praecantatio 3")
        Research.setComplexity("NITOR", 1)
        Crucible.addRecipe("ALUMENTUM", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2535), "ignis 6, perditio 3, potentia 6")
        Crucible.addRecipe("ALUMENTUM", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2536), "ignis 6, perditio 3, potentia 6")
        Crucible.addRecipe("ALUMENTUM", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2538), "ignis 6, perditio 3, potentia 6")
        Research.setAspects("ALUMENTUM", "ignis 3, praecantatio 3, perditio 6")
        Research.setComplexity("ALUMENTUM", 1)
        Research.addPage("ALUMENTUM", "tc.research_page.ALUMENTUM.2")
        MineTweakerAPI.game.setLocalization("tc.research_page.ALUMENTUM.2",
                "Charcoal dust and Lignite dust works well too. They are not shown in the recipe because of Mod Tweaker")
        Research.setAspects("ALCHEMICALDUPLICATION", "fabrico 9, praecantatio 6, lucrum 9, permutatio 3")
        Research.setComplexity("ALCHEMICALDUPLICATION", 2)
        Research.setAspects("ALCHEMICALMANUFACTURE", "fabrico 9, praecantatio 9, lucrum 6, permutatio 3")
        Research.setComplexity("ALCHEMICALMANUFACTURE", 2)
        Research.setAspects("ENTROPICPROCESSING", "fabrico 9, praecantatio 9, lucrum 6, perditio 3")
        Research.setComplexity("ENTROPICPROCESSING", 2)
        Arcane.addShaped("DISTILESSENTIA", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 0),
                "ignis 15, aer 10, ordo 5",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Railcraft:machine.beta", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("craftingIronFurnace"),
                                OreBracketHandler.getOre("plateThaumium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7))))
        Research.setAspects("DISTILESSENTIA", "limus 9, praecantatio 6, ignis 3, aqua 9")
        Research.setComplexity("DISTILESSENTIA", 2)
        Arcane.addShaped("DISTILESSENTIA", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8).amount(3),
                "ordo 10, aqua 5", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("springSmallGold"),
                OreBracketHandler.getOre("plateGold"), OreBracketHandler.getOre("springSmallGold")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7)),
                arrayOf<IIngredient>(OreBracketHandler.getOre("springSmallGold"), OreBracketHandler.getOre("plateGold"),
                        OreBracketHandler.getOre("springSmallGold"))))
        Arcane.addShaped("DISTILESSENTIA", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 1),
                "aer 5, aqua 10, ignis 5", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                OreBracketHandler.getOre("pipeMediumSteel"), OreBracketHandler.getOre("plateThaumium")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        ItemBracketHandler.getItem("Railcraft:machine.beta", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8)),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                        OreBracketHandler.getOre("pipeMediumSteel"), OreBracketHandler.getOre("plateThaumium"))))
        Arcane.addShaped("DISTILESSENTIA", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                "ordo 10, aqua 5, ignis 5",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 0)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockTube", 1),
                                OreBracketHandler.getOre("blockThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 0))))
        Arcane.addShaped("TUBES", ItemBracketHandler.getItem("Thaumcraft:blockTube", 0).amount(4), "ordo 8, aqua 8",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                        OreBracketHandler.getOre("nuggetGold"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5),
                                OreBracketHandler.getOre("pipeSmallSteel"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                                OreBracketHandler.getOre("nuggetGold"), OreBracketHandler.getOre("screwThaumium"))))
        Research.setAspects("TUBES", "praecantatio 9, permutatio 6, aqua 9, ordo 3")
        Research.setComplexity("TUBES", 2)
        Arcane.addShaped("TUBES", ItemBracketHandler.getItem("Thaumcraft:blockTube", 1), "ordo 8, aqua 8",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwThaumium"),
                        ItemBracketHandler.getItem("minecraft:lever", 0), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf(OreBracketHandler.getOre("plateAnyRubber"),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                                OreBracketHandler.getOre("gearGtSmallThaumium")), arrayOfNulls(3)))
        Arcane.addShaped("TUBES", ItemBracketHandler.getItem("Thaumcraft:ItemResonator", 0), "aer 8, aqua 8",
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("stickThaumium"), null),
                        arrayOf(OreBracketHandler.getOre("screwThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5),
                                OreBracketHandler.getOre("stickThaumium")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("screwThaumium"),
                                OreBracketHandler.getOre("craftingToolFile"))))
        Arcane.addShaped("TUBEFILTER", ItemBracketHandler.getItem("Thaumcraft:blockTube", 3), "ordo 16, aqua 16",
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf(OreBracketHandler.getOre("screwThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                                OreBracketHandler.getOre("screwThaumium")),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8), null)))
        Research.setAspects("TUBEFILTER", "praecantatio 12, permutatio 9, aqua 12, ordo 6, limus 3")
        Research.setComplexity("TUBEFILTER", 3)
        Arcane.addShaped("TUBEFILTER", ItemBracketHandler.getItem("Thaumcraft:blockTube", 5), "terra 16, aqua 16",
                arrayOf(arrayOfNulls(3), arrayOf(OreBracketHandler.getOre("ringAnyRubber"),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                        OreBracketHandler.getOre("ringAnyRubber")), arrayOfNulls(3)))
        Arcane.addShaped("TUBEFILTER", ItemBracketHandler.getItem("Thaumcraft:blockTube", 6),
                "ordo 16, perditio 8, aqua 8", arrayOf(arrayOfNulls(3),
                arrayOf(OreBracketHandler.getOre("dyeBlue"), ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                        OreBracketHandler.getOre("screwThaumium")), arrayOfNulls(3)))
        Arcane.addShaped("CENTRIFUGE", ItemBracketHandler.getItem("Thaumcraft:blockTube", 2),
                "ordo 32, perditio 16, aqua 16", arrayOf(arrayOf(OreBracketHandler.getOre("screwThaumium"),
                ItemBracketHandler.getItem("Thaumcraft:blockTube", 0), OreBracketHandler.getOre("screwThaumium")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32641)),
                arrayOf(OreBracketHandler.getOre("screwThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                        OreBracketHandler.getOre("screwThaumium"))))
        Research.setAspects("CENTRIFUGE", "fabrico 12, perditio 9, permutatio 12, praecantatio 6, machina 3")
        Research.setComplexity("CENTRIFUGE", 3)
        Arcane.addShaped("CENTRIFUGE", ItemBracketHandler.getItem("Thaumcraft:blockTube", 4).amount(4),
                "ordo 20, aqua 20",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                                OreBracketHandler.getOre("screwThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 5),
                                ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0))))
        Arcane.addShaped("ESSENTIACRYSTAL", ItemBracketHandler.getItem("Thaumcraft:blockTube", 7),
                "terra 20, ordo 15, aqua 10", arrayOf(arrayOf(OreBracketHandler.getOre("plateThaumium"),
                ItemBracketHandler.getItem("minecraft:dispenser", 0), OreBracketHandler.getOre("plateThaumium")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                arrayOf(OreBracketHandler.getOre("screwThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                        OreBracketHandler.getOre("screwThaumium"))))
        Research.setAspects("ESSENTIACRYSTAL", "aqua 12, praecantatio 9, permutatio 12, vitreus 6, terra 3")
        Research.setComplexity("ESSENTIACRYSTAL", 3)
        Arcane.addShaped("THAUMATORIUM", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                "ignis 10, ordo 10, aqua 10", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                OreBracketHandler.getOre("gemFlawlessAmber"), OreBracketHandler.getOre("plateThaumium")),
                arrayOf(OreBracketHandler.getOre("gemFlawlessAmber"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        OreBracketHandler.getOre("gemFlawlessAmber")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                        OreBracketHandler.getOre("gemFlawlessAmber"), OreBracketHandler.getOre("plateThaumium"))))
        Research.setAspects("THAUMATORIUM", "fabrico 12, aqua 9, permutatio 12, praecantatio 6, cognitio 3")
        Research.setComplexity("THAUMATORIUM", 3)
        Research.setAspects("TRANSIRON", "metallum 6, ordo 3, permutatio 3")
        Research.setComplexity("TRANSIRON", 1)
        Research.setAspects("TRANSGOLD", "metallum 9, lucrum 6, permutatio 3")
        Research.setComplexity("TRANSGOLD", 2)
        Research.setAspects("TRANSCOPPER", "metallum 9, ordo 6, permutatio 3")
        Research.setComplexity("TRANSCOPPER", 2)
        Research.setAspects("TRANSTIN", "metallum 9, vitreus 6, permutatio 3")
        Research.setComplexity("TRANSTIN", 2)
        Research.setAspects("TRANSLEAD", "metallum 9, ordo 6, permutatio 3")
        Research.setComplexity("TRANSLEAD", 2)
        Research.setAspects("TRANSSILVER", "metallum 9, lucrum 6, permutatio 3")
        Research.setComplexity("TRANSSILVER", 2)
        Research.setAspects("PUREIRON", "metallum 6, ordo 6, vitreus 3")
        Research.setComplexity("PUREIRON", 1)
        Research.setAspects("PUREGOLD", "metallum 9, lucrum 9, ordo 6, praecantatio 3")
        Research.setComplexity("PUREGOLD", 2)
        Research.setAspects("PURECOPPER", "metallum 9, ordo 9, ordo 6, praecantatio 3")
        Research.setComplexity("PURECOPPER", 2)
        Research.setAspects("PURETIN", "metallum 9, vitreus 9, ordo 6, praecantatio 3")
        Research.setComplexity("PURETIN", 2)
        Research.setAspects("PURELEAD", "metallum 9, permutatio 9, ordo 6, praecantatio 3")
        Research.setComplexity("PURELEAD", 2)
        Research.setAspects("PURESILVER", "metallum 9, lucrum 9, ordo 6, praecantatio 3")
        Research.setComplexity("PURESILVER", 2)
        Arcane.addShaped("JARLABEL", ItemBracketHandler.getItem("Thaumcraft:blockJar", 0), "aqua 2",
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("paneGlassColorless"),
                        OreBracketHandler.getOre("plateAnyRubber"), OreBracketHandler.getOre("paneGlassColorless")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("paneGlassColorless"), null,
                                OreBracketHandler.getOre("paneGlassColorless")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("paneGlassColorless"),
                                OreBracketHandler.getOre("paneGlassColorless"),
                                OreBracketHandler.getOre("paneGlassColorless"))))
        Research.clearPages("JARVOID")
        Research.addPage("JARVOID", "tc.research_page.JARVOID.1")
        Infusion.addRecipe("JARVOID", ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17533),
                        ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5)),
                "vacuos 7, praecantatio 7, perditio 7, aqua 7", ItemBracketHandler.getItem("Thaumcraft:blockJar", 3), 2)
        Research.addInfusionPage("JARVOID", ItemBracketHandler.getItem("Thaumcraft:blockJar", 3))
        Research.setAspects("JARVOID", "vacuos 6, perditio 6, praecantatio 6, perditio 3")
        Research.setComplexity("JARVOID", 1)
        Crucible.addRecipe("BATHSALTS", ItemBracketHandler.getItem("Thaumcraft:ItemBathSalts", 0).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14), "sano 10, cognitio 10, auram 10, ordo 10")
        Research.setAspects("BATHSALTS", "sano 9, cognitio 6, auram 9, ordo 6, praecantatio 3")
        Research.setComplexity("BATHSALTS", 2)
        Crucible.addRecipe("SANESOAP", ItemBracketHandler.getItem("Thaumcraft:ItemSanitySoap", 0).amount(2),
                ItemBracketHandler.getItem("chisel:tallow", 0), "alienis 20, cognitio 20, sano 20, ordo 20")
        Research.setAspects("SANESOAP", "sano 12, alienis 12, cognitio 9, ordo 6, praecantatio 3")
        Research.setComplexity("SANESOAP", 3)
        Research.clearPages("ARCANESPA")
        Research.addPage("ARCANESPA", "tc.research_page.ARCANESPA.1")
        Infusion.addRecipe("ARCANESPA", ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.StainlessSteelBars", 0),
                        ItemBracketHandler.getItem("minecraft:quartz_block", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemBathSalts", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("minecraft:quartz_block", 0)),
                "ordo 24, praecantatio 16, sano 16, aqua 32, machina 8",
                ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 12), 4)
        Research.addInfusionPage("ARCANESPA", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 12))
        Research.setAspects("ARCANESPA", "ordo 9, aqua 9, machina 6, sano 6, praecantatio 3")
        Research.setComplexity("ARCANESPA", 3)
        Research.setAspects("LIQUIDDEATH", "aqua 9, mortuus 9, perditio 6, venenum 6, tenebrae 3")
        Research.setComplexity("LIQUIDDEATH", 3)
        Research.setAspects("ETHEREALBLOOM", "vitium 9, praecantatio 9, sano 6, herba 6, lux 3, terra 3")
        Research.setComplexity("ETHEREALBLOOM", 3)
        Research.setAspects("BOTTLETAINT",
                "vitium 12, praecantatio 12, aqua 12, perditio 9, tenebrae 9, venenum 6, strontio 3")
        Research.setComplexity("BOTTLETAINT", 3)
        Warp.addToResearch("BOTTLETAINT", 5)
        Warp.addToItem(ItemBracketHandler.getItem("Thaumcraft:ItemBottleTaint", 0), 1)
        Crucible.addRecipe("THAUMIUM", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0), "praecantatio 4")
        Compressor.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 5),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4).amount(9))
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4).amount(9)),
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 5), intArrayOf(10000), 300, VoltageLevels.LULV)
        Research.refreshResearchRecipe("CRUCIBLE")
        Research.refreshResearchRecipe("TALLOW")
        Research.refreshResearchRecipe("NITOR")
        Research.refreshResearchRecipe("ALUMENTUM")
        Research.refreshResearchRecipe("THAUMIUM")
        Research.refreshResearchRecipe("DISTILESSENTIA")
        Research.refreshResearchRecipe("JARLABEL")
        Research.refreshResearchRecipe("JARVOID")
        Research.refreshResearchRecipe("ALCHEMICALDUPLICATION")
        Research.refreshResearchRecipe("ALCHEMICALMANUFACTURE")
        Research.refreshResearchRecipe("THAUMATORIUM")
        Research.refreshResearchRecipe("ENTROPICPROCESSING")
        Research.refreshResearchRecipe("BATHSALTS")
        Research.refreshResearchRecipe("SANESOAP")
        Research.refreshResearchRecipe("ARCANESPA")
        Research.refreshResearchRecipe("TUBES")
        Research.refreshResearchRecipe("TUBEFILTER")
        Research.refreshResearchRecipe("CENTRIFUGE")
        Research.refreshResearchRecipe("ESSENTIACRYSTAL")
        Research.refreshResearchRecipe("TRANSIRON")
        Research.refreshResearchRecipe("TRANSGOLD")
        Research.refreshResearchRecipe("TRANSCOPPER")
        Research.refreshResearchRecipe("TRANSTIN")
        Research.refreshResearchRecipe("TRANSLEAD")
        Research.refreshResearchRecipe("TRANSSILVER")
        Research.refreshResearchRecipe("PUREIRON")
        Research.refreshResearchRecipe("PUREGOLD")
        Research.refreshResearchRecipe("PURECOPPER")
        Research.refreshResearchRecipe("PURETIN")
        Research.refreshResearchRecipe("PURELEAD")
        Research.refreshResearchRecipe("PURESILVER")
        Research.refreshResearchRecipe("LIQUIDDEATH")
    }
}