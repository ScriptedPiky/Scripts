package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels
import gttweaker.mods.gregtech.machines.AlloySmelter
import gttweaker.mods.gregtech.machines.Assembler
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI
import modtweaker2.mods.thaumcraft.handlers.Aspects

class TwilightForest : Runnable {
    override fun run() {
        val ore = OreBracketHandler.getOre("blockRedstone")
        val item = ItemBracketHandler.getItem("TwilightForest:item.carminite", 0)
        val item2 = ItemBracketHandler.getItem("TwilightForest:tile.TFTowerStone", 1)
        val item3 = ItemBracketHandler.getItem("TwilightForest:tile.TFTowerDevice", 12)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TwilightForest:item.carminite", 0))
        MineTweakerAPI.recipes.remove(item3)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("TwilightForest:item.fieryIngot", 0), null,
                false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TwilightForest:item.emptyMagicMap", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TwilightForest:item.ironwoodRaw", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TwilightForest:item.ironwoodIngot", 0).amount(2),
                null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TwilightForest:tile.TFUncraftingTable", 0))
        MineTweakerAPI.recipes.addShaped(item3,
                arrayOf(arrayOf<IIngredient>(item2, item, item2), arrayOf(item, ore, item),
                        arrayOf<IIngredient>(item2, item, item2)), null)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("TwilightForest:item.steeleafIngot", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2339),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("TwilightForest:item.nagaScale", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14).amount(2),
                ItemBracketHandler.getItem("TwilightForest:item.trophy", 1).amount(0), 600, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("TwilightForest:item.fieryBlood", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14).amount(6),
                ItemBracketHandler.getItem("TwilightForest:item.trophy", 0).amount(0), 1200, VoltageLevels.LEV)
        Assembler.addRecipe(ItemBracketHandler.getItem("TwilightForest:item.fieryTears", 0),
                ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                ItemBracketHandler.getItem("TwilightForest:item.trophy", 3).amount(0), 1500, VoltageLevels.LHV)
        Assembler.addRecipe(ItemBracketHandler.getItem("TwilightForest:item.carminite", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14).amount(8),
                ItemBracketHandler.getItem("TwilightForest:item.trophy", 3).amount(0), 1500, VoltageLevels.LIV)
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFRoots", 0), "arbor 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFRoots", 1), "arbor 2, praecantatio 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:item.liveRoot", 0), "arbor 1, praecantatio 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFFirefly", 0), "victus 1, volatus 1, lux 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFCicada", 0), "victus 1, volatus 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPortal", 0), "tempus 4, praecantatio 4, iter 4")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMazestone", 0), "terra 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMazestone", 1), "terra 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMazestone", 2), "terra 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMazestone", 3), "terra 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMazestone", 4), "terra 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMazestone", 5), "terra 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMazestone", 6), "terra 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMazestone", 7), "terra 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFHedge", 0), "herba 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFFireflyJar", 0), "vitreus 2, arbor 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 3), "herba 2, victus 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 4), "herba 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 8), "herba 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 9), "herba 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 10), "herba 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 11), "herba 1, perditio 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 13), "herba 1, lux 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 14), "arbor 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFFireJet", 0), "ignis 2, aer 2, machina 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFFireJet", 8), "ignis 6, motus 2, machina 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFNagastone", 1), "terra 3")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFNagastone", 13), "terra 3")
        Aspects.add(ItemBracketHandler.getItem("TwilightForest:tile.TFSapling", 5), "tempus 1")
        Aspects.add(ItemBracketHandler.getItem("TwilightForest:tile.TFSapling", 6), "praecantatio 1")
        Aspects.add(ItemBracketHandler.getItem("TwilightForest:tile.TFSapling", 7), "perfodio 1")
        Aspects.add(ItemBracketHandler.getItem("TwilightForest:tile.TFSapling", 9), "sensus 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMoonworm", 0), "victus 1, lux 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMagicLogSpecial", 0),
                "arbor 4, praecantatio 2, tempus 2, herba 2, lux 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMagicLogSpecial", 1),
                "arbor 4, praecantatio 2, aer 2, herba 2, invidia 1, lux 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMagicLogSpecial", 2),
                "arbor 4, praecantatio 2, perfodio 2, herba 2, lucrum 1, lux 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFMagicLogSpecial", 3),
                "arbor 4, praecantatio 2, motus 2, herba 2, cognitio 1, lux 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFTowerDevice", 2),
                "arbor 1, machina 1, potentia 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFTowerDevice", 4),
                "arbor 1, machina 1, potentia 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFTowerDevice", 5),
                "arbor 1, machina 1, potentia 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFTowerDevice", 6),
                "arbor 1, machina 1, potentia 2, iter 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFTowerDevice", 9),
                "arbor 1, machina 2, potentia 4, perditio 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFTowerDevice", 10),
                "arbor 1, machina 2, potentia 4, vinculum 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFShield", 0), "terra 4, machina 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFTrophyPedestal", 0),
                "terra 7, ordo 4, lucrum 4, instrumentum 4")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFTrophyPedestal", 15),
                "terra 7, ordo 12, lucrum 12, instrumentum 4")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFAuroraBrick", 0), "terra 4, sensus 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFUnderBrick", 0), "terra 3, ignis 3")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFUnderBrick", 1), "terra 3, ignis 3")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFUnderBrick", 2), "terra 3, ignis 3, perditio 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFThorns", 0), "arbor 2, fabrico 1, telum 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFThorns", 1),
                "herba 3, fabrico 1, telum 1, aqua 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFBurntThorns", 0), "arbor 2, perditio 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFThornRose", 0), "herba 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFLeaves3", 0), "herba 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFLeaves3", 1), "herba 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFDeadrock", 0), "terra 8, ignis 6")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFDeadrock", 1), "terra 8, ignis 6")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TFDeadrock", 2), "terra 8, ignis 6")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.DarkLeaves", 0), "herba 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.AuroraPillar", 0), "terra 4, sensus 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.AuroraSlab", 0), "terra 2, sensus 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.AuroraDoubleSlab", 0), "terra 4, sensus 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TrollSteinn", 0), "terra 4, potentia 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.WispyCloud", 0),
                "aer 1, volatus 1, aqua 1, tempestas 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.FluffyCloud", 0),
                "aer 1, volatus 1, pannus 1, tempestas 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.HugeStalk", 0), "herba 4")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.UberousSoil", 0),
                "terra 4, aqua 4, herba 4, victus 10")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.HugeGloomBlock", 0), "terra 4, tenebrae 2, herba 2")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.KnightmetalBlock", 0), "metallum 18, lucrum 9")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.UnripeTrollBer", 0), "herba 1, terra 1, perditio 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.TrollBer", 0), "herba 1, terra 1, lux 1")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.HugeLilyPad", 0), "herba 8, aqua 4")
        Aspects.set(ItemBracketHandler.getItem("TwilightForest:tile.HugeWaterLily", 0), "herba 3")
        NEI.hide(ItemBracketHandler.getItem("TwilightForest:tile.TFUncraftingTable", 0))
    }
}