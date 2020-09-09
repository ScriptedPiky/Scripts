package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientAny
import minetweaker.api.item.IngredientTransform
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Extractor
import minetweaker.mods.nei.NEI
import modtweaker2.mods.railcraft.handlers.BlastFurnace
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Minecraft : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("minecraft:chest", 0)
        val item2 = ItemBracketHandler.getItem("minecraft:trapped_chest", 0)
        val item3 = ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0)
        ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersSlope", 0)
        val item4 = ItemBracketHandler.getItem("minecraft:bedrock", 0)
        val item5 = ItemBracketHandler.getItem("minecraft:dispenser", 0)
        val item6 = ItemBracketHandler.getItem("minecraft:piston", 0)
        val item7 = ItemBracketHandler.getItem("minecraft:sticky_piston", 0)
        ItemBracketHandler.getItem("minecraft:slime_ball", 0)
        val item8 = ItemBracketHandler.getItem("minecraft:string", 0)
        val item9 = ItemBracketHandler.getItem("minecraft:rail", 0)
        val item10 = ItemBracketHandler.getItem("minecraft:golden_rail", 0)
        val item11 = ItemBracketHandler.getItem("minecraft:detector_rail", 0)
        val item12 = ItemBracketHandler.getItem("minecraft:activator_rail", 0)
        val item13 = ItemBracketHandler.getItem("minecraft:noteblock", 0)
        val item14 = ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0)
        ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0)
        val item15 = ItemBracketHandler.getItem("minecraft:bookshelf", 0)
        val item16 = ItemBracketHandler.getItem("minecraft:book", 0)
        val item17 = ItemBracketHandler.getItem("minecraft:mossy_cobblestone", 0)
        val item18 = ItemBracketHandler.getItem("minecraft:stonebrick", 0)
        val ore = OreBracketHandler.getOre("blockObsidian")
        val item19 = ItemBracketHandler.getItem("minecraft:jukebox", 0)
        val ore2 = OreBracketHandler.getOre("record")
        OreBracketHandler.getOre("gemDiamond")
        val item20 = ItemBracketHandler.getItem("minecraft:crafting_table", 0)
        val item21 = ItemBracketHandler.getItem("minecraft:lit_pumpkin", 0)
        val item22 = ItemBracketHandler.getItem("minecraft:pumpkin", 0)
        val item23 = ItemBracketHandler.getItem("minecraft:torch", 0)
        val item24 = ItemBracketHandler.getItem("minecraft:lever", 0)
        val item25 = ItemBracketHandler.getItem("minecraft:redstone_torch", 0)
        val ore3 = OreBracketHandler.getOre("glass")
        val item26 = ItemBracketHandler.getItem("minecraft:trapdoor", 0)
        val item27 = ItemBracketHandler.getItem("minecraft:clay", 0)
        val item28 = ItemBracketHandler.getItem("minecraft:ladder", 0)
        val item29 = ItemBracketHandler.getItem("minecraft:fence", 0)
        val item30 = ItemBracketHandler.getItem("minecraft:fence_gate", 0)
        val item31 = ItemBracketHandler.getItem("minecraft:flint", 0)
        val item32 = ItemBracketHandler.getItem("minecraft:enchanting_table", 0)
        val item33 = ItemBracketHandler.getItem("minecraft:redstone_lamp", 0)
        val item34 = ItemBracketHandler.getItem("minecraft:glowstone", 0)
        val item35 = ItemBracketHandler.getItem("minecraft:ender_chest", 0)
        val item36 = ItemBracketHandler.getItem("minecraft:tripwire_hook", 0)
        val item37 = ItemBracketHandler.getItem("minecraft:beacon", 0)
        ItemBracketHandler.getItem("minecraft:nether_star", 0)
        val item38 = ItemBracketHandler.getItem("minecraft:anvil", 0)
        val ore4 = OreBracketHandler.getOre("blockIron")
        val item39 = ItemBracketHandler.getItem("minecraft:daylight_detector", 0)
        val ore5 = OreBracketHandler.getOre("logWood")
        val item40 = ItemBracketHandler.getItem("minecraft:hopper", 0)
        val item41 = ItemBracketHandler.getItem("minecraft:dropper", 0)
        val ore6 = OreBracketHandler.getOre("cobblestone")
        val ore7 = OreBracketHandler.getOre("stone")
        val ore8 = OreBracketHandler.getOre("sandstone")
        val item42 = ItemBracketHandler.getItem("minecraft:brick_block", 0)
        val ore9 = OreBracketHandler.getOre("stoneBricks")
        val ore10 = OreBracketHandler.getOre("stoneNetherBrick")
        val ore11 = OreBracketHandler.getOre("blockQuartz")
        val ore12 = OreBracketHandler.getOre("craftingToolMortar")
        val item43 = ItemBracketHandler.getItem("minecraft:sugar", 0)
        val item44 = ItemBracketHandler.getItem("minecraft:reeds", 0)
        val ore13 = OreBracketHandler.getOre("dustRedstone")
        val item45 = ItemBracketHandler.getItem("minecraft:bow", 0)
        val ore14 = OreBracketHandler.getOre("blockWool")
        val item46 = ItemBracketHandler.getItem("minecraft:wool", 0)
        val item47 = ItemBracketHandler.getItem("minecraft:wool", 1)
        val item48 = ItemBracketHandler.getItem("minecraft:wool", 2)
        val item49 = ItemBracketHandler.getItem("minecraft:wool", 3)
        val item50 = ItemBracketHandler.getItem("minecraft:wool", 4)
        val item51 = ItemBracketHandler.getItem("minecraft:wool", 5)
        val item52 = ItemBracketHandler.getItem("minecraft:wool", 6)
        val item53 = ItemBracketHandler.getItem("minecraft:wool", 7)
        val item54 = ItemBracketHandler.getItem("minecraft:wool", 8)
        val item55 = ItemBracketHandler.getItem("minecraft:wool", 9)
        val item56 = ItemBracketHandler.getItem("minecraft:wool", 10)
        val item57 = ItemBracketHandler.getItem("minecraft:wool", 11)
        val item58 = ItemBracketHandler.getItem("minecraft:wool", 12)
        val item59 = ItemBracketHandler.getItem("minecraft:wool", 13)
        val item60 = ItemBracketHandler.getItem("minecraft:wool", 14)
        val item61 = ItemBracketHandler.getItem("minecraft:wool", 15)
        val item62 = ItemBracketHandler.getItem("minecraft:stained_glass", 0)
        val item63 = ItemBracketHandler.getItem("minecraft:stained_glass", 1)
        val item64 = ItemBracketHandler.getItem("minecraft:stained_glass", 2)
        val item65 = ItemBracketHandler.getItem("minecraft:stained_glass", 3)
        val item66 = ItemBracketHandler.getItem("minecraft:stained_glass", 4)
        val item67 = ItemBracketHandler.getItem("minecraft:stained_glass", 5)
        val item68 = ItemBracketHandler.getItem("minecraft:stained_glass", 6)
        val item69 = ItemBracketHandler.getItem("minecraft:stained_glass", 7)
        val item70 = ItemBracketHandler.getItem("minecraft:stained_glass", 8)
        val item71 = ItemBracketHandler.getItem("minecraft:stained_glass", 9)
        val item72 = ItemBracketHandler.getItem("minecraft:stained_glass", 10)
        val item73 = ItemBracketHandler.getItem("minecraft:stained_glass", 11)
        val item74 = ItemBracketHandler.getItem("minecraft:stained_glass", 12)
        val item75 = ItemBracketHandler.getItem("minecraft:stained_glass", 13)
        val item76 = ItemBracketHandler.getItem("minecraft:stained_glass", 14)
        val item77 = ItemBracketHandler.getItem("minecraft:stained_glass", 15)
        val item78 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 0)
        val item79 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 1)
        val item80 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 2)
        val item81 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 3)
        val item82 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 4)
        val item83 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 5)
        val item84 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 6)
        val item85 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 7)
        val item86 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 8)
        val item87 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 9)
        val item88 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 10)
        val item89 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 11)
        val item90 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 12)
        val item91 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 13)
        val item92 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 14)
        val item93 = ItemBracketHandler.getItem("minecraft:stained_glass_pane", 15)
        val item94 = ItemBracketHandler.getItem("minecraft:carpet", 0)
        val item95 = ItemBracketHandler.getItem("minecraft:carpet", 1)
        val item96 = ItemBracketHandler.getItem("minecraft:carpet", 2)
        val item97 = ItemBracketHandler.getItem("minecraft:carpet", 3)
        val item98 = ItemBracketHandler.getItem("minecraft:carpet", 4)
        val item99 = ItemBracketHandler.getItem("minecraft:carpet", 5)
        val item100 = ItemBracketHandler.getItem("minecraft:carpet", 6)
        val item101 = ItemBracketHandler.getItem("minecraft:carpet", 7)
        val item102 = ItemBracketHandler.getItem("minecraft:carpet", 8)
        val item103 = ItemBracketHandler.getItem("minecraft:carpet", 9)
        val item104 = ItemBracketHandler.getItem("minecraft:carpet", 10)
        val item105 = ItemBracketHandler.getItem("minecraft:carpet", 11)
        val item106 = ItemBracketHandler.getItem("minecraft:carpet", 12)
        val item107 = ItemBracketHandler.getItem("minecraft:carpet", 13)
        val item108 = ItemBracketHandler.getItem("minecraft:carpet", 14)
        val item109 = ItemBracketHandler.getItem("minecraft:carpet", 15)
        val item110 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 0)
        val item111 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 1)
        val item112 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 2)
        val item113 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 3)
        val item114 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 4)
        val item115 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 5)
        val item116 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 6)
        val item117 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 7)
        val item118 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 8)
        val item119 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 9)
        val item120 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 10)
        val item121 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 11)
        val item122 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 12)
        val item123 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 13)
        val item124 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 14)
        val item125 = ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 15)
        val ore15 = OreBracketHandler.getOre("dyeWhite")
        val ore16 = OreBracketHandler.getOre("dyeOrange")
        val ore17 = OreBracketHandler.getOre("dyeMagenta")
        val ore18 = OreBracketHandler.getOre("dyeLightBlue")
        val ore19 = OreBracketHandler.getOre("dyeYellow")
        val ore20 = OreBracketHandler.getOre("dyeLime")
        val ore21 = OreBracketHandler.getOre("dyePink")
        val ore22 = OreBracketHandler.getOre("dyeGray")
        val ore23 = OreBracketHandler.getOre("dyeLightGray")
        val ore24 = OreBracketHandler.getOre("dyeCyan")
        val ore25 = OreBracketHandler.getOre("dyePurple")
        val ore26 = OreBracketHandler.getOre("dyeBlue")
        val ore27 = OreBracketHandler.getOre("dyeBrown")
        val ore28 = OreBracketHandler.getOre("dyeGreen")
        val ore29 = OreBracketHandler.getOre("dyeRed")
        val ore30 = OreBracketHandler.getOre("dyeBlack")

        //TODO investigate getters with no target field for ("TConstruct:bowstring", 0)
        //ItemBracketHandler.getItem("TConstruct:bowstring", 0)

        val item126 = ItemBracketHandler.getItem("minecraft:iron_bars", 0)
        val item127 = ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)
        val ore31 = OreBracketHandler.getOre("plateAnyIron")
        OreBracketHandler.getOre("stickAnyIron")
        OreBracketHandler.getOre("stickDiamond")
        OreBracketHandler.getOre("rodStone")
        val ore32 = OreBracketHandler.getOre("screwWood")
        val ore33 = OreBracketHandler.getOre("screwAnyIron")
        val ore34 = OreBracketHandler.getOre("screwSteel")
        val ore35 = OreBracketHandler.getOre("gearWood")
        val ore36 = OreBracketHandler.getOre("ringAnyIron")
        val ore37 = OreBracketHandler.getOre("gearAnyIron")
        val ore38 = OreBracketHandler.getOre("stickRedAlloy")
        OreBracketHandler.getOre("stickRedAlloy")
        OreBracketHandler.getOre("plateGlowstone")

        //TODO Replace ("ExtraUtilities:paintbrush", 0)
        //val item128 = ItemBracketHandler.getItem("ExtraUtilities:paintbrush", 0)

        val item129 = ItemBracketHandler.getItem("BiomesOPlenty:plants", 7)
        val item130 = ItemBracketHandler.getItem("Railcraft:part.rail", 0)
        ItemBracketHandler.getItem("Railcraft:part.rail", 1)
        val item131 = ItemBracketHandler.getItem("Railcraft:part.railbed", 0)
        val item132 = ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE)
        val ore39 = OreBracketHandler.getOre("slabWood")
        OreBracketHandler.getOre("slabStone")
        val ore40 = OreBracketHandler.getOre("paneGlass")

        //TODO Replace ("TConstruct:GlassPane", 0)
        //val item133 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)

        val ore41 = OreBracketHandler.getOre("gemCoal")
        val ore42 = OreBracketHandler.getOre("gemCharcoal")
        val ore43 = OreBracketHandler.getOre("fuelCoke")
        val ore44 = OreBracketHandler.getOre("itemBeeswax")

        //TODO investigate getters with no target field for ("harvestcraft:wovencottonItem", 0)
        //ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)

        OreBracketHandler.getOre("dustSulfur")
        val item134 = ItemBracketHandler.getItem("TwilightForest:item.torchberries", 0)
        val item135 = ItemBracketHandler.getItem("IC2:itemHarz", 0)
        val ore45 = OreBracketHandler.getOre("stickWood")
        ItemBracketHandler.getItem("Forestry:oakStick", 0)
        OreBracketHandler.getOre("plateObsidian")
        OreBracketHandler.getOre("plateDenseObsidian")
        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0)
        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1)
        ItemBracketHandler.getItem("IronChest:BlockIronChest", 6)
        OreBracketHandler.getOre("dustTinyNetherStar")
        OreBracketHandler.getOre("stickEnderEye")

        //TODO investigate getters with no target field for ("ExtraUtilities:decorativeBlock2", 7)
        //ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 7)

        OreBracketHandler.getOre("craftingQuartz")
        val ore46 = OreBracketHandler.getOre("plateCertusQuartz")
        val ore47 = OreBracketHandler.getOre("plateNetherQuartz")
        val ore48 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val ore49 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore50 = OreBracketHandler.getOre("craftingToolSoftHammer")
        val ore51 = OreBracketHandler.getOre("craftingToolKnife")
        val ore52 = OreBracketHandler.getOre("craftingToolSaw")
        val ore53 = OreBracketHandler.getOre("craftingToolWrench")
        val item136 = ItemBracketHandler.getItem("Railcraft:detector", 1)
        val item137 = ItemBracketHandler.getItem("minecraft:map", 0)
        val ore54 = OreBracketHandler.getOre("paperEmpty")
        val item138 = ItemBracketHandler.getItem("minecraft:wooden_door", 0)
        val item139 = ItemBracketHandler.getItem("minecraft:iron_door", 0)
        val item140 = ItemBracketHandler.getItem("minecraft:sign", 0)
        val item141 = ItemBracketHandler.getItem("minecraft:stick", 0)
        val item142 = ItemBracketHandler.getItem("Natura:natura.stick", OreDictionary.WILDCARD_VALUE)
        val item143 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470)
        val item144 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32471)
        val item145 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32472)
        val item146 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32473)
        val item147 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32474)
        val item148 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32475)
        val item149 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32476)
        val item150 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32477)
        val item151 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32478)
        val item152 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32479)
        val item153 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32480)
        val item154 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32481)
        val item155 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32482)
        val item156 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32483)
        val item157 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32484)
        val item158 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32485)
        val item159 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32486)
        val item160 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32487)
        val item161 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32488)
        val item162 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32489)
        val item163 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32490)
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item20)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:furnace", 0))
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(item5)
        MineTweakerAPI.recipes.remove(item41)
        MineTweakerAPI.recipes.remove(item6)
        MineTweakerAPI.recipes.remove(item7)
        MineTweakerAPI.recipes.remove(item9)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item11)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(item13)
        MineTweakerAPI.recipes.remove(item19)
        MineTweakerAPI.recipes.remove(item15)
        MineTweakerAPI.recipes.remove(item17)
        MineTweakerAPI.recipes.remove(item18)
        MineTweakerAPI.recipes.remove(ore)
        MineTweakerAPI.furnace.remove(IngredientAny.INSTANCE, ore)
        MineTweakerAPI.recipes.remove(item21)
        MineTweakerAPI.recipes.remove(item26)
        MineTweakerAPI.recipes.remove(item14)
        MineTweakerAPI.recipes.remove(item23)
        MineTweakerAPI.recipes.remove(item24)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:stone_button", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:stone_button", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:glass_pane", 0))
        MineTweakerAPI.recipes.remove(item25)
        MineTweakerAPI.recipes.remove(item28)
        MineTweakerAPI.recipes.remove(item29)
        MineTweakerAPI.recipes.remove(item30)
        MineTweakerAPI.recipes.remove(item32)
        MineTweakerAPI.recipes.remove(item33)
        MineTweakerAPI.recipes.remove(item35)
        MineTweakerAPI.recipes.remove(item36)
        MineTweakerAPI.recipes.remove(item37)
        MineTweakerAPI.recipes.remove(item38)
        MineTweakerAPI.recipes.remove(item39)
        MineTweakerAPI.recipes.remove(item40)
        MineTweakerAPI.recipes.remove(item16)
        MineTweakerAPI.recipes.remove(item45)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:string", 0), null, false)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:string", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("cropCotton"),
                        OreBracketHandler.getOre("cropCotton"), OreBracketHandler.getOre("cropCotton"))))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:speckled_melon", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:stone_slab", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:stone_slab", 1), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:stone_slab", 3), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:brick_block", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("minecraft:brick", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:stone_slab", 4), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:stone_slab", 5), null)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("minecraft:netherbrick", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:stone_slab", 6), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:stone_slab", 7), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:bookshelf", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:saddle", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:packed_ice", 0).amount(4), null)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2526), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2501), null, false)
        MineTweakerAPI.recipes.remove(item46)
        MineTweakerAPI.recipes.remove(item47)
        MineTweakerAPI.recipes.remove(item48)
        MineTweakerAPI.recipes.remove(item49)
        MineTweakerAPI.recipes.remove(item50)
        MineTweakerAPI.recipes.remove(item51)
        MineTweakerAPI.recipes.remove(item52)
        MineTweakerAPI.recipes.remove(item53)
        MineTweakerAPI.recipes.remove(item54)
        MineTweakerAPI.recipes.remove(item55)
        MineTweakerAPI.recipes.remove(item56)
        MineTweakerAPI.recipes.remove(item57)
        MineTweakerAPI.recipes.remove(item58)
        MineTweakerAPI.recipes.remove(item59)
        MineTweakerAPI.recipes.remove(item60)
        MineTweakerAPI.recipes.remove(item61)
        MineTweakerAPI.recipes.remove(item62)
        MineTweakerAPI.recipes.remove(item63)
        MineTweakerAPI.recipes.remove(item64)
        MineTweakerAPI.recipes.remove(item65)
        MineTweakerAPI.recipes.remove(item66)
        MineTweakerAPI.recipes.remove(item67)
        MineTweakerAPI.recipes.remove(item68)
        MineTweakerAPI.recipes.remove(item69)
        MineTweakerAPI.recipes.remove(item70)
        MineTweakerAPI.recipes.remove(item71)
        MineTweakerAPI.recipes.remove(item72)
        MineTweakerAPI.recipes.remove(item73)
        MineTweakerAPI.recipes.remove(item74)
        MineTweakerAPI.recipes.remove(item75)
        MineTweakerAPI.recipes.remove(item76)
        MineTweakerAPI.recipes.remove(item77)
        MineTweakerAPI.recipes.remove(item78)
        MineTweakerAPI.recipes.remove(item79)
        MineTweakerAPI.recipes.remove(item80)
        MineTweakerAPI.recipes.remove(item81)
        MineTweakerAPI.recipes.remove(item82)
        MineTweakerAPI.recipes.remove(item83)
        MineTweakerAPI.recipes.remove(item84)
        MineTweakerAPI.recipes.remove(item85)
        MineTweakerAPI.recipes.remove(item86)
        MineTweakerAPI.recipes.remove(item87)
        MineTweakerAPI.recipes.remove(item88)
        MineTweakerAPI.recipes.remove(item89)
        MineTweakerAPI.recipes.remove(item90)
        MineTweakerAPI.recipes.remove(item91)
        MineTweakerAPI.recipes.remove(item92)
        MineTweakerAPI.recipes.remove(item93)
        MineTweakerAPI.recipes.remove(item94)
        MineTweakerAPI.recipes.remove(item95)
        MineTweakerAPI.recipes.remove(item96)
        MineTweakerAPI.recipes.remove(item97)
        MineTweakerAPI.recipes.remove(item98)
        MineTweakerAPI.recipes.remove(item99)
        MineTweakerAPI.recipes.remove(item100)
        MineTweakerAPI.recipes.remove(item101)
        MineTweakerAPI.recipes.remove(item102)
        MineTweakerAPI.recipes.remove(item103)
        MineTweakerAPI.recipes.remove(item104)
        MineTweakerAPI.recipes.remove(item105)
        MineTweakerAPI.recipes.remove(item106)
        MineTweakerAPI.recipes.remove(item107)
        MineTweakerAPI.recipes.remove(item108)
        MineTweakerAPI.recipes.remove(item109)
        MineTweakerAPI.recipes.remove(item110)
        MineTweakerAPI.recipes.remove(item111)
        MineTweakerAPI.recipes.remove(item112)
        MineTweakerAPI.recipes.remove(item113)
        MineTweakerAPI.recipes.remove(item114)
        MineTweakerAPI.recipes.remove(item115)
        MineTweakerAPI.recipes.remove(item116)
        MineTweakerAPI.recipes.remove(item117)
        MineTweakerAPI.recipes.remove(item118)
        MineTweakerAPI.recipes.remove(item119)
        MineTweakerAPI.recipes.remove(item120)
        MineTweakerAPI.recipes.remove(item121)
        MineTweakerAPI.recipes.remove(item122)
        MineTweakerAPI.recipes.remove(item123)
        MineTweakerAPI.recipes.remove(item124)
        MineTweakerAPI.recipes.remove(item125)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:sandstone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:sandstone", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:sandstone", 2))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:coal", 1),
                        ItemBracketHandler.getItem("minecraft:coal", 1),
                        ItemBracketHandler.getItem("minecraft:coal", 1),
                        ItemBracketHandler.getItem("minecraft:glowstone_dust", 0)), false)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:barleyFood", 4),
                        ItemBracketHandler.getItem("Natura:barleyFood", 4), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:barleyFood", 4),
                                ItemBracketHandler.getItem("Natura:barleyFood", 4), null)))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:tnt", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:snow", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:clay", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:nether_brick", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:quartz_block", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:quartz_block", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:bookshelf", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:brewing_stand", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:clock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:compass", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_sword", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_shovel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_pickaxe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_axe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_hoe", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_chestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_leggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:diamond_boots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:ender_eye", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:chest_minecart", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:furnace_minecart", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:hopper_minecart", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:tnt_minecart", 0), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetIron"),
                        OreBracketHandler.getOre("nuggetIron"), OreBracketHandler.getOre("nuggetIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetIron"),
                                OreBracketHandler.getOre("nuggetIron"), OreBracketHandler.getOre("nuggetIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetIron"),
                                OreBracketHandler.getOre("nuggetIron"), OreBracketHandler.getOre("nuggetIron"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("nuggetIron"), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:gold_ingot", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetGold"),
                        OreBracketHandler.getOre("nuggetGold"), OreBracketHandler.getOre("nuggetGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetGold"),
                                OreBracketHandler.getOre("nuggetGold"), OreBracketHandler.getOre("nuggetGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetGold"),
                                OreBracketHandler.getOre("nuggetGold"), OreBracketHandler.getOre("nuggetGold"))))
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetGold"))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:golden_apple", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:golden_apple", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:golden_carrot", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:cake", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:pumpkin_seeds", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:melon_seeds", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:fermented_spider_eye", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:magma_cream", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:wooden_slab", 0).amount(6),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:planks", 0),
                        ItemBracketHandler.getItem("minecraft:planks", 0),
                        ItemBracketHandler.getItem("minecraft:planks", 0))))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 3))))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:dye", 15).amount(3),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:bone", 0)), false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:fire_charge", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:melon_block", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:soul_sand", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:nether_brick_fence", 0))

        //TODO Replace ("harvestcraft:wovencottonItem", 0)
        //MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:leather_helmet", 0),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), null,
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0))))
        //MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:leather_chestplate", 0),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), null,
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0))))
        //MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:leather_leggings", 0),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0),
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), null,
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), null,
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0))))
        //MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:leather_boots", 0),
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), null,
        //                ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0), null,
        //                        ItemBracketHandler.getItem("harvestcraft:wovencottonItem", 0))))

        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:name_tag", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:lead", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:pumpkin_pie", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:comparator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:repeater", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:nether_star", 0), null, false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:skull", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:skull", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:skull", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:flower_pot", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:emerald", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0),
                        ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0),
                                ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0),
                                ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0),
                                ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0),
                                ItemBracketHandler.getItem("ForbiddenMagic:FMResource", 0))))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:hay_block", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:wheat", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:diamond", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:beeNugget", 5),
                        ItemBracketHandler.getItem("MagicBees:beeNugget", 5),
                        ItemBracketHandler.getItem("MagicBees:beeNugget", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:beeNugget", 5),
                                ItemBracketHandler.getItem("MagicBees:beeNugget", 5),
                                ItemBracketHandler.getItem("MagicBees:beeNugget", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("MagicBees:beeNugget", 5),
                                ItemBracketHandler.getItem("MagicBees:beeNugget", 5),
                                ItemBracketHandler.getItem("MagicBees:beeNugget", 5))))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:slime_ball", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:item_frame", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:bed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:fishing_rod", 0))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:paper", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:reeds", 0),
                        ItemBracketHandler.getItem("minecraft:reeds", 0),
                        ItemBracketHandler.getItem("minecraft:reeds", 0))))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:poisonous_potato", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:sign", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:boat", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:painting", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("minecraft:bread", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:flint_and_steel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:dragon_egg", 0))
        MineTweakerAPI.recipes.remove(item137)
        MineTweakerAPI.recipes.remove(item138)
        MineTweakerAPI.recipes.remove(item139)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:skull", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:shears", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:sand", 0), null, false)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:sand", 0), null)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:glowstone_dust", 0), null, false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("minecraft:nether_star", 0))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:glass", 0), null, false)
        MineTweakerAPI.recipes.remove(OreBracketHandler.getOre("nuggetIron"))
        MineTweakerAPI.recipes.addShapeless(item20, arrayOf(item31, item31, ore5, ore5), null)
        MineTweakerAPI.recipes.addShaped(item,
                arrayOf(arrayOf<IIngredient>(ore5, OreBracketHandler.getOre("plankWood"), ore5),
                        arrayOf(OreBracketHandler.getOre("plankWood"), item31, OreBracketHandler.getOre("plankWood")),
                        arrayOf<IIngredient>(ore5, OreBracketHandler.getOre("plankWood"), ore5)), null)
        MineTweakerAPI.recipes.addShaped(item2,
                arrayOf(arrayOf<IIngredient?>(null, item36, null), arrayOf(ore33, item, ore33),
                        arrayOf<IIngredient?>(null, ore48, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:furnace", 0),
                arrayOf(arrayOf<IIngredient>(ore6, ore6, ore6), arrayOf<IIngredient>(item31, item31, item31),
                        arrayOf<IIngredient>(ore6, ore6, ore6)), null)
        MineTweakerAPI.recipes.addShaped(item5, arrayOf(arrayOf<IIngredient>(ore6, ore36, ore6),
                arrayOf(OreBracketHandler.getOre("springIron"), ItemBracketHandler.getItem("minecraft:string", 0),
                        OreBracketHandler.getOre("springIron")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtSmallAnyIron"), ore38,
                        OreBracketHandler.getOre("gearGtSmallAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(item41, arrayOf(arrayOf<IIngredient>(ore6, ore36, ore6),
                arrayOf(OreBracketHandler.getOre("springSmallIron"), ItemBracketHandler.getItem("minecraft:string", 0),
                        OreBracketHandler.getOre("springSmallIron")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtSmallAnyIron"), ore38,
                        OreBracketHandler.getOre("gearGtSmallAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(item6,
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0),
                        ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0),
                        ItemBracketHandler.getItem("CarpentersBlocks:blockCarpentersBlock", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtSmallAnyIron"),
                                OreBracketHandler.getOre("fenceWood"), OreBracketHandler.getOre("gearGtSmallAnyIron")),
                        arrayOf<IIngredient>(ore6, OreBracketHandler.getOre("plateRedAlloy"), ore6)), null)
        MineTweakerAPI.recipes.addShaped(item7, arrayOf(arrayOf<IIngredient?>(null, ore50, null),
                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slimeball"), null),
                arrayOf<IIngredient?>(null, item6, null)), null)
        MineTweakerAPI.recipes.addShaped(item9.amount(8),
                arrayOf(arrayOf<IIngredient?>(ore33, null, ore33), arrayOf<IIngredient?>(item130, item131, item130),
                        arrayOf<IIngredient?>(ore48, null, ore49)), null)
        MineTweakerAPI.recipes.addShaped(item11,
                arrayOf(arrayOf(ore33, item136, ore33), arrayOf<IIngredient>(item130, item131, item130),
                        arrayOf<IIngredient>(ore48, ore38, ore49)), null)
        MineTweakerAPI.recipes.addShaped(item12.amount(2),
                arrayOf(arrayOf(ore33, item25, ore33), arrayOf<IIngredient>(item130, item131, item130),
                        arrayOf<IIngredient>(ore48, ore38, ore49)), null)
        MineTweakerAPI.recipes.addShaped(item13, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plankWood"),
                OreBracketHandler.getOre("plankWood"), OreBracketHandler.getOre("plankWood")),
                arrayOf(item126, ore35, item126), arrayOf<IIngredient>(OreBracketHandler.getOre("plankWood"), ore38,
                OreBracketHandler.getOre("plankWood"))), null)
        MineTweakerAPI.recipes.addShaped(item19,
                arrayOf(arrayOf(ore5, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26500), ore5),
                        arrayOf(item13, ore2, item13), arrayOf<IIngredient>(ore5, ore37, ore5)), null)
        MineTweakerAPI.recipes.addShapeless(item21, arrayOf(item22, item23, ore51), null)
        MineTweakerAPI.recipes.addShaped(item26,
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:wooden_slab", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:wooden_slab", 0)), arrayOf(ore45, item31, ore45),
                        arrayOf(ItemBracketHandler.getItem("minecraft:wooden_slab", 0), ore45,
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 0))), null)
        MineTweakerAPI.recipes.addShaped(item26.amount(2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:wooden_slab", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:wooden_slab", 0)),
                        arrayOf<IIngredient>(ore45, ore33, ore45),
                        arrayOf(ItemBracketHandler.getItem("minecraft:wooden_slab", 0), ore45,
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 0))), null)
        MineTweakerAPI.recipes.addShaped(item26.amount(3),
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:wooden_slab", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:wooden_slab", 0)),
                        arrayOf<IIngredient>(ore45, ore34, ore45),
                        arrayOf(ItemBracketHandler.getItem("minecraft:wooden_slab", 0), ore45,
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"), ore49,
                        OreBracketHandler.getOre("screwIron")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("minecraft:stone_slab", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"), ore48,
                                OreBracketHandler.getOre("screwIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"), ore49,
                        OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"), ore48,
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:glass_pane", 0).amount(2),
                arrayOf<IIngredient>(ore52, ore3), null)
        MineTweakerAPI.recipes.addShapedMirrored(item23.amount(3),
                arrayOf(arrayOf<IIngredient?>(ore41, null), arrayOf<IIngredient?>(ore45, null)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item23.amount(2),
                arrayOf(arrayOf<IIngredient?>(ore42, null), arrayOf<IIngredient?>(ore45, null)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item23,
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("gemLignite"), null),
                        arrayOf<IIngredient?>(ore45, null)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item23.amount(5),
                arrayOf(arrayOf<IIngredient?>(ore43, null), arrayOf<IIngredient?>(ore45, null)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item23.amount(5),
                arrayOf(arrayOf(ore14, ItemBracketHandler.getItem("Railcraft:fluid.creosote.bucket", 0)),
                        arrayOf<IIngredient?>(ore45, null)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item23.amount(4),
                arrayOf(arrayOf<IIngredient?>(item134, null), arrayOf<IIngredient?>(ore45, null)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item23.amount(3),
                arrayOf(arrayOf(ore44, item8), arrayOf<IIngredient?>(ore45, null)), null)
        MineTweakerAPI.recipes.addShapedMirrored(item23.amount(2),
                arrayOf(arrayOf<IIngredient?>(item135, item8), arrayOf<IIngredient?>(ore45, null)), null)
        MineTweakerAPI.recipes.addShapeless(item24,
                arrayOf(ore45, ItemBracketHandler.getItem("minecraft:stone_button", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:stone_button", 0).amount(2),
                arrayOf(arrayOf(ore52, ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:wooden_button", 0).amount(2),
                arrayOf(arrayOf(ore52, ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0))), null)
        MineTweakerAPI.recipes.addShapedMirrored(item25,
                arrayOf(arrayOf<IIngredient?>(ore13, null), arrayOf<IIngredient?>(item23, null)), null)
        MineTweakerAPI.recipes.addShaped(item28,
                arrayOf(arrayOf<IIngredient>(ore45, ore48, ore45), arrayOf(item8, ore32, item8),
                        arrayOf<IIngredient>(ore45, ore50, ore45)), null)
        MineTweakerAPI.recipes.addShaped(item28.amount(2),
                arrayOf(arrayOf<IIngredient>(ore45, ore48, ore45), arrayOf(item8, ore33, item8),
                        arrayOf<IIngredient>(ore45, ore50, ore45)), null)
        MineTweakerAPI.recipes.addShaped(item28.amount(4),
                arrayOf(arrayOf<IIngredient>(ore45, ore48, ore45), arrayOf(item8, ore34, item8),
                        arrayOf<IIngredient>(ore45, ore50, ore45)), null)
        MineTweakerAPI.recipes.addShaped(item29,
                arrayOf(arrayOf(ore45, item132, ore45), arrayOf(ore45, item132, ore45), arrayOf(ore45, item132, ore45)),
                null)
        MineTweakerAPI.recipes.addShaped(item29.amount(2),
                arrayOf(arrayOf<IIngredient>(ore33, ore48, ore33), arrayOf(ore45, item132, ore45),
                        arrayOf(ore45, item132, ore45)), null)
        MineTweakerAPI.recipes.addShaped(item29.amount(4),
                arrayOf(arrayOf<IIngredient>(ore34, ore48, ore34), arrayOf(ore45, item132, ore45),
                        arrayOf(ore45, item132, ore45)), null)
        MineTweakerAPI.recipes.addShaped(item29.amount(2),
                arrayOf(arrayOfNulls(3), arrayOf(ore45, item3, ore45), arrayOf(ore45, item3, ore45)), null)
        MineTweakerAPI.recipes.addShaped(item29.amount(4),
                arrayOf(arrayOf<IIngredient>(ore33, ore48, ore33), arrayOf(ore45, item3, ore45),
                        arrayOf(ore45, item3, ore45)), null)
        MineTweakerAPI.recipes.addShaped(item29.amount(6),
                arrayOf(arrayOf<IIngredient>(ore34, ore48, ore34), arrayOf(ore45, item3, ore45),
                        arrayOf(ore45, item3, ore45)), null)
        MineTweakerAPI.recipes.addShaped(item30, arrayOf(arrayOf<IIngredient?>(item31, null, item31),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:planks", 0)),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(item30.amount(2), arrayOf(arrayOf<IIngredient>(ore33, ore48, ore33),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:planks", 0)),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(item30.amount(4), arrayOf(arrayOf<IIngredient>(ore34, ore48, ore34),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:planks", 0)),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(item30.amount(2),
                arrayOf(arrayOfNulls(3), arrayOf(item3, ore45, item3), arrayOf(item3, ore45, item3)), null)
        MineTweakerAPI.recipes.addShaped(item30.amount(4),
                arrayOf(arrayOf<IIngredient>(ore33, ore48, ore33), arrayOf(item3, ore45, item3),
                        arrayOf(item3, ore45, item3)), null)
        MineTweakerAPI.recipes.addShaped(item30.amount(6),
                arrayOf(arrayOf<IIngredient>(ore34, ore48, ore34), arrayOf(item3, ore45, item3),
                        arrayOf(item3, ore45, item3)), null)
        MineTweakerAPI.recipes.addShaped(item33,
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glass_pane", 0),
                        ItemBracketHandler.getItem("minecraft:glass_pane", 0),
                        ItemBracketHandler.getItem("minecraft:glass_pane", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glass_pane", 0), item34,
                                ItemBracketHandler.getItem("minecraft:glass_pane", 0)),
                        arrayOf(ItemBracketHandler.getItem("minecraft:glass_pane", 0), ore38,
                                ItemBracketHandler.getItem("minecraft:glass_pane", 0))), null)
        MineTweakerAPI.recipes.addShaped(item36, arrayOf(arrayOf<IIngredient?>(ore36, ore45, ore36),
                arrayOf(ItemBracketHandler.getItem("minecraft:string", 0), ore45,
                        ItemBracketHandler.getItem("minecraft:string", 0)),
                arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:string", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(item38,
                arrayOf(arrayOf<IIngredient>(ore4, ore4, ore4), arrayOf<IIngredient>(ore33, ore4, ore33),
                        arrayOf<IIngredient>(ore31, ore4, ore31)), null)

        //TODO Replace ("TConstruct:GlassPane", 0) in item133
        //MineTweakerAPI.recipes.addShaped(item39,
        //        arrayOf(arrayOf<IIngredient>(item133, item133, item133), arrayOf<IIngredient>(ore47, ore46, ore47),
        //                arrayOf<IIngredient>(ore39, ore38, ore39)), null)

        MineTweakerAPI.recipes.addShaped(item40,
                arrayOf(arrayOf(ore31, item, ore31), arrayOf<IIngredient>(ore31, ore37, ore31),
                        arrayOf<IIngredient>(ore49, ore31, OreBracketHandler.getOre("craftingToolFile"))), null)

        //TODO Replace ("ExtraUtilities:paintbrush", 0) in item128
        //MineTweakerAPI.recipes.addShaped(item46.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore15, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item46, arrayOf<IIngredient>(ore14, ore15), null)
        //MineTweakerAPI.recipes.addShaped(item46,
        //        arrayOf(arrayOf<IIngredient?>(item8, null, item8), arrayOf<IIngredient?>(null, item8, null),
        //                arrayOf<IIngredient?>(item8, null, item8)), null)
        //MineTweakerAPI.recipes.addShaped(item46, arrayOf(arrayOf<IIngredient>(item129, item129, item129),
        //        arrayOf<IIngredient>(item129, item129, item129), arrayOf<IIngredient>(item129, item129, item129)), null)
        //MineTweakerAPI.recipes.addShaped(item47.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore16, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item47, arrayOf<IIngredient>(ore14, ore16), null)
        //MineTweakerAPI.recipes.addShaped(item48.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore17, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item48, arrayOf<IIngredient>(ore14, ore17), null)
        //MineTweakerAPI.recipes.addShaped(item49.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore18, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item49, arrayOf<IIngredient>(ore14, ore18), null)
        //MineTweakerAPI.recipes.addShaped(item50.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore19, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item50, arrayOf<IIngredient>(ore14, ore19), null)
        //MineTweakerAPI.recipes.addShaped(item51.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore20, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item51, arrayOf<IIngredient>(ore14, ore20), null)
        //MineTweakerAPI.recipes.addShaped(item52.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore21, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item52, arrayOf<IIngredient>(ore14, ore21), null)
        //MineTweakerAPI.recipes.addShaped(item53.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore22, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item53, arrayOf<IIngredient>(ore14, ore22), null)
        //MineTweakerAPI.recipes.addShaped(item54.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore23, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item54, arrayOf<IIngredient>(ore14, ore23), null)
        //MineTweakerAPI.recipes.addShaped(item55.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore24, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item55, arrayOf<IIngredient>(ore14, ore24), null)
        //MineTweakerAPI.recipes.addShaped(item56.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore25, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item56, arrayOf<IIngredient>(ore14, ore25), null)
        //MineTweakerAPI.recipes.addShaped(item57.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore26, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item57, arrayOf<IIngredient>(ore14, ore26), null)
        //MineTweakerAPI.recipes.addShaped(item58.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore27, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item58, arrayOf<IIngredient>(ore14, ore27), null)
        //MineTweakerAPI.recipes.addShaped(item59.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore28, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item59, arrayOf<IIngredient>(ore14, ore28), null)
        //MineTweakerAPI.recipes.addShaped(item60.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore29, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item60, arrayOf<IIngredient>(ore14, ore29), null)
        //MineTweakerAPI.recipes.addShaped(item61.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14), arrayOf<IIngredient>(ore14, ore30, ore14),
        //                arrayOf(ore14, item128, ore14)), null)
        //MineTweakerAPI.recipes.addShapeless(item61, arrayOf<IIngredient>(ore14, ore30), null)
        //MineTweakerAPI.recipes.addShaped(item62.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore15, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item62, arrayOf<IIngredient>(ore3, ore15), null)
        //MineTweakerAPI.recipes.addShaped(item63.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore16, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item63, arrayOf<IIngredient>(ore3, ore16), null)
        //MineTweakerAPI.recipes.addShaped(item64.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore17, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item64, arrayOf<IIngredient>(ore3, ore17), null)
        //MineTweakerAPI.recipes.addShaped(item65.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore18, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item65, arrayOf<IIngredient>(ore3, ore18), null)
        //MineTweakerAPI.recipes.addShaped(item66.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore19, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item66, arrayOf<IIngredient>(ore3, ore19), null)
        //MineTweakerAPI.recipes.addShaped(item67.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore20, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item67, arrayOf<IIngredient>(ore3, ore20), null)
        //MineTweakerAPI.recipes.addShaped(item68.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore21, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item68, arrayOf<IIngredient>(ore3, ore21), null)
        //MineTweakerAPI.recipes.addShaped(item69.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore22, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item69, arrayOf<IIngredient>(ore3, ore22), null)
        //MineTweakerAPI.recipes.addShaped(item70.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore23, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item70, arrayOf<IIngredient>(ore3, ore23), null)
        //MineTweakerAPI.recipes.addShaped(item71.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore24, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item71, arrayOf<IIngredient>(ore3, ore24), null)
        //MineTweakerAPI.recipes.addShaped(item72.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore25, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item72, arrayOf<IIngredient>(ore3, ore25), null)
        //MineTweakerAPI.recipes.addShaped(item73.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore26, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item73, arrayOf<IIngredient>(ore3, ore26), null)
        //MineTweakerAPI.recipes.addShaped(item74.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore27, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item74, arrayOf<IIngredient>(ore3, ore27), null)
        //MineTweakerAPI.recipes.addShaped(item75.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore28, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item75, arrayOf<IIngredient>(ore3, ore28), null)
        //MineTweakerAPI.recipes.addShaped(item76.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore29, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item76, arrayOf<IIngredient>(ore3, ore29), null)
        //MineTweakerAPI.recipes.addShaped(item77.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore3, ore3, ore3), arrayOf<IIngredient>(ore3, ore30, ore3),
        //                arrayOf(ore3, item128, ore3)), null)
        //MineTweakerAPI.recipes.addShapeless(item77, arrayOf<IIngredient>(ore3, ore30), null)
        //MineTweakerAPI.recipes.addShaped(item78.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore15, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item78, arrayOf<IIngredient>(ore40, ore15), null)
        //MineTweakerAPI.recipes.addShaped(item79.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore16, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item79, arrayOf<IIngredient>(ore40, ore16), null)
        //MineTweakerAPI.recipes.addShaped(item80.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore17, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item80, arrayOf<IIngredient>(ore40, ore17), null)
        //MineTweakerAPI.recipes.addShaped(item81.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore18, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item81, arrayOf<IIngredient>(ore40, ore18), null)
        //MineTweakerAPI.recipes.addShaped(item82.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore19, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item82, arrayOf<IIngredient>(ore40, ore19), null)
        //MineTweakerAPI.recipes.addShaped(item83.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore20, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item83, arrayOf<IIngredient>(ore40, ore20), null)
        //MineTweakerAPI.recipes.addShaped(item84.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore21, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item84, arrayOf<IIngredient>(ore40, ore21), null)
        //MineTweakerAPI.recipes.addShaped(item85.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore22, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item85, arrayOf<IIngredient>(ore40, ore22), null)
        //MineTweakerAPI.recipes.addShaped(item86.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore23, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item86, arrayOf<IIngredient>(ore40, ore23), null)
        //MineTweakerAPI.recipes.addShaped(item87.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore24, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item87, arrayOf<IIngredient>(ore40, ore24), null)
        //MineTweakerAPI.recipes.addShaped(item88.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore25, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item88, arrayOf<IIngredient>(ore40, ore25), null)
        //MineTweakerAPI.recipes.addShaped(item89.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore26, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item89, arrayOf<IIngredient>(ore40, ore26), null)
        //MineTweakerAPI.recipes.addShaped(item90.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore27, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item90, arrayOf<IIngredient>(ore40, ore27), null)
        //MineTweakerAPI.recipes.addShaped(item91.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore28, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item91, arrayOf<IIngredient>(ore40, ore28), null)
        //MineTweakerAPI.recipes.addShaped(item92.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore29, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item92, arrayOf<IIngredient>(ore40, ore29), null)
        //MineTweakerAPI.recipes.addShaped(item93.amount(7),
        //        arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40), arrayOf<IIngredient>(ore40, ore30, ore40),
        //                arrayOf(ore40, item128, ore40)), null)
        //MineTweakerAPI.recipes.addShapeless(item93, arrayOf<IIngredient>(ore40, ore30), null)
        //MineTweakerAPI.recipes.addShaped(item94, arrayOf(arrayOf<IIngredient?>(item46, item46), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item94.amount(3),
        //        arrayOf(arrayOf(item46, item46, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item95.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore16, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item95, arrayOf(item94, ore16), null)
        //MineTweakerAPI.recipes.addShaped(item95, arrayOf(arrayOf<IIngredient?>(item47, item47), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item95.amount(3),
        //        arrayOf(arrayOf(item47, item47, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item96.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore17, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item96, arrayOf(item94, ore17), null)
        //MineTweakerAPI.recipes.addShaped(item96, arrayOf(arrayOf<IIngredient?>(item48, item48), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item96.amount(3),
        //        arrayOf(arrayOf(item48, item48, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item97.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore18, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item97, arrayOf(item94, ore18), null)
        //MineTweakerAPI.recipes.addShaped(item97, arrayOf(arrayOf<IIngredient?>(item49, item49), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item97.amount(3),
        //        arrayOf(arrayOf(item49, item49, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item98.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore19, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item98, arrayOf(item94, ore19), null)
        //MineTweakerAPI.recipes.addShaped(item98, arrayOf(arrayOf<IIngredient?>(item50, item50), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item98.amount(3),
        //        arrayOf(arrayOf(item50, item50, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item99.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore20, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item99, arrayOf(item94, ore20), null)
        //MineTweakerAPI.recipes.addShaped(item99, arrayOf(arrayOf<IIngredient?>(item51, item51), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item99.amount(3),
        //        arrayOf(arrayOf(item51, item51, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item100.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore21, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item100, arrayOf(item94, ore21), null)
        //MineTweakerAPI.recipes.addShaped(item100, arrayOf(arrayOf<IIngredient?>(item52, item52), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item100.amount(3),
        //        arrayOf(arrayOf(item52, item52, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item101.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore22, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item101, arrayOf(item94, ore22), null)
        //MineTweakerAPI.recipes.addShaped(item101, arrayOf(arrayOf<IIngredient?>(item53, item53), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item101.amount(3),
        //        arrayOf(arrayOf(item53, item53, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item102.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore23, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item102, arrayOf(item94, ore23), null)
        //MineTweakerAPI.recipes.addShaped(item102, arrayOf(arrayOf<IIngredient?>(item54, item54), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item102.amount(3),
        //        arrayOf(arrayOf(item54, item54, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item103.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore24, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item103, arrayOf(item94, ore24), null)
        //MineTweakerAPI.recipes.addShaped(item103, arrayOf(arrayOf<IIngredient?>(item55, item55), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item103.amount(3),
        //        arrayOf(arrayOf(item55, item55, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item104.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore25, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item104, arrayOf(item94, ore25), null)
        //MineTweakerAPI.recipes.addShaped(item104, arrayOf(arrayOf<IIngredient?>(item56, item56), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item104.amount(3),
        //        arrayOf(arrayOf(item56, item56, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item105.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore26, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item105, arrayOf(item94, ore26), null)
        //MineTweakerAPI.recipes.addShaped(item105, arrayOf(arrayOf<IIngredient?>(item57, item57), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item105.amount(3),
        //        arrayOf(arrayOf(item57, item57, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item106.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore27, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item106, arrayOf(item94, ore27), null)
        //MineTweakerAPI.recipes.addShaped(item106, arrayOf(arrayOf<IIngredient?>(item58, item58), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item106.amount(3),
        //        arrayOf(arrayOf(item58, item58, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item107.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore28, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item107, arrayOf(item94, ore28), null)
        //MineTweakerAPI.recipes.addShaped(item107, arrayOf(arrayOf<IIngredient?>(item59, item59), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item107.amount(3),
        //        arrayOf(arrayOf(item59, item59, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item108.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore29, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item108, arrayOf(item94, ore29), null)
        //MineTweakerAPI.recipes.addShaped(item108, arrayOf(arrayOf<IIngredient?>(item60, item60), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item108.amount(3),
        //        arrayOf(arrayOf(item60, item60, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item109.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item94, item94, item94), arrayOf(item94, ore30, item94),
        //                arrayOf<IIngredient>(item94, item128, item94)), null)
        //MineTweakerAPI.recipes.addShapeless(item109, arrayOf(item94, ore30), null)
        //MineTweakerAPI.recipes.addShaped(item109, arrayOf(arrayOf<IIngredient?>(item61, item61), arrayOfNulls(2)), null)
        //MineTweakerAPI.recipes.addShaped(item109.amount(3),
        //        arrayOf(arrayOf(item61, item61, ore52), arrayOfNulls(3), arrayOfNulls(3)), null)
        //MineTweakerAPI.recipes.addShaped(item110.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore15, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item110, arrayOf(item27, ore15), null)
        //MineTweakerAPI.recipes.addShaped(item111.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore16, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item111, arrayOf(item27, ore16), null)
        //MineTweakerAPI.recipes.addShaped(item112.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore17, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item112, arrayOf(item27, ore17), null)
        //MineTweakerAPI.recipes.addShaped(item113.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore18, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item113, arrayOf(item27, ore18), null)
        //MineTweakerAPI.recipes.addShaped(item114.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore19, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item114, arrayOf(item27, ore19), null)
        //MineTweakerAPI.recipes.addShaped(item115.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore20, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item115, arrayOf(item27, ore20), null)
        //MineTweakerAPI.recipes.addShaped(item116.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore21, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item116, arrayOf(item27, ore21), null)
        //MineTweakerAPI.recipes.addShaped(item117.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore22, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item117, arrayOf(item27, ore22), null)
        //MineTweakerAPI.recipes.addShaped(item118.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore23, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item118, arrayOf(item27, ore23), null)
        //MineTweakerAPI.recipes.addShaped(item119.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore24, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item119, arrayOf(item27, ore24), null)
        //MineTweakerAPI.recipes.addShaped(item120.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore25, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item120, arrayOf(item27, ore25), null)
        //MineTweakerAPI.recipes.addShaped(item121.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore26, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item121, arrayOf(item27, ore26), null)
        //MineTweakerAPI.recipes.addShaped(item122.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore27, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item122, arrayOf(item27, ore27), null)
        //MineTweakerAPI.recipes.addShaped(item123.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore28, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item123, arrayOf(item27, ore28), null)
        //MineTweakerAPI.recipes.addShaped(item124.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore29, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)
        //MineTweakerAPI.recipes.addShapeless(item124, arrayOf(item27, ore29), null)
        //MineTweakerAPI.recipes.addShaped(item125.amount(7),
        //        arrayOf(arrayOf<IIngredient>(item27, item27, item27), arrayOf(item27, ore30, item27),
        //                arrayOf<IIngredient>(item27, item128, item27)), null)

        MineTweakerAPI.recipes.addShapeless(item125, arrayOf(item27, ore30), null)
        MineTweakerAPI.recipes.addShapeless(item43, arrayOf(ore12, item44), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_sword", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500), null),
                        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:stick", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_shovel", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:stick", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:stick", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_pickaxe", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("minecraft:diamond", 0),
                        ItemBracketHandler.getItem("minecraft:diamond", 0)),
                        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                                ItemBracketHandler.getItem("minecraft:stick", 0),
                                OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:stick", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_axe", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("minecraft:diamond", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                ItemBracketHandler.getItem("minecraft:stick", 0), null),
                        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                                ItemBracketHandler.getItem("minecraft:stick", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_hoe", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("minecraft:diamond", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
                                ItemBracketHandler.getItem("minecraft:stick", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:stick", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_helmet", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_chestplate", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        OreBracketHandler.getOre("craftingToolHardHammer"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_leggings", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500), null,
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_boots", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500), null,
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                        arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:iron_horse_armor", 0),
                arrayOf(arrayOf(ore49, ore48, ItemBracketHandler.getItem("minecraft:iron_helmet", 0)),
                        arrayOf(OreBracketHandler.getOre("plateIron"),
                                ItemBracketHandler.getItem("minecraft:iron_chestplate", 0),
                                OreBracketHandler.getOre("plateIron")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:iron_leggings", 0),
                                OreBracketHandler.getOre("screwIron"),
                                ItemBracketHandler.getItem("minecraft:iron_leggings", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:golden_horse_armor", 0),
                arrayOf(arrayOf(ore49, ore48, ItemBracketHandler.getItem("minecraft:golden_helmet", 0)),
                        arrayOf(OreBracketHandler.getOre("plateGold"),
                                ItemBracketHandler.getItem("minecraft:golden_chestplate", 0),
                                OreBracketHandler.getOre("plateGold")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:golden_leggings", 0),
                                OreBracketHandler.getOre("screwGold"),
                                ItemBracketHandler.getItem("minecraft:golden_leggings", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:diamond_horse_armor", 0),
                arrayOf(arrayOf(ore49, ore48, ItemBracketHandler.getItem("minecraft:diamond_helmet", 0)),
                        arrayOf(OreBracketHandler.getOre("plateDiamond"),
                                ItemBracketHandler.getItem("minecraft:diamond_chestplate", 0),
                                OreBracketHandler.getOre("plateDiamond")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:diamond_leggings", 0),
                                OreBracketHandler.getOre("screwDiamond"),
                                ItemBracketHandler.getItem("minecraft:diamond_leggings", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:saddle", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("itemLeather"),
                        ItemBracketHandler.getItem("Backpack:tannedLeather", 0),
                        OreBracketHandler.getOre("itemLeather")), arrayOf(OreBracketHandler.getOre("itemLeather"),
                        ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE), OreBracketHandler.getOre("itemLeather")),
                        arrayOf(OreBracketHandler.getOre("ringAnyIron"),
                                ItemBracketHandler.getItem("minecraft:string", 0),
                                OreBracketHandler.getOre("ringAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:clock", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28086),
                        OreBracketHandler.getOre("plateGold"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28086)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086),
                                ItemBracketHandler.getItem("minecraft:comparator", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 26086)),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27086),
                                OreBracketHandler.getOre("craftingToolWrench"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:compass", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("paneGlass"), OreBracketHandler.getOre("boltIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringZinc"),
                                OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("ringZinc")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("boltRedAlloy"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwIron"))), null)
        MineTweakerAPI.recipes.addShaped(item27.amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemClay"), OreBracketHandler.getOre("itemClay"),
                        OreBracketHandler.getOre("itemClay")), arrayOf(OreBracketHandler.getOre("itemClay"),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0), OreBracketHandler.getOre("itemClay")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemClay"), OreBracketHandler.getOre("itemClay"),
                                OreBracketHandler.getOre("itemClay"))), null)

        //TODO Replace ("IguanaTweaksTConstruct:clayBucketWater", 0)
        //MineTweakerAPI.recipes.addShaped(item27.amount(2),
        //        arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("itemClay"), OreBracketHandler.getOre("itemClay"),
        //                OreBracketHandler.getOre("itemClay")), arrayOf(OreBracketHandler.getOre("itemClay"),
        //                ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0),
        //                OreBracketHandler.getOre("itemClay")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("itemClay"), OreBracketHandler.getOre("itemClay"),
        //                        OreBracketHandler.getOre("itemClay"))), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:pumpkin_seeds", 0).amount(2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:pumpkin", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:pumpkin_seeds", 0).amount(2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:pumpkin", 0),
                        OreBracketHandler.getOre("craftingToolSoftHammer"),
                        ItemBracketHandler.getItem("minecraft:pumpkin", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:melon_seeds", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:melon", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:melon_seeds", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:melon", 0),
                        OreBracketHandler.getOre("craftingToolSoftHammer"),
                        ItemBracketHandler.getItem("minecraft:melon", 0))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:melon", 0).amount(6),
                arrayOf(OreBracketHandler.getOre("craftingToolKnife"),
                        ItemBracketHandler.getItem("minecraft:melon_block", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                arrayOf<IIngredient>(OreBracketHandler.getOre("dustSmallGunpowder"),
                        OreBracketHandler.getOre("dustSmallGunpowder"), OreBracketHandler.getOre("dustSmallGunpowder"),
                        OreBracketHandler.getOre("dustSmallGunpowder")), null)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("minecraft:glass", 0), null)

        //TODO Replace ("IguanaTweaksTConstruct:clayBucketWater", 0)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32559),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881)), null)

        //TODO Replace ("harvestcraft:freshwaterItem", 0)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32559),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:freshwaterItem", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2881),
        //                ItemBracketHandler.getItem("harvestcraft:freshwaterItem", 0)), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:chest_minecart", 0),
                arrayOf(arrayOf(ore49, ItemBracketHandler.getItem("minecraft:chest", 0), ore53),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:minecart", 0), null),
                        arrayOf<IIngredient?>(null, ore48, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:furnace_minecart", 0),
                arrayOf(arrayOf(ore49, ItemBracketHandler.getItem("minecraft:furnace", 0), ore53),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:minecart", 0), null),
                        arrayOf<IIngredient?>(null, ore48, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:hopper_minecart", 0),
                arrayOf(arrayOf(ore49, ItemBracketHandler.getItem("minecraft:hopper", 0), ore53),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:minecart", 0), null),
                        arrayOf<IIngredient?>(null, ore48, null)), null)
        MineTweakerAPI.recipes.addShaped(item137, arrayOf(arrayOf<IIngredient>(ore54, ore54, ore54),
                arrayOf(ore54, IngredientTransform.reuse(ItemBracketHandler.getItem("minecraft:compass", 0)), ore54),
                arrayOf<IIngredient>(ore54, ore54, ore54)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:dye", 15).amount(3),
                arrayOf(ItemBracketHandler.getItem("minecraft:bone", 0),
                        OreBracketHandler.getOre("craftingToolMortar")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:lead", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:string", 0),
                        ItemBracketHandler.getItem("minecraft:string", 0),
                        ItemBracketHandler.getItem("minecraft:string", 0)),
                        arrayOf(ItemBracketHandler.getItem("minecraft:string", 0),
                                OreBracketHandler.getOre("slimeball"),
                                ItemBracketHandler.getItem("minecraft:string", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:string", 0),
                                ItemBracketHandler.getItem("minecraft:string", 0),
                                ItemBracketHandler.getItem("minecraft:string", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:pumpkin_pie", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolRollingPin"),
                        ItemBracketHandler.getItem("minecraft:pumpkin", 0), OreBracketHandler.getOre("dustSugar")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:pumpkin", 0),
                                OreBracketHandler.getOre("dustSugar"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("dustSugar"), null, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:comparator", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingRedstoneTorch"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                OreBracketHandler.getOre("plateNetherQuartz"),
                                OreBracketHandler.getOre("craftingRedstoneTorch")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:comparator", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingRedstoneTorch"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                OreBracketHandler.getOre("plateCertusQuartz"),
                                OreBracketHandler.getOre("craftingRedstoneTorch")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:comparator", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingRedstoneTorch"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                OreBracketHandler.getOre("plateChargedCertusQuartz"),
                                OreBracketHandler.getOre("craftingRedstoneTorch")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:comparator", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("craftingRedstoneTorch"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                OreBracketHandler.getOre("plateQuartzite"),
                                OreBracketHandler.getOre("craftingRedstoneTorch")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:repeater", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("screwIron"), null,
                        OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingRedstoneTorch"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("craftingRedstoneTorch")),
                        arrayOf(ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                                OreBracketHandler.getOre("stickRedAlloy"),
                                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:item_frame", 0),
                arrayOf(arrayOf(item8, ore36, item8), arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("itemLeather"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:bed", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plankWood"),
                                OreBracketHandler.getOre("plankWood"), OreBracketHandler.getOre("plankWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("fenceWood"),
                                OreBracketHandler.getOre("craftingToolSoftHammer"),
                                OreBracketHandler.getOre("fenceWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:fishing_rod", 0),
                arrayOf(arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickLongWood")),
                        arrayOf(null, OreBracketHandler.getOre("stickLongWood"),
                                ItemBracketHandler.getItem("minecraft:string", 0)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickLongWood"),
                                OreBracketHandler.getOre("craftingToolWireCutter"),
                                OreBracketHandler.getOre("ringAnyIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:paper", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("dustWood"), OreBracketHandler.getOre("dustWood"),
                        OreBracketHandler.getOre("dustWood")), arrayOf(OreBracketHandler.getOre("dustWood"),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0), OreBracketHandler.getOre("dustWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dustWood"), OreBracketHandler.getOre("dustWood"),
                                OreBracketHandler.getOre("dustWood"))), null)

        //TODO Replace ("IguanaTweaksTConstruct:clayBucketWater", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:paper", 0).amount(2),
        //        arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("dustWood"), OreBracketHandler.getOre("dustWood"),
        //                OreBracketHandler.getOre("dustWood")), arrayOf(OreBracketHandler.getOre("dustWood"),
        //                ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0),
        //                OreBracketHandler.getOre("dustWood")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("dustWood"), OreBracketHandler.getOre("dustWood"),
        //                        OreBracketHandler.getOre("dustWood"))), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:string", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:barleyFood", 3),
                        ItemBracketHandler.getItem("Natura:barleyFood", 3),
                        ItemBracketHandler.getItem("Natura:barleyFood", 3))), null)
        MineTweakerAPI.recipes.remove(item138)
        MineTweakerAPI.recipes.remove(item139)

        //TODO Replace ("IguanaTweaksTConstruct:clayBucketFired", 0)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:flower_pot", 0),
        //        arrayOf(OreBracketHandler.getOre("craftingToolFile"),
        //                ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketFired", 0)), null)

        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                arrayOf<IIngredient>(ore52, ore7), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:stone_slab", 1),
                arrayOf<IIngredient>(ore52, ore8), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:stone_slab", 3),
                arrayOf<IIngredient>(ore52, ore6), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:stone_slab", 4),
                arrayOf(ore52, item42), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:stone_slab", 5),
                arrayOf<IIngredient>(ore52, ore9), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:stone_slab", 6),
                arrayOf<IIngredient>(ore52, ore10), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("minecraft:stone_slab", 7),
                arrayOf<IIngredient>(ore52, ore11), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:brick_block", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ingotBrick"),
                        OreBracketHandler.getOre("ingotBrick"), OreBracketHandler.getOre("ingotBrick")),
                        arrayOf(OreBracketHandler.getOre("ingotBrick"),
                                ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                                OreBracketHandler.getOre("ingotBrick")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ingotBrick"),
                                OreBracketHandler.getOre("ingotBrick"), OreBracketHandler.getOre("ingotBrick"))), null)

        //TODO Replace ("IguanaTweaksTConstruct:clayBucketWater", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:brick_block", 0).amount(2),
        //        arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ingotBrick"),
        //                OreBracketHandler.getOre("ingotBrick"), OreBracketHandler.getOre("ingotBrick")),
        //                arrayOf(OreBracketHandler.getOre("ingotBrick"),
        //                        ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0),
        //                        OreBracketHandler.getOre("ingotBrick")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("ingotBrick"),
        //                        OreBracketHandler.getOre("ingotBrick"), OreBracketHandler.getOre("ingotBrick"))), null)

        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("minecraft:brick", 0),
                ItemBracketHandler.getItem("dreamcraft:item.UnfiredClayBrick", 0), 0.0)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:nether_brick", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ingotBrickNether"),
                        OreBracketHandler.getOre("ingotBrickNether"), OreBracketHandler.getOre("ingotBrickNether")),
                        arrayOf(OreBracketHandler.getOre("ingotBrickNether"),
                                ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                                OreBracketHandler.getOre("ingotBrickNether")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ingotBrickNether"),
                                OreBracketHandler.getOre("ingotBrickNether"),
                                OreBracketHandler.getOre("ingotBrickNether"))), null)

        //TODO Replace ("IguanaTweaksTConstruct:clayBucketLava", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:nether_brick", 0).amount(2),
        //        arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("ingotBrickNether"),
        //                OreBracketHandler.getOre("ingotBrickNether"), OreBracketHandler.getOre("ingotBrickNether")),
        //                arrayOf(OreBracketHandler.getOre("ingotBrickNether"),
        //                        ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketLava", 0),
        //                        OreBracketHandler.getOre("ingotBrickNether")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("ingotBrickNether"),
        //                        OreBracketHandler.getOre("ingotBrickNether"),
        //                        OreBracketHandler.getOre("ingotBrickNether"))), null)

        MineTweakerAPI.recipes.addShaped(item138, arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0),
                ItemBracketHandler.getItem("minecraft:trapdoor", 0), ore48),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0),
                        ItemBracketHandler.getItem("minecraft:planks", 0), ore52)), null)
        MineTweakerAPI.recipes.addShaped(item138, arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0),
                ItemBracketHandler.getItem("minecraft:trapdoor", 0), ore48),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0),
                        ItemBracketHandler.getItem("minecraft:planks", 0), ore52)), null)
        MineTweakerAPI.recipes.addShaped(item138, arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0),
                ItemBracketHandler.getItem("minecraft:trapdoor", 0), ore52),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), OreBracketHandler.getOre("ringAnyIron"),
                        OreBracketHandler.getOre("screwAnyIron")),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0),
                        ItemBracketHandler.getItem("minecraft:planks", 0), ore48)), null)
        MineTweakerAPI.recipes.addShaped(item138, arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0),
                ItemBracketHandler.getItem("minecraft:trapdoor", 0), ore52),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0), OreBracketHandler.getOre("ringCopper"),
                        OreBracketHandler.getOre("screwCopper")),
                arrayOf(ItemBracketHandler.getItem("minecraft:planks", 0),
                        ItemBracketHandler.getItem("minecraft:planks", 0), ore48)), null)
        MineTweakerAPI.recipes.addShaped(item139, arrayOf(arrayOf(ore31, item127, ore49),
                arrayOf<IIngredient>(ore31, OreBracketHandler.getOre("ringSteel"),
                        OreBracketHandler.getOre("screwSteel")), arrayOf<IIngredient>(ore31, ore31, ore48)), null)
        MineTweakerAPI.recipes.addShaped(item139, arrayOf(arrayOf(ore31, item127, ore48),
                arrayOf<IIngredient>(ore31, OreBracketHandler.getOre("ringSteel"),
                        OreBracketHandler.getOre("screwSteel")), arrayOf<IIngredient>(ore31, ore31, ore49)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32471),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32471),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32471)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32471),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32471),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32471)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32472),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32472),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32472)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32472),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32472),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32472)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32473),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32473),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32473)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32473),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32473),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32473)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32474),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32474),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32474)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32474),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32474),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32474)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32475),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32475),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32475)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32475),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32475),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32475)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32476),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32476),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32476)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32476),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32476),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32476)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32477),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32477),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32477)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32477),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32477),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32477)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32478),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32478),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32478)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32478),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32478),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32478)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32479),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32479),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32479)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32479),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32479),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32479)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32480),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32480),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32480)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32480),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32480),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32480)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32481),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32481),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32481)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32481),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32481),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32481)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32482),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32482),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32482)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32482),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32482),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32482)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32483),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32483),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32483)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32483),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32483),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32483)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32484),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32484),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32484)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32484),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32484),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32484)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32485),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32485),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32485)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32485),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32485),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32485)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32486),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32486),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32486)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32486),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32486),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32486)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32487),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32487),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32487)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32487),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32487),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32487)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32488),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32488),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32488)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32488),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32488),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32488)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32489),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32489),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32489)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32489),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32489),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32489)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32490),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32490),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32490)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32490),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32490),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32490)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32491),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32491),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32491)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32491),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32491),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32491)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32492),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32492),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32492)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32492),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32492),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32492)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32493),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32493),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32493)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32493),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32493),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32493)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32494),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32494),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32494)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32494),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32494),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32494)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32495),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32495),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32495)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32495),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32495),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32495)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32496),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32496),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32496)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32496),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32496),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32496)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32497),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32497),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32497)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32497),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32497),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32497)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32498),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32498),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32498)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32498),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32498),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32498)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:sign", 0).amount(3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32499),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32499),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32499)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32499),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32499),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32499)),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:boat", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plankWood"), null,
                        OreBracketHandler.getOre("plankWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plankWood"),
                                OreBracketHandler.getOre("craftingToolKnife"), OreBracketHandler.getOre("plankWood")),
                        arrayOf<IIngredient?>(ore39, ore39, ore39)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:painting", 0),
                arrayOf(arrayOf(item8, ore36, item8), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:carpet", OreDictionary.WILDCARD_VALUE), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("minecraft:bread", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32561), 0.0)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:flint_and_steel", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("gearGtSmallSteel"), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:flint", 0), null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("springSmallSteel"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:shears", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("ringIron"), OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:nether_star", 0).amount(16),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.03", 2506),
                        OreBracketHandler.getOre("craftingToolCrowbar"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:mossy_cobblestone", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("minecraft:cobblestone", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)

        //TODO Replace ("TConstruct:buckets", 25)
        //MineTweakerAPI.recipes.addShaped(item16, arrayOf(arrayOf(item8, ore54, OreBracketHandler.getOre("itemLeather")),
        //        arrayOf(item8, ore54, ItemBracketHandler.getItem("TConstruct:buckets", 25)),
        //        arrayOf(item8, ore54, OreBracketHandler.getOre("itemLeather"))), null)

        MineTweakerAPI.recipes.addShaped(item15, arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateWood"),
                OreBracketHandler.getOre("plateWood"), OreBracketHandler.getOre("plateWood")),
                arrayOf<IIngredient>(item16, item16, item16),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateWood"), OreBracketHandler.getOre("plateWood"),
                        OreBracketHandler.getOre("plateWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9032).amount(9),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSaw"),
                        OreBracketHandler.getOre("ingotIron"), null), arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:gold_nugget", 0).amount(9),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSaw"),
                        OreBracketHandler.getOre("ingotGold"), null), arrayOfNulls(3), arrayOfNulls(3)), null)
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("Natura:tree", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("Natura:redwood", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("Natura:willow", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("Natura:DarkTree", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("Natura:RareTree", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("TwilightForest:tile.TFLog", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("TwilightForest:tile.TFMagicLog", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("witchery:witchlog", OreDictionary.WILDCARD_VALUE), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("TaintedMagic:BlockWarpwoodLog", 0), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("thaumicbases:genLogs", 0), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        BlastFurnace.addRecipe(ItemBracketHandler.getItem("thaumicbases:genLogs", 1), false, false, 20,
                ItemBracketHandler.getItem("minecraft:coal", 1))
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:brick", 0),
                ItemBracketHandler.getItem("minecraft:clay_ball", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 200, VoltageLevels.LULV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2807),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 200, VoltageLevels.LULV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:glass", 0),
                ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308).amount(0), 5, VoltageLevels.LMV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:iron_helmet", 0),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(5),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0).amount(0), 200, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:iron_chestplate", 0),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(8),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0).amount(0), 200, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:iron_leggings", 0),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(7),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0).amount(0), 200, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:iron_boots", 0),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0).amount(0), 200, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:golden_helmet", 0),
                ItemBracketHandler.getItem("minecraft:gold_ingot", 0).amount(5),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0).amount(0), 200, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:golden_chestplate", 0),
                ItemBracketHandler.getItem("minecraft:gold_ingot", 0).amount(8),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0).amount(0), 200, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:golden_leggings", 0),
                ItemBracketHandler.getItem("minecraft:gold_ingot", 0).amount(7),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0).amount(0), 200, VoltageLevels.LV)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("minecraft:golden_boots", 0),
                ItemBracketHandler.getItem("minecraft:gold_ingot", 0).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0).amount(0), 200, VoltageLevels.LV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:glass", 0).amount(2)),
                ItemBracketHandler.getItem("minecraft:sand", 1), LiquidBracketHandler.getLiquid("oxygen").withAmount(2),
                intArrayOf(10000), 20, VoltageLevels.LHV)
        ArcFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:glass", 0).amount(2)),
                ItemBracketHandler.getItem("minecraft:sand", 0), LiquidBracketHandler.getLiquid("oxygen").withAmount(2),
                intArrayOf(10000), 20, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:string", 0),
                ItemBracketHandler.getItem("Natura:barleyFood", 3).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:hay_block", 0),
                ItemBracketHandler.getItem("minecraft:wheat", 0).amount(9),
                ItemBracketHandler.getItem("minecraft:string", 0).amount(2), 200, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                ItemBracketHandler.getItem("Natura:heatsand", 0),
                ItemBracketHandler.getItem("Natura:soil.tainted", 0).amount(4),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 100, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:skull", 1),
                ItemBracketHandler.getItem("MagicBees:miscResources", 4).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 6).amount(0),
                LiquidBracketHandler.getLiquid("molten.thaumium").withAmount(216), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:torch", 0).amount(5),
                ItemBracketHandler.getItem("minecraft:stick", 0), ItemBracketHandler.getItem("minecraft:wool", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("creosote").withAmount(500), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:torch", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:stick", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2536), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:torch", 0).amount(6),
                ItemBracketHandler.getItem("minecraft:stick", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2535), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:torch", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:stick", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2022), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:torch", 0).amount(6),
                ItemBracketHandler.getItem("minecraft:stick", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2022), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:wooden_door", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809).amount(4),
                ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:wooden_door", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809).amount(4),
                ItemBracketHandler.getItem("minecraft:trapdoor", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:iron_door", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032).amount(4),
                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:trapdoor", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:stick", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:trapdoor", 0).amount(6),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:stick", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:trapdoor", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 0).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", OreDictionary.WILDCARD_VALUE).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:trapdoor", 0).amount(6),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 0).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", OreDictionary.WILDCARD_VALUE).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:trapdoor", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 0).amount(4),
                ItemBracketHandler.getItem("BiomesOPlenty:bamboo", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:trapdoor", 0).amount(6),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 0).amount(4),
                ItemBracketHandler.getItem("BiomesOPlenty:bamboo", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:piston", 0),
                ItemBracketHandler.getItem("dreamcraft:tile.PistonBlock", 0),
                ItemBracketHandler.getItem("dreamcraft:item.PistonPlate", 0), 100, VoltageLevels.LV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:bookshelf", 0),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:crafting_table", 0), ore5,
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(item30, ItemBracketHandler.getItem("minecraft:stick", 0).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", 0).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("minecraft:log2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs1", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs2", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs3", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("BiomesOPlenty:logs4", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("ExtraTrees:log", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logs", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("minecraft:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("BiomesOPlenty:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("ExtraTrees:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Forestry:planksFireproof", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 6).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 7).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("Forestry:logsFireproof", OreDictionary.WILDCARD_VALUE).amount(2),
                ItemBracketHandler.getItem("witchery:witchwood", OreDictionary.WILDCARD_VALUE).amount(2), 100, VoltageLevels.LV)
        Assembler.addRecipe(item24, ItemBracketHandler.getItem("minecraft:stick", 0),
                ItemBracketHandler.getItem("minecraft:stone_button", 0), 50, VoltageLevels.LLV)
        Assembler.addRecipe(item24, ItemBracketHandler.getItem("Natura:natura.stick", OreDictionary.WILDCARD_VALUE),
                ItemBracketHandler.getItem("minecraft:stone_button", 0), 50, VoltageLevels.LLV)
        Assembler.addRecipe(item24, ItemBracketHandler.getItem("BiomesOPlenty:bamboo", 0),
                ItemBracketHandler.getItem("minecraft:stone_button", 0), 50, VoltageLevels.LLV)
        Assembler.addRecipe(item24, ItemBracketHandler.getItem("BiomesOPlenty:plants", 8),
                ItemBracketHandler.getItem("minecraft:stone_button", 0), 50, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:ladder", 0),
                ItemBracketHandler.getItem("minecraft:stick", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27809), 100, VoltageLevels.ULV)

        //TODO Replace getLiquid("glue")
        //Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:ladder", 0).amount(2),
        //        ItemBracketHandler.getItem("minecraft:stick", 0).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27032),
        //        LiquidBracketHandler.getLiquid("glue").withAmount(16), 100, VoltageLevels.LLV)
        //Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:ladder", 0).amount(4),
        //        ItemBracketHandler.getItem("minecraft:stick", 0).amount(2),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27305),
        //        LiquidBracketHandler.getLiquid("glue").withAmount(32), 100, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:brick_block", 0).amount(2),
                ItemBracketHandler.getItem("minecraft:brick", 0).amount(8),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0),
                LiquidBracketHandler.getLiquid("water").withAmount(500), 300, VoltageLevels.LLV)
        Assembler.addRecipe(item140.amount(3), item141, item143, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item144, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item145, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item146, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item147, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item148, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item149, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item150, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item151, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item152, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item153, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item154, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item155, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item156, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item157, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item158, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item159, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item160, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item161, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item162, 100, 4)
        Assembler.addRecipe(item140.amount(3), item141, item163, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item143, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item144, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item145, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item146, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item147, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item148, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item149, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item150, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item151, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item152, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item153, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item154, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item155, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item156, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item157, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item158, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item159, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item160, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item161, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item162, 100, 4)
        Assembler.addRecipe(item140.amount(3), item142, item163, 100, 4)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0).amount(2),
                ItemBracketHandler.getItem("minecraft:stone_slab", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0).amount(2),
                ItemBracketHandler.getItem("minecraft:stone_slab", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)

        //TODO Replace ("TConstruct:GlassBlock", 0)
        //gttweaker.mods.gregtech.machines.BlastFurnace.addRecipe(
        //        arrayOf(ItemBracketHandler.getItem("minecraft:glass", 0)),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:GlassBlock", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)), 100, 120, 1000)
        //gttweaker.mods.gregtech.machines.BlastFurnace.addRecipe(
        //        arrayOf(ItemBracketHandler.getItem("minecraft:glass_pane", 0)),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)), 100, 120, 1000)

        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:bone", 0).amount(8),
                ItemBracketHandler.getItem("minecraft:bone", 0).amount(6),
                ItemBracketHandler.getItem("minecraft:bone", 0).amount(4)),
                ItemBracketHandler.getItem("minecraft:skull", 0),
                LiquidBracketHandler.getLiquid("hell_blood").withAmount(1000), intArrayOf(10000, 7500, 5000), 200, VoltageLevels.LV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:coal_block", 0).amount(2),
                ItemBracketHandler.getItem("minecraft:coal_block", 0),
                ItemBracketHandler.getItem("minecraft:coal_block", 0)),
                ItemBracketHandler.getItem("minecraft:skull", 1),
                LiquidBracketHandler.getLiquid("hell_blood").withAmount(1000), intArrayOf(10000, 7500, 5000), 200, VoltageLevels.LV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:gunpowder", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:gunpowder", 0).amount(3),
                ItemBracketHandler.getItem("minecraft:gunpowder", 0).amount(2)),
                ItemBracketHandler.getItem("minecraft:skull", 4),
                LiquidBracketHandler.getLiquid("hell_blood").withAmount(1000), intArrayOf(10000, 7500, 5000), 200, VoltageLevels.LV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                ItemBracketHandler.getItem("minecraft:ender_pearl", 0)),
                ItemBracketHandler.getItem("HardcoreEnderExpansion:enderman_head", 0),
                LiquidBracketHandler.getLiquid("hell_blood").withAmount(1000), intArrayOf(10000, 5000, 2500), 200, VoltageLevels.LV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0)),
                ItemBracketHandler.getItem("minecraft:skull", 3),
                LiquidBracketHandler.getLiquid("hell_blood").withAmount(1000), intArrayOf(1000), 200, VoltageLevels.LV)
        ChemicalBath.addRecipe(arrayOf(ItemBracketHandler.getItem("minecraft:rotten_flesh", 0).amount(4),
                ItemBracketHandler.getItem("minecraft:leather", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2892).amount(4)),
                ItemBracketHandler.getItem("minecraft:skull", 2),
                LiquidBracketHandler.getLiquid("hell_blood").withAmount(1000), intArrayOf(10000, 3000, 5000), 200, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("minecraft:wooden_button", 0).amount(2), null,
                ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("minecraft:wooden_button", 0).amount(2), null,
                ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("minecraft:wooden_button", 0).amount(2), null,
                ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("minecraft:stone_button", 0).amount(2), null,
                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("minecraft:stone_button", 0).amount(2), null,
                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("minecraft:stone_button", 0).amount(2), null,
                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 3))
        Extractor.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 2))
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:wheat", 0).amount(9),
                ItemBracketHandler.getItem("minecraft:hay_block", 0))
        FluidExtractor.addRecipe(null, ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE),
                LiquidBracketHandler.getLiquid("molten.glass").withAmount(144), 10000, 200, 48)

        //TODO Replace getLiquid("obsidian.molten")
        //FluidExtractor.addRecipe(null, ItemBracketHandler.getItem("minecraft:obsidian", 0),
        //        LiquidBracketHandler.getLiquid("obsidian.molten").withAmount(288), 10000, 600, 30)

        Mixer.addRecipe(ItemBracketHandler.getItem("minecraft:soul_sand", 0).amount(4), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:sand", OreDictionary.WILDCARD_VALUE).amount(4),
                        ItemBracketHandler.getItem("minecraft:dirt", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("MagicBees:wax", 1).amount(4)),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 100, VoltageLevels.LLV)
        Mixer.addRecipe(ItemBracketHandler.getItem("minecraft:fire_charge", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:blaze_powder", 0).amount(3),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0).amount(3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2535).amount(3)), 400, VoltageLevels.LV)
        Slicer.addRecipe(ItemBracketHandler.getItem("minecraft:melon", 0).amount(8),
                ItemBracketHandler.getItem("minecraft:melon_block", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32398).amount(0), 100, VoltageLevels.ULV)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0), 75)
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftCore:item.meteoricIronIngot", 1),
                "Compressed Meteoric Steel Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 6), "Compressed Copper Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 7), "Compressed Tin Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 8), "Compressed Aluminium Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 9), "Compressed Steel Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 10), "Compressed Bronze Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftCore:item.basicItem", 11), "Compressed Iron Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftMars:item.itemBasicAsteroids", 6),
                "Compressed Titanium Plate")
        NEI.overrideName(ItemBracketHandler.getItem("GalacticraftMars:item.null", 5), "Compressed Desh Plate")
    }
}