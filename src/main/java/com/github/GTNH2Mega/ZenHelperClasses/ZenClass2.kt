package com.github.GTNH2Mega.ZenHelperClasses

import minetweaker.api.recipes.IRecipeFunction
import minetweaker.api.item.IItemStack
import minetweaker.api.recipes.ICraftingInfo

class ZenClass2 : IRecipeFunction {
    override fun process(iItemStack: IItemStack?, p1: MutableMap<String, IItemStack>?, iCraftingInfo: ICraftingInfo?): IItemStack? {
        return p1?.get("armor")?.withDamage(0)
    }
}