package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.LHV
import com.github.GTNH2Mega.VoltageLevels.LLV
import com.github.GTNH2Mega.VoltageLevels.LMV
import com.github.GTNH2Mega.VoltageLevels.LULV
import com.github.GTNH2Mega.VoltageLevels.LV
import com.github.GTNH2Mega.VoltageLevels.MV
import com.github.GTNH2Mega.VoltageLevels.ULV
import java.lang.Runnable
import minetweaker.api.item.IItemStack
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.oredict.IOreDictEntry
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.mods.nei.NEI

class IronChests : Runnable {
    override fun run() {
        val iItemStack = ItemBracketHandler.getItem("IronChest:BlockIronChest", 3)
        val iItemStack2 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 0)
        val iItemStack3 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 4)
        val iItemStack4 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 1)
        val iItemStack5 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 2)
        val iItemStack6 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 5)
        val iItemStack7 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 6)
        val iItemStack8 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 7)
        val iItemStack9 = ItemBracketHandler.getItem("IronChest:copperIronUpgrade", 0)
        val iItemStack10 = ItemBracketHandler.getItem("IronChest:copperSilverUpgrade", 0)
        val iItemStack11 = ItemBracketHandler.getItem("IronChest:diamondCrystalUpgrade", 0)
        val iItemStack12 = ItemBracketHandler.getItem("IronChest:diamondObsidianUpgrade", 0)
        val iItemStack13 = ItemBracketHandler.getItem("IronChest:goldDiamondUpgrade", 0)
        val iItemStack14 = ItemBracketHandler.getItem("IronChest:ironGoldUpgrade", 0)
        val iItemStack15 = ItemBracketHandler.getItem("IronChest:silverGoldUpgrade", 0)
        val iItemStack16 = ItemBracketHandler.getItem("IronChest:woodCopperUpgrade", 0)
        val iItemStack17 = ItemBracketHandler.getItem("IronChest:woodIronUpgrade", 0)
        val iItemStack18 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17035)
        val iItemStack19 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18035)
        val iItemStack20 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032)
        val iItemStack21 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18032)
        val iItemStack22 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305)
        val iItemStack23 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18305)
        val iItemStack24 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086)
        val iItemStack25 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 18086)
        val iItemStack26 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)
        val iItemStack27 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17890)
        val iItemStack28 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804)
        val iItemStack29 = ItemBracketHandler.getItem("IC2:itemDensePlates", 7)
        val iOreDictEntry6 = OreBracketHandler.getOre("screwCopper")
        val iOreDictEntry7 = OreBracketHandler.getOre("screwIron")
        val iOreDictEntry8 = OreBracketHandler.getOre("screwSteel")
        val iOreDictEntry9 = OreBracketHandler.getOre("screwGold")
        val iOreDictEntry10 = OreBracketHandler.getOre("screwDiamond")
        val iOreDictEntry11 = OreBracketHandler.getOre("screwGlass")
        val iItemStack31 = ItemBracketHandler.getItem("minecraft:chest", 0)
        val iItemStack34 = ItemBracketHandler.getItem("minecraft:dirt", 0)
        val iOreDictEntry12 = OreBracketHandler.getOre("craftingToolHardHammer")
        val iOreDictEntry13 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val iOreDictEntry14 = OreBracketHandler.getOre("plankWood")
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IronChest:BlockIronChest", 32767))
        MineTweakerAPI.recipes.remove(iItemStack9)
        MineTweakerAPI.recipes.remove(iItemStack10)
        MineTweakerAPI.recipes.remove(iItemStack11)
        MineTweakerAPI.recipes.remove(iItemStack12)
        MineTweakerAPI.recipes.remove(iItemStack13)
        MineTweakerAPI.recipes.remove(iItemStack14)
        MineTweakerAPI.recipes.remove(iItemStack15)
        MineTweakerAPI.recipes.remove(iItemStack16)
        MineTweakerAPI.recipes.remove(iItemStack17)
        MineTweakerAPI.recipes.addShaped(iItemStack8, arrayOf(arrayOf<IIngredient>(iItemStack34, iItemStack34, iItemStack34), arrayOf<IIngredient>(iItemStack34, iItemStack31, iItemStack34), arrayOf<IIngredient>(iItemStack34, iItemStack34, iItemStack34)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack, arrayOf(arrayOf(iOreDictEntry6, iItemStack19, iOreDictEntry6), arrayOf<IIngredient>(iItemStack19, iItemStack31, iItemStack19), arrayOf(iOreDictEntry12, iItemStack19, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack16, arrayOf(arrayOf(iOreDictEntry6, iItemStack19, iOreDictEntry6), arrayOf(iItemStack19, iOreDictEntry14, iItemStack19), arrayOf(iOreDictEntry12, iItemStack19, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack2, arrayOf(arrayOf(iOreDictEntry7, iItemStack21, iOreDictEntry7), arrayOf<IIngredient>(iItemStack21, iItemStack31, iItemStack21), arrayOf(iOreDictEntry12, iItemStack21, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack17, arrayOf(arrayOf(iOreDictEntry7, iItemStack21, iOreDictEntry7), arrayOf(iItemStack21, iOreDictEntry14, iItemStack21), arrayOf(iOreDictEntry12, iItemStack21, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack9, arrayOf(arrayOf(iOreDictEntry7, iItemStack20, iOreDictEntry7), arrayOf<IIngredient>(iItemStack20, iItemStack18, iItemStack20), arrayOf(iOreDictEntry12, iItemStack20, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack3, arrayOf(arrayOf(iOreDictEntry8, iItemStack23, iOreDictEntry8), arrayOf<IIngredient>(iItemStack23, iItemStack31, iItemStack23), arrayOf(iOreDictEntry12, iItemStack23, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack10, arrayOf(arrayOf(iOreDictEntry8, iItemStack22, iOreDictEntry8), arrayOf<IIngredient>(iItemStack22, iItemStack18, iItemStack22), arrayOf(iOreDictEntry12, iItemStack22, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack4, arrayOf(arrayOf(iOreDictEntry9, iItemStack25, iOreDictEntry9), arrayOf<IIngredient>(iItemStack25, iItemStack31, iItemStack25), arrayOf(iOreDictEntry12, iItemStack25, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack14, arrayOf(arrayOf(iOreDictEntry9, iItemStack24, iOreDictEntry9), arrayOf<IIngredient>(iItemStack24, iItemStack20, iItemStack24), arrayOf(iOreDictEntry12, iItemStack24, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack15, arrayOf(arrayOf(iOreDictEntry9, iItemStack24, iOreDictEntry9), arrayOf<IIngredient>(iItemStack24, iItemStack22, iItemStack24), arrayOf(iOreDictEntry12, iItemStack24, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack5, arrayOf(arrayOf(iOreDictEntry10, iItemStack26, iOreDictEntry10), arrayOf<IIngredient>(iItemStack26, iItemStack31, iItemStack26), arrayOf(iOreDictEntry12, iItemStack26, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack13, arrayOf(arrayOf(iOreDictEntry10, iItemStack26, iOreDictEntry10), arrayOf<IIngredient?>(null, iItemStack24, null), arrayOf(iOreDictEntry12, iItemStack26, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack6, arrayOf(arrayOf(iOreDictEntry11, iItemStack27, iOreDictEntry11), arrayOf<IIngredient>(iItemStack27, iItemStack5, iItemStack27), arrayOf(iOreDictEntry12, iItemStack27, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack11, arrayOf(arrayOf(iOreDictEntry11, iItemStack27, iOreDictEntry11), arrayOf<IIngredient>(iItemStack27, iItemStack26, iItemStack27), arrayOf(iOreDictEntry12, iItemStack27, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack7, arrayOf(arrayOf(iOreDictEntry10, iItemStack29, iOreDictEntry10), arrayOf<IIngredient>(iItemStack29, iItemStack5, iItemStack29), arrayOf(iOreDictEntry12, iItemStack29, iOreDictEntry13)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack12, arrayOf(arrayOf(iOreDictEntry10, iItemStack29, iOreDictEntry10), arrayOf<IIngredient>(iItemStack28, iItemStack26, iItemStack28), arrayOf(iOreDictEntry12, iItemStack29, iOreDictEntry13)), null)
        Assembler.addRecipe(iItemStack8, iItemStack31, iItemStack34.amount(8), 80, LULV)
        Assembler.addRecipe(iItemStack, iItemStack31, iItemStack19.amount(3), 100, ULV)
        Assembler.addRecipe(iItemStack16, arrayOf(iOreDictEntry14, iItemStack19.amount(3), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 200, LLV)
        Assembler.addRecipe(iItemStack2, iItemStack31, iItemStack21.amount(3), 150, LLV)
        Assembler.addRecipe(iItemStack17, arrayOf(iOreDictEntry14, iItemStack21.amount(3), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 300, LV)
        Assembler.addRecipe(iItemStack9, arrayOf<IIngredient>(iItemStack18, iItemStack21, ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 300, LV)
        Assembler.addRecipe(iItemStack3, iItemStack31, iItemStack23.amount(3), 200, LV)
        Assembler.addRecipe(iItemStack10, arrayOf<IIngredient>(iItemStack18, iItemStack23, ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 400, LV)
        Assembler.addRecipe(iItemStack4, iItemStack31, iItemStack25.amount(3), 250, LMV)
        Assembler.addRecipe(iItemStack14, arrayOf<IIngredient>(iItemStack20, iItemStack25, ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 500, LMV)
        Assembler.addRecipe(iItemStack15, arrayOf<IIngredient>(iItemStack22, iItemStack25, ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 500, LMV)
        Assembler.addRecipe(iItemStack5, iItemStack31, iItemStack26.amount(4), 300, MV)
        Assembler.addRecipe(iItemStack13, arrayOf<IIngredient>(iItemStack24, iItemStack26.amount(2), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 600, MV)
        Assembler.addRecipe(iItemStack6, iItemStack5, iItemStack27.amount(4), 350, LHV)
        Assembler.addRecipe(iItemStack11, arrayOf<IIngredient>(iItemStack26, iItemStack27.amount(2), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 700, LHV)
        Assembler.addRecipe(iItemStack7, iItemStack5, iItemStack29.amount(3), 400, LHV)
        Assembler.addRecipe(iItemStack12, arrayOf<IIngredient>(iItemStack26, iItemStack29, ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0)), null, 800, LHV)
        MineTweakerAPI.oreDict["chestSilver"].remove(iItemStack3)
        MineTweakerAPI.oreDict["chestSteel"].add(iItemStack3)
        NEI.overrideName(iItemStack3, "Steel Chest")
        NEI.overrideName(iItemStack10, "Copper To Steel Chest Upgrade")
        NEI.overrideName(iItemStack15, "Steel To Gold Chest Upgrade")
    }
}