package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientTransform
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import minetweaker.mods.ic2.machines.Extractor
import modtweaker2.mods.forestry.handlers.Carpenter
import modtweaker2.mods.thaumcraft.handlers.*
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class CoreMod : Runnable {
    override fun run() {
        //TODO Replace ("TConstruct:blankPattern", 0)
        //val item = ItemBracketHandler.getItem("TConstruct:blankPattern", 0)

        //TODO Replace ("TConstruct:blankPattern", 1)
        //val item2 = ItemBracketHandler.getItem("TConstruct:blankPattern", 1)

        val item3 = ItemBracketHandler.getItem("dreamcraft:item.SandStoneRod", 0)
        val item4 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23299)
        val ore = OreBracketHandler.getOre("stone")
        val ore2 = OreBracketHandler.getOre("cobblestone")
        val ore3 = OreBracketHandler.getOre("sandstone")
        val ore4 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore5 = OreBracketHandler.getOre("craftingToolKnife")
        val ore6 = OreBracketHandler.getOre("craftingToolFile")
        val ore7 = OreBracketHandler.getOre("craftingToolSaw")
        val ore8 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val ore9 = OreBracketHandler.getOre("craftingToolMortar")
        val ore10 = OreBracketHandler.getOre("craftingToolWireCutter")
        IngredientTransform.transformReplace(ItemBracketHandler.getItem("dreamcraft:item.WoodenBrickForm", 0),
                ItemBracketHandler.getItem("dreamcraft:item.WoodenBrickForm", 0))

        //TODO Replace ("ExtraUtilities:decorativeBlock1", 8)
        //val item5 = ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8)

        val item6 = ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1)
        val item7 = ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0)
        val item8 = ItemBracketHandler.getItem("minecraft:string", 0)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("DraconicEvolution:dissEnchanter", 0))
        MineTweakerAPI.recipes.addShaped(item3, arrayOf(arrayOf<IIngredient>(ore6, ore3, ore7)), null)
        MineTweakerAPI.recipes.addShaped(item4, arrayOf(arrayOf<IIngredient>(ore6, ore2, ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.LongObsidianRod", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore7, OreBracketHandler.getOre("stoneObsidian"), ore6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.LongStoneRod", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore7, ore, ore6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MushroomPowder", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("listAllmushroom"), null, null),
                        arrayOf<IIngredient?>(ore9, null, null), arrayOfNulls(3)), null)

        //TODO Replace ("TConstruct:blankPattern", 1) in item2
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPlate", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore4, ore6), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormCasing", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore4, null), arrayOf(null, item2, ore6), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormGear", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore4, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore6)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBottle", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore4, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, ore6, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormIngot", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore4, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore6, null, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBall", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore4, null), arrayOf(ore6, item2, null), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBlock", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore6, ore4, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormNuggets", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore4), arrayOf(null, item2, ore6), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBuns", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore4), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore6)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBread", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore4), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, ore6, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBaguette", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore4), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore6, null, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormCylinder", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore4), arrayOf(ore6, item2, null), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormAnvil", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore6, null, ore4), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormName", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, ore4), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormArrowHead", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(null, item2, ore4), arrayOf<IIngredient?>(null, null, ore6)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormSmallGear", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(null, item2, ore4), arrayOf<IIngredient?>(null, ore6, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormStick", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(null, item2, ore4), arrayOf<IIngredient?>(ore6, null, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBolt", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(ore6, item2, ore4), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormRound", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore6, null, null), arrayOf(null, item2, ore4), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormScrew", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, null), arrayOf(null, item2, ore4), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormRing", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore6), arrayOf(null, item2, ore4), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormStickLong", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, ore6, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormRotor", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore6, null, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormTurbineBlade", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(ore6, item2, null), arrayOf<IIngredient?>(null, null, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBoots", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore6, null, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormChestplate", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormHelmet", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore6), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormLeggings", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(null, item2, ore6), arrayOf<IIngredient?>(null, null, ore4)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MarshmallowFormMold", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore6, ore4, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeTiny", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, ore4, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeSmall", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore4, null, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeMedium", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, null), arrayOf(ore4, item2, null), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeLarge", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore4, ore6, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeHuge", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore4, null, ore6), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapePlate", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore10, ore6), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeRod", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore10, null), arrayOf(null, item2, ore6), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeBolt", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore10, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore6)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeCell", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore10, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, ore6, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeRing", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore10, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore6, null, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeIngot", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore10, null), arrayOf(ore6, item2, null), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeWire", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore6, ore10, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeCasing", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore10), arrayOf(null, item2, ore6), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeTinyPipe", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore10), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore6)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeSmallPipe", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore10), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, ore6, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeNormalPipe", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore10), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore6, null, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeLargePipe", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore10), arrayOf(ore6, item2, null), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeHugePipe", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore6, null, ore10), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeBlock", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, ore10), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeSwordBlade", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(null, item2, ore10), arrayOf<IIngredient?>(null, null, ore6)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapePickaxeHead", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(null, item2, ore10), arrayOf<IIngredient?>(null, ore6, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeShovelHead", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(null, item2, ore10), arrayOf<IIngredient?>(ore6, null, null)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeAxeHead", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(ore6, item2, ore10), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeHoeHead", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore6, null, null), arrayOf(null, item2, ore10), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeHammerHead", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, null), arrayOf(null, item2, ore10), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeFileHead", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore6), arrayOf(null, item2, ore10), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeSawBlade", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, ore6, ore10)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeGear", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore6, null, ore10)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeBottle", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(ore6, item2, null), arrayOf<IIngredient?>(null, null, ore10)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeBoat", 0),
        //        arrayOf(arrayOf<IIngredient?>(ore6, null, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore10)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeRotor", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, ore6, null), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore10)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeTurbineBlade", 0),
        //        arrayOf(arrayOf<IIngredient?>(null, null, ore6), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(null, null, ore10)), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ShapeSmallGear", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf(null, item2, ore6), arrayOf<IIngredient?>(null, null, ore10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("platePlastic"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                        OreBracketHandler.getOre("platePlastic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitBasic"),
                                OreBracketHandler.getOre("cableGt01Tin"), OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"), ore8,
                                OreBracketHandler.getOre("screwIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.LaserEmitter", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingTitanium"),
                        OreBracketHandler.getOre("lensRuby"), OreBracketHandler.getOre("itemCasingTitanium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorCoolantSix", 1),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32682),
                                ItemBracketHandler.getItem("IC2:reactorCoolantSix", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.DiamondDrillTip", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDiamond"),
                                OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"), ore4,
                                OreBracketHandler.getOre("plateSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedIridiumDrillTip", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyIridium"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateAlloyIridium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyIridium"),
                                OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateAlloyIridium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"), ore4,
                                OreBracketHandler.getOre("plateSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.SawBladeDiamond", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("plateDiamond"), null), arrayOf<IIngredient?>(ore6, ore4, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.SawBladeStone", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateStone"),
                        OreBracketHandler.getOre("plateStone"), null), arrayOf<IIngredient?>(ore6, ore4, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.SawBladeArdite", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateArdite"),
                        OreBracketHandler.getOre("plateArdite"), null), arrayOf<IIngredient?>(ore6, ore4, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.SawBladeManyullyn", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateManyullyn"),
                        OreBracketHandler.getOre("plateManyullyn"), null), arrayOf<IIngredient?>(ore6, ore4, null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.SawBladeRuby", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateRuby"),
                        OreBracketHandler.getOre("plateRuby"), null), arrayOf<IIngredient?>(ore6, ore4, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.SawBladeSapphire", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateSapphire"),
                        OreBracketHandler.getOre("plateSapphire"), null), arrayOf<IIngredient?>(ore6, ore4, null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.SawBladePeridot", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("platePeridot"),
                        OreBracketHandler.getOre("platePeridot"), null), arrayOf<IIngredient?>(ore6, ore4, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedAluminiumIronPlate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateAlloyCarbon"), OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateAlloyCarbon"),
                                ItemBracketHandler.getItem("dreamcraft:item.AluminiumIronPlate", 0),
                                OreBracketHandler.getOre("plateAlloyCarbon")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateAlloyCarbon"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedTitaniumIronPlate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateSilicon"), OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateSilicon"),
                                ItemBracketHandler.getItem("dreamcraft:item.TitaniumIronPlate", 0),
                                OreBracketHandler.getOre("plateSilicon")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateSilicon"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedChromeIronPlate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateDiamond"), OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateDiamond"),
                                ItemBracketHandler.getItem("dreamcraft:item.ChromeIronPlate", 0),
                                OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateDiamond"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedTungstenIronPlate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateTungsten"), OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateTungsten"),
                                ItemBracketHandler.getItem("dreamcraft:item.TungstenIronPlate", 0),
                                OreBracketHandler.getOre("plateTungsten")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateTungsten"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedTungstenSteelIronPlate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateTungstenSteel"), OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateTungstenSteel"),
                                ItemBracketHandler.getItem("dreamcraft:item.TungstenSteelIronPlate", 0),
                                OreBracketHandler.getOre("plateTungstenSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateTungstenSteel"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedNaquadriaIronPlate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateMysteriousCrystal"),
                        OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateMysteriousCrystal"),
                                ItemBracketHandler.getItem("dreamcraft:item.NaquadriaIronPlate", 0),
                                OreBracketHandler.getOre("plateMysteriousCrystal")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateMysteriousCrystal"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedNeutroniumIronPlate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateBlackPlutonium"),
                        OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateBlackPlutonium"),
                                ItemBracketHandler.getItem("dreamcraft:item.NeutroniumIronPlate", 0),
                                OreBracketHandler.getOre("plateBlackPlutonium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateBlackPlutonium"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedBedrockiumIronPlate", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                        OreBracketHandler.getOre("plateDraconiumAwakened"),
                        OreBracketHandler.getOre("plateAlloyAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateDraconiumAwakened"),
                                ItemBracketHandler.getItem("dreamcraft:item.BedrockiumIronPlate", 0),
                                OreBracketHandler.getOre("plateDraconiumAwakened")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyAdvanced"),
                                OreBracketHandler.getOre("plateDraconiumAwakened"),
                                OreBracketHandler.getOre("plateAlloyAdvanced"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.BowFletchingCast", 0),
                arrayOf(arrayOf<IIngredient?>(null, null, ore4),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateBrass"), ore5),
                        arrayOf<IIngredient?>(null, null, ore6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.BowStringCast", 0),
                arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateBrass"), ore4),
                        arrayOf<IIngredient?>(null, ore6, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:coal", 1),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null, null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:redstone", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2890),
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:string", 0), arrayOf(arrayOfNulls(3),
                arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null),
                arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2805),
                arrayOf(arrayOfNulls(3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null, null),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2299),
                arrayOf(arrayOfNulls(3),
                        arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1802),
                arrayOf(arrayOfNulls(3), arrayOfNulls(3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null, null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2934),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2823),
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2022),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null,
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2939),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2032),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null, null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2057),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null, null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2034),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2035),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2896),
                arrayOf(arrayOfNulls(3),
                        arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null, null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1625),
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2304),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null,
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IC2:itemHarz", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null, null)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 39),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null,
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null,
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1054),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2086),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null,
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 37),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null,
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:leather", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1343),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                        ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0),
                                ItemBracketHandler.getItem("OpenBlocks:filledbucket", 0))), null)

        //TODO Replace Smeltery
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeBolt", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeHoeHead", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeGear", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapePlate", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormAnvil", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPlate", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormLeggings", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBaguette", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormGear", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormRotor", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeBottle", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeRotor", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeTurbineBlade", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeSmallGear", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBoots", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeLargePipe", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormSmallGear", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormCasing", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeWire", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormChestplate", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeShovelHead", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBread", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeIngot", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormIngot", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeFileHead", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeRod", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeHugePipe", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeSwordBlade", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeRing", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeCasing", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormNuggets", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeSmallPipe", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormName", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeHammerHead", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeTinyPipe", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormCylinder", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBottle", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeAxeHead", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeSawBlade", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBlock", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeCell", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormArrowHead", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeBoat", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormCoinage", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBall", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeBlock", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormHelmet", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapePickaxeHead", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBuns", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ShapeNormalPipe", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MarshmallowFormMold", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormStick", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormStickLong", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormScrew", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormRing", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormBolt", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormRound", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormTurbineBlade", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeTiny", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeSmall", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeMedium", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeLarge", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        //Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeHuge", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
        //        ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //val recipes = MineTweakerAPI.recipes
        //val item9 = ItemBracketHandler.getItem("dreamcraft:item.OvenGlove", 0)
        //val hashMap = HashMap<String, IData>()
        //hashMap["Durability"] = ExpandInt.toData(1000)
        //recipes.addShaped(item9.withTag(ExpandAnyDict.asData(hashMap)),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                OreBracketHandler.getOre("itemLeather"),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        OreBracketHandler.getOre("itemLeather")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:string", 0),
        //                        ItemBracketHandler.getItem("minecraft:string", 0),
        //                        ItemBracketHandler.getItem("minecraft:string", 0))), null)
        //val recipes2 = MineTweakerAPI.recipes
        //val item10 = ItemBracketHandler.getItem("dreamcraft:item.OvenGlove", 0)
        //val hashMap2 = HashMap<String, IData>()
        //hashMap2["Durability"] = ExpandInt.toData(1000)
        //recipes2.addShapeless(item10.withTag(ExpandAnyDict.asData(hashMap2)),
        //        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.OvenGlove", 0),
        //                OreBracketHandler.getOre("itemLeather"), OreBracketHandler.getOre("itemLeather"),
        //                OreBracketHandler.getOre("itemLeather")), null)
        //val recipes3 = MineTweakerAPI.recipes
        //val item11 = ItemBracketHandler.getItem("dreamcraft:item.OvenGlove", 1)
        //val hashMap3 = HashMap<String, IData>()
        //hashMap3["Durability"] = ExpandInt.toData(1000)
        //recipes3.addShaped(item11.withTag(ExpandAnyDict.asData(hashMap3)),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:string", 0),
        //                        ItemBracketHandler.getItem("minecraft:string", 0),
        //                        ItemBracketHandler.getItem("minecraft:string", 0))), null)
        //val recipes4 = MineTweakerAPI.recipes
        //val item12 = ItemBracketHandler.getItem("dreamcraft:item.OvenGlove", 1)
        //val hashMap4 = HashMap<String, IData>()
        //hashMap4["Durability"] = ExpandInt.toData(1000)
        //recipes4.addShapeless(item12.withTag(ExpandAnyDict.asData(hashMap4)),
        //        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.OvenGlove", 1),
        //                OreBracketHandler.getOre("itemLeather"), OreBracketHandler.getOre("itemLeather"),
        //                OreBracketHandler.getOre("itemLeather")), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.NeutronReflectorParts", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorReflectorThick", 0),
                        ItemBracketHandler.getItem("IC2:reactorReflectorThick", 0),
                        ItemBracketHandler.getItem("IC2:reactorReflectorThick", 0)),
                        arrayOf(ItemBracketHandler.getItem("IC2:reactorReflectorThick", 0),
                                OreBracketHandler.getOre("craftingToolWrench"),
                                ItemBracketHandler.getItem("IC2:reactorReflectorThick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorReflectorThick", 0),
                                ItemBracketHandler.getItem("IC2:reactorReflectorThick", 0),
                                ItemBracketHandler.getItem("IC2:reactorReflectorThick", 0))), null)

        //TODO Replace ("TConstruct:blankPattern", 0) in item
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.WoodenBrickForm", 0),
        //        arrayOf(arrayOf(ore5, item, null)), null)

        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.CokeOvenBrick", 0),
                ItemBracketHandler.getItem("dreamcraft:item.UnfiredCokeOvenBrick", 0), 0.0)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:tile.DiamondFrameBox", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickDiamond"),
                        OreBracketHandler.getOre("stickDiamond"), OreBracketHandler.getOre("stickDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickDiamond"),
                                OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("stickDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickDiamond"),
                                OreBracketHandler.getOre("stickDiamond"), OreBracketHandler.getOre("stickDiamond"))),
                null)

        //TODO Replace ("TConstruct:blankPattern", 1) in item2
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("dreamcraft:item.MoldFormCoinage", 0),
        //        arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(null, item2, null),
        //                arrayOf<IIngredient?>(ore6, ore10, null)), null)

        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.PistonBlock", 0),
                ItemBracketHandler.getItem("minecraft:cobblestone", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20032),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(72), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.PistonBlock", 0),
                ItemBracketHandler.getItem("minecraft:cobblestone", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20304),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(72), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.PistonPlate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470).amount(6),
                ItemBracketHandler.getItem("minecraft:fence", 0), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.PistonPlate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470).amount(6),
                ItemBracketHandler.getItem("ExtraTrees:fence", OreDictionary.WILDCARD_VALUE), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.PistonPlate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470).amount(6),
                ItemBracketHandler.getItem("Forestry:fences", OreDictionary.WILDCARD_VALUE), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.PistonPlate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470).amount(6),
                ItemBracketHandler.getItem("Forestry:fencesFireproof", OreDictionary.WILDCARD_VALUE), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.PistonPlate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470).amount(6),
                ItemBracketHandler.getItem("Natura:Natura.fence", OreDictionary.WILDCARD_VALUE), 100, VoltageLevels.LV)

        //TODO Replace ("AdvancedSolarPanel:asp_crafting_items", 4)
        //Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EnrichedNaquadriaSunnariumAlloy", 0),
        //        ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 4),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22327), 2000, VoltageLevels.UV)

        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EnrichedNaquadriaNeutroniumSunnariumAlloy", 0),
                ItemBracketHandler.getItem("dreamcraft:item.EnrichedNaquadriaSunnariumAlloy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22129), 2400, VoltageLevels.UHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EnrichedXSunnariumAlloy", 0),
                ItemBracketHandler.getItem("dreamcraft:item.EnrichedNaquadriaNeutroniumSunnariumAlloy", 0),
                ItemBracketHandler.getItem("dreamcraft:item.BedrockiumPlate", 0).amount(18), 2800, VoltageLevels.UEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.BronzePlatedReinforcedStone", 0),
                ItemBracketHandler.getItem("IC2:blockAlloy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17300).amount(6),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(144), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.SteelPlatedReinforcedStone", 0),
                ItemBracketHandler.getItem("IC2:blockAlloy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17305).amount(6),
                LiquidBracketHandler.getLiquid("molten.aluminium").withAmount(144), 250, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.TitaniumPlatedReinforcedStone", 0),
                ItemBracketHandler.getItem("IC2:blockAlloy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17028).amount(6),
                LiquidBracketHandler.getLiquid("molten.platinum").withAmount(144), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.TungstensteelPlatedReinforcedStone", 0),
                ItemBracketHandler.getItem("IC2:blockAlloy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316).amount(6),
                LiquidBracketHandler.getLiquid("molten.iridium").withAmount(144), 350, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.NaquadahPlatedReinforcedStone", 0),
                ItemBracketHandler.getItem("IC2:blockAlloy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17324).amount(6),
                LiquidBracketHandler.getLiquid("molten.osmium").withAmount(144), 450, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.NeutroniumPlatedReinforcedStone", 0),
                ItemBracketHandler.getItem("IC2:blockAlloy", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17129).amount(6),
                LiquidBracketHandler.getLiquid("molten.naquadria").withAmount(144), 500,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.LightBinding", 0),
                ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 6).amount(2),
                ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 14).amount(2), 600,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.BioOrganicMesh", 0),
                ItemBracketHandler.getItem("dreamcraft:item.RawBioFiber", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 800, VoltageLevels.LULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.BioChunk", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockgem3", 4),
                ItemBracketHandler.getItem("dreamcraft:item.CompressedBioBall", 0).amount(8), 1200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.DiamondFrameBox", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23500).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 64, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.TenKCell", 0),
                ItemBracketHandler.getItem("IC2:itemCellEmpty", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17057).amount(4), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ThirtyKCell", 0),
                ItemBracketHandler.getItem("dreamcraft:item.TenKCell", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.SixtyKCell", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ThirtyKCell", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.CompressedGraphite", 0).amount(2),
                ItemBracketHandler.getItem("minecraft:stone", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2865), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("RIO:item.chip.location", 0),
                ItemBracketHandler.getItem("RIO:item.blank_plate", 0), 100,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorSpatialPulsatingCore", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                ItemBracketHandler.getItem("dreamcraft:item.PulsatingSpatialCoreChip", 0), 100, VoltageLevels.LUV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidDiamondCore", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                ItemBracketHandler.getItem("dreamcraft:item.DiamondFluidCoreChip", 0), 100, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorFluidEmeraldCore", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                ItemBracketHandler.getItem("dreamcraft:item.EmeraldAdvancedFluidCoreChip", 0), 100, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.LogicProcessorItemGoldCore", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22),
                ItemBracketHandler.getItem("dreamcraft:item.GoldCoreChip", 0), 100,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemDiamondCore", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                ItemBracketHandler.getItem("dreamcraft:item.DiamondCoreChip", 0), 100, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemEmeraldCore", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                ItemBracketHandler.getItem("dreamcraft:item.EmeraldAdvancedCoreChip", 0), 100, VoltageLevels.IV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24),
                ItemBracketHandler.getItem("dreamcraft:item.EmeraldHighAdvancedCoreChip", 0), 100, VoltageLevels.LUV)

        //TODO Replace ("GalaxySpace:item.CompressedPlates", 3) and ("GalaxySpace:item.CompressedPlates", 6)
        //Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.LeadNickelPlate", 0).amount(2),
        //        ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 3),
        //        ItemBracketHandler.getItem("GalaxySpace:item.CompressedPlates", 6),
        //        LiquidBracketHandler.getLiquid("ic2coolant").withAmount(2000), 600, VoltageLevels.LEV)

        //TODO Replace ("dreamcraft:item.IrradiantReinforcedAluminiumPlate", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedAluminiumPlate", 0),
        //        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedAluminiumIronPlate", 0),
        //                OreBracketHandler.getOre("craftingSunnariumPart"),
        //                ItemBracketHandler.getItem("IC2:itemPartIndustrialDiamond", 0),
        //                OreBracketHandler.getOre("plateRedAlloy").amount(2),
        //                OreBracketHandler.getOre("screwRedAlloy").amount(4)),
        //        LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(144), 600, VoltageLevels.MV)

        //TODO Replace ("AdvancedSolarPanel:asp_crafting_items", 0)
        //Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTitaniumPlate", 0),
        //        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedTitaniumIronPlate", 0),
        //                ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 0),
        //                OreBracketHandler.getOre("plateMeteoricSteel"),
        //                OreBracketHandler.getOre("plateLapis").amount(2),
        //                OreBracketHandler.getOre("screwRedAlloy").amount(4)),
        //        LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(288), 600,  VoltageLevels.HV)

        //TODO Replace ("AdvancedSolarPanel:asp_crafting_items", 3)
        //Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenPlate", 0),
        //        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedTungstenIronPlate", 0),
        //                ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 3),
        //                OreBracketHandler.getOre("plateUranium"), OreBracketHandler.getOre("plateSteeleaf").amount(2),
        //                OreBracketHandler.getOre("screwRedAlloy").amount(4)),
        //        LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(576), 600, VoltageLevels.EV)

        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenSteelPlate", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedTungstenSteelIronPlate", 0),
                        OreBracketHandler.getOre("plateQuadrupleSunnarium"), OreBracketHandler.getOre("platePlutonium"),
                        OreBracketHandler.getOre("plateKnightmetal").amount(2),
                        OreBracketHandler.getOre("screwRedAlloy").amount(4)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(1152), 600, VoltageLevels.IV)

        //TODO Replace ("AdvancedSolarPanel:asp_crafting_items", 1)
        //Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedChromePlate", 0),
        //        arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedChromeIronPlate", 0),
        //                ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 1),
        //                OreBracketHandler.getOre("plateYttriumBariumCuprate"),
        //                OreBracketHandler.getOre("plateFierySteel").amount(2),
        //                OreBracketHandler.getOre("screwRedAlloy").amount(4)),
        //        LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(2304), 600, VoltageLevels.LUV)

        //TODO Replace ("AdvancedSolarPanel:asp_crafting_items", 8), ("AdvancedSolarPanel:asp_crafting_items", 7) and
        // ("AdvancedSolarPanel:asp_crafting_items", 4)
        //Assembler.addRecipe(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 8),
        //        arrayOf(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 7),
        //                ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 4),
        //                OreBracketHandler.getOre("plateOsmium"), OreBracketHandler.getOre("plateIridium").amount(2),
        //                OreBracketHandler.getOre("screwRedAlloy").amount(4)),
        //        LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(4608), 600, VoltageLevels.ZPM)

        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNaquadriaPlate", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedNaquadriaIronPlate", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.EnrichedNaquadriaSunnariumAlloy", 0),
                        OreBracketHandler.getOre("plateQuantium"),
                        OreBracketHandler.getOre("plateOsmiridium").amount(2),
                        OreBracketHandler.getOre("screwRedAlloy").amount(4)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(9216), 600, VoltageLevels.UV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNeutroniumPlate", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedNeutroniumIronPlate", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.EnrichedNaquadriaNeutroniumSunnariumAlloy", 0),
                        OreBracketHandler.getOre("plateMysteriousCrystal"),
                        OreBracketHandler.getOre("plateInfinity").amount(2),
                        OreBracketHandler.getOre("screwRedAlloy").amount(4)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(18432), 600, VoltageLevels.UHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedBedrockiumPlate", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedBedrockiumIronPlate", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.EnrichedXSunnariumAlloy", 0),
                        OreBracketHandler.getOre("plateDraconiumAwakened"),
                        OreBracketHandler.getOre("plateInfinityCatalyst").amount(2),
                        OreBracketHandler.getOre("screwRedAlloy").amount(4)),
                LiquidBracketHandler.getLiquid("molten.solderingalloy").withAmount(36864), 600, VoltageLevels.UEV)
        Autoclave.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.RawBioFiber", 0),
                ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0).amount(16),
                LiquidBracketHandler.getLiquid("ic2biomass").withAmount(8), 3300, 200, 20)
        Autoclave.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.RawBioFiber", 0),
                ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0).amount(16),
                LiquidBracketHandler.getLiquid("methanol").withAmount(8), 5000, 200, 20)
        Autoclave.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.RawBioFiber", 0),
                ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0).amount(16),
                LiquidBracketHandler.getLiquid("fuel").withAmount(8), 9000, 200, 20)
        Autoclave.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.RawBioFiber", 0),
                ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0).amount(16),
                LiquidBracketHandler.getLiquid("nitrofuel").withAmount(8), 10000, 200, 20)
        Brewery.addRecipe(LiquidBracketHandler.getLiquid("enrichedbacterialsludge").withAmount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2098),
                LiquidBracketHandler.getLiquid("bacterialsludge").withAmount(100), false)
        Brewery.addRecipe(LiquidBracketHandler.getLiquid("enrichedbacterialsludge").withAmount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 97),
                LiquidBracketHandler.getLiquid("bacterialsludge").withAmount(100), false)
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.LedoxIngot", 0),
                ItemBracketHandler.getItem("dreamcraft:item.LedoxDust", 0))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.BlackPlutonium", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11388).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.Mytryl", 0),
                ItemBracketHandler.getItem("dreamcraft:item.MytrylIngot", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.CompressedCharcoal", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockgem3", 4).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.CompressedCoal", 0),
                ItemBracketHandler.getItem("minecraft:coal_block", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.CompressedCoalCoke", 0),
                ItemBracketHandler.getItem("Railcraft:cube", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.DoubleCompressedCharcoal", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.CompressedCharcoal", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.DoubleCompressedCoal", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.CompressedCoal", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.DoubleCompressedCoalCoke", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.CompressedCoalCoke", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.TripleCompressedCharcoal", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.DoubleCompressedCharcoal", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.TripleCompressedCoal", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.DoubleCompressedCoal", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.TripleCompressedCoalCoke", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.DoubleCompressedCoalCoke", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.QuadrupleCompressedCharcoal", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.TripleCompressedCharcoal", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.QuadrupleCompressedCoal", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.TripleCompressedCoal", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.QuadrupleCompressedCoalCoke", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.TripleCompressedCoalCoke", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.QuintupleCompressedCharcoal", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.QuadrupleCompressedCharcoal", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.QuintupleCompressedCoal", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.QuadrupleCompressedCoal", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.QuintupleCompressedCoalCoke", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.QuadrupleCompressedCoalCoke", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzPlate", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.CompressedBioBall", 0),
                ItemBracketHandler.getItem("dreamcraft:item.BioBall", 0))
        Compressor.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.BioCarbonPlate", 0),
                ItemBracketHandler.getItem("dreamcraft:item.BioOrganicMesh", 0))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("seedoil").withAmount(500),
                arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526), null, null,
                        ItemBracketHandler.getItem("minecraft:piston", 0), null, null, null, null),
                ItemBracketHandler.getItem("Forestry:sturdyMachine", 0),
                ItemBracketHandler.getItem("dreamcraft:item.EngineCore", 0))
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.PotassiumHydroxideDust", 0).amount(3),
                LiquidBracketHandler.getLiquid("hydrogen").withAmount(1000),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2025),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("water").withAmount(3000), 1200, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0).amount(2), null,
                ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(288), 1200, VoltageLevels.LHV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0).amount(2), null,
                ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(160), 1200, VoltageLevels.LHV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0).amount(2), null,
                ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(64), 600, VoltageLevels.LHV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.CallistoIcePlate", 0).amount(9), null,
                ItemBracketHandler.getItem("dreamcraft:tile.CallistoColdIce", 0),
                LiquidBracketHandler.getLiquid("ic2coolant").withAmount(1000), 3600, VoltageLevels.LV)
        Fermenter.addRecipe(LiquidBracketHandler.getLiquid("fermentedbacterialsludge").withAmount(75),
                LiquidBracketHandler.getLiquid("enrichedbacterialsludge").withAmount(750), 2400, false)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedDiamondCrystalChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24500).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500).amount(4), 400, VoltageLevels.EV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedEnergyChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24502).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE), 600, VoltageLevels.LIV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedEnergyChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24511).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE), 600, VoltageLevels.LIV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedEnergyChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24512).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE), 600, VoltageLevels.LIV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedEnergyChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24527).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE), 600, VoltageLevels.LIV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedEnergyChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24541).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE), 600, VoltageLevels.LIV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedQuantumChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24540).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30528), 1200, VoltageLevels.LUV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedQuantumChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24521).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30528), 1200, VoltageLevels.LUV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedQuantumChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24528).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30528), 1200, VoltageLevels.LUV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.NanoCrystal", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24533).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE), 600,  VoltageLevels.HV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.NanoCrystal", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24532).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE), 600,  VoltageLevels.HV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.QuantumCrystal", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24533).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE), 800, VoltageLevels.EV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.QuantumCrystal", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24532).amount(0),
                ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE), 800, VoltageLevels.EV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ManyullynCrystal", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24508).amount(0),
                ItemBracketHandler.getItem("dreamcraft:item.ManyullynPlate", 0).amount(4), 1200, VoltageLevels.EV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ManyullynCrystal", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24509).amount(0),
                ItemBracketHandler.getItem("dreamcraft:item.ManyullynPlate", 0).amount(4), 1200, VoltageLevels.EV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedManyullynCrystalChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24508).amount(0),
                ItemBracketHandler.getItem("dreamcraft:item.ManyullynCrystal", 0), 900, VoltageLevels.IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedManyullynCrystalChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24509).amount(0),
                ItemBracketHandler.getItem("dreamcraft:item.ManyullynCrystal", 0), 900, VoltageLevels.IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedGoldChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086), 100, VoltageLevels.MV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedGoldChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24515).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086), 100, VoltageLevels.MV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedGoldChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24545).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086), 100, VoltageLevels.MV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedGoldChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24890).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086), 100, VoltageLevels.MV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EngravedGoldChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24500).amount(0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086), 100, VoltageLevels.MV)
        Distillery.addRecipe(LiquidBracketHandler.getLiquid("mutagen").withAmount(10),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0),
                LiquidBracketHandler.getLiquid("fermentedbacterialsludge").withAmount(100), 600, 1920, false)
        Extractor.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.CokeOvenBrick", 0).amount(4),
                ItemBracketHandler.getItem("Railcraft:machine.alpha", 7))
        Extractor.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.AdvancedCokeOvenBrick", 0).amount(4),
                ItemBracketHandler.getItem("Railcraft:machine.alpha", 12))
        Extruder.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0).amount(2),
                ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32357).amount(0), 400, VoltageLevels.HV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1), 10, VoltageLevels.LLV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.PulsatingSpatialCoreChip", 0),
                ItemBracketHandler.getItem("dreamcraft:item.EngravedManyullynCrystalChip", 0),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 4), 300, VoltageLevels.IV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.DiamondFluidCoreChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32714),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 3), 300,  VoltageLevels.HV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EmeraldAdvancedFluidCoreChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32714),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 7), 300, VoltageLevels.LEV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.GoldCoreChip", 0),
                ItemBracketHandler.getItem("dreamcraft:item.EngravedGoldChip", 0),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 2), 300, VoltageLevels.LHV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.DiamondCoreChip", 0),
                ItemBracketHandler.getItem("dreamcraft:item.EngravedDiamondCrystalChip", 0),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 3), 300,  VoltageLevels.HV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EmeraldAdvancedCoreChip", 0),
                ItemBracketHandler.getItem("dreamcraft:item.EngravedEnergyChip", 0),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 7), 300, VoltageLevels.LEV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EmeraldHighAdvancedCoreChip", 0),
                ItemBracketHandler.getItem("dreamcraft:item.EngravedQuantumChip", 0),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 7), 300, VoltageLevels.LIV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.GeneticCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32713),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 4), 300,  VoltageLevels.HV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.EnvironmentalCircuit", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32713),
                ItemBracketHandler.getItem("BuildCraft|Silicon:redstoneChipset", 3), 300,  VoltageLevels.HV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.AluminiumIronPlate", 0),
                OreBracketHandler.getOre("plateAluminium").amount(2), OreBracketHandler.getOre("plateIron").amount(4),
                600, 120)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.TitaniumIronPlate", 0),
                OreBracketHandler.getOre("plateTitanium").amount(2), OreBracketHandler.getOre("plateIron").amount(4),
                600, 480)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.TungstenIronPlate", 0),
                OreBracketHandler.getOre("plateTungsten").amount(2), OreBracketHandler.getOre("plateIron").amount(4),
                600, 1920)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.TungstenSteelIronPlate", 0),
                OreBracketHandler.getOre("plateTungstenSteel").amount(2),
                OreBracketHandler.getOre("plateIron").amount(4), 600, VoltageLevels.IV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ChromeIronPlate", 0),
                OreBracketHandler.getOre("plateChrome").amount(2), OreBracketHandler.getOre("plateIron").amount(4), 600,
                30720)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.NaquadriaIronPlate", 0),
                OreBracketHandler.getOre("plateNaquadria").amount(2), OreBracketHandler.getOre("plateIron").amount(4),
                600, 500000)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.NeutroniumIronPlate", 0),
                OreBracketHandler.getOre("plateNeutronium").amount(2), OreBracketHandler.getOre("plateIron").amount(4),
                600, 2000000)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.BedrockiumIronPlate", 0),
                OreBracketHandler.getOre("plateBedrockium").amount(2), OreBracketHandler.getOre("plateIron").amount(4),
                600, 8000000)
        Lathe.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.LongObsidianRod", 0).amount(4), null),
                ItemBracketHandler.getItem("minecraft:obsidian", 0), 640, VoltageLevels.LLV)
        Lathe.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.LongStoneRod", 0).amount(4), null),
                ItemBracketHandler.getItem("minecraft:stone", 0), 320, VoltageLevels.LLV)
        Lathe.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzRod", 0).amount(2),
                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0)),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1).amount(2), 200, VoltageLevels.LLV)
        Lathe.addRecipe(arrayOf(item3), ItemBracketHandler.getItem("minecraft:sandstone", OreDictionary.WILDCARD_VALUE), 160, VoltageLevels.LLV)
        Lathe.addRecipe(arrayOf(item4, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1299).amount(2)),
                ItemBracketHandler.getItem("minecraft:cobblestone", 0), 160, VoltageLevels.LLV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MushroomPowder", 0).amount(2)),
                ItemBracketHandler.getItem("Forestry:mushroom", OreDictionary.WILDCARD_VALUE), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MushroomPowder", 0).amount(2)),
                ItemBracketHandler.getItem("minecraft:brown_mushroom", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MushroomPowder", 0).amount(2)),
                ItemBracketHandler.getItem("BiomesOPlenty:mushrooms", OreDictionary.WILDCARD_VALUE), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(4)),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(4)),
                ItemBracketHandler.getItem("dreamcraft:item.ExtruderShapeBoat", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(4)),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(4)),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(4)),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305).amount(4)),
                ItemBracketHandler.getItem("dreamcraft:item.MarshmallowForm", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1019).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.AluminiumItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1306).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.StainlessSteelItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1028).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.TitaniumItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1030).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.ChromeItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1081).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.TungstenItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1316).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.TungstenSteelItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1084).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.IridiumItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1084).amount(8)),
                ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1083).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.OsmiumItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1129).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.NeutroniumItemCasing", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2398).amount(9)),
                ItemBracketHandler.getItem("dreamcraft:item.MysteriousCrystal", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MytrylDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.RawMytryl", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MytrylDust", 0).amount(9)),
                ItemBracketHandler.getItem("dreamcraft:tile.Mytryl", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MytrylDust", 0).amount(3)),
                ItemBracketHandler.getItem("dreamcraft:item.MytrylCompressedPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MytrylDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.MytrylIngot", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MytrylDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.MytrylPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.MytrylDust", 0).amount(9)),
                ItemBracketHandler.getItem("dreamcraft:item.MytrylDensePlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.QuantinumDust", 0).amount(9)),
                ItemBracketHandler.getItem("dreamcraft:item.QuantinumDensePlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.QuantinumDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.QuantinumPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.QuantinumDust", 0).amount(3)),
                ItemBracketHandler.getItem("dreamcraft:item.QuantinumCompressedPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.QuantinumDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.QuantinumRod", 0).amount(2), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.BlackPlutoniumDust", 0).amount(18)),
                ItemBracketHandler.getItem("dreamcraft:item.BlackPlutoniumDensePlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.BlackPlutoniumDust", 0).amount(2)),
                ItemBracketHandler.getItem("dreamcraft:item.BlackPlutoniumPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.CallistoIceDust", 0).amount(9)),
                ItemBracketHandler.getItem("dreamcraft:tile.CallistoColdIce", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.CallistoIceDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.CallistoIcePlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.CallistoIceDust", 0).amount(3)),
                ItemBracketHandler.getItem("dreamcraft:item.CallistoIceCompressedPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.LedoxDust", 0).amount(9)),
                ItemBracketHandler.getItem("dreamcraft:tile.Ledox", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.LedoxDust", 0).amount(9)),
                ItemBracketHandler.getItem("dreamcraft:item.LedoxDensePlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.LedoxDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.LedoxPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.LedoxDust", 0).amount(3)),
                ItemBracketHandler.getItem("dreamcraft:item.LedoxCompressedPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0)),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzPlate", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0)),
                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzRod", 0).amount(2), intArrayOf(10000),
                300, 2)
        Mixer.addRecipe(null, LiquidBracketHandler.getLiquid("sodiumpotassium").withAmount(1000),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2017).amount(2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2025).amount(3)), null, 400, 30)
        Mixer.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.BioBall", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemFuelPlantBall", 0).amount(16),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2802).amount(2)), 200, VoltageLevels.LLV)

        //TODO Replace ("harvestcraft:soybeanItem", 0)
        //Mixer.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.WetTofu", 0), null,
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:soybeanItem", 0)),
        //        LiquidBracketHandler.getLiquid("water").withAmount(100), 600, VoltageLevels.ULV)
        //Mixer.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.WetTofu", 0), null,
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:soybeanItem", 0)),
        //        LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(50), 300, VoltageLevels.ULV)

        PlateBender.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.QuantinumDensePlate", 0),
                ItemBracketHandler.getItem("dreamcraft:item.QuantinumPlate", 0).amount(9), 600, VoltageLevels.MV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.MytrylDensePlate", 0),
                ItemBracketHandler.getItem("dreamcraft:item.MytrylPlate", 0).amount(9), 300, VoltageLevels.MV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.LedoxDensePlate", 0),
                ItemBracketHandler.getItem("dreamcraft:item.LedoxPlate", 0).amount(9), 400, VoltageLevels.MV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.BlackPlutoniumDensePlate", 0),
                ItemBracketHandler.getItem("dreamcraft:item.BlackPlutoniumPlate", 0).amount(9), 1200,  VoltageLevels.HV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11804), 400, VoltageLevels.LV)

        //TODO Replace Smeltery
        //Casting.addTableRecipe(ItemBracketHandler.getItem("dreamcraft:item.ExtruderShapeBoat", 0),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeBoat", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormBoots", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormChestplate", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormHelmet", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormLeggings", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("dreamcraft:item.MarshmallowForm", 0),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MarshmallowFormMold", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("dreamcraft:item.BowFletchingCast", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(144),
        //        ItemBracketHandler.getItem("TConstruct:fletching", OreDictionary.WILDCARD_VALUE), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("dreamcraft:item.BowStringCast", 0),
        //        LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(144),
        //        ItemBracketHandler.getItem("TConstruct:bowstring", OreDictionary.WILDCARD_VALUE), true, 100)

        Wiremill.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ElectrotineWire", 0).amount(2),
                ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 55), 100, VoltageLevels.ULV)
        Research.addTab("NEWHORIZONS", "dreamcraft", "textures/thaumcraft/icon/icon_GTNH.png", "dreamcraft",
                "textures/thaumcraft/tab/tab_GTNH.png")
        MineTweakerAPI.game.setLocalization("tc.research_category.NEWHORIZONS", "New Horizons")
        Research.addResearch("WITHERRING", "ARTIFICE",
                "alienis 15, praecantatio 12, superbia 9, spiritus 6, infernus 3", 3, 2, 4,
                ItemBracketHandler.getItem("dreamcraft:item.WitherProtectionRing", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.WITHERRING", "Wither Protection Ring")
        MineTweakerAPI.game.setLocalization("tc.research_text.WITHERRING", "[NH] Wither...? It is star farming time")
        Research.addPrereq("WITHERRING", "RUNICARMOR", false)
        Research.addSibling("WITHERRING", "RUNICARMOR")
        Research.setConcealed("WITHERRING", true)
        Research.addPage("WITHERRING", "NewHorizons.research_page.WITHERRING")
        MineTweakerAPI.game.setLocalization("NewHorizons.research_page.WITHERRING",
                "The Wither Protection Ring is a very special ring. Now you find a way to rid of the nasty withering effect. With this Ring it is time to farm some Netherstars. Good luck!!!")
        Infusion.addRecipe("WITHERRING", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1),
                arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
                        ItemBracketHandler.getItem("minecraft:milk_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:skull", 1),
                        ItemBracketHandler.getItem("minecraft:milk_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:skull", 1)),
                "alienis 45, praecantatio 35, spiritus 30, superbia 25, infernus 15",
                ItemBracketHandler.getItem("dreamcraft:item.WitherProtectionRing", 0), 3)
        Research.addInfusionPage("WITHERRING", ItemBracketHandler.getItem("dreamcraft:item.WitherProtectionRing", 0))
        Warp.addToResearch("WITHERRING", 2)

        //TODO Replace ("ExtraUtilities:decorativeBlock1", 14)
        //Research.addResearch("EMINENCESTONE", "NEWHORIZONS", "alienis 15, sensus 12, terra 9, aer 6", 0, 4, 12,
        //        ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 14))
        //MineTweakerAPI.game.setLocalization("tc.research_name.EMINENCESTONE", "Carved 'Eminence' Stone")
        //MineTweakerAPI.game.setLocalization("tc.research_text.EMINENCESTONE", "[EU] Portal Stones")
        //Research.addPrereq("EMINENCESTONE", "INFUSION", false)
        //Research.setConcealed("EMINENCESTONE", false)
        //Research.addPage("EMINENCESTONE", "ExtraUtilities.research_page.EMINENCESTONE")
        //MineTweakerAPI.game.setLocalization("ExtraUtilities.research_page.EMINENCESTONE",
        //        "A stone with trans-dimensional capacities. Can be used to craft a portal to The Last Millenium, or as expensive decoration block.")
        //Arcane.addShaped("EMINENCESTONE", ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 14).amount(2),
        //        "aer 50, ignis 50, terra 50, aqua 50, ordo 50, perditio 50",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 18),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17532),
        //                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17532)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                        ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 26),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330))))
        //Research.addArcanePage("EMINENCESTONE", ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 14))

        //TODO Replace ("ExtraUtilities:decorativeBlock1", 14), ("ExtraUtilities:decorativeBlock1", 2),
        // ("ExtraUtilities:dark_portal", 2), ("ExtraUtilities:cobblestone_compressed", 4), ("ExtraUtilities:decorativeBlock1", 5),
        // ("TConstruct:heavyPlate", 314), ("TConstruct:heavyPlate", 315), ("ExtraUtilities:dark_portal", 0)
        // Note, would need to reimplement the whole deep dark portal here it seems.
        //Research.addResearch("PORTALMILLENIUM", "NEWHORIZONS", "alienis 15, sensus 12, terra 9, ignis 6 vacuos 200", 2,
        //        6, 4, ItemBracketHandler.getItem("ExtraUtilities:dark_portal", 2))
        //MineTweakerAPI.game.setLocalization("tc.research_name.PORTALMILLENIUM", "Portal to The Last Millennium")
        //MineTweakerAPI.game.setLocalization("tc.research_text.PORTALMILLENIUM", "[EU] Night and Void")
        //Research.addPrereq("PORTALMILLENIUM", "EMINENCESTONE", false)
        //Research.addPrereq("PORTALMILLENIUM", "OCULUS", false)
        //Research.setConcealed("PORTALMILLENIUM", true)
        //Research.addPage("PORTALMILLENIUM", "ExtraUtilities.research_page.PORTALMILLENIUM")
        //MineTweakerAPI.game.setLocalization("ExtraUtilities.research_page.PORTALMILLENIUM",
        //        "This place is known as The Last Millenium. All life, energy, knowledge, passion, struggle, philosophy and meaning is just a few short centuries from being rendered fully pointless. On the plus side, rent is very cheap now.")
        //Infusion.addRecipe("PORTALMILLENIUM", ItemBracketHandler.getItem("minecraft:clock", 0),
        //        arrayOf(ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 14),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 2),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 14),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 2),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 14),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 2),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 14),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 2)),
        //        "alienis 75, sensus 25, praecantatio 75, terra 25, vacuos 75",
        //        ItemBracketHandler.getItem("ExtraUtilities:dark_portal", 2), 4)
        //Research.addInfusionPage("PORTALMILLENIUM", ItemBracketHandler.getItem("ExtraUtilities:dark_portal", 2))
        //Warp.addToResearch("PORTALMILLENIUM", 2)
        //Research.addResearch("PORTALDEEPDARK", "NEWHORIZONS",
        //        "alienis 15, spiritus 15, metallum 12, fabrico 9 lucrum 6, potentia 3", 2, 8, 4,
        //        ItemBracketHandler.getItem("ExtraUtilities:dark_portal", 0))
        //MineTweakerAPI.game.setLocalization("tc.research_name.PORTALDEEPDARK", "Portal to The Deep Dark")
        //MineTweakerAPI.game.setLocalization("tc.research_text.PORTALDEEPDARK", "[EU] Deep, Deeper, Deep Dark")
        //Research.addPrereq("PORTALDEEPDARK", "PORTALMILLENIUM", false)
        //Research.addPrereq("PORTALDEEPDARK", "ICHOR", false)
        //Research.setConcealed("PORTALDEEPDARK", true)
        //Research.addPage("PORTALDEEPDARK", "ExtraUtilities.research_page.PORTALDEEPDARK")
        //MineTweakerAPI.game.setLocalization("ExtraUtilities.research_page.PORTALDEEPDARK",
        //        "As an experienced miner you naturally wish to mine deeper and further than ever before into areas of natural wealth. The deep dark is a realm far below the void, filled with natural resources and deadly enemies. Some say that the darkness within this realm is alive and will consume any unlucky adventurer who wanders too far into it. Remember to bring torches. Torches will not protect you completely, however since mobs will spawn at all light levels in the Deep Dark. Magnum torches and Chandeliers will still prevent mob spawning.")
        //Infusion.addRecipe("PORTALDEEPDARK", ItemBracketHandler.getItem("ExtraUtilities:dark_portal", 2),
        //        arrayOf(ItemBracketHandler.getItem("ExtraUtilities:cobblestone_compressed", 4),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 5),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 314),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22388),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17397),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22388),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 314),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 5),
        //                ItemBracketHandler.getItem("ExtraUtilities:cobblestone_compressed", 4),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 5),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 314),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22388),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17397),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22388),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 314),
        //                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 5)),
        //        "alienis 300, spiritus 150, metallum 200, fabrico 150 lucrum 100, potentia 200",
        //        ItemBracketHandler.getItem("ExtraUtilities:dark_portal", 0), 12)
        //Research.addInfusionPage("PORTALDEEPDARK", ItemBracketHandler.getItem("ExtraUtilities:dark_portal", 0))
        //Warp.addToResearch("PORTALDEEPDARK", 8)

        //TODO Replace ("ExtraUtilities:decorativeBlock1", 8) in item5
        //Research.addResearch("MAGICALWOOD", "NEWHORIZONS", "praecantatio 15, lucrum 12, arbor 9, cognitio 6, pannus 3",
        //        -2, 6, 4, item5)
        //MineTweakerAPI.game.setLocalization("tc.research_name.MAGICALWOOD", "Magical Wood")
        //MineTweakerAPI.game.setLocalization("tc.research_text.MAGICALWOOD", "[EU] Twilight Thaumcraft Magic")
        //Research.addPrereq("MAGICALWOOD", "EMINENCESTONE", false)
        //Research.setConcealed("MAGICALWOOD", true)
        //Research.addPage("MAGICALWOOD", "ExtraUtilities.research_page.MAGICALWOOD")
        //MineTweakerAPI.game.setLocalization("ExtraUtilities.research_page.MAGICALWOOD",
        //        "Magical Wood is an ingredient in the crafting of the Ender Core. It can be placed near an Enchantment Table to boost the level the table can enchant at by five levels. The amount of magical wood made from the crafting recipe depends on the strength of the enchantments on the Enchanted Books. For example, 4x Protection I gives a single piece of Magical Wood, whereas 4x Protection IV gives 14 pieces of wood.")
        //Arcane.addShaped("MAGICALWOOD", item5.amount(4), "aer 10, ignis 10, terra 10, aqua 10, ordo 10, perditio 10",
        //        arrayOf(arrayOf<IIngredient>(item6, ItemBracketHandler.getItem("TwilightForest:item.carminite", 0),
        //                item7), arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
        //                ItemBracketHandler.getItem("minecraft:bookshelf", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330)),
        //                arrayOf<IIngredient>(item7, ItemBracketHandler.getItem("TwilightForest:item.carminite", 0),
        //                        item6)))
        //Research.addArcanePage("MAGICALWOOD", item5)

        //TODO Replace ("ExtraUtilities:angelBlock", 0)
        //Research.addResearch("ANGELBLOCK", "NEWHORIZONS", "aer 15, lucrum 12, ignis 9, terra 6", -2, 8, 4,
        //        ItemBracketHandler.getItem("ExtraUtilities:angelBlock", 0))
        //MineTweakerAPI.game.setLocalization("tc.research_name.ANGELBLOCK", "Angel Block")
        //MineTweakerAPI.game.setLocalization("tc.research_text.ANGELBLOCK", "[EU] A Block in the Air")
        //Research.addPrereq("ANGELBLOCK", "MAGICALWOOD", false)
        //Research.setConcealed("ANGELBLOCK", true)
        //Research.addPage("ANGELBLOCK", "ExtraUtilities.research_page.ANGELBLOCK")
        //MineTweakerAPI.game.setLocalization("ExtraUtilities.research_page.ANGELBLOCK",
        //        "The Angel Block is a block added by the Extra Utilities mod. This block is unique in that it does not need another block for it to be built against, so it can be placed in mid-air. When right-clicking the block will be placed in the direction youre looking. The block cant be placed diagonally in mid-air. No tool is required to break the block and it is broken instantly, even without any tools. After breaking the block does not drop, but rather instantly returns to the players inventory.")
        //Arcane.addShaped("ANGELBLOCK", ItemBracketHandler.getItem("ExtraUtilities:angelBlock", 0), "aer 50",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17540),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29351),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17540)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemDensePlates", 7),
        //                        ItemBracketHandler.getItem("Automagy:blockRunedObsidian", 0),
        //                        ItemBracketHandler.getItem("IC2:itemDensePlates", 7)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17540),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29351),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17540))))
        //Research.addArcanePage("ANGELBLOCK", ItemBracketHandler.getItem("ExtraUtilities:angelBlock", 0))

        //TODO Replace ("harvestcraft:epicbaconItem", 0), ("harvestcraft:deluxechickencurryItem", 0), ("harvestcraft:meatfeastpizzaItem", 0)
        // ("harvestcraft:beefwellingtonItem", 0), ("harvestcraft:sausageinbreadItem", 0) and ("harvestcraft:heartybreakfastItem", 0)
        //Research.addResearch("DEZILSMARSHMALLOW", "NEWHORIZONS",
        //        "alienis 15, praecantatio 12, superbia 9, sano 6, potentia 3", -2, 2, 4,
        //        ItemBracketHandler.getItem("DraconicEvolution:dezilsMarshmallow", 0))
        //MineTweakerAPI.game.setLocalization("tc.research_name.DEZILSMARSHMALLOW", "Dezil's Marshmallow")
        //MineTweakerAPI.game.setLocalization("tc.research_text.DEZILSMARSHMALLOW", "[DE] OP food please")
        //Research.addPrereq("DEZILSMARSHMALLOW", "INFUSION", false)
        //Research.setConcealed("DEZILSMARSHMALLOW", false)
        //Research.setSpikey("DEZILSMARSHMALLOW", true)
        //Research.addPage("DEZILSMARSHMALLOW", "de.research_page.DEZILSMARSHMALLOW")
        //MineTweakerAPI.game.setLocalization("de.research_page.DEZILSMARSHMALLOW",
        //        "The ultimate power of food. You can swim in lava, dive like a fish, mine like crazy and jump like a rabbit. Eat one of these marshmallows and you will never get hungry again. You feel like you can take on the Dragon with just bare hands")
        //Infusion.addRecipe("DEZILSMARSHMALLOW", ItemBracketHandler.getItem("dreamcraft:item.Marshmallow", 0),
        //        arrayOf(ItemBracketHandler.getItem("harvestcraft:epicbaconItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:deluxechickencurryItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:meatfeastpizzaItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:beefwellingtonItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:sausageinbreadItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:heartybreakfastItem", 0)),
        //        "alienis 32, praecantatio 16, superbia 24, sano 28, iter 20, potentia 12",
        //        ItemBracketHandler.getItem("DraconicEvolution:dezilsMarshmallow", 0), 5)
        //Research.addInfusionPage("DEZILSMARSHMALLOW",
        //        ItemBracketHandler.getItem("DraconicEvolution:dezilsMarshmallow", 0))
        //Warp.addToResearch("DEZILSMARSHMALLOW", 8)

        Research.addResearch("ENCHANTINGTABLE", "NEWHORIZONS", "praecantatio 15, fabrico 12, cognitio 9, potentia 6", 0,
                0, 4, ItemBracketHandler.getItem("minecraft:enchanting_table", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENCHANTINGTABLE", "Enchanting Table")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENCHANTINGTABLE",
                "[MC] Oh, its more magical than a Table!")
        Research.addPrereq("ENCHANTINGTABLE", "NITOR", false)
        Research.addPrereq("ENCHANTINGTABLE", "ALUMENTUM", false)
        Research.setConcealed("ENCHANTINGTABLE", false)
        Research.addPage("ENCHANTINGTABLE", "Minecraft.research_page.ENCHANTINGTABLE")
        MineTweakerAPI.game.setLocalization("Minecraft.research_page.ENCHANTINGTABLE",
                "An enchantment table is a block that allows players to spend their experience point levels to enchant tools, books and armor. The enchanting tables main purpose is to enchant items. Bookshelves surrounding the table, with a block of air in between, will increase the maximum enchantment level. The table will enchant all tools and armor except the hoe, shears, flint and steel, lead and horse armor. The hoe and shears cannot be enchanted by the enchantment table and require an anvil and an appropriate enchanted book.")
        val s = "ENCHANTINGTABLE"
        val item13 = ItemBracketHandler.getItem("minecraft:enchanting_table", 0)
        val s2 = "aer 45, aqua 45, terra 45, ignis 45, ordo 45, perditio 45"
        val array: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n = 0
        val array2 = arrayOfNulls<IIngredient>(3)
        val n2 = 0
        val item14 = ItemBracketHandler.getItem("ForgeMicroblock:microblock", 516)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["mat"] = ExpandString.asData("minecraft:diamond_block")
        array2[n2] = item14.withTag(ExpandAnyDict.asData(hashMap5))
        array2[1] = ItemBracketHandler.getItem("minecraft:carpet", 14)
        val n3 = 2
        val item15 = ItemBracketHandler.getItem("ForgeMicroblock:microblock", 516)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["mat"] = ExpandString.asData("minecraft:diamond_block")
        array2[n3] = item15.withTag(ExpandAnyDict.asData(hashMap6))
        array[n] = array2
        array[1] = arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                ItemBracketHandler.getItem("minecraft:bookshelf", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1))
        val n4 = 2
        val array3 = arrayOfNulls<IIngredient>(3)
        val n5 = 0
        val item16 = ItemBracketHandler.getItem("ForgeMicroblock:microblock", 516)
        val hashMap7 = HashMap<String, IData>()
        hashMap7["mat"] = ExpandString.asData("minecraft:diamond_block")
        array3[n5] = item16.withTag(ExpandAnyDict.asData(hashMap7))
        array3[1] = OreBracketHandler.getOre("plateDenseObsidian")
        val n6 = 2
        val item17 = ItemBracketHandler.getItem("ForgeMicroblock:microblock", 516)
        val hashMap8 = HashMap<String, IData>()
        hashMap8["mat"] = ExpandString.asData("minecraft:diamond_block")
        array3[n6] = item17.withTag(ExpandAnyDict.asData(hashMap8))
        array[n4] = array3
        Arcane.addShaped(s, item13, s2, array)
        Research.addArcanePage("ENCHANTINGTABLE", ItemBracketHandler.getItem("minecraft:enchanting_table", 0))
        Research.addResearch("DISENCHANTINGTABLE", "NEWHORIZONS",
                "alienis 21, perditio 18, praecantatio 15, fabrico 12, cognitio 9, potentia 6", 2, 2, 4,
                ItemBracketHandler.getItem("DraconicEvolution:dissEnchanter", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.DISENCHANTINGTABLE", "Disenchanting Table")
        MineTweakerAPI.game.setLocalization("tc.research_text.DISENCHANTINGTABLE",
                "[DC] Oh, you can remove Enchants? Nice!")
        Research.addPrereq("DISENCHANTINGTABLE", "ENCHANTINGTABLE", false)
        Research.setConcealed("DISENCHANTINGTABLE", true)
        Research.addPage("DISENCHANTINGTABLE", "DraconicEvolution.research_page.DISENCHANTINGTABLE")
        MineTweakerAPI.game.setLocalization("DraconicEvolution.research_page.DISENCHANTINGTABLE",
                "Disenchanter is a block added by the Draconic Evolution mod. It can be used to remove enchantments from items. This is achieved by placing an enchanted item and a book in its GUI. The enchantment will be moved to the book after pressing the button in the GUI. This process costs a certain amount of experience, as well as cause damage to the item that is being disenchanted. The damage caused to the item can be reduced by placing Bookcases around the Disenchanter.")
        Arcane.addShaped("DISENCHANTINGTABLE", ItemBracketHandler.getItem("DraconicEvolution:dissEnchanter", 0),
                "aer 75, aqua 75, terra 75, ignis 75, ordo 75, perditio 75",
                arrayOf(arrayOf(OreBracketHandler.getOre("blockAmethyst"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
                        OreBracketHandler.getOre("blockAmethyst")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:enchanted_book", 0),
                                ItemBracketHandler.getItem("minecraft:enchanting_table", 0),
                                ItemBracketHandler.getItem("minecraft:enchanted_book", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockThaumium"),
                                OreBracketHandler.getOre("plateDenseObsidian"),
                                OreBracketHandler.getOre("blockThaumium"))))
        Research.addArcanePage("DISENCHANTINGTABLE", ItemBracketHandler.getItem("DraconicEvolution:dissEnchanter", 0))
        Warp.addToResearch("DISENCHANTINGTABLE", 3)
        Research.addResearch("BREWINGSTAND", "NEWHORIZONS",
                "praecantatio 15, fabrico 15, cognitio 12, perditio 12, ignis 9, terra 6, aqua 3", 2, 0, 4,
                ItemBracketHandler.getItem("minecraft:brewing_stand", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.BREWINGSTAND", "Brewing Stand")
        MineTweakerAPI.game.setLocalization("tc.research_text.BREWINGSTAND",
                "[MC] Oh, its more magical than a Cauldron!")
        Research.addPage("BREWINGSTAND", "brewingstand.research_page.BREWINGSTAND.1")
        MineTweakerAPI.game.setLocalization("brewingstand.research_page.BREWINGSTAND.1",
                "Brewing (or Alchemy) is the process of creating potions and splash potions by adding various ingredients to water bottles in a brewing stand. By placing bottles in the lower three slots of the brewing interface and an ingredient in the upper slot, you can distill the ingredient into the bottles and brew potions which may be consumed to grant an effect to the player. Every potion starts with a water bottle, made by filling a glass bottle at a water source or filled cauldron. The next step is to add a primary ingredient to create a base potion, which is usually Nether Wart, which creates an awkward potion and has no effects.")
        Research.addPage("BREWINGSTAND", "brewingstand.research_page.BREWINGSTAND.2")
        MineTweakerAPI.game.setLocalization("brewingstand.research_page.BREWINGSTAND.2",
                "By brewing a second ingredient into a base potion in the same manner, you can create a potion with a working effect. A third ingredient may be added to make the effect more intense or last longer, or turn the effect harmful. Finally, gunpowder can be added to a potion at any stage to convert it to a splash potion, which can be thrown (or fired using a dispenser) to disperse its effect in a radius. Each brewing step takes 20 seconds. Brewing can create very useful and lifesaving items. A good number of them are useful in combat by aiding the player or weakening enemies while others can save the players life if used quickly, like Fire Resistance or Healing.")
        Research.addPage("BREWINGSTAND", "Minecraft.research_page.BREWINGSTAND.3")
        MineTweakerAPI.game.setLocalization("Minecraft.research_page.BREWINGSTAND.3",
                "Gathering the Blaze Rods and Nether Wart necessary for brewing can prove challenging, but once they are set up, most potion ingredients are fairly plentiful and brewing will be a rewarding task.")
        Arcane.addShaped("BREWINGSTAND", ItemBracketHandler.getItem("minecraft:brewing_stand", 0),
                "aer 20, aqua 20, terra 20, ignis 20, ordo 20, perditio 20",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ringAluminium"),
                        OreBracketHandler.getOre("stickLongBlaze"), OreBracketHandler.getOre("ringAluminium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickAluminium"),
                                OreBracketHandler.getOre("stickLongBlaze"), OreBracketHandler.getOre("stickAluminium")),
                        arrayOf(OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("minecraft:cauldron", 0),
                                OreBracketHandler.getOre("screwAluminium"))))
        Research.addArcanePage("BREWINGSTAND", ItemBracketHandler.getItem("minecraft:brewing_stand", 0))
        Research.addResearch("BEACON", "NEWHORIZONS", "alienis 15, praecantatio 12, auram 9, fames 6", 4, 0, 4,
                ItemBracketHandler.getItem("minecraft:beacon", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.BEACON", "Beacon")
        MineTweakerAPI.game.setLocalization("tc.research_text.BEACON",
                "[MC] Oh, its more magical than a Diamond Block!")
        Research.addPrereq("BEACON", "INFUSION", false)
        Research.setConcealed("BEACON", false)
        Research.addPage("BEACON", "Minecraft.research_page.BEACON")
        MineTweakerAPI.game.setLocalization("Minecraft.research_page.BEACON",
                "A beacon is a unique block that projects a light beam skyward and can provide status effects to players in the vicinity. Beacon blocks can function as light sources, emitting a light level 15. Like other light sources, they will melt snow and ice. When activated, beacon blocks provide two unique functions: An aesthetic landmark beam reaching into the sky, which can be visible from far away. Powers, which give players status effects within a certain range.")
        Infusion.addRecipe("BEACON", ItemBracketHandler.getItem("minecraft:diamond_block", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:glass", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506),
                        ItemBracketHandler.getItem("minecraft:glass", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506),
                        ItemBracketHandler.getItem("minecraft:glass", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506),
                        ItemBracketHandler.getItem("minecraft:glass", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506)),
                "praecantatio 64, alienis 64, lux 64, ordo 64, ignis 64, terra 64",
                ItemBracketHandler.getItem("minecraft:beacon", 0), 6)
        Research.addInfusionPage("BEACON", ItemBracketHandler.getItem("minecraft:beacon", 0))
        Warp.addToResearch("BEACON", 2)
        Research.addResearch("DRAGONEGG", "MAGICBEES", "alienis 15, praecantatio 12, victus 9, bestia 6", 2, 5, 4,
                ItemBracketHandler.getItem("minecraft:dragon_egg", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.DRAGONEGG", "Dragon Egg")
        MineTweakerAPI.game.setLocalization("tc.research_text.DRAGONEGG", "[MC] Dragon Egg duplication")
        Research.addPrereq("DRAGONEGG", "MB_DimensionalSingularity", false)
        Research.addSibling("DRAGONEGG", "INFUSION")
        Research.setConcealed("DRAGONEGG", true)
        Research.addPage("DRAGONEGG", "Minecraft.research_page.DRAGONEGG")
        MineTweakerAPI.game.setLocalization("Minecraft.research_page.DRAGONEGG",
                "Dragon Eggs are dropped by Enderdragons when they are killed. When Right Clicked they teleport a short distance. Now you find a magical way to duplicate this Powerful Item using Draconis Bee Products and The Essence of false Life inside the Infusion Table")
        Infusion.addRecipe("DRAGONEGG", ItemBracketHandler.getItem("MagicBees:miscResources", 7),
                arrayOf(ItemBracketHandler.getItem("MagicBees:miscResources", 6),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 6),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 6),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 6),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 6),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 6),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 6),
                        ItemBracketHandler.getItem("MagicBees:miscResources", 6)),
                "alienis 64, bestia 56, praecantatio 48, victus 48",
                ItemBracketHandler.getItem("minecraft:dragon_egg", 0), 6)
        Research.addInfusionPage("DRAGONEGG", ItemBracketHandler.getItem("minecraft:dragon_egg", 0))
        Warp.addToResearch("DRAGONEGG", 5)

        //TODO Replace ("TConstruct:materials", 26)
        //Research.addResearch("SILKYCRYSTAL", "NEWHORIZONS",
        //        "pannus 15, lucrum 2, instrumentum 9, aer 6, praecantatio 3", -2, -2, 4,
        //        ItemBracketHandler.getItem("TConstruct:materials", 26))

        //TODO Implement similar modifiers or abilities to Tinkers tools into GT? Don't let the TC research be wasted.
        //MineTweakerAPI.game.setLocalization("tc.research_name.SILKYCRYSTAL", "Silky Jewel")
        //MineTweakerAPI.game.setLocalization("tc.research_text.SILKYCRYSTAL", "[TC] Silky magical.")
        //Research.addPrereq("SILKYCRYSTAL", "ENCHANTINGTABLE", false)
        //Research.setConcealed("SILKYCRYSTAL", true)
        //Research.setRound("SILKYCRYSTAL", true)
        //Research.addPage("SILKYCRYSTAL", "TConstruct.research_page.SILKYCRYSTAL")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.SILKYCRYSTAL",
        //        "Silky Cloth is a manufactured item and is a component of the Silky Jewel.<BR><BR>The Silky Jewel is a manufactured item, used to simulate the Silk Touch enchantment in TC tools.")
        //Arcane.addShaped("SILKYCRYSTAL", ItemBracketHandler.getItem("TConstruct:materials", 25),
        //        "aer 30, aqua 25, ignis 15, terra 15, ordo 10, perditio 10",
        //        arrayOf(arrayOf(item8, OreBracketHandler.getOre("foilGold"), item8),
        //                arrayOf(OreBracketHandler.getOre("foilGold"),
        //                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 7),
        //                        OreBracketHandler.getOre("foilGold")),
        //                arrayOf(item8, OreBracketHandler.getOre("foilGold"), item8)))
        //Research.addArcanePage("SILKYCRYSTAL", ItemBracketHandler.getItem("TConstruct:materials", 25))
        //Infusion.addRecipe("SILKYCRYSTAL", ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
        //        arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 25),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
        //                ItemBracketHandler.getItem("TConstruct:materials", 25),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
        //                ItemBracketHandler.getItem("TConstruct:materials", 25),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4)),
        //        "ignis 20, terra 20, ordo 35, praecantatio 35, vitreus 20",
        //        ItemBracketHandler.getItem("TConstruct:materials", 26), 4)
        //Research.addInfusionPage("SILKYCRYSTAL", ItemBracketHandler.getItem("TConstruct:materials", 26))
        //Research.addResearch("LAVACRYSTAL", "NEWHORIZONS", "ignis 15, praecantatio 12, vacuos 9, perditio 6", 2, -2, 4,
        //        ItemBracketHandler.getItem("TConstruct:materials", 7))
        //MineTweakerAPI.game.setLocalization("tc.research_name.LAVACRYSTAL", "Lava Crystal")
        //MineTweakerAPI.game.setLocalization("tc.research_text.LAVACRYSTAL", "[TC] Fiery magical.")
        //Research.addPrereq("LAVACRYSTAL", "ENCHANTINGTABLE", false)
        //Research.setConcealed("LAVACRYSTAL", true)
        //Research.setRound("LAVACRYSTAL", true)
        //Research.addPage("LAVACRYSTAL", "TConstruct.research_page.LAVACRYSTAL")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.LAVACRYSTAL",
        //        "A Lava Crystal is a modifier both for tools and weapons. If added, the tool(s) is/are granted with the power of a furnace, meaning it will auto-smelt blocks when harvested. However, adding this to a weapon will not give it the same effect. Instead, it will set mobs on fire for 3 seconds.<BR>This modifier can be stacked with Luck (Fortune) and is not compatible with Silky (Silk Touch).")
        //Infusion.addRecipe("LAVACRYSTAL", ItemBracketHandler.getItem("minecraft:fire_charge", 0),
        //        arrayOf(ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
        //                ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
        //                ItemBracketHandler.getItem("minecraft:fire_charge", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
        //                ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
        //                ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
        //                ItemBracketHandler.getItem("minecraft:fire_charge", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1)),
        //        "ignis 25, perditio 25, vacuos 20, praecantatio 35",
        //        ItemBracketHandler.getItem("TConstruct:materials", 7), 3)
        //Research.addInfusionPage("LAVACRYSTAL", ItemBracketHandler.getItem("TConstruct:materials", 7))
        //Research.addResearch("BALLOFMOSS", "NEWHORIZONS", "sano 15, terra 12, instrumentum 9", 0, -4, 4,
        //        ItemBracketHandler.getItem("TConstruct:materials", 6))
        //MineTweakerAPI.game.setLocalization("tc.research_name.BALLOFMOSS", "Ball of Moss")
        //MineTweakerAPI.game.setLocalization("tc.research_text.BALLOFMOSS", "[TC] Your Tools repair itselfs.")
        //Research.addPrereq("BALLOFMOSS", "SILKYCRYSTAL", false)
        //Research.addPrereq("BALLOFMOSS", "LAVACRYSTAL", false)
        //Research.setConcealed("BALLOFMOSS", true)
        //Research.setRound("BALLOFMOSS", true)
        //Research.addPage("BALLOFMOSS", "TConstruct.research_page.BALLOFMOSS")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.BALLOFMOSS",
        //        "The Ball of Moss for Tinkers Construct Tools.<BR> Attaching moss to a tool infuses it with life. The tool appers to be capable of regenerating wear and tear.<BR>Effects:<BR> The tool slowly repair itself.<BR>Sunlight speeds up the process.")
        //Infusion.addRecipe("BALLOFMOSS", ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
        //        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2542),
        //                ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 3),
        //                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2542),
        //                ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 3),
        //                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)), "sano 30, terra 25, instrumentum 35",
        //        ItemBracketHandler.getItem("TConstruct:materials", 6), 5)
        //Research.addInfusionPage("BALLOFMOSS", ItemBracketHandler.getItem("TConstruct:materials", 6))
        //Research.addResearch("NECROTICBONE", "NEWHORIZONS", "exanimis 15, mortuus 12, spiritus 9, venenum 6", 0, -2, 4,
        //        ItemBracketHandler.getItem("TConstruct:materials", 8))
        //MineTweakerAPI.game.setLocalization("tc.research_name.NECROTICBONE", "Necrotic Bone")
        //MineTweakerAPI.game.setLocalization("tc.research_text.NECROTICBONE",
        //        "[TC] Evil way to make Wither Skeleton Bones.")
        //Research.addPrereq("NECROTICBONE", "ENTROPICPROCESSING", false)
        //Research.addPrereq("NECROTICBONE", "BALLOFMOSS", false)
        //Research.addPrereq("NECROTICBONE", "SILKYCRYSTAL", false)
        //Research.addPrereq("NECROTICBONE", "LAVACRYSTAL", false)
        //Research.setConcealed("NECROTICBONE", true)
        //Research.setRound("NECROTICBONE", true)
        //Research.addPage("NECROTICBONE", "TConstruct.research_page.NECROTICBONE")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.NECROTICBONE",
        //        "The Necrotic Bone is a special drop gained by killing Wither Skeletons, and can be rarely found in dungeon chests. Now you find a evil way to make it out of Skeleton Bones. Currently, the only use for the Necrotic bone is used to craft a Heart Canister and add a modifier to weapons. The sheer volume of essentia required is too much for the Crucible. You will need a more advanced method of production to create these bones.")
        //Crucible.addRecipe("NECROTICBONE", ItemBracketHandler.getItem("TConstruct:materials", 8),
        //        ItemBracketHandler.getItem("minecraft:bone", 0),
        //        "exanimis 20, mortuus 30, infernus 20, spiritus 20, venenum 20, corpus 5")
        //Research.addCruciblePage("NECROTICBONE", ItemBracketHandler.getItem("TConstruct:materials", 8))
        //Warp.addToResearch("NECROTICBONE", 2)
        //Research.addResearch("REDHEART", "NEWHORIZONS", "ignis 15, praecantatio 12, sano 9, mortuus 6, exanimis 3", 0,
        //        -6, 4, ItemBracketHandler.getItem("TConstruct:heartCanister", 1))
        //MineTweakerAPI.game.setLocalization("tc.research_name.REDHEART", "Red Heart")
        //MineTweakerAPI.game.setLocalization("tc.research_text.REDHEART", "[TC] 10 Hearts are not enough.")
        //Research.addPrereq("REDHEART", "RUNICAUGMENTATION", false)
        //Research.addPrereq("REDHEART", "BALLOFMOSS", false)
        //Research.setConcealed("REDHEART", true)
        //Research.setRound("REDHEART", true)
        //Research.addPage("REDHEART", "TConstruct.research_page.REDHEART.1")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.REDHEART.1",
        //        "The Miniature Red Heart is an item from Tinkers Construct. It is extremely rare and has very little uses, as it is only used to craft the Heart Canister.It is dropped randomly by hostile mobs or crafting via Infusion. The drop rate is 0.2% from regular hostile mobs. The heart may drop anytime a mob dies, the kill does not have to be caused by a player.Its primary use is in crafting the Red Heart Canister, but it can also be eaten to restore 10 life.")
        //Infusion.addRecipe("REDHEART", ItemBracketHandler.getItem("minecraft:golden_apple", 0),
        //        arrayOf(ItemBracketHandler.getItem("TConstruct:jerky", 6),
        //                ItemBracketHandler.getItem("minecraft:apple", 0),
        //                ItemBracketHandler.getItem("TConstruct:jerky", 7),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:jerky", 0),
        //                ItemBracketHandler.getItem("TConstruct:jerky", 1),
        //                ItemBracketHandler.getItem("TConstruct:jerky", 2),
        //                ItemBracketHandler.getItem("TConstruct:jerky", 3),
        //                ItemBracketHandler.getItem("TConstruct:jerky", 4),
        //                ItemBracketHandler.getItem("TConstruct:jerky", 5)),
        //        "exanimis 25, ignis 35, lucrum 35, sano 50, praecantatio 50",
        //        ItemBracketHandler.getItem("TConstruct:heartCanister", 1), 3)
        //Research.addInfusionPage("REDHEART", ItemBracketHandler.getItem("TConstruct:heartCanister", 1))
        //Warp.addToResearch("REDHEARTCANISTER", 1)
        //Research.addResearch("REDHEARTCANISTER", "NEWHORIZONS",
        //        "metallum 15, lucrum 15, sano 12, ignis 9, mortuus 6, exanimis 3", 0, -8, 4,
        //        ItemBracketHandler.getItem("TConstruct:heartCanister", 2))
        //MineTweakerAPI.game.setLocalization("tc.research_name.REDHEARTCANISTER", "Red Heart Canister")
        //MineTweakerAPI.game.setLocalization("tc.research_text.REDHEARTCANISTER", "[TC] Bound in a small box.")
        //Research.addPrereq("REDHEARTCANISTER", "REDHEART", false)
        //Research.setConcealed("REDHEARTCANISTER", true)
        //Research.addPage("REDHEARTCANISTER", "TConstruct.research_page.REDHEARTCANISTER.1")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.REDHEARTCANISTER.1",
        //        "The Red Heart Canister which increases the amount of hearts that the player has. To have an effect the canisters must be equipped in the Armor Tab, in the slot on the right with the symbol that looks like the red heart canister. Up to 10 can be stacked in this slot to allow for a total of 10 extra hearts (or 20 extra health points). These will not appear above the regular health bar like from the Absorption effect, instead once the health bar is full the red hearts will gradually be replaced by orange hearts.")
        //Arcane.addShaped("REDHEARTCANISTER", ItemBracketHandler.getItem("TConstruct:heartCanister", 2),
        //        "aer 50, aqua 50, ignis 50, terra 50, ordo 50, perditio 50",
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 0), null),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:golden_apple", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heartCanister", 1), null), arrayOfNulls(3)))
        //Research.addArcanePage("REDHEARTCANISTER", ItemBracketHandler.getItem("TConstruct:heartCanister", 2))
        //Warp.addToResearch("REDHEARTCANISTER", 2)
        //Research.addResearch("YELLOWHEART", "NEWHORIZONS", "mortuus 15, praecantatio 12, exanimis 9, sano 6, ignis 3",
        //        -2, -7, 4, ItemBracketHandler.getItem("TConstruct:heartCanister", 3))
        //MineTweakerAPI.game.setLocalization("tc.research_name.YELLOWHEART", "Yellow Heart")
        //MineTweakerAPI.game.setLocalization("tc.research_text.YELLOWHEART", "[TC] 20 Hearts are not enough.")
        //Research.addPrereq("YELLOWHEART", "REDHEART", false)
        //Research.setConcealed("YELLOWHEART", true)
        //Research.setRound("YELLOWHEART", true)
        //Research.addPage("YELLOWHEART", "TConstruct.research_page.YELLOWHEART.1")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.YELLOWHEART.1",
        //        "The Miniature Yellow Heart is an item from Tinkers Construct. It can be obtained by killing Boss mobs such as the Wither or King Slime, as well as from killing any Boss Monsters in the Twilight like the Naga, the Lich or the Hydra. Its primary use is in crafting the Yellow Heart Canister, but it can also be eaten to restore 20 life.")
        //Infusion.addRecipe("YELLOWHEART", ItemBracketHandler.getItem("minecraft:golden_apple", 1),
        //        arrayOf(ItemBracketHandler.getItem("TConstruct:heartCanister", 1),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 1),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 1),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 1),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 1),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8)),
        //        "exanimis 50, ignis 75, lucrum 75, sano 100, praecantatio 100",
        //        ItemBracketHandler.getItem("TConstruct:heartCanister", 3), 3)
        //Research.addInfusionPage("YELLOWHEART", ItemBracketHandler.getItem("TConstruct:heartCanister", 3))
        //Warp.addToResearch("YELLOWHEARTCANISTER", 2)
        //Research.addResearch("YELLOWHEARTCANISTER", "NEWHORIZONS",
        //        "metallum 15, lucrum 15, sano 12, praecantatio 9, mortuus 6, exanimis 3", -2, -9, 4,
        //        ItemBracketHandler.getItem("TConstruct:heartCanister", 4))
        //MineTweakerAPI.game.setLocalization("tc.research_name.YELLOWHEARTCANISTER", "Yellow Heart Canister")
        //MineTweakerAPI.game.setLocalization("tc.research_text.YELLOWHEARTCANISTER", "[TC] Bound in a box.")
        //Research.addPrereq("YELLOWHEARTCANISTER", "YELLOWHEART", false)
        //Research.setConcealed("YELLOWHEARTCANISTER", true)
        //Research.addPage("YELLOWHEARTCANISTER", "TConstruct.research_page.YELLOWHEARTCANISTER.1")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.YELLOWHEARTCANISTER.1",
        //        "The Yellow Heart Canister which increases the amount of hearts that the player has. To have an effect the canisters must be equipped in the Armor Tab, in the slot on the right with the symbol that looks like the yellow heart canister Up to 10 can be stacked in this slot to allow for a total of 10 extra hearts (or 20 extra health points). These will not appear above the regular health bar like from the Absorption effect, instead once the health bar is full with orange hearts it will gradually be replaced by yellow hearts.")
        //Arcane.addShaped("YELLOWHEARTCANISTER", ItemBracketHandler.getItem("TConstruct:heartCanister", 4),
        //        "aer 100, aqua 100, ignis 100, terra 100, ordo 100, perditio 100",
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 0),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:golden_apple", 1),
        //                        ItemBracketHandler.getItem("TConstruct:heartCanister", 3),
        //                        ItemBracketHandler.getItem("minecraft:golden_apple", 1)), arrayOfNulls(3)))
        //Research.addArcanePage("YELLOWHEARTCANISTER", ItemBracketHandler.getItem("TConstruct:heartCanister", 4))
        //Warp.addToResearch("YELLOWHEARTCANISTER", 3)
        //Research.addResearch("GREENHEART", "NEWHORIZONS",
        //        "infernus 15, lucrum 12, praecantatio 12, spiritus 9, fames 6, corpus 3", -4, -7, 4,
        //        ItemBracketHandler.getItem("TConstruct:heartCanister", 5))
        //MineTweakerAPI.game.setLocalization("tc.research_name.GREENHEART", "Green Heart")
        //MineTweakerAPI.game.setLocalization("tc.research_text.GREENHEART", "[TC] 30 Hearts are not enough.")
        //Research.addPrereq("GREENHEART", "YELLOWHEART", false)
        //Research.setConcealed("GREENHEART", true)
        //Research.setRound("GREENHEART", true)
        //Research.addPage("GREENHEART", "TConstruct.research_page.GREENHEART.1")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.GREENHEART.1",
        //        "The Miniature Green Heart is an item from Tinkers Construct. It can be made via Infusion. Its primary use is in crafting the Geen Heart Canister, but it can also be eaten to restore 30 life.")
        //Infusion.addRecipe("GREENHEART", ItemBracketHandler.getItem("TConstruct:diamondApple", 0),
        //        arrayOf(ItemBracketHandler.getItem("TConstruct:heartCanister", 3),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 3),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 3),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 3),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 3),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8)),
        //        "exanimis 100, ignis 150, lucrum 150, sano 200, praecantatio 200",
        //        ItemBracketHandler.getItem("TConstruct:heartCanister", 5), 3)
        //Research.addInfusionPage("GREENHEART", ItemBracketHandler.getItem("TConstruct:heartCanister", 5))
        //Warp.addToResearch("GREENHEART", 3)
        //Research.addResearch("GREENHEARTCANISTER", "NEWHORIZONS",
        //        "infernus 15, metallum 15, lucrum 12, sano 12, praecantatio 12, spiritus 9, fames 6, corpus 3", -4, -9,
        //        4, ItemBracketHandler.getItem("TConstruct:heartCanister", 6))
        //MineTweakerAPI.game.setLocalization("tc.research_name.GREENHEARTCANISTER", "Green Heart Canister")
        //MineTweakerAPI.game.setLocalization("tc.research_text.GREENHEARTCANISTER", "[TC] Bound in a big box.")
        //Research.addPrereq("GREENHEARTCANISTER", "GREENHEART", false)
        //Research.setConcealed("GREENHEARTCANISTER", true)
        //Research.addPage("GREENHEARTCANISTER", "TConstruct.research_page.GREENHEARTCANISTER.1")
        //Research.addPage("GREENHEARTCANISTER", "TConstruct.research_page.GREENHEARTCANISTER.2")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.GREENHEARTCANISTER.1",
        //        "The Green Heart Canister which increases the amount of hearts that the player has. To have an effect the canisters must be equipped in the Armor Tab, in the slot on the right with the symbol that looks like the green heart canister. Up to 10 can be stacked in this slot to allow for a total of 10 extra hearts (or 20 extra health points). These will not appear above the regular health bar like from the Absorption effect, instead once the health bar is full with yellow hearts and will gradually be replaced by green hearts.")
        //MineTweakerAPI.game.setLocalization("TConstruct.research_page.GREENHEARTCANISTER.2",
        //        "On top of the Yellow Heart Canisters, a maximum of 10 Red Heart Canisters and 10 Yellow Heart Canisters and 10 green Heart Canisters can be equipped for an additional 10 and 20 health points. This brings maximum health up to 40 hearts (or 80 health points)")
        //Arcane.addShaped("GREENHEARTCANISTER", ItemBracketHandler.getItem("TConstruct:heartCanister", 6),
        //        "aer 200, aqua 200, ignis 200, terra 200, ordo 200, perditio 200",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                ItemBracketHandler.getItem("TConstruct:heartCanister", 0),
        //                ItemBracketHandler.getItem("TConstruct:materials", 8)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:diamondApple", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heartCanister", 5),
        //                        ItemBracketHandler.getItem("TConstruct:diamondApple", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 8),
        //                        ItemBracketHandler.getItem("TConstruct:diamondApple", 0),
        //                        ItemBracketHandler.getItem("TConstruct:materials", 8))))
        //Research.addArcanePage("GREENHEARTCANISTER", ItemBracketHandler.getItem("TConstruct:heartCanister", 6))
        //Warp.addToResearch("GREENHEARTCANISTER", 4)

        Research.addResearch("ENDERCHEST", "NEWHORIZONS",
                "metallum 15, electrum 15, machina 12, alienis 9, lucrum 6, fabrico 3, ", -4, 0, 4,
                ItemBracketHandler.getItem("EnderStorage:enderChest", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENDERCHEST", "Ender Chest")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENDERCHEST", "[EC] Oh, its more magical than a Chest!")
        Research.addPrereq("ENDERCHEST", "INFUSION", false)
        Research.setConcealed("ENDERCHEST", true)
        Research.addPage("ENDERCHEST", "EnderStorage.research_page.ENDERCHEST")
        MineTweakerAPI.game.setLocalization("EnderStorage.research_page.ENDERCHEST",
                "The Ender Chest is a block that allows the player to store 27 items much like a wooden chest however, if two Ender Chests are placed down in different places, the items inside chest A will be in chest B. If the items are taken from either chest, both of the chest will not have that item. While on SMP, players will not share the same storage. This can be used to prevent players form stealing more valuable items, as they cannot access the same a items. This also means two players can store items in the same ender chest.")
        Arcane.addShaped("ENDERCHEST", ItemBracketHandler.getItem("EnderStorage:enderChest", 0),
                "aer 100, aqua 100, ignis 100, terra 100",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17506),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22321),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17506)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32694),
                                ItemBracketHandler.getItem("IronChest:BlockIronChest", 6),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32684)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17506),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22321),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17506))))
        Research.addArcanePage("ENDERCHEST", ItemBracketHandler.getItem("EnderStorage:enderChest", 0))
        Research.addResearch("ENDERTANK", "NEWHORIZONS",
                "metallum 15, electrum 15, machina 12, ignis 9, lucrum 6, sensus 3, ", -4, 2, 4,
                ItemBracketHandler.getItem("EnderStorage:enderChest", 4096))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENDERTANK", "Ender Tank")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENDERTANK", "[EC] Oh, its more magical than a Tank!")
        Research.addPrereq("ENDERTANK", "ENDERCHEST", false)
        Research.setConcealed("ENDERTANK", true)
        Research.addPage("ENDERTANK", "EnderStorage.research_page.ENDERTANK")
        MineTweakerAPI.game.setLocalization("EnderStorage.research_page.ENDERTANK",
                "The Ender Tank offers stationary storage for up to 16 buckets of a single liquid. Like the Ender Chest, it has three wool pads on top which can be manipulated by right-clicking each one with a dye. Tanks with matching colors will share liquids between them, even across dimensions. Additionally, right-clicking the dial with a diamond will set that tank to a private network for that player, change the dial to a diamond color, and show your username in the tooltip. A private Ender Tank will not share any liquids with any public tank, or any private tank from another user, even if the colored pads match.")
        Arcane.addShaped("ENDERTANK", ItemBracketHandler.getItem("EnderStorage:enderChest", 4096),
                "aer 100, aqua 100, ignis 100, terra 100, ordo 100",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22801),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22321),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22801)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32694),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32684)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22801),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22321),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22801))))
        Research.addArcanePage("ENDERTANK", ItemBracketHandler.getItem("EnderStorage:enderChest", 4096))
        Research.addResearch("ENDERPOUCHE", "NEWHORIZONS",
                "lucrum 15, vitreus 15, metallum 12, electrum 9, machina 6, alienis 3, ", -4, 4, 4,
                ItemBracketHandler.getItem("EnderStorage:enderPouch", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENDERPOUCHE", "Ender Pouch")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENDERPOUCHE",
                "[EC] Oh, its more magical than a Backpack!")
        Research.addPrereq("ENDERPOUCHE", "ENDERTANK", false)
        Research.setConcealed("ENDERPOUCHE", true)
        Research.addPage("ENDERPOUCHE", "EnderStorage.research_page.ENDERPOUCHE")
        MineTweakerAPI.game.setLocalization("EnderStorage.research_page.ENDERPOUCHE",
                "The Ender Pouch is a craftable item offering remote access to any Ender Chest via right-clicking while holding the pouch. The Ender Pouch may be initially crafted with the desired color of wool; shift-right clicking on an Ender Chest with an Ender Pouch will synchronize the color code of the pouch to match the color code of the chest, replacing the previous color code of the pouch. When the ender-pouchs GUI is open, it is still possible to move it in your inventory, including moving it into the ender-pouch. Unlike bag-like things from other mods, it is then possible to retrieve it and its contents, by using an ender-chest or another ender-pouch with the same code.")
        Arcane.addShaped("ENDERPOUCHE", ItemBracketHandler.getItem("EnderStorage:enderPouch", 0),
                "aer 100, aqua 100, ignis 100, terra 100, ordo 100, perditio 100",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22321),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32694),
                                ItemBracketHandler.getItem("Backpack:backpack", 200),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32684)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22321),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500))))
        Research.addArcanePage("ENDERPOUCHE", ItemBracketHandler.getItem("EnderStorage:enderPouch", 0))
        Research.addResearch("AUTOENCHANTINGTABLE", "NEWHORIZONS",
                "praecantatio 15, fabrico 12, cognitio 9, potentia 6", 0, 2, 4,
                ItemBracketHandler.getItem("OpenBlocks:autoenchantmenttable", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.AUTOENCHANTINGTABLE", "Auto Enchanting Table")
        MineTweakerAPI.game.setLocalization("tc.research_text.AUTOENCHANTINGTABLE", "[OB] Auto Enchanting nice")
        Research.addPrereq("AUTOENCHANTINGTABLE", "ENCHANTINGTABLE", false)
        Research.setConcealed("AUTOENCHANTINGTABLE", true)
        Research.addPage("AUTOENCHANTINGTABLE", "OpenBlocks.research_page.AUTOENCHANTINGTABLE.1")
        MineTweakerAPI.game.setLocalization("OpenBlocks.research_page.AUTOENCHANTINGTABLE.1",
                "An Auto Enchantment Table can draw the experience from a Tank using the auto drink setting, this is then stored in its internal liquid buffer before usage. Theres also a setting to automatically pull items to work on from an inventory on some side of the enchantment table, as well as resources or books to combine them with. A final setting allows for ejecting the finished item into an inventory at some side of the enchantment table. All of the settings can be set to work with certain sides of the block, this is done by left-clicking the sides of the enchantment table model shown in the individual settings panels.")
        Research.addPage("AUTOENCHANTINGTABLE", "OpenBlocks.research_page.AUTOENCHANTINGTABLE.2")
        MineTweakerAPI.game.setLocalization("OpenBlocks.research_page.AUTOENCHANTINGTABLE.2",
                " The enchantment table model in the panels can also be rotated by holding the right mouse button and dragging the cursor around.")
        Arcane.addShaped("AUTOENCHANTINGTABLE", ItemBracketHandler.getItem("OpenBlocks:autoenchantmenttable", 0),
                "aer 75, aqua 75, ignis 75, terra 75. ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526),
                        ItemBracketHandler.getItem("minecraft:book", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27019),
                                ItemBracketHandler.getItem("minecraft:enchanting_table", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27019)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308),
                                ItemBracketHandler.getItem("minecraft:redstone_block", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17308))))
        Research.addArcanePage("AUTOENCHANTINGTABLE", ItemBracketHandler.getItem("OpenBlocks:autoenchantmenttable", 0))
        Warp.addToResearch("AUTOENCHANTINGTABLE", 1)
        Research.addResearch("LUGGAGE", "NEWHORIZONS",
                "alienis 15, sensus 15, iter 12, praecantatio 9, fabrico 6, lucrum 3", -2, 0, 4,
                ItemBracketHandler.getItem("OpenBlocks:luggage", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.LUGGAGE", "Luggage")
        MineTweakerAPI.game.setLocalization("tc.research_text.LUGGAGE", "[OB] Luggage follow me")
        Research.addPrereq("LUGGAGE", "ENDERCHEST", false)
        Research.setConcealed("LUGGAGE", true)
        Research.addPage("LUGGAGE", "OpenBlocks.research_page.LUGGAGE.1")
        MineTweakerAPI.game.setLocalization("OpenBlocks.research_page.LUGGAGE.1",
                "Luggage is a storage block added by OpenBlocks. The block acts like a regular chest, but it is an entity. After a player places it down by right-clicking with it on the ground, it will start following them around. Right-clicking will open the inventory and it picks up items from the ground. By holding shift and right-clicking the luggage entity, it can be turned back into an item and picked up. When picked up, the luggage item will retain all content thats stored in it.")
        Research.addPage("LUGGAGE", "OpenBlocks.research_page.LUGGAGE.2")
        MineTweakerAPI.game.setLocalization("OpenBlocks.research_page.LUGGAGE.2",
                "Though the entity has 20 health points, it cant be hurt. Beware, as Luggage can still be burned by Lava or destroyed by cactus, though this is only in its item form, in entity form it is immune to fire and lava and even if pushed into the void will fall down next to its owner a moment later. Upon being struck by lightning, having a lightning focused wand from the Thaumcraft mod cast on it, or being blown up by a Charged Creeper, the Luggage will become supercharged, changing its texture, and doubling its inventory space.")
        Arcane.addShaped("LUGGAGE", ItemBracketHandler.getItem("OpenBlocks:luggage", 0),
                "aer 75, aqua 75, ignis 75, terra 75, perditio 75, ordo 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27019),
                        ItemBracketHandler.getItem("Thaumcraft:ItemGolemCore", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27019)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Automagy:crystalBrain", 3),
                                ItemBracketHandler.getItem("Thaumcraft:blockChestHungry", 0),
                                ItemBracketHandler.getItem("Automagy:crystalBrain", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27019),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 2),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27019))))
        Research.addArcanePage("LUGGAGE", ItemBracketHandler.getItem("OpenBlocks:luggage", 0))
        Warp.addToResearch("LUGGAGE", 1)
        Research.addResearch("GHOSTAMULET", "NEWHORIZONS",
                "potentia 21, auram 18, infernus 15, lucrum 12, praecantatio 12, spiritus 9, alienis 6, corpus 3", 4, 2,
                4, ItemBracketHandler.getItem("HardcoreEnderExpansion:ghost_amulet", 1))
        MineTweakerAPI.game.setLocalization("tc.research_name.GHOSTAMULET", "Ghost Amulet")
        MineTweakerAPI.game.setLocalization("tc.research_text.GHOSTAMULET", "[HEE] Ghost Amulet purification.")
        Research.addPrereq("GHOSTAMULET", "ENCHANTINGTABLE", false)
        Research.addPrereq("GHOSTAMULET", "BREWINGSTAND", false)
        Research.setConcealed("GHOSTAMULET", true)
        Research.setRound("GHOSTAMULET", true)
        Research.addPage("GHOSTAMULET", "Hee.research_page.GHOSTAMULET.1")
        MineTweakerAPI.game.setLocalization("Hee.research_page.GHOSTAMULET.1",
                "Getting Dragon Essence from a Dragon is quite hard on a multiplayer server. You have found a way to purify your Ghost Amulet without Dragon essence the magical way. You need some Draconium, Endium, Infernium and other End items and ores which let you resurrect a Dragon and get some Dragon Essence.")
        Infusion.addRecipe("GHOSTAMULET", ItemBracketHandler.getItem("HardcoreEnderExpansion:ghost_amulet", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11975),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:instability_orb", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28770),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:fire_shard", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:igneous_rock", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11975),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:instability_orb", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28770),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:igneous_rock", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:fire_shard", 0),
                        ItemBracketHandler.getItem("HardcoreEnderExpansion:end_powder", 0)),
                "auram 64, potentia 64, vitium 32, vitreus 48, spiritus 32, corpus 16, alienis 24, lucrum 8",
                ItemBracketHandler.getItem("HardcoreEnderExpansion:ghost_amulet", 1), 9)
        Research.addInfusionPage("GHOSTAMULET", ItemBracketHandler.getItem("HardcoreEnderExpansion:ghost_amulet", 1))
        Warp.addToResearch("GHOSTAMULET", 3)
    }
}