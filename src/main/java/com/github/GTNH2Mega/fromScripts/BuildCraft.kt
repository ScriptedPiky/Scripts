package com.github.GTNH2Mega.fromScripts

import buildcraft.compat.minetweaker.AssemblyTable
import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.FormingPress
import gttweaker.mods.gregtech.machines.PrecisionLaser
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class BuildCraft : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("BuildCraft|Core:diamondGearItem", 0)
        val item2 = ItemBracketHandler.getItem("BuildCraft|Core:goldGearItem", 0)
        val item3 = ItemBracketHandler.getItem("BuildCraft|Core:ironGearItem", 0)
        val item4 = ItemBracketHandler.getItem("BuildCraft|Core:stoneGearItem", 0)
        val item5 = ItemBracketHandler.getItem("BuildCraft|Core:woodenGearItem", 0)
        val item6 = ItemBracketHandler.getItem("BuildCraft|Factory:miningWellBlock", 0)
        val item7 = ItemBracketHandler.getItem("BuildCraft|Transport:pipeWaterproof", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemswood", 0)
        val item8 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerwood", 0)
        val item9 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemscobblestone", 0)
        val item10 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowercobblestone", 0)
        val item11 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsstone", 0)
        val item12 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerstone", 0)
        val item13 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemssandstone", 0)
        val item14 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowersandstone", 0)
        val item15 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsiron", 0)
        val item16 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepoweriron", 0)
        val item17 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsquartz", 0)
        val item18 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerquartz", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsgold", 0)
        val item19 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowergold", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemslapis", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsobsidian", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsdiamond", 0)
        val item20 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerdiamond", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsemerald", 0)
        val item21 = ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepoweremerald", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsdaizuli", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsemzuli", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsstripes", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsvoid", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsclay", 0)
        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipestructurecobblestone", 0)
        val item22 = ItemBracketHandler.getItem("BuildCraft|Silicon:laserBlock", 0)
        val item23 = ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0)
        val item24 = ItemBracketHandler.getItem("ForgeMicroblock:stoneRod", 0)
        val ore = OreBracketHandler.getOre("stickWood")
        val ore2 = OreBracketHandler.getOre("ringIron")
        val ore3 = OreBracketHandler.getOre("stickNetherQuartz")
        val ore4 = OreBracketHandler.getOre("stickIron")
        val ore5 = OreBracketHandler.getOre("screwIron")
        val ore6 = OreBracketHandler.getOre("stickGold")
        val ore7 = OreBracketHandler.getOre("stickEmerald")
        val ore8 = OreBracketHandler.getOre("stickDiamond")
        OreBracketHandler.getOre("stickRedAlloy")
        val item25 = ItemBracketHandler.getItem("dreamcraft:item.SandStoneRod", 0)
        val item26 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23299)
        OreBracketHandler.getOre("screwRedAlloy")

        //TODO Replace ("TConstruct:GlassPane", 0)
        //val item27 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)

        OreBracketHandler.getOre("wireGt01Steel")
        val ore9 = OreBracketHandler.getOre("wireGt01Tin")
        val ore10 = OreBracketHandler.getOre("wireGt01Nickel")
        val ore11 = OreBracketHandler.getOre("wireGt01Copper")
        val ore12 = OreBracketHandler.getOre("wireGt01Cupronickel")
        val ore13 = OreBracketHandler.getOre("wireGt01Silver")
        val ore14 = OreBracketHandler.getOre("wireGt01Aluminium")
        val ore15 = OreBracketHandler.getOre("wireGt01Electrum")
        OreBracketHandler.getOre("wireGt01Gold")
        OreBracketHandler.getOre("wireGt01NiobiumTitanium")
        val ore16 = OreBracketHandler.getOre("wireGt01Platinum")
        val ore17 = OreBracketHandler.getOre("wireGt01Nichrome")
        OreBracketHandler.getOre("pipeMediumBrass")
        OreBracketHandler.getOre("pipeRestrictiveMediumBrass")
        val item28 = ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneCrystal", 0)
        val item29 = ItemBracketHandler.getItem("BuildCraft|Core:pathMarkerBlock", 0)
        val item30 = ItemBracketHandler.getItem("BuildCraft|Core:markerBlock", 0)
        ItemBracketHandler.getItem("BuildCraft|Builders:constructionMarkerBlock", 0)
        val item31 = ItemBracketHandler.getItem("BuildCraft|Transport:pipeGate", OreDictionary.WILDCARD_VALUE)
        ItemBracketHandler.getItem("BuildCraft|Transport:pipeWire", OreDictionary.WILDCARD_VALUE)
        val item32 = ItemBracketHandler.getItem("BuildCraft|Transport:pipePlug", 0)
        val item33 = ItemBracketHandler.getItem("BuildCraft|Transport:gateCopier", 0)
        val item34 = ItemBracketHandler.getItem("BuildCraft|Robotics:robotStation", 0)
        val item35 = ItemBracketHandler.getItem("BuildCraft|Builders:fillerBlock", 0)
        val item36 = ItemBracketHandler.getItem("BuildCraft|Builders:builderBlock", 0)
        val item37 = ItemBracketHandler.getItem("BuildCraft|Builders:architectBlock", 0)
        val item38 = ItemBracketHandler.getItem("BuildCraft|Builders:libraryBlock", 0)
        val item39 = ItemBracketHandler.getItem("BuildCraft|Factory:autoWorkbenchBlock", 0)
        val item40 = ItemBracketHandler.getItem("BuildCraft|Factory:floodGateBlock", 0)
        val item41 = ItemBracketHandler.getItem("BuildCraft|Robotics:zonePlan", 0)
        val item42 = ItemBracketHandler.getItem("BuildCraft|Robotics:requester", 0)
        val item43 = ItemBracketHandler.getItem("BuildCraft|Robotics:robot", 0)
        val item44 = ItemBracketHandler.getItem("BuildCraft|Transport:filteredBufferBlock", 0)
        val item45 = ItemBracketHandler.getItem("Railcraft:glass", 0)

        //TODO investigate getters with no target field for ("ExtraUtilities:decorativeBlock2", 5) and ("TConstruct:GlassBlock", 0)
        //ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 5)
        //ItemBracketHandler.getItem("TConstruct:GlassBlock", 0)

        val ore18 = OreBracketHandler.getOre("craftingToolWrench")
        val ore19 = OreBracketHandler.getOre("craftingToolScrewdriver")
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Builders:machineBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Factory:pumpBlock", 0))
        MineTweakerAPI.recipes.remove(item22)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Factory:refineryBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Factory:blockHopper", 0))
        MineTweakerAPI.recipes.remove(item23)
        MineTweakerAPI.recipes.remove(item35)
        MineTweakerAPI.recipes.remove(item36)
        MineTweakerAPI.recipes.remove(item37)
        MineTweakerAPI.recipes.remove(item38)
        MineTweakerAPI.recipes.remove(item39)
        MineTweakerAPI.recipes.remove(item40)
        MineTweakerAPI.recipes.remove(item41)
        MineTweakerAPI.recipes.remove(item42)
        MineTweakerAPI.recipes.remove(item44)
        MineTweakerAPI.recipes.remove(item34)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Silicon:packagerBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Core:engineBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Core:engineBlock", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Core:engineBlock", 2))
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsclay", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Transport:pipePowerAdapter", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemswood", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidswood", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerwood", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemscobblestone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidscobblestone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowercobblestone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsstone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsstone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerstone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemssandstone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidssandstone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowersandstone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsiron", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsiron", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepoweriron", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsquartz", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsquartz", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerquartz", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsgold", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsgold", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowergold", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemslapis", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsobsidian", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsdiamond", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepowerdiamond", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsdiamond", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsemerald", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsemerald", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipepoweremerald", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsdaizuli", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsemzuli", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsstripes", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsvoid", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsvoid", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsclay", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipestructurecobblestone", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(item43)
        MineTweakerAPI.recipes.remove(item31)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Builders:constructionMarkerBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Builders:templateItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Builders:blueprintItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Robotics:redstone_board", 0))
        MineTweakerAPI.recipes.remove(item30)
        MineTweakerAPI.recipes.remove(item29)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Core:wrenchItem", 0))
        MineTweakerAPI.recipes.remove(item28)
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(item32)
        MineTweakerAPI.recipes.remove(item33)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BuildCraft|Core:mapLocation", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("BuildCraft|Compat:item.buildcraftPipe.pipeitemspropolis", 0))
        AssemblyTable.removeRecipe(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneCrystal", 0), null, false)
        AssemblyTable.removeRecipe(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", OreDictionary.WILDCARD_VALUE), null, false)
        AssemblyTable.removeRecipe(ItemBracketHandler.getItem("gendustry:GeneticsProcessor", 0), null, false)
        AssemblyTable.removeRecipe(ItemBracketHandler.getItem("gendustry:EnvProcessor", 0), null, false)
        MineTweakerAPI.recipes.addShapeless(item, arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtDiamond")), null)
        MineTweakerAPI.recipes.addShapeless(item2, arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtGold")), null)
        MineTweakerAPI.recipes.addShapeless(item3, arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtIron")), null)
        MineTweakerAPI.recipes.addShapeless(item4, arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtStone")), null)
        MineTweakerAPI.recipes.addShapeless(item5, arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtWood")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BuildCraft|Core:engineBlock", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateInvar"),
                        OreBracketHandler.getOre("plateLapis"), OreBracketHandler.getOre("plateInvar")),
                        arrayOf(OreBracketHandler.getOre("springInvar"),
                                ItemBracketHandler.getItem("minecraft:piston", 0),
                                OreBracketHandler.getOre("springInvar")), arrayOf(OreBracketHandler.getOre("gearInvar"),
                        ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                        OreBracketHandler.getOre("gearInvar"))), null)

        //TODO Replace ("TConstruct:GlassPane", 0) in item27
        //MineTweakerAPI.recipes.addShaped(
        //        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipestructurecobblestone", 0),
        //        arrayOf(arrayOf<IIngredient>(item26, item27, item26),
        //                arrayOf<IIngredient>(item27, ItemBracketHandler.getItem("minecraft:gravel", 0), item27),
        //                arrayOf<IIngredient>(item26, item27, item26)), null)
        //MineTweakerAPI.recipes.addShaped(item10,
        //        arrayOf(arrayOf<IIngredient>(item26, item27, item26), arrayOf(item27, ore9, item27),
        //                arrayOf<IIngredient>(item26, item27, item26)), null)
        //MineTweakerAPI.recipes.addShaped(item12,
        //        arrayOf(arrayOf<IIngredient>(item24, item27, item24), arrayOf(item27, ore10, item27),
        //                arrayOf<IIngredient>(item24, item27, item24)), null)
        //MineTweakerAPI.recipes.addShaped(item8,
        //        arrayOf(arrayOf(ore, item27, ore), arrayOf(item27, ore11, item27), arrayOf(ore, item27, ore)), null)
        //MineTweakerAPI.recipes.addShaped(item14,
        //        arrayOf(arrayOf<IIngredient>(item25, item27, item25), arrayOf(item27, ore12, item27),
        //                arrayOf<IIngredient>(item25, item27, item25)), null)
        //MineTweakerAPI.recipes.addShaped(item18,
        //        arrayOf(arrayOf(ore3, item27, ore3), arrayOf(item27, ore13, item27), arrayOf(ore3, item27, ore3)), null)
        //MineTweakerAPI.recipes.addShaped(item16,
        //        arrayOf(arrayOf(ore4, item27, ore4), arrayOf(item27, ore15, item27), arrayOf(ore4, item27, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(item19,
        //        arrayOf(arrayOf(ore6, item27, ore6), arrayOf(item27, ore14, item27), arrayOf(ore6, item27, ore6)), null)
        //MineTweakerAPI.recipes.addShaped(item21,
        //        arrayOf(arrayOf(ore7, item27, ore7), arrayOf(item27, ore17, item27), arrayOf(ore7, item27, ore7)), null)
        //MineTweakerAPI.recipes.addShaped(item20,
        //        arrayOf(arrayOf(ore8, item27, ore8), arrayOf(item27, ore16, item27), arrayOf(ore8, item27, ore8)), null)

        MineTweakerAPI.recipes.addShaped(item23,
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5), arrayOf(ore18, item45, ore19),
                        arrayOf<IIngredient>(ore5, ore2, ore5)), null)

        //TODO Replace ("ExtraUtilities:decorativeBlock2", 5)
        //MineTweakerAPI.recipes.addShaped(item23, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
        //        OreBracketHandler.getOre("ringIron"), OreBracketHandler.getOre("screwIron")),
        //        arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 5),
        //                OreBracketHandler.getOre("craftingToolScrewdriver")),
        //        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("ringIron"),
        //                OreBracketHandler.getOre("screwIron"))), null)

        //TODO Replace ("TConstruct:GlassPane", 0) in item27
        //MineTweakerAPI.recipes.addShaped(
        //        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsvoid", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("RandomThings:ingredient", 1), item27,
        //                ItemBracketHandler.getItem("RandomThings:ingredient", 1)),
        //                arrayOf(item27, OreBracketHandler.getOre("gemEnderPearl"), item27),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("RandomThings:ingredient", 1), item27,
        //                        ItemBracketHandler.getItem("RandomThings:ingredient", 1))), null)
        //MineTweakerAPI.recipes.addShaped(
        //        ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipefluidsvoid", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("stickAnyRubber"), item27,
        //                OreBracketHandler.getOre("stickAnyRubber")),
        //                arrayOf(item27, OreBracketHandler.getOre("gemEnderPearl"), item27),
        //                arrayOf(OreBracketHandler.getOre("stickAnyRubber"), item27,
        //                        OreBracketHandler.getOre("stickAnyRubber"))), null)

        MineTweakerAPI.recipes.addShaped(item39,
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAnyIron"),
                        OreBracketHandler.getOre("gearGtSmallAnyIron"), OreBracketHandler.getOre("itemCasingAnyIron")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallAnyIron"),
                                ItemBracketHandler.getItem("Forestry:factory2", 2),
                                OreBracketHandler.getOre("gearGtSmallAnyIron")),
                        arrayOf(OreBracketHandler.getOre("itemCasingAnyIron"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("itemCasingAnyIron"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BuildCraft|Core:paintbrush", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:paintBrush", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("BuildCraft|Factory:autoWorkbenchBlock", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.machine2", 11)),
                null)
        MineTweakerAPI.recipes.addShaped(item35,
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32651),
                        OreBracketHandler.getOre("crystalRedstone"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32651)),
                        arrayOf(OreBracketHandler.getOre("circuitGood"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 12),
                                OreBracketHandler.getOre("circuitGood")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallAluminium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("gearGtSmallAluminium"))), null)
        MineTweakerAPI.recipes.addShaped(item36,
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652),
                        OreBracketHandler.getOre("crystalRedstone"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652)),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallStainlessSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                OreBracketHandler.getOre("gearGtSmallStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(item37,
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652),
                        ItemBracketHandler.getItem("BuildCraft|Builders:templateItem", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652)),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf(OreBracketHandler.getOre("gearGtDiamond"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                OreBracketHandler.getOre("gearGtDiamond"))), null)
        MineTweakerAPI.recipes.addShaped(item38,
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                        OreBracketHandler.getOre("crystalRedstone"),
                        OreBracketHandler.getOre("itemCasingStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitData"),
                                ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                                OreBracketHandler.getOre("circuitData")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                OreBracketHandler.getOre("plateSteel"),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(item40, arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610),
                OreBracketHandler.getOre("itemCasingSteel")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                arrayOf(OreBracketHandler.getOre("itemCasingSteel"),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        OreBracketHandler.getOre("itemCasingSteel"))), null)
        MineTweakerAPI.recipes.addShaped(item22,
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("blockRedstone"), OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("lensDiamond"),
                                OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("lensDiamond")),
                        arrayOf(OreBracketHandler.getOre("plateDenseObsidian"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32682),
                                OreBracketHandler.getOre("plateDenseObsidian"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652),
                        OreBracketHandler.getOre("blockRedstone"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDiamond"),
                                OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("plateDiamond")),
                        arrayOf(OreBracketHandler.getOre("plateDenseObsidian"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32692),
                                OreBracketHandler.getOre("plateDenseObsidian"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("circuitAdvanced"),
                        OreBracketHandler.getOre("blockRedstone"), OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("chipsetRed"),
                                OreBracketHandler.getOre("crystalRedstone"), OreBracketHandler.getOre("chipsetRed")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseObsidian"),
                                OreBracketHandler.getOre("chipsetRed"),
                                OreBracketHandler.getOre("plateDenseObsidian"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652),
                        OreBracketHandler.getOre("blockRedstone"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652)),
                        arrayOf(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 3),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 3)),
                        arrayOf(OreBracketHandler.getOre("plateDenseObsidian"),
                                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 0),
                                OreBracketHandler.getOre("plateDenseObsidian"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BuildCraft|Silicon:laserTableBlock", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("circuitAdvanced"),
                        OreBracketHandler.getOre("blockRedstone"), OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 6),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652),
                                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 6)),
                        arrayOf(OreBracketHandler.getOre("plateDenseObsidian"),
                                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 0),
                                OreBracketHandler.getOre("plateDenseObsidian"))), null)
        MineTweakerAPI.recipes.addShaped(item41,
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652),
                        OreBracketHandler.getOre("circuitAdvanced"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652)),
                        arrayOf(OreBracketHandler.getOre("gearGtDiamond"),
                                ItemBracketHandler.getItem("minecraft:map", 0),
                                OreBracketHandler.getOre("gearGtDiamond")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 7),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 7))), null)
        MineTweakerAPI.recipes.addShaped(item43,
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateStainlessSteel"),
                        OreBracketHandler.getOre("plateStainlessSteel"),
                        OreBracketHandler.getOre("plateStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 3),
                                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneCrystal", 0),
                                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 3)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("plateStainlessSteel"),
                                OreBracketHandler.getOre("circuitAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(item42, arrayOf(arrayOf(OreBracketHandler.getOre("plateStainlessSteel"),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642),
                OreBracketHandler.getOre("plateStainlessSteel")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtSteel"), OreBracketHandler.getOre("chestSteel"),
                        OreBracketHandler.getOre("gearGtSteel")),
                arrayOf(OreBracketHandler.getOre("plateStainlessSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32692),
                        OreBracketHandler.getOre("plateStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BuildCraft|Core:wrenchItem", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("ingotStainlessSteel"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotStainlessSteel"),
                                OreBracketHandler.getOre("ingotStainlessSteel"),
                                OreBracketHandler.getOre("ingotStainlessSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotStainlessSteel"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("ingotStainlessSteel"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Core:engineBlock", 2),
                ItemBracketHandler.getItem("dreamcraft:item.EngineCore", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17302).amount(10), 800, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Compat:item.buildcraftPipe.pipeitemspropolis", 0),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1),
                ItemBracketHandler.getItem("Forestry:propolis", 0).amount(2),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(400), 300, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Compat:item.buildcraftPipe.pipeitemspropolis", 0),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1),
                ItemBracketHandler.getItem("Forestry:propolis", 0).amount(2),
                LiquidBracketHandler.getLiquid("honey").withAmount(400), 300, VoltageLevels.LMV)
        Assembler.addRecipe(item30, ItemBracketHandler.getItem("minecraft:redstone_torch", 0),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 30), 100, VoltageLevels.MV)
        Assembler.addRecipe(item29, ItemBracketHandler.getItem("minecraft:redstone_torch", 0),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 24), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Builders:templateItem", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0), ItemBracketHandler.getItem("minecraft:redstone", 0),
                LiquidBracketHandler.getLiquid("squidink").withAmount(144), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Builders:blueprintItem", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0), ItemBracketHandler.getItem("minecraft:redstone", 0),
                LiquidBracketHandler.getLiquid("dye.watermixed.dyeblue").withAmount(144), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                ItemBracketHandler.getItem("Railcraft:glass", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28032).amount(2), 100, VoltageLevels.ULV)

        //TODO Replace ("ExtraUtilities:decorativeBlock2", 5)
        //Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
        //        ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 5),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28032).amount(2), 100, VoltageLevels.ULV)

        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Robotics:redstone_board", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 8).amount(0),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 200,  VoltageLevels.HV)
        Assembler.addRecipe(item34, ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17306).amount(4), 300,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Core:mapLocation", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32425), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Core:mapLocation", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(8),
                ItemBracketHandler.getItem("minecraft:dye", 11), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Core:mapLocation", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(8),
                ItemBracketHandler.getItem("Botany:pigment", 78), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("BuildCraft|Core:mapLocation", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(8),
                ItemBracketHandler.getItem("ExtraBees:misc", 20), 200,  VoltageLevels.HV)
        Assembler.addRecipe(item33, ItemBracketHandler.getItem("BuildCraft|Core:wrenchItem", 0),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 0), 100,  VoltageLevels.HV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemswood", 0).amount(16),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32632), 400,  VoltageLevels.HV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsiron", 0).amount(16),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(16),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 1), 400,  VoltageLevels.HV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsgold", 0).amount(16),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602), 400,  VoltageLevels.HV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsdiamond", 0).amount(8),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(8),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 4), 400,  VoltageLevels.HV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsobsidian", 0).amount(16),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652), 400,  VoltageLevels.HV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsemerald", 0).amount(8),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(8),
                ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0), 400,  VoltageLevels.HV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsemerald", 0).amount(8),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32703), 400,  VoltageLevels.HV)
        Assembler.addRecipe(
                ItemBracketHandler.getItem("BuildCraft|Transport:item.buildcraftPipe.pipeitemsemerald", 0).amount(8),
                ItemBracketHandler.getItem("ProjRed|Transportation:projectred.transportation.pipe", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32082), 400,  VoltageLevels.HV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 7),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17501),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 0), 200,  VoltageLevels.HV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneCrystal", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24347).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17347).amount(4), 600, VoltageLevels.MV)
        NEI.overrideName(item8, "Wood-Covered Kinesis Pipe")
        NEI.overrideName(item9, "Cobblestone-Covered Pipe")
        NEI.overrideName(item10, "Cobblestone-Covered Kinesis Pipe")
        NEI.overrideName(item11, "Stone-Covered Pipe")
        NEI.overrideName(item12, "Stone-Covered Kinesis Pipe")
        NEI.overrideName(item13, "Sandstone-Covered Pipe")
        NEI.overrideName(item14, "Sandstone-Covered Kinesis Pipe")
        NEI.overrideName(item15, "Iron-Covered Pipe")
        NEI.overrideName(item16, "Iron-Covered Kinesis Pipe")
        NEI.overrideName(item17, "Quartz-Covered Pipe")
        NEI.overrideName(item18, "Quartz-Covered Kinesis Pipe")
        NEI.overrideName(item19, "Gold-Covered Kinesis Pipe")
        NEI.overrideName(item20, "Diamond-Covered Kinesis Pipe")
        NEI.overrideName(item21, "Emerald-Covered Kinesis Pipe")
        NEI.overrideName(ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneCrystal", 0), "Firestone Crystal")
    }
}