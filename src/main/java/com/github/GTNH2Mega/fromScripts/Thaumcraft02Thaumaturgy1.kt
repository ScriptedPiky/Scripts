package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IItemStack
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandByte
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import modtweaker2.mods.thaumcraft.handlers.Warp
import stanhebben.zenscript.value.IAny
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Thaumcraft02Thaumaturgy1 : Runnable {
    override fun run() {
        Arcane.removeRecipe(ItemBracketHandler.getItem("thaumicbases:resource", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:WandCap", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Thaumcraft:WandCasting", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandCap", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandCap", OreDictionary.WILDCARD_VALUE))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 3))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 4))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 5))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 6))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 7))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 50))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 51))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 52))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 53))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 54))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 55))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 56))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:WandRod", 57))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusFire", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusFrost", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusShock", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusTrade", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusPouch", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 9))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 10))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 11))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 14))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 5))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusWarding", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:FocusHellbat", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemAmuletVis", 1))
        Infusion.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 8))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 2))
        Arcane.removeRecipe(ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 13))
        Research.clearPages("BASICTHAUMATURGY")
        Research.addPage("BASICTHAUMATURGY", "tc.research_page.BASICTHAUMATURGY.1")
        Research.addPage("BASICTHAUMATURGY", "tc.research_page.BASICTHAUMATURGY.2")
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Thaumcraft:WandCap", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                        OreBracketHandler.getOre("foilIron"), OreBracketHandler.getOre("screwIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilIron"), OreBracketHandler.getOre("ringIron"),
                                OreBracketHandler.getOre("foilIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwIron"),
                                OreBracketHandler.getOre("foilIron"), OreBracketHandler.getOre("screwIron"))), null)
        Research.addCraftingPage("BASICTHAUMATURGY", ItemBracketHandler.getItem("Thaumcraft:WandCap", 0))
        val recipes = MineTweakerAPI.recipes
        val item = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["aqua"] = ExpandInt.toData(0)
        hashMap["terra"] = ExpandInt.toData(0)
        hashMap["ignis"] = ExpandInt.toData(0)
        hashMap["ordo"] = ExpandInt.toData(0)
        hashMap["perditio"] = ExpandInt.toData(0)
        hashMap["aer"] = ExpandInt.toData(0)
        recipes.addShaped(item.withTag(ExpandAnyDict.asData(hashMap)),
                arrayOf(arrayOf(ItemBracketHandler.getItem("TwilightForest:item.nagaScale", 0),
                        OreBracketHandler.getOre("screwAluminium"),
                        ItemBracketHandler.getItem("Thaumcraft:WandCap", 0)),
                        arrayOf(OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("Forestry:oakStick", 0),
                                OreBracketHandler.getOre("screwAluminium")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandCap", 0),
                                OreBracketHandler.getOre("screwAluminium"),
                                ItemBracketHandler.getItem("TwilightForest:item.nagaScale", 0))), null)
        Research.addCraftingPage("BASICTHAUMATURGY", ItemBracketHandler.getItem("Thaumcraft:WandCasting", 0))
        Research.clearPages("CAP_copper")
        Research.addPage("CAP_copper", "tc.research_page.CAP_copper.1")
        Arcane.addShaped("CAP_copper", ItemBracketHandler.getItem("Thaumcraft:WandCap", 3), "ordo 15, ignis 15, aer 15",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("foilCopper"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilCopper"),
                                OreBracketHandler.getOre("ringCopper"), OreBracketHandler.getOre("foilCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("foilCopper"), OreBracketHandler.getOre("screwSteel"))))
        Research.addArcanePage("CAP_copper", ItemBracketHandler.getItem("Thaumcraft:WandCap", 3))
        Research.setAspects("CAP_copper", "instrumentum 3, metallum 6, permutatio 6")
        Research.setComplexity("CAP_copper", 1)
        Research.addPage("SCEPTRE", "tc.research_page.RESEARCH.1")
        val s = "CAP_copper"
        val item2 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 2)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["cap"] = ExpandString.asData("copper")
        hashMap2["rod"] = ExpandString.asData("wood")
        Research.addArcanePage(s, item2.withTag(ExpandAnyDict.asData(hashMap2)))
        Research.clearPages("CAP_gold")
        Research.addPage("CAP_gold", "tc.research_page.CAP_gold.1")
        Arcane.addShaped("CAP_gold", ItemBracketHandler.getItem("Thaumcraft:WandCap", 1), "ordo 20, ignis 20, aer 20",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwAluminium"),
                        OreBracketHandler.getOre("foilGold"), OreBracketHandler.getOre("screwAluminium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilGold"), OreBracketHandler.getOre("ringGold"),
                                OreBracketHandler.getOre("foilGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwAluminium"),
                                OreBracketHandler.getOre("foilGold"), OreBracketHandler.getOre("screwAluminium"))))
        Research.addArcanePage("CAP_gold", ItemBracketHandler.getItem("Thaumcraft:WandCap", 1))
        Research.setAspects("CAP_gold", "instrumentum 9, metallum 6, lucrum 3")
        Research.setComplexity("CAP_gold", 2)
        val s2 = "CAP_gold"
        val item3 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 3)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["cap"] = ExpandString.asData("gold")
        hashMap3["rod"] = ExpandString.asData("wood")
        Research.addArcanePage(s2, item3.withTag(ExpandAnyDict.asData(hashMap3)))
        Research.clearPages("CAP_silver")
        Research.addPage("CAP_silver", "tc.research_page.CAP_silver.1")
        Arcane.addShaped("CAP_silver", ItemBracketHandler.getItem("Thaumcraft:WandCap", 5), "ordo 25, ignis 25, aer 25",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                        OreBracketHandler.getOre("foilSilver"), OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilSilver"),
                                OreBracketHandler.getOre("ringSilver"), OreBracketHandler.getOre("foilSilver")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwStainlessSteel"),
                                OreBracketHandler.getOre("foilSilver"),
                                OreBracketHandler.getOre("screwStainlessSteel"))))
        Research.addArcanePage("CAP_silver", ItemBracketHandler.getItem("Thaumcraft:WandCap", 5))
        Infusion.addRecipe("CAP_silver", ItemBracketHandler.getItem("Thaumcraft:WandCap", 5),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2054),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2054),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2054)),
                "auram 18, potentia 30, praecantatio 18", ItemBracketHandler.getItem("Thaumcraft:WandCap", 4), 5)
        Research.addInfusionPage("CAP_silver", ItemBracketHandler.getItem("Thaumcraft:WandCap", 4))
        val s3 = "CAP_silver"
        val item4 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 4)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["cap"] = ExpandString.asData("silver")
        hashMap4["rod"] = ExpandString.asData("wood")
        Research.addArcanePage(s3, item4.withTag(ExpandAnyDict.asData(hashMap4)))
        Research.clearPages("CAP_thaumium")
        Research.addPage("CAP_thaumium", "tc.research_page.CAP_thaumium.1")
        Arcane.addShaped("CAP_thaumium", ItemBracketHandler.getItem("Thaumcraft:WandCap", 6),
                "ordo 30, ignis 30, aer 30", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwTitanium"),
                OreBracketHandler.getOre("foilThaumium"), OreBracketHandler.getOre("screwTitanium")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("foilThaumium"), OreBracketHandler.getOre("ringThaumium"),
                        OreBracketHandler.getOre("foilThaumium")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("screwTitanium"),
                        OreBracketHandler.getOre("foilThaumium"), OreBracketHandler.getOre("screwTitanium"))))
        Research.addArcanePage("CAP_thaumium", ItemBracketHandler.getItem("Thaumcraft:WandCap", 6))
        Infusion.addRecipe("CAP_thaumium", ItemBracketHandler.getItem("Thaumcraft:WandCap", 6),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330)),
                "auram 25, potentia 40, praecantatio 25", ItemBracketHandler.getItem("Thaumcraft:WandCap", 2), 5)
        Research.addInfusionPage("CAP_thaumium", ItemBracketHandler.getItem("Thaumcraft:WandCap", 2))
        Research.setAspects("CAP_thaumium", "instrumentum 6, auram 9, metallum 12, praecantatio 3")
        Research.setComplexity("CAP_thaumium", 3)
        val s4 = "CAP_thaumium"
        val item5 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 6)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["cap"] = ExpandString.asData("thaumium")
        hashMap5["rod"] = ExpandString.asData("wood")
        Research.addArcanePage(s4, item5.withTag(ExpandAnyDict.asData(hashMap5)))
        Research.clearPages("SCEPTRE")
        Research.addPage("SCEPTRE", "tc.research_page.SCEPTRE.1")
        val s5 = "SCEPTRE"
        val item6 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 1)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["cap"] = ExpandString.asData("iron")
        hashMap6["rod"] = ExpandString.asData("wood")
        hashMap6["sceptre"] = ExpandInt.toData(1)
        Research.addArcanePage(s5, item6.withTag(ExpandAnyDict.asData(hashMap6)))
        Research.setAspects("SCEPTRE", "instrumentum 12, fabrico 12, arbor 9, praecantatio 6, cognitio 3")
        Research.setComplexity("SCEPTRE", 3)
        val s6 = "SCEPTRE"
        val item7 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 9)
        val hashMap7 = HashMap<String, IData>()
        hashMap7["cap"] = ExpandString.asData("thaumium")
        hashMap7["rod"] = ExpandString.asData("wood")
        Research.addArcanePage(s6, item7.withTag(ExpandAnyDict.asData(hashMap7)))
        Research.clearPages("ROD_greatwood")
        Research.addPage("ROD_greatwood", "tc.research_page.ROD_greatwood.1")
        Arcane.addShaped("ROD_greatwood", ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                "aer 20, terra 20, ignis 20, aqua 20, ordo 20, perditio 20",
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0), null, null)))
        Research.addArcanePage("ROD_greatwood", ItemBracketHandler.getItem("Thaumcraft:WandRod", 0))
        Research.setAspects("ROD_greatwood", "instrumentum 9, praecantatio 6, arbor 3")
        Research.setComplexity("ROD_greatwood", 2)
        val s7 = "ROD_greatwood"
        val item8 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 9)
        val hashMap8 = HashMap<String, IData>()
        hashMap8["cap"] = ExpandString.asData("gold")
        hashMap8["rod"] = ExpandString.asData("greatwood")
        Research.addArcanePage(s7, item8.withTag(ExpandAnyDict.asData(hashMap8)))
        val s8 = "SCEPTRE"
        val item9 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 13)
        val hashMap9 = HashMap<String, IData>()
        hashMap9["cap"] = ExpandString.asData("gold")
        hashMap9["rod"] = ExpandString.asData("greatwood")
        hashMap9["sceptre"] = ExpandByte.asData(1.toByte())
        Research.addArcanePage(s8, item9.withTag(ExpandAnyDict.asData(hashMap9)))

        //TODO Replace ("TConstruct:trap.punji", 0)
        //Infusion.addRecipe("ROD_reed", ItemBracketHandler.getItem("TConstruct:trap.punji", 0),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
        //        "aer 24, motus 12, praecantatio 12, vitreus 6", ItemBracketHandler.getItem("Thaumcraft:WandRod", 5), 2)

        Research.setAspects("ROD_reed", "instrumentum 9, praecantatio 9, aer 6, herba 6, arbor 3")
        Research.setComplexity("ROD_reed", 2)
        val s9 = "ROD_reed"
        val item10 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 24)
        val hashMap10 = HashMap<String, IData>()
        hashMap10["cap"] = ExpandString.asData("silver")
        hashMap10["rod"] = ExpandString.asData("reed")
        Research.addArcanePage(s9, item10.withTag(ExpandAnyDict.asData(hashMap10)))
        val s10 = "SCEPTRE"
        val item11 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 45)
        val hashMap11 = HashMap<String, IData>()
        hashMap11["cap"] = ExpandString.asData("thaumium")
        hashMap11["rod"] = ExpandString.asData("reed")
        hashMap11["sceptre"] = ExpandByte.asData(1.toByte())
        Research.addArcanePage(s10, item11.withTag(ExpandAnyDict.asData(hashMap11)))
        Infusion.addRecipe("ROD_blaze", ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)),
                "bestia 12, ignis 24, praecantatio 12, vitreus 6", ItemBracketHandler.getItem("Thaumcraft:WandRod", 6),
                2)
        Research.setAspects("ROD_blaze", "instrumentum 9, praecantatio 9, aer 6, herba 6, arbor 3")
        Research.setComplexity("ROD_blaze", 2)
        val s11 = "ROD_blaze"
        val item12 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 24)
        val hashMap12 = HashMap<String, IData>()
        hashMap12["cap"] = ExpandString.asData("thaumium")
        hashMap12["rod"] = ExpandString.asData("blaze")
        Research.addArcanePage(s11, item12.withTag(ExpandAnyDict.asData(hashMap12)))
        Infusion.addRecipe("ROD_obsidian", ItemBracketHandler.getItem("RandomThings:ingredient", 1),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                " praecantatio 12, tenebrae 12, terra 24, vitreus 6",
                ItemBracketHandler.getItem("Thaumcraft:WandRod", 1), 2)
        Research.setAspects("ROD_obsidian", "instrumentum 9, praecantatio 9, ignis 6, potentia 6, arbor 3")
        Research.setComplexity("ROD_obsidian", 2)
        val s12 = "ROD_obsidian"
        val item13 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 36)
        val hashMap13 = HashMap<String, IData>()
        hashMap13["cap"] = ExpandString.asData("thaumium")
        hashMap13["rod"] = ExpandString.asData("obsidian")
        Research.addArcanePage(s12, item13.withTag(ExpandAnyDict.asData(hashMap13)))
        Infusion.addRecipe("ROD_ice", ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                " aqua 24, gelum 12, praecantatio 12, vitreus 6", ItemBracketHandler.getItem("Thaumcraft:WandRod", 3),
                2)
        Research.setAspects("ROD_ice", "instrumentum 9, praecantatio 9, aqua 6, gelum 6, arbor 3")
        Research.setComplexity("ROD_ice", 2)
        val s13 = "ROD_ice"
        val item14 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 36)
        val hashMap14 = HashMap<String, IData>()
        hashMap14["cap"] = ExpandString.asData("thaumium")
        hashMap14["rod"] = ExpandString.asData("ice")
        Research.addArcanePage(s13, item14.withTag(ExpandAnyDict.asData(hashMap14)))
        Infusion.addRecipe("ROD_quartz", ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzRod", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
                " ordo 24, praecantatio 12, potentia 12, vitreus 6",
                ItemBracketHandler.getItem("Thaumcraft:WandRod", 4), 2)
        Research.setAspects("ROD_quartz", "instrumentum 9, praecantatio 9, terra 6, ordo 6, arbor 3")
        Research.setComplexity("ROD_quartz", 2)
        val s14 = "ROD_quartz"
        val item15 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 36)
        val hashMap15 = HashMap<String, IData>()
        hashMap15["cap"] = ExpandString.asData("thaumium")
        hashMap15["rod"] = ExpandString.asData("quartz")
        Research.addArcanePage(s14, item15.withTag(ExpandAnyDict.asData(hashMap15)))

        //TODO Replace ("TConstruct:toolRod", 5)
        //Infusion.addRecipe("ROD_bone", ItemBracketHandler.getItem("TConstruct:toolRod", 5),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemShard", 6),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5)),
        //        " exanimis 12, perditio 24, praecantatio 12, vitreus 6",
        //        ItemBracketHandler.getItem("Thaumcraft:WandRod", 7), 3)

        Research.setAspects("ROD_bone", "instrumentum 9, praecantatio 9, exanimis 6, perditio 6, arbor 3")
        Research.setComplexity("ROD_bone", 2)
        Warp.addToResearch("ROD_bone", 1)
        val s15 = "ROD_bone"
        val item16 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 36)
        val hashMap16 = HashMap<String, IData>()
        hashMap16["cap"] = ExpandString.asData("thaumium")
        hashMap16["rod"] = ExpandString.asData("bone")
        Research.addArcanePage(s15, item16.withTag(ExpandAnyDict.asData(hashMap16)))
        Infusion.addRecipe("ROD_silverwood", ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                " aer 48, aqua 48, ignis 48, ordo 48, perditio 48, praecantatio 48, terra 48",
                ItemBracketHandler.getItem("Thaumcraft:WandRod", 2), 5)
        Research.setAspects("ROD_silverwood", "instrumentum 12, praecantatio 12, cognitio 9, herba 6, arbor 3")
        Research.setComplexity("ROD_silverwood", 3)
        val s16 = "ROD_silverwood"
        val item17 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 36)
        val hashMap17 = HashMap<String, IData>()
        hashMap17["cap"] = ExpandString.asData("thaumium")
        hashMap17["rod"] = ExpandString.asData("silverwood")
        Research.addArcanePage(s16, item17.withTag(ExpandAnyDict.asData(hashMap17)))
        Arcane.addShaped("ROD_greatwood_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 50),
                "aer 50, terra 50, ignis 50, aqua 50, ordo 50, perditio 50",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.setAspects("ROD_greatwood_staff", "instrumentum 12, praecantatio 12, arbor 9, ignis 6, aer 6, terra 3")
        Research.setComplexity("ROD_greatwood_staff", 3)
        val s17 = "ROD_greatwood_staff"
        val item18 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 48)
        val hashMap18 = HashMap<String, IData>()
        hashMap18["cap"] = ExpandString.asData("thaumium")
        hashMap18["rod"] = ExpandString.asData("greatwood_staff")
        Research.addArcanePage(s17, item18.withTag(ExpandAnyDict.asData(hashMap18)))
        Arcane.addShaped("ROD_reed_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 55),
                "aer 75, terra 75, ignis 75, aqua 75, ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 5),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 5),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.setAspects("ROD_reed_staff", "instrumentum 12, praecantatio 12, herba 9, aer 6, ignis 6, terra 3")
        Research.setComplexity("ROD_reed_staff", 3)
        val s18 = "ROD_reed_staff"
        val item19 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 42)
        val hashMap19 = HashMap<String, IData>()
        hashMap19["cap"] = ExpandString.asData("gold")
        hashMap19["rod"] = ExpandString.asData("reed_staff")
        Research.addArcanePage(s18, item19.withTag(ExpandAnyDict.asData(hashMap19)))
        Arcane.addShaped("ROD_blaze_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 56),
                "aer 75, terra 75, ignis 75, aqua 75, ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 6),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.setAspects("ROD_blaze_staff", "instrumentum 12, praecantatio 12, ignis 9, potentia 6, aer 6, terra 3")
        Research.setComplexity("ROD_blaze_staff", 3)
        val s19 = "ROD_blaze_staff"
        val item20 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 56)
        val hashMap20 = HashMap<String, IData>()
        hashMap20["cap"] = ExpandString.asData("silver")
        hashMap20["rod"] = ExpandString.asData("blaze_staff")
        Research.addArcanePage(s19, item20.withTag(ExpandAnyDict.asData(hashMap20)))
        Arcane.addShaped("ROD_obsidian_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 51),
                "aer 75, terra 75, ignis 75, aqua 75, ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 1),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 1),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.setAspects("ROD_obsidian_staff",
                "instrumentum 12, praecantatio 12, terra 9, ignis 6, aer 6, potentia 3")
        Research.setComplexity("ROD_obsidian_staff", 3)
        val s20 = "ROD_obsidian_staff"
        val item21 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 84)
        val hashMap21 = HashMap<String, IData>()
        hashMap21["cap"] = ExpandString.asData("thaumium")
        hashMap21["rod"] = ExpandString.asData("obsidian_staff")
        Research.addArcanePage(s20, item21.withTag(ExpandAnyDict.asData(hashMap21)))
        Arcane.addShaped("ROD_ice_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 53),
                "aer 75, terra 75, ignis 75, aqua 75, ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 3),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 3),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.setAspects("ROD_ice_staff", "instrumentum 12, praecantatio 12, gelum 9, aqua 6, aer 6, terra 3")
        Research.setComplexity("ROD_ice_staff", 3)
        Arcane.addShaped("ROD_quartz_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 54),
                "aer 75, terra 75, ignis 75, aqua 75, ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.setAspects("ROD_quartz_staff", "instrumentum 12, praecantatio 12, vitreus 9, ordo 6, aer 6, terra 3")
        Research.setComplexity("ROD_quartz_staff", 3)
        Arcane.addShaped("ROD_bone_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 57),
                "aer 75, terra 75, ignis 75, aqua 75, ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 7),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 7),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.setAspects("ROD_bone_staff",
                "instrumentum 12, praecantatio 12, exanimis 9, perditio 6, aer 6, terra 3")
        Research.setComplexity("ROD_bone_staff", 3)
        Warp.addToResearch("ROD_bone_staff", 3)
        Arcane.addShaped("ROD_silverwood_staff", ItemBracketHandler.getItem("Thaumcraft:WandRod", 52),
                "aer 125, terra 125, ignis 125, aqua 125, ordo 125, perditio 125",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:WandRod", 2),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Research.setAspects("ROD_silverwood_staff",
                "instrumentum 15, praecantatio 15, arbor 12, ordo 9, aer 6, terra 3")
        Research.setComplexity("ROD_silverwood_staff", 4)
        val s21 = "ROD_silverwood_staff"
        val item22 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 144)
        val hashMap22 = HashMap<String, IData>()
        hashMap22["cap"] = ExpandString.asData("thaumium")
        hashMap22["rod"] = ExpandString.asData("silverwood_staff")
        Research.addArcanePage(s21, item22.withTag(ExpandAnyDict.asData(hashMap22)))
        val s22 = "SCEPTRE"
        val item23 = ItemBracketHandler.getItem("Thaumcraft:WandCasting", 216)
        val hashMap23 = HashMap<String, IData>()
        hashMap23["cap"] = ExpandString.asData("thaumium")
        hashMap23["rod"] = ExpandString.asData("silverwood_staff")
        hashMap23["sceptre"] = ExpandByte.asData(1.toByte())
        Research.addArcanePage(s22, item23.withTag(ExpandAnyDict.asData(hashMap23)))
        Arcane.addShaped("FOCUSFIRE", ItemBracketHandler.getItem("Thaumcraft:FocusFire", 0),
                "ignis 20, perditio 20, ordo 20",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        OreBracketHandler.getOre("gemQuartz"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                                OreBracketHandler.getOre("lensRuby"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                                OreBracketHandler.getOre("gemQuartz"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1))))
        Research.setAspects("FOCUSFIRE", "ignis 6, praecantatio 6, motus 3")
        Research.setComplexity("FOCUSFIRE", 1)
        Arcane.addShaped("FOCUSEXCAVATION", ItemBracketHandler.getItem("Thaumcraft:FocusExcavation", 0),
                "terra 30, perditio 20, ordo 20",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        OreBracketHandler.getOre("gemQuartz"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                                OreBracketHandler.getOre("lensEmerald"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                                OreBracketHandler.getOre("gemQuartz"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3))))
        Research.setAspects("FOCUSEXCAVATION", "terra 9, praecantatio 9, perditio 6, motus 3")
        Research.setComplexity("FOCUSEXCAVATION", 2)
        Arcane.addShaped("FOCUSFROST", ItemBracketHandler.getItem("Thaumcraft:FocusFrost", 0),
                "aqua 30, perditio 20, ordo 20",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        OreBracketHandler.getOre("gemQuartz"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                                OreBracketHandler.getOre("lensDiamond"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                OreBracketHandler.getOre("gemQuartz"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2))))
        Research.setAspects("FOCUSFROST", "aqua 9, gelum 9, praecantatio 6, motus 3")
        Research.setComplexity("FOCUSFROST", 2)
        Arcane.addShaped("FOCUSSHOCK", ItemBracketHandler.getItem("Thaumcraft:FocusShock", 0),
                "aer 30, perditio 20, ordo 20",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        OreBracketHandler.getOre("gemQuartz"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("gemQuartz"),
                                OreBracketHandler.getOre("lensGarnetYellow"), OreBracketHandler.getOre("gemQuartz")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                                OreBracketHandler.getOre("gemQuartz"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0))))
        Research.setAspects("FOCUSSHOCK", "aer 9, praecantatio 6, potentia 9, motus 3")
        Research.setComplexity("FOCUSSHOCK", 2)
        Arcane.addShaped("FOCUSTRADE", ItemBracketHandler.getItem("Thaumcraft:FocusTrade", 0),
                "aer 20, terra 20, perditio 30, ordo 30",
                arrayOf(arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        OreBracketHandler.getOre("gemQuartz"),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                        arrayOf(OreBracketHandler.getOre("gemQuartz"),
                                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassLense", 0),
                                OreBracketHandler.getOre("gemQuartz")),
                        arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                                OreBracketHandler.getOre("gemQuartz"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6))))
        Research.setAspects("FOCUSTRADE", "permutatio 9, praecantatio 9, terra 6, motus 3")
        Research.setComplexity("FOCUSTRADE", 2)
        Infusion.addRecipe("FOCUSWARDING", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24506),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("minecraft:quartz", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("minecraft:quartz", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4)),
                "cognitio 15, ordo 25, terra 30, tutamen 25, praecantatio 10",
                ItemBracketHandler.getItem("Thaumcraft:FocusWarding", 0), 5)
        Research.setAspects("FOCUSWARDING", "terra 12, cognitio 12, ordo 9, tutamen 6, praecantatio 3")
        Research.setComplexity("FOCUSWARDING", 3)
        Infusion.addRecipe("FOCUSPORTABLEHOLE", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24532),
                arrayOf(ItemBracketHandler.getItem("minecraft:quartz", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("minecraft:quartz", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                "alienis 40, iter 30, perditio 20, permutatio 10, praecantatio 5",
                ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0), 6)
        Research.setAspects("FOCUSPORTABLEHOLE", "aer 12, iter 12, alienis 9, perditio 6, praecantatio 3")
        Research.setComplexity("FOCUSPORTABLEHOLE", 3)
        Warp.addToResearch("NODESTABILIZERADV", 1)
        Infusion.addRecipe("FOCUSHELLBAT", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24347),
                arrayOf(ItemBracketHandler.getItem("minecraft:quartz", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("minecraft:quartz", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0)),
                "aer 30, ignis 40, bestia 20, perditio 10, praecantatio 5",
                ItemBracketHandler.getItem("Thaumcraft:FocusHellbat", 0), 7)
        Research.setAspects("FOCUSHELLBAT", "praecantatio 12, iter 9, ignis 9, bestia 6, motus 3")
        Research.setComplexity("FOCUSHELLBAT", 3)
        Warp.addToResearch("NODESTABILIZERADV", 2)
        Warp.addToItem(ItemBracketHandler.getItem("Thaumcraft:FocusHellbat", 0), 2)

        //TODO Replace ("harvestcraft:hardenedleatherItem", 0)
        //Arcane.addShaped("FOCUSPOUCH", ItemBracketHandler.getItem("Thaumcraft:FocusPouch", 0),
        //        "terra 20, perditio 20, ordo 20",
        //        arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("boltGold"), OreBracketHandler.getOre("ringGold"),
        //                OreBracketHandler.getOre("boltGold")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                        ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 2),
        //                        ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
        //                        ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0))))
        //Research.setAspects("FOCUSPOUCH", "instrumentum 9, vacuos 9, praecantatio 6, pannus 3")
        //Research.setComplexity("FOCUSPOUCH", 2)

        Arcane.addShaped("NODESTABILIZER", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 9),
                "aqua 35, terra 35, ordo 25", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateThaumium"),
                OreBracketHandler.getOre("springGold"), OreBracketHandler.getOre("plateThaumium")),
                arrayOf(OreBracketHandler.getOre("blockQuartz"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32640),
                        OreBracketHandler.getOre("blockQuartz")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7))))
        Research.setAspects("NODESTABILIZER", "auram 9, potentia 9, praecantatio 6, ordo 3")
        Research.setComplexity("NODESTABILIZER", 2)
        Infusion.addRecipe("NODESTABILIZERADV", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 9),
                arrayOf(ItemBracketHandler.getItem("minecraft:redstone_block", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("minecraft:redstone_block", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("minecraft:glowstone", 0),
                        ItemBracketHandler.getItem("minecraft:redstone_block", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("minecraft:redstone_block", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("minecraft:glowstone", 0)),
                "auram 32, ordo 32, potentia 32, praecantatio 32",
                ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 10), 10)
        Research.setAspects("NODESTABILIZERADV", "auram 12, potentia 9, praecantatio 9, ordo 6, alienis 3")
        Research.setComplexity("NODESTABILIZERADV", 3)
        Warp.addToResearch("NODESTABILIZERADV", 2)
        Arcane.addShaped("VISPOWER", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 11),
                "ignis 32, aer 32, perditio 32, ordo 32", arrayOf(arrayOf(OreBracketHandler.getOre("blockRedstone"),
                ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26),
                OreBracketHandler.getOre("plateThaumium")), arrayOf(OreBracketHandler.getOre("plateThaumium"),
                ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 9),
                OreBracketHandler.getOre("plateThaumium")), arrayOf(OreBracketHandler.getOre("blockRedstone"),
                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1), OreBracketHandler.getOre("blockRedstone"))))
        Arcane.addShaped("VISPOWER", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 14), "ignis 10, ordo 10",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                        OreBracketHandler.getOre("lensDiamond"), OreBracketHandler.getOre("screwSteel")),
                        arrayOf(OreBracketHandler.getOre("ringThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                                OreBracketHandler.getOre("ringThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwSteel"),
                                OreBracketHandler.getOre("lensDiamond"), OreBracketHandler.getOre("screwSteel"))))
        Research.setAspects("VISPOWER", "auram 12, potentia 9, praecantatio 3, machina 6")
        Research.setComplexity("VISPOWER", 3)
        Infusion.addRecipe("WANDPED", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 1),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500)),
                "auram 10, permutatio 15, praecantatio 20, ordo 5",
                ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 5), 2)
        Research.setAspects("WANDPED", "auram 12, potentia 9, praecantatio 3, permutatio 6")
        Research.setComplexity("WANDPED", 3)
        Infusion.addRecipe("VISAMULET", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                "vacuos 48, auram 48, potentia 88, praecantatio 88, vitreus 24",
                ItemBracketHandler.getItem("Thaumcraft:ItemAmuletVis", 1), 7)
        Research.setAspects("VISAMULET", "vacuos 15, auram 15, praecantatio 9, potentia 12, vitreus 6, tempus 3")
        Research.setComplexity("VISAMULET", 4)
        Infusion.addRecipe("WANDPEDFOC",
                ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 26),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8)),
                "ordo 25, permutatio 25, praecantatio 30, potentia 15, cognitio 15",
                ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 8), 5)
        Research.setAspects("WANDPEDFOC",
                "instrumentum 15, auram 15, praecantatio 12, potentia 12, permutatio 9, cognitio 6, lucrum 3")
        Research.setComplexity("WANDPEDFOC", 4)
        Arcane.addShaped("VISCHARGERELAY", ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 2),
                "ignis 20, ordo 20, aer 20, terra 10", arrayOf(arrayOf(OreBracketHandler.getOre("screwThaumium"),
                ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 14),
                OreBracketHandler.getOre("screwThaumium")),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandRod", 2), OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 2)),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
                        OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("Thaumcraft:WandRod", 0))))
        Research.setAspects("VISCHARGERELAY", "potentia 12, praecantatio 12, machina 9, auram 9, ignis 6, aer 3")
        Research.setComplexity("VISCHARGERELAY", 3)
        Arcane.addShaped("FOCALMANIPULATION", ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 13),
                "ignis 64, ordo 64, aer 64, terra 64, aqua 64, perditio 64",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSlabStone", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7)),
                        arrayOf(OreBracketHandler.getOre("plateThaumium"),
                                ItemBracketHandler.getItem("Thaumcraft:blockTable", 0),
                                OreBracketHandler.getOre("plateThaumium"))))
        Research.setAspects("FOCALMANIPULATION",
                "potentia 15, praecantatio 12, instrumentum 12, vitreus 9, fabrico 9, alienis 3, cognitio 5")
        Research.setComplexity("FOCALMANIPULATION", 4)
        Research.setAspects("VAMPBAT",
                "fames 15, praecantatio 15, victus 12, exanimis 12, cognitio 9, ira 3, alienis 6")
        Research.setComplexity("VAMPBAT", 4)
        Warp.addToResearch("VAMPBAT", 4)
        Research.refreshResearchRecipe("CAP_copper")
        Research.refreshResearchRecipe("CAP_gold")
        Research.refreshResearchRecipe("CAP_silver")
        Research.refreshResearchRecipe("CAP_thaumium")
        Research.refreshResearchRecipe("ROD_silverwood")
        Research.refreshResearchRecipe("ROD_greatwood_staff")
        Research.refreshResearchRecipe("FOCUSFIRE")
        Research.refreshResearchRecipe("FOCUSEXCAVATION")
        Research.refreshResearchRecipe("FOCUSFROST")
        Research.refreshResearchRecipe("FOCUSSHOCK")
        Research.refreshResearchRecipe("FOCUSTRADE")
        Research.refreshResearchRecipe("FOCUSWARDING")
        Research.refreshResearchRecipe("FOCUSPORTABLEHOLE")
        Research.refreshResearchRecipe("FOCUSHELLBAT")
        Research.refreshResearchRecipe("FOCUSPOUCH")
        Research.refreshResearchRecipe("NODESTABILIZER")
        Research.refreshResearchRecipe("NODESTABILIZERADV")
        Research.refreshResearchRecipe("VISPOWER")
        Research.refreshResearchRecipe("WANDPED")
        Research.refreshResearchRecipe("VISAMULET")
        Research.refreshResearchRecipe("WANDPEDFOC")
        Research.refreshResearchRecipe("VISCHARGERELAY")
        Research.refreshResearchRecipe("FOCALMANIPULATION")
        Research.refreshResearchRecipe("VAMPBAT")
    }
}