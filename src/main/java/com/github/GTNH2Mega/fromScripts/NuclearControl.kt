package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class NuclearControl : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemToolThermometer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemToolDigitalThermometer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemRemoteSensorKit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemEnergySensorKit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemMultipleSensorKit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemMultipleSensorKit", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemMultipleSensorKit", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:KitAppeng", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemTimeCard", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemTextCard", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:networkLink", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:remoteMonitor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2NuclearControl:ItemVanilliaKit", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("glassReinforced"),
                        OreBracketHandler.getOre("glassReinforced"), OreBracketHandler.getOre("glassReinforced")),
                        arrayOf(OreBracketHandler.getOre("plateDenseLead"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                                OreBracketHandler.getOre("plateDenseLead")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32731),
                                OreBracketHandler.getOre("circuitAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("glassReinforced"),
                        ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 0),
                        OreBracketHandler.getOre("glassReinforced")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:repeater", 0),
                                ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 2),
                                ItemBracketHandler.getItem("minecraft:repeater", 0)),
                        arrayOf(OreBracketHandler.getOre("cableGt01Gold"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1),
                                OreBracketHandler.getOre("cableGt01Gold"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateIron"),
                        ItemBracketHandler.getItem("minecraft:noteblock", 0), OreBracketHandler.getOre("plateIron")),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf(OreBracketHandler.getOre("cableGt01RedAlloy"),
                                ItemBracketHandler.getItem("IC2:blockMachine", 0),
                                OreBracketHandler.getOre("cableGt01RedAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 3),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32690),
                        OreBracketHandler.getOre("glassReinforced"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32680)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740)),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 0),
                                OreBracketHandler.getOre("circuitBasic"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 4),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                        ItemBracketHandler.getItem("minecraft:stained_glass_pane", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740)),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("IC2:blockMachine", 0),
                                OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("cableGt01RedAlloy"), OreBracketHandler.getOre("plateIron"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 5),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                        ItemBracketHandler.getItem("minecraft:stained_glass_pane", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                OreBracketHandler.getOre("cableGt01RedAlloy"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 6),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateIron"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                        OreBracketHandler.getOre("plateIron")), arrayOf(OreBracketHandler.getOre("cableGt01Platinum"),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 24),
                        OreBracketHandler.getOre("cableGt01Platinum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("plateIron"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 7),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateLead"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                        OreBracketHandler.getOre("plateLead")), arrayOf(OreBracketHandler.getOre("cableGt01Platinum"),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 24),
                        OreBracketHandler.getOre("cableGt01Platinum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateLead"),
                                OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("plateLead"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 8),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                        OreBracketHandler.getOre("plateSteel")), arrayOf(OreBracketHandler.getOre("cableGt01Platinum"),
                        ItemBracketHandler.getItem("IC2:blockMachine", 12),
                        OreBracketHandler.getOre("cableGt01Platinum")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("IC2:itemFreq", 0),
                                OreBracketHandler.getOre("circuitAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 9),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 0),
                        ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 4),
                        ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyCarbon"),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("plateAlloyCarbon")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 10),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 0),
                        ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 5),
                        ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyCarbon"),
                                OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateAlloyCarbon")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("paneGlassWhite"),
                        OreBracketHandler.getOre("paneGlassWhite"), OreBracketHandler.getOre("paneGlassWhite")),
                        arrayOf(OreBracketHandler.getOre("paneGlassWhite"),
                                ItemBracketHandler.getItem("minecraft:redstone_lamp", 0),
                                OreBracketHandler.getOre("paneGlassWhite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("paneGlassWhite"),
                                OreBracketHandler.getOre("wireGt01RedAlloy"),
                                OreBracketHandler.getOre("paneGlassWhite"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("paneGlassOrange"),
                        OreBracketHandler.getOre("paneGlassOrange"), OreBracketHandler.getOre("paneGlassOrange")),
                        arrayOf(OreBracketHandler.getOre("paneGlassOrange"),
                                ItemBracketHandler.getItem("minecraft:redstone_lamp", 0),
                                OreBracketHandler.getOre("paneGlassOrange")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("paneGlassOrange"),
                                OreBracketHandler.getOre("wireGt01RedAlloy"),
                                OreBracketHandler.getOre("paneGlassOrange"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:ItemToolThermometer", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickIron"),
                        OreBracketHandler.getOre("plateGlass"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateGlass"),
                                OreBracketHandler.getOre("cellMercury"), OreBracketHandler.getOre("plateGlass")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateGlass"),
                                OreBracketHandler.getOre("plateGlass"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:ItemToolDigitalThermometer", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("IC2NuclearControl:ItemToolThermometer", 0),
                        OreBracketHandler.getOre("plateGlass"), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32702),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32702)),
                        arrayOf(null, OreBracketHandler.getOre("plateGlass"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("dyeRed"), OreBracketHandler.getOre("dyeYellow"),
                        OreBracketHandler.getOre("dyeGreen")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeWhite"),
                                OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("dyeMagenta")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"), OreBracketHandler.getOre("dyeCyan"),
                                OreBracketHandler.getOre("dyeBlue"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:networkLink", 0),
                arrayOf(arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 0)),
                        arrayOf(OreBracketHandler.getOre("plateAluminium"),
                                ItemBracketHandler.getItem("minecraft:comparator", 0),
                                OreBracketHandler.getOre("plateAluminium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2NuclearControl:remoteMonitor", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("cableGt01Tin"),
                        ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                        OreBracketHandler.getOre("cableGt01Tin")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemFreq", 0),
                                ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlMain", 5),
                                ItemBracketHandler.getItem("IC2:itemFreq", 0)),
                        arrayOf(OreBracketHandler.getOre("plateAlloyCarbon"),
                                ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 0),
                                OreBracketHandler.getOre("plateAlloyCarbon"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemRemoteSensorKit", 0),
                ItemBracketHandler.getItem("IC2NuclearControl:ItemToolDigitalThermometer", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), 1600, VoltageLevels.LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemEnergySensorKit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32734),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), 1600, VoltageLevels.LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemMultipleSensorKit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32731),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), 1600, VoltageLevels.LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemMultipleSensorKit", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32732),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), 1600, VoltageLevels.LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemMultipleSensorKit", 2),
                ItemBracketHandler.getItem("IC2:upgradeModule", 2), ItemBracketHandler.getItem("IC2:itemFreq", 0), 1600,
                2)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:KitAppeng", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 400),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), 2800, VoltageLevels.LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemTimeCard", 0),
                ItemBracketHandler.getItem("minecraft:clock", 0), ItemBracketHandler.getItem("IC2:itemFreq", 0), 1600,
                2)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemUpgrade", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32690),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), 1600, VoltageLevels.LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemTextCard", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), 1600, VoltageLevels.LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2NuclearControl:ItemVanilliaKit", 0),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0), ItemBracketHandler.getItem("IC2:itemFreq", 0),
                1600, 2)
    }
}