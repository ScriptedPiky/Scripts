package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Crucible
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class ThaumicEnergistics : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicenergistics:wireless.essentia.terminal", 0))
        Infusion.removeRecipe(
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.essentia.provider", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:material", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.gear.box", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:part.base", 5))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:material", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:material", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:part.base", 4))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:part.base", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicenergistics:part.base", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicenergistics:part.base", 8))
        Arcane.removeRecipe(
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.essentia.vibration.chamber", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:part.base", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:part.base", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:part.base", 2))
        Arcane.removeRecipe(
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.distillation.encoder", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:focus.aewrench", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:golem.wifi.backpack", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:storage.component", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicenergistics:storage.casing", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 3))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.essentia.cell.workbench", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:part.base", 6))
        Crucible.removeRecipe(
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.golem.gear.box", 0))
        Infusion.removeRecipe(
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.arcane.assembler", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicenergistics:knowledge.core", 0))
        Arcane.removeRecipe(
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.knowledge.inscriber", 0))
        Infusion.removeRecipe(
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.infusion.provider", 0))

        Assembler.addRecipe(ItemBracketHandler.getItem("thaumicenergistics:wireless.essentia.terminal", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ToolWirelessTerminal", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("thaumicenergistics:part.base", 4), 600, VoltageLevels.MV)
        Infusion.addRecipe("thaumicenergistics.TEESSPROV",
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockInterface", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockTube", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                "machina 64, praecantatio 48, ordo 32, permutatio 24, aqua 16, cognitio 8, lucrum 4",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.essentia.provider", 0), 8)
        Research.setAspects("thaumicenergistics.TEESSPROV",
                "sensus 21, praecantatio 18, lucrum 15, metallum 12, ordo 9, potentia 6, machina 3")
        Research.setComplexity("thaumicenergistics.TEESSPROV", 3)
        Arcane.addShaped("thaumicenergistics.TEIRONGEARBOX",
                ItemBracketHandler.getItem("thaumicenergistics:material", 2), "terra 10, ignis 5, ordo 5",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickIron"),
                        OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("stickIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("gearWood"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickIron"),
                                OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("stickIron"))))
        Arcane.addShaped("thaumicenergistics.TEIRONGEARBOX",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.gear.box", 0),
                "aer 15, ignis 15, ordo 15",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        OreBracketHandler.getOre("gearIron"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6)),
                        arrayOf(OreBracketHandler.getOre("gearIron"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearIron")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                OreBracketHandler.getOre("gearIron"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6))))
        Research.setAspects("thaumicenergistics.TEIRONGEARBOX",
                "terra 15, metallum 12, machina 9, permutatio 6, metallum 3")
        Research.setComplexity("thaumicenergistics.TEIRONGEARBOX", 3)
        Arcane.addShaped("thaumicenergistics.TEARCANETERM",
                ItemBracketHandler.getItem("thaumicenergistics:part.base", 5),
                "aqua 25, ignis 25, aer 25, terra 25, ordo 25, perditio 25",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17542),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 360),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17542)), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                        ItemBracketHandler.getItem("Thaumcraft:blockTable", 15),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17542),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17542))))
        Research.setAspects("thaumicenergistics.TEARCANETERM",
                "instrumentum 15, fabrico 12, potentia 9, machina 6, vacuos 3")
        Research.setComplexity("thaumicenergistics.TEARCANETERM", 3)
        Research.setAspects("thaumicenergistics.TECERTUSDUPE", "vitreus 9, praecantatio 6, lucrum 9, permutatio 3")
        Research.setComplexity("thaumicenergistics.TECERTUSDUPE", 2)
        Arcane.addShaped("thaumicenergistics.TECORES", ItemBracketHandler.getItem("thaumicenergistics:material", 0),
                "aqua 20, perditio 20", arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                OreBracketHandler.getOre("gemAmber"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 44),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5)),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3), OreBracketHandler.getOre("gemAmber"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3))))
        Arcane.addShaped("thaumicenergistics.TECORES", ItemBracketHandler.getItem("thaumicenergistics:material", 1),
                "aqua 20, ordo 20", arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                OreBracketHandler.getOre("gemAmber"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3), OreBracketHandler.getOre("gemAmber"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3))))
        Research.setAspects("thaumicenergistics.TECORES",
                "cognitio 12, praecantatio 9, machina 6, limus 9, permutatio 3")
        Research.setComplexity("thaumicenergistics.TECORES", 3)
        Research.clearPages("thaumicenergistics.TEESSTERM")
        Research.addPage("thaumicenergistics.TEESSTERM", "thaumicenergistics.research_page.TEESSTERM.1")
        Research.addPage("thaumicenergistics.TEESSTERM", "thaumicenergistics.research_page.TEESSTERM.2")
        Arcane.addShaped("thaumicenergistics.TEESSTERM", ItemBracketHandler.getItem("thaumicenergistics:part.base", 4),
                "aqua 25, ordo 25, ignis 25, terra 25 ", arrayOf(arrayOf<IIngredient>(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:material", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 380),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 1)),
                arrayOf(OreBracketHandler.getOre("plateInfusedWater"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        OreBracketHandler.getOre("plateInfusedWater"))))
        Research.addArcanePage("thaumicenergistics.TEESSTERM",
                ItemBracketHandler.getItem("thaumicenergistics:part.base", 4))
        Research.addPage("thaumicenergistics.TEESSTERM", "thaumicenergistics.research_page.TEESSTERM.3")
        Arcane.addShaped("thaumicenergistics.TEESSTERM", ItemBracketHandler.getItem("thaumicenergistics:part.base", 1),
                "ordo 10, ignis 10",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 280),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3), null),
                        arrayOfNulls(3)))
        Research.addArcanePage("thaumicenergistics.TEESSTERM",
                ItemBracketHandler.getItem("thaumicenergistics:part.base", 1))
        Research.addPage("thaumicenergistics.TEESSTERM", "thaumicenergistics.research_page.TEESSTERM.4")
        Arcane.addShaped("thaumicenergistics.TEESSTERM", ItemBracketHandler.getItem("thaumicenergistics:part.base", 7),
                "aqua 15, ordo 15", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                OreBracketHandler.getOre("itemIlluminatedPanel"), OreBracketHandler.getOre("craftingToolHardHammer")),
                arrayOf(OreBracketHandler.getOre("screwInfusedWater"),
                        ItemBracketHandler.getItem("thaumicenergistics:part.base", 1),
                        OreBracketHandler.getOre("screwInfusedWater")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateInfusedOrder"),
                        OreBracketHandler.getOre("plateInfusedOrder"), OreBracketHandler.getOre("plateInfusedOrder"))))
        Research.addArcanePage("thaumicenergistics.TEESSTERM",
                ItemBracketHandler.getItem("thaumicenergistics:part.base", 7))
        Arcane.addShaped("thaumicenergistics.TEESSTERM", ItemBracketHandler.getItem("thaumicenergistics:part.base", 8),
                "ignis 20, ordo 20", arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                ItemBracketHandler.getItem("thaumicenergistics:part.base", 7),
                OreBracketHandler.getOre("craftingToolHardHammer")),
                arrayOf(OreBracketHandler.getOre("screwInfusedFire"),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 0),
                        OreBracketHandler.getOre("screwInfusedFire")),
                arrayOf(OreBracketHandler.getOre("plateInfusedOrder"),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 1),
                        OreBracketHandler.getOre("plateInfusedOrder"))))
        Research.addArcanePage("thaumicenergistics.TEESSTERM",
                ItemBracketHandler.getItem("thaumicenergistics:part.base", 8))
        Research.setAspects("thaumicenergistics.TEESSTERM",
                "praecantatio 15, permutatio 12, sensus 9, potentia 6, aqua 3")
        Research.setComplexity("thaumicenergistics.TEESSTERM", 3)
        //TODO replace ("extracells:vibrantchamberfluid", 0)
        //Arcane.addShaped("thaumicenergistics.TEESSVIBCMBR",
        //        ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.essentia.vibration.chamber", 0),
        //        "ignis 35, ordo 35, perditio 35, aqua 35",
        //        arrayOf(arrayOf(OreBracketHandler.getOre("plateInfusedOrder"),
        //                ItemBracketHandler.getItem("thaumicenergistics:part.base", 4),
        //                OreBracketHandler.getOre("plateInfusedOrder")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:material", 0),
        //                        ItemBracketHandler.getItem("extracells:vibrantchamberfluid", 0),
        //                        ItemBracketHandler.getItem("thaumicenergistics:material", 0)),
        //                arrayOf(OreBracketHandler.getOre("plateInfusedEntropy"),
        //                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
        //                        OreBracketHandler.getOre("plateInfusedEntropy"))))

        Research.setAspects("thaumicenergistics.TEESSVIBCMBR",
                "vitreus 18, machina 15, potentia 12, praecantatio 9, motus 6, aqua 3")
        Research.setComplexity("thaumicenergistics.TEESSVIBCMBR", 3)

        //TODO Replace ("extracells:part.base", 1)
        //Arcane.addShaped("thaumicenergistics.TEIO", ItemBracketHandler.getItem("thaumicenergistics:part.base", 0),
        //        "ordo 15, aqua 15, ignis 15, terra 15",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                ItemBracketHandler.getItem("thaumicenergistics:material", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
        //                arrayOf(OreBracketHandler.getOre("plateInfusedOrder"),
        //                        ItemBracketHandler.getItem("extracells:part.base", 1),
        //                        OreBracketHandler.getOre("plateInfusedOrder")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
        //                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 3),
        //                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0))))

        //TODO Replace ("extracells:part.base", 0)
        //Arcane.addShaped("thaumicenergistics.TEIO", ItemBracketHandler.getItem("thaumicenergistics:part.base", 3),
        //        "ordo 15, aqua 15, ignis 15, terra 15",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:blockTube", 3),
        //                ItemBracketHandler.getItem("Thaumcraft:blockJar", 0)),
        //                arrayOf(OreBracketHandler.getOre("plateInfusedOrder"),
        //                        ItemBracketHandler.getItem("extracells:part.base", 0),
        //                        OreBracketHandler.getOre("plateInfusedOrder")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                        ItemBracketHandler.getItem("thaumicenergistics:material", 1),
        //                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2))))

        //TODO Replace ("extracells:part.base", 2)
        //Arcane.addShaped("thaumicenergistics.TEIO", ItemBracketHandler.getItem("thaumicenergistics:part.base", 2),
        //        "ordo 20, aqua 20, ignis 20, terra 20",
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
        //                OreBracketHandler.getOre("plateInfusedWater"),
        //                ItemBracketHandler.getItem("Thaumcraft:blockJar", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:material", 0),
        //                        ItemBracketHandler.getItem("extracells:part.base", 2),
        //                        ItemBracketHandler.getItem("thaumicenergistics:material", 1)),
        //                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockTube", 3),
        //                        OreBracketHandler.getOre("plateInfusedWater"),
        //                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 3))))

        Research.setAspects("thaumicenergistics.TEIO", "motus 18, machina 15, metallum 12, vitreus 9, aer 6, aqua 3")
        Research.setComplexity("thaumicenergistics.TEIO", 3)
        Arcane.addShaped("thaumicenergistics.TEDISTILLATIONPATTERNENCODER",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.distillation.encoder", 0),
                "ordo 25, perditio 25, ignis 25", arrayOf(arrayOf(OreBracketHandler.getOre("plateInfusedFire"),
                ItemBracketHandler.getItem("Thaumcraft:ItemThaumometer", 0),
                OreBracketHandler.getOre("plateInfusedFire")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22),
                        ItemBracketHandler.getItem("ae2stuff:Encoder", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22)),
                arrayOf(OreBracketHandler.getOre("plateInfusedOrder"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                        OreBracketHandler.getOre("plateInfusedOrder"))))
        Research.setAspects("thaumicenergistics.TEDISTILLATIONPATTERNENCODER",
                "ordo 21, fabrico 18, permutatio 15, perditio 12, machina 9, lucrum 6, cognitio 3")
        Research.setComplexity("thaumicenergistics.TEDISTILLATIONPATTERNENCODER", 3)
        Arcane.addShaped("thaumicenergistics.TEFOCUSWRENCH",
                ItemBracketHandler.getItem("thaumicenergistics:focus.aewrench", 0), "ordo 25, aer 25, ignis 25",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 10),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 11),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ToolCertusQuartzWrench", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 10),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0))))
        Research.setAspects("thaumicenergistics.TEFOCUSWRENCH",
                "ignis 18, aer 15, machina 12, instrumentum 9, praecantatio 6, metallum 3")
        Research.setComplexity("thaumicenergistics.TEFOCUSWRENCH", 3)
        Arcane.addShaped("thaumicenergistics.TEGOLEMWIFIBACKPACK",
                ItemBracketHandler.getItem("thaumicenergistics:golem.wifi.backpack", 0), "ordo 30, aer 30, ignis 30",
                arrayOf(arrayOf(OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 440),
                        OreBracketHandler.getOre("plateThaumium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 41),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1)), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 9),
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCharger", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 9))))
        Research.setAspects("thaumicenergistics.TEGOLEMWIFIBACKPACK",
                "vacuos 21, potentia 18, auram 15, cognitio 12, tutamen 9, motus 6, permutatio 3")
        Research.setComplexity("thaumicenergistics.TEGOLEMWIFIBACKPACK", 3)
        Research.clearPages("thaumicenergistics.TESTORAGE")
        Research.addPage("thaumicenergistics.TESTORAGE", "thaumicenergistics.research_page.TESTORAGE.1")
        Research.addPage("thaumicenergistics.TESTORAGE", "thaumicenergistics.research_page.TESTORAGE.2")
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0), "ordo 10, ignis 10, aqua 10",
                arrayOf(arrayOf(OreBracketHandler.getOre("circuitPrimitive"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        OreBracketHandler.getOre("circuitPrimitive")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorEssentiaPulsatingCore",
                                        0), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                        arrayOf(OreBracketHandler.getOre("circuitPrimitive"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                                OreBracketHandler.getOre("circuitPrimitive"))))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0))
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1), "ordo 20, ignis 20, aqua 20",
                arrayOf(arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0),
                        OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorEssentiaPulsatingCore",
                                        0), ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0)),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0),
                                OreBracketHandler.getOre("circuitBasic"))))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1))
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2), "ordo 30, ignis 30, aqua 30",
                arrayOf(arrayOf(OreBracketHandler.getOre("circuitGood"),
                        ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1),
                        OreBracketHandler.getOre("circuitGood")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorEssentiaPulsatingCore",
                                        0), ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1)),
                        arrayOf(OreBracketHandler.getOre("circuitGood"),
                                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1),
                                OreBracketHandler.getOre("circuitGood"))))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2))
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 3), "ordo 40, ignis 40, aqua 40",
                arrayOf(arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                        ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2),
                        OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorEssentiaPulsatingCore",
                                        0), ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2)),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2),
                                OreBracketHandler.getOre("circuitAdvanced"))))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 3))

        //TODO Replace ("TConstruct:diamondApple", 0)
        //Arcane.addShaped("thaumicenergistics.TESTORAGE",
        //        ItemBracketHandler.getItem("thaumicenergistics:storage.casing", 0), "ordo 10, terra 10, aqua 10",
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                OreBracketHandler.getOre("plateInfusedFire"),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
        //                arrayOf(OreBracketHandler.getOre("plateInfusedEarth"),
        //                        ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                        OreBracketHandler.getOre("plateInfusedEarth")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
        //                        OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateThaumium"))))

        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.casing", 0))
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 0), "ordo 15, terra 15, aqua 15",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        OreBracketHandler.getOre("plateInfusedFire"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf(OreBracketHandler.getOre("plateInfusedEarth"),
                                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0),
                                OreBracketHandler.getOre("plateInfusedEarth")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateThaumium"))))
        Arcane.addShapeless("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 0), "ordo 5, terra 5, aqua 5",
                arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:storage.casing", 0),
                        ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0)))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 0))
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 1), "ordo 25, terra 25, aqua 25",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        OreBracketHandler.getOre("plateInfusedFire"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf(OreBracketHandler.getOre("plateInfusedEarth"),
                                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1),
                                OreBracketHandler.getOre("plateInfusedEarth")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateThaumium"))))
        Arcane.addShapeless("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 1), "ordo 15, terra 15, aqua 15",
                arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:storage.casing", 0),
                        ItemBracketHandler.getItem("thaumicenergistics:storage.component", 1)))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 1))
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 2), "ordo 35, terra 35, aqua 35",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        OreBracketHandler.getOre("plateInfusedFire"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf(OreBracketHandler.getOre("plateInfusedEarth"),
                                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2),
                                OreBracketHandler.getOre("plateInfusedEarth")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateThaumium"))))
        Arcane.addShapeless("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 2), "ordo 25, terra 25, aqua 25",
                arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:storage.casing", 0),
                        ItemBracketHandler.getItem("thaumicenergistics:storage.component", 2)))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 2))
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 3), "ordo 45, terra 45, aqua 45",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        OreBracketHandler.getOre("plateInfusedFire"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf(OreBracketHandler.getOre("plateInfusedEarth"),
                                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 3),
                                OreBracketHandler.getOre("plateInfusedEarth")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateThaumium"))))
        Arcane.addShapeless("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 3), "ordo 35, terra 35, aqua 35",
                arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicenergistics:storage.casing", 0),
                        ItemBracketHandler.getItem("thaumicenergistics:storage.component", 3)))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:storage.essentia", 3))
        Arcane.addShaped("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.essentia.cell.workbench", 0),
                "ordo 20, terra 20, ignis 20", arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                ItemBracketHandler.getItem("thaumicenergistics:storage.component", 0),
                OreBracketHandler.getOre("craftingToolWrench")), arrayOf(OreBracketHandler.getOre("screwInfusedEarth"),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCellWorkbench", 0),
                OreBracketHandler.getOre("screwInfusedEarth")), arrayOf(OreBracketHandler.getOre("plateInfusedOrder"),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22),
                OreBracketHandler.getOre("plateInfusedOrder"))))
        Research.addArcanePage("thaumicenergistics.TESTORAGE",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.essentia.cell.workbench", 0))
        Research.setAspects("thaumicenergistics.TESTORAGE",
                "vacuos 21, potentia 18, vitreus 15, metallum 12, cognitio 9, aqua 6, motus 3")
        Research.setComplexity("thaumicenergistics.TESTORAGE", 3)

        //TODO replace ("extracells:part.base", 9)
        //Arcane.addShaped("thaumicenergistics.TEVISINT", ItemBracketHandler.getItem("thaumicenergistics:part.base", 6),
        //        "ordo 20, terra 20, ignis 20, aqua 20, perditio 20, aer 20",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
        //                ItemBracketHandler.getItem("extracells:part.base", 9),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
        //                arrayOf(OreBracketHandler.getOre("screwInfusedEarth"),
        //                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 460),
        //                        OreBracketHandler.getOre("screwInfusedEarth")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("plateInfusedOrder"),
        //                        OreBracketHandler.getOre("plateInfusedOrder"),
        //                        OreBracketHandler.getOre("plateInfusedOrder"))))

        Research.setAspects("thaumicenergistics.TEVISINT",
                "vacuos 21, potentia 18, auram 15, metallum 12, cognitio 9, machina 6, aqua 3")
        Research.setComplexity("thaumicenergistics.TEVISINT", 3)
        Crucible.addRecipe("thaumicenergistics.TETHAUMGBOX",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.golem.gear.box", 0),
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.gear.box", 0),
                "metallum 32, praecantatio 32")
        Research.setAspects("thaumicenergistics.TETHAUMGBOX",
                "terra 15, machina 12, metallum 9, praecantatio 6, permutatio 3")
        Research.setComplexity("thaumicenergistics.TETHAUMGBOX", 3)

        //TODO Replace ("extracells:fluidcrafter", 0)
        //val s = "thaumicenergistics.TEARCANEASSEMBLER"
        //val item = ItemBracketHandler.getItem("extracells:fluidcrafter", 0)
        //val array = arrayOfNulls<IItemStack>(8)
        //val n = 0
        //val item2 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", OreDictionary.WILDCARD_VALUE)
        //val hashMap = HashMap<String, IData>()
        //hashMap["aqua"] = ExpandInt.toData(15000)
        //hashMap["ignis"] = ExpandInt.toData(15000)
        //hashMap["terra"] = ExpandInt.toData(15000)
        //hashMap["cap"] = ExpandString.asData("thaumium")
        //hashMap["rod"] = ExpandString.asData("silverwood")
        //hashMap["ordo"] = ExpandInt.toData(15000)
        //hashMap["sceptre"] = ExpandByte.asData(1.toByte())
        //hashMap["perditio"] = ExpandInt.toData(15000)
        //hashMap["aer"] = ExpandInt.toData(15000)
        //array[n] = item2.withTag(ExpandAnyDict.asData(hashMap))
        //array[1] = ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)
        //array[2] = ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)
        //array[3] = ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)
        //array[4] = ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)
        //array[5] = ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)
        //array[6] = ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5)
        //array[7] = ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)
        //Infusion.addRecipe(s, item, array,
        //        "auram 16, fabrico 64, metallum 8, permutatio 32, lucrum 16, praecantatio 48, vitreus 16",
        //        ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.arcane.assembler", 0), 16)

        Research.setAspects("thaumicenergistics.TEARCANEASSEMBLER",
                "lucrum 24, fabrico 21, machina 18, cognitio 15, permutatio 12, auram 9, praecantatio 6, aqua 3")
        Research.setComplexity("thaumicenergistics.TEARCANEASSEMBLER", 3)
        Arcane.addShaped("thaumicenergistics.TEKNOWLEDGEINSCRIBER",
                ItemBracketHandler.getItem("thaumicenergistics:knowledge.core", 0), "ordo 10, terra 10, aqua 10",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateInfusedOrder"),
                        OreBracketHandler.getOre("plateInfusedWater"), OreBracketHandler.getOre("plateInfusedOrder")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 9),
                                ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 9)),
                        arrayOf(OreBracketHandler.getOre("plateInfusedOrder"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23),
                                OreBracketHandler.getOre("plateInfusedOrder"))))
        Arcane.addShaped("thaumicenergistics.TEKNOWLEDGEINSCRIBER",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.knowledge.inscriber", 0),
                "ordo 20, terra 20, ignis 20, aqua 20, perditio 20, aer 20",
                arrayOf(arrayOf(OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 400),
                        OreBracketHandler.getOre("plateThaumium")),
                        arrayOf(OreBracketHandler.getOre("plateInfusedEntropy"),
                                ItemBracketHandler.getItem("thaumicenergistics:knowledge.core", 0),
                                OreBracketHandler.getOre("plateInfusedEntropy")),
                        arrayOf(OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemThaumonomicon", 0),
                                OreBracketHandler.getOre("plateThaumium"))))
        Research.setAspects("thaumicenergistics.TEKNOWLEDGEINSCRIBER",
                "cognitio 18, machina 15, fabrico 12, permutatio 9, praecantatio 6, alienis 3")
        Research.setComplexity("thaumicenergistics.TEKNOWLEDGEINSCRIBER", 3)
        Infusion.addRecipe("thaumicenergistics.TEINFPROV",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.essentia.provider", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockMirror", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("thaumicenergistics:part.base", 0),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockMirror", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 1),
                        ItemBracketHandler.getItem("thaumicenergistics:part.base", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                "machina 64, ordo 48, permutatio 32, praecantatio 16, alienis 24, spiritus 8",
                ItemBracketHandler.getItem("thaumicenergistics:thaumicenergistics.block.infusion.provider", 0), 10)
        Research.setAspects("thaumicenergistics.TEINFPROV",
                "permutatio 21, motus 18, sensus 15, machina 12, praecantatio 9, alienis 6, spiritus 3")
        Research.setComplexity("thaumicenergistics.TEINFPROV", 3)
        Research.refreshResearchRecipe("thaumicenergistics.TEESSPROV")
        Research.refreshResearchRecipe("thaumicenergistics.TEIRONGEARBOX")
        Research.refreshResearchRecipe("thaumicenergistics.TEARCANETERM")
        Research.refreshResearchRecipe("thaumicenergistics.TECERTUSDUPE")
        Research.refreshResearchRecipe("thaumicenergistics.TECORES")
        Research.refreshResearchRecipe("thaumicenergistics.TEESSTERM")
        Research.refreshResearchRecipe("thaumicenergistics.TEESSVIBCMBR")
        Research.refreshResearchRecipe("thaumicenergistics.TEIO")
        Research.refreshResearchRecipe("thaumicenergistics.TEDISTILLATIONPATTERNENCODER")
        Research.refreshResearchRecipe("thaumicenergistics.TEFOCUSWRENCH")
        Research.refreshResearchRecipe("thaumicenergistics.TEGOLEMWIFIBACKPACK")
        Research.refreshResearchRecipe("thaumicenergistics.TESTORAGE")
        Research.refreshResearchRecipe("thaumicenergistics.TEVISINT")
        Research.refreshResearchRecipe("thaumicenergistics.TETHAUMGBOX")
        Research.refreshResearchRecipe("thaumicenergistics.TEARCANEASSEMBLER")
        Research.refreshResearchRecipe("thaumicenergistics.TEKNOWLEDGEINSCRIBER")
        Research.refreshResearchRecipe("thaumicenergistics.TEINFPROV")
    }
}