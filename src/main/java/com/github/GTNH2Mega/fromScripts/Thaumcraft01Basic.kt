package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.Autoclave
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.chisel.handlers.Groups
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Research
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Thaumcraft01Basic : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6), null, false)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 0))))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 1))))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockTable", 14))
        Research.clearPages("PLANTS")
        Research.addPage("PLANTS", "tc.research_page.PLANTS.1")
        Research.addCraftingPage("PLANTS", ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6))
        Research.addPage("PLANTS", "tc.research_page.PLANTS.2")
        Research.addCraftingPage("PLANTS", ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7))
        Research.addPage("PLANTS", "tc.research_page.PLANTS.3")
        Research.addPage("PLANTS", "tc.research_page.PLANTS.4")
        Research.addPage("PLANTS", "tc.research_page.PLANTS.5")
        Research.addPage("PLANTS", "tc.research_page.PLANTS.6")
        Arcane.addShaped("ASPECTS", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                "aer 10, terra 5, ignis 5, aqua 5, ordo 5, perditio 5",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0))))
        Arcane.addShaped("ASPECTS", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                "aer 5, terra 5, ignis 10, aqua 5, ordo 5, perditio 5",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1))))
        Arcane.addShaped("ASPECTS", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                "aer 5, terra 5, ignis 5, aqua 10, ordo 5, perditio 5",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2))))
        Arcane.addShaped("ASPECTS", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                "aer 5, terra 10, ignis 5, aqua 5, ordo 5, perditio 5",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3))))
        Arcane.addShaped("ASPECTS", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                "aer 5, terra 5, ignis 5, aqua 5, ordo 10, perditio 5",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4))))
        Arcane.addShaped("ASPECTS", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                "aer 5, terra 5, ignis 5, aqua 5, ordo 5, perditio 10",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5))))
        Arcane.addShaped("ASPECTS", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                "aer 10, terra 10, ignis 10, aqua 10, ordo 10, perditio 10",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5))))
        Research.clearPages("ORE")
        Research.addPage("ORE", "tc.research_page.ORE.1")
        Research.addPage("ORE", "tc.research_page.ORE.2")
        Research.addArcanePage("ORE", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0))
        Research.addArcanePage("ORE", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1))
        Research.addArcanePage("ORE", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2))
        Research.addArcanePage("ORE", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3))
        Research.addArcanePage("ORE", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4))
        Research.addArcanePage("ORE", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))
        Research.addArcanePage("ORE", ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6))
        Research.addPage("ORE", "tc.research_page.ORE.3")
        Research.addPage("ORE", "tc.research_page.ORE.4")
        Research.setAspects("RESEARCHER1", "cognitio 6, sensus 6, ordo 6, lux 3")
        Research.setComplexity("RESEARCHER1", 1)
        Research.setAspects("RESEARCHER2", "cognitio 9, sensus 9, ordo 6, lux 6, permutatio 3")
        Research.setComplexity("RESEARCHER2", 2)
        Research.setAspects("NODETAPPER1", "permutatio 9, auram 9, praecantatio 6, motus 3")
        Research.setComplexity("NODETAPPER1", 2)
        Research.setAspects("NODETAPPER2", "permutatio 12, auram 12, praecantatio 9, motus 6, potentia 3")
        Research.setComplexity("NODETAPPER2", 3)
        Research.setAspects("NODEPRESERVE", "perditio 9, cognitio 9, fabrico 6, instrumentum 3")
        Research.setComplexity("NODEPRESERVE", 2)
        Arcane.addShaped("DECONSTRUCTOR", ItemBracketHandler.getItem("Thaumcraft:blockTable", 14),
                "ordo 20, perditio 20", arrayOf(arrayOf(OreBracketHandler.getOre("screwThaumium"),
                ItemBracketHandler.getItem("Thaumcraft:ItemThaumometer", 0), OreBracketHandler.getOre("screwThaumium")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemPickThaumium", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockTable", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeThaumium", 0)),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("plateThaumium"))))
        Research.setAspects("DECONSTRUCTOR", "sensus 9, auram 9, lucrum 6, fames 3")
        Research.setComplexity("DECONSTRUCTOR", 2)
        Research.setAspects("NODEJAR", "auram 12, motus 12, lucrum 9, permutatio 6, vitreus 3")
        Research.setComplexity("NODEJAR", 3)
        Research.setAspects("RESEARCHDUPE", "sensus 12, cognitio 12, fabrico 12, lucrum 9, perditio 6, potentia 3")
        Research.setComplexity("RESEARCHDUPE", 3)
        Groups.addVariation("thaumium", ItemBracketHandler.getItem("gregtech:gt.blockmetal7", 4))
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2514),
                LiquidBracketHandler.getLiquid("water").withAmount(200), 7000, 2000, 24)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2514),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(200), 9000, 1500, 24)

        //TODO Replace ("harvestthenether:glowflowerseedItem", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 3),
        //        ItemBracketHandler.getItem("harvestthenether:glowflowerseedItem", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 801).amount(8), 600, VoltageLevels.LV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 2),
        //        ItemBracketHandler.getItem("harvestthenether:glowflowerseedItem", 0),
        //        ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 5).amount(8), 600, VoltageLevels.LV)

        Research.refreshResearchRecipe("DECONSTRUCTOR")
        Research.addResearch("WARPWARNING", "BASICS", "null", 1, 1, 1, ItemBracketHandler.getItem("minecraft:skull", 1))
        Research.addSibling("WARP", "WARPWARNING")
        Research.addSibling("RESEARCH", "WARPWARNING")
        MineTweakerAPI.game.setLocalization("tc.research_name.WARPWARNING", "Warp Warnings")
        MineTweakerAPI.game.setLocalization("tc.research_text.WARPWARNING", "[WT] Wither in the Overworld")
        Research.setAutoUnlock("WARPWARNING", true)
        Research.setSpikey("WARPWARNING", true)
        Research.addPage("WARPWARNING", "WARPTHEORY.research_page.WARPWARNING.1")
        MineTweakerAPI.game.setLocalization("WARPTHEORY.research_page.WARPWARNING.1",
                "Thaumcraft offers considerable power from its devices and tools. But power comes with a price.... As of version 4.2, that price is represented by Warp: A corruption of the characters mind and soul, inflicting progressively more dire effects upon them. While the effects of warp can range from annoying to deadly, accumulating enough of it can also grant you access to greater power... at the cost of increasing madness, and attention from dark powers. At least, others may call it madness... but is it truly insanity, when the voices in your head grant useful knowledge, and the monsters that appear before you leave remains behind?")
        Research.addPage("WARPWARNING", "WARPTHEORY.research_page.WARPWARNING.2")
        MineTweakerAPI.game.setLocalization("WARPTHEORY.research_page.WARPWARNING.2",
                "Warp Theory add a bunch of new Warp Effects to the Player. Be very carful because you don't want autospawning an Wither in or bside you Base<BR>Warp Effects are Trickert by Warp Level<BR>Fake explosion warp effect can happen with 10 Warp<BR>Fake creeper warp effect can happen with 10 Warp<BR>Spawn bats can happen with 15 Warp<BR>Poison warp effect can happen with 16 Warp<BR>Jump boost warp effect can happen with 18 Warp")
        Research.addPage("WARPWARNING", "WARPTHEORY.research_page.WARPWARNING.3")
        MineTweakerAPI.game.setLocalization("WARPTHEORY.research_page.WARPWARNING.3",
                "Rain warp effect can happen with 25 Warp<BR>Blood warp effect can happen with 25 Warp<BR>Nausea warp effect can happen with 25 Warp<BR>Friendly creeper warp effect can happen with 26 Warp<BR>Lightning warp effect can happen with 30 Warp<BR>Livestock rain warp effect can happen with 32 Warp<BR>Wind warp effect can happen with 38 Warp<BR>Blindness warp effect can happen with 43 Warp")
        Research.addPage("WARPWARNING", "WARPTHEORY.research_page.WARPWARNING.4")
        MineTweakerAPI.game.setLocalization("WARPTHEORY.research_page.WARPWARNING.4",
                "Random teleport can happen with 45 Warp<BR>Acceleration warp effect can happen with 50 Warp<BR>Decay warp effect can happen with 50 Warp<BR>Random trees effect can happen with 50 Warp<BR>Chest scramble warp effect can happen with 80 Warp<BR>Spawn wither warp effect can happen with Warp 80")
    }
}