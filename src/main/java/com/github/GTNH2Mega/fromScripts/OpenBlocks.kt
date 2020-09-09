package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.ChemicalBath
import gttweaker.mods.gregtech.machines.ChemicalReactor
import gttweaker.mods.gregtech.machines.Mixer
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IItemStack
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandByte
import minetweaker.expand.ExpandFloat
import minetweaker.expand.ExpandInt
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import modtweaker2.mods.thaumcraft.handlers.Warp
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class OpenBlocks : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("OpenBlocks:hangglider", 0)
        val item2 = ItemBracketHandler.getItem("OpenBlocks:generic", 0)
        val item3 = ItemBracketHandler.getItem("OpenBlocks:luggage", 0)

        //TODO investigate getters with no target field for ("TConstruct:GlassBlock", 0)
        //ItemBracketHandler.getItem("TConstruct:GlassBlock", 0)

        ItemBracketHandler.getItem("minecraft:enchanting_table", 0)
        ItemBracketHandler.getItem("minecraft:anvil", 0)
        val item4 = ItemBracketHandler.getItem("minecraft:iron_bars", 0)
        val item5 = ItemBracketHandler.getItem("minecraft:stone_slab", 3)
        val item6 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21057)
        val item7 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601)
        val item8 = ItemBracketHandler.getItem("minecraft:hopper", 0)
        OreBracketHandler.getOre("pipeSmallStainlessSteel")
        OreBracketHandler.getOre("stickAnyIron")
        val ore = OreBracketHandler.getOre("stickSteel")
        OreBracketHandler.getOre("stickDiamond")
        OreBracketHandler.getOre("plateEnderEye")
        OreBracketHandler.getOre("stickNetherStar")
        ItemBracketHandler.getItem("IronChest:BlockIronChest", 6)
        val item9 = ItemBracketHandler.getItem("IC2:blockLuminatorDark", 0)
        OreBracketHandler.getOre("plateAnyIron")
        OreBracketHandler.getOre("stickRedAlloy")
        OreBracketHandler.getOre("stickAluminium")
        OreBracketHandler.getOre("gearSteel")
        OreBracketHandler.getOre("gearStainlessSteel")
        val ore2 = OreBracketHandler.getOre("lensDiamond")
        ItemBracketHandler.getItem("minecraft:piston", 0)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32722)
        val ore3 = OreBracketHandler.getOre("stoneObsidian")
        OreBracketHandler.getOre("stone")
        val ore4 = OreBracketHandler.getOre("itemLeather")
        val item10 = ItemBracketHandler.getItem("OpenBlocks:guide", 0)
        val item11 = ItemBracketHandler.getItem("OpenBlocks:blockPlacer", 0)
        val item12 = ItemBracketHandler.getItem("OpenBlocks:blockbreaker", 0)
        val item13 = ItemBracketHandler.getItem("OpenBlocks:itemDropper", 0)
        OreBracketHandler.getOre("blockWool")
        val item14 = ItemBracketHandler.getItem("Backpack:tannedLeather", 0)
        ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE)
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:autoenchantmenttable", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:autoanvil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:xpdrain", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:path", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:fan", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:elevator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:vacuumhopper", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:sprinkler", 0))
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:builder_guide", 0))
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:sleepingBag", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:ropeladder", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:ladder", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:beartrap", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:cannon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:sponge", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:goldenegg", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:village_highlighter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:sky", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:sky", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:projector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:paintmixer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:canvas", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:xpbottler", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:drawingtable", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:imaginary", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:imaginary", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:xpshower", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:scaffolding", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:craneControl", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:craneBackpack", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:generic", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:cartographer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:slimalyzer", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("OpenBlocks:paintBrush", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:sonicglasses", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:devnull", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:pedometer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:tastyClay", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("OpenBlocks:goldenEye", OreDictionary.WILDCARD_VALUE), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("OpenBlocks:cursor", 0))
        MineTweakerAPI.recipes.addShaped(item, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("screwSteel")),
                arrayOf(item2, OreBracketHandler.getOre("plateSteel"), item2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"),
                        OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("craftingToolScrewdriver"))),
                null)
        MineTweakerAPI.recipes.addShaped(item2,
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"), ore, ore4),
                        arrayOf(ore, item14, ore4), arrayOf<IIngredient>(ore4, ore4, ore4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:autoanvil", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("blockStainlessSteel"),
                        OreBracketHandler.getOre("blockStainlessSteel"),
                        OreBracketHandler.getOre("blockStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                                ItemBracketHandler.getItem("Railcraft:anvil", 0),
                                OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateRedAlloy"),
                                OreBracketHandler.getOre("blockRedstone"), OreBracketHandler.getOre("plateRedAlloy"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:xpdrain", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwAnyIron"),
                        OreBracketHandler.getOre("stickAnyIron"), OreBracketHandler.getOre("screwAnyIron")),
                        arrayOf(OreBracketHandler.getOre("stickAnyIron"), item4,
                                OreBracketHandler.getOre("stickAnyIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwAnyIron"),
                                OreBracketHandler.getOre("stickAnyIron"), OreBracketHandler.getOre("screwAnyIron"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:path", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(item5, null, item5), arrayOf<IIngredient?>(null, item5, null),
                        arrayOf<IIngredient?>(item5, null, item5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:fan", 0),
                arrayOf(arrayOf<IIngredient>(item4, item6, item4),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("plateAnyIron"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("plateAnyIron"), item7,
                                OreBracketHandler.getOre("plateAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:elevator", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("plateEnderPearl"), OreBracketHandler.getOre("plateSteel")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4115),
                                OreBracketHandler.getOre("gearGtSmallSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"),
                                OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickSteel"), null),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("OpenBlocks:elevator", 0),
                                OreBracketHandler.getOre("gearGtSmallSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("craftingToolFile"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                                ItemBracketHandler.getItem("OpenBlocks:elevator", 0),
                                OreBracketHandler.getOre("gearGtSmallSteel")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickSteel"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:vacuumhopper", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateObsidian"), item8,
                        OreBracketHandler.getOre("plateObsidian")),
                        arrayOf(item8, OreBracketHandler.getOre("plateEnderPearl"), item8),
                        arrayOf(OreBracketHandler.getOre("plateObsidian"), item8,
                                OreBracketHandler.getOre("plateObsidian"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:sprinkler", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.AluminiumBars", 0),
                        OreBracketHandler.getOre("stickGold"),
                        ItemBracketHandler.getItem("dreamcraft:item.AluminiumBars", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("pipeSmallDarkSteel"),
                                OreBracketHandler.getOre("rotorDarkSteel"),
                                OreBracketHandler.getOre("pipeSmallDarkSteel")),
                        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.AluminiumBars", 0),
                                OreBracketHandler.getOre("stickGold"),
                                ItemBracketHandler.getItem("dreamcraft:item.AluminiumBars", 0))), null)
        MineTweakerAPI.recipes.addShaped(item10,
                arrayOf(arrayOf(ore3, item9, ore3), arrayOf(item9, ore2, item9), arrayOf(ore3, item9, ore3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("OpenBlocks:blockPlacer", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 2)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("OpenBlocks:blockbreaker", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 0)),
                null)
        MineTweakerAPI.recipes.addShaped(item13, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateStone"),
                OreBracketHandler.getOre("wireGt01RedAlloy"), OreBracketHandler.getOre("plateStone")),
                arrayOf(OreBracketHandler.getOre("gearGtSmallSteel"),
                        ItemBracketHandler.getItem("minecraft:dropper", 0),
                        OreBracketHandler.getOre("gearGtSmallSteel")),
                arrayOf(OreBracketHandler.getOre("plateStone"), ItemBracketHandler.getItem("minecraft:hopper", 0),
                        OreBracketHandler.getOre("plateStone"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:beartrap", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:cannon", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolSaw"),
                        OreBracketHandler.getOre("pipeLargeSteel"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtSmallWood"),
                                OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("gearGtSmallWood")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:village_highlighter", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                OreBracketHandler.getOre("plateEmerald"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateStone"),
                                OreBracketHandler.getOre("plateStone"), OreBracketHandler.getOre("plateStone"))), null)

        //TODO Replace ("TConstruct:GlassPane", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:sky", 0).amount(6),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                OreBracketHandler.getOre("plateEnderEye"),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0)),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                        OreBracketHandler.getOre("stoneEndstone"),
        //                        ItemBracketHandler.getItem("TConstruct:GlassPane", 0)),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                        OreBracketHandler.getOre("plateEnderEye"),
        //                        ItemBracketHandler.getItem("TConstruct:GlassPane", 0))), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("OpenBlocks:sky", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:sky", 1)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:projector", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                ItemBracketHandler.getItem("OpenComputers:hologram1", 0),
                                OreBracketHandler.getOre("craftingRedstoneTorch")),
                        arrayOf(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                                OreBracketHandler.getOre("craftingRedstoneTorch"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("OpenBlocks:canvas", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BiblioCraft:item.PaintingCanvas", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:drawingtable", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:generic", 10),
                        ItemBracketHandler.getItem("OpenBlocks:generic", 11),
                        ItemBracketHandler.getItem("OpenBlocks:generic", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:xpshower", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                        OreBracketHandler.getOre("pipeSmallSteel"), OreBracketHandler.getOre("itemCasingAnyIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                                OreBracketHandler.getOre("pipeSmallSteel"),
                                OreBracketHandler.getOre("itemCasingAnyIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("pipeSmallSteel"),
                                OreBracketHandler.getOre("pipeSmallSteel"),
                                OreBracketHandler.getOre("pipeSmallSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("OpenBlocks:scaffolding", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905)), null)

        //TODO Replace ("ProjectBlue:miniatureLamp", 14)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:generic", 9),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("ProjectBlue:miniatureLamp", 14),
        //                OreBracketHandler.getOre("plateEnderEye"),
        //                ItemBracketHandler.getItem("ProjectBlue:miniatureLamp", 14)),
        //                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
        //                        OreBracketHandler.getOre("circuitBasic"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("rotorAluminium"),
        //                        OreBracketHandler.getOre("plateEnderEye"), OreBracketHandler.getOre("rotorAluminium"))),
        //        null)

        //TODO Replace ("TConstruct:materials", 1)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:slimalyzer", 0),
        //        arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
        //                OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("screwIron")),
        //                arrayOf(OreBracketHandler.getOre("itemCasingAnyIron"),
        //                        ItemBracketHandler.getItem("TConstruct:materials", 1),
        //                        OreBracketHandler.getOre("itemCasingAnyIron")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
        //                        OreBracketHandler.getOre("circuitBasic"),
        //                        OreBracketHandler.getOre("craftingToolFile"))), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("OpenBlocks:paintBrush", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Core:paintbrush", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("OpenBlocks:sonicglasses", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("wireGt01RedAlloy"),
                        ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 19),
                        OreBracketHandler.getOre("wireGt01RedAlloy")), arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("minecraft:iron_helmet", 0).amount(1),
                        OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwAluminium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwAluminium"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:ropeladder", 0).amount(64),
                ItemBracketHandler.getItem("minecraft:string", 0).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22809).amount(64), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:ladder", 0),
                ItemBracketHandler.getItem("minecraft:trapdoor", 0), ItemBracketHandler.getItem("minecraft:ladder", 0),
                200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:sky", 1),
                ItemBracketHandler.getItem("OpenBlocks:sky", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:paintmixer", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 581),
                OreBracketHandler.getOre("itemCasingAnyIron").amount(4), 600, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:xpbottler", 0),
                ItemBracketHandler.getItem("Forestry:factory", 0),
                OreBracketHandler.getOre("itemCasingAnyIron").amount(4), 600, VoltageLevels.LV)

        //TODO Replace ("TConstruct:blankPattern", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:generic", 10),
        //        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032), 200, VoltageLevels.LLV)

        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:generic", 11),
                ItemBracketHandler.getItem("minecraft:stick", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1865),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(144), 100, VoltageLevels.ULV)
        val item15 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["Uses"] = ExpandFloat.asData(10.0.toFloat())
        Assembler.addRecipe(item15.withTag(ExpandAnyDict.asData(hashMap)),
                ItemBracketHandler.getItem("OpenBlocks:generic", 11),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17533), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:generic", 6),
                ItemBracketHandler.getItem("OpenComputers:item", 32),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:generic", 7),
                ItemBracketHandler.getItem("OpenBlocks:generic", 6),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 400, VoltageLevels.LV)
        val item16 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["Scale"] = ExpandByte.asData(0.toByte())
        Assembler.addRecipe(item16.withTag(ExpandAnyDict.asData(hashMap2)),
                ItemBracketHandler.getItem("OpenBlocks:generic", 6),
                ItemBracketHandler.getItem("OpenBlocks:generic", 7).amount(4), 600, VoltageLevels.LV)
        val item17 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["Scale"] = ExpandByte.asData(1.toByte())
        val withTag = item17.withTag(ExpandAnyDict.asData(hashMap3))
        val item18 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["Scale"] = ExpandByte.asData(0.toByte())
        Assembler.addRecipe(withTag, item18.withTag(ExpandAnyDict.asData(hashMap4)),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                LiquidBracketHandler.getLiquid("molten.tin").withAmount(144), 600, VoltageLevels.LV)
        val item19 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["Scale"] = ExpandByte.asData(2.toByte())
        val withTag2 = item19.withTag(ExpandAnyDict.asData(hashMap5))
        val item20 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["Scale"] = ExpandByte.asData(1.toByte())
        Assembler.addRecipe(withTag2, item20.withTag(ExpandAnyDict.asData(hashMap6)),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 800, VoltageLevels.LV)
        val item21 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap7 = HashMap<String, IData>()
        hashMap7["Scale"] = ExpandByte.asData(3.toByte())
        val withTag3 = item21.withTag(ExpandAnyDict.asData(hashMap7))
        val item22 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap8 = HashMap<String, IData>()
        hashMap8["Scale"] = ExpandByte.asData(2.toByte())
        Assembler.addRecipe(withTag3, item22.withTag(ExpandAnyDict.asData(hashMap8)),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32702).amount(2),
                LiquidBracketHandler.getLiquid("molten.redalloy").withAmount(144), 1000, VoltageLevels.LV)
        val item23 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap9 = HashMap<String, IData>()
        hashMap9["Scale"] = ExpandByte.asData(4.toByte())
        val withTag4 = item23.withTag(ExpandAnyDict.asData(hashMap9))
        val item24 = ItemBracketHandler.getItem("OpenBlocks:emptyMap", 0)
        val hashMap10 = HashMap<String, IData>()
        hashMap10["Scale"] = ExpandByte.asData(3.toByte())
        Assembler.addRecipe(withTag4, item24.withTag(ExpandAnyDict.asData(hashMap10)),
                ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0).amount(2),
                LiquidBracketHandler.getLiquid("molten.glowstone").withAmount(144), 1200, VoltageLevels.LV)

        //TODO Replace getLiquid("ender")
        //Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:cartographer", 0),
        //        ItemBracketHandler.getItem("OpenBlocks:generic", 9),
        //        ItemBracketHandler.getItem("minecraft:ender_eye", 0),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, VoltageLevels.MV)

        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:pedometer", 0),
                ItemBracketHandler.getItem("minecraft:clock", 0),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0).amount(2),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("OpenBlocks:builder_guide", 0),
                ItemBracketHandler.getItem("OpenBlocks:guide", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24533),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 300, VoltageLevels.LMV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 15)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblack").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 14)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyered").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 13)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegreen").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 12)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyebrown").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 11)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblue").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 10)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepurple").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 9)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyecyan").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 8)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightgray").withAmount(144), intArrayOf(10000), 200,
                20)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 7)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegray").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 6)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepink").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 5)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelime").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 4)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeyellow").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 3)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightblue").withAmount(144), intArrayOf(10000), 200,
                20)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 2)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyemagenta").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 1)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeorange").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator", 0)),
                ItemBracketHandler.getItem("OpenBlocks:elevator", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyewhite").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 15)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblack").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 14)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyered").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 13)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegreen").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 12)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyebrown").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 11)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblue").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 10)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepurple").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 9)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyecyan").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 8)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightgray").withAmount(144), intArrayOf(10000), 200,
                20)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 7)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegray").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 6)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepink").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 5)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelime").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 4)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeyellow").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 3)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightblue").withAmount(144), intArrayOf(10000), 200,
                20)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 2)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyemagenta").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 1)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeorange").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", 0)),
                ItemBracketHandler.getItem("OpenBlocks:elevator_rotating", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyewhite").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array = arrayOf<IItemStack?>(null)
        val n = 0
        val item25 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap11 = HashMap<String, IData>()
        hashMap11["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap11["Color"] = ExpandInt.toData(1973019)
        array[n] = item25.withTag(ExpandAnyDict.asData(hashMap11))
        ChemicalBath.addRecipe(array, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblack").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array2 = arrayOf<IItemStack?>(null)
        val n2 = 0
        val item26 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap12 = HashMap<String, IData>()
        hashMap12["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap12["Color"] = ExpandInt.toData(11743532)
        array2[n2] = item26.withTag(ExpandAnyDict.asData(hashMap12))
        ChemicalBath.addRecipe(array2, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyered").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array3 = arrayOf<IItemStack?>(null)
        val n3 = 0
        val item27 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap13 = HashMap<String, IData>()
        hashMap13["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap13["Color"] = ExpandInt.toData(3887386)
        array3[n3] = item27.withTag(ExpandAnyDict.asData(hashMap13))
        ChemicalBath.addRecipe(array3, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegreen").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array4 = arrayOf<IItemStack?>(null)
        val n4 = 0
        val item28 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap14 = HashMap<String, IData>()
        hashMap14["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap14["Color"] = ExpandInt.toData(5320730)
        array4[n4] = item28.withTag(ExpandAnyDict.asData(hashMap14))
        ChemicalBath.addRecipe(array4, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyebrown").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array5 = arrayOf<IItemStack?>(null)
        val n5 = 0
        val item29 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap15 = HashMap<String, IData>()
        hashMap15["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap15["Color"] = ExpandInt.toData(2437522)
        array5[n5] = item29.withTag(ExpandAnyDict.asData(hashMap15))
        ChemicalBath.addRecipe(array5, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblue").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array6 = arrayOf<IItemStack?>(null)
        val n6 = 0
        val item30 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap16 = HashMap<String, IData>()
        hashMap16["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap16["Color"] = ExpandInt.toData(8073150)
        array6[n6] = item30.withTag(ExpandAnyDict.asData(hashMap16))
        ChemicalBath.addRecipe(array6, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepurple").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array7 = arrayOf<IItemStack?>(null)
        val n7 = 0
        val item31 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap17 = HashMap<String, IData>()
        hashMap17["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap17["Color"] = ExpandInt.toData(2651799)
        array7[n7] = item31.withTag(ExpandAnyDict.asData(hashMap17))
        ChemicalBath.addRecipe(array7, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyecyan").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array8 = arrayOf<IItemStack?>(null)
        val n8 = 0
        val item32 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap18 = HashMap<String, IData>()
        hashMap18["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap18["Color"] = ExpandInt.toData(11250603)
        array8[n8] = item32.withTag(ExpandAnyDict.asData(hashMap18))
        ChemicalBath.addRecipe(array8, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightgray").withAmount(144), intArrayOf(10000), 200,
                20)
        val array9 = arrayOf<IItemStack?>(null)
        val n9 = 0
        val item33 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap19 = HashMap<String, IData>()
        hashMap19["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap19["Color"] = ExpandInt.toData(4408131)
        array9[n9] = item33.withTag(ExpandAnyDict.asData(hashMap19))
        ChemicalBath.addRecipe(array9, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyegray").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array10 = arrayOf<IItemStack?>(null)
        val n10 = 0
        val item34 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap20 = HashMap<String, IData>()
        hashMap20["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap20["Color"] = ExpandInt.toData(14188952)
        array10[n10] = item34.withTag(ExpandAnyDict.asData(hashMap20))
        ChemicalBath.addRecipe(array10, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyepink").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array11 = arrayOf<IItemStack?>(null)
        val n11 = 0
        val item35 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap21 = HashMap<String, IData>()
        hashMap21["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap21["Color"] = ExpandInt.toData(4312372)
        array11[n11] = item35.withTag(ExpandAnyDict.asData(hashMap21))
        ChemicalBath.addRecipe(array11, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelime").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array12 = arrayOf<IItemStack?>(null)
        val n12 = 0
        val item36 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap22 = HashMap<String, IData>()
        hashMap22["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap22["Color"] = ExpandInt.toData(14602026)
        array12[n12] = item36.withTag(ExpandAnyDict.asData(hashMap22))
        ChemicalBath.addRecipe(array12, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeyellow").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array13 = arrayOf<IItemStack?>(null)
        val n13 = 0
        val item37 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap23 = HashMap<String, IData>()
        hashMap23["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap23["Color"] = ExpandInt.toData(6719955)
        array13[n13] = item37.withTag(ExpandAnyDict.asData(hashMap23))
        ChemicalBath.addRecipe(array13, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyelightblue").withAmount(144), intArrayOf(10000), 200,
                20)
        val array14 = arrayOf<IItemStack?>(null)
        val n14 = 0
        val item38 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap24 = HashMap<String, IData>()
        hashMap24["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap24["Color"] = ExpandInt.toData(12801229)
        array14[n14] = item38.withTag(ExpandAnyDict.asData(hashMap24))
        ChemicalBath.addRecipe(array14, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyemagenta").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array15 = arrayOf<IItemStack?>(null)
        val n15 = 0
        val item39 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap25 = HashMap<String, IData>()
        hashMap25["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap25["Color"] = ExpandInt.toData(15435844)
        array15[n15] = item39.withTag(ExpandAnyDict.asData(hashMap25))
        ChemicalBath.addRecipe(array15, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeorange").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        val array16 = arrayOf<IItemStack?>(null)
        val n16 = 0
        val item40 = ItemBracketHandler.getItem("OpenBlocks:imaginary", 1)
        val hashMap26 = HashMap<String, IData>()
        hashMap26["Uses"] = ExpandFloat.asData(10.0.toFloat())
        hashMap26["Color"] = ExpandInt.toData(15790320)
        array16[n16] = item40.withTag(ExpandAnyDict.asData(hashMap26))
        ChemicalBath.addRecipe(array16, ItemBracketHandler.getItem("OpenBlocks:imaginary", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyewhite").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("OpenBlocks:goldenEye", 100)),
                ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                LiquidBracketHandler.getLiquid("molten.gold").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("OpenBlocks:sponge", 0), null,
                ItemBracketHandler.getItem("minecraft:wool", 0), ItemBracketHandler.getItem("minecraft:slime_ball", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 200, VoltageLevels.LV)
        Mixer.addRecipe(ItemBracketHandler.getItem("OpenBlocks:tastyClay", 0), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:clay_ball", 0),
                        ItemBracketHandler.getItem("minecraft:dye", 3)),
                LiquidBracketHandler.getLiquid("milk").withAmount(500), 100, VoltageLevels.ULV)
        Research.addResearch("GOLDENEGG", "MAGICBEES", "alienis 15, bestia 12, victus 9, humanus 6", -4, 5, 4,
                ItemBracketHandler.getItem("OpenBlocks:goldenegg", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.GOLDENEGG", "Golden Egg")
        MineTweakerAPI.game.setLocalization("tc.research_text.GOLDENEGG", "[OB] Make A MiniMe")
        Research.addPrereq("GOLDENEGG", "MB_DimensionalSingularity", false)
        Research.setConcealed("GOLDENEGG", true)
        Research.addPage("GOLDENEGG", "OpenBlocks.research_page.GOLDENEGG")
        MineTweakerAPI.game.setLocalization("OpenBlocks.research_page.GOLDENEGG",
                "The Golden Egg is a block from the OpenBlocks mod. This block is used to summon the Baby Mini Me. Before it hatches, it will begin to slowly spin in circles. After many spins, it will grow and emit large amounts of light. It will then float into the air, and explode. The explosion is minor, and should only break a single layer of standard resistance blocks. Right before it explodes, it will lift surrounding blocks into the air, then drop them back into place. Pictures of the hatching process can be found below.")
        Infusion.addRecipe("GOLDENEGG", ItemBracketHandler.getItem("minecraft:egg", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22086),
                        ItemBracketHandler.getItem("minecraft:skull", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22086),
                        ItemBracketHandler.getItem("minecraft:skull", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22086),
                        ItemBracketHandler.getItem("minecraft:skull", 3)),
                "alienis 75, bestia 50, victus 50, humanus 25", ItemBracketHandler.getItem("OpenBlocks:goldenegg", 0),
                2)
        Research.addInfusionPage("GOLDENEGG", ItemBracketHandler.getItem("OpenBlocks:goldenegg", 0))
        Warp.addToResearch("GOLDENEGG", 2)
    }
}