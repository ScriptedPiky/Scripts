package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import com.github.GTNH2Mega.VoltageLevels

class IronTanks : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17035)
        val item2 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18035)
        val item3 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032)
        val item4 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18032)
        val item5 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305)
        val item6 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17501)
        val item7 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18305)
        val item8 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)
        val item9 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18086)
        val item10 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)
        val item11 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17890)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804)
        val item12 = ItemBracketHandler.getItem("IC2:itemDensePlates", 7)
        OreBracketHandler.getOre("stickCopper")
        OreBracketHandler.getOre("stickIron")
        OreBracketHandler.getOre("stickSteel")
        OreBracketHandler.getOre("stickGold")
        OreBracketHandler.getOre("stickDiamond")
        ItemBracketHandler.getItem("RandomThings:ingredient", 1)
        val ore = OreBracketHandler.getOre("screwCopper")
        val ore2 = OreBracketHandler.getOre("screwIron")
        val ore3 = OreBracketHandler.getOre("screwEmerald")
        val ore4 = OreBracketHandler.getOre("screwSteel")
        val ore5 = OreBracketHandler.getOre("screwGold")
        val ore6 = OreBracketHandler.getOre("screwDiamond")
        OreBracketHandler.getOre("screwGlass")

        //TODO Replace ("TConstruct:GlassPane", 0)
        //val item13 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)

        val item14 = ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)
        val ore7 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore8 = OreBracketHandler.getOre("craftingToolScrewdriver")
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:ironTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:goldTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:diamondTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:obsidianTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:copperTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:silverTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:emeraldTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:ironGoldUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:goldDiamondUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:copperSilverUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:silverGoldUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:copperIronUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:glassIronUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:glassCopperUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:diamondObsidianUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:silverDiamondUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("irontank:diamondEmeraldUpgrade", 0))

        //TODO Replace ("TConstruct:GlassPane", 0) in item13
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:ironTank", 0),
        //        arrayOf(arrayOf(ore2, item4, ore2), arrayOf<IIngredient>(item13, item14, item13),
        //                arrayOf(ore7, item4, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:glassIronUpgrade", 0),
        //        arrayOf(arrayOf(ore2, item4, ore2), arrayOf<IIngredient>(item13, item11, item13),
        //                arrayOf(ore7, item4, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:copperIronUpgrade", 0),
        //        arrayOf(arrayOf(ore2, item3, ore2), arrayOf<IIngredient>(item13, item11, item13),
        //                arrayOf(ore7, item3, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:goldTank", 0),
        //        arrayOf(arrayOf(ore5, item9, ore5), arrayOf<IIngredient>(item13, item14, item13),
        //                arrayOf(ore7, item9, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:ironGoldUpgrade", 0),
        //        arrayOf(arrayOf(ore5, item8, ore5), arrayOf<IIngredient>(item13, item3, item13),
        //                arrayOf(ore7, item8, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:silverGoldUpgrade", 0),
        //        arrayOf(arrayOf(ore5, item8, ore5), arrayOf<IIngredient>(item13, item5, item13),
        //                arrayOf(ore7, item8, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:diamondTank", 0),
        //        arrayOf(arrayOf(ore6, item10, ore6), arrayOf<IIngredient>(item13, item14, item13),
        //                arrayOf(ore7, item10, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:goldDiamondUpgrade", 0),
        //        arrayOf(arrayOf(ore6, item10, ore6), arrayOf<IIngredient>(item13, item8, item13),
        //                arrayOf(ore7, item10, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:silverDiamondUpgrade", 0),
        //        arrayOf(arrayOf(ore6, item10, ore6), arrayOf<IIngredient>(item13, item5, item13),
        //                arrayOf(ore7, item10, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:obsidianTank", 0),
        //        arrayOf(arrayOf(ore6, item12, ore6), arrayOf<IIngredient>(item13, item14, item13),
        //                arrayOf(ore7, item12, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:diamondObsidianUpgrade", 0),
        //        arrayOf(arrayOf(ore6, item12, ore6), arrayOf<IIngredient>(item13, item11, item13),
        //                arrayOf(ore7, item12, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:copperTank", 0),
        //        arrayOf(arrayOf(ore, item2, ore), arrayOf<IIngredient>(item13, item14, item13),
        //                arrayOf(ore7, item2, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:glassCopperUpgrade", 0),
        //        arrayOf(arrayOf(ore, item2, ore), arrayOf<IIngredient>(item13, item11, item13),
        //                arrayOf(ore7, item2, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:silverTank", 0),
        //        arrayOf(arrayOf(ore4, item7, ore4), arrayOf<IIngredient>(item13, item14, item13),
        //                arrayOf(ore7, item7, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:copperSilverUpgrade", 0),
        //        arrayOf(arrayOf(ore4, item5, ore4), arrayOf<IIngredient>(item13, item, item13),
        //                arrayOf(ore7, item5, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:emeraldTank", 0),
        //        arrayOf(arrayOf(ore3, item6, ore3), arrayOf<IIngredient>(item13, item14, item13),
        //                arrayOf(ore7, item6, ore8)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("irontank:diamondEmeraldUpgrade", 0),
        //        arrayOf(arrayOf(ore3, item6, ore3), arrayOf<IIngredient>(item13, item10, item13),
        //                arrayOf(ore7, item6, ore8)), null)

        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:copperTank", 0), arrayOf<IIngredient>(item14, item2,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:glassCopperUpgrade", 0),
                arrayOf<IIngredient>(item11, item2,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:ironTank", 0), arrayOf<IIngredient>(item14, item4,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:glassIronUpgrade", 0),
                arrayOf<IIngredient>(item11, item4,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:copperIronUpgrade", 0),
                arrayOf<IIngredient>(item, item3,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 500, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:silverTank", 0), arrayOf<IIngredient>(item14, item7,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 500, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:copperSilverUpgrade", 0),
                arrayOf<IIngredient>(item, item5,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:goldTank", 0), arrayOf<IIngredient>(item14, item9,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:ironGoldUpgrade", 0),
                arrayOf<IIngredient>(item3, item8,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 700, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:silverGoldUpgrade", 0),
                arrayOf<IIngredient>(item5, item8,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 700, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:diamondTank", 0), arrayOf<IIngredient>(item14, item10,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 800, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:silverDiamondUpgrade", 0),
                arrayOf<IIngredient>(item5, item10,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 800, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:obsidianTank", 0), arrayOf<IIngredient>(item14, item12,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 900, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:diamondObsidianUpgrade", 0),
                arrayOf<IIngredient>(item11, item12,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 900, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:emeraldTank", 0), arrayOf<IIngredient>(item14, item6,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 1000, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("irontank:diamondEmeraldUpgrade", 0),
                arrayOf<IIngredient>(item10, item6,
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(72), 1000, VoltageLevels.LV)
    }
}