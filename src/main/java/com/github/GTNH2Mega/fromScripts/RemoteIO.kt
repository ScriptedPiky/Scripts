package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.HV
import java.lang.Runnable
import minetweaker.api.item.IItemStack
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.data.IData
import minetweaker.expand.ExpandString
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandAnyDict
import minetweaker.mods.nei.NEI
import minetweaker.MineTweakerAPI
import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.api.oredict.IOreDictEntry
import minetweaker.expand.ExpandLong
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import gttweaker.mods.gregtech.machines.ChemicalReactor
import java.util.HashMap

class RemoteIO : Runnable {
    override fun run() {
        val iItemStack = ItemBracketHandler.getItem("RIO:tile.machine", 0)
        val iItemStack2 = ItemBracketHandler.getItem("RIO:tile.machine", 1)
        val iItemStack3 = ItemBracketHandler.getItem("RIO:tile.remote_interface", 0)
        val iItemStack5 = ItemBracketHandler.getItem("RIO:item.wireless_transmitter", 0)
        val iItemStack6 = ItemBracketHandler.getItem("RIO:item.io_tool", 0)
        val iItemStack7 = ItemBracketHandler.getItem("RIO:skylight", 0)
        val iItemStack9 = ItemBracketHandler.getItem("RIO:item.chip.location", 0)
        val iItemStack11 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)
        val iOreDictEntry3 = OreBracketHandler.getOre("plateObsidian")
        val iItemStack15 = ItemBracketHandler.getItem("IC2:itemRecipePart", 0)
        val iItemStack17 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 9275)
        val iItemStack19 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32693)
        val iItemStack21 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32683)
        val iOreDictEntry9 = OreBracketHandler.getOre("pipeMediumTitanium")
        val iItemStack23 = ItemBracketHandler.getItem("gregtech:gt.blockcasings", 3)
        val iItemStack24 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32613)
        val iOreDictEntry10 = OreBracketHandler.getOre("plateTitanium")
        val iOreDictEntry12 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val iItemStack25 = ItemBracketHandler.getItem("RIO:item.blank_plate", 0)
        val iOreDictEntry15 = OreBracketHandler.getOre("screwTitanium")
        val iItemStack31 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1541)
        MineTweakerAPI.recipes.remove(iItemStack3)
        MineTweakerAPI.recipes.remove(iItemStack)
        MineTweakerAPI.recipes.remove(iItemStack2)
        MineTweakerAPI.recipes.remove(iItemStack7)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:intelligentWorkbench", 0))
        MineTweakerAPI.recipes.remove(iItemStack5)
        MineTweakerAPI.recipes.remove(iItemStack9)
        MineTweakerAPI.recipes.remove(iItemStack6)
        MineTweakerAPI.recipes.remove(iItemStack25)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.chip.transfer", 32767))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.chip.upgrade", 32767))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.pda", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.remoteAccessor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.linker", 0))
        MineTweakerAPI.recipes.addShaped(iItemStack3.amount(2), arrayOf(arrayOf<IIngredient>(iItemStack17, iItemStack19, iItemStack17), arrayOf(OreBracketHandler.getOre("circuitElite"), iItemStack31, OreBracketHandler.getOre("circuitElite")), arrayOf<IIngredient>(iItemStack17, iItemStack21, iItemStack17)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("RIO:tile.remote_interface", 0), arrayOf<IIngredient>(ItemBracketHandler.getItem("RandomThings:playerinterface", 0)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack, arrayOf(arrayOf(iItemStack24, iOreDictEntry9, iItemStack24), arrayOf(iOreDictEntry9, iItemStack23, iOreDictEntry9), arrayOf(iItemStack24, iOreDictEntry9, iItemStack24)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack2, arrayOf(arrayOf<IIngredient>(iItemStack15, iItemStack15, iItemStack15), arrayOf<IIngredient>(iItemStack24, iItemStack23, iItemStack24), arrayOf<IIngredient>(iOreDictEntry10, iOreDictEntry10, iOreDictEntry10)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack7, arrayOf(arrayOf(iOreDictEntry3, iItemStack11, iOreDictEntry3), arrayOf<IIngredient>(iItemStack11, ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 21), iItemStack11), arrayOf(iOreDictEntry3, iItemStack11, iOreDictEntry3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RIO:intelligentWorkbench", 0), arrayOf(arrayOf<IIngredient?>(null, iItemStack9, null), arrayOf(iOreDictEntry15, ItemBracketHandler.getItem("gregtech:gt.blockcasings4", 0), iOreDictEntry15), arrayOf<IIngredient?>(null, iOreDictEntry12, null)), null)
        MineTweakerAPI.recipes.addShaped(iItemStack6, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateTungstenSteel"), OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateTungstenSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("screwTungstenSteel"), OreBracketHandler.getOre("stickTungstenSteel"), OreBracketHandler.getOre("screwTungstenSteel")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("stickTungstenSteel"), OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RIO:item.linker", 0), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("boltElectrum"), OreBracketHandler.getOre("screwIron")), arrayOf<IIngredient>(OreBracketHandler.getOre("boltElectrum"), OreBracketHandler.getOre("lensEnderEye"), OreBracketHandler.getOre("ringSteel")), arrayOf(OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("ringSteel"), iItemStack6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RIO:item.remoteAccessor", 0), arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingTungstenSteel"), ItemBracketHandler.getItem("RIO:tile.remote_interface", 0), OreBracketHandler.getOre("itemCasingTungstenSteel")), arrayOf<IIngredient>(ItemBracketHandler.getItem("RIO:item.linker", 0), ItemBracketHandler.getItem("RIO:item.chip.location", 0), ItemBracketHandler.getItem("RIO:item.linker", 0)), arrayOf(OreBracketHandler.getOre("screwTungstenSteel"), ItemBracketHandler.getItem("RIO:item.wireless_transmitter", 0), OreBracketHandler.getOre("screwTungstenSteel"))), null)
        val iItemStack32 = ItemBracketHandler.getItem("RIO:item.pda", 0)
        val arrarriIngredient:  Array<Array<IIngredient?>?> = arrayOfNulls(3)
        arrarriIngredient[0] = arrayOf(OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("itemCasingAluminium"), OreBracketHandler.getOre("screwIron"))
        arrarriIngredient[1] = arrayOf(OreBracketHandler.getOre("circuitBasic"), ItemBracketHandler.getItem("dreamcraft:item.Display", 0), OreBracketHandler.getOre("circuitBasic"))
        val arriIngredient = arrayOfNulls<IIngredient>(3)
        arriIngredient[0] = OreBracketHandler.getOre("itemCasingAluminium")
        val iItemStack33 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32518)
        val hashMap = HashMap<String, IData>()
        hashMap["GT.ItemCharge"] = ExpandLong.asData(100000L)
        arriIngredient[1] = iItemStack33.withTag(ExpandAnyDict.asData(hashMap))
        arriIngredient[2] = OreBracketHandler.getOre("itemCasingAluminium")
        arrarriIngredient[2] = arriIngredient
        MineTweakerAPI.recipes.addShaped(iItemStack32, arrarriIngredient, null)
        Assembler.addRecipe(iItemStack5, ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 0), ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 1), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack25, ItemBracketHandler.getItem("TConstruct:blankPattern", 1), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 200, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(iItemStack9, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085).amount(2), ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089).amount(2), LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 0), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("EnderStorage:enderChest", 0), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 1), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("EnderStorage:enderChest", 4096), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 2), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("Thaumcraft:blockJar", 0).amount(2), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 10), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1546).amount(2), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 12), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("ExtraUtilities:extractor_base", 12).amount(2), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 20), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("appliedenergistics2:tile.BlockController", 0), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 21), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2001).amount(2), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.upgrade", 0), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17321).amount(4), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.upgrade", 1), ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0), ItemBracketHandler.getItem("RIO:item.wireless_transmitter", 0), 200, HV)
    }
}