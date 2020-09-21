package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.*

class Thaumcraft06Eldritch : Runnable {
    override fun run() {
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 100))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 16))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemAxeVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemPickVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemShovelVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemHoeVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemHelmetVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemChestplateVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:ItemBootsVoid", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicbases:voidFAS", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicbases:voidShears", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockEssentiaReservoir", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusPrimal", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemHelmetVoidFortress", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemChestplateVoidFortress", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsVoidFortress", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemSanityChecker", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemPrimalCrusher", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 3))
        Research.clearPages("ELDRITCHMINOR")
        Research.addPage("ELDRITCHMINOR", "tc.research_page.ELDRITCHMINOR.1")
        Crucible.addRecipe("ELDRITCHMINOR", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17),
                OreBracketHandler.getOre("listAllseed"), "alienis 8, tenebrae 8, vacuos 8")
        Research.addCruciblePage("ELDRITCHMINOR", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17))
        Research.clearPages("VOIDMETAL")
        Research.addPage("VOIDMETAL", "tc.research_page.VOIDMETAL.1")
        Crucible.addRecipe("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 16),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17), "metallum 16")
        Research.addCruciblePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 16))
        Research.addPage("VOIDMETAL", "tc.research_page.VOIDMETAL.2")
        Research.setAspects("VOIDMETAL", "vacuos 12, metallum 12, tenebrae 9, alienis 9, gelum 6, terra 3")
        Research.setComplexity("VOIDMETAL", 3)
        Warp.addToResearch("VOIDMETAL", 1)
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemAxeVoid", 0), "perditio 30, terra 15",
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                        OreBracketHandler.getOre("ingotVoid"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                                OreBracketHandler.getOre("stickWood"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickVoid"), null)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemAxeVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0),
                "perditio 30, terra 15",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateVoid"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("plateVoid"),
                                OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickVoid"), null)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemPickVoid", 0), "perditio 30, terra 15",
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                        OreBracketHandler.getOre("ingotVoid"), OreBracketHandler.getOre("ingotVoid")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickVoid"), null)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemPickVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemShovelVoid", 0),
                "perditio 30, terra 15", arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                OreBracketHandler.getOre("ingotVoid"), OreBracketHandler.getOre("craftingToolHardHammer")),
                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickWood"), null),
                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickVoid"), null)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemShovelVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemHoeVoid", 0), "perditio 30, terra 15",
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                        OreBracketHandler.getOre("ingotVoid"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickWood"), null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickVoid"), null)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemHoeVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetVoid", 0),
                "perditio 40, terra 20", arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                OreBracketHandler.getOre("plateVoid"), OreBracketHandler.getOre("plateVoid")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("plateVoid")),
                arrayOfNulls(3)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateVoid", 0),
                "perditio 40, terra 20", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateVoid"),
                OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("plateVoid")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateVoid"), OreBracketHandler.getOre("plateVoid"),
                        OreBracketHandler.getOre("plateVoid")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateVoid"), OreBracketHandler.getOre("plateVoid"),
                        OreBracketHandler.getOre("plateVoid"))))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsVoid", 0),
                "perditio 40, terra 20", arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                OreBracketHandler.getOre("plateVoid"), OreBracketHandler.getOre("plateVoid")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("plateVoid")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"), null,
                        OreBracketHandler.getOre("plateVoid"))))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemBootsVoid", 0),
                "perditio 40, terra 20", arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"), null,
                OreBracketHandler.getOre("plateVoid")), arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVoid"),
                OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("plateVoid")),
                arrayOfNulls(3)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("Thaumcraft:ItemBootsVoid", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("thaumicbases:voidFAS", 0), "perditio 40, terra 20",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateVoid"), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:flint_and_steel", 0), null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateVoid"), null)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("thaumicbases:voidFAS", 0))
        Arcane.addShaped("VOIDMETAL", ItemBracketHandler.getItem("thaumicbases:voidShears", 0), "perditio 40, terra 20",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateVoid"), null),
                        arrayOf(OreBracketHandler.getOre("plateVoid"),
                                ItemBracketHandler.getItem("minecraft:shears", 0),
                                OreBracketHandler.getOre("plateVoid")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateVoid"), null)))
        Research.addArcanePage("VOIDMETAL", ItemBracketHandler.getItem("thaumicbases:voidShears", 0))
        Research.clearPages("CAP_void")
        Research.addPage("CAP_void", "tc.research_page.CAP_void.1")
        Arcane.addShaped("CAP_void", ItemBracketHandler.getItem("Thaumcraft:WandCap", 8),
                "ordo 40, ignis 40, aer 40, perditio 40",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwTungstenSteel"),
                        OreBracketHandler.getOre("foilVoid"), OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilVoid"), OreBracketHandler.getOre("ringVoid"),
                                OreBracketHandler.getOre("foilVoid")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwTungstenSteel"),
                                OreBracketHandler.getOre("foilVoid"), OreBracketHandler.getOre("screwTungstenSteel"))))
        Research.addArcanePage("CAP_void", ItemBracketHandler.getItem("Thaumcraft:WandCap", 8))
        Infusion.addRecipe("CAP_void", ItemBracketHandler.getItem("Thaumcraft:WandCap", 8),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17)),
                "alienis 32, auram 32, potentia 32, vacuos 32", ItemBracketHandler.getItem("Thaumcraft:WandCap", 7), 8)
        Research.addInfusionPage("CAP_void", ItemBracketHandler.getItem("Thaumcraft:WandCap", 7))
        Research.setAspects("CAP_void",
                "auram 12, vacuos 12, alienis 9, praecantatio 9, instrumentum 6, terra 6, tenebrae 3")
        Research.setComplexity("CAP_void", 3)
        Infusion.addRecipe("ESSENTIARESERVOIR", ItemBracketHandler.getItem("Thaumcraft:blockTube", 4),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0)),
                "aqua 16, permutatio 16, praecantatio 16, vacuos 16",
                ItemBracketHandler.getItem("Thaumcraft:blockEssentiaReservoir", 0), 8)
        Research.setAspects("ESSENTIARESERVOIR",
                "aqua 12, permutatio 12, praecantatio 9, vacuos 9, alienis 6, tenebrae 3")
        Research.setComplexity("ESSENTIARESERVOIR", 3)
        Arcane.addShaped("FOCUSPRIMAL", ItemBracketHandler.getItem("Thaumcraft:FocusPrimal", 0),
                "aqua 75, terra 75, ignis 75, aer 75, ordo 75, perditio 75",
                arrayOf(arrayOf(OreBracketHandler.getOre("gemExquisiteDiamond"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                                OreBracketHandler.getOre("gemExquisiteDiamond"))))
        Research.setAspects("FOCUSPRIMAL",
                "aqua 12, ignis 12, aer 12, terra 9, ordo 9, perditio 9, praecantatio 6, alienis 3")
        Research.setComplexity("FOCUSPRIMAL", 4)
        Infusion.addRecipe("ROD_primal_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 1),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 3),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 5),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 6),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 7)),
                "aer 64, aqua 64, terra 64, ignis 64, ordo 64, perditio 64, praecantatio 128",
                ItemBracketHandler.getItem("Thaumcraft:WandRod", 100), 10)
        Research.setAspects("ROD_primal_staff",
                "aqua 15, ignis 15, aer 12, terra 12, ordo 12, perditio 9, praecantatio 9, instrumentum 6, alienis 3")
        Research.setComplexity("ROD_primal_staff", 4)

        //TODO Replace ("harvestcraft:hardenedleatherItem", 0)
        //Infusion.addRecipe("ARMORVOIDFORTRESS", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetVoid", 0),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemGoggles", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
        //        "alienis 24, metallum 24, pannus 24, sensus 24, tutamen 24, vacuos 24, praecantatio 24",
        //        ItemBracketHandler.getItem("Thaumcraft:ItemHelmetVoidFortress", 0), 8)
        //Research.setAspects("ARMORVOIDFORTRESS",
        //        "vacuos 15, tenebrae 15, tutamen 12, pannus 12, alienis 9, praecantatio 9, sensus 6, metallum 3")
        //Research.setComplexity("ARMORVOIDFORTRESS", 4)
        //Infusion.addRecipe("ARMORVOIDFORTRESS", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateVoid", 0),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemChestplateRobe", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
        //        "alienis 32, metallum 32, pannus 32, sensus 32, tutamen 32, vacuos 32, praecantatio 32",
        //        ItemBracketHandler.getItem("Thaumcraft:ItemChestplateVoidFortress", 0), 8)
        //Infusion.addRecipe("ARMORVOIDFORTRESS", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsVoid", 0),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsRobe", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
        //        "alienis 28, metallum 28, pannus 28, sensus 28, tutamen 28, vacuos 28, praecantatio 28",
        //        ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsVoidFortress", 0), 8)

        Infusion.addRecipe("SANITYCHECK", ItemBracketHandler.getItem("Thaumcraft:ItemThaumometer", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockMirror", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330)),
                "alienis 16, cognitio 32, sensus 24, sano 16",
                ItemBracketHandler.getItem("Thaumcraft:ItemSanityChecker", 0), 5)
        Research.setAspects("SANITYCHECK", "sensus 12, cognitio 12, alienis 12, praecantatio 9, sano 6, victus 3")
        Research.setComplexity("SANITYCHECK", 3)

        //TODO Replace ("StevesCarts:ModuleComponents", 45)
        //Infusion.addRecipe("OCULUS", ItemBracketHandler.getItem("StevesCarts:ModuleComponents", 45),
        //        arrayOf(ItemBracketHandler.getItem("minecraft:ender_eye", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17),
        //                ItemBracketHandler.getItem("minecraft:ender_eye", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 17)),
        //        "alienis 64, iter 32, tenebrae 32, vacuos 32",
        //        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0), 7)

        Research.setAspects("OCULUS",
                "alienis 12, cognitio 12, tenebrae 9, iter 9, permutatio 9, vitium 6, praecantatio 3")
        Research.setComplexity("OCULUS", 3)
        Infusion.addRecipe("PRIMALCRUSHER", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemPickVoid", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShovelVoid", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0)),
                "alienis 24, instrumentum 24, lucrum 24, perditio 24, perfodio 24, telum 24, vacuos 24",
                ItemBracketHandler.getItem("Thaumcraft:ItemPrimalCrusher", 0), 10)
        Research.setAspects("PRIMALCRUSHER",
                "praecantatio 12, alienis 12, instrumentum 12, lucrum 9, perditio 9, perfodio 9, telum 6, vacuos 3")
        Research.setComplexity("PRIMALCRUSHER", 3)
        Arcane.addShaped("ADVALCHEMYFURNACE", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 3).amount(4),
                "aqua 32, terra 32, aer 32, ordo 32", arrayOf(arrayOf(OreBracketHandler.getOre("plateVoid"),
                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9), OreBracketHandler.getOre("plateVoid")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9)),
                arrayOf(OreBracketHandler.getOre("plateVoid"),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                        OreBracketHandler.getOre("plateVoid"))))
        Research.setAspects("ADVALCHEMYFURNACE", "perditio 12, auram 12, aer 9, ordo 9, praecantatio 6, alienis 3")
        Research.setComplexity("ADVALCHEMYFURNACE", 3)
        Research.refreshResearchRecipe("ELDRITCHMINOR")
        Research.refreshResearchRecipe("VOIDMETAL")
        Research.refreshResearchRecipe("CAP_void")
        Research.refreshResearchRecipe("ESSENTIARESERVOIR")
        Research.refreshResearchRecipe("FOCUSPRIMAL")
        Research.refreshResearchRecipe("ROD_primal_staff")
        Research.refreshResearchRecipe("ARMORVOIDFORTRESS")
        Research.refreshResearchRecipe("SANITYCHECK")
        Research.refreshResearchRecipe("OCULUS")
        Research.refreshResearchRecipe("PRIMALCRUSHER")
        Research.refreshResearchRecipe("ADVALCHEMYFURNACE")
        Research.refreshResearchRecipe("ROD_silverwood")
        Research.refreshResearchRecipe("ROD_greatwood_staff")
        Research.refreshResearchRecipe("ROD_reed_staff")
        Research.refreshResearchRecipe("ROD_blaze_staff")
        Research.refreshResearchRecipe("ROD_obsidian_staff")
        Research.refreshResearchRecipe("ROD_ice_staff")
        Research.refreshResearchRecipe("ROD_quartz_staff")
        Research.refreshResearchRecipe("ROD_bone_staff")
        Research.refreshResearchRecipe("ROD_silverwood_staff")
        Research.refreshResearchRecipe("SCEPTRE")
        Research.refreshResearchRecipe("ROD_greatwood")
        Research.refreshResearchRecipe("ROD_reed")
        Research.refreshResearchRecipe("ROD_blaze")
        Research.refreshResearchRecipe("ROD_obsidian")
        Research.refreshResearchRecipe("ROD_ice")
        Research.refreshResearchRecipe("ROD_quartz")
        Research.refreshResearchRecipe("ROD_bone")
    }
}