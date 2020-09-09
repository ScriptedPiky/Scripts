package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.*
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class TaintedMagic1 : Runnable {
    override fun run() {
        Crucible.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:BlockShadowOre", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3))
        Crucible.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4))
        Arcane.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemMagicFunguar", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:BlockWarpwoodSapling", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemWarpedGoggles", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemFocusVisShard", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemFocusMageMace", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemCrystalDagger", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistRobe", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistRobe", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistRobe", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemBootsCultist", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistPlate", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistPlate", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistPlate", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistLeaderPlate", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistLeaderPlate", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistLeaderPlate", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemVoidsentBlood", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemSwordCrimson", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemVoidmetalGoggles", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaint", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaintedBlast", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 6))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemThaumicDisassembler", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemVoidwalkerBoots", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemVoidwalkerSash", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressHelmet", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressChestplate", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressLeggings", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressHelmet", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressChestplate", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressLeggings", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemKatana", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemFocusMeteorology", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemPrimordialEdge", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 0))
        Research.orphanResearch("SHADOWMETAL")
        Research.removeResearch("SHADOWMETAL")
        Research.addResearch("ShadowmetalGTNH", "TM", "metallum 12, praecantatio 9, tenebrae 6, potentia 3", 0, 1, 2,
                ItemBracketHandler.getItem("TaintedMagic:BlockShadowOre", 0))
        Research.addPrereq("ShadowmetalGTNH", "TAINTEDMAGIC", false)
        Research.setConcealed("ShadowmetalGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ShadowmetalGTNH", "Shadowmetal")
        MineTweakerAPI.game.setLocalization("tc.research_text.ShadowmetalGTNH", "I have seen the truth")
        Research.addPage("ShadowmetalGTNH", "tm.text.SHADOWMETAL.1")
        Crucible.addRecipe("ShadowmetalGTNH", ItemBracketHandler.getItem("TaintedMagic:BlockShadowOre", 0),
                ItemBracketHandler.getItem("minecraft:stone", 0), "tenebrae 6, praecantatio 8, metallum 8, vacuos 4")
        Research.addCruciblePage("ShadowmetalGTNH", ItemBracketHandler.getItem("TaintedMagic:BlockShadowOre", 0))
        Research.addCraftingPage("ShadowmetalGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemShadowmetalHoe", 0))
        Research.addCraftingPage("ShadowmetalGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemShadowmetalPick", 0))
        Research.addCraftingPage("ShadowmetalGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemShadowmetalAxe", 0))
        Research.addCraftingPage("ShadowmetalGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemShadowmetalSpade", 0))
        Warp.addToResearch("ShadowmetalGTNH", 2)
        Research.orphanResearch("EVILSHARDS")
        Research.removeResearch("EVILSHARDS")
        Research.addResearch("EvilshardsGTNH", "TM", "infernus 15, vitreus 12, praecantatio 9, tenebrae 6, alienis 3",
                4, 0, 3, ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4))
        Research.addPrereq("EvilshardsGTNH", "TAINTEDMAGIC", false)
        Research.setConcealed("EvilshardsGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.EvilshardsGTNH", "Unbalanced Shards")
        MineTweakerAPI.game.setLocalization("tc.research_text.EvilshardsGTNH", "You can bring... equilibrium?")
        Research.addPage("EvilshardsGTNH", "tm.text.EVILSHARDS.1")
        Crucible.addRecipe("EvilshardsGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6), "alienis 8, praecantatio 8, permutatio 8")
        Research.addCruciblePage("EvilshardsGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3))
        Crucible.addRecipe("EvilshardsGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4),
                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6), "vitium 8, praecantatio 8, permutatio 8")
        Research.addCruciblePage("EvilshardsGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4))
        Warp.addToResearch("EvilshardsGTNH", 2)
        Research.orphanResearch("MAGICFUNGUAR")
        Research.removeResearch("MAGICFUNGUAR")
        Research.addResearch("MagicFunguarGTNH", "TM", "gula 15, fames 12, lucrum 9, praecantatio 6, herba 3", 3, -2, 3,
                ItemBracketHandler.getItem("TaintedMagic:ItemMagicFunguar", 0))
        Research.addPrereq("MagicFunguarGTNH", "TAINTEDMAGIC", false)
        Research.setConcealed("MagicFunguarGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.MagicFunguarGTNH", "Magic Funguar")
        MineTweakerAPI.game.setLocalization("tc.research_text.MagicFunguarGTNH", "Is butter a carb?")
        Research.addPage("MagicFunguarGTNH", "tm.text.MAGICFUNGUAR.1")
        Arcane.addShaped("MagicFunguarGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMagicFunguar", 0).amount(4),
                "aqua 10, terra 10, ordo 10, ignis 10, aer 10, perditio 10",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:brown_mushroom", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:red_mushroom", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemShard", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 5),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", OreDictionary.WILDCARD_VALUE)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemShard", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("minecraft:blaze_powder", 0))))
        Research.addArcanePage("MagicFunguarGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMagicFunguar", 0))
        Warp.addToResearch("MagicFunguarGTNH", 1)
        Research.orphanResearch("WARPTREE")
        Research.removeResearch("WARPTREE")
        Research.addResearch("WarpTreeGTNH", "TM",
                "alienis 18, tenebrae 15, vitium 12, arbor 9, praecantatio 6, herba 3", 6, -1, 3,
                ItemBracketHandler.getItem("TaintedMagic:BlockWarpwoodSapling", 0))
        Research.addPrereq("WarpTreeGTNH", "ShadowmetalGTNH", true)
        Research.addPrereq("WarpTreeGTNH", "EvilshardsGTNH", false)
        Research.setConcealed("WarpTreeGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.WarpTreeGTNH", "Warpwood")
        MineTweakerAPI.game.setLocalization("tc.research_text.WarpTreeGTNH", "It hits back")
        Research.addPage("WarpTreeGTNH", "tm.text.WARPTREE.1")
        Infusion.addRecipe("WarpTreeGTNH", ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3)),
                "alienis 16, arbor 16, tenebrae 12, vitium 8, permutatio 8",
                ItemBracketHandler.getItem("TaintedMagic:BlockWarpwoodSapling", 0), 4)
        Research.addInfusionPage("WarpTreeGTNH", ItemBracketHandler.getItem("TaintedMagic:BlockWarpwoodSapling", 0))
        Research.addCraftingPage("WarpTreeGTNH", ItemBracketHandler.getItem("TaintedMagic:BlockWarpwoodPlanks", 0))
        Warp.addToResearch("WarpTreeGTNH", 3)
        Research.orphanResearch("WARPEDGOGGLES")
        Research.removeResearch("WARPEDGOGGLES")
        Research.addResearch("WarpedGogglesGTNH", "TM", "tutamen 15, alienis 12, tenebrae 9, sensus 6, aer 3", 2, 3, 3,
                ItemBracketHandler.getItem("TaintedMagic:ItemWarpedGoggles", 0))
        Research.addPrereq("WarpedGogglesGTNH", "ShadowmetalGTNH", false)
        Research.addPrereq("WarpedGogglesGTNH", "EvilshardsGTNH", true)
        Research.addPrereq("WarpedGogglesGTNH", "GOGGLES", false)
        Research.setConcealed("WarpedGogglesGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.WarpedGogglesGTNH", "Warped Goggles Of Revealing")
        MineTweakerAPI.game.setLocalization("tc.research_text.WarpedGogglesGTNH", "The telltale heart")
        Research.addPage("WarpedGogglesGTNH", "tm.text.WARPEDGOGGLES.1")
        Infusion.addRecipe("WarpedGogglesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemGoggles", 0),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24544),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24544),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368)),
                "alienis 40, praecantatio 32, tenebrae 24, tutamen 16, sensus 8",
                ItemBracketHandler.getItem("TaintedMagic:ItemWarpedGoggles", 0), 5)
        Research.addInfusionPage("WarpedGogglesGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemWarpedGoggles", 0))
        Warp.addToResearch("WarpedGogglesGTNH", 1)
        Research.orphanResearch("FOCUSSHARD")
        Research.removeResearch("FOCUSSHARD")
        Research.addResearch("FocusShardGTNH", "TM", "motus 18, vitreus 15, praecantatio 12, aer 9, perditio 6, ordo 3",
                3, 1, 3, ItemBracketHandler.getItem("TaintedMagic:ItemFocusVisShard", 0))
        Research.addPrereq("FocusShardGTNH", "EvilshardsGTNH", false)
        Research.addPrereq("FocusShardGTNH", "FOCUSFIRE", false)
        Research.setConcealed("FocusShardGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FocusShardGTNH", "Wand Focus: Vis Shard")
        MineTweakerAPI.game.setLocalization("tc.research_text.FocusShardGTNH", "Blip bloop")
        Research.addPage("FocusShardGTNH", "tm.text.FOCUSSHARD.1")
        Arcane.addShaped("FocusShardGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemFocusVisShard", 0),
                "ordo 50, aer 50, perditio 50",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemWispEssence", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                                ItemBracketHandler.getItem("Thaumcraft:ItemWispEssence", OreDictionary.WILDCARD_VALUE)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4))))
        Research.addArcanePage("FocusShardGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemFocusVisShard", 0))
        Warp.addToResearch("FocusShardGTNH", 1)
        Research.orphanResearch("MACEFOCUS")
        Research.removeResearch("MACEFOCUS")
        Research.addResearch("MaceFocusGTNH", "TM",
                "perditio 18, terra 15, praecantatio 12, telum 9, metallum 6, cognitio 3", 0, 4, 3,
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusMageMace", 0))
        Research.addPrereq("MaceFocusGTNH", "TAINTEDMAGIC", true)
        Research.addPrereq("MaceFocusGTNH", "ShadowmetalGTNH", false)
        Research.addPrereq("MaceFocusGTNH", "FOCUSFIRE", false)
        Research.setConcealed("MaceFocusGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.MaceFocusGTNH", "Wand Focus: Mage's Mace")
        MineTweakerAPI.game.setLocalization("tc.research_text.MaceFocusGTNH", "Yes, just hit them with your staff")
        Research.addPage("MaceFocusGTNH", "tm.text.MACEFOCUS.1")
        Infusion.addRecipe("MaceFocusGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemShadowmetalSword", 0),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27368),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27368)),
                "metallum 16, perditio 32, praecantatio 48, telum 64, cognitio 8",
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusMageMace", 0), 9)
        Research.addInfusionPage("MaceFocusGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemFocusMageMace", 0))
        Warp.addToResearch("MaceFocusGTNH", 1)
        Research.orphanResearch("SHADOWCLOTH")
        Research.removeResearch("SHADOWCLOTH")
        Research.addResearch("ShadowClothGTNH", "TM", "pannus 15, tenebrae 12, praecantatio 9, aer 6, tutamen 3", -1, 2,
                3, ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1))
        Research.addPrereq("ShadowClothGTNH", "ShadowmetalGTNH", false)
        Research.addPrereq("ShadowClothGTNH", "ENCHFABRIC", false)
        Research.setConcealed("ShadowClothGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ShadowClothGTNH", "Shadow-Imbued Cloth")
        MineTweakerAPI.game.setLocalization("tc.research_text.ShadowClothGTNH", "I wear black 'cause I'm emo")
        Research.addPage("ShadowClothGTNH", "tm.text.SHADOWCLOTH.1")
        Arcane.addShaped("ShadowClothGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                "aer 10, ignis 10, terra 10, aqua 10, ordo 10, perditio 10",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19368),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29368),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29330),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29368)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19368),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7))))
        Research.addArcanePage("ShadowClothGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1))
        Warp.addToResearch("ShadowClothGTNH", 2)
        Research.orphanResearch("CREATIONSHARD")
        Research.removeResearch("CREATIONSHARD")
        Research.addResearch("CreationShardGTNH", "TM", "aer 21, aqua 21, ignis 21, terra 21, ordo 21, perditio 21", 8,
                -5, 4, ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5))
        Research.addPrereq("CreationShardGTNH", "TMELDRITCHMAJOR", false)
        Research.addPrereq("CreationShardGTNH", "PRIMPEARL", false)
        Research.setConcealed("CreationShardGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CreationShardGTNH", "Shard of Creation")
        MineTweakerAPI.game.setLocalization("tc.research_text.CreationShardGTNH", "I am not a madman")
        Research.addPage("CreationShardGTNH", "tm.text.CREATIONSHARD.1")
        Crucible.addRecipe("CreationShardGTNH", ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 16), "alienis 16, vacuos 16, tenebrae 16")
        Research.addCruciblePage("CreationShardGTNH", ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0))
        Infusion.addRecipe("CreationShardGTNH", ItemBracketHandler.getItem("minecraft:nether_star", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                "alienis 64, vacuos 64, praecantatio 64, auram 64, tenebrae 64",
                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5).amount(2), 12)
        Research.addInfusionPage("CreationShardGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5))
        Warp.addToResearch("CreationShardGTNH", 10)
        Research.orphanResearch("ELDRITCHFOCUS")
        Research.removeResearch("ELDRITCHFOCUS")
        Research.addResearch("EldritchFocusGTNH", "TM",
                "alienis 18, perditio 15, aer 12, tenebrae 9, potentia 6, ira 3", 8, -4, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0))
        Research.addPrereq("EldritchFocusGTNH", "ShadowmetalGTNH", true)
        Research.addPrereq("EldritchFocusGTNH", "EvilshardsGTNH", true)
        Research.addPrereq("EldritchFocusGTNH", "CreationShardGTNH", false)
        Research.addPrereq("EldritchFocusGTNH", "FOCUSPORTABLEHOLE", false)
        Research.setConcealed("EldritchFocusGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.EldritchFocusGTNH", "Wand Focus: Dark Matter")
        MineTweakerAPI.game.setLocalization("tc.research_text.EldritchFocusGTNH", "And in the darkness bind them")
        Research.addPage("EldritchFocusGTNH", "tm.text.ELDRITCHFOCUS.1")
        Infusion.addRecipe("EldritchFocusGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "aer 84, alienis 72, praecantatio 64, tenebrae 64, ira 32, potentia 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0), 9)
        Research.addInfusionPage("EldritchFocusGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0))
        Research.addPage("EldritchFocusGTNH", "tm.text.ELDRITCHFOCUS.2")
        Warp.addToResearch("EldritchFocusGTNH", 4)

        //TODO Replace ("TGregworks:tGregToolPartKnifeBlade", 1622)
        //Research.orphanResearch("CRYSTALDAGGER")
        //Research.removeResearch("CRYSTALDAGGER")
        //Research.addResearch("CrystalDaggerGTNH", "TM", "telum 18, ignis 15, sano 12, fames 9, infernus 6, lucrum 3", 0,
        //        -3, 4, ItemBracketHandler.getItem("TaintedMagic:ItemCrystalDagger", 0))
        //Research.addPrereq("CrystalDaggerGTNH", "TAINTEDMAGIC", false)
        //Research.addPrereq("CrystalDaggerGTNH", "ShadowmetalGTNH", true)
        //Research.addPrereq("CrystalDaggerGTNH", "ENCHFABRIC", false)
        //Research.addPrereq("CrystalDaggerGTNH", "ESSENTIACRYSTAL", false)
        //Research.addPrereq("CrystalDaggerGTNH", "VOIDMETAL", false)
        //Research.setConcealed("CrystalDaggerGTNH", true)
        //MineTweakerAPI.game.setLocalization("tc.research_name.CrystalDaggerGTNH", "Crystal Blood")
        //MineTweakerAPI.game.setLocalization("tc.research_text.CrystalDaggerGTNH", "Drip, drip, drop...")
        //Research.addPage("CrystalDaggerGTNH", "tm.text.CRYSTALDAGGER.1")
        //val s = "CrystalDaggerGTNH"
        //val item = ItemBracketHandler.getItem("TaintedMagic:ItemCrystalDagger", 0)
        //val s2 = "terra 100, ignis 100, perditio 100, ordo 50, aer 50"
        //val array: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        //val n = 0
        //val array2 = arrayOf<IIngredient?>(OreBracketHandler.getOre("screwThaumium"),
        //        OreBracketHandler.getOre("craftingToolWrench"), null)
        //val n2 = 2
        //val item2 = ItemBracketHandler.getItem("TGregworks:tGregToolPartKnifeBlade", 1622)
        //val hashMap = HashMap<String, IData>()
        //hashMap["material"] = ExpandString.asData("Shadow")
        //array2[n2] = item2.withTag(ExpandAnyDict.asData(hashMap))
        //array[n] = array2
        //array[1] = arrayOf(null, ItemBracketHandler.getItem("Thaumcraft:blockTube", 7), null)
        //array[2] = arrayOf(ItemBracketHandler.getItem("Forestry:oakStick", 0),
        //        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwThaumium"))
        //Arcane.addShaped(s, item, s2, array)
        //Research.addArcanePage("CrystalDaggerGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemCrystalDagger", 0))
        //Warp.addToResearch("CrystalDaggerGTNH", 3)

        Research.orphanResearch("CRIMSONROBES")
        Research.removeResearch("CRIMSONROBES")
        Research.addResearch("CrimsonRobesGTNH", "TM",
                "pannus 18, permutatio 15, tutamen 12, alienis 9, tenebrae 6, praecantatio 3", -2, -5, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2))
        Research.addPrereq("CrimsonRobesGTNH", "TAINTEDMAGIC", true)
        Research.addPrereq("CrimsonRobesGTNH", "CrystalDaggerGTNH", false)
        Research.addPrereq("CrimsonRobesGTNH", "ShadowClothGTNH", true)
        Research.addPrereq("CrimsonRobesGTNH", "VOIDMETAL", false)
        Research.setConcealed("CrimsonRobesGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CrimsonRobesGTNH", "Crimson Seamstry")
        MineTweakerAPI.game.setLocalization("tc.research_text.CrimsonRobesGTNH", "This will not wash out")
        Research.addPage("CrimsonRobesGTNH", "tc.research_page.CrimsonRobesGTNH")
        MineTweakerAPI.game.setLocalization("tc.research_page.CrimsonRobesGTNH",
                "After studying Crystal Blood for quite some time, you realized that the Crimson Cult's Robes posses very similar properties.<BR>By staining Shadow-Imbued Cloth with Crystal Blood, you were able to perfectly replicate the material that the Crimson Cult uses for their attire.<BR>Using Crimson-stained Cloth (see right) you were able to make all of the robe pieces. Their recipes are inscribed on the following pages.")
        Arcane.addShaped("CrimsonRobesGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                "terra 25, ignis 25, perditio 25, aqua 25, ordo 25, aer 25",
                arrayOf(arrayOf(OreBracketHandler.getOre("foilVoid"),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                        OreBracketHandler.getOre("foilVoid")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7)),
                        arrayOf(OreBracketHandler.getOre("foilVoid"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                                OreBracketHandler.getOre("foilVoid"))))
        Research.addArcanePage("CrimsonRobesGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2))
        Warp.addToResearch("CrimsonRobesGTNH", 2)
        Arcane.addShaped("CrimsonRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistRobe", 0),
                "terra 30, ignis 30, perditio 30, aqua 30, ordo 30, aer 30",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                OreBracketHandler.getOre("plateVoid"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateVoid"), null)))
        Research.addArcanePage("CrimsonRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistRobe", 0))
        Arcane.addShaped("CrimsonRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistRobe", 0),
                "terra 30, ignis 30, perditio 30, aqua 30, ordo 30, aer 30",
                arrayOf(arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        OreBracketHandler.getOre("plateVoid"),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                OreBracketHandler.getOre("plateVoid"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2))))
        Research.addArcanePage("CrimsonRobesGTNH",
                ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistRobe", 0))
        Arcane.addShaped("CrimsonRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistRobe", 0),
                "terra 30, ignis 30, perditio 30, aqua 30, ordo 30, aer 30",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                OreBracketHandler.getOre("plateVoid"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                OreBracketHandler.getOre("plateVoid"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2))))
        Research.addArcanePage("CrimsonRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistRobe", 0))
        Arcane.addShaped("CrimsonRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemBootsCultist", 0),
                "terra 30, ignis 30, perditio 30, aqua 30, ordo 30, aer 30", arrayOf(arrayOfNulls(3),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        OreBracketHandler.getOre("plateVoid"),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        OreBracketHandler.getOre("plateVoid"),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2))))
        Research.addArcanePage("CrimsonRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemBootsCultist", 0))
        Research.addPrereq("BLOODLUSTUPGRADE", "CrystalDaggerGTNH", false)
        Research.setConcealed("BLOODLUSTUPGRADE", true)
        Research.setAspects("BLOODLUSTUPGRADE", "aqua 15, sano 12, telum 9, praecantatio 6, ira 3")
        Research.setComplexity("BLOODLUSTUPGRADE", 3)
        Warp.addToResearch("BLOODLUSTUPGRADE", 2)
        Research.orphanResearch("KNIGHTROBES")
        Research.removeResearch("KNIGHTROBES")
        Research.addResearch("KnightRobesGTNH", "TM",
                "pannus 21, permutatio 18, tutamen 15, alienis 12, tenebrae 9, praecantatio 6, metallum 3", -4, -4, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8))
        Research.addPrereq("KnightRobesGTNH", "ELDRITCHMINOR", false)
        Research.addPrereq("KnightRobesGTNH", "CrimsonRobesGTNH", false)
        Research.setConcealed("KnightRobesGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.KnightRobesGTNH", "Crimson Forgery")
        MineTweakerAPI.game.setLocalization("tc.research_text.KnightRobesGTNH", "Dance to the song of ringing steel")
        Research.addPage("KnightRobesGTNH", "tm.text.KNIGHTROBES.1")
        Infusion.addRecipe("KnightRobesGTNH", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7)),
                "metallum 16, praecantatio 16, tenebrae 16, alienis 16, tutamen 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8), 6)
        Research.addInfusionPage("KnightRobesGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8))
        Warp.addToResearch("KnightRobesGTNH", 4)
        Arcane.addShaped("KnightRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistPlate", 0),
                "terra 50, ignis 50, perditio 50, aqua 50, ordo 50, aer 50",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8)),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                                OreBracketHandler.getOre("plateShadow"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateShadow"), null)))
        Research.addArcanePage("KnightRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistPlate", 0))
        Arcane.addShaped("KnightRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistPlate", 0),
                "terra 50, ignis 50, perditio 50, aqua 50, ordo 50, aer 50",
                arrayOf(arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        OreBracketHandler.getOre("plateShadow"),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8))))
        Research.addArcanePage("KnightRobesGTNH",
                ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistPlate", 0))
        Arcane.addShaped("KnightRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistPlate", 0),
                "terra 50, ignis 50, perditio 50, aqua 50, ordo 50, aer 50",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8)),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                                OreBracketHandler.getOre("plateShadow"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8)),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                OreBracketHandler.getOre("plateShadow"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2))))
        Research.addArcanePage("KnightRobesGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistPlate", 0))
        Research.orphanResearch("PRAETORARMOR")
        Research.removeResearch("PRAETORARMOR")
        Research.addResearch("PraetorarmorGTNH", "TM",
                "pannus 24, permutatio 21, tutamen 18, alienis 15, tenebrae 12, praecantatio 9, metallum 6, potentia 3",
                -6, -4, 4, ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistLeaderPlate", 0))
        Research.addPrereq("PraetorarmorGTNH", "KnightRobesGTNH", false)
        Research.setConcealed("PraetorarmorGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.PraetorarmorGTNH", "Advanced Crimson Forgery")
        MineTweakerAPI.game.setLocalization("tc.research_text.PraetorarmorGTNH", "And now, the final curtain!")
        Research.addPage("PraetorarmorGTNH", "tm.text.PRAETORARMOR.1")
        Infusion.addRecipe("PraetorarmorGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistPlate", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368)),
                "metallum 64, praecantatio 64, tenebrae 64, alienis 64, tutamen 64",
                ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistLeaderPlate", 0), 6)
        Research.addInfusionPage("PraetorarmorGTNH",
                ItemBracketHandler.getItem("Thaumcraft:ItemHelmetCultistLeaderPlate", 0))
        Warp.addToResearch("PraetorarmorGTNH", 5)
        Infusion.addRecipe("PraetorarmorGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistPlate", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368)),
                "metallum 64, praecantatio 64, tenebrae 64, alienis 64, tutamen 64",
                ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistLeaderPlate", 0), 6)
        Research.addInfusionPage("PraetorarmorGTNH",
                ItemBracketHandler.getItem("Thaumcraft:ItemChestplateCultistLeaderPlate", 0))
        Infusion.addRecipe("PraetorarmorGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistPlate", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28368)),
                "metallum 64, praecantatio 64, tenebrae 64, alienis 64, tutamen 64",
                ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistLeaderPlate", 0), 6)
        Research.addInfusionPage("PraetorarmorGTNH",
                ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsCultistLeaderPlate", 0))
        Research.orphanResearch("VOIDSENTBLOOD")
        Research.removeResearch("VOIDSENTBLOOD")
        Research.addResearch("VoidsentGTNH", "TM",
                "tenebrae 21, tutamen 18, vacuos 15, tenebrae 12, auram 9, praecantatio 6, alienis 3", -7, -5, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidsentBlood", 0))
        Research.addPrereq("VoidsentGTNH", "PraetorarmorGTNH", false)
        Research.setConcealed("VoidsentGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.VoidsentGTNH", "Voidsent Blood")
        MineTweakerAPI.game.setLocalization("tc.research_text.VoidsentGTNH", "Lady Amandine's favourite")
        Research.addPage("VoidsentGTNH", "tm.text.VOIDSENTBLOOD.1")
        Crucible.addRecipe("VoidsentGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemVoidsentBlood", 0),
                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                "auram 12, tenebrae 12, tutamen 12, vacuos 16, alienis 16")
        Research.addCruciblePage("VoidsentGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemVoidsentBlood", 0))
        Warp.addToResearch("VoidsentGTNH", 2)
        Research.orphanResearch("CRIMSONBLADE")
        Research.removeResearch("CRIMSONBLADE")
        Research.addResearch("CrimsonBladeGTNH", "TM",
                "perditio 18, telum 15, vacuos 12, tenebrae 9, metallum 6, potentia 3", -7, -3, 4,
                ItemBracketHandler.getItem("Thaumcraft:ItemSwordCrimson", 0))
        Research.addPrereq("CrimsonBladeGTNH", "PraetorarmorGTNH", false)
        Research.setConcealed("CrimsonBladeGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CrimsonBladeGTNH", "Crimson Blade")
        MineTweakerAPI.game.setLocalization("tc.research_text.CrimsonBladeGTNH", "This shall be mercy")
        Research.addPage("CrimsonBladeGTNH", "tm.text.CRIMSONBLADE.1")
        Infusion.addRecipe("CrimsonBladeGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemCrystalDagger", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 8),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 7)),
                "alienis 16, metallum 24, perditio 32, telum 64, vacuos 48, tenebrae 32",
                ItemBracketHandler.getItem("Thaumcraft:ItemSwordCrimson", 0), 9)
        Research.addInfusionPage("CrimsonBladeGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemSwordCrimson", 0))
        Warp.addToResearch("CrimsonBladeGTNH", 5)
        Research.orphanResearch("VOIDGOGGLES")
        Research.removeResearch("VOIDGOGGLES")
        Research.addResearch("VoidgogglesGTNH", "TM",
                "sensus 21, vacuos 18, praecantatio 15, tenebrae 12, vitreus 9, alienis 6, metallum 3", 3, 5, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidmetalGoggles", 0))
        Research.addPrereq("VoidgogglesGTNH", "WarpedGogglesGTNH", false)
        Research.addPrereq("VoidgogglesGTNH", "VOIDMETAL", false)
        Research.setConcealed("VoidgogglesGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.VoidgogglesGTNH", "Voidmetal Goggles of Revealing")
        MineTweakerAPI.game.setLocalization("tc.research_text.VoidgogglesGTNH", "Who needs 20/20 vision anyway?")
        Research.addPage("VoidgogglesGTNH", "tm.text.VOIDGOGGLES.1")
        Infusion.addRecipe("VoidgogglesGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemWarpedGoggles", 0),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "sensus 32, tenebrae 32, tutamen 48, vacuos 64, vitreus 24, alienis 8, metallum 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidmetalGoggles", 0), 12)
        Research.addInfusionPage("VoidgogglesGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemVoidmetalGoggles", 0))
        Warp.addToResearch("VoidgogglesGTNH", 5)
        Research.orphanResearch("TAINTFOCUS")
        Research.removeResearch("TAINTFOCUS")
        Research.addResearch("TaintFocusGTNH", "TM", "vitium 18, aqua 15, limus 12, aer 9, praecantatio 6, potentia 3",
                5, 2, 4, ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaint", 0))
        Research.addPrereq("TaintFocusGTNH", "EvilshardsGTNH", false)
        Research.addPrereq("TaintFocusGTNH", "BOTTLETAINT", false)
        Research.addPrereq("TaintFocusGTNH", "TAINTSHOVEL", false)
        Research.setConcealed("TaintFocusGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.TaintFocusGTNH", "Wand Focus: Tainted Storm")
        MineTweakerAPI.game.setLocalization("tc.research_text.TaintFocusGTNH", "Sickness must be purged!")
        Research.addPage("TaintFocusGTNH", "tm.text.TAINTFOCUS.1")
        Infusion.addRecipe("TaintFocusGTNH", ItemBracketHandler.getItem("Thaumcraft:FocusPech", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemBottleTaint", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 12),
                        ItemBracketHandler.getItem("Thaumcraft:ItemBottleTaint", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11)),
                "aqua 72, limus 72, praecantatio 72, vitium 72, aer 64, potentia 32",
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaint", 0), 9)
        Research.addInfusionPage("TaintFocusGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaint", 0))
        Warp.addToResearch("TaintFocusGTNH", 4)
        Research.orphanResearch("FOCUSTAINTEDBLAST")
        Research.removeResearch("FOCUSTAINTEDBLAST")
        Research.addResearch("FocusTaintedBlastGTNH", "TM",
                "praecantatio 21, vitium 18, motus 15, aer 12, perditio 9, telum 6, motus 3", 5, 3, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaintedBlast", 0))
        Research.addPrereq("FocusTaintedBlastGTNH", "TaintFocusGTNH", false)
        Research.addPrereq("FocusTaintedBlastGTNH", "FOCUSFIRE", false)
        Research.addPrereq("FocusTaintedBlastGTNH", "ELDRITCHMINOR", false)
        Research.addPrereq("FocusTaintedBlastGTNH", "FOCUSSHOCK", false)
        Research.setConcealed("FocusTaintedBlastGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FocusTaintedBlastGTNH", "Wand Focus: Tainted Shockwave")
        MineTweakerAPI.game.setLocalization("tc.research_text.FocusTaintedBlastGTNH", "Almighty push")
        Research.addPage("FocusTaintedBlastGTNH", "tm.text.FOCUSTAINTEDBLAST.1")
        Infusion.addRecipe("FocusTaintedBlastGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaint", 0),
                arrayOf(ItemBracketHandler.getItem("IC2:blockITNT", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemBottleTaint", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("IC2:blockITNT", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:ItemBottleTaint", 0),
                        ItemBracketHandler.getItem("IC2:blockITNT", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemBottleTaint", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("IC2:blockITNT", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("Thaumcraft:ItemBottleTaint", 0)),
                "motus 64, praecantatio 64, telum 72, vitium 84, cognitio 32, aer 48, praecantatio 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaintedBlast", 0), 12)
        Research.addInfusionPage("FocusTaintedBlastGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTaintedBlast", 0))
        Warp.addToResearch("FocusTaintedBlastGTNH", 6)
        Research.orphanResearch("THAUMICDISASSEMBLER")
        Research.removeResearch("THAUMICDISASSEMBLER")
        Research.addResearch("ThaumicdisassemblerGTNH", "TM",
                "telum 18, metallum 15, instrumentum 12, praecantatio 9, alienis 6, vitium 3", 5, -6, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemThaumicDisassembler", 0))
        Research.addPrereq("ThaumicdisassemblerGTNH", "TMELDRITCHMAJOR", false)
        Research.addPrereq("ThaumicdisassemblerGTNH", "VOIDMETAL", false)
        Research.setConcealed("ThaumicdisassemblerGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ThaumicdisassemblerGTNH", "Thaumic Disassembler")
        MineTweakerAPI.game.setLocalization("tc.research_text.ThaumicdisassemblerGTNH", "Wait a minute...")
        Research.addPage("ThaumicdisassemblerGTNH", "tm.text.THAUMICDISASSEMBLER.1")
        Arcane.addShaped("ThaumicdisassemblerGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 6),
                "ordo 75, perditio 75, terra 50", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateVoid"),
                OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateVoid")),
                arrayOf(OreBracketHandler.getOre("plateShadow"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        OreBracketHandler.getOre("plateShadow")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateVoid"), OreBracketHandler.getOre("plateThaumium"),
                        OreBracketHandler.getOre("plateVoid"))))
        Research.addArcanePage("ThaumicdisassemblerGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 6))
        Warp.addToResearch("ThaumicdisassemblerGTNH", 4)
        Research.addPage("ThaumicdisassemblerGTNH", "tm.text.THAUMICDISASSEMBLER.2")
        Infusion.addRecipe("ThaumicdisassemblerGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 6),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemPickVoid", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShovelVoid", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeVoid", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368)),
                "instrumentum 32, metallum 32, telum 24, vacuos 24, praecantatio 16, potentia 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemThaumicDisassembler", 0), 10)
        Research.addInfusionPage("ThaumicdisassemblerGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemThaumicDisassembler", 0))
        Research.orphanResearch("VOIDWALKERBOOTS")
        Research.removeResearch("VOIDWALKERBOOTS")
        Research.addResearch("VoidWalkerBootsGTNH", "TM",
                "tenebrae 21, tutamen 18, alienis 15, praecantatio 12, iter 9, aer 6, volatus 3", 4, -8, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidwalkerBoots", 0))
        Research.addPrereq("VoidWalkerBootsGTNH", "TMELDRITCHMAJOR", false)
        Research.addPrereq("VoidWalkerBootsGTNH", "BOOTSTRAVELLER", false)
        Research.addPrereq("VoidWalkerBootsGTNH", "TAINTEDMAGIC", true)
        Research.addPrereq("VoidWalkerBootsGTNH", "ShadowmetalGTNH", true)
        Research.setConcealed("VoidWalkerBootsGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.VoidWalkerBootsGTNH", "Boots of the Voidwalker")
        MineTweakerAPI.game.setLocalization("tc.research_text.VoidWalkerBootsGTNH", "Otherworldly footwear")
        Research.addPage("VoidWalkerBootsGTNH", "tm.text.VOIDWALKERBOOTS.1")
        Infusion.addRecipe("VoidWalkerBootsGTNH", ItemBracketHandler.getItem("Thaumcraft:BootsTraveller", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18599),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "alienis 64, iter 84, tenebrae 72, tutamen 64, vacuos 64, praecantatio 32",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidwalkerBoots", 0), 12)
        Research.addInfusionPage("VoidWalkerBootsGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidwalkerBoots", 0))
        Warp.addToResearch("VoidWalkerBootsGTNH", 4)
        Research.orphanResearch("VOIDSASH")
        Research.removeResearch("VOIDSASH")
        Research.addResearch("VoidSashGTNH", "TM",
                "metallum 24, vacuos 21, tutamen 18, praecantatio 15, alienis 12, tenebrae 9, iter 6, aer 3", 3, -8, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidwalkerSash", 0))
        Research.addPrereq("VoidSashGTNH", "VoidWalkerBootsGTNH", false)
        Research.addPrereq("VoidSashGTNH", "RUNICARMOR", false)
        Research.addPrereq("VoidSashGTNH", "TAINTEDMAGIC", true)
        Research.addPrereq("VoidSashGTNH", "ShadowmetalGTNH", true)
        Research.addPrereq("VoidSashGTNH", "VOIDMETAL", false)
        Research.setConcealed("VoidSashGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.VoidSashGTNH", "Voidwalker's Sash of Runic Shielding")
        MineTweakerAPI.game.setLocalization("tc.research_text.VoidSashGTNH", "Gotta go fast")
        Research.addPage("VoidSashGTNH", "tm.text.VOIDSASH.1")
        Infusion.addRecipe("VoidSashGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemGirdleRunic", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30508),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "iter 48, praecantatio 64, tutamen 84, vacuos 72, volatus 32, alienis 24, aer 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidwalkerSash", 0), 12)
        Research.addInfusionPage("VoidSashGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemVoidwalkerSash", 0))
        Warp.addToResearch("VoidSashGTNH", 4)
        Research.orphanResearch("VOIDFORTRESS")
        Research.removeResearch("VOIDFORTRESS")
        Research.addResearch("VoidFortressGTNH", "TM",
                "tutamen 21, vacuos 18, alienis 15, tenebrae 12, victus 9, cognitio 6, terra 3", 7, -8, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressHelmet", 0))
        Research.addPrereq("VoidFortressGTNH", "TMELDRITCHMAJOR", false)
        Research.addPrereq("VoidFortressGTNH", "VOIDMETAL", false)
        Research.addPrereq("VoidFortressGTNH", "ARMORFORTRESS", false)
        Research.addPrereq("VoidFortressGTNH", "ShadowmetalGTNH", true)
        Research.setConcealed("VoidFortressGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.VoidFortressGTNH", "Void Fortress Armor")
        MineTweakerAPI.game.setLocalization("tc.research_text.VoidFortressGTNH", "Nothing is getting out")
        Research.addPage("VoidFortressGTNH", "tm.text.VOIDFORTRESS.1")
        Infusion.addRecipe("VoidFortressGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemHelmetVoid", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 19599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351)),
                "alienis 32, metallum 48, praecantatio 48, tutamen 48, vacuos 32, tenebrae 16, potentia 16, victus 32",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressHelmet", 0), 12)
        Research.addInfusionPage("VoidFortressGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressHelmet", 0))
        Warp.addToResearch("VoidFortressGTNH", 5)
        Infusion.addRecipe("VoidFortressGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemChestplateVoid", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 19599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 19599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "alienis 32, metallum 64, praecantatio 64, tutamen 64, vacuos 32, tenebrae 16, potentia 16, cognitio 32",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressChestplate", 0), 12)
        Research.addInfusionPage("VoidFortressGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressChestplate", 0))
        Infusion.addRecipe("VoidFortressGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsVoid", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 19599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351)),
                "alienis 32, metallum 32, praecantatio 32, tutamen 32, vacuos 32, tenebrae 16, potentia 16, terra 32",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressLeggings", 0), 12)
        Research.addInfusionPage("VoidFortressGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressLeggings", 0))
        Research.orphanResearch("SHADOWFORTRESSARMOR")
        Research.removeResearch("SHADOWFORTRESSARMOR")
        Research.addResearch("ShadowFortressArmorGTNH", "TM",
                "tutamen 24, vacuos 21, alienis 18, tenebrae 15, victus 12, cognitio 9, terra 6, superbia 3", 8, -9, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressHelmet", 0))
        Research.addPrereq("ShadowFortressArmorGTNH", "VoidFortressGTNH", false)
        Research.addPrereq("ShadowFortressArmorGTNH", "ShadowmetalGTNH", true)
        Research.setConcealed("ShadowFortressArmorGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ShadowFortressArmorGTNH", "Shadow Fortress Armor")
        MineTweakerAPI.game.setLocalization("tc.research_text.ShadowFortressArmorGTNH",
                "If you wear robes, you are weak")
        Research.addPage("ShadowFortressArmorGTNH", "tm.text.SHADOWFORTRESSARMOR.1")
        Infusion.addRecipe("ShadowFortressArmorGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressHelmet", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17323),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17323)),
                "alienis 48, metallum 64, praecantatio 64, tutamen 64, vacuos 48, tenebrae 32, potentia 32, victus 48",
                ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressHelmet", 0), 16)
        Research.addInfusionPage("ShadowFortressArmorGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressHelmet", 0))
        Warp.addToResearch("ShadowFortressArmorGTNH", 10)
        Infusion.addRecipe("ShadowFortressArmorGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressChestplate", 0),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17323),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0)),
                "alienis 48, metallum 84, praecantatio 84, tutamen 84, vacuos 48, tenebrae 32, potentia 32, cognitio 48",
                ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressChestplate", 0), 16)
        Research.addInfusionPage("ShadowFortressArmorGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressChestplate", 0))
        Infusion.addRecipe("ShadowFortressArmorGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemVoidFortressLeggings", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17323),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22599),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("TaintedMagic:BlockShadowmetal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17323)),
                "alienis 48, metallum 48, praecantatio 48, tutamen 48, vacuos 32, tenebrae 32, potentia 32, terra 48",
                ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressLeggings", 0), 16)
        Research.addInfusionPage("ShadowFortressArmorGTNH",
                ItemBracketHandler.getItem("TaintedMagic:ItemShadowFortressLeggings", 0))
        Research.orphanResearch("THAUMIUMKATANA")
        Research.removeResearch("THAUMIUMKATANA")
        Research.addResearch("ThaumiumKatanaGTNH", "TM",
                "metallum 18, telum 15, praecantatio 12, motus 9, potentia 6, mortuus 3", 7, 1, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 0))
        Research.addPrereq("ThaumiumKatanaGTNH", "ARMORFORTRESS", false)
        Research.addPrereq("ThaumiumKatanaGTNH", "ShadowmetalGTNH", true)
        Research.setConcealed("ThaumiumKatanaGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ThaumiumKatanaGTNH", "Thaumium Fortress Blade")
        MineTweakerAPI.game.setLocalization("tc.research_text.ThaumiumKatanaGTNH", "Nothing will survive")
        Research.addPage("ThaumiumKatanaGTNH", "tm.text.THAUMIUMKATANA.1")
        Infusion.addRecipe("ThaumiumKatanaGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemSwordThaumium", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330)),
                "metallum 64, praecantatio 32, telum 48, mortuus 24, potentia 16, motus 8",
                ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 0), 6)
        Research.addInfusionPage("ThaumiumKatanaGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 0))
        Warp.addToResearch("ThaumiumKatanaGTNH", 3)
        Research.orphanResearch("VOIDMETALKATANA")
        Research.removeResearch("VOIDMETALKATANA")
        Research.addResearch("VoidMetalKatanaGTNH", "TM",
                "metallum 21, telum 18, vacuos 15, praecantatio 12, motus 9, potentia 6, mortuus 3", 7, 0, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 1))
        Research.addPrereq("VoidMetalKatanaGTNH", "ThaumiumKatanaGTNH", false)
        Research.addPrereq("VoidMetalKatanaGTNH", "VOIDMETAL", true)
        Research.setConcealed("VoidMetalKatanaGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.VoidMetalKatanaGTNH", "Voidmetal Fortress Blade")
        MineTweakerAPI.game.setLocalization("tc.research_text.VoidMetalKatanaGTNH", "Void samurai")
        Research.addPage("VoidMetalKatanaGTNH", "tm.text.VOIDMETALKATANA.1")
        Infusion.addRecipe("VoidMetalKatanaGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17386),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17386),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "alienis 48, metallum 72, praecantatio 48, telum 64, mortuus 32, potentia 24, motus 16, vacuos 32",
                ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 1), 9)
        Research.addInfusionPage("VoidMetalKatanaGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 1))
        Warp.addToResearch("VoidMetalKatanaGTNH", 6)
        Research.orphanResearch("SHADOWMETALKATANA")
        Research.removeResearch("SHADOWMETALKATANA")
        Research.addResearch("ShadowMetalKatanaGTNH", "TM",
                "tenebrae 24, metallum 21, telum 18, vacuos 15, praecantatio 12, motus 9, potentia 6, mortuus 3", 8, -1,
                4, ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 2))
        Research.addPrereq("ShadowMetalKatanaGTNH", "VoidMetalKatanaGTNH", false)
        Research.addPrereq("ShadowMetalKatanaGTNH", "ShadowmetalGTNH", true)
        Research.setConcealed("ShadowMetalKatanaGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ShadowMetalKatanaGTNH", "Shadowmetal Fortress Blade")
        MineTweakerAPI.game.setLocalization("tc.research_text.ShadowMetalKatanaGTNH", "Chakra blades")
        Research.addPage("ShadowMetalKatanaGTNH", "tm.text.SHADOWMETALKATANA.1")
        Infusion.addRecipe("ShadowMetalKatanaGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemShadowmetalSword", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17323),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17323),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368)),
                "alienis 64, metallum 84, praecantatio 64, telum 72, mortuus 48, potentia 32, motus 24, vacuos 48, tenebrae 48",
                ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 2), 12)
        Research.addInfusionPage("ShadowMetalKatanaGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemKatana", 2))
        Warp.addToResearch("ShadowMetalKatanaGTNH", 9)
        Research.addPrereq("INSCRIPTIONFIRE", "ThaumiumKatanaGTNH", false)
        Research.setConcealed("INSCRIPTIONFIRE", true)
        Research.setAspects("INSCRIPTIONFIRE", "ignis 15, metallum 12, lux 9, praecantatio 6, potentia 3")
        Research.setComplexity("INSCRIPTIONFIRE", 3)
        Warp.addToResearch("INSCRIPTIONFIRE", 2)
        Research.addPrereq("INSCRIPTIONTAINT", "ThaumiumKatanaGTNH", false)
        Research.setConcealed("INSCRIPTIONTAINT", true)
        Research.setAspects("INSCRIPTIONTAINT", "vitium 15, metallum 12, corpus 9, praecantatio 6, potentia 3")
        Research.setComplexity("INSCRIPTIONTAINT", 3)
        Warp.addToResearch("INSCRIPTIONTAINT", 3)
        Research.addPrereq("INSCRIPTIONUNDEAD", "ThaumiumKatanaGTNH", false)
        Research.setConcealed("INSCRIPTIONUNDEAD", true)
        Research.setAspects("INSCRIPTIONUNDEAD", "sano 15, metallum 12, exanimis 9, praecantatio 6, potentia 3")
        Research.setComplexity("INSCRIPTIONUNDEAD", 3)
        Warp.addToResearch("INSCRIPTIONUNDEAD", 4)
        Research.orphanResearch("ROD_warpwood")
        Research.removeResearch("ROD_warpwood")
        Research.addResearch("ROD_warpwood", "TM",
                "arbor 18, tenebrae 15, alienis 12, praecantatio 9, instrumentum 6, terra 3", 8, -2, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 0))
        Research.addPrereq("ROD_warpwood", "ShadowmetalGTNH", true)
        Research.addPrereq("ROD_warpwood", "WarpTreeGTNH", false)
        Research.addPrereq("ROD_warpwood", "VOIDMETAL", false)
        Research.addPrereq("ROD_warpwood", "VOIDMETAL", false)
        Research.addPrereq("ROD_warpwood", "PRIMPEARL", false)
        Research.addPrereq("ROD_warpwood", "ROD_primal_staff", false)
        Research.setConcealed("ROD_warpwood", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ROD_warpwood", "Warpwood Wand Rod")
        MineTweakerAPI.game.setLocalization("tc.research_text.ROD_warpwood", "The wand chooses the wizard...")
        Research.addPage("ROD_warpwood", "tm.text.ROD_warpwood.1")
        Infusion.addRecipe("ROD_warpwood", ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:BlockWarpwoodLog", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368)),
                "alienis 64, arbor 64, praecantatio 64, tenebrae 48, instrumentum 32, terra 24",
                ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 0), 9)
        Research.addInfusionPage("ROD_warpwood", ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 0))
        Warp.addToResearch("ROD_warpwood", 3)
        Research.addPage("ROD_warpwood", "tm.text.ROD_warpwood.2")
        Research.orphanResearch("ROD_warpwood_staff")
        Research.removeResearch("ROD_warpwood_staff")
        Research.addResearch("ROD_warpwood_staff", "TM",
                "arbor 18, tenebrae 15, alienis 12, praecantatio 9, potentia 6, instrumentum 3", 9, -2, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 1))
        Research.addPrereq("ROD_warpwood_staff", "ROD_warpwood", false)
        Research.setConcealed("ROD_warpwood_staff", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ROD_warpwood_staff", "Warpwood Staff Core")
        MineTweakerAPI.game.setLocalization("tc.research_text.ROD_warpwood_staff", "It's not quite clear why...")
        Research.addPage("ROD_warpwood_staff", "tm.text.ROD_warpwood_staff.1")
        Arcane.addShaped("ROD_warpwood_staff", ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 1),
                "aqua 150, terra 150, ignis 150, aer 150, ordo 150, perditio 150",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwShadow"),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                                ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 0),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3)),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 0),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 4),
                                OreBracketHandler.getOre("screwShadow"))))
        Research.addArcanePage("ROD_warpwood_staff", ItemBracketHandler.getItem("TaintedMagic:ItemWandRod", 1))
        Warp.addToResearch("ROD_warpwood_staff", 5)
        Research.orphanResearch("FOCUSTIME")
        Research.removeResearch("FOCUSTIME")
        Research.addResearch("FocusTimeGTNH", "TM",
                "tempus 27, praecantatio 24, aqua 21, ignis 18, terra 15, ordo 12, perditio 9, aer 6, permutatio 3", 11,
                -8, 4, ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0))
        Research.addPrereq("FocusTimeGTNH", "CreationShardGTNH", false)
        Research.addPrereq("FocusTimeGTNH", "FOCUSPORTABLEHOLE", false)
        Research.addPrereq("FocusTimeGTNH", "FOCUSFIRE", false)
        Research.setConcealed("FocusTimeGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FocusTimeGTNH", "Wand Focus: Time")
        MineTweakerAPI.game.setLocalization("tc.research_text.FocusTimeGTNH", "Mou ikkai")
        Research.addPage("FocusTimeGTNH", "tm.text.FOCUSTIME.1")
        Infusion.addRecipe("FocusTimeGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("minecraft:clock", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("minecraft:clock", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                "alienis 84, lux 72, tenebrae 64, vacuos 48, tempus 24, praecantatio 32, permutatio 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0), 16)
        Research.addInfusionPage("FocusTimeGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0))
        Warp.addToResearch("FocusTimeGTNH", 10)
        Research.orphanResearch("FOCUSWEATHER")
        Research.removeResearch("FOCUSWEATHER")
        Research.addResearch("FocusWeatherGTNH", "TM",
                "volatus 27, praecantatio 24, aqua 21, ignis 18, terra 15, ordo 12, perditio 9, aer 6, tempestas 3", 12,
                -7, 4, ItemBracketHandler.getItem("TaintedMagic:ItemFocusMeteorology", 0))
        Research.addPrereq("FocusWeatherGTNH", "CreationShardGTNH", false)
        Research.addPrereq("FocusWeatherGTNH", "FOCUSSHOCK", false)
        Research.addPrereq("FocusWeatherGTNH", "FOCUSFROST", false)
        Research.setConcealed("FocusWeatherGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FocusWeatherGTNH", "Wand Focus: Meteorology")
        MineTweakerAPI.game.setLocalization("tc.research_text.FocusWeatherGTNH",
                "There's a 30% chance that it's already raining.")
        Research.addPage("FocusWeatherGTNH", "tm.text.FOCUSWEATHER.1")
        Infusion.addRecipe("FocusWeatherGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:FocusShock", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:FocusFrost", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                "alienis 84, aqua 72, tempestas 64, vacuos 48, praecantatio 32, volatus 24, perditio 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusMeteorology", 0), 16)
        Research.addInfusionPage("FocusWeatherGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemFocusMeteorology", 0))
        Warp.addToResearch("FocusWeatherGTNH", 10)
        Research.orphanResearch("PRIMALBLADE")
        Research.removeResearch("PRIMALBLADE")
        Research.addResearch("PrimalBladeGTNH", "TM",
                "praecantatio 24, alienis 21, telum 18, tenebrae 15, vacuos 12, auram 9, potentia 6, cognitio 3", 11,
                -5, 4, ItemBracketHandler.getItem("TaintedMagic:ItemPrimordialEdge", 0))
        Research.addPrereq("PrimalBladeGTNH", "CreationShardGTNH", false)
        Research.addPrereq("PrimalBladeGTNH", "EvilshardsGTNH", true)
        Research.addPrereq("PrimalBladeGTNH", "CrystalDaggerGTNH", true)
        Research.addPrereq("PrimalBladeGTNH", "VOIDMETAL", false)
        Research.addPrereq("PrimalBladeGTNH", "PRIMALCRUSHER", false)
        Research.setConcealed("PrimalBladeGTNH", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.PrimalBladeGTNH", "Edge of the Primordials")
        MineTweakerAPI.game.setLocalization("tc.research_text.PrimalBladeGTNH", "Kamui")
        Research.addPage("PrimalBladeGTNH", "tm.text.PRIMALBLADE.1")
        Infusion.addRecipe("PrimalBladeGTNH", ItemBracketHandler.getItem("Thaumcraft:ItemSwordVoid", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemPrimalCrusher", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemCrystalDagger", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.VoidEssence", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368)),
                "alienis 96, metallum 84, telum 72, tenebrae 64, vacuos 48, auram 32, cognitio 24, potentia 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemPrimordialEdge", 0), 16)
        Research.addInfusionPage("PrimalBladeGTNH", ItemBracketHandler.getItem("TaintedMagic:ItemPrimordialEdge", 0))
        Warp.addToResearch("PrimalBladeGTNH", 10)
        Research.orphanResearch("CAP_cloth")
        Research.removeResearch("CAP_cloth")
        Research.addResearch("CAP_cloth", "TM", "praecantatio 12, pannus 9, sano 6, alienis 3", 7, 5, 3,
                ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 1))
        Research.addPrereq("CAP_cloth", "CAP_gold", false)
        Research.addPrereq("CAP_cloth", "ENCHFABRIC", false)
        Research.setConcealed("CAP_cloth", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CAP_cloth", "Cloth Caps")
        MineTweakerAPI.game.setLocalization("tc.research_text.CAP_cloth", "Remember to wrap it")
        Research.addPage("CAP_cloth", "tm.text.CAP_cloth.1")
        Arcane.addShaped("CAP_cloth", ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 1),
                "terra 25, ignis 25, ordo 25, perditio 25",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 1),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7))))
        Research.addArcanePage("CAP_cloth", ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 1))
        Warp.addToResearch("CAP_cloth", 1)
        Research.orphanResearch("CAP_shadowcloth")
        Research.removeResearch("CAP_shadowcloth")
        Research.addResearch("CAP_shadowcloth", "TM",
                "praecantatio 18, pannus 15, tenebrae 12, vacuos 9, metallum 6, alienis 3", -2, 3, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 3))
        Research.addPrereq("CAP_shadowcloth", "CAP_thaumium", false)
        Research.addPrereq("CAP_shadowcloth", "ShadowClothGTNH", false)
        Research.setConcealed("CAP_shadowcloth", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CAP_shadowcloth", "Shadow-Imbued Cloth Caps")
        MineTweakerAPI.game.setLocalization("tc.research_text.CAP_shadowcloth", "On Wednesdays we wear black")
        Research.addPage("CAP_shadowcloth", "tc.research_page.CAP_shadowcloth")
        MineTweakerAPI.game.setLocalization("tc.research_page.CAP_shadowcloth",
                "You've created a new type of wand cap using the exact same design as the Cloth Caps, except using Shadow-Imbued Cloth. The idea was definitely a success, though you needed to use a Charged Thaumium Wand Cap to bind it all together.<BR>The Shadow Cloth Caps are exactly the same as the Cloth Caps, but slightly more efficient. They will grant a 10% Vis Discount.")
        Arcane.addShaped("CAP_shadowcloth", ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 3),
                "terra 50, ignis 50, ordo 50, perditio 50",
                arrayOf(arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                        OreBracketHandler.getOre("foilShadow"),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1)),
                        arrayOf(OreBracketHandler.getOre("foilShadow"),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 2),
                                OreBracketHandler.getOre("foilShadow")),
                        arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1),
                                OreBracketHandler.getOre("foilShadow"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 1))))
        Research.addArcanePage("CAP_shadowcloth", ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 3))
        Warp.addToResearch("CAP_shadowcloth", 2)
        Research.orphanResearch("CAP_crimsoncloth")
        Research.removeResearch("CAP_crimsoncloth")
        Research.addResearch("CAP_crimsoncloth", "TM",
                "tenebrae 18, praecantatio 15, pannus 12, sano 9, aqua 6, alienis 3", -1, -6, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 2))
        Research.addPrereq("CAP_crimsoncloth", "CAP_cloth", true)
        Research.addPrereq("CAP_crimsoncloth", "CrimsonRobesGTNH", false)
        Research.setConcealed("CAP_crimsoncloth", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CAP_crimsoncloth", "Crimson-Stained Cloth Caps")
        MineTweakerAPI.game.setLocalization("tc.research_text.CAP_crimsoncloth", "I love them red")
        Research.addPage("CAP_crimsoncloth", "tc.research_page.CAP_crimsoncloth")
        MineTweakerAPI.game.setLocalization("tc.research_page.CAP_crimsoncloth",
                "Using the same concept that the Cloth Caps laid down, you created very similar caps from Crimson-Stained Cloth. Though, you needed some Enchanted Cloth Cap to bind it all together.<BR>It seems that the Crystal Blood from which the cloth was stained helps the caps channel vis at a far more efficient rate. The Crimson Cloth Caps seem to provide a 15% vis discount.")
        Arcane.addShaped("CAP_crimsoncloth", ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 2),
                "terra 75, ignis 75, ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 1),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2),
                                ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 2))))
        Research.addArcanePage("CAP_crimsoncloth", ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 2))
        Warp.addToResearch("CAP_crimsoncloth", 4)
        Research.orphanResearch("CAP_shadowmetal")
        Research.removeResearch("CAP_shadowmetal")
        Research.addResearch("CAP_shadowmetal", "TM",
                "metallum 21, tenebrae 18, praecantatio 15, alienis 12, terra 9, lucrum 6, cognitio 3", -4, 4, 4,
                ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 0))
        Research.addPrereq("CAP_shadowmetal", "CAP_shadowcloth", false)
        Research.addPrereq("CAP_shadowmetal", "CAP_void", false)
        Research.addPrereq("CAP_shadowmetal", "PRIMPEARL", false)
        Research.setConcealed("CAP_shadowmetal", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CAP_shadowmetal", "Shadowmetal Wand Caps")
        MineTweakerAPI.game.setLocalization("tc.research_text.CAP_shadowmetal", "What a drag")
        Research.addPage("CAP_shadowmetal", "tm.text.CAP_shadowmetal.1")
        Infusion.addRecipe("CAP_shadowmetal", ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandCap", 7),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17368),
                        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 3)),
                "alienis 96, praecantatio 96, tenebrae 84, metallum 72, vacuos 64, cognitio 32, lucrum 16",
                ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 0), 12)
        Research.addInfusionPage("CAP_shadowmetal", ItemBracketHandler.getItem("TaintedMagic:ItemWandCap", 0))
        Warp.addToResearch("CAP_shadowmetal", 8)
    }
}