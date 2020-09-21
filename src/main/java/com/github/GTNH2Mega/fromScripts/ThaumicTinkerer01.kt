package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels
import gttweaker.mods.gregtech.machines.CuttingSaw
import gttweaker.mods.gregtech.machines.PrecisionLaser
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyArray
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import modtweaker2.mods.thaumcraft.handlers.*
import java.util.*

class ThaumicTinkerer01 : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ThaumicTinkerer:shareBook", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzSlab", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:interface", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:connector", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:dislocator", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:gaseousLightItem", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:gaseousShadowItem", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:gasRemover", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:brightNitor", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:fireFire", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:fireWater", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:fireEarth", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:fireOrder", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:fireAir", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:fireChaos", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 1))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 2))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:funnel", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:repairer", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:magnet", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:magnet", 1))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:soulMould", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:animationTablet", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:LevitationalLocomotive", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:LevitationalLocomotiveRelay", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:cleansingTalisman", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:platform", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:bloodSword", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:spawner", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusSmelt", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusFlight", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusDeflect", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusEnderChest", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusTelekinesis", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusDislocation", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusHeal", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:enchanter", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:spellCloth", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:xpTalisman", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:revealingHelm", 0))
        Research.orphanResearch("SHARE_TOME")
        Research.removeResearch("SHARE_TOME")
        Research.addResearch("SHARETOME", "TT_CATEGORY",
                "cognitio 15, praecantatio 12, permutatio 9, instrumentum 6, terra 3", 0, -1, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:shareBook", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SHARETOME", "Tome of Knowledge Sharing")
        MineTweakerAPI.game.setLocalization("tc.research_text.SHARETOME", "[TT] A Goldfish's Diary")
        Research.addPrereq("SHARETOME", "INFUSION", false)
        Research.setConcealed("SHARETOME", false)
        Research.addPage("SHARETOME", "ttresearch.page.SHARE_TOME.0")
        Infusion.addRecipe("SHARETOME", ItemBracketHandler.getItem("minecraft:skull", 3),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("minecraft:paper", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemThaumonomicon", 0),
                        ItemBracketHandler.getItem("minecraft:paper", 0)),
                "cognitio 32, praecantatio 16, permutatio 32, pannus 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:shareBook", 0), 6)
        Research.addInfusionPage("SHARETOME", ItemBracketHandler.getItem("ThaumicTinkerer:shareBook", 0))
        Research.orphanResearch("DARK_QUARTZ")
        Research.removeResearch("DARK_QUARTZ")
        Research.addResearch("DARKQUARTZ", "TT_CATEGORY", "null", -2, 2, 1,
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0))
        Research.setRound("DARKQUARTZ", true)
        Research.setAutoUnlock("DARKQUARTZ", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.DARKQUARTZ", "Smokey Quartz")
        MineTweakerAPI.game.setLocalization("tc.research_text.DARKQUARTZ", "[TT] Shadow of the Day")
        Research.addPage("DARKQUARTZ", "ttresearch.page.DARK_QUARTZ.0")
        Arcane.addShaped("DARKQUARTZ", ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0), "perditio 8",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                        OreBracketHandler.getOre("gemQuartz"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"), OreBracketHandler.getOre("coal"),
                                OreBracketHandler.getOre("gemQuartz")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                                OreBracketHandler.getOre("gemQuartz"), OreBracketHandler.getOre("gemQuartz"))))
        Arcane.addShaped("DARKQUARTZ", ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0), "perditio 8",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                        OreBracketHandler.getOre("gemQuartz"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                                OreBracketHandler.getOre("charcoal"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                                OreBracketHandler.getOre("gemQuartz"), OreBracketHandler.getOre("gemQuartz"))))
        Research.addArcanePage("DARKQUARTZ", ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0))
        Research.addCraftingPage("DARKQUARTZ", ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 2))
        Research.addCraftingPage("DARKQUARTZ", ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzSlab", 0))
        Research.addCraftingPage("DARKQUARTZ", ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzStairs", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzSlab", 0).amount(2),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0))), null)
        Research.addPrereq("INTERFACE", "INFUSION", false)
        Research.addPrereq("INTERFACE", "DARKQUARTZ", false)
        Research.setConcealed("INTERFACE", true)
        Arcane.addShaped("INTERFACE", ItemBracketHandler.getItem("ThaumicTinkerer:interface", 0),
                "ordo 32, perditio 32, terra 16",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        OreBracketHandler.getOre("pipeLargeSteel"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6)),
                        arrayOf(OreBracketHandler.getOre("pipeLargeElectrum"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32670),
                                OreBracketHandler.getOre("pipeLargeElectrum")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                OreBracketHandler.getOre("pipeLargeSteel"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6))))
        Arcane.addShaped("INTERFACE", ItemBracketHandler.getItem("ThaumicTinkerer:connector", 0), "ordo 16",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                        OreBracketHandler.getOre("screwThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2)),
                        arrayOf(null, ItemBracketHandler.getItem("Forestry:oakStick", 0),
                                OreBracketHandler.getOre("screwThaumium")),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Forestry:oakStick", 0), null,
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3))))
        Research.setAspects("INTERFACE", "ordo 12, perditio 9, potentia 6, aqua 3")
        Research.setComplexity("INTERFACE", 3)
        Arcane.addShaped("DISLOCATOR", ItemBracketHandler.getItem("ThaumicTinkerer:dislocator", 0),
                "ordo 48, perditio 48, terra 24", arrayOf(arrayOf(OreBracketHandler.getOre("screwThaumium"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10), OreBracketHandler.getOre("plateEnderPearl")),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("ThaumicTinkerer:interface", 0),
                        OreBracketHandler.getOre("circuitBasic")), arrayOf(OreBracketHandler.getOre("plateEnderPearl"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10), OreBracketHandler.getOre("screwThaumium"))))
        Research.setAspects("DISLOCATOR", "cognitio 15, ordo 12, perditio 9, potentia 6, aqua 3")
        Research.setComplexity("DISLOCATOR", 4)
        Crucible.addRecipe("GASEOUS_LIGHT", ItemBracketHandler.getItem("ThaumicTinkerer:gaseousLightItem", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0), "lux 16, aer 12, motus 10")
        Research.setAspects("GASEOUS_LIGHT", "lux 9, aer 6, motus 3, praecantatio 3")
        Research.setComplexity("GASEOUS_LIGHT", 2)
        Research.setConcealed("GASEOUS_SHADOW", true)
        Crucible.addRecipe("GASEOUS_SHADOW", ItemBracketHandler.getItem("ThaumicTinkerer:gaseousShadowItem", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0), "tenebrae 16, aer 12, motus 10")
        Research.setAspects("GASEOUS_SHADOW", "tenebrae 9, aer 6, motus 3, praecantatio 3")
        Research.setComplexity("GASEOUS_SHADOW", 2)
        Research.setConcealed("GAS_REMOVER", true)
        Arcane.addShaped("GAS_REMOVER", ItemBracketHandler.getItem("ThaumicTinkerer:gasRemover", 0),
                "ordo 16, aer 12, perditio 8", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                OreBracketHandler.getOre("screwThaumium"), OreBracketHandler.getOre("gemQuartz")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicTinkerer:gaseousLightItem", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:interface", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:gaseousShadowItem", 0)),
                arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0),
                        OreBracketHandler.getOre("screwThaumium"),
                        ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0))))
        Research.setAspects("GASEOUS_SHADOW", "ignis 12, tenebrae 12, aer 9, motus 6, praecantatio 3")
        Research.setComplexity("GASEOUS_SHADOW", 3)
        Research.addPrereq("BRIGHT_NITOR", "INFUSION", false)
        Crucible.addRecipe("BRIGHT_NITOR", ItemBracketHandler.getItem("ThaumicTinkerer:brightNitor", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1), "ignis 16, aer 16, potentia 32, lux 32")
        Research.setAspects("BRIGHT_NITOR", "ignis 15, lux 12, aer 9, potentia 6, praecantatio 3")
        Research.setComplexity("BRIGHT_NITOR", 3)
        Research.orphanResearch("FIRE_IGNIS")
        Research.removeResearch("FIRE_IGNIS")
        Research.addResearch("FIREIGNIS", "TT_CATEGORY", "ignis 15, lux 12, aer 9, praecantatio 3", 4, -4, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:fireFire", 0))
        Research.addPrereq("FIREIGNIS", "INFUSION", false)
        Research.addPrereq("FIREIGNIS", "BRIGHT_NITOR", false)
        Research.addPrereq("FIREIGNIS", "ELDRITCHMINOR", false)
        Research.setConcealed("FIREIGNIS", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FIREIGNIS", "Elemental Fire: Ignis")
        MineTweakerAPI.game.setLocalization("tc.research_text.FIREIGNIS", "[TT] Fire infused with.....more fire!")
        Research.addPage("FIREIGNIS", "ttresearch.page.FIRE_IGNIS.0")
        val s = "FIREIGNIS"
        val item = ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 1)
        val hashMap = HashMap<String, IData>()
        val s2 = "Aspects"
        val array = arrayOf<IData?>(null)
        val n = 0
        val hashMap2 = HashMap<String, IData>()
        hashMap2["amount"] = ExpandInt.toData(8)
        hashMap2["key"] = ExpandString.asData("ignis")
        array[n] = ExpandAnyDict.asData(hashMap2)
        hashMap[s2] = ExpandAnyArray.asData(array)
        Infusion.addRecipe(s, item.withTag(ExpandAnyDict.asData(hashMap)),
                arrayOf(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)),
                "ignis 10, lux 10, aer 10, praecantatio 10", ItemBracketHandler.getItem("ThaumicTinkerer:fireFire", 0),
                16)
        Research.addInfusionPage("FIREIGNIS", ItemBracketHandler.getItem("ThaumicTinkerer:fireFire", 0))
        Warp.addToResearch("FIREIGNIS", 10)
        Research.orphanResearch("FIRE_AQUA")
        Research.removeResearch("FIRE_AQUA")
        Research.addResearch("FIREAQUA", "TT_CATEGORY", "aqua 15, lux 12, aer 9, praecantatio 3", 2, -2, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:fireWater", 0))
        Research.addPrereq("FIREAQUA", "INFUSION", false)
        Research.addPrereq("FIREAQUA", "BRIGHT_NITOR", false)
        Research.addPrereq("FIREAQUA", "ELDRITCHMINOR", false)
        Research.setConcealed("FIREAQUA", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FIREAQUA", "Elemental Fire: Aqua")
        MineTweakerAPI.game.setLocalization("tc.research_text.FIREAQUA", "[TT] Water plus Fire. This should end well.")
        Research.addPage("FIREAQUA", "ttresearch.page.FIRE_AQUA.0")
        val s3 = "FIREAQUA"
        val item2 = ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 1)
        val hashMap3 = HashMap<String, IData>()
        val s4 = "Aspects"
        val array2 = arrayOf<IData?>(null)
        val n2 = 0
        val hashMap4 = HashMap<String, IData>()
        hashMap4["amount"] = ExpandInt.toData(8)
        hashMap4["key"] = ExpandString.asData("aqua")
        array2[n2] = ExpandAnyDict.asData(hashMap4)
        hashMap3[s4] = ExpandAnyArray.asData(array2)
        Infusion.addRecipe(s3, item2.withTag(ExpandAnyDict.asData(hashMap3)),
                arrayOf(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                "aqua 10, lux 10, aer 10, praecantatio 10", ItemBracketHandler.getItem("ThaumicTinkerer:fireWater", 0),
                16)
        Research.addInfusionPage("FIREAQUA", ItemBracketHandler.getItem("ThaumicTinkerer:fireWater", 0))
        Warp.addToResearch("FIREAQUA", 10)
        Research.orphanResearch("FIRE_TERRA")
        Research.removeResearch("FIRE_TERRA")
        Research.addResearch("FIRETERRA", "TT_CATEGORY", "terra 15, lux 12, aer 9, praecantatio 3", 4, -6, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:fireEarth", 0))
        Research.addPrereq("FIRETERRA", "INFUSION", false)
        Research.addPrereq("FIRETERRA", "BRIGHT_NITOR", false)
        Research.addPrereq("FIRETERRA", "ELDRITCHMINOR", false)
        Research.setConcealed("FIRETERRA", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FIRETERRA", "Elemental Fire: Terra")
        MineTweakerAPI.game.setLocalization("tc.research_text.FIRETERRA",
                "[TT] Enough dirt to ... do whatever one does with dirt")
        Research.addPage("FIRETERRA", "ttresearch.page.FIRE_TERRA.0")
        val s5 = "FIRETERRA"
        val item3 = ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 1)
        val hashMap5 = HashMap<String, IData>()
        val s6 = "Aspects"
        val array3 = arrayOf<IData?>(null)
        val n3 = 0
        val hashMap6 = HashMap<String, IData>()
        hashMap6["amount"] = ExpandInt.toData(8)
        hashMap6["key"] = ExpandString.asData("terra")
        array3[n3] = ExpandAnyDict.asData(hashMap6)
        hashMap5[s6] = ExpandAnyArray.asData(array3)
        Infusion.addRecipe(s5, item3.withTag(ExpandAnyDict.asData(hashMap5)),
                arrayOf(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                "terra 10, lux 10, aer 10, praecantatio 10", ItemBracketHandler.getItem("ThaumicTinkerer:fireEarth", 0),
                16)
        Research.addInfusionPage("FIRETERRA", ItemBracketHandler.getItem("ThaumicTinkerer:fireEarth", 0))
        Warp.addToResearch("FIRETERRA", 10)
        Research.orphanResearch("FIRE_ORDO")
        Research.removeResearch("FIRE_ORDO")
        Research.addResearch("FIREORDO", "TT_CATEGORY", "ordo 15, lux 12, aer 9, praecantatio 3", 3, -3, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:fireOrder", 0))
        Research.addPrereq("FIREORDO", "INFUSION", false)
        Research.addPrereq("FIREORDO", "BRIGHT_NITOR", false)
        Research.addPrereq("FIREORDO", "ELDRITCHMINOR", false)
        Research.setConcealed("FIREORDO", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FIREORDO", "Elemental Fire: Ordo")
        MineTweakerAPI.game.setLocalization("tc.research_text.FIREORDO", "[TT] More ingots for your ore")
        Research.addPage("FIREORDO", "ttresearch.page.FIRE_ORDO.0")
        val s7 = "FIREORDO"
        val item4 = ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 1)
        val hashMap7 = HashMap<String, IData>()
        val s8 = "Aspects"
        val array4 = arrayOf<IData?>(null)
        val n4 = 0
        val hashMap8 = HashMap<String, IData>()
        hashMap8["amount"] = ExpandInt.toData(8)
        hashMap8["key"] = ExpandString.asData("ordo")
        array4[n4] = ExpandAnyDict.asData(hashMap8)
        hashMap7[s8] = ExpandAnyArray.asData(array4)
        Infusion.addRecipe(s7, item4.withTag(ExpandAnyDict.asData(hashMap7)),
                arrayOf(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
                "ordo 10, lux 10, aer 10, praecantatio 10", ItemBracketHandler.getItem("ThaumicTinkerer:fireOrder", 0),
                16)
        Research.addInfusionPage("FIREORDO", ItemBracketHandler.getItem("ThaumicTinkerer:fireOrder", 0))
        Warp.addToResearch("FIREORDO", 10)
        Research.orphanResearch("FIRE_AER")
        Research.removeResearch("FIRE_AER")
        Research.addResearch("FIREAER", "TT_CATEGORY", "aer 15, lux 12, motus 9, praecantatio 3", 3, -7, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:fireAir", 0))
        Research.addPrereq("FIREAER", "INFUSION", false)
        Research.addPrereq("FIREAER", "BRIGHT_NITOR", false)
        Research.addPrereq("FIREAER", "ELDRITCHMINOR", false)
        Research.setConcealed("FIREAER", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FIREAER", "Elemental Fire: Aer")
        MineTweakerAPI.game.setLocalization("tc.research_text.FIREAER",
                "[TT] Suspension of disbelief is a useful skill")
        Research.addPage("FIREAER", "ttresearch.page.FIRE_AER.0")
        val s9 = "FIREAER"
        val item5 = ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 1)
        val hashMap9 = HashMap<String, IData>()
        val s10 = "Aspects"
        val array5 = arrayOf<IData?>(null)
        val n5 = 0
        val hashMap10 = HashMap<String, IData>()
        hashMap10["amount"] = ExpandInt.toData(8)
        hashMap10["key"] = ExpandString.asData("aer")
        array5[n5] = ExpandAnyDict.asData(hashMap10)
        hashMap9[s10] = ExpandAnyArray.asData(array5)
        Infusion.addRecipe(s9, item5.withTag(ExpandAnyDict.asData(hashMap9)),
                arrayOf(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                "aer 10, lux 10, motus 10, praecantatio 10", ItemBracketHandler.getItem("ThaumicTinkerer:fireAir", 0),
                16)
        Research.addInfusionPage("FIREAER", ItemBracketHandler.getItem("ThaumicTinkerer:fireAir", 0))
        Warp.addToResearch("FIREAER", 10)
        Research.orphanResearch("FIRE_PERDITIO")
        Research.removeResearch("FIRE_PERDITIO")
        Research.addResearch("FIREPERDITIO", "TT_CATEGORY", "perditio 15, lux 12, aer 9, praecantatio 3", 2, -8, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:fireChaos", 0))
        Research.addPrereq("FIREPERDITIO", "INFUSION", false)
        Research.addPrereq("FIREPERDITIO", "BRIGHT_NITOR", false)
        Research.addPrereq("FIREPERDITIO", "ELDRITCHMINOR", false)
        Research.setConcealed("FIREPERDITIO", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FIREPERDITIO", "Elemental Fire: Perditio")
        MineTweakerAPI.game.setLocalization("tc.research_text.FIREPERDITIO", "[TT] Cleanup time")
        Research.addPage("FIREPERDITIO", "ttresearch.page.FIRE_PERDITIO.0")
        val s11 = "FIREPERDITIO"
        val item6 = ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 1)
        val hashMap11 = HashMap<String, IData>()
        val s12 = "Aspects"
        val array6 = arrayOf<IData?>(null)
        val n6 = 0
        val hashMap12 = HashMap<String, IData>()
        hashMap12["amount"] = ExpandInt.toData(8)
        hashMap12["key"] = ExpandString.asData("perditio")
        array6[n6] = ExpandAnyDict.asData(hashMap12)
        hashMap11[s12] = ExpandAnyArray.asData(array6)
        Infusion.addRecipe(s11, item6.withTag(ExpandAnyDict.asData(hashMap11)),
                arrayOf(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                "perditio 10, lux 10, aer 10, praecantatio 10",
                ItemBracketHandler.getItem("ThaumicTinkerer:fireChaos", 0), 16)
        Research.addInfusionPage("FIREPERDITIO", ItemBracketHandler.getItem("ThaumicTinkerer:fireChaos", 0))
        Warp.addToResearch("FIREPERDITIO", 10)
        Research.orphanResearch("INFUSED_POTIONS")
        Research.removeResearch("INFUSED_POTIONS")
        val s13 = "INFUSEDSEED"
        val s14 = "TT_CATEGORY"
        val s15 = "perditio 15, lux 12, aer 9, praecantatio 3"
        val n7 = 7
        val n8 = -5
        val n9 = 3
        val item7 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        val hashMap13 = HashMap<String, IData>()
        val s16 = "mainAspect"
        val hashMap14 = HashMap<String, IData>()
        val s17 = "Aspects"
        val array7 = arrayOf<IData?>(null)
        val n10 = 0
        val hashMap15 = HashMap<String, IData>()
        hashMap15["amount"] = ExpandInt.toData(1)
        hashMap15["key"] = ExpandString.asData("ignis")
        array7[n10] = ExpandAnyDict.asData(hashMap15)
        hashMap14[s17] = ExpandAnyArray.asData(array7)
        hashMap13[s16] = ExpandAnyDict.asData(hashMap14)
        val s18 = "aspectTendencies"
        val hashMap16 = HashMap<String, IData>()
        hashMap16["Aspects"] = ExpandAnyArray.asData(arrayOfNulls(0))
        hashMap13[s18] = ExpandAnyDict.asData(hashMap16)
        Research.addResearch(s13, s14, s15, n7, n8, n9, item7.withTag(ExpandAnyDict.asData(hashMap13)))
        Research.addPrereq("INFUSEDSEED", "INFUSION", false)
        Research.addPrereq("INFUSEDSEED", "FIREIGNIS", false)
        Research.addPrereq("INFUSEDSEED", "FIREAQUA", false)
        Research.addPrereq("INFUSEDSEED", "FIRETERRA", false)
        Research.addPrereq("INFUSEDSEED", "FIREAER", false)
        Research.addPrereq("INFUSEDSEED", "FIREORDO", false)
        Research.addPrereq("INFUSEDSEED", "FIREPERDITIO", false)
        Research.setConcealed("INFUSEDSEED", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.INFUSEDSEED", "Infused Crops")
        MineTweakerAPI.game.setLocalization("tc.research_text.INFUSEDSEED", "[TT] Who said bees? No one said bees.")
        Research.addPage("INFUSEDSEED", "ttresearch.page.INFUSED_POTIONS.0")
        Research.addPage("INFUSEDSEED", "ttresearch.page.INFUSED_POTIONS.1")
        Research.addPage("INFUSEDSEED", "ttresearch.page.INFUSED_POTIONS.2")
        Research.addPage("INFUSEDSEED", "ttresearch.page.INFUSED_POTIONS.3")
        val s19 = "INFUSEDSEED"
        val item8 = ItemBracketHandler.getItem("minecraft:wheat_seeds", 0)
        val array8 = arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0))
        val s20 = "messis 32, meto 32, aer 16"
        val item9 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        val hashMap17 = HashMap<String, IData>()
        val s21 = "mainAspect"
        val hashMap18 = HashMap<String, IData>()
        val s22 = "Aspects"
        val array9 = arrayOf<IData?>(null)
        val n11 = 0
        val hashMap19 = HashMap<String, IData>()
        hashMap19["amount"] = ExpandInt.toData(1)
        hashMap19["key"] = ExpandString.asData("aer")
        array9[n11] = ExpandAnyDict.asData(hashMap19)
        hashMap18[s22] = ExpandAnyArray.asData(array9)
        hashMap17[s21] = ExpandAnyDict.asData(hashMap18)
        val s23 = "aspectTendencies"
        val hashMap20 = HashMap<String, IData>()
        hashMap20["Aspects"] = ExpandAnyArray.asData(arrayOfNulls(0))
        hashMap17[s23] = ExpandAnyDict.asData(hashMap20)
        Infusion.addRecipe(s19, item8, array8, s20, item9.withTag(ExpandAnyDict.asData(hashMap17)), 4)
        val s24 = "INFUSEDSEED"
        val item10 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        val hashMap21 = HashMap<String, IData>()
        val s25 = "mainAspect"
        val hashMap22 = HashMap<String, IData>()
        val s26 = "Aspects"
        val array10 = arrayOf<IData?>(null)
        val n12 = 0
        val hashMap23 = HashMap<String, IData>()
        hashMap23["amount"] = ExpandInt.toData(1)
        hashMap23["key"] = ExpandString.asData("aer")
        array10[n12] = ExpandAnyDict.asData(hashMap23)
        hashMap22[s26] = ExpandAnyArray.asData(array10)
        hashMap21[s25] = ExpandAnyDict.asData(hashMap22)
        val s27 = "aspectTendencies"
        val hashMap24 = HashMap<String, IData>()
        hashMap24["Aspects"] = ExpandAnyArray.asData(arrayOfNulls(0))
        hashMap21[s27] = ExpandAnyDict.asData(hashMap24)
        Research.addInfusionPage(s24, item10.withTag(ExpandAnyDict.asData(hashMap21)))
        val s28 = "INFUSEDSEED"
        val item11 = ItemBracketHandler.getItem("minecraft:wheat_seeds", 0)
        val array11 = arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1))
        val s29 = "messis 32, meto 32, ignis 16"
        val item12 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        val hashMap25 = HashMap<String, IData>()
        val s30 = "mainAspect"
        val hashMap26 = HashMap<String, IData>()
        val s31 = "Aspects"
        val array12 = arrayOf<IData?>(null)
        val n13 = 0
        val hashMap27 = HashMap<String, IData>()
        hashMap27["amount"] = ExpandInt.toData(1)
        hashMap27["key"] = ExpandString.asData("ignis")
        array12[n13] = ExpandAnyDict.asData(hashMap27)
        hashMap26[s31] = ExpandAnyArray.asData(array12)
        hashMap25[s30] = ExpandAnyDict.asData(hashMap26)
        val s32 = "aspectTendencies"
        val hashMap28 = HashMap<String, IData>()
        hashMap28["Aspects"] = ExpandAnyArray.asData(arrayOfNulls(0))
        hashMap25[s32] = ExpandAnyDict.asData(hashMap28)
        Infusion.addRecipe(s28, item11, array11, s29, item12.withTag(ExpandAnyDict.asData(hashMap25)), 4)
        val s33 = "INFUSEDSEED"
        val item13 = ItemBracketHandler.getItem("minecraft:wheat_seeds", 0)
        val array13 = arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2))
        val s34 = "messis 32, meto 32, aqua 16"
        val item14 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        val hashMap29 = HashMap<String, IData>()
        val s35 = "mainAspect"
        val hashMap30 = HashMap<String, IData>()
        val s36 = "Aspects"
        val array14 = arrayOf<IData?>(null)
        val n14 = 0
        val hashMap31 = HashMap<String, IData>()
        hashMap31["amount"] = ExpandInt.toData(1)
        hashMap31["key"] = ExpandString.asData("aqua")
        array14[n14] = ExpandAnyDict.asData(hashMap31)
        hashMap30[s36] = ExpandAnyArray.asData(array14)
        hashMap29[s35] = ExpandAnyDict.asData(hashMap30)
        val s37 = "aspectTendencies"
        val hashMap32 = HashMap<String, IData>()
        hashMap32["Aspects"] = ExpandAnyArray.asData(arrayOfNulls(0))
        hashMap29[s37] = ExpandAnyDict.asData(hashMap32)
        Infusion.addRecipe(s33, item13, array13, s34, item14.withTag(ExpandAnyDict.asData(hashMap29)), 4)
        val s38 = "INFUSEDSEED"
        val item15 = ItemBracketHandler.getItem("minecraft:wheat_seeds", 0)
        val array15 = arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3))
        val s39 = "messis 32, meto 32, terra 16"
        val item16 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        val hashMap33 = HashMap<String, IData>()
        val s40 = "mainAspect"
        val hashMap34 = HashMap<String, IData>()
        val s41 = "Aspects"
        val array16 = arrayOf<IData?>(null)
        val n15 = 0
        val hashMap35 = HashMap<String, IData>()
        hashMap35["amount"] = ExpandInt.toData(1)
        hashMap35["key"] = ExpandString.asData("terra")
        array16[n15] = ExpandAnyDict.asData(hashMap35)
        hashMap34[s41] = ExpandAnyArray.asData(array16)
        hashMap33[s40] = ExpandAnyDict.asData(hashMap34)
        val s42 = "aspectTendencies"
        val hashMap36 = HashMap<String, IData>()
        hashMap36["Aspects"] = ExpandAnyArray.asData(arrayOfNulls(0))
        hashMap33[s42] = ExpandAnyDict.asData(hashMap36)
        Infusion.addRecipe(s38, item15, array15, s39, item16.withTag(ExpandAnyDict.asData(hashMap33)), 4)
        val s43 = "INFUSEDSEED"
        val item17 = ItemBracketHandler.getItem("minecraft:wheat_seeds", 0)
        val array17 = arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4))
        val s44 = "messis 32, meto 32, ordo 16"
        val item18 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        val hashMap37 = HashMap<String, IData>()
        val s45 = "mainAspect"
        val hashMap38 = HashMap<String, IData>()
        val s46 = "Aspects"
        val array18 = arrayOf<IData?>(null)
        val n16 = 0
        val hashMap39 = HashMap<String, IData>()
        hashMap39["amount"] = ExpandInt.toData(1)
        hashMap39["key"] = ExpandString.asData("ordo")
        array18[n16] = ExpandAnyDict.asData(hashMap39)
        hashMap38[s46] = ExpandAnyArray.asData(array18)
        hashMap37[s45] = ExpandAnyDict.asData(hashMap38)
        val s47 = "aspectTendencies"
        val hashMap40 = HashMap<String, IData>()
        hashMap40["Aspects"] = ExpandAnyArray.asData(arrayOfNulls(0))
        hashMap37[s47] = ExpandAnyDict.asData(hashMap40)
        Infusion.addRecipe(s43, item17, array17, s44, item18.withTag(ExpandAnyDict.asData(hashMap37)), 4)
        val s48 = "INFUSEDSEED"
        val item19 = ItemBracketHandler.getItem("minecraft:wheat_seeds", 0)
        val array19 = arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))
        val s49 = "messis 32, meto 32, perditio 16"
        val item20 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        val hashMap41 = HashMap<String, IData>()
        val s50 = "mainAspect"
        val hashMap42 = HashMap<String, IData>()
        val s51 = "Aspects"
        val array20 = arrayOf<IData?>(null)
        val n17 = 0
        val hashMap43 = HashMap<String, IData>()
        hashMap43["amount"] = ExpandInt.toData(1)
        hashMap43["key"] = ExpandString.asData("perditio")
        array20[n17] = ExpandAnyDict.asData(hashMap43)
        hashMap42[s51] = ExpandAnyArray.asData(array20)
        hashMap41[s50] = ExpandAnyDict.asData(hashMap42)
        val s52 = "aspectTendencies"
        val hashMap44 = HashMap<String, IData>()
        hashMap44["Aspects"] = ExpandAnyArray.asData(arrayOfNulls(0))
        hashMap41[s52] = ExpandAnyDict.asData(hashMap44)
        Infusion.addRecipe(s48, item19, array19, s49, item20.withTag(ExpandAnyDict.asData(hashMap41)), 4)
        Research.addPage("INFUSEDSEED", "tt.research.page.INFUSEDSEED.3")
        MineTweakerAPI.game.setLocalization("tt.research.page.INFUSEDSEED.3",
                "The other recipes are not shown but you can infuse Seeds with all the other Primal Aspect Crystals.<BR>Seeds infuse Ignis with Ignis Cluster and 16 ignis Aspect instead of Air, Seeds infuse Aqua with Aqua Crystals and 16 aqua Aspect instead of Air...")
        Warp.addToResearch("INFUSEDSEED", 2)
        Research.addResearch("INFUSEDPOTIONS", "TT_CATEGORY", "auram 15, ignis 12, aer 9, aqua 9, terra 9", 9, -5, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 1))
        Research.addPrereq("INFUSEDPOTIONS", "INFUSION", false)
        Research.addPrereq("INFUSEDPOTIONS", "INFUSEDSEED", false)
        Research.setConcealed("INFUSEDPOTIONS", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.INFUSEDPOTIONS", "Infused Potions")
        MineTweakerAPI.game.setLocalization("tc.research_text.INFUSEDPOTIONS", "[TT] Growing your Potions.")
        Research.addPage("INFUSEDPOTIONS", "ttresearch.page.INFUSED_POTIONS.4")
        Research.addPage("INFUSEDPOTIONS", "ttresearch.page.INFUSED_POTIONS.5")
        Crucible.addRecipe("INFUSEDPOTIONS", ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 0),
                ItemBracketHandler.getItem("ThaumicTinkerer:infusedGrain", 0), "auram 16, aer 16, praecantatio 8")
        Research.addCruciblePage("INFUSEDPOTIONS", ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 0))
        Crucible.addRecipe("INFUSEDPOTIONS", ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 1),
                ItemBracketHandler.getItem("ThaumicTinkerer:infusedGrain", 1), "auram 16, ignis 16, praecantatio 8")
        Research.addCruciblePage("INFUSEDPOTIONS", ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 1))
        Crucible.addRecipe("INFUSEDPOTIONS", ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 2),
                ItemBracketHandler.getItem("ThaumicTinkerer:infusedGrain", 2), "auram 16, terra 16, praecantatio 8")
        Research.addCruciblePage("INFUSEDPOTIONS", ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 2))
        Crucible.addRecipe("INFUSEDPOTIONS", ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 3),
                ItemBracketHandler.getItem("ThaumicTinkerer:infusedGrain", 3), "auram 16, aqua 16, praecantatio 8")
        Research.addCruciblePage("INFUSEDPOTIONS", ItemBracketHandler.getItem("ThaumicTinkerer:infusedPotion", 3))
        Warp.addToResearch("INFUSEDPOTIONS", 2)
        Research.addPrereq("FUNNEL", "INFUSION", false)
        Arcane.addShaped("FUNNEL", ItemBracketHandler.getItem("ThaumicTinkerer:funnel", 0),
                "ordo 8, perditio 8, aqua 8", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwThaumium")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                        OreBracketHandler.getOre("pipeMediumStainlessSteel"),
                        OreBracketHandler.getOre("plateThaumium"))))
        Research.setAspects("FUNNEL", "iter 15, instrumentum 12, aqua 9, metallum 6, praecantatio 3")
        Research.setComplexity("FUNNEL", 3)

        //TODO Replace ("harvestcraft:hardenedleatherItem", 0)
        //Research.addPrereq("REPAIRER", "INFUSION", false)
        //Infusion.addRecipe("REPAIRER", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 4),
        //        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032),
        //                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
        //                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)),
        //        "fabrico 32, instrumentum 32, ordo 16, praecantatio 16, potentia 8",
        //        ItemBracketHandler.getItem("ThaumicTinkerer:repairer", 0), 8)
        //Research.setAspects("REPAIRER", "instrumentum 15, fabrico 12, ordo 9, potentia 6, praecantatio 3")
        //Research.setComplexity("REPAIRER", 4)

        Arcane.addShaped("MAGNETS", ItemBracketHandler.getItem("ThaumicTinkerer:magnet", 0),
                "aer 30, terra 25, ordo 20, perditio 15",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                        OreBracketHandler.getOre("plateSteelMagnetic"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                                OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                                ItemBracketHandler.getItem("ThaumicTinkerer:focusTelekinesis", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0))))
        Research.setAspects("MAGNETS", "bestia 15, machina 15, motus 12, sensus 9, ordo 6, spiritus 3")
        Research.setComplexity("MAGNETS", 4)
        Warp.addToResearch("MAGNETS", 2)
        Arcane.addShaped("MAGNETS", ItemBracketHandler.getItem("ThaumicTinkerer:magnet", 1),
                "aer 25, terra 30, ordo 15, perditio 20",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                        OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                                OreBracketHandler.getOre("plateSteelMagnetic"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                                ItemBracketHandler.getItem("ThaumicTinkerer:focusTelekinesis", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1))))
        Crucible.addRecipe("MAGNETS", ItemBracketHandler.getItem("ThaumicTinkerer:soulMould", 0),
                ItemBracketHandler.getItem("minecraft:ender_eye", 0), "bestia 8, cognitio 8, sensus 8, spiritus 8")
        Research.setConcealed("ANIMATION_TABLET", true)
        Arcane.addShaped("ANIMATION_TABLET", ItemBracketHandler.getItem("ThaumicTinkerer:animationTablet", 0),
                "aer 35, ignis 30, ordo 20", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateRoseGold"),
                OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateRoseGold")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateElectrum"),
                        OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateElectrum")),
                arrayOf(OreBracketHandler.getOre("screwThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 100),
                        OreBracketHandler.getOre("screwThaumium"))))
        Research.setAspects("ANIMATION_TABLET", "machina 15, metallum 15, motus 12, potentia 9, ordo 6, exanimis 3")
        Research.setComplexity("ANIMATION_TABLET", 4)
        Warp.addToResearch("ANIMATION_TABLET", 3)
        Research.setConcealed("LEVITATOR_LOCOMOTIVE", true)
        Infusion.addRecipe("LEVITATOR_LOCOMOTIVE", ItemBracketHandler.getItem("Thaumcraft:blockLifter", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032),
                        ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032),
                        ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032)),
                "motus 30, ordo 20, praecantatio 15, aer 25, potentia 10",
                ItemBracketHandler.getItem("ThaumicTinkerer:LevitationalLocomotive", 0), 4)
        Research.setAspects("LEVITATOR_LOCOMOTIVE", "motus 15, ordo 15, machina 12, aer 9, potentia 6, praecantatio 3")
        Research.setComplexity("LEVITATOR_LOCOMOTIVE", 3)
        Arcane.addShaped("LEVITATOR_LOCOMOTIVE",
                ItemBracketHandler.getItem("ThaumicTinkerer:LevitationalLocomotiveRelay", 0),
                "aer 30, terra 20, ordo 10",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("paneGlassColorless"),
                        OreBracketHandler.getOre("lensInfusedWater"), OreBracketHandler.getOre("paneGlassColorless")),
                        arrayOf(OreBracketHandler.getOre("lensInfusedWater"),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                                OreBracketHandler.getOre("lensInfusedWater")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("paneGlassColorless"),
                                OreBracketHandler.getOre("lensInfusedWater"),
                                OreBracketHandler.getOre("paneGlassColorless"))))
        Research.addPrereq("CLEANSING_TALISMAN", "DARKQUARTZ", false)
        Research.addPrereq("CLEANSING_TALISMAN", "INFUSION", false)
        Research.addPrereq("CLEANSING_TALISMAN", "RUNICARMOR", false)
        Research.setConcealed("INFUSEDPOTIONS", true)
        Infusion.addRecipe("CLEANSING_TALISMAN", ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1)),
                "humanus 32, instrumentum 24, sano 16, victus 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:cleansingTalisman", 0), 4)
        Research.setAspects("CLEANSING_TALISMAN", "sano 15, ordo 12, mortuus 9, victus 6, praecantatio 3")
        Research.setComplexity("CLEANSING_TALISMAN", 3)
        Research.setConcealed("INFUSEDPOTIONS", true)
        Arcane.addShaped("PLATFORM", ItemBracketHandler.getItem("ThaumicTinkerer:platform", 0).amount(2),
                "aer 10, perditio 10", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwThaumium")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6))))
        Research.setAspects("PLATFORM", "sensus 12, arbor 9, motus 6, iter 3, praecantatio 3")
        Research.setComplexity("PLATFORM", 3)
        Research.setConcealed("BLOOD_SWORD", true)
        Infusion.addRecipe("BLOOD_SWORD", ItemBracketHandler.getItem("Thaumcraft:ItemSwordThaumium", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                        ItemBracketHandler.getItem("minecraft:porkchop", 0),
                        ItemBracketHandler.getItem("minecraft:fish", 0),
                        ItemBracketHandler.getItem("minecraft:nether_wart", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("minecraft:bone", 0),
                        ItemBracketHandler.getItem("minecraft:beef", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("minecraft:spider_eye", 0),
                        ItemBracketHandler.getItem("minecraft:chicken", 0)),
                "fames 32, humanus 8, spiritus 16, tenebrae 24, telum 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:bloodSword", 0), 8)
        Research.setAspects("BLOOD_SWORD", "fames 15, telum 12, corpus 9, spiritus 6, tenebrae 3")
        Research.setComplexity("BLOOD_SWORD", 4)
        Warp.addToResearch("BLOOD_SWORD", 3)
        Research.setConcealed("SUMMON", true)
        Arcane.addShaped("SUMMON", ItemBracketHandler.getItem("ThaumicTinkerer:spawner", 0),
                "ordo 75, perditio 75, terra 50", arrayOf(arrayOf(OreBracketHandler.getOre("gemFlawlessRuby"),
                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 5),
                OreBracketHandler.getOre("gemFlawlessRuby")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0),
                        OreBracketHandler.getOre("plateDenseObsidian"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0)),
                arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("screwThaumium"))))
        Research.setAspects("SUMMON", "telum 15, bestia 12, praecantatio 9, spiritus 6, terra 3")
        Research.setComplexity("SUMMON", 4)
        Warp.addToResearch("SUMMON", 5)
        Arcane.addShaped("FOCUS_SMELT", ItemBracketHandler.getItem("ThaumicTinkerer:focusSmelt", 0),
                "ignis 16, perditio 12, ordo 12, aer 8",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                                ItemBracketHandler.getItem("minecraft:furnace", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                                ItemBracketHandler.getItem("Thaumcraft:FocusFire", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14))))
        Research.setAspects("FOCUS_SMELT", "ignis 15, potentia 12, praecantatio 9, aer 6, terra 3")
        Research.setComplexity("FOCUS_SMELT", 3)
        Research.addPrereq("FOCUS_FLIGHT", "FOCUSFIRE", false)
        Infusion.addRecipe("FOCUS_FLIGHT", ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21330),
                        ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2532),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21330),
                        ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2532)),
                "aer 32, iter 24, motus 32, volatus 24, aer 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:focusFlight", 0), 6)
        Research.setAspects("FOCUS_FLIGHT", "motus 15, aer 12, praecantatio 9, volatus 6, iter 3")
        Research.setComplexity("FOCUS_FLIGHT", 4)
        Research.addPrereq("FOCUS_DEFLECT", "FOCUS_FLIGHT", false)
        Infusion.addRecipe("FOCUS_DEFLECT", ItemBracketHandler.getItem("ThaumicTinkerer:focusFlight", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 10),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
                "aer 32, ordo 24, tutamen 32, auram 24, alienis 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:focusDeflect", 0), 6)
        Research.setAspects("FOCUS_DEFLECT", "alienis 15, praecantatio 12, permutatio 9, auram 6, aer 3")
        Research.setComplexity("FOCUS_DEFLECT", 4)
        Research.addPrereq("FOCUS_ENDER_CHEST", "ENDERCHEST", false)
        Arcane.addShaped("FOCUS_ENDER_CHEST", ItemBracketHandler.getItem("ThaumicTinkerer:focusEnderChest", 0),
                "perditio 50, ordo 50",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockMirror", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                        arrayOf(OreBracketHandler.getOre("plateEnderium"),
                                ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0),
                                OreBracketHandler.getOre("plateEnderium")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                                OreBracketHandler.getOre("plateNetherStar"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14))))
        Research.setAspects("FOCUS_ENDER_CHEST", "alienis 15, vacuos 12, praecantatio 9, tenebrae 6, terra 3")
        Research.setComplexity("FOCUS_ENDER_CHEST", 4)
        Warp.addToResearch("ANIMATION_TABLET", 3)
        Infusion.addRecipe("FOCUS_TELEKINESIS", ItemBracketHandler.getItem("ThaumicTinkerer:focusFlight", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17355),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17355),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522)),
                "aer 24, cognitio 32, motus 32, perditio 24, lucrum 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:focusTelekinesis", 0), 10)
        Research.setAspects("FOCUS_TELEKINESIS", "alienis 15, motus 15, praecantatio 12, cognitio 9, lucrum 6")
        Research.setComplexity("FOCUS_TELEKINESIS", 4)
        Research.addPrereq("FOCUS_DISLOCATION", "FOCUSTRADE", false)
        Infusion.addRecipe("FOCUS_DISLOCATION", ItemBracketHandler.getItem("Thaumcraft:FocusTrade", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29514),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522)),
                "alienis 64, praecantatio 32, tenebrae 32, vacuos 32, vitium 16, permutatio 16 ",
                ItemBracketHandler.getItem("ThaumicTinkerer:focusDislocation", 0), 10)
        Research.setAspects("FOCUS_DISLOCATION",
                "alienis 15, permutatio 15, praecantatio 12, tenebrae 9, vacuos 6, vitium 3")
        Research.setComplexity("FOCUS_DISLOCATION", 4)
        Warp.addToResearch("FOCUS_DISLOCATION", 3)
        Infusion.addRecipe("FOCUS_HEAL", ItemBracketHandler.getItem("Thaumcraft:FocusPech", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:golden_apple", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("minecraft:golden_carrot", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                "sano 24, spiritus 32, praecantatio 32, victus 24",
                ItemBracketHandler.getItem("ThaumicTinkerer:focusHeal", 0), 10)
        Research.setAspects("FOCUS_HEAL", "sano 15, victus 15, praecantatio 12, spiritus 9, cognitio 6")
        Research.setComplexity("FOCUS_HEAL", 4)
        Research.addPrereq("ENCHANTER", "ENCHANTINGTABLE", false)
        Research.addPrereq("ENCHANTER", "INFUSION", false)
        Research.setConcealed("ENCHANTER", true)
        Infusion.addRecipe("ENCHANTER", ItemBracketHandler.getItem("minecraft:enchanting_table", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("ThaumicTinkerer:spellCloth", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:spellCloth", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("ThaumicTinkerer:spellCloth", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:spellCloth", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0)),
                "alienis 64, cognitio 64, potentia 64, praecantatio 64, auram 64, vacuos 64 ",
                ItemBracketHandler.getItem("ThaumicTinkerer:enchanter", 0), 12)
        Research.setAspects("ENCHANTER",
                "alienis 15, praecantatio 15, auram 12, tenebrae 12, vacuos 9, cognitio 6, terra 3")
        Research.setComplexity("ENCHANTER", 4)
        Warp.addToResearch("ENCHANTER", 3)
        Research.addPrereq("SPELL_CLOTH", "INFUSION", false)
        Research.setConcealed("SPELL_CLOTH", true)
        Crucible.addRecipe("SPELL_CLOTH", ItemBracketHandler.getItem("ThaumicTinkerer:spellCloth", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                "perditio 16, praecantatio 16, permutatio 8, alienis 8")
        Research.setAspects("SPELL_CLOTH", "praecantatio 12, pannus 9, auram 6, alienis 3")
        Research.setComplexity("SPELL_CLOTH", 3)
        Infusion.addRecipe("XP_TALISMAN", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                "bestia 24, lucrum 32, machina 16, permutatio 16, humanus 8",
                ItemBracketHandler.getItem("ThaumicTinkerer:xpTalisman", 0), 8)
        Research.setAspects("XP_TALISMAN", "lucrum 15, praecantatio 12, humanus 9, auram 6, machina 3")
        Research.setComplexity("XP_TALISMAN", 4)
        Arcane.addShaped("REVEALING_HELM", ItemBracketHandler.getItem("ThaumicTinkerer:revealingHelm", 0),
                "aer 35, aqua 35, terra 35, ignis 35, ordo 35, perditio 35",
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("screwThaumium"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf(OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemGoggles", 0),
                                OreBracketHandler.getOre("plateThaumium")),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemHelmetThaumium", 0),
                                null)))
        Research.setAspects("REVEALING_HELM", "tutamen 15, auram 12, praecantatio 9, metallum 6, sensus 3")
        Research.setComplexity("REVEALING_HELM", 4)
        Research.setConcealed("TTENCH_ASCENT_BOOST", true)
        Research.setAspects("TTENCH_ASCENT_BOOST", "aer 15, motus 12, praecantatio 9, auram 6, tempus 3")
        Research.setComplexity("TTENCH_ASCENT_BOOST", 3)
        Research.setConcealed("TTENCH_SLOW_FALL", true)
        Research.setAspects("TTENCH_SLOW_FALL", "aer 15, motus 12, praecantatio 9, auram 6, tempus 3")
        Research.setComplexity("TTENCH_SLOW_FALL", 3)
        Research.setConcealed("TTENCH_AUTO_SMELT", true)
        Research.setAspects("TTENCH_AUTO_SMELT", "ignis 15, perditio 12, praecantatio 9, auram 6, metallum 3")
        Research.setComplexity("TTENCH_AUTO_SMELT", 3)
        Research.setConcealed("TTENCH_DESINTEGRATE", true)
        Research.setAspects("TTENCH_DESINTEGRATE", "vacuos 15, perditio 12, praecantatio 9, auram 6, tempus 3")
        Research.setComplexity("TTENCH_DESINTEGRATE", 3)
        Research.setConcealed("TTENCH_QUICK_DRAW", true)
        Research.setAspects("TTENCH_QUICK_DRAW", "telum 15, sensus 12, praecantatio 9, auram 6, motus 3")
        Research.setComplexity("TTENCH_QUICK_DRAW", 3)
        Research.setConcealed("TTENCH_VAMPIRISM", true)
        Research.setAspects("TTENCH_VAMPIRISM", "fames 15, telum 12, praecantatio 9, auram 6, lucrum 3")
        Research.setComplexity("TTENCH_VAMPIRISM", 3)
        Research.setConcealed("TTENCH_POUNCE", true)
        Research.setAspects("TTENCH_POUNCE", "aer 15, ordo 15, tutamen 12, praecantatio 9, auram 6, volatus 3")
        Research.setComplexity("TTENCH_POUNCE", 4)
        Research.setConcealed("TTENCH_SHOCKWAVE", true)
        Research.setAspects("TTENCH_SHOCKWAVE", "aer 15, perditio 15, tutamen 12, praecantatio 9, auram 6, volatus 3")
        Research.setComplexity("TTENCH_SHOCKWAVE", 4)
        Research.setConcealed("TTENCH_TUNNEL", true)
        Research.setAspects("TTENCH_TUNNEL", "terra 15, ordo 15, instrumentum 12, praecantatio 9, auram 6, perfodio 3")
        Research.setComplexity("TTENCH_TUNNEL", 4)
        Research.setConcealed("TTENCH_SHATTER", true)
        Research.setAspects("TTENCH_SHATTER",
                "terra 15, perditio 15, instrumentum 12, praecantatio 9, auram 6, perfodio 3")
        Research.setComplexity("TTENCH_SHATTER", 4)
        Research.setConcealed("TTENCH_FOCUSED", true)
        Research.setAspects("TTENCH_FOCUSED", "ordo 15, telum 15, praecantatio 12, alienis 9, auram 6, bestia 3")
        Research.setComplexity("TTENCH_FOCUSED", 4)
        Research.setConcealed("TTENCH_DISPERSED", true)
        Research.setAspects("TTENCH_DISPERSED", "perditio 15, telum 15, praecantatio 12, alienis 9, auram 6, bestia 3")
        Research.setComplexity("TTENCH_DISPERSED", 4)
        Research.setConcealed("TTENCH_VALIANCE", true)
        Research.setAspects("TTENCH_VALIANCE", "sano 15, telum 15, praecantatio 12, alienis 9, auram 6, bestia 3")
        Research.setComplexity("TTENCH_VALIANCE", 4)
        Research.setConcealed("TTENCH_FINAL", true)
        Research.setAspects("TTENCH_FINAL",
                "ordo 15, perditio 15, telum 15, praecantatio 12, alienis 9, auram 6, superbia 3")
        Research.setComplexity("TTENCH_FINAL", 4)
        Compressor.addRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0),
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzItem", 0).amount(4))
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzSlab", 0).amount(2), null,
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(5), 100, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzSlab", 0).amount(2), null,
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(4), 100, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartzSlab", 0).amount(2), null,
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 50, VoltageLevels.ULV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506),
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0), 50, VoltageLevels.LLV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24515),
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0), 50, VoltageLevels.LLV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24545),
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0), 50, VoltageLevels.LLV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24890),
                ItemBracketHandler.getItem("ThaumicTinkerer:darkQuartz", 0), 50, VoltageLevels.LLV)
        Research.refreshResearchRecipe("INTERFACE")
        Research.refreshResearchRecipe("DISLOCATOR")
        Research.refreshResearchRecipe("GASEOUS_LIGHT")
        Research.refreshResearchRecipe("GASEOUS_SHADOW")
        Research.refreshResearchRecipe("GAS_REMOVER")
        Research.refreshResearchRecipe("BRIGHT_NITOR")
        Research.refreshResearchRecipe("FIRE_IGNIS")
        Research.refreshResearchRecipe("FIRE_AQUA")
        Research.refreshResearchRecipe("FIRE_TERRA")
        Research.refreshResearchRecipe("FIRE_ORDO")
        Research.refreshResearchRecipe("FIRE_AER")
        Research.refreshResearchRecipe("FIRE_PERDITIO")
        Research.refreshResearchRecipe("FUNNEL")
        Research.refreshResearchRecipe("REPAIRER")
        Research.refreshResearchRecipe("MAGNETS")
        Research.refreshResearchRecipe("ANIMATION_TABLET")
        Research.refreshResearchRecipe("LEVITATOR_LOCOMOTIVE")
        Research.refreshResearchRecipe("CLEANSING_TALISMAN")
        Research.refreshResearchRecipe("PLATFORM")
        Research.refreshResearchRecipe("BLOOD_SWORD")
        Research.refreshResearchRecipe("SUMMON")
        Research.refreshResearchRecipe("FOCUS_SMELT")
        Research.refreshResearchRecipe("FOCUS_FLIGHT")
        Research.refreshResearchRecipe("FOCUS_DEFLECT")
        Research.refreshResearchRecipe("FOCUS_ENDER_CHEST")
        Research.refreshResearchRecipe("FOCUS_TELEKINESIS")
        Research.refreshResearchRecipe("FOCUS_DISLOCATION")
        Research.refreshResearchRecipe("FOCUS_HEAL")
        Research.refreshResearchRecipe("ENCHANTER")
        Research.refreshResearchRecipe("SPELL_CLOTH")
        Research.refreshResearchRecipe("XP_TALISMAN")
        Research.refreshResearchRecipe("REVEALING_HELM")
        Research.refreshResearchRecipe("TTENCH_ASCENT_BOOST")
        Research.refreshResearchRecipe("TTENCH_SLOW_FALL")
        Research.refreshResearchRecipe("TTENCH_AUTO_SMELT")
        Research.refreshResearchRecipe("TTENCH_DESINTEGRATE")
        Research.refreshResearchRecipe("TTENCH_QUICK_DRAW")
        Research.refreshResearchRecipe("TTENCH_VAMPIRISM")
        Research.refreshResearchRecipe("TTENCH_POUNCE")
        Research.refreshResearchRecipe("TTENCH_SHOCKWAVE")
        Research.refreshResearchRecipe("TTENCH_TUNNEL")
        Research.refreshResearchRecipe("TTENCH_SHATTER")
        Research.refreshResearchRecipe("TTENCH_FOCUSED")
        Research.refreshResearchRecipe("TTENCH_DISPERSED")
        Research.refreshResearchRecipe("TTENCH_VALIANCE")
        Research.refreshResearchRecipe("TTENCH_FINAL")
    }
}