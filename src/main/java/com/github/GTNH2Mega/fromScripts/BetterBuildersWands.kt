package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class BetterBuildersWands : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterbuilderswands:wandStone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterbuilderswands:wandIron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterbuilderswands:wandDiamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("betterbuilderswands:wandStone", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSaw"),
                        OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("plateStone")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)

        //TODO Replace ("TConstruct:heavyPlate", 2) and ("TConstruct:toolRod", 2)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("betterbuilderswands:wandIron", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("screwSteel"),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 2)),
        //                arrayOf(null, ItemBracketHandler.getItem("TConstruct:toolRod", 2),
        //                        OreBracketHandler.getOre("screwSteel")),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:toolRod", 2), null,
        //                        OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        //Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandIron", 0),
        //        ItemBracketHandler.getItem("TConstruct:toolRod", 2).amount(2),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 2), 600, VoltageLevels.LV)

        val item = ItemBracketHandler.getItem("betterbuilderswands:wandDiamond", 0)

        //TODO Replace ("TGregworks:tGregToolPartToughRod", 1594) and ("TGregworks:tGregToolPartLargePlate", 1594)
        //val item2 = ItemBracketHandler.getItem("TGregworks:tGregToolPartToughRod", 1594)
        //val hashMap = HashMap<String, IData>()
        //hashMap["material"] = ExpandString.asData("Diamond")
        //val withTag = item2.withTag(ExpandAnyDict.asData(hashMap))
        //val item3 = ItemBracketHandler.getItem("TGregworks:tGregToolPartLargePlate", 1594)
        //val hashMap2 = HashMap<String, IData>()
        //hashMap2["material"] = ExpandString.asData("Diamond")
        //Assembler.addRecipe(item, withTag, item3.withTag(ExpandAnyDict.asData(hashMap2)), 600, VoltageLevels.LMV)

        //TODO Replace ("ExtraUtilities:builderswand", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 4),
        //        ItemBracketHandler.getItem("TConstruct:toughRod", 314),
        //        ItemBracketHandler.getItem("ExtraUtilities:builderswand", 0), 600, VoltageLevels.MV)

        //TODO Replace ("TConstruct:heavyPlate", 314)
        //Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 5),
        //        ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 4),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 314), 600, VoltageLevels.LHV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 6),
        //        ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 5),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 314).amount(2), 600,  VoltageLevels.HV)

        //TODO Replace ("ExtraUtilities:builderswand", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 12),
        //        ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 6),
        //        ItemBracketHandler.getItem("ExtraUtilities:creativebuilderswand", 0), 600, VoltageLevels.LEV)

        //TODO Replace ("TConstruct:heavyPlate", 314)
        //Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 13),
        //        ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 12),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 314).amount(4), 600, VoltageLevels.EV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 14),
        //        ItemBracketHandler.getItem("betterbuilderswands:wandUnbreakable", 13),
        //        ItemBracketHandler.getItem("TConstruct:heavyPlate", 314).amount(8), 600, VoltageLevels.LIV)
    }
}