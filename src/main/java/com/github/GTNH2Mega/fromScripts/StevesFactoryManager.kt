package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.HV
import java.lang.Runnable
import minetweaker.api.item.IItemStack
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.OreBracketHandler
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.mc1710.brackets.LiquidBracketHandler

class StevesFactoryManager : Runnable {
    override fun run() {
        val iItemStack = ItemBracketHandler.getItem("StevesFactoryManager:BlockMachineManagerName", 0)
        val iItemStack2 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableName", 0)
        val iItemStack3 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableRelayName", 0)
        val iItemStack4 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableRelayName", 8)
        val iItemStack5 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableInputName", 0)
        val iItemStack6 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableOutputName", 0)
        val iItemStack7 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableIntakeName", 0)
        val iItemStack8 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableIntakeName", 8)
        val iItemStack9 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableBUDName", 0)
        val iItemStack10 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableBreakerName", 0)
        val iItemStack11 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableClusterName", 0)
        val iItemStack12 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableClusterName", 8)
        val iItemStack13 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableCamouflageName", 0)
        val iItemStack14 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableCamouflageName", 1)
        val iItemStack15 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableCamouflageName", 2)
        val iItemStack16 = ItemBracketHandler.getItem("StevesFactoryManager:BlockCableSignName", 0)
        val iItemStack20 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32692)
        val iItemStack21 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32682)
        val iItemStack22 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612)
        val iItemStack24 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705)
        val iItemStack26 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32652)
        val iItemStack27 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32740)
        val iItemStack28 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32670)
        val iItemStack29 = ItemBracketHandler.getItem("OpenBlocks:generic", 11)
        MineTweakerAPI.recipes.remove(iItemStack)
        MineTweakerAPI.recipes.remove(iItemStack2)
        MineTweakerAPI.recipes.remove(iItemStack3)
        MineTweakerAPI.recipes.remove(iItemStack4)
        MineTweakerAPI.recipes.remove(iItemStack5)
        MineTweakerAPI.recipes.remove(iItemStack6)
        MineTweakerAPI.recipes.remove(iItemStack7)
        MineTweakerAPI.recipes.remove(iItemStack8)
        MineTweakerAPI.recipes.remove(iItemStack9)
        MineTweakerAPI.recipes.remove(iItemStack10)
        MineTweakerAPI.recipes.remove(iItemStack11)
        MineTweakerAPI.recipes.remove(iItemStack12)
        MineTweakerAPI.recipes.remove(iItemStack13)
        MineTweakerAPI.recipes.remove(iItemStack14)
        MineTweakerAPI.recipes.remove(iItemStack15)
        MineTweakerAPI.recipes.remove(iItemStack16)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("StevesAddons:cable_rf", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("StevesAddons:cable_ae", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("StevesAddons:duplicator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("StevesAddons:labeler", 0))
        MineTweakerAPI.recipes.addShaped(iItemStack, arrayOf(arrayOf(OreBracketHandler.getOre("plateStainlessSteel"), ItemBracketHandler.getItem("dreamcraft:item.Display", 0), OreBracketHandler.getOre("plateStainlessSteel")), arrayOf(OreBracketHandler.getOre("plateRedAlloy"), ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 6), OreBracketHandler.getOre("plateRedAlloy")), arrayOf(OreBracketHandler.getOre("plateStainlessSteel"), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602), OreBracketHandler.getOre("plateStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(iItemStack2.amount(2), arrayOf(arrayOf(OreBracketHandler.getOre("plateStainlessSteel"), ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17), OreBracketHandler.getOre("plateStainlessSteel")), arrayOf<IIngredient>(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16)), arrayOf(OreBracketHandler.getOre("plateStainlessSteel"), ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17), OreBracketHandler.getOre("plateStainlessSteel"))), null)
        Assembler.addRecipe(iItemStack2, ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiPart", 16), ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 17), LiquidBracketHandler.getLiquid("molten.stainlesssteel").withAmount(144), 150, HV)
        Assembler.addRecipe(iItemStack5, iItemStack2, iItemStack20, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(iItemStack6, iItemStack2, iItemStack21, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(iItemStack3, iItemStack2, ItemBracketHandler.getItem("Railcraft:detector", 9), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(iItemStack4, iItemStack2, ItemBracketHandler.getItem("computronics:computronics.detector", 0), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 300, HV)
        Assembler.addRecipe(iItemStack7, iItemStack2, ItemBracketHandler.getItem("OpenBlocks:vacuumhopper", 0), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(iItemStack8, iItemStack7, iItemStack22, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 300, HV)
        Assembler.addRecipe(iItemStack9, iItemStack2, ItemBracketHandler.getItem("ExtraUtilities:budoff", 3), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(iItemStack10, iItemStack2, iItemStack26, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(iItemStack16, iItemStack10, iItemStack29, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 300, HV)
        Assembler.addRecipe(iItemStack12, iItemStack2.amount(8), ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 200, HV)
        Assembler.addRecipe(iItemStack11, iItemStack2, iItemStack24.amount(2), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(iItemStack13, iItemStack2, iItemStack27.amount(2), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(iItemStack14, iItemStack13, ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0).amount(2), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), 300, HV)
        Assembler.addRecipe(iItemStack15, iItemStack14, iItemStack28, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(864), 400, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("StevesAddons:cable_rf", 0), iItemStack2, ItemBracketHandler.getItem("EnderIO:itemPowerConduit", 0), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(288), 200, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("StevesAddons:duplicator", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32762), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32708), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 150, HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("StevesAddons:labeler", 0), ItemBracketHandler.getItem("dreamcraft:item.Display", 0), ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0).amount(2), LiquidBracketHandler.getLiquid("molten.redstone").withAmount(144), 150, HV)
    }
}