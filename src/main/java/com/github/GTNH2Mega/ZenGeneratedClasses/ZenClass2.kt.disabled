package com.github.GTNH2Mega.ZenGeneratedClasses

import minetweaker.api.data.IData
import minetweaker.api.item.IItemStack
import minetweaker.api.recipes.ICraftingInfo
import minetweaker.api.recipes.IRecipeFunction
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandByte
import java.util.*

class ZenClass2 : IRecipeFunction {
    override fun process(itemStack: IItemStack, map: Map<String, IItemStack>, craftingInfo: ICraftingInfo): IItemStack {
        val withTag = itemStack.withTag(map["ItemFilterUp"]!!.tag)
        val hashMap = HashMap<String, IData>()
        hashMap["FuzzyMeta"] = ExpandByte.asData(1.toByte())
        return withTag.updateTag(ExpandAnyDict.asData(hashMap))
    }
}