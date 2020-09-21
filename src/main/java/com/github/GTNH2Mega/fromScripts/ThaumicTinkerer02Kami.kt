package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IItemStack
import minetweaker.expand.*
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import modtweaker2.mods.thaumcraft.handlers.Warp
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class ThaumicTinkerer02Kami : Runnable {
    override fun run() {
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 3))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 4))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:catAmulet", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorPouch", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothHelm", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothChest", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothLegs", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothBoots", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 5))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusShadowbeam", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusXPDrain", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothHelmGem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothChestGem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothLegsGem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothBootsGem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:warpGate", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:skyPearl", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:focusRecall", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorPick", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorShovel", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorAxe", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorSword", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorPickGem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorShovelGem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorAxeGem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:ichorSwordGem", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:protoclay", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:blockTalisman", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("ThaumicTinkerer:placementMirror", 0))
        Research.removeResearch("DIMENSION_SHARDS")
        Research.addResearch("DIMENSIONSHARDS", "TT_CATEGORY",
                "infernus 15, luxuria 15, superbia 15, gula 12, invidia 9, desidia 6, ira 3", 7, 8, 3,
                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7))
        MineTweakerAPI.game.setLocalization("tc.research_name.DIMENSIONSHARDS", "Dimensional Shards")
        MineTweakerAPI.game.setLocalization("tc.research_text.DIMENSIONSHARDS", "[TT] Rarities of the Otherworld")
        Research.addPrereq("DIMENSIONSHARDS", "INFUSION", false)
        Research.setConcealed("DIMENSIONSHARDS", false)
        Research.addPage("DIMENSIONSHARDS", "tt.research.page.DIMENSIONSHARDS")
        MineTweakerAPI.game.setLocalization("tt.research.page.DIMENSIONSHARDS",
                "Similarly to the overworld, the Nether and the End also have their specific shards, these are rarely held by either Zombie Pigmen living in the Nether or Endermen living in the End.<BR> You find a way to get this Shards with a Infusion recipe also.<BR><BR><IMG>ttinkerer:textures/items/netherShard.png:0:0:255:255:0.0625</IMG><IMG>ttinkerer:textures/items/enderShard.png:0:0:255:255:0.0625</IMG>")
        Infusion.addRecipe("DIMENSIONSHARDS", ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                arrayOf(ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 4),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 5),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 6),
                        ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6)),
                "infernus 8, praecantatio 8, vitreus 8, vitium 8, luxuria 8, superbia 8, gula 8, invidia 8, desidia 8, ira 8, alienis 8",
                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 6), 8)
        Infusion.addRecipe("DIMENSIONSHARDS", ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                arrayOf(ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 1),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 2),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 3),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 4),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 5),
                        ItemBracketHandler.getItem("ForbiddenMagic:NetherShard", 6),
                        ItemBracketHandler.getItem("ForbiddenMagic:GluttonyShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6)),
                "infernus 8, praecantatio 8, vitreus 8, vitium 8, luxuria 8, superbia 8, gula 8, invidia 8, desidia 8, ira 8, alienis 8",
                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7), 8)
        Research.addInfusionPage("DIMENSIONSHARDS", ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 6))
        Research.addInfusionPage("DIMENSIONSHARDS", ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7))
        Research.addPrereq("ICHOR", "DIMENSIONSHARDS", false)
        Infusion.addRecipe("ICHOR", ItemBracketHandler.getItem("minecraft:nether_star", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 6),
                        ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7)),
                "humanus 32, lux 32, spiritus 64, alienis 16, ordo 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0).amount(2), 10)
        Research.setAspects("ICHOR",
                "humanus 15, spiritus 15, ordo 15, praecantatio 15, vitium 12, lux 9, infernus 6, alienis 3")
        Research.setComplexity("ICHOR", 4)
        Warp.addToResearch("ICHOR", 5)
        Arcane.addShaped("ICHOR_CLOTH", ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1).amount(2),
                "aer 125, aqua 125, ignis 125, terra 125, ordo 125, perditio 125",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0)),
                        arrayOf(OreBracketHandler.getOre("gemFlawlessDiamond"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                                OreBracketHandler.getOre("gemFlawlessDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwOsmiridium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwOsmiridium"))))
        Research.setAspects("ICHOR_CLOTH", "pannus 15, fabrico 15, praecantatio 12, sensus 9, lux 6, alienis 3")
        Research.setComplexity("ICHOR_CLOTH", 4)
        Warp.addToResearch("ICHOR_CLOTH", 1)
        Research.clearPages("ICHORIUM")
        Research.addPage("ICHORIUM", "ttresearch.page.ICHORIUM.0")
        Arcane.addShaped("ICHORIUM", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                "aer 125, aqua 125, ignis 125, terra 125, ordo 125, perditio 125",
                arrayOf(arrayOf(OreBracketHandler.getOre("ingotVoid"),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                        OreBracketHandler.getOre("ingotVoid")),
                        arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                                OreBracketHandler.getOre("ingotOsmiridium"),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0)),
                        arrayOf(OreBracketHandler.getOre("gemFlawlessDiamond"),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                                OreBracketHandler.getOre("gemFlawlessDiamond"))))
        Research.addArcanePage("ICHORIUM", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978))
        Research.setAspects("ICHORIUM", "metallum 15, fabrico 15, instrumentum 12, praecantatio 9, lux 6, alienis 3")
        Research.setComplexity("ICHORIUM", 4)
        Warp.addToResearch("ICHORIUM", 2)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9978).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978), 0.0)
        Research.orphanResearch("CAP_ICHOR")
        Research.removeResearch("CAP_ICHOR")
        Research.addResearch("CAP_ICHOR", "TT_CATEGORY",
                "cognitio 15, praecantatio 12, permutatio 9, instrumentum 6, terra 3", 11, 11, 4,
                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 4))
        MineTweakerAPI.game.setLocalization("tc.research_name.CAP_ICHOR", "Ichorium Wand Caps")
        MineTweakerAPI.game.setLocalization("tc.research_text.CAP_ICHOR", "[TT] Somewhat like a Steam Sale")
        Research.addPrereq("CAP_ICHOR", "ICHORIUM", false)
        Research.setConcealed("CAP_ICHOR", true)
        Research.addPage("CAP_ICHOR", "ttresearch.page.CAP_ICHOR.0")
        Arcane.addShaped("CAP_ICHOR", ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 4).amount(2),
                "aer 150, aqua 150, ignis 150, terra 150, ordo 150, perditio 150",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                        ItemBracketHandler.getItem("Thaumcraft:WandCap", 7),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringVoid"),
                                OreBracketHandler.getOre("ingotIchorium"), OreBracketHandler.getOre("ringVoid")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                                ItemBracketHandler.getItem("Thaumcraft:WandCap", 7),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0))))
        Research.addArcanePage("CAP_ICHOR", ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 4))
        Research.setAspects("CAP_ICHOR", "metallum 15, instrumentum 15, tenebrae 12, praecantatio 9, lux 6, alienis 3")
        Research.setComplexity("CAP_ICHOR", 4)
        Warp.addToResearch("CAP_ICHOR", 3)
        Infusion.addRecipe("CAT_AMULET", ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                arrayOf(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 10),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28086),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("minecraft:fish", 0), ItemBracketHandler.getItem("minecraft:dye", 3),
                        ItemBracketHandler.getItem("minecraft:leaves", 3),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28086)),
                "cognitio 16, ordo 32, tenebrae 16, mortuus 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:catAmulet", 0), 8)
        Research.setAspects("CAT_AMULET", "cognitio 15, ordo 15, tenebrae 12, mortuus 9, motus 6, alienis 3")
        Research.setComplexity("CAT_AMULET", 4)
        Infusion.addRecipe("ICHOR_POUCH", ItemBracketHandler.getItem("Thaumcraft:FocusPouch", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockJar", 3),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("Thaumcraft:TrunkSpawner", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500)),
                "vacuos 64, humanus 48, pannus 48, alienis 48, aer 64",
                ItemBracketHandler.getItem("ThaumicTinkerer:ichorPouch", 0), 10)
        Research.setAspects("ICHOR_POUCH", "vacuos 15, pannus 15, alienis 12, humanus 9, motus 6, aer 3")
        Research.setComplexity("ICHOR_POUCH", 4)
        Warp.addToResearch("ICHOR_POUCH", 3)
        Arcane.addShaped("ICHORCLOTH_ARMOR", ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothHelm", 0),
                "aqua 75, perditio 50, ordo 25",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1)),
                        arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                                OreBracketHandler.getOre("plateOsmiridium"),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("screwOsmiridium"), null)))
        Arcane.addShaped("ICHORCLOTH_ARMOR", ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothChest", 0),
                "aer 75, perditio 50, ordo 25",
                arrayOf(arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        OreBracketHandler.getOre("screwOsmiridium"),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1))))
        Arcane.addShaped("ICHORCLOTH_ARMOR", ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothLegs", 0),
                "ignis 75, perditio 50, ordo 25",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1)),
                        arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                                OreBracketHandler.getOre("plateOsmiridium"),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1)),
                        arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                                OreBracketHandler.getOre("screwOsmiridium"),
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1))))
        Arcane.addShaped("ICHORCLOTH_ARMOR", ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothBoots", 0),
                "terra 75, perditio 50, ordo 25", arrayOf(arrayOfNulls(3),
                arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        OreBracketHandler.getOre("plateOsmiridium"),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1)),
                arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        OreBracketHandler.getOre("screwOsmiridium"),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1))))
        Research.setAspects("ICHORCLOTH_ARMOR", "tutamen 15, pannus 15, lux 12, perfodio 9, motus 6, alienis 3")
        Research.setComplexity("ICHORCLOTH_ARMOR", 4)
        Warp.addToResearch("ICHORCLOTH_ARMOR", 3)
        Infusion.addRecipe("ROD_ICHORCLOTH", ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0)),
                "praecantatio 150, lux 100, instrumentum 100, arbor 75, alienis 50",
                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 5), 10)
        Research.setAspects("ROD_ICHORCLOTH", "instrumentum 15, pannus 15, lux 12, praecantatio 9, arbor 6, alienis 3")
        Research.setComplexity("ROD_ICHORCLOTH", 4)
        Warp.addToResearch("ROD_ICHORCLOTH", 3)
        val s = "FOCUS_SHADOWBEAM"
        val item = ItemBracketHandler.getItem("Thaumcraft:FocusShock", 0)
        val array = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                ItemBracketHandler.getItem("ThaumicTinkerer:focusDeflect", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501), null, null, null, null)
        val n = 3
        val item2 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 25543)
        val hashMap = HashMap<String, IData>()
        val s2 = "ench"
        val array2 = arrayOf<IData?>(null)
        val n2 = 0
        val hashMap2 = HashMap<String, IData>()
        hashMap2["lvl"] = ExpandShort.asNBT(3.toShort())
        hashMap2["id"] = ExpandShort.asNBT(21.toShort())
        array2[n2] = ExpandAnyDict.asData(hashMap2)
        hashMap[s2] = ExpandAnyArray.asData(array2)
        hashMap["GT.HasBeenUpdated"] = ExpandByte.asData(1.toByte())
        array[n] = item2.withTag(ExpandAnyDict.asData(hashMap))
        val n3 = 4
        val item3 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 25543)
        val hashMap3 = HashMap<String, IData>()
        val s3 = "ench"
        val array3 = arrayOf<IData?>(null)
        val n4 = 0
        val hashMap4 = HashMap<String, IData>()
        hashMap4["lvl"] = ExpandShort.asNBT(3.toShort())
        hashMap4["id"] = ExpandShort.asNBT(21.toShort())
        array3[n4] = ExpandAnyDict.asData(hashMap4)
        hashMap3[s3] = ExpandAnyArray.asData(array3)
        hashMap3["GT.HasBeenUpdated"] = ExpandByte.asData(1.toByte())
        array[n3] = item3.withTag(ExpandAnyDict.asData(hashMap3))
        array[5] = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500)
        array[6] = ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0)
        Infusion.addRecipe(s, item, array, "alienis 64, praecantatio 64, telum 64, tenebrae 64, tempestas 32",
                ItemBracketHandler.getItem("ThaumicTinkerer:focusShadowbeam", 0), 12)
        Research.setAspects("FOCUS_SHADOWBEAM",
                "tenebrae 15, praecantatio 15, alienis 12, telum 9, tempestas 6, motus 3")
        Research.setComplexity("FOCUS_SHADOWBEAM", 4)
        Warp.addToResearch("FOCUS_SHADOWBEAM", 4)
        Infusion.addRecipe("FOCUS_XP_DRAIN", ItemBracketHandler.getItem("minecraft:experience_bottle", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("ThaumicTinkerer:enchanter", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24532),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501),
                        ItemBracketHandler.getItem("ThaumicTinkerer:xpTalisman", 0)),
                "auram 64, cognitio 64, praecantatio 64, vitium 32",
                ItemBracketHandler.getItem("ThaumicTinkerer:focusXPDrain", 0), 12)
        Research.setAspects("FOCUS_XP_DRAIN", "cognitio 15, praecantatio 15, auram 12, humanus 9, lucrum 6, alienis 3")
        Research.setComplexity("FOCUS_XP_DRAIN", 4)
        Warp.addToResearch("FOCUS_XP_DRAIN", 4)
        Infusion.addRecipe("ICHORCLOTH_HELM_GEM", ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothHelm", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:ItemHelmetThaumium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24533),
                        ItemBracketHandler.getItem("Thaumcraft:ItemThaumonomicon", 0),
                        ItemBracketHandler.getItem("minecraft:potion", 8262),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("minecraft:fish", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:cake", 0),
                        ItemBracketHandler.getItem("Thaumcraft:FocusPrimal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemGoggles", 0)),
                "aqua 64, auram 64, cognitio 64, corpus 64, fames 64, lux 64, tutamen 64",
                ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothHelmGem", 0), 16)
        Research.setAspects("ICHORCLOTH_HELM_GEM",
                "aqua 24, sano 21, fames 18, auram 15, cognitio 12, corpus 9, lux 6, tutamen 3")
        Research.setComplexity("ICHORCLOTH_HELM_GEM", 4)
        Warp.addToResearch("ICHORCLOTH_HELM_GEM", 4)
        val s4 = "ICHORCLOTH_CHEST_GEM"
        val item4 = ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothChest", 0)
        val array4 = arrayOfNulls<IItemStack>(12)
        array4[0] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978)
        array4[1] = ItemBracketHandler.getItem("Thaumcraft:ItemChestplateThaumium", 0)
        array4[2] = ItemBracketHandler.getItem("ThaumicTinkerer:focusFlight", 0)
        array4[3] = ItemBracketHandler.getItem("Thaumcraft:ItemThaumonomicon", 0)
        val n5 = 4
        val item5 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 25330)
        val hashMap5 = HashMap<String, IData>()
        val s5 = "ench"
        val array5 = arrayOf<IData?>(null)
        val n6 = 0
        val hashMap6 = HashMap<String, IData>()
        hashMap6["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap6["id"] = ExpandShort.asNBT(21.toShort())
        array5[n6] = ExpandAnyDict.asData(hashMap6)
        hashMap5[s5] = ExpandAnyArray.asData(array5)
        hashMap5["GT.HasBeenUpdated"] = ExpandByte.asData(1.toByte())
        array4[n5] = item5.withTag(ExpandAnyDict.asData(hashMap5))
        array4[5] = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500)
        array4[6] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978)
        array4[7] = ItemBracketHandler.getItem("minecraft:ghast_tear", 0)
        val n7 = 8
        val item6 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 25330)
        val hashMap7 = HashMap<String, IData>()
        val s6 = "ench"
        val array6 = arrayOf<IData?>(null)
        val n8 = 0
        val hashMap8 = HashMap<String, IData>()
        hashMap8["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap8["id"] = ExpandShort.asNBT(21.toShort())
        array6[n8] = ExpandAnyDict.asData(hashMap8)
        hashMap7[s6] = ExpandAnyArray.asData(array6)
        hashMap7["GT.HasBeenUpdated"] = ExpandByte.asData(1.toByte())
        array4[n7] = item6.withTag(ExpandAnyDict.asData(hashMap7))
        array4[9] = ItemBracketHandler.getItem("EMT:EMTItems", 7)
        array4[10] = ItemBracketHandler.getItem("ThaumicTinkerer:focusDeflect", 0)
        array4[11] = ItemBracketHandler.getItem("Thaumcraft:HoverHarness", 0)
        Infusion.addRecipe(s4, item4, array4, "aer 64, alienis 64, lux 64, ordo 64, sensus 64, tutamen 64, volatus 64",
                ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothChestGem", 0), 16)
        Research.setAspects("ICHORCLOTH_CHEST_GEM",
                "aer 24, motus 21, volatus 18, alienis 15, lux 12, sensus 9, ordo 6, tutamen 3")
        Research.setComplexity("ICHORCLOTH_CHEST_GEM", 4)
        Warp.addToResearch("ICHORCLOTH_CHEST_GEM", 4)
        Infusion.addRecipe("ICHORCLOTH_LEGS_GEM", ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothLegs", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsThaumium", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:focusSmelt", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemThaumonomicon", 0),
                        ItemBracketHandler.getItem("minecraft:potion", 8259),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("ThaumicTinkerer:brightNitor", 0),
                        ItemBracketHandler.getItem("minecraft:fire_charge", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                        ItemBracketHandler.getItem("Thaumcraft:FocusPrimal", 0),
                        ItemBracketHandler.getItem("minecraft:lava_bucket", 0)),
                "alienis 64, ignis 64, lucrum 64, lux 64, potentia 64, sano 64, tutamen 64",
                ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothLegsGem", 0), 16)
        Research.setAspects("ICHORCLOTH_LEGS_GEM",
                "ignis 24, sano 21, lucrum 18, potentia 15, alienis 12, aer 9, lux 6, tutamen 3")
        Research.setComplexity("ICHORCLOTH_LEGS_GEM", 4)
        Warp.addToResearch("ICHORCLOTH_LEGS_GEM", 4)

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //val s7 = "ICHORCLOTH_BOOTS_GEM"
        //val item7 = ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothBoots", 0)
        //val array7 = arrayOfNulls<IItemStack>(12)
        //array7[0] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978)
        //array7[1] = ItemBracketHandler.getItem("Thaumcraft:ItemBootsThaumium", 0)
        //val n9 = 2
        //val item8 = ItemBracketHandler.getItem("ThaumicTinkerer:infusedSeeds", 0)
        //val hashMap9 = HashMap<String, IData>()
        //val s8 = "mainAspect"
        //val hashMap10 = HashMap<String, IData>()
        //val s9 = "Aspects"
        //val array8 = arrayOf<IData?>(null)
        //val n10 = 0
        //val hashMap11 = HashMap<String, IData>()
        //hashMap11["amount"] = ExpandInt.toData(1)
        //hashMap11["key"] = ExpandString.asData("terra")
        //array8[n10] = ExpandAnyDict.asData(hashMap11)
        //hashMap10[s9] = ExpandAnyArray.asData(array8)
        //hashMap9[s8] = ExpandAnyDict.asData(hashMap10)
        //array7[n9] = item8.withTag(ExpandAnyDict.asData(hashMap9))
        //array7[3] = ItemBracketHandler.getItem("Thaumcraft:ItemThaumonomicon", 0)
        //array7[4] = ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)
        //array7[5] = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500)
        //array7[6] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978)
        //array7[7] = ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 8)
        //array7[8] = ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 5)
        //array7[9] = ItemBracketHandler.getItem("minecraft:lead", 0)
        //array7[10] = ItemBracketHandler.getItem("Thaumcraft:FocusPrimal", 0)
        //array7[11] = ItemBracketHandler.getItem("minecraft:grass", 0)
        //Infusion.addRecipe(s7, item7, array7, "herba 64, iter 64, lux 64, motus 64, perfodio 64, terra 64, tutamen 64",
        //        ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothBootsGem", 0), 16)
        //Research.setAspects("ICHORCLOTH_BOOTS_GEM",
        //        "terra 24, iter 21, perfodio 18, herba 15, lux 12, motus 9, cognitio 6, tutamen 3")
        //Research.setComplexity("ICHORCLOTH_BOOTS_GEM", 4)
        //Warp.addToResearch("ICHORCLOTH_BOOTS_GEM", 4)

        Infusion.addRecipe("WARP_GATE", ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 2),
                arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:dislocator", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7),
                        ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 6)),
                "alienis 64, iter 72, volatus 64, terra 32, aer 32",
                ItemBracketHandler.getItem("ThaumicTinkerer:warpGate", 0), 10)
        Infusion.addRecipe("WARP_GATE", ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                arrayOf(ItemBracketHandler.getItem("IC2:itemDensePlates", 8),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7),
                        ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 6)),
                "aer 24, alienis 32, volatus 32, iter 32, vitreus 24",
                ItemBracketHandler.getItem("ThaumicTinkerer:skyPearl", 0), 10)
        Research.setAspects("WARP_GATE", "iter 18, volatus 15, alienis 12, machina 9, vitreus 6, aer 3")
        Research.setComplexity("WARP_GATE", 4)
        Warp.addToResearch("WARP_GATE", 4)
        Infusion.addRecipe("FOCUS_RECALL", ItemBracketHandler.getItem("ThaumicTinkerer:focusEnderChest", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("ThaumicTinkerer:skyPearl", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("ThaumicTinkerer:skyPearl", 0)),
                "alienis 64, iter 128, praecantatio 96, volatus 48, aer 32",
                ItemBracketHandler.getItem("ThaumicTinkerer:focusRecall", 0), 14)
        Research.setAspects("FOCUS_RECALL", "iter 18, alienis 15, volatus 12, praecantatio 9, aer 6, cognitio 3")
        Research.setComplexity("FOCUS_RECALL", 4)
        Warp.addToResearch("FOCUS_RECALL", 4)
        Arcane.addShaped("ICHOR_TOOLS", ItemBracketHandler.getItem("ThaumicTinkerer:ichorPick", 0),
                "ignis 75, perditio 50, ordo 25",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ingotIchorium"),
                        OreBracketHandler.getOre("ingotIchorium"), OreBracketHandler.getOre("ingotIchorium")),
                        arrayOf(OreBracketHandler.getOre("plateOsmiridium"),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                                OreBracketHandler.getOre("plateOsmiridium")),
                        arrayOf(OreBracketHandler.getOre("screwOsmiridium"),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                                OreBracketHandler.getOre("screwOsmiridium"))))
        Arcane.addShaped("ICHOR_TOOLS", ItemBracketHandler.getItem("ThaumicTinkerer:ichorShovel", 0),
                "terra 75, perditio 50, ordo 25",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("ingotIchorium"), null),
                        arrayOf(OreBracketHandler.getOre("plateOsmiridium"),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                                OreBracketHandler.getOre("plateOsmiridium")),
                        arrayOf(OreBracketHandler.getOre("screwOsmiridium"),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                                OreBracketHandler.getOre("screwOsmiridium"))))
        Arcane.addShaped("ICHOR_TOOLS", ItemBracketHandler.getItem("ThaumicTinkerer:ichorAxe", 0),
                "aqua 75, perditio 50, ordo 25", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ingotIchorium"),
                OreBracketHandler.getOre("ingotIchorium"), OreBracketHandler.getOre("plateOsmiridium")),
                arrayOf(OreBracketHandler.getOre("ingotIchorium"), ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                        OreBracketHandler.getOre("screwOsmiridium")),
                arrayOf(OreBracketHandler.getOre("plateOsmiridium"),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                        OreBracketHandler.getOre("screwOsmiridium"))))
        Arcane.addShaped("ICHOR_TOOLS", ItemBracketHandler.getItem("ThaumicTinkerer:ichorSword", 0),
                "aer 75, perditio 50, ordo 25",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("ingotIchorium"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateOsmiridium"),
                                OreBracketHandler.getOre("ingotIchorium"), OreBracketHandler.getOre("plateOsmiridium")),
                        arrayOf(OreBracketHandler.getOre("screwOsmiridium"),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                                OreBracketHandler.getOre("screwOsmiridium"))))
        Research.setAspects("ICHOR_TOOLS",
                "instrumentum 18, telum 15, metallum 12, fabrico 9, praecantatio 6, alienis 3")
        Research.setComplexity("ICHOR_TOOLS", 4)
        Warp.addToResearch("ICHOR_TOOLS", 3)

        //TODO Replace ("StevesCarts:CartModule", 9)
        //Infusion.addRecipe("ICHOR_PICK_GEM", ItemBracketHandler.getItem("ThaumicTinkerer:ichorPick", 0),
        //        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:FocusFire", 0),
        //                ItemBracketHandler.getItem("StevesCarts:CartModule", 9),
        //                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
        //                ItemBracketHandler.getItem("IC2:blockITNT", 0),
        //                ItemBracketHandler.getItem("StevesCarts:CartModule", 9),
        //                ItemBracketHandler.getItem("Thaumcraft:FocusFire", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0)),
        //        "ignis 64, lucrum 64, metallum 64, meto 64, messis 64, perfodio 64, terra 64, sensus 64",
        //        ItemBracketHandler.getItem("ThaumicTinkerer:ichorPickGem", 0), 18)

        Research.setAspects("ICHOR_PICK_GEM",
                "ignis 24, lucrum 21, metallum 18, meto 15, messis 12, perfodio 9, terra 6, sensus 3")
        Research.setComplexity("ICHOR_PICK_GEM", 4)
        Warp.addToResearch("ICHOR_PICK_GEM", 3)
        Infusion.addRecipe("ICHOR_SHOVEL_GEM", ItemBracketHandler.getItem("ThaumicTinkerer:ichorShovel", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0),
                        ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("IC2:blockITNT", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642),
                        ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0)),
                "instrumentum 64, meto 64, perfodio 64, sensus 64, terra 64, vinculum 64, ordo 64",
                ItemBracketHandler.getItem("ThaumicTinkerer:ichorShovelGem", 0), 18)
        Research.setAspects("ICHOR_SHOVEL_GEM",
                "instrumentum 21, meto 18, perfodio 15, sensus 12, terra 9, vinculum 6, ordo 3")
        Research.setComplexity("ICHOR_SHOVEL_GEM", 4)
        Warp.addToResearch("ICHOR_SHOVEL_GEM", 3)
        Infusion.addRecipe("ICHOR_AXE_GEM", ItemBracketHandler.getItem("ThaumicTinkerer:ichorAxe", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0),
                        ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32721),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("IC2:blockITNT", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32721),
                        ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0)),
                "aqua 64, arbor 64, instrumentum 64, messis 64, meto 64, perfodio 64, sensus 64",
                ItemBracketHandler.getItem("ThaumicTinkerer:ichorAxeGem", 0), 18)
        Research.setAspects("ICHOR_AXE_GEM",
                "aqua 21, arbor 18, instrumentum 15, messis 12, meto 9, perfodio 6, sensus 3")
        Research.setComplexity("ICHOR_AXE_GEM", 4)
        Warp.addToResearch("ICHOR_AXE_GEM", 3)

        //TODO Replace ("ExtraUtilities:spike_base_diamond", 0)
        //Infusion.addRecipe("ICHOR_SWORD_GEM", ItemBracketHandler.getItem("ThaumicTinkerer:ichorSword", 0),
        //        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:FocusFrost", 0),
        //                ItemBracketHandler.getItem("ExtraUtilities:spike_base_diamond", 0),
        //                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
        //                ItemBracketHandler.getItem("IC2:blockITNT", 0),
        //                ItemBracketHandler.getItem("ExtraUtilities:spike_base_diamond", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:FocusFrost", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0)),
        //        "aer 64, fames 64, ordo 64, potentia 64, spiritus 64, telum 64, vitreus 64",
        //        ItemBracketHandler.getItem("ThaumicTinkerer:ichorSwordGem", 0), 18)

        Research.setAspects("ICHOR_SWORD_GEM", "aer 21, fames 18, ordo 15, potentia 12, spiritus 9, telum 6, vitreus 3")
        Research.setComplexity("ICHOR_SWORD_GEM", 4)
        Warp.addToResearch("ICHOR_SWORD_GEM", 3)
        Infusion.addRecipe("PROTOCLAY", ItemBracketHandler.getItem("minecraft:clay_ball", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:stone", 0),
                        ItemBracketHandler.getItem("minecraft:dirt", 0),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 7),
                        ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:cobblestone", 0),
                        ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 6),
                        ItemBracketHandler.getItem("minecraft:grass", 0)),
                "instrumentum 32, perfodio 32, terra 16, aer 16",
                ItemBracketHandler.getItem("ThaumicTinkerer:protoclay", 0), 5)
        Research.setAspects("PROTOCLAY", "instrumentum 18, humanus 15, machina 12, perfodio 9, terra 6, aer 3")
        Research.setComplexity("PROTOCLAY", 4)
        Warp.addToResearch("PROTOCLAY", 1)
        Infusion.addRecipe("BLOCK_TALISMAN", ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("EnderStorage:enderChest", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 11),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501)),
                "alienis 64, praecantatio 64, vacuos 72, tenebrae 48, spiritus 32",
                ItemBracketHandler.getItem("ThaumicTinkerer:blockTalisman", 0), 10)
        Research.setAspects("BLOCK_TALISMAN", "vacuos 15, tenebrae 12, alienis 9, praecantatio 6, spiritus 3")
        Research.setComplexity("BLOCK_TALISMAN", 4)
        Warp.addToResearch("BLOCK_TALISMAN", 6)
        Infusion.addRecipe("PLACEMENT_MIRROR", ItemBracketHandler.getItem("ThaumicTinkerer:blockTalisman", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("minecraft:dropper", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockMirror", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501)),
                "cognitio 64, fabrico 72, praecantatio 64, vitreus 48, alienis 32",
                ItemBracketHandler.getItem("ThaumicTinkerer:placementMirror", 0), 16)
        Research.setAspects("PLACEMENT_MIRROR", "cognitio 15, fabrico 12, praecantatio 9, vitreus 6, alienis 3")
        Research.setComplexity("PLACEMENT_MIRROR", 4)
        Warp.addToResearch("PLACEMENT_MIRROR", 8)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.blockmetal8", 13), 0.0)
        Research.refreshResearchRecipe("DIMENSION_SHARDS")
        Research.refreshResearchRecipe("ICHOR")
        Research.refreshResearchRecipe("ICHOR_CLOTH")
        Research.refreshResearchRecipe("ICHORIUM")
        Research.refreshResearchRecipe("CAT_AMULET")
        Research.refreshResearchRecipe("ICHOR_POUCH")
        Research.refreshResearchRecipe("ICHORCLOTH_ARMOR")
        Research.refreshResearchRecipe("ROD_ICHORCLOTH")
        Research.refreshResearchRecipe("FOCUS_SHADOWBEAM")
        Research.refreshResearchRecipe("FOCUS_XP_DRAIN")
        Research.refreshResearchRecipe("ICHORCLOTH_HELM_GEM")
        Research.refreshResearchRecipe("ICHORCLOTH_CHEST_GEM")
        Research.refreshResearchRecipe("ICHORCLOTH_LEGS_GEM")
        Research.refreshResearchRecipe("ICHORCLOTH_BOOTS_GEM")
        Research.refreshResearchRecipe("WARP_GATE")
        Research.refreshResearchRecipe("FOCUS_RECALL")
        Research.refreshResearchRecipe("ICHOR_TOOLS")
        Research.refreshResearchRecipe("ICHOR_PICK_GEM")
        Research.refreshResearchRecipe("ICHOR_SHOVEL_GEM")
        Research.refreshResearchRecipe("ICHOR_AXE_GEM")
        Research.refreshResearchRecipe("ICHOR_SWORD_GEM")
        Research.refreshResearchRecipe("PROTOCLAY")
        Research.refreshResearchRecipe("BLOCK_TALISMAN")
        Research.refreshResearchRecipe("PLACEMENT_MIRROR")
    }
}