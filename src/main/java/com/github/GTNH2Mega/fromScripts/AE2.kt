package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels
import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientAny
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI
import modtweaker2.mods.appeng.handlers.Grind

class AE2 : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockFluix", 0)
        val item2 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartz", 0)
        val item3 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzChiseled", 0)
        val item4 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyCell", 0)
        val item5 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0)
        val item6 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockChest", 0)
        val item7 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDrive", 0)
        val item8 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockController", 0)
        val item9 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 440)
        val item10 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyCompass", 0)
        ItemBracketHandler.getItem("IronChest:BlockIronChest", 6)
        val item11 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0)
        val item12 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 1)
        val item13 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGrowthAccelerator", 0)
        val item14 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockMolecularAssembler", 0)
        val item15 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockInscriber", 0)
        val item16 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCharger", 0)
        val item17 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 7)
        val item18 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 8)
        val item19 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 12)
        val item20 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1)
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 10)
        val item21 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16)
        val item22 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 36)
        val item23 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43)
        val item24 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 44)
        val item25 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 41)
        OreBracketHandler.getOre("gemQuartzite")
        val item26 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 9)
        val ore = OreBracketHandler.getOre("stickEnderEye")
        val ore2 = OreBracketHandler.getOre("plateEnderEye")
        val ore3 = OreBracketHandler.getOre("gemEnderPearl")
        val item27 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzTorch", 0)
        val item28 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockLightDetector", 0)
        val item29 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockTinyTNT", 0)
        val item30 = ItemBracketHandler.getItem("IC2:blockITNT", 0)
        val item31 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 374)
        val ore4 = OreBracketHandler.getOre("cableGt08Aluminium")
        val ore5 = OreBracketHandler.getOre("cableGt01Copper")
        OreBracketHandler.getOre("cableGt04Platinum")
        val item32 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 214)
        val ore6 = OreBracketHandler.getOre("circuitPrimitive")
        val ore7 = OreBracketHandler.getOre("circuitBasic")
        val ore8 = OreBracketHandler.getOre("circuitGood")
        val ore9 = OreBracketHandler.getOre("circuitAdvanced")
        OreBracketHandler.getOre("circuitData")
        val ore10 = OreBracketHandler.getOre("circuitMaster")
        val ore11 = OreBracketHandler.getOre("plateStainlessSteel")
        val item33 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 194)
        val item34 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 380)
        val item35 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 360)
        val item36 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 500)
        val item37 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 480)
        val item38 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 340)
        val item39 = ItemBracketHandler.getItem("appliedenergistics2:item.ToolWirelessTerminal", 0)
        val item40 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 140)
        val item41 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 180)

        //TODO investigate getters with no target field for ("ExtraUtilities:decorativeBlock2", 7)
        //ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 7)
        val item42 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzGlass", 0)
        val item43 = ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzLamp", 0)

        //TODO Replace ("TConstruct:CraftingSlab", 0)
        //val item44 = ItemBracketHandler.getItem("TConstruct:CraftingSlab", 0)

        val item45 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 52)

        //TODO Replace ("TConstruct:GlassPane", 0)
        //val item46 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)

        //TODO investigate getters with no target field for ("TConstruct:GlassBlock", 0)
        //ItemBracketHandler.getItem("TConstruct:GlassBlock", 0)

        val ore12 = OreBracketHandler.getOre("plateGlowstone")
        OreBracketHandler.getOre("dustGlowstone")
        OreBracketHandler.getOre("plateGlass")
        val item47 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.1k", 0)
        val item48 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.4k", 0)
        val item49 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.16k", 0)
        val item50 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.64k", 0)
        val item51 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39)
        val item52 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35)
        val item53 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 36)
        val item54 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 37)
        val item55 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 38)
        val ore13 = OreBracketHandler.getOre("craftingToolSaw")
        val ore14 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val ore15 = OreBracketHandler.getOre("craftingToolSoftHammer")
        val ore16 = OreBracketHandler.getOre("craftingToolHardHammer")
        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 16)
        val item56 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 22)
        val item57 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23)
        val item58 = ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 24)
        val ore17 = OreBracketHandler.getOre("plateSteel")
        val ore18 = OreBracketHandler.getOre("plateAluminium")
        val ore19 = OreBracketHandler.getOre("plateTitanium")
        val ore20 = OreBracketHandler.getOre("plateAnyRubber")
        val item59 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17516)
        val item60 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17522)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17523)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17020)
        OreBracketHandler.getOre("stickSilicon")
        val ore21 = OreBracketHandler.getOre("stickCertusQuartz")
        val ore22 = OreBracketHandler.getOre("stickNetherQuartz")
        val ore23 = OreBracketHandler.getOre("screwQuartzite")
        OreBracketHandler.getOre("screwNetherQuartz")
        val ore24 = OreBracketHandler.getOre("screwCertusQuartz")
        val ore25 = OreBracketHandler.getOre("stickSteelMagnetic")
        OreBracketHandler.getOre("gemCertusQuartz")
        OreBracketHandler.getOre("stickAluminium")
        OreBracketHandler.getOre("stickIron")
        val item61 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606)
        val item62 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32635)
        val item63 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32655)
        Grind.removeRecipe(IngredientAny.INSTANCE)
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item8)
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item16)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuantumRing", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuantumLinkChamber", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSpatialPylon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSpatialIOPort", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockInterface", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCellWorkbench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockIOPort", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCondenser", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyAcceptor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockVibrationChamber", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSecurity", 0))
        ExtremeCrafting.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCreativeEnergyCell", 0))
        MineTweakerAPI.recipes.remove(item40)
        MineTweakerAPI.recipes.remove(item21)
        MineTweakerAPI.recipes.remove(item22)
        MineTweakerAPI.recipes.remove(item17)
        MineTweakerAPI.recipes.remove(item19)
        MineTweakerAPI.recipes.remove(item26)
        MineTweakerAPI.recipes.remove(item24)
        MineTweakerAPI.recipes.remove(item23)
        MineTweakerAPI.recipes.remove(item25)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item41)
        MineTweakerAPI.recipes.remove(item34)
        MineTweakerAPI.recipes.remove(item35)
        MineTweakerAPI.recipes.remove(item37)
        MineTweakerAPI.recipes.remove(item38)
        MineTweakerAPI.recipes.remove(item39)
        MineTweakerAPI.recipes.remove(item42)
        MineTweakerAPI.recipes.remove(item43)
        MineTweakerAPI.recipes.remove(item27)
        MineTweakerAPI.recipes.remove(item28)
        MineTweakerAPI.recipes.remove(item29)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 28))
        MineTweakerAPI.recipes.remove(item45)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 25))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 52))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 27))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 53))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 26))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 29))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 31))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 30))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 42))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 300))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 260))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 320))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 240))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 460))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 180))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 80))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("appliedenergistics2:item.ToolCertusQuartzCuttingKnife", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolCertusQuartzWrench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolMassCannon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolMemoryCard", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolChargedStaff", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolEntropyManipulator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolColorApplicator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolBiometricCard", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemCrystalSeed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemCrystalSeed", 600))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemCrystalSeed", 1200))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("appliedenergistics2:item.ToolNetherQuartzCuttingKnife", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolNetherQuartzWrench", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyChest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyChest", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockWireless", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingMonitor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 420))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 200))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 160))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 400))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 220))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 280))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 80))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 100))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 76))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 56))
        MineTweakerAPI.recipes.remove(item47)
        MineTweakerAPI.recipes.remove(item48)
        MineTweakerAPI.recipes.remove(item49)
        MineTweakerAPI.recipes.remove(item50)
        MineTweakerAPI.recipes.remove(item51)
        MineTweakerAPI.recipes.remove(item52)
        MineTweakerAPI.recipes.remove(item53)
        MineTweakerAPI.recipes.remove(item54)
        MineTweakerAPI.recipes.remove(item55)
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.2Cubed", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.16Cubed", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.128Cubed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemViewCell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 34))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("appliedenergistics2:item.ToolPortableCell", 0))
        MineTweakerAPI.recipes.addShaped(item8,
                arrayOf(arrayOf<IIngredient>(ore19, ore9, ore19), arrayOf<IIngredient>(item58, item, item58),
                        arrayOf<IIngredient>(ore19, ore9, ore19)), null)
        MineTweakerAPI.recipes.addShaped(item4,
                arrayOf(arrayOf<IIngredient>(item59, item18, item59), arrayOf(ore9, item, ore9),
                        arrayOf(item59, ore4, item59)), null)
        MineTweakerAPI.recipes.addShaped(item5,
                arrayOf(arrayOf<IIngredient>(item4, item4, item4), arrayOf(ore10, item58, ore10),
                        arrayOf<IIngredient>(item4, item33, item4)), null)
        MineTweakerAPI.recipes.addShaped(item6, arrayOf(arrayOf<IIngredient>(ore11, ore8, ore11),
                arrayOf<IIngredient>(item21, ItemBracketHandler.getItem("IronChest:BlockIronChest", 4), item21),
                arrayOf<IIngredient>(ore11, ore8, ore11)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDrive", 0),
                arrayOf(arrayOf(ore19, item58, ore19), arrayOf<IIngredient>(item21,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockChest", 0), item21),
                        arrayOf<IIngredient>(ore19, OreBracketHandler.getOre("circuitAdvanced"), ore19)), null)
        MineTweakerAPI.recipes.addShaped(item13, arrayOf(arrayOf(ore19, item42, ore19),
                arrayOf<IIngredient>(item21, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 574), item21),
                arrayOf(ore19, item58, ore19)), null)
        MineTweakerAPI.recipes.addShaped(item11,
                arrayOf(arrayOf(ore19, item56, ore19), arrayOf(ore7, item58, ore7), arrayOf(ore19, item57, ore19)),
                null)
        MineTweakerAPI.recipes.addShaped(item14,
                arrayOf(arrayOf<IIngredient>(ore19, OreBracketHandler.getOre("blockGlass"), ore19),
                        arrayOf<IIngredient>(item24, item32, item23),
                        arrayOf<IIngredient>(ore19, OreBracketHandler.getOre("blockGlass"), ore19)), null)
        MineTweakerAPI.recipes.addShaped(item16,
                arrayOf(arrayOf(ore19, item17, ore19), arrayOf(ore5, item31, ore5), arrayOf(ore19, item17, ore19)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuantumRing", 0),
                arrayOf(arrayOf(ore19, item56, ore19), arrayOf<IIngredient>(item58,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyCell", 0), item21),
                        arrayOf(ore19, item56, ore19)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuantumLinkChamber", 0),
                arrayOf(arrayOf(ore19, item26, ore19), arrayOf<IIngredient>(item26, item42, item26),
                        arrayOf(ore19, item26, ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSpatialPylon", 0),
                arrayOf(arrayOf(ore19, item21, ore19), arrayOf<IIngredient>(item18, item17, item18),
                        arrayOf(ore19, item21, ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSpatialIOPort", 0),
                arrayOf(arrayOf(ore19, ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSpatialPylon", 0),
                        ore19), arrayOf<IIngredient>(item21,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockIOPort", 0), item21),
                        arrayOf(ore19, item58, ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockInterface", 0),
                arrayOf(arrayOf(ore19, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), ore19),
                        arrayOf<IIngredient>(
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 44),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 4),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43)),
                        arrayOf(ore19, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16),
                                ore19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockInterface", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 440)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCellWorkbench", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740),
                        OreBracketHandler.getOre("craftingToolWrench")),
                        arrayOf(OreBracketHandler.getOre("screwTitanium"),
                                ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                                OreBracketHandler.getOre("screwTitanium")), arrayOf(ore19, item57, ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockIOPort", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), ore19,
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDrive", 0),
                                item21, ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDrive", 0)),
                        arrayOf(ore19, item56, ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCondenser", 0),
                arrayOf(arrayOf(ore19, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32643), ore19),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32643),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 14),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32643)),
                        arrayOf(ore19, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32643), ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyAcceptor", 0),
                arrayOf(arrayOf(ore19, item17, ore19), arrayOf(item17, ore12, item17), arrayOf(ore19, item17, ore19)),
                null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockVibrationChamber", 0),
                arrayOf(arrayOf<IIngredient>(ore19, OreBracketHandler.getOre("screwTitanium"), ore19),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 264),
                                OreBracketHandler.getOre("craftingToolWrench")),
                        arrayOf(ore19, ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyAcceptor", 0),
                                ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSecurity", 0),
                arrayOf(arrayOf(ore19, ItemBracketHandler.getItem("appliedenergistics2:tile.BlockChest", 0), ore19),
                        arrayOf<IIngredient>(item21, item54, item21), arrayOf(ore19, item58, ore19)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.SkyStoneStairBlock", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(null, null,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 0)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 0))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.SkyStoneBlockStairBlock", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(null, null,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 1)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 1),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 1)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 1),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 1),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 1))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.SkyStoneBrickStairBlock", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(null, null,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 2)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 2),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 2),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 2),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 2))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.SkyStoneSmallBrickStairBlock", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(null, null,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 3)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 3),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 3)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 3),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 3),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 3))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.FluixStairBlock", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(null, null,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockFluix", 0)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockFluix", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockFluix", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockFluix", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockFluix", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockFluix", 0))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.QuartzStairBlock", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(null, null,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartz", 0)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartz", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartz", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartz", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartz", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartz", 0))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.ChiseledQuartzStairBlock", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(null, null,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzChiseled", 0)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzChiseled", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzChiseled", 0)),
                        arrayOf<IIngredient?>(
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzChiseled", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzChiseled", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzChiseled", 0))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:tile.QuartzPillarStairBlock", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(null, null,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzPillar", 0)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzPillar", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzPillar", 0)),
                        arrayOf<IIngredient?>(
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzPillar", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzPillar", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzPillar", 0))), null)
        MineTweakerAPI.recipes.addShaped(item21.amount(2),
                arrayOf(arrayOf(ore21, item18, ore21), arrayOf<IIngredient>(item40, item40, item40),
                        arrayOf(ore21, item18, ore21)), null)
        MineTweakerAPI.recipes.addShaped(item22.amount(3),
                arrayOf(arrayOf<IIngredient?>(ore20, ore13, ore20), arrayOf<IIngredient?>(item21, item21, item21),
                        arrayOf<IIngredient?>(ore20, null, ore20)), null)
        MineTweakerAPI.recipes.addShaped(item22.amount(3),
                arrayOf(arrayOf<IIngredient?>(ore20, null, ore20), arrayOf<IIngredient?>(item21, item21, item21),
                        arrayOf<IIngredient?>(ore20, ore13, ore20)), null)
        MineTweakerAPI.recipes.addShaped(item24.amount(2),
                arrayOf(arrayOf(ore22, item56, ore22), arrayOf<IIngredient>(item56, item19, item56),
                        arrayOf(ore22, item56, ore22)), null)
        MineTweakerAPI.recipes.addShaped(item23.amount(2),
                arrayOf(arrayOf(ore21, item56, ore21), arrayOf<IIngredient>(item56, item19, item56),
                        arrayOf(ore21, item56, ore21)), null)
        MineTweakerAPI.recipes.addShaped(item26,
                arrayOf(arrayOf(item19, ore2, item19), arrayOf<IIngredient>(ore2, ore3, ore2),
                        arrayOf(item19, ore2, item19)), null)
        MineTweakerAPI.recipes.addShaped(item26,
                arrayOf(arrayOf(item17, ore2, item17), arrayOf<IIngredient>(ore2, ore3, ore2),
                        arrayOf(item17, ore2, item17)), null)
        MineTweakerAPI.recipes.addShaped(item25,
                arrayOf(arrayOf<IIngredient?>(item40, item26, item40), arrayOf<IIngredient?>(null, ore, null),
                        arrayOf(item59, ore9, item59)), null)

        //TODO Replace ("TConstruct:GlassPane", 0) in item46
        //MineTweakerAPI.recipes.addShaped(item10,
        //        arrayOf(arrayOf(ore14, item46, ore24), arrayOf<IIngredient>(ore17, ore25, ore17),
        //                arrayOf<IIngredient>(ore24, ore17, ore16)), null)
        //MineTweakerAPI.recipes.addShaped(item10,
        //        arrayOf(arrayOf(ore16, item46, ore24), arrayOf<IIngredient>(ore17, ore25, ore17),
        //                arrayOf<IIngredient>(ore24, ore17, ore14)), null)

        MineTweakerAPI.recipes.addShaped(item41, arrayOf(arrayOf<IIngredient>(ore14, ore19, ore16),
                arrayOf(ore24, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740), ore24),
                arrayOf<IIngredient>(ore12, OreBracketHandler.getOre("plateRedAlloy"), ore12)), null)
        MineTweakerAPI.recipes.addShaped(item34,
                arrayOf(arrayOf<IIngredient>(ore22, ore23, ore22), arrayOf(item41, ore8, item59),
                        arrayOf<IIngredient>(ore22, ore14, ore22)), null)
        MineTweakerAPI.recipes.addShaped(item34,
                arrayOf(arrayOf<IIngredient>(ore22, ore14, ore22), arrayOf(item41, ore8, item59),
                        arrayOf<IIngredient>(ore22, ore23, ore22)), null)

        //TODO Replace ("TConstruct:CraftingSlab", 0) in item44
        //MineTweakerAPI.recipes.addShaped(item35, arrayOf(arrayOf(ore14, item34, ore15), arrayOf(ore24, item44, ore24),
        //        arrayOf<IIngredient>(item60, item58, item60)), null)

        MineTweakerAPI.recipes.addShaped(item36, arrayOf(arrayOf(ore14, item35, ore15), arrayOf<IIngredient>(item62,
                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0), item62),
                arrayOf<IIngredient>(item61, item63, item61)), null)
        MineTweakerAPI.recipes.addShaped(item37, arrayOf(arrayOf(ore14, item34, ore15), arrayOf(ore24, item9, ore24),
                arrayOf<IIngredient>(item60, item58, item60)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 420),
                arrayOf(arrayOf(ore14, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 400),
                        ore16),
                        arrayOf(ore24, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43),
                                ore24), arrayOf<IIngredient>(item60,
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 44), item60)), null)
        MineTweakerAPI.recipes.addShaped(item38, arrayOf(arrayOf(ore14, item34, ore15), arrayOf(ore24, item45, ore24),
                arrayOf<IIngredient>(item60, item58, item60)), null)
        MineTweakerAPI.recipes.addShaped(item39,
                arrayOf(arrayOf<IIngredient>(item25, item34, item25), arrayOf<IIngredient>(item60, item58, item60),
                        arrayOf<IIngredient>(item60, item5, item60)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 28),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("platePlatinum"), ore19, null),
                        arrayOf(OreBracketHandler.getOre("plateRedAlloy"), item57, ore19),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("platePlatinum"), ore19, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 25),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateGold"), ore18, null),
                        arrayOf(OreBracketHandler.getOre("plateRedAlloy"), item57, ore18),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateGold"), ore18, null)), null)
        MineTweakerAPI.recipes.addShaped(item45,
                arrayOf(arrayOf(item42, OreBracketHandler.getOre("plateGlowstone"), item42),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateGlowstone"),
                                OreBracketHandler.getOre("itemCertusQuartz"),
                                OreBracketHandler.getOre("plateGlowstone")), arrayOf<IIngredient>(ore18, ore18, ore18)),
                null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 27),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 25),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 54),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 28),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 37),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 37),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 440)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 53),
                arrayOf(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 25),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35),
                        OreBracketHandler.getOre("craftingWorkBench")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 26),
                arrayOf(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 25),
                        OreBracketHandler.getOre("craftingRedstoneTorch"),
                        OreBracketHandler.getOre("craftingRedstoneTorch"), item57), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 29),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 28),
                        item58, item56, item57), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 31),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 28),
                        ItemBracketHandler.getItem("IC2:upgradeModule", 5),
                        ItemBracketHandler.getItem("IC2:upgradeModule", 5), item57), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 30),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 28),
                        item58, item56, item17), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 42),
                arrayOf(arrayOf(item18, OreBracketHandler.getOre("gemCertusQuartz"),
                        OreBracketHandler.getOre("plateEnderPearl")), arrayOf<IIngredient?>(ore19, ore18, ore19),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 300),
                arrayOf(arrayOf(ore14,
                        ItemBracketHandler.getItem("appliedenergistics2:item.ToolCertusQuartzPickaxe", 0), ore16),
                        arrayOf(ore24, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 44),
                                ore24),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemFluix"), OreBracketHandler.getOre("gemFluix"),
                                OreBracketHandler.getOre("gemFluix"))), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotIron")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotCopper")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(3),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotBronze")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotTin")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotIron")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(4),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotSteel")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(4),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotAluminium")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotLead")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotNickel")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotSilver")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(3),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotBrass")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 120).amount(3),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolKnife"),
                        OreBracketHandler.getOre("ingotInvar")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 260),
                arrayOf(arrayOf<IIngredient>(ore14, ore19, ore16),
                        arrayOf(ore24, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43),
                                ore24),
                        arrayOf<IIngredient>(item60, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                                item60)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 320),
                arrayOf(arrayOf<IIngredient>(ore14, OreBracketHandler.getOre("blockHopper"), ore16),
                        arrayOf(ore24, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43),
                                ore24), arrayOf<IIngredient>(item17, item17, item17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 240),
                arrayOf(arrayOf<IIngredient>(ore14, ore19, ore16),
                        arrayOf(ore24, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 44),
                                ore24),
                        arrayOf<IIngredient>(item60, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                                item60)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 460),
                arrayOf(arrayOf<IIngredient>(ore14, ore19, ore16), arrayOf(ore24, item58, ore24),
                        arrayOf<IIngredient>(item17, item17, item17)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ToolCertusQuartzWrench", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                        OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1)),
                        arrayOf<IIngredient?>(
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1)),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1), null)),
                null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ToolNetherQuartzWrench", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("gemQuartz"),
                        OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("gemQuartz"),
                                OreBracketHandler.getOre("gemQuartz"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("gemQuartz"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ToolMassCannon", 0),
                arrayOf(arrayOf(ore19, ore19,
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43)),
                        arrayOf<IIngredient?>(
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 38),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0), null),
                        arrayOf<IIngredient?>(ore19, null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ToolMemoryCard", 0),
                arrayOf(arrayOf(item57, OreBracketHandler.getOre("circuitData"), ore19),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateGold"),
                                OreBracketHandler.getOre("plateRedAlloy"), OreBracketHandler.getOre("plateGold")),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ToolChargedStaff", 0),
                arrayOf(arrayOf<IIngredient?>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1), null),
                        arrayOf<IIngredient?>(
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                                ItemBracketHandler.getItem("Thaumcraft:FocusShock", 0), null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickThaumium"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ToolEntropyManipulator", 0),
                arrayOf(arrayOf<IIngredient?>(item17, item56, null), arrayOf<IIngredient?>(item58,
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyCell", 0), null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickThaumium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ToolColorApplicator", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("wireGt01Aluminium"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 43),
                        OreBracketHandler.getOre("wireGt01Aluminium")), arrayOf<IIngredient?>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 36),
                        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyCell", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 36)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickSteel"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ToolBiometricCard", 0),
                arrayOf(arrayOf(item58, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740), ore19),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateGold"),
                                OreBracketHandler.getOre("plateRedAlloy"), OreBracketHandler.getOre("plateGold")),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockWireless", 0),
                arrayOf(arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 41), null),
                        arrayOf(OreBracketHandler.getOre("screwTitanium"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23),
                                OreBracketHandler.getOre("screwTitanium")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 400),
                arrayOf(arrayOf<IIngredient>(ore14, OreBracketHandler.getOre("itemIlluminatedPanel"), ore16),
                        arrayOf(ore24, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 280),
                                ore24), arrayOf<IIngredient>(item60, item60, item60)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 220),
                arrayOf(arrayOf<IIngredient>(ore14, OreBracketHandler.getOre("chestWood"), ore16),
                        arrayOf(ore24, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 440),
                                ore24),
                        arrayOf<IIngredient>(item60, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                                item60)), null)
        MineTweakerAPI.recipes.addShaped(item47, arrayOf(arrayOf(ore16, item59, ore24), arrayOf(ore11, item52, ore11),
                arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        MineTweakerAPI.recipes.addShaped(item47, arrayOf(arrayOf(ore14, item59, ore24), arrayOf(ore11, item52, ore11),
                arrayOf<IIngredient>(ore24, ore18, ore16)), null)
        MineTweakerAPI.recipes.addShaped(item48, arrayOf(arrayOf(ore16, item59, ore24), arrayOf(ore11, item53, ore11),
                arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        MineTweakerAPI.recipes.addShaped(item48, arrayOf(arrayOf(ore14, item59, ore24), arrayOf(ore11, item53, ore11),
                arrayOf<IIngredient>(ore24, ore18, ore16)), null)
        MineTweakerAPI.recipes.addShaped(item49, arrayOf(arrayOf(ore16, item59, ore24), arrayOf(ore11, item54, ore11),
                arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        MineTweakerAPI.recipes.addShaped(item49, arrayOf(arrayOf(ore14, item59, ore24), arrayOf(ore11, item54, ore11),
                arrayOf<IIngredient>(ore24, ore18, ore16)), null)
        MineTweakerAPI.recipes.addShaped(item50, arrayOf(arrayOf(ore16, item59, ore24), arrayOf(ore11, item55, ore11),
                arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        MineTweakerAPI.recipes.addShaped(item50, arrayOf(arrayOf(ore14, item59, ore24), arrayOf(ore11, item55, ore11),
                arrayOf<IIngredient>(ore24, ore18, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemViewCell", 0),
                arrayOf(arrayOf(ore14, item59, ore24),
                        arrayOf<IIngredient>(ore11, OreBracketHandler.getOre("gemCertusQuartz"), ore11),
                        arrayOf<IIngredient>(ore24, ore18, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemViewCell", 0),
                arrayOf(arrayOf(ore16, item59, ore24),
                        arrayOf<IIngredient>(ore11, OreBracketHandler.getOre("gemCertusQuartz"), ore11),
                        arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("appliedenergistics2:item.ItemViewCell", 0),
                arrayOf(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39),
                        OreBracketHandler.getOre("gemCertusQuartz")), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.1k", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.4k", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 36)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.16k", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39),
                        item54), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.64k", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 38)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.2Cubed", 0),
                arrayOf(arrayOf(ore16, item59, ore24),
                        arrayOf(ore11, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32),
                                ore11), arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.2Cubed", 0),
                arrayOf(arrayOf(ore14, item59, ore24),
                        arrayOf(ore11, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32),
                                ore11), arrayOf<IIngredient>(ore24, ore18, ore16)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.2Cubed", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.16Cubed", 0),
                arrayOf(arrayOf(ore16, item59, ore24),
                        arrayOf(ore11, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33),
                                ore11), arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.16Cubed", 0),
                arrayOf(arrayOf(ore14, item59, ore24),
                        arrayOf(ore11, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33),
                                ore11), arrayOf<IIngredient>(ore24, ore18, ore16)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.16Cubed", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.128Cubed", 0),
                arrayOf(arrayOf(ore16, item59, ore24),
                        arrayOf(ore11, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 34),
                                ore11), arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.128Cubed", 0),
                arrayOf(arrayOf(ore14, item59, ore24),
                        arrayOf(ore11, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 34),
                                ore11), arrayOf<IIngredient>(ore24, ore18, ore16)), null)
        MineTweakerAPI.recipes.addShapeless(
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemSpatialStorageCell.128Cubed", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 39),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 34)), null)

        //TODO Replace ("TConstruct:GlassPane", 0) in item46
        //MineTweakerAPI.recipes.addShaped(item51, arrayOf(arrayOf(ore16, item59, ore24), arrayOf(ore11, item46, ore11),
        //        arrayOf<IIngredient>(ore24, ore18, ore14)), null)
        //MineTweakerAPI.recipes.addShaped(item51, arrayOf(arrayOf(ore14, item59, ore24), arrayOf(ore11, item46, ore11),
        //        arrayOf<IIngredient>(ore24, ore18, ore16)), null)

        MineTweakerAPI.recipes.addShaped(item52,
                arrayOf(arrayOf(ore6, ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0), ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.LogicProcessorItemGoldCore", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0)),
                        arrayOf(ore6, ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0), ore6)),
                null)
        MineTweakerAPI.recipes.addShaped(item53, arrayOf(arrayOf(ore7, item52, ore7), arrayOf<IIngredient>(item52,
                ItemBracketHandler.getItem("dreamcraft:item.LogicProcessorItemGoldCore", 0), item52),
                arrayOf(ore7, item52, ore7)), null)
        MineTweakerAPI.recipes.addShaped(item54, arrayOf(arrayOf(ore8, item53, ore8), arrayOf<IIngredient>(item53,
                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemDiamondCore", 0), item53),
                arrayOf(ore8, item53, ore8)), null)
        MineTweakerAPI.recipes.addShaped(item55, arrayOf(arrayOf(ore9, item54, ore9), arrayOf<IIngredient>(item54,
                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemDiamondCore", 0), item54),
                arrayOf(ore9, item54, ore9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateGlowstone"), item26,
                        OreBracketHandler.getOre("plateGlowstone")), arrayOf<IIngredient>(item26,
                        ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorSpatialPulsatingCore", 0),
                        item26), arrayOf(OreBracketHandler.getOre("plateGlowstone"), item26,
                        OreBracketHandler.getOre("plateGlowstone"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateEnderPearl"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32),
                        OreBracketHandler.getOre("plateEnderPearl")), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32),
                        ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorSpatialPulsatingCore", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32)),
                        arrayOf(OreBracketHandler.getOre("plateEnderPearl"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 32),
                                OreBracketHandler.getOre("plateEnderPearl"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 34),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateEnderEye"),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33),
                        OreBracketHandler.getOre("plateEnderEye")), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33),
                        ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorSpatialPulsatingCore", 0),
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33)),
                        arrayOf(OreBracketHandler.getOre("plateEnderEye"),
                                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 33),
                                OreBracketHandler.getOre("plateEnderEye"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("appliedenergistics2:item.ToolPortableCell", 0),
                arrayOf(arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("appliedenergistics2:item.ItemBasicStorageCell.1k", 0), null),
                        arrayOf(OreBracketHandler.getOre("screwTitanium"),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockChest", 0),
                                OreBracketHandler.getOre("screwTitanium")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockEnergyCell", 0),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(item15, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateTitanium"),
                OreBracketHandler.getOre("gemFluix"), OreBracketHandler.getOre("plateTitanium")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 604),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0)),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateTitanium"), OreBracketHandler.getOre("gemFluix"),
                        OreBracketHandler.getOre("plateTitanium"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ToolCertusQuartzCuttingKnife", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("screwTitanium"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemCertusQuartz"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateCertusQuartz"),
                                OreBracketHandler.getOre("gemCertusQuartz"),
                                OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("appliedenergistics2:item.ToolNetherQuartzCuttingKnife", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("screwTitanium"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemNetherQuartz"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNetherQuartz"),
                                OreBracketHandler.getOre("gemNetherQuartz"),
                                OreBracketHandler.getOre("craftingToolFile"))), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCreativeEnergyCell", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ingotInfinity"),
                        OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"),
                        OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"),
                        OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"),
                        OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity")),
                        arrayOf(OreBracketHandler.getOre("ingotInfinity"),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                OreBracketHandler.getOre("ingotInfinity")),
                        arrayOf(OreBracketHandler.getOre("ingotInfinity"),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                OreBracketHandler.getOre("ingotInfinity")),
                        arrayOf(OreBracketHandler.getOre("ingotInfinity"),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                OreBracketHandler.getOre("ingotInfinity")),
                        arrayOf(OreBracketHandler.getOre("ingotInfinity"),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                OreBracketHandler.getOre("blockCosmicNeutronium"),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                OreBracketHandler.getOre("ingotInfinity")),
                        arrayOf(OreBracketHandler.getOre("ingotInfinity"),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                OreBracketHandler.getOre("ingotInfinity")),
                        arrayOf(OreBracketHandler.getOre("ingotInfinity"),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                OreBracketHandler.getOre("ingotInfinity")),
                        arrayOf(OreBracketHandler.getOre("ingotInfinity"),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.EngineeringProcessorItemAdvEmeraldCore", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockDenseEnergyCell", 0),
                                OreBracketHandler.getOre("ingotInfinity")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ingotInfinity"),
                                OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"),
                                OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"),
                                OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"),
                                OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"))))
        AlloySmelter.addRecipe(item42.amount(4), ItemBracketHandler.getItem("minecraft:glass", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2516).amount(4), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzLamp", 0), item42,
                ItemBracketHandler.getItem("minecraft:glowstone_dust", 0).amount(8), 200, VoltageLevels.LV)

        //TODO replace ("ExtraUtilities:decorativeBlock2", 7)
        //Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockQuartzLamp", 0),
        //        ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 7),
        //        ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 8).amount(2), 200, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyChest", 0),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 0).amount(8),
                ItemBracketHandler.getItem("minecraft:chest", 0), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyChest", 1),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockSkyStone", 1).amount(8),
                ItemBracketHandler.getItem("minecraft:chest", 0), 200, VoltageLevels.LV)
        Assembler.addRecipe(item12, item11, item58.amount(2), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 0),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 35), 400,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 1),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 36), 400,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 2),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 37), 400,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingStorage", 3),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 38), 400,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingMonitor", 0),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCraftingUnit", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 400), 400, VoltageLevels.MV)
        Assembler.addRecipe(item27, item20, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23019), 200, VoltageLevels.LV)
        Assembler.addRecipe(item28, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8516),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23019), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 200),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 180),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 160),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 180),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 180),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 200),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 180),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 160),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 280),
                ItemBracketHandler.getItem("minecraft:redstone_torch", 0),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 23), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 80),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 280),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16).amount(2), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 80),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 100),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 100),
                ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 80),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 100, VoltageLevels.ULV)
        Assembler.addRecipe(item21.amount(3), item40.amount(3), item18.amount(2), 100, VoltageLevels.MV)
        Assembler.addRecipe(item22, item21, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1633),
                LiquidBracketHandler.getLiquid("molten.silicone").withAmount(36), 150, VoltageLevels.MV)
        Assembler.addRecipe(item22, item21, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1633),
                LiquidBracketHandler.getLiquid("molten.styrenebutadienerubber").withAmount(36), 150, VoltageLevels.MV)
        Assembler.addRecipe(item22, item21, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1649),
                LiquidBracketHandler.getLiquid("molten.silicone").withAmount(36), 150, VoltageLevels.MV)
        Assembler.addRecipe(item22, item21, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1649),
                LiquidBracketHandler.getLiquid("molten.styrenebutadienerubber").withAmount(36), 150, VoltageLevels.MV)
        Assembler.addRecipe(item22, item21, ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 24).amount(0),
                LiquidBracketHandler.getLiquid("molten.silicone").withAmount(72), 150, VoltageLevels.MV)
        Assembler.addRecipe(item22, item21, ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 24).amount(0),
                LiquidBracketHandler.getLiquid("molten.styrenebutadienerubber").withAmount(108), 150, VoltageLevels.MV)
        Assembler.addRecipe(item22, item21, ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 24).amount(0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(144), 150, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 76), item22.amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17811),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 56), item22,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17526),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 150, VoltageLevels.MV)
        Autoclave.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(200), 7000, 2000, 24)
        Autoclave.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1),
                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(200), 9000, 1500, 24)
        BlastFurnace.addRecipe(arrayOf(item42.amount(4)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glass", 0).amount(4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2516).amount(4)), 200, VoltageLevels.MV, 1000)
        Centrifuge.addRecipe(arrayOf(item29, item29), item30, 0, 600)
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2516),
                ItemBracketHandler.getItem("minecraft:redstone", 0), 600)
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1).amount(3),
                null, ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2017),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 900, VoltageLevels.LV)
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 1).amount(3),
                null, ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2017),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(1000), 700, VoltageLevels.LV)
        Pulverizer.addRecipe(arrayOf(item18.amount(4)),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockFluix", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 140),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23516).amount(2), 80, VoltageLevels.MV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 140),
                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzRod", 0), 80, VoltageLevels.MV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 140),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23522).amount(8), 80, VoltageLevels.MV)
        Wiremill.addRecipe(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 140),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23523).amount(4), 80, VoltageLevels.MV)
        NEI.overrideName(item51, "Universal Storage Housing")
    }
}