package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.tooltip.IngredientTooltips
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class ForestryFrames : Runnable {
    override fun run() {
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                ExpandString.add("Durability:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" 80"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                ExpandString.add("Production:", MineTweakerAPI.format.darkGreen(ExpandString.asFormattedText(" x2"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameUntreated", 0),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x0.9"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                ExpandString.add("Durability:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" 240"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                ExpandString.add("Production:", MineTweakerAPI.format.darkGreen(ExpandString.asFormattedText(" x2"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                ExpandString.add("Genetic-Decay:",
                        MineTweakerAPI.format.darkGreen(ExpandString.asFormattedText(" x0.4"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("Forestry:frameProven", 0),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameProven", 0),
                ExpandString.add("Durability:", MineTweakerAPI.format.darkGreen(ExpandString.asFormattedText(" 720"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameProven", 0),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameProven", 0),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameProven", 0),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("Forestry:frameProven", 0),
                ExpandString.add("Production:", MineTweakerAPI.format.darkGreen(ExpandString.asFormattedText(" x2"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0),
                ExpandString.add("Durability:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" 240"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0),
                ExpandString.add("Lifespan:",
                        MineTweakerAPI.format.red(ExpandString.asFormattedText(" x0.75 (x0.25x)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0),
                ExpandString.add("Production:",
                        MineTweakerAPI.format.green(ExpandString.asFormattedText(" x1.5 (x5)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                ExpandString.add("Durability:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" 240"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                ExpandString.add("Territory:",
                        MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.5 (x0.1)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                ExpandString.add("Lifespan:",
                        MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x0.75 (x0.5)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                ExpandString.add("Production:",
                        MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x0.75 (x0.5)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                ExpandString.add("Durability:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" 80"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                ExpandString.add("Mutation-Rate:",
                        MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1.5 (x5)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                ExpandString.add("Lifespan:",
                        MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x0.75 (x0.5)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                ExpandString.add("Production:",
                        MineTweakerAPI.format.red(ExpandString.asFormattedText(" x0.25 (x0.1)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0),
                ExpandString.add("Durability:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" 240"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0),
                ExpandString.add("Mutation-Rate:",
                        MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.5 (x0.2)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" x1.5 (x5)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0),
                ExpandString.add("Production:",
                        MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x0.75 (x0.2)"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.debug", 0),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.debug", 0),
                ExpandString.add("Durability:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" 240"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.debug", 0),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.debug", 0),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.debug", 0),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.0001"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.debug", 0),
                ExpandString.add("Production:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("ExtraBees:hiveFrame.debug", 0),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //TODO Replace ("miscutils:frameAccelerated", 0), ("miscutils:frameUseless", 0), ("miscutils:frameDecaying", OreDictionary.WILDCARD_VALUE)
        // ("miscutils:frameSlowing", OreDictionary.WILDCARD_VALUE), ("miscutils:frameStabilizing", OreDictionary.WILDCARD_VALUE), ("miscutils:frameArborists", OreDictionary.WILDCARD_VALUE),
        // ("miscutils:frameMutagenic", OreDictionary.WILDCARD_VALUE) and ("miscutils:frameBusy", OreDictionary.WILDCARD_VALUE)
        // NOTE: These are GT++ Bee frames, if they are to be reimplemented just build the tooltip into the replacement mod.
        //IngredientTooltips.addTooltip(ItemBracketHandler.getItem("miscutils:frameAccelerated", 0),
        //        ExpandString.asFormattedText("<Hold Shift>"))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameAccelerated", 0),
        //        ExpandString.add("Durability:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" 175"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameAccelerated", 0),
        //        ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameAccelerated", 0),
        //        ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1.2"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameAccelerated", 0),
        //        ExpandString.add("Lifespan:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x0.9"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameAccelerated", 0),
        //        ExpandString.add("Production:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" x1.8"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameAccelerated", 0),
        //        ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addTooltip(ItemBracketHandler.getItem("miscutils:frameUseless", 0),
        //        ExpandString.asFormattedText("Broken."))
        //IngredientTooltips.addTooltip(ItemBracketHandler.getItem("miscutils:frameDecaying", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.asFormattedText("<Hold Shift>"))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameDecaying", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Durability:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" 240"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameDecaying", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameDecaying", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameDecaying", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Lifespan:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameDecaying", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Production:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameDecaying", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x10"))))
        //IngredientTooltips.addTooltip(ItemBracketHandler.getItem("miscutils:frameSlowing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.asFormattedText("<Hold Shift>"))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameSlowing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Durability:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" 175"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameSlowing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Territory:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameSlowing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Mutation-Rate:",
        //                MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.5"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameSlowing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Lifespan:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x2"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameSlowing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Production:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.5"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameSlowing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addTooltip(ItemBracketHandler.getItem("miscutils:frameStabilizing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.asFormattedText("<Hold Shift>"))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameStabilizing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Durability:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" 60"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameStabilizing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameStabilizing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Mutation-Rate:",
        //                MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameStabilizing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Lifespan:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameStabilizing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Production:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameStabilizing", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x0.5"))))
        //IngredientTooltips.addTooltip(ItemBracketHandler.getItem("miscutils:frameArborists", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.asFormattedText("<Hold Shift>"))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameArborists", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Durability:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" 240"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameArborists", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Territory:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x3"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameArborists", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameArborists", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Lifespan:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x3"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameArborists", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Production:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameArborists", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addTooltip(ItemBracketHandler.getItem("miscutils:frameMutagenic", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.asFormattedText("<Hold Shift>"))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameMutagenic", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Durability:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" 3"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameMutagenic", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameMutagenic", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x5"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameMutagenic", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Lifespan:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.0001"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameMutagenic", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Production:", MineTweakerAPI.format.bold(ExpandString.asFormattedText(" x10"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameMutagenic", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addTooltip(ItemBracketHandler.getItem("miscutils:frameBusy", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.asFormattedText("<Hold Shift>"))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameBusy", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Durability:", MineTweakerAPI.format.bold(ExpandString.asFormattedText(" 2000"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameBusy", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameBusy", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameBusy", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Lifespan:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x3"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameBusy", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Production:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x4"))))
        //IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("miscutils:frameBusy", OreDictionary.WILDCARD_VALUE),
        //        ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("MagicBees:frameMagic", OreDictionary.WILDCARD_VALUE),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMagic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Durability:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" 240"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMagic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMagic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMagic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMagic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Production:", MineTweakerAPI.format.darkGreen(ExpandString.asFormattedText(" x2"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMagic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText("x0.6"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("MagicBees:frameResilient", OreDictionary.WILDCARD_VALUE),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameResilient", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Durability:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" 800"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameResilient", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameResilient", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameResilient", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameResilient", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Production:", MineTweakerAPI.format.darkGreen(ExpandString.asFormattedText(" x2"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameResilient", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" x0.5"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("MagicBees:frameGentle", OreDictionary.WILDCARD_VALUE),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameGentle", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Durability:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" 200"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameGentle", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameGentle", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" x0.7"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameGentle", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" x1.5"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameGentle", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Production:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" x1.4"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameGentle", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x0.01"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("MagicBees:frameMetabolic", OreDictionary.WILDCARD_VALUE),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMetabolic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Durability:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" 130"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMetabolic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMetabolic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" x1.8"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMetabolic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMetabolic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Production:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" x1.2"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameMetabolic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("MagicBees:frameNecrotic", OreDictionary.WILDCARD_VALUE),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameNecrotic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Durability:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" 280"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameNecrotic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameNecrotic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameNecrotic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" x0.3"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameNecrotic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Production:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x0.75"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameNecrotic", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.red(ExpandString.asFormattedText(" x1.2"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("MagicBees:frameTemporal", OreDictionary.WILDCARD_VALUE),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameTemporal", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Durability:", MineTweakerAPI.format.green(ExpandString.asFormattedText(" 300"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameTemporal", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameTemporal", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameTemporal", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.darkGreen(ExpandString.asFormattedText(" x2.5"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameTemporal", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Production:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameTemporal", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.yellow(ExpandString.asFormattedText(" x0.8"))))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("MagicBees:frameOblivion", OreDictionary.WILDCARD_VALUE),
                ExpandString.asFormattedText("<Hold Shift>"))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameOblivion", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Durability:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" 50"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameOblivion", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Territory:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameOblivion", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Mutation-Rate:", MineTweakerAPI.format.gold(ExpandString.asFormattedText(" x1"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameOblivion", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Lifespan:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0.0001"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameOblivion", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Production:", MineTweakerAPI.format.darkRed(ExpandString.asFormattedText(" x0"))))
        IngredientTooltips.addShiftTooltip(ItemBracketHandler.getItem("MagicBees:frameOblivion", OreDictionary.WILDCARD_VALUE),
                ExpandString.add("Genetic-Decay:", MineTweakerAPI.format.aqua(ExpandString.asFormattedText(" x1"))))
    }
}