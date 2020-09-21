package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI

class IronChestsMinecarts : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_copper", 0)
        val item2 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_iron", 0)
        val item3 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_silver", 0)
        val item4 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_gold", 0)
        val item5 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_diamond", 0)
        val item6 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_crystal", 0)
        val item7 = ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_obsidian", 0)
        val item8 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 3)
        val item9 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 0)
        val item10 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 4)
        val item11 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 1)
        val item12 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 2)
        val item13 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 5)
        val item14 = ItemBracketHandler.getItem("IronChest:BlockIronChest", 6)
        val ore = OreBracketHandler.getOre("screwCopper")
        val ore2 = OreBracketHandler.getOre("screwAnyIron")
        val ore3 = OreBracketHandler.getOre("screwSteel")
        val ore4 = OreBracketHandler.getOre("screwGold")
        val ore5 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val item15 = ItemBracketHandler.getItem("minecraft:minecart", 0)
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(item7)
        Assembler.addRecipe(item, item8, item15, 100, 2)
        MineTweakerAPI.recipes.addShaped(item, arrayOf(arrayOf<IIngredient?>(null, ore5, null), arrayOf(ore, item8, ore), arrayOf(ore, item15, ore)), null)
        Assembler.addRecipe(item2, item9, item15, 120, 4)
        MineTweakerAPI.recipes.addShaped(item2, arrayOf(arrayOf<IIngredient?>(null, ore5, null), arrayOf(ore2, item9, ore2), arrayOf(ore2, item15, ore2)), null)
        Assembler.addRecipe(item3, item10, item15, 140, 8)
        MineTweakerAPI.recipes.addShaped(item3, arrayOf(arrayOf<IIngredient?>(null, ore5, null), arrayOf(ore3, item10, ore3), arrayOf(ore3, item15, ore3)), null)
        Assembler.addRecipe(item4, item11, item15, 160, 16)
        MineTweakerAPI.recipes.addShaped(item4, arrayOf(arrayOf<IIngredient?>(null, ore5, null), arrayOf(ore4, item11, ore4), arrayOf(ore4, item15, ore4)), null)
        Assembler.addRecipe(item5, item12, item15, 180, 30)
        MineTweakerAPI.recipes.addShaped(item5, arrayOf(arrayOf<IIngredient?>(null, ore5, null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500), item12, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500), item15, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))), null)
        Assembler.addRecipe(item6, item13, item15, 200, 64)
        MineTweakerAPI.recipes.addShaped(item6, arrayOf(arrayOf<IIngredient?>(null, ore5, null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27890), item13, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27890)), arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27890), item15, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27890))), null)
        Assembler.addRecipe(item7, item14, item15, 200, 64)
        NEI.overrideName(ItemBracketHandler.getItem("ironchestminecarts:minecart_chest_silver", 0), "Minecart With Steel Chest")
    }
}