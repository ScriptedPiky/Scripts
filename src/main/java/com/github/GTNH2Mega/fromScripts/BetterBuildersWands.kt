package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import java.util.*

class BetterBuildersWands : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterbuilderswands:wandStone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterbuilderswands:wandIron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterbuilderswands:wandDiamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 32767))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("betterbuilderswands:wandStone", 0), arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("plateStone")), arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("screwIron")), arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null, OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("betterbuilderswands:wandIron", 0), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("screwSteel"), ItemBracketHandler.getItem("TConstruct:heavyPlate", 2)), arrayOf(null, ItemBracketHandler.getItem("TConstruct:toolRod", 2), OreBracketHandler.getOre("screwSteel")), arrayOf(ItemBracketHandler.getItem("TConstruct:toolRod", 2), null, OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandIron", 0), ItemBracketHandler.getItem("TConstruct:toolRod", 2).amount(2), ItemBracketHandler.getItem("TConstruct:heavyPlate", 2), 600, 30)
        val item = ItemBracketHandler.getItem("betterbuilderswands:wandDiamond", 0)
        val item2 = ItemBracketHandler.getItem("TGregworks:tGregToolPartToughRod", 1594)
        val hashMap = HashMap<String, IData>()
        hashMap["material"] = ExpandString.asData("Diamond")
        val withTag = item2.withTag(ExpandAnyDict.asData(hashMap))
        val item3 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1594)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["material"] = ExpandString.asData("Diamond")
        Assembler.addRecipe(item, withTag, item3.withTag(ExpandAnyDict.asData(hashMap2)), 600, 64)
        Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 4), ItemBracketHandler.getItem("TConstruct:toughRod", 314), ItemBracketHandler.getItem("ExtraUtilities:builderswand", 0), 600, 120)
        Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 5), ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 4), ItemBracketHandler.getItem("TConstruct:heavyPlate", 314), 600, 256)
        Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 6), ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 5), ItemBracketHandler.getItem("TConstruct:heavyPlate", 314).amount(2), 600, 480)
        Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 12), ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 6), ItemBracketHandler.getItem("ExtraUtilities:creativebuilderswand", 0), 600, 1024)
        Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 13), ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 12), ItemBracketHandler.getItem("TConstruct:heavyPlate", 314).amount(4), 600, 1920)
        Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 14), ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 13), ItemBracketHandler.getItem("TConstruct:heavyPlate", 314).amount(8), 600, 4096)
    }
}