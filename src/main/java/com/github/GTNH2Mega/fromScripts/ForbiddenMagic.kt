package com.github.GTNH2Mega.fromScripts

import WayofTime.alchemicalWizardry.common.tweaker.BloodAltar
import gttweaker.mods.gregtech.machines.Centrifuge
import gttweaker.mods.gregtech.machines.Extractor
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI
import modtweaker2.mods.chisel.handlers.Groups
import modtweaker2.mods.thaumcraft.handlers.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class ForbiddenMagic : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0).amount(9),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:emerald", 0))))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ForbiddenMagic:RidingCrop", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:Crystalwell", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:UmbralBush", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:RingNutrition", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:Bloodwell", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:BlinkFocus", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:ArcaneCakeItem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:DiabolistFork", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:SkullAxe", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:BloodRapier", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:WrathCage", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:MobCrystal", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:MorphPickaxe", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:MorphAxe", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:MorphShovel", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:MorphSword", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:TaintShovel", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:TaintPickaxe", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:TaintSapling", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:TaintBlock", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:EldritchOrb", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:Primewell", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:SubCollar", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 6))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 3))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 9))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 1).amount(2), null)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0).amount(9)),
                ItemBracketHandler.getItem("minecraft:emerald", 0), 0, VoltageLevels.LEV)
        Groups.addGroup("netherstar")
        Groups.addVariation("netherstar", ItemBracketHandler.getItem("ForbiddenMagic:StarBlock", 0))
        Groups.addVariation("netherstar", ItemBracketHandler.getItem("gregtech:gt.blockgem3", 3))
        Research.clearPages("RIDINGCROP")
        Research.addPage("RIDINGCROP", "forbidden.research_page.RIDINGCROP.1")
        Arcane.addShaped("RIDINGCROP", ItemBracketHandler.getItem("ForbiddenMagic:RidingCrop", 0),
                "terra 5, ignis 5, aer 5",
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Backpack:boundLeather", 0), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("craftingToolSoftHammer"))))
        Research.addArcanePage("RIDINGCROP", ItemBracketHandler.getItem("ForbiddenMagic:RidingCrop", 0))
        Arcane.addShaped("CRYSTALWELL", ItemBracketHandler.getItem("ForbiddenMagic:Crystalwell", 0), "aqua 5, ordo 5",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                        arrayOf(OreBracketHandler.getOre("dyeBlack"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", OreDictionary.WILDCARD_VALUE),
                                OreBracketHandler.getOre("dyeBlack")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14))))
        Research.setAspects("CRYSTALWELL", "cognitio 18, vitreus 15, praecantatio 12, sensus 9, aer 6, aqua 3")
        Research.setComplexity("CRYSTALWELL", 3)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("ForbiddenMagic:Crystalwell", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2)),
                        arrayOf(OreBracketHandler.getOre("dyeBlack"),
                                ItemBracketHandler.getItem("ForbiddenMagic:Crystalwell", OreDictionary.WILDCARD_VALUE),
                                OreBracketHandler.getOre("dyeBlack")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5))), null)
        Crucible.addRecipe("BLACKFLOWER", ItemBracketHandler.getItem("ForbiddenMagic:UmbralBush", 0),
                ItemBracketHandler.getItem("minecraft:double_plant", 4), "tenebrae 16, victus 10")
        Research.setAspects("BLACKFLOWER", "herba 12, tenebrae 9, sensus 6, victus 3")
        Research.setComplexity("BLACKFLOWER", 2)
        Arcane.addShaped("RINGFOOD", ItemBracketHandler.getItem("ForbiddenMagic:RingNutrition", 0),
                "aqua 35, aer 35, ignis 35, terra 35, perditio 35",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwInfusedWater"),
                        OreBracketHandler.getOre("blockNetherStar"), OreBracketHandler.getOre("screwInfusedAir")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1),
                                ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0)),
                        arrayOf(OreBracketHandler.getOre("screwInfusedEarth"),
                                ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                                OreBracketHandler.getOre("screwInfusedFire"))))
        Research.setAspects("RINGFOOD", "fames 15, victus 12, gula 9, lucrum 6, cognitio 3")
        Research.setComplexity("RINGFOOD", 3)
        Arcane.addShaped("BLOODWELL", ItemBracketHandler.getItem("ForbiddenMagic:Bloodwell", 0),
                "aqua 25, aer 25, ignis 25, terra 25, perditio 25",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedWater"),
                        ItemBracketHandler.getItem("AWWayofTime:bucketLife", 0),
                        OreBracketHandler.getOre("screwInfusedAir")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0)),
                        arrayOf(OreBracketHandler.getOre("screwInfusedEarth"),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodOrb", 0),
                                OreBracketHandler.getOre("screwInfusedFire"))))
        Research.setAspects("BLOODWELL", "victus 15, cognitio 12, sensus 9, lucrum 6, praecantatio 3")
        Research.setComplexity("BLOODWELL", 3)
        Infusion.addRecipe("FOCUSBLINK", ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0),
                arrayOf(ItemBracketHandler.getItem("witchery:ingredient", 92),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("witchery:ingredient", 92),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 5),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7)),
                "desidia 16, infernus 16, iter 32, perditio 32, alienis 8, praecantatio 8",
                ItemBracketHandler.getItem("ForbiddenMagic:BlinkFocus", 0), 8)
        Research.setAspects("FOCUSBLINK",
                "desidia 21, iter 18, perditio 15, infernus 12, alienis 9, tenebrae 6, praecantatio 3")
        Research.setComplexity("FOCUSBLINK", 3)
        Infusion.addRecipe("ARCANECAKE", ItemBracketHandler.getItem("minecraft:cake", 0),
                arrayOf(ItemBracketHandler.getItem("ForbiddenMagic:StarBlock", 0),
                        ItemBracketHandler.getItem("minecraft:milk_bucket", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                        ItemBracketHandler.getItem("minecraft:egg", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:StarBlock", 0),
                        ItemBracketHandler.getItem("minecraft:egg", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                        ItemBracketHandler.getItem("minecraft:milk_bucket", 0)),
                "fabrico 32, fames 32, gula 16, aqua 64, limus 16, praecantatio 8",
                ItemBracketHandler.getItem("ForbiddenMagic:ArcaneCakeItem", 0), 6)
        Research.setAspects("ARCANECAKE", "praecantatio 18, gula 15, fames 12, fabrico 9, limus 6, aqua 3")
        Research.setComplexity("ARCANECAKE", 3)
        Infusion.addRecipe("FORK", ItemBracketHandler.getItem("Thaumcraft:ItemSwordThaumium", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23977),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27541),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23977),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27541),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23977),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27541),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1)),
                "telum 32, infernus 24, potentia 16 , machina 8",
                ItemBracketHandler.getItem("ForbiddenMagic:DiabolistFork", 0), 10)
        Research.setAspects("FORK", "tenebrae 18, praecantatio 15, infernus 12, machina 9, instrumentum 6, telum 3")
        Research.setComplexity("FORK", 3)
        Warp.addToResearch("FORK", 2)
        Infusion.addRecipe("SKULLAXE", ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0),
                arrayOf(ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("minecraft:skull", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("minecraft:skull", 1),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("minecraft:skull", 2),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("minecraft:skull", 4)),
                "infernus 32, ira 24, telum 24, potentia 16, mortuus 8",
                ItemBracketHandler.getItem("ForbiddenMagic:SkullAxe", 0), 10)
        Research.setAspects("SKULLAXE", "praecantatio 18, instrumentum 15, mortuus 12, ira 9, telum 6, infernus 3")
        Research.setComplexity("SKULLAXE", 3)
        Warp.addToResearch("SKULLAXE", 2)
        Infusion.addRecipe("BLOODRAPIER", ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:feather", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12),
                        ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30514),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12),
                        ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0)),
                "tenebrae 16, victus 24, telum 16, fames 32, gula 8",
                ItemBracketHandler.getItem("ForbiddenMagic:BloodRapier", 0), 10)
        Research.setAspects("BLOODRAPIER", "tenebrae 18, gula 15, victus 12, fames 9, praecantatio 6, telum 3")
        Research.setComplexity("BLOODRAPIER", 3)
        Warp.addToResearch("BLOODRAPIER", 2)
        Crucible.addRecipe("TRANSEMERALD", ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0).amount(4),
                ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0), "lucrum 4, vitreus 4")
        Research.setAspects("TRANSEMERALD", "permutatio 15, vitreus 12, lucrum 9, terra 6, praecantatio 3")
        Research.setComplexity("TRANSEMERALD", 3)
        Infusion.addRecipe("WRATHCAGE", ItemBracketHandler.getItem("EnderIO:itemBrokenSpawner", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.blockmetal7", 4),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:MobCrystal", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:MobCrystal", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:MobCrystal", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:MobCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0)),
                "ira 32, machina 32, bestia 64, metallum 48, alienis 16, exanimis 16, praecantatio 32",
                ItemBracketHandler.getItem("ForbiddenMagic:WrathCage", 0), 15)
        Crucible.addRecipe("WRATHCAGE", ItemBracketHandler.getItem("ForbiddenMagic:MobCrystal", 0),
                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                "cognitio 10, potentia 10, praecantatio 10, vitreus 10")
        Research.setAspects("WRATHCAGE",
                "ira 21, machina 18, bestia 15, metallum 12, praecantatio 9, alienis 6, exanimis 3")
        Research.setComplexity("WRATHCAGE", 3)
        Warp.addToResearch("WRATHCAGE", 5)
        Infusion.addRecipe("MORPHTOOLS", ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1)),
                "invidia 16, instrumentum 16, permutatio 32, cognitio 8, praecantatio 48, potentia 8",
                ItemBracketHandler.getItem("ForbiddenMagic:MorphPickaxe", 0), 10)
        Infusion.addRecipe("MORPHTOOLS", ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1)),
                "invidia 16, instrumentum 16, permutatio 32, cognitio 8, praecantatio 48, potentia 8",
                ItemBracketHandler.getItem("ForbiddenMagic:MorphAxe", 0), 10)
        Infusion.addRecipe("MORPHTOOLS", ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1)),
                "invidia 16, instrumentum 16, permutatio 32, cognitio 8, praecantatio 48, potentia 8",
                ItemBracketHandler.getItem("ForbiddenMagic:MorphShovel", 0), 10)
        Infusion.addRecipe("MORPHTOOLS", ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30502),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1)),
                "invidia 16, telum 16, permutatio 32, cognitio 8, praecantatio 48, potentia 8",
                ItemBracketHandler.getItem("ForbiddenMagic:MorphSword", 0), 10)
        Research.setAspects("MORPHTOOLS",
                "invidia 18, instrumentum 15, permutatio 12, cognitio 9, praecantatio 6, potentia 3")
        Research.setComplexity("MORPHTOOLS", 3)
        Warp.addToResearch("MORPHTOOLS", 5)

        //TODO Replace ("TConstruct:strangeFood", 0)
        //Infusion.addRecipe("TAINTSHOVEL", ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30514),
        //                ItemBracketHandler.getItem("TConstruct:strangeFood", 0),
        //                ItemBracketHandler.getItem("TConstruct:strangeFood", 0),
        //                ItemBracketHandler.getItem("minecraft:slime_ball", 0),
        //                ItemBracketHandler.getItem("minecraft:slime_ball", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30503),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
        //        "perfodio 16, sano 16, vitreus 32, praecantatio 32, limus 8, instrumentum 8",
        //        ItemBracketHandler.getItem("ForbiddenMagic:TaintShovel", 0), 10)

        Research.setAspects("TAINTSHOVEL",
                "vitreus 21, vitium 18, instrumentum 15, limus 12, praecantatio 9, venenum 6, permutatio 3")
        Research.setComplexity("TAINTSHOVEL", 3)
        Infusion.addRecipe("TAINTPICK", ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30514),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30509),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5)),
                "perfodio 16, instrumentum 8, vitium 16, perditio 32, praecantatio 32, mortuus 8",
                ItemBracketHandler.getItem("ForbiddenMagic:TaintPickaxe", 0), 10)
        Research.setAspects("TAINTPICK",
                "vitium 18, perditio 15, instrumentum 12, praecantatio 9, mortuus 6, potentia 3")
        Research.setComplexity("TAINTPICK", 3)
        Crucible.addRecipe("TAINTTREE", ItemBracketHandler.getItem("ForbiddenMagic:TaintSapling", 0),
                OreBracketHandler.getOre("treeSapling"), "venenum 8, vitium 20")
        Research.setAspects("TAINTTREE", "vitium 18, arbor 15, herba 12, venenum 9, mortuus 6, praecantatio 3")
        Research.setComplexity("TAINTTREE", 3)
        Arcane.addShaped("TAINTSTONE", ItemBracketHandler.getItem("ForbiddenMagic:TaintBlock", 0).amount(9),
                "ordo 9, perditio 9", arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone", 0),
                ItemBracketHandler.getItem("minecraft:stone", 0), ItemBracketHandler.getItem("minecraft:stone", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("minecraft:stone", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone", 0),
                        ItemBracketHandler.getItem("minecraft:stone", 0),
                        ItemBracketHandler.getItem("minecraft:stone", 0))))
        Research.setAspects("TAINTSTONE", "praecantatio 12, vitium 9, terra 6, ordo 3")
        Research.setComplexity("TAINTSTONE", 2)
        Infusion.addRecipe("ELDRITCHORB", ItemBracketHandler.getItem("BloodArsenal:transparent_orb", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32726),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0)),
                "alienis 48, tenebrae 32, vacuos 64, victus 64, praecantatio 16, vitreus 8",
                ItemBracketHandler.getItem("ForbiddenMagic:EldritchOrb", 0), 15)
        Research.setAspects("ELDRITCHORB", "vacuos 18, victus 15, alienis 12, vitreus 9, tenebrae 6, praecantatio 3")
        Research.setComplexity("ELDRITCHORB", 3)
        Warp.addToResearch("ELDRITCHORB", 6)
        Arcane.addShaped("PRIMEWELL", ItemBracketHandler.getItem("ForbiddenMagic:Primewell", 0),
                "aqua 100, ignis 100, aer 100, terra 100, ordo 100, perditio 100",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedAir"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                        OreBracketHandler.getOre("screwInfusedEarth")),
                        arrayOf(OreBracketHandler.getOre("screwInfusedFire"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                                OreBracketHandler.getOre("screwInfusedOrder")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwInfusedWater"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwInfusedEntropy"))))
        Research.setAspects("PRIMEWELL", "alienis 18, cognitio 15, fabrico 12, vitreus 9, volatus 6, ordo 3")
        Research.setComplexity("PRIMEWELL", 3)
        Warp.addToResearch("PRIMEWELL", 1)
        Infusion.addRecipe("SUBCOLLAR", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemAmuletVis", 1),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 4),
                        ItemBracketHandler.getItem("minecraft:lead", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 4),
                        ItemBracketHandler.getItem("minecraft:lead", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 4),
                        ItemBracketHandler.getItem("minecraft:lead", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 4),
                        ItemBracketHandler.getItem("minecraft:lead", 0)),
                "vinculum 8, infernus 8, auram 16, corpus 16, luxuria 8, praecantatio 32",
                ItemBracketHandler.getItem("ForbiddenMagic:SubCollar", 0), 10)
        Research.setAspects("SUBCOLLAR", "vinculum 18, auram 15, corpus 12, luxuria 9, praecantatio 6, cognitio 3")
        Research.setComplexity("SUBCOLLAR", 3)
        Research.setAspects("HELLFIRE", "infernus 18, ignis 15, iter 12, praecantatio 9, potentia 6, lux 3")
        Research.setComplexity("HELLFIRE", 3)
        Infusion.addRecipe("ROD_infernal", ItemBracketHandler.getItem("Thaumcraft:WandRod", 6),
                arrayOf(ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17379),
                        ItemBracketHandler.getItem("minecraft:skull", 1),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 3),
                        ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 3),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17379)),
                "superbia 16, praecantatio 16, infernus 32, ignis 48, instrumentum 8",
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 1), 7)
        Research.setAspects("ROD_infernal", "infernus 15, ignis 12, aqua 9, praecantatio 6, instrumentum 3")
        Research.setComplexity("ROD_infernal", 3)
        Warp.addToResearch("ROD_infernal", 3)
        Infusion.addRecipe("ROD_blood", ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:sanctus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crystallos", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crepitous", 0)),
                "aqua 16, praecantatio 32,victus 24, exanimis 8, alienis 8",
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 6), 9)
        Research.setAspects("ROD_blood", "victus 15, aqua 12, tenebrae 9, praecantatio 6, telum 3")
        Research.setComplexity("ROD_blood", 3)
        Warp.addToResearch("ROD_blood", 3)
        Research.setAspects("CONSUMING", "vacuos 18, praecantatio 15, perditio 12, lucrum 9, gula 6,  ignis 3")
        Research.setComplexity("CONSUMING", 3)
        Research.setAspects("EDUCATIONAL", "cognitio 15, praecantatio 12, telum 9, lucrum 6, ignis 3")
        Research.setComplexity("EDUCATIONAL", 3)
        Research.setAspects("GREEDY", "lucrum 18, praecantatio 15, telum 12, infernus 9, luxuria 6, ignis 3")
        Research.setComplexity("GREEDY", 3)
        Research.setAspects("CORRUPTING", "infernus 18, vitreus 15, permutatio 12, spiritus 9, nebrisum 6, ignis 3")
        Research.setComplexity("CORRUPTING", 3)
        Warp.addToResearch("CORRUPTING", 2)
        Research.setAspects("WRATH", "ira 18, praecantatio 15, telum 12, superbia 9, potentia 6, ignis 3")
        Research.setComplexity("WRATH", 3)
        Warp.addToResearch("WRATH", 3)
        Research.setAspects("VOIDTOUCHED", "invidia 18, alienis 15, instrumentum 12, fabrico 9, tenebrae 6, ignis 3")
        Research.setComplexity("VOIDTOUCHED", 3)
        Warp.addToResearch("VOIDTOUCHED", 2)
        Research.setAspects("IMPACT", "perfodio 18, instrumentum 15, invidia 12, perditio 9, lucrum 6, ignis 3")
        Research.setComplexity("IMPACT", 3)
        Research.setAspects("CLUSTER", "invidia 18, metallum 15, infernus 12, potentia 9, lucrum 6, ignis 3")
        Research.setComplexity("CLUSTER", 3)
        Infusion.addRecipe("ROD_tainted", ItemBracketHandler.getItem("Thaumcraft:WandRod", 1),
                arrayOf(ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12)),
                "vitium 32, praecantatio 16, perditio 48, venenum 24, alienis 8, tenebrae 32",
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 0), 12)
        Research.setAspects("ROD_tainted",
                "vitium 18, praecantatio 15, instrumentum 12, perditio 9, venenum 6, tenebrae 3")
        Research.setComplexity("ROD_tainted", 3)
        Warp.addToResearch("ROD_tainted", 3)
        Arcane.addShaped("ROD_blood_staff", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 9),
                "aqua 40, ignis 40, aer 40, terra 40, perditio 40, ordo 40",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwInfusedOrder"),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 6),
                        ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 3),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28)),
                        arrayOf(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 3),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7),
                                OreBracketHandler.getOre("screwInfusedEntropy"))))
        Research.setAspects("ROD_blood_staff", "victus 18, aqua 15, telum 12, terra 9, tenebrae 6, praecantatio 3")
        Research.setComplexity("ROD_blood_staff", 3)
        Warp.addToResearch("ROD_blood_staff", 4)
        Research.clearPages("CAP_alchemical")
        Research.addPage("CAP_alchemical", "forbidden.research_page.CAP_alchemical.1")
        Infusion.addRecipe("CAP_alchemical", ItemBracketHandler.getItem("Thaumcraft:WandCap", 1),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330)),
                "victus 16, aqua 32, praecantatio 16, permutatio 8, metallum 8",
                ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 0), 6)
        Research.addInfusionPage("CAP_alchemical", ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 0))
        Research.setAspects("CAP_alchemical", "victus 15, aqua 12, instrumentum 9, metallum 6, praecantatio 3")
        Research.setComplexity("CAP_alchemical", 3)
        Warp.addToResearch("CAP_alchemical", 2)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 3),
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 6), 4, 50000, 0, 0)
        Research.refreshResearchRecipe("RIDINGCROP")
        Research.refreshResearchRecipe("CRYSTALWELL")
        Research.refreshResearchRecipe("BLACKFLOWER")
        Research.refreshResearchRecipe("RINGFOOD")
        Research.refreshResearchRecipe("BLOODWELL")
        Research.refreshResearchRecipe("FOCUSBLINK")
        Research.refreshResearchRecipe("ARCANECAKE")
        Research.refreshResearchRecipe("TRANSEMERALD")
        Research.refreshResearchRecipe("FORK")
        Research.refreshResearchRecipe("SKULLAXE")
        Research.refreshResearchRecipe("BLOODRAPIER")
        Research.refreshResearchRecipe("WRATHCAGE")
        Research.refreshResearchRecipe("MORPHTOOLS")
        Research.refreshResearchRecipe("TAINTSHOVEL")
        Research.refreshResearchRecipe("TAINTPICK")
        Research.refreshResearchRecipe("TAINTTREE")
        Research.refreshResearchRecipe("TAINTSTONE")
        Research.refreshResearchRecipe("ELDRITCHORB")
        Research.refreshResearchRecipe("PRIMEWELL")
        Research.refreshResearchRecipe("SUBCOLLAR")
        Research.refreshResearchRecipe("ROD_infernal")
        Research.refreshResearchRecipe("ROD_blood")
        Research.refreshResearchRecipe("ROD_tainted")
        Research.refreshResearchRecipe("ROD_blood_staff")
        Research.refreshResearchRecipe("CAP_alchemical")
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ForbiddenMagic:InkFlower", 0)), null)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414).amount(2),
                ItemBracketHandler.getItem("ForbiddenMagic:InkFlower", 0), 300, VoltageLevels.LULV)
        NEI.hide(ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 1))
    }
}