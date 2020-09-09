package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.ChemicalBath
import gttweaker.mods.gregtech.machines.Mixer
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class OpenModularTurrets : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:baseTierWood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:baseTierOneBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:baseTierTwoBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:baseTierThreeBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:baseTierFourBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:sensorTierOneItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:sensorTierTwoItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:sensorTierThreeItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:sensorTierFiveItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:sensorTierFourItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:chamberTierOne", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:chamberTierTwo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:chamberTierThree", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:chamberTierFour", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:chamberTierFive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:barrelTierOne", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:barrelTierTwo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:barrelTierThree", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:barrelTierFour", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:barrelTierFive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:disposeItemTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:potatoCannonTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:machineGunTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:incendiaryTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:grenadeTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:relativisticTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:rocketTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:teleporterTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:railGunTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:laserTurret", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:hardWallTierOne", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:hardWallTierTwo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:hardWallTierThree", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:hardWallTierFour", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:hardWallTierFive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:fenceTierOne", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:fenceTierTwo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:fenceTierThree", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:fenceTierFour", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:fenceTierFive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierOne", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierTwo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierThree", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierFour", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierFive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierOne", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierTwo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierThree", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierFour", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierFive", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:leverBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:bulletCraftable", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:blazingClayCraftable", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:grenadeCraftable", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:rocketCraftable", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:ferroSlug", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:accuraccyUpgradeItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:fireRateUpgradeItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:rangeUpgradeItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:scattershotUpgradeItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:efficiencyUpgradeItem", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:damageAmpAddon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:solarPanelAddon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:serialPortAddon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:concealerAddon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:recyclerAddon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:potentiaAddon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("openmodularturrets:redstoneReactorAddon", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:baseTierWood", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("stoneCobble"), OreBracketHandler.getOre("plateIron")),
                        arrayOf(OreBracketHandler.getOre("plankWood"),
                                ItemBracketHandler.getItem("openmodularturrets:sensorTierOneItem", 0),
                                OreBracketHandler.getOre("plankWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("stoneCobble"), OreBracketHandler.getOre("plateIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:baseTierOneBlock", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32501),
                        OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                ItemBracketHandler.getItem("openmodularturrets:sensorTierTwoItem", 0),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0)),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 0),
                                OreBracketHandler.getOre("plateSteel"))), null)
        val recipes = MineTweakerAPI.recipes
        val item = ItemBracketHandler.getItem("openmodularturrets:baseTierTwoBlock", 0)
        val array: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n = 0
        val array2 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDarkSteel"), null, null)
        val n2 = 1
        val item2 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 1)
        val hashMap = HashMap<String, IData>()
        hashMap["type"] = ExpandString.asData("SIMPLE")
        hashMap["storedEnergyRF"] = ExpandInt.toData(0)
        array2[n2] = item2.withTag(ExpandAnyDict.asData(hashMap))
        array2[2] = OreBracketHandler.getOre("plateDarkSteel")
        array[n] = array2
        array[1] = arrayOf(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                ItemBracketHandler.getItem("openmodularturrets:sensorTierThreeItem", 0),
                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0))
        array[2] = arrayOf(OreBracketHandler.getOre("plateDarkSteel"),
                ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 0), OreBracketHandler.getOre("plateDarkSteel"))
        recipes.addShaped(item, array, null)
        val recipes2 = MineTweakerAPI.recipes
        val item3 = ItemBracketHandler.getItem("openmodularturrets:baseTierThreeBlock", 0)
        val array3: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n3 = 0
        val array4 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateEnergeticAlloy"), null, null)
        val n4 = 1
        val item4 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 2)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["type"] = ExpandString.asData("ACTIVATED")
        hashMap2["storedEnergyRF"] = ExpandInt.toData(0)
        array4[n4] = item4.withTag(ExpandAnyDict.asData(hashMap2))
        array4[2] = OreBracketHandler.getOre("plateEnergeticAlloy")
        array3[n3] = array4
        array3[1] = arrayOf(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                ItemBracketHandler.getItem("openmodularturrets:sensorTierFourItem", 0),
                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0))
        array3[2] = arrayOf(OreBracketHandler.getOre("plateEnergeticAlloy"),
                ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 1),
                OreBracketHandler.getOre("plateEnergeticAlloy"))
        recipes2.addShaped(item3, array3, null)
        val recipes3 = MineTweakerAPI.recipes
        val item5 = ItemBracketHandler.getItem("openmodularturrets:baseTierFourBlock", 0)
        val array5: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n5 = 0
        val array6 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateVibrantAlloy"), null, null)
        val n6 = 1
        val item6 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 3)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["type"] = ExpandString.asData("VIBRANT")
        hashMap3["storedEnergyRF"] = ExpandInt.toData(0)
        array6[n6] = item6.withTag(ExpandAnyDict.asData(hashMap3))
        array6[2] = OreBracketHandler.getOre("plateVibrantAlloy")
        array5[n5] = array6
        array5[1] = arrayOf(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                ItemBracketHandler.getItem("openmodularturrets:sensorTierFiveItem", 0),
                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0))
        array5[2] = arrayOf(OreBracketHandler.getOre("plateVibrantAlloy"),
                ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 2),
                OreBracketHandler.getOre("plateVibrantAlloy"))
        recipes3.addShaped(item5, array5, null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:sensorTierOneItem", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateBronze"),
                        OreBracketHandler.getOre("dustRedstone"), OreBracketHandler.getOre("plateBronze")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("craftingRedstoneTorch")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateBronze"),
                                OreBracketHandler.getOre("dustRedstone"), OreBracketHandler.getOre("plateBronze"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:sensorTierTwoItem", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                        OreBracketHandler.getOre("plateSteel")), arrayOf(OreBracketHandler.getOre("circuitBasic"),
                        ItemBracketHandler.getItem("openmodularturrets:sensorTierOneItem", 0),
                        OreBracketHandler.getOre("circuitBasic")), arrayOf(OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                        OreBracketHandler.getOre("plateSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:sensorTierThreeItem", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateDarkSteel"),
                        ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                        OreBracketHandler.getOre("plateDarkSteel")), arrayOf(OreBracketHandler.getOre("circuitGood"),
                        ItemBracketHandler.getItem("openmodularturrets:sensorTierTwoItem", 0),
                        OreBracketHandler.getOre("circuitGood")), arrayOf(OreBracketHandler.getOre("plateDarkSteel"),
                        ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                        OreBracketHandler.getOre("plateDarkSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:sensorTierFourItem", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateEnergeticAlloy"),
                        ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                        OreBracketHandler.getOre("plateEnergeticAlloy")),
                        arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("openmodularturrets:sensorTierThreeItem", 0),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf(OreBracketHandler.getOre("plateEnergeticAlloy"),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                OreBracketHandler.getOre("plateEnergeticAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:sensorTierFiveItem", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateVibrantAlloy"),
                        ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                        OreBracketHandler.getOre("plateVibrantAlloy")),
                        arrayOf(OreBracketHandler.getOre("circuitMaster"),
                                ItemBracketHandler.getItem("openmodularturrets:sensorTierFourItem", 0),
                                OreBracketHandler.getOre("circuitMaster")),
                        arrayOf(OreBracketHandler.getOre("plateVibrantAlloy"),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                OreBracketHandler.getOre("plateVibrantAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:chamberTierOne", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("springIron"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                OreBracketHandler.getOre("craftingPiston"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:barrelTierOne", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringIron"),
                                OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("ringIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:disposeItemTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierOne", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("plateIron"),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierOne", 0),
                                OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stoneCobble"),
                                OreBracketHandler.getOre("craftingRedstoneTorch"),
                                OreBracketHandler.getOre("stoneCobble"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:potatoCannonTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierOne", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("plateIron"),
                                ItemBracketHandler.getItem("openmodularturrets:barrelTierOne", 0),
                                OreBracketHandler.getOre("plateIron")),
                        arrayOf(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierOne", 0),
                                OreBracketHandler.getOre("craftingRedstoneTorch"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:machineGunTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierTwo", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("openmodularturrets:barrelTierTwo", 0),
                                OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierTwo", 0),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:incendiaryTurret", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("openmodularturrets:barrelTierTwo", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierTwo", 0)),
                        arrayOf(ItemBracketHandler.getItem("openmodularturrets:chamberTierOne", 0),
                                OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierOne", 0)),
                        arrayOf(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:grenadeTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierThree", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("plateDarkSteel"),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierThree", 0),
                                OreBracketHandler.getOre("plateDarkSteel")),
                        arrayOf(OreBracketHandler.getOre("plateDarkSteel"),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                OreBracketHandler.getOre("plateDarkSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:relativisticTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateDarkSteel"),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 6),
                        OreBracketHandler.getOre("plateDarkSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                                ItemBracketHandler.getItem("openmodularturrets:sensorTierThreeItem", 0),
                                ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDarkSteel"),
                                OreBracketHandler.getOre("plateEnderiumBase"),
                                OreBracketHandler.getOre("plateDarkSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:grenadeTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierThree", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("plateDarkSteel"),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierThree", 0),
                                OreBracketHandler.getOre("plateDarkSteel")),
                        arrayOf(OreBracketHandler.getOre("plateDarkSteel"),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                OreBracketHandler.getOre("plateDarkSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:rocketTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateEnergeticAlloy"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierFour", 0),
                        OreBracketHandler.getOre("plateEnergeticAlloy")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("openmodularturrets:chamberTierFour", 0),
                                ItemBracketHandler.getItem("openmodularturrets:barrelTierFour", 0),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierFour", 0)),
                        arrayOf(OreBracketHandler.getOre("plateEnergeticAlloy"),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                OreBracketHandler.getOre("plateEnergeticAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:teleporterTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("IC2:blockMachine2", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemMaterial", 8),
                                ItemBracketHandler.getItem("openmodularturrets:sensorTierFourItem", 0),
                                ItemBracketHandler.getItem("EnderIO:itemMaterial", 8)),
                        arrayOf(OreBracketHandler.getOre("plateEnergeticAlloy"),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                OreBracketHandler.getOre("plateEnergeticAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:railGunTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierFive", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("plateVibrantAlloy"),
                                ItemBracketHandler.getItem("openmodularturrets:barrelTierFive", 0),
                                OreBracketHandler.getOre("plateVibrantAlloy")),
                        arrayOf(OreBracketHandler.getOre("plateVibrantAlloy"),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierFive", 0),
                                OreBracketHandler.getOre("plateVibrantAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:laserTurret", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                        ItemBracketHandler.getItem("openmodularturrets:barrelTierFive", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("itemVibrantCrystal"),
                                ItemBracketHandler.getItem("openmodularturrets:chamberTierFive", 0),
                                OreBracketHandler.getOre("itemVibrantCrystal")),
                        arrayOf(OreBracketHandler.getOre("plateEnergeticAlloy"),
                                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                                OreBracketHandler.getOre("plateEnergeticAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:hardWallTierOne", 0).amount(9),
                arrayOf(arrayOf(OreBracketHandler.getOre("stoneSmooth"),
                        ItemBracketHandler.getItem("minecraft:gravel", 0), OreBracketHandler.getOre("stoneSmooth")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:clay", 0), OreBracketHandler.getOre("sand"),
                                ItemBracketHandler.getItem("minecraft:clay", 0)),
                        arrayOf(OreBracketHandler.getOre("stoneSmooth"),
                                ItemBracketHandler.getItem("minecraft:gravel", 0),
                                OreBracketHandler.getOre("stoneSmooth"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:fenceTierOne", 0).amount(5),
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                        OreBracketHandler.getOre("ringSteel"), ItemBracketHandler.getItem("minecraft:iron_bars", 0)),
                        arrayOf(OreBracketHandler.getOre("screwSteel"),
                                ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                                OreBracketHandler.getOre("screwSteel")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                                OreBracketHandler.getOre("ringSteel"),
                                ItemBracketHandler.getItem("minecraft:iron_bars", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("plateGold"), OreBracketHandler.getOre("craftingToolWrench")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("circuitBasic"),
                                OreBracketHandler.getOre("dustRedstone"), OreBracketHandler.getOre("circuitBasic")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("screwIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierOne", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32500),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("craftingToolFile"), OreBracketHandler.getOre("screwIron"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierOne", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905),
                                OreBracketHandler.getOre("chestWood"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("craftingToolFile"), OreBracketHandler.getOre("screwIron"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:leverBlock", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("rodStone"),
                        OreBracketHandler.getOre("rodStone"), OreBracketHandler.getOre("rodStone")),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("rodStone"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("openmodularturrets:bulletCraftable", 0).amount(64),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("foilSteel"),
                        OreBracketHandler.getOre("ringIron"), OreBracketHandler.getOre("foilSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("dustGunpowder"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilSteel"),
                                OreBracketHandler.getOre("boltIron"), OreBracketHandler.getOre("foilSteel"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:fenceTierOne", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:iron_bars", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28305), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:fenceTierTwo", 0).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28019), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:fenceTierThree", 0).amount(4),
                ItemBracketHandler.getItem("EnderIO:blockDarkIronBars", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28306), 100, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:fenceTierFour", 0).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.TungstenSteelBars", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28028), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:fenceTierFive", 0).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.IridiumBars", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28316), 100, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierOne", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32500), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierTwo", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4461),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32501), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierThree", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4460),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32502), 400, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierFour", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4462),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32503), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderPowerTierFive", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4463),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32504), 400, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierOne", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905),
                ItemBracketHandler.getItem("minecraft:chest", 0), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierTwo", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4461),
                ItemBracketHandler.getItem("IronChest:BlockIronChest", 0), 400, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierThree", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4460),
                ItemBracketHandler.getItem("IronChest:BlockIronChest", 4), 400, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierFour", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4462),
                ItemBracketHandler.getItem("IronChest:BlockIronChest", 2), 400, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:expanderInvTierFive", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4463),
                ItemBracketHandler.getItem("IronChest:BlockIronChest", 5), 400, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:barrelTierOne", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28032).amount(2), 200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:barrelTierTwo", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28305).amount(2), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:barrelTierThree", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17364).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28306).amount(2), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:barrelTierFour", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17366).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28316).amount(2), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:barrelTierFive", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17367).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28084).amount(2), 200, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:chamberTierOne", 0),
                ItemBracketHandler.getItem("minecraft:piston", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 200, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:chamberTierTwo", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24305), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:chamberTierThree", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32641),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24306), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:chamberTierFour", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24316), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:chamberTierFive", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32643),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24084), 200, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:ioBus", 0),
                ItemBracketHandler.getItem("IC2:itemPartCircuit", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(72), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:bulletCraftable", 0).amount(64),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29305).amount(4),
                ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(144), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:grenadeCraftable", 0).amount(32),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17306).amount(2),
                ItemBracketHandler.getItem("minecraft:tnt", 0),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(144), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:rocketCraftable", 0).amount(24),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365).amount(4),
                ItemBracketHandler.getItem("IC2:blockITNT", 0).amount(3),
                LiquidBracketHandler.getLiquid("molten.stainlesssteel").withAmount(144), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:ferroSlug", 0).amount(16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17364).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26356),
                LiquidBracketHandler.getLiquid("molten.tungstensteel").withAmount(144), 200, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:accuraccyUpgradeItem", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassLense", 0), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:fireRateUpgradeItem", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("minecraft:magma_cream", 0), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:rangeUpgradeItem", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23306), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:scattershotUpgradeItem", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("dreamcraft:item.StainlessSteelBars", 0), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:efficiencyUpgradeItem", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5130).amount(2), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:damageAmpAddon", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("minecraft:ender_eye", 0).amount(2), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:solarPanelAddon", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("EnderIO:blockSolarPanel", 0), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:serialPortAddon", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("OpenComputers:item", 24).amount(4), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:concealerAddon", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32641), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:recyclerAddon", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("EnderStorage:enderChest", 0), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:potentiaAddon", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("Thaumcraft:blockTube", 0).amount(4), 100, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("openmodularturrets:redstoneReactorAddon", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17365),
                ItemBracketHandler.getItem("openmodularturrets:ioBus", 0).amount(4), 100, VoltageLevels.MV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("openmodularturrets:hardWallTierOne", 0)),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4985),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LLV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("openmodularturrets:hardWallTierTwo", 0)),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4461),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("openmodularturrets:hardWallTierThree", 0)),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4460),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LMV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("openmodularturrets:hardWallTierFour", 0)),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4462),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(144), intArrayOf(10000), 200, VoltageLevels.MV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("openmodularturrets:hardWallTierFive", 0)),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4463),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(144), intArrayOf(10000), 200, VoltageLevels.LHV)
        Mixer.addRecipe(ItemBracketHandler.getItem("openmodularturrets:blazingClayCraftable", 0).amount(32),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2805).amount(4),
                        ItemBracketHandler.getItem("minecraft:redstone", 0).amount(4),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0)), 200, VoltageLevels.LV)
    }
}