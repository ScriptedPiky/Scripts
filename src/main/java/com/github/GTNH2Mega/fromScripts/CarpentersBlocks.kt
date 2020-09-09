package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.CuttingSaw
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class CarpentersBlocks : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0)
        val item2 = ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersCollapsibleBlock", 0)
        OreBracketHandler.getOre("craftingToolWrench")
        val ore = OreBracketHandler.getOre("craftingToolSaw")
        val ore2 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val item3 = ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSafe", 0)
        val item4 = ItemBracketHandler.getItem("IC2:blockPersonal", 0)
        ItemBracketHandler.getItem("minecraft:flint", 0)
        val ore3 = OreBracketHandler.getOre("craftingToolHardHammer")
        val item5 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27809)
        val item6 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032)
        val item7 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305)
        val item8 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27019)
        val item9 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27306)
        val item10 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27028)
        val ore4 = OreBracketHandler.getOre("frameGtWood")
        OreBracketHandler.getOre("plankWood")
        OreBracketHandler.getOre("logWood")
        val item11 = ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersChisel", 0)
        val item12 = ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersHammer", 0)
        val item13 = ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersDaylightSensor", 0)
        val item14 = ItemBracketHandler.getItem("minecraft:daylight_detector", 0)
        ItemBracketHandler.getItem("minecraft:stick", 0)
        val ore5 = OreBracketHandler.getOre("dustRedstone")
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersBed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersTorch", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersGarageDoor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersLadder", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBarrier", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersButton", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersFlowerPot", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersGate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersHatch", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersLever", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersStairs", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersTile", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersDoor", 0))
        MineTweakerAPI.recipes.addShaped(item.amount(2),
                arrayOf(arrayOf(ore4, item5, ore4), arrayOf(item5, ore2, item5), arrayOf(ore4, item5, ore4)), null)
        MineTweakerAPI.recipes.addShaped(item.amount(8),
                arrayOf(arrayOf(ore4, item6, ore4), arrayOf<IIngredient>(ore4, ore2, ore4), arrayOf(ore4, item6, ore4)),
                null)
        MineTweakerAPI.recipes.addShaped(item.amount(12),
                arrayOf(arrayOf(ore4, item7, ore4), arrayOf<IIngredient>(ore4, ore2, ore4), arrayOf(ore4, item7, ore4)),
                null)
        MineTweakerAPI.recipes.addShaped(item.amount(16),
                arrayOf(arrayOf(ore4, item8, ore4), arrayOf<IIngredient>(ore4, ore2, ore4), arrayOf(ore4, item8, ore4)),
                null)
        MineTweakerAPI.recipes.addShaped(item.amount(20),
                arrayOf(arrayOf(ore4, item9, ore4), arrayOf<IIngredient>(ore4, ore2, ore4), arrayOf(ore4, item9, ore4)),
                null)
        MineTweakerAPI.recipes.addShaped(item.amount(24),
                arrayOf(arrayOf(ore4, item10, ore4), arrayOf<IIngredient>(ore4, ore2, ore4),
                        arrayOf(ore4, item10, ore4)), null)
        MineTweakerAPI.recipes.addShaped(item2, arrayOf(arrayOf(item5, ore2, item5),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470)),
                arrayOf<IIngredient>(item5, item, item5)), null)

        //TODO Replace ("TConstruct:chiselHead", 2)
        //MineTweakerAPI.recipes.addShaped(item11,
        //        arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("TConstruct:chiselHead", 2), ore),
        //                arrayOf(item6, OreBracketHandler.getOre("stickAnyIron"), item6),
        //                arrayOf(item, OreBracketHandler.getOre("stickAnyIron"), item)), null)

        MineTweakerAPI.recipes.addShaped(item12,
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 5032), ore),
                        arrayOf(item6, OreBracketHandler.getOre("stickAnyIron"), item6),
                        arrayOf(item, OreBracketHandler.getOre("stickAnyIron"), item)), null)
        MineTweakerAPI.recipes.addShaped(item3,
                arrayOf(arrayOf<IIngredient>(item6, item2, item6), arrayOf<IIngredient>(item2, item4, item2),
                        arrayOf(item6, ore2, item6)), null)
        MineTweakerAPI.recipes.addShaped(item13,
                arrayOf(arrayOf(item6, ore2, item6), arrayOf<IIngredient>(item, item14, item),
                        arrayOf(item, ore5, item)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersBed", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE)), arrayOf<IIngredient>(item, item, item),
                        arrayOf(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBarrier", 0),
                                OreBracketHandler.getOre("craftingToolSoftHammer"),
                                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBarrier", 0))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersTorch", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:torch", 0), item,
                        ItemBracketHandler.getItem("minecraft:torch", 0))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersGarageDoor", 0).amount(5),
                arrayOf(arrayOf(item, OreBracketHandler.getOre("ringIron"), item),
                        arrayOf(OreBracketHandler.getOre("ringIron"), item, OreBracketHandler.getOre("ringIron")),
                        arrayOf(item, OreBracketHandler.getOre("ringIron"), item)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersLadder", 0),
                arrayOf(arrayOf<IIngredient>(item, ItemBracketHandler.getItem("minecraft:ladder", 0), item),
                        arrayOf(item5, ore2, item5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBarrier", 0),
                arrayOf(arrayOf(item, OreBracketHandler.getOre("fenceWood"), item), arrayOf(item5, ore2, item5)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0).amount(2),
                arrayOf(arrayOf(item5, ore3, item5), arrayOf(item, OreBracketHandler.getOre("springAnyIron"), item),
                        arrayOf(item5, ore2, item5)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersButton", 0),
                arrayOf(ore, ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersFlowerPot", 0),
                arrayOf(arrayOf<IIngredient?>(item, ItemBracketHandler.getItem("minecraft:flower_pot", 0), item),
                        arrayOf<IIngredient?>(null, item, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersGate", 0),
                arrayOf(arrayOf<IIngredient>(item, ItemBracketHandler.getItem("minecraft:fence_gate", 0), item),
                        arrayOf(item5, ore2, item5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersHatch", 0),
                arrayOf(arrayOf<IIngredient>(item, ItemBracketHandler.getItem("minecraft:trapdoor", 0), item),
                        arrayOf(item5, ore2, item5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersLever", 0),
                arrayOf(arrayOf<IIngredient?>(item, ItemBracketHandler.getItem("minecraft:lever", 0), item5),
                        arrayOf<IIngredient?>(null, ore2, null)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0).amount(2),
                arrayOf(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0), ore), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersStairs", 0),
                arrayOf(ore, ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersTile", 0),
                arrayOf(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0),
                        OreBracketHandler.getOre("craftingToolRollingPin"), OreBracketHandler.getOre("itemClay")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersDoor", 0),
                arrayOf(arrayOf<IIngredient>(item, ItemBracketHandler.getItem("minecraft:wooden_door", 0), item),
                        arrayOf(item5, ore2, item5)), null)
        Assembler.addRecipe(item.amount(4), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905).amount(2),
                item5.amount(2), 100, VoltageLevels.LLV)
        Assembler.addRecipe(item.amount(8), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905).amount(3),
                item6, 100, 30)
        Assembler.addRecipe(item.amount(12), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905).amount(3),
                item7, 100, 48)
        Assembler.addRecipe(item.amount(16), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905).amount(3),
                item8, 100, 64)
        Assembler.addRecipe(item.amount(20), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905).amount(3),
                item9, 100, 64)
        Assembler.addRecipe(item.amount(24), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905).amount(3),
                item10, 100, 64)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBarrier", 0).amount(2),
                ItemBracketHandler.getItem("minecraft:fence", 0), item, 200, 16)
        Assembler.addRecipe(item2, item, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersFlowerPot", 0), item,
                ItemBracketHandler.getItem("minecraft:flower_pot", 0), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersGarageDoor", 0).amount(2), item,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28032), 150, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersGarageDoor", 0).amount(4), item,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28305), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersGate", 0),
                ItemBracketHandler.getItem("minecraft:fence_gate", 0), item, 100, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersHatch", 0), item,
                ItemBracketHandler.getItem("minecraft:trapdoor", 0), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersLadder", 0), item,
                ItemBracketHandler.getItem("minecraft:ladder", 0), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersLever", 0), item,
                ItemBracketHandler.getItem("minecraft:lever", 0), 50, VoltageLevels.LLV)
        Assembler.addRecipe(item3, item2.amount(3), item4, 300, 30)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersTorch", 0).amount(10), item,
                ItemBracketHandler.getItem("minecraft:torch", 0).amount(10), 100, VoltageLevels.LLV)

        //TODO Replace ("TConstruct:chiselHead", 2)
        //Assembler.addRecipe(item11, item, ItemBracketHandler.getItem("TConstruct:chiselHead", 2), 200, VoltageLevels.LV)

        Assembler.addRecipe(item12, item, ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 5032), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersTile", 0).amount(2),
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0),
                ItemBracketHandler.getItem("minecraft:clay_ball", 0), 50, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:itemCarpentersDoor", 0), item,
                ItemBracketHandler.getItem("minecraft:wooden_door", 0), 150, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0).amount(2),
                item.amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0).amount(2),
                item.amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersButton", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(20), 100, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersButton", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(10), 100, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersButton", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersPressurePlate", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(2), 50, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersStairs", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(20), 100, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersStairs", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(10), 100, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersStairs", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(2), 50, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(20), 100, VoltageLevels.LLV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(10), 100, VoltageLevels.LLV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0).amount(4), null,
                ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(2), 50, VoltageLevels.LLV)
    }
}