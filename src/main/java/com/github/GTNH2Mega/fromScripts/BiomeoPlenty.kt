package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientTransform
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import minetweaker.mods.nei.NEI
import com.github.GTNH2Mega.VoltageLevels

class BiomeoPlenty : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:gemOre", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:gems", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:jarEmpty", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:dartBlower", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:dart", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:scytheDiamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:ash", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:coal", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:dye", 15).amount(3),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:bones", 0)), false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:dye", 15).amount(6),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:bones", 1)), false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:dye", 15).amount(12),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:bones", 2)), false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:gems", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:gemOre", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:gemOre", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:gemOre", 5))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:jarEmpty", 0),
                arrayOf<IIngredient>(OreBracketHandler.getOre("bottleEmpty")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:glass_bottle", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:jarEmpty", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:mudball", 0).amount(2),
                arrayOf(ItemBracketHandler.getItem("minecraft:dirt", 0),
                        IngredientTransform.giveBack(ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                                ItemBracketHandler.getItem("minecraft:bucket", 0))), null)

        //TODO Replace ("IguanaTweaksTConstruct:clayBucketWater", 0) and ("IguanaTweaksTConstruct:clayBucketFired", 0)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:mudball", 0).amount(2),
        //        arrayOf(ItemBracketHandler.getItem("minecraft:dirt", 0), IngredientTransform.giveBack(
        //                ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0),
        //                ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketFired", 0))), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiomesOPlenty:dartBlower", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BiomesOPlenty:plants", 8),
                        OreBracketHandler.getOre("ringWood"), ItemBracketHandler.getItem("BiomesOPlenty:plants", 8)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiomesOPlenty:plants", 8), null,
                                ItemBracketHandler.getItem("BiomesOPlenty:plants", 8)),
                        arrayOf(ItemBracketHandler.getItem("BiomesOPlenty:plants", 8),
                                OreBracketHandler.getOre("ringWood"),
                                ItemBracketHandler.getItem("BiomesOPlenty:plants", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiomesOPlenty:dart", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiomesOPlenty:plants", 5), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiomesOPlenty:plants", 8), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:feather", 0), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiomesOPlenty:scytheDiamond", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("gemDiamond"),
                        OreBracketHandler.getOre("plateDiamond"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("craftingToolFile"), OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2816),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:misc", 1),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 1),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 1),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 1)), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiomesOPlenty:planks", 14))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:planks", 14).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:logs4", 3)), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:wheat", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:plants", 6),
                        ItemBracketHandler.getItem("BiomesOPlenty:plants", 6),
                        ItemBracketHandler.getItem("BiomesOPlenty:plants", 6))))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:bucket", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:bopBucket", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:rocks", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:rocks", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:rocks", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:rocks", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:coral1", 15),
                arrayOf(ItemBracketHandler.getItem("BiomesOPlenty:coral2", 8),
                        OreBracketHandler.getOre("dustGlowstone")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:coral1", 12),
                arrayOf(ItemBracketHandler.getItem("BiomesOPlenty:coral2", 8),
                        OreBracketHandler.getOre("dustGlowstone"), OreBracketHandler.getOre("dyePink")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:coral1", 13),
                arrayOf(ItemBracketHandler.getItem("BiomesOPlenty:coral2", 8),
                        OreBracketHandler.getOre("dustGlowstone"), OreBracketHandler.getOre("dyeOrange")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BiomesOPlenty:coral1", 14),
                arrayOf(ItemBracketHandler.getItem("BiomesOPlenty:coral2", 8),
                        OreBracketHandler.getOre("dustGlowstone"), OreBracketHandler.getOre("dyeBlue")), null)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("minecraft:dirt", 0),
                ItemBracketHandler.getItem("BiomesOPlenty:driedDirt", 0), 0.0)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("BiomesOPlenty:bamboo", 0), 100)
        Assembler.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:misc", 2),
                ItemBracketHandler.getItem("Forestry:beeswax", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 120, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:hive", 1),
                ItemBracketHandler.getItem("Forestry:propolis", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 400, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:rocks", 0),
                ItemBracketHandler.getItem("minecraft:stone", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2823).amount(4), 50, VoltageLevels.LULV)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("Forestry:honeyDrop", 0).amount(7),
                ItemBracketHandler.getItem("Forestry:honeyDrop", 0),
                ItemBracketHandler.getItem("Forestry:honeyDrop", 0),
                ItemBracketHandler.getItem("Forestry:honeyDrop", 0)), null,
                ItemBracketHandler.getItem("BiomesOPlenty:honeyBlock", 0), null, null,
                intArrayOf(10000, 5000, 2500, 1200), 4000, VoltageLevels.ULV)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("Forestry:beeswax", 0)), null,
                ItemBracketHandler.getItem("BiomesOPlenty:misc", 2), null, null, intArrayOf(10000), 120, VoltageLevels.ULV)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("Forestry:beeswax", 0),
                ItemBracketHandler.getItem("Forestry:honeyDrop", 0)), null,
                ItemBracketHandler.getItem("BiomesOPlenty:food", 9), null, null, intArrayOf(10000, 9000), 120, VoltageLevels.ULV)
        Compressor.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
                ItemBracketHandler.getItem("minecraft:packed_ice", 0).amount(16))
        Compressor.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:bones", 1),
                ItemBracketHandler.getItem("BiomesOPlenty:bones", 0).amount(2))
        Compressor.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:bones", 2),
                ItemBracketHandler.getItem("BiomesOPlenty:bones", 1).amount(2))
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 6).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 1), 300, VoltageLevels.LULV)
        NEI.hide(ItemBracketHandler.getItem("BiomesOPlenty:misc", 9))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("BiomesOPlenty:misc", 9),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:flowers", 2)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:flowers", 2)), null)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 2), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 12).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 4), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 12).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 7), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 14).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 5), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 14).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 2), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 9).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 6), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 9).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 0), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 13).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 7), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 5).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 8), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 5).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 3), 300, VoltageLevels.LULV)
        NEI.hide(ItemBracketHandler.getItem("BiomesOPlenty:misc", 8))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("BiomesOPlenty:misc", 8),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:flowers", 9)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:flowers", 9)), null)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("BiomesOPlenty:misc", 8),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 1)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 1)), null)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 9), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 1), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 7).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers", 15), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 11).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 4), 300, VoltageLevels.LULV)
        NEI.hide(ItemBracketHandler.getItem("BiomesOPlenty:misc", 5))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("BiomesOPlenty:misc", 5),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 5)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 5)), null)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("BiomesOPlenty:misc", 5),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:mushrooms", 2)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:mushrooms", 2)), null)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 5), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:mushrooms", 2), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:dye", 1).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:flowers2", 8), 300, VoltageLevels.LULV)
        NEI.hide(ItemBracketHandler.getItem("BiomesOPlenty:misc", 7))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("BiomesOPlenty:misc", 7),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32416),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)), null)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32416).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0), 300, VoltageLevels.LULV)
        NEI.hide(ItemBracketHandler.getItem("BiomesOPlenty:misc", 6))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("BiomesOPlenty:misc", 6),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:mushrooms", 4)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:mushrooms", 4)), null)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("BiomesOPlenty:misc", 6),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:plants", 7)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:plants", 7)), null)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:mushrooms", 4), 300, VoltageLevels.LULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:plants", 7), 300, VoltageLevels.LULV)
        FluidExtractor.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:jarEmpty", 0),
                ItemBracketHandler.getItem("BiomesOPlenty:jarFilled", 1),
                LiquidBracketHandler.getLiquid("poison").withAmount(1000), 10000, 20, 2)
        FluidExtractor.addRecipe(null, ItemBracketHandler.getItem("BiomesOPlenty:honeyBlock", 0),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(1000), 10000, 1200, 40)
        FluidCanner.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:food", 9),
                ItemBracketHandler.getItem("BiomesOPlenty:misc", 2), null,
                LiquidBracketHandler.getLiquid("for.honey").withAmount(100))
        FluidSolidifier.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:honeyBlock", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(1000), 400, VoltageLevels.LMV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:dye", 15).amount(8)),
                ItemBracketHandler.getItem("BiomesOPlenty:bones", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:dye", 15).amount(12)),
                ItemBracketHandler.getItem("BiomesOPlenty:bones", 1), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:dye", 15).amount(24)),
                ItemBracketHandler.getItem("BiomesOPlenty:bones", 2), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.SandDust", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1802),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1937),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1833)),
                ItemBracketHandler.getItem("BiomesOPlenty:hardSand", 0), intArrayOf(10000, 5000, 1000, 500), 200, VoltageLevels.ULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1805).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1622),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1934),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1823)),
                ItemBracketHandler.getItem("BiomesOPlenty:hardDirt", 0), intArrayOf(10000, 7500, 2500, 2500), 200, VoltageLevels.ULV)
    }
}