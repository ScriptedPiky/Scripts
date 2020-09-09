package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.forestry.handlers.Carpenter
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Botany : Runnable {
    override fun run() {
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Botany:database", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Botany:trowelWood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Botany:trowelStone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Botany:trowelIron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Botany:trowelGold", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Botany:trowelDiamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Botany:insulatedTube", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Botany:soilMeter", 0))
        Carpenter.addRecipe(ItemBracketHandler.getItem("Botany:database", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingGold"),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("itemCasingGold")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17501),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1440), 60,
                ItemBracketHandler.getItem("dreamcraft:item.Display", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Botany:database", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Botany:database", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Botany:trowelWood", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        OreBracketHandler.getOre("craftingToolHardHammer"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickWood"), null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Botany:trowelStone", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateStone"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickWood"), null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Botany:trowelIron", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickWood"), null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Botany:trowelGold", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateGold"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickWood"), null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Botany:trowelDiamond", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"),
                                OreBracketHandler.getOre("stickWood"), null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Botany:misc", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1815)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1815),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Botany:misc", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Botany:misc", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1809)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1809),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Botany:misc", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Botany:misc", 3),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1022)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1022),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Botany:misc", 3)), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 0),
                ItemBracketHandler.getItem("minecraft:clay", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 128),
                ItemBracketHandler.getItem("minecraft:cobblestone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 256),
                ItemBracketHandler.getItem("minecraft:sand", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 384),
                ItemBracketHandler.getItem("minecraft:hardened_clay", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 512),
                ItemBracketHandler.getItem("minecraft:stone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 640),
                ItemBracketHandler.getItem("minecraft:sandstone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 1),
                ItemBracketHandler.getItem("minecraft:clay", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 129),
                ItemBracketHandler.getItem("minecraft:cobblestone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 257),
                ItemBracketHandler.getItem("minecraft:sand", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 385),
                ItemBracketHandler.getItem("minecraft:hardened_clay", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 513),
                ItemBracketHandler.getItem("minecraft:stone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 641),
                ItemBracketHandler.getItem("minecraft:sandstone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 2),
                ItemBracketHandler.getItem("minecraft:clay", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 130),
                ItemBracketHandler.getItem("minecraft:cobblestone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 258),
                ItemBracketHandler.getItem("minecraft:sand", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 386),
                ItemBracketHandler.getItem("minecraft:hardened_clay", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 514),
                ItemBracketHandler.getItem("minecraft:stone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 642),
                ItemBracketHandler.getItem("minecraft:sandstone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 3),
                ItemBracketHandler.getItem("minecraft:clay", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 131),
                ItemBracketHandler.getItem("minecraft:cobblestone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 259),
                ItemBracketHandler.getItem("minecraft:sand", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 387),
                ItemBracketHandler.getItem("minecraft:hardened_clay", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 515),
                ItemBracketHandler.getItem("minecraft:stone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:insulatedTube", 643),
                ItemBracketHandler.getItem("minecraft:sandstone", 0).amount(4),
                ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(288), 800, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Botany:soilMeter", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086).amount(4),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 1200, VoltageLevels.LMV)
    }
}