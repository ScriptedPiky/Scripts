package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.*
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import minetweaker.mods.ic2.machines.Extractor
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class Avaritia : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Double_Craft", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Triple_Craft", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Dire_Crafting", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Crystal_Matrix", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource_Block", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource_Block", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Avaritia:Resource", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("eternalsingularity:combined_singularity", OreDictionary.WILDCARD_VALUE))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Neutron_Collector", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Neutronium_Compressor", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("eternalsingularity:eternal_singularity", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Orb_Armok", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Sword", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Pickaxe", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Shovel", 0))
        val item = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 9000)
        val hashMap = HashMap<String, IData>()
        hashMap["cap"] = ExpandString.asData("matrix")
        hashMap["rod"] = ExpandString.asData("infinity")
        ExtremeCrafting.remove(item.withTag(ExpandAnyDict.asData(hashMap)))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Axe", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Bow", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Avaritia:Akashic_Record", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Helm", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Chest", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Pants", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("Avaritia:Infinity_Shoes", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Avaritia:Dire_Crafting", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652),
                        ItemBracketHandler.getItem("Avaritia:Triple_Craft", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652)),
                        arrayOf(OreBracketHandler.getOre("waferAdvanced"),
                                ItemBracketHandler.getItem("Avaritia:Crystal_Matrix", 0),
                                OreBracketHandler.getOre("waferAdvanced")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642),
                                OreBracketHandler.getOre("circuitElite"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Avaritia:Dire_Crafting", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("GalacticraftCore:tile.rocketWorkbench", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Avaritia:Resource", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                        OreBracketHandler.getOre("plateDiamond"), OreBracketHandler.getOre("screwDiamond")),
                        arrayOf(OreBracketHandler.getOre("plateDiamond"),
                                ItemBracketHandler.getItem("dreamcraft:item.StainlessSteelBars", 0),
                                OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                                OreBracketHandler.getOre("plateDiamond"), OreBracketHandler.getOre("screwDiamond"))),
                null)

        //TODO Replace ("ExtraUtilities:block_bedrockium", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 0),
        //        arrayOf(arrayOfNulls(9),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        ItemBracketHandler.getItem("Avaritia:Singularity", 2), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf(null, null, null, ItemBracketHandler.getItem("Avaritia:Singularity", 1),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("Avaritia:Singularity", 8), null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("Avaritia:Singularity", 0),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("Avaritia:Singularity", 3),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("Avaritia:Singularity", 6), null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null,
        //                        ItemBracketHandler.getItem("Avaritia:Singularity", 7),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("Avaritia:Singularity", 5), null, null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        ItemBracketHandler.getItem("Avaritia:Singularity", 4), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null), arrayOfNulls(9)))

        //TODO Replace ("ExtraUtilities:block_bedrockium", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 1),
        //        arrayOf(arrayOfNulls(9),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        ItemBracketHandler.getItem("Avaritia:Singularity", 9), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf(null, null, null, ItemBracketHandler.getItem("Avaritia:Singularity", 10),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.vanilla.singularity", 0),
        //                        null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.vanilla.singularity", 2),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.vanilla.singularity", 1),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 3),
        //                        null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 0),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 1), null,
        //                null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 2), null,
        //                null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null), arrayOfNulls(9)))

        //TODO Replace ("ExtraUtilities:block_bedrockium", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 2),
        //        arrayOf(arrayOfNulls(9),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 4),
        //                        null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf(null, null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 5),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 6),
        //                        null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 7),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 8),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 9),
        //                        null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 10),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 11), null,
        //                null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 12), null,
        //                null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null), arrayOfNulls(9)))

        //TODO Replace ("ExtraUtilities:block_bedrockium", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 3),
        //        arrayOf(arrayOfNulls(9),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 13),
        //                        null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf(null, null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 14),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 15),
        //                        null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 16),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 17),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 18),
        //                        null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 19),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 20), null,
        //                null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 21), null,
        //                null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null), arrayOfNulls(9)))

        //TODO Replace ("ExtraUtilities:block_bedrockium", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 4),
        //        arrayOf(arrayOfNulls(9),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 22),
        //                        null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf(null, null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 23),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 24),
        //                        null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 25),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 26),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 27),
        //                        null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 28),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 29), null,
        //                null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.general.singularity", 30), null,
        //                null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null), arrayOfNulls(9)))

        //TODO Replace ("ExtraUtilities:block_bedrockium", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 5),
        //        arrayOf(arrayOfNulls(9),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        ItemBracketHandler.getItem(
        //                                "universalsingularities:universal.draconicEvolution.singularity", 0), null,
        //                        null, OreBracketHandler.getOre("blockBlackPlutonium"), null), arrayOf(null, null, null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.draconicEvolution.singularity", 1),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.enderIO.singularity", 0), null,
        //                OreBracketHandler.getOre("blockBlackPlutonium"), null), arrayOf<IIngredient?>(null, null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.enderIO.singularity", 1),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.enderIO.singularity", 2),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.enderIO.singularity", 3), null,
        //                null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.enderIO.singularity", 4),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.enderIO.singularity", 5), null,
        //                null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.enderIO.singularity", 6), null,
        //                null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null), arrayOfNulls(9)))

        //TODO Replace ("ExtraUtilities:block_bedrockium", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 6),
        //        arrayOf(arrayOfNulls(9),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
        //                arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        ItemBracketHandler.getItem("universalsingularities:universal.enderIO.singularity", 7),
        //                        null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf(null, null, null, ItemBracketHandler.getItem(
        //                        "universalsingularities:universal.extraUtilities.singularity", 0),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem("universalsingularities:universal.projectRed.singularity",
        //                                0), null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem(
        //                        "universalsingularities:universal.tinkersConstruct.singularity", 0),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem(
        //                                "universalsingularities:universal.tinkersConstruct.singularity", 1),
        //                        ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                        ItemBracketHandler.getItem(
        //                                "universalsingularities:universal.tinkersConstruct.singularity", 2), null,
        //                        null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.tinkersConstruct.singularity", 3),
        //                ItemBracketHandler.getItem("ExtraUtilities:block_bedrockium", 0),
        //                ItemBracketHandler.getItem("universalsingularities:universal.tinkersConstruct.singularity", 4),
        //                null, null, null), arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                ItemBracketHandler.getItem("universalsingularities:universal.tinkersConstruct.singularity", 6),
        //                null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null),
        //                arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
        //                        OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"), null, null), arrayOfNulls(9)))

        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("eternalsingularity:eternal_singularity", 0),
                arrayOf(arrayOf<IIngredient?>(null, null, null, null, null,
                        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0), null, null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"),
                                OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
                                OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
                        arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
                                ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 0), null, null,
                                OreBracketHandler.getOre("blockBlackPlutonium"), null),
                        arrayOf(ItemBracketHandler.getItem("Avaritia:Resource_Block", 0), null, null,
                                ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 1),
                                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                                ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 2), null,
                                OreBracketHandler.getOre("blockBlackPlutonium"), null),
                        arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                                ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 3),
                                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0), null, null),
                        arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null,
                                ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 4),
                                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                                ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 5), null, null,
                                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0)),
                        arrayOf(null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
                                ItemBracketHandler.getItem("eternalsingularity:combined_singularity", 6), null, null,
                                OreBracketHandler.getOre("blockBlackPlutonium"), null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockBlackPlutonium"), null, null,
                                OreBracketHandler.getOre("blockBlackPlutonium"),
                                OreBracketHandler.getOre("blockBlackPlutonium"), null, null),
                        arrayOf<IIngredient?>(null, null, null,
                                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0), null, null, null, null,
                                null)))

        //TODO Replace ("TConstruct:heavyPlate", 500)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("Avaritia:Orb_Armok", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, null, OreBracketHandler.getOre("plateInfinity"),
        //                OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"), null,
        //                null, null), arrayOf(null, null, OreBracketHandler.getOre("plateInfinity"),
        //                ItemBracketHandler.getItem("ForbiddenMagic:EldritchOrb", 0),
        //                OreBracketHandler.getOre("plateInfinity"),
        //                ItemBracketHandler.getItem("ForbiddenMagic:EldritchOrb", 0),
        //                OreBracketHandler.getOre("plateInfinity"), null, null),
        //                arrayOf(null, null, OreBracketHandler.getOre("plateInfinity"),
        //                        OreBracketHandler.getOre("plateInfinity"),
        //                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
        //                        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //                        null, null), arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateInfinity"),
        //                ItemBracketHandler.getItem("ForbiddenMagic:EldritchOrb", 0),
        //                OreBracketHandler.getOre("plateInfinity"),
        //                ItemBracketHandler.getItem("ForbiddenMagic:EldritchOrb", 0),
        //                OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                null), arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0),
        //                OreBracketHandler.getOre("plateInfinity"), ItemBracketHandler.getItem("Avaritia:Resource", 5),
        //                OreBracketHandler.getOre("plateInfinity"),
        //                ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium")),
        //                arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                        OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                        OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //                        OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                        OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                        OreBracketHandler.getOre("plateCosmicNeutronium"), null),
        //                arrayOf<IIngredient?>(null, null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                        OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                        OreBracketHandler.getOre("plateCosmicNeutronium"), null, null, null), arrayOfNulls(9),
        //                arrayOfNulls(9)))

        //TODO Replace ("TGregworks:tGregToolPartLargeSwordBlade", 1511)
        //val item2 = ItemBracketHandler.getItem("Avaritia:Infinity_Sword", 0)
        //val array: Array<Array<IIngredient?>?> = arrayOfNulls(9)
        //val n = 0
        //val array2 = arrayOf<IIngredient?>(null, null, null, null, null, null, null,
        //        OreBracketHandler.getOre("plateInfinity"), null)
        //val n2 = 8
        //val item3 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargeSwordBlade", 1511)
        //val hashMap2 = HashMap<String, IData>()
        //hashMap2["material"] = ExpandString.asData("Neutronium")
        //array2[n2] = item3.withTag(ExpandAnyDict.asData(hashMap2))
        //array[n] = array2
        //array[1] = arrayOf(null, null, null, null, null, null, OreBracketHandler.getOre("plateInfinity"),
        //        ItemBracketHandler.getItem("TaintedMagic:ItemPrimordialEdge", 0),
        //        OreBracketHandler.getOre("plateInfinity"))
        //array[2] = arrayOf(null, null, null, null, null, OreBracketHandler.getOre("plateInfinity"),
        //        ItemBracketHandler.getItem("IC2:itemNanoSaber", OreDictionary.WILDCARD_VALUE), OreBracketHandler.getOre("plateInfinity"), null)
        //array[3] = arrayOf(null, null, null, null, OreBracketHandler.getOre("plateInfinity"),
        //        ItemBracketHandler.getItem("ThaumicTinkerer:ichorSwordGem", OreDictionary.WILDCARD_VALUE),
        //        OreBracketHandler.getOre("plateInfinity"), null, null)
        //array[4] = arrayOf(null, ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5), null,
        //        OreBracketHandler.getOre("plateInfinity"), ItemBracketHandler.getItem("Avaritia:Skull_Sword", 0),
        //        OreBracketHandler.getOre("plateInfinity"), null, null, null)
        //array[5] = arrayOf(null, null, ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5),
        //        ItemBracketHandler.getItem("DraconicEvolution:draconicDistructionStaff", OreDictionary.WILDCARD_VALUE),
        //        OreBracketHandler.getOre("plateInfinity"), null, null, null, null)
        //array[6] = arrayOf(null, null, OreBracketHandler.getOre("blockCosmicNeutronium"),
        //        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5), null, null, null, null, null)
        //array[7] = arrayOf(null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null,
        //        ItemBracketHandler.getItem("TaintedMagic:ItemMaterial", 5), null, null, null, null)
        //array[8] = arrayOf(ItemBracketHandler.getItem("Avaritia:Resource", 5), null, null, null, null, null, null, null,
        //        null)
        //ExtremeCrafting.addShaped(item2, array)

        //TODO Replace ("TGregworks:tGregToolPartLargePlate", 1511)
        //val item4 = ItemBracketHandler.getItem("Avaritia:Infinity_Pickaxe", 0)
        //val hashMap3 = HashMap<String, IData>()
        //val s = "ench"
        //val array3 = arrayOf<IData?>(null)
        //val n3 = 0
        //val hashMap4 = HashMap<String, IData>()
        //hashMap4["lvl"] = ExpandShort.asNBT(10.toShort())
        //hashMap4["id"] = ExpandShort.asNBT(35.toShort())
        //array3[n3] = ExpandAnyDict.asData(hashMap4)
        //hashMap3[s] = ExpandAnyArray.asData(array3)
        //hashMap3["hammer"] = ExpandByte.asData(0.toByte())
        //val withTag = item4.withTag(ExpandAnyDict.asData(hashMap3))
        //val array4: Array<Array<IIngredient?>?> = arrayOfNulls(9)
        //array4[0] = arrayOf(null, OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"), null)
        //val n4 = 1
        //val array5 = arrayOfNulls<IIngredient>(9)
        //array5[0] = OreBracketHandler.getOre("plateInfinity")
        //val n5 = 1
        //val item5 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1511)
        //val hashMap5 = HashMap<String, IData>()
        //hashMap5["material"] = ExpandString.asData("Neutronium")
        //array5[n5] = item5.withTag(ExpandAnyDict.asData(hashMap5))
        //val n6 = 2
        //val item6 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1511)
        //val hashMap6 = HashMap<String, IData>()
        //hashMap6["material"] = ExpandString.asData("Neutronium")
        //array5[n6] = item6.withTag(ExpandAnyDict.asData(hashMap6))
        //array5[3] = ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_diamond", OreDictionary.WILDCARD_VALUE)
        //array5[4] = ItemBracketHandler.getItem("DraconicEvolution:draconicPickaxe", 0)
        //array5[5] = ItemBracketHandler.getItem("GraviSuite:advDDrill", 1)
        //val n7 = 6
        //val item7 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1511)
        //val hashMap7 = HashMap<String, IData>()
        //hashMap7["material"] = ExpandString.asData("Neutronium")
        //array5[n7] = item7.withTag(ExpandAnyDict.asData(hashMap7))
        //val n8 = 7
        //val item8 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1511)
        //val hashMap8 = HashMap<String, IData>()
        //hashMap8["material"] = ExpandString.asData("Neutronium")
        //array5[n8] = item8.withTag(ExpandAnyDict.asData(hashMap8))
        //array5[8] = OreBracketHandler.getOre("plateInfinity")
        //array4[n4] = array5
        //array4[2] = arrayOf(OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"), null,
        //        ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0),
        //        ItemBracketHandler.getItem("ThaumicTinkerer:ichorPickGem", OreDictionary.WILDCARD_VALUE),
        //        ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0), null,
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"))
        //array4[3] = arrayOf(null, null, null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null, null,
        //        null)
        //array4[4] = arrayOf(null, null, null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null, null,
        //        null)
        //array4[5] = arrayOf(null, null, null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null, null,
        //        null)
        //array4[6] = arrayOf(null, null, null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null, null,
        //        null)
        //array4[7] = arrayOf(null, null, null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null, null,
        //        null)
        //array4[8] = arrayOf(null, null, null, ItemBracketHandler.getItem("Avaritia:big_pearl", 0),
        //        ItemBracketHandler.getItem("Avaritia:Resource", 5), ItemBracketHandler.getItem("Avaritia:big_pearl", 0),
        //        null, null, null)
        //ExtremeCrafting.addShaped(withTag, array4)

        val item9 = ItemBracketHandler.getItem("Avaritia:Infinity_Shovel", 0)
        val hashMap9 = HashMap<String, IData>()
        hashMap9["destroyer"] = ExpandByte.asData(0.toByte())
        ExtremeCrafting.addShaped(item9.withTag(ExpandAnyDict.asData(hashMap9)),
                arrayOf(arrayOf<IIngredient?>(null, null, null, null, null, null,
                        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
                        OreBracketHandler.getOre("plateInfinity")),
                        arrayOf(null, null, null, null, null, OreBracketHandler.getOre("plateInfinity"),
                                ItemBracketHandler.getItem("GraviSuite:advDDrill", 1),
                                ItemBracketHandler.getItem("DraconicEvolution:draconicShovel", 0),
                                OreBracketHandler.getOre("plateInfinity")), arrayOf(null, null, null, null, null, null,
                        ItemBracketHandler.getItem("ThaumicTinkerer:ichorShovelGem", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_diamond", 0),
                        OreBracketHandler.getOre("plateInfinity")), arrayOf<IIngredient?>(null, null, null, null, null,
                        OreBracketHandler.getOre("blockCosmicNeutronium"), null,
                        OreBracketHandler.getOre("plateInfinity"), null),
                        arrayOf<IIngredient?>(null, null, null, null, OreBracketHandler.getOre("blockCosmicNeutronium"),
                                null, null, null, null),
                        arrayOf<IIngredient?>(null, null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null,
                                null, null, null, null),
                        arrayOf(null, ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0),
                                OreBracketHandler.getOre("blockCosmicNeutronium"), null, null, null, null, null, null),
                        arrayOf(ItemBracketHandler.getItem("Avaritia:big_pearl", 0),
                                OreBracketHandler.getOre("blockCosmicNeutronium"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0), null, null, null, null,
                                null, null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("Avaritia:Resource", 5),
                        ItemBracketHandler.getItem("Avaritia:big_pearl", 0), null, null, null, null, null, null, null)))
        val item10 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 9000)
        val hashMap10 = HashMap<String, IData>()
        hashMap10["cap"] = ExpandString.asData("matrix")
        hashMap10["rod"] = ExpandString.asData("infinity")
        val withTag2 = item10.withTag(ExpandAnyDict.asData(hashMap10))
        val array6: Array<Array<IIngredient?>?> = arrayOfNulls(9)
        array6[0] = arrayOf(null, null, OreBracketHandler.getOre("plateInfinity"), null, null, null, null, null, null)
        array6[1] = arrayOf(null, OreBracketHandler.getOre("plateInfinity"),
                ItemBracketHandler.getItem("ThaumicTinkerer:blockTalisman", 0),
                OreBracketHandler.getOre("plateInfinity"), null, null, null, null, null)
        array6[2] = arrayOf(OreBracketHandler.getOre("plateInfinity"),
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0),
                ItemBracketHandler.getItem("Avaritia:Resource", 5), OreBracketHandler.getOre("plateCosmicNeutronium"),
                ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0), null, null, null, null)
        val n9 = 3
        val array7 = arrayOfNulls<IIngredient>(9)
        array7[0] = null
        array7[1] = OreBracketHandler.getOre("plateInfinity")
        array7[2] = OreBracketHandler.getOre("plateCosmicNeutronium")
        val n10 = 3
        val item11 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 150)
        val hashMap11 = HashMap<String, IData>()
        hashMap11["cap"] = ExpandString.asData("ICHOR")
        hashMap11["rod"] = ExpandString.asData("ICHORCLOTH")
        hashMap11["sceptre"] = ExpandInt.toData(1)
        array7[n10] = item11.withTag(ExpandAnyDict.asData(hashMap11))
        array7[4] = OreBracketHandler.getOre("plateCosmicNeutronium")
        array7[5] = ItemBracketHandler.getItem("AWWayofTime:waterScribeTool", 0)
        array7[6] = null
        array7[8] = null.also { array7[7] = it }
        array6[n9] = array7
        val n11 = 4
        val array8 = arrayOf(null, null, ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0),
                OreBracketHandler.getOre("plateCosmicNeutronium"), null, null, null, null, null)
        val n12 = 4
        val item12 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 150)
        val hashMap12 = HashMap<String, IData>()
        hashMap12["cap"] = ExpandString.asData("ICHOR")
        hashMap12["rod"] = ExpandString.asData("ICHORCLOTH")
        hashMap12["sceptre"] = ExpandInt.toData(1)
        array8[n12] = item12.withTag(ExpandAnyDict.asData(hashMap12))
        array8[5] = OreBracketHandler.getOre("plateCosmicNeutronium")
        array8[6] = ItemBracketHandler.getItem("AWWayofTime:airScribeTool", 0)
        array8[8] = null.also { array8[7] = it }
        array6[n11] = array8
        val n13 = 5
        val array9 = arrayOf(null, null, null, ItemBracketHandler.getItem("AWWayofTime:fireScribeTool", 0),
                OreBracketHandler.getOre("plateCosmicNeutronium"), null, null, null, null)
        val n14 = 5
        val item13 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 150)
        val hashMap13 = HashMap<String, IData>()
        hashMap13["cap"] = ExpandString.asData("ICHOR")
        hashMap13["rod"] = ExpandString.asData("ICHORCLOTH")
        hashMap13["sceptre"] = ExpandInt.toData(1)
        array9[n14] = item13.withTag(ExpandAnyDict.asData(hashMap13))
        array9[6] = OreBracketHandler.getOre("plateCosmicNeutronium")
        array9[7] = OreBracketHandler.getOre("plateInfinity")
        array9[8] = null
        array6[n13] = array9
        array6[6] = arrayOf(null, null, null, null, ItemBracketHandler.getItem("AWWayofTime:earthScribeTool", 0),
                OreBracketHandler.getOre("plateCosmicNeutronium"), ItemBracketHandler.getItem("Avaritia:Resource", 5),
                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0), OreBracketHandler.getOre("plateInfinity"))
        array6[7] = arrayOf(null, null, null, null, null, OreBracketHandler.getOre("plateInfinity"),
                ItemBracketHandler.getItem("ThaumicTinkerer:blockTalisman", 0),
                OreBracketHandler.getOre("plateInfinity"), null)
        array6[8] = arrayOf(null, null, null, null, null, null, OreBracketHandler.getOre("plateInfinity"), null, null)
        ExtremeCrafting.addShaped(withTag2, array6)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("Avaritia:Infinity_Axe", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateInfinity"), null, null, null, null,
                        null, null, null), arrayOf(OreBracketHandler.getOre("plateInfinity"),
                        ItemBracketHandler.getItem("GraviSuite:advChainsaw", 1),
                        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
                        OreBracketHandler.getOre("plateInfinity"), null, null, null, null),
                        arrayOf(OreBracketHandler.getOre("plateInfinity"),
                                ItemBracketHandler.getItem("ThaumicTinkerer:ichorAxeGem", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("DraconicEvolution:draconicAxe", 0),
                                OreBracketHandler.getOre("plateInfinity"), null, null, null, null, null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateInfinity"),
                                OreBracketHandler.getOre("blockCosmicNeutronium"), null, null, null, null, null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null,
                                null, null, null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null,
                                null, null, null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null,
                                null, null, null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockCosmicNeutronium"), null, null,
                                null, null, null, null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("TaintedMagic:ItemFocusEldritch", 0),
                                ItemBracketHandler.getItem("Avaritia:Resource", 5),
                                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0), null, null, null, null,
                                null)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("Avaritia:Infinity_Bow", 0),
                arrayOf(arrayOf(null, null, null, OreBracketHandler.getOre("plateInfinity"),
                        OreBracketHandler.getOre("plateInfinity"),
                        ItemBracketHandler.getItem("TaintedMagic:ItemFocusMeteorology", 0), null, null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateInfinity"), null,
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1), null, null, null, null),
                        arrayOf(null, OreBracketHandler.getOre("plateInfinity"), null, null,
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1), null, null, null, null),
                        arrayOf(OreBracketHandler.getOre("plateInfinity"), null, null, null,
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1), null, null, null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Avaritia:Resource", 5), null, null, null,
                                ItemBracketHandler.getItem("DraconicEvolution:draconicBow", 0),
                                ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0), null, null, null),
                        arrayOf(OreBracketHandler.getOre("plateInfinity"), null, null, null,
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1), null, null, null, null),
                        arrayOf(null, OreBracketHandler.getOre("plateInfinity"), null, null,
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1), null, null, null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateInfinity"), null,
                                ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 1), null, null, null, null),
                        arrayOf(null, null, null, OreBracketHandler.getOre("plateInfinity"),
                                OreBracketHandler.getOre("plateInfinity"),
                                ItemBracketHandler.getItem("TaintedMagic:ItemFocusMeteorology", 0), null, null, null)))
        Infusion.addRecipe("AKASHIC", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17397),
                arrayOf(ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 6),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 6),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 6),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 6),
                        ItemBracketHandler.getItem("Avaritia:big_pearl", 0),
                        ItemBracketHandler.getItem("gadomancy:BlockKnowledgeBook", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemThaumonomicon", 0),
                        ItemBracketHandler.getItem("TaintedMagic:ItemFocusMeteorology", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 1),
                        ItemBracketHandler.getItem("gadomancy:BlockKnowledgeBook", 0),
                        ItemBracketHandler.getItem("Avaritia:big_pearl", 0),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 6),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 6),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 6),
                        ItemBracketHandler.getItem("thaumicbases:knoseFragment", 6)),
                "praecantatio 512, cognitio 128, sensus 96, luxuria 96, tempus 64, terminus 128",
                ItemBracketHandler.getItem("Avaritia:Akashic_Record", 0), 24)
        Research.refreshResearchRecipe("AKASHIC")

        //TODO Replace ("AdvancedSolarPanel:ultimate_solar_helmet", OreDictionary.WILDCARD_VALUE)
        //val item14 = ItemBracketHandler.getItem("Avaritia:Infinity_Helm", 0)
        //val array10: Array<Array<IIngredient?>?> = arrayOfNulls(9)
        //array10[0] = arrayOf(null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        null, null)
        //array10[1] = arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        ItemBracketHandler.getItem("AdvancedSolarPanel:ultimate_solar_helmet", OreDictionary.WILDCARD_VALUE),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null)
        //array10[2] = arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //        ItemBracketHandler.getItem("Avaritia:Resource", 5),
        //        ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothHelmGem", OreDictionary.WILDCARD_VALUE),
        //        ItemBracketHandler.getItem("Avaritia:Resource", 5), null,
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null)
        //val array11 = arrayOfNulls<IIngredient>(9)
        //array11[0] = null
        //array11[1] = OreBracketHandler.getOre("plateCosmicNeutronium")
        //array11[2] = OreBracketHandler.getOre("plateInfinity")
        //val n16 = 3
        //val item15 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_helmet", 0)
        //val hashMap14 = HashMap<String, IData>()
        //hashMap14["LPStored"] = ExpandInt.toData(100000)
        //array11[n16] = item15.withTag(ExpandAnyDict.asData(hashMap14))
        //array11[4] = ItemBracketHandler.getItem("DraconicEvolution:draconicHelm", 0)
        //array11[5] = ItemBracketHandler.getItem("AWWayofTime:sanguineHelmet", 0)
        //array11[6] = OreBracketHandler.getOre("plateInfinity")
        //array11[7] = OreBracketHandler.getOre("plateCosmicNeutronium")
        //array11[8] = null
        //array10[3] = array11
        //array10[4] = arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_helmetglasses", 0),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null)
        //array10[5] = arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0),
        //        ItemBracketHandler.getItem("BloodArsenal:sigil_of_divinity", 0),
        //        ItemBracketHandler.getItem("EMT:ShieldFocus", 0), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null)
        //array10[6] = arrayOfNulls(9)
        //array10[7] = arrayOfNulls(9)
        //array10[8] = arrayOfNulls(9)
        //ExtremeCrafting.addShaped(item14, array10)

        //TODO Replace ("GalaxySpace:item.spacesuit_jetplate", 0)
        //val item16 = ItemBracketHandler.getItem("Avaritia:Infinity_Chest", 0)
        //val array12 = arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null, null, null,
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        null), arrayOf<IIngredient?>(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //        null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium")),
        //        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //                OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateInfinity"),
        //                OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium")),
        //        arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //                ItemBracketHandler.getItem("GraviSuite:graviChestPlate", 1),
        //                OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"), null), null, null, null, null, null)
        //val n17 = 4
        //val array13 = arrayOfNulls<IIngredient>(9)
        //array13[0] = null
        //array13[1] = OreBracketHandler.getOre("plateCosmicNeutronium")
        //array13[2] = OreBracketHandler.getOre("plateInfinity")
        //val n18 = 3
        //val item17 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_chestplate", 0)
        //val hashMap15 = HashMap<String, IData>()
        //hashMap15["LPStored"] = ExpandInt.toData(100000)
        //array13[n18] = item17.withTag(ExpandAnyDict.asData(hashMap15))
        //array13[4] = ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothChestGem", OreDictionary.WILDCARD_VALUE)
        //array13[5] = ItemBracketHandler.getItem("AWWayofTime:sanguineRobe", 0)
        //array13[6] = OreBracketHandler.getOre("plateInfinity")
        //array13[7] = OreBracketHandler.getOre("plateCosmicNeutronium")
        //array13[8] = null
        //array12[n17] = array13
        //array12[5] = arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"),
        //        ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_jetplate", 0),
        //        ItemBracketHandler.getItem("Avaritia:Resource", 5),
        //        ItemBracketHandler.getItem("DraconicEvolution:draconicChest", 0),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"), null)
        //array12[6] = arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), ItemBracketHandler.getItem("EMT:ShieldFocus", 0),
        //        ItemBracketHandler.getItem("BloodArsenal:sigil_of_divinity", 0),
        //        ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null)
        //array12[7] = arrayOf(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"), null)
        //array12[8] = arrayOf(null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        null, null)
        //ExtremeCrafting.addShaped(item16, array12)

        //TODO Replace ("GalaxySpace:item.spacesuit_leg", 0)
        //val item18 = ItemBracketHandler.getItem("Avaritia:Infinity_Pants", 0)
        //val array14: Array<Array<IIngredient?>?> = arrayOfNulls(9)
        //array14[0] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //val n19 = 1
        //val array15 = arrayOfNulls<IIngredient>(9)
        //array15[0] = OreBracketHandler.getOre("plateCosmicNeutronium")
        //array15[1] = ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0)
        //array15[2] = ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_leg", 0)
        //val n20 = 3
        //val item19 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_leggings", 0)
        //val hashMap16 = HashMap<String, IData>()
        //hashMap16["LPStored"] = ExpandInt.toData(100000)
        //array15[n20] = item19.withTag(ExpandAnyDict.asData(hashMap16))
        //array15[4] = ItemBracketHandler.getItem("BloodArsenal:sigil_of_divinity", 0)
        //array15[5] = ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothLegsGem", OreDictionary.WILDCARD_VALUE)
        //array15[6] = ItemBracketHandler.getItem("IC2:itemArmorQuantumLegs", 26)
        //array15[7] = ItemBracketHandler.getItem("EMT:ShieldFocus", 0)
        //array15[8] = OreBracketHandler.getOre("plateCosmicNeutronium")
        //array14[n19] = array15
        //array14[2] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"),
        //        ItemBracketHandler.getItem("DraconicEvolution:draconicLeggs", 0),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //array14[3] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), ItemBracketHandler.getItem("Avaritia:Resource", 5),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //array14[4] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //        null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //array14[5] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        ItemBracketHandler.getItem("Avaritia:big_pearl", 0), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        null, null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        ItemBracketHandler.getItem("Avaritia:big_pearl", 0), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //array14[6] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //        null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //array14[7] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //        null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //array14[8] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        null, null, null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //ExtremeCrafting.addShaped(item18, array14)

        //TODO Replace ("GalaxySpace:item.spacesuit_gravityboots", 0)
        //val item20 = ItemBracketHandler.getItem("Avaritia:Infinity_Shoes", 0)
        //val array16 = arrayOf(arrayOf<IIngredient?>(null, null, null, null, null, null, null, null, null),
        //        arrayOf<IIngredient?>(null, null, null, null, null, null, null, null, null),
        //        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //                OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"), null),
        //        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                null), arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null),
        //        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateInfinity"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //                OreBracketHandler.getOre("plateCosmicNeutronium"), OreBracketHandler.getOre("plateInfinity"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium"),
        //                OreBracketHandler.getOre("plateCosmicNeutronium")), null, null, null)
        //val n21 = 6
        //val array17 = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        ItemBracketHandler.getItem("ThaumicTinkerer:ichorclothBootsGem", OreDictionary.WILDCARD_VALUE),
        //        ItemBracketHandler.getItem("DraconicEvolution:draconicBoots", 0),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //        OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        ItemBracketHandler.getItem("IC2:itemArmorQuantumBoots", 1), null, null)
        //val n22 = 7
        //val item21 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_boots", 0)
        //val hashMap17 = HashMap<String, IData>()
        //hashMap17["LPStored"] = ExpandInt.toData(100000)
        //array17[n22] = item21.withTag(ExpandAnyDict.asData(hashMap17))
        //array17[8] = OreBracketHandler.getOre("plateCosmicNeutronium")
        //array16[n21] = array17
        //array16[7] = arrayOf(OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        ItemBracketHandler.getItem("TaintedMagic:ItemFocusTime", 0),
        //        ItemBracketHandler.getItem("AWWayofTime:sanguineBoots", 0),
        //        OreBracketHandler.getOre("plateCosmicNeutronium"), null,
        //        OreBracketHandler.getOre("plateCosmicNeutronium"),
        //        ItemBracketHandler.getItem("GalaxySpace:item.spacesuit_gravityboots", 0),
        //        ItemBracketHandler.getItem("EMT:ShieldFocus", 0), OreBracketHandler.getOre("plateCosmicNeutronium"))
        //array16[8] = arrayOf(OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        ItemBracketHandler.getItem("BloodArsenal:sigil_of_divinity", 0),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"),
        //        OreBracketHandler.getOre("plateInfinity"), OreBracketHandler.getOre("plateInfinity"))
        //ExtremeCrafting.addShaped(item20, array16)

        //TODO Replace ("TConstruct:heavyPlate", 315) and ("TConstruct:heavyPlate", 500)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("Avaritia:Neutron_Collector", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("blockBlackPlutonium"),
        //                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //                ItemBracketHandler.getItem("Avaritia:Crystal_Matrix", 0),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //                OreBracketHandler.getOre("blockBlackPlutonium")),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("Avaritia:Resource_Block", 0), null, null,
        //                        null, ItemBracketHandler.getItem("TConstruct:heavyPlate", 315), null, null, null,
        //                        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0)),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 315), null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32697), null,
        //                        OreBracketHandler.getOre("circuitInfinite"), null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32697), null,
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 315)),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 500), null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32687), null,
        //                        OreBracketHandler.getOre("circuitInfinite"), null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32687), null,
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500)),
        //                arrayOf(ItemBracketHandler.getItem("Avaritia:Crystal_Matrix", 0),
        //                        OreBracketHandler.getOre("plateInfinity"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32608),
        //                        OreBracketHandler.getOre("plateInfinity"),
        //                        ItemBracketHandler.getItem("Avaritia:Resource", 5),
        //                        OreBracketHandler.getOre("plateInfinity"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32608),
        //                        OreBracketHandler.getOre("plateInfinity"),
        //                        ItemBracketHandler.getItem("Avaritia:Crystal_Matrix", 0)),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 500), null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32687), null,
        //                        OreBracketHandler.getOre("circuitInfinite"), null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32687), null,
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500)),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 315), null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32697), null,
        //                        OreBracketHandler.getOre("circuitInfinite"), null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32697), null,
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 315)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("Avaritia:Resource_Block", 0), null, null,
        //                        null, ItemBracketHandler.getItem("TConstruct:heavyPlate", 315), null, null, null,
        //                        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0)),
        //                arrayOf(OreBracketHandler.getOre("blockBlackPlutonium"),
        //                        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //                        ItemBracketHandler.getItem("Avaritia:Crystal_Matrix", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //                        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //                        OreBracketHandler.getOre("blockBlackPlutonium"))))

        //TODO Replace ("TConstruct:heavyPlate", 315) and ("TConstruct:heavyPlate", 500)
        //val item22 = ItemBracketHandler.getItem("Avaritia:Neutronium_Compressor", 0)
        //val array18: Array<Array<IIngredient?>?> = arrayOfNulls(9)
        //array18[0] = arrayOf(ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //        ItemBracketHandler.getItem("Avaritia:Resource", 1),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //        ItemBracketHandler.getItem("Avaritia:Resource", 1),
        //        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0))
        //val n23 = 1
        //val array19 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("Avaritia:Resource", 1), null,
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647), null, null, null, null, null, null)
        //val n24 = 4
        //val item23 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1657)
        //val hashMap18 = HashMap<String, IData>()
        //hashMap18["material"] = ExpandString.asData("BlackPlutonium")
        //array19[n24] = item23.withTag(ExpandAnyDict.asData(hashMap18))
        //array19[5] = null
        //array19[6] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647)
        //array19[7] = null
        //array19[8] = ItemBracketHandler.getItem("Avaritia:Resource", 1)
        //array18[n23] = array19
        //val n25 = 2
        //val array20 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32637),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32608),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32637), null, null, null, null, null)
        //val n26 = 4
        //val item24 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1657)
        //val hashMap19 = HashMap<String, IData>()
        //hashMap19["material"] = ExpandString.asData("BlackPlutonium")
        //array20[n26] = item24.withTag(ExpandAnyDict.asData(hashMap19))
        //array20[5] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32637)
        //array20[6] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32608)
        //array20[7] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32637)
        //array20[8] = ItemBracketHandler.getItem("TConstruct:heavyPlate", 315)
        //array18[n25] = array20
        //array18[3] = arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 500), null,
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647),
        //        OreBracketHandler.getOre("circuitInfinite"), OreBracketHandler.getOre("plateNeutronium"),
        //        OreBracketHandler.getOre("circuitInfinite"),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647), null,
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500))
        //val n27 = 4
        //val array21 = arrayOfNulls<IIngredient>(9)
        //array21[0] = ItemBracketHandler.getItem("TConstruct:heavyPlate", 500)
        //val n28 = 1
        //val item25 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1657)
        //val hashMap20 = HashMap<String, IData>()
        //hashMap20["material"] = ExpandString.asData("BlackPlutonium")
        //array21[n28] = item25.withTag(ExpandAnyDict.asData(hashMap20))
        //val n29 = 2
        //val item26 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1657)
        //val hashMap21 = HashMap<String, IData>()
        //hashMap21["material"] = ExpandString.asData("BlackPlutonium")
        //array21[n29] = item26.withTag(ExpandAnyDict.asData(hashMap21))
        //array21[3] = OreBracketHandler.getOre("plateNeutronium")
        //array21[4] = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 10812)
        //array21[5] = OreBracketHandler.getOre("plateNeutronium")
        //val n30 = 6
        //val item27 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1657)
        //val hashMap22 = HashMap<String, IData>()
        //hashMap22["material"] = ExpandString.asData("BlackPlutonium")
        //array21[n30] = item27.withTag(ExpandAnyDict.asData(hashMap22))
        //val n31 = 7
        //val item28 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1657)
        //val hashMap23 = HashMap<String, IData>()
        //hashMap23["material"] = ExpandString.asData("BlackPlutonium")
        //array21[n31] = item28.withTag(ExpandAnyDict.asData(hashMap23))
        //array21[8] = ItemBracketHandler.getItem("TConstruct:heavyPlate", 500)
        //array18[n27] = array21
        //array18[5] = arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 500), null,
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647),
        //        OreBracketHandler.getOre("circuitInfinite"), OreBracketHandler.getOre("plateNeutronium"),
        //        OreBracketHandler.getOre("circuitInfinite"),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647), null,
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500))
        //val n32 = 6
        //val array22 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32637),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32608),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32637), null, null, null, null, null)
        //val n33 = 4
        //val item29 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1657)
        //val hashMap24 = HashMap<String, IData>()
        //hashMap24["material"] = ExpandString.asData("BlackPlutonium")
        //array22[n33] = item29.withTag(ExpandAnyDict.asData(hashMap24))
        //array22[5] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32637)
        //array22[6] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32608)
        //array22[7] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32637)
        //array22[8] = ItemBracketHandler.getItem("TConstruct:heavyPlate", 315)
        //array18[n32] = array22
        //val n34 = 7
        //val array23 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("Avaritia:Resource", 1), null,
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647), null, null, null, null, null, null)
        //val n35 = 4
        //val item30 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1657)
        //val hashMap25 = HashMap<String, IData>()
        //hashMap25["material"] = ExpandString.asData("BlackPlutonium")
        //array23[n35] = item30.withTag(ExpandAnyDict.asData(hashMap25))
        //array23[5] = null
        //array23[6] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647)
        //array23[7] = null
        //array23[8] = ItemBracketHandler.getItem("Avaritia:Resource", 1)
        //array18[n34] = array23
        //array18[8] = arrayOf(ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //        ItemBracketHandler.getItem("Avaritia:Resource", 1),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //        ItemBracketHandler.getItem("Avaritia:Resource", 1),
        //        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 500),
        //        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0))
        //ExtremeCrafting.addShaped(item22, array18)

        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Avaritia:Resource", 3).amount(9),
                ItemBracketHandler.getItem("Avaritia:Resource", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32309).amount(0), 2400,  VoltageLevels.HV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Avaritia:Resource", 4).amount(9),
                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 4800,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Avaritia:Resource", 1),
                ItemBracketHandler.getItem("Avaritia:Resource", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:nether_star", 0).amount(2), 1200,  VoltageLevels.HV)
        Compressor.addRecipe(ItemBracketHandler.getItem("Avaritia:Double_Craft", 0),
                ItemBracketHandler.getItem("minecraft:crafting_table", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("Avaritia:Triple_Craft", 0),
                ItemBracketHandler.getItem("Avaritia:Double_Craft", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("Avaritia:Crystal_Matrix", 0),
                ItemBracketHandler.getItem("Avaritia:Resource", 1).amount(9))
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:crafting_table", 0).amount(9),
                ItemBracketHandler.getItem("Avaritia:Double_Craft", 0))
        Extractor.addRecipe(ItemBracketHandler.getItem("Avaritia:Double_Craft", 0).amount(9),
                ItemBracketHandler.getItem("Avaritia:Triple_Craft", 0))
        Extractor.addRecipe(ItemBracketHandler.getItem("Avaritia:Resource", 1).amount(9),
                ItemBracketHandler.getItem("Avaritia:Crystal_Matrix", 0))
        Extruder.addRecipe(ItemBracketHandler.getItem("Avaritia:Resource", 4).amount(9),
                ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32355).amount(0), 1000, VoltageLevels.UV)
        Extruder.addRecipe(ItemBracketHandler.getItem("Avaritia:Resource", 6).amount(9),
                ItemBracketHandler.getItem("Avaritia:Resource_Block", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32355).amount(0), 1200, VoltageLevels.UV)
        Extruder.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17397),
                ItemBracketHandler.getItem("Avaritia:Resource", 6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32350).amount(0), 4000, VoltageLevels.UV)
        Extruder.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17397),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11397),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32350).amount(0), 4000, VoltageLevels.UV)
        Extruder.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17982),
                ItemBracketHandler.getItem("Avaritia:Resource", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32350).amount(0), 3000, VoltageLevels.UV)
        Extruder.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17982),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11982),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32350).amount(0), 3000, VoltageLevels.UV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("Avaritia:Resource", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.StainlessSteelBars", 0), 200, VoltageLevels.MV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("Avaritia:Resource", 2).amount(9)),
                ItemBracketHandler.getItem("Avaritia:Resource", 3), intArrayOf(10000), 300, VoltageLevels.LULV)
        fox.spiteful.avaritia.compat.minetweaker.Compressor.add(ItemBracketHandler.getItem("Avaritia:Resource", 5), 64,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2394))
    }
}