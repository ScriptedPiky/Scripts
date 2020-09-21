package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class ThaumicExploration01 : Runnable {
    override fun run() {
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:discountRing", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ThaumicExploration:blankSeal", OreDictionary.WILDCARD_VALUE))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:jarSeal", OreDictionary.WILDCARD_VALUE))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:floatCandle", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:replicator", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:trashJar", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:bootsMeteor", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:bootsComet", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:soulBrazier", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:everfullUrn", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:everburnUrn", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:sojournerCapUncharged", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:sojournerCap", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:mechanistCapUncharged", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:mechanistCap", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:stabilizerBelt", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("minecraft:leather", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:pureZombieBrain", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:talismanFood", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:charmNoTaint", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:crucibleSouls", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:transmutationCore", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:transmutationStaffCore", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:amberCore", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:amberStaffCore", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicExploration:necroStaffCore", 0))
        Research.orphanResearch("DISCOUNTRINGS")
        Research.removeResearch("DISCOUNTRINGS")
        Research.addResearch("DiacountringsGTNH", "TX", "vitreus 12, praecantatio 9, lucrum 6, alienis 3", 1, 3, 2,
                ItemBracketHandler.getItem("ThaumicExploration:discountRing", 2))
        Research.addPrereq("DiacountringsGTNH", "TXBASICARTIFACE", false)
        Research.setConcealed("DiacountringsGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.DiacountringsGTNH", "Shard Rings")
        MineTweakerAPI.game.setLocalization("tc.research_text.DiacountringsGTNH", "Conserving vis")
        Research.addPage("DiacountringsGTNH", "te.text.DISCOUNTRINGS.1")
        Arcane.addShaped("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 0),
                "aer 25", arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedAir"),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0), OreBracketHandler.getOre("screwInfusedAir")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                arrayOf(OreBracketHandler.getOre("screwInfusedAir"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        OreBracketHandler.getOre("screwInfusedAir"))))
        Research.addArcanePage("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 0))
        Arcane.addShaped("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 1),
                "terra 25", arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedEarth"),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                OreBracketHandler.getOre("screwInfusedEarth")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                arrayOf(OreBracketHandler.getOre("screwInfusedEarth"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        OreBracketHandler.getOre("screwInfusedEarth"))))
        Research.addArcanePage("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 1))
        Arcane.addShaped("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 2),
                "ignis 25", arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedFire"),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1), OreBracketHandler.getOre("screwInfusedFire")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)),
                arrayOf(OreBracketHandler.getOre("screwInfusedFire"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        OreBracketHandler.getOre("screwInfusedFire"))))
        Research.addArcanePage("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 2))
        Arcane.addShaped("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 3),
                "aqua 25", arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedWater"),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                OreBracketHandler.getOre("screwInfusedWater")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                arrayOf(OreBracketHandler.getOre("screwInfusedWater"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        OreBracketHandler.getOre("screwInfusedWater"))))
        Research.addArcanePage("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 3))
        Arcane.addShaped("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 4),
                "ordo 25", arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedOrder"),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                OreBracketHandler.getOre("screwInfusedOrder")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
                arrayOf(OreBracketHandler.getOre("screwInfusedOrder"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        OreBracketHandler.getOre("screwInfusedOrder"))))
        Research.addArcanePage("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 4))
        Arcane.addShaped("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 5),
                "perditio 25", arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedEntropy"),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                OreBracketHandler.getOre("screwInfusedEntropy")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5)),
                arrayOf(OreBracketHandler.getOre("screwInfusedEntropy"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        OreBracketHandler.getOre("screwInfusedEntropy"))))
        Research.addArcanePage("DiacountringsGTNH", ItemBracketHandler.getItem("ThaumicExploration:discountRing", 5))
        Research.orphanResearch("JARSEAL")
        Research.removeResearch("JARSEAL")
        Research.addResearch("JarsealGTNH", "TX", "vinculum 18, alienis 15, praecantatio 12, iter 9, terra 6, aqua 3",
                -7, -2, 3, ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 1))
        Research.addPrereq("JarsealGTNH", "TALLOW", false)
        Research.addPrereq("JarsealGTNH", "JARLABEL", false)
        Research.setConcealed("JarsealGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.JarsealGTNH", "Seal of Jar Binding")
        MineTweakerAPI.game.setLocalization("tc.research_text.JarsealGTNH", "Essentia, essentia everywhere")
        Research.addPage("JarsealGTNH", "tc.research_page.JarsealGTNH.1")
        MineTweakerAPI.game.setLocalization("tc.research_page.JarsealGTNH.1",
                "By adjusting the mixture of aspects that you soak the tallow seal in to account for essentia's mystical properties, you have found that you are able to bind essentia containers, in particular, warded jars. Much like your previous binding seals, the jar binding seal can be dyed and an unlimited amount of networks can be created.")
        Research.addPage("JarsealGTNH", "tc.research_page.JarsealGTNH.2")
        MineTweakerAPI.game.setLocalization("tc.research_page.JarsealGTNH.2",
                "By right clicking on a jar with a jar binding seal, you can create a new network. Right clicking on a bound jar will link the seal to that network. Right clicking on an unbound jar with a linked seal will add that jar to the linked network. Note that only empty jars are able to be bound. You can not bind void jars or jars with labels.<BR><BR>Sealed jars have a higher suction than unlabeled jars but lower than labeled jars.")
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 15),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeWhite"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeWhite")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeWhite"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeWhite"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 15),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 15),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 15))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 15))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 0),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeBlack")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeBlack"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeBlack"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 0),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 0),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 0))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 0))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 1),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeRed"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeRed")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeRed"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeRed"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 1),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 1),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 1))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 1))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 2),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeGreen"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeGreen")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeGreen"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeGreen"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 2),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 2),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 2))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 2))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 3),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeBrown"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeBrown")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeBrown"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeBrown"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 3),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 3),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 3))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 3))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 4),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlue"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeBlue")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeBlue"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeBlue"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 4),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 4),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 4))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 4))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 5),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyePurple"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyePurple")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyePurple"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyePurple"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 5),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 5),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 5))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 5))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 6),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeCyan"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeCyan")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeCyan"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeCyan"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 6),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 6),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 6))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 6))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 7),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeLightGray"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeLightGray")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeLightGray"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeLightGray"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 7),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 7),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 7))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 7))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 8),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeGray"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeGray")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeGray"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeGray"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 8),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 8),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 8))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 8))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 9),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyePink"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyePink")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyePink"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyePink"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 9),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 9),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 9))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 9))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 10),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeLime"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeLime")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeLime"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeLime"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 10),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 10),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 10))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 10))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 11),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeYellow"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeYellow")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeYellow"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeYellow"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 11),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 11),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 11))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 11))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 12),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeLightBlue"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeLightBlue")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeLightBlue"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeLightBlue"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 12),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 12),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 12))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 12))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 13),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeMagenta"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeMagenta")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeMagenta"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeMagenta"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 13),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 13),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 13))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 13))
        Arcane.addShaped("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 14),
                "aer 5, aqua 5, ignis 5, terra 5", arrayOf(arrayOf(OreBracketHandler.getOre("dyeOrange"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4), OreBracketHandler.getOre("dyeOrange")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4)),
                arrayOf(OreBracketHandler.getOre("dyeOrange"), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 4),
                        OreBracketHandler.getOre("dyeOrange"))))
        Crucible.addRecipe("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 14),
                ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 14),
                "alienis 12, iter 12, permutatio 8, vinculum 8, vitreus 8")
        Research.addArcanePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:blankSeal", 14))
        Research.addCruciblePage("JarsealGTNH", ItemBracketHandler.getItem("ThaumicExploration:jarSeal", 14))
        Research.orphanResearch("FLOATCANDLE")
        Research.removeResearch("FLOATCANDLE")
        Research.addResearch("FloatingcandleGTNH", "TX", "aer 12, pannus 9, praecantatio 6, volatus 3", -7, -9, 2,
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 0))
        Research.addPrereq("FloatingcandleGTNH", "TXTALLOW", false)
        Research.setConcealed("FloatingcandleGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FloatingcandleGTNH", "Floating Candles")
        MineTweakerAPI.game.setLocalization("tc.research_text.FloatingcandleGTNH", "Wingardium Leviosa")
        Research.addPage("FloatingcandleGTNH", "tc.research_page.FloatingcandleGTNH")
        MineTweakerAPI.game.setLocalization("tc.research_page.FloatingcandleGTNH",
                "You always have felt that tallow candles are missing something... A touch of magic and an Aer shard should be enough to make them look right at home in any respected wizarding school. Floating candles can be placed in midair without a surface beneath them. These candles bob pleasingly, and add a touch of magic to any room.<BR><BR>Unfortunately, the candles don't seem to have an effect on infusion. You are sure that this will be fixed in the near future.")
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 0).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 0))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 1).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 1)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 1))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 2).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 2)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 2))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 3).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 3)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 3))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 4).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 4)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 4))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 5).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 5),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 5),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 5)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 5))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 6).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 6)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 6))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 7).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 7)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 7))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 8).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 8),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 8),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 8)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 8))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 9).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 9),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 9),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 9)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 9))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 10).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 10),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 10),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 10)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 10))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 11).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 11),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 11),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 11)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 11))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 12).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 12),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 12),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 12)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 12))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 13).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 13),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 13),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 13)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 13))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 14).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 14)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 14))
        Arcane.addShaped("FloatingcandleGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 15).amount(3), "aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 15)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir"),
                                OreBracketHandler.getOre("plateInfusedAir")), arrayOfNulls(3)))
        Research.addArcanePage("FloatingcandleGTNH", ItemBracketHandler.getItem("ThaumicExploration:floatCandle", 15))
        Research.orphanResearch("REPLICATOR")
        Research.removeResearch("REPLICATOR")
        Research.addResearch("ReplicatorGTNH", "TX", "lucrum 15, fabrico 12, machina 9, ordo 6, praecantatio 3", 4, -5,
                3, ItemBracketHandler.getItem("ThaumicExploration:replicator", 0))
        Research.addPrereq("ReplicatorGTNH", "DISTILESSENTIA", false)
        Research.addPrereq("ReplicatorGTNH", "TXINFUSION", false)
        Research.addPrereq("ReplicatorGTNH", "TXDISTILESSENTIA", false)
        Research.addPrereq("ReplicatorGTNH", "THAUMIUM", false)
        Research.setConcealed("ReplicatorGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ReplicatorGTNH", "Thaumic Replicator")
        MineTweakerAPI.game.setLocalization("tc.research_text.ReplicatorGTNH", "Equivalent exchange")
        Research.addPage("ReplicatorGTNH", "te.text.REPLICATOR.1")
        Research.addPage("ReplicatorGTNH", "te.text.REPLICATOR.2")
        Infusion.addRecipe("ReplicatorGTNH", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 2),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockTable", 15),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17514),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)),
                "fabrico 64, instrumentum 48, machina 48, ordo 32, praecantatio 24, lucrum 16",
                ItemBracketHandler.getItem("ThaumicExploration:replicator", 0), 12)
        Research.addInfusionPage("ReplicatorGTNH", ItemBracketHandler.getItem("ThaumicExploration:replicator", 0))
        Warp.addToResearch("ReplicatorGTNH", 2)
        Research.orphanResearch("TRASHJAR")
        Research.removeResearch("TRASHJAR")
        Research.addResearch("TrashjarGTNH", "TX", "perditio 15, vacuos 12, fames 9, alienis 6, praecantatio 3", 5, -9,
                3, ItemBracketHandler.getItem("ThaumicExploration:trashJar", 0))
        Research.addPrereq("TrashjarGTNH", "TXJARVOID", false)
        Research.addPrereq("TrashjarGTNH", "TXINFUSION", false)
        Research.addPrereq("TrashjarGTNH", "WARDEDARCANA", false)
        Research.addPrereq("TrashjarGTNH", "HUNGRYCHEST", false)
        Research.setConcealed("TrashjarGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.TrashjarGTNH", "Oblivion Jar")
        MineTweakerAPI.game.setLocalization("tc.research_text.TrashjarGTNH", "Essentia disposal")
        Research.addPage("TrashjarGTNH", "te.text.TRASHJAR.1")
        Research.addPage("TrashjarGTNH", "te.text.TRASHJAR.2")

        //TODO Replace ("ExtraUtilities:trashcan", 1)
        //Infusion.addRecipe("TrashjarGTNH", ItemBracketHandler.getItem("Thaumcraft:blockJar", 3),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockChestHungry", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                ItemBracketHandler.getItem("ExtraUtilities:trashcan", 1),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
        //        "alienis 16, fames 14, perditio 24, vacuos 32, praecantatio 12, tenebrae 8",
        //        ItemBracketHandler.getItem("ThaumicExploration:trashJar", 0), 9)

        Research.addInfusionPage("TrashjarGTNH", ItemBracketHandler.getItem("ThaumicExploration:trashJar", 0))
        Warp.addToResearch("TrashjarGTNH", 1)
        Research.orphanResearch("METEORBOOTS")
        Research.removeResearch("METEORBOOTS")
        Research.addResearch("MeteorbootsGTNH", "TX", "iter 15, ignis 12, potentia 9, volatus 6, praecantatio 3", 2, -1,
                3, ItemBracketHandler.getItem("ThaumicExploration:bootsMeteor", 0))
        Research.addPrereq("MeteorbootsGTNH", "TXBOOTSTRAVELLER", false)
        Research.addPrereq("MeteorbootsGTNH", "FOCUSFIRE", false)
        Research.addPrereq("MeteorbootsGTNH", "INFUSION", false)
        Research.setConcealed("MeteorbootsGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.MeteorbootsGTNH", "Boots of the Meteor")
        MineTweakerAPI.game.setLocalization("tc.research_text.MeteorbootsGTNH", "Come on and slam")
        Research.addPage("MeteorbootsGTNH", "te.text.METEORBOOTS.1")
        Infusion.addRecipe("MeteorbootsGTNH", ItemBracketHandler.getItem("Thaumcraft:BootsTraveller", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:FocusFire", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17347),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17347),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17347),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17347),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17347)),
                "ignis 32, iter 32, potentia 32, volatus 32, praecantatio 16",
                ItemBracketHandler.getItem("ThaumicExploration:bootsMeteor", 0), 6)
        Research.addInfusionPage("MeteorbootsGTNH", ItemBracketHandler.getItem("ThaumicExploration:bootsMeteor", 0))
        Research.orphanResearch("COMETBOOTS")
        Research.removeResearch("COMETBOOTS")
        Research.addResearch("CometsbootsGTNH", "TX", "iter 15, aqua 12, gelum 9, motus 6, praecantatio 3", 5, -3, 3,
                ItemBracketHandler.getItem("ThaumicExploration:bootsComet", 0))
        Research.addPrereq("CometsbootsGTNH", "TXBOOTSTRAVELLER", false)
        Research.addPrereq("CometsbootsGTNH", "FOCUSFROST", false)
        Research.addPrereq("CometsbootsGTNH", "INFUSION", false)
        Research.setConcealed("CometsbootsGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CometsbootsGTNH", "Boots of the Comet")
        MineTweakerAPI.game.setLocalization("tc.research_text.CometsbootsGTNH", "Ice ice baby")
        Research.addPage("CometsbootsGTNH", "te.text.COMETBOOTS.1")
        Infusion.addRecipe("CometsbootsGTNH", ItemBracketHandler.getItem("Thaumcraft:BootsTraveller", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:FocusFrost", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0)),
                "gelum 32, iter 32, aqua 32, motus 32, praecantatio 16",
                ItemBracketHandler.getItem("ThaumicExploration:bootsComet", 0), 6)
        Research.addInfusionPage("CometsbootsGTNH", ItemBracketHandler.getItem("ThaumicExploration:bootsComet", 0))
        Research.orphanResearch("SOULBRAZIER")
        Research.removeResearch("SOULBRAZIER")
        Research.addResearch("SoulbraizerGTNH", "TX", "auram 15, alienis 12, tenebrae 9, mortuus 6, praecantatio 3", -6,
                -10, 4, ItemBracketHandler.getItem("ThaumicExploration:soulBrazier", 0))
        Research.addPrereq("SoulbraizerGTNH", "TXTALLOW", false)
        Research.addPrereq("SoulbraizerGTNH", "ELDRITCHMINOR", false)
        Research.addPrereq("SoulbraizerGTNH", "VOIDMETAL", false)
        Research.addPrereq("SoulbraizerGTNH", "INFUSION", false)
        Research.addPrereq("SoulbraizerGTNH", "SANESOAP", false)
        Research.setConcealed("SoulbraizerGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.SoulbraizerGTNH", "Soul Brazier")
        MineTweakerAPI.game.setLocalization("tc.research_text.SoulbraizerGTNH", "Warp is bad mmkay?")
        Research.addPage("SoulbraizerGTNH", "te.text.SOULBRAZIER.1")
        Infusion.addRecipe("SoulbraizerGTNH", ItemBracketHandler.getItem("minecraft:nether_star", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemSanitySoap", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemSanitySoap", 0)),
                "auram 64, mortuus 48, tenebrae 48, alienis 32, praecantatio 16",
                ItemBracketHandler.getItem("ThaumicExploration:soulBrazier", 0), 16)
        Research.addInfusionPage("SoulbraizerGTNH", ItemBracketHandler.getItem("ThaumicExploration:soulBrazier", 0))
        Research.orphanResearch("URN")
        Research.removeResearch("URN")
        Research.addResearch("UrnGTNH", "TX", "aqua 15, praecantatio 12, vacuos 9, alienis 6, lucrum 3", 3, -10, 4,
                ItemBracketHandler.getItem("ThaumicExploration:everfullUrn", 0))
        Research.addPrereq("UrnGTNH", "TXINFUSION", false)
        Research.addPrereq("UrnGTNH", "ARCANEEAR", false)
        Research.setConcealed("UrnGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.UrnGTNH", "Everfull Urn")
        MineTweakerAPI.game.setLocalization("tc.research_text.UrnGTNH", "It seems familiar... ")
        Research.addPage("UrnGTNH", "tc.research_page.UrnGTNH")
        MineTweakerAPI.game.setLocalization("tc.research_page.UrnGTNH",
                "You have read much about an 'Everfull Urn' in your research, a mystical device created by the great Thaumaturge Azanor that acted as an endless source of water. You have finally constructed a device that can do that and more.<BR><BR>Your Everfull Urn can not only supply water to an infinite amount of buckets, it can also be pumped out of the top to an external tank. Your urn also has the ability to fill any nearby crucible, and extinguish nearby players that are on fire.<BR>If Botania is installed the Urn is also able to fill nearby Petal Apothecaries, if one chooses to dabble in floral magic.")
        Infusion.addRecipe("UrnGTNH", ItemBracketHandler.getItem("minecraft:flower_pot", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17028),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:brick", 0),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17028),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:brick", 0)),
                "aqua 64, praecantatio 48, vacuos 32, alienis 32, lucrum 16",
                ItemBracketHandler.getItem("ThaumicExploration:everfullUrn", 0), 9)
        Research.addInfusionPage("UrnGTNH", ItemBracketHandler.getItem("ThaumicExploration:everfullUrn", 0))
        Research.orphanResearch("BURN")
        Research.removeResearch("BURN")
        Research.addResearch("BurnGTNH", "TX", "ignis 15, praecantatio 12, vacuos 9, alienis 6, lucrum 3", 4, -11, 4,
                ItemBracketHandler.getItem("ThaumicExploration:everburnUrn", 0))
        Research.addPrereq("BurnGTNH", "UrnGTNH", false)
        Research.setConcealed("BurnGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.BurnGTNH", "Everburn Urn")
        MineTweakerAPI.game.setLocalization("tc.research_text.BurnGTNH", "Why did I make it out of fire??")
        Research.addPage("BurnGTNH", "te.text.BURN.1")
        Infusion.addRecipe("BurnGTNH", ItemBracketHandler.getItem("minecraft:flower_pot", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                        ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockcasings5", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17028),
                        ItemBracketHandler.getItem("gregtech:gt.blockcasings5", 3),
                        ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                        ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:brick", 0),
                        ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockcasings5", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17028),
                        ItemBracketHandler.getItem("gregtech:gt.blockcasings5", 3),
                        ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:brick", 0)),
                "ignis 64, praecantatio 48, vacuos 32, alienis 32, lucrum 16",
                ItemBracketHandler.getItem("ThaumicExploration:everburnUrn", 0), 9)
        Research.addInfusionPage("BurnGTNH", ItemBracketHandler.getItem("ThaumicExploration:everburnUrn", 0))
        Research.orphanResearch("CAP_SOJOURNER")
        Research.removeResearch("CAP_SOJOURNER")
        Research.addResearch("CAP_SOJOURNER", "TX", "auram 15, permutatio 12, potentia 9, lucrum 6, instrumentum 3", -5,
                -8, 3, ItemBracketHandler.getItem("ThaumicExploration:sojournerCapUncharged", 0))
        Research.addPrereq("CAP_SOJOURNER", "TXCAP_thaumium", false)
        Research.addPrereq("CAP_SOJOURNER", "WANDPED", false)
        Research.setConcealed("CAP_SOJOURNER", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CAP_SOJOURNER", "Sojourner's Wand Caps")
        MineTweakerAPI.game.setLocalization("tc.research_text.CAP_SOJOURNER", "Sentient wand caps")
        Research.addPage("CAP_SOJOURNER", "te.text.CAP_SOJOURNER.1")
        Arcane.addShaped("CAP_SOJOURNER", ItemBracketHandler.getItem("ThaumicExploration:sojournerCapUncharged", 0),
                "aer 35, perditio 35, ordo 35, aqua 35",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                        OreBracketHandler.getOre("plateLapis"), OreBracketHandler.getOre("screwDiamond")),
                        arrayOf(OreBracketHandler.getOre("plateLapis"),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                OreBracketHandler.getOre("plateLapis")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                                OreBracketHandler.getOre("plateLapis"), OreBracketHandler.getOre("screwDiamond"))))
        Research.addArcanePage("CAP_SOJOURNER",
                ItemBracketHandler.getItem("ThaumicExploration:sojournerCapUncharged", 0))
        Infusion.addRecipe("CAP_SOJOURNER", ItemBracketHandler.getItem("ThaumicExploration:sojournerCapUncharged", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2500),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2500),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2500)),
                "auram 48, praecantatio 32, permutatio 24, potentia 32, aer 16, ordo 16",
                ItemBracketHandler.getItem("ThaumicExploration:sojournerCap", 0), 6)
        Research.addInfusionPage("CAP_SOJOURNER", ItemBracketHandler.getItem("ThaumicExploration:sojournerCap", 0))
        Research.orphanResearch("CAP_MECHANIST")
        Research.removeResearch("CAP_MECHANIST")
        Research.addResearch("CAP_MECHANIST", "TX", "auram 15, machina 12, potentia 9, lucrum 6, instrumentum 3", -9,
                -6, 3, ItemBracketHandler.getItem("ThaumicExploration:mechanistCapUncharged", 0))
        Research.addPrereq("CAP_MECHANIST", "TXCAP_thaumium", false)
        Research.addPrereq("CAP_MECHANIST", "NODETAPPER2", false)
        Research.setConcealed("CAP_MECHANIST", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CAP_MECHANIST", "Mechanist's Wand Caps")
        MineTweakerAPI.game.setLocalization("tc.research_text.CAP_MECHANIST", "Mechanical wand caps")
        Research.addPage("CAP_MECHANIST", "te.text.CAP_MECHANIST.1")
        Arcane.addShaped("CAP_MECHANIST", ItemBracketHandler.getItem("ThaumicExploration:mechanistCapUncharged", 0),
                "aer 35, perditio 35, ordo 35, aqua 35",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                        OreBracketHandler.getOre("plateRedstone"), OreBracketHandler.getOre("screwDiamond")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:repeater", 0),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                ItemBracketHandler.getItem("minecraft:repeater", 0)),
                        arrayOf(OreBracketHandler.getOre("screwDiamond"),
                                ItemBracketHandler.getItem("minecraft:piston", 0),
                                OreBracketHandler.getOre("screwDiamond"))))
        Research.addArcanePage("CAP_MECHANIST",
                ItemBracketHandler.getItem("ThaumicExploration:mechanistCapUncharged", 0))
        Infusion.addRecipe("CAP_MECHANIST", ItemBracketHandler.getItem("ThaumicExploration:mechanistCapUncharged", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("minecraft:redstone", 0)),
                "auram 48, praecantatio 32, machina 24, potentia 32, aer 16, ordo 16",
                ItemBracketHandler.getItem("ThaumicExploration:mechanistCap", 0), 6)
        Research.addInfusionPage("CAP_MECHANIST", ItemBracketHandler.getItem("ThaumicExploration:mechanistCap", 0))
        Research.orphanResearch("STABILIZERBELT")
        Research.removeResearch("STABILIZERBELT")
        Research.addResearch("StabilizerbeltGTNH", "TX",
                "ordo 18, terra 15, iter 12, superbia 9, tutamen 6, praecantatio 3", 1, -10, 4,
                ItemBracketHandler.getItem("ThaumicExploration:stabilizerBelt", 0))
        Research.addPrereq("StabilizerbeltGTNH", "TXHOVERHARNESS", false)
        Research.addPrereq("StabilizerbeltGTNH", "TXINFUSION", false)
        Research.setConcealed("StabilizerbeltGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.StabilizerbeltGTNH", "Thaumostatic Stabilizer")
        MineTweakerAPI.game.setLocalization("tc.research_text.StabilizerbeltGTNH", "Knockback nullifiers")
        Research.addPage("StabilizerbeltGTNH", "te.text.STABILIZERBELT.1")
        Infusion.addRecipe("StabilizerbeltGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23330)),
                "ordo 48, terra 32, iter 12, superbia 24, tutamen 32, praecantatio 16",
                ItemBracketHandler.getItem("ThaumicExploration:stabilizerBelt", 0), 4)
        Research.addInfusionPage("StabilizerbeltGTNH",
                ItemBracketHandler.getItem("ThaumicExploration:stabilizerBelt", 0))
        Research.setAspects("ENCHBINDING", "vinculum 15, perditio 12, iter 9, superbia 6, cognitio 3")
        Research.setComplexity("ENCHBINDING", 3)
        Warp.addToResearch("ENCHBINDING", 1)
        Research.setAspects("ENCHNIGHTVISION", "sensus 15, lux 12, tenebrae 9, ignis 6, cognitio 3")
        Research.setComplexity("ENCHNIGHTVISION", 3)
        Warp.addToResearch("ENCHNIGHTVISION", 1)
        Research.setAspects("ENCHDISARM", "vinculum 15, limus 12, telum 9, praecantatio 6, cognitio 3")
        Research.setComplexity("ENCHDISARM", 3)
        Warp.addToResearch("ENCHDISARM", 1)
        Research.orphanResearch("FLESHCURE")
        Research.removeResearch("FLESHCURE")
        Research.addResearch("FleshcureGTNH", "TX", "pannus 15, tutamen 12, corpus 9, permutatio 6, alienis 3", -4, -10,
                2, ItemBracketHandler.getItem("minecraft:rotten_flesh", 0))
        Research.addPrereq("FleshcureGTNH", "TXTALLOW", false)
        Research.setConcealed("FleshcureGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FleshcureGTNH", "Flesh Purification")
        MineTweakerAPI.game.setLocalization("tc.research_text.FleshcureGTNH", "Making things better")
        Research.addPage("FleshcureGTNH", "te.text.FLESHCURE.1")
        Crucible.addRecipe("FleshcureGTNH", ItemBracketHandler.getItem("minecraft:leather", 0),
                ItemBracketHandler.getItem("minecraft:rotten_flesh", 0), "corpus 4, pannus 4, permutatio 4")
        Research.addCruciblePage("FleshcureGTNH", ItemBracketHandler.getItem("minecraft:leather", 0))
        Research.orphanResearch("BRAINCURE")
        Research.removeResearch("BRAINCURE")
        Research.addResearch("BraincureGTNH", "TX",
                "ordo 18, cognitio 15, humanus 12, exanimis 9, alienis 6, permutatio 3", -2, -8, 4,
                ItemBracketHandler.getItem("ThaumicExploration:pureZombieBrain", 0))
        Research.addPrereq("BraincureGTNH", "TXINFUSION", false)
        Research.addPrereq("BraincureGTNH", "JARBRAIN", false)
        Research.addPrereq("BraincureGTNH", "FleshcureGTNH", false)
        Research.setConcealed("BraincureGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.BraincureGTNH", "Brain Sanitization")
        MineTweakerAPI.game.setLocalization("tc.research_text.BraincureGTNH", "Brain washing")
        Research.addPage("BraincureGTNH", "te.text.BRAINCURE.1")
        Infusion.addRecipe("BraincureGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("minecraft:potion", 8264),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("minecraft:golden_apple", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                "ordo 32, sano 12, humanus 12, alienis 24, cognitio 16, praecantatio 8",
                ItemBracketHandler.getItem("ThaumicExploration:pureZombieBrain", 0), 5)
        Research.addInfusionPage("BraincureGTNH", ItemBracketHandler.getItem("ThaumicExploration:pureZombieBrain", 0))

        //TODO Replace ("harvestcraft:heartybreakfastItem", 0), ("harvestcraft:rainbowcurryItem", 0), ("harvestcraft:supremepizzaItem", 0)
        // ("harvestcraft:sausageinbreadItem", 0), ("harvestcraft:beefwellingtonItem", 0), ("harvestcraft:epicbaconItem", 0),
        // ("harvestcraft:meatfeastpizzaItem", 0) and ("harvestcraft:delightedmealItem", 0)
        //Research.orphanResearch("TALISMANFOOD")
        //Research.removeResearch("TALISMANFOOD")
        //Research.addResearch("TalismanfoodtGTNH", "TX", "fames 18, pannus 15, messis 12, sano 9, permutatio 6, ordo 3",
        //        -1, -11, 4, ItemBracketHandler.getItem("ThaumicExploration:talismanFood", 0))
        //Research.addPrereq("TalismanfoodtGTNH", "FleshcureGTNH", false)
        //Research.addPrereq("TalismanfoodtGTNH", "TXINFUSION", false)
        //Research.setConcealed("TalismanfoodtGTNH", true)
        //MineTweakerAPI.game.setLocalization("tc.research_name.TalismanfoodtGTNH", "Talisman of Nourishment")
        //MineTweakerAPI.game.setLocalization("tc.research_text.TalismanfoodtGTNH", "Everfull belly")
        //Research.addPage("TalismanfoodtGTNH", "tc.research_page.TalismanfoodtGTNH")
        //MineTweakerAPI.game.setLocalization("tc.research_page.TalismanfoodtGTNH",
        //        "You often find yourself needing to take breaks during marathon researching sessions to satisfy your hunger. Finally you have found a way to get past your need for food.<BR><BR>By infusing a diamond with the essence of hunger, you have created an item that is able to suck the nourishing energy from various food items in your hotbar and store this energy within. It will then automatically replenish your food meter if it is depleted.<BR><BR>This device will only work on simple food items, so foods that invoke effects such as Rotten Flesh and Golden Apples must be consumed normally.")
        //Infusion.addRecipe("TalismanfoodtGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
        //        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502),
        //                ItemBracketHandler.getItem("harvestcraft:heartybreakfastItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:rainbowcurryItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:supremepizzaItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:sausageinbreadItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:beefwellingtonItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:epicbaconItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:meatfeastpizzaItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:delightedmealItem", 0)),
        //        "fames 64, pannus 48, messis 24, sano 24, permutatio 32, ordo 16",
        //        ItemBracketHandler.getItem("ThaumicExploration:talismanFood", 0), 6)
        //Research.addInfusionPage("TalismanfoodtGTNH", ItemBracketHandler.getItem("ThaumicExploration:talismanFood", 0))

        Research.addPrereq("THINKTANK", "BraincureGTNH", false)
        Warp.addToResearch("THINKTANK", 2)
        Research.orphanResearch("DREAMCATCHER")
        Research.removeResearch("DREAMCATCHER")
        Research.addResearch("DreamcatcherGTNH", "TX",
                "vitium 15, cognitio 12, instrumentum 9, metallum 6, praecantatio 3", -7, 2, 3,
                ItemBracketHandler.getItem("ThaumicExploration:charmNoTaint", 0))
        Research.addPrereq("DreamcatcherGTNH", "TAINTBASICS", false)
        Research.setConcealed("DreamcatcherGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.DreamcatcherGTNH", "Wispy Dreamcatcher")
        MineTweakerAPI.game.setLocalization("tc.research_text.DreamcatcherGTNH", "Filtered thoughts")
        Research.addPage("DreamcatcherGTNH", "te.text.DREAMCATCHER.1")
        Arcane.addShaped("DreamcatcherGTNH", ItemBracketHandler.getItem("ThaumicExploration:charmNoTaint", 0),
                "ordo 25, perditio 25, terra 25",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                                ItemBracketHandler.getItem("minecraft:leather", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:feather", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12),
                                ItemBracketHandler.getItem("minecraft:feather", 0))))
        Research.addArcanePage("DreamcatcherGTNH", ItemBracketHandler.getItem("ThaumicExploration:charmNoTaint", 0))
        Research.orphanResearch("CRUCSOULS")
        Research.removeResearch("CRUCSOULS")
        Research.addResearch("CrucsoulGTNH", "TX", "spiritus 18, mortuus 15, fames 12, exanimis 9, telum 6, alienis 3",
                5, -7, 4, ItemBracketHandler.getItem("ThaumicExploration:crucibleSouls", 0))
        Research.addPrereq("CrucsoulGTNH", "TXDISTILESSENTIA", false)
        Research.addPrereq("CrucsoulGTNH", "BraincureGTNH", true)
        Research.addPrereq("CrucsoulGTNH", "TXINFUSION", false)
        Research.setConcealed("CrucsoulGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CrucsoulGTNH", "Crucible of Soulst")
        MineTweakerAPI.game.setLocalization("tc.research_text.CrucsoulGTNH", "Caution: Keep out of reach of children.")
        Research.addPage("CrucsoulGTNH", "te.text.CRUCSOULS.1")
        Research.addPage("CrucsoulGTNH", "te.text.CRUCSOULS.2")
        Infusion.addRecipe("CrucsoulGTNH", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 0),
                        ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                        ItemBracketHandler.getItem("minecraft:slime_ball", 0),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 1),
                        ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                        ItemBracketHandler.getItem("minecraft:magma_cream", 0),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                        ItemBracketHandler.getItem("minecraft:bone", 0)),
                "exanimis 24, fames 48, spiritus 32, mortuus 64, telum 24, vinculum 16, alienis 8",
                ItemBracketHandler.getItem("ThaumicExploration:crucibleSouls", 0), 8)
        Research.addInfusionPage("CrucsoulGTNH", ItemBracketHandler.getItem("ThaumicExploration:crucibleSouls", 0))
        Warp.addToResearch("CrucsoulGTNH", 4)
        Research.addPrereq("TENTACLERING", "BraincureGTNH", true)
        Research.setAspects("TENTACLERING", "vitium 15, telum 12, tutamen 9, alienis 6, praecantatio 3")
        Research.setComplexity("TENTACLERING", 3)
        Warp.addToResearch("TENTACLERING", 2)
        Research.orphanResearch("ROD_TRANSMUTATION")
        Research.removeResearch("ROD_TRANSMUTATION")
        Research.addResearch("ROD_TRANSMUTATION", "TX",
                "permutatio 15, instrumentum 12, praecantatio 9, alienis 6, terra 3", -1, -1, 4,
                ItemBracketHandler.getItem("ThaumicExploration:transmutationCore", 0))
        Research.addPrereq("ROD_TRANSMUTATION", "TXROD_greatwood", false)
        Research.addPrereq("ROD_TRANSMUTATION", "TXBASICARTIFACE", false)
        Research.addPrereq("ROD_TRANSMUTATION", "TXINFUSION", true)
        Research.setConcealed("ROD_TRANSMUTATION", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ROD_TRANSMUTATION", "Transmutative Wand Core")
        MineTweakerAPI.game.setLocalization("tc.research_text.ROD_TRANSMUTATION", "One thing into another")
        Research.addPage("ROD_TRANSMUTATION", "te.text.ROD_TRANSMUTATION.1")
        Infusion.addRecipe("ROD_TRANSMUTATION", ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                "praecantatio 32, permutatio 32, auram 24, terra 16, arbor 8, alienis 8",
                ItemBracketHandler.getItem("ThaumicExploration:transmutationCore", 0), 8)
        Research.addInfusionPage("ROD_TRANSMUTATION",
                ItemBracketHandler.getItem("ThaumicExploration:transmutationCore", 0))
        Research.orphanResearch("ROD_TRANSMUTATION_staff")
        Research.removeResearch("ROD_TRANSMUTATION_staff")
        Research.addResearch("ROD_TRANSMUTATION_staff", "TX",
                "permutatio 18, instrumentum 15, praecantatio 12, alienis 9, terra 6, arbor 3", 0, 0, 4,
                ItemBracketHandler.getItem("ThaumicExploration:transmutationStaffCore", 0))
        Research.addPrereq("ROD_TRANSMUTATION_staff", "TXROD_greatwood_staff", false)
        Research.addPrereq("ROD_TRANSMUTATION_staff", "ROD_TRANSMUTATION", false)
        Research.addPrereq("ROD_TRANSMUTATION_staff", "TXBASICARTIFACE", false)
        Research.setConcealed("ROD_TRANSMUTATION_staff", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ROD_TRANSMUTATION_staff", "Transmutative Staff Core")
        MineTweakerAPI.game.setLocalization("tc.research_text.ROD_TRANSMUTATION_staff", "One thing into another")
        Research.addPage("ROD_TRANSMUTATION_staff", "te.text.ROD_TRANSMUTATION_staff.1")
        Arcane.addShaped("ROD_TRANSMUTATION_staff",
                ItemBracketHandler.getItem("ThaumicExploration:transmutationStaffCore", 0),
                "ordo 85, perditio 85, terra 85, aqua 85, ignis 85, aer 85",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("ThaumicExploration:transmutationCore", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicExploration:transmutationCore", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.addArcanePage("ROD_TRANSMUTATION_staff",
                ItemBracketHandler.getItem("ThaumicExploration:transmutationStaffCore", 0))
        Research.orphanResearch("ROD_AMBER")
        Research.removeResearch("ROD_AMBER")
        Research.addResearch("ROD_AMBER", "TX", "auram 15, instrumentum 12, praecantatio 9, vinculum 6, vitreus 3", -5,
                -1, 4, ItemBracketHandler.getItem("ThaumicExploration:amberCore", 0))
        Research.addPrereq("ROD_AMBER", "TXROD_greatwood", false)
        Research.setConcealed("ROD_AMBER", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ROD_AMBER", "Amber Wand Core")
        MineTweakerAPI.game.setLocalization("tc.research_text.ROD_AMBER", "Regenerative vis storage")
        Research.addPage("ROD_AMBER", "te.text.ROD_AMBER.1")
        Infusion.addRecipe("ROD_AMBER", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23514),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 6)),
                "praecantatio 32, vinculum 32, auram 24, vitreus 16, arbor 8, alienis 8",
                ItemBracketHandler.getItem("ThaumicExploration:amberCore", 0), 8)
        Research.addInfusionPage("ROD_AMBER", ItemBracketHandler.getItem("ThaumicExploration:amberCore", 0))
        Research.orphanResearch("ROD_AMBER_staff")
        Research.removeResearch("ROD_AMBER_staff")
        Research.addResearch("ROD_AMBER_staff", "TX",
                "vinculum 18, instrumentum 15, praecantatio 12, alienis 9, auram 6, alienis 3", -6, 0, 4,
                ItemBracketHandler.getItem("ThaumicExploration:amberStaffCore", 0))
        Research.addPrereq("ROD_AMBER_staff", "TXROD_greatwood_staff", false)
        Research.addPrereq("ROD_AMBER_staff", "TXBASICARTIFACE", true)
        Research.setConcealed("ROD_AMBER_staff", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ROD_AMBER_staff", "Amber Staff Core")
        MineTweakerAPI.game.setLocalization("tc.research_text.ROD_AMBER_staff", "Regenerative vis storage")
        Research.addPage("ROD_AMBER_staff", "te.text.ROD_AMBER_staff.1")
        Arcane.addShaped("ROD_AMBER_staff", ItemBracketHandler.getItem("ThaumicExploration:amberStaffCore", 0),
                "ordo 85, perditio 85, terra 85, aqua 85, ignis 85, aer 85",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("ThaumicExploration:amberCore", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicExploration:amberCore", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.addArcanePage("ROD_AMBER_staff", ItemBracketHandler.getItem("ThaumicExploration:amberStaffCore", 0))
        Research.orphanResearch("ROD_NECROMANCER_staff")
        Research.removeResearch("ROD_NECROMANCER_staff")
        Research.addResearch("ROD_NECROMANCER_staff", "TX",
                "mortuus 21, instrumentum 18, perditio 15, auram 12, spiritus 9, exanimis 6, cognitio 3", -3, 1, 4,
                ItemBracketHandler.getItem("ThaumicExploration:necroStaffCore", 0))
        Research.addPrereq("ROD_NECROMANCER_staff", "TXROD_greatwood_staff", false)
        Research.addPrereq("ROD_NECROMANCER_staff", "BraincureGTNH", true)
        Research.setConcealed("ROD_NECROMANCER_staff", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ROD_NECROMANCER_staff", "Necromancer's Staff Core")
        MineTweakerAPI.game.setLocalization("tc.research_text.ROD_NECROMANCER_staff", "The power of the undead")
        Research.addPage("ROD_NECROMANCER_staff", "te.text.ROD_NECROMANCER_staff.1")
        Infusion.addRecipe("ROD_NECROMANCER_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 57),
                arrayOf(ItemBracketHandler.getItem("minecraft:skull", 1),
                        ItemBracketHandler.getItem("ThaumicExploration:pureZombieBrain", 0),
                        ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                        ItemBracketHandler.getItem("minecraft:bone", 0),
                        ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("ThaumicExploration:pureZombieBrain", 0),
                        ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                        ItemBracketHandler.getItem("minecraft:bone", 0)),
                "mortuus 64, instrumentum 24, perditio 48, auram 32, spiritus 32, exanimis 16, cognitio 16",
                ItemBracketHandler.getItem("ThaumicExploration:necroStaffCore", 0), 12)
        Research.addInfusionPage("ROD_NECROMANCER_staff",
                ItemBracketHandler.getItem("ThaumicExploration:necroStaffCore", 0))
        Warp.addToResearch("ROD_NECROMANCER_staff", 3)
        Research.refreshResearchRecipe("ENCHBINDING")
        Research.refreshResearchRecipe("ENCHNIGHTVISION")
        Research.refreshResearchRecipe("ENCHDISARM")
    }
}