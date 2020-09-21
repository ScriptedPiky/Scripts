package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI
import java.util.*

class SGCraft : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("SGCraft:stargateRing", 0)
        val item2 = ItemBracketHandler.getItem("SGCraft:stargateRing", 1)
        val item3 = ItemBracketHandler.getItem("SGCraft:stargateBase", 0)
        val item4 = ItemBracketHandler.getItem("SGCraft:stargateController", 0)
        val item5 = ItemBracketHandler.getItem("SGCraft:naquadahBlock", 0)
        val item6 = ItemBracketHandler.getItem("SGCraft:naquadahOre", 0)
        val item7 = ItemBracketHandler.getItem("SGCraft:ic2PowerUnit", 0)
        val item8 = ItemBracketHandler.getItem("SGCraft:rfPowerUnit", 0)
        val item9 = ItemBracketHandler.getItem("SGCraft:ocInterface", 0)
        val item10 = ItemBracketHandler.getItem("SGCraft:naquadahIngot", 0)
        val item11 = ItemBracketHandler.getItem("SGCraft:naquadah", 0)
        val item12 = ItemBracketHandler.getItem("SGCraft:sgChevronUpgrade", 0)
        val item13 = ItemBracketHandler.getItem("SGCraft:sgIrisUpgrade", 0)
        val item14 = ItemBracketHandler.getItem("SGCraft:sgIrisBlade", 0)
        val item15 = ItemBracketHandler.getItem("SGCraft:ic2Capacitor", 0)
        val item16 = ItemBracketHandler.getItem("SGCraft:sgControllerCrystal", 0)
        val item17 = ItemBracketHandler.getItem("SGCraft:sgCoreCrystal", 0)
        val item18 = ItemBracketHandler.getItem("dreamcraft:item.StargateShieldingFoil", 0)
        val item19 = ItemBracketHandler.getItem("dreamcraft:item.StargateChevron", 0)
        val item20 = ItemBracketHandler.getItem("dreamcraft:item.StargateFramePart", 0)
        val item21 = ItemBracketHandler.getItem("dreamcraft:item.NanoCircuit", 0)
        val item22 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32677)
        val item23 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32647)
        val item24 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32697)
        val item25 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32687)
        val item26 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["type"] = ExpandString.asData("CREATIVE")
        hashMap["storedEnergyRF"] = ExpandInt.toData(2500000)
        val withTag = item26.withTag(ExpandAnyDict.asData(hashMap))
        val item27 = ItemBracketHandler.getItem("gregtech:gt.blockcasings", 15)
        NEI.hide(item4)
        NEI.hide(item16)
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(item8)
        MineTweakerAPI.recipes.remove(item9)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item15)
        ExtremeCrafting.addShaped(item, arrayOf(arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"),
                OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"), item20,
                item19, item20, item20, item18, item18),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item20, item20, item20, item18, item22, item22),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item20, item20, item18, item22, null, null),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item20, item20, item18, item22, null, null),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item20, item19, item18, item22, null, null),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item20, item20, item18, item22, null, null),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item20, item20, item18, item22, null, null),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item20, item20, item20, item18, item22, item22),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item20, item19, item20, item20, item18,
                        item18)))
        ExtremeCrafting.addShaped(item12, arrayOf(arrayOfNulls(9),
                arrayOf<IIngredient?>(null, null, null, item23, item19, item23, null, null, null),
                arrayOf<IIngredient?>(null, null, null, item20, item23, item20, null, null, null),
                arrayOf<IIngredient?>(null, null, null, item22, item19, item22, null, null, null),
                arrayOf<IIngredient?>(null, null, null, item20, item24, item20, null, null, null),
                arrayOf<IIngredient?>(null, null, null, item22, item20, item22, null, null, null),
                arrayOf<IIngredient?>(null, null, null, item20, item23, item20, null, null, null),
                arrayOf<IIngredient?>(null, null, null, item23, item19, item23, null, null, null), arrayOfNulls(9)))
        ExtremeCrafting.addShaped(item2, arrayOf(arrayOfNulls(9),
                arrayOf<IIngredient?>(null, null, null, null, OreBracketHandler.getOre("blockNaquadahAlloy"), null,
                        null, null, null),
                arrayOf(null, null, null, OreBracketHandler.getOre("blockNaquadahAlloy"), item24,
                        OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, null),
                arrayOf(null, null, OreBracketHandler.getOre("blockNaquadahAlloy"), item21, item12, item21,
                        OreBracketHandler.getOre("blockNaquadahAlloy"), null, null),
                arrayOf(null, OreBracketHandler.getOre("blockNaquadahAlloy"), item24, item12, item, item12, item24,
                        OreBracketHandler.getOre("blockNaquadahAlloy"), null),
                arrayOf(null, null, OreBracketHandler.getOre("blockNaquadahAlloy"), item21, item12, item21,
                        OreBracketHandler.getOre("blockNaquadahAlloy"), null, null),
                arrayOf(null, null, null, OreBracketHandler.getOre("blockNaquadahAlloy"), item24,
                        OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, null),
                arrayOf<IIngredient?>(null, null, null, null, OreBracketHandler.getOre("blockNaquadahAlloy"), null,
                        null, null, null), arrayOfNulls(9)))
        ExtremeCrafting.addShaped(item3, arrayOf(arrayOfNulls(9),
                arrayOf<IIngredient?>(null, null, null, OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        null, null, null),
                arrayOf(null, null, null, OreBracketHandler.getOre("blockNaquadahAlloy"), item25,
                        OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, null),
                arrayOf<IIngredient?>(null, null, null, item, item2, item, null, null, null),
                arrayOf<IIngredient?>(null, null, null, item, item17, item, null, null, null),
                arrayOf<IIngredient?>(null, null, null, item, item, item, null, null, null), arrayOfNulls(9),
                arrayOfNulls(9), arrayOfNulls(9)))
        ExtremeCrafting.addShaped(item15, arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                arrayOf<IIngredient?>(null, null, null, item18, item18, item18, null, null, null),
                arrayOf<IIngredient?>(null, null, item18, item22, withTag, item22, item18, null, null),
                arrayOf<IIngredient?>(null, null, item18, withTag, item22, withTag, item18, null, null),
                arrayOf<IIngredient?>(null, null, item18, item22, withTag, item22, item18, null, null),
                arrayOf<IIngredient?>(null, null, null, item18, item18, item18, null, null, null), arrayOfNulls(9),
                arrayOfNulls(9)))
        ExtremeCrafting.addShaped(item14,
                arrayOf(arrayOf<IIngredient?>(null, null, null, null, null, OreBracketHandler.getOre("blockTitanium"),
                        OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                        OreBracketHandler.getOre("blockTitanium")),
                        arrayOf<IIngredient?>(null, null, null, null, OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), null),
                        arrayOf<IIngredient?>(null, null, null, OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), null, null, null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                null, null, null), arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTitanium"),
                        OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                        OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                        OreBracketHandler.getOre("blockTitanium"), null, null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                null, null), arrayOf(OreBracketHandler.getOre("blockTitanium"), item23,
                        OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                        OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                        OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"), null),
                        arrayOf(item27, OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"), OreBracketHandler.getOre("blockTitanium"),
                                OreBracketHandler.getOre("blockTitanium"))))
        ExtremeCrafting.addShaped(item13,
                arrayOf(arrayOf<IIngredient?>(null, null, item14, item14, item14, item14, item14, null, null),
                        arrayOf<IIngredient?>(null, item27, null, null, null, null, null, item27, null),
                        arrayOf<IIngredient?>(item14, null, null, null, null, null, null, null, item14),
                        arrayOf<IIngredient?>(item14, null, null, null, null, null, null, null, item14),
                        arrayOf<IIngredient?>(item14, null, null, null, null, null, null, null, item14),
                        arrayOf<IIngredient?>(item14, null, null, null, null, null, null, null, item14),
                        arrayOf<IIngredient?>(item14, null, null, null, null, null, null, null, item14),
                        arrayOf<IIngredient?>(null, item27, null, null, null, null, null, item27, null),
                        arrayOf<IIngredient?>(null, null, item14, item14, item14, item14, item14, null, null)))
        ExtremeCrafting.addShaped(item8, arrayOf(arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"),
                OreBracketHandler.getOre("blockNaquadahAlloy"), item27, OreBracketHandler.getOre("blockNaquadahAlloy"),
                OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"), item27,
                OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, item27, null, null, null, item27, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, item27, null, item21, null, item27, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, item27, item15, item27, null, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, item21, item15, item, item15, item21,
                        null, OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, item27, item15, item27, null, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, null, item21, null, null, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, null, null, null,
                        null, null, OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf<IIngredient?>(OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"))))
        ExtremeCrafting.addShaped(item9, arrayOf(arrayOf(item21, item25, OreBracketHandler.getOre("blockNaquadahAlloy"),
                OreBracketHandler.getOre("blockNaquadahAlloy"), item27, OreBracketHandler.getOre("blockNaquadahAlloy"),
                OreBracketHandler.getOre("blockNaquadahAlloy"), item24, item21),
                arrayOf<IIngredient?>(item24, item27, null, null, item27, null, null, item27, item25),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, item27, null, item27, null, item27, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, item27, item27, item27, null, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf<IIngredient?>(item27, item27, item27, item27, item21, item27, item27, item27, item27),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, null, item27, item27, item27, null, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf(OreBracketHandler.getOre("blockNaquadahAlloy"), null, item27, null, item27, null, item27, null,
                        OreBracketHandler.getOre("blockNaquadahAlloy")),
                arrayOf<IIngredient?>(item25, item27, null, null, item27, null, null, item27, item24),
                arrayOf(item21, item24, OreBracketHandler.getOre("blockNaquadahAlloy"),
                        OreBracketHandler.getOre("blockNaquadahAlloy"), item27,
                        OreBracketHandler.getOre("blockNaquadahAlloy"), OreBracketHandler.getOre("blockNaquadahAlloy"),
                        item25, item21)))
    }
}