package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandLong
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import java.util.*
import net.minecraftforge.oredict.OreDictionary

class RemoteIO : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("RIO:tile.machine", 0)
        val item2 = ItemBracketHandler.getItem("RIO:tile.machine", 1)
        val item3 = ItemBracketHandler.getItem("RIO:tile.remote_interface", 0)
        ItemBracketHandler.getItem("RIO:tile.remote_inventory", 0)
        val item4 = ItemBracketHandler.getItem("RIO:item.wireless_transmitter", 0)
        val item5 = ItemBracketHandler.getItem("RIO:item.io_tool", 0)
        val item6 = ItemBracketHandler.getItem("RIO:skylight", 0)
        ItemBracketHandler.getItem("RIO:intelligentWorkbench", 0)
        val item7 = ItemBracketHandler.getItem("RIO:item.chip.location", 0)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978)
        OreBracketHandler.getOre("plateHSLA")
        OreBracketHandler.getOre("stickRedAlloy")

        //TODO Replace ("TConstruct:GlassPane", 0)
        //val item8 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)

        //TODO investigate getters with no target field for ("ExtraUtilities:decorativeBlock2", 7)
        //ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 7)

        val ore = OreBracketHandler.getOre("plateObsidian")
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32674)
        OreBracketHandler.getOre("screwNeutronium")
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705)
        OreBracketHandler.getOre("circuitUltimate")
        OreBracketHandler.getOre("gearNeutronium")
        OreBracketHandler.getOre("plateKanthal")
        val item9 = ItemBracketHandler.getItem("IC2:itemRecipePart", 0)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 9279)
        val item10 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 9275)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32694)
        val item11 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32693)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32684)
        val item12 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32683)

        //TODO investigate getters with no target field for ("AdvancedSolarPanel:asp_crafting_items", 13)
        //ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 13)

        OreBracketHandler.getOre("plateNeutronium")
        val ore2 = OreBracketHandler.getOre("pipeMediumTitanium")
        val item13 = ItemBracketHandler.getItem("gregtech:gt.blockcasings", 3)
        val item14 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32613)
        val ore3 = OreBracketHandler.getOre("plateTitanium")
        OreBracketHandler.getOre("craftingToolWrench")
        val ore4 = OreBracketHandler.getOre("craftingToolScrewdriver")
        OreBracketHandler.getOre("craftingToolHardHammer")
        val item15 = ItemBracketHandler.getItem("RIO:item.blank_plate", 0)
        OreBracketHandler.getOre("plateIron")
        val ore5 = OreBracketHandler.getOre("screwTitanium")
        OreBracketHandler.getOre("plateEnderEye")
        ItemBracketHandler.getItem("dreamcraft:item.PikoCircuit", 0)
        ItemBracketHandler.getItem("dreamcraft:item.HighEnergyFlowCircuit", 0)
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705)
        ItemBracketHandler.getItem("EnderStorage:enderChest", 0)
        ItemBracketHandler.getItem("EnderStorage:enderChest", 4096)
        val item16 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1541)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:intelligentWorkbench", 0))
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.chip.transfer", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.chip.upgrade", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.pda", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.remoteAccessor", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("RIO:item.linker", 0))
        MineTweakerAPI.recipes.addShaped(item3.amount(2), arrayOf(arrayOf<IIngredient>(item10, item11, item10),
                arrayOf(OreBracketHandler.getOre("circuitElite"), item16, OreBracketHandler.getOre("circuitElite")),
                arrayOf<IIngredient>(item10, item12, item10)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("RIO:tile.remote_interface", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("RandomThings:playerinterface", 0)), null)
        MineTweakerAPI.recipes.addShaped(item,
                arrayOf(arrayOf(item14, ore2, item14), arrayOf(ore2, item13, ore2), arrayOf(item14, ore2, item14)),
                null)
        MineTweakerAPI.recipes.addShaped(item2,
                arrayOf(arrayOf<IIngredient>(item9, item9, item9), arrayOf<IIngredient>(item14, item13, item14),
                        arrayOf<IIngredient>(ore3, ore3, ore3)), null)

        //TODO Replace ("TConstruct:GlassPane", 0) in item8
        //MineTweakerAPI.recipes.addShaped(item6, arrayOf(arrayOf(ore, item8, ore), arrayOf<IIngredient>(item8,
        //        ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 21), item8),
        //        arrayOf(ore, item8, ore)), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RIO:intelligentWorkbench", 0),
                arrayOf(arrayOf<IIngredient?>(null, item7, null),
                        arrayOf(ore5, ItemBracketHandler.getItem("gregtech:gt.blockcasings4", 0), ore5),
                        arrayOf<IIngredient?>(null, ore4, null)), null)
        MineTweakerAPI.recipes.addShaped(item5,
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateTungstenSteel"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateTungstenSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwTungstenSteel"),
                                OreBracketHandler.getOre("stickTungstenSteel"),
                                OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickTungstenSteel"),
                                OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RIO:item.linker", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        OreBracketHandler.getOre("boltElectrum"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltElectrum"),
                                OreBracketHandler.getOre("lensEnderEye"), OreBracketHandler.getOre("ringSteel")),
                        arrayOf(OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("ringSteel"), item5)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("RIO:item.remoteAccessor", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingTungstenSteel"),
                        ItemBracketHandler.getItem("RIO:tile.remote_interface", 0),
                        OreBracketHandler.getOre("itemCasingTungstenSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("RIO:item.linker", 0),
                                ItemBracketHandler.getItem("RIO:item.chip.location", 0),
                                ItemBracketHandler.getItem("RIO:item.linker", 0)),
                        arrayOf(OreBracketHandler.getOre("screwTungstenSteel"),
                                ItemBracketHandler.getItem("RIO:item.wireless_transmitter", 0),
                                OreBracketHandler.getOre("screwTungstenSteel"))), null)
        val recipes = MineTweakerAPI.recipes
        val item17 = ItemBracketHandler.getItem("RIO:item.pda", 0)
        val array = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("screwIron"),
                OreBracketHandler.getOre("itemCasingAluminium"), OreBracketHandler.getOre("screwIron")),
                arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("dreamcraft:item.Display", 0),
                        OreBracketHandler.getOre("circuitBasic")), null)
        val n = 2
        val array2 = arrayOf<IIngredient?>(OreBracketHandler.getOre("itemCasingAluminium"), null, null)
        val n2 = 1
        val item18 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32518)
        val hashMap = HashMap<String, IData>()
        hashMap["GT.ItemCharge"] = ExpandLong.asData(100000L)
        array2[n2] = item18.withTag(ExpandAnyDict.asData(hashMap))
        array2[2] = OreBracketHandler.getOre("itemCasingAluminium")
        array[n] = array2
        recipes.addShaped(item17, array, null)
        Assembler.addRecipe(item4, ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 0),
                ItemBracketHandler.getItem("WR-CBE|Logic:wirelessLogic", 1),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1000), 600,  VoltageLevels.HV)

        //TODO Replace ("TConstruct:blankPattern", 1)
        //Assembler.addRecipe(item15, ItemBracketHandler.getItem("TConstruct:blankPattern", 1),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316),
        //        LiquidBracketHandler.getLiquid("molten.redstone").withAmount(100), 200,  VoltageLevels.HV)

        //TODO Replace getLiquid("ender")
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)
        //Assembler.addRecipe(item7, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089).amount(2),
        //        LiquidBracketHandler.getLiquid("ender").withAmount(1000), 600,  VoltageLevels.HV)

        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 0),
                ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("EnderStorage:enderChest", 0), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 1),
                ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("EnderStorage:enderChest", 4096), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 2),
                ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockJar", 0).amount(2), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 10),
                ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1546).amount(2), 200,  VoltageLevels.HV)

        //TODO Replace ("ExtraUtilities:extractor_base", 12)
        //Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 12),
        //        ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
        //        ItemBracketHandler.getItem("ExtraUtilities:extractor_base", 12).amount(2), 200,  VoltageLevels.HV)

        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 20),
                ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("appliedenergistics2:tile.BlockController", 0), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.transfer", 21),
                ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2001).amount(2), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.upgrade", 0),
                ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17321).amount(4), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("RIO:item.chip.upgrade", 1),
                ItemBracketHandler.getItem("dreamcraft:item.BlankPlatedChip", 0),
                ItemBracketHandler.getItem("RIO:item.wireless_transmitter", 0), 200,  VoltageLevels.HV)
    }
}