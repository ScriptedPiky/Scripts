package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.forestry.handlers.Carpenter
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class BinniesCore : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("BinnieCore:storage", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("BinnieCore:storage", 1), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("BinnieCore:storage", 2), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("BinnieCore:storage", 3), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("BinnieCore:storage", 4), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("BinnieCore:storage", 5), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BinnieCore:fieldKit", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BinnieCore:fieldKit", 63),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("lensGlass"),
                        OreBracketHandler.getOre("ringSteel"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringSteel"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("craftingToolSaw")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickSteel"))), null)
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingChest"), OreBracketHandler.getOre("screwWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingChest"),
                                OreBracketHandler.getOre("frameGtWood"), OreBracketHandler.getOre("craftingChest")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingChest"), OreBracketHandler.getOre("screwWood"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(1000), 5, null)
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwCopper"),
                        OreBracketHandler.getOre("gearCopper"), OreBracketHandler.getOre("screwCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearCopper"),
                                OreBracketHandler.getOre("frameGtCopper"), OreBracketHandler.getOre("gearCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwCopper"),
                                OreBracketHandler.getOre("gearCopper"), OreBracketHandler.getOre("screwCopper"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(2000), 10,
                ItemBracketHandler.getItem("BinnieCore:storage", 0))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwCopper"),
                        OreBracketHandler.getOre("chestCopper"), OreBracketHandler.getOre("screwCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("chestCopper"),
                                OreBracketHandler.getOre("frameGtCopper"), OreBracketHandler.getOre("chestCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwCopper"),
                                OreBracketHandler.getOre("chestCopper"), OreBracketHandler.getOre("screwCopper"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(2000), 10,
                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 3))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwBronze"),
                        OreBracketHandler.getOre("gearBronze"), OreBracketHandler.getOre("screwBronze")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearBronze"),
                                OreBracketHandler.getOre("frameGtBronze"), OreBracketHandler.getOre("gearBronze")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwBronze"),
                                OreBracketHandler.getOre("gearBronze"), OreBracketHandler.getOre("screwBronze"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(3000), 15,
                ItemBracketHandler.getItem("BinnieCore:storage", 1))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("gearIron"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearIron"),
                                OreBracketHandler.getOre("frameGtIron"), OreBracketHandler.getOre("gearIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("gearIron"), OreBracketHandler.getOre("screwIron"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(3000), 15,
                ItemBracketHandler.getItem("BinnieCore:storage", 1))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("chestIron"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("chestIron"),
                                OreBracketHandler.getOre("frameGtIron"), OreBracketHandler.getOre("chestIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("chestIron"), OreBracketHandler.getOre("screwIron"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(3000), 15,
                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 3))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                        OreBracketHandler.getOre("gearGold"), OreBracketHandler.getOre("screwGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearGold"),
                                OreBracketHandler.getOre("frameGtGold"), OreBracketHandler.getOre("gearGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                                OreBracketHandler.getOre("gearGold"), OreBracketHandler.getOre("screwGold"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(4000), 20,
                ItemBracketHandler.getItem("BinnieCore:storage", 2))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                        OreBracketHandler.getOre("gearGold"), OreBracketHandler.getOre("screwGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearGold"),
                                OreBracketHandler.getOre("frameGtGold"), OreBracketHandler.getOre("gearGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                                OreBracketHandler.getOre("gearGold"), OreBracketHandler.getOre("screwGold"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(4000), 20,
                ItemBracketHandler.getItem("BinnieCore:storage", 3))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                        OreBracketHandler.getOre("chestGold"), OreBracketHandler.getOre("screwGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("chestGold"),
                                OreBracketHandler.getOre("frameGtGold"), OreBracketHandler.getOre("chestGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                                OreBracketHandler.getOre("chestGold"), OreBracketHandler.getOre("screwGold"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(4000), 20,
                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 3))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                        OreBracketHandler.getOre("gearDiamond"), OreBracketHandler.getOre("screwDiamond")),
                        arrayOf(OreBracketHandler.getOre("gearDiamond"),
                                ItemBracketHandler.getItem("dreamcraft:tile.DiamondFrameBox", 0),
                                OreBracketHandler.getOre("gearDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                                OreBracketHandler.getOre("gearDiamond"), OreBracketHandler.getOre("screwDiamond"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(5000), 25,
                ItemBracketHandler.getItem("BinnieCore:storage", 4))
        Carpenter.addRecipe(ItemBracketHandler.getItem("BinnieCore:storage", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                        OreBracketHandler.getOre("chestDiamond"), OreBracketHandler.getOre("screwDiamond")),
                        arrayOf(OreBracketHandler.getOre("chestDiamond"),
                                ItemBracketHandler.getItem("dreamcraft:tile.DiamondFrameBox", 0),
                                OreBracketHandler.getOre("chestDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwDiamond"),
                                OreBracketHandler.getOre("chestDiamond"), OreBracketHandler.getOre("screwDiamond"))),
                LiquidBracketHandler.getLiquid("creosote").withAmount(5000), 25,
                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 3))
    }
}