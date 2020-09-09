package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.CuttingSaw
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class BiblioCraft : Runnable {

    fun removeShit() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:PrintingPress", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.BiblioChase", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:TypesettingMachine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:tile.BiblioFramedChest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioPaneler", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioPaintPress", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioLantern", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioIronLantern", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioLamp", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioIronLamp", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:ArmorStand", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioBell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioStuffs", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:BiblioStuffs", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.FramingSaw", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.FramingBoard", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.BiblioMapTool", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.BiblioWayPointCompass", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.BiblioGlasses", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.PlumbLine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.BiblioGlasses", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.HandDrill", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.BiblioDrill", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.tape", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.tapeMeasure", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.BiblioClipboard", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.SlottedBook", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BiblioCraft:item.AtlasBook", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:PrintingPress", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                        OreBracketHandler.getOre("stickBlaze"), OreBracketHandler.getOre("plateThaumium")),
                        arrayOf(OreBracketHandler.getOre("plateAluminium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                                OreBracketHandler.getOre("plateAluminium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockSteel"),
                                OreBracketHandler.getOre("blockSteel"), OreBracketHandler.getOre("blockSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.BiblioChase", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWoodSealed"),
                        OreBracketHandler.getOre("stickWoodSealed"), OreBracketHandler.getOre("stickWoodSealed")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWoodSealed"), null,
                                OreBracketHandler.getOre("stickWoodSealed")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWoodSealed"),
                                OreBracketHandler.getOre("stickWoodSealed"),
                                OreBracketHandler.getOre("stickWoodSealed"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:TypesettingMachine", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateAluminium"),
                        ItemBracketHandler.getItem("BiblioCraft:item.BiblioChase", 0),
                        OreBracketHandler.getOre("plateAluminium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateWoodSealed"),
                                OreBracketHandler.getOre("frameGtWoodSealed"),
                                OreBracketHandler.getOre("plateWoodSealed")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateWoodSealed"),
                                OreBracketHandler.getOre("plateWoodSealed"),
                                OreBracketHandler.getOre("plateWoodSealed"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:tile.BiblioFramedChest", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                        ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                        ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0)),
                        arrayOf(OreBracketHandler.getOre("screwIron"),
                                ItemBracketHandler.getItem("BiblioCraft:BiblioLabel", 6),
                                OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioPaneler", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:wooden_slab", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:planks", 0),
                                ItemBracketHandler.getItem("minecraft:planks", 0),
                                ItemBracketHandler.getItem("minecraft:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioPaneler", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:wooden_slab", 1),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32471),
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:planks", 1),
                                ItemBracketHandler.getItem("minecraft:planks", 1),
                                ItemBracketHandler.getItem("minecraft:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioPaneler", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:wooden_slab", 2),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32472),
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:planks", 2),
                                ItemBracketHandler.getItem("minecraft:planks", 2),
                                ItemBracketHandler.getItem("minecraft:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioPaneler", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:wooden_slab", 3),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32473),
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:planks", 3),
                                ItemBracketHandler.getItem("minecraft:planks", 3),
                                ItemBracketHandler.getItem("minecraft:planks", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioPaneler", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:wooden_slab", 4),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32474),
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:planks", 4),
                                ItemBracketHandler.getItem("minecraft:planks", 4),
                                ItemBracketHandler.getItem("minecraft:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioPaneler", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:wooden_slab", 5),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32475),
                                ItemBracketHandler.getItem("minecraft:wooden_slab", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:planks", 5),
                                ItemBracketHandler.getItem("minecraft:planks", 5),
                                ItemBracketHandler.getItem("minecraft:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioPaneler", 6),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("craftingToolSaw"), OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiblioCraft:item.FramingBoard", 0),
                                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                                ItemBracketHandler.getItem("BiblioCraft:item.FramingBoard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.AtlasBook", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("platePaper"),
                        ItemBracketHandler.getItem("BiblioCraft:item.BiblioMapTool", 0),
                        OreBracketHandler.getOre("platePaper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("platePaper"),
                                OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("platePaper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("platePaper"),
                                OreBracketHandler.getOre("paperMap"), OreBracketHandler.getOre("platePaper"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioPaintPress", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIron"),
                        OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("boltIron")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("ringIron"), null, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("blockIron"),
                                OreBracketHandler.getOre("blockIron"), OreBracketHandler.getOre("blockIron"))), null)

        //TODO Replace ("harvestcraft:pamcandleDeco1", 0)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioLantern", 0),
        //        arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateGold"),
        //                OreBracketHandler.getOre("dustGlowstone"), OreBracketHandler.getOre("plateGold")),
        //                arrayOf(OreBracketHandler.getOre("paneGlassColorless"),
        //                        ItemBracketHandler.getItem("harvestcraft:pamcandleDeco1", 0),
        //                        OreBracketHandler.getOre("paneGlassColorless")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("plateGold"),
        //                        OreBracketHandler.getOre("plateGold"), OreBracketHandler.getOre("plateGold"))), null)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioIronLantern", 0),
        //        arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
        //                OreBracketHandler.getOre("dustGlowstone"), OreBracketHandler.getOre("plateIron")),
        //                arrayOf(OreBracketHandler.getOre("paneGlassColorless"),
        //                        ItemBracketHandler.getItem("harvestcraft:pamcandleDeco1", 0),
        //                        OreBracketHandler.getOre("paneGlassColorless")),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
        //                        OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("plateIron"))), null)

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioLamp", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateGold"),
                        ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0),
                        OreBracketHandler.getOre("plateGold")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickGold"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateGold"),
                                OreBracketHandler.getOre("plateGold"), OreBracketHandler.getOre("plateGold"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioIronLamp", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateIron"),
                        ItemBracketHandler.getItem("FloodLights:electricIncandescentLightBulb", 0),
                        OreBracketHandler.getOre("plateIron")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("stickGold"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("plateIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:ArmorStand", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("boltIron"),
                        OreBracketHandler.getOre("stickIron"), OreBracketHandler.getOre("boltIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("stickIron"), OreBracketHandler.getOre("craftingToolSaw")),
                        arrayOf(OreBracketHandler.getOre("plateIron"),
                                ItemBracketHandler.getItem("minecraft:stone_pressure_plate", 0),
                                OreBracketHandler.getOre("plateIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioBell", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:stone_button", 0), null),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateIron"), null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIron"), null,
                                OreBracketHandler.getOre("plateIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioStuffs", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateAnyRubber"), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:glass_pane", 0), null,
                                ItemBracketHandler.getItem("minecraft:glass_pane", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:glass_pane", 0),
                                ItemBracketHandler.getItem("minecraft:glass_pane", 0),
                                ItemBracketHandler.getItem("minecraft:glass_pane", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:BiblioStuffs", 2),
                arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(OreBracketHandler.getOre("plateNetherQuartz"), null,
                        OreBracketHandler.getOre("plateNetherQuartz")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateNetherQuartz"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0).amount(2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                        OreBracketHandler.getOre("craftingToolSaw"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.FramingBoard", 0).amount(2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                        OreBracketHandler.getOre("craftingToolSaw"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.BiblioMapTool", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickIron"),
                        OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("stickIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickIron"),
                                OreBracketHandler.getOre("stickIron"), OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickIron"),
                                OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.BiblioWayPointCompass", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickGold"),
                        OreBracketHandler.getOre("ringGold"), OreBracketHandler.getOre("craftingToolFile")),
                        arrayOf(OreBracketHandler.getOre("screwGold"),
                                ItemBracketHandler.getItem("minecraft:compass", 0),
                                OreBracketHandler.getOre("screwGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("ringGold"), OreBracketHandler.getOre("stickGold"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.BiblioGlasses", 2),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("ringGold"),
                        OreBracketHandler.getOre("wireFineGold"), OreBracketHandler.getOre("wireFineGold")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("lensGlass"),
                                OreBracketHandler.getOre("craftingToolSoftHammer"),
                                OreBracketHandler.getOre("wireFineGold")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("wireFineGold"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.PlumbLine", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("wireFineSteel"),
                        OreBracketHandler.getOre("wireFineSteel"), OreBracketHandler.getOre("wireFineSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("plateLead"),
                                OreBracketHandler.getOre("craftingToolSoftHammer"),
                                OreBracketHandler.getOre("wireFineSteel")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("roundLead"), null,
                                OreBracketHandler.getOre("wireFineSteel"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.BiblioGlasses", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickIron"),
                        OreBracketHandler.getOre("screwIron"), OreBracketHandler.getOre("stickIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringIron"), OreBracketHandler.getOre("boltIron"),
                                OreBracketHandler.getOre("ringIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("lensGlass"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("lensGlass"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.BiblioDrill", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("boltIron"), OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(OreBracketHandler.getOre("gearGtSmallIron"),
                                ItemBracketHandler.getItem("IC2:itemRecipePart", 3),
                                OreBracketHandler.getOre("gearGtSmallIron")),
                        arrayOf(OreBracketHandler.getOre("plateIron"),
                                ItemBracketHandler.getItem("IC2:itemBatREDischarged", 0),
                                OreBracketHandler.getOre("plateIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.tape", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("wireFineIron"),
                        OreBracketHandler.getOre("wireFineIron"), OreBracketHandler.getOre("wireFineIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("wireFineIron"),
                                OreBracketHandler.getOre("dyeYellow"), OreBracketHandler.getOre("wireFineIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("wireFineIron"),
                                OreBracketHandler.getOre("wireFineIron"), OreBracketHandler.getOre("wireFineIron"))),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.tapeMeasure", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BiblioCraft:item.tape", 0),
                        ItemBracketHandler.getItem("BiblioCraft:item.tape", 0),
                        ItemBracketHandler.getItem("BiblioCraft:item.tape", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickIron"),
                                OreBracketHandler.getOre("stickIron"), OreBracketHandler.getOre("stickIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioCraft:item.BiblioClipboard", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("springSmallIron"), OreBracketHandler.getOre("screwIron")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                OreBracketHandler.getOre("craftingToolSaw")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:paper", 0),
                                ItemBracketHandler.getItem("minecraft:paper", 0),
                                ItemBracketHandler.getItem("minecraft:paper", 0))), null)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0).amount(4), null,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                LiquidBracketHandler.getLiquid("water").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0).amount(4), null,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(2), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0).amount(4), null,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32470),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BiblioCraft:item.FramingBoard", 0).amount(4), null,
                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(2), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BiblioCraft:item.FramingBoard", 0).amount(4), null,
                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(1), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BiblioCraft:item.FramingBoard", 0).amount(4), null,
                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)

    }

    override fun run() {
        val array = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 6),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 7),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 8),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 9),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 10),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 11),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 12),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 13),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 14),
                ItemBracketHandler.getItem("BiblioCraft:BiblioTypewriter", 15))
        val array2 = arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32421),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32422),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32415),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32428),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32425),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32424),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32416),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32420),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32426),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32419),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32427),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32423),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417))
        val array3 = arrayOf(ItemBracketHandler.getItem("minecraft:wooden_slab", 0),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 1),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 2),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 3),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 4),
                ItemBracketHandler.getItem("minecraft:wooden_slab", 5),
                ItemBracketHandler.getItem("BiblioCraft:item.FramingSheet", 0))
        val array4 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioClock", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioClock", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioClock", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioClock", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioClock", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioClock", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioClock", 6))
        val array5 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioFlatPainting", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFlatPainting", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFlatPainting", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFlatPainting", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFlatPainting", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFlatPainting", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFlatPainting", 6))
        val array6 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioBorderlessPainting", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioBorderlessPainting", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioBorderlessPainting", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioBorderlessPainting", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioBorderlessPainting", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioBorderlessPainting", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioBorderlessPainting", 6))
        val array7 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioSimplePainting", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSimplePainting", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSimplePainting", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSimplePainting", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSimplePainting", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSimplePainting", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSimplePainting", 6))
        val array8 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioMiddlePainting", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMiddlePainting", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMiddlePainting", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMiddlePainting", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMiddlePainting", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMiddlePainting", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMiddlePainting", 6))
        val array9 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioFancyPainting", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFancyPainting", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFancyPainting", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFancyPainting", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFancyPainting", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFancyPainting", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioFancyPainting", 6))
        val array10 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 6),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 7),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 8),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 9),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 10),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 11),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 12),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 13),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 14),
                ItemBracketHandler.getItem("BiblioCraft:BiblioSwordPedestal", 15))
        val array11 = arrayOf(ItemBracketHandler.getItem("minecraft:wool", 0),
                ItemBracketHandler.getItem("minecraft:wool", 1), ItemBracketHandler.getItem("minecraft:wool", 2),
                ItemBracketHandler.getItem("minecraft:wool", 3), ItemBracketHandler.getItem("minecraft:wool", 4),
                ItemBracketHandler.getItem("minecraft:wool", 5), ItemBracketHandler.getItem("minecraft:wool", 6),
                ItemBracketHandler.getItem("minecraft:wool", 7), ItemBracketHandler.getItem("minecraft:wool", 8),
                ItemBracketHandler.getItem("minecraft:wool", 9), ItemBracketHandler.getItem("minecraft:wool", 10),
                ItemBracketHandler.getItem("minecraft:wool", 11), ItemBracketHandler.getItem("minecraft:wool", 12),
                ItemBracketHandler.getItem("minecraft:wool", 13), ItemBracketHandler.getItem("minecraft:wool", 14),
                ItemBracketHandler.getItem("minecraft:wool", 15))
        val array12 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioLabel", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioLabel", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioLabel", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioLabel", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioLabel", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioLabel", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioLabel", 6))
        val array13 = arrayOf(ItemBracketHandler.getItem("BiblioCraft:BiblioMapFrames", 0),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMapFrames", 1),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMapFrames", 2),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMapFrames", 3),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMapFrames", 4),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMapFrames", 5),
                ItemBracketHandler.getItem("BiblioCraft:BiblioMapFrames", 6))
        val array14 = arrayOf(ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", 0),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", 1),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", 2),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", 3),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab2", 3),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", 4),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab2", 4),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", 5),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", 6),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab1", 7),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab2", 2),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab2", 0),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab2", 1),
                ItemBracketHandler.getItem("BiomesOPlenty:woodenSingleSlab2", 5))
        val array15 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 0),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 1),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 2),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 3),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 4),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 5),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 6),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 7),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 8),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 9),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 10),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 11),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 12),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodClock", 13))
        val array16 = arrayOf(ItemBracketHandler.getItem("Forestry:slabs", 2),
                ItemBracketHandler.getItem("Forestry:slabs", 11), ItemBracketHandler.getItem("Forestry:slabs", 6),
                ItemBracketHandler.getItem("Forestry:slabs", 15), ItemBracketHandler.getItem("Forestry:slabs", 4),
                ItemBracketHandler.getItem("Forestry:slabs", 23), ItemBracketHandler.getItem("Forestry:slabs", 9),
                ItemBracketHandler.getItem("Forestry:slabs", 14), ItemBracketHandler.getItem("Forestry:slabs", 8),
                ItemBracketHandler.getItem("Forestry:slabs", 0), ItemBracketHandler.getItem("Forestry:slabs", 3),
                ItemBracketHandler.getItem("Forestry:slabs", 16), ItemBracketHandler.getItem("Forestry:slabs", 10),
                ItemBracketHandler.getItem("Forestry:slabs", 22), ItemBracketHandler.getItem("Forestry:slabs", 18),
                ItemBracketHandler.getItem("Forestry:slabs", 19))
        val array17 = arrayOf(ItemBracketHandler.getItem("Forestry:slabs", 20),
                ItemBracketHandler.getItem("Forestry:slabs", 21), ItemBracketHandler.getItem("Forestry:slabs", 17),
                ItemBracketHandler.getItem("Forestry:slabs", 7), ItemBracketHandler.getItem("Forestry:slabs", 1),
                ItemBracketHandler.getItem("Forestry:slabs", 13), ItemBracketHandler.getItem("Forestry:slabs", 5),
                ItemBracketHandler.getItem("Forestry:slabs", 12))
        val array18 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 7),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 8),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 9),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 10),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 11),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 12),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 13),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 14),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock", 15))
        val array19 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock2", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock2", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock2", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock2", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock2", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock2", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock2", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodClock2", 7))
        val array20 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 0),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 1),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 2),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 3),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 4),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 5),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 6),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 7),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 8),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 9),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 10),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 11),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodClock", 12))
        val array21 = arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 4),
                ItemBracketHandler.getItem("Natura:plankSlab2", 3), ItemBracketHandler.getItem("Natura:plankSlab1", 0),
                ItemBracketHandler.getItem("Natura:plankSlab2", 4), ItemBracketHandler.getItem("Natura:plankSlab1", 2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 5), ItemBracketHandler.getItem("Natura:plankSlab1", 6),
                ItemBracketHandler.getItem("Natura:plankSlab2", 0), ItemBracketHandler.getItem("Natura:plankSlab1", 3),
                ItemBracketHandler.getItem("Natura:plankSlab1", 7), ItemBracketHandler.getItem("Natura:plankSlab1", 1),
                ItemBracketHandler.getItem("Natura:plankSlab2", 1), ItemBracketHandler.getItem("Natura:plankSlab2", 2))
        val array22 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 0),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 1),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 2),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 3),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 4),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 5),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 6),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 7),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 8),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 9),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 10),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 11),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT0", 12))
        val array23 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 0),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 1),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 2),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 3),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 4),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 5),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 6),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 7),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 8),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 9),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 10),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 11),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 12),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT0", 13))
        val array24 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 7),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 8),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 9),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 10),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 11),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 12),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 13),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 14),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0", 15))
        val array25 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0b", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0b", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0b", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0b", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0b", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0b", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0b", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT0b", 7))
        val array26 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 0),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 1),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 2),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 3),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 4),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 5),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 6),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 7),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 8),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 9),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 10),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 11),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 12),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT1", 13))
        val array27 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 0),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 1),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 2),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 3),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 4),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 5),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 6),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 7),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 8),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 9),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 10),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 11),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 12),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT2", 13))
        val array28 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 0),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 1),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 2),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 3),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 4),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 5),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 6),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 7),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 8),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 9),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 10),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 11),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 12),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT3", 13))
        val array29 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 0),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 1),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 2),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 3),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 4),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 5),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 6),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 7),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 8),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 9),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 10),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 11),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 12),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodPaintingT4", 13))
        val array30 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 7),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 8),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 9),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 10),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 11),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 12),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 13),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 14),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1", 15))
        val array31 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1b", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1b", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1b", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1b", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1b", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1b", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1b", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT1b", 1))
        val array32 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 7),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 8),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 9),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 10),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 11),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 12),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 13),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 14),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2", 15))
        val array33 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2b", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2b", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2b", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2b", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2b", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2b", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2b", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT2b", 1))
        val array34 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 7),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 8),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 9),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 10),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 11),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 12),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 13),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 14),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3", 15))
        val array35 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3b", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3b", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3b", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3b", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3b", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3b", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3b", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT3b", 1))
        val array36 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 7),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 8),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 9),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 10),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 11),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 12),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 13),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 14),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4", 15))
        val array37 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4b", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4b", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4b", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4b", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4b", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4b", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4b", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodPaintingT4b", 1))
        val array38 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 0),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 1),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 2),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 3),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 4),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 5),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 6),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 7),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 8),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 9),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 10),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 11),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT1", 12))
        val array39 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 0),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 1),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 2),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 3),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 4),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 5),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 6),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 7),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 8),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 9),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 10),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 11),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT2", 12))
        val array40 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 0),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 1),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 2),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 3),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 4),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 5),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 6),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 7),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 8),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 9),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 10),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 11),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT3", 12))
        val array41 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 0),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 1),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 2),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 3),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 4),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 5),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 6),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 7),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 8),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 9),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 10),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 11),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodPaintingT4", 12))
        val array42 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 0),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 1),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 2),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 3),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 4),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 5),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 6),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 7),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 8),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 9),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 10),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 11),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 12),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodMapFrame", 13))
        val array43 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 0),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 1),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 2),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 3),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 4),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 5),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 6),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 7),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 8),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 9),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 10),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 11),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 12),
                ItemBracketHandler.getItem("BiblioWoodsBoP:BiblioWoodlabel", 13))
        val array44 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 7),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 8),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 9),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 10),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 11),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 12),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 13),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 14),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 15))
        val array45 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 7),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 8),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 9),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 10),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 11),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 12),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 13),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 14),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel", 15))
        val array46 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 7))
        val array47 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel2", 0),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel2", 1),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel2", 2),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel2", 3),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel2", 4),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel2", 5),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel2", 6),
                ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstlabel2", 7))
        val array48 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 0),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 1),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 2),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 3),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 4),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 5),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 6),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 7),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 8),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 9),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 10),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 11),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodMapFrame", 12))
        val array49 = arrayOf(ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 0),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 1),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 2),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 3),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 4),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 5),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 6),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 7),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 8),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 9),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 10),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 11),
                ItemBracketHandler.getItem("BiblioWoodsNatura:BiblioWoodlabel", 12))
        removeShit()
        var n = 0
        while (array2.size > n) {
            val itemStack = array2[n]
            val itemStack2 = array[n]
            MineTweakerAPI.recipes.remove(itemStack2)
            MineTweakerAPI.recipes.addShaped(itemStack2, arrayOf(arrayOf(OreBracketHandler.getOre("plateRubber"),
                    ItemBracketHandler.getItem("OpenComputers:item", 20), OreBracketHandler.getOre("plateRubber")),
                    arrayOf(OreBracketHandler.getOre("ringIron"), itemStack, OreBracketHandler.getOre("ringIron")),
                    arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("blockIron"),
                            OreBracketHandler.getOre("plateIron"))), null)
            ++n
        }
        var n2 = 0
        while (array3.size > n2) {
            val itemStack3 = array3[n2]
            val itemStack4 = array4[n2]
            MineTweakerAPI.recipes.remove(itemStack4)
            MineTweakerAPI.recipes.addShaped(itemStack4,
                    arrayOf(arrayOf<IIngredient>(itemStack3, ItemBracketHandler.getItem("minecraft:clock", 0),
                            itemStack3), arrayOf(itemStack3, OreBracketHandler.getOre("stickWood"), itemStack3),
                            arrayOf(itemStack3, OreBracketHandler.getOre("plateGold"), itemStack3)), null)
            ++n2
        }
        var n3 = 0
        while (array14.size > n3) {
            val itemStack5 = array14[n3]
            val itemStack6 = array15[n3]
            MineTweakerAPI.recipes.remove(itemStack6)
            MineTweakerAPI.recipes.addShaped(itemStack6,
                    arrayOf(arrayOf<IIngredient>(itemStack5, ItemBracketHandler.getItem("minecraft:clock", 0),
                            itemStack5), arrayOf(itemStack5, OreBracketHandler.getOre("stickWood"), itemStack5),
                            arrayOf(itemStack5, OreBracketHandler.getOre("plateGold"), itemStack5)), null)
            ++n3
        }
        var n4 = 0
        while (array16.size > n4) {
            val itemStack7 = array16[n4]
            val itemStack8 = array18[n4]
            MineTweakerAPI.recipes.remove(itemStack8)
            MineTweakerAPI.recipes.addShaped(itemStack8,
                    arrayOf(arrayOf<IIngredient>(itemStack7, ItemBracketHandler.getItem("minecraft:clock", 0),
                            itemStack7), arrayOf(itemStack7, OreBracketHandler.getOre("stickWood"), itemStack7),
                            arrayOf(itemStack7, OreBracketHandler.getOre("plateGold"), itemStack7)), null)
            ++n4
        }
        var n5 = 0
        while (array17.size > n5) {
            val itemStack9 = array17[n5]
            val itemStack10 = array19[n5]
            MineTweakerAPI.recipes.remove(itemStack10)
            MineTweakerAPI.recipes.addShaped(itemStack10,
                    arrayOf(arrayOf<IIngredient>(itemStack9, ItemBracketHandler.getItem("minecraft:clock", 0),
                            itemStack9), arrayOf(itemStack9, OreBracketHandler.getOre("stickWood"), itemStack9),
                            arrayOf(itemStack9, OreBracketHandler.getOre("plateGold"), itemStack9)), null)
            ++n5
        }
        var n6 = 0
        while (array21.size > n6) {
            val itemStack11 = array21[n6]
            val itemStack12 = array20[n6]
            MineTweakerAPI.recipes.remove(itemStack12)
            MineTweakerAPI.recipes.addShaped(itemStack12,
                    arrayOf(arrayOf<IIngredient>(itemStack11, ItemBracketHandler.getItem("minecraft:clock", 0),
                            itemStack11), arrayOf(itemStack11, OreBracketHandler.getOre("stickWood"), itemStack11),
                            arrayOf(itemStack11, OreBracketHandler.getOre("plateGold"), itemStack11)), null)
            ++n6
        }
        var n7 = 0
        while (array3.size > n7) {
            val itemStack13 = array3[n7]
            val itemStack14 = array6[n7]
            MineTweakerAPI.recipes.remove(itemStack14)
            MineTweakerAPI.recipes.addShaped(itemStack14,
                    arrayOf(arrayOf<IIngredient>(itemStack13, itemStack13, itemStack13),
                            arrayOf<IIngredient>(itemStack13,
                                    ItemBracketHandler.getItem("BiblioCraft:item.PaintingCanvas", 0), itemStack13),
                            arrayOf<IIngredient>(itemStack13, itemStack13, itemStack13)), null)
            ++n7
        }
        var n8 = 0
        while (array14.size > n8) {
            val itemStack15 = array14[n8]
            val itemStack16 = array23[n8]
            MineTweakerAPI.recipes.remove(itemStack16)
            MineTweakerAPI.recipes.addShaped(itemStack16,
                    arrayOf(arrayOf<IIngredient>(itemStack15, itemStack15, itemStack15),
                            arrayOf<IIngredient>(itemStack15,
                                    ItemBracketHandler.getItem("BiblioCraft:item.PaintingCanvas", 0), itemStack15),
                            arrayOf<IIngredient>(itemStack15, itemStack15, itemStack15)), null)
            ++n8
        }
        var n9 = 0
        while (array16.size > n9) {
            val itemStack17 = array16[n9]
            val itemStack18 = array24[n9]
            MineTweakerAPI.recipes.remove(itemStack18)
            MineTweakerAPI.recipes.addShaped(itemStack18,
                    arrayOf(arrayOf<IIngredient>(itemStack17, itemStack17, itemStack17),
                            arrayOf<IIngredient>(itemStack17,
                                    ItemBracketHandler.getItem("BiblioCraft:item.PaintingCanvas", 0), itemStack17),
                            arrayOf<IIngredient>(itemStack17, itemStack17, itemStack17)), null)
            ++n9
        }
        var n10 = 0
        while (array17.size > n10) {
            val itemStack19 = array17[n10]
            val itemStack20 = array25[n10]
            MineTweakerAPI.recipes.remove(itemStack20)
            MineTweakerAPI.recipes.addShaped(itemStack20,
                    arrayOf(arrayOf<IIngredient>(itemStack19, itemStack19, itemStack19),
                            arrayOf<IIngredient>(itemStack19,
                                    ItemBracketHandler.getItem("BiblioCraft:item.PaintingCanvas", 0), itemStack19),
                            arrayOf<IIngredient>(itemStack19, itemStack19, itemStack19)), null)
            ++n10
        }
        var n11 = 0
        while (array21.size > n11) {
            val itemStack21 = array21[n11]
            val itemStack22 = array22[n11]
            MineTweakerAPI.recipes.remove(itemStack22)
            MineTweakerAPI.recipes.addShaped(itemStack22,
                    arrayOf(arrayOf<IIngredient>(itemStack21, itemStack21, itemStack21),
                            arrayOf<IIngredient>(itemStack21,
                                    ItemBracketHandler.getItem("BiblioCraft:item.PaintingCanvas", 0), itemStack21),
                            arrayOf<IIngredient>(itemStack21, itemStack21, itemStack21)), null)
            ++n11
        }
        var n12 = 0
        while (array6.size > n12) {
            val itemStack23 = array6[n12]
            val itemStack24 = array5[n12]
            MineTweakerAPI.recipes.remove(itemStack24)
            MineTweakerAPI.recipes.addShaped(itemStack24,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack23,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n12
        }
        var n13 = 0
        while (array23.size > n13) {
            val itemStack25 = array23[n13]
            val itemStack26 = array26[n13]
            MineTweakerAPI.recipes.remove(itemStack26)
            MineTweakerAPI.recipes.addShaped(itemStack26,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack25,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n13
        }
        var n14 = 0
        while (array24.size > n14) {
            val itemStack27 = array24[n14]
            val itemStack28 = array30[n14]
            MineTweakerAPI.recipes.remove(itemStack28)
            MineTweakerAPI.recipes.addShaped(itemStack28,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack27,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n14
        }
        var n15 = 0
        while (array25.size > n15) {
            val itemStack29 = array25[n15]
            val itemStack30 = array31[n15]
            MineTweakerAPI.recipes.remove(itemStack30)
            MineTweakerAPI.recipes.addShaped(itemStack30,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack29,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n15
        }
        var n16 = 0
        while (array22.size > n16) {
            val itemStack31 = array22[n16]
            val itemStack32 = array38[n16]
            MineTweakerAPI.recipes.remove(itemStack32)
            MineTweakerAPI.recipes.addShaped(itemStack32,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack31,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n16
        }
        var n17 = 0
        while (array5.size > n17) {
            val itemStack33 = array5[n17]
            val itemStack34 = array7[n17]
            MineTweakerAPI.recipes.remove(itemStack34)
            MineTweakerAPI.recipes.addShaped(itemStack34,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack33,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n17
        }
        var n18 = 0
        while (array26.size > n18) {
            val itemStack35 = array26[n18]
            val itemStack36 = array27[n18]
            MineTweakerAPI.recipes.remove(itemStack36)
            MineTweakerAPI.recipes.addShaped(itemStack36,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack35,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n18
        }
        var n19 = 0
        while (array30.size > n19) {
            val itemStack37 = array30[n19]
            val itemStack38 = array32[n19]
            MineTweakerAPI.recipes.remove(itemStack38)
            MineTweakerAPI.recipes.addShaped(itemStack38,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack37,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n19
        }
        var n20 = 0
        while (array31.size > n20) {
            val itemStack39 = array31[n20]
            val itemStack40 = array33[n20]
            MineTweakerAPI.recipes.remove(itemStack40)
            MineTweakerAPI.recipes.addShaped(itemStack40,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack39,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n20
        }
        var n21 = 0
        while (array38.size > n21) {
            val itemStack41 = array38[n21]
            val itemStack42 = array39[n21]
            MineTweakerAPI.recipes.remove(itemStack42)
            MineTweakerAPI.recipes.addShaped(itemStack42,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack41,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n21
        }
        var n22 = 0
        while (array7.size > n22) {
            val itemStack43 = array7[n22]
            val itemStack44 = array8[n22]
            MineTweakerAPI.recipes.remove(itemStack44)
            MineTweakerAPI.recipes.addShaped(itemStack44,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack43,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n22
        }
        var n23 = 0
        while (array27.size > n23) {
            val itemStack45 = array27[n23]
            val itemStack46 = array28[n23]
            MineTweakerAPI.recipes.remove(itemStack46)
            MineTweakerAPI.recipes.addShaped(itemStack46,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack45,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n23
        }
        var n24 = 0
        while (array32.size > n24) {
            val itemStack47 = array32[n24]
            val itemStack48 = array34[n24]
            MineTweakerAPI.recipes.remove(itemStack48)
            MineTweakerAPI.recipes.addShaped(itemStack48,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack47,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n24
        }
        var n25 = 0
        while (array33.size > n25) {
            val itemStack49 = array33[n25]
            val itemStack50 = array35[n25]
            MineTweakerAPI.recipes.remove(itemStack50)
            MineTweakerAPI.recipes.addShaped(itemStack50,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack49,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n25
        }
        var n26 = 0
        while (array39.size > n26) {
            val itemStack51 = array39[n26]
            val itemStack52 = array40[n26]
            MineTweakerAPI.recipes.remove(itemStack52)
            MineTweakerAPI.recipes.addShaped(itemStack52,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack51,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n26
        }
        var n27 = 0
        while (array8.size > n27) {
            val itemStack53 = array8[n27]
            val itemStack54 = array9[n27]
            MineTweakerAPI.recipes.remove(itemStack54)
            MineTweakerAPI.recipes.addShaped(itemStack54,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack53,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n27
        }
        var n28 = 0
        while (array28.size > n28) {
            val itemStack55 = array28[n28]
            val itemStack56 = array29[n28]
            MineTweakerAPI.recipes.remove(itemStack56)
            MineTweakerAPI.recipes.addShaped(itemStack56,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack55,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n28
        }
        var n29 = 0
        while (array34.size > n29) {
            val itemStack57 = array34[n29]
            val itemStack58 = array36[n29]
            MineTweakerAPI.recipes.remove(itemStack58)
            MineTweakerAPI.recipes.addShaped(itemStack58,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack57,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n29
        }
        var n30 = 0
        while (array35.size > n30) {
            val itemStack59 = array35[n30]
            val itemStack60 = array37[n30]
            MineTweakerAPI.recipes.remove(itemStack60)
            MineTweakerAPI.recipes.addShaped(itemStack60,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack59,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n30
        }
        var n31 = 0
        while (array40.size > n31) {
            val itemStack61 = array40[n31]
            val itemStack62 = array41[n31]
            MineTweakerAPI.recipes.remove(itemStack62)
            MineTweakerAPI.recipes.addShaped(itemStack62,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack61,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n31
        }
        var n32 = 0
        while (array11.size > n32) {
            val itemStack63 = array11[n32]
            val itemStack64 = array10[n32]
            MineTweakerAPI.recipes.remove(itemStack64)
            MineTweakerAPI.recipes.addShaped(itemStack64, arrayOf(arrayOfNulls(3),
                    arrayOf<IIngredient?>(OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("ringIron"),
                            OreBracketHandler.getOre("plateIron")),
                    arrayOf(OreBracketHandler.getOre("slabStone"), itemStack63, OreBracketHandler.getOre("slabStone"))),
                    null)
            ++n32
        }
        var n33 = 0
        while (array13.size > n33) {
            val itemStack65 = array13[n33]
            val itemStack66 = array12[n33]
            MineTweakerAPI.recipes.remove(itemStack66)
            MineTweakerAPI.recipes.addShaped(itemStack66,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack65,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n33
        }
        var n34 = 0
        while (array42.size > n34) {
            val itemStack67 = array42[n34]
            val itemStack68 = array43[n34]
            MineTweakerAPI.recipes.remove(itemStack68)
            MineTweakerAPI.recipes.addShaped(itemStack68,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack67,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n34
        }
        var n35 = 0
        while (array44.size > n35) {
            val itemStack69 = array44[n35]
            val itemStack70 = array45[n35]
            MineTweakerAPI.recipes.remove(itemStack70)
            MineTweakerAPI.recipes.addShaped(itemStack70,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack69,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n35
        }
        var n36 = 0
        while (array46.size > n36) {
            val itemStack71 = array46[n36]
            val itemStack72 = array47[n36]
            MineTweakerAPI.recipes.remove(itemStack72)
            MineTweakerAPI.recipes.addShaped(itemStack72,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack71,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n36
        }
        var n37 = 0
        while (array48.size > n37) {
            val itemStack73 = array48[n37]
            val itemStack74 = array49[n37]
            MineTweakerAPI.recipes.remove(itemStack74)
            MineTweakerAPI.recipes.addShaped(itemStack74,
                    arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                            OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                            arrayOf(OreBracketHandler.getOre("stickWood"), itemStack73,
                                    OreBracketHandler.getOre("stickWood")),
                            arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                    OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))),
                    null)
            ++n37
        }
        val ore = OreBracketHandler.getOre("PlumPlanks")
        ore.add(ItemBracketHandler.getItem("Forestry:planks", 21))
        ore.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 21))
        val ore2 = OreBracketHandler.getOre("PlumSlab")
        ore2.add(ItemBracketHandler.getItem("Forestry:slabs", 21))
        ore2.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 21))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 1),
                arrayOf(arrayOf<IIngredient>(ore, ore2, ore), arrayOf<IIngredient>(ore, ore2, ore),
                        arrayOf<IIngredient>(ore, ore2, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf2", 1),
                arrayOf(arrayOf<IIngredient>(ore2, ore2, ore2),
                        arrayOf<IIngredient>(ore, OreBracketHandler.getOre("bottleEmpty"), ore),
                        arrayOf<IIngredient>(ore2, ore2, ore2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf2", 1),
                arrayOf(arrayOf<IIngredient?>(ore2, ore2, ore2), arrayOf<IIngredient?>(null, ore, null),
                        arrayOf<IIngredient?>(ore2, ore2, ore2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack2", 1),
                arrayOf(arrayOf<IIngredient>(ore2, ore2, ore2),
                        arrayOf<IIngredient>(ore2, OreBracketHandler.getOre("ingotIron"), ore2),
                        arrayOf<IIngredient>(ore2, ore2, ore2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase1", 1),
                arrayOf(arrayOf<IIngredient>(ore2, OreBracketHandler.getOre("glass"), ore2),
                        arrayOf<IIngredient>(ore2, OreBracketHandler.getOre("blockWool"), ore2),
                        arrayOf<IIngredient>(ore2, ore2, ore2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk2", 1),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore2, ore2, ore2),
                        arrayOf<IIngredient?>(ore, null, ore)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat2", 1),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore2, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore2,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable2", 1),
                arrayOf(arrayOf<IIngredient?>(ore2, ore2, ore2), arrayOf<IIngredient?>(null, ore, null),
                        arrayOf<IIngredient?>(null, ore, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore2,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench2", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore2, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 1),
                                ore2), arrayOf<IIngredient>(ore2, ore2, ore2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 17),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore2, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 17),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore2,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 17),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 17), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 17),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore2, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 17),
                arrayOf(arrayOf<IIngredient?>(ore2, ore2, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 17), null,
                                null), arrayOfNulls(3)), null)
        val ore3 = OreBracketHandler.getOre("PinePlanks")
        ore3.add(ItemBracketHandler.getItem("Forestry:planks", 20))
        ore3.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 20))
        val ore4 = OreBracketHandler.getOre("PineSlab")
        ore4.add(ItemBracketHandler.getItem("Forestry:slabs", 20))
        ore4.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 20))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 0),
                arrayOf(arrayOf<IIngredient>(ore3, ore4, ore3), arrayOf<IIngredient>(ore3, ore4, ore3),
                        arrayOf<IIngredient>(ore3, ore4, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf2", 0),
                arrayOf(arrayOf<IIngredient>(ore4, ore4, ore4),
                        arrayOf<IIngredient>(ore3, OreBracketHandler.getOre("bottleEmpty"), ore3),
                        arrayOf<IIngredient>(ore4, ore4, ore4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf2", 0),
                arrayOf(arrayOf<IIngredient?>(ore4, ore4, ore4), arrayOf<IIngredient?>(null, ore3, null),
                        arrayOf<IIngredient?>(ore4, ore4, ore4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack2", 0),
                arrayOf(arrayOf<IIngredient>(ore4, ore4, ore4),
                        arrayOf<IIngredient>(ore4, OreBracketHandler.getOre("ingotIron"), ore4),
                        arrayOf<IIngredient>(ore4, ore4, ore4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase1", 0),
                arrayOf(arrayOf<IIngredient>(ore4, OreBracketHandler.getOre("glass"), ore4),
                        arrayOf<IIngredient>(ore4, OreBracketHandler.getOre("blockWool"), ore4),
                        arrayOf<IIngredient>(ore4, ore4, ore4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk2", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore4, ore4, ore4),
                        arrayOf<IIngredient?>(ore3, null, ore3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat2", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore4, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore4,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable2", 0),
                arrayOf(arrayOf<IIngredient?>(ore4, ore4, ore4), arrayOf<IIngredient?>(null, ore3, null),
                        arrayOf<IIngredient?>(null, ore3, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore4,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench2", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore4, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 0),
                                ore4), arrayOf<IIngredient>(ore4, ore4, ore4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 16),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore4, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 16),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore4,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 16),
                arrayOf(arrayOf(ore4, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 16), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 16),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore4, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 16),
                arrayOf(arrayOf<IIngredient?>(ore4, ore4, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 16), null,
                                null), arrayOfNulls(3)), null)
        val ore5 = OreBracketHandler.getOre("PoplarPlanks")
        ore5.add(ItemBracketHandler.getItem("Forestry:planks", 22))
        ore5.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 22))
        val ore6 = OreBracketHandler.getOre("PoplarSlab")
        ore6.add(ItemBracketHandler.getItem("Forestry:slabs", 22))
        ore6.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 22))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 2),
                arrayOf(arrayOf<IIngredient>(ore5, ore6, ore5), arrayOf<IIngredient>(ore5, ore6, ore5),
                        arrayOf<IIngredient>(ore5, ore6, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf2", 2),
                arrayOf(arrayOf<IIngredient>(ore6, ore6, ore6),
                        arrayOf<IIngredient>(ore5, OreBracketHandler.getOre("bottleEmpty"), ore5),
                        arrayOf<IIngredient>(ore6, ore6, ore6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf2", 2),
                arrayOf(arrayOf<IIngredient?>(ore6, ore6, ore6), arrayOf<IIngredient?>(null, ore5, null),
                        arrayOf<IIngredient?>(ore6, ore6, ore6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack2", 2),
                arrayOf(arrayOf<IIngredient>(ore6, ore6, ore6),
                        arrayOf<IIngredient>(ore6, OreBracketHandler.getOre("ingotIron"), ore6),
                        arrayOf<IIngredient>(ore6, ore6, ore6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase1", 2),
                arrayOf(arrayOf<IIngredient>(ore6, OreBracketHandler.getOre("glass"), ore6),
                        arrayOf<IIngredient>(ore6, OreBracketHandler.getOre("blockWool"), ore6),
                        arrayOf<IIngredient>(ore6, ore6, ore6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk2", 2),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore6, ore6, ore6),
                        arrayOf<IIngredient?>(ore5, null, ore5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat2", 2),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore6, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore6,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable2", 2),
                arrayOf(arrayOf<IIngredient?>(ore6, ore6, ore6), arrayOf<IIngredient?>(null, ore5, null),
                        arrayOf<IIngredient?>(null, ore5, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore6,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench2", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore6, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 2),
                                ore6), arrayOf<IIngredient>(ore6, ore6, ore6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 18),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore6, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 18),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore6,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 18),
                arrayOf(arrayOf(ore6, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 18), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 18),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore6, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 18),
                arrayOf(arrayOf<IIngredient?>(ore6, ore6, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 18), null,
                                null), arrayOfNulls(3)), null)
        val ore7 = OreBracketHandler.getOre("SequoiaPlanks")
        ore7.add(ItemBracketHandler.getItem("Forestry:planks", 7))
        ore7.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 7))
        val ore8 = OreBracketHandler.getOre("SequoiaSlab")
        ore8.add(ItemBracketHandler.getItem("Forestry:slabs", 7))
        ore8.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 7))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 3),
                arrayOf(arrayOf<IIngredient>(ore7, ore8, ore7), arrayOf<IIngredient>(ore7, ore8, ore7),
                        arrayOf<IIngredient>(ore7, ore8, ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf2", 3),
                arrayOf(arrayOf<IIngredient>(ore8, ore8, ore8),
                        arrayOf<IIngredient>(ore7, OreBracketHandler.getOre("bottleEmpty"), ore7),
                        arrayOf<IIngredient>(ore8, ore8, ore8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf2", 3),
                arrayOf(arrayOf<IIngredient?>(ore8, ore8, ore8), arrayOf<IIngredient?>(null, ore7, null),
                        arrayOf<IIngredient?>(ore8, ore8, ore8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack2", 3),
                arrayOf(arrayOf<IIngredient>(ore8, ore8, ore8),
                        arrayOf<IIngredient>(ore8, OreBracketHandler.getOre("ingotIron"), ore8),
                        arrayOf<IIngredient>(ore8, ore8, ore8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase1", 3),
                arrayOf(arrayOf<IIngredient>(ore8, OreBracketHandler.getOre("glass"), ore8),
                        arrayOf<IIngredient>(ore8, OreBracketHandler.getOre("blockWool"), ore8),
                        arrayOf<IIngredient>(ore8, ore8, ore8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk2", 3),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore8, ore8, ore8),
                        arrayOf<IIngredient?>(ore7, null, ore7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat2", 3),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore8, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore8,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable2", 3),
                arrayOf(arrayOf<IIngredient?>(ore8, ore8, ore8), arrayOf<IIngredient?>(null, ore7, null),
                        arrayOf<IIngredient?>(null, ore7, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore8,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench2", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore8, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 3),
                                ore8), arrayOf<IIngredient>(ore8, ore8, ore8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 19),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore8, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 19),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore8,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 19),
                arrayOf(arrayOf(ore8, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 19), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 19),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore8, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 19),
                arrayOf(arrayOf<IIngredient?>(ore8, ore8, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 19), null,
                                null), arrayOfNulls(3)), null)
        val ore9 = OreBracketHandler.getOre("TeakPlanks")
        ore9.add(ItemBracketHandler.getItem("Forestry:planks", 1))
        ore9.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 1))
        val ore10 = OreBracketHandler.getOre("TeakSlab")
        ore10.add(ItemBracketHandler.getItem("Forestry:slabs", 1))
        ore10.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 1))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 4),
                arrayOf(arrayOf<IIngredient>(ore9, ore10, ore9), arrayOf<IIngredient>(ore9, ore10, ore9),
                        arrayOf<IIngredient>(ore9, ore10, ore9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf2", 4),
                arrayOf(arrayOf<IIngredient>(ore10, ore10, ore10),
                        arrayOf<IIngredient>(ore9, OreBracketHandler.getOre("bottleEmpty"), ore9),
                        arrayOf<IIngredient>(ore10, ore10, ore10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf2", 4),
                arrayOf(arrayOf<IIngredient?>(ore10, ore10, ore10), arrayOf<IIngredient?>(null, ore9, null),
                        arrayOf<IIngredient?>(ore10, ore10, ore10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack2", 4),
                arrayOf(arrayOf<IIngredient>(ore10, ore10, ore10),
                        arrayOf<IIngredient>(ore10, OreBracketHandler.getOre("ingotIron"), ore10),
                        arrayOf<IIngredient>(ore10, ore10, ore10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase1", 4),
                arrayOf(arrayOf<IIngredient>(ore10, OreBracketHandler.getOre("glass"), ore10),
                        arrayOf<IIngredient>(ore10, OreBracketHandler.getOre("blockWool"), ore10),
                        arrayOf<IIngredient>(ore10, ore10, ore10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk2", 4),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore10, ore10, ore10),
                        arrayOf<IIngredient?>(ore9, null, ore9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat2", 4),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore10, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore10,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable2", 4),
                arrayOf(arrayOf<IIngredient?>(ore10, ore10, ore10), arrayOf<IIngredient?>(null, ore9, null),
                        arrayOf<IIngredient?>(null, ore9, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore10,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench2", 4),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore10, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 4),
                                ore10), arrayOf<IIngredient>(ore10, ore10, ore10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 20),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore10, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 20),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore10,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 20),
                arrayOf(arrayOf(ore10, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 20), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 20),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore10, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 20),
                arrayOf(arrayOf<IIngredient?>(ore10, ore10, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 20), null,
                                null), arrayOfNulls(3)), null)
        val ore11 = OreBracketHandler.getOre("WalnutPlanks")
        ore11.add(ItemBracketHandler.getItem("Forestry:planks", 13))
        ore11.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 13))
        val ore12 = OreBracketHandler.getOre("WalnutSlab")
        ore12.add(ItemBracketHandler.getItem("Forestry:slabs", 13))
        ore12.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 13))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 5),
                arrayOf(arrayOf<IIngredient>(ore11, ore12, ore11), arrayOf<IIngredient>(ore11, ore12, ore11),
                        arrayOf<IIngredient>(ore11, ore12, ore11)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf2", 5),
                arrayOf(arrayOf<IIngredient>(ore12, ore12, ore12),
                        arrayOf<IIngredient>(ore11, OreBracketHandler.getOre("bottleEmpty"), ore11),
                        arrayOf<IIngredient>(ore12, ore12, ore12)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf2", 5),
                arrayOf(arrayOf<IIngredient?>(ore12, ore12, ore12), arrayOf<IIngredient?>(null, ore11, null),
                        arrayOf<IIngredient?>(ore12, ore12, ore12)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack2", 5),
                arrayOf(arrayOf<IIngredient>(ore12, ore12, ore12),
                        arrayOf<IIngredient>(ore12, OreBracketHandler.getOre("ingotIron"), ore12),
                        arrayOf<IIngredient>(ore12, ore12, ore12)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase1", 5),
                arrayOf(arrayOf<IIngredient>(ore12, OreBracketHandler.getOre("glass"), ore12),
                        arrayOf<IIngredient>(ore12, OreBracketHandler.getOre("blockWool"), ore12),
                        arrayOf<IIngredient>(ore12, ore12, ore12)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk2", 5),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore12, ore12, ore12),
                        arrayOf<IIngredient?>(ore11, null, ore11)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat2", 5),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore12, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore12,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable2", 5),
                arrayOf(arrayOf<IIngredient?>(ore12, ore12, ore12), arrayOf<IIngredient?>(null, ore11, null),
                        arrayOf<IIngredient?>(null, ore11, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore12,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench2", 5),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore12, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 5),
                                ore12), arrayOf<IIngredient>(ore12, ore12, ore12)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 21),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore12, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 21),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore12,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 21),
                arrayOf(arrayOf(ore12, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 21), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 21),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore12, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 21),
                arrayOf(arrayOf<IIngredient?>(ore12, ore12, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 21), null,
                                null), arrayOfNulls(3)), null)
        val ore13 = OreBracketHandler.getOre("WengePlanks")
        ore13.add(ItemBracketHandler.getItem("Forestry:planks", 5))
        ore13.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 5))
        val ore14 = OreBracketHandler.getOre("WengeSlab")
        ore14.add(ItemBracketHandler.getItem("Forestry:slabs", 5))
        ore14.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 5))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 6),
                arrayOf(arrayOf<IIngredient>(ore13, ore14, ore13), arrayOf<IIngredient>(ore13, ore14, ore13),
                        arrayOf<IIngredient>(ore13, ore14, ore13)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf2", 6),
                arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14),
                        arrayOf<IIngredient>(ore13, OreBracketHandler.getOre("bottleEmpty"), ore13),
                        arrayOf<IIngredient>(ore14, ore14, ore14)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf2", 6),
                arrayOf(arrayOf<IIngredient?>(ore14, ore14, ore14), arrayOf<IIngredient?>(null, ore13, null),
                        arrayOf<IIngredient?>(ore14, ore14, ore14)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack2", 6),
                arrayOf(arrayOf<IIngredient>(ore14, ore14, ore14),
                        arrayOf<IIngredient>(ore14, OreBracketHandler.getOre("ingotIron"), ore14),
                        arrayOf<IIngredient>(ore14, ore14, ore14)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase1", 6),
                arrayOf(arrayOf<IIngredient>(ore14, OreBracketHandler.getOre("glass"), ore14),
                        arrayOf<IIngredient>(ore14, OreBracketHandler.getOre("blockWool"), ore14),
                        arrayOf<IIngredient>(ore14, ore14, ore14)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk2", 6),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore14, ore14, ore14),
                        arrayOf<IIngredient?>(ore13, null, ore13)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat2", 6),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore14, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore14,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable2", 6),
                arrayOf(arrayOf<IIngredient?>(ore14, ore14, ore14), arrayOf<IIngredient?>(null, ore13, null),
                        arrayOf<IIngredient?>(null, ore13, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 6),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore14,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench2", 6),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore14, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 6),
                                ore14), arrayOf<IIngredient>(ore14, ore14, ore14)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 22),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore14, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 22),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore14,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 22),
                arrayOf(arrayOf(ore14, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 22), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 22),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore14, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 22),
                arrayOf(arrayOf<IIngredient?>(ore14, ore14, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 22), null,
                                null), arrayOfNulls(3)), null)
        val ore15 = OreBracketHandler.getOre("WillowPlanks")
        ore15.add(ItemBracketHandler.getItem("Forestry:planks", 12))
        ore15.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 12))
        val ore16 = OreBracketHandler.getOre("WillowSlab")
        ore16.add(ItemBracketHandler.getItem("Forestry:slabs", 12))
        ore16.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 12))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 7),
                arrayOf(arrayOf<IIngredient>(ore15, ore16, ore15), arrayOf<IIngredient>(ore15, ore16, ore15),
                        arrayOf<IIngredient>(ore15, ore16, ore15)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf2", 7),
                arrayOf(arrayOf<IIngredient>(ore16, ore16, ore16),
                        arrayOf<IIngredient>(ore15, OreBracketHandler.getOre("bottleEmpty"), ore15),
                        arrayOf<IIngredient>(ore16, ore16, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf2", 7),
                arrayOf(arrayOf<IIngredient?>(ore16, ore16, ore16), arrayOf<IIngredient?>(null, ore15, null),
                        arrayOf<IIngredient?>(ore16, ore16, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack2", 7),
                arrayOf(arrayOf<IIngredient>(ore16, ore16, ore16),
                        arrayOf<IIngredient>(ore16, OreBracketHandler.getOre("ingotIron"), ore16),
                        arrayOf<IIngredient>(ore16, ore16, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase1", 7),
                arrayOf(arrayOf<IIngredient>(ore16, OreBracketHandler.getOre("glass"), ore16),
                        arrayOf<IIngredient>(ore16, OreBracketHandler.getOre("blockWool"), ore16),
                        arrayOf<IIngredient>(ore16, ore16, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk2", 7),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore16, ore16, ore16),
                        arrayOf<IIngredient?>(ore15, null, ore15)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat2", 7),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore16, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore16,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable2", 7),
                arrayOf(arrayOf<IIngredient?>(ore16, ore16, ore16), arrayOf<IIngredient?>(null, ore15, null),
                        arrayOf<IIngredient?>(null, ore15, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame2", 7),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore16,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench2", 7),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore16, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase2", 7),
                                ore16), arrayOf<IIngredient>(ore16, ore16, ore16)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 23),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore16, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 23),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore16,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 23),
                arrayOf(arrayOf(ore16, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 23), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 23),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore16, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 23),
                arrayOf(arrayOf<IIngredient?>(ore16, ore16, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 23), null,
                                null), arrayOfNulls(3)), null)
        val ore17 = OreBracketHandler.getOre("AcaciaPlanks")
        ore17.add(ItemBracketHandler.getItem("Forestry:planks", 2))
        ore17.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 2))
        val ore18 = OreBracketHandler.getOre("AcaciaSlab")
        ore18.add(ItemBracketHandler.getItem("Forestry:slabs", 2))
        ore18.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 2))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 0),
                arrayOf(arrayOf<IIngredient>(ore17, ore18, ore17), arrayOf<IIngredient>(ore17, ore18, ore17),
                        arrayOf<IIngredient>(ore17, ore18, ore17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 0),
                arrayOf(arrayOf<IIngredient>(ore18, ore18, ore18),
                        arrayOf<IIngredient>(ore17, OreBracketHandler.getOre("bottleEmpty"), ore17),
                        arrayOf<IIngredient>(ore18, ore18, ore18)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 0),
                arrayOf(arrayOf<IIngredient?>(ore18, ore18, ore18), arrayOf<IIngredient?>(null, ore17, null),
                        arrayOf<IIngredient?>(ore18, ore18, ore18)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 0),
                arrayOf(arrayOf<IIngredient>(ore18, ore18, ore18),
                        arrayOf<IIngredient>(ore18, OreBracketHandler.getOre("ingotIron"), ore18),
                        arrayOf<IIngredient>(ore18, ore18, ore18)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 0),
                arrayOf(arrayOf<IIngredient>(ore18, OreBracketHandler.getOre("glass"), ore18),
                        arrayOf<IIngredient>(ore18, OreBracketHandler.getOre("blockWool"), ore18),
                        arrayOf<IIngredient>(ore18, ore18, ore18)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore18, ore18, ore18),
                        arrayOf<IIngredient?>(ore17, null, ore17)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore18, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore18,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 0),
                arrayOf(arrayOf<IIngredient?>(ore18, ore18, ore18), arrayOf<IIngredient?>(null, ore17, null),
                        arrayOf<IIngredient?>(null, ore17, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore18,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore18, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 0),
                                ore18), arrayOf<IIngredient>(ore18, ore18, ore18)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore18, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore18,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 0),
                arrayOf(arrayOf(ore18, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 0), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 0),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore18, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 0),
                arrayOf(arrayOf<IIngredient?>(ore18, ore18, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 0), null,
                                null), arrayOfNulls(3)), null)
        val ore19 = OreBracketHandler.getOre("BalsaPlanks")
        ore19.add(ItemBracketHandler.getItem("Forestry:planks", 11))
        ore19.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 11))
        val ore20 = OreBracketHandler.getOre("BalsaSlab")
        ore20.add(ItemBracketHandler.getItem("Forestry:slabs", 11))
        ore20.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 11))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 1),
                arrayOf(arrayOf<IIngredient>(ore19, ore20, ore19), arrayOf<IIngredient>(ore19, ore20, ore19),
                        arrayOf<IIngredient>(ore19, ore20, ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 1),
                arrayOf(arrayOf<IIngredient>(ore20, ore20, ore20),
                        arrayOf<IIngredient>(ore19, OreBracketHandler.getOre("bottleEmpty"), ore19),
                        arrayOf<IIngredient>(ore20, ore20, ore20)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 1),
                arrayOf(arrayOf<IIngredient?>(ore20, ore20, ore20), arrayOf<IIngredient?>(null, ore19, null),
                        arrayOf<IIngredient?>(ore20, ore20, ore20)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 1),
                arrayOf(arrayOf<IIngredient>(ore20, ore20, ore20),
                        arrayOf<IIngredient>(ore20, OreBracketHandler.getOre("ingotIron"), ore20),
                        arrayOf<IIngredient>(ore20, ore20, ore20)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 1),
                arrayOf(arrayOf<IIngredient>(ore20, OreBracketHandler.getOre("glass"), ore20),
                        arrayOf<IIngredient>(ore20, OreBracketHandler.getOre("blockWool"), ore20),
                        arrayOf<IIngredient>(ore20, ore20, ore20)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 1),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore20, ore20, ore20),
                        arrayOf<IIngredient?>(ore19, null, ore19)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 1),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore20, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore20,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 1),
                arrayOf(arrayOf<IIngredient?>(ore20, ore20, ore20), arrayOf<IIngredient?>(null, ore19, null),
                        arrayOf<IIngredient?>(null, ore19, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 1),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore20,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore20, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 1),
                                ore20), arrayOf<IIngredient>(ore20, ore20, ore20)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 1),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore20, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 1),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore20,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 1),
                arrayOf(arrayOf(ore20, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 1), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 1),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore20, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 1),
                arrayOf(arrayOf<IIngredient?>(ore20, ore20, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 1), null,
                                null), arrayOfNulls(3)), null)
        val ore21 = OreBracketHandler.getOre("BaobabPlanks")
        ore21.add(ItemBracketHandler.getItem("Forestry:planks", 6))
        ore21.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 6))
        val ore22 = OreBracketHandler.getOre("BaobabSlab")
        ore22.add(ItemBracketHandler.getItem("Forestry:slabs", 6))
        ore22.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 6))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 2),
                arrayOf(arrayOf<IIngredient>(ore21, ore22, ore21), arrayOf<IIngredient>(ore21, ore22, ore21),
                        arrayOf<IIngredient>(ore21, ore22, ore21)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 2),
                arrayOf(arrayOf<IIngredient>(ore22, ore22, ore22),
                        arrayOf<IIngredient>(ore21, OreBracketHandler.getOre("bottleEmpty"), ore21),
                        arrayOf<IIngredient>(ore22, ore22, ore22)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 2),
                arrayOf(arrayOf<IIngredient?>(ore22, ore22, ore22), arrayOf<IIngredient?>(null, ore21, null),
                        arrayOf<IIngredient?>(ore22, ore22, ore22)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 2),
                arrayOf(arrayOf<IIngredient>(ore22, ore22, ore22),
                        arrayOf<IIngredient>(ore22, OreBracketHandler.getOre("ingotIron"), ore22),
                        arrayOf<IIngredient>(ore22, ore22, ore22)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 2),
                arrayOf(arrayOf<IIngredient>(ore22, OreBracketHandler.getOre("glass"), ore22),
                        arrayOf<IIngredient>(ore22, OreBracketHandler.getOre("blockWool"), ore22),
                        arrayOf<IIngredient>(ore22, ore22, ore22)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 2),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore22, ore22, ore22),
                        arrayOf<IIngredient?>(ore21, null, ore21)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 2),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore22, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore22,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 2),
                arrayOf(arrayOf<IIngredient?>(ore22, ore22, ore22), arrayOf<IIngredient?>(null, ore21, null),
                        arrayOf<IIngredient?>(null, ore21, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore22,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore22, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 2),
                                ore22), arrayOf<IIngredient>(ore22, ore22, ore22)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 2),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore22, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 2),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore22,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 2),
                arrayOf(arrayOf(ore22, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 2), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 2),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore22, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 2),
                arrayOf(arrayOf<IIngredient?>(ore22, ore22, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 2), null,
                                null), arrayOfNulls(3)), null)
        val ore23 = OreBracketHandler.getOre("CherryPlanks")
        ore23.add(ItemBracketHandler.getItem("Forestry:planks", 15))
        ore23.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 15))
        val ore24 = OreBracketHandler.getOre("CherrySlab")
        ore24.add(ItemBracketHandler.getItem("Forestry:slabs", 15))
        ore24.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 15))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 3),
                arrayOf(arrayOf<IIngredient>(ore23, ore24, ore23), arrayOf<IIngredient>(ore23, ore24, ore23),
                        arrayOf<IIngredient>(ore23, ore24, ore23)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 3),
                arrayOf(arrayOf<IIngredient>(ore24, ore24, ore24),
                        arrayOf<IIngredient>(ore23, OreBracketHandler.getOre("bottleEmpty"), ore23),
                        arrayOf<IIngredient>(ore24, ore24, ore24)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 3),
                arrayOf(arrayOf<IIngredient?>(ore24, ore24, ore24), arrayOf<IIngredient?>(null, ore23, null),
                        arrayOf<IIngredient?>(ore24, ore24, ore24)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 3),
                arrayOf(arrayOf<IIngredient>(ore24, ore24, ore24),
                        arrayOf<IIngredient>(ore24, OreBracketHandler.getOre("ingotIron"), ore24),
                        arrayOf<IIngredient>(ore24, ore24, ore24)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 3),
                arrayOf(arrayOf<IIngredient>(ore24, OreBracketHandler.getOre("glass"), ore24),
                        arrayOf<IIngredient>(ore24, OreBracketHandler.getOre("blockWool"), ore24),
                        arrayOf<IIngredient>(ore24, ore24, ore24)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 3),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore24, ore24, ore24),
                        arrayOf<IIngredient?>(ore23, null, ore23)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 3),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore24, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore24,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 3),
                arrayOf(arrayOf<IIngredient?>(ore24, ore24, ore24), arrayOf<IIngredient?>(null, ore23, null),
                        arrayOf<IIngredient?>(null, ore23, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore24,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore24, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 3),
                                ore24), arrayOf<IIngredient>(ore24, ore24, ore24)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 3),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore24, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 3),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore24,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 3),
                arrayOf(arrayOf(ore24, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 3), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 3),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore24, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 3),
                arrayOf(arrayOf<IIngredient?>(ore24, ore24, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 3), null,
                                null), arrayOfNulls(3)), null)
        val ore25 = OreBracketHandler.getOre("ChestnutPlanks")
        ore25.add(ItemBracketHandler.getItem("Forestry:planks", 4))
        ore25.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 4))
        val ore26 = OreBracketHandler.getOre("ChestnutSlab")
        ore26.add(ItemBracketHandler.getItem("Forestry:slabs", 4))
        ore26.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 4))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 4),
                arrayOf(arrayOf<IIngredient>(ore25, ore26, ore25), arrayOf<IIngredient>(ore25, ore26, ore25),
                        arrayOf<IIngredient>(ore25, ore26, ore25)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 4),
                arrayOf(arrayOf<IIngredient>(ore26, ore26, ore26),
                        arrayOf<IIngredient>(ore25, OreBracketHandler.getOre("bottleEmpty"), ore25),
                        arrayOf<IIngredient>(ore26, ore26, ore26)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 4),
                arrayOf(arrayOf<IIngredient?>(ore26, ore26, ore26), arrayOf<IIngredient?>(null, ore25, null),
                        arrayOf<IIngredient?>(ore26, ore26, ore26)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 4),
                arrayOf(arrayOf<IIngredient>(ore26, ore26, ore26),
                        arrayOf<IIngredient>(ore26, OreBracketHandler.getOre("ingotIron"), ore26),
                        arrayOf<IIngredient>(ore26, ore26, ore26)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 4),
                arrayOf(arrayOf<IIngredient>(ore26, OreBracketHandler.getOre("glass"), ore26),
                        arrayOf<IIngredient>(ore26, OreBracketHandler.getOre("blockWool"), ore26),
                        arrayOf<IIngredient>(ore26, ore26, ore26)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 4),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore26, ore26, ore26),
                        arrayOf<IIngredient?>(ore25, null, ore25)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 4),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore26, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore26,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 4),
                arrayOf(arrayOf<IIngredient?>(ore26, ore26, ore26), arrayOf<IIngredient?>(null, ore25, null),
                        arrayOf<IIngredient?>(null, ore25, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 4),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore26,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 4),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore26, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 4),
                                ore26), arrayOf<IIngredient>(ore26, ore26, ore26)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 4),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore26, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 4),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore26,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 4),
                arrayOf(arrayOf(ore26, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 4), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 4),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore26, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 4),
                arrayOf(arrayOf<IIngredient?>(ore26, ore26, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 4), null,
                                null), arrayOfNulls(3)), null)
        val ore27 = OreBracketHandler.getOre("CitrusPlanks")
        ore27.add(ItemBracketHandler.getItem("Forestry:planks", 23))
        ore27.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 23))
        val ore28 = OreBracketHandler.getOre("CitrusSlab")
        ore28.add(ItemBracketHandler.getItem("Forestry:slabs", 23))
        ore28.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 23))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 5),
                arrayOf(arrayOf<IIngredient>(ore27, ore28, ore27), arrayOf<IIngredient>(ore27, ore28, ore27),
                        arrayOf<IIngredient>(ore27, ore28, ore27)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 5),
                arrayOf(arrayOf<IIngredient>(ore28, ore28, ore28),
                        arrayOf<IIngredient>(ore27, OreBracketHandler.getOre("bottleEmpty"), ore27),
                        arrayOf<IIngredient>(ore28, ore28, ore28)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 5),
                arrayOf(arrayOf<IIngredient?>(ore28, ore28, ore28), arrayOf<IIngredient?>(null, ore27, null),
                        arrayOf<IIngredient?>(ore28, ore28, ore28)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 5),
                arrayOf(arrayOf<IIngredient>(ore28, ore28, ore28),
                        arrayOf<IIngredient>(ore28, OreBracketHandler.getOre("ingotIron"), ore28),
                        arrayOf<IIngredient>(ore28, ore28, ore28)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 5),
                arrayOf(arrayOf<IIngredient>(ore28, OreBracketHandler.getOre("glass"), ore28),
                        arrayOf<IIngredient>(ore28, OreBracketHandler.getOre("blockWool"), ore28),
                        arrayOf<IIngredient>(ore28, ore28, ore28)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 5),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore28, ore28, ore28),
                        arrayOf<IIngredient?>(ore27, null, ore27)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 5),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore28, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore28,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 5),
                arrayOf(arrayOf<IIngredient?>(ore28, ore28, ore28), arrayOf<IIngredient?>(null, ore27, null),
                        arrayOf<IIngredient?>(null, ore27, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 5),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore28,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 5),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore28, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 5),
                                ore28), arrayOf<IIngredient>(ore28, ore28, ore28)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 5),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore28, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 5),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore28,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 5),
                arrayOf(arrayOf(ore28, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 5), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 5),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore28, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 5),
                arrayOf(arrayOf<IIngredient?>(ore28, ore28, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 5), null,
                                null), arrayOfNulls(3)), null)
        val ore29 = OreBracketHandler.getOre("EbonyPlanks")
        ore29.add(ItemBracketHandler.getItem("Forestry:planks", 9))
        ore29.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 9))
        val ore30 = OreBracketHandler.getOre("EbonySlab")
        ore30.add(ItemBracketHandler.getItem("Forestry:slabs", 9))
        ore30.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 9))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 6),
                arrayOf(arrayOf<IIngredient>(ore29, ore30, ore29), arrayOf<IIngredient>(ore29, ore30, ore29),
                        arrayOf<IIngredient>(ore29, ore30, ore29)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 6),
                arrayOf(arrayOf<IIngredient>(ore30, ore30, ore30),
                        arrayOf<IIngredient>(ore29, OreBracketHandler.getOre("bottleEmpty"), ore29),
                        arrayOf<IIngredient>(ore30, ore30, ore30)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 6),
                arrayOf(arrayOf<IIngredient?>(ore30, ore30, ore30), arrayOf<IIngredient?>(null, ore29, null),
                        arrayOf<IIngredient?>(ore30, ore30, ore30)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 6),
                arrayOf(arrayOf<IIngredient>(ore30, ore30, ore30),
                        arrayOf<IIngredient>(ore30, OreBracketHandler.getOre("ingotIron"), ore30),
                        arrayOf<IIngredient>(ore30, ore30, ore30)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 6),
                arrayOf(arrayOf<IIngredient>(ore30, OreBracketHandler.getOre("glass"), ore30),
                        arrayOf<IIngredient>(ore30, OreBracketHandler.getOre("blockWool"), ore30),
                        arrayOf<IIngredient>(ore30, ore30, ore30)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 6),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore30, ore30, ore30),
                        arrayOf<IIngredient?>(ore29, null, ore29)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 6),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore30, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore30,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 6),
                arrayOf(arrayOf<IIngredient?>(ore30, ore30, ore30), arrayOf<IIngredient?>(null, ore29, null),
                        arrayOf<IIngredient?>(null, ore29, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 6),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore30,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 6),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore30, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 6),
                                ore30), arrayOf<IIngredient>(ore30, ore30, ore30)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 6),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore30, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 6),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore30,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 6),
                arrayOf(arrayOf(ore30, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 6), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 6),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore30, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 6),
                arrayOf(arrayOf<IIngredient?>(ore30, ore30, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 6), null,
                                null), arrayOfNulls(3)), null)
        val ore31 = OreBracketHandler.getOre("GreenheartPlanks")
        ore31.add(ItemBracketHandler.getItem("Forestry:planks", 14))
        ore31.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 14))
        val ore32 = OreBracketHandler.getOre("GreenheartSlabs")
        ore32.add(ItemBracketHandler.getItem("Forestry:slabs", 14))
        ore32.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 14))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 7),
                arrayOf(arrayOf<IIngredient>(ore31, ore32, ore31), arrayOf<IIngredient>(ore31, ore32, ore31),
                        arrayOf<IIngredient>(ore31, ore32, ore31)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 7),
                arrayOf(arrayOf<IIngredient>(ore32, ore32, ore32),
                        arrayOf<IIngredient>(ore31, OreBracketHandler.getOre("bottleEmpty"), ore31),
                        arrayOf<IIngredient>(ore32, ore32, ore32)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 7),
                arrayOf(arrayOf<IIngredient?>(ore32, ore32, ore32), arrayOf<IIngredient?>(null, ore31, null),
                        arrayOf<IIngredient?>(ore32, ore32, ore32)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 7),
                arrayOf(arrayOf<IIngredient>(ore32, ore32, ore32),
                        arrayOf<IIngredient>(ore32, OreBracketHandler.getOre("ingotIron"), ore32),
                        arrayOf<IIngredient>(ore32, ore32, ore32)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 7),
                arrayOf(arrayOf<IIngredient>(ore32, OreBracketHandler.getOre("glass"), ore32),
                        arrayOf<IIngredient>(ore32, OreBracketHandler.getOre("blockWool"), ore32),
                        arrayOf<IIngredient>(ore32, ore32, ore32)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 7),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore32, ore32, ore32),
                        arrayOf<IIngredient?>(ore31, null, ore31)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 7),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore32, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore32,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 7),
                arrayOf(arrayOf<IIngredient?>(ore32, ore32, ore32), arrayOf<IIngredient?>(null, ore31, null),
                        arrayOf<IIngredient?>(null, ore31, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 7),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore32,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 7),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore32, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 7),
                                ore32), arrayOf<IIngredient>(ore32, ore32, ore32)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 7),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore32, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 7),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore32,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 7),
                arrayOf(arrayOf(ore32, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 7), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 7),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore32, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 7),
                arrayOf(arrayOf<IIngredient?>(ore32, ore32, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 7), null,
                                null), arrayOfNulls(3)), null)
        val ore33 = OreBracketHandler.getOre("KapokPlanks")
        ore33.add(ItemBracketHandler.getItem("Forestry:planks", 8))
        ore33.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 8))
        val ore34 = OreBracketHandler.getOre("KapokSlabs")
        ore34.add(ItemBracketHandler.getItem("Forestry:slabs", 8))
        ore34.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 8))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 8),
                arrayOf(arrayOf<IIngredient>(ore33, ore34, ore33), arrayOf<IIngredient>(ore33, ore34, ore33),
                        arrayOf<IIngredient>(ore33, ore34, ore33)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 8),
                arrayOf(arrayOf<IIngredient>(ore34, ore34, ore34),
                        arrayOf<IIngredient>(ore33, OreBracketHandler.getOre("bottleEmpty"), ore33),
                        arrayOf<IIngredient>(ore34, ore34, ore34)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 8),
                arrayOf(arrayOf<IIngredient?>(ore34, ore34, ore34), arrayOf<IIngredient?>(null, ore33, null),
                        arrayOf<IIngredient?>(ore34, ore34, ore34)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 8),
                arrayOf(arrayOf<IIngredient>(ore34, ore34, ore34),
                        arrayOf<IIngredient>(ore34, OreBracketHandler.getOre("ingotIron"), ore34),
                        arrayOf<IIngredient>(ore34, ore34, ore34)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 8),
                arrayOf(arrayOf<IIngredient>(ore34, OreBracketHandler.getOre("glass"), ore34),
                        arrayOf<IIngredient>(ore34, OreBracketHandler.getOre("blockWool"), ore34),
                        arrayOf<IIngredient>(ore34, ore34, ore34)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 8),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore34, ore34, ore34),
                        arrayOf<IIngredient?>(ore33, null, ore33)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 8),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore34, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore34,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 8),
                arrayOf(arrayOf<IIngredient?>(ore34, ore34, ore34), arrayOf<IIngredient?>(null, ore33, null),
                        arrayOf<IIngredient?>(null, ore33, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 8),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore34,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 8),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore34, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 8),
                                ore34), arrayOf<IIngredient>(ore34, ore34, ore34)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 8),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore34, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 8),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore34,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 8),
                arrayOf(arrayOf(ore34, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 8), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 8),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore34, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 8),
                arrayOf(arrayOf<IIngredient?>(ore34, ore34, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 8), null,
                                null), arrayOfNulls(3)), null)
        val ore35 = OreBracketHandler.getOre("LarchPlanks")
        ore35.add(ItemBracketHandler.getItem("Forestry:planks", 0))
        ore35.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 0))
        val ore36 = OreBracketHandler.getOre("LarchSlabs")
        ore36.add(ItemBracketHandler.getItem("Forestry:slabs", 0))
        ore36.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 9),
                arrayOf(arrayOf<IIngredient>(ore35, ore36, ore35), arrayOf<IIngredient>(ore35, ore36, ore35),
                        arrayOf<IIngredient>(ore35, ore36, ore35)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 9),
                arrayOf(arrayOf<IIngredient>(ore36, ore36, ore36),
                        arrayOf<IIngredient>(ore35, OreBracketHandler.getOre("bottleEmpty"), ore35),
                        arrayOf<IIngredient>(ore36, ore36, ore36)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 9),
                arrayOf(arrayOf<IIngredient?>(ore36, ore36, ore36), arrayOf<IIngredient?>(null, ore35, null),
                        arrayOf<IIngredient?>(ore36, ore36, ore36)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 9),
                arrayOf(arrayOf<IIngredient>(ore36, ore36, ore36),
                        arrayOf<IIngredient>(ore36, OreBracketHandler.getOre("ingotIron"), ore36),
                        arrayOf<IIngredient>(ore36, ore36, ore36)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 9),
                arrayOf(arrayOf<IIngredient>(ore36, OreBracketHandler.getOre("glass"), ore36),
                        arrayOf<IIngredient>(ore36, OreBracketHandler.getOre("blockWool"), ore36),
                        arrayOf<IIngredient>(ore36, ore36, ore36)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 9),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore36, ore36, ore36),
                        arrayOf<IIngredient?>(ore35, null, ore35)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 9),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore36, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore36,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 9),
                arrayOf(arrayOf<IIngredient?>(ore36, ore36, ore36), arrayOf<IIngredient?>(null, ore35, null),
                        arrayOf<IIngredient?>(null, ore35, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 9),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore36,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 9),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore36, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 9),
                                ore36), arrayOf<IIngredient>(ore36, ore36, ore36)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 9),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore36, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 9),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore36,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 9),
                arrayOf(arrayOf(ore36, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 9), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 9),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore36, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 9),
                arrayOf(arrayOf<IIngredient?>(ore36, ore36, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 9), null,
                                null), arrayOfNulls(3)), null)
        val ore37 = OreBracketHandler.getOre("LimePlanks")
        ore37.add(ItemBracketHandler.getItem("Forestry:planks", 3))
        ore37.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 3))
        val ore38 = OreBracketHandler.getOre("LimeSlabs")
        ore38.add(ItemBracketHandler.getItem("Forestry:slabs", 3))
        ore38.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 3))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 10),
                arrayOf(arrayOf<IIngredient>(ore37, ore38, ore37), arrayOf<IIngredient>(ore37, ore38, ore37),
                        arrayOf<IIngredient>(ore37, ore38, ore37)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 10),
                arrayOf(arrayOf<IIngredient>(ore38, ore38, ore38),
                        arrayOf<IIngredient>(ore37, OreBracketHandler.getOre("bottleEmpty"), ore37),
                        arrayOf<IIngredient>(ore38, ore38, ore38)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 10),
                arrayOf(arrayOf<IIngredient?>(ore38, ore38, ore38), arrayOf<IIngredient?>(null, ore37, null),
                        arrayOf<IIngredient?>(ore38, ore38, ore38)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 10),
                arrayOf(arrayOf<IIngredient>(ore38, ore38, ore38),
                        arrayOf<IIngredient>(ore38, OreBracketHandler.getOre("ingotIron"), ore38),
                        arrayOf<IIngredient>(ore38, ore38, ore38)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 10),
                arrayOf(arrayOf<IIngredient>(ore38, OreBracketHandler.getOre("glass"), ore38),
                        arrayOf<IIngredient>(ore38, OreBracketHandler.getOre("blockWool"), ore38),
                        arrayOf<IIngredient>(ore38, ore38, ore38)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 10),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore38, ore38, ore38),
                        arrayOf<IIngredient?>(ore37, null, ore37)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 10),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore38, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore38,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 10),
                arrayOf(arrayOf<IIngredient?>(ore38, ore38, ore38), arrayOf<IIngredient?>(null, ore37, null),
                        arrayOf<IIngredient?>(null, ore37, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 10),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore38,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 10),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore38, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 10),
                                ore38), arrayOf<IIngredient>(ore38, ore38, ore38)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 10),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore38, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 10),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore38,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 10),
                arrayOf(arrayOf(ore38, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 10), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 10),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore38, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 10),
                arrayOf(arrayOf<IIngredient?>(ore38, ore38, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 10), null,
                                null), arrayOfNulls(3)), null)
        val ore39 = OreBracketHandler.getOre("MahoePlanks")
        ore39.add(ItemBracketHandler.getItem("Forestry:planks", 16))
        ore39.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 16))
        val ore40 = OreBracketHandler.getOre("MahoeSlabs")
        ore40.add(ItemBracketHandler.getItem("Forestry:slabs", 16))
        ore40.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 16))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 11),
                arrayOf(arrayOf<IIngredient>(ore39, ore40, ore39), arrayOf<IIngredient>(ore39, ore40, ore39),
                        arrayOf<IIngredient>(ore39, ore40, ore39)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 11),
                arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40),
                        arrayOf<IIngredient>(ore39, OreBracketHandler.getOre("bottleEmpty"), ore39),
                        arrayOf<IIngredient>(ore40, ore40, ore40)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 11),
                arrayOf(arrayOf<IIngredient?>(ore40, ore40, ore40), arrayOf<IIngredient?>(null, ore39, null),
                        arrayOf<IIngredient?>(ore40, ore40, ore40)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 11),
                arrayOf(arrayOf<IIngredient>(ore40, ore40, ore40),
                        arrayOf<IIngredient>(ore40, OreBracketHandler.getOre("ingotIron"), ore40),
                        arrayOf<IIngredient>(ore40, ore40, ore40)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 11),
                arrayOf(arrayOf<IIngredient>(ore40, OreBracketHandler.getOre("glass"), ore40),
                        arrayOf<IIngredient>(ore40, OreBracketHandler.getOre("blockWool"), ore40),
                        arrayOf<IIngredient>(ore40, ore40, ore40)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 11),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore40, ore40, ore40),
                        arrayOf<IIngredient?>(ore39, null, ore39)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 11),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore40, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore40,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 11),
                arrayOf(arrayOf<IIngredient?>(ore40, ore40, ore40), arrayOf<IIngredient?>(null, ore39, null),
                        arrayOf<IIngredient?>(null, ore39, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 11),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore40,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 11),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore40, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 11),
                                ore40), arrayOf<IIngredient>(ore40, ore40, ore40)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 11),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore40, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 11),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore40,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 11),
                arrayOf(arrayOf(ore40, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 11), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 11),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore40, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 11),
                arrayOf(arrayOf<IIngredient?>(ore40, ore40, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 11), null,
                                null), arrayOfNulls(3)), null)
        val ore41 = OreBracketHandler.getOre("MahoganyPlanks")
        ore41.add(ItemBracketHandler.getItem("Forestry:planks", 10))
        ore41.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 10))
        val ore42 = OreBracketHandler.getOre("MahoganySlabs")
        ore42.add(ItemBracketHandler.getItem("Forestry:slabs", 10))
        ore42.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 10))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 12),
                arrayOf(arrayOf<IIngredient>(ore41, ore42, ore41), arrayOf<IIngredient>(ore41, ore42, ore41),
                        arrayOf<IIngredient>(ore41, ore42, ore41)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 12),
                arrayOf(arrayOf<IIngredient>(ore42, ore42, ore42),
                        arrayOf<IIngredient>(ore41, OreBracketHandler.getOre("bottleEmpty"), ore41),
                        arrayOf<IIngredient>(ore42, ore42, ore42)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 12),
                arrayOf(arrayOf<IIngredient?>(ore42, ore42, ore42), arrayOf<IIngredient?>(null, ore41, null),
                        arrayOf<IIngredient?>(ore42, ore42, ore42)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 12),
                arrayOf(arrayOf<IIngredient>(ore42, ore42, ore42),
                        arrayOf<IIngredient>(ore42, OreBracketHandler.getOre("ingotIron"), ore42),
                        arrayOf<IIngredient>(ore42, ore42, ore42)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 12),
                arrayOf(arrayOf<IIngredient>(ore42, OreBracketHandler.getOre("glass"), ore42),
                        arrayOf<IIngredient>(ore42, OreBracketHandler.getOre("blockWool"), ore42),
                        arrayOf<IIngredient>(ore42, ore42, ore42)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 12),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore42, ore42, ore42),
                        arrayOf<IIngredient?>(ore41, null, ore41)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 12),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore42, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore42,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 12),
                arrayOf(arrayOf<IIngredient?>(ore42, ore42, ore42), arrayOf<IIngredient?>(null, ore41, null),
                        arrayOf<IIngredient?>(null, ore41, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 12),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore42,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 12),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore42, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 12),
                                ore42), arrayOf<IIngredient>(ore42, ore42, ore42)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 12),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore42, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 12),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore42,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 12),
                arrayOf(arrayOf(ore42, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 12), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 12),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore42, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 12),
                arrayOf(arrayOf<IIngredient?>(ore42, ore42, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 12), null,
                                null), arrayOfNulls(3)), null)
        val ore43 = OreBracketHandler.getOre("MapplePlanks")
        ore43.add(ItemBracketHandler.getItem("Forestry:planks", 22))
        ore43.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 22))
        val ore44 = OreBracketHandler.getOre("MappleSlabs")
        ore44.add(ItemBracketHandler.getItem("Forestry:slabs", 22))
        ore44.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 22))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 13),
                arrayOf(arrayOf<IIngredient>(ore43, ore44, ore43), arrayOf<IIngredient>(ore43, ore44, ore43),
                        arrayOf<IIngredient>(ore43, ore44, ore43)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 13),
                arrayOf(arrayOf<IIngredient>(ore44, ore44, ore44),
                        arrayOf<IIngredient>(ore43, OreBracketHandler.getOre("bottleEmpty"), ore43),
                        arrayOf<IIngredient>(ore44, ore44, ore44)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 13),
                arrayOf(arrayOf<IIngredient?>(ore44, ore44, ore44), arrayOf<IIngredient?>(null, ore43, null),
                        arrayOf<IIngredient?>(ore44, ore44, ore44)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 13),
                arrayOf(arrayOf<IIngredient>(ore44, ore44, ore44),
                        arrayOf<IIngredient>(ore44, OreBracketHandler.getOre("ingotIron"), ore44),
                        arrayOf<IIngredient>(ore44, ore44, ore44)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 13),
                arrayOf(arrayOf<IIngredient>(ore44, OreBracketHandler.getOre("glass"), ore44),
                        arrayOf<IIngredient>(ore44, OreBracketHandler.getOre("blockWool"), ore44),
                        arrayOf<IIngredient>(ore44, ore44, ore44)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 13),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore44, ore44, ore44),
                        arrayOf<IIngredient?>(ore43, null, ore43)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 13),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore44, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore44,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 13),
                arrayOf(arrayOf<IIngredient?>(ore44, ore44, ore44), arrayOf<IIngredient?>(null, ore43, null),
                        arrayOf<IIngredient?>(null, ore43, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 13),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore44,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 13),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore44, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 13),
                                ore44), arrayOf<IIngredient>(ore44, ore44, ore44)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 13),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore44, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 13),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore44,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 13),
                arrayOf(arrayOf(ore44, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 13), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 13),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore44, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 13),
                arrayOf(arrayOf<IIngredient?>(ore44, ore44, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 13), null,
                                null), arrayOfNulls(3)), null)
        val ore45 = OreBracketHandler.getOre("PalmPlanks")
        ore45.add(ItemBracketHandler.getItem("Forestry:planks", 18))
        ore45.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 18))
        val ore46 = OreBracketHandler.getOre("PalmSlabs")
        ore46.add(ItemBracketHandler.getItem("Forestry:slabs", 18))
        ore46.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 18))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 14),
                arrayOf(arrayOf<IIngredient>(ore45, ore46, ore45), arrayOf<IIngredient>(ore45, ore46, ore45),
                        arrayOf<IIngredient>(ore45, ore46, ore45)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 14),
                arrayOf(arrayOf<IIngredient>(ore46, ore46, ore46),
                        arrayOf<IIngredient>(ore45, OreBracketHandler.getOre("bottleEmpty"), ore45),
                        arrayOf<IIngredient>(ore46, ore46, ore46)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 14),
                arrayOf(arrayOf<IIngredient?>(ore46, ore46, ore46), arrayOf<IIngredient?>(null, ore45, null),
                        arrayOf<IIngredient?>(ore46, ore46, ore46)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 14),
                arrayOf(arrayOf<IIngredient>(ore46, ore46, ore46),
                        arrayOf<IIngredient>(ore46, OreBracketHandler.getOre("ingotIron"), ore46),
                        arrayOf<IIngredient>(ore46, ore46, ore46)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 14),
                arrayOf(arrayOf<IIngredient>(ore46, OreBracketHandler.getOre("glass"), ore46),
                        arrayOf<IIngredient>(ore46, OreBracketHandler.getOre("blockWool"), ore46),
                        arrayOf<IIngredient>(ore46, ore46, ore46)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 14),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore46, ore46, ore46),
                        arrayOf<IIngredient?>(ore45, null, ore45)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 14),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore46, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore46,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 14),
                arrayOf(arrayOf<IIngredient?>(ore46, ore46, ore46), arrayOf<IIngredient?>(null, ore45, null),
                        arrayOf<IIngredient?>(null, ore45, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 14),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore46,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 14),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore46, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 14),
                                ore46), arrayOf<IIngredient>(ore46, ore46, ore46)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 14),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore46, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 14),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore46,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 14),
                arrayOf(arrayOf(ore46, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 14), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 14),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore46, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 14),
                arrayOf(arrayOf<IIngredient?>(ore46, ore46, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 14), null,
                                null), arrayOfNulls(3)), null)
        val ore47 = OreBracketHandler.getOre("PapayaPlanks")
        ore47.add(ItemBracketHandler.getItem("Forestry:planks", 19))
        ore47.add(ItemBracketHandler.getItem("Forestry:planksFireproof", 19))
        val ore48 = OreBracketHandler.getOre("PapayaSlabs")
        ore48.add(ItemBracketHandler.getItem("Forestry:slabs", 19))
        ore48.add(ItemBracketHandler.getItem("Forestry:slabsFireproof", 19))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 15),
                arrayOf(arrayOf<IIngredient>(ore47, ore48, ore47), arrayOf<IIngredient>(ore47, ore48, ore47),
                        arrayOf<IIngredient>(ore47, ore48, ore47)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstpotshelf", 15),
                arrayOf(arrayOf<IIngredient>(ore48, ore48, ore48),
                        arrayOf<IIngredient>(ore47, OreBracketHandler.getOre("bottleEmpty"), ore47),
                        arrayOf<IIngredient>(ore48, ore48, ore48)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstshelf", 15),
                arrayOf(arrayOf<IIngredient?>(ore48, ore48, ore48), arrayOf<IIngredient?>(null, ore47, null),
                        arrayOf<IIngredient?>(ore48, ore48, ore48)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstrack", 15),
                arrayOf(arrayOf<IIngredient>(ore48, ore48, ore48),
                        arrayOf<IIngredient>(ore48, OreBracketHandler.getOre("ingotIron"), ore48),
                        arrayOf<IIngredient>(ore48, ore48, ore48)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstcase0", 15),
                arrayOf(arrayOf<IIngredient>(ore48, OreBracketHandler.getOre("glass"), ore48),
                        arrayOf<IIngredient>(ore48, OreBracketHandler.getOre("blockWool"), ore48),
                        arrayOf<IIngredient>(ore48, ore48, ore48)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstdesk", 15),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("blockTorch"), null,
                        OreBracketHandler.getOre("craftingFeather")), arrayOf<IIngredient?>(ore48, ore48, ore48),
                        arrayOf<IIngredient?>(ore47, null, ore47)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodSeat", 15),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("slabCloth"), null),
                        arrayOf<IIngredient?>(null, ore48, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore48,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFsttable", 15),
                arrayOf(arrayOf<IIngredient?>(ore48, ore48, ore48), arrayOf<IIngredient?>(null, ore47, null),
                        arrayOf<IIngredient?>(null, ore47, null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodMapFrame", 15),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"), ore48,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFancyWorkbench", 15),
                arrayOf(arrayOf(OreBracketHandler.getOre("dyeBlack"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ore48, ItemBracketHandler.getItem("BiblioWoodsForestry:BiblioWoodFstBookcase", 15),
                                ore48), arrayOf<IIngredient>(ore48, ore48, ore48)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack1", 15),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore48, null),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 15),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"),
                        OreBracketHandler.getOre("blockWool"), OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), ore48,
                                OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), null,
                                OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack3", 15),
                arrayOf(arrayOf(ore48, ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 15), null),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack4", 15),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockWool"), null),
                        arrayOf<IIngredient?>(null, ore48, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("stickWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack5", 15),
                arrayOf(arrayOf<IIngredient?>(ore48, ore48, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BiblioWoodsForestry:seatBack2", 15), null,
                                null), arrayOfNulls(3)), null)
    }
}