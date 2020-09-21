package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.CuttingSaw
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.*
import com.github.GTNH2Mega.VoltageLevels

class Gadomancy : Runnable {
    override fun run() {
        Infusion.removeRecipe(ItemBracketHandler.getItem("gadomancy:itemSilverwoodGolemPlacer", 8))
        Infusion.removeRecipe(ItemBracketHandler.getItem("gadomancy:ItemGolemCoreBreak", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("gadomancy:ItemGolemCoreBreak", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11))
        Crucible.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 15))
        Infusion.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockNodeManipulator", 5))
        Infusion.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockInfusionClaw", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockRemoteJar", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockArcaneDropper", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 4))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockAuraPylon", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockAuraPylon", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockKnowledgeBook", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("gadomancy:BlockEssentiaCompressor", 0))
        Infusion.addRecipe("GADOMANCY.GOLEMSILVERWOOD", ItemBracketHandler.getItem("Thaumcraft:ItemGolemPlacer", 1),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 9),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 9),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1)),
                "humanus 16, motus 16, praecantatio 32, sensus 16, cognitio 8, ordo 32",
                ItemBracketHandler.getItem("gadomancy:itemSilverwoodGolemPlacer", 8), 8)
        Research.setAspects("GADOMANCY.GOLEMSILVERWOOD",
                "cognitio 21, motus 18, arbor 15, praecantatio 12, ordo 9, corpus 6, permutatio 3")
        Research.setComplexity("GADOMANCY.GOLEMSILVERWOOD", 3)
        Infusion.addRecipe("GADOMANCY.GOLEMCOREBREAK", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 3),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5)),
                "instrumentum 32, perditio 16, machina 24, praecantatio 8, perfodio 8",
                ItemBracketHandler.getItem("gadomancy:ItemGolemCoreBreak", 0), 6)
        Research.setAspects("GADOMANCY.GOLEMCOREBREAK",
                "instrumentum 15, perditio 12, machina 9, praecantatio 6, perfodio 3")
        Research.setComplexity("GADOMANCY.GOLEMCOREBREAK", 3)
        Infusion.addRecipe("GADOMANCY.GOLEMCOREBODYGUARD", ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 4),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemHelmetThaumium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("Thaumcraft:ItemChestplateThaumium", 0),
                        ItemBracketHandler.getItem("Thaumcraft:BootsTraveller", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsThaumium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                "instrumentum 32, machina 24, telum 16, tutamen 24, ordo 8, auram 8",
                ItemBracketHandler.getItem("gadomancy:ItemGolemCoreBreak", 1), 9)
        Research.setAspects("GADOMANCY.GOLEMCOREBODYGUARD",
                "instrumentum 18, ordo 15, machina 12, telum 9, tutamen 6, auram 3")
        Research.setComplexity("GADOMANCY.GOLEMCOREBODYGUARD", 3)
        Research.setAspects("GADOMANCY.GOLEMRUNICSHIELD", "auram 15, motus 12, tutamen 9, praecantatio 6, ordo 3")
        Research.setComplexity("GADOMANCY.GOLEMRUNICSHIELD", 3)
        Arcane.addShaped("GADOMANCY.ANCIENT_STONES",
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11).amount(6),
                "terra 6, perditio 12, ignis 6",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockEldritch", 4),
                                ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockEldritch", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6))))
        Research.setAspects("GADOMANCY.ANCIENT_STONES", "ignis 15, alienis 12, perditio 9, terra 6, permutatio 3")
        Research.setComplexity("GADOMANCY.ANCIENT_STONES", 3)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 1).amount(2),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                        OreBracketHandler.getOre("craftingToolSaw")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Thaumcraft:blockStairsEldritch", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11), null,
                        null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11))), null)
        Crucible.addRecipe("GADOMANCY.ANCIENT_STONES", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 15),
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                "permutatio 8, perditio 12, alienis 12, terra 8")
        Infusion.addRecipe("GADOMANCY.NODE_MANIPULATOR", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 5),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22970),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 10),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1)),
                "alienis 48, auram 64, machina 48, praecantatio 32, tenebrae 16, permutatio 24, motus 8",
                ItemBracketHandler.getItem("gadomancy:BlockNodeManipulator", 5), 10)
        Infusion.addRecipe("GADOMANCY.NODE_MANIPULATOR", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 8),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                "alienis 24, machina 48, ordo 64, praecantatio 16, tenebrae 32, nebrisum 8, lucrum 16",
                ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 0), 10)
        Research.setAspects("GADOMANCY.NODE_MANIPULATOR",
                "nebrisum 27, alienis 24, vacuos 21, praecantatio 18, auram 15, lucrum 12, machina 9, tenebrae 6, permutatio 3")
        Research.setComplexity("GADOMANCY.NODE_MANIPULATOR", 4)
        Infusion.addRecipe("GADOMANCY.INFUSIONCLAW", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 5),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 8),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970),
                        ItemBracketHandler.getItem("Thaumcraft:FocusPrimal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970),
                        ItemBracketHandler.getItem("Thaumcraft:FocusPrimal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6)),
                "alienis 64, machina 48, ordo 48, tenebrae 32, praecantatio 32, motus 16, cognitio 8",
                ItemBracketHandler.getItem("gadomancy:BlockInfusionClaw", 0), 15)
        Research.setAspects("GADOMANCY.INFUSIONCLAW",
                "alienis 21, machina 18, praecantatio 15, ordo 12, tenebrae 9, motus 6, cognitio 3")
        Research.setComplexity("GADOMANCY.INFUSIONCLAW", 3)
        Research.setAspects("GADOMANCY.STICKYJAR", "limus 12, terra 9, aer 6, praecantatio 3")
        Research.setComplexity("GADOMANCY.STICKYJAR", 3)
        Arcane.addShaped("GADOMANCY.REMOTEJAR", ItemBracketHandler.getItem("gadomancy:BlockRemoteJar", 0),
                "aqua 15, terra 15, ordo 15, aer 15",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMirror", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0))))
        Research.setAspects("GADOMANCY.REMOTEJAR", "machina 15, ordo 12, aqua 9, terra 6, alienis 3")
        Research.setComplexity("GADOMANCY.REMOTEJAR", 3)
        Arcane.addShaped("GADOMANCY.ARCANEDROPPER", ItemBracketHandler.getItem("gadomancy:BlockArcaneDropper", 0),
                "ordo 20, aer 20, terra 20",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("minecraft:dropper", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6))))
        Research.setAspects("GADOMANCY.ARCANEDROPPER",
                "machina 21, aer 18, terra 15, ordo 12, sensus 9, motus 6, praecantatio 3")
        Research.setComplexity("GADOMANCY.ARCANEDROPPER", 3)
        Research.setAspects("GADOMANCY.ARMORDISGUISE", "limus 15, praecantatio 12, tutamen 9, cognitio 6, nebrisum 3")
        Research.setComplexity("GADOMANCY.ARMORDISGUISE", 3)
        Research.setAspects("GADOMANCY.REVEALER", "aer 15, sensus 12, praecantatio 9, alienis 6, cognitio 3")
        Research.setComplexity("GADOMANCY.REVEALER", 3)
        Research.clearPages("GADOMANCY.BLOCK_PROTECTOR")
        Research.addPage("GADOMANCY.BLOCK_PROTECTOR", "gadomancy.research_page.BLOCK_PROTECTOR.1")
        Arcane.addShaped("GADOMANCY.BLOCK_PROTECTOR", ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 2),
                "terra 150, ordo 150",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:potion", 8264),
                        ItemBracketHandler.getItem("ThaumicTinkerer:brightNitor", 0),
                        ItemBracketHandler.getItem("minecraft:potion", 8264)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockTube", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0))))
        Research.addArcanePage("GADOMANCY.BLOCK_PROTECTOR",
                ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 2))
        Research.addPage("GADOMANCY.BLOCK_PROTECTOR", "gadomancy.research_page.BLOCK_PROTECTOR.3")
        Research.addPage("GADOMANCY.BLOCK_PROTECTOR", "gadomancy.research_page.BLOCK_PROTECTOR.4")
        Research.setAspects("GADOMANCY.BLOCK_PROTECTOR",
                "cognitio 21, bestia 18, terra 15, ordo 12, auram 9, lux 6, tutamen 3")
        Research.setComplexity("GADOMANCY.BLOCK_PROTECTOR", 3)
        Arcane.addShaped("GADOMANCY.E_PORTAL_CREATOR", ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 1),
                "perditio 30, ordo 30, terra 30",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 15),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11))))
        Infusion.addRecipe("GADOMANCY.E_PORTAL_CREATOR", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 8),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5)),
                "alienis 48, machina 48, permutatio 64, tenebrae 32, vacuos 32, auram 16, praecantatio 8",
                ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 3), 10)
        Research.setAspects("GADOMANCY.E_PORTAL_CREATOR",
                "tenebrae 21, auram 18, iter 15, alienis 12, vacuos 9, machina 6, praecantatio 3")
        Research.setComplexity("GADOMANCY.E_PORTAL_CREATOR", 3)
        Research.setAspects("GADOMANCY.ETHEREAL_FAMILIAR",
                " terra 18, praecantatio 15, ignis 12, auram 9, aer 6, ordo 3")
        Research.setComplexity("GADOMANCY.ETHEREAL_FAMILIAR", 3)
        Research.setAspects("GADOMANCY.AURA_CORE",
                "tenebrae 27, praecantatio 24, auram 21, perditio 18, ordo 15, aqua 12, aer 9, ignis 6, terra 3")
        Research.setComplexity("GADOMANCY.AURA_CORE", 3)
        Research.setAspects("GADOMANCY.CLEAN_AURA_CORE",
                "aqua 27, sano 24, praecantatio 21, auram 18, terra 15, ignis 12, perditio 9, ordo 6, aer 3")
        Research.setComplexity("GADOMANCY.CLEAN_AURA_CORE", 4)
        Research.setAspects("GADOMANCY.FAMILIAR_POISON", "venenum 15, telum 12, perditio 9, tenebrae 6, praecantatio 3")
        Research.setComplexity("GADOMANCY.FAMILIAR_POISON", 3)
        Research.setAspects("GADOMANCY.FAMILIAR_WEAKNESS",
                "vinculum 15, vitium 12, telum 9, praecantatio 6, tenebrae 3")
        Research.setComplexity("GADOMANCY.FAMILIAR_WEAKNESS", 3)
        Research.setAspects("GADOMANCY.FAMILIAR_SHOCK", "aer 15, tempestas 12, telum 9, praecantatio 6, tenebrae 3")
        Research.setComplexity("GADOMANCY.FAMILIAR_SHOCK", 3)
        Research.setAspects("GADOMANCY.FAMILIAR_FIRE", "ignis 15, infernus 12, telum 9, praecantatio 6, tenebrae 3")
        Research.setComplexity("GADOMANCY.FAMILIAR_FIRE", 3)
        Research.setAspects("GADOMANCY.FAMILIAR_DAMAGE", "potentia 15, ignis 12, telum 9, praecantatio 6, tenebrae 3")
        Research.setComplexity("GADOMANCY.FAMILIAR_DAMAGE", 3)
        Research.setAspects("GADOMANCY.FAMILIAR_RANGE", "alienis 15, ordo 12, telum 9, praecantatio 6, tenebrae 3")
        Research.setComplexity("GADOMANCY.FAMILIAR_RANGE", 3)
        Research.setAspects("GADOMANCY.FAMILIAR_SPEED", "motus 15, auram 12, telum 9, praecantatio 6, tenebrae 3")
        Research.setComplexity("GADOMANCY.FAMILIAR_SPEED", 3)
        Arcane.addShaped("GADOMANCY.ARCANE_PACKAGER", ItemBracketHandler.getItem("gadomancy:BlockStoneMachine", 4),
                "ordo 100, perditio 100, aer 100",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                                ItemBracketHandler.getItem("gadomancy:ItemAuraCore", 1),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockTable", 15),
                                ItemBracketHandler.getItem("Thaumcraft:blockJar", 0))))
        Research.setAspects("GADOMANCY.ARCANE_PACKAGER",
                "machina 18, aer 15, vacuos 12, praecantatio 9, potentia 6, arbor 3")
        Research.setComplexity("GADOMANCY.ARCANE_PACKAGER", 3)
        Arcane.addShaped("GADOMANCY.AURA_PYLON", ItemBracketHandler.getItem("gadomancy:BlockAuraPylon", 0),
                "ordo 100, aqua 100, aer 100, ignis 100",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockTube", 6),
                        OreBracketHandler.getOre("stickIridium"),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                                ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockTube", 6),
                                OreBracketHandler.getOre("stickIridium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 6))))
        Research.setAspects("GADOMANCY.AURA_PYLON", "auram 18, ordo 15, praecantatio 12, machina 9, aer 6, ignis 3")
        Research.setComplexity("GADOMANCY.AURA_PYLON", 3)
        Arcane.addShaped("GADOMANCY.AURA_PYLON", ItemBracketHandler.getItem("gadomancy:BlockAuraPylon", 1),
                "ordo 125, aer 125, ignis 125", arrayOf(arrayOf(OreBracketHandler.getOre("screwOsmiridium"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1), OreBracketHandler.getOre("screwOsmiridium")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("gadomancy:ItemAuraCore", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0)),
                arrayOf(OreBracketHandler.getOre("stickIridium"),
                        ItemBracketHandler.getItem("gadomancy:BlockAuraPylon", 0),
                        OreBracketHandler.getOre("stickIridium"))))
        Arcane.addShaped("GADOMANCY.KNOWLEDGE_BOOK", ItemBracketHandler.getItem("gadomancy:BlockKnowledgeBook", 0),
                "ordo 75, ignis 50, perditio 35, aer 35",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemThaumonomicon", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:bookshelf", 0),
                                ItemBracketHandler.getItem("gadomancy:ItemAuraCore", 5),
                                ItemBracketHandler.getItem("minecraft:bookshelf", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12),
                                ItemBracketHandler.getItem("Thaumcraft:ItemGoggles", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 12))))
        Research.setAspects("GADOMANCY.KNOWLEDGE_BOOK",
                "cognitio 24, ordo 21, praecantatio 18, machina 15, fabrico 12, motus 9, aer 6, lucrum 3")
        Research.setComplexity("GADOMANCY.KNOWLEDGE_BOOK", 3)
        Warp.addToResearch("GADOMANCY.KNOWLEDGE_BOOK", 4)
        Arcane.addShaped("GADOMANCY.ESSENTIA_COMPRESSOR",
                ItemBracketHandler.getItem("gadomancy:BlockEssentiaCompressor", 0),
                "aer 180, aqua 200, ignis 120, terra 100, perditio 140, ordo 160",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockTube", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockTube", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
                                ItemBracketHandler.getItem("gadomancy:ItemElement", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockTube", 6),
                                ItemBracketHandler.getItem("gadomancy:ItemAuraCore", 3),
                                ItemBracketHandler.getItem("Thaumcraft:blockTube", 6))))
        Research.setAspects("GADOMANCY.ESSENTIA_COMPRESSOR",
                "vacuos 21, perditio 18, machina 15, aqua 12, praecantatio 9, aqua 6, potentia 3")
        Research.setComplexity("GADOMANCY.ESSENTIA_COMPRESSOR", 3)
        Research.setAspects("GADOMANCY.AURA_EFFECTS",
                "cognitio 27, auram 24, praecantatio 21, ordo 18, ignis 15, aer 12, aqua 9, terra 6, perditio 3")
        Research.setComplexity("GADOMANCY.AURA_EFFECTS", 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 1).amount(4), null,
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                LiquidBracketHandler.getLiquid("water").withAmount(32), 400, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 1).amount(4), null,
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(20), 400, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 1).amount(4), null,
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 11),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 200, VoltageLevels.LV)
        Research.refreshResearchRecipe("GADOMANCY.GOLEMSILVERWOOD")
        Research.refreshResearchRecipe("GADOMANCY.GOLEMCOREBREAK")
        Research.refreshResearchRecipe("GADOMANCY.GOLEMCOREBODYGUARD")
        Research.refreshResearchRecipe("GADOMANCY.GOLEMRUNICSHIELD")
        Research.refreshResearchRecipe("GADOMANCY.ANCIENT_STONES")
        Research.refreshResearchRecipe("GADOMANCY.NODE_MANIPULATOR")
        Research.refreshResearchRecipe("GADOMANCY.INFUSIONCLAW")
        Research.refreshResearchRecipe("GADOMANCY.REMOTEJAR")
        Research.refreshResearchRecipe("GADOMANCY.ARCANEDROPPER")
        Research.refreshResearchRecipe("GADOMANCY.BLOCK_PROTECTOR")
        Research.refreshResearchRecipe("GADOMANCY.E_PORTAL_CREATOR")
        Research.refreshResearchRecipe("GADOMANCY.ARCANE_PACKAGER")
        Research.refreshResearchRecipe("GADOMANCY.AURA_PYLON")
        Research.refreshResearchRecipe("GADOMANCY.KNOWLEDGE_BOOK")
        Research.refreshResearchRecipe("GADOMANCY.ESSENTIA_COMPRESSOR")
        Research.refreshResearchRecipe("GADOMANCY.STICKYJAR")
    }
}