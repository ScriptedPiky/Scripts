package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels
import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import minetweaker.mods.ic2.machines.Extractor
import net.minecraftforge.oredict.OreDictionary

class HardcoreEnderExpansion : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:altar_nexus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:essence_altar", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:void_chest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:biome_compass", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_ingot", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:obsidian_rod", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick_slab", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:decomposition_table", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:experience_table", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:energy_extraction_table", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:accumulation_table", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:spectral_tear", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:energy_wand_core", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:energy_wand", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:spooky_log", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:spooky_leaves", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:blank_gem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:spatial_dash_gem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:transference_gem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:schorching_pickaxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:charm_pouch", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 256))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 257))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 258))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 259))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 260))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 261))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 262))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 263))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 264))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 265))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 266))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:altar_nexus", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("gemEnderEye"), OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemEnderEye"),
                                OreBracketHandler.getOre("plateDiamond"), OreBracketHandler.getOre("gemEnderEye")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDiamond"),
                                OreBracketHandler.getOre("gemEnderEye"), OreBracketHandler.getOre("plateDiamond"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:essence_altar", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        OreBracketHandler.getOre("itemLeather"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:bookshelf", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:altar_nexus", 0),
                                ItemBracketHandler.getItem("minecraft:bookshelf", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseObsidian"),
                                OreBracketHandler.getOre("blockEnder"),
                                OreBracketHandler.getOre("plateDenseObsidian"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:void_chest", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("plateEnderEye"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0),
                                ItemBracketHandler.getItem("EnderStorage:enderChest", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0)),
                        arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                OreBracketHandler.getOre("plateEnderEye"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:biome_compass", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwHeeEndium"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("boltHeeEndium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringHeeEndium"),
                                OreBracketHandler.getOre("plateHeeEndium"), OreBracketHandler.getOre("ringHeeEndium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltRedAlloy"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwHeeEndium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:obsidian_rod", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"), null, null),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:obsidian_fragment", 0), null),
                        arrayOf<IIngredient?>(null, null,
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:obsidian_fragment", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick_slab", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick", OreDictionary.WILDCARD_VALUE), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:experience_table", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("lensEnderEye"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("bottleEmpty"), OreBracketHandler.getOre("plateThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockStainlessSteel"),
                                OreBracketHandler.getOre("blockHeeEndium"),
                                OreBracketHandler.getOre("blockStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("HardcoreEnderExpansion:energy_extraction_table", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("irontank:ironTank", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                OreBracketHandler.getOre("plateThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockStainlessSteel"),
                                OreBracketHandler.getOre("blockHeeEndium"),
                                OreBracketHandler.getOre("blockStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:accumulation_table", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("irontank:ironTank", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:energy_wand_core", 0),
                                OreBracketHandler.getOre("plateThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockStainlessSteel"),
                                OreBracketHandler.getOre("blockHeeEndium"),
                                OreBracketHandler.getOre("blockStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:spectral_tear", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0),
                                ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:spectral_tear", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:silverfish_blood", 0),
                        ItemBracketHandler.getItem("minecraft:spider_eye", 0),
                        ItemBracketHandler.getItem("minecraft:bone", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:instability_orb", 0),
                        ItemBracketHandler.getItem("minecraft:egg", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:energy_wand", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("screwTitanium"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:energy_wand_core", 0)),
                        arrayOf(OreBracketHandler.getOre("screwTitanium"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:obsidian_rod", 0),
                                OreBracketHandler.getOre("screwTitanium")),
                        arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:obsidian_rod", 0),
                                OreBracketHandler.getOre("screwTitanium"),
                                OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("HardcoreEnderExpansion:spooky_leaves", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:dry_splinter", 0),
                        ItemBracketHandler.getItem("minecraft:deadbush", 0),
                        ItemBracketHandler.getItem("minecraft:sand", 0),
                        ItemBracketHandler.getItem("minecraft:dye", 15),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2530)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:charm_pouch", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:rune", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:rune", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("Thaumcraft:FocusPouch", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:rune", OreDictionary.WILDCARD_VALUE)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:rune", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 0).amount(4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("dustEnderPearl"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(OreBracketHandler.getOre("dustEnderPearl"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                OreBracketHandler.getOre("dustEnderPearl")),
                        arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                OreBracketHandler.getOre("dustEnderPearl"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 256),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 0),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 1).amount(4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("itemFlint"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(OreBracketHandler.getOre("itemBlazePowder"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                OreBracketHandler.getOre("dyeBlack")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:instability_orb", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 257),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 1),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 2).amount(4),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:food", 1),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32113),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                OreBracketHandler.getOre("dustSugar")),
                        arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                OreBracketHandler.getOre("flowerRed"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 258),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 2),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 3).amount(4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("dustLead"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:web", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                ItemBracketHandler.getItem("minecraft:web", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                ItemBracketHandler.getItem("minecraft:fermented_spider_eye", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 259),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 3),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 4).amount(4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("itemBlazePowder"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:poisonous_potato", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                ItemBracketHandler.getItem("minecraft:fermented_spider_eye", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:foliage", 7),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 260),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 4),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 5).amount(4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(OreBracketHandler.getOre("dustCoal"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                OreBracketHandler.getOre("dustTinySunnarium")),
                        arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                OreBracketHandler.getOre("dyeBlack"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 261),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 5),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 6).amount(4),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:silverfish_blood", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(OreBracketHandler.getOre("dustTinyUranium"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                OreBracketHandler.getOre("dustTinyPlutonium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 262),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 6),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 7).amount(4),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:slime_ball", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:instability_orb", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 263),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 7),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)

        //TODO Replace ("TConstruct:strangeFood", 1)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 8).amount(4),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
        //                OreBracketHandler.getOre("cropGarlic"),
        //                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:strangeFood", 1),
        //                        ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
        //                        ItemBracketHandler.getItem("HardcoreEnderExpansion:silverfish_blood", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
        //                        ItemBracketHandler.getItem("HardcoreEnderExpansion:igneous_rock", 0),
        //                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 264),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 8),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 9).amount(4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("dustEnderEye"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(OreBracketHandler.getOre("dustTinyGold"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                OreBracketHandler.getOre("dustTinyGold")),
                        arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                OreBracketHandler.getOre("itemFlint"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 265),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 9),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 10).amount(4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        OreBracketHandler.getOre("dustRedstone"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                        arrayOf(OreBracketHandler.getOre("dustEmerald"),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:living_matter", 0),
                                OreBracketHandler.getOre("bookEmpty")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:instability_orb", 0),
                                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 266),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("HardcoreEnderExpansion:stardust", 0),
                        null), arrayOf(OreBracketHandler.getOre("dustNetherrack"),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:curse", 10),
                        OreBracketHandler.getOre("dustTinyNetherStar")), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0), null)), null)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11036),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:sphalerite", 0), 0.0)
        Assembler.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:energy_wand_core", 0),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:auricion", 0).amount(8), 600,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:blank_gem", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0).amount(8),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0).amount(4),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0).amount(16),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:essence", 0).amount(16),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("endergoo").withAmount(1440), 600,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:spatial_dash_gem", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:blank_gem", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0).amount(16),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0).amount(8),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0).amount(32),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:essence", 0).amount(32),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("endergoo").withAmount(2880), 1200, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:transference_gem", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("HardcoreEnderExpansion:spatial_dash_gem", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:arcane_shard", 0).amount(32),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:endoplasm", 0).amount(16),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0).amount(64),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:essence", 0).amount(64),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("endergoo").withAmount(5760), 1800, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:schorching_pickaxe", 0),
                ItemBracketHandler.getItem("minecraft:golden_pickaxe", 0),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:fire_shard", 0).amount(8), 300,  VoltageLevels.HV)

        //TODO Replace getLiquid("ender")
        //Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1770),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 533),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1770),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 533)), null,
        //        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0).amount(4), null,
        //        LiquidBracketHandler.getLiquid("ender").withAmount(100), intArrayOf(9000, 8000, 7500, 5000), 200,  VoltageLevels.HV)
        //Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2770),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2533),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1841),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1770),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1533)),
        //        LiquidBracketHandler.getLiquid("endergoo").withAmount(1000), null, null,
        //        LiquidBracketHandler.getLiquid("ender").withAmount(250), intArrayOf(9000, 8000, 7500, 5000, 2500), 600,
        //        480)

        Compressor.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_ingot", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:spooky_log", 0),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:dry_splinter", 0).amount(9))
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick_slab", 0).amount(2), null,
                ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("lava").withAmount(144), 300, VoltageLevels.MV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick_slab", 0).amount(2), null,
                ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("ic2hotcoolant").withAmount(72), 300, VoltageLevels.MV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick_slab", 0).amount(2), null,
                ItemBracketHandler.getItem("HardcoreEnderExpansion:ravaged_brick", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("molten.blaze").withAmount(36), 150, VoltageLevels.MV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17770).amount(9), null,
                ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(500), 3600, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17770).amount(9), null,
                ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(350), 3600, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17770).amount(9), null,
                ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(150), 1800, VoltageLevels.LV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 13).amount(4),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:death_flower", 0))
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 8).amount(4),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:death_flower", 15))
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 14).amount(4),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:crossed_decoration", 6))
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5839).amount(2),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:sphalerite", 0), 4, VoltageLevels.ULV)
        Lathe.addRecipe(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:obsidian_rod", 0)),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:obsidian_fragment", 0), 160, VoltageLevels.MV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0).amount(4)),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder_ore", 0), intArrayOf(10000), 50,  VoltageLevels.HV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("HardcoreEnderExpansion:igneous_rock", 0).amount(2)),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:igneous_rock_ore", 0), intArrayOf(10000), 50,  VoltageLevels.HV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2770).amount(9)),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:endium_block", 0), intArrayOf(10000), 50,  VoltageLevels.HV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5839).amount(4)),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:sphalerite", 0), intArrayOf(10000), 400, VoltageLevels.LULV)
    }
}