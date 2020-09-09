package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels
import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.Extruder
import gttweaker.mods.gregtech.machines.Mixer
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.forestry.handlers.Carpenter
import modtweaker2.mods.thaumcraft.handlers.*
import net.minecraftforge.oredict.OreDictionary

class MagicBees : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5), null, false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:backpack.thaumaturgeT1", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("MagicBees:backpack.thaumaturgeT2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:capsule.magic", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:capsule.void", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 17))
        Infusion.removeRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 17))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:effectJar", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 7))
        Crucible.removeRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 8))
        Crucible.removeRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 9))
        Crucible.removeRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 10))
        Crucible.removeRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 11))
        Arcane.removeRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 12))
        Crucible.removeRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:magicApiary", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:frameMagic", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("MagicBees:frameMagic", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:frameResilient", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:frameGentle", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:frameMetabolic", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:frameNecrotic", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:frameTemporal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:frameOblivion", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:miscResources", 6))
        Arcane.removeRecipe(ItemBracketHandler.getItem("MagicBees:visAuraProvider", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("MagicBees:item.thaumiumScoop", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("MagicBees:item.voidScoop", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("MagicBees:item.thaumiumGrafter", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("MagicBees:item.voidGrafter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:moonDial", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:magnet", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("MagicBees:magicbees.enchantedEarth", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1540),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1543),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1541),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 20)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1542),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 21)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1545),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 22)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1544),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 23)), null)

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("MagicBees:backpack.thaumaturgeT1", 0),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                OreBracketHandler.getOre("gemAmber"),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("itemLeather"),
        //                        OreBracketHandler.getOre("gemAmber"), OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("MagicBees:backpack.thaumaturgeT1", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:backpack.thaumaturgeT1", 0)), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
                ItemBracketHandler.getItem("MagicBees:backpack.thaumaturgeT1", 0),
                ItemBracketHandler.getItem("MagicBees:backpack.thaumaturgeT2", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("MagicBees:magnet", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"),
                        OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("screwSteelMagnetic")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:compass", 0),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                                ItemBracketHandler.getItem("minecraft:compass", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteelMagnetic"),
                                OreBracketHandler.getOre("gemExquisiteDiamond"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        Research.addResearch("MAGICAPIARY", "MAGICBEES", "praecantatio 15, sano 12, ignis 9, lucrum 6", 1, 7, 4,
                ItemBracketHandler.getItem("MagicBees:magicApiary", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.MAGICAPIARY", "Magic Apiary")
        MineTweakerAPI.game.setLocalization("tc.research_text.MAGICAPIARY", "[MB] Magical Apiary.")
        Research.addPrereq("MAGICAPIARY", "MB_DimensionalSingularity", false)
        Research.setConcealed("MAGICAPIARY", true)
        Research.setRound("MAGICAPIARY", true)
        Research.addPage("MAGICAPIARY", "MagicBees.research_page.MAGICAPIARY")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.MAGICAPIARY",
                "The Magic Apiary works similarly to the regular Apiary, with 1x base Territory, Mutation, Lifespan, and Flowering modifiers, 0.9x Production modifier, and 0.8 Genetic Decay modifier. When an Apiary Booster of any type is placed nearby, the Apiary will consume aspects to enable 2x (or 1/2) boosts for, in order from left to right: Mutation, Death Rate, Production. Enabling death rate will halve lifespan. Its useful when all youre interested in is breeding, and dont have access to Oblivion Frames.")
        Infusion.addRecipe("MAGICAPIARY", ItemBracketHandler.getItem("Forestry:apiculture", 0),
                arrayOf(ItemBracketHandler.getItem("MagicBees:wax", 0), ItemBracketHandler.getItem("MagicBees:wax", 1),
                        ItemBracketHandler.getItem("MagicBees:wax", 2),
                        ItemBracketHandler.getItem("MagicBees:pollen", 0),
                        ItemBracketHandler.getItem("MagicBees:pollen", 1)),
                "praecantatio 75, sano 75, ignis 50, lucrum 50, exanimis 25, herba 20",
                ItemBracketHandler.getItem("MagicBees:magicApiary", 0), 3)
        Research.addInfusionPage("MAGICAPIARY", ItemBracketHandler.getItem("MagicBees:magicApiary", 0))
        Warp.addToResearch("MAGICAPIARY", 2)
        Research.moveResearch("MB_VisAuraProvider", "MAGICBEES", -3, 7)
        Research.setRound("MB_VisAuraProvider", true)
        Research.addPrereq("MB_VisAuraProvider", "MB_DimensionalSingularity", false)
        Research.setAspects("MB_VisAuraProvider", "lucrum 15, metallum 12, vitreus 12, ordo 9, motus 6, machina 3")
        Research.setComplexity("MB_VisAuraProvider", 4)
        Research.setConcealed("MB_VisAuraProvider", true)
        Warp.addToResearch("MB_VisAuraProvider", 2)
        Research.clearPages("MB_VisAuraProvider")
        Research.addPage("MB_VisAuraProvider", "tc.research_page.MB_VisAuraProvider.1")
        Arcane.addShaped("MB_VisAuraProvider", ItemBracketHandler.getItem("MagicBees:visAuraProvider", 0),
                "ordo 75, aqua 75, aer 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:pollen", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 5),
                        ItemBracketHandler.getItem("MagicBees:pollen", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 5),
                                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 2),
                                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23086),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4182),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23086))))
        Research.addArcanePage("MB_VisAuraProvider", ItemBracketHandler.getItem("MagicBees:visAuraProvider", 0))
        Research.addResearch("CONCENTRATEDCOMPOUND", "MAGICBEES", "messis 15, sano 12, vitreus 9, perditio 6", 2, -3, 4,
                ItemBracketHandler.getItem("MagicBees:miscResources", 2))
        MineTweakerAPI.game.setLocalization("tc.research_name.CONCENTRATEDCOMPOUND", "Concentrated Compound")
        MineTweakerAPI.game.setLocalization("tc.research_text.CONCENTRATEDCOMPOUND", "[MB] Concentrated Compound.")
        Research.addPrereq("CONCENTRATEDCOMPOUND", "MB_Root", false)
        Research.addPrereq("CONCENTRATEDCOMPOUND", "MB_EssenceLife", false)
        Research.setConcealed("CONCENTRATEDCOMPOUND", true)
        Research.addPage("CONCENTRATEDCOMPOUND", "MagicBees.research_page.CONCENTRATEDCOMPOUND")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.CONCENTRATEDCOMPOUND",
                "Concentrated Compound from Apatite")
        Crucible.addRecipe("CONCENTRATEDCOMPOUND", ItemBracketHandler.getItem("MagicBees:miscResources", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8530), "messis 6, vitreus 3")
        Research.addCruciblePage("CONCENTRATEDCOMPOUND", ItemBracketHandler.getItem("MagicBees:miscResources", 2))
        Research.clearPages("MB_EssenceLife")
        Research.addPage("MB_EssenceLife", "tc.research_page.MB_EssenceLife.1")
        Crucible.addRecipe("MB_EssenceLife", ItemBracketHandler.getItem("MagicBees:miscResources", 7),
                ItemBracketHandler.getItem("minecraft:red_flower", 0), "metallum 16, permutatio 16, herba 16, terra 16")
        Research.addCruciblePage("MB_EssenceLife", ItemBracketHandler.getItem("MagicBees:miscResources", 7))
        Research.setAspects("MB_EssenceLife", "metallum 12, permutatio 9, herba 6, terra 3")
        Research.setComplexity("MB_EssenceLife", 3)
        Research.clearPages("MB_EssenceDeath")
        Research.addPage("MB_EssenceDeath", "tc.reseacrh_page.MB_EssenceDeath.1")
        Crucible.addRecipe("MB_EssenceDeath", ItemBracketHandler.getItem("MagicBees:miscResources", 8),
                ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                "mortuus 16, perditio 16, spiritus 16, exanimis 16")
        Research.addCruciblePage("MB_EssenceDeath", ItemBracketHandler.getItem("MagicBees:miscResources", 8))
        Research.setAspects("MB_EssenceDeath", "mortuus 12, perditio 9, spiritus 6, exanimis 3")
        Research.setComplexity("MB_EssenceDeath", 3)
        Research.clearPages("MB_EssenceTime")
        Research.addPage("MB_EssenceTime", "tc.research_page.MB_EssenceTime.1")
        Crucible.addRecipe("MB_EssenceTime", ItemBracketHandler.getItem("MagicBees:miscResources", 9),
                ItemBracketHandler.getItem("minecraft:clock", 0), "ordo 16, vacuos 16, vinculum 16, tempus 16")
        Research.addCruciblePage("MB_EssenceTime", ItemBracketHandler.getItem("MagicBees:miscResources", 9))
        Research.setAspects("MB_EssenceTime", "ordo 12, vacuos 9, vinculum 6, tempus 3")
        Research.setComplexity("MB_EssenceTime", 3)
        Research.clearPages("MB_EssenceArmor")
        Research.addPage("MB_EssenceArmor", "tc.research_page.MB_EssenceArmor.1")
        Crucible.addRecipe("MB_EssenceArmor", ItemBracketHandler.getItem("MagicBees:miscResources", 10),
                ItemBracketHandler.getItem("minecraft:iron_chestplate", 0),
                "tutamen 16, praecantatio 16, metallum 16, fabrico 16")
        Research.addCruciblePage("MB_EssenceArmor", ItemBracketHandler.getItem("MagicBees:miscResources", 10))
        Research.setAspects("MB_EssenceArmor", "tutamen 12, praecantatio 9, metallum 6, fabrico 3")
        Research.setComplexity("MB_EssenceArmor", 3)
        Research.clearPages("MB_EssenceUnstable")
        Research.addPage("MB_EssenceUnstable", "tc.research_page.MB_EssenceUnstable.1")
        Crucible.addRecipe("MB_EssenceUnstable", ItemBracketHandler.getItem("MagicBees:miscResources", 12),
                ItemBracketHandler.getItem("MagicBees:propolis", 0),
                "perditio 16, permutatio 16, limus 16, potentia 16")
        Research.addCruciblePage("MB_EssenceUnstable", ItemBracketHandler.getItem("MagicBees:miscResources", 12))
        Research.setAspects("MB_EssenceUnstable", "perditio 12, permutatio 9, limus 6, potentia 3")
        Research.setComplexity("MB_EssenceUnstable", 3)
        Research.clearPages("MB_DimensionalSingularity")
        Research.addPrereq("MB_DimensionalSingularity", "INFUSION", false)
        Research.setConcealed("MB_DimensionalSingularity", true)
        Research.addPage("MB_DimensionalSingularity", "tc.research_page.MB_DimensionalSingularity.1")
        Infusion.addRecipe("MB_DimensionalSingularity", ItemBracketHandler.getItem("minecraft:gold_block", 0),
                arrayOf(ItemBracketHandler.getItem("MagicBees:propolis", 0),
                        ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                        ItemBracketHandler.getItem("MagicBees:propolis", 0),
                        ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                        ItemBracketHandler.getItem("MagicBees:propolis", 0),
                        ItemBracketHandler.getItem("minecraft:ender_eye", 0)),
                " praecantatio 24, permutatio 24, alienis 16, tenebrae 16",
                ItemBracketHandler.getItem("MagicBees:miscResources", 17), 6)
        Research.addInfusionPage("MB_DimensionalSingularity", ItemBracketHandler.getItem("MagicBees:miscResources", 17))
        Research.setAspects("MB_DimensionalSingularity", "perditio 15, permutatio 12, limus 9, potentia 6")
        Research.setComplexity("MB_DimensionalSingularity", 3)
        Research.moveResearch("MB_EssenceOblivion", "MAGICBEES", -7, 4)
        Research.clearPages("MB_EssenceOblivion")
        Research.addPage("MB_EssenceOblivion", "tc.research_page.MB_EssenceOblivion.1")
        Infusion.addRecipe("MB_EssenceOblivion", ItemBracketHandler.getItem("minecraft:dragon_egg", 0),
                arrayOf(ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 17)),
                " alienis 100, praecantatio 100, lucrum 75, bestia 75",
                ItemBracketHandler.getItem("MagicBees:miscResources", 11), 8)
        Research.addInfusionPage("MB_EssenceOblivion", ItemBracketHandler.getItem("MagicBees:miscResources", 11))
        Research.setAspects("MB_EssenceOblivion", "alienis 5, praecantatio 5, lucrum 5, bestia 5")
        Research.setComplexity("MB_EssenceOblivion", 3)
        Research.moveResearch("MB_FrameMagic", "MAGICBEES", -4, 0)
        Research.addPrereq("MB_FrameMagic", "MB_Root", false)
        Research.setConcealed("MB_FrameMagic", true)
        Research.clearPages("MB_FrameMagic")
        Research.addPage("MB_FrameMagic", "tc.research_page.MB_FrameMagic.1")
        Arcane.addShaped("MB_FrameMagic", ItemBracketHandler.getItem("MagicBees:frameMagic", 0),
                "ordo 8, terra 8, aer 8, perditio 8, ignis 8, aqua 8",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"), ItemBracketHandler.getItem("MagicBees:wax", 1),
                        OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:wax", 0),
                                ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                                ItemBracketHandler.getItem("MagicBees:wax", 2)),
                        arrayOf(OreBracketHandler.getOre("screwSteel"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                OreBracketHandler.getOre("screwSteel"))))
        Research.addArcanePage("MB_FrameMagic", ItemBracketHandler.getItem("MagicBees:frameMagic", 0))
        Research.setAspects("MB_FrameMagic", "ordo 15, terra 12, aer 9, perditio 6")
        Research.setComplexity("MB_FrameMagic", 4)
        Research.addResearch("GENTLEFRAME", "MAGICBEES", "victus 15, instrumentum 15, aer 12, ignis 9, terra 6, aqua 3",
                -7, 2, 4, ItemBracketHandler.getItem("MagicBees:frameGentle", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.GENTLEFRAME", "Gentle Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.GENTLEFRAME", "[MB] Magic Living Frame")
        Research.addPrereq("GENTLEFRAME", "MB_FrameMagic", false)
        Research.addPrereq("GENTLEFRAME", "MB_EssenceLife", false)
        Research.setConcealed("GENTLEFRAME", true)
        Research.addPage("GENTLEFRAME", "MagicBees.research_page.GENTLEFRAME")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.GENTLEFRAME",
                "The Gentle Frame is an Item used in an Apiary, which increases a Queen's lifespan and production at the cost of a slightly lower mutation rate. It has a durability of 200, which is slightly shorter than average. The Gentle Frame increases a bee's lifespan by 50% and its productivity by 40%. Its mutation rate is lowered by 30%, leaving it at 70% of its initial mutation rate. With each durability use/bee cycle, the Gentle Frame will deplete the nearby Aura by one point. Additionally, Sano and Victus Flux will be released into the Aura. In an Alveary structure, the Frame Housing can be added to make use of the Frame.")
        Arcane.addShaped("GENTLEFRAME", ItemBracketHandler.getItem("MagicBees:frameGentle", 0),
                "ordo 16, terra 16, aer 16, perditio 16, ignis 16, aqua 16",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 7),
                        OreBracketHandler.getOre("screwAluminium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 18),
                                ItemBracketHandler.getItem("MagicBees:frameMagic", 0),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 18)),
                        arrayOf(OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 18),
                                OreBracketHandler.getOre("screwAluminium"))))
        Research.addArcanePage("GENTLEFRAME", ItemBracketHandler.getItem("MagicBees:frameGentle", 0))
        Research.addResearch("RESILIENTFRAME", "MAGICBEES", "tutamen 15, pannus 15, aer 12, ignis 9, terra 6, aqua 3",
                -7, 1, 4, ItemBracketHandler.getItem("MagicBees:frameResilient", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.RESILIENTFRAME", "Resilient Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.RESILIENTFRAME", "[MB] Magic Production Frame")
        Research.addPrereq("RESILIENTFRAME", "MB_FrameMagic", false)
        Research.addPrereq("RESILIENTFRAME", "MB_EssenceArmor", false)
        Research.setConcealed("RESILIENTFRAME", true)
        Research.addPage("RESILIENTFRAME", "MagicBees.research_page.RESILIENTFRAME")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.RESILIENTFRAME",
                "The Resilient Frame is an Item used in an Apiary, which doubles the bee's productivity. It has a durability of 840, making it the most durable frame available. The Resilient Frame is the longer-lasting counterpart to the Magic Frame. With each durability use/bee cycle, the Resilient Frame will deplete the nearby Aura by two points. Additionally, Tutamen Flux will be released into the Aura. In an Alveary structure, the Frame Housing can be added to make use of the Frame.")
        Arcane.addShaped("RESILIENTFRAME", ItemBracketHandler.getItem("MagicBees:frameResilient", 0),
                "ordo 16, terra 16, aer 16, perditio 16, ignis 16, aqua 16",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 10),
                        OreBracketHandler.getOre("screwAluminium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 22),
                                ItemBracketHandler.getItem("MagicBees:frameMagic", 0),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 22)),
                        arrayOf(OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 22),
                                OreBracketHandler.getOre("screwAluminium"))))
        Research.addArcanePage("RESILIENTFRAME", ItemBracketHandler.getItem("MagicBees:frameResilient", 0))
        Research.addResearch("NECROTICFRAME", "MAGICBEES", "mortuus 15, fabrico 15, aer 12, ignis 9, terra 6, aqua 3",
                -7, 0, 4, ItemBracketHandler.getItem("MagicBees:frameNecrotic", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.NECROTICFRAME", "Necrotic Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.NECROTICFRAME", "[MB] Magic Killing Frame")
        Research.addPrereq("NECROTICFRAME", "MB_FrameMagic", false)
        Research.addPrereq("NECROTICFRAME", "MB_EssenceDeath", false)
        Research.setConcealed("NECROTICFRAME", true)
        Research.addPage("NECROTICFRAME", "MagicBees.research_page.NECROTICFRAME")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.NECROTICFRAME",
                "The Necrotic Frame is an Item used in an Apiary, which drastically decreases a Queen's lifespan and productivity. It has a durability of 270. The Necrotic Frame decreases a bee's lifespan to only 30% and its productivity to 75%. With each durability use/bee cycle, the Necrotic Frame will deplete the nearby Aura by one point. Additionally, a significant amount of Mortuus and Venenum Flux will be released into the aura. In an Alveary structure, the Frame Housing can be added to make use of the Frame.")
        Arcane.addShaped("NECROTICFRAME", ItemBracketHandler.getItem("MagicBees:frameNecrotic", 0),
                "ordo 16, terra 16, aer 16, perditio 16, ignis 16, aqua 16",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 8),
                        OreBracketHandler.getOre("screwAluminium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 23),
                                ItemBracketHandler.getItem("MagicBees:frameMagic", 0),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 23)),
                        arrayOf(OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 23),
                                OreBracketHandler.getOre("screwAluminium"))))
        Research.addArcanePage("NECROTICFRAME", ItemBracketHandler.getItem("MagicBees:frameNecrotic", 0))
        Research.addResearch("METABOLICFRAME", "MAGICBEES", "limus 15, potentia 15, aer 12, ignis 9, terra 6, aqua 3",
                -7, -1, 4, ItemBracketHandler.getItem("MagicBees:frameMetabolic", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.METABOLICFRAME", "Metabolic Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.METABOLICFRAME", "[MB] Magic Drug Frame")
        Research.addPrereq("METABOLICFRAME", "MB_FrameMagic", false)
        Research.addPrereq("METABOLICFRAME", "MB_EssenceUnstable", false)
        Research.setConcealed("METABOLICFRAME", true)
        Research.addPage("METABOLICFRAME", "MagicBees.research_page.METABOLICFRAME")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.METABOLICFRAME",
                "The Metabolic Frame is an Item used in an Apiary, which drastically increases a bee's mutation rate as well as a slight increase in it's production. It has a durability of 130. The Metabolic Frame increases the mutation rate by 80% and its production by 20%.")
        Arcane.addShaped("METABOLICFRAME", ItemBracketHandler.getItem("MagicBees:frameMetabolic", 0),
                "ordo 16, terra 16, aer 16, perditio 16, ignis 16, aqua 16",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 12),
                        OreBracketHandler.getOre("screwAluminium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 20),
                                ItemBracketHandler.getItem("MagicBees:frameMagic", 0),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 20)),
                        arrayOf(OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 20),
                                OreBracketHandler.getOre("screwAluminium"))))
        Research.addArcanePage("METABOLICFRAME", ItemBracketHandler.getItem("MagicBees:frameMetabolic", 0))
        Research.addResearch("TEMPORALFRAME", "MAGICBEES", "tempus 15, vacuos 15, aer 12, ignis 9, terra 6, aqua 3", -7,
                -2, 4, ItemBracketHandler.getItem("MagicBees:frameTemporal", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.TEMPORALFRAME", "Temporal Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.TEMPORALFRAME", "[MB] Magic Time Frame")
        Research.addPrereq("TEMPORALFRAME", "MB_FrameMagic", false)
        Research.addPrereq("TEMPORALFRAME", "MB_EssenceTime", false)
        Research.setConcealed("TEMPORALFRAME", true)
        Research.addPage("TEMPORALFRAME", "MagicBees.research_page.TEMPORALFRAME")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.TEMPORALFRAME",
                "The Temporal Frame is an Item used in an Apiary, which drastically increases a Queen's lifespan to 150%. It has a durability of 300. Out of all Frames, the Temporal Frame gives the highest lifespan increase. With each durability use/bee cycle, the Temporal Frame will deplete the nearby Aura by one point. However, a significant amount of Tempus Flux will be released into the aura. In an Alveary structure, the Frame Housing can be added to make use of the Frame.")
        Arcane.addShaped("TEMPORALFRAME", ItemBracketHandler.getItem("MagicBees:frameTemporal", 0),
                "ordo 16, terra 16, aer 16, perditio 16, ignis 16, aqua 16",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 9),
                        OreBracketHandler.getOre("screwAluminium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 21),
                                ItemBracketHandler.getItem("MagicBees:frameMagic", 0),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 21)),
                        arrayOf(OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 22),
                                OreBracketHandler.getOre("screwAluminium"))))
        Research.addArcanePage("TEMPORALFRAME", ItemBracketHandler.getItem("MagicBees:frameTemporal", 0))
        Research.addResearch("OBLIVIONFRAME", "MAGICBEES", "tutamen 15, pannus 15, aer 12, ignis 9, terra 6, aqua 3",
                -10, 0, 4, ItemBracketHandler.getItem("MagicBees:frameOblivion", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.OBLIVIONFRAME", "Oblivion Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.OBLIVIONFRAME", "[MB] Magic Production Frame")
        Research.addPrereq("OBLIVIONFRAME", "INFUSION", false)
        Research.addPrereq("OBLIVIONFRAME", "GENTLEFRAME", false)
        Research.addPrereq("OBLIVIONFRAME", "RESILIENTFRAME", false)
        Research.addPrereq("OBLIVIONFRAME", "NECROTICFRAME", false)
        Research.addPrereq("OBLIVIONFRAME", "METABOLICFRAME", false)
        Research.addPrereq("OBLIVIONFRAME", "TEMPORALFRAME", false)
        Research.addPrereq("OBLIVIONFRAME", "MB_EssenceOblivion", false)
        Research.setConcealed("OBLIVIONFRAME", true)
        Research.addPage("OBLIVIONFRAME", "MagicBees.research_page.OBLIVIONFRAME")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.OBLIVIONFRAME",
                "The Oblivion Frame is an item added by the Magic Bees mod. Placed in an Apiary or inserted in a Frame Housing within an Alveary, it reduces the lifespan of the residing Queen to a single life cycle (27.5 sec) allowing for very rapid bee breeding. However, an Oblivion Frame draws about 15 Vis per use from the air and releases Tempus aspects into the aura as flux. The Oblivion Frame does not function if used alongside another frame, and that would cause it to take a lot of damage")
        Arcane.addShaped("OBLIVIONFRAME", ItemBracketHandler.getItem("MagicBees:frameOblivion", 0),
                "ordo 32, terra 32, aer 32, ignis 32, aqua 32, perditio 32",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 11),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:miscResources", 19),
                                ItemBracketHandler.getItem("MagicBees:frameMagic", 0),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 19)),
                        arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                                ItemBracketHandler.getItem("MagicBees:miscResources", 19),
                                OreBracketHandler.getOre("screwStainlessSteel"))))
        Research.addArcanePage("OBLIVIONFRAME", ItemBracketHandler.getItem("MagicBees:frameOblivion", 0))
        Research.clearPages("MB_Scoop")
        Research.addPage("MB_Scoop", "tc.research_page.MB_Scoop.1")
        Arcane.addShaped("MB_Scoop", ItemBracketHandler.getItem("MagicBees:item.thaumiumScoop", 0),
                "ordo 10, terra 10, aer 10",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330),
                        ItemBracketHandler.getItem("minecraft:wool", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330)),
                        arrayOf(OreBracketHandler.getOre("craftingToolWireCutter"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330),
                                OreBracketHandler.getOre("craftingToolHardHammer"))))
        Research.addArcanePage("MB_Scoop", ItemBracketHandler.getItem("MagicBees:item.thaumiumScoop", 0))
        Research.setAspects("MB_Scoop", "ordo 9, terra 6, aer 3")
        Research.setComplexity("MB_Scoop", 3)
        Research.clearPages("MB_ScoopVoid")
        Research.addPage("MB_ScoopVoid", "tc.research_page.MB_ScoopVoid.1")
        Arcane.addShaped("MB_ScoopVoid", ItemBracketHandler.getItem("MagicBees:item.voidScoop", 0),
                "ordo 20, terra 20, aer 20",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970),
                        ItemBracketHandler.getItem("minecraft:wool", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970)),
                        arrayOf(OreBracketHandler.getOre("craftingToolWireCutter"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970),
                                OreBracketHandler.getOre("craftingToolHardHammer"))))
        Research.addArcanePage("MB_ScoopVoid", ItemBracketHandler.getItem("MagicBees:item.voidScoop", 0))
        Research.setAspects("MB_ScoopVoid", "praecantatio 15, ordo 9, terra 6, aer 3")
        Research.setComplexity("MB_ScoopVoid", 3)
        Warp.addToResearch("MB_ScoopVoid", 3)
        Research.clearPages("MB_Grafter")
        Research.addPage("MB_Grafter", "tc.research_page.MB_Grafter.1")
        Arcane.addShaped("MB_Grafter", ItemBracketHandler.getItem("MagicBees:item.thaumiumGrafter", 0),
                "ordo 15, terra 15, aer 15",
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330), null),
                        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330), null),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 2),
                                OreBracketHandler.getOre("craftingToolHardHammer"))))
        Research.addArcanePage("MB_Grafter", ItemBracketHandler.getItem("MagicBees:item.thaumiumGrafter", 0))
        Research.setAspects("MB_Grafter", "ordo 12, terra 9, aer 6")
        Research.setComplexity("MB_Grafter", 3)
        Research.clearPages("MB_GrafterVoid")
        Research.addPage("MB_GrafterVoid", "tc.research_page.MB_GrafterVoid.1")
        Arcane.addShaped("MB_GrafterVoid", ItemBracketHandler.getItem("MagicBees:item.voidGrafter", 0),
                "ordo 30, terra 30, aer 30",
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970), null),
                        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23970), null),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 16),
                                OreBracketHandler.getOre("craftingToolHardHammer"))))
        Research.addArcanePage("MB_GrafterVoid", ItemBracketHandler.getItem("MagicBees:item.voidGrafter", 0))
        Research.setAspects("MB_GrafterVoid", "praecantatio 15, ordo 12, terra 9, aer 6")
        Research.setComplexity("MB_GrafterVoid", 3)
        Warp.addToResearch("MB_GrafterVoid", 3)
        Research.addResearch("ENCHANTEDEARTH", "MAGICBEES", "terra 9, victus 9, sano 6, ordo 3", 5, -3, 2,
                ItemBracketHandler.getItem("MagicBees:magicbees.enchantedEarth", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENCHANTEDEARTH", "Enchanted Earth")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENCHANTEDEARTH", "[MC] Magical Dirt")
        Research.addPrereq("ENCHANTEDEARTH", "MB_EssenceLife", false)
        Research.setConcealed("ENCHANTEDEARTH", true)
        Research.addPage("ENCHANTEDEARTH", "MagicBees.research_page.ENCHANTEDEARTH")
        MineTweakerAPI.game.setLocalization("MagicBees.research_page.ENCHANTEDEARTH",
                "Enchanted Earth makes plants and trees grow a bit faster in a 3x3 area around it.")
        Arcane.addShaped("ENCHANTEDEARTH", ItemBracketHandler.getItem("MagicBees:magicbees.enchantedEarth", 0),
                "ordo 10, aqua 10, terra 10",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:dirt", 0), null,
                        ItemBracketHandler.getItem("minecraft:dirt", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("MagicBees:miscResources", 7), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:dirt", 0), null,
                                ItemBracketHandler.getItem("minecraft:dirt", 0))))
        Research.addArcanePage("ENCHANTEDEARTH", ItemBracketHandler.getItem("MagicBees:magicbees.enchantedEarth", 0))
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:capsule.void", 0).amount(2),
                ItemBracketHandler.getItem("Genetics:misc", 8).amount(2),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                LiquidBracketHandler.getLiquid("molten.gold").withAmount(288), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:effectJar", 0),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGlass", 0).amount(5),
                ItemBracketHandler.getItem("MagicBees:pollen", 0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(144), 600, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 4),
                ItemBracketHandler.getItem("MagicBees:miscResources", 3).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0),
                LiquidBracketHandler.getLiquid("molten.thaumium").withAmount(72), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:miscResources", 6),
                ItemBracketHandler.getItem("MagicBees:miscResources", 5).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 6).amount(0),
                LiquidBracketHandler.getLiquid("molten.thaumium").withAmount(288), 400, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:moonDial", 0),
                ItemBracketHandler.getItem("minecraft:clock", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8537).amount(4),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegreen").withAmount(576), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 2),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 0).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 2),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 1).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 4),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 2).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 4),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 3).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 6),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 4).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 600, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 6),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 5).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 600, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 8),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 6).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 800,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 8),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 7).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 800,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 10),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 8).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 1000, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 10),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 9).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 1000, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 12),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 10).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 1200, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 12),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 11).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 1200, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 14),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 12).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 1400, VoltageLevels.LIV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 14),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 13).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 1400, VoltageLevels.LIV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 16),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 14).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 1600, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("MagicBees:magnet", 16),
                ItemBracketHandler.getItem("MagicBees:miscResources", 17),
                ItemBracketHandler.getItem("MagicBees:magnet", 15).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1296), 1600, VoltageLevels.IV)
        Extruder.addRecipe(ItemBracketHandler.getItem("MagicBees:capsule.magic", 0),
                ItemBracketHandler.getItem("MagicBees:wax", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32354).amount(0), 100, VoltageLevels.LV)
        Extruder.addRecipe(ItemBracketHandler.getItem("MagicBees:capsule.magic", 0),
                ItemBracketHandler.getItem("MagicBees:wax", 2).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32354).amount(0), 100, VoltageLevels.LV)
        Research.refreshResearchRecipe("MB_VisAuraProvider")
        Mixer.addRecipe(ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(6), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE).amount(2),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 2)),
                LiquidBracketHandler.getLiquid("water").withAmount(100), 100, VoltageLevels.LLV)
        Mixer.addRecipe(ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(12), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815).amount(8),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 2)),
                LiquidBracketHandler.getLiquid("water").withAmount(100), 100, VoltageLevels.LLV)
        Mixer.addRecipe(ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(5), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2530)),
                LiquidBracketHandler.getLiquid("water").withAmount(100), 100, VoltageLevels.LLV)
        Mixer.addRecipe(ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(10), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815).amount(8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2530)),
                LiquidBracketHandler.getLiquid("water").withAmount(100), 100, VoltageLevels.LLV)
        Mixer.addRecipe(ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(32), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemFertilizer", 0).amount(8),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 2)),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 100, VoltageLevels.LLV)
        Mixer.addRecipe(ItemBracketHandler.getItem("Forestry:fertilizerCompound", 0).amount(30), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemFertilizer", 0).amount(8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2530)),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 100, VoltageLevels.LLV)
        Research.refreshResearchRecipe("MB_EssenceLife")
        Research.refreshResearchRecipe("MB_EssenceDeath")
        Research.refreshResearchRecipe("MB_EssenceTime")
        Research.refreshResearchRecipe("MB_EssenceArmor")
        Research.refreshResearchRecipe("MB_EssenceUnstable")
        Research.refreshResearchRecipe("MB_DimensionalSingularity")
        Research.refreshResearchRecipe("MB_Scoop")
        Research.refreshResearchRecipe("MB_ScoopVoid")
        Research.refreshResearchRecipe("MB_Grafte")
        Research.refreshResearchRecipe("MB_GrafterVoid")
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 0))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 1))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 2))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 3))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 4))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 5))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 6))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 7))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 8))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 9))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 10))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 11))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 12))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 13))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 14))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 15))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 16))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 17))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 18))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 19))
        MineTweakerAPI.oreDict["beeComb"].add(ItemBracketHandler.getItem("MagicBees:comb", 20))
    }
}