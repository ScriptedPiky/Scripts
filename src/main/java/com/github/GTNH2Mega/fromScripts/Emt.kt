package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IItemStack
import minetweaker.expand.*
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.*
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class Emt : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:DiamondChainsaw", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:EMTItems", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:FeatherWing", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:EMTItems", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:EMTItems", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:EMTItems", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:EMTItems", 9))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("EMT:EMTItems", 8), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:EMTItems", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:EMTItems", 13))
        Arcane.removeRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 14))
        Arcane.removeRecipe(ItemBracketHandler.getItem("EMT:ThaumiumWing", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:NanosuitWing", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:QuantumWing", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("EMT:Omnitool", OreDictionary.WILDCARD_VALUE))
        Arcane.removeRecipe(ItemBracketHandler.getItem("EMT:DiamondOmnitool", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ThaumiumOmnitool", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ElectricBootsTraveller", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:NanoBootsTraveller", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:QuantumBootsTraveller", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ThaumiumDrill", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:DrillRockbreaker", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ThaumiumChainsaw", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ChainsawStream", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:EMTBaubles", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:EMTBaubles", 1))
        Arcane.removeRecipe(ItemBracketHandler.getItem("EMT:ElectricGogglesRevealing", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:NanosuitGogglesRevealing", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:QuantumGogglesRevealing", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:SolarHelmetRevealing", OreDictionary.WILDCARD_VALUE))
        Arcane.removeRecipe(ItemBracketHandler.getItem("EMT:EMTSolars", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:EMTSolars", OreDictionary.WILDCARD_VALUE))
        Crucible.removeRecipe(ItemBracketHandler.getItem("EMT:EMTSolars", OreDictionary.WILDCARD_VALUE))
        Crucible.removeRecipe(ItemBracketHandler.getItem("EMT:EMTSolars2", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ElectricHoeGrowth", OreDictionary.WILDCARD_VALUE))
        Arcane.removeRecipe(ItemBracketHandler.getItem("EMT:ElectricScribingTools", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:Mjolnir", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:SuperchargedMjolnir", OreDictionary.WILDCARD_VALUE))
        Arcane.removeRecipe(ItemBracketHandler.getItem("IC2:itemUran235small", 0))
        Crucible.removeRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 15))
        Infusion.removeRecipe(ItemBracketHandler.getItem("minecraft:coal", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("minecraft:glowstone", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("IC2:itemOreIridium", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("minecraft:gold_ingot", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("minecraft:diamond", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ShieldFocus", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("IC2:itemUran238", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("EMT:ShieldBlock", 0))
        Arcane.removeRecipe(ItemBracketHandler.getItem("EMT:ChristmasFocus", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:EnergyBallFocus", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ExplosionFocus", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:ChargingFocus", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:WandChargingFocus", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:EssentiaGenerators", OreDictionary.WILDCARD_VALUE))
        Crucible.removeRecipe(ItemBracketHandler.getItem("EMT:EssentiaGenerators", OreDictionary.WILDCARD_VALUE))
        Infusion.removeRecipe(ItemBracketHandler.getItem("EMT:EMTMachines", OreDictionary.WILDCARD_VALUE))

        //TODO Replace ("TConstruct:materials", 36)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("EMT:EMTItems", 8),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 36),
        //                ItemBracketHandler.getItem("TConstruct:materials", 36)), null)
        //MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:materials", 36).amount(2),
        //        arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTItems", 8)), null)

        Research.orphanResearch("Electric Magic Tools")
        Research.removeResearch("Electric Magic Tools")
        Research.addResearch("ElectricMagicTools", "EMT", "terra 0", 0, 0, 0,
                ItemBracketHandler.getItem("dreamcraft:item.EMT", 0))
        Research.setAutoUnlock("ElectricMagicTools", true)
        Research.setSpikey("ElectricMagicTools", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ElectricMagicTools", "Electric Magic Tools")
        MineTweakerAPI.game.setLocalization("tc.research_text.ElectricMagicTools",
                "Who says magic and technology can't go together?")
        MineTweakerAPI.game.setLocalization("tc.research_page.ElectricMagicTools",
                "Who says magic can't work with technology? Our researchers have collaborated with the top mages of the school of Thaumaturgy to bring you the effectiveness of magic coupled with the convenience of electric tools.")
        Research.addPage("ElectricMagicTools", "tc.research_page.ElectricMagicTools")
        Research.removeResearch("Diamond Chainsaw")
        val s = "DiamondChainsaw"
        val s2 = "EMT"
        val s3 = "lucrum 12, ignis 9, metallum 6, terra 3"
        val n = 0
        val n2 = -2
        val n3 = 2
        val item = ItemBracketHandler.getItem("EMT:DiamondChainsaw", 27)
        val hashMap = HashMap<String, IData>()
        hashMap["shearsMode"] = ExpandByte.asData(1.toByte())
        Research.addResearch(s, s2, s3, n, n2, n3, item.withTag(ExpandAnyDict.asData(hashMap)))
        Research.addPrereq("DiamondChainsaw", "ElectricMagicTools", false)
        Research.setRound("DiamondChainsaw", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.DiamondChainsaw", "Diamond Chainsaw")
        MineTweakerAPI.game.setLocalization("tc.research_text.DiamondChainsaw", "Harder, better, faster, stronger")
        Research.addPage("DiamondChainsaw", "tc.research_page.DiamondChainsaw")
        MineTweakerAPI.game.setLocalization("tc.research_page.DiamondChainsaw",
                "You are unsure why the thought of upgrading a Chainsaw with diamonds similarly to what you have done with a Drill has never occurred to you. This upgrade makes the Chainsaw capable of holding more energy and breaking blocks faster.")
        val s4 = "DiamondChainsaw"
        val item2 = ItemBracketHandler.getItem("EMT:DiamondChainsaw", 27)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["shearsMode"] = ExpandByte.asData(1.toByte())
        val withTag = item2.withTag(ExpandAnyDict.asData(hashMap2))
        val s5 = "aer 35, terra 35, ignis 35, aqua 35, ordo 35, perditio 35"
        val array = arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("screwDiamond"),
                OreBracketHandler.getOre("plateDiamond"), OreBracketHandler.getOre("screwDiamond")), null, null)
        val n4 = 1
        val array2 = arrayOf<IIngredient?>(OreBracketHandler.getOre("plateDiamond"), null, null)
        val n5 = 1
        val item3 = ItemBracketHandler.getItem("gregtech:gt.metatool.01", 112)
        val hashMap3 = HashMap<String, IData>()
        val s6 = "ench"
        val array3 = arrayOfNulls<IData>(2)
        val n6 = 0
        val hashMap4 = HashMap<String, IData>()
        hashMap4["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap4["id"] = ExpandShort.asNBT(35.toShort())
        array3[n6] = ExpandAnyDict.asData(hashMap4)
        val n7 = 1
        val hashMap5 = HashMap<String, IData>()
        hashMap5["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap5["id"] = ExpandShort.asNBT(21.toShort())
        array3[n7] = ExpandAnyDict.asData(hashMap5)
        hashMap3[s6] = ExpandAnyArray.asData(array3)
        val s7 = "GT.ToolStats"
        val hashMap6 = HashMap<String, IData>()
        hashMap6["PrimaryMaterial"] = ExpandString.asData("Thaumium")
        hashMap6["SpecialData"] = ExpandLong.asData(-1L)
        hashMap6["MaxDamage"] = ExpandLong.asData(51200L)
        hashMap6["Tier"] = ExpandLong.asData(2L)
        hashMap6["MaxCharge"] = ExpandLong.asData(400000L)
        hashMap6["Voltage"] = ExpandLong.asData(128L)
        hashMap6["Electric"] = ExpandByte.asData(1.toByte())
        hashMap6["SecondaryMaterial"] = ExpandString.asData("Titanium")
        hashMap3[s7] = ExpandAnyDict.asData(hashMap6)
        val s8 = "GT.CraftingComponents"
        val hashMap7 = HashMap<String, IData>()
        val s9 = "Ingredient.5"
        val hashMap8 = HashMap<String, IData>()
        hashMap8["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap8["Count"] = ExpandByte.asData(1.toByte())
        hashMap8["Damage"] = ExpandShort.asNBT(20028.toShort())
        hashMap7[s9] = ExpandAnyDict.asData(hashMap8)
        val s10 = "Ingredient.6"
        val hashMap9 = HashMap<String, IData>()
        hashMap9["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap9["Count"] = ExpandByte.asData(1.toByte())
        hashMap9["Damage"] = ExpandShort.asNBT(17028.toShort())
        hashMap7[s10] = ExpandAnyDict.asData(hashMap9)
        val s11 = "Ingredient.7"
        val hashMap10 = HashMap<String, IData>()
        hashMap10["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap10["Count"] = ExpandByte.asData(1.toByte())
        hashMap10["Damage"] = ExpandShort.asNBT(32528.toShort())
        hashMap7[s11] = ExpandAnyDict.asData(hashMap10)
        val s12 = "Ingredient.8"
        val hashMap11 = HashMap<String, IData>()
        hashMap11["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap11["Count"] = ExpandByte.asData(1.toByte())
        hashMap11["Damage"] = ExpandShort.asNBT(17028.toShort())
        hashMap7[s12] = ExpandAnyDict.asData(hashMap11)
        val s13 = "Ingredient.0"
        val hashMap12 = HashMap<String, IData>()
        hashMap12["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap12["Count"] = ExpandByte.asData(1.toByte())
        hashMap12["Damage"] = ExpandShort.asNBT(27028.toShort())
        hashMap7[s13] = ExpandAnyDict.asData(hashMap12)
        val s14 = "Ingredient.1"
        val hashMap13 = HashMap<String, IData>()
        hashMap13["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap13["Count"] = ExpandByte.asData(1.toByte())
        hashMap13["Damage"] = ExpandShort.asNBT(9330.toShort())
        hashMap7[s14] = ExpandAnyDict.asData(hashMap13)
        val s15 = "Ingredient.3"
        val hashMap14 = HashMap<String, IData>()
        hashMap14["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap14["Count"] = ExpandByte.asData(1.toByte())
        hashMap14["Damage"] = ExpandShort.asNBT(20028.toShort())
        hashMap7[s15] = ExpandAnyDict.asData(hashMap14)
        val s16 = "Ingredient.4"
        val hashMap15 = HashMap<String, IData>()
        hashMap15["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap15["Count"] = ExpandByte.asData(1.toByte())
        hashMap15["Damage"] = ExpandShort.asNBT(32601.toShort())
        hashMap7[s16] = ExpandAnyDict.asData(hashMap15)
        hashMap3[s8] = ExpandAnyDict.asData(hashMap7)
        hashMap3["GT.ItemCharge"] = ExpandLong.asData(400000L)
        array2[n5] = item3.withTag(ExpandAnyDict.asData(hashMap3))
        array2[2] = OreBracketHandler.getOre("plateDiamond")
        array[n4] = array2
        array[2] = arrayOf(OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("plateDiamond"),
                OreBracketHandler.getOre("craftingToolWrench"))
        Arcane.addShaped(s4, withTag, s5, array)
        val s17 = "DiamondChainsaw"
        val item4 = ItemBracketHandler.getItem("EMT:DiamondChainsaw", 27)
        val hashMap16 = HashMap<String, IData>()
        hashMap16["shearsMode"] = ExpandByte.asData(1.toByte())
        Research.addArcanePage(s17, item4.withTag(ExpandAnyDict.asData(hashMap16)))
        Research.removeResearch("Thaumium Plate")
        Research.addResearch("ThaumiumPlate", "EMT", "null", 6, -6, 0, ItemBracketHandler.getItem("EMT:EMTItems", 5))
        Research.setAutoUnlock("ThaumiumPlate", true)
        Research.setRound("ThaumiumPlate", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ThaumiumPlate", "Thaumium Plate")
        MineTweakerAPI.game.setLocalization("tc.research_text.ThaumiumPlate", "Thaumium, the industrial way")
        Research.addPage("ThaumiumPlate", "tc.research_page.ThaumiumPlate")
        MineTweakerAPI.game.setLocalization("tc.research_page.ThaumiumPlate",
                "As every electrical engineer knows, plates are the basis of many devices. We knew that pressing Thaumium into plates would be a neccesary step to facilitate integration of magic into our tools, but this made the mages of the school of Thaumaturgy very upset. The don't like us tampering with their precious metal. You can produce these plates as shown, which is a bit more expensive, or in a metal former, requiring only one Thaumium Ingot. Keep an eye out for angry mages.")
        Research.orphanResearch("Electric Cloud")
        Research.removeResearch("Electric Cloud")
        Research.addResearch("ElectricCloud", "EMT", "null", 5, -6, 0,
                ItemBracketHandler.getItem("EMT:electricCloud", 0))
        Research.setAutoUnlock("ElectricCloud", true)
        Research.setRound("ElectricCloud", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ElectricCloud", "Electric Cloud")
        MineTweakerAPI.game.setLocalization("tc.research_text.ElectricCloud", "Still the same Nitor")
        MineTweakerAPI.game.setLocalization("tc.research_page.ElectricCloud1",
                "All thaumaturges (except Crimson ones, I guess) enjoy the shine and heat of the magic flame called Nitor, aren't they? You desided to make it more... energetic. Well, you did it.<BR><BR>You have created a new kind of magic flame — the Electric Cloud. It behaves and looks like normal Nitor, but it has purple colour and creates light-purple lightning charges around itself. For electrolizing need to click RMB on Nitor with advanced battery(or better) on hand.")
        MineTweakerAPI.game.setLocalization("tc.research_page.ElectricCloud2",
                "<IMG>emt:textures/researches/electric_cloud.png:0:0:255:255:0.6</IMG>")
        Research.addPage("ElectricCloud", "tc.research_page.ElectricCloud1")
        Research.addPage("ElectricCloud", "tc.research_page.ElectricCloud2")
        Research.orphanResearch("Feather Wings")
        Research.removeResearch("Feather Wings")
        Research.addResearch("FeatherWings", "EMT", "aer 15, potentia 12, praecantatio 9, volatus 6, terra 3", 0, 2, 3,
                ItemBracketHandler.getItem("EMT:FeatherWing", 0))
        Research.addPrereq("FeatherWings", "ElectricMagicTools", false)
        Research.setRound("FeatherWings", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FeatherWings", "Feather Wings")
        MineTweakerAPI.game.setLocalization("tc.research_text.FeatherWings", "It only works in anime...")
        Research.addPage("FeatherWings", "tc.research_page.FeatherWings")
        MineTweakerAPI.game.setLocalization("tc.research_page.FeatherWings",
                "Duct-taping feathers to cardboard sheets, formed in the shape of wings sounded like a good idea. At least, you can thrust yourself in the air when the spacebar is hit. Not much, but it'll work. Using any wings underwater or during the rain sounds like a very bad idea. Included: fall damage reduction, 25%.")
        Arcane.addShaped("FeatherWings", ItemBracketHandler.getItem("EMT:EMTItems", 7), "aer 5, terra 5, ordo 5",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:feather", 0),
                        ItemBracketHandler.getItem("minecraft:feather", 0),
                        ItemBracketHandler.getItem("minecraft:feather", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:feather", 0),
                                ItemBracketHandler.getItem("EMT:EMTItems", 9),
                                ItemBracketHandler.getItem("minecraft:feather", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:feather", 0),
                                ItemBracketHandler.getItem("minecraft:feather", 0),
                                ItemBracketHandler.getItem("minecraft:feather", 0))))
        Research.addArcanePage("FeatherWings", ItemBracketHandler.getItem("EMT:EMTItems", 11))
        Arcane.addShaped("FeatherWings", ItemBracketHandler.getItem("EMT:EMTItems", 11), "aer 15, ordo 5",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 21879),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 21879), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("EMT:EMTItems", 8),
                                ItemBracketHandler.getItem("EMT:EMTItems", 8), null), arrayOfNulls(3)))
        Research.addArcanePage("FeatherWings", ItemBracketHandler.getItem("EMT:EMTItems", 11))
        Arcane.addShaped("FeatherWings", ItemBracketHandler.getItem("EMT:EMTItems", 12), "aer 10, ordo 10",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("EMT:EMTItems", 8), ItemBracketHandler.getItem("EMT:EMTItems", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTItems", 7),
                                ItemBracketHandler.getItem("minecraft:string", 0),
                                ItemBracketHandler.getItem("EMT:EMTItems", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTItems", 7),
                                ItemBracketHandler.getItem("EMT:EMTItems", 8),
                                ItemBracketHandler.getItem("EMT:EMTItems", 11))))
        Research.addArcanePage("FeatherWings", ItemBracketHandler.getItem("EMT:EMTItems", 12))
        Arcane.addShaped("FeatherWings", ItemBracketHandler.getItem("EMT:FeatherWing", 0),
                "aer 24, terra 24, ignis 24, aqua 24, ordo 24, perditio 24",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTItems", 12),
                        ItemBracketHandler.getItem("minecraft:string", 0),
                        ItemBracketHandler.getItem("EMT:EMTItems", 12)),
                        arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 12),
                                OreBracketHandler.getOre("plateAluminium"),
                                ItemBracketHandler.getItem("EMT:EMTItems", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTItems", 12),
                                ItemBracketHandler.getItem("minecraft:string", 0),
                                ItemBracketHandler.getItem("EMT:EMTItems", 12))))
        Research.addArcanePage("FeatherWings", ItemBracketHandler.getItem("EMT:FeatherWing", 0))
        Research.orphanResearch("Thaumium Reinforced Wings")
        Research.removeResearch("Thaumium Reinforced Wings")
        Research.addResearch("ThaumiumReinforcedWings", "EMT",
                "aer 21, potentia 18, praecantatio 15, volatus 12, metallum 9, vitium 6, machina 3", 0, 4, 3,
                ItemBracketHandler.getItem("EMT:ThaumiumWing", 0))
        Research.addPrereq("ThaumiumReinforcedWings", "FeatherWings", false)
        Research.setConcealed("ThaumiumReinforcedWings", true)
        Research.setRound("ThaumiumReinforcedWings", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ThaumiumReinforcedWings", "Thaumium Reinforced Wings")
        MineTweakerAPI.game.setLocalization("tc.research_text.ThaumiumReinforcedWings", "Already much better")
        Research.addPage("ThaumiumReinforcedWings", "tc.research_page.ThaumiumReinforcedWings")
        MineTweakerAPI.game.setLocalization("tc.research_page.ThaumiumReinforcedWings",
                "The magic infusing Thaumium is well known. Therefore, reinforcing your cardboard wings with Thaumium sounded like a good idea. You can thrust yourself much higher on spacebar hit, and slow your fall down when spacebar is held. Sneak to go down at a steady pace. Included: fall damage reduction, 50%.")
        Crucible.addRecipe("ThaumiumReinforcedWings", ItemBracketHandler.getItem("EMT:EMTItems", 13),
                ItemBracketHandler.getItem("minecraft:feather", 0), "vitium 6, lucrum 4, fames 4")
        Research.addCruciblePage("ThaumiumReinforcedWings", ItemBracketHandler.getItem("EMT:EMTItems", 13))
        Arcane.addShaped("ThaumiumReinforcedWings", ItemBracketHandler.getItem("EMT:EMTItems", 14),
                "aer 48, terra 48, ignis 48, aqua 48, ordo 48, perditio 48",
                arrayOf(arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 13),
                        OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateStainlessSteel")),
                        arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 13),
                                OreBracketHandler.getOre("wireFineCobalt"),
                                OreBracketHandler.getOre("plateStainlessSteel")),
                        arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 13),
                                OreBracketHandler.getOre("plateThaumium"),
                                OreBracketHandler.getOre("plateStainlessSteel"))))
        Research.addArcanePage("ThaumiumReinforcedWings", ItemBracketHandler.getItem("EMT:EMTItems", 14))
        Arcane.addShaped("ThaumiumReinforcedWings", ItemBracketHandler.getItem("EMT:ThaumiumWing", 0),
                "aer 48, terra 48, ignis 48, aqua 48, ordo 48, perditio 48",
                arrayOf(arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 14),
                        OreBracketHandler.getOre("wireFineCobalt"), ItemBracketHandler.getItem("EMT:EMTItems", 14)),
                        arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 14),
                                OreBracketHandler.getOre("wireFineCobalt"),
                                ItemBracketHandler.getItem("EMT:EMTItems", 14)), arrayOfNulls(3)))
        Research.addArcanePage("ThaumiumReinforcedWings", ItemBracketHandler.getItem("EMT:ThaumiumWing", 0))
        Warp.addToResearch("ThaumiumReinforcedWings", 1)
        Research.orphanResearch("Nanosuit Wings")
        Research.removeResearch("Nanosuit Wings")
        Research.addResearch("NanosuitWings", "EMT",
                "aer 24, potentia 21, praecantatio 18, volatus 15, metallum 12, vitium 9, machina 6, terra 3", 0, 6, 4,
                ItemBracketHandler.getItem("EMT:NanosuitWing", 0))
        Research.addPrereq("NanosuitWings", "ThaumiumReinforcedWings", false)
        Research.setConcealed("NanosuitWings", true)
        Research.setRound("NanosuitWings", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.NanosuitWings", "Nanosuit Wings")
        MineTweakerAPI.game.setLocalization("tc.research_text.NanosuitWings", "Nanotechnologies to the rescue!")
        Research.addPage("NanosuitWings", "tc.research_page.NanosuitWings")
        MineTweakerAPI.game.setLocalization("tc.research_page.NanosuitWings",
                "Combining the magic harnessed by Thaumium with the nanotechnologies in your wings.. seemed like the logical way to go. You can thrust yourself way higher than before, and fall even slower when holding spacebar. Included: fall damage reduction, 75%.")
        Infusion.addRecipe("NanosuitWings", ItemBracketHandler.getItem("EMT:ThaumiumWing", 0),
                arrayOf(ItemBracketHandler.getItem("IC2:itemArmorNanoChestplate", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19028),
                        ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19028),
                        ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19028),
                        ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19028),
                        ItemBracketHandler.getItem("IC2:itemPartCarbonPlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19028)),
                "aer 48, machina 48, potentia 32, volatus 32, praecantatio 16, vitium 8, terra 8",
                ItemBracketHandler.getItem("EMT:NanosuitWing", 27), 5)
        Research.addInfusionPage("NanosuitWings", ItemBracketHandler.getItem("EMT:NanosuitWing", 27))
        Warp.addToResearch("NanosuitWings", 2)
        Research.orphanResearch("Quantum Wings")
        Research.removeResearch("Quantum Wings")
        Research.addResearch("QuantumWings", "EMT",
                "aer 27, potentia 24, praecantatio 21, volatus 18, metallum 15, vitium 12, machina 9, terra 6, lucrum 3",
                0, 8, 4, ItemBracketHandler.getItem("EMT:QuantumWing", 0))
        Research.addPrereq("QuantumWings", "NanosuitWings", false)
        Research.setConcealed("QuantumWings", true)
        Research.setRound("QuantumWings", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.QuantumWings", "Quantum Wings")
        MineTweakerAPI.game.setLocalization("tc.research_text.QuantumWings", "Quantum technologies.")
        Research.addPage("QuantumWings", "tc.research_page.QuantumWings")
        MineTweakerAPI.game.setLocalization("tc.research_page.QuantumWings",
                "After exploring all the possibilities of nanotechnologies, you decided to do the last jump. Quantum. You can thrust yourself many blocks high, have a very good protection, and your fall is slowed down a lot. However, the quantum unpredictability happened once again. Your fall will be completely stopped when spacebar and sneak are maintained. You don't know why, but it works. Included: fall damage reduction, 100%.")
        Infusion.addRecipe("QuantumWings", ItemBracketHandler.getItem("EMT:NanosuitWing", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("IC2:itemArmorQuantumChestplate", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083)),
                "tutamen 64, aer 64, machina 64, potentia 48, volatus 48, praecantatio 32, vitium 16, terra 16",
                ItemBracketHandler.getItem("EMT:QuantumWing", 27), 10)
        Research.addInfusionPage("QuantumWings", ItemBracketHandler.getItem("EMT:QuantumWing", 27))
        Warp.addToResearch("QuantumWings", 3)
        Research.orphanResearch("Infused Quantum Armor")
        Research.removeResearch("Infused Quantum Armor")
        Research.addResearch("InfusedQuantumArmor", "EMT",
                "aer 30, potentia 27, praecantatio 24, volatus 21, metallum 18, vitium 15, machina 12, terra 9, lucrum 6, superbia 3",
                0, 10, 4, ItemBracketHandler.getItem("EMT:itemArmorQuantumChestplate", 0))
        Research.addPrereq("InfusedQuantumArmor", "QuantumWings", false)
        Research.setConcealed("InfusedQuantumArmor", true)
        Research.setRound("InfusedQuantumArmor", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.InfusedQuantumArmor", "Infused Quantum Сhestplate")
        MineTweakerAPI.game.setLocalization("tc.research_text.InfusedQuantumArmor", "The last step is here...")
        Research.addPage("InfusedQuantumArmor", "tc.research_page.InfusedQuantumArmor")
        MineTweakerAPI.game.setLocalization("tc.research_page.InfusedQuantumArmor",
                "You had been nothing to do and you decided to do something useful. You had an idea in your head of making armor which you can fasten the wings or backpack for being protected in flight. Take the wings or backpack in your hands and sit down to put their on armor. To remove them, hold Shift + Unequip (see in options).")
        Infusion.addRecipe("InfusedQuantumArmor", ItemBracketHandler.getItem("IC2:itemArmorQuantumChestplate", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19324),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19324),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19324),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19324)),
                "tutamen 72, aer 64, machina 64, potentia 48, volatus 48, praecantatio 32, vitium 16, terra 16, lucrum 8",
                ItemBracketHandler.getItem("EMT:itemArmorQuantumChestplate", 27), 15)
        Research.addInfusionPage("InfusedQuantumArmor",
                ItemBracketHandler.getItem("EMT:itemArmorQuantumChestplate", 27))
        Warp.addToResearch("InfusedQuantumArmor", 4)
        Research.orphanResearch("Iron Omnitool")
        Research.removeResearch("Iron Omnitool")
        Research.addResearch("IronOmnitool", "EMT", "potentia 12, instrumentum 9, perfodio 6, telum 3", -2, 0, 2,
                ItemBracketHandler.getItem("EMT:Omnitool", 0))
        Research.addPrereq("IronOmnitool", "ElectricMagicTools", false)
        Research.setRound("IronOmnitool", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.IronOmnitool", "Iron Omnitool")
        MineTweakerAPI.game.setLocalization("tc.research_text.IronOmnitool", "Changing tools is for peasants")
        Research.addPage("IronOmnitool", "tc.research_page.IronOmnitool")
        MineTweakerAPI.game.setLocalization("tc.research_page.IronOmnitool",
                "While tinkering with the inner workings of some of your tools to see if magical integration is a possibility, you have discovered a way to combine the Mining Drill and the Chainsaw, resulting in a tool capable of both mining, cutting down trees and attacking enemies! As you are working with mundane metals, magic influence is not needed to merge these tools together.")
        val s18 = "IronOmnitool"
        val item5 = ItemBracketHandler.getItem("EMT:Omnitool", 27)
        val s19 = "aer 15, terra 15, ignis 15, aqua 15, ordo 15, perditio 15"
        val array4: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n8 = 0
        val array5 = arrayOf<IIngredient?>(OreBracketHandler.getOre("screwIron"), null, null)
        val n9 = 1
        val item6 = ItemBracketHandler.getItem("gregtech:gt.metatool.01", 100)
        val hashMap17 = HashMap<String, IData>()
        val s20 = "ench"
        val array6 = arrayOf<IData?>(null)
        val n10 = 0
        val hashMap18 = HashMap<String, IData>()
        hashMap18["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap18["id"] = ExpandShort.asNBT(35.toShort())
        array6[n10] = ExpandAnyDict.asData(hashMap18)
        hashMap17[s20] = ExpandAnyArray.asData(array6)
        val s21 = "GT.ToolStats"
        val hashMap19 = HashMap<String, IData>()
        hashMap19["PrimaryMaterial"] = ExpandString.asData("Thaumium")
        hashMap19["SpecialData"] = ExpandLong.asData(-1L)
        hashMap19["MaxDamage"] = ExpandLong.asData(25600L)
        hashMap19["Tier"] = ExpandLong.asData(1L)
        hashMap19["MaxCharge"] = ExpandLong.asData(100000L)
        hashMap19["Voltage"] = ExpandLong.asData(32L)
        hashMap19["Electric"] = ExpandByte.asData(1.toByte())
        hashMap19["SecondaryMaterial"] = ExpandString.asData("StainlessSteel")
        hashMap17[s21] = ExpandAnyDict.asData(hashMap19)
        val s22 = "GT.CraftingComponents"
        val hashMap20 = HashMap<String, IData>()
        val s23 = "Ingredient.5"
        val hashMap21 = HashMap<String, IData>()
        hashMap21["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap21["Count"] = ExpandByte.asData(1.toByte())
        hashMap21["Damage"] = ExpandShort.asNBT(20306.toShort())
        hashMap20[s23] = ExpandAnyDict.asData(hashMap21)
        val s24 = "Ingredient.6"
        val hashMap22 = HashMap<String, IData>()
        hashMap22["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap22["Count"] = ExpandByte.asData(1.toByte())
        hashMap22["Damage"] = ExpandShort.asNBT(17306.toShort())
        hashMap20[s24] = ExpandAnyDict.asData(hashMap22)
        val s25 = "Ingredient.7"
        val hashMap23 = HashMap<String, IData>()
        hashMap23["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap23["Count"] = ExpandByte.asData(1.toByte())
        hashMap23["Damage"] = ExpandShort.asNBT(32518.toShort())
        hashMap20[s25] = ExpandAnyDict.asData(hashMap23)
        val s26 = "Ingredient.8"
        val hashMap24 = HashMap<String, IData>()
        hashMap24["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap24["Count"] = ExpandByte.asData(1.toByte())
        hashMap24["Damage"] = ExpandShort.asNBT(17306.toShort())
        hashMap20[s26] = ExpandAnyDict.asData(hashMap24)
        val s27 = "Ingredient.0"
        val hashMap25 = HashMap<String, IData>()
        hashMap25["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap25["Count"] = ExpandByte.asData(1.toByte())
        hashMap25["Damage"] = ExpandShort.asNBT(27306.toShort())
        hashMap20[s27] = ExpandAnyDict.asData(hashMap25)
        val s28 = "Ingredient.1"
        val hashMap26 = HashMap<String, IData>()
        hashMap26["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap26["Count"] = ExpandByte.asData(1.toByte())
        hashMap26["Damage"] = ExpandShort.asNBT(8330.toShort())
        hashMap20[s28] = ExpandAnyDict.asData(hashMap26)
        val s29 = "Ingredient.3"
        val hashMap27 = HashMap<String, IData>()
        hashMap27["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap27["Count"] = ExpandByte.asData(1.toByte())
        hashMap27["Damage"] = ExpandShort.asNBT(20306.toShort())
        hashMap20[s29] = ExpandAnyDict.asData(hashMap27)
        val s30 = "Ingredient.4"
        val hashMap28 = HashMap<String, IData>()
        hashMap28["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap28["Count"] = ExpandByte.asData(1.toByte())
        hashMap28["Damage"] = ExpandShort.asNBT(32600.toShort())
        hashMap20[s30] = ExpandAnyDict.asData(hashMap28)
        hashMap17[s22] = ExpandAnyDict.asData(hashMap20)
        hashMap17["GT.ItemCharge"] = ExpandLong.asData(100000L)
        array5[n9] = item6.withTag(ExpandAnyDict.asData(hashMap17))
        array5[2] = OreBracketHandler.getOre("screwIron")
        array4[n8] = array5
        array4[1] = arrayOf(OreBracketHandler.getOre("plateIron"), OreBracketHandler.getOre("plateIron"),
                OreBracketHandler.getOre("plateIron"))
        val n11 = 2
        val array7 = arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolHardHammer"), null, null)
        val n12 = 1
        val item7 = ItemBracketHandler.getItem("gregtech:gt.metatool.01", 110)
        val hashMap29 = HashMap<String, IData>()
        val s31 = "ench"
        val array8 = arrayOfNulls<IData>(2)
        val n13 = 0
        val hashMap30 = HashMap<String, IData>()
        hashMap30["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap30["id"] = ExpandShort.asNBT(35.toShort())
        array8[n13] = ExpandAnyDict.asData(hashMap30)
        val n14 = 1
        val hashMap31 = HashMap<String, IData>()
        hashMap31["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap31["id"] = ExpandShort.asNBT(21.toShort())
        array8[n14] = ExpandAnyDict.asData(hashMap31)
        hashMap29[s31] = ExpandAnyArray.asData(array8)
        val s32 = "GT.ToolStats"
        val hashMap32 = HashMap<String, IData>()
        hashMap32["PrimaryMaterial"] = ExpandString.asData("Thaumium")
        hashMap32["SpecialData"] = ExpandLong.asData(-1L)
        hashMap32["MaxDamage"] = ExpandLong.asData(25600L)
        hashMap32["Tier"] = ExpandLong.asData(1L)
        hashMap32["MaxCharge"] = ExpandLong.asData(100000L)
        hashMap32["Voltage"] = ExpandLong.asData(32L)
        hashMap32["Electric"] = ExpandByte.asData(1.toByte())
        hashMap32["SecondaryMaterial"] = ExpandString.asData("StainlessSteel")
        hashMap29[s32] = ExpandAnyDict.asData(hashMap32)
        val s33 = "GT.CraftingComponents"
        val hashMap33 = HashMap<String, IData>()
        val s34 = "Ingredient.5"
        val hashMap34 = HashMap<String, IData>()
        hashMap34["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap34["Count"] = ExpandByte.asData(1.toByte())
        hashMap34["Damage"] = ExpandShort.asNBT(20306.toShort())
        hashMap33[s34] = ExpandAnyDict.asData(hashMap34)
        val s35 = "Ingredient.6"
        val hashMap35 = HashMap<String, IData>()
        hashMap35["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap35["Count"] = ExpandByte.asData(1.toByte())
        hashMap35["Damage"] = ExpandShort.asNBT(17306.toShort())
        hashMap33[s35] = ExpandAnyDict.asData(hashMap35)
        val s36 = "Ingredient.7"
        val hashMap36 = HashMap<String, IData>()
        hashMap36["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap36["Count"] = ExpandByte.asData(1.toByte())
        hashMap36["Damage"] = ExpandShort.asNBT(32518.toShort())
        hashMap33[s36] = ExpandAnyDict.asData(hashMap36)
        val s37 = "Ingredient.8"
        val hashMap37 = HashMap<String, IData>()
        hashMap37["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap37["Count"] = ExpandByte.asData(1.toByte())
        hashMap37["Damage"] = ExpandShort.asNBT(17306.toShort())
        hashMap33[s37] = ExpandAnyDict.asData(hashMap37)
        val s38 = "Ingredient.0"
        val hashMap38 = HashMap<String, IData>()
        hashMap38["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap38["Count"] = ExpandByte.asData(1.toByte())
        hashMap38["Damage"] = ExpandShort.asNBT(27306.toShort())
        hashMap33[s38] = ExpandAnyDict.asData(hashMap38)
        val s39 = "Ingredient.1"
        val hashMap39 = HashMap<String, IData>()
        hashMap39["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap39["Count"] = ExpandByte.asData(1.toByte())
        hashMap39["Damage"] = ExpandShort.asNBT(9330.toShort())
        hashMap33[s39] = ExpandAnyDict.asData(hashMap39)
        val s40 = "Ingredient.3"
        val hashMap40 = HashMap<String, IData>()
        hashMap40["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap40["Count"] = ExpandByte.asData(1.toByte())
        hashMap40["Damage"] = ExpandShort.asNBT(20306.toShort())
        hashMap33[s40] = ExpandAnyDict.asData(hashMap40)
        val s41 = "Ingredient.4"
        val hashMap41 = HashMap<String, IData>()
        hashMap41["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap41["Count"] = ExpandByte.asData(1.toByte())
        hashMap41["Damage"] = ExpandShort.asNBT(32600.toShort())
        hashMap33[s41] = ExpandAnyDict.asData(hashMap41)
        hashMap29[s33] = ExpandAnyDict.asData(hashMap33)
        hashMap29["GT.ItemCharge"] = ExpandLong.asData(100000L)
        array7[n12] = item7.withTag(ExpandAnyDict.asData(hashMap29))
        array7[2] = OreBracketHandler.getOre("craftingToolWrench")
        array4[n11] = array7
        Arcane.addShaped(s18, item5, s19, array4)
        Research.addArcanePage("IronOmnitool", ItemBracketHandler.getItem("EMT:Omnitool", 27))
        Research.orphanResearch("Diamond Omnitool")
        Research.removeResearch("Diamond Omnitool")
        Research.addResearch("DiamondOmnitool", "EMT", "potentia 15, instrumentum 12, perfodio 9, telum 6, vitreus 3",
                -4, 0, 3, ItemBracketHandler.getItem("EMT:DiamondOmnitool", 0))
        Research.addPrereq("DiamondOmnitool", "IronOmnitool", false)
        Research.addPrereq("DiamondOmnitool", "DiamondChainsaw", true)
        Research.setConcealed("DiamondOmnitool", true)
        Research.setRound("DiamondOmnitool", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.DiamondOmnitool", "Diamond Omnitool")
        MineTweakerAPI.game.setLocalization("tc.research_text.DiamondOmnitool", "Jack of all trades")
        Research.addPage("DiamondOmnitool", "tc.research_page.DiamondOmnitool")
        MineTweakerAPI.game.setLocalization("tc.research_page.DiamondOmnitool",
                "Your discovery of an Iron Omnitool has driven you to try to accomplish the same with some more powerful devices. You have discovered a way to combine the Diamond Drill and the Diamond Chainsaw, resulting in a tool capable of both mining, cutting down trees and attacking enemies, while maintaining the speed and capacity bonuses of the diamond tools. As diamonds are incredibly tough and nearly impossible to reshape once the raw diamonds have been fashioned into tools such as drills and chainsaws, you will require a little bit of magic to coax them to merge.")
        val s42 = "DiamondOmnitool"
        val item8 = ItemBracketHandler.getItem("EMT:DiamondChainsaw", OreDictionary.WILDCARD_VALUE)
        val array9 = arrayOfNulls<IItemStack>(10)
        val n15 = 0
        val item9 = ItemBracketHandler.getItem("gregtech:gt.metatool.01", 102)
        val hashMap42 = HashMap<String, IData>()
        val s43 = "ench"
        val array10 = arrayOf<IData?>(null)
        val n16 = 0
        val hashMap43 = HashMap<String, IData>()
        hashMap43["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap43["id"] = ExpandShort.asNBT(35.toShort())
        array10[n16] = ExpandAnyDict.asData(hashMap43)
        hashMap42[s43] = ExpandAnyArray.asData(array10)
        val s44 = "GT.ToolStats"
        val hashMap44 = HashMap<String, IData>()
        hashMap44["PrimaryMaterial"] = ExpandString.asData("Thaumium")
        hashMap44["SpecialData"] = ExpandLong.asData(-1L)
        hashMap44["MaxDamage"] = ExpandLong.asData(51200L)
        hashMap44["Tier"] = ExpandLong.asData(2L)
        hashMap44["MaxCharge"] = ExpandLong.asData(400000L)
        hashMap44["Voltage"] = ExpandLong.asData(128L)
        hashMap44["Electric"] = ExpandByte.asData(1.toByte())
        hashMap44["SecondaryMaterial"] = ExpandString.asData("Titanium")
        hashMap42[s44] = ExpandAnyDict.asData(hashMap44)
        val s45 = "GT.CraftingComponents"
        val hashMap45 = HashMap<String, IData>()
        val s46 = "Ingredient.5"
        val hashMap46 = HashMap<String, IData>()
        hashMap46["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap46["Count"] = ExpandByte.asData(1.toByte())
        hashMap46["Damage"] = ExpandShort.asNBT(20028.toShort())
        hashMap45[s46] = ExpandAnyDict.asData(hashMap46)
        val s47 = "Ingredient.6"
        val hashMap47 = HashMap<String, IData>()
        hashMap47["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap47["Count"] = ExpandByte.asData(1.toByte())
        hashMap47["Damage"] = ExpandShort.asNBT(17028.toShort())
        hashMap45[s47] = ExpandAnyDict.asData(hashMap47)
        val s48 = "Ingredient.7"
        val hashMap48 = HashMap<String, IData>()
        hashMap48["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap48["Count"] = ExpandByte.asData(1.toByte())
        hashMap48["Damage"] = ExpandShort.asNBT(32528.toShort())
        hashMap45[s48] = ExpandAnyDict.asData(hashMap48)
        val s49 = "Ingredient.8"
        val hashMap49 = HashMap<String, IData>()
        hashMap49["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap49["Count"] = ExpandByte.asData(1.toByte())
        hashMap49["Damage"] = ExpandShort.asNBT(17028.toShort())
        hashMap45[s49] = ExpandAnyDict.asData(hashMap49)
        val s50 = "Ingredient.0"
        val hashMap50 = HashMap<String, IData>()
        hashMap50["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap50["Count"] = ExpandByte.asData(1.toByte())
        hashMap50["Damage"] = ExpandShort.asNBT(27028.toShort())
        hashMap45[s50] = ExpandAnyDict.asData(hashMap50)
        val s51 = "Ingredient.1"
        val hashMap51 = HashMap<String, IData>()
        hashMap51["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap51["Count"] = ExpandByte.asData(1.toByte())
        hashMap51["Damage"] = ExpandShort.asNBT(8330.toShort())
        hashMap45[s51] = ExpandAnyDict.asData(hashMap51)
        val s52 = "Ingredient.3"
        val hashMap52 = HashMap<String, IData>()
        hashMap52["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap52["Count"] = ExpandByte.asData(1.toByte())
        hashMap52["Damage"] = ExpandShort.asNBT(20028.toShort())
        hashMap45[s52] = ExpandAnyDict.asData(hashMap52)
        val s53 = "Ingredient.4"
        val hashMap53 = HashMap<String, IData>()
        hashMap53["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap53["Count"] = ExpandByte.asData(1.toByte())
        hashMap53["Damage"] = ExpandShort.asNBT(32601.toShort())
        hashMap45[s53] = ExpandAnyDict.asData(hashMap53)
        hashMap42[s45] = ExpandAnyDict.asData(hashMap45)
        hashMap42["GT.ItemCharge"] = ExpandLong.asData(400000L)
        array9[n15] = item9.withTag(ExpandAnyDict.asData(hashMap42))
        array9[1] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)
        array9[2] = ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0)
        array9[3] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)
        array9[4] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330)
        array9[5] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)
        array9[6] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330)
        array9[7] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)
        array9[8] = ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0)
        array9[9] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)
        Infusion.addRecipe(s42, item8, array9,
                "instrumentum 32, perfodio 24, potentia 24, metallum 16, telum 16, terra 8",
                ItemBracketHandler.getItem("EMT:DiamondOmnitool", 27), 6)
        Research.addInfusionPage("DiamondOmnitool", ItemBracketHandler.getItem("EMT:DiamondOmnitool", 27))
        Research.orphanResearch("Thaumium Omnitool")
        Research.removeResearch("Thaumium Omnitool")
        Research.addResearch("ThaumiumOmnitool", "EMT", "potentia 15, instrumentum 12, perfodio 9, telum 6, vitreus 3",
                -6, 0, 4, ItemBracketHandler.getItem("EMT:ThaumiumOmnitool", 0))
        Research.addPrereq("ThaumiumOmnitool", "DiamondOmnitool", false)
        Research.addPrereq("ThaumiumOmnitool", "ThaumiumChainsaw", true)
        Research.addPrereq("ThaumiumOmnitool", "ThaumiumDrill", true)
        Research.setConcealed("ThaumiumOmnitool", true)
        Research.setRound("ThaumiumOmnitool", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ThaumiumOmnitool", "Thaumium Omnitool")
        MineTweakerAPI.game.setLocalization("tc.research_text.ThaumiumOmnitool", "Mystical multitool")
        Research.addPage("ThaumiumOmnitool", "tc.research_page.ThaumiumOmnitool")
        MineTweakerAPI.game.setLocalization("tc.research_page.ThaumiumOmnitool",
                "After creating the Diamond and Iron Omnitools, the next logical step was to do the same with Thaumium. Unfortunately, this isn't as easy. You have discovered a way to combine the Thaumium Drill and the Thaumium Chainsaw, resulting in a tool capable of mining and chopping trees at great speed with a high energy capacity. These tools have already once been infused with magic. You are not sure what will happen if they were to be infused again.")
        Infusion.addRecipe("ThaumiumOmnitool", ItemBracketHandler.getItem("EMT:ThaumiumChainsaw", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("EMT:ThaumiumDrill", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316)),
                "instrumentum 48, perfodio 24, potentia 32, metallum 24, telum 16, terra 8, praecantatio 16",
                ItemBracketHandler.getItem("EMT:ThaumiumOmnitool", 27), 8)
        Research.addInfusionPage("ThaumiumOmnitool", ItemBracketHandler.getItem("EMT:ThaumiumOmnitool", 27))
        Warp.addToResearch("ThaumiumOmnitool", 1)
        Research.orphanResearch("Electric Boots of the Traveller")
        Research.removeResearch("Electric Boots of the Traveller")
        Research.addResearch("ElectricBootsoftheTraveller", "EMT",
                "praecantatio 15, motus 12, potentia 9, tutamen 6, terra 3", 2, 2, 3,
                ItemBracketHandler.getItem("EMT:ElectricBootsTraveller", 0))
        Research.addPrereq("ElectricBootsoftheTraveller", "BOOTSTRAVELLER", false)
        Research.addPrereq("ElectricBootsoftheTraveller", "ElectricMagicTools", true)
        Research.setConcealed("ElectricBootsoftheTraveller", true)
        Research.setRound("ElectricBootsoftheTraveller", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ElectricBootsoftheTraveller",
                "Electric Boots of the Traveller")
        MineTweakerAPI.game.setLocalization("tc.research_text.ElectricBootsoftheTraveller", "I've got the power")
        Research.addPage("ElectricBootsoftheTraveller", "tc.research_page.ElectricBootsoftheTraveller")
        MineTweakerAPI.game.setLocalization("tc.research_page.ElectricBootsoftheTraveller",
                "With lots of precise mechanical components and a touch of magic, you have recreated the effects of the Boots of the Traveller in a more stable form. These boots, unlike the original, will not wear away over time, but instead use EU. These boots negate all fall damage, and have all the normal properties of the Boots of the Traveller.")
        Infusion.addRecipe("ElectricBootsoftheTraveller", ItemBracketHandler.getItem("Thaumcraft:BootsTraveller", 0),
                arrayOf(ItemBracketHandler.getItem("IC2:itemStaticBoots", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1361),
                        ItemBracketHandler.getItem("IC2:itemAdvBat", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1361),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17500)),
                "motus 32, potentia 16, tutamen 32, praecantatio 8, volatus 8, iter 8",
                ItemBracketHandler.getItem("EMT:ElectricBootsTraveller", 27), 3)
        Research.addInfusionPage("ElectricBootsoftheTraveller",
                ItemBracketHandler.getItem("EMT:ElectricBootsTraveller", 27))
        Research.orphanResearch("Nano Boots of the Traveller")
        Research.removeResearch("Nano Boots of the Traveller")
        Research.addResearch("NanoBootsoftheTraveller", "EMT",
                "praecantatio 18, motus 15, potentia 12, tutamen 9, terra 6, volatus 3", 4, 2, 3,
                ItemBracketHandler.getItem("EMT:NanoBootsTraveller", 0))
        Research.addPrereq("NanoBootsoftheTraveller", "ElectricBootsoftheTraveller", false)
        Research.setConcealed("NanoBootsoftheTraveller", true)
        Research.setRound("NanoBootsoftheTraveller", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.NanoBootsoftheTraveller", "Nano Boots of the Traveller")
        MineTweakerAPI.game.setLocalization("tc.research_text.NanoBootsoftheTraveller", "Speed demon")
        Research.addPage("NanoBootsoftheTraveller", "tc.research_page.NanoBootsoftheTraveller")
        MineTweakerAPI.game.setLocalization("tc.research_page.NanoBootsoftheTraveller",
                "Your Electric Boots of the Traveller are nice, but you think you can do better. You have found a way to upgrade these boots to the Nano tier, improving the mechanical components and improving the spell cast on the footwear. These boots allow for higher jumps and faster running than before.")
        Infusion.addRecipe("NanoBootsoftheTraveller", ItemBracketHandler.getItem("EMT:ElectricBootsTraveller", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("IC2:itemArmorNanoBoots", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1442),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1442),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32602),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330)),
                "motus 48, potentia 24, tutamen 32, praecantatio 16, volatus 8, iter 16",
                ItemBracketHandler.getItem("EMT:NanoBootsTraveller", 27), 6)
        Research.addInfusionPage("NanoBootsoftheTraveller", ItemBracketHandler.getItem("EMT:NanoBootsTraveller", 27))
        Warp.addToResearch("NanoBootsoftheTraveller", 1)
        Research.orphanResearch("Quantum Boots of the Traveller")
        Research.removeResearch("Quantum Boots of the Traveller")
        Research.addResearch("QuantumBootsoftheTraveller", "EMT",
                "praecantatio 21, motus 18, potentia 15, tutamen 12, terra 9, volatus 6, auram 3", 6, 2, 4,
                ItemBracketHandler.getItem("EMT:QuantumBootsTraveller", 0))
        Research.addPrereq("QuantumBootsoftheTraveller", "NanoBootsoftheTraveller", false)
        Research.setConcealed("QuantumBootsoftheTraveller", true)
        Research.setRound("QuantumBootsoftheTraveller", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.QuantumBootsoftheTraveller",
                "Quantum Boots of the Traveller")
        MineTweakerAPI.game.setLocalization("tc.research_text.QuantumBootsoftheTraveller", "Faster than light")
        Research.addPage("QuantumBootsoftheTraveller", "tc.research_page.QuantumBootsoftheTraveller")
        MineTweakerAPI.game.setLocalization("tc.research_page.QuantumBootsoftheTraveller",
                "You have meddled with Quantum Physics, making these Quantum Boots of the Traveller so fast, that you appear to be in multiple places at once. But do not forget what happened to Schrodinger's cat...")
        Infusion.addRecipe("QuantumBootsoftheTraveller", ItemBracketHandler.getItem("EMT:NanoBootsTraveller", 0),
                arrayOf(ItemBracketHandler.getItem("IC2:itemArmorQuantumBoots", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1563),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1563),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "motus 64, potentia 32, tutamen 48, praecantatio 24, volatus 16, iter 24, aer 8",
                ItemBracketHandler.getItem("EMT:QuantumBootsTraveller", 27), 9)
        Research.addInfusionPage("QuantumBootsoftheTraveller",
                ItemBracketHandler.getItem("EMT:QuantumBootsTraveller", 27))
        Warp.addToResearch("QuantumBootsoftheTraveller", 2)
        Research.orphanResearch("Thaumium Drill")
        Research.removeResearch("Thaumium Drill")
        Research.addResearch("ThaumiumDrill", "EMT",
                "instrumentum 18, perfodio 15, potentia 12, lucrum 9, praecantatio 6, ignis 3", 2, 0, 3,
                ItemBracketHandler.getItem("EMT:ThaumiumDrill", 0))
        Research.addPrereq("ThaumiumDrill", "ElectricMagicTools", false)
        Research.setConcealed("ThaumiumDrill", true)
        Research.setRound("ThaumiumDrill", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ThaumiumDrill", "Thaumium Drill")
        MineTweakerAPI.game.setLocalization("tc.research_text.ThaumiumDrill", "Magical mining")
        Research.addPage("ThaumiumDrill", "tc.research_page.ThaumiumDrill")
        MineTweakerAPI.game.setLocalization("tc.research_page.ThaumiumDrill",
                "You have discovered a way to infuse Thaumium with mundane electricity. Fusing Thaumium to a Diamond Drill results in a tool that can dig through stone faster and has a higher capacity.<BR><BR>While Thaumium is a very useful and powerful material, it is nowhere near the strength of Iridium. It is considered a mid-tier tool. <BR><BR>This tool may not be the most powerful, but you have a feeling that you will be able to upgrade it in the near future.")
        val s54 = "ThaumiumDrill"
        val item10 = ItemBracketHandler.getItem("gregtech:gt.metatool.01", 102)
        val hashMap54 = HashMap<String, IData>()
        val s55 = "ench"
        val array11 = arrayOf<IData?>(null)
        val n17 = 0
        val hashMap55 = HashMap<String, IData>()
        hashMap55["lvl"] = ExpandShort.asNBT(2.toShort())
        hashMap55["id"] = ExpandShort.asNBT(35.toShort())
        array11[n17] = ExpandAnyDict.asData(hashMap55)
        hashMap54[s55] = ExpandAnyArray.asData(array11)
        val s56 = "GT.ToolStats"
        val hashMap56 = HashMap<String, IData>()
        hashMap56["PrimaryMaterial"] = ExpandString.asData("Thaumium")
        hashMap56["SpecialData"] = ExpandLong.asData(-1L)
        hashMap56["MaxDamage"] = ExpandLong.asData(51200L)
        hashMap56["Tier"] = ExpandLong.asData(2L)
        hashMap56["MaxCharge"] = ExpandLong.asData(400000L)
        hashMap56["Voltage"] = ExpandLong.asData(128L)
        hashMap56["Electric"] = ExpandByte.asData(1.toByte())
        hashMap56["SecondaryMaterial"] = ExpandString.asData("Titanium")
        hashMap54[s56] = ExpandAnyDict.asData(hashMap56)
        val s57 = "GT.CraftingComponents"
        val hashMap57 = HashMap<String, IData>()
        val s58 = "Ingredient.5"
        val hashMap58 = HashMap<String, IData>()
        hashMap58["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap58["Count"] = ExpandByte.asData(1.toByte())
        hashMap58["Damage"] = ExpandShort.asNBT(20028.toShort())
        hashMap57[s58] = ExpandAnyDict.asData(hashMap58)
        val s59 = "Ingredient.6"
        val hashMap59 = HashMap<String, IData>()
        hashMap59["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap59["Count"] = ExpandByte.asData(1.toByte())
        hashMap59["Damage"] = ExpandShort.asNBT(17028.toShort())
        hashMap57[s59] = ExpandAnyDict.asData(hashMap59)
        val s60 = "Ingredient.7"
        val hashMap60 = HashMap<String, IData>()
        hashMap60["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap60["Count"] = ExpandByte.asData(1.toByte())
        hashMap60["Damage"] = ExpandShort.asNBT(32528.toShort())
        hashMap57[s60] = ExpandAnyDict.asData(hashMap60)
        val s61 = "Ingredient.8"
        val hashMap61 = HashMap<String, IData>()
        hashMap61["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap61["Count"] = ExpandByte.asData(1.toByte())
        hashMap61["Damage"] = ExpandShort.asNBT(17028.toShort())
        hashMap57[s61] = ExpandAnyDict.asData(hashMap61)
        val s62 = "Ingredient.0"
        val hashMap62 = HashMap<String, IData>()
        hashMap62["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap62["Count"] = ExpandByte.asData(1.toByte())
        hashMap62["Damage"] = ExpandShort.asNBT(27028.toShort())
        hashMap57[s62] = ExpandAnyDict.asData(hashMap62)
        val s63 = "Ingredient.1"
        val hashMap63 = HashMap<String, IData>()
        hashMap63["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap63["Count"] = ExpandByte.asData(1.toByte())
        hashMap63["Damage"] = ExpandShort.asNBT(8330.toShort())
        hashMap57[s63] = ExpandAnyDict.asData(hashMap63)
        val s64 = "Ingredient.3"
        val hashMap64 = HashMap<String, IData>()
        hashMap64["id"] = ExpandShort.asNBT(7042.toShort())
        hashMap64["Count"] = ExpandByte.asData(1.toByte())
        hashMap64["Damage"] = ExpandShort.asNBT(20028.toShort())
        hashMap57[s64] = ExpandAnyDict.asData(hashMap64)
        val s65 = "Ingredient.4"
        val hashMap65 = HashMap<String, IData>()
        hashMap65["id"] = ExpandShort.asNBT(7041.toShort())
        hashMap65["Count"] = ExpandByte.asData(1.toByte())
        hashMap65["Damage"] = ExpandShort.asNBT(32601.toShort())
        hashMap57[s65] = ExpandAnyDict.asData(hashMap65)
        hashMap54[s57] = ExpandAnyDict.asData(hashMap57)
        hashMap54["GT.ItemCharge"] = ExpandLong.asData(400000L)
        Infusion.addRecipe(s54, item10.withTag(ExpandAnyDict.asData(hashMap54)),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316)),
                "instrumentum 32, perfodio 16, potentia 32, lucrum 24, praecantatio 8",
                ItemBracketHandler.getItem("EMT:ThaumiumDrill", 27), 7)
        Research.addInfusionPage("ThaumiumDrill", ItemBracketHandler.getItem("EMT:ThaumiumDrill", 27))
        Warp.addToResearch("ThaumiumDrill", 1)
        Research.orphanResearch("Drill of the Rockbreaker")
        Research.removeResearch("Drill of the Rockbreaker")
        Research.addResearch("DrilloftheRockbreaker", "EMT",
                "instrumentum 21, perfodio 18, potentia 15, lucrum 12, praecantatio 9, ignis 6, terra 3", 4, 0, 4,
                ItemBracketHandler.getItem("EMT:DrillRockbreaker", 0))
        Research.addPrereq("DrilloftheRockbreaker", "ThaumiumDrill", false)
        Research.setConcealed("DrilloftheRockbreaker", true)
        Research.setRound("DrilloftheRockbreaker", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.DrilloftheRockbreaker", "Drill of the Rockbreaker")
        MineTweakerAPI.game.setLocalization("tc.research_text.DrilloftheRockbreaker", "Mining it big")
        Research.addPage("DrilloftheRockbreaker", "tc.research_page.DrilloftheRockbreaker")
        MineTweakerAPI.game.setLocalization("tc.research_page.DrilloftheRockbreaker",
                "After studying the Pickaxe of the Core, the Shovel of the Earthmover and the Thaumium Drill, you have managed to combine most of their abilities, resulting in an electric tool that can mine a whole 3x3x1 area of pickaxe and dirt materials very quickly.<BR><BR>This marvelous device is able to find the closest ore clusters on a shift-right click, though at the cost of some EU.")
        Infusion.addRecipe("DrilloftheRockbreaker", ItemBracketHandler.getItem("EMT:ThaumiumDrill", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706),
                        ItemBracketHandler.getItem("IC2:upgradeModule", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("IC2:upgradeModule", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0)),
                "instrumentum 48, perfodio 24, potentia 48, lucrum 32, praecantatio 16, ignis 8",
                ItemBracketHandler.getItem("EMT:DrillRockbreaker", 27), 10)
        Research.addInfusionPage("DrilloftheRockbreaker", ItemBracketHandler.getItem("EMT:DrillRockbreaker", 27))
        Warp.addToResearch("DrilloftheRockbreaker", 2)
        Research.orphanResearch("Thaumium Chainsaw")
        Research.removeResearch("Thaumium Chainsaw")
        Research.addResearch("ThaumiumChainsaw", "EMT",
                "instrumentum 18, telum 15, potentia 12, lucrum 9, praecantatio 6, aer 3", 0, -4, 3,
                ItemBracketHandler.getItem("EMT:ThaumiumChainsaw", 0))
        Research.addPrereq("ThaumiumChainsaw", "DiamondChainsaw", false)
        Research.setConcealed("ThaumiumChainsaw", true)
        Research.setRound("ThaumiumChainsaw", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ThaumiumChainsaw", "Thaumium Chainsaw")
        MineTweakerAPI.game.setLocalization("tc.research_text.ThaumiumChainsaw",
                "Felling trees and severing heads with a touch of magic.")
        Research.addPage("ThaumiumChainsaw", "tc.research_page.ThaumiumChainsaw")
        MineTweakerAPI.game.setLocalization("tc.research_page.ThaumiumChainsaw",
                "You have found a way to fuse Thaumium to a Diamond Chainsaw, allowing it to fell trees quicker and hold more power. Nevertheless, these ameliorations do not come without drawbacks: during the process of fusing these materials, the chainsaw loses its ability to shear foliage, tall grass, and animals.<BR><BR>You have an intuition you will be able to upgrade this tool in the near future.")
        Infusion.addRecipe("ThaumiumChainsaw", ItemBracketHandler.getItem("EMT:DiamondChainsaw", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17316)),
                "instrumentum 32, telum 24, potentia 24, lucrum 16, praecantatio 8",
                ItemBracketHandler.getItem("EMT:ThaumiumChainsaw", 27), 7)
        Research.addInfusionPage("ThaumiumChainsaw", ItemBracketHandler.getItem("EMT:ThaumiumChainsaw", 27))
        Warp.addToResearch("ThaumiumChainsaw", 1)
        Research.orphanResearch("Chainsaw of the Stream")
        Research.removeResearch("Chainsaw of the Stream")
        Research.addResearch("ChainsawoftheStream", "EMT",
                "instrumentum 21 telum 18, potentia 15, lucrum 12, praecantatio 9, aer 6, arbor 3", 0, -6, 4,
                ItemBracketHandler.getItem("EMT:ChainsawStream", 0))
        Research.addPrereq("ChainsawoftheStream", "ThaumiumChainsaw", false)
        Research.setConcealed("ChainsawoftheStream", true)
        Research.setRound("ChainsawoftheStream", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ChainsawoftheStream", "Chainsaw of the Stream")
        MineTweakerAPI.game.setLocalization("tc.research_text.ChainsawoftheStream", "Felling trees in a single swoop")
        Research.addPage("ChainsawoftheStream", "tc.research_page.ChainsawoftheStream")
        MineTweakerAPI.game.setLocalization("tc.research_page.ChainsawoftheStream",
                "After studying both the Axe of the Stream and the Thaumium Chainsaw, you managed to combine most of their abilities, resulting in an electric tool that can chop down whole trees without much effort.")
        Infusion.addRecipe("ChainsawoftheStream", ItemBracketHandler.getItem("EMT:ThaumiumChainsaw", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706),
                        ItemBracketHandler.getItem("IC2:upgradeModule", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("Railcraft:tool.steel.shears", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("IC2:upgradeModule", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0)),
                "instrumentum 48, telum 32, potentia 32, lucrum 24, praecantatio 16, aer 8",
                ItemBracketHandler.getItem("EMT:ChainsawStream", 27), 10)
        Research.addInfusionPage("ChainsawoftheStream", ItemBracketHandler.getItem("EMT:ChainsawStream", 27))
        Warp.addToResearch("ChainsawoftheStream", 2)
        Research.orphanResearch("Inventory Charging Ring")
        Research.removeResearch("Inventory Charging Ring")
        Research.addResearch("InventoryChargingRing", "EMT",
                "potentia 15, vitreus 12, praecantatio 9, electrum 6, auram 3", 0, -8, 3,
                ItemBracketHandler.getItem("EMT:EMTBaubles", 1))
        Research.addPrereq("InventoryChargingRing", "ElectricMagicTools", true)
        Research.setConcealed("InventoryChargingRing", true)
        Research.setRound("InventoryChargingRing", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.InventoryChargingRing", "Inventory Charging Ring")
        MineTweakerAPI.game.setLocalization("tc.research_text.InventoryChargingRing", "Passive charger")
        Research.addPage("InventoryChargingRing", "tc.research_page.InventoryChargingRing")
        MineTweakerAPI.game.setLocalization("tc.research_page.InventoryChargingRing",
                "While other thaumaturgists use rings to charge their runic shields, you feel that there are better applications for them.  By fusing power sources into a mundane ring, you have learned how to funnel its charging effects into electric items in your inventory instead. It doesn't generate much at only 32 EU per tick, but that just means there's room for improvement.")
        Infusion.addRecipe("InventoryChargingRing", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1),
                arrayOf(ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("IC2:blockGenerator", 5),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1462),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1120),
                        ItemBracketHandler.getItem("IC2:blockKineticGenerator", 4),
                        ItemBracketHandler.getItem("IC2:itemStaticBoots", 0),
                        ItemBracketHandler.getItem("IC2:blockKineticGenerator", 0),
                        ItemBracketHandler.getItem("IC2:blockHeatGenerator", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1462),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32751)),
                "potentia 64, vitreus 32, praecantatio 48, electrum 16, auram 8",
                ItemBracketHandler.getItem("EMT:EMTBaubles", 1), 7)
        Research.addInfusionPage("InventoryChargingRing", ItemBracketHandler.getItem("EMT:EMTBaubles", 1))
        Warp.addToResearch("InventoryChargingRing", 2)
        Research.orphanResearch("Armor Charging Ring")
        Research.removeResearch("Armor Charging Ring")
        Research.addResearch("ArmorChargingRing", "EMT", "potentia 15, tutamen 12, praecantatio 9, electrum 6, auram 3",
                0, -10, 3, ItemBracketHandler.getItem("EMT:EMTBaubles", 0))
        Research.addPrereq("ArmorChargingRing", "InventoryChargingRing", false)
        Research.setConcealed("ArmorChargingRing", true)
        Research.setRound("ArmorChargingRing", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ArmorChargingRing", "Armor Charging Ring")
        MineTweakerAPI.game.setLocalization("tc.research_text.ArmorChargingRing", "Passive life-saver")
        Research.addPage("ArmorChargingRing", "tc.research_page.ArmorChargingRing")
        MineTweakerAPI.game.setLocalization("tc.research_page.ArmorChargingRing",
                "You have found the low but constant recharge rate of your new ring to be more useful than anticipated, but it would be nice if it charged your armor when there wasn't a tool in need of power.  By infusing a few more power sources and a piece of armor, you have found a way to have it do just that.  Sadly, the new power sources do not increase the recharge rate, but progress is progress.")
        Infusion.addRecipe("ArmorChargingRing", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1),
                arrayOf(ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("IC2:blockGenerator", 5),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1482),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1120),
                        ItemBracketHandler.getItem("IC2:blockKineticGenerator", 4),
                        ItemBracketHandler.getItem("IC2:itemStaticBoots", 0),
                        ItemBracketHandler.getItem("IC2:blockKineticGenerator", 0),
                        ItemBracketHandler.getItem("IC2:blockHeatGenerator", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1482),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32751)),
                "potentia 64, tutamen 32, praecantatio 48, electrum 16, auram 8",
                ItemBracketHandler.getItem("EMT:EMTBaubles", 0), 8)
        Research.addInfusionPage("ArmorChargingRing", ItemBracketHandler.getItem("EMT:EMTBaubles", 0))
        Warp.addToResearch("ArmorChargingRing", 2)
        Research.orphanResearch("Electric Goggles")
        Research.removeResearch("Electric Goggles")
        Research.orphanResearch("Nanosuit Goggles of Revealing")
        Research.removeResearch("Nanosuit Goggles of Revealing")
        Research.orphanResearch("Quantum Goggles of Revealing")
        Research.removeResearch("Quantum Goggles of Revealing")
        Research.addResearch("ElectricGogglesofRevealing", "EMT",
                "tutamen 15, potentia 12, sensus 9, praecantatio 6, electrum 3", -6, -2, 3,
                ItemBracketHandler.getItem("EMT:ElectricGogglesRevealing", 0))
        Research.addPrereq("ElectricGogglesofRevealing", "GOGGLES", false)
        Research.setConcealed("ElectricGogglesofRevealing", true)
        Research.addPrereq("ElectricGogglesofRevealing", "ElectricMagicTools", true)
        Research.setRound("ElectricGogglesofRevealing", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ElectricGogglesofRevealing",
                "Electric Goggles of Revealing")
        MineTweakerAPI.game.setLocalization("tc.research_text.ElectricGogglesofRevealing", "The best of both worlds")
        Research.addPage("ElectricGogglesofRevealing", "tc.research_page.ElectricGogglesofRevealing")
        MineTweakerAPI.game.setLocalization("tc.research_page.ElectricGogglesofRevealing",
                "You have found a way to detect auras using purely electronic means, no longer requiring mystical energy that can be depleted over time. You can now create a pair of Goggles of Revealing that can be recharged with EU while being able to see Aura Nodes just as you could before. A diamond helmet is required to house the sensitive vis sensing circuitry and prevent it from being damaged, which also has the added benefit of providing extra protection.")
        Arcane.addShaped("ElectricGogglesofRevealing", ItemBracketHandler.getItem("EMT:ElectricGogglesRevealing", 165),
                "aer 45, ignis 45, terra 45, aqua 45, ordo 45, perditio 45",
                arrayOf(arrayOf(OreBracketHandler.getOre("wireGt02AnyCopper"),
                        ItemBracketHandler.getItem("minecraft:diamond_helmet", 0),
                        OreBracketHandler.getOre("wireGt02AnyCopper")),
                        arrayOf(OreBracketHandler.getOre("circuitBasic"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemGoggles", 0),
                                OreBracketHandler.getOre("circuitBasic")), arrayOf<IIngredient>(
                        ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 10),
                        ItemBracketHandler.getItem("IC2:itemAdvBat", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("ProjRed|Integration:projectred.integration.gate", 10))))
        Research.addArcanePage("ElectricGogglesofRevealing",
                ItemBracketHandler.getItem("EMT:ElectricGogglesRevealing", 165))
        Research.addResearch("NanosuitGogglesofRevealing", "EMT",
                "tutamen 18, potentia 15, sensus 12, praecantatio 9, auram 6, electrum 3", -4, -2, 3,
                ItemBracketHandler.getItem("EMT:NanosuitGogglesRevealing", 0))
        Research.addPrereq("NanosuitGogglesofRevealing", "ElectricGogglesofRevealing", false)
        Research.setConcealed("NanosuitGogglesofRevealing", true)
        Research.setRound("NanosuitGogglesofRevealing", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.NanosuitGogglesofRevealing",
                "Nanosuit Goggles of Revealing")
        MineTweakerAPI.game.setLocalization("tc.research_text.NanosuitGogglesofRevealing", "Top-tier eye protection")
        Research.addPage("NanosuitGogglesofRevealing", "tc.research_page.NanosuitGogglesofRevealing")
        MineTweakerAPI.game.setLocalization("tc.research_page.NanosuitGogglesofRevealing",
                "You have discovered a way to incorporate your previous vis sensors to a Nanosuit Helmet without moving too much around. By infusing the nano helmet with magic, you will be able to use it to see Aura Nodes. During the magical process, the control circuits for the night vision feature are replaced with capacitors to absorb the excess magical energy and vis-sensing microchips. This will prevent you from turning off the night vision effect of the helmet.")
        Infusion.addRecipe("NanosuitGogglesofRevealing",
                ItemBracketHandler.getItem("EMT:ElectricGogglesRevealing", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("IC2:itemArmorNanoHelmet", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1442),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32692),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32692),
                        ItemBracketHandler.getItem("IC2:itemPartCircuitAdv", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1442)),
                "tutamen 32, potentia 32, sensus 24, praecantatio 16, auram 8, electrum 8",
                ItemBracketHandler.getItem("EMT:NanosuitGogglesRevealing", 27), 6)
        Research.addInfusionPage("NanosuitGogglesofRevealing",
                ItemBracketHandler.getItem("EMT:NanosuitGogglesRevealing", 27))
        Warp.addToResearch("NanosuitGogglesofRevealing", 1)
        Research.addResearch("QuantumGogglesofRevealing", "EMT",
                "tutamen 21, potentia 18, sensus 15, praecantatio 12, auram 9, lucrum 6, electrum 3", -2, -2, 4,
                ItemBracketHandler.getItem("EMT:QuantumGogglesRevealing", 0))
        Research.addPrereq("QuantumGogglesofRevealing", "NanosuitGogglesofRevealing", false)
        Research.setConcealed("QuantumGogglesofRevealing", true)
        Research.setRound("QuantumGogglesofRevealing", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.QuantumGogglesofRevealing",
                "Quantum Goggles of Revealing")
        MineTweakerAPI.game.setLocalization("tc.research_text.QuantumGogglesofRevealing",
                "Protection coupled with utility")
        Research.addPage("QuantumGogglesofRevealing", "tc.research_page.QuantumGogglesofRevealing")
        MineTweakerAPI.game.setLocalization("tc.research_page.QuantumGogglesofRevealing",
                "It took a lot of trial and error, but you have found a way to slip in vis detection sensors to a Quantum Helmet. By infusing the quantum helmet with magic, you will be able to use it to see Aura Nodes. During the design process, you had to replace several control circuits that involve night vision and automatic feeding with vis detecting circuitry and capacitors to absorb the excess magical energy. You find that using a Mining Laser to contain it can safely focus and direct the explosive pulse where the vision effect and the feeding unit of the helmet lie. Have fun getting force-fed energy. This will prevent you from turning off the night vision and feeding features.")
        Infusion.addRecipe("QuantumGogglesofRevealing",
                ItemBracketHandler.getItem("EMT:NanosuitGogglesRevealing", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("IC2:itemArmorQuantumHelmet", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1563),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32693),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32693),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32705),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1563)),
                "tutamen 64, potentia 48, sensus 32, praecantatio 24, auram 16, electrum 16, lucrum 8",
                ItemBracketHandler.getItem("EMT:QuantumGogglesRevealing", 27), 9)
        Research.addInfusionPage("QuantumGogglesofRevealing",
                ItemBracketHandler.getItem("EMT:QuantumGogglesRevealing", 27))
        Warp.addToResearch("QuantumGogglesofRevealing", 2)
        Research.orphanResearch("Solar Helmet of Revealing")
        Research.removeResearch("Solar Helmet of Revealing")
        Research.addResearch("SolarHelmetofRevealing", "EMT",
                "tutamen 30, potentia 27, sensus 24, praecantatio 21, auram 15, electrum 12, lucrum 9, aer 6, lux 3",
                -2, -4, 4, ItemBracketHandler.getItem("EMT:SolarHelmetRevealing", 0))
        Research.addPrereq("SolarHelmetofRevealing", "QuantumGogglesofRevealing", false)
        Research.addPrereq("SolarHelmetofRevealing", "CompressedSolars", false)
        Research.setConcealed("SolarHelmetofRevealing", true)
        Research.setRound("SolarHelmetofRevealing", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.SolarHelmetofRevealing", "Solar Helmet of Revealing")
        MineTweakerAPI.game.setLocalization("tc.research_text.SolarHelmetofRevealing", "The sunlight hurts my eyes")
        Research.addPage("SolarHelmetofRevealing", "tc.research_page.SolarHelmetofRevealing")
        MineTweakerAPI.game.setLocalization("tc.research_page.SolarHelmetofRevealing",
                "You now have a helmet that acts exactly like your quantum goggles of revealing, but can also recharge your chest armor! It generates 128 EU/t during the day, and nothing at night.")
        Infusion.addRecipe("SolarHelmetofRevealing", ItemBracketHandler.getItem("EMT:QuantumGogglesRevealing", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTSolars", 1),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1624),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17324),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32694),
                        ItemBracketHandler.getItem("dreamcraft:item.MysteriousCrystal", 0),
                        ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("dreamcraft:item.MysteriousCrystal", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32694),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17324),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1624)),
                "tutamen 64, potentia 48, sensus 32, praecantatio 24, auram 16, electrum 16, lucrum 8, aer 16, lux 32",
                ItemBracketHandler.getItem("EMT:SolarHelmetRevealing", 27), 12)
        Research.addInfusionPage("SolarHelmetofRevealing", ItemBracketHandler.getItem("EMT:SolarHelmetRevealing", 27))
        Warp.addToResearch("SolarHelmetofRevealing", 3)
        Research.orphanResearch("Compressed Solars")
        Research.removeResearch("Compressed Solars")
        Research.addResearch("CompressedSolars", "EMT",
                "potentia 18, lux 15, metallum 12, praecantatio 9, ignis 6, aer 3", -6, -4, 3,
                ItemBracketHandler.getItem("EMT:EMTSolars", 0))
        Research.addPrereq("CompressedSolars", "ElectricMagicTools", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.CompressedSolars", "Compressed Solar Pannels")
        MineTweakerAPI.game.setLocalization("tc.research_text.CompressedSolars", "Increase the efficiency!")
        Research.addPage("CompressedSolars", "tc.research_page.CompressedSolars")
        MineTweakerAPI.game.setLocalization("tc.research_page.CompressedSolars",
                "You have found a way to compress 8 mundane Solar Panels in a magical one, that acts as if it was made of 10 mundane solar panels, generating 10 EU/t. You may repeat this process with compressed solar panels, allowing you to increase the power potential per block even higher. You can also, by magical infusion, create triple compressed solar panels, taking the folly a step further.")
        Arcane.addShaped("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars", 0),
                "aer 50, aqua 50, terra 50, ignis 50, ordo 50, perditio 50",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                        ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                        ItemBracketHandler.getItem("IC2:blockGenerator", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedAluminiumIronPlate", 0),
                                ItemBracketHandler.getItem("IC2:blockGenerator", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                                ItemBracketHandler.getItem("IC2:blockGenerator", 3),
                                ItemBracketHandler.getItem("IC2:blockGenerator", 3))))
        Research.addArcanePage("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars", 0))
        Arcane.addShaped("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars", 1),
                "aer 100, aqua 100, terra 100, ignis 100, ordo 100, perditio 100",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTSolars", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 0), ItemBracketHandler.getItem("EMT:EMTSolars", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTSolars", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTitaniumPlate", 0),
                                ItemBracketHandler.getItem("EMT:EMTSolars", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("EMT:EMTSolars", 0),
                                ItemBracketHandler.getItem("EMT:EMTSolars", 0),
                                ItemBracketHandler.getItem("EMT:EMTSolars", 0))))
        Research.addArcanePage("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars", 1))
        Infusion.addRecipe("CompressedSolars",
                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenSteelPlate", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenSteelPlate", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 1), ItemBracketHandler.getItem("EMT:EMTSolars", 1),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 1), ItemBracketHandler.getItem("EMT:EMTSolars", 1),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedTungstenSteelPlate", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 1), ItemBracketHandler.getItem("EMT:EMTSolars", 1),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 1), ItemBracketHandler.getItem("EMT:EMTSolars", 1)),
                "aer 150, aqua 150, terra 150, ignis 150, ordo 150, perditio 150",
                ItemBracketHandler.getItem("EMT:EMTSolars", 2), 15)
        Research.addInfusionPage("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars", 2))
        Infusion.addRecipe("CompressedSolars",
                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedChromePlate", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedChromePlate", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 2), ItemBracketHandler.getItem("EMT:EMTSolars", 2),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 2), ItemBracketHandler.getItem("EMT:EMTSolars", 2),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedChromePlate", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 2), ItemBracketHandler.getItem("EMT:EMTSolars", 2),
                        ItemBracketHandler.getItem("EMT:EMTSolars", 2), ItemBracketHandler.getItem("EMT:EMTSolars", 2)),
                "aer 300, aqua 300, terra 300, ignis 300, ordo 300, perditio 300",
                ItemBracketHandler.getItem("EMT:EMTSolars3", 0), 20)
        Research.addInfusionPage("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars3", 0))

        //TODO Replace ("AdvancedSolarPanel:asp_crafting_items", 8)
        //Infusion.addRecipe("CompressedSolars", ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 8),
        //        arrayOf(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 8),
        //                ItemBracketHandler.getItem("EMT:EMTSolars3", 0),
        //                ItemBracketHandler.getItem("EMT:EMTSolars3", 0),
        //                ItemBracketHandler.getItem("EMT:EMTSolars3", 0),
        //                ItemBracketHandler.getItem("EMT:EMTSolars3", 0),
        //                ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 8),
        //                ItemBracketHandler.getItem("EMT:EMTSolars3", 0),
        //                ItemBracketHandler.getItem("EMT:EMTSolars3", 0),
        //                ItemBracketHandler.getItem("EMT:EMTSolars3", 0),
        //                ItemBracketHandler.getItem("EMT:EMTSolars3", 0)),
        //        "aer 600, aqua 600, terra 600, ignis 600, ordo 600, perditio 600",
        //        ItemBracketHandler.getItem("EMT:EMTSolars3", 7), 20)

        Research.addInfusionPage("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars3", 7))
        Infusion.addRecipe("CompressedSolars",
                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNaquadriaPlate", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNaquadriaPlate", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 7),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 7),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 7),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 7),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNaquadriaPlate", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 7),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 7),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 7),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 7)),
                "aer 1200, aqua 1200, terra 1200, ignis 1200, ordo 1200, perditio 1200",
                ItemBracketHandler.getItem("EMT:EMTSolars3", 14), 20)
        Research.addInfusionPage("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars3", 14))
        Infusion.addRecipe("CompressedSolars",
                ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNeutroniumPlate", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNeutroniumPlate", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                        ItemBracketHandler.getItem("dreamcraft:item.IrradiantReinforcedNeutroniumPlate", 0),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                        ItemBracketHandler.getItem("EMT:EMTSolars3", 14)),
                "aer 2400, aqua 2400, terra 2400, ignis 2400, ordo 2400, perditio 2400",
                ItemBracketHandler.getItem("EMT:EMTSolars4", 5), 20)
        Research.addInfusionPage("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars4", 5))

        //TODO Replace ("AdvancedSolarPanel:asp_crafting_items", 13)
        //Infusion.addRecipe("CompressedSolars", ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 13),
        //        arrayOf(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 13),
        //                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
        //                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
        //                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
        //                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
        //                ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 13),
        //                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
        //                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
        //                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
        //                ItemBracketHandler.getItem("EMT:EMTSolars4", 5)),
        //        "aer 4800, aqua 4800, terra 4800, ignis 4800, ordo 4800, perditio 4800",
        //        ItemBracketHandler.getItem("EMT:EMTSolars4", 12), 20)

        Research.addInfusionPage("CompressedSolars", ItemBracketHandler.getItem("EMT:EMTSolars4", 12))
        Research.orphanResearch("Water Infused Solar Panels")
        Research.removeResearch("Water Infused Solar Panels")
        Research.addResearch("WaterInfusedSolarPanels", "EMT", "aqua 15, praecantatio 12, potentia 9, lux 6, lucrum 3",
                -7, -7, 3, ItemBracketHandler.getItem("EMT:EMTSolars", 3))
        Research.addPrereq("WaterInfusedSolarPanels", "CompressedSolars", false)
        Research.setConcealed("WaterInfusedSolarPanels", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.WaterInfusedSolarPanels", "Water Infused Solar Pannels")
        MineTweakerAPI.game.setLocalization("tc.research_text.WaterInfusedSolarPanels", "Curse you rain!")
        Research.addPage("WaterInfusedSolarPanels", "tc.research_page.WaterInfusedSolarPanels")
        MineTweakerAPI.game.setLocalization("tc.research_page.WaterInfusedSolarPanels",
                "You always hated rain, especially when all your power came from Solar Panels. You hated it so much that you decided to find a way to make your Solar Panels keep running during rain. You managed... kind of. The Water Infused Solar Panels work during rain, and during rain only.")
        Crucible.addRecipe("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 3),
                ItemBracketHandler.getItem("EMT:EMTSolars", 0), "aqua 32, permutatio 32, praecantatio 32, lux 16")
        Research.addCruciblePage("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 3))
        Crucible.addRecipe("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 4),
                ItemBracketHandler.getItem("EMT:EMTSolars", 1), "aqua 64, permutatio 64, praecantatio 64, lux 32")
        Research.addCruciblePage("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 4))
        Crucible.addRecipe("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 5),
                ItemBracketHandler.getItem("EMT:EMTSolars", 2), "aqua 128, permutatio 128, praecantatio 128, lux 64")
        Research.addCruciblePage("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 5))
        Crucible.addRecipe("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 5),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 0), "aqua 256, permutatio 256, praecantatio 256, lux 128")
        Research.addCruciblePage("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 5))
        Crucible.addRecipe("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 12),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 7), "aqua 512, permutatio 512, praecantatio 512, lux 256")
        Research.addCruciblePage("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 12))
        Crucible.addRecipe("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 3),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                "aqua 1024, permutatio 1024, praecantatio 1024, lux 512")
        Research.addCruciblePage("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 3))
        Crucible.addRecipe("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 10),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
                "aqua 2048, permutatio 2048, praecantatio 2048, lux 1024")
        Research.addCruciblePage("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 10))
        Crucible.addRecipe("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars5", 1),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 12),
                "aqua 4096, permutatio 4096, praecantatio 4096, lux 2048")
        Research.addCruciblePage("WaterInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars5", 1))
        Research.orphanResearch("Entropy Infused Solar Panels")
        Research.removeResearch("Entropy Infused Solar Panels")
        Research.addResearch("EntropyInfusedSolarPanels", "EMT",
                "perditio 15, praecantatio 12, potentia 9, lux 6, lucrum 3", -8, -6, 3,
                ItemBracketHandler.getItem("EMT:EMTSolars", 6))
        Research.addPrereq("EntropyInfusedSolarPanels", "CompressedSolars", false)
        Research.setConcealed("EntropyInfusedSolarPanels", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.EntropyInfusedSolarPanels",
                "Entropy Infused Solar Panels")
        MineTweakerAPI.game.setLocalization("tc.research_text.EntropyInfusedSolarPanels", "Not afraid of the dark")
        Research.addPage("EntropyInfusedSolarPanels", "tc.research_page.EntropyInfusedSolarPanels")
        MineTweakerAPI.game.setLocalization("tc.research_page.EntropyInfusedSolarPanels",
                "You know that Solar Panels stop working at nightime. To counter that, you found a way to make your Solar Panels produce energy at night!")
        Crucible.addRecipe("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 6),
                ItemBracketHandler.getItem("EMT:EMTSolars", 0), "perditio 32, permutatio 32, praecantatio 32, lux 16")
        Research.addCruciblePage("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 6))
        Crucible.addRecipe("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 7),
                ItemBracketHandler.getItem("EMT:EMTSolars", 1), "perditio 64, permutatio 64, praecantatio 64, lux 32")
        Research.addCruciblePage("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 7))
        Crucible.addRecipe("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 8),
                ItemBracketHandler.getItem("EMT:EMTSolars", 2),
                "perditio 128, permutatio 128, praecantatio 128, lux 64")
        Research.addCruciblePage("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 8))
        Crucible.addRecipe("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 2),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 0),
                "perditio 256, permutatio 256, praecantatio 256, lux 128")
        Research.addCruciblePage("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 2))
        Crucible.addRecipe("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 9),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 7),
                "perditio 512, permutatio 512, praecantatio 512, lux 256")
        Research.addCruciblePage("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 9))
        Crucible.addRecipe("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 0),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                "perditio 1024, permutatio 1024, praecantatio 1024, lux 512")
        Research.addCruciblePage("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 0))
        Crucible.addRecipe("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 7),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
                "perditio 2048, permutatio 2048, praecantatio 2048, lux 1024")
        Research.addCruciblePage("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 7))
        Crucible.addRecipe("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 14),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 12),
                "perditio 4096, permutatio 4096, praecantatio 4096, lux 2048")
        Research.addCruciblePage("EntropyInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 14))
        Research.orphanResearch("Order Infused Solar Panels")
        Research.removeResearch("Order Infused Solar Panels")
        Research.addResearch("OrderInfusedSolarPanels", "EMT", "ordo 15, praecantatio 12, potentia 9, lux 6, lucrum 3",
                -6, -8, 3, ItemBracketHandler.getItem("EMT:EMTSolars", 9))
        Research.addPrereq("OrderInfusedSolarPanels", "CompressedSolars", false)
        Research.setConcealed("OrderInfusedSolarPanels", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.OrderInfusedSolarPanels", "Order Infused Solar Panels")
        MineTweakerAPI.game.setLocalization("tc.research_text.OrderInfusedSolarPanels", "I've got the power!")
        Research.addPage("OrderInfusedSolarPanels", "tc.research_page.OrderInfusedSolarPanels")
        MineTweakerAPI.game.setLocalization("tc.research_page.OrderInfusedSolarPanels",
                "Harnessing the power of Order, you have managed to triple the output of your Solar Panels at day!")
        Crucible.addRecipe("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 9),
                ItemBracketHandler.getItem("EMT:EMTSolars", 0), "ordo 32, permutatio 32, praecantatio 32, lux 16")
        Research.addCruciblePage("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 9))
        Crucible.addRecipe("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 10),
                ItemBracketHandler.getItem("EMT:EMTSolars", 1), "ordo 64, permutatio 64, praecantatio 64, lux 32")
        Research.addCruciblePage("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 10))
        Crucible.addRecipe("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 11),
                ItemBracketHandler.getItem("EMT:EMTSolars", 2), "ordo 128, permutatio 128, praecantatio 128, lux 64")
        Research.addCruciblePage("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 11))
        Crucible.addRecipe("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 1),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 0), "ordo 256, permutatio 256, praecantatio 256, lux 128")
        Research.addCruciblePage("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 1))
        Crucible.addRecipe("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 8),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 7), "ordo 512, permutatio 512, praecantatio 512, lux 256")
        Research.addCruciblePage("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 8))
        Crucible.addRecipe("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 15),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                "ordo 1024, permutatio 1024, praecantatio 1024, lux 512")
        Research.addCruciblePage("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 15))
        Crucible.addRecipe("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 6),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
                "ordo 2048, permutatio 2048, praecantatio 2048, lux 1024")
        Research.addCruciblePage("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 6))
        Crucible.addRecipe("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 13),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 12),
                "ordo 4096, permutatio 4096, praecantatio 4096, lux 2048")
        Research.addCruciblePage("OrderInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 13))
        Research.orphanResearch("Fire Infused Solar Panels")
        Research.removeResearch("Fire Infused Solar Panels")
        Research.addResearch("FireInfusedSolarPanels", "EMT", "ignis 15, praecantatio 12, potentia 9, lux 6, lucrum 3",
                -5, -7, 3, ItemBracketHandler.getItem("EMT:EMTSolars", 12))
        Research.addPrereq("FireInfusedSolarPanels", "CompressedSolars", false)
        Research.setConcealed("FireInfusedSolarPanels", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.FireInfusedSolarPanels", "Fire Infused Solar Panels")
        MineTweakerAPI.game.setLocalization("tc.research_text.FireInfusedSolarPanels",
                "Where it is hot and dangerous...")
        Research.addPage("FireInfusedSolarPanels", "tc.research_page.FireInfusedSolarPanels")
        MineTweakerAPI.game.setLocalization("tc.research_page.FireInfusedSolarPanels",
                "Fascinated by the Nether, you created a monster. These Solar Panels work like normal in the Overworld, but also produce more energy when they are located in the Nether! A monster I tell you...")
        Crucible.addRecipe("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 12),
                ItemBracketHandler.getItem("EMT:EMTSolars", 0), "ignis 32, permutatio 32, praecantatio 32, lux 16")
        Research.addCruciblePage("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 12))
        Crucible.addRecipe("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 13),
                ItemBracketHandler.getItem("EMT:EMTSolars", 1), "ignis 64, permutatio 64, praecantatio 64, lux 32")
        Research.addCruciblePage("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 13))
        Crucible.addRecipe("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 14),
                ItemBracketHandler.getItem("EMT:EMTSolars", 2), "ignis 128, permutatio 128, praecantatio 128, lux 64")
        Research.addCruciblePage("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 14))
        Crucible.addRecipe("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 6),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 0), "ignis 256, permutatio 256, praecantatio 256, lux 128")
        Research.addCruciblePage("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 6))
        Crucible.addRecipe("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 13),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 7), "ignis 512, permutatio 512, praecantatio 512, lux 256")
        Research.addCruciblePage("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 13))
        Crucible.addRecipe("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 4),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                "ignis 1024, permutatio 1024, praecantatio 1024, lux 512")
        Research.addCruciblePage("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 4))
        Crucible.addRecipe("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 11),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
                "ignis 2048, permutatio 2048, praecantatio 2048, lux 1024")
        Research.addCruciblePage("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 11))
        Crucible.addRecipe("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars5", 2),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 12),
                "ignis 4096, permutatio 4096, praecantatio 4096, lux 2048")
        Research.addCruciblePage("FireInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars5", 2))
        Research.orphanResearch("Air Infused Solar Panels")
        Research.removeResearch("Air Infused Solar Panels")
        Research.addResearch("AirInfusedSolarPanels", "EMT", "aer 15, praecantatio 12, potentia 9, lux 6, lucrum 3", -4,
                -6, 3, ItemBracketHandler.getItem("EMT:EMTSolars", 15))
        Research.addPrereq("AirInfusedSolarPanels", "CompressedSolars", false)
        Research.setConcealed("AirInfusedSolarPanels", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.AirInfusedSolarPanels", "Air Infused Solar Panels")
        MineTweakerAPI.game.setLocalization("tc.research_text.AirInfusedSolarPanels", "Don't be afraid of heights")
        Research.addPage("AirInfusedSolarPanels", "tc.research_page.AirInfusedSolarPanels")
        MineTweakerAPI.game.setLocalization("tc.research_page.AirInfusedSolarPanels",
                "Your adventurous mind and the natural amount of air existing at the top of the world make these Solar Panels yield more energy when located over Y = 160.")
        Crucible.addRecipe("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 15),
                ItemBracketHandler.getItem("EMT:EMTSolars", 0), "aer 32, permutatio 32, praecantatio 32, lux 16")
        Research.addCruciblePage("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars", 15))
        Crucible.addRecipe("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 0),
                ItemBracketHandler.getItem("EMT:EMTSolars", 1), "aer 64, permutatio 64, praecantatio 64, lux 32")
        Research.addCruciblePage("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 0))
        Crucible.addRecipe("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 1),
                ItemBracketHandler.getItem("EMT:EMTSolars", 2), "aer 128, permutatio 128, praecantatio 128, lux 64")
        Research.addCruciblePage("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 1))
        Crucible.addRecipe("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 3),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 0), "aer 256, permutatio 256, praecantatio 256, lux 128")
        Research.addCruciblePage("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 3))
        Crucible.addRecipe("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 10),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 7), "aer 512, permutatio 512, praecantatio 512, lux 256")
        Research.addCruciblePage("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 10))
        Crucible.addRecipe("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 1),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                "aer 1024, permutatio 1024, praecantatio 1024, lux 512")
        Research.addCruciblePage("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 1))
        Crucible.addRecipe("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 8),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
                "aer 2048, permutatio 2048, praecantatio 2048, lux 1024")
        Research.addCruciblePage("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 8))
        Crucible.addRecipe("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 15),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 12),
                "aer 4096, permutatio 4096, praecantatio 4096, lux 2048")
        Research.addCruciblePage("AirInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 15))
        Research.orphanResearch("Earth Infused Solar Panels")
        Research.removeResearch("Earth Infused Solar Panels")
        Research.addResearch("EarthInfusedSolarPanels", "EMT", "terra 15, praecantatio 12, potentia 9, lux 6, lucrum 3",
                -6, -7, 3, ItemBracketHandler.getItem("EMT:EMTSolars2", 2))
        Research.addPrereq("EarthInfusedSolarPanels", "CompressedSolars", false)
        Research.setConcealed("EarthInfusedSolarPanels", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.EarthInfusedSolarPanels", "Earth Infused Solar Panels")
        MineTweakerAPI.game.setLocalization("tc.research_text.EarthInfusedSolarPanels",
                "Not for claustrophobic persons")
        Research.addPage("EarthInfusedSolarPanels", "tc.research_page.EarthInfusedSolarPanels")
        MineTweakerAPI.game.setLocalization("tc.research_page.EarthInfusedSolarPanels",
                "You have decided to get closer to the core. These Solar Panels produce more energy under Y = 10, but keep in mind the rebellious spirits need to be able to see the sun to work.")
        Crucible.addRecipe("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 2),
                ItemBracketHandler.getItem("EMT:EMTSolars", 0), "terra 32, permutatio 32, praecantatio 32, lux 16")
        Research.addCruciblePage("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 2))
        Crucible.addRecipe("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 3),
                ItemBracketHandler.getItem("EMT:EMTSolars", 1), "terra 64, permutatio 64, praecantatio 64, lux 32")
        Research.addCruciblePage("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 3))
        Crucible.addRecipe("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 4),
                ItemBracketHandler.getItem("EMT:EMTSolars", 2), "terra 128, permutatio 128, praecantatio 128, lux 64")
        Research.addCruciblePage("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars2", 4))
        Crucible.addRecipe("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 4),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 0), "terra 256, permutatio 256, praecantatio 256, lux 128")
        Research.addCruciblePage("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 4))
        Crucible.addRecipe("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 11),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 7), "terra 512, permutatio 512, praecantatio 512, lux 256")
        Research.addCruciblePage("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars3", 11))
        Crucible.addRecipe("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 2),
                ItemBracketHandler.getItem("EMT:EMTSolars3", 14),
                "terra 1024, permutatio 1024, praecantatio 1024, lux 512")
        Research.addCruciblePage("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 2))
        Crucible.addRecipe("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 9),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 5),
                "terra 2048, permutatio 2048, praecantatio 2048, lux 1024")
        Research.addCruciblePage("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars4", 9))
        Crucible.addRecipe("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars5", 0),
                ItemBracketHandler.getItem("EMT:EMTSolars4", 12),
                "terra 4096, permutatio 4096, praecantatio 4096, lux 2048")
        Research.addCruciblePage("EarthInfusedSolarPanels", ItemBracketHandler.getItem("EMT:EMTSolars5", 0))
        Research.orphanResearch("Electric Hoe of Growth")
        Research.removeResearch("Electric Hoe of Growth")
        Research.addResearch("ElectricHoeofGrowth", "EMT",
                "potentia 15, messis 12, praecantatio 9, herba 6, electrum 3", 2, -2, 3,
                ItemBracketHandler.getItem("EMT:ElectricHoeGrowth", 0))
        Research.addPrereq("ElectricHoeofGrowth", "ELEMENTALHOE", false)
        Research.addPrereq("ElectricHoeofGrowth", "ElectricMagicTools", false)
        Research.setConcealed("ElectricHoeofGrowth", true)
        Research.setRound("ElectricHoeofGrowth", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ElectricHoeofGrowth", "Electric Hoe of Growth")
        MineTweakerAPI.game.setLocalization("tc.research_text.ElectricHoeofGrowth", "Shockingly natural")
        Research.addPage("ElectricHoeofGrowth", "tc.research_page.ElectricHoeofGrowth")
        MineTweakerAPI.game.setLocalization("tc.research_page.ElectricHoeofGrowth",
                "You have managed to upgrade your Hoe of Growth. It now delivers little shocks to the land and plants around it, much like your regular Hoe of Growth would do. <BR><BR>However, the magic contained within this tool is too powerful for you to convert it fully to using mundane electricity, for the tool still has a limited number of uses before it breaks, but is rechargeable.")
        Infusion.addRecipe("ElectricHoeofGrowth", ItemBracketHandler.getItem("Thaumcraft:ItemHoeElemental", 0),
                arrayOf(ItemBracketHandler.getItem("IC2:itemToolHoe", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706),
                        ItemBracketHandler.getItem("IC2:upgradeModule", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("IC2:upgradeModule", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32706),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0)),
                "potentia 32, messis 32, praecantatio 48, herba 16, electrum 8",
                ItemBracketHandler.getItem("EMT:ElectricHoeGrowth", 1561), 8)
        Research.addInfusionPage("ElectricHoeofGrowth", ItemBracketHandler.getItem("EMT:ElectricHoeGrowth", 1561))
        Research.orphanResearch("Electric Scribing Tools")
        Research.removeResearch("Electric Scribing Tools")
        Research.addResearch("ElectricScribingTools", "EMT",
                "potentia 15, tenebrae 12, fabrico 9, praecantatio 6, electrum 3", 6, -4, 3,
                ItemBracketHandler.getItem("EMT:ElectricScribingTools", 0))
        Research.addPrereq("ElectricScribingTools", "ElectricMagicTools", true)
        Research.addPrereq("ElectricScribingTools", "RESEARCH", false)
        Research.setConcealed("ElectricScribingTools", true)
        Research.setRound("ElectricScribingTools", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ElectricScribingTools", "Electric Scribing Tools")
        MineTweakerAPI.game.setLocalization("tc.research_text.ElectricScribingTools", "Save squiddy!")
        Research.addPage("ElectricScribingTools", "tc.research_page.ElectricScribingTools")
        MineTweakerAPI.game.setLocalization("tc.research_page.ElectricScribingTools",
                "You have decided not to kill any more squid. Therefore, you researched a way to charge your scribing tools, in a way which would make them not needing any ink. Thanks to static electricity, and the ball pen technology, you managed to make the ink inside the scribing tools spin so quickly, that EU could recharge it.")
        Arcane.addShaped("ElectricScribingTools", ItemBracketHandler.getItem("EMT:ElectricScribingTools", 400),
                "aer 20, ignis 20, aqua 20, ordo 20", arrayOf(arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0), OreBracketHandler.getOre("circuitAdvanced")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0)),
                arrayOf(OreBracketHandler.getOre("circuitAdvanced"),
                        ItemBracketHandler.getItem("Thaumcraft:ItemInkwell", 0),
                        OreBracketHandler.getOre("circuitAdvanced"))))
        Research.addArcanePage("ElectricScribingTools", ItemBracketHandler.getItem("EMT:ElectricScribingTools", 400))
        Research.orphanResearch("Mjolnir")
        Research.removeResearch("Mjolnir")
        Research.addResearch("Mjolnirnew", "EMT", "telum 18, tempestas 15, alienis 12, ira 9, aer 6, ignis 3", 4, -5, 3,
                ItemBracketHandler.getItem("EMT:Mjolnir", 0))
        Research.addPrereq("Mjolnirnew", "The Legend", false)
        Research.addPrereq("Mjolnirnew", "ElectricMagicTools", true)
        Research.addPrereq("Mjolnirnew", "ELEMENTALSWORD", false)
        Research.addPrereq("Mjolnirnew", "FOCUSSHOCK", false)
        Research.addPrereq("Mjolnirnew", "NITOR", false)
        Research.setConcealed("Mjolnirnew", true)
        Research.setRound("Mjolnirnew", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.Mjolnirnew", "MjolniR")
        MineTweakerAPI.game.setLocalization("tc.research_text.Mjolnirnew", "Godly power")
        Research.addPage("Mjolnirnew", "tc.research_page.Mjolnirnew")
        MineTweakerAPI.game.setLocalization("tc.research_page.Mjolnirnew",
                "You have travelled the world, in quest for the mighty Hammer of Thor. One day, you stumbled upon its broken remains, and your heart crumbled with it. After some long and tedious research, you found a way to restore this magnificent tool to its past greatness.<BR><BR>You have an odd feeling,(you seem to have a lot of these), that although this tool is amazingly powerful, you could do more with it.")
        Infusion.addRecipe("Mjolnirnew", ItemBracketHandler.getItem("EMT:TaintedMjolnir", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880),
                        ItemBracketHandler.getItem("EMT:EMTItems", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Thaumcraft:FocusShock", 0),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("EMT:EMTItems", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880)),
                "telum 48, tempestas 48, alienis 32, ira 24, aer 16, ignis 16",
                ItemBracketHandler.getItem("EMT:Mjolnir", 0), 10)
        Research.addInfusionPage("Mjolnirnew", ItemBracketHandler.getItem("EMT:Mjolnir", 0))
        Research.orphanResearch("Supercharged Mjolnir")
        Research.removeResearch("Supercharged Mjolnir")
        Research.addResearch("SuperchargedMjolnir", "EMT",
                "telum 21, tempestas 18, alienis 15, bestia 12, ira 9, aer 6, ignis 3", 3, -5, 4,
                ItemBracketHandler.getItem("EMT:SuperchargedMjolnir", 0))
        Research.addPrereq("SuperchargedMjolnir", "Mjolnirnew", false)
        Research.addPrereq("SuperchargedMjolnir", "FOCUSHELLBAT", false)
        Research.addPrereq("SuperchargedMjolnir", "ALUMENTUM", false)
        Research.setConcealed("SuperchargedMjolnir", true)
        Research.setRound("SuperchargedMjolnir", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.SuperchargedMjolnir", "Supercharged Mjolnir")
        MineTweakerAPI.game.setLocalization("tc.research_text.SuperchargedMjolnir", "Making it yours")
        Research.addPage("SuperchargedMjolnir", "tc.research_page.SuperchargedMjolnir")
        MineTweakerAPI.game.setLocalization("tc.research_page.SuperchargedMjolnir",
                "After some more exploring of the dungeons existing all around the worlds and dimensions, you have managed to find a method that makes you able to overpower Thor's power, making his Hammer yours. Furthermore, you have managed to make your Hammer summon defenders, some strange Snow-Golems like creature that shall protect you. However, the hammer lost its power to summon lightning where you desire it to, and creates a ring of lightning around you.")
        Infusion.addRecipe("SuperchargedMjolnir", ItemBracketHandler.getItem("EMT:Mjolnir", 0),
                arrayOf(ItemBracketHandler.getItem("IC2:itemNanoSaber", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("Thaumcraft:FocusHellbat", 0),
                        ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0)),
                "telum 64, potentia 64, alienis 48, ira 32, aer 24, ignis 24, bestia 16",
                ItemBracketHandler.getItem("EMT:SuperchargedMjolnir", 27), 15)
        Research.addInfusionPage("SuperchargedMjolnir", ItemBracketHandler.getItem("EMT:SuperchargedMjolnir", 27))
        Research.orphanResearch("Lightning Summoner")
        Research.removeResearch("Lightning Summoner")
        Research.addResearch("LightningSummoner", "EMT", "tempestas 15, aer 12, ignis 9, nebrisum 6, permutatio 3", 6,
                -5, 4, ItemBracketHandler.getItem("EMT:EMTItems", 6))
        Research.addPrereq("LightningSummoner", "FOCUSSHOCK", false)
        Research.addPrereq("LightningSummoner", "NITOR", false)
        Research.addPrereq("LightningSummoner", "ALUMENTUM", false)
        Research.setConcealed("LightningSummoner", true)
        Research.setRound("LightningSummoner", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.LightningSummoner", "Lightning Summoner")
        MineTweakerAPI.game.setLocalization("tc.research_text.LightningSummoner", "From vilest enemies")
        Research.addPage("LightningSummoner", "tc.research_page.LightningSummoner")
        MineTweakerAPI.game.setLocalization("tc.research_page.LightningSummoner",
                "This item is dropped by your archenemy, the Supercharged Creeper. You feel it is going to be very useful later on.<BR><BR>If you dont't have any luck i have a recipe for you to make this magic balls of lighting")
        Infusion.addRecipe("LightningSummoner", ItemBracketHandler.getItem("Thaumcraft:FocusShock", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("minecraft:skull", 4),
                        ItemBracketHandler.getItem("minecraft:tnt", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0),
                        ItemBracketHandler.getItem("minecraft:skull", 4),
                        ItemBracketHandler.getItem("minecraft:tnt", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("minecraft:skull", 4),
                        ItemBracketHandler.getItem("minecraft:tnt", 0)),
                "tempestas 16, aer 24, ignis 16, nebrisum 8, permutatio 8",
                ItemBracketHandler.getItem("EMT:EMTItems", 6), 9)
        Research.addInfusionPage("LightningSummoner", ItemBracketHandler.getItem("EMT:EMTItems", 6))
        Research.orphanResearch("Tiny Uranium")
        Research.removeResearch("Tiny Uranium")
        Research.addResearch("TinyUranium", "EMT", "permutatio 15, venenum 12, mortuus 9, praecantatio 6, metallum 3",
                5, -4, 3, ItemBracketHandler.getItem("IC2:itemUran235small", 0))
        Research.addPrereq("TinyUranium", "ElectricMagicTools", true)
        Research.addPrereq("TinyUranium", "RESEARCH", false)
        Research.setConcealed("TinyUranium", true)
        Research.setRound("TinyUranium", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.TinyUranium", "Tiny Uranium")
        MineTweakerAPI.game.setLocalization("tc.research_text.TinyUranium", "Some shrinkage may occur")
        Research.addPage("TinyUranium", "tc.research_page.TinyUranium")
        MineTweakerAPI.game.setLocalization("tc.research_page.TinyUranium",
                "After processing all your ores and using them for the creation of nuclear reactors, you have finally run out of uranium nuggets, needed to make your beloved fuel rods. After long research sessions, you have managed to transform your leftover uranium into much-needed nuggets!<BR><BR>Unfortunately, this process is a bit wasteful, but you believe it to be worth the cost.")
        Arcane.addShapeless("TinyUranium", ItemBracketHandler.getItem("IC2:itemUran235small", 0).amount(7),
                "aer 7, ignis 7, aqua 7, terra 7, ordo 7, perditio 7",
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:itemUran238", 0)))
        Research.addArcanePage("TinyUranium", ItemBracketHandler.getItem("IC2:itemUran235small", 0))
        Research.orphanResearch("UU-Matter Infusion")
        Research.removeResearch("UU-Matter Infusion")
        Research.addResearch("UUMatterInfusion", "EMT",
                "fabrico 15, alienis 12, permutatio 9, praecantatio 6, vitreus 3", 5, -3, 3,
                ItemBracketHandler.getItem("EMT:EMTItems", 15))
        Research.addPrereq("UUMatterInfusion", "ElectricMagicTools", true)
        Research.setRound("UUMatterInfusion", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.UUMatterInfusion", "UUMatter Infusion")
        MineTweakerAPI.game.setLocalization("tc.research_text.UUMatterInfusion",
                "A magically charged metamorphic liquid...")
        Research.addPage("UUMatterInfusion", "tc.research_page.UUMatterInfusion")
        MineTweakerAPI.game.setLocalization("tc.research_page.UUMatterInfusion",
                "You have always found the powers possessed by UU-Mater very strange, even... magical looking, especially the ability to take a large number of shapes if manipulated correctly. And here you are, having discovered a way to shape the liquid through the process of Infusion Crafting. Many recipes are available, and all of them use between 4 to 32 of each primal aspect.")
        Crucible.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("EMT:EMTItems", 15),
                ItemBracketHandler.getItem("IC2:itemCellEmpty", 3), "vitreus 16, gelum 8, praecantatio 8, permutatio 8")
        Research.addCruciblePage("UUMatterInfusion", ItemBracketHandler.getItem("EMT:EMTItems", 15))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:coal", 1),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("minecraft:coal", 0).amount(16), 6)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:coal", 0))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 4, aqua 4, terra 4, ignis 4, perditio 4, ordo 8",
                ItemBracketHandler.getItem("minecraft:glowstone", 0), 3)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:glowstone", 0))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5032).amount(32), 6)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5032))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5035).amount(32), 6)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5035))
        Infusion.addRecipe("UU-MatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11057),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5057).amount(32), 6)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5057))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:gold_ingot", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5086).amount(32), 6)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5086))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("IC2:itemUran238", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5098).amount(32), 6)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5098))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11054),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5054).amount(32), 6)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5054))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11089),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5089).amount(32), 6)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5089))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:redstone", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 12, aqua 12, terra 24, ignis 12, perditio 12, ordo 24",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5810).amount(24), 9)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5810))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:dye", 4),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 12, aqua 12, terra 24, ignis 12, perditio 12, ordo 24",
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5526).amount(24), 9)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 5526))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 8, aqua 8, terra 16, ignis 8, perditio 8, ordo 16",
                ItemBracketHandler.getItem("minecraft:gold_ingot", 0).amount(2), 9)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:gold_ingot", 0))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:gold_ingot", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 16, aqua 16, terra 32, ignis 16, perditio 16, ordo 32",
                ItemBracketHandler.getItem("minecraft:diamond", 0), 12)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:diamond", 0))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("minecraft:diamond", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 24, aqua 24, terra 48, ignis 24, perditio 24, ordo 48",
                ItemBracketHandler.getItem("IC2:itemUran238", 0).amount(2), 15)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("IC2:itemUran238", 0))
        Infusion.addRecipe("UUMatterInfusion", ItemBracketHandler.getItem("IC2:itemUran238", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15),
                        ItemBracketHandler.getItem("EMT:EMTItems", 15), ItemBracketHandler.getItem("EMT:EMTItems", 15)),
                "aer 32, aqua 32, terra 64, ignis 32, perditio 32, ordo 64",
                ItemBracketHandler.getItem("IC2:itemOreIridium", 0).amount(2), 18)
        Research.addInfusionPage("UUMatterInfusion", ItemBracketHandler.getItem("IC2:itemOreIridium", 0))
        Research.orphanResearch("Portable Node")
        Research.removeResearch("Portable Node")
        Research.addResearch("PortableNode", "EMT", "auram 15, alienis 12, lucrum 9, praecantatio 6, vitreus 3", 6, -3,
                3, ItemBracketHandler.getItem("EMT:PortableNode", 0))
        Research.addPrereq("PortableNode", "ElectricMagicTools", true)
        Research.setRound("PortableNode", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.PortableNode", "Portable Node")
        MineTweakerAPI.game.setLocalization("tc.research_text.PortableNode", "Randomly convenient")
        Research.addPage("PortableNode", "tc.research_page.PortableNode")
        MineTweakerAPI.game.setLocalization("tc.research_page.PortableNode",
                "After studying in an in-depth manner of the wonders of Node Jarring, you have managed to create an item capable of spawning a random node. However, due to some parts of node magic which you cannot understand, this Portable Node will always be Fading and Unstable. <BR><BR>You can only get rid of it by a shift-right click, and you think that you should dispose of it as soon as possible, for unstable nodes are... rather unpredictable.")
        Research.addCruciblePage("PortableNode", ItemBracketHandler.getItem("EMT:PortableNode", 0))
        Research.orphanResearch("Shield Focus")
        Research.removeResearch("Shield Focus")
        Research.addResearch("ShieldFocus", "EMT", "tutamen 15, aer 12, vitreus 9, praecantatio 6, cognitio 3", 2, 4, 3,
                ItemBracketHandler.getItem("EMT:ShieldFocus", 0))
        Research.addPrereq("ShieldFocus", "ElectricMagicTools", true)
        Research.addPrereq("ShieldFocus", "FOCUSPORTABLEHOLE", false)
        Research.setConcealed("ShieldFocus", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ShieldFocus", "Shield Focus")
        MineTweakerAPI.game.setLocalization("tc.research_text.ShieldFocus", "S.H.I.E.L.D.")
        Research.addPage("ShieldFocus", "tc.research_page.ShieldFocus")
        MineTweakerAPI.game.setLocalization("tc.research_page.ShieldFocus",
                "With some experimentation with the Portable Hole, you have found out more about the transportation of objects to alternate dimensions. You believe you can reverse these effects to summon a swath of blocks from a dimension full of matter to shield you from any oncoming disaster. Caution is to be taken when using this focus, as when bringing these blocks into our dimension, it will transpose any blocks in the way into the dimension it came from, never to return again. You will also be unable to move while this shield is in existence.")
        Infusion.addRecipe("ShieldFocus", ItemBracketHandler.getItem("Thaumcraft:FocusPortableHole", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockreinforced", 3),
                        ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17383),
                        ItemBracketHandler.getItem("gregtech:gt.blockreinforced", 3),
                        ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockreinforced", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17383),
                        ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockreinforced", 3)),
                "aer 32, tutamen 40, victus 16, vinculum 24, vitreus 16, praecantatio 8",
                ItemBracketHandler.getItem("EMT:ShieldFocus", 0), 9)
        Research.addInfusionPage("ShieldFocus", ItemBracketHandler.getItem("EMT:ShieldFocus", 0))
        Research.orphanResearch("Shield Block")
        Research.removeResearch("Shield Block")
        Research.addResearch("ShieldBlock", "EMT", "tutamen 15, vinculum 12, cognitio 9, praecantatio 6, alienis 3", 2,
                6, 3, ItemBracketHandler.getItem("EMT:ShieldBlock", 0))
        Research.addPrereq("ShieldBlock", "ElectricMagicTools", true)
        Research.addPrereq("ShieldBlock", "ShieldFocus", false)
        Research.setConcealed("ShieldBlock", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ShieldBlock", "Shield Block")
        MineTweakerAPI.game.setLocalization("tc.research_text.ShieldBlock", "Magical protection")
        Research.addPage("ShieldBlock", "tc.research_page.ShieldBlock")
        MineTweakerAPI.game.setLocalization("tc.research_page.ShieldBlock",
                "After studying the blocks created by the shield focus, you have discovered how to recreate them yourself, without relying on them to be summoned by the focus. They are highly blast resistant, and even resistant to nukes. However, in the event of an actual nuclear explosion, while the shield blocks will survive the aftermath, the surrounding blocks will not.<BR><BR>These blocks are unstable and do not drop when broken, even when Silk Touch is used.")
        Arcane.addShaped("ShieldBlock", ItemBracketHandler.getItem("EMT:ShieldBlock", 0).amount(10),
                "terra 20, ordo 20, perditio 20",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0),
                                ItemBracketHandler.getItem("gregtech:gt.blockreinforced", 1),
                                ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassPlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                                ItemBracketHandler.getItem("IC2:itemPartAlloy", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1))))
        Research.addArcanePage("ShieldBlock", ItemBracketHandler.getItem("EMT:ShieldBlock", 0))
        Research.orphanResearch("Kris-tmas Focus")
        Research.removeResearch("Kris-tmas Focus")
        Research.addResearch("KristmasFocus", "EMT", "gelum 15, bestia 12, victus 9, mortuus 6, praecantatio 3", 3, 4,
                3, ItemBracketHandler.getItem("EMT:ChristmasFocus", 0))
        Research.addPrereq("KristmasFocus", "ElectricMagicTools", true)
        Research.addPrereq("KristmasFocus", "FOCUSSHOCK", false)
        Research.setConcealed("KristmasFocus", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.KristmasFocus", "Kris-tmas Focus")
        MineTweakerAPI.game.setLocalization("tc.research_text.KristmasFocus", "Ho! Ho! Ho!")
        Research.addPage("KristmasFocus", "tc.research_page.KristmasFocus")
        MineTweakerAPI.game.setLocalization("tc.research_page.KristmasFocus",
                "Merry Christmas!<BR><BR>You have found a novel use for the frost focus. By exposing it to the magic of Christmas, you can summon your snowy friends at will to fire snowballs at your Festivus celebrating neighbours!")
        Arcane.addShaped("KristmasFocus", ItemBracketHandler.getItem("EMT:ChristmasFocus", 0),
                "aer 25, ordo 25, aqua 25",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:pumpkin", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2728),
                        ItemBracketHandler.getItem("minecraft:pumpkin", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2702),
                                ItemBracketHandler.getItem("Thaumcraft:FocusFrost", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2702)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:pumpkin", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2728),
                                ItemBracketHandler.getItem("minecraft:pumpkin", 0))))
        Research.addArcanePage("KristmasFocus", ItemBracketHandler.getItem("EMT:ChristmasFocus", 0))
        Research.orphanResearch("Energy Ball Focus")
        Research.removeResearch("Energy Ball Focus")
        Research.addResearch("EnergyBallFocus", "EMT",
                "potentia 15, praecantatio 12, victus 9, praecantatio 6, cognitio 3", 4, 4, 3,
                ItemBracketHandler.getItem("EMT:EnergyBallFocus", 0))
        Research.addPrereq("EnergyBallFocus", "ElectricMagicTools", true)
        Research.addPrereq("EnergyBallFocus", "FOCUSSHOCK", false)
        Research.setConcealed("EnergyBallFocus", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.EnergyBallFocus", "Energy Ball Focus")
        MineTweakerAPI.game.setLocalization("tc.research_text.EnergyBallFocus", "Not a toy")
        Research.addPage("EnergyBallFocus", "tc.research_page.EnergyBallFocus")
        MineTweakerAPI.game.setLocalization("tc.research_page.EnergyBallFocus",
                "It's necessary to put on the BatPack or nano/quant chestplate for using this focus. You need 5120EU to create one ball. It's not recommended for using in a closed space!")
        Infusion.addRecipe("EnergyBallFocus", ItemBracketHandler.getItem("Thaumcraft:FocusShock", 0),
                arrayOf(ItemBracketHandler.getItem("IC2:blockMachine2", 1),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1461),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1461),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1461),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1461)),
                "potentia 24, praecantatio 18, victus 12, praecantatio 12, cognitio 6",
                ItemBracketHandler.getItem("EMT:EnergyBallFocus", 0), 6)
        Research.addInfusionPage("EnergyBallFocus", ItemBracketHandler.getItem("EMT:EnergyBallFocus", 0))
        Warp.addToResearch("EnergyBallFocus", 1)
        Research.orphanResearch("Explosion Focus")
        Research.removeResearch("Explosion Focus")
        Research.addResearch("ExplosionFocus", "EMT", "ignis 15, mortuus 12, telum 9, praecantatio 6, potentia 3", 5, 4,
                3, ItemBracketHandler.getItem("EMT:ExplosionFocus", 0))
        Research.addPrereq("ExplosionFocus", "ElectricMagicTools", true)
        Research.addPrereq("ExplosionFocus", "FOCUSHELLBAT", false)
        Research.setConcealed("ExplosionFocus", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ExplosionFocus", "Explosion Focus")
        MineTweakerAPI.game.setLocalization("tc.research_text.ExplosionFocus", "Use only in well-ventilated areas")
        Research.addPage("ExplosionFocus", "tc.research_page.ExplosionFocus")
        MineTweakerAPI.game.setLocalization("tc.research_page.ExplosionFocus",
                "You have found a way to improve the Nine Hells focus.  By exposing the bats to the explosive properties of a Mining Laser, you have built a focus that acts similarly to the Laser but uses vis instead of EU.  However, its effects are incredibly unstable, so you make a note to be careful.")
        val s66 = "ExplosionFocus"
        val item11 = ItemBracketHandler.getItem("Thaumcraft:FocusHellbat", 0)
        val array12 = arrayOfNulls<IItemStack>(10)
        array12[0] = ItemBracketHandler.getItem("IC2:itemToolMiningLaser", OreDictionary.WILDCARD_VALUE)
        array12[1] = ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassLense", 0)
        array12[2] = ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1)
        array12[3] = ItemBracketHandler.getItem("minecraft:firework_charge", 0)
        val n18 = 4
        val item12 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 26541)
        val hashMap66 = HashMap<String, IData>()
        val s67 = "ench"
        val array13 = arrayOf<IData?>(null)
        val n19 = 0
        val hashMap67 = HashMap<String, IData>()
        hashMap67["lvl"] = ExpandShort.asNBT(3.toShort())
        hashMap67["id"] = ExpandShort.asNBT(20.toShort())
        array13[n19] = ExpandAnyDict.asData(hashMap67)
        hashMap66[s67] = ExpandAnyArray.asData(array13)
        hashMap66["GT.HasBeenUpdated"] = ExpandByte.asData(1.toByte())
        array12[n18] = item12.withTag(ExpandAnyDict.asData(hashMap66))
        array12[5] = ItemBracketHandler.getItem("minecraft:tnt", 0)
        val n20 = 6
        val item13 = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 26541)
        val hashMap68 = HashMap<String, IData>()
        val s68 = "ench"
        val array14 = arrayOf<IData?>(null)
        val n21 = 0
        val hashMap69 = HashMap<String, IData>()
        hashMap69["lvl"] = ExpandShort.asNBT(3.toShort())
        hashMap69["id"] = ExpandShort.asNBT(20.toShort())
        array14[n21] = ExpandAnyDict.asData(hashMap69)
        hashMap68[s68] = ExpandAnyArray.asData(array14)
        hashMap68["GT.HasBeenUpdated"] = ExpandByte.asData(1.toByte())
        array12[n20] = item13.withTag(ExpandAnyDict.asData(hashMap68))
        array12[7] = ItemBracketHandler.getItem("minecraft:firework_charge", 0)
        array12[8] = ItemBracketHandler.getItem("Thaumcraft:ItemResource", 0)
        array12[9] = ItemBracketHandler.getItem("dreamcraft:item.ReinforcedGlassLense", 0)
        Infusion.addRecipe(s66, item11, array12,
                "ignis 64, mortuus 24, motus 48, telum 32, praecantatio 16, potentia 10",
                ItemBracketHandler.getItem("EMT:ExplosionFocus", 0), 9)
        Research.addInfusionPage("ExplosionFocus", ItemBracketHandler.getItem("EMT:ExplosionFocus", 0))
        Warp.addToResearch("ExplosionFocus", 1)
        Research.orphanResearch("Wand Focus: Charging")
        Research.removeResearch("Wand Focus: Charging")
        Research.addResearch("WandFocusCharging", "EMT",
                "permutatio 15, potentia 12, machina 9, praecantatio 6, cognitio 3", 6, 4, 3,
                ItemBracketHandler.getItem("EMT:ChargingFocus", 0))
        Research.addPrereq("WandFocusCharging", "ElectricMagicTools", true)
        Research.setConcealed("WandFocusCharging", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.WandFocusCharging", "Wand Focus: Charging")
        MineTweakerAPI.game.setLocalization("tc.research_text.WandFocusCharging", "From vis to electricity")
        Research.addPage("WandFocusCharging", "tc.research_page.WandFocusCharging")
        MineTweakerAPI.game.setLocalization("tc.research_page.WandFocusCharging",
                "You realized you always carry a wand with you, along with your electric stuff. But sometimes, you have ran out of juice in your electric tools. That's why you created this wand focus. It is very simple, yet very useful, for it drains vis from your wand storage, and charges the items using mundane electricity.")
        Infusion.addRecipe("WandFocusCharging", ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 22),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20330),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1460),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20330),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 21330)),
                "permutatio 48, potentia 24, machina 32, praecantatio 16, cognitio 8",
                ItemBracketHandler.getItem("EMT:ChargingFocus", 0), 9)
        Research.addInfusionPage("WandFocusCharging", ItemBracketHandler.getItem("EMT:ChargingFocus", 0))
        Research.orphanResearch("Wand Focus: Wand Charging")
        Research.removeResearch("Wand Focus: Wand Charging")
        Research.addResearch("WandFocusWandCharging", "EMT",
                "potentia 18, fabrico 15, lucrum 12, permutatio 9, praecantatio 6, cognitio 3", 6, 6, 3,
                ItemBracketHandler.getItem("EMT:WandChargingFocus", 0))
        Research.addPrereq("WandFocusWandCharging", "ElectricMagicTools", true)
        Research.addPrereq("WandFocusWandCharging", "WandFocusCharging", false)
        Research.addPrereq("WandFocusWandCharging", "IndustrialWandChargingStation", true)
        Research.setConcealed("WandFocusWandCharging", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.WandFocusWandCharging", "Wand Focus: Wand Charging")
        MineTweakerAPI.game.setLocalization("tc.research_text.WandFocusWandCharging", "From electricity to vis")
        Research.addPage("WandFocusWandCharging", "tc.research_page.WandFocusWandCharging")
        MineTweakerAPI.game.setLocalization("tc.research_page.WandFocusWandCharging",
                "You've discovered a way to take the benefits of the Industrial Recharge station and house them inside of a Charging Focus, reversing its polarity.  Now it will drain electricity from your items in order to recharge your wand, albeit at a rather high cost. Furthermore, you have realized than you need a full set of Electric Armor to be able to start the wand charging process.")
        Infusion.addRecipe("WandFocusWandCharging", ItemBracketHandler.getItem("EMT:ChargingFocus", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTMachines", 0),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1660),
                        ItemBracketHandler.getItem("IC2:itemBatLamaCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1660),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 20970),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0)),
                "potentia 48, fabrico 32, lucrum 64, permutatio 48, praecantatio 16, cognitio 8, auram 32",
                ItemBracketHandler.getItem("EMT:WandChargingFocus", 0), 15)
        Research.addInfusionPage("WandFocusWandCharging", ItemBracketHandler.getItem("EMT:WandChargingFocus", 0))
        Warp.addToResearch("WandFocusWandCharging", 2)
        Research.orphanResearch("Industrial Wand Charging Station")
        Research.removeResearch("Industrial Wand Charging Station")
        Research.orphanResearch("Etheral Processor")
        Research.removeResearch("Etheral Processor")
        Research.orphanResearch("Potentia Generator")
        Research.removeResearch("Potentia Generator")
        Research.addResearch("PotentiaGenerator", "EMT",
                "potentia 15, permutatio 12, machina 9, praecantatio 6, metallum 3", -4, 2, 3,
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0))
        Research.addPrereq("PotentiaGenerator", "ElectricMagicTools", true)
        Research.addPrereq("PotentiaGenerator", "JARLABEL", false)
        Research.addPrereq("PotentiaGenerator", "FOCUSTRADE", false)
        Research.setConcealed("PotentiaGenerator", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.PotentiaGenerator", "Potentia Generator")
        MineTweakerAPI.game.setLocalization("tc.research_text.PotentiaGenerator",
                "Harnessing the power-producing potential of Essentia")
        Research.addPage("PotentiaGenerator", "tc.research_page.PotentiaGenerator")
        MineTweakerAPI.game.setLocalization("tc.research_page.PotentiaGenerator",
                "After much studying and research, you have finally discovered how to create electricity from your leftover Essentia.<BR><BR>Simply place a Warded Jar containing Potentia in a 4 blocks radius of the machine and it will draw it in to create EU.<BR><BR>While Potentia seems like the most logical choice for producing Essentia with EU, you believe you will be able to generate electricity from different Essentia in the near future with a bit of tinkering. <BR><BR>All Essentia Generators give out Gregtech EU, so no transformers are needed, you can make a book containing Information about Essentia Burn Values by putting a Book, a LV circuit and any shard in an MV Assembler")
        Infusion.addRecipe("PotentiaGenerator", ItemBracketHandler.getItem("IC2:blockGenerator", 7),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:FocusTrade", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32681),
                        ItemBracketHandler.getItem("minecraft:hopper", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("IC2:blockElectric", 7),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 22),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("IC2:blockMachine", 12),
                        ItemBracketHandler.getItem("IC2:blockElectric", 7),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32601),
                        ItemBracketHandler.getItem("minecraft:hopper", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32681)),
                "potentia 48, permutatio 32, machina 16, praecantatio 32, metallum 32",
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0), 6)
        Research.addInfusionPage("PotentiaGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0))
        Research.orphanResearch("Ignis Generator")
        Research.removeResearch("Ignis Generator")
        Research.addResearch("IgnisGenerator", "EMT", "ignis 12, permutatio 9, aqua 6, praecantatio 3", -6, 4, 3,
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 1))
        Research.addPrereq("IgnisGenerator", "ElectricMagicTools", true)
        Research.addPrereq("IgnisGenerator", "PotentiaGenerator", false)
        Research.setConcealed("IgnisGenerator", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.IgnisGenerator", "Ignis Generator")
        MineTweakerAPI.game.setLocalization("tc.research_text.IgnisGenerator", "If you can't handle the heat...")
        Research.addPage("IgnisGenerator", "tc.research_page.IgnisGenerator")
        MineTweakerAPI.game.setLocalization("tc.research_page.IgnisGenerator",
                "Just as you thought, with a bit of tweaking, you have found a way to instead use Ignis Essentia to produce power. On the inside, this machine is able to heat water by consuming Ignis. The steam produced by this heat then spins the turbines, similar to a typical Generator.")
        Crucible.addRecipe("IgnisGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 1),
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0), "ignis 16, permutatio 8, praecantatio 8")
        Research.addCruciblePage("IgnisGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 1))
        Research.orphanResearch("Auram Generator")
        Research.removeResearch("Auram Generator")
        Research.addResearch("AuramGenerator", "EMT", "auram 12, permutatio 9, aqua 6, praecantatio 3", -4, 4, 3,
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 2))
        Research.addPrereq("AuramGenerator", "ElectricMagicTools", true)
        Research.addPrereq("AuramGenerator", "PotentiaGenerator", false)
        Research.setConcealed("AuramGenerator", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.AuramGenerator", "Auram Generator")
        MineTweakerAPI.game.setLocalization("tc.research_text.AuramGenerator", "Harnessing the magic in the air")
        Research.addPage("AuramGenerator", "tc.research_page.AuramGenerator")
        MineTweakerAPI.game.setLocalization("tc.research_page.AuramGenerator",
                "Though it took a bit more work than you initially thought, you have found a way to produce EU using Auram Essenita. This required a complete reworking of the machine, relying on Auram's pulsating magical power to spin a Generator.")
        Crucible.addRecipe("AuramGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 2),
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0), "auram 16, permutatio 8, praecantatio 8")
        Research.addCruciblePage("AuramGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 2))
        Research.orphanResearch("Arbor Generator")
        Research.removeResearch("Arbor Generator")
        Research.addResearch("ArborGenerator", "EMT", "arbor 12, permutatio 9, aqua 6, praecantatio 3", -2, 4, 3,
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 3))
        Research.addPrereq("ArborGenerator", "ElectricMagicTools", true)
        Research.addPrereq("ArborGenerator", "PotentiaGenerator", false)
        Research.setConcealed("ArborGenerator", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.ArborGenerator", "Arbor Generator")
        MineTweakerAPI.game.setLocalization("tc.research_text.ArborGenerator",
                "Bringing power generation back to its basics")
        Research.addPage("ArborGenerator", "tc.research_page.ArborGenerator")
        MineTweakerAPI.game.setLocalization("tc.research_page.ArborGenerator",
                "You always seem to have excess Arbor Essentia sitting around. Not anymore! By modifying your original Potentia Generator, you have found a way to produce energy using Arbor Essentia instead.")
        Crucible.addRecipe("ArborGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 3),
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0), "arbor 16, permutatio 8, praecantatio 8")
        Research.addCruciblePage("ArborGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 3))
        Research.orphanResearch("Aer Generator")
        Research.removeResearch("Aer Generator")
        Research.addResearch("AerGenerator", "EMT", "aer 12, permutatio 9, aqua 6, praecantatio 3", -4, 6, 3,
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 4))
        Research.addPrereq("AerGenerator", "ElectricMagicTools", true)
        Research.addPrereq("AerGenerator", "PotentiaGenerator", false)
        Research.setConcealed("AerGenerator", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.AerGenerator", "Aer Generator")
        MineTweakerAPI.game.setLocalization("tc.research_text.AerGenerator", "Compressing your environment")
        Research.addPage("AerGenerator", "tc.research_page.AerGenerator")
        MineTweakerAPI.game.setLocalization("tc.research_page.AerGenerator",
                "You have discovered the enormous power of the air, and therefore decided to try out a modification of your original Potentia Generator capable of compressing air from Aer Essentia in a nearby jar.")
        Crucible.addRecipe("AerGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 4),
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0), "aer 16, permutatio 8, praecantatio 8")
        Research.addCruciblePage("AerGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 4))
        Research.orphanResearch("Lucrum Generator")
        Research.removeResearch("Lucrum Generator")
        Research.addResearch("LucrumGenerator", "EMT", "lucrum 12, permutatio 9, aqua 6, praecantatio 3", -4, 8, 3,
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 5))
        Research.addPrereq("LucrumGenerator", "ElectricMagicTools", true)
        Research.addPrereq("LucrumGenerator", "PotentiaGenerator", false)
        Research.addPrereq("LucrumGenerator", "AerGenerator", false)
        Research.addPrereq("LucrumGenerator", "IgnisGenerator", false)
        Research.addPrereq("LucrumGenerator", "AuramGenerator", false)
        Research.addPrereq("LucrumGenerator", "ArborGenerator", false)
        Research.setConcealed("LucrumGenerator", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.LucrumGenerator", "Lucrum Generator")
        MineTweakerAPI.game.setLocalization("tc.research_text.LucrumGenerator", "Greed is Good...?")
        Research.addPage("LucrumGenerator", "tc.research_page.LucrumGenerator")
        MineTweakerAPI.game.setLocalization("tc.research_page.LucrumGenerator",
                "Your greed kept you going further, so you found a way to convert Lucrum to power.<BR><BR>By Infusing the Potentia Generator with huge amounts of Gold, Permutatio and Lucrum, you managed to build a powerful generator that literally runs on gold.<BR><BR>But as you thought, the Infusion is unstable and will fail easily when you are not prepared.")
        Infusion.addRecipe("LucrumGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0),
                        ItemBracketHandler.getItem("minecraft:gold_block", 0)),
                "permutatio 128, lucrum 256, praecantatio 32, nebrisum 16",
                ItemBracketHandler.getItem("EMT:EssentiaGenerators", 5), 10)
        Research.addInfusionPage("LucrumGenerator", ItemBracketHandler.getItem("EMT:EssentiaGenerators", 5))
        Warp.addToResearch("LucrumGenerator", 5)
        Research.addResearch("EssentiaFiller", "EMT", "iter 12, permutatio 9, aqua 6, praecantatio 3", -4, 10, 3,
                ItemBracketHandler.getItem("EMT:EMTMachines", 2))
        Research.addPrereq("EssentiaFiller", "ElectricMagicTools", true)
        Research.addPrereq("EssentiaFiller", "LucrumGenerator", false)
        Research.setConcealed("EssentiaFiller", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.EssentiaFiller", "Essentia Filler")
        MineTweakerAPI.game.setLocalization("tc.research_text.EssentiaFiller", "Fill her up!")
        Research.addPage("EssentiaFiller", "tc.research_page.EssentiaFiller")
        MineTweakerAPI.game.setLocalization("tc.research_page.EssentiaFiller",
                "It's been a long time since you discovered the flow of Essentia, now you found a way to move essentia into Essentia Hatches.")
        Arcane.addShaped("EssentiaFiller", ItemBracketHandler.getItem("EMT:EMTMachines", 2),
                "aer 90, terra 90, ignis 90, aqua 90, ordo 90, perditio 90",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateIridium"),
                        OreBracketHandler.getOre("pipeTinyNetherStar"), OreBracketHandler.getOre("plateIridium")),
                        arrayOf(OreBracketHandler.getOre("pipeTinyNetherStar"),
                                ItemBracketHandler.getItem("GalacticraftCore:tile.fuelLoader", 0),
                                OreBracketHandler.getOre("pipeTinyNetherStar")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIridium"),
                                OreBracketHandler.getOre("pipeTinyNetherStar"),
                                OreBracketHandler.getOre("plateIridium"))))
        Research.addArcanePage("EssentiaFiller", ItemBracketHandler.getItem("EMT:EMTMachines", 2))
        Research.addResearch("LargeEssentiaGenerator", "EMT",
                "auram 32,lucrum 12, permutatio 9, aqua 6, praecantatio 3", -4, 12, 3,
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13000))
        Research.addPrereq("LargeEssentiaGenerator", "ElectricMagicTools", true)
        Research.addPrereq("LargeEssentiaGenerator", "EssentiaFiller", false)
        Research.addPrereq("LargeEssentiaGenerator", "LucrumGenerator", false)
        Research.addPrereq("LargeEssentiaGenerator", "PotentiaGenerator", false)
        Research.addPrereq("LargeEssentiaGenerator", "AerGenerator", false)
        Research.addPrereq("LargeEssentiaGenerator", "IgnisGenerator", false)
        Research.addPrereq("LargeEssentiaGenerator", "AuramGenerator", false)
        Research.addPrereq("LargeEssentiaGenerator", "ArborGenerator", false)
        Research.setConcealed("LargeEssentiaGenerator", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.LargeEssentiaGenerator", "Large Essentia Generator")
        MineTweakerAPI.game.setLocalization("tc.research_text.LargeEssentiaGenerator", "Burn everything")
        Research.addPage("LargeEssentiaGenerator", "tc.research_page.LargeEssentiaGenerator")
        MineTweakerAPI.game.setLocalization("tc.research_page.LargeEssentiaGenerator",
                "This must be it. All your efforts to making the Essentia Generators finally payed of. You managed to make a shematic for a reactor like structure that will allow you to create Energy out of almost anything. The only remaining problems are the Chamber and the Walls of this Structure.")
        Infusion.addRecipe("LargeEssentiaGenerator", ItemBracketHandler.getItem("IC2:blockGenerator", 5),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1191),
                        ItemBracketHandler.getItem("EMT:EssentiaGenerators", 0),
                        ItemBracketHandler.getItem("EMT:EssentiaGenerators", 1),
                        ItemBracketHandler.getItem("EMT:EssentiaGenerators", 2),
                        ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1191),
                        ItemBracketHandler.getItem("EMT:EssentiaGenerators", 3),
                        ItemBracketHandler.getItem("EMT:EssentiaGenerators", 4),
                        ItemBracketHandler.getItem("EMT:EssentiaGenerators", 5)),
                "permutatio 1024, praecantatio 512, lucrum 256, radio 128, nebrisum 64, terminus 32",
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13000), 10)
        Research.addInfusionPage("LargeEssentiaGenerator",
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 13000))
        Warp.addToResearch("LargeEssentiaGenerator", 10)
        Research.addResearch("EssentiaDiffusionCells", "EMT",
                "auram 32,lucrum 12, permutatio 9, aqua 6, praecantatio 3", -2, 14, 3,
                ItemBracketHandler.getItem("EMT:EMT_GTBLOCK_CASEING", 1))
        Research.addPrereq("EssentiaDiffusionCells", "ElectricMagicTools", true)
        Research.addPrereq("EssentiaDiffusionCells", "LargeEssentiaGenerator", false)
        Research.setConcealed("EssentiaDiffusionCells", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.EssentiaDiffusionCells", "Essentia Diffusion Cells")
        MineTweakerAPI.game.setLocalization("tc.research_text.EssentiaDiffusionCells", "Take them apart")
        Research.addPage("EssentiaDiffusionCells", "tc.research_page.EssentiaDiffusionCells")
        MineTweakerAPI.game.setLocalization("tc.research_page.EssentiaDiffusionCells",
                "The inner chamber of your Large Essentia Generator need to widstand the highest mechanical, and magical pressure. It also needs a special catalyst that will activate the Essentia, but your efforts with a Primordial Pearl have failed, they just weren't strong enough...")
        Infusion.addRecipe("EssentiaDiffusionCells", ItemBracketHandler.getItem("EMT:EMT_GTBLOCK_CASEING", 5),
                arrayOf(ItemBracketHandler.getItem("Avaritia:big_pearl", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19097),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19097),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19097),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19097),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19101),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19101),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32684),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19101),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19101),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19097),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19097),
                        ItemBracketHandler.getItem("thaumicenergistics:material", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19097),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19097),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 19083)),
                "perditio 64, permutatio 64, praecantatio 64, nebrisum 64, radio 64",
                ItemBracketHandler.getItem("EMT:EMT_GTBLOCK_CASEING", 1), 10)
        Research.addInfusionPage("EssentiaDiffusionCells", ItemBracketHandler.getItem("EMT:EMT_GTBLOCK_CASEING", 1))
        Warp.addToResearch("EssentiaDiffusionCells", 10)
        Research.addResearch("MagicContainingCasings", "EMT",
                "tutamen 32,nebrisum 12, ordo 9, tempus 6, praecantatio 3", -6, 14, 3,
                ItemBracketHandler.getItem("EMT:EMT_GTBLOCK_CASEING", 0))
        Research.addPrereq("MagicContainingCasings", "ElectricMagicTools", true)
        Research.addPrereq("MagicContainingCasings", "LargeEssentiaGenerator", false)
        Research.setConcealed("MagicContainingCasings", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.MagicContainingCasings", "Magic Containing Casings")
        MineTweakerAPI.game.setLocalization("tc.research_text.MagicContainingCasings", "Keeping the Magic inside")
        Research.addPage("MagicContainingCasings", "tc.research_page.MagicContainingCasings")
        MineTweakerAPI.game.setLocalization("tc.research_page.MagicContainingCasings",
                "The outer layer of your Large Essentia Generator needs to keep the Essential Radiation in place, but needs to be cooled and aswell. The only solution you found in this topic are Force-Fields.")
        Infusion.addRecipe("MagicContainingCasings", ItemBracketHandler.getItem("EMT:EMT_GTBLOCK_CASEING", 4),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32674),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32674),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0),
                        ItemBracketHandler.getItem("EMT:ShieldBlock", 0)),
                "ordo 64, tempus 64, praecantatio 64, nebrisum 64, tutamen 512",
                ItemBracketHandler.getItem("EMT:EMT_GTBLOCK_CASEING", 0), 10)
        Research.addInfusionPage("MagicContainingCasings", ItemBracketHandler.getItem("EMT:EMT_GTBLOCK_CASEING", 0))
        Warp.addToResearch("MagicContainingCasings", 10)
        Research.addResearch("IndustrialWandChargingStation", "EMT",
                "permutatio 15, potentia 12, fabrico 9, praecantatio 6, lucrum 3", -6, 2, 3,
                ItemBracketHandler.getItem("EMT:EMTMachines", 0))
        Research.addPrereq("IndustrialWandChargingStation", "ElectricMagicTools", true)
        Research.addPrereq("IndustrialWandChargingStation", "PotentiaGenerator", false)
        Research.addPrereq("IndustrialWandChargingStation", "WANDPED", false)
        Research.addPrereq("IndustrialWandChargingStation", "JARLABEL", false)
        Research.setConcealed("IndustrialWandChargingStation", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.IndustrialWandChargingStation",
                "Industrial Wand Charging Station")
        MineTweakerAPI.game.setLocalization("tc.research_text.IndustrialWandChargingStation",
                "Charging your wand the industrial way")
        Research.addPage("IndustrialWandChargingStation", "tc.research_page.IndustrialWandChargingStation")
        MineTweakerAPI.game.setLocalization("tc.research_page.IndustrialWandChargingStation",
                "You have managed to combine the powers of the Wand Pedestal with those of the mighty UU-Matter, resulting in a machine capable of replicating aspects on your wand, at the cost of 50000 EU to recharge every aspect on the wand of 1 unit.")
        Infusion.addRecipe("IndustrialWandChargingStation",
                ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 5),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 485),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockJar", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500),
                        ItemBracketHandler.getItem("IC2:itemPartIridium", 0)),
                "permutatio 48, potentia 48, fabrico 48, praecantatio 32, lucrum 64, cognitio 16",
                ItemBracketHandler.getItem("EMT:EMTMachines", 0), 9)
        Research.addInfusionPage("IndustrialWandChargingStation", ItemBracketHandler.getItem("EMT:EMTMachines", 0))
        Warp.addToResearch("IndustrialWandChargingStation", 3)
        Research.addResearch("EtheralProcessor", "EMT",
                "machina 15, fabrico 12, potentia 9, praecantatio 6, cognitio 3", -2, 2, 3,
                ItemBracketHandler.getItem("EMT:EMTMachines", 1))
        Research.addPrereq("EtheralProcessor", "ElectricMagicTools", true)
        Research.addPrereq("EtheralProcessor", "BELLOWS", false)
        Research.addPrereq("EtheralProcessor", "DISTILESSENTIA", false)
        Research.addPrereq("EtheralProcessor", "INFERNALFURNACE", false)
        Research.addPrereq("EtheralProcessor", "PotentiaGenerator", false)
        Research.setConcealed("EtheralProcessor", true)
        MineTweakerAPI.game.setLocalization("tc.research_name.EtheralProcessor", "Etheral Processor")
        MineTweakerAPI.game.setLocalization("tc.research_text.EtheralProcessor", "The sky is blue...")
        Research.addPage("EtheralProcessor", "tc.research_page.EtheralProcessor")
        MineTweakerAPI.game.setLocalization("tc.research_page.EtheralProcessor",
                "After taping into hell's power with the Infernal Furnace to get some rewards out of your mining sessions, you have something totally different in mind. You are now using the power of the Good, the sky and the so called Paradise. This Ethereal Processor doubles the yield of every smelting recipe, and gives a 10% chance of getting a Thaumium Nugget as a bonus. You can see two drawbacks to this : as it doubles your smelting yield, it takes twice the time to process an item. As it is a highly magical device, some mundane smelting recipes do not seem to work. You are confident that smelting cobblestone into stone will not work into this wonder-machine.")
        Infusion.addRecipe("EtheralProcessor", ItemBracketHandler.getItem("gregtech:gt.blockmachines", 302),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 262),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockWoodenDevice", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17330),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 9)),
                "machina 16, fabrico 16, potentia 24, praecantatio 28, cognitio 8",
                ItemBracketHandler.getItem("EMT:EMTMachines", 1), 9)
        Research.addInfusionPage("EtheralProcessor", ItemBracketHandler.getItem("EMT:EMTMachines", 1))
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2880).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0), 200, VoltageLevels.LLV)

        //TODO Replace getLiquid("glue")
        //Assembler.addRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 9),
        //        ItemBracketHandler.getItem("minecraft:paper", 0).amount(12),
        //        ItemBracketHandler.getItem("EMT:EMTItems", 10).amount(4),
        //        LiquidBracketHandler.getLiquid("glue").withAmount(6912), 600, VoltageLevels.LV)

        Assembler.addRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 9),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(12),
                ItemBracketHandler.getItem("EMT:EMTItems", 10).amount(4),
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(6912), 600, VoltageLevels.LV)
        FluidSolidifier.addRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 8),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0),
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(288), 100, VoltageLevels.LLV)

        //TODO Replace getLiquid("glue")
        //FluidSolidifier.addRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 8),
        //        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0),
        //        LiquidBracketHandler.getLiquid("glue").withAmount(288), 100, VoltageLevels.LLV)

        FluidSolidifier.addRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0),
                LiquidBracketHandler.getLiquid("molten.rubber").withAmount(576), 100, VoltageLevels.LV)
        FluidExtractor.addRecipe(null, ItemBracketHandler.getItem("EMT:EMTItems", 8),
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(288), 10000, 100, 16)
        FormingPress.addRecipe(ItemBracketHandler.getItem("EMT:EMTItems", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2880).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0), 100, VoltageLevels.LV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 826).amount(22)),
                ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 21), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2880).amount(4)),
                ItemBracketHandler.getItem("EMT:EMTItems", 10), intArrayOf(10000), 300, VoltageLevels.LULV)
    }
}