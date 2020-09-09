package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Backpack : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("Backpack:backpack", 0)
        val item2 = ItemBracketHandler.getItem("Backpack:backpack", 1)
        val item3 = ItemBracketHandler.getItem("Backpack:backpack", 2)
        val item4 = ItemBracketHandler.getItem("Backpack:backpack", 3)
        val item5 = ItemBracketHandler.getItem("Backpack:backpack", 4)
        val item6 = ItemBracketHandler.getItem("Backpack:backpack", 5)
        val item7 = ItemBracketHandler.getItem("Backpack:backpack", 6)
        val item8 = ItemBracketHandler.getItem("Backpack:backpack", 7)
        val item9 = ItemBracketHandler.getItem("Backpack:backpack", 8)
        val item10 = ItemBracketHandler.getItem("Backpack:backpack", 9)
        val item11 = ItemBracketHandler.getItem("Backpack:backpack", 10)
        val item12 = ItemBracketHandler.getItem("Backpack:backpack", 11)
        val item13 = ItemBracketHandler.getItem("Backpack:backpack", 12)
        val item14 = ItemBracketHandler.getItem("Backpack:backpack", 13)
        val item15 = ItemBracketHandler.getItem("Backpack:backpack", 14)
        val item16 = ItemBracketHandler.getItem("Backpack:backpack", 15)
        val item17 = ItemBracketHandler.getItem("Backpack:backpack", 16)
        val item18 = ItemBracketHandler.getItem("Backpack:backpack", 100)
        val item19 = ItemBracketHandler.getItem("Backpack:backpack", 101)
        val item20 = ItemBracketHandler.getItem("Backpack:backpack", 102)
        val item21 = ItemBracketHandler.getItem("Backpack:backpack", 103)
        val item22 = ItemBracketHandler.getItem("Backpack:backpack", 104)
        val item23 = ItemBracketHandler.getItem("Backpack:backpack", 105)
        val item24 = ItemBracketHandler.getItem("Backpack:backpack", 106)
        val item25 = ItemBracketHandler.getItem("Backpack:backpack", 107)
        val item26 = ItemBracketHandler.getItem("Backpack:backpack", 108)
        val item27 = ItemBracketHandler.getItem("Backpack:backpack", 109)
        val item28 = ItemBracketHandler.getItem("Backpack:backpack", 110)
        val item29 = ItemBracketHandler.getItem("Backpack:backpack", 111)
        val item30 = ItemBracketHandler.getItem("Backpack:backpack", 112)
        val item31 = ItemBracketHandler.getItem("Backpack:backpack", 113)
        val item32 = ItemBracketHandler.getItem("Backpack:backpack", 114)
        val item33 = ItemBracketHandler.getItem("Backpack:backpack", 115)
        val item34 = ItemBracketHandler.getItem("Backpack:backpack", 116)
        val item35 = ItemBracketHandler.getItem("Backpack:backpack", 200)
        val item36 = ItemBracketHandler.getItem("Backpack:backpack", 201)
        val item37 = ItemBracketHandler.getItem("Backpack:backpack", 202)
        val item38 = ItemBracketHandler.getItem("Backpack:backpack", 203)
        val item39 = ItemBracketHandler.getItem("Backpack:backpack", 204)
        val item40 = ItemBracketHandler.getItem("Backpack:backpack", 205)
        val item41 = ItemBracketHandler.getItem("Backpack:backpack", 206)
        val item42 = ItemBracketHandler.getItem("Backpack:backpack", 207)
        val item43 = ItemBracketHandler.getItem("Backpack:backpack", 208)
        val item44 = ItemBracketHandler.getItem("Backpack:backpack", 209)
        val item45 = ItemBracketHandler.getItem("Backpack:backpack", 210)
        val item46 = ItemBracketHandler.getItem("Backpack:backpack", 211)
        val item47 = ItemBracketHandler.getItem("Backpack:backpack", 212)
        val item48 = ItemBracketHandler.getItem("Backpack:backpack", 213)
        val item49 = ItemBracketHandler.getItem("Backpack:backpack", 214)
        val item50 = ItemBracketHandler.getItem("Backpack:backpack", 215)
        val item51 = ItemBracketHandler.getItem("Backpack:backpack", 216)
        ItemBracketHandler.getItem("Backpack:backpack", 31999)
        val item52 = ItemBracketHandler.getItem("Backpack:workbenchbackpack", 17)
        val item53 = ItemBracketHandler.getItem("Backpack:workbenchbackpack", 217)
        val item54 = ItemBracketHandler.getItem("Backpack:tannedLeather", 0)
        val item55 = ItemBracketHandler.getItem("Backpack:boundLeather", 0)
        val ore = OreBracketHandler.getOre("materialCloth")
        val item56 = ItemBracketHandler.getItem("minecraft:string", 0)
        val ore2 = OreBracketHandler.getOre("itemLeather")

        //TODO Replace ("harvestcraft:hardenedleatherItem", 0)
        //val item57 = ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0)

        //TODO Replace ("ExtraUtilities:paintbrush", 0)
        //val item58 = ItemBracketHandler.getItem("ExtraUtilities:paintbrush", 0)

        val ore3 = OreBracketHandler.getOre("ringSteel")
        val ore5 = OreBracketHandler.getOre("ringTitanium")

        //TODO Replace ("TConstruct:CraftingSlab", 0)
        //val item59 = ItemBracketHandler.getItem("TConstruct:CraftingSlab", 0)

        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Backpack:backpack", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Backpack:workbenchbackpack", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Backpack:boundLeather", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("Backpack:tannedLeather", 0), null)
        MineTweakerAPI.recipes.addShaped(item55,
                arrayOf(arrayOf(item56, ore2, item56), arrayOf<IIngredient>(ore2, ore, ore2),
                        arrayOf(item56, ore2, item56)), null)
        MineTweakerAPI.recipes.addShaped(item,
                arrayOf(arrayOf<IIngredient>(ore, ore3, ore), arrayOf(item54, ore, item54),
                        arrayOf<IIngredient>(item54, item54, item54)), null)

        //TODO Replace ("ExtraUtilities:paintbrush", 0) in val item58
        //MineTweakerAPI.recipes.addShapeless(item2, arrayOf(item, OreBracketHandler.getOre("dyeBlack"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item3, arrayOf(item, OreBracketHandler.getOre("dyeRed"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item4, arrayOf(item, OreBracketHandler.getOre("dyeGreen"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item5, arrayOf(item, OreBracketHandler.getOre("dyeBrown"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item6, arrayOf(item, OreBracketHandler.getOre("dyeBlue"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item7, arrayOf(item, OreBracketHandler.getOre("dyePurple"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item8, arrayOf(item, OreBracketHandler.getOre("dyeCyan"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item9, arrayOf(item, OreBracketHandler.getOre("dyeLightGray"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShapeless(item10, arrayOf(item, OreBracketHandler.getOre("dyeGray"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item11, arrayOf(item, OreBracketHandler.getOre("dyePink"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item12, arrayOf(item, OreBracketHandler.getOre("dyeLime"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item13, arrayOf(item, OreBracketHandler.getOre("dyeYellow"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item14, arrayOf(item, OreBracketHandler.getOre("dyeLightBlue"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShapeless(item15, arrayOf(item, OreBracketHandler.getOre("dyeMagenta"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item16, arrayOf(item, OreBracketHandler.getOre("dyeOrange"), item58), null)
        //MineTweakerAPI.recipes.addShapeless(item17, arrayOf(item, OreBracketHandler.getOre("dyeWhite"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item18,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item19, arrayOf(item18, OreBracketHandler.getOre("dyeBlack"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item19,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item2, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item20, arrayOf(item18, OreBracketHandler.getOre("dyeRed"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item20,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item3, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item21, arrayOf(item18, OreBracketHandler.getOre("dyeGreen"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item21,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item4, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item22, arrayOf(item18, OreBracketHandler.getOre("dyeBrown"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item22,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item5, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item23, arrayOf(item18, OreBracketHandler.getOre("dyeBlue"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item23,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item6, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item24, arrayOf(item18, OreBracketHandler.getOre("dyePurple"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item24,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item7, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item25, arrayOf(item18, OreBracketHandler.getOre("dyeCyan"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item25,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item8, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item26, arrayOf(item18, OreBracketHandler.getOre("dyeLightBlue"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item26,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item9, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item27, arrayOf(item18, OreBracketHandler.getOre("dyeGray"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item27,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item10, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item28, arrayOf(item18, OreBracketHandler.getOre("dyePink"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item28,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item11, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item29, arrayOf(item18, OreBracketHandler.getOre("dyeLime"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item29,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item12, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item30, arrayOf(item18, OreBracketHandler.getOre("dyeYellow"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item30,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item13, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item31, arrayOf(item18, OreBracketHandler.getOre("dyeLightBlue"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item31,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item14, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item32, arrayOf(item18, OreBracketHandler.getOre("dyeMagenta"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item32,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item15, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item33, arrayOf(item18, OreBracketHandler.getOre("dyeOrange"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item33,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item16, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShapeless(item34, arrayOf(item18, OreBracketHandler.getOre("dyeWhite"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item34,
        //        arrayOf(arrayOf(ore4, item54, ore4), arrayOf<IIngredient>(item54, item17, item54),
        //                arrayOf(ore4, item54, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(item35,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item18, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item36, arrayOf(item35, OreBracketHandler.getOre("dyeBlack"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item36,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item19, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item37, arrayOf(item35, OreBracketHandler.getOre("dyeRed"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item37,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item20, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item38, arrayOf(item35, OreBracketHandler.getOre("dyeGreen"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item38,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item21, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item39, arrayOf(item35, OreBracketHandler.getOre("dyeBrown"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item39,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item22, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item40, arrayOf(item35, OreBracketHandler.getOre("dyeBlue"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item40,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item23, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item41, arrayOf(item35, OreBracketHandler.getOre("dyePurple"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item41,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item24, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item42, arrayOf(item35, OreBracketHandler.getOre("dyeCyan"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item42,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item25, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item43, arrayOf(item35, OreBracketHandler.getOre("dyeLightGray"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item43,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item26, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item44, arrayOf(item35, OreBracketHandler.getOre("dyeGray"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item44,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item27, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item45, arrayOf(item35, OreBracketHandler.getOre("dyePink"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item45,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item28, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item46, arrayOf(item35, OreBracketHandler.getOre("dyeLime"), item58), null)
        //MineTweakerAPI.recipes.addShaped(item46,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item29, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item47, arrayOf(item35, OreBracketHandler.getOre("dyeYellow"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item47,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item30, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item48, arrayOf(item35, OreBracketHandler.getOre("dyeLightBlue"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item48,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item31, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item49, arrayOf(item35, OreBracketHandler.getOre("dyeMagenta"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item49,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item32, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item50, arrayOf(item35, OreBracketHandler.getOre("dyeOrange"), item58),
        //        null)
        //MineTweakerAPI.recipes.addShaped(item50,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item33, item57),
        //                arrayOf(ore5, item57, ore5)), null)
        //MineTweakerAPI.recipes.addShapeless(item51, arrayOf(item35, OreBracketHandler.getOre("dyeWhite"), item58), null)

        //TODO Replace ("harvestcraft:hardenedleatherItem", 0) in item57
        //MineTweakerAPI.recipes.addShaped(item51,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item34, item57),
        //                arrayOf(ore5, item57, ore5)), null)

        //TODO Replace ("TConstruct:CraftingSlab", 0) in item59
        //MineTweakerAPI.recipes.addShaped(item52,
        //        arrayOf(arrayOf<IIngredient>(ore, ore3, ore), arrayOf(item54, ore, item54),
        //                arrayOf<IIngredient>(item54, item59, item54)), null)
        //MineTweakerAPI.recipes.addShaped(item53,
        //        arrayOf(arrayOf(ore5, item57, ore5), arrayOf<IIngredient>(item57, item18, item57),
        //                arrayOf(ore5, item59, ore5)), null)

        //TODO Replace Drying Rack
        //Drying.addRecipe(ItemBracketHandler.getItem("Backpack:boundLeather", 0),
        //        ItemBracketHandler.getItem("Backpack:tannedLeather", 0), 12000)
    }
}