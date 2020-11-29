package com.github.GTNH2Mega.fromScripts

import minetweaker.api.recipes.IRecipeFunction
import minetweaker.api.item.IItemStack
import minetweaker.api.recipes.ICraftingInfo

class ZenClass0 : IRecipeFunction {
    override fun process(iItemStack: IItemStack?, map: MutableMap<String, IItemStack>?, iCraftingInfo: ICraftingInfo?): IItemStack? {
        return map?.get("boots")?.withDamage(0)
    }
}