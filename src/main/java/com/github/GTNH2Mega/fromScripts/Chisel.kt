package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.chisel.handlers.Groups
import com.github.GTNH2Mega.VoltageLevels

class Chisel : Runnable {
    override fun run() {
        Groups.addGroup("glasswork")
        val item = ItemBracketHandler.getItem("chisel:chisel", 0)
        val item2 = ItemBracketHandler.getItem("chisel:obsidianChisel", 0)
        val item3 = ItemBracketHandler.getItem("chisel:diamondChisel", 0)
        val item4 = ItemBracketHandler.getItem("chisel:cloudinabottle", 0)
        OreBracketHandler.getOre("plateWood")
        val ore = OreBracketHandler.getOre("plateAnyIron")
        OreBracketHandler.getOre("plateSteel")
        val ore2 = OreBracketHandler.getOre("plateObsidian")
        OreBracketHandler.getOre("screwWood")
        val ore3 = OreBracketHandler.getOre("screwAnyIron")
        val ore4 = OreBracketHandler.getOre("screwWroughtIron")
        val ore5 = OreBracketHandler.getOre("screwSteel")
        OreBracketHandler.getOre("stickAnyIron")
        val ore6 = OreBracketHandler.getOre("stickSteel")
        val ore7 = OreBracketHandler.getOre("stickWood")
        val ore8 = OreBracketHandler.getOre("stickWroughtIron")
        OreBracketHandler.getOre("stickObsidian")
        OreBracketHandler.getOre("dustTinyQuartzite")
        ItemBracketHandler.getItem("minecraft:glass_bottle", 0)
        val ore9 = OreBracketHandler.getOre("craftingToolHardHammer")
        val ore10 = OreBracketHandler.getOre("craftingToolScrewdriver")
        MineTweakerAPI.recipes.remove(item)
        MineTweakerAPI.recipes.remove(item2)
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.remove(item4)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("chisel:ballomoss", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("chisel:smashingrock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("chisel:autoChisel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("chisel:upgrade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("chisel:upgrade", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("chisel:upgrade", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("chisel:upgrade", 3))
        Groups.removeGroup("cobblestone")
        Groups.removeGroup("glowstone")
        Groups.removeVariation(ItemBracketHandler.getItem("minecraft:stonebrick", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("chisel:voidstone2", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("chisel:concrete", 0), null)
        Groups.removeVariation(ItemBracketHandler.getItem("minecraft:torch", 0))
        MineTweakerAPI.recipes.addShaped(item,
                arrayOf(arrayOf<IIngredient>(ore9, ore, ore), arrayOf<IIngredient>(ore3, ore7, ore),
                        arrayOf<IIngredient>(ore7, ore3, ore10)), null)
        MineTweakerAPI.recipes.addShaped(item,
                arrayOf(arrayOf<IIngredient>(ore10, ore, ore), arrayOf<IIngredient>(ore3, ore7, ore),
                        arrayOf<IIngredient>(ore7, ore3, ore9)), null)
        MineTweakerAPI.recipes.addShaped(item2,
                arrayOf(arrayOf<IIngredient>(ore9, ore2, ore2), arrayOf<IIngredient>(ore4, ore8, ore2),
                        arrayOf<IIngredient>(ore8, ore4, ore10)), null)
        MineTweakerAPI.recipes.addShaped(item2,
                arrayOf(arrayOf<IIngredient>(ore10, ore2, ore2), arrayOf<IIngredient>(ore4, ore8, ore2),
                        arrayOf<IIngredient>(ore8, ore4, ore9)), null)
        MineTweakerAPI.recipes.addShaped(item3,
                arrayOf(arrayOf<IIngredient>(ore9, OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(ore5, ore6, OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(ore6, ore5, ore10)), null)
        MineTweakerAPI.recipes.addShaped(item3,
                arrayOf(arrayOf<IIngredient>(ore10, OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(ore5, ore6, OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient>(ore6, ore5, ore9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("chisel:autoChisel", 0),
                arrayOf(arrayOf<IIngredient>(ore5, OreBracketHandler.getOre("ringWoodSealed"), ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32744),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650)),
                        arrayOf(ore10, ItemBracketHandler.getItem("IronChest:BlockIronChest", 0), ore9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("chisel:upgrade", 0),
                arrayOf(arrayOf<IIngredient>(ore5, OreBracketHandler.getOre("plateEmerald"), ore5),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateEmerald"),
                                OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateEmerald")),
                        arrayOf(OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32630),
                                OreBracketHandler.getOre("wireGt01RedAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("chisel:upgrade", 1),
                arrayOf(arrayOf<IIngredient>(ore5, OreBracketHandler.getOre("plateEmerald"), ore5),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateEmerald"),
                                OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateEmerald")),
                        arrayOf(OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32650),
                                OreBracketHandler.getOre("wireGt01RedAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("chisel:upgrade", 2),
                arrayOf(arrayOf<IIngredient>(ore5, OreBracketHandler.getOre("plateEmerald"), ore5),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateEmerald"),
                                OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateEmerald")),
                        arrayOf(OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32744),
                                OreBracketHandler.getOre("wireGt01RedAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("chisel:upgrade", 3),
                arrayOf(arrayOf<IIngredient>(ore5, OreBracketHandler.getOre("plateEmerald"), ore5),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateEmerald"),
                                OreBracketHandler.getOre("circuitBasic"), OreBracketHandler.getOre("plateEmerald")),
                        arrayOf(OreBracketHandler.getOre("wireGt01RedAlloy"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32600),
                                OreBracketHandler.getOre("wireGt01RedAlloy"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("chisel:mossy_templeblock", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("chisel:templeblock", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0),
                                ItemBracketHandler.getItem("BiomesOPlenty:moss", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("chisel:voidstone2", 0).amount(8),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("chisel:voidstone", 0),
                        ItemBracketHandler.getItem("chisel:voidstone", 0),
                        ItemBracketHandler.getItem("chisel:voidstone", 0)),
                        arrayOf(ItemBracketHandler.getItem("chisel:voidstone", 0),
                                OreBracketHandler.getOre("dustGlowstone"),
                                ItemBracketHandler.getItem("chisel:voidstone", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("chisel:voidstone", 0),
                                ItemBracketHandler.getItem("chisel:voidstone", 0),
                                ItemBracketHandler.getItem("chisel:voidstone", 0))), null)
        Assembler.addRecipe(item, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17032).amount(2),
                ItemBracketHandler.getItem("minecraft:stick", 0).amount(2), 300, VoltageLevels.LV)
        Assembler.addRecipe(item2, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17804).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23304).amount(2), 400, VoltageLevels.LV)
        Assembler.addRecipe(item3, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23305).amount(2), 600, VoltageLevels.LV)
        Groups.addGroup("CobblestoneBricks")
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("minecraft:cobblestone", 0))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 1))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 2))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 3))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 4))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 5))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 6))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 7))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 8))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 9))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 10))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 11))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 12))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 13))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 14))
        Groups.addVariation("CobblestoneBricks", ItemBracketHandler.getItem("chisel:cobblestone", 15))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("minecraft:glass", 0))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 1))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 2))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 3))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 4))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 5))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 6))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 7))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 8))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 9))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 10))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 11))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 12))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 13))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 14))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass", 15))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("chisel:glass2", 0))
        Groups.addVariation("glasswork", ItemBracketHandler.getItem("EnderIO:blockFusedQuartz", 1))
        Groups.addVariation("cloud", ItemBracketHandler.getItem("Natura:Cloud", 0))
        Groups.addVariation("marble", ItemBracketHandler.getItem("Railcraft:cube", 7))
        Groups.addVariation("marble", ItemBracketHandler.getItem("gregtech:gt.blockstones", 0))
        Groups.addVariation("marble", ItemBracketHandler.getItem("gregtech:gt.blockstones", 1))
        Groups.addVariation("marble", ItemBracketHandler.getItem("gregtech:gt.blockstones", 2))
        Groups.addVariation("marble", ItemBracketHandler.getItem("gregtech:gt.blockstones", 3))
        Groups.addVariation("marble", ItemBracketHandler.getItem("gregtech:gt.blockstones", 4))
        Groups.addVariation("marble", ItemBracketHandler.getItem("gregtech:gt.blockstones", 5))
        Groups.addVariation("marble", ItemBracketHandler.getItem("gregtech:gt.blockstones", 6))
        Groups.addVariation("marble", ItemBracketHandler.getItem("gregtech:gt.blockstones", 7))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("Railcraft:cube", 6))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 0))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 1))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 2))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 3))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 4))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 5))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 6))
        Groups.addVariation("RCAbyssalBlock", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 7))
        Groups.addGroup("basalt")
        Groups.addVariation("basalt", ItemBracketHandler.getItem("gregtech:gt.blockstones", 8))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("gregtech:gt.blockstones", 9))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("gregtech:gt.blockstones", 10))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("gregtech:gt.blockstones", 11))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("gregtech:gt.blockstones", 12))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("gregtech:gt.blockstones", 13))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("gregtech:gt.blockstones", 14))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("gregtech:gt.blockstones", 15))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 2))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 3))
        Groups.addVariation("basalt", ItemBracketHandler.getItem("ProjRed|Exploration:projectred.exploration.stone", 4))
        Groups.addGroup("redgranite")
        Groups.addVariation("redgranite", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 8))
        Groups.addVariation("redgranite", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 9))
        Groups.addVariation("redgranite", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 10))
        Groups.addVariation("redgranite", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 11))
        Groups.addVariation("redgranite", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 12))
        Groups.addVariation("redgranite", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 13))
        Groups.addVariation("redgranite", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 14))
        Groups.addVariation("redgranite", ItemBracketHandler.getItem("gregtech:gt.blockgranites", 15))
        Groups.addVariation("limestone", ItemBracketHandler.getItem("BiomesOPlenty:rocks", 0))
        Groups.addVariation("amber", ItemBracketHandler.getItem("gregtech:gt.blockgem1", 1))
        Groups.addVariation("amber", ItemBracketHandler.getItem("BiomesOPlenty:gemOre", 15))
        Groups.addGroup("endstone")
        Groups.addVariation("endstone", ItemBracketHandler.getItem("minecraft:end_stone", 0))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 1))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 2))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 3))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 4))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 5))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 6))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 7))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 8))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 9))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 10))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 11))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 12))
        Groups.addVariation("endstone", ItemBracketHandler.getItem("chisel:end_Stone", 13))
        Groups.addVariation("concrete", ItemBracketHandler.getItem("gregtech:gt.blockconcretes", 8))
        Groups.addGroup("glowstoneGTNH")
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("minecraft:glowstone", 0))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 1))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 2))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 3))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 4))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 5))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 6))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 7))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 8))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 9))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 10))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 11))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 12))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 13))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 14))
        Groups.addVariation("glowstoneGTNH", ItemBracketHandler.getItem("chisel:glowstone", 15))
        Groups.addVariation("torch", ItemBracketHandler.getItem("GalacticraftCore:tile.glowstoneTorch", 0))
        Groups.addVariation("aluminumblock", ItemBracketHandler.getItem("gregtech:gt.blockmetal1", 1))
        Groups.addGroup("brown_mushroom")
        Groups.addGroup("red_mushroom")
        val array = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        var n = 0
        while (array.size > n) {
            val n2 = array[n]
            Groups.addVariation("brown_mushroom",
                    ItemBracketHandler.getItem("minecraft:brown_mushroom_block", 0).definition.makeStack(n2))
            Groups.addVariation("red_mushroom",
                    ItemBracketHandler.getItem("minecraft:red_mushroom_block", 0).definition.makeStack(n2))
            ++n
        }
    }
}