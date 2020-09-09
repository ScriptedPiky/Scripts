package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IItemStack
import minetweaker.api.oredict.IOreDictEntry
import minetweaker.api.tooltip.IngredientTooltips
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Canner
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class Gregtech : Runnable {
    override fun run() {
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 104)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 119)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 101)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1003)
        ItemBracketHandler.getItem("minecraft:brick_block", 0)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5131)
        OreBracketHandler.getOre("plateSteel")
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4)
        ItemBracketHandler.getItem("IC2:blockMachine", 1)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1000)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 100)
        OreBracketHandler.getOre("circuitBasic")
        OreBracketHandler.getOre("circuitAdvanced")
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246)
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1386)
        ItemBracketHandler.getItem("gregtech:gt.blockcasings", 11)
        OreBracketHandler.getOre("stickWood")
        ItemBracketHandler.getItem("minecraft:flint", 0)
        val item = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032)
        val item2 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17304)
        val item3 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17019)
        val item4 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32749)
        val ore = OreBracketHandler.getOre("beeComb")
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 500))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 1500))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 2500))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 3500))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 4500))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2500), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8503), null, false)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("minecraft:chainmail_boots", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2506), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 4), null, false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.neutronreflector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.Thoriumcell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.Double_Thoriumcell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.Quad_Thoriumcell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.60k_Helium_Coolantcell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.180k_Helium_Coolantcell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.360k_Helium_Coolantcell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.60k_NaK_Coolantcell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.180k_NaK_Coolantcell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.360k_NaK_Coolantcell", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2084), null, false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemRTGPellet", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836), null, false)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8530),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("shardApatite"),
                        OreBracketHandler.getOre("shardApatite"), OreBracketHandler.getOre("shardApatite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("shardApatite"),
                                OreBracketHandler.getOre("shardApatite"), OreBracketHandler.getOre("shardApatite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("shardApatite"),
                                OreBracketHandler.getOre("shardApatite"), OreBracketHandler.getOre("shardApatite"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotSilver"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetSilver"),
                        OreBracketHandler.getOre("nuggetSilver"), OreBracketHandler.getOre("nuggetSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetSilver"),
                                OreBracketHandler.getOre("nuggetSilver"), OreBracketHandler.getOre("nuggetSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetSilver"),
                                OreBracketHandler.getOre("nuggetSilver"), OreBracketHandler.getOre("nuggetSilver"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotLead"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetLead"),
                        OreBracketHandler.getOre("nuggetLead"), OreBracketHandler.getOre("nuggetLead")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetLead"),
                                OreBracketHandler.getOre("nuggetLead"), OreBracketHandler.getOre("nuggetLead")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetLead"),
                                OreBracketHandler.getOre("nuggetLead"), OreBracketHandler.getOre("nuggetLead"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotDraconium"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDraconium"),
                        OreBracketHandler.getOre("nuggetDraconium"), OreBracketHandler.getOre("nuggetDraconium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDraconium"),
                                OreBracketHandler.getOre("nuggetDraconium"),
                                OreBracketHandler.getOre("nuggetDraconium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDraconium"),
                                OreBracketHandler.getOre("nuggetDraconium"),
                                OreBracketHandler.getOre("nuggetDraconium"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotDraconiumAwakened"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDraconiumAwakened"),
                        OreBracketHandler.getOre("nuggetDraconiumAwakened"),
                        OreBracketHandler.getOre("nuggetDraconiumAwakened")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDraconiumAwakened"),
                                OreBracketHandler.getOre("nuggetDraconiumAwakened"),
                                OreBracketHandler.getOre("nuggetDraconiumAwakened")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetDraconiumAwakened"),
                                OreBracketHandler.getOre("nuggetDraconiumAwakened"),
                                OreBracketHandler.getOre("nuggetDraconiumAwakened"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotVibrantAlloy"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetVibrantAlloy"),
                        OreBracketHandler.getOre("nuggetVibrantAlloy"), OreBracketHandler.getOre("nuggetVibrantAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetVibrantAlloy"),
                                OreBracketHandler.getOre("nuggetVibrantAlloy"),
                                OreBracketHandler.getOre("nuggetVibrantAlloy")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetVibrantAlloy"),
                                OreBracketHandler.getOre("nuggetVibrantAlloy"),
                                OreBracketHandler.getOre("nuggetVibrantAlloy"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotPulsatingIron"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetPulsatingIron"),
                        OreBracketHandler.getOre("nuggetPulsatingIron"),
                        OreBracketHandler.getOre("nuggetPulsatingIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetPulsatingIron"),
                                OreBracketHandler.getOre("nuggetPulsatingIron"),
                                OreBracketHandler.getOre("nuggetPulsatingIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetPulsatingIron"),
                                OreBracketHandler.getOre("nuggetPulsatingIron"),
                                OreBracketHandler.getOre("nuggetPulsatingIron"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotThauminite"),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicbases:resource", 0),
                        ItemBracketHandler.getItem("thaumicbases:resource", 0),
                        ItemBracketHandler.getItem("thaumicbases:resource", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicbases:resource", 0),
                                ItemBracketHandler.getItem("thaumicbases:resource", 0),
                                ItemBracketHandler.getItem("thaumicbases:resource", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("thaumicbases:resource", 0),
                                ItemBracketHandler.getItem("thaumicbases:resource", 0),
                                ItemBracketHandler.getItem("thaumicbases:resource", 0))))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IC2:itemOreIridium", 0))
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustEnderPearl"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemEnderPearl"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustEnderEye"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemEnderEye"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustRuby"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemRuby"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustSapphire"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemSapphire"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustGreenSapphire"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemGreenSapphire"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustOlivine"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemOlivine"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustTopaz"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemTopaz"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustTanzanite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemTanzanite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustAmethyst"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemAmethyst"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustJasper"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemJasper"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustGarnetYellow"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemGarnetYellow"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustGarnetRed"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemGarnetRed"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustForce"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemForce"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustForcillium"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemForcillium"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustForcicium"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemForcicium"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustDilithium"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemDilithium"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustAmber"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemAmber"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustFoolsRuby"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemFoolsRuby"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustBlueTopaz"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemBlueTopaz"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustMonazite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemMonazite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustQuartzite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemQuartzite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustLazurite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemLazurite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustSodalite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemSodalite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustNiter"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemNiter"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustTricalciumPhosphate"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemTricalciumPhosphate"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustLignite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemLignite"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustInfusedEntropy"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemInfusedEntropy"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustInfusedOrder"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemInfusedOrder"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustVinteum"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemVinteum"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustInfusedAir"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemInfusedAir"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustInfusedFire"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemInfusedFire"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustInfusedEarth"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemInfusedEarth"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustInfusedWater"), null, false)
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("gemInfusedWater"), null, false)
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetLead"))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetSilver"))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetTin"))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetCopper"))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetSteel"))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetPulsatingIron"))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetVibrantAlloy"))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetDraconium"))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetDraconiumAwakened"))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("thaumicbases:resource", 0))
        MineTweakerAPI.recipes.removeShapeless(OreBracketHandler.getOre("dustCoal").amount(9),
                arrayOf<IIngredient>(OreBracketHandler.getOre("blockCoal")), false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:coal", 1).amount(9),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockgem3", 4)), false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2536).amount(9),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockgem3", 4)), false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1145))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1360), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1370), null, false)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1145),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.NanoCircuit", 0),
                        ItemBracketHandler.getItem("SGCraft:ic2PowerUnit", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.NanoCircuit", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("SGCraft:ic2Capacitor", 0),
                                ItemBracketHandler.getItem("SGCraft:stargateBase", 0),
                                ItemBracketHandler.getItem("SGCraft:ic2Capacitor", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("SGCraft:ic2Capacitor", 0),
                                ItemBracketHandler.getItem("SGCraft:ocInterface", 0),
                                ItemBracketHandler.getItem("SGCraft:ic2Capacitor", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 500),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500), null),
                        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                OreBracketHandler.getOre("craftingToolHardHammer")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 1500),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        OreBracketHandler.getOre("gemDiamond"), OreBracketHandler.getOre("gemDiamond")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"), null,
                                OreBracketHandler.getOre("craftingToolHardHammer")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 2500),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        OreBracketHandler.getOre("craftingToolHardHammer")), arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 3500),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        OreBracketHandler.getOre("gemDiamond"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 4500),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        OreBracketHandler.getOre("gemDiamond"), OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolFile"), null, null),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28809),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolKnife"), null, null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                null)), null)

        //TODO Replace ("TConstruct:GlassBlock", 0)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2890),
        //        arrayOf(OreBracketHandler.getOre("craftingToolMortar"),
        //                ItemBracketHandler.getItem("TConstruct:GlassBlock", 0)), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1890),
        //        arrayOf(OreBracketHandler.getOre("craftingToolMortar"),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0)), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2892),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolMortar"),
                        OreBracketHandler.getOre("listAllmeatraw")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2892),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolMortar"),
                        OreBracketHandler.getOre("listAllfishraw")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2893),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolMortar"),
                        OreBracketHandler.getOre("listAllmeatcooked")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2893),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolMortar"),
                        OreBracketHandler.getOre("listAllfishcooked")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolMortar"),
                        OreBracketHandler.getOre("logWood")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1625),
                arrayOf(OreBracketHandler.getOre("craftingToolMortar"),
                        ItemBracketHandler.getItem("minecraft:brick", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22874),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickPlastic"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("stickPlastic"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("cropBarley"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("cropWheat"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("cropRye"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("cropOats"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2817),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.blockores", 817), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2817),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.blockores", 1817), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2817),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.blockores", 2817), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2817),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.blockores", 3817), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2817),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.blockores", 4817), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1805),
                arrayOf(OreBracketHandler.getOre("craftingToolMortar"),
                        ItemBracketHandler.getItem("minecraft:clay_ball", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("nuggetIron"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 86),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("nuggetGold"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 35),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("nuggetCopper"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 57),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("nuggetTin"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 54),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("nuggetSilver"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 89),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("nuggetLead"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 36),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("nuggetZinc"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 34),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("nuggetNickel"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolMortar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 11),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                        OreBracketHandler.getOre("circuitAdvanced"),
                        OreBracketHandler.getOre("itemCasingStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32750),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Expansion:projectred.expansion.solar_panel", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2000),
                arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Transmission:projectred.transmission.wire", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22880),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickRubber"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("stickRubber"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22530),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickApatite"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("stickApatite"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22526),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickLapis"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("stickLapis"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22524),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickLazurite"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("stickLazurite"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22525),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickSodalite"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("stickSodalite"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22532),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickEnderPearl"),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("stickEnderPearl"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22533),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickEnderEye"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("stickEnderEye"))),
                null)

        //TODO Replace ("dreamcraft:item.IrradiantReinforcedAluminiumPlate", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32752),
        //        arrayOf(arrayOfNulls(9), arrayOfNulls(9),
        //                arrayOf(null, null, null, OreBracketHandler.getOre("wireGt01SuperconductorMV"),
        //                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedAluminiumPlate", 0),
        //                        OreBracketHandler.getOre("wireGt01SuperconductorMV"), null, null, null),
        //                arrayOf(null, null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
        //                        OreBracketHandler.getOre("platePolytetrafluoroethylene"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034), null, null, null),
        //                arrayOf(null, null, null, OreBracketHandler.getOre("circuitAdvanced"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32751),
        //                        OreBracketHandler.getOre("circuitAdvanced"), null, null, null),
        //                arrayOf(null, null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
        //                        OreBracketHandler.getOre("platePolytetrafluoroethylene"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034), null, null, null),
        //                arrayOf(null, null, null, OreBracketHandler.getOre("wireGt01SuperconductorMV"),
        //                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedAluminiumPlate", 0),
        //                        OreBracketHandler.getOre("wireGt01SuperconductorMV"), null, null, null),
        //                arrayOfNulls(9), arrayOfNulls(9)))

        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32753), arrayOf(arrayOfNulls(9),
                arrayOf<IIngredient?>(null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32063), null, null, null, null),
                arrayOf(null, null, null, OreBracketHandler.getOre("wireGt01SuperconductorHV"),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTitaniumPlate", 0),
                        OreBracketHandler.getOre("wireGt01SuperconductorHV"), null, null, null),
                arrayOf(null, null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
                        OreBracketHandler.getOre("plateEpoxid"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034), null, null, null),
                arrayOf(null, null, null, OreBracketHandler.getOre("circuitData"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32752),
                        OreBracketHandler.getOre("circuitData"), null, null, null),
                arrayOf(null, null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
                        OreBracketHandler.getOre("plateEpoxid"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034), null, null, null),
                arrayOf(null, null, null, OreBracketHandler.getOre("wireGt01SuperconductorHV"),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTitaniumPlate", 0),
                        OreBracketHandler.getOre("wireGt01SuperconductorHV"), null, null, null),
                arrayOf<IIngredient?>(null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32063), null, null, null, null),
                arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32754), arrayOf(arrayOfNulls(9),
                arrayOf<IIngredient?>(null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32065), null, null, null, null),
                arrayOf(null, null, null, OreBracketHandler.getOre("wireGt01SuperconductorEV"),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenPlate", 0),
                        OreBracketHandler.getOre("wireGt01SuperconductorEV"), null, null, null),
                arrayOf(null, null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
                        OreBracketHandler.getOre("plateIndiumGalliumPhosphide"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034), null, null, null),
                arrayOf(null, null, OreBracketHandler.getOre("circuitElite"), OreBracketHandler.getOre("circuitElite"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32753),
                        OreBracketHandler.getOre("circuitElite"), OreBracketHandler.getOre("circuitElite"), null, null),
                arrayOf(null, null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
                        OreBracketHandler.getOre("plateIndiumGalliumPhosphide"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034), null, null, null),
                arrayOf(null, null, null, OreBracketHandler.getOre("wireGt01SuperconductorEV"),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenPlate", 0),
                        OreBracketHandler.getOre("wireGt01SuperconductorEV"), null, null, null),
                arrayOf<IIngredient?>(null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32065), null, null, null, null),
                arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32755), arrayOf(arrayOfNulls(9),
                arrayOf<IIngredient?>(null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32051), null, null, null, null),
                arrayOf(null, null, OreBracketHandler.getOre("wireGt01SuperconductorIV"),
                        OreBracketHandler.getOre("plateTripleSilicon"),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenSteelPlate", 0),
                        OreBracketHandler.getOre("plateTripleSilicon"),
                        OreBracketHandler.getOre("wireGt01SuperconductorIV"), null, null),
                arrayOf(null, null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
                        OreBracketHandler.getOre("platePolybenzimidazole"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035), null, null, null),
                arrayOf(null, OreBracketHandler.getOre("wireGt01SuperconductorIV"),
                        OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitMaster"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32754),
                        OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("circuitMaster"),
                        OreBracketHandler.getOre("wireGt01SuperconductorIV"), null),
                arrayOf(null, null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
                        OreBracketHandler.getOre("platePolybenzimidazole"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035), null, null, null),
                arrayOf(null, null, OreBracketHandler.getOre("wireGt01SuperconductorIV"),
                        OreBracketHandler.getOre("plateTripleSilicon"),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenSteelPlate", 0),
                        OreBracketHandler.getOre("plateTripleSilicon"),
                        OreBracketHandler.getOre("wireGt01SuperconductorIV"), null, null),
                arrayOf<IIngredient?>(null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32051), null, null, null, null),
                arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32756), arrayOf(arrayOfNulls(9),
                arrayOf<IIngredient?>(null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32053), null, null, null, null),
                arrayOf(null, null, OreBracketHandler.getOre("wireGt01SuperconductorLuV"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedChromePlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
                        OreBracketHandler.getOre("wireGt01SuperconductorLuV"), null, null),
                arrayOf(null, null, OreBracketHandler.getOre("plateQuadrupleSilicon"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
                        OreBracketHandler.getOre("plateDoublePolybenzimidazole"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
                        OreBracketHandler.getOre("plateQuadrupleSilicon"), null, null),
                arrayOf(null, OreBracketHandler.getOre("wireGt01SuperconductorLuV"),
                        OreBracketHandler.getOre("circuitUltimate"), OreBracketHandler.getOre("circuitUltimate"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32755),
                        OreBracketHandler.getOre("circuitUltimate"), OreBracketHandler.getOre("circuitUltimate"),
                        OreBracketHandler.getOre("wireGt01SuperconductorLuV"), null),
                arrayOf(null, null, OreBracketHandler.getOre("plateQuadrupleSilicon"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
                        OreBracketHandler.getOre("plateDoublePolybenzimidazole"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
                        OreBracketHandler.getOre("plateQuadrupleSilicon"), null, null),
                arrayOf(null, null, OreBracketHandler.getOre("wireGt01SuperconductorLuV"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedChromePlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32034),
                        OreBracketHandler.getOre("wireGt01SuperconductorLuV"), null, null),
                arrayOf<IIngredient?>(null, null, null, null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32053), null, null, null, null),
                arrayOfNulls(9)))

        //TODO Replace ("supersolarpanel:solarsplitter", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32757),
        //        arrayOf(arrayOf<IIngredient?>(null, null, null, null,
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32059), null, null, null, null),
        //                arrayOf<IIngredient?>(null, null, null, OreBracketHandler.getOre("wireGt02SuperconductorZPM"),
        //                        OreBracketHandler.getOre("circuitInfinite"),
        //                        OreBracketHandler.getOre("wireGt02SuperconductorZPM"), null, null, null),
        //                arrayOf(null, null, OreBracketHandler.getOre("wireGt02SuperconductorZPM"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
        //                        ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 8),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
        //                        OreBracketHandler.getOre("wireGt02SuperconductorZPM"), null, null),
        //                arrayOf(null, null, OreBracketHandler.getOre("plateQuintupleSilicon"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32151),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32756),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32151),
        //                        OreBracketHandler.getOre("plateQuintupleSilicon"), null, null),
        //                arrayOf(null, ItemBracketHandler.getItem("supersolarpanel:solarsplitter", 0),
        //                        OreBracketHandler.getOre("circuitInfinite"),
        //                        OreBracketHandler.getOre("circuitInfinite"),
        //                        OreBracketHandler.getOre("plateTriplePolybenzimidazole"),
        //                        OreBracketHandler.getOre("circuitInfinite"),
        //                        OreBracketHandler.getOre("circuitInfinite"),
        //                        ItemBracketHandler.getItem("supersolarpanel:solarsplitter", 0), null),
        //                arrayOf(null, null, OreBracketHandler.getOre("plateQuintupleSilicon"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32151),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32756),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32151),
        //                        OreBracketHandler.getOre("plateQuintupleSilicon"), null, null),
        //                arrayOf(null, null, OreBracketHandler.getOre("wireGt02SuperconductorZPM"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
        //                        ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 8),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32035),
        //                        OreBracketHandler.getOre("wireGt02SuperconductorZPM"), null, null),
        //                arrayOf<IIngredient?>(null, null, null, OreBracketHandler.getOre("wireGt02SuperconductorZPM"),
        //                        OreBracketHandler.getOre("circuitInfinite"),
        //                        OreBracketHandler.getOre("wireGt02SuperconductorZPM"), null, null, null),
        //                arrayOf<IIngredient?>(null, null, null, null,
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32059), null, null, null, null)))

        //TODO Replace ("supersolarpanel:enderquantumcomponent", 0)
        //ExtremeCrafting.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32758),
        //        arrayOf(arrayOf(null, null, null, OreBracketHandler.getOre("wireGt04SuperconductorUV"),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32048),
        //                OreBracketHandler.getOre("wireGt04SuperconductorUV"), null, null, null),
        //                arrayOf(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32161),
        //                        OreBracketHandler.getOre("wireGt04SuperconductorUV"),
        //                        OreBracketHandler.getOre("circuitBio"),
        //                        OreBracketHandler.getOre("wireGt04SuperconductorUV"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32161), null, null),
        //                arrayOf(null, null, OreBracketHandler.getOre("wireGt04SuperconductorUV"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32151),
        //                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNaquadriaPlate", 0),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32151),
        //                        OreBracketHandler.getOre("wireGt04SuperconductorUV"), null, null),
        //                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32153),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32757),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32153),
        //                        ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0), null, null),
        //                arrayOf(ItemBracketHandler.getItem("supersolarpanel:enderquantumcomponent", 0),
        //                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNaquadriaPlate", 0),
        //                        OreBracketHandler.getOre("circuitBio"), OreBracketHandler.getOre("circuitBio"),
        //                        OreBracketHandler.getOre("plateQuadruplePolybenzimidazole"),
        //                        OreBracketHandler.getOre("circuitBio"), OreBracketHandler.getOre("circuitBio"),
        //                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNaquadriaPlate", 0),
        //                        ItemBracketHandler.getItem("supersolarpanel:enderquantumcomponent", 0)),
        //                arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32153),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32757),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32153),
        //                        ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0), null, null),
        //                arrayOf(null, null, OreBracketHandler.getOre("wireGt04SuperconductorUV"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32151),
        //                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNaquadriaPlate", 0),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32151),
        //                        OreBracketHandler.getOre("wireGt04SuperconductorUV"), null, null),
        //                arrayOf(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32161),
        //                        OreBracketHandler.getOre("wireGt04SuperconductorUV"),
        //                        OreBracketHandler.getOre("circuitBio"),
        //                        OreBracketHandler.getOre("wireGt04SuperconductorUV"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32161), null, null),
        //                arrayOf(null, null, null, OreBracketHandler.getOre("wireGt04SuperconductorUV"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32048),
        //                        OreBracketHandler.getOre("wireGt04SuperconductorUV"), null, null, null)))

        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32759),
                arrayOf(arrayOf(null, null, OreBracketHandler.getOre("wireGt08Superconductor"),
                        OreBracketHandler.getOre("plateDenseSilicon"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32068),
                        OreBracketHandler.getOre("plateDenseSilicon"),
                        OreBracketHandler.getOre("wireGt08Superconductor"), null, null),
                        arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32163),
                                OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32153),
                                OreBracketHandler.getOre("circuitNano"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32153),
                                OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32163), null),
                        arrayOf(null, OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("dreamcraft:item.PicoWafer", 0),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNeutroniumPlate", 0),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("dreamcraft:item.PicoWafer", 0),
                                OreBracketHandler.getOre("wireGt08Superconductor"), null),
                        arrayOf(null, OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32758),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                                OreBracketHandler.getOre("wireGt08Superconductor"), null),
                        arrayOf(OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNeutroniumPlate", 0),
                                OreBracketHandler.getOre("circuitNano"), OreBracketHandler.getOre("circuitNano"),
                                OreBracketHandler.getOre("plateDensePolybenzimidazole"),
                                OreBracketHandler.getOre("circuitNano"), OreBracketHandler.getOre("circuitNano"),
                                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNeutroniumPlate", 0),
                                OreBracketHandler.getOre("wireGt08Superconductor")),
                        arrayOf(null, OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32758),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                                OreBracketHandler.getOre("wireGt08Superconductor"), null),
                        arrayOf(null, OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("dreamcraft:item.PicoWafer", 0),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNeutroniumPlate", 0),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("dreamcraft:item.PicoWafer", 0),
                                OreBracketHandler.getOre("wireGt08Superconductor"), null),
                        arrayOf(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32163),
                                OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32153),
                                OreBracketHandler.getOre("circuitNano"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32153),
                                OreBracketHandler.getOre("wireGt08Superconductor"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32163), null),
                        arrayOf(null, null, OreBracketHandler.getOre("wireGt08Superconductor"),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32068),
                                OreBracketHandler.getOre("plateDenseSilicon"),
                                OreBracketHandler.getOre("wireGt08Superconductor"), null, null)))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("MCFrames:mcframes.frame", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4905),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("OpenBlocks:scaffolding", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1890),
                arrayOf(OreBracketHandler.getOre("craftingToolMortar"),
                        ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2322).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2305),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 10),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1047),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1345),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1034),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1029),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1030),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1048),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1028)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 10),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                        OreBracketHandler.getOre("circuitAdvanced"),
                        OreBracketHandler.getOre("itemCasingStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32612)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20849),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stoneGraniteBlack"), null, null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolFile"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20850),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stoneGraniteRed"), null, null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolFile"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 6),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                        OreBracketHandler.getOre("circuitElite"), OreBracketHandler.getOre("itemCasingStainlessSteel")),
                        arrayOf(OreBracketHandler.getOre("circuitElite"),
                                ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 0),
                                OreBracketHandler.getOre("circuitElite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingStainlessSteel"),
                                OreBracketHandler.getOre("circuitElite"),
                                OreBracketHandler.getOre("itemCasingStainlessSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotObsidian"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotObsidian"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockstones", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockstones", 1),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockstones", 5),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockstones", 3),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockconcretes", 10),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockconcretes", 9),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockconcretes", 13),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockconcretes", 11),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockstones", 10),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockstones", 9),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockstones", 13),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockstones", 11),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockgranites", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockgranites", 1),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockgranites", 5),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockgranites", 3),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockgranites", 10),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockgranites", 9),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockgranites", 13),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockgranites", 11),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 21),
                ItemBracketHandler.getItem("IC2:blockElectric", 3),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1246).amount(2), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 22),
                ItemBracketHandler.getItem("IC2:blockElectric", 4),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1366).amount(2), 250, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 23),
                ItemBracketHandler.getItem("IC2:blockElectric", 5),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1426).amount(2), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 24),
                ItemBracketHandler.getItem("IC2:blockElectric", 6),
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1587).amount(2), 100, VoltageLevels.EV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.neutronreflector", 0),
                ItemBracketHandler.getItem("dreamcraft:item.NeutronReflectorParts", 0),
                ItemBracketHandler.getItem("IC2:itemPartIridium", 0), 1200, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.Double_Thoriumcell", 0),
                ItemBracketHandler.getItem("gregtech:gt.Thoriumcell", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(4), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.Quad_Thoriumcell", 0),
                ItemBracketHandler.getItem("gregtech:gt.Double_Thoriumcell", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(4), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("gregtech:gt.Quad_Thoriumcell", 0),
                ItemBracketHandler.getItem("gregtech:gt.Thoriumcell", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22305).amount(6), 300, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("IC2:itemRTGPellet", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22032).amount(6),
                ItemBracketHandler.getItem("IC2:itemPlutonium", 0).amount(3),
                LiquidBracketHandler.getLiquid("ic2coolant").withAmount(1000), 1200, VoltageLevels.MV)
        Assembler.addRecipe(item4.amount(2), item.amount(2),
                ItemBracketHandler.getItem("minecraft:iron_door", 0).amount(1), 1000, VoltageLevels.LLV)
        Assembler.addRecipe(item4.amount(2), item3.amount(2),
                ItemBracketHandler.getItem("minecraft:iron_door", 0).amount(1), 1000, VoltageLevels.LLV)
        Assembler.addRecipe(item4.amount(2), item2.amount(2),
                ItemBracketHandler.getItem("minecraft:iron_door", 0).amount(1), 1000, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9057).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9035).amount(27), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9057).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2035).amount(3), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9057).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(3), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9035).amount(27),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2057), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9035).amount(27),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11057), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9035).amount(27),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9057).amount(9), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("thaumicbases:resource", 1),
                ItemBracketHandler.getItem("thaumicbases:resource", 0).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("thaumicbases:resource", 0).amount(9),
                ItemBracketHandler.getItem("thaumicbases:resource", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32309).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:glass", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2890),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:glass", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1890).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 200, VoltageLevels.LLV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:glass", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 890).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 200, VoltageLevels.LLV)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2540),
                LiquidBracketHandler.getLiquid("water").withAmount(200), 8000, 2000, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2540),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(200), 9000, 1500, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2541),
                LiquidBracketHandler.getLiquid("water").withAmount(200), 8000, 2000, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2541),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(200), 9000, 1500, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2543),
                LiquidBracketHandler.getLiquid("water").withAmount(200), 8000, 2000, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2543),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(200), 9000, 1500, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2542),
                LiquidBracketHandler.getLiquid("water").withAmount(200), 8000, 2000, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2542),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(200), 9000, 1500, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2545),
                LiquidBracketHandler.getLiquid("water").withAmount(200), 8000, 2000, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2545),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(200), 9000, 1500, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2544),
                LiquidBracketHandler.getLiquid("water").withAmount(200), 8000, 2000, 30)
        Autoclave.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 5),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2544),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(200), 9000, 1500, 30)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2819)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2020),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2865)), 500, 480, 2000)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2819)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11020),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2865)), 500, 480, 2000)
        Canner.addBottleRecipe(ItemBracketHandler.getItem("gregtech:gt.Thoriumcell", 0),
                ItemBracketHandler.getItem("IC2:itemFuelRod", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2096).amount(3))
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2802).amount(8)), null,
                ItemBracketHandler.getItem("minecraft:gravel", 0).amount(16), null, null, intArrayOf(10000), 50, VoltageLevels.EV)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1067),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1045),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1064),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1065),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1055),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1062)), null,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2891), null, null,
                intArrayOf(2500, 2500, 2500, 2500, 2500, 2500), 64, VoltageLevels.LLV)
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836).amount(5),
                LiquidBracketHandler.getLiquid("steam").withAmount(16000),
                ItemBracketHandler.getItem("dreamcraft:item.PotassiumHydroxideDust", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("nitricacid").withAmount(5000), 10, VoltageLevels.LV)
        FluidCanner.addRecipe(ItemBracketHandler.getItem("gregtech:gt.60k_Helium_Coolantcell", 0),
                ItemBracketHandler.getItem("dreamcraft:item.TenKCell", 0), null,
                LiquidBracketHandler.getLiquid("helium").withAmount(1000))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("gregtech:gt.180k_Helium_Coolantcell", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ThirtyKCell", 0), null,
                LiquidBracketHandler.getLiquid("helium").withAmount(3000))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("gregtech:gt.360k_Helium_Coolantcell", 0),
                ItemBracketHandler.getItem("dreamcraft:item.SixtyKCell", 0), null,
                LiquidBracketHandler.getLiquid("helium").withAmount(6000))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("gregtech:gt.60k_NaK_Coolantcell", 0),
                ItemBracketHandler.getItem("dreamcraft:item.TenKCell", 0), null,
                LiquidBracketHandler.getLiquid("sodiumpotassium").withAmount(1000))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("gregtech:gt.180k_NaK_Coolantcell", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ThirtyKCell", 0), null,
                LiquidBracketHandler.getLiquid("sodiumpotassium").withAmount(3000))
        FluidCanner.addRecipe(ItemBracketHandler.getItem("gregtech:gt.360k_NaK_Coolantcell", 0),
                ItemBracketHandler.getItem("dreamcraft:item.SixtyKCell", 0), null,
                LiquidBracketHandler.getLiquid("sodiumpotassium").withAmount(6000))
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22874),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23874).amount(2), 20, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22880),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23880).amount(2), 20, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22530),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23530).amount(2), 20, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22526),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23526).amount(2), 20, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22524),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23524).amount(2), 20, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22525),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23525).amount(2), 20, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22532),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23532).amount(2), 20, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22533),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23533).amount(2), 20, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 802).amount(2),
                ItemBracketHandler.getItem("minecraft:flint", 0), 32, VoltageLevels.LLV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1890),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 27890), 10, VoltageLevels.LLV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32300),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0).amount(0), 200, VoltageLevels.LHV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32300),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0).amount(0), 200, VoltageLevels.LHV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32300),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0).amount(0), 200, VoltageLevels.LHV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32300),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0).amount(0), 200, VoltageLevels.LHV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ExtruderShapeBoat", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32300),
                ItemBracketHandler.getItem("dreamcraft:item.ExtruderShapeBoat", 0).amount(0), 200, VoltageLevels.LHV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.CoinBlank", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32304).amount(0), 200, VoltageLevels.LV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881)),
                ItemBracketHandler.getItem("Natura:barleyFood", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881)),
                ItemBracketHandler.getItem("BiomesOPlenty:plants", 6), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2892).amount(9)),
                ItemBracketHandler.getItem("Thaumcraft:blockTaint", 2), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2890)),
                ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0).amount(2), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5937).amount(4)),
                ItemBracketHandler.getItem("gregtech:gt.blockores", 937), intArrayOf(10000), 300, VoltageLevels.LULV)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockores", 870), 0.0)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockores", 1870), 0.0)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockores", 2870), 0.0)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockores", 3870), 0.0)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockores", 4870), 0.0)
        PlateBender.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24874),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22874), 200, VoltageLevels.LLV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23028),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23028), 200, VoltageLevels.ULV)

        //TODO Replace Smeltery Recipes
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32300),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), null, false, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32301),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormPlate", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32302),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormCasing", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32303),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormGear", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32304),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormCoinage", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32305),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormBottle", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormIngot", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormBall", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormBlock", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32309),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormNuggets", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32310),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormBuns", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32311),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormBread", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32312),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormBaguette", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32313),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormCylinder", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32314),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormAnvil", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32315),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormName", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32316),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormArrowHead", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32317),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormSmallGear", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32318),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormStick", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32319),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormBolt", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32320),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormRound", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32321),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormScrew", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32322),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormRing", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32323),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormStickLong", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32325),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormTurbineBlade", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32324),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormRotor", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32326),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeTiny", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32327),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeSmall", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32328),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeMedium", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32329),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeLarge", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32330),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.MoldFormPipeHuge", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32350),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapePlate", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32351),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeRod", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32352),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeBolt", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32354),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeCell", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32353),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeRing", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32355),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeIngot", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32356),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeWire", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32357),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeCasing", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeTinyPipe", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32359),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeSmallPipe", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32360),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeNormalPipe", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32361),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeLargePipe", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32362),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeHugePipe", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32363),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeBlock", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32364),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeSwordBlade", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32365),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapePickaxeHead", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32366),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeShovelHead", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32367),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeAxeHead", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32368),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeHoeHead", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32369),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeHammerHead", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32370),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeFileHead", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32371),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeSawBlade", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32372),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeGear", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32373),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeBottle", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32374),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeRotor", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32376),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeTurbineBlade", 0), true, 100)
        //Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32375),
        //        LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
        //        ItemBracketHandler.getItem("dreamcraft:item.ShapeSmallGear", 0), true, 100)
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32700),
                MineTweakerAPI.format.red(ExpandString.asFormattedText("ULV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32075),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("ULV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 4),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("ULV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("IC2:itemPartCircuit", 0),
                MineTweakerAPI.format.red(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32701),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32078),
                MineTweakerAPI.format.yellow(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 5),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32702),
                MineTweakerAPI.format.red(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32079),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32080),
                MineTweakerAPI.format.yellow(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 6),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32703),
                MineTweakerAPI.format.yellow(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32082),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 7),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32704),
                MineTweakerAPI.format.yellow(ExpandString.asFormattedText("EV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32083),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("EV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32085),
                MineTweakerAPI.format.aqua(ExpandString.asFormattedText("EV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 8),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("EV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                MineTweakerAPI.format.yellow(ExpandString.asFormattedText("IV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32084),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("IV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32086),
                MineTweakerAPI.format.aqua(ExpandString.asFormattedText("IV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32089),
                MineTweakerAPI.format.blue(ExpandString.asFormattedText("IV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 9),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("IV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("LuV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32087),
                MineTweakerAPI.format.aqua(ExpandString.asFormattedText("LuV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32096),
                MineTweakerAPI.format.blue(ExpandString.asFormattedText("LuV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32092),
                MineTweakerAPI.format.darkPurple(ExpandString.asFormattedText("LuV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 10),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("LuV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32088),
                MineTweakerAPI.format.aqua(ExpandString.asFormattedText("ZPM-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32090),
                MineTweakerAPI.format.blue(ExpandString.asFormattedText("ZPM-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32093),
                MineTweakerAPI.format.darkPurple(ExpandString.asFormattedText("ZPM-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32097),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("ZPM-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 11),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("ZPM-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32091),
                MineTweakerAPI.format.blue(ExpandString.asFormattedText("UV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32094),
                MineTweakerAPI.format.darkPurple(ExpandString.asFormattedText("UV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32098),
                MineTweakerAPI.format.aqua(ExpandString.asFormattedText("UV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 12),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("UV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32095),
                MineTweakerAPI.format.darkPurple(ExpandString.asFormattedText("UHV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32099),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("UHV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("bartworks:gt.bwMetaGeneratedItem0", 13),
                MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("UHV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 32120),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("UEV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32510),
                MineTweakerAPI.format.red(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32511),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32517),
                MineTweakerAPI.format.yellow(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32518),
                MineTweakerAPI.format.darkRed(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32519),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("LV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32520),
                MineTweakerAPI.format.red(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32521),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32527),
                MineTweakerAPI.format.yellow(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32528),
                MineTweakerAPI.format.darkRed(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32529),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("MV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32530),
                MineTweakerAPI.format.red(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32531),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32537),
                MineTweakerAPI.format.yellow(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32538),
                MineTweakerAPI.format.darkRed(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32539),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                MineTweakerAPI.format.darkBlue(ExpandString.asFormattedText("HV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32540),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("EV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                MineTweakerAPI.format.darkBlue(ExpandString.asFormattedText("EV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32545),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("IV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32597),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("IV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32550),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("LuV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32599),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("LuV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32555),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("ZPM-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32736),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("ZPM-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32598),
                MineTweakerAPI.format.red(ExpandString.asFormattedText("ZPM-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32560),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("UV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32737),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("UV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32605),
                MineTweakerAPI.format.red(ExpandString.asFormattedText("UV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32570),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("UHV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32575),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("UEV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32580),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("UIV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32585),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("UMV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32609),
                MineTweakerAPI.format.gold(ExpandString.asFormattedText("UMV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32590),
                MineTweakerAPI.format.green(ExpandString.asFormattedText("UXV-tier")))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1156),
                ExpandString.asFormattedText("Work Area 16 Blocks Radius = 4 Chunks"))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2100),
                ExpandString.asFormattedText("Work Area 32 Blocks Radius = 16 Chunks"))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 2101),
                ExpandString.asFormattedText("Work Area 48 Blocks Radius = 36 Chunks"))
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1173),
                ExpandString.asFormattedText("Work Area 128 Blocks Radius = 256 Chunks"))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 0))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 0))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 1))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 1))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 2))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 2))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 3))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 3))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 4))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 4))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 5))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 5))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 6))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 6))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 7))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 7))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 8))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 8))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 9))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 9))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 10))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 10))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 11))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 11))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 12))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 12))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 13))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 13))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 14))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 14))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 15))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 15))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 16))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 16))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 17))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 17))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 18))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 18))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 19))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 19))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 20))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 20))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 21))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 21))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 22))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 22))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 23))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 23))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 24))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 24))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 25))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 25))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 26))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 26))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 27))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 27))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 28))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 28))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 29))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 29))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 30))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 30))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 31))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 31))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 32))
        MineTweakerAPI.oreDict["combEv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 32))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 33))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 33))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 34))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 34))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 35))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 35))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 36))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 36))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 37))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 37))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 38))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 38))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 39))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 39))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 40))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 40))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 41))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 41))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 42))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 42))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 43))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 43))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 44))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 44))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 45))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 45))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 46))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 46))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 47))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 47))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 48))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 48))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 49))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 49))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 50))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 50))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 51))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 51))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 52))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 52))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 53))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 53))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 54))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 54))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 55))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 55))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 56))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 56))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 57))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 57))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 58))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 58))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 59))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 59))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 60))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 60))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 61))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 61))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 62))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 62))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 63))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 63))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 64))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 64))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 65))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 65))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 66))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 66))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 67))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 67))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 68))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 68))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 69))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 69))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 70))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 70))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 71))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 71))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 72))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 72))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 73))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 73))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 74))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 74))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 75))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 75))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 76))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 76))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 77))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 77))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 78))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 78))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 79))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 79))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 80))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 80))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 81))
        MineTweakerAPI.oreDict["combLv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 81))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 82))
        MineTweakerAPI.oreDict["combEv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 82))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 83))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 83))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 84))
        MineTweakerAPI.oreDict["combLuv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 84))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 85))
        MineTweakerAPI.oreDict["combZPM"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 85))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 86))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 86))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 87))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 87))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 88))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 88))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 89))
        MineTweakerAPI.oreDict["combEv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 89))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 90))
        MineTweakerAPI.oreDict["combEv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 90))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 91))
        MineTweakerAPI.oreDict["combHv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 91))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 92))
        MineTweakerAPI.oreDict["combEv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 92))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 93))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 93))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 94))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 94))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 95))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 95))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 96))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 96))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 97))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 97))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 98))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 98))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 99))
        MineTweakerAPI.oreDict["combLuv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 99))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 100))
        MineTweakerAPI.oreDict["combLuv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 100))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 101))
        MineTweakerAPI.oreDict["combZPM"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 101))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 102))
        MineTweakerAPI.oreDict["combEv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 102))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 103))
        MineTweakerAPI.oreDict["combEv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 103))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 104))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 104))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 105))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 105))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 106))
        MineTweakerAPI.oreDict["combMv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 106))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 107))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 107))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 108))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 108))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 109))
        MineTweakerAPI.oreDict["combIv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 109))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 110))
        MineTweakerAPI.oreDict["combLuv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 110))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 111))
        MineTweakerAPI.oreDict["combLuv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 111))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 112))
        MineTweakerAPI.oreDict["combLuv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 112))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 113))
        MineTweakerAPI.oreDict["combZPM"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 113))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 114))
        MineTweakerAPI.oreDict["combZPM"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 114))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 115))
        MineTweakerAPI.oreDict["combZPM"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 115))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 116))
        MineTweakerAPI.oreDict["combZPM"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 116))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 117))
        MineTweakerAPI.oreDict["combUv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 117))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 118))
        MineTweakerAPI.oreDict["combUhv"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 118))
        ore.add(ItemBracketHandler.getItem("gregtech:gt.comb", 119))
        MineTweakerAPI.oreDict["combUev"].add(ItemBracketHandler.getItem("gregtech:gt.comb", 119))
        val hashMap = HashMap<IItemStack, IOreDictEntry>()
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414)] = OreBracketHandler.getOre("dyeBlack")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32415)] = OreBracketHandler.getOre("dyeRed")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32416)] = OreBracketHandler.getOre("dyeGreen")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417)] = OreBracketHandler.getOre("dyeBrown")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418)] = OreBracketHandler.getOre("dyeBlue")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32419)] = OreBracketHandler.getOre("dyePurple")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32420)] = OreBracketHandler.getOre("dyeCyan")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32421)] = OreBracketHandler.getOre("dyeLightGray")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32422)] = OreBracketHandler.getOre("dyeGray")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32423)] = OreBracketHandler.getOre("dyePink")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32424)] = OreBracketHandler.getOre("dyeLime")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32425)] = OreBracketHandler.getOre("dyeYellow")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32426)] = OreBracketHandler.getOre("dyeLightBlue")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32427)] = OreBracketHandler.getOre("dyeMagenta")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32428)] = OreBracketHandler.getOre("dyeOrange")
        hashMap[ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429)] = OreBracketHandler.getOre("dyeWhite")
        for ((key, value) in hashMap) {
            MineTweakerAPI.recipes.addShapeless(key, arrayOf<IIngredient>(value), null)
        }
    }
}