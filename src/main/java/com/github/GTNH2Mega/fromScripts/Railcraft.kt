package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels
import gttweaker.mods.gregtech.Fuels
import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientAny
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import minetweaker.mods.ic2.machines.SemiFluidGenerator
import modtweaker2.mods.forestry.handlers.Carpenter
import modtweaker2.mods.forestry.handlers.ThermionicFabricator
import modtweaker2.mods.railcraft.handlers.BlastFurnace
import modtweaker2.mods.railcraft.handlers.RockCrusher
import modtweaker2.mods.railcraft.handlers.RollingMachine
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Research
import modtweaker2.mods.thaumcraft.handlers.Warp
import java.util.*
import net.minecraftforge.oredict.OreDictionary

class Railcraft : Runnable {
    override fun run() {
        val ore = OreBracketHandler.getOre("plateAnyIron")
        val ore2 = OreBracketHandler.getOre("paneGlass")
        ItemBracketHandler.getItem("minecraft:iron_bars", 0)
        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)
        val ore3 = OreBracketHandler.getOre("plateSteel")
        val ore4 = OreBracketHandler.getOre("plateRedAlloy")
        OreBracketHandler.getOre("plankWood")
        OreBracketHandler.getOre("gearAnyIron")
        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804)
        OreBracketHandler.getOre("plateDenseObsidian")
        OreBracketHandler.getOre("glass")
        OreBracketHandler.getOre("gearTungstenSteel")
        val ore5 = OreBracketHandler.getOre("stickAnyIron")
        val ore6 = OreBracketHandler.getOre("stickSteel")
        val ore7 = OreBracketHandler.getOre("stickRedAlloy")
        OreBracketHandler.getOre("stickStainlessSteel")
        val ore8 = OreBracketHandler.getOre("stickTin")
        val ore9 = OreBracketHandler.getOre("plateGold")
        OreBracketHandler.getOre("plateDiamond")
        val ore10 = OreBracketHandler.getOre("plateEmerald")
        OreBracketHandler.getOre("ingotIron")
        OreBracketHandler.getOre("dyeRed")
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 101)
        ItemBracketHandler.getItem("Railcraft:machine.beta", 4)
        ItemBracketHandler.getItem("Railcraft:machine.beta", 1)
        ItemBracketHandler.getItem("gregtech:gt.blockcasings2", 0)
        OreBracketHandler.getOre("stoneObsidian")
        val ore11 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val ore12 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore13 = OreBracketHandler.getOre("craftingToolSaw")
        val item = ItemBracketHandler.getItem("minecraft:piston", 0)
        val item2 = ItemBracketHandler.getItem("Railcraft:anvil", 0)
        val ore14 = OreBracketHandler.getOre("craftingToolWrench")
        val item3 = ItemBracketHandler.getItem("Railcraft:stair", 6)
        val item4 = ItemBracketHandler.getItem("Railcraft:stair", 43)
        val item5 = ItemBracketHandler.getItem("Railcraft:stair", 40)
        val item6 = ItemBracketHandler.getItem("Railcraft:stair", 41)
        val item7 = ItemBracketHandler.getItem("Railcraft:stair", 42)
        val item8 = ItemBracketHandler.getItem("Railcraft:stair", 7)
        val item9 = ItemBracketHandler.getItem("Railcraft:stair", 8)
        val item10 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 0)
        val item11 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 1)
        val item12 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 2)
        val item13 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 3)
        val item14 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 4)
        val item15 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 5)
        val item16 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 6)
        val item17 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 7)
        val item18 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 8)
        val item19 = ItemBracketHandler.getItem("Railcraft:lantern.stone", 9)
        val item20 = ItemBracketHandler.getItem("Railcraft:lantern.metal", 0)
        val item21 = ItemBracketHandler.getItem("Railcraft:lantern.metal", 1)
        val item22 = ItemBracketHandler.getItem("Railcraft:lantern.metal", 2)
        val item23 = ItemBracketHandler.getItem("Railcraft:lantern.metal", 3)
        val item24 = ItemBracketHandler.getItem("Railcraft:lantern.metal", 4)
        val item25 = ItemBracketHandler.getItem("Railcraft:lantern.metal", 5)
        val item26 = ItemBracketHandler.getItem("Railcraft:slab", 28)
        val item27 = ItemBracketHandler.getItem("Railcraft:slab", 26)
        val item28 = ItemBracketHandler.getItem("Railcraft:slab", 27)
        val item29 = ItemBracketHandler.getItem("Railcraft:slab", 24)
        val item30 = ItemBracketHandler.getItem("Railcraft:slab", 23)
        val item31 = ItemBracketHandler.getItem("Railcraft:slab", 29)
        val item32 = ItemBracketHandler.getItem("Railcraft:slab", 25)
        val item33 = ItemBracketHandler.getItem("Railcraft:slab", 22)
        val item34 = ItemBracketHandler.getItem("minecraft:stone_slab", 1)
        val item35 = ItemBracketHandler.getItem("minecraft:stone_slab", 0)
        ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0)
        val ore15 = OreBracketHandler.getOre("logWood")
        val ore16 = OreBracketHandler.getOre("stoneBricks")
        val ore17 = OreBracketHandler.getOre("stoneMossy")
        val item36 = ItemBracketHandler.getItem("minecraft:minecart", 0)
        val ore18 = OreBracketHandler.getOre("stoneCobble")
        val ore19 = OreBracketHandler.getOre("slabWood")
        val item37 = ItemBracketHandler.getItem("minecraft:tnt", 0)
        val ore20 = OreBracketHandler.getOre("itemLeather")
        val item38 = ItemBracketHandler.getItem("minecraft:brick", 0)
        val item39 = ItemBracketHandler.getItem("Railcraft:machine.beta", 0)
        val item40 = ItemBracketHandler.getItem("Railcraft:tool.crowbar", 0)
        OreBracketHandler.getOre("blockRedstone")
        val ore21 = OreBracketHandler.getOre("blockIron")
        val ore22 = OreBracketHandler.getOre("blockSteel")
        val ore23 = OreBracketHandler.getOre("blockCopper")
        val ore24 = OreBracketHandler.getOre("blockTin")
        val ore25 = OreBracketHandler.getOre("blockLead")
        val ore26 = OreBracketHandler.getOre("blockGold")
        val ore27 = OreBracketHandler.getOre("blockDiamond")
        val item41 = ItemBracketHandler.getItem("minecraft:torch", 0)
        val item42 = ItemBracketHandler.getItem("minecraft:stone", 0)
        val item43 = ItemBracketHandler.getItem("minecraft:lever", 0)
        ItemBracketHandler.getItem("minecraft:cauldron", 0)
        ItemBracketHandler.getItem("minecraft:brick_block", 0)
        val ore28 = OreBracketHandler.getOre("stickWood")
        val item44 = ItemBracketHandler.getItem("minecraft:dispenser", 0)
        val ore29 = OreBracketHandler.getOre("stoneNetherBrick")
        val ore30 = OreBracketHandler.getOre("blockWool")
        val item45 = ItemBracketHandler.getItem("minecraft:shears", 0)
        val item46 = ItemBracketHandler.getItem("minecraft:heavy_weighted_pressure_plate", 0)
        val item47 = ItemBracketHandler.getItem("minecraft:chest", 0)
        val item48 = ItemBracketHandler.getItem("minecraft:hopper", 0)
        val item49 = ItemBracketHandler.getItem("minecraft:sticky_piston", 0)
        val item50 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640)
        val ore31 = OreBracketHandler.getOre("plateCopper")
        val ore32 = OreBracketHandler.getOre("plateTin")
        val ore33 = OreBracketHandler.getOre("plateLead")
        OreBracketHandler.getOre("plateIridium")
        val ore34 = OreBracketHandler.getOre("lensDiamond")
        val ore35 = OreBracketHandler.getOre("screwGold")
        val ore36 = OreBracketHandler.getOre("screwCopper")
        val ore37 = OreBracketHandler.getOre("screwTin")
        val ore38 = OreBracketHandler.getOre("screwLead")
        OreBracketHandler.getOre("screwBronze")
        val ore39 = OreBracketHandler.getOre("screwAnyIron")
        val ore40 = OreBracketHandler.getOre("screwSteel")
        OreBracketHandler.getOre("screwTitanium")
        val ore41 = OreBracketHandler.getOre("screwStainlessSteel")
        OreBracketHandler.getOre("screwTungstenSteel")
        OreBracketHandler.getOre("gearBronze")
        OreBracketHandler.getOre("gearStainlessSteel")
        OreBracketHandler.getOre("gearTitanium")
        val ore42 = OreBracketHandler.getOre("plateBronze")
        OreBracketHandler.getOre("plateStainlessSteel")
        OreBracketHandler.getOre("plateTitanium")
        OreBracketHandler.getOre("plateLapis")
        val item51 = ItemBracketHandler.getItem("Railcraft:fuel.coke", 0)
        val item52 = ItemBracketHandler.getItem("Railcraft:cube", 0)
        val item53 = ItemBracketHandler.getItem("Railcraft:cube", 8)
        val item54 = ItemBracketHandler.getItem("Railcraft:slab", 38)
        val item55 = ItemBracketHandler.getItem("Railcraft:cube", 1)
        val item56 = ItemBracketHandler.getItem("Railcraft:slab", 2)
        val item57 = ItemBracketHandler.getItem("Railcraft:part.rebar", 0)
        val item58 = ItemBracketHandler.getItem("Railcraft:signal", 4)
        val item59 = ItemBracketHandler.getItem("Railcraft:signal", 2)
        val item60 = ItemBracketHandler.getItem("Railcraft:detector", 1)
        val item61 = ItemBracketHandler.getItem("Railcraft:detector", 9)
        val item62 = ItemBracketHandler.getItem("Railcraft:brick.infernal", 0)
        val item63 = ItemBracketHandler.getItem("Railcraft:part.signal.lamp", 0)
        val item64 = ItemBracketHandler.getItem("Railcraft:part.circuit", 1)
        val item65 = ItemBracketHandler.getItem("Railcraft:part.circuit", 2)
        val item66 = ItemBracketHandler.getItem("Railcraft:part.circuit", 0)
        val item67 = ItemBracketHandler.getItem("Railcraft:track", 736)
        val hashMap = HashMap<String, IData>()
        hashMap["track"] = ExpandString.asData("railcraft:track.slow")
        val withTag = item67.withTag(ExpandAnyDict.asData(hashMap))
        val item68 = ItemBracketHandler.getItem("minecraft:rail", 0)
        val item69 = ItemBracketHandler.getItem("Railcraft:track", 24050)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["track"] = ExpandString.asData("railcraft:track.reinforced")
        val withTag2 = item69.withTag(ExpandAnyDict.asData(hashMap2))
        val item70 = ItemBracketHandler.getItem("Railcraft:track", 816)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["track"] = ExpandString.asData("railcraft:track.speed")
        val withTag3 = item70.withTag(ExpandAnyDict.asData(hashMap3))
        val item71 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["track"] = ExpandString.asData("railcraft:track.electric")
        val withTag4 = item71.withTag(ExpandAnyDict.asData(hashMap4))
        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5123)
        val item72 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 5133)
        val item73 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32610)
        val item74 = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600)
        val item75 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1362)
        val item76 = ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1422)
        OreBracketHandler.getOre("wireGt01RedAlloy")

        //TODO investigate getters with no target field for ("TConstruct:GlassPane", 0)
        //ItemBracketHandler.getItem("TConstruct:GlassPane", 0)

        val item77 = ItemBracketHandler.getItem("ForgeMicroblock:stoneRod", 0)
        ItemBracketHandler.getItem("IC2:blockMachine", 1)
        val ore43 = OreBracketHandler.getOre("cableGt01Tin")
        val item78 = ItemBracketHandler.getItem("Railcraft:part.rail", 0)
        val item79 = ItemBracketHandler.getItem("Railcraft:part.rail", 1)
        val item80 = ItemBracketHandler.getItem("Railcraft:part.rail", 2)
        val item81 = ItemBracketHandler.getItem("Railcraft:part.rail", 3)
        val item82 = ItemBracketHandler.getItem("Railcraft:part.rail", 4)
        val item83 = ItemBracketHandler.getItem("Railcraft:part.rail", 5)
        val item84 = ItemBracketHandler.getItem("Railcraft:part.railbed", 0)
        val item85 = ItemBracketHandler.getItem("Railcraft:part.railbed", 1)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(item8)
        MineTweakerAPI.recipes.remove(item9)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(item16)
        MineTweakerAPI.recipes.remove(item17)
        MineTweakerAPI.recipes.remove(item18)
        MineTweakerAPI.recipes.remove(item19)
        MineTweakerAPI.recipes.remove(item20)
        MineTweakerAPI.recipes.remove(item21)
        MineTweakerAPI.recipes.remove(item22)
        MineTweakerAPI.recipes.remove(item23)
        MineTweakerAPI.recipes.remove(item24)
        MineTweakerAPI.recipes.remove(item25)
        MineTweakerAPI.recipes.remove(item52)
        MineTweakerAPI.recipes.remove(item51)
        MineTweakerAPI.recipes.remove(item53)
        MineTweakerAPI.recipes.remove(item54)
        MineTweakerAPI.recipes.remove(item55)
        MineTweakerAPI.recipes.remove(item56)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:track", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:track.elevator", 0))
        MineTweakerAPI.recipes.remove(item58)
        MineTweakerAPI.recipes.remove(item59)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:signal", 0))
        MineTweakerAPI.recipes.remove(item85)
        MineTweakerAPI.recipes.remove(item80)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:part.tie", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:detector", 16))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.epsilon", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.epsilon", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.epsilon", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.epsilon", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:post", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:post", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:post", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:post", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:post", 6))
        MineTweakerAPI.recipes.remove(item63)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:glass", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:part.gear", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:part.gear", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:part.gear", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:part.gear", 3))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:cart.energy.batbox", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:cart.energy.cesu", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:cart.energy.mfe", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:cart.tank", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:cart.anchor.personal", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:cart.anchor", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:cart.work", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:tool.electric.meter", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:armor.goggles", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:tool.magnifying.glass", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:tool.signal.tuner", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("Railcraft:tool.surveyor", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.alpha", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:brick.sandy", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:backpack.trackman.t1", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Railcraft:backpack.trackman.t2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:backpack.iceman.t1", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Railcraft:backpack.iceman.t2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:backpack.apothecary.t1", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("Railcraft:backpack.apothecary.t2", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:frame", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:tool.steel.shears", 0))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("Railcraft:ingot", 0))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("Railcraft:cube", 2))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("Railcraft:nugget", 1))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11340))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11341))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11322))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11355))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11365))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11381))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11379))
        BlastFurnace.removeRecipe(ItemBracketHandler.getItem("bartworks:gt.bwMetaGenerateddust", 39))
        RockCrusher.removeRecipe(IngredientAny.INSTANCE)
        Arcane.removeRecipe(ItemBracketHandler.getItem("Railcraft:tool.crowbar.magic", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Railcraft:tool.crowbar.void", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:brick.infernal", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:upgrade.lapotron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:cart.cargo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:cart.track.relayer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:cart.undercutter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:cart.track.layer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:cart.track.remover", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:firestone.cut", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:firestone.refined", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:cart.redstone.flux", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Railcraft:machine.gamma", 11))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:frame", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAnyRubber"),
                        OreBracketHandler.getOre("plateSteel"), OreBracketHandler.getOre("plateAnyRubber")),
                        arrayOf(ItemBracketHandler.getItem("Railcraft:part.rebar", 0),
                                OreBracketHandler.getOre("craftingToolWrench"),
                                ItemBracketHandler.getItem("Railcraft:part.rebar", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Railcraft:part.rebar", 0),
                                ItemBracketHandler.getItem("Railcraft:part.rebar", 0),
                                ItemBracketHandler.getItem("Railcraft:part.rebar", 0))), null)
        MineTweakerAPI.recipes.addShaped(item56.amount(2), arrayOf(arrayOf(ore13, item55)), null)
        val recipes = MineTweakerAPI.recipes
        val item86 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["track"] = ExpandString.asData("railcraft:track.control")
        recipes.addShaped(item86.withTag(ExpandAnyDict.asData(hashMap5)),
                arrayOf(arrayOf<IIngredient>(ore40, ore7, ore40), arrayOf<IIngredient>(item79, item68, item79),
                        arrayOf<IIngredient>(ore11, ore7, ore12)), null)
        val recipes2 = MineTweakerAPI.recipes
        val item87 = ItemBracketHandler.getItem("Railcraft:track", 20176)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["track"] = ExpandString.asData("railcraft:track.locking")
        recipes2.addShaped(item87.withTag(ExpandAnyDict.asData(hashMap6)),
                arrayOf(arrayOf(ore40, item60, ore40), arrayOf<IIngredient>(item79, item84, item79),
                        arrayOf<IIngredient>(ore11, ore7, ore12)), null)
        val recipes3 = MineTweakerAPI.recipes
        val item88 = ItemBracketHandler.getItem("Railcraft:track", 23575)
        val hashMap7 = HashMap<String, IData>()
        hashMap7["track"] = ExpandString.asData("railcraft:track.disembarking")
        recipes3.addShaped(item88.withTag(ExpandAnyDict.asData(hashMap7)),
                arrayOf(arrayOf(ore40, item84, ore40), arrayOf<IIngredient>(item79, item61, item79),
                        arrayOf<IIngredient>(ore11, ore7, ore12)), null)
        val recipes4 = MineTweakerAPI.recipes
        val item89 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap8 = HashMap<String, IData>()
        hashMap8["track"] = ExpandString.asData("railcraft:track.embarking")
        recipes4.addShaped(item89.withTag(ExpandAnyDict.asData(hashMap8)),
                arrayOf(arrayOf<IIngredient>(ore40, OreBracketHandler.getOre("gemEnderEye"), ore40),
                        arrayOf<IIngredient>(item79, item84, item79),
                        arrayOf<IIngredient>(ore11, OreBracketHandler.getOre("gemEnderEye"), ore12)), null)
        val recipes5 = MineTweakerAPI.recipes
        val item90 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap9 = HashMap<String, IData>()
        hashMap9["track"] = ExpandString.asData("railcraft:track.coupler")
        recipes5.addShaped(item90.withTag(ExpandAnyDict.asData(hashMap9)),
                arrayOf(arrayOf(ore40, ItemBracketHandler.getItem("Railcraft:tool.crowbar.reinforced", 0), ore40),
                        arrayOf<IIngredient>(item79, item84, item79),
                        arrayOf(ore11, ItemBracketHandler.getItem("Railcraft:tool.crowbar.reinforced", 0), ore12)),
                null)
        val recipes6 = MineTweakerAPI.recipes
        val item91 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap10 = HashMap<String, IData>()
        hashMap10["track"] = ExpandString.asData("railcraft:track.whistle")
        recipes6.addShaped(item91.withTag(ExpandAnyDict.asData(hashMap10)),
                arrayOf(arrayOf(ore39, ItemBracketHandler.getItem("Railcraft:tool.whistle.tuner", 0), ore39),
                        arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, ItemBracketHandler.getItem("gregtech:gt.blockcasings3", 0), ore12)), null)
        val recipes7 = MineTweakerAPI.recipes
        val item92 = ItemBracketHandler.getItem("Railcraft:track", 30516)
        val hashMap11 = HashMap<String, IData>()
        hashMap11["track"] = ExpandString.asData("railcraft:track.locomotive")
        recipes7.addShaped(item92.withTag(ExpandAnyDict.asData(hashMap11)),
                arrayOf(arrayOf(ore39, ItemBracketHandler.getItem("Railcraft:signal", 11), ore39),
                        arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, ItemBracketHandler.getItem("Railcraft:signal", 3), ore12)), null)
        val recipes8 = MineTweakerAPI.recipes
        val item93 = ItemBracketHandler.getItem("Railcraft:track", 16093)
        val hashMap12 = HashMap<String, IData>()
        hashMap12["track"] = ExpandString.asData("railcraft:track.limiter")
        recipes8.addShaped(item93.withTag(ExpandAnyDict.asData(hashMap12)),
                arrayOf(arrayOf<IIngredient>(ore39, ore4, ore39), arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, item60, ore12)), null)
        val recipes9 = MineTweakerAPI.recipes
        val item94 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap13 = HashMap<String, IData>()
        hashMap13["track"] = ExpandString.asData("railcraft:track.routing")
        recipes9.addShaped(item94.withTag(ExpandAnyDict.asData(hashMap13)),
                arrayOf(arrayOf<IIngredient>(ore39, ore4, ore39), arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, ItemBracketHandler.getItem("Railcraft:routing.ticket", 0), ore12)), null)
        val recipes10 = MineTweakerAPI.recipes
        val item95 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap14 = HashMap<String, IData>()
        hashMap14["track"] = ExpandString.asData("railcraft:track.routing")
        recipes10.addShaped(item95.withTag(ExpandAnyDict.asData(hashMap14)),
                arrayOf(arrayOf<IIngredient>(ore39, ore4, ore39), arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, ItemBracketHandler.getItem("Railcraft:routing.ticket.gold", 0), ore12)), null)
        val recipes11 = MineTweakerAPI.recipes
        val item96 = ItemBracketHandler.getItem("Railcraft:track", 32363)
        val hashMap15 = HashMap<String, IData>()
        hashMap15["track"] = ExpandString.asData("railcraft:track.buffer.stop")
        recipes11.addShaped(item96.withTag(ExpandAnyDict.asData(hashMap15)).amount(2),
                arrayOf(arrayOf<IIngredient>(ore39, ore3, ore39), arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf<IIngredient>(ore11, ore22, ore12)), null)
        val recipes12 = MineTweakerAPI.recipes
        val item97 = ItemBracketHandler.getItem("Railcraft:track", 30946)
        val hashMap16 = HashMap<String, IData>()
        hashMap16["track"] = ExpandString.asData("railcraft:track.oneway")
        recipes12.addShaped(item97.withTag(ExpandAnyDict.asData(hashMap16)),
                arrayOf(arrayOf(ore39, item60, ore39), arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, item, ore12)), null)
        val recipes13 = MineTweakerAPI.recipes
        val item98 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap17 = HashMap<String, IData>()
        hashMap17["track"] = ExpandString.asData("railcraft:track.detector.direction")
        recipes13.addShaped(item98.withTag(ExpandAnyDict.asData(hashMap17)),
                arrayOf(arrayOf<IIngredient>(ore39, ore4, ore39), arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, item61, ore12)), null)
        val recipes14 = MineTweakerAPI.recipes
        val item99 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap18 = HashMap<String, IData>()
        hashMap18["track"] = ExpandString.asData("railcraft:track.gated.oneway")
        val withTag5 = item99.withTag(ExpandAnyDict.asData(hashMap18))
        val array = arrayOf(arrayOf<IIngredient?>(ore40, ore4, ore40), null, null)
        val n = 1
        val array2 = arrayOf<IIngredient?>(item79, null, null)
        val n2 = 1
        val item100 = ItemBracketHandler.getItem("Railcraft:track", 19746)
        val hashMap19 = HashMap<String, IData>()
        hashMap19["track"] = ExpandString.asData("railcraft:track.gated")
        array2[n2] = item100.withTag(ExpandAnyDict.asData(hashMap19))
        array2[2] = item79
        array[n] = array2
        array[2] = arrayOf(ore11, ore4, ore12)
        recipes14.addShaped(withTag5, array, null)
        val recipes15 = MineTweakerAPI.recipes
        val item101 = ItemBracketHandler.getItem("Railcraft:track", 19746)
        val hashMap20 = HashMap<String, IData>()
        hashMap20["track"] = ExpandString.asData("railcraft:track.gated")
        recipes15.addShaped(item101.withTag(ExpandAnyDict.asData(hashMap20)),
                arrayOf(arrayOf(ore39, ItemBracketHandler.getItem("minecraft:fence_gate", 0), ore39),
                        arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, ItemBracketHandler.getItem("minecraft:fence_gate", 0), ore12)), null)
        val recipes16 = MineTweakerAPI.recipes
        val item102 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap21 = HashMap<String, IData>()
        hashMap21["track"] = ExpandString.asData("railcraft:track.suspended")
        recipes16.addShaped(item102.withTag(ExpandAnyDict.asData(hashMap21)),
                arrayOf(arrayOf(ore39, ItemBracketHandler.getItem("Railcraft:post", 2), ore39),
                        arrayOf<IIngredient>(item78, item84, item78),
                        arrayOf(ore11, ItemBracketHandler.getItem("Railcraft:post", 2), ore12)), null)
        val recipes17 = MineTweakerAPI.recipes
        val item103 = ItemBracketHandler.getItem("Railcraft:track", 2264)
        val hashMap22 = HashMap<String, IData>()
        hashMap22["track"] = ExpandString.asData("railcraft:track.disposal")
        recipes17.addShaped(item103.withTag(ExpandAnyDict.asData(hashMap22)),
                arrayOf(arrayOf(ore39, ItemBracketHandler.getItem("Railcraft:part.tie", 0), ore39),
                        arrayOf(item78, ore3, item78),
                        arrayOf(ore11, ItemBracketHandler.getItem("Railcraft:part.tie", 0), ore12)), null)
        val recipes18 = MineTweakerAPI.recipes
        val item104 = ItemBracketHandler.getItem("Railcraft:track", 736)
        val hashMap23 = HashMap<String, IData>()
        hashMap23["track"] = ExpandString.asData("railcraft:track.slow")
        recipes18.addShaped(item104.withTag(ExpandAnyDict.asData(hashMap23)).amount(16),
                arrayOf(arrayOf<IIngredient?>(ore39, null, ore39), arrayOf<IIngredient?>(item80, item84, item80),
                        arrayOf<IIngredient?>(ore11, null, ore12)), null)
        val recipes19 = MineTweakerAPI.recipes
        val item105 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap24 = HashMap<String, IData>()
        hashMap24["track"] = ExpandString.asData("railcraft:track.slow.boost")
        recipes19.addShaped(item105.withTag(ExpandAnyDict.asData(hashMap24)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore39, ore4, ore39), arrayOf<IIngredient>(item79, item84, item79),
                        arrayOf<IIngredient>(ore11, ore4, ore12)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:golden_rail", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore40, ore4, ore40), arrayOf<IIngredient>(item79, item84, item79),
                        arrayOf<IIngredient>(ore11, ore4, ore12)), null)
        val recipes20 = MineTweakerAPI.recipes
        val item106 = ItemBracketHandler.getItem("Railcraft:track", 24050)
        val hashMap25 = HashMap<String, IData>()
        hashMap25["track"] = ExpandString.asData("railcraft:track.reinforced")
        recipes20.addShaped(item106.withTag(ExpandAnyDict.asData(hashMap25)).amount(8),
                arrayOf(arrayOf<IIngredient?>(ore41, null, ore41), arrayOf<IIngredient?>(item82, item85, item82),
                        arrayOf<IIngredient?>(ore11, null, ore12)), null)
        val recipes21 = MineTweakerAPI.recipes
        val item107 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap26 = HashMap<String, IData>()
        hashMap26["track"] = ExpandString.asData("railcraft:track.reinforced.boost")
        recipes21.addShaped(item107.withTag(ExpandAnyDict.asData(hashMap26)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore41, ore4, ore41), arrayOf<IIngredient>(item82, item85, item82),
                        arrayOf<IIngredient>(ore11, ore4, ore12)), null)
        val recipes22 = MineTweakerAPI.recipes
        val item108 = ItemBracketHandler.getItem("Railcraft:track", 10192)
        val hashMap27 = HashMap<String, IData>()
        hashMap27["track"] = ExpandString.asData("railcraft:track.electric")
        recipes22.addShaped(item108.withTag(ExpandAnyDict.asData(hashMap27)).amount(8),
                arrayOf(arrayOf(ore36, item83, ore36), arrayOf<IIngredient>(item83, item85, item83),
                        arrayOf(ore11, item83, ore12)), null)
        val recipes23 = MineTweakerAPI.recipes
        val item109 = ItemBracketHandler.getItem("Railcraft:track", 816)
        val hashMap28 = HashMap<String, IData>()
        hashMap28["track"] = ExpandString.asData("railcraft:track.speed")
        recipes23.addShaped(item109.withTag(ExpandAnyDict.asData(hashMap28)).amount(8),
                arrayOf(arrayOf<IIngredient?>(ore40, null, ore40), arrayOf<IIngredient?>(item81, item85, item81),
                        arrayOf<IIngredient?>(ore11, null, ore12)), null)
        val recipes24 = MineTweakerAPI.recipes
        val item110 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap29 = HashMap<String, IData>()
        hashMap29["track"] = ExpandString.asData("railcraft:track.speed.boost")
        recipes24.addShaped(item110.withTag(ExpandAnyDict.asData(hashMap29)).amount(4),
                arrayOf(arrayOf<IIngredient>(ore40, ore4, ore40), arrayOf<IIngredient>(item81, item85, item81),
                        arrayOf<IIngredient>(ore11, ore4, ore12)), null)
        val recipes25 = MineTweakerAPI.recipes
        val item111 = ItemBracketHandler.getItem("Railcraft:track", 26865)
        val hashMap30 = HashMap<String, IData>()
        hashMap30["track"] = ExpandString.asData("railcraft:track.speed.transition")
        recipes25.addShaped(item111.withTag(ExpandAnyDict.asData(hashMap30)),
                arrayOf(arrayOf(ore40, withTag3, ore40), arrayOf(ore4, item85, ore4), arrayOf(ore11, withTag3, ore12)),
                null)
        val recipes26 = MineTweakerAPI.recipes
        val item112 = ItemBracketHandler.getItem("Railcraft:track", 8103)
        val hashMap31 = HashMap<String, IData>()
        hashMap31["track"] = ExpandString.asData("railcraft:track.priming")
        recipes26.addShaped(item112.withTag(ExpandAnyDict.asData(hashMap31)),
                arrayOf(arrayOf(ore40, item60, ore40), arrayOf<IIngredient>(item82, item85, item82),
                        arrayOf(ore11, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32476), ore12)), null)
        val recipes27 = MineTweakerAPI.recipes
        val item113 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap32 = HashMap<String, IData>()
        hashMap32["track"] = ExpandString.asData("railcraft:track.launcher")
        recipes27.addShaped(item113.withTag(ExpandAnyDict.asData(hashMap32)),
                arrayOf(arrayOf(ore40, withTag2, ore40), arrayOf(ore22, item, ore22),
                        arrayOf<IIngredient>(ore11, ore4, ore12)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:track.elevator", 0).amount(2),
                arrayOf(arrayOf(ore40, item60, ore40), arrayOf<IIngredient>(item79, item68, item79),
                        arrayOf<IIngredient>(ore11, ore4, ore12)), null)
        MineTweakerAPI.recipes.addShaped(item58,
                arrayOf(arrayOf<IIngredient>(ore40, ore7, ore8), arrayOf(item43, item49, ore40),
                        arrayOf<IIngredient>(ore3, ore3, ore3)), null)
        MineTweakerAPI.recipes.addShaped(item59,
                arrayOf(arrayOf<IIngredient>(ore40, ore7, ore8), arrayOf<IIngredient>(item74, item50, item64),
                        arrayOf<IIngredient>(ore3, ore3, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 3),
                arrayOf(arrayOf(item63, item65, ore3), arrayOf<IIngredient?>(null, null, ore3),
                        arrayOf<IIngredient?>(null, null, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 11),
                arrayOf(arrayOf(item63, item64, ore3), arrayOf<IIngredient?>(null, null, ore3),
                        arrayOf<IIngredient?>(null, null, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 1),
                arrayOf(arrayOf(item63, item65, ore3), arrayOf<IIngredient>(ore3, ore3, ore3),
                        arrayOf(item63, item64, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 12),
                arrayOf(arrayOf(item63, item64, ore3), arrayOf<IIngredient>(ore3, ore3, ore3),
                        arrayOf(item63, item64, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 13),
                arrayOf(arrayOf(ore3, item65, ore3), arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 9),
                arrayOf(arrayOf(ore3, item66, ore3), arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 10),
                arrayOf(arrayOf(ore3, item66, ore3),
                        arrayOf(ore3, ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26),
                                ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 8),
                arrayOf(arrayOf(ore3, item64, ore3), arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 7),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 10),
                        ore3), arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 6),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26),
                        ore3), arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:signal", 0),
                arrayOf(arrayOf(ore3, item64, ore3), arrayOf(ore3, item66, ore3),
                        arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(item80.amount(6),
                arrayOf(arrayOf(ore5, ItemBracketHandler.getItem("Railcraft:part.tie", 0), ore28),
                        arrayOf(ore5, ItemBracketHandler.getItem("Railcraft:part.tie", 0), ore28),
                        arrayOf(ore5, ItemBracketHandler.getItem("Railcraft:part.tie", 0), ore28)), null)
        MineTweakerAPI.recipes.addShaped(item80.amount(4),
                arrayOf(arrayOf(ore5, ItemBracketHandler.getItem("Railcraft:part.tie", 0), ore28),
                        arrayOf(ore5, ItemBracketHandler.getItem("Railcraft:part.tie", 0), ore28), arrayOfNulls(3)),
                null)
        MineTweakerAPI.recipes.addShaped(item80.amount(2),
                arrayOf(arrayOf(ore5, ItemBracketHandler.getItem("Railcraft:part.tie", 0), ore28), arrayOfNulls(3),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 0),
                arrayOf(arrayOf(ore15, item68, ore15), arrayOf(ore4, item46, ore4),
                        arrayOf<IIngredient>(ore15, ore4, ore15)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 1),
                arrayOf(arrayOf<IIngredient>(item42, ItemBracketHandler.getItem("minecraft:minecart", 0), item42),
                        arrayOf(ore4, item46, ore4), arrayOf(item42, ore4, item42)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 2),
                arrayOf(arrayOf<IIngredient?>(ore16, null, ore16), arrayOf(ore4, item46, ore4),
                        arrayOf<IIngredient?>(ore16, ore4, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 3),
                arrayOf(arrayOf(ore17, ItemBracketHandler.getItem("minecraft:skull", 2), ore17),
                        arrayOf(ore4, item46, ore4), arrayOf<IIngredient>(ore17, ore4, ore17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 4), arrayOf(arrayOf(ore18,
                ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26), ore18),
                arrayOf(ore4, item46, ore4), arrayOf<IIngredient>(ore18, ore4, ore18)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 5),
                arrayOf(arrayOf<IIngredient>(item35, ItemBracketHandler.getItem("minecraft:skull", 3), item35),
                        arrayOf(ore4, item46, ore4), arrayOf(item35, ore4, item35)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 6),
                arrayOf(arrayOf(ore19, item37, ore19), arrayOf(ore4, item46, ore4),
                        arrayOf<IIngredient>(ore19, ore4, ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 7),
                arrayOf(arrayOf<IIngredient>(ore15, ore20, ore15), arrayOf(ore4, item46, ore4),
                        arrayOf<IIngredient>(ore15, ore4, ore15)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 8),
                arrayOf(arrayOf<IIngredient>(item38, item39, item38), arrayOf(ore4, item46, ore4),
                        arrayOf(item38, ore4, item38)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 9),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("Railcraft:detector", 1), ore3),
                        arrayOf(ore4, ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0), ore4),
                        arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 10),
                arrayOf(arrayOf<IIngredient>(ore32, ore43, ore32), arrayOf(ore4, item46, ore4),
                        arrayOf<IIngredient>(ore32, ore4, ore32)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 11),
                arrayOf(arrayOf<IIngredient>(ore15, OreBracketHandler.getOre("cropWheat"), ore15),
                        arrayOf(ore4, item46, ore4), arrayOf<IIngredient>(ore15, ore4, ore15)), null)
        val recipes28 = MineTweakerAPI.recipes
        val item114 = ItemBracketHandler.getItem("Railcraft:detector", 12)
        val array3: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n3 = 0
        val array4 = arrayOf<IIngredient?>(ore29, null, null)
        val n4 = 1
        val item115 = ItemBracketHandler.getItem("Railcraft:track", 30516)
        val hashMap33 = HashMap<String, IData>()
        hashMap33["track"] = ExpandString.asData("railcraft:track.locomotive")
        array4[n4] = item115.withTag(ExpandAnyDict.asData(hashMap33))
        array4[2] = ore29
        array3[n3] = array4
        array3[1] = arrayOf(ore4, item46, ore4)
        array3[2] = arrayOf(ore29, ore4, ore29)
        recipes28.addShaped(item114, array3, null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 13),
                arrayOf(arrayOf(ore30, item45, ore30), arrayOf(ore4, item46, ore4),
                        arrayOf<IIngredient>(ore30, ore4, ore30)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 14),
                arrayOf(arrayOf<IIngredient>(ore20, ore10, ore20), arrayOf(ore4, item46, ore4),
                        arrayOf<IIngredient>(ore20, ore4, ore20)), null)
        val recipes29 = MineTweakerAPI.recipes
        val item116 = ItemBracketHandler.getItem("Railcraft:detector", 15)
        val array5: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n5 = 0
        val array6 = arrayOf<IIngredient?>(item62, null, null)
        val n6 = 1
        val item117 = ItemBracketHandler.getItem("Railcraft:track", 30516)
        val hashMap34 = HashMap<String, IData>()
        hashMap34["track"] = ExpandString.asData("railcraft:track.locomotive")
        array6[n6] = item117.withTag(ExpandAnyDict.asData(hashMap34))
        array6[2] = item62
        array5[n5] = array6
        array5[1] = arrayOf(ore4, item46, ore4)
        array5[2] = arrayOf(item62, ore4, item62)
        recipes29.addShaped(item116, array5, null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:detector", 16),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:quartz_block", 1),
                        ItemBracketHandler.getItem("Railcraft:signal", 4),
                        ItemBracketHandler.getItem("minecraft:quartz_block", 1)), arrayOf(ore4, item46, ore4),
                        arrayOf(ItemBracketHandler.getItem("minecraft:quartz_block", 1), ore4,
                                ItemBracketHandler.getItem("minecraft:quartz_block", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 0),
                arrayOf(arrayOf(ore18, item48, ore18),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:detector", 0), ore4),
                        arrayOf(ore18, item47, ore18)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 1),
                arrayOf(arrayOf(ore18, item47, ore18),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:detector", 0), ore4),
                        arrayOf(ore18, item48, ore18)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 2),
                arrayOf(arrayOf(ore3, item48, ore3),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:detector", 1), ore4),
                        arrayOf(ore3, item47, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 3),
                arrayOf(arrayOf(ore3, item47, ore3),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:detector", 1), ore4),
                        arrayOf(ore3, item48, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 4),
                arrayOf(arrayOf(ore2, item72, ore2),
                        arrayOf<IIngredient>(item73, ItemBracketHandler.getItem("Railcraft:detector", 8), item74),
                        arrayOf(ore2, item39, ore2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 5),
                arrayOf(arrayOf(ore2, item39, ore2),
                        arrayOf<IIngredient>(item74, ItemBracketHandler.getItem("Railcraft:detector", 8), item73),
                        arrayOf(ore2, item72, ore2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 6),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1426), ore3),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:detector", 10), ore4),
                        arrayOf(ore3, ItemBracketHandler.getItem("IC2:itemAdvBat", OreDictionary.WILDCARD_VALUE), ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 7),
                arrayOf(arrayOf(ore3, ItemBracketHandler.getItem("IC2:itemAdvBat", OreDictionary.WILDCARD_VALUE), ore3),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:detector", 10), ore4),
                        arrayOf(ore3, ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1426), ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 8),
                arrayOf(arrayOf<IIngredient?>(item44, item36, item68), arrayOf<IIngredient?>(null, item40, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.gamma", 9),
                arrayOf(arrayOf(item40, ore4, item40),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:machine.gamma", 8), ore4),
                        arrayOf(item40, ore4, item40)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.epsilon", 0),
                arrayOf(arrayOf(ore3, item75, ore3),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:detector", 10), ore4),
                        arrayOf(ore3, item75, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.epsilon", 4),
                arrayOf(arrayOf(ore42, item76, ore42),
                        arrayOf(ore4, ItemBracketHandler.getItem("Railcraft:detector", 10), ore4),
                        arrayOf(ore42, ItemBracketHandler.getItem("Railcraft:machine.delta", 0), ore42)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.epsilon", 3),
                arrayOf(arrayOf<IIngredient>(ore34, OreBracketHandler.getOre("circuitAdvanced"), ore34),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32682),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32682)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("cableGt01Gold"),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("cableGt01Gold"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:cart.work", 0),
                arrayOf(arrayOf(ore12, ItemBracketHandler.getItem("minecraft:crafting_table", 0), ore14),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:minecart", 0), null),
                        arrayOf<IIngredient?>(null, ore11, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:cart.tank", 0),
                arrayOf(arrayOf(ore12, ItemBracketHandler.getItem("Railcraft:machine.beta", 1), ore14),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:minecart", 0), null),
                        arrayOf<IIngredient?>(null, ore11, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:tool.steel.shears", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"),
                        OreBracketHandler.getOre("screwSteel"), OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("ringSteel"), OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShapedMirrored(item3.amount(4),
                arrayOf(arrayOf<IIngredient?>(ore21, null, null), arrayOf<IIngredient?>(ore21, ore21, null),
                        arrayOf<IIngredient?>(ore21, ore21, ore21)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item4.amount(4),
                arrayOf(arrayOf<IIngredient?>(ore22, null, null), arrayOf<IIngredient?>(ore22, ore22, null),
                        arrayOf<IIngredient?>(ore22, ore22, ore22)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item5.amount(4),
                arrayOf(arrayOf<IIngredient?>(ore23, null, null), arrayOf<IIngredient?>(ore23, ore23, null),
                        arrayOf<IIngredient?>(ore23, ore23, ore23)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item6.amount(4),
                arrayOf(arrayOf<IIngredient?>(ore24, null, null), arrayOf<IIngredient?>(ore24, ore24, null),
                        arrayOf<IIngredient?>(ore24, ore24, ore24)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item7.amount(4),
                arrayOf(arrayOf<IIngredient?>(ore25, null, null), arrayOf<IIngredient?>(ore25, ore25, null),
                        arrayOf<IIngredient?>(ore25, ore25, ore25)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item8.amount(4),
                arrayOf(arrayOf<IIngredient?>(ore26, null, null), arrayOf<IIngredient?>(ore26, ore26, null),
                        arrayOf<IIngredient?>(ore26, ore26, ore26)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item9.amount(4),
                arrayOf(arrayOf<IIngredient?>(ore27, null, null), arrayOf<IIngredient?>(ore27, ore27, null),
                        arrayOf<IIngredient?>(ore27, ore27, ore27)), null)
        MineTweakerAPI.recipes.addShaped(item10, arrayOf(arrayOf<IIngredient>(item77, item26, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item26, item77)), null)
        Assembler.addRecipe(item10, item41, item26.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item11, arrayOf(arrayOf<IIngredient>(item77, item27, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item27, item77)), null)
        Assembler.addRecipe(item11, item41, item27.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item12, arrayOf(arrayOf<IIngredient>(item77, item28, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item28, item77)), null)
        Assembler.addRecipe(item12, item41, item28.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item13, arrayOf(arrayOf<IIngredient>(item77, item29, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item29, item77)), null)
        Assembler.addRecipe(item13, item41, item29.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item14, arrayOf(arrayOf<IIngredient>(item77, item30, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item30, item77)), null)
        Assembler.addRecipe(item14, item41, item30.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item15, arrayOf(arrayOf<IIngredient>(item77, item31, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item31, item77)), null)
        Assembler.addRecipe(item15, item41, item31.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item16, arrayOf(arrayOf<IIngredient>(item77, item32, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item32, item77)), null)
        Assembler.addRecipe(item16, item41, item32.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item17, arrayOf(arrayOf<IIngredient>(item77, item33, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item33, item77)), null)
        Assembler.addRecipe(item17, item41, item33.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item18, arrayOf(arrayOf<IIngredient>(item77, item34, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item34, item77)), null)
        Assembler.addRecipe(item18, item41, item34.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item19, arrayOf(arrayOf<IIngredient>(item77, item35, item77),
                arrayOf(OreBracketHandler.getOre("craftingToolFile"), item41, ore12),
                arrayOf<IIngredient>(item77, item35, item77)), null)
        Assembler.addRecipe(item19, item41, item35.amount(2), 200, VoltageLevels.LULV)
        MineTweakerAPI.recipes.addShaped(item20,
                arrayOf(arrayOf<IIngredient>(ore39, ore, ore39), arrayOf(ore11, item41, ore12),
                        arrayOf<IIngredient>(ore39, ore, ore39)), null)
        MineTweakerAPI.recipes.addShaped(item21,
                arrayOf(arrayOf<IIngredient>(ore35, ore9, ore35), arrayOf(ore11, item41, ore12),
                        arrayOf<IIngredient>(ore35, ore9, ore35)), null)
        MineTweakerAPI.recipes.addShaped(item22,
                arrayOf(arrayOf<IIngredient>(ore36, ore31, ore36), arrayOf(ore11, item41, ore12),
                        arrayOf<IIngredient>(ore36, ore31, ore36)), null)
        MineTweakerAPI.recipes.addShaped(item23,
                arrayOf(arrayOf<IIngredient>(ore37, ore32, ore37), arrayOf(ore11, item41, ore12),
                        arrayOf<IIngredient>(ore37, ore32, ore37)), null)
        MineTweakerAPI.recipes.addShaped(item24,
                arrayOf(arrayOf<IIngredient>(ore38, ore33, ore38), arrayOf(ore11, item41, ore12),
                        arrayOf<IIngredient>(ore38, ore33, ore38)), null)
        MineTweakerAPI.recipes.addShaped(item25,
                arrayOf(arrayOf<IIngredient>(ore40, ore3, ore40), arrayOf(ore11, item41, ore12),
                        arrayOf<IIngredient>(ore40, ore3, ore40)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:part.signal.lamp", 0),
                arrayOf(arrayOf(ore2,
                        ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 29), ore),
                        arrayOf(ore2,
                                ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 20),
                                ore), arrayOf(ore2,
                        ItemBracketHandler.getItem("ProjRed|Illumination:projectred.illumination.lamp", 30), ore)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Railcraft:part.turbine.disk", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemSteamTurbineBlade", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Railcraft:part.turbine.rotor", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemSteamTurbine", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:armor.goggles", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("lensGlass"),
                        OreBracketHandler.getOre("boltSteel"), OreBracketHandler.getOre("lensGlass")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringSteel"), ore40,
                                OreBracketHandler.getOre("ringSteel")), arrayOf(ore20, item64, ore20)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:tool.magnifying.glass", 0),
                arrayOf(arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("lensGlass")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("ringSteel"), null),
                        arrayOf<IIngredient?>(ore6, null, null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Railcraft:machine.alpha", 7),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.CokeOvenBrick", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.CokeOvenBrick", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.CokeOvenBrick", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.CokeOvenBrick", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:brick.sandy", 2).amount(2),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("ingotBrick"), OreBracketHandler.getOre("sand"),
                        null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("sand"), OreBracketHandler.getOre("ingotBrick"),
                                null), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:brick.sandy", 2),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Railcraft:slab", 21), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Railcraft:slab", 21), null, null),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(item54.amount(2), arrayOf(arrayOf(ore13, item53)), null)

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:backpack.trackman.t1", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("minecraft:rail", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("minecraft:rail", 0),
        //                        OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Railcraft:backpack.trackman.t1", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Railcraft:backpack.trackman.t1", 0)), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
                ItemBracketHandler.getItem("Railcraft:backpack.trackman.t1", 0),
                ItemBracketHandler.getItem("Railcraft:backpack.trackman.t2", 0))

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:backpack.iceman.t1", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
        //                        OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Railcraft:backpack.iceman.t1", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Railcraft:backpack.iceman.t1", 0)), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
                ItemBracketHandler.getItem("Railcraft:backpack.iceman.t1", 0),
                ItemBracketHandler.getItem("Railcraft:backpack.iceman.t2", 0))

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:backpack.apothecary.t1", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("minecraft:potion", 8229),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("minecraft:potion", 8229),
        //                        OreBracketHandler.getOre("itemLeather")),
        //                arrayOf(OreBracketHandler.getOre("itemLeather"),
        //                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
        //                        OreBracketHandler.getOre("itemLeather"))), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Railcraft:backpack.apothecary.t1", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Railcraft:backpack.apothecary.t1", 0)), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("seedoil").withAmount(5000),
                arrayOf(ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3),
                        ItemBracketHandler.getItem("Forestry:craftingMaterial", 3)),
                ItemBracketHandler.getItem("Railcraft:backpack.apothecary.t1", 0),
                ItemBracketHandler.getItem("Railcraft:backpack.apothecary.t2", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:brick.infernal", 2).amount(2),
                arrayOf(arrayOf(OreBracketHandler.getOre("ingotBrickNether"),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0), null),
                        arrayOf(ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                                OreBracketHandler.getOre("ingotBrickNether"), null), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:upgrade.lapotron", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAluminium"),
                        OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("itemCasingAluminium")),
                        arrayOf(OreBracketHandler.getOre("cableGt02Platinum"),
                                ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                                OreBracketHandler.getOre("cableGt02Platinum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingAluminium"),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("itemCasingAluminium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:cart.cargo", 0),
                arrayOf(arrayOf(ore12, ItemBracketHandler.getItem("minecraft:chest", 0), ore14),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("minecraft:minecart", 0),
                                OreBracketHandler.getOre("plateSteel")), arrayOf<IIngredient?>(null, ore11, null)),
                null)

        //TODO Replace ("StevesCarts:CartModule", 8)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:cart.track.relayer", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650),
        //                ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650)),
        //                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
        //                        OreBracketHandler.getOre("circuitBasic"),
        //                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
        //                        ItemBracketHandler.getItem("minecraft:minecart", 0),
        //                        ItemBracketHandler.getItem("StevesCarts:CartModule", 8))), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:cart.undercutter", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650),
                        ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                ItemBracketHandler.getItem("minecraft:minecart", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:cart.track.layer", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650),
                        ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650)),
                        arrayOf(ItemBracketHandler.getItem("minecraft:anvil", 0),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("minecraft:anvil", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                ItemBracketHandler.getItem("minecraft:minecart", 0),
                                ItemBracketHandler.getItem("minecraft:dispenser", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:cart.track.remover", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650),
                        ItemBracketHandler.getItem("IC2NuclearControl:blockNuclearControlLight", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650)),
                        arrayOf(ItemBracketHandler.getItem("Railcraft:tool.crowbar.reinforced", 0),
                                OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("Railcraft:tool.crowbar.reinforced", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                ItemBracketHandler.getItem("minecraft:minecart", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600))), null)
        val recipes30 = MineTweakerAPI.recipes
        val item118 = ItemBracketHandler.getItem("Railcraft:cart.redstone.flux", 0)
        val array7 = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateLead"),
                OreBracketHandler.getOre("craftingToolScrewdriver"), OreBracketHandler.getOre("plateLead")), null, null)
        val n7 = 1
        val array8 = arrayOfNulls<IIngredient>(3)
        val n8 = 0
        val item119 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 1)
        val hashMap35 = HashMap<String, IData>()
        hashMap35["type"] = ExpandString.asData("SIMPLE")
        hashMap35["storedEnergyRF"] = ExpandInt.toData(0)
        array8[n8] = item119.withTag(ExpandAnyDict.asData(hashMap35))
        array8[1] = OreBracketHandler.getOre("circuitBasic")
        val n9 = 2
        val item120 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 1)
        val hashMap36 = HashMap<String, IData>()
        hashMap36["type"] = ExpandString.asData("SIMPLE")
        hashMap36["storedEnergyRF"] = ExpandInt.toData(0)
        array8[n9] = item120.withTag(ExpandAnyDict.asData(hashMap36))
        array7[n7] = array8
        array7[2] = arrayOf(OreBracketHandler.getOre("screwSteel"), ItemBracketHandler.getItem("minecraft:minecart", 0),
                OreBracketHandler.getOre("screwSteel"))
        recipes30.addShaped(item118, array7, null)
        val recipes31 = MineTweakerAPI.recipes
        val item121 = ItemBracketHandler.getItem("Railcraft:machine.gamma", 10)
        val array9 = arrayOf(arrayOf(OreBracketHandler.getOre("plateLead"),
                ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 0), OreBracketHandler.getOre("plateLead")),
                arrayOf(OreBracketHandler.getOre("plateRedstoneAlloy"),
                        ItemBracketHandler.getItem("Railcraft:detector", 10),
                        OreBracketHandler.getOre("plateRedstoneAlloy")), null)
        val n10 = 2
        val array10 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateLead"), null, null)
        val n11 = 1
        val item122 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 1)
        val hashMap37 = HashMap<String, IData>()
        hashMap37["type"] = ExpandString.asData("SIMPLE")
        hashMap37["storedEnergyRF"] = ExpandInt.toData(0)
        array10[n11] = item122.withTag(ExpandAnyDict.asData(hashMap37))
        array10[2] = OreBracketHandler.getOre("plateLead")
        array9[n10] = array10
        recipes31.addShaped(item121, array9, null)
        val recipes32 = MineTweakerAPI.recipes
        val item123 = ItemBracketHandler.getItem("Railcraft:machine.gamma", 11)
        val array11: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n12 = 0
        val array12 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateLead"), null, null)
        val n13 = 1
        val item124 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 1)
        val hashMap38 = HashMap<String, IData>()
        hashMap38["type"] = ExpandString.asData("SIMPLE")
        hashMap38["storedEnergyRF"] = ExpandInt.toData(0)
        array12[n13] = item124.withTag(ExpandAnyDict.asData(hashMap38))
        array12[2] = OreBracketHandler.getOre("plateLead")
        array11[n12] = array12
        array11[1] = arrayOf(OreBracketHandler.getOre("plateRedstoneAlloy"),
                ItemBracketHandler.getItem("Railcraft:detector", 10), OreBracketHandler.getOre("plateRedstoneAlloy"))
        array11[2] = arrayOf(OreBracketHandler.getOre("plateLead"),
                ItemBracketHandler.getItem("EnderIO:itemBasicCapacitor", 0), OreBracketHandler.getOre("plateLead"))
        recipes32.addShaped(item123, array11, null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Railcraft:machine.epsilon", 5),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32744),
                        OreBracketHandler.getOre("screwSteel")), arrayOf(OreBracketHandler.getOre("plateSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                        OreBracketHandler.getOre("plateSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("plateSteel"),
                                OreBracketHandler.getOre("craftingToolHardHammer"))), null)
        SemiFluidGenerator.addFluid(LiquidBracketHandler.getLiquid("creosote").withAmount(25), 8)
        val item125 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val item126 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap39 = HashMap<String, IData>()
        val s = "Fluid"
        val hashMap40 = HashMap<String, IData>()
        hashMap40["FluidName"] = ExpandString.asData("creosote")
        hashMap40["Amount"] = ExpandInt.toData(1000)
        hashMap39[s] = ExpandAnyDict.asData(hashMap40)
        Fuels.addDieselFuel(item125, item126.withTag(ExpandAnyDict.asData(hashMap39)), 8)
        Fuels.addDieselFuel(ItemBracketHandler.getItem("IC2:itemFluidCell", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30712), 8)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Railcraft:fluid.creosote.bucket", 0), 6400)
        AlloySmelter.addRecipe(item55.amount(5), item42.amount(5), item57.amount(4), 300, VoltageLevels.LULV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Railcraft:armor.steel.helmet", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(5),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0).amount(0), 600, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Railcraft:armor.steel.plate", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(8),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0).amount(0), 600, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Railcraft:armor.steel.legs", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(7),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0).amount(0), 600, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Railcraft:armor.steel.boots", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0).amount(0), 600, VoltageLevels.LV)
        val item127 = ItemBracketHandler.getItem("Railcraft:track", 19986)
        val hashMap41 = HashMap<String, IData>()
        hashMap41["track"] = ExpandString.asData("railcraft:track.slow.switch")
        Assembler.addRecipe(item127.withTag(ExpandAnyDict.asData(hashMap41)), withTag.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23032).amount(4), 200, VoltageLevels.LLV)
        val item128 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap42 = HashMap<String, IData>()
        hashMap42["track"] = ExpandString.asData("railcraft:track.slow.wye")
        Assembler.addRecipe(item128.withTag(ExpandAnyDict.asData(hashMap42)), withTag.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20032).amount(2), 200, VoltageLevels.LLV)
        val item129 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap43 = HashMap<String, IData>()
        hashMap43["track"] = ExpandString.asData("railcraft:track.slow.junction")
        Assembler.addRecipe(item129.withTag(ExpandAnyDict.asData(hashMap43)), withTag.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032).amount(4), 200, VoltageLevels.LLV)
        val item130 = ItemBracketHandler.getItem("Railcraft:track", 4767)
        val hashMap44 = HashMap<String, IData>()
        hashMap44["track"] = ExpandString.asData("railcraft:track.switch")
        Assembler.addRecipe(item130.withTag(ExpandAnyDict.asData(hashMap44)), item68.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23305).amount(4), 400, VoltageLevels.LV)
        val item131 = ItemBracketHandler.getItem("Railcraft:track", 2144)
        val hashMap45 = HashMap<String, IData>()
        hashMap45["track"] = ExpandString.asData("railcraft:track.wye")
        Assembler.addRecipe(item131.withTag(ExpandAnyDict.asData(hashMap45)), item68.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20305).amount(2), 400, VoltageLevels.LV)
        val item132 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap46 = HashMap<String, IData>()
        hashMap46["track"] = ExpandString.asData("railcraft:track.junction")
        Assembler.addRecipe(item132.withTag(ExpandAnyDict.asData(hashMap46)), item68.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305).amount(4), 400, VoltageLevels.LV)
        val item133 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap47 = HashMap<String, IData>()
        hashMap47["track"] = ExpandString.asData("railcraft:track.reinforced.switch")
        Assembler.addRecipe(item133.withTag(ExpandAnyDict.asData(hashMap47)), withTag2.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23306).amount(4), 400, VoltageLevels.MV)
        val item134 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap48 = HashMap<String, IData>()
        hashMap48["track"] = ExpandString.asData("railcraft:track.reinforced.wye")
        Assembler.addRecipe(item134.withTag(ExpandAnyDict.asData(hashMap48)), withTag2.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20306).amount(2), 400, VoltageLevels.MV)
        val item135 = ItemBracketHandler.getItem("Railcraft:track", 764)
        val hashMap49 = HashMap<String, IData>()
        hashMap49["track"] = ExpandString.asData("railcraft:track.reinforced.junction")
        Assembler.addRecipe(item135.withTag(ExpandAnyDict.asData(hashMap49)), withTag2.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27306).amount(4), 400, VoltageLevels.MV)
        val item136 = ItemBracketHandler.getItem("Railcraft:track", 26865)
        val hashMap50 = HashMap<String, IData>()
        hashMap50["track"] = ExpandString.asData("railcraft:track.speed.transition")
        Assembler.addRecipe(item136.withTag(ExpandAnyDict.asData(hashMap50)).amount(4),
                arrayOf(ItemBracketHandler.getItem("Railcraft:part.railbed", 1), withTag3.amount(2),
                        OreBracketHandler.getOre("plateRedAlloy").amount(2)), null, 600, 120)
        val item137 = ItemBracketHandler.getItem("Railcraft:track", 7916)
        val hashMap51 = HashMap<String, IData>()
        hashMap51["track"] = ExpandString.asData("railcraft:track.speed.switch")
        Assembler.addRecipe(item137.withTag(ExpandAnyDict.asData(hashMap51)), withTag3.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23305).amount(4), 400, VoltageLevels.MV)
        val item138 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap52 = HashMap<String, IData>()
        hashMap52["track"] = ExpandString.asData("railcraft:track.speed.wye")
        Assembler.addRecipe(item138.withTag(ExpandAnyDict.asData(hashMap52)), withTag3.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20305).amount(2), 400, VoltageLevels.MV)
        val item139 = ItemBracketHandler.getItem("Railcraft:track", 10488)
        val hashMap53 = HashMap<String, IData>()
        hashMap53["track"] = ExpandString.asData("railcraft:track.electric.switch")
        Assembler.addRecipe(item139.withTag(ExpandAnyDict.asData(hashMap53)), withTag4.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 23035).amount(4), 800, VoltageLevels.LV)
        val item140 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap54 = HashMap<String, IData>()
        hashMap54["track"] = ExpandString.asData("railcraft:track.electric.wye")
        Assembler.addRecipe(item140.withTag(ExpandAnyDict.asData(hashMap54)), withTag4.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20035).amount(2), 800, VoltageLevels.LV)
        val item141 = ItemBracketHandler.getItem("Railcraft:track", 0)
        val hashMap55 = HashMap<String, IData>()
        hashMap55["track"] = ExpandString.asData("railcraft:track.electric.junction")
        Assembler.addRecipe(item141.withTag(ExpandAnyDict.asData(hashMap55)), withTag4.amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27035).amount(4), 800, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:firestone.refined", 5000),
                ItemBracketHandler.getItem("Railcraft:firestone.cut", 0),
                ItemBracketHandler.getItem("minecraft:redstone_block", 0).amount(2),
                LiquidBracketHandler.getLiquid("lava").withAmount(576), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:firestone.refined", 5000),
                ItemBracketHandler.getItem("Railcraft:firestone.cracked", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("minecraft:redstone_block", 0).amount(2),
                LiquidBracketHandler.getLiquid("lava").withAmount(576), 200,  VoltageLevels.HV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:cart.work", 0),
                ItemBracketHandler.getItem("minecraft:minecart", 0),
                ItemBracketHandler.getItem("minecraft:crafting_table", 0), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:cart.anchor.personal", 0),
                ItemBracketHandler.getItem("minecraft:minecart", 0),
                ItemBracketHandler.getItem("Railcraft:machine.alpha", 2), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:cart.anchor", 0),
                ItemBracketHandler.getItem("minecraft:minecart", 0),
                ItemBracketHandler.getItem("Railcraft:machine.alpha", 0), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:cart.tank", 0),
                ItemBracketHandler.getItem("minecraft:minecart", 0),
                ItemBracketHandler.getItem("Railcraft:machine.beta", 1), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:cart.energy.batbox", 0),
                ItemBracketHandler.getItem("minecraft:minecart", 0), ItemBracketHandler.getItem("IC2:blockElectric", 0),
                100, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:cart.energy.cesu", 0),
                ItemBracketHandler.getItem("minecraft:minecart", 0), ItemBracketHandler.getItem("IC2:blockElectric", 7),
                100, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:cart.energy.mfe", 0),
                ItemBracketHandler.getItem("minecraft:minecart", 0), ItemBracketHandler.getItem("IC2:blockElectric", 1),
                100, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:tool.electric.meter", 0),
                ItemBracketHandler.getItem("IC2:itemToolMEter", 0), item64, 300, 30)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:tool.signal.tuner", 0),
                ItemBracketHandler.getItem("IC2:itemFreq", 0), item64, 300, 30)
        Assembler.addRecipe(ItemBracketHandler.getItem("Railcraft:tool.surveyor", 0),
                ItemBracketHandler.getItem("Railcraft:tool.signal.tuner", 0),
                ItemBracketHandler.getItem("minecraft:compass", 0), 300, VoltageLevels.LV)
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("minecraft:coal_block", 0), false, false, 180,
                ItemBracketHandler.getItem("Railcraft:cube", 0))
        Centrifuge.addRecipe(arrayOf(item51.amount(9)), item52, 0, 400)
        Compressor.addRecipe(item52, item51.amount(9))
        Compressor.addRecipe(item55, item56.amount(2))
        Compressor.addRecipe(item53, item54.amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("Railcraft:machine.alpha", 12),
                ItemBracketHandler.getItem("dreamcraft:item.AdvancedCokeOvenBrick", 0).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("Railcraft:machine.alpha", 7),
                ItemBracketHandler.getItem("dreamcraft:item.CokeOvenBrick", 0).amount(4))
        CuttingSaw.addRecipe(item54.amount(4), null, item53, LiquidBracketHandler.getLiquid("water").withAmount(4), 200,
                VoltageLevels.LV)
        CuttingSaw.addRecipe(item54.amount(4), null, item53,
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(item54.amount(4), null, item53, LiquidBracketHandler.getLiquid("lubricant").withAmount(1),
                100, VoltageLevels.LV)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("Railcraft:fuel.coke", 0).amount(9),
                ItemBracketHandler.getItem("Railcraft:cube", 0), 100, VoltageLevels.LV)
        FluidSolidifier.addRecipe(item2, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32314).amount(0),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(4464), 480, VoltageLevels.LMV)
        Mixer.addRecipe(ItemBracketHandler.getItem("Railcraft:part.bleached.clay", 0).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:clay_ball", 0),
                        ItemBracketHandler.getItem("minecraft:dye", 15),
                        ItemBracketHandler.getItem("minecraft:dye", 15),
                        ItemBracketHandler.getItem("minecraft:dye", 15)), 100, VoltageLevels.ULV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("Railcraft:part.rail", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23081).amount(3), 800, VoltageLevels.LLV)
        PlateBender.addRecipe(ItemBracketHandler.getItem("Railcraft:part.rail", 0).amount(10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23316).amount(3), 1000, VoltageLevels.LLV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("Railcraft:firestone.cut", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24500).amount(0),
                ItemBracketHandler.getItem("Railcraft:firestone.raw", 0), 2400,  VoltageLevels.HV)
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.plate", 0).amount(4))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.plate", 1).amount(4))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.plate", 2).amount(4))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.plate", 3).amount(4))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.rail", 0))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.rail", 1).amount(8))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.rail", 3).amount(8))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.rail", 4))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.rail", 5).amount(6))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:machine.delta", 0).amount(8))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.rebar", 0))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:post", 2))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Railcraft:part.tie", 0), null,
                        ItemBracketHandler.getItem("Railcraft:part.tie", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Railcraft:part.tie", 0),
                                ItemBracketHandler.getItem("Railcraft:part.tie", 0),
                                ItemBracketHandler.getItem("Railcraft:part.tie", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Railcraft:part.tie", 0), null,
                                ItemBracketHandler.getItem("Railcraft:part.tie", 0))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Railcraft:part.tie", 0),
                        ItemBracketHandler.getItem("Railcraft:part.tie", 0),
                        ItemBracketHandler.getItem("Railcraft:part.tie", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Railcraft:part.tie", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Railcraft:part.tie", 0),
                                ItemBracketHandler.getItem("Railcraft:part.tie", 0),
                                ItemBracketHandler.getItem("Railcraft:part.tie", 0))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 1).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:stone", 0), null,
                        ItemBracketHandler.getItem("minecraft:stone", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Railcraft:part.rebar", 0),
                                ItemBracketHandler.getItem("Railcraft:part.rebar", 0),
                                ItemBracketHandler.getItem("Railcraft:part.rebar", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:stone", 0), null,
                                ItemBracketHandler.getItem("minecraft:stone", 0))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 1).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:stone", 0),
                        ItemBracketHandler.getItem("Railcraft:part.rebar", 0),
                        ItemBracketHandler.getItem("minecraft:stone", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Railcraft:part.rebar", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:stone", 0),
                                ItemBracketHandler.getItem("Railcraft:part.rebar", 0),
                                ItemBracketHandler.getItem("minecraft:stone", 0))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 4),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Railcraft:slab", 37), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Railcraft:post", 0), null)))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 5),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Railcraft:slab", 2), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Railcraft:post", 1), null)))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 6),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Railcraft:slab", 6), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Railcraft:post", 2), null)))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 2).amount(16),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickAnyIron"),
                        OreBracketHandler.getOre("stickAnyIron"), OreBracketHandler.getOre("stickAnyIron")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickAnyIron"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickAnyIron"),
                                OreBracketHandler.getOre("stickAnyIron"), OreBracketHandler.getOre("stickAnyIron"))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 2).amount(16),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickAnyIron"), null,
                        OreBracketHandler.getOre("stickAnyIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickAnyIron"),
                                OreBracketHandler.getOre("stickAnyIron"), OreBracketHandler.getOre("stickAnyIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickAnyIron"), null,
                                OreBracketHandler.getOre("stickAnyIron"))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 2).amount(12),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickBronze"),
                        OreBracketHandler.getOre("stickBronze"), OreBracketHandler.getOre("stickBronze")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickBronze"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickBronze"),
                                OreBracketHandler.getOre("stickBronze"), OreBracketHandler.getOre("stickBronze"))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 2).amount(12),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickBronze"), null,
                        OreBracketHandler.getOre("stickBronze")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickBronze"),
                                OreBracketHandler.getOre("stickBronze"), OreBracketHandler.getOre("stickBronze")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickBronze"), null,
                                OreBracketHandler.getOre("stickBronze"))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 2).amount(32),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickSteel"),
                        OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickSteel"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickSteel"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel"))))
        RollingMachine.addShaped(ItemBracketHandler.getItem("Railcraft:post", 2).amount(32),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickSteel"), null,
                        OreBracketHandler.getOre("stickSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickSteel"),
                                OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickSteel"), null,
                                OreBracketHandler.getOre("stickSteel"))))
        RollingMachine.removeRecipe(ItemBracketHandler.getItem("Railcraft:part.plate", 4).amount(4))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2057),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2522),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2032)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804))),
                ItemBracketHandler.getItem("Forestry:waxCast", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("Railcraft:glass", 0).amount(4))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2057),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2516),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2032)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804))),
                ItemBracketHandler.getItem("Forestry:waxCast", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("Railcraft:glass", 0).amount(4))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2057),
                                ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2032)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804))),
                ItemBracketHandler.getItem("Forestry:waxCast", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("Railcraft:glass", 0).amount(4))
        ThermionicFabricator.addCast(LiquidBracketHandler.getLiquid("glass").withAmount(2000),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2057),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2523),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2032)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2836),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804))),
                ItemBracketHandler.getItem("Forestry:waxCast", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("Railcraft:glass", 0).amount(4))
        ItemBracketHandler.getItem("Railcraft:machine.alpha", 12).displayName = "Advanced Coke Oven Bricks"
        ItemBracketHandler.getItem("Railcraft:upgrade.lapotron", 0).displayName = "Lapatron Loader Upgrade"
        ItemBracketHandler.getItem("Railcraft:part.plate", 4).displayName = "Lead Plate"
        Research.moveResearch("RC_Crowbar", "ARTIFICE", 0, -4)
        Research.clearPrereqs("RC_Crowbar")
        Research.addPrereq("RC_Crowbar", "THAUMIUM", false)
        Research.clearPages("RC_Crowbar")
        Research.addPage("RC_Crowbar", "thaumcraft.research.RC_Crowbar.page.1")
        Arcane.addShaped("RC_Crowbar", ItemBracketHandler.getItem("Railcraft:tool.crowbar.magic", 0),
                "ordo 24, ignis 24, aer 24",
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("dyeRed"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330)),
                        arrayOf(OreBracketHandler.getOre("dyeRed"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330),
                                OreBracketHandler.getOre("dyeRed")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23330),
                                OreBracketHandler.getOre("dyeRed"), OreBracketHandler.getOre("craftingToolFile"))))
        Research.addArcanePage("RC_Crowbar", ItemBracketHandler.getItem("Railcraft:tool.crowbar.magic", 0))
        Research.refreshResearchRecipe("RC_Crowbar")
        Research.moveResearch("RC_Crowbar_Void", "ELDRITCH", 2, -4)
        Research.clearPrereqs("RC_Crowbar_Void")
        Research.addPrereq("RC_Crowbar_Void", "VOIDMETAL", false)
        Research.addPrereq("RC_Crowbar_Void", "RC_Crowbar", false)
        Research.clearPages("RC_Crowbar_Void")
        Research.addPage("RC_Crowbar_Void", "thaumcraft.research.RC_Crowbar_Void.page.1")
        Arcane.addShaped("RC_Crowbar_Void", ItemBracketHandler.getItem("Railcraft:tool.crowbar.void", 0),
                "perditio 50, ignis 50, aer 50, terra 50",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"),
                        OreBracketHandler.getOre("dyeRed"), OreBracketHandler.getOre("stickVoid")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeRed"), OreBracketHandler.getOre("stickVoid"),
                                OreBracketHandler.getOre("dyeRed")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickVoid"), OreBracketHandler.getOre("dyeRed"),
                                OreBracketHandler.getOre("craftingToolFile"))))
        Research.addArcanePage("RC_Crowbar_Void", ItemBracketHandler.getItem("Railcraft:tool.crowbar.void", 0))
        Warp.addToResearch("RC_Crowbar_Void", 2)
        Research.refreshResearchRecipe("RC_Crowbar_Void")
        Research.removeTab("RAILCRAFT")
        ItemBracketHandler.getItem("Railcraft:firestone.raw", 0).maxStackSize = 9
    }
}