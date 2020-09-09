package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class IronChests : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("IronChest:BlockIronChest", 3)
        val item2 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 0)
        val item3 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 4)
        val item4 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 1)
        val item5 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 2)
        val item6 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 5)
        val item7 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 6)
        val item8 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 7)
        val item9 = ItemBracketHandler.getItem("IronChest:copperIronUpgrade", 0)
        val item10 = ItemBracketHandler.getItem("IronChest:copperSilverUpgrade", 0)
        val item11 = ItemBracketHandler.getItem("IronChest:diamondCrystalUpgrade", 0)
        val item12 = ItemBracketHandler.getItem("IronChest:diamondObsidianUpgrade", 0)
        val item13 = ItemBracketHandler.getItem("IronChest:goldDiamondUpgrade", 0)
        val item14 = ItemBracketHandler.getItem("IronChest:ironGoldUpgrade", 0)
        val item15 = ItemBracketHandler.getItem("IronChest:silverGoldUpgrade", 0)
        val item16 = ItemBracketHandler.getItem("IronChest:woodCopperUpgrade", 0)
        val item17 = ItemBracketHandler.getItem("IronChest:woodIronUpgrade", 0)
        val item18 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17035)
        val item19 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18035)
        val item20 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032)
        val item21 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18032)
        val item22 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305)
        val item23 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18305)
        val item24 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)
        val item25 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18086)
        val item26 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)
        val item27 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17890)
        val item28 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804)
        val item29 = ItemBracketHandler.getItem("IC2:itemDensePlates", 7)
        OreBracketHandler.getOre("stickCopper")
        OreBracketHandler.getOre("stickIron")
        OreBracketHandler.getOre("stickSteel")
        OreBracketHandler.getOre("stickGold")
        OreBracketHandler.getOre("stickDiamond")
        ItemBracketHandler.getItem("RandomThings:ingredient", 1)
        val ore = OreBracketHandler.getOre("screwCopper")
        val ore2 = OreBracketHandler.getOre("screwIron")
        val ore3 = OreBracketHandler.getOre("screwSteel")
        val ore4 = OreBracketHandler.getOre("screwGold")
        val ore5 = OreBracketHandler.getOre("screwDiamond")
        val ore6 = OreBracketHandler.getOre("screwGlass")
        val item30 = ItemBracketHandler.getItem("minecraft:chest", 0)

        //TODO investigate getters with no target field for ("TConstruct:GlassPane", 0)
        //ItemBracketHandler.getItem("TConstruct:GlassPane", 0)

        ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0)
        val item31 = ItemBracketHandler.getItem("minecraft:dirt", 0)
        val ore7 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore8 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val item32 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IronChest:BlockIronChest", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(item9)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(item16)
        MineTweakerAPI.recipes.remove(item17)
        MineTweakerAPI.recipes.addShaped(item8,
                arrayOf(arrayOf<IIngredient>(item31, item31, item31), arrayOf<IIngredient>(item31, item30, item31),
                        arrayOf<IIngredient>(item31, item31, item31)), null)
        MineTweakerAPI.recipes.addShaped(item,
                arrayOf(arrayOf(ore, item19, ore), arrayOf<IIngredient>(item19, item30, item19),
                        arrayOf(ore7, item19, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item16,
                arrayOf(arrayOf(ore, item19, ore), arrayOf<IIngredient>(item19, item32, item19),
                        arrayOf(ore7, item19, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item2,
                arrayOf(arrayOf(ore2, item21, ore2), arrayOf<IIngredient>(item21, item30, item21),
                        arrayOf(ore7, item21, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item17,
                arrayOf(arrayOf(ore2, item21, ore2), arrayOf<IIngredient>(item21, item32, item21),
                        arrayOf(ore7, item21, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item9,
                arrayOf(arrayOf(ore2, item20, ore2), arrayOf<IIngredient>(item20, item18, item20),
                        arrayOf(ore7, item20, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item3,
                arrayOf(arrayOf(ore3, item23, ore3), arrayOf<IIngredient>(item23, item30, item23),
                        arrayOf(ore7, item23, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item10,
                arrayOf(arrayOf(ore3, item22, ore3), arrayOf<IIngredient>(item22, item18, item22),
                        arrayOf(ore7, item22, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item4,
                arrayOf(arrayOf(ore4, item25, ore4), arrayOf<IIngredient>(item25, item30, item25),
                        arrayOf(ore7, item25, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item14,
                arrayOf(arrayOf(ore4, item24, ore4), arrayOf<IIngredient>(item24, item20, item24),
                        arrayOf(ore7, item24, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item15,
                arrayOf(arrayOf(ore4, item24, ore4), arrayOf<IIngredient>(item24, item22, item24),
                        arrayOf(ore7, item24, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item5,
                arrayOf(arrayOf(ore5, item26, ore5), arrayOf<IIngredient>(item26, item30, item26),
                        arrayOf(ore7, item26, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item13,
                arrayOf(arrayOf(ore5, item26, ore5), arrayOf<IIngredient?>(null, item24, null),
                        arrayOf(ore7, item26, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item6,
                arrayOf(arrayOf(ore6, item27, ore6), arrayOf<IIngredient>(item27, item5, item27),
                        arrayOf(ore7, item27, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item11,
                arrayOf(arrayOf(ore6, item27, ore6), arrayOf<IIngredient>(item27, item26, item27),
                        arrayOf(ore7, item27, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item7,
                arrayOf(arrayOf(ore5, item29, ore5), arrayOf<IIngredient>(item29, item5, item29),
                        arrayOf(ore7, item29, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item12,
                arrayOf(arrayOf(ore5, item29, ore5), arrayOf<IIngredient>(item28, item26, item28),
                        arrayOf(ore7, item29, ore8)), null)
        Assembler.addRecipe(item8, item30, item31.amount(8), 80, VoltageLevels.LULV)
        Assembler.addRecipe(item, item30, item19.amount(3), 100, VoltageLevels.ULV)
        Assembler.addRecipe(item16, arrayOf<IIngredient>(item32, item19.amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 200, 16)
        Assembler.addRecipe(item2, item30, item21.amount(3), 150, VoltageLevels.LLV)
        Assembler.addRecipe(item17, arrayOf<IIngredient>(item32, item21.amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 300, 30)
        Assembler.addRecipe(item9, arrayOf<IIngredient>(item18, item21,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 300, 30)
        Assembler.addRecipe(item3, item30, item23.amount(3), 200, VoltageLevels.LV)
        Assembler.addRecipe(item10, arrayOf<IIngredient>(item18, item23,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 400, 30)
        Assembler.addRecipe(item4, item30, item25.amount(3), 250, VoltageLevels.LMV)
        Assembler.addRecipe(item14, arrayOf<IIngredient>(item20, item25,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 500, 64)
        Assembler.addRecipe(item15, arrayOf<IIngredient>(item22, item25,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 500, 64)
        Assembler.addRecipe(item5, item30, item26.amount(4), 300, VoltageLevels.MV)
        Assembler.addRecipe(item13, arrayOf<IIngredient>(item24, item26.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 600, 120)
        Assembler.addRecipe(item6, item5, item27.amount(4), 350, VoltageLevels.LHV)
        Assembler.addRecipe(item11, arrayOf<IIngredient>(item26, item27.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 700, 256)
        Assembler.addRecipe(item7, item5, item29.amount(3), 400, VoltageLevels.LHV)
        Assembler.addRecipe(item12, arrayOf<IIngredient>(item26, item29,
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 800, 256)
        MineTweakerAPI.oreDict["chestSilver"].remove(item3)
        MineTweakerAPI.oreDict["chestSteel"].add(item3)
        NEI.overrideName(item3, "Steel Chest")
        NEI.overrideName(item10, "Copper To Steel Chest Upgrade")
        NEI.overrideName(item15, "Steel To Gold Chest Upgrade")
    }
}