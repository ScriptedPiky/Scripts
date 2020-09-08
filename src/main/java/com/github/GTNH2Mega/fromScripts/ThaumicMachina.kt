package com.github.GTNH2Mega.fromScripts

import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Research
import modtweaker2.mods.thaumcraft.handlers.Warp

class ThaumicMachina : Runnable {
    override fun run() {
        Research.orphanResearch("@TMTHAUMATURGY")
        Research.removeResearch("@TMTHAUMATURGY")
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicMachina:wandAugmentationCore", 0))
        Research.setAspects("@WAND_STABILITY", "perditio 3, ordo 12, instrumentum 6, praecantatio 9")
        Research.setComplexity("@WAND_STABILITY", 3)
        Research.setAspects("@WAND_STUDIES", "perditio 3, auram 9, cognitio 15, ordo 12, instrumentum 6")
        Research.setComplexity("@WAND_STUDIES", 3)
        Research.clearPages("@WAND_AUGMENTATION")
        Research.addPrereq("@WAND_AUGMENTATION", "MIRROR", false)
        Research.setConcealed("@WAND_AUGMENTATION", true)
        Research.addPage("@WAND_AUGMENTATION", "tm.research.page.WAND_AUGMENTATION.1")
        Research.addPage("@WAND_AUGMENTATION", "tm.research.page.WAND_AUGMENTATION.2")
        Research.addPage("@WAND_AUGMENTATION", "tm.research.page.WAND_AUGMENTATION.3")
        Arcane.addShaped("@WAND_AUGMENTATION", ItemBracketHandler.getItem("ThaumicMachina:wandAugmentationCore", 0),
                "ordo 35, perditio 35", arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                OreBracketHandler.getOre("plateEnergeticAlloy"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                arrayOf(OreBracketHandler.getOre("plateEnergeticAlloy"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                        OreBracketHandler.getOre("plateEnergeticAlloy")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        OreBracketHandler.getOre("plateEnergeticAlloy"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14))))
        Research.addArcanePage("@WAND_AUGMENTATION",
                ItemBracketHandler.getItem("ThaumicMachina:wandAugmentationCore", 0))
        Research.setAspects("@WAND_AUGMENTATION", "instrumentum 3, praecantatio 6, ordo 9, machina 12, perditio 15")
        Research.setComplexity("@WAND_AUGMENTATION", 3)
        Research.setAspects("@VIS", "alienis 3, auram 9, praecantatio 6")
        Research.setComplexity("@VIS", 2)
        Research.setAspects("@VIS_STUDIES", "alienis 3, auram 12, cognitio 6, potentia 9, praecantatio 15")
        Research.setComplexity("@VIS_STUDIES", 3)
        Research.setAspects("@VIS_CHARGE", "alienis 3, auram 12, potentia 6, perditio 9, praecantatio 15")
        Research.setComplexity("@VIS_CHARGE", 3)
        Research.setAspects("@NODAL_STUDIES", "alienis 3, auram 12, cognitio 6, cognitio 9, praecantatio 15")
        Research.setComplexity("@NODAL_STUDIES", 3)
        Research.setAspects("@AURA_FIELD", "alienis 3, auram 12, potentia 6, vacuos 9, praecantatio 15")
        Research.setComplexity("@AURA_FIELD", 3)
        Research.setAspects("@CRIMSON_ASTRONOMY", "alienis 3, auram 12, tenebrae 6, vacuos 9, praecantatio 15")
        Research.setComplexity("@CRIMSON_ASTRONOMY", 3)
        Research.setAspects("@CRIMSON_REALISATION", "alienis 3, auram 12, tenebrae 6, praecantatio 9, potentia 15")
        Research.setComplexity("@CRIMSON_REALISATION", 3)
        Research.setAspects("@CRIMSON_CELESTIAL_FIELD",
                "alienis 3, auram 12, tenebrae 6, praecantatio 9, ordo 15, vacuos 18")
        Research.setComplexity("@CRIMSON_CELESTIAL_FIELD", 3)
        Research.setAspects("@CRIMSON_THAUMATURGY", "alienis 3, instrumentum 12, tenebrae 6, praecantatio 9, ordo 15")
        Research.setComplexity("@CRIMSON_THAUMATURGY", 3)
        Research.setAspects("@CRIMSON_WAND_AUGMENTATION",
                "alienis 3, tenebrae 6, instrumentum 12, praecantatio 9, ordo 15, machina 18, cognitio 21")
        Research.setComplexity("@CRIMSON_WAND_AUGMENTATION", 3)
        Research.setAspects("@WAND_AUGMENTATION_TAINTED_CORE",
                "instrumentum 3, praecantatio 6, perditio 12, vitium 9, tenebrae 15, alienis 18, cognitio 21")
        Research.setComplexity("@WAND_AUGMENTATION_TAINTED_CORE", 3)
        Warp.addToResearch("@WAND_AUGMENTATION_TAINTED_CORE", 5)
        Research.setAspects("@WAND_AUGMENTATION_CHARGE_BUFFER",
                "instrumentum 3, praecantatio 6, potentia 12, vacuos 9, tenebrae 15, alienis 18")
        Research.setComplexity("@WAND_AUGMENTATION_CHARGE_BUFFER", 3)
        Research.setAspects("@WAND_AUGMENTATION_VIS_CHANNEL",
                "instrumentum 3, praecantatio 6, aqua 9, tenebrae 12, alienis 15")
        Research.setComplexity("@WAND_AUGMENTATION_VIS_CHANNEL", 3)
        Research.setAspects("@WAND_AUGMENTATION_CONTACT_DISCHARGE",
                "instrumentum 3, praecantatio 6, potentia 12, tenebrae 15, alienis 18, telum 21")
        Research.setComplexity("@WAND_AUGMENTATION_CONTACT_DISCHARGE", 3)
        Warp.addToResearch("@WAND_AUGMENTATION_CONTACT_DISCHARGE", 5)
        Research.setAspects("@WAND_AUGMENTATION_TAINT_CAPPING",
                "instrumentum 3, praecantatio 6, vitium 9, auram 12, alienis 15, potentia 18, cognitio 21")
        Research.setComplexity("@WAND_AUGMENTATION_TAINT_CAPPING", 3)
        Warp.addToResearch("@WAND_AUGMENTATION_TAINT_CAPPING", 5)
    }
}