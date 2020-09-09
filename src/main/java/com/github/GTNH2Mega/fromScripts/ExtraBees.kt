package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.FluidExtractor
import gttweaker.mods.gregtech.machines.Pulverizer
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI
import modtweaker2.mods.forestry.handlers.Carpenter
import modtweaker2.mods.forestry.handlers.Squeezer
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Research
import modtweaker2.mods.thaumcraft.handlers.Warp
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class ExtraBees : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:alveary", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:alveary", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:alveary", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:alveary", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:alveary", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:alveary", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:alveary", 3))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8502), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8503), null, false)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("minecraft:dye", 4), null, false)
        Carpenter.removeRecipe(ItemBracketHandler.getItem("ExtraBees:dictionary", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0))
        Carpenter.removeRecipe(ItemBracketHandler.getItem("ExtraBees:misc", 0), null)
        Squeezer.removeRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 8)))
        Squeezer.removeRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 9)))
        Squeezer.removeRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 10)))
        Squeezer.removeRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 11)))
        Squeezer.removeRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 12)))
        Squeezer.removeRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 13)))
        Squeezer.removeRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 14)))
        Carpenter.addRecipe(ItemBracketHandler.getItem("ExtraBees:dictionary", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17501),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemCasingGold"),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                OreBracketHandler.getOre("itemCasingGold")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27500))),
                LiquidBracketHandler.getLiquid("molten.redstone").withAmount(1440), 60,
                ItemBracketHandler.getItem("Forestry:beealyzer", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("ExtraBees:dictionary", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraBees:dictionary", 0)), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(7500),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 12),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17533),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 12),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17532),
                        ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17532),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 12),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17533),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 12)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("ExtraBees:alveary", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(7500),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                        ItemBracketHandler.getItem("Forestry:frameProven", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                        ItemBracketHandler.getItem("Forestry:frameProven", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4985),
                        ItemBracketHandler.getItem("Forestry:frameProven", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 10),
                        ItemBracketHandler.getItem("Forestry:frameProven", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 10)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("ExtraBees:alveary", 1))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(7500),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 8),
                        ItemBracketHandler.getItem("IC2:blockRubber", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 8),
                        ItemBracketHandler.getItem("IC2:blockRubber", 0),
                        ItemBracketHandler.getItem("minecraft:brick_block", 0),
                        ItemBracketHandler.getItem("IC2:blockRubber", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 8),
                        ItemBracketHandler.getItem("IC2:blockRubber", 0),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 8)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("ExtraBees:alveary", 2))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(7500),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                        ItemBracketHandler.getItem("minecraft:stained_glass", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                        ItemBracketHandler.getItem("minecraft:stained_glass", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("minecraft:redstone_lamp", 0),
                        ItemBracketHandler.getItem("minecraft:stained_glass", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 2),
                        ItemBracketHandler.getItem("minecraft:stained_glass", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 2)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("ExtraBees:alveary", 3))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(7500),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1460),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                        ItemBracketHandler.getItem("Forestry:chipsets", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                        ItemBracketHandler.getItem("Forestry:chipsets", 2),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 1),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1460),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 1)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("ExtraBees:alveary", 4))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("for.honey").withAmount(7500),
                arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17810),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32631),
                        ItemBracketHandler.getItem("Forestry:apiculture", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32631),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17810),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 3)),
                ItemBracketHandler.getItem("Forestry:alveary", 0), ItemBracketHandler.getItem("ExtraBees:alveary", 5))
        Carpenter.addRecipe(ItemBracketHandler.getItem("ExtraBees:alveary", 6),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Forestry:thermionicTubes", 0),
                        OreBracketHandler.getOre("circuitAdvanced"),
                        ItemBracketHandler.getItem("Forestry:thermionicTubes", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1587),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1587)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Forestry:thermionicTubes", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1587),
                                ItemBracketHandler.getItem("Forestry:thermionicTubes", 0))),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(7500), 60,
                ItemBracketHandler.getItem("Forestry:alveary", 0))
        Carpenter.addRecipe(20, LiquidBracketHandler.getLiquid("for.honey").withAmount(1000),
                arrayOf(ItemBracketHandler.getItem("Forestry:beeswax", 0),
                        ItemBracketHandler.getItem("Forestry:pollen", 0),
                        ItemBracketHandler.getItem("Forestry:beeswax", 2),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:beeswax", 0),
                        ItemBracketHandler.getItem("Forestry:royalJelly", 0),
                        ItemBracketHandler.getItem("Forestry:beeswax", 2),
                        ItemBracketHandler.getItem("Forestry:pollen", 0),
                        ItemBracketHandler.getItem("Forestry:beeswax", 2)),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31889),
                ItemBracketHandler.getItem("ExtraBees:misc", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0))
        Research.addResearch("HEALINGFRAME", "MAGICBEES", "praecantatio 15, fabrico 12, cognitio 9, victus 6", 7, -2, 4,
                ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.HEALINGFRAME", "Healing Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.HEALINGFRAME", "[EB] The Bees will never die ?")
        Research.addPrereq("HEALINGFRAME", "MB_EssenceLife", false)
        Research.setConcealed("HEALINGFRAME", true)
        Research.addPage("HEALINGFRAME", "ExtraBees.research_page.HEALINGFRAME")
        MineTweakerAPI.game.setLocalization("ExtraBees.research_page.HEALINGFRAME",
                "The Healing Frame is an Item used in an Apiary, which increases a Queens lifespan at the cost of a lesser productivity and a decreased mutation rate. It increases a bees lifespan 50% while reducing its productivity to 75% and the chance of mutation to only 50%. It is constructed using Clay and an Impregnated Frame. In an Alveary structure, the Frame Housing can be added to make use of the Frame.")
        Arcane.addShaped("HEALINGFRAME", ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0),
                "ordo 4, terra 4, aer 4, perditio 4, ignis 4, aqua 4",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwIron"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2805),
                        OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2805),
                                ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2805)),
                        arrayOf(OreBracketHandler.getOre("screwIron"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2805),
                                OreBracketHandler.getOre("screwIron"))))
        Research.addArcanePage("HEALINGFRAME", ItemBracketHandler.getItem("ExtraBees:hiveFrame.clay", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0))

        //TODO Replace ("harvestcraft:cocoapowderItem", 0)
        //Research.addResearch("CHOCOLATEFRAME", "MAGICBEES", "praecantatio 15, fabrico 12, cognitio 9, fames 6", 7, 2, 4,
        //        ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0))
        //MineTweakerAPI.game.setLocalization("tc.research_name.CHOCOLATEFRAME", "Chocolate Frame")
        //MineTweakerAPI.game.setLocalization("tc.research_text.CHOCOLATEFRAME", "[EB] Feeding the Bees")
        //Research.addPrereq("CHOCOLATEFRAME", "MB_EssenceUnstable", false)
        //Research.setConcealed("CHOCOLATEFRAME", true)
        //Research.addPage("CHOCOLATEFRAME", "ExtraBees.research_page.CHOCOLATEFRAME_1")
        //Research.addPage("CHOCOLATEFRAME", "ExtraBees.research_page.CHOCOLATEFRAME_2")
        //MineTweakerAPI.game.setLocalization("ExtraBees.research_page.CHOCOLATEFRAME_1",
        //        "The Chocolate Frame is an item used in an Apiary or Alveary Frame Housing , which increases a Queens productivity at the cost of a shorter lifespan. One Chocolate Frame increases the production of the Queen by 50% while reducing her lifespan by 50%. The effects of multiple frames stack multiplicatively, so three Chocolate Frames will make the Lifespan for a Longest life Queen four minutes instead of the usual thirty two. It is constructed using Cocoa Beans and an Impregnated Frame. Chocolate Frames are most often employed to speed up generational turnover, when cloning Princesses for a pure strain or breeding for traits.")
        //MineTweakerAPI.game.setLocalization("ExtraBees.research_page.CHOCOLATEFRAME_2",
        //        "For increased production, Forestrys standard Frames are more effective, unless the apiary is set up to automatically replace the drones and princess when the queen dies; in this case the chocolate frame will speed up production.")
        //Arcane.addShaped("CHOCOLATEFRAME", ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0),
        //        "ordo 4, terra 4, aer 4, perditio 4, ignis 4, aqua 4",
        //        arrayOf(arrayOf(OreBracketHandler.getOre("screwIron"), ItemBracketHandler.getItem("minecraft:sugar", 0),
        //                OreBracketHandler.getOre("screwIron")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:cocoapowderItem", 0),
        //                        ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:cocoapowderItem", 0)),
        //                arrayOf(OreBracketHandler.getOre("screwIron"), ItemBracketHandler.getItem("minecraft:sugar", 0),
        //                        OreBracketHandler.getOre("screwIron"))))
        //Research.addArcanePage("CHOCOLATEFRAME", ItemBracketHandler.getItem("ExtraBees:hiveFrame.cocoa", 0))

        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0))
        Research.addResearch("RESTRAINTFRAME", "MAGICBEES", "praecantatio 15, fabrico 12, cognitio 9, metallum 6", 9, 0,
                4, ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.RESTRAINTFRAME", "Restraint Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.RESTRAINTFRAME", "[EB] A Bee Cage ?")
        Research.addPrereq("RESTRAINTFRAME", "PROVENFRAME", false)
        Research.addPrereq("RESTRAINTFRAME", "HEALINGFRAME", false)
        Research.addPrereq("RESTRAINTFRAME", "CHOCOLATEFRAME", false)
        Research.setConcealed("RESTRAINTFRAME", true)
        Research.addPage("RESTRAINTFRAME", "ExtraBees.research_page.RESTRAINTFRAME")
        MineTweakerAPI.game.setLocalization("ExtraBees.research_page.RESTRAINTFRAME",
                "The Restraint Frame is an Item used in an Apiary, which decreases a bees range at the cost of lesser productivity and a shorter lifespan. The lifespan and production are both reduced to 75%. The bees territory is decreased to 50%, meaning that special effects such as poison or aggression have a smaller range. The Restraint Frame is only considered useful in special cases, as a bees damaging effects can also be cancelled out using Apiarists Clothes. In an Alveary structure, the Frame Housing can be added to make use of the Frame.")
        Arcane.addShaped("RESTRAINTFRAME", ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                "ordo 8, terra 8, aer 8, perditio 8, ignis 8, aqua 8",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("barsIron"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("barsIron"),
                                ItemBracketHandler.getItem("Forestry:frameImpregnated", 0),
                                OreBracketHandler.getOre("barsIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("barsIron"), OreBracketHandler.getOre("screwSteel"))))
        Research.addArcanePage("RESTRAINTFRAME", ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0))
        Research.addResearch("SOULFRAME", "MAGICBEES", "praecantatio 15, fabrico 12, cognitio 9, spiritus 6", 11, 0, 4,
                ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SOULFRAME", "Soul Frame")
        MineTweakerAPI.game.setLocalization("tc.research_text.SOULFRAME", "[EB] Feeding the Bees")
        Research.addPrereq("SOULFRAME", "RESTRAINTFRAME", false)
        Research.setConcealed("SOULFRAME", true)
        Research.addPage("SOULFRAME", "ExtraBees.research_page.SOULFRAME")
        MineTweakerAPI.game.setLocalization("ExtraBees.research_page.SOULFRAME",
                "The Soul Frame is an Item used in an Apiary, which increases the chance of getting a different type of Bee species at the cost of drastically reduced production and a shorter lifespan. It increases the chance of mutation by 50% of the initial mutation chance. The lifespan is reduced to 75% while production is reduced to 25% of its original value. In an Alveary structure, the Frame Housing can be added to make use of the Frame.")
        Arcane.addShaped("SOULFRAME", ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0),
                "ordo 16, terra 16, aer 16, perditio 16, ignis 16, aqua 16",
                arrayOf(arrayOf(OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                        OreBracketHandler.getOre("screwAluminium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                                ItemBracketHandler.getItem("ExtraBees:hiveFrame.cage", 0),
                                ItemBracketHandler.getItem("minecraft:soul_sand", 0)),
                        arrayOf(OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                                OreBracketHandler.getOre("screwAluminium"))))
        Research.addArcanePage("SOULFRAME", ItemBracketHandler.getItem("ExtraBees:hiveFrame.soul", 0))
        Warp.addToResearch("SOULFRAME", 1)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 500)),
                ItemBracketHandler.getItem("ExtraBees:misc", 1), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 501)),
                ItemBracketHandler.getItem("ExtraBees:misc", 2), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 502)),
                ItemBracketHandler.getItem("ExtraBees:misc", 3), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 503)),
                ItemBracketHandler.getItem("ExtraBees:misc", 4), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 526)),
                ItemBracketHandler.getItem("ExtraBees:misc", 5), intArrayOf(10000), 300, VoltageLevels.LULV)
        Squeezer.addRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32415).percent(100.0f),
                arrayOf(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 8)), 20)
        FluidExtractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32415),
                ItemBracketHandler.getItem("ExtraBees:honeyDrop", 8),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(200), 32, 7, 1000)
        Squeezer.addRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32425).percent(100.0f),
                arrayOf(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 9)), 20)
        FluidExtractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32425),
                ItemBracketHandler.getItem("ExtraBees:honeyDrop", 9),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(200), 32, 7, 1000)
        Squeezer.addRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418).percent(100.0f),
                arrayOf(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 10)), 20)
        FluidExtractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418),
                ItemBracketHandler.getItem("ExtraBees:honeyDrop", 10),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(200), 32, 7, 1000)
        Squeezer.addRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32416).percent(100.0f),
                arrayOf(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 11)), 20)
        FluidExtractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32416),
                ItemBracketHandler.getItem("ExtraBees:honeyDrop", 11),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(200), 32, 7, 1000)
        Squeezer.addRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429).percent(100.0f),
                arrayOf(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 13)), 20)
        FluidExtractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32429),
                ItemBracketHandler.getItem("ExtraBees:honeyDrop", 13),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(200), 32, 7, 1000)
        Squeezer.addRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414).percent(100.0f),
                arrayOf(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 12)), 20)
        FluidExtractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32414),
                ItemBracketHandler.getItem("ExtraBees:honeyDrop", 12),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(200), 32, 7, 1000)
        Squeezer.addRecipe(LiquidBracketHandler.getLiquid("for.honey").withAmount(200),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417).percent(100.0f),
                arrayOf(ItemBracketHandler.getItem("ExtraBees:honeyDrop", 14)), 20)
        FluidExtractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32417),
                ItemBracketHandler.getItem("ExtraBees:honeyDrop", 14),
                LiquidBracketHandler.getLiquid("for.honey").withAmount(200), 32, 7, 1000)
        val array = intArrayOf(19, 20, 21, 22, 23, 24, 25)
        var n = 0
        while (array.size > n) {
            NEI.hide(ItemBracketHandler.getItem("ExtraBees:misc", 0).definition.makeStack(array[n]))
            ++n
        }
    }
}