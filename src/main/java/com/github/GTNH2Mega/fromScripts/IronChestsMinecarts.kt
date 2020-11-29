package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import minetweaker.api.item.IItemStack
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.oredict.IOreDictEntry
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.MineTweakerAPI
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.api.item.IIngredient
import minetweaker.mods.nei.NEI
import com.github.GTNH2Mega.VoltageLevels
import com.github.GTNH2Mega.VoltageLevels.LLV
import com.github.GTNH2Mega.VoltageLevels.LMV
import com.github.GTNH2Mega.VoltageLevels.LULV
import com.github.GTNH2Mega.VoltageLevels.LV
import com.github.GTNH2Mega.VoltageLevels.ULV

class IronChestsMinecarts : Runnable {
    override fun run() {
        val iItemStack = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_copper", 0)
        val iItemStack2 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_iron", 0)
        val iItemStack3 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_silver", 0)
        val iItemStack4 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_gold", 0)
        val iItemStack5 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_diamond", 0)
        val iItemStack6 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_crystal", 0)
        val iItemStack7 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_obsidian", 0)
        val iItemStack8 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 3)
        val iItemStack9 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 0)
        val iItemStack10 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 4)
        val iItemStack11 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 1)
        val iItemStack12 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 2)
        val iItemStack13 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 5)
        val iItemStack14 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 6)
        val iOreDictEntry = OreBracketHandler.getOre("screwCopper")
        val iOreDictEntry2 = OreBracketHandler.getOre("screwAnyIron")
        val iOreDictEntry3 = OreBracketHandler.getOre("screwSteel")
        val iOreDictEntry4 = OreBracketHandler.getOre("screwGold")
        val iOreDictEntry5 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val iItemStack15 = ItemBracketHandler.getItem("minecraft:minecart", 0)
        MineTweakerAPI.recipes.remove(iItemStack)
        MineTweakerAPI.recipes.remove(iItemStack2)
        MineTweakerAPI.recipes.remove(iItemStack3)
        MineTweakerAPI.recipes.remove(iItemStack4)
        MineTweakerAPI.recipes.remove(iItemStack5)
        MineTweakerAPI.recipes.remove(iItemStack6)
        MineTweakerAPI.recipes.remove(iItemStack7)
        Assembler.addRecipe(iItemStack, iItemStack8, iItemStack15, 100, LULV)
        MineTweakerAPI.recipes.addShaped(iItemStack, arrayOf(arrayOf<IIngredient?>(null, iOreDictEntry5, null), arrayOf(iOreDictEntry, iItemStack8, iOreDictEntry), arrayOf(iOreDictEntry, iItemStack15, iOreDictEntry)), null)
        Assembler.addRecipe(iItemStack2, iItemStack9, iItemStack15, 120, LULV)
        MineTweakerAPI.recipes.addShaped(iItemStack2, arrayOf(arrayOf<IIngredient?>(null, iOreDictEntry5, null), arrayOf(iOreDictEntry2, iItemStack9, iOreDictEntry2), arrayOf(iOreDictEntry2, iItemStack15, iOreDictEntry2)), null)
        Assembler.addRecipe(iItemStack3, iItemStack10, iItemStack15, 140, ULV)
        MineTweakerAPI.recipes.addShaped(iItemStack3, arrayOf(arrayOf<IIngredient?>(null, iOreDictEntry5, null), arrayOf(iOreDictEntry3, iItemStack10, iOreDictEntry3), arrayOf(iOreDictEntry3, iItemStack15, iOreDictEntry3)), null)
        Assembler.addRecipe(iItemStack4, iItemStack11, iItemStack15, 160, LLV)
        MineTweakerAPI.recipes.addShaped(iItemStack4, arrayOf(arrayOf<IIngredient?>(null, iOreDictEntry5, null), arrayOf(iOreDictEntry4, iItemStack11, iOreDictEntry4), arrayOf(iOreDictEntry4, iItemStack15, iOreDictEntry4)), null)
        Assembler.addRecipe(iItemStack5, iItemStack12, iItemStack15, 180, LV)
        MineTweakerAPI.recipes.addShaped(iItemStack5, arrayOf(arrayOf<IIngredient?>(null, iOreDictEntry5, null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500), iItemStack12, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500), iItemStack15, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))), null)
        Assembler.addRecipe(iItemStack6, iItemStack13, iItemStack15, 200, LMV)
        MineTweakerAPI.recipes.addShaped(iItemStack6, arrayOf(arrayOf<IIngredient?>(null, iOreDictEntry5, null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27890), iItemStack13, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27890)), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27890), iItemStack15, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27890))), null)
        Assembler.addRecipe(iItemStack7, iItemStack14, iItemStack15, 200, LMV)
        NEI.overrideName(ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_silver", 0), "Minecart With Steel Chest")
    }
}