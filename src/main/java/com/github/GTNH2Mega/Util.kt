package com.github.GTNH2Mega

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.item.ItemStack
import net.minecraft.item.crafting.CraftingManager
import net.minecraft.item.crafting.IRecipe
import net.minecraftforge.oredict.OreDictionary

object Util {
    fun getItemStack(Identifier: String, meta: Int, count : Int) : ItemStack {
        val idname = Identifier.split(":")

        return ItemStack(GameRegistry.findItem(idname[0],idname[1]), count , meta )
    }

    fun getItemStack(Identifier: String, meta : Int) : ItemStack = getItemStack(Identifier,1, meta)

    fun compareStacks(aStack1:ItemStack?, aStack2:ItemStack?) = aStack1 != null && aStack2 != null && aStack1.item == aStack2.item && (aStack2.itemDamage == 0 || aStack1.itemDamage == aStack2.itemDamage || aStack2.itemDamage == OreDictionary.WILDCARD_VALUE)

    @Suppress("UNCHECKED_CAST")
    fun removeRecipe(stack:ItemStack?) = (CraftingManager.getInstance().recipeList as MutableList<IRecipe>).removeIf { compareStacks(it.recipeOutput, stack) }

    fun getOreDictList(identifier: String) : List<ItemStack> = OreDictionary.getOres(identifier)

    fun ItemStack.amount(count: Int) = ItemStack(this.item, count, this.itemDamage)
}