package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class GraviSuite : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:vajra", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:advChainsaw", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:advDDrill", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:graviTool", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:ultimateLappack", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:relocator", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("GraviSuite:epicLappack", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("IC2:itemPartAlloy", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2380),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2380),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2380)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                                ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                                ItemBracketHandler.getItem("IC2:itemPartAlloy", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0),
                        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0),
                        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2404),
                                OreBracketHandler.getOre("plateRhodium-PlatedPalladium"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2404)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0),
                                ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0),
                                ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorVentDiamond", 1),
                        ItemBracketHandler.getItem("IC2:reactorHeatSwitchDiamond", 1),
                        ItemBracketHandler.getItem("IC2:reactorVentDiamond", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.180k_NaK_Coolantcell", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.CallistoIcePlate", 0),
                                ItemBracketHandler.getItem("gregtech:gt.180k_NaK_Coolantcell", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorPlatingHeat", 0),
                                ItemBracketHandler.getItem("IC2:reactorHeatSwitchDiamond", 1),
                                ItemBracketHandler.getItem("IC2:reactorPlatingHeat", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorVentDiamond", 1),
                        ItemBracketHandler.getItem("IC2:reactorHeatSwitchDiamond", 1),
                        ItemBracketHandler.getItem("IC2:reactorVentDiamond", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.180k_Helium_Coolantcell", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.CallistoIcePlate", 0),
                                ItemBracketHandler.getItem("gregtech:gt.180k_Helium_Coolantcell", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorPlatingHeat", 0),
                                ItemBracketHandler.getItem("IC2:reactorHeatSwitchDiamond", 1),
                                ItemBracketHandler.getItem("IC2:reactorPlatingHeat", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 4),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateDenseNeodymiumMagnetic"),
                        ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                        OreBracketHandler.getOre("plateDenseNeodymiumMagnetic")),
                        arrayOf(OreBracketHandler.getOre("plateDenseCopper"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2384),
                                OreBracketHandler.getOre("plateDenseCopper")),
                        arrayOf(OreBracketHandler.getOre("plateDenseNeodymiumMagnetic"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 0),
                                OreBracketHandler.getOre("plateDenseNeodymiumMagnetic"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"),
                        OreBracketHandler.getOre("plateCopper"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                                ItemBracketHandler.getItem("IC2:blockMachine2", 1),
                                ItemBracketHandler.getItem("IC2:itemPartIridium", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2384),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 23),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2384))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:vajra", 27),
                arrayOf(arrayOf(ItemBracketHandler.getItem("dreamcraft:item.EngravedEnergyChip", 0),
                        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 4),
                        OreBracketHandler.getOre("lensReinforcedGlass")),
                        arrayOf(OreBracketHandler.getOre("plateAlloyCarbon"),
                                ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 5),
                                OreBracketHandler.getOre("plateAlloyCarbon")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyIridium"),
                                OreBracketHandler.getOre("batteryMaster"),
                                OreBracketHandler.getOre("plateAlloyIridium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 6),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemCasingAluminium"),
                        ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                        OreBracketHandler.getOre("itemCasingAluminium")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("IC2:upgradeModule", 0),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:reactorPlating", 0),
                                ItemBracketHandler.getItem("IC2:reactorVentDiamond", 1),
                                ItemBracketHandler.getItem("IC2:reactorPlating", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:ultimateLappack", 27),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingChrome"),
                        OreBracketHandler.getOre("batteryMaster"), OreBracketHandler.getOre("itemCasingChrome")),
                        arrayOf(OreBracketHandler.getOre("batteryMaster"),
                                ItemBracketHandler.getItem("GraviSuite:advLappack", OreDictionary.WILDCARD_VALUE),
                                OreBracketHandler.getOre("batteryMaster")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitMaster"),
                                OreBracketHandler.getOre("wireGt16NiobiumTitanium"),
                                OreBracketHandler.getOre("circuitMaster"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:epicLappack", 27),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32599),
                        ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32599),
                                ItemBracketHandler.getItem("GraviSuite:ultimateLappack", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32599)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitUltimate"),
                                OreBracketHandler.getOre("wireGt16Superconductor"),
                                OreBracketHandler.getOre("circuitUltimate"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:relocator", 27),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwOsmium"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwOsmium")),
                        arrayOf(OreBracketHandler.getOre("plateOsmium"),
                                ItemBracketHandler.getItem("DraconicEvolution:teleporterMKII", 0),
                                OreBracketHandler.getOre("plateOsmium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("SGCraft:ic2Capacitor", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings", 15),
                                ItemBracketHandler.getItem("SGCraft:ic2Capacitor", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:advChainsaw", 27),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwTungstenSteel"),
                        OreBracketHandler.getOre("toolHeadChainsawTungstenSteel"),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallTungstenSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                OreBracketHandler.getOre("gearGtSmallTungstenSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateTungstenSteel"),
                                OreBracketHandler.getOre("batteryElite"),
                                OreBracketHandler.getOre("plateTungstenSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("GraviSuite:advDDrill", 27),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwIridium"),
                        ItemBracketHandler.getItem("dreamcraft:item.ReinforcedIridiumDrillTip", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallIridium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                                OreBracketHandler.getOre("gearGtSmallIridium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyIridium"),
                                OreBracketHandler.getOre("batteryMaster"),
                                OreBracketHandler.getOre("plateAlloyIridium"))), null)
        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 0).displayName = "Superconductor Cover"
        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 1).displayName = "Superconductor"
        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 2).displayName = "Cooling Core"
        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 3).displayName = "Gravitation Engine"
        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 4).displayName = "Magnetron"
        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 5).displayName = "Vajra Core"
        ItemBracketHandler.getItem("GraviSuite:itemSimpleItem", 6).displayName = "Engine Booster"
    }
}