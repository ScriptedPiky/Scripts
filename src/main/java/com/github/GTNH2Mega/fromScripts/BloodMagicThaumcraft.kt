package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IItemStack
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.Arcane
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import modtweaker2.mods.thaumcraft.handlers.Warp
import java.util.*

class BloodMagicThaumcraft : Runnable {
    override fun run() {
        Infusion.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:wand_caps", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:wand_cores", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:wand_cores", 1))
        Research.addTab("BLOODMAGIC", "dreamcraft", "textures/thaumcraft/icon/icon_BloodMagic.png", "dreamcraft",
                "textures/thaumcraft/tab/tab_BloodMagic.png")
        MineTweakerAPI.game.setLocalization("tc.research_category.BLOODMAGIC", "Blood Magic")
        Research.addResearch("BLOODALTAR", "BLOODMAGIC", "alienis 15, praecantatio 12, auram 9, fames 6, terra 3", 0, 0,
                3, ItemBracketHandler.getItem("AWWayofTime:Altar", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.BLOODALTAR", "Blood Altar")
        MineTweakerAPI.game.setLocalization("tc.research_text.BLOODALTAR", "[BM] Paying the highest price.")
        Research.addPage("BLOODALTAR", "bloodmagic.research_page.BLOODALTAR.1")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.BLOODALTAR.1",
                "The Blood Altar is a block added by Blood Magic. It is used to transmute various items using Life Essence (LP). The Blood Altar has an internal storage buffer of 1,000 LP that must be filled before crafting can occur. The altar can be expanded into a multiblock structure in order to access more powerful tiers of transmutation. Currently there are six tiers of Blood Altars. The Blood Altar is used to transmute various items using Life Essence. The transmuted items can then be used in the creation of much of Blood Magic's content. A non-upgraded Altar can store a maximum of 10,000 Life Essence (LP).")
        Research.addPage("BLOODALTAR", "bloodmagic.research_page.BLOODALTAR.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.BLOODALTAR.2",
                " The maximum storage per tier for an altar crafted with only Runes of Augmented Capacity is listed below for each tier.\r\nMuch like a Beacon, the Blood Altar increases in tier in a pyramid-like fashion. That is, each successive new tier is added by building downward and out from the previous layer. Unlike the Beacon, the inside of the layers and any gaps in the structure can be left empty. The only required blocks are the Blood Altar, the various types of Blood Runes, and any other block specifically designated in the construction of each tier.")

        //TODO Replace ("ExtraUtilities:cobblestone_compressed", 1)
        //Arcane.addShaped("BLOODALTAR", ItemBracketHandler.getItem("AWWayofTime:Altar", 0),
        //        "aer 20, ignis 20, terra 20, aqua 20, ordo 20, perditio 20",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
        //                ItemBracketHandler.getItem("witchery:ingredient", 10),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraUtilities:cobblestone_compressed", 1),
        //                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 0),
        //                        ItemBracketHandler.getItem("ExtraUtilities:cobblestone_compressed", 1)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("EnderIO:itemMaterial", 5),
        //                        ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 0),
        //                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 5))))

        Research.addArcanePage("BLOODALTAR", ItemBracketHandler.getItem("AWWayofTime:Altar", 0))
        Warp.addToResearch("BLOODALTAR", 2)
        Research.addResearch("LIFEINFUSER", "BLOODMAGIC",
                "victus 18, alienis 15, praecantatio 12, auram 9, fames 6, terra 3", -2, 2, 3,
                ItemBracketHandler.getItem("BloodArsenal:life_infuser", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.LIFEINFUSER", "Life Infuser")
        MineTweakerAPI.game.setLocalization("tc.research_text.LIFEINFUSER", "[BA] Transfer your Life Essence")
        Research.addPrereq("LIFEINFUSER", "BLOODALTAR", false)
        Research.addPrereq("LIFEINFUSER", "INFUSION", false)
        Research.setConcealed("LIFEINFUSER", false)
        Research.addPage("LIFEINFUSER", "bloodmagic.research_page.LIFEINFUSER")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.LIFEINFUSER",
                "The Life Infuser is a Block Added by Blood Arsenal. It takes in life essence and gradually repairs a tool using 500 LE each damage point repaired. Once an orb is inserted into the Life Essence Materializer, it will suck out LP from the orb's owner converting it to Life Essence which can then be pumped out. (converts 150 - 100)")

        //TODO Replace ("TConstruct:heavyPlate", 251) and
        //Infusion.addRecipe("LIFEINFUSER", ItemBracketHandler.getItem("AWWayofTime:Altar", 0),
        //        arrayOf(ItemBracketHandler.getItem("minecraft:nether_star", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22977),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22977),
        //                ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 501),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22977),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22977)),
        //        "victus 32, alienis 32, praecantatio 24, auram 16, fames 8, terra 8",
        //        ItemBracketHandler.getItem("BloodArsenal:life_infuser", 0), 5)

        Research.addInfusionPage("LIFEINFUSER", ItemBracketHandler.getItem("BloodArsenal:life_infuser", 0))
        Warp.addToResearch("LIFEINFUSER", 3)

        //TODO Replace ("TConstruct:heavyPlate", 251)
        //Arcane.addShaped("LIFEINFUSER", ItemBracketHandler.getItem("BloodArsenal:lp_materializer", 0),
        //        "ignis 50, terra 50, aqua 50, ordo 50",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
        //                        ItemBracketHandler.getItem("minecraft:nether_star", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251))))

        Research.addArcanePage("LIFEINFUSER", ItemBracketHandler.getItem("BloodArsenal:lp_materializer", 0))
        Research.addResearch("SOULCOMPACTER", "BLOODMAGIC",
                "spiritus 18, praecantatio 15, alienis 12, lucrum 9, vacuos 6, cognitio 3", 0, -6, 4,
                ItemBracketHandler.getItem("BloodArsenal:compacter", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SOULCOMPACTER", "Soul Compacter")
        MineTweakerAPI.game.setLocalization("tc.research_text.SOULCOMPACTER", "[BA] Packing your Ritual")
        Research.addPrereq("SOULCOMPACTER", "MASTERRITUALSTONE", false)
        Research.setConcealed("SOULCOMPACTER", false)
        Research.addPage("SOULCOMPACTER", "bloodmagic.research_page.SOULCOMPACTER")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SOULCOMPACTER",
                "The extremely powerful Soul Compacter: Put underneath a master ritual stone with a ritual or underneath an altar. Right click it with an orb to compact the whole thing into one block! WARNING: May use a bit more LP than you'd think!")
        Arcane.addShaped("SOULCOMPACTER", ItemBracketHandler.getItem("BloodArsenal:compacter", 0),
                "aer 75, ignis 75, terra 75, aqua 75, ordo 75, perditio 75",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32644),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0),
                                ItemBracketHandler.getItem("AWWayofTime:masterStone", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0))))
        Research.addArcanePage("SOULCOMPACTER", ItemBracketHandler.getItem("BloodArsenal:compacter", 0))
        Warp.addToResearch("SOULCOMPACTER", 3)
        Research.addResearch("SACRIFICIALKNIFE", "BLOODMAGIC",
                "telum 15, lucrum 12, instrumentum 9, fames 6, fabrico 3", 2, -2, 3,
                ItemBracketHandler.getItem("AWWayofTime:sacrificialKnife", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SACRIFICIALKNIFE", "Sacrificial Knife")
        MineTweakerAPI.game.setLocalization("tc.research_text.SACRIFICIALKNIFE", "[BM] Ouch! that hurts.")
        Research.addPrereq("SACRIFICIALKNIFE", "BLOODALTAR", false)
        Research.setConcealed("SACRIFICIALKNIFE", false)
        Research.addPage("SACRIFICIALKNIFE", "bloodmagic.research_page.SACRIFICIALKNIFE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SACRIFICIALKNIFE",
                "The Sacrificial Knife, or the Sacrificial Orb, is one of two ways to generate LP in the Blood Altar. The Sacrificial Knife is used as a self-sacrifice method, allowing the user to convert their health points into usable Life Essence. To take health from other creatures in return for LP, sacrifice methods such as the Dagger of Sacrifice must be used. If the user of the knife is a Vampire, their blood will be drained rather than their health.")

        //TODO Replace
        //Arcane.addShaped("SACRIFICIALKNIFE", ItemBracketHandler.getItem("AWWayofTime:sacrificialKnife", 0),
        //        "aer 10, terra 20, ordo 10, perditio 20", arrayOf(arrayOf(OreBracketHandler.getOre("screwSteel"),
        //        ItemBracketHandler.getItem("TConstruct:strangeFood", 1),
        //        OreBracketHandler.getOre("craftingToolScrewdriver")),
        //        arrayOf(OreBracketHandler.getOre("plateAluminium"),
        //                ItemBracketHandler.getItem("battlegear2:dagger.diamond", 0),
        //                ItemBracketHandler.getItem("TConstruct:strangeFood", 1)),
        //        arrayOf<IIngredient>(OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("plateAluminium"),
        //                OreBracketHandler.getOre("screwSteel"))))

        Research.addArcanePage("SACRIFICIALKNIFE", ItemBracketHandler.getItem("AWWayofTime:sacrificialKnife", 0))
        Research.addResearch("ALCHEMICCHEMSTRYSET", "BLOODMAGIC",
                "fabrico 15, ignis 12, instrumentum 9, praecantatio 6, victus 3", 4, -4, 3,
                ItemBracketHandler.getItem("AWWayofTime:blockWritingTable", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ALCHEMICCHEMSTRYSET", "Alchemic Chemistry Set")
        MineTweakerAPI.game.setLocalization("tc.research_text.ALCHEMICCHEMSTRYSET", "[BM] Blub, blub.....OH")
        Research.addPrereq("ALCHEMICCHEMSTRYSET", "INFUSION", false)
        Research.addPrereq("ALCHEMICCHEMSTRYSET", "SACRIFICIALKNIFE", false)
        Research.setConcealed("ALCHEMICCHEMSTRYSET", true)
        Research.addPage("ALCHEMICCHEMSTRYSET", "bloodmagic.research_page.ALCHEMICCHEMSTRYSET")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ALCHEMICCHEMSTRYSET",
                "The Alchemic Chemistry Set is a block added by Blood Magic. This is a Chemistry set used for the mod mentioned above. It's main purpose is to, you guessed it, brew potions! It's an essential part of this mod; as this block is used to brew things that can be the base of many others. Along with the many other such things, you will need LP to actually use and make things with this block. LP, the basic power of this mod, will be explained in another thread.")
        val s = "ALCHEMICCHEMSTRYSET"
        val item = ItemBracketHandler.getItem("minecraft:brewing_stand", 0)
        val array = arrayOfNulls<IItemStack>(12)
        val n = 0
        val item2 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap = HashMap<String, IData>()
        val s2 = "Fluid"
        val hashMap2 = HashMap<String, IData>()
        hashMap2["FluidName"] = ExpandString.asData("lifeessence")
        hashMap2["Amount"] = ExpandInt.toData(1000)
        hashMap[s2] = ExpandAnyDict.asData(hashMap2)
        array[n] = item2.withTag(ExpandAnyDict.asData(hashMap))
        array[1] = ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)
        val n2 = 2
        val item3 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap3 = HashMap<String, IData>()
        val s3 = "Fluid"
        val hashMap4 = HashMap<String, IData>()
        hashMap4["FluidName"] = ExpandString.asData("lifeessence")
        hashMap4["Amount"] = ExpandInt.toData(1000)
        hashMap3[s3] = ExpandAnyDict.asData(hashMap4)
        array[n2] = item3.withTag(ExpandAnyDict.asData(hashMap3))
        array[3] = ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)
        val n3 = 4
        val item4 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap5 = HashMap<String, IData>()
        val s4 = "Fluid"
        val hashMap6 = HashMap<String, IData>()
        hashMap6["FluidName"] = ExpandString.asData("lifeessence")
        hashMap6["Amount"] = ExpandInt.toData(1000)
        hashMap5[s4] = ExpandAnyDict.asData(hashMap6)
        array[n3] = item4.withTag(ExpandAnyDict.asData(hashMap5))
        array[5] = ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)
        val n4 = 6
        val item5 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap7 = HashMap<String, IData>()
        val s5 = "Fluid"
        val hashMap8 = HashMap<String, IData>()
        hashMap8["FluidName"] = ExpandString.asData("lifeessence")
        hashMap8["Amount"] = ExpandInt.toData(1000)
        hashMap7[s5] = ExpandAnyDict.asData(hashMap8)
        array[n4] = item5.withTag(ExpandAnyDict.asData(hashMap7))
        array[7] = ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)
        val n5 = 8
        val item6 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap9 = HashMap<String, IData>()
        val s6 = "Fluid"
        val hashMap10 = HashMap<String, IData>()
        hashMap10["FluidName"] = ExpandString.asData("lifeessence")
        hashMap10["Amount"] = ExpandInt.toData(1000)
        hashMap9[s6] = ExpandAnyDict.asData(hashMap10)
        array[n5] = item6.withTag(ExpandAnyDict.asData(hashMap9))
        array[9] = ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)
        val n6 = 10
        val item7 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap11 = HashMap<String, IData>()
        val s7 = "Fluid"
        val hashMap12 = HashMap<String, IData>()
        hashMap12["FluidName"] = ExpandString.asData("lifeessence")
        hashMap12["Amount"] = ExpandInt.toData(1000)
        hashMap11[s7] = ExpandAnyDict.asData(hashMap12)
        array[n6] = item7.withTag(ExpandAnyDict.asData(hashMap11))
        array[11] = ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)
        Infusion.addRecipe(s, item, array, "fabrico 24, instrumentum 24, praecantatio 18, victus 12, ignis 12",
                ItemBracketHandler.getItem("AWWayofTime:blockWritingTable", 0), 5)
        Research.addInfusionPage("ALCHEMICCHEMSTRYSET", ItemBracketHandler.getItem("AWWayofTime:blockWritingTable", 0))
        Warp.addToResearch("ALCHEMICCHEMSTRYSET", 3)
        Research.addResearch("AMORPHICCATALYST", "BLOODMAGIC", "aqua 18, ignis 15, terra 12, aer 9, ordo 6, perditio 3",
                6, -4, 3, ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.AMORPHICCATALYST", "Amorphic Catalyst")
        MineTweakerAPI.game.setLocalization("tc.research_text.AMORPHICCATALYST", "[BA] Mixed Catalyst")
        Research.addPrereq("AMORPHICCATALYST", "INFUSION", false)
        Research.addPrereq("AMORPHICCATALYST", "ALCHEMICCHEMSTRYSET", false)
        Research.setConcealed("AMORPHICCATALYST", true)
        Research.addPage("AMORPHICCATALYST", "bloodmagic.research_page.AMORPHICCATALYST")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.AMORPHICCATALYST",
                "Take a Reinforced Slate and infuse it with all magical ingredients you can make. Now you have a very powerful catalyst.")
        Infusion.addRecipe("AMORPHICCATALYST", ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crystallos", 0),
                        ItemBracketHandler.getItem("AWWayofTime:sanctus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crepitous", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0)),
                "aqua 16, ignis 16, terra 16, aer 16, ordo 16, perditio 16",
                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0), 5)
        Research.addInfusionPage("AMORPHICCATALYST", ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))
        Warp.addToResearch("AMORPHICCATALYST", 2)
        Research.addResearch("BIDIAMONDBLOCK", "BLOODMAGIC", "aqua 18, ignis 15, victus 12, ignis 9, ira 6, perditio 3",
                8, -4, 3, ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.BIDIAMONDBLOCK", "Blood Infused Diamond Block")
        MineTweakerAPI.game.setLocalization("tc.research_text.BIDIAMONDBLOCK", "[BA] A Blood Diamond Block")
        Research.addPrereq("BIDIAMONDBLOCK", "INFUSION", false)
        Research.addPrereq("BIDIAMONDBLOCK", "AMORPHICCATALYST", false)
        Research.setConcealed("BIDIAMONDBLOCK", true)
        Research.addPage("BIDIAMONDBLOCK", "bloodmagic.research_page.BIDIAMONDBLOCK")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.BIDIAMONDBLOCK",
                "The Blood Infused Diamond Block is made out of 9 Blood Diamonds in the Infusion Process. It is requiered for the Blood Infused Diamond Tools")
        Infusion.addRecipe("BIDIAMONDBLOCK", ItemBracketHandler.getItem("minecraft:diamond_block", 0),
                arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0)),
                "ira 32, alienis 16, victus 24, ignis 48, aqua 64, perditio 16",
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0), 7)
        Research.addInfusionPage("BIDIAMONDBLOCK",
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0))
        Warp.addToResearch("BIDIAMONDBLOCK", 3)
        Research.addResearch("DIVINATIONSIGIL", "BLOODMAGIC",
                "vitreus 15, terra 12, instrumentum 9, praecantatio 6, metallum 3", 0, 2, 3,
                ItemBracketHandler.getItem("AWWayofTime:divinationSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.DIVINATIONSIGIL", "Divination Sigil")
        MineTweakerAPI.game.setLocalization("tc.research_text.DIVINATIONSIGIL", "[BM] How much Essence do you have?")
        Research.addPrereq("DIVINATIONSIGIL", "INFUSION", false)
        Research.addPrereq("DIVINATIONSIGIL", "NITOR", false)
        Research.addPrereq("DIVINATIONSIGIL", "BLOODALTAR", false)
        Research.setConcealed("DIVINATIONSIGIL", true)
        Research.addPage("DIVINATIONSIGIL", "bloodmagic.research_page.DIVINATIONSIGIL")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.DIVINATIONSIGIL",
                "The Divination Sigil is a tool added by Blood Magic that is used to check important details of both the Blood Altar and the player's network, including the altar tier and total Life Essence storage levels. While holding the Divination Sigil, there are two possible uses for the player. When aiming at a Blood Altar and right clicking, a chat printout will display the total essence stored within the altar, the current tier, and its maximum capacity. When right clicking anywhere else, a chat printout will display the total essence stored within the player's personal network.")

        //TODO Replace ("TConstruct:GlassPane", 0)
        //Infusion.addRecipe("DIVINATIONSIGIL", ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0)),
        //        "vitreus 24, terra 18, praecantatio 12, instrumentum 6, metallum 4",
        //        ItemBracketHandler.getItem("AWWayofTime:divinationSigil", 0), 3)

        Research.addInfusionPage("DIVINATIONSIGIL", ItemBracketHandler.getItem("AWWayofTime:divinationSigil", 0))
        Research.addResearch("SPEEDRUNE", "BLOODMAGIC", "motus 15, volatus 12, potentia 9, aer 6, fames 3", -2, 0, 3,
                ItemBracketHandler.getItem("AWWayofTime:speedRune", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SPEEDRUNE", "Speed Rune")
        MineTweakerAPI.game.setLocalization("tc.research_text.SPEEDRUNE", "[BM] How fast is your Altar?")
        Research.addPrereq("SPEEDRUNE", "INFUSION", false)
        Research.addPrereq("SPEEDRUNE", "BLOODALTAR", false)
        Research.setConcealed("SPEEDRUNE", true)
        Research.addPage("SPEEDRUNE", "bloodmagic.research_page.SPEEDRUNE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SPEEDRUNE",
                "The Speed Rune is a block added by Blood Magic that is used for upgrading the tier of the Blood Altar. The Speed Rune can be used interchangeably with any other rune. The Speed Rune does what its name implies, and provides a 20% increase to the processing speed of the Blood Altar.")
        Infusion.addRecipe("SPEEDRUNE", ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                "motus 24, volatus 24, potentia 18, aer 12, fames 4",
                ItemBracketHandler.getItem("AWWayofTime:speedRune", 0), 4)
        Research.addInfusionPage("SPEEDRUNE", ItemBracketHandler.getItem("AWWayofTime:speedRune", 0))
        Research.addResearch("IMPERFECTRITUALSTONE", "BLOODMAGIC", "auram 12, praecantatio 9, terra 6, tenebrae 3", -2,
                -2, 3, ItemBracketHandler.getItem("AWWayofTime:imperfectRitualStone", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.IMPERFECTRITUALSTONE", "Imperfect Ritual Stone")
        MineTweakerAPI.game.setLocalization("tc.research_text.IMPERFECTRITUALSTONE", "[BM] Basic but oho.")
        Research.addPrereq("IMPERFECTRITUALSTONE", "BLOODALTAR", false)
        Research.setConcealed("IMPERFECTRITUALSTONE", false)
        Research.addPage("IMPERFECTRITUALSTONE", "bloodmagic.research_page.IMPERFECTRITUALSTONE.1")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.IMPERFECTRITUALSTONE.1",
                "Imperfect Ritual Stone is a block from Blood Magic used in the construction of Rituals. The Imperfect Ritual Stone is used in weaker rituals, such as the Water Ritual. \r\nA weak ritual is simple but can be useful. Each is created by placing a specific block on top of an Imperfect Ritual Stone, then activated by Right-clicking the Stone. Each cost 5,000 Life Essence.")
        Research.addPage("IMPERFECTRITUALSTONE", "bloodmagic.research_page.IMPERFECTRITUALSTONE.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.IMPERFECTRITUALSTONE.2",
                "1. Water source block creates a thunderstorm.\r\n2. Block of coal summons a strong zombie.\r\n3. Lapis lazuli block makes it night time.\r\n4. Bedrock above grants Resistance II for 1 minute.")
        Arcane.addShaped("IMPERFECTRITUALSTONE", ItemBracketHandler.getItem("AWWayofTime:imperfectRitualStone", 0),
                "aer 15, ignis 15, aqua 15, terra 15, ordo 15, perditio 15",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:obsidian", 0),
                        ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                        ItemBracketHandler.getItem("minecraft:obsidian", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 0),
                                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:obsidian", 0),
                                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                                ItemBracketHandler.getItem("minecraft:obsidian", 0))))
        Research.addArcanePage("IMPERFECTRITUALSTONE",
                ItemBracketHandler.getItem("AWWayofTime:imperfectRitualStone", 0))
        Research.addResearch("RITUALSTONE", "BLOODMAGIC", "terra 15, ignis 12, tenebrae 9, praecantatio 6, aer 3", -2,
                -4, 3, ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.RITUALSTONE", "Ritual Stone")
        MineTweakerAPI.game.setLocalization("tc.research_text.RITUALSTONE", "[BM] Rituals")
        Research.addPrereq("RITUALSTONE", "INFUSION", false)
        Research.addPrereq("RITUALSTONE", "IMPERFECTRITUALSTONE", false)
        Research.setConcealed("RITUALSTONE", true)
        Research.addPage("RITUALSTONE", "bloodmagic.research_page.RITUALSTONE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RITUALSTONE",
                "The Ritual Stone is a block added by Blood Magic that is used to create various rituals, such as the Ritual of Binding. The Ritual Stones can be automatically placed and painted by the Ritual Diviner, or they can be manually placed and painted with the various Elemental Inks, such as the Elemental Inscription Tool: Air. The Ritual Stone is also used in the creation of the Master Ritual Stone.")
        Infusion.addRecipe("RITUALSTONE", ItemBracketHandler.getItem("AWWayofTime:imperfectRitualStone", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                "terra 24, ignis 18, tenebrae 12, praecantatio 6, aer 3",
                ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0), 6)
        Research.addInfusionPage("RITUALSTONE", ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0))
        Warp.addToResearch("RITUALSTONE", 1)
        Research.addResearch("SPELLTABLE", "BLOODMAGIC",
                "terra 18, ignis 15, tenebrae 12, praecantatio 9, aer 6, infernus 3", -4, -4, 3,
                ItemBracketHandler.getItem("AWWayofTime:blockHomHeart", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SPELLTABLE", "Spell Table")
        MineTweakerAPI.game.setLocalization("tc.research_text.SPELLTABLE", "[BM] Abrakadabra.....")
        Research.addPrereq("SPELLTABLE", "INFUSION", false)
        Research.addPrereq("SPELLTABLE", "RITUALSTONE", false)
        Research.setConcealed("SPELLTABLE", true)
        Research.addPage("SPELLTABLE", "bloodmagic.research_page.SPELLTABLE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SPELLTABLE",
                "The Spell Table is a block added by Blood Magic that is used as a focus for the Basic Spell System. It is used in conjunction with a Unbound Crystal and a Blood Altar. After crafting a Spell Table, place it next to a Blood Altar. After that, one must place a skull on the Spell table to determine what type of effect will ensue when casting the spell. A Skeleton Skull denotes an Offensive-Ranged spell, Wither Skull is Offensive-Melee, Zombie Head allows for Defensive Spells, and the Creeper Head is for Environmental spells. Once one has chosen what type of spell one wants, the player can place several items in the adjacent Blood Altar to denote exactly what spell one wants to cast.")
        Arcane.addShaped("SPELLTABLE", ItemBracketHandler.getItem("AWWayofTime:blockHomHeart", 0),
                "aer 40, ignis 40, terra 40, aqua 40, ordo 40, perditio 40",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:largeBloodStoneBrick", 0),
                        ItemBracketHandler.getItem("AWWayofTime:largeBloodStoneBrick", 0),
                        ItemBracketHandler.getItem("AWWayofTime:largeBloodStoneBrick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32744),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1))))
        Research.addArcanePage("SPELLTABLE", ItemBracketHandler.getItem("AWWayofTime:blockHomHeart", 0))
        Warp.addToResearch("SPELLTABLE", 4)
        Research.addResearch("MASTERRITUALSTONE", "BLOODMAGIC",
                "terra 18, ignis 15, tenebrae 12, praecantatio 9, aer 6, cognitio", -2, -6, 3,
                ItemBracketHandler.getItem("AWWayofTime:masterStone", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.MASTERRITUALSTONE", "Master Ritual Stone")
        MineTweakerAPI.game.setLocalization("tc.research_text.MASTERRITUALSTONE", "[BM] Let's start some Rituals")
        Research.addPrereq("MASTERRITUALSTONE", "INFUSION", false)
        Research.addPrereq("MASTERRITUALSTONE", "RITUALSTONE", false)
        Research.setConcealed("MASTERRITUALSTONE", true)
        Research.addPage("MASTERRITUALSTONE", "bloodmagic.research_page.MASTERRITUALSTONE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.MASTERRITUALSTONE",
                "The Master Ritual Stone is a block added by Blood Magic. The Master Ritual Stone is used in the creation of all rituals except for the weak rituals, such as the Water Ritual. The Master Ritual Stone is the center of each ritual as it is used to activate them. Sending a redstone signal into a Master Ritual Stone will cause the ritual to stop functioning. Removing this redstone signal will allow the ritual to continue running without it requiring a restart with an activation crystal.")
        Infusion.addRecipe("MASTERRITUALSTONE", ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1)),
                "terra 36, ignis 24, tenebrae 16, praecantatio 16, aer 8, cognitio 8",
                ItemBracketHandler.getItem("AWWayofTime:masterStone", 0), 8)
        Research.addInfusionPage("MASTERRITUALSTONE", ItemBracketHandler.getItem("AWWayofTime:masterStone", 0))
        Warp.addToResearch("MASTERRITUALSTONE", 2)
        Research.addResearch("WATERSIGIL", "BLOODMAGIC",
                "aqua 15, terra 12, instrumentum 9, praecantatio 6, metallum 3", 0, 4, 3,
                ItemBracketHandler.getItem("AWWayofTime:waterSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.WATERSIGIL", "Water Sigil")
        MineTweakerAPI.game.setLocalization("tc.research_text.WATERSIGIL", "[BM] Infinite water, anyone?")
        Research.addPrereq("WATERSIGIL", "INFUSION", false)
        Research.addPrereq("WATERSIGIL", "DIVINATIONSIGIL", false)
        Research.setConcealed("WATERSIGIL", true)
        Research.addPage("WATERSIGIL", "bloodmagic.research_page.WATERSIGIL")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.WATERSIGIL",
                "The Water Sigil acts as an alternative to a bucket of water, allowing for the creation of water source blocks at the cost of 200 LP per source block. This essence will be drawn from the network of the player who the sigil is bound to. The Water Sigil is also used in the creation of the Sigil of Elemental Affinity.")
        Infusion.addRecipe("WATERSIGIL", ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("witchery:divinerwater", 0),
                        ItemBracketHandler.getItem("IC2:itemCellEmpty", 1),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("IC2:itemCellEmpty", 1),
                        ItemBracketHandler.getItem("IC2:itemCellEmpty", 1),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("IC2:itemCellEmpty", 1)),
                "aqua 40, terra 32, praecantatio 24, instrumentum 16, metallum 8",
                ItemBracketHandler.getItem("AWWayofTime:waterSigil", 0), 5)
        Research.addInfusionPage("WATERSIGIL", ItemBracketHandler.getItem("AWWayofTime:waterSigil", 0))
        Warp.addToResearch("WATERSIGIL", 2)
        Research.addResearch("LAVASIGIL", "BLOODMAGIC",
                "ignis 15, terra 12, instrumentum 9, praecantatio 6, metallum 3", 0, 8, 3,
                ItemBracketHandler.getItem("AWWayofTime:lavaSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.LAVASIGIL", "Lava Sigil")
        MineTweakerAPI.game.setLocalization("tc.research_text.LAVASIGIL", "[BM] Contact with Liquid is highly uncommon")
        Research.addPrereq("LAVASIGIL", "INFUSION", false)
        Research.addPrereq("LAVASIGIL", "SIGILOFTHEBLOODLAMP", false)
        Research.setConcealed("LAVASIGIL", true)
        Research.addPage("LAVASIGIL", "bloodmagic.research_page.LAVASIGIL")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.LAVASIGIL",
                "The Lava Sigil is a tool added by Blood Magic. The Lava Sigil acts as an alternative to a bucket of lava, allowing for the creation of lava source blocks at the cost of 2,000 LP per source block. This essence will be drawn from the network of the player who the sigil is bound to. The Lava Sigil is also used in the creation of the Sigil of Elemental Affinity.")
        Infusion.addRecipe("LAVASIGIL", ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("witchery:divinerlava", 0),
                        ItemBracketHandler.getItem("IC2:itemCellEmpty", 2),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("IC2:itemCellEmpty", 2),
                        ItemBracketHandler.getItem("AWWayofTime:lavaCrystal", 0),
                        ItemBracketHandler.getItem("IC2:itemCellEmpty", 2),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("IC2:itemCellEmpty", 2)),
                "ignis 64, terra 40, praecantatio 32, instrumentum 24, metallum 16",
                ItemBracketHandler.getItem("AWWayofTime:lavaSigil", 0), 7)
        Research.addInfusionPage("LAVASIGIL", ItemBracketHandler.getItem("AWWayofTime:lavaSigil", 0))
        Warp.addToResearch("LAVASIGIL", 4)
        Research.addResearch("EMPTYCORE", "BLOODMAGIC", "vitreus 15, terra 12, lucrum 9, metallum 6, praecantatio 3", 0,
                -2, 3, ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1))
        MineTweakerAPI.game.setLocalization("tc.research_name.EMPTYCORE", "Empty Core")
        MineTweakerAPI.game.setLocalization("tc.research_text.EMPTYCORE", "[BM] All you need is a core")
        Research.addPrereq("EMPTYCORE", "INFUSION", false)
        Research.addPrereq("EMPTYCORE", "BLOODALTAR", false)
        Research.setConcealed("EMPTYCORE", true)
        Research.addPage("EMPTYCORE", "bloodmagic.research_page.EMPTYCORE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.EMPTYCORE",
                "The Empty Core is a component added by Blood Magic. It is used in the creation of the various cores, such as the Projectile Core, Self Core, Melee Core and Lava Crystal.")
        Arcane.addShaped("EMPTYCORE", ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                "aer 15, ignis 15, terra 15, aqua 15, ordo 15, perditio 15",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17306),
                                ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17306)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17351),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2))))
        Research.addArcanePage("EMPTYCORE", ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1))
        Research.addResearch("BMLAVACRYSTAL", "BLOODMAGIC", "ignis 15, infernus 12, terra 9, praecantatio 6, aer 3", 0,
                -4, 3, ItemBracketHandler.getItem("AWWayofTime:lavaCrystal", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.BMLAVACRYSTAL", "Lava Crystal")
        MineTweakerAPI.game.setLocalization("tc.research_text.BMLAVACRYSTAL", "[BM] TC Lava Crystal, Warded Glass...")
        Research.addPrereq("BMLAVACRYSTAL", "INFUSION", false)
        Research.addPrereq("BMLAVACRYSTAL", "EMPTYCORE", false)
        Research.addPrereq("BMLAVACRYSTAL", "LAVACRYSTAL", false)
        Research.addPrereq("BMLAVACRYSTAL", "WARDEDARCANA", false)
        Research.setConcealed("BMLAVACRYSTAL", true)
        Research.addPage("BMLAVACRYSTAL", "bloodmagic.research_page.BMLAVACRYSTAL")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.BMLAVACRYSTAL",
                "The Lava Crystal is used as a replacement fuel source in furnaces and engines. Rather than losing durability, the crystal drains 25 Life Essence from the player's network per operation. In order to use the Lava Crystal, it must first be bound to a player. To do this, right click while holding the crystal. Once bound to a player, it will begin to function as a fuel source. The Lava Crystal is also used in the creation of the Lava Sigil.")

        //TODO Replace ("TConstruct:materials", 7)
        //Infusion.addRecipe("BMLAVACRYSTAL", ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
        //        arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 7),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
        //        "ignis 24, terra 18, praecantatio 18, infernus 6, aer 6",
        //        ItemBracketHandler.getItem("AWWayofTime:lavaCrystal", 0), 4)

        Research.addInfusionPage("BMLAVACRYSTAL", ItemBracketHandler.getItem("AWWayofTime:lavaCrystal", 0))
        Research.addResearch("RUNESACRIFICE", "BLOODMAGIC",
                "fames 15, infernus 12, potentia 9, praecantatio 6, terra 3", -4, 0, 3,
                ItemBracketHandler.getItem("AWWayofTime:runeOfSacrifice", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.RUNESACRIFICE", "Rune of Sacrifice")
        MineTweakerAPI.game.setLocalization("tc.research_text.RUNESACRIFICE", "[BM] Very bloody")
        Research.addPrereq("RUNESACRIFICE", "INFUSION", false)
        Research.addPrereq("RUNESACRIFICE", "SPEEDRUNE", false)
        Research.setConcealed("RUNESACRIFICE", true)
        Research.addPage("RUNESACRIFICE", "bloodmagic.research_page.RUNESACRIFICE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RUNESACRIFICE",
                "The Rune of Sacrifice is a rune added by Blood Magic that is used in upgrading the tier of the Blood Altar. This rune can be used in place of other runes, and can work alongside each rune in the upgrade process. The Rune of Sacrifice will increase the total amount of LP gained by sacrificing mobs with a Dagger of Sacrifice by 10%.")
        Infusion.addRecipe("RUNESACRIFICE", ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
                "fames 24, infernus 24, potentia 18, praecantatio 12, terra 4",
                ItemBracketHandler.getItem("AWWayofTime:runeOfSacrifice", 0), 5)
        Research.addInfusionPage("RUNESACRIFICE", ItemBracketHandler.getItem("AWWayofTime:runeOfSacrifice", 0))
        Research.addResearch("RUNESELFSACRIFICE", "BLOODMAGIC",
                "fames 15, infernus 12, lucrum 9, praecantatio 6, terra 3", -4, 2, 3,
                ItemBracketHandler.getItem("AWWayofTime:runeOfSelfSacrifice", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.RUNESELFSACRIFICE", "Rune of Self Sacrifice")
        MineTweakerAPI.game.setLocalization("tc.research_text.RUNESELFSACRIFICE", "[BM] Even more bloody")
        Research.addPrereq("RUNESELFSACRIFICE", "INFUSION", false)
        Research.addPrereq("RUNESELFSACRIFICE", "SPEEDRUNE", false)
        Research.setConcealed("RUNESELFSACRIFICE", true)
        Research.addPage("RUNESELFSACRIFICE", "bloodmagic.research_page.RUNESELFSACRIFICE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RUNESELFSACRIFICE",
                "The Rune of Self-Sacrifice is a rune added by Blood Magic that is used in upgrading the tier of the Blood Altar. This rune can be used in place of other runes, and can work alongside each rune in the upgrade process. The Rune of Sacrifice will increase the total amount of LP gained by using a Sacrificial Dagger by 10%.")
        Infusion.addRecipe("RUNESELFSACRIFICE", ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:sanctus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:sanctus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
                "fames 24, infernus 24, lucrum 18, praecantatio 12, terra 4",
                ItemBracketHandler.getItem("AWWayofTime:runeOfSelfSacrifice", 0), 5)
        Research.addInfusionPage("RUNESELFSACRIFICE", ItemBracketHandler.getItem("AWWayofTime:runeOfSelfSacrifice", 0))
        Research.addResearch("AIRSIGIL", "BLOODMAGIC",
                "volatus 21, aer 18, motus 15, praecantatio 12, iter 9, potentia 6, cognitio 3", 0, 10, 4,
                ItemBracketHandler.getItem("AWWayofTime:airSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.AIRSIGIL", "Air Sigil")
        MineTweakerAPI.game.setLocalization("tc.research_text.AIRSIGIL", "[BM] Fly like a bird but don't look down.")
        Research.addPrereq("AIRSIGIL", "INFUSION", false)
        Research.addPrereq("AIRSIGIL", "LAVASIGIL", false)
        Research.setConcealed("AIRSIGIL", true)
        Research.addPage("AIRSIGIL", "bloodmagic.research_page.AIRSIGIL")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.AIRSIGIL",
                "The Air Sigil is a sigil added by Blood Magic that grants the user access to a basic method of flight at the cost of LP. Upon right clicking with the Air Sigil, the user will be launched in the direction they are facing at the cost of 50 LP per click. Do note, however, that the user is still vulnerable to fall damage without a form of protection, such as the Sigil of Elemental Affinity.")
        Infusion.addRecipe("AIRSIGIL", ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30004),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30004),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30004),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30004),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0)),
                "volatus 64, aer 48, motus 32, praecantatio 24, iter 18, potentia 12, cognitio 6",
                ItemBracketHandler.getItem("AWWayofTime:airSigil", 0), 9)
        Research.addInfusionPage("AIRSIGIL", ItemBracketHandler.getItem("AWWayofTime:airSigil", 0))
        Warp.addToResearch("AIRSIGIL", 6)
        Research.addResearch("FASTERMINING", "BLOODMAGIC",
                "instrumentum 15, perfodio 12, praecantatio 9, metallum 6, motus 3", -2, 4, 3,
                ItemBracketHandler.getItem("AWWayofTime:sigilOfTheFastMiner", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.FASTERMINING", "Sigil of Faster Mining")
        MineTweakerAPI.game.setLocalization("tc.research_text.FASTERMINING", "[BM] Haste II and you?")
        Research.addPrereq("FASTERMINING", "INFUSION", false)
        Research.addPrereq("FASTERMINING", "DIVINATIONSIGIL", false)
        Research.setConcealed("FASTERMINING", true)
        Research.addPage("FASTERMINING", "bloodmagic.research_page.FASTERMINING")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.FASTERMINING",
                "The Sigil of the Fast Miner is a tool added by Blood Magic. The Sigil of the Fast Miner grants the user Haste II at the cost of Life Essence (LP). Upon activating the Sigil of the Fast Miner, 100 LP will be consumed from the owner's network to grant the user Haste II. Every ten seconds after activation, an additional 100 LP will be consumed to continue granting the user Haste II.")
        Infusion.addRecipe("FASTERMINING", ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemPickThaumium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemShovelThaumium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                        ItemBracketHandler.getItem("Thaumcraft:ItemAxeThaumium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0)),
                "instrumentum 36, praecantatio 24, metallum 18, perfodio 12, motus 8",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfTheFastMiner", 0), 5)
        Research.addInfusionPage("FASTERMINING", ItemBracketHandler.getItem("AWWayofTime:sigilOfTheFastMiner", 0))
        Warp.addToResearch("FASTERMINING", 2)
        Research.addResearch("GREENGROW", "BLOODMAGIC", "instrumentum 15, terra 12, herba 9, arbor 6, victus 3", 2, 4,
                3, ItemBracketHandler.getItem("AWWayofTime:growthSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.GREENGROW", "Sigil of the Green Grow")
        MineTweakerAPI.game.setLocalization("tc.research_text.GREENGROW", "[BM] Who needs a green thumb?")
        Research.addPrereq("GREENGROW", "INFUSION", false)
        Research.addPrereq("GREENGROW", "DIVINATIONSIGIL", false)
        Research.setConcealed("GREENGROW", true)
        Research.addPage("GREENGROW", "bloodmagic.research_page.GREENGROW")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.GREENGROW",
                "The Sigil of the Green Grove is a sigil added by Blood Magic. When activated, the sigil will speed the growth of all nearby plants in a manner similar to the Ritual of the Green Grove. Upon activating the Sigil of the Green Grove, additional growth ticks will be applied to all plants within a six block radius of the player. This effect will consume 150 LP per five seconds. Right clicking on a plant will cause a bonemeal effect to be activated on that plant, consuming 150 LP per click. This effect can only be applied to plants that can have their growth sped up by Bonemeal.")

        //TODO Replace ("TConstruct:slime.sapling", 0)
        //Infusion.addRecipe("GREENGROW", ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
        //        arrayOf(ItemBracketHandler.getItem("witchery:witchsapling", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
        //                ItemBracketHandler.getItem("witchery:witchsapling", 1),
        //                ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 1),
        //                ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:blockCustomPlant", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
        //                ItemBracketHandler.getItem("TConstruct:slime.sapling", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:terrae", 0)),
        //        "instrumentum 36, terra 24, herba 18, arbor 12, victus 8",
        //        ItemBracketHandler.getItem("AWWayofTime:growthSigil", 0), 5)

        Research.addInfusionPage("GREENGROW", ItemBracketHandler.getItem("AWWayofTime:growthSigil", 0))
        Warp.addToResearch("GREENGROW", 2)
        Research.addResearch("VOIDSIGIL", "BLOODMAGIC", "vacuos 15, terra 12, auram 9, praecantatio 6, metallum 3", -2,
                6, 3, ItemBracketHandler.getItem("AWWayofTime:voidSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.VOIDSIGIL", "Void Sigil")
        MineTweakerAPI.game.setLocalization("tc.research_text.VOIDSIGIL", "[BM] Better than a swiffer!")
        Research.addPrereq("VOIDSIGIL", "INFUSION", false)
        Research.addPrereq("VOIDSIGIL", "WATERSIGIL", false)
        Research.setConcealed("VOIDSIGIL", true)
        Research.addPage("VOIDSIGIL", "bloodmagic.research_page.VOIDSIGIL")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.VOIDSIGIL",
                "The Void Sigil is a tool added by Blood Magic. The Void Sigil is used to remove source blocks of liquid at a small LP cost. When used in conjunction with the Lava Sigil or Water Sigil, it can be useful in cleaning up accidental liquid placement. In order to use the Void Sigil, it must first be bound to a player. This can be done by right clicking with the sigil. Once bound, right clicking any placed liquid source block will cause it to disappear, at the cost of 50 LP and the liquid.")
        Infusion.addRecipe("VOIDSIGIL", ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970),
                        ItemBracketHandler.getItem("minecraft:bucket", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("minecraft:bucket", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("minecraft:bucket", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("minecraft:bucket", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17970)),
                "vacuos 64, terra 40, praecantatio 32, auram 24, metallum 16",
                ItemBracketHandler.getItem("AWWayofTime:voidSigil", 0), 7)
        Research.addInfusionPage("VOIDSIGIL", ItemBracketHandler.getItem("AWWayofTime:voidSigil", 0))
        Warp.addToResearch("VOIDSIGIL", 4)
        Research.addResearch("SIGILOFSWIMMING", "BLOODMAGIC",
                "aer 21, aqua 18, vacuos 15, terra 12, auram 9, praecantatio 6, metallum 3", -4, 8, 3,
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_swimming", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFSWIMMING", "Sigil of Swimming")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFSWIMMING", "[BA] Like a fish")
        Research.addPrereq("SIGILOFSWIMMING", "INFUSION", false)
        Research.addPrereq("SIGILOFSWIMMING", "VOIDSIGIL", false)
        Research.setConcealed("SIGILOFSWIMMING", true)
        Research.addPage("SIGILOFSWIMMING", "bloodmagic.research_page.SIGILOFSWIMMING")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFSWIMMING",
                "The Sigil of Swimming allows the player to move faster, break faster, and breath underwater! So you are able now to rebuild Atlantis.")
        val s8 = "SIGILOFSWIMMING"
        val item8 = ItemBracketHandler.getItem("AWWayofTime:voidSigil", 0)
        val array2 = arrayOfNulls<IItemStack>(10)
        array2[0] = ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)
        array2[1] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30711)
        val n7 = 2
        val item9 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap13 = HashMap<String, IData>()
        val s9 = "Fluid"
        val hashMap14 = HashMap<String, IData>()
        hashMap14["FluidName"] = ExpandString.asData("liquidoxygen")
        hashMap14["Amount"] = ExpandInt.toData(1000)
        hashMap13[s9] = ExpandAnyDict.asData(hashMap14)
        array2[n7] = item9.withTag(ExpandAnyDict.asData(hashMap13))
        array2[3] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30711)
        val n8 = 4
        val item10 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap15 = HashMap<String, IData>()
        val s10 = "Fluid"
        val hashMap16 = HashMap<String, IData>()
        hashMap16["FluidName"] = ExpandString.asData("liquidoxygen")
        hashMap16["Amount"] = ExpandInt.toData(1000)
        hashMap15[s10] = ExpandAnyDict.asData(hashMap16)
        array2[n8] = item10.withTag(ExpandAnyDict.asData(hashMap15))
        array2[5] = ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)
        val n9 = 6
        val item11 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap17 = HashMap<String, IData>()
        val s11 = "Fluid"
        val hashMap18 = HashMap<String, IData>()
        hashMap18["FluidName"] = ExpandString.asData("liquidoxygen")
        hashMap18["Amount"] = ExpandInt.toData(1000)
        hashMap17[s11] = ExpandAnyDict.asData(hashMap18)
        array2[n9] = item11.withTag(ExpandAnyDict.asData(hashMap17))
        array2[7] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30711)
        val n10 = 8
        val item12 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap19 = HashMap<String, IData>()
        val s12 = "Fluid"
        val hashMap20 = HashMap<String, IData>()
        hashMap20["FluidName"] = ExpandString.asData("liquidoxygen")
        hashMap20["Amount"] = ExpandInt.toData(1000)
        hashMap19[s12] = ExpandAnyDict.asData(hashMap20)
        array2[n10] = item12.withTag(ExpandAnyDict.asData(hashMap19))
        array2[9] = ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30711)
        Infusion.addRecipe(s8, item8, array2,
                "aer 64, aqua 64, vacuos 64, terra 48, praecantatio 32, auram 24, metallum 16",
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_swimming", 0), 12)
        Research.addInfusionPage("SIGILOFSWIMMING", ItemBracketHandler.getItem("BloodArsenal:sigil_of_swimming", 0))
        Warp.addToResearch("SIGILOFSWIMMING", 6)
        Research.addResearch("BLOODLETTERSPACK", "BLOODMAGIC", "telum 15, sano 12, lucrum 9, tutamen 6, pannus 3", 2,
                -4, 3, ItemBracketHandler.getItem("AWWayofTime:itemBloodPack", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.BLOODLETTERSPACK", "Blood Letters Pack")
        MineTweakerAPI.game.setLocalization("tc.research_text.BLOODLETTERSPACK", "[BM] This pack really chaffs...")
        Research.addPrereq("BLOODLETTERSPACK", "SACRIFICIALKNIFE", false)
        Research.setConcealed("BLOODLETTERSPACK", true)
        Research.addPage("BLOODLETTERSPACK", "bloodmagic.research_page.BLOODLETTERSPACK")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.BLOODLETTERSPACK",
                "The Blood Letter's Pack is a piece of armor added by Blood Magic. Wearing the armor does one heart of damage a second and fills 100 LP per heart and will not reduce a player's health below 5 hearts. The Pack stores up to 10000 LP, upgrades unknown. The Blood Letter's Pack is used to store LP while away from the Altar. Using a filled Pack on the Altar will transfer stored LP into the Altar's buffer tank.")
        Arcane.addShaped("BLOODLETTERSPACK", ItemBracketHandler.getItem("AWWayofTime:itemBloodPack", 0),
                "aer 15, ignis 15, terra 30, aqua 30, ordo 30, perditio 30",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:sacrificialKnife", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ItemChestplateThaumium", 0),
                                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                                ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0))))
        Research.addArcanePage("BLOODLETTERSPACK", ItemBracketHandler.getItem("AWWayofTime:itemBloodPack", 0))

        //TODO Replace ("TConstruct:heavyPlate", 251)
        //val s13 = "IMBUEARMOR"
        //val s14 = "BLOODMAGIC"
        //val s15 = "sano 15 , tutamen 12, praecantatio 9, metallum 6, potentia 3"
        //val n11 = 4
        //val n12 = -6
        //val n13 = 3
        //val item13 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_chestplate", 0)
        //val hashMap21 = HashMap<String, IData>()
        //hashMap21["LPStored"] = ExpandInt.toData(0)
        //Research.addResearch(s13, s14, s15, n11, n12, n13, item13.withTag(ExpandAnyDict.asData(hashMap21)))
        //MineTweakerAPI.game.setLocalization("tc.research_name.IMBUEARMOR", "Life Imbue Armor")
        //MineTweakerAPI.game.setLocalization("tc.research_text.IMBUEARMOR", "[BM] Life for blood")
        //Research.addPrereq("IMBUEARMOR", "BLOODLETTERSPACK", false)
        //Research.setConcealed("IMBUEARMOR", true)
        //Research.addPage("IMBUEARMOR", "bloodmagic.research_page.IMBUEARMOR")
        //MineTweakerAPI.game.setLocalization("bloodmagic.research_page.IMBUEARMOR",
        //        "The Life Imbued Armor is a powerful armor able to store Life Essence and utilize it to protect the wearer. Wearing this full set of armor will randomly heal you completely for the cost of LE inside the armor. Can be refilled in the Life Infuser.")
        //val s16 = "IMBUEARMOR"
        //val item14 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_helmet", 0)
        //val hashMap22 = HashMap<String, IData>()
        //hashMap22["LPStored"] = ExpandInt.toData(0)
        //Arcane.addShaped(s16, item14.withTag(ExpandAnyDict.asData(hashMap22)),
        //        "terra 30, ignis 30, ordo 30, perditio 30",
        //        arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251)),
        //                arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("Thaumcraft:ItemHelmetThaumium", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251)),
        //                arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolHardHammer"), null)))
        //val s17 = "IMBUEARMOR"
        //val item15 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_helmet", 0)
        //val hashMap23 = HashMap<String, IData>()
        //hashMap23["LPStored"] = ExpandInt.toData(0)
        //Research.addArcanePage(s17, item15.withTag(ExpandAnyDict.asData(hashMap23)))
        //Warp.addToResearch("IMBUEARMOR", 2)
        //val s18 = "IMBUEARMOR"
        //val item16 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_chestplate", 0)
        //val hashMap24 = HashMap<String, IData>()
        //hashMap24["LPStored"] = ExpandInt.toData(0)
        //Arcane.addShaped(s18, item16.withTag(ExpandAnyDict.asData(hashMap24)),
        //        "terra 60, ignis 60, ordo 60, perditio 60",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemChestplateThaumium", 0),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251)),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        OreBracketHandler.getOre("craftingToolHardHammer"),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251))))
        //val s19 = "IMBUEARMOR"
        //val item17 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_chestplate", 0)
        //val hashMap25 = HashMap<String, IData>()
        //hashMap25["LPStored"] = ExpandInt.toData(0)
        //Research.addArcanePage(s19, item17.withTag(ExpandAnyDict.asData(hashMap25)))
        //val s20 = "IMBUEARMOR"
        //val item18 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_leggings", 0)
        //val hashMap26 = HashMap<String, IData>()
        //hashMap26["LPStored"] = ExpandInt.toData(0)
        //Arcane.addShaped(s20, item18.withTag(ExpandAnyDict.asData(hashMap26)),
        //        "terra 45, ignis 45, ordo 45, perditio 45",
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("Thaumcraft:ItemLeggingsThaumium", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251)),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        OreBracketHandler.getOre("craftingToolHardHammer"),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251))))
        //val s21 = "IMBUEARMOR"
        //val item19 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_leggings", 0)
        //val hashMap27 = HashMap<String, IData>()
        //hashMap27["LPStored"] = ExpandInt.toData(0)
        //Research.addArcanePage(s21, item19.withTag(ExpandAnyDict.asData(hashMap27)))
        //val s22 = "IMBUEARMOR"
        //val item20 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_boots", 0)
        //val hashMap28 = HashMap<String, IData>()
        //hashMap28["LPStored"] = ExpandInt.toData(0)
        //Arcane.addShaped(s22, item20.withTag(ExpandAnyDict.asData(hashMap28)),
        //        "terra 30, ignis 30, ordo 30, perditio 30", arrayOf(arrayOfNulls(3),
        //        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemBootsThaumium", 0),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251)),
        //        arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                OreBracketHandler.getOre("craftingToolHardHammer"),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251))))
        //val s23 = "IMBUEARMOR"
        //val item21 = ItemBracketHandler.getItem("BloodArsenal:life_imbued_boots", 0)
        //val hashMap29 = HashMap<String, IData>()
        //hashMap29["LPStored"] = ExpandInt.toData(0)
        //Research.addArcanePage(s23, item21.withTag(ExpandAnyDict.asData(hashMap29)))

        Research.addResearch("WEAKORB", "BLOODMAGIC", "vitreus 9, potentia 6, praecantatio 3", 2, 0, 2,
                ItemBracketHandler.getItem("dreamcraft:item.WeakOrb", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.WEAKORB", "Weak Orb")
        MineTweakerAPI.game.setLocalization("tc.research_text.WEAKORB", "[BM] Orb transformation Tier I")
        Research.addPrereq("WEAKORB", "BLOODALTAR", false)
        Research.setConcealed("WEAKORB", true)
        Research.addPage("WEAKORB", "bloodmagic.research_page.WEAKORB")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.WEAKORB",
                "When you have created a Raw Orb Tier 1 out of Gregtech materials you have to think about how it can become a Blood Orb. The first step is adding magic to the orb. After that you need to fill it with the Blood from the Blood Altar to get a Weak Blood Orb")
        Arcane.addShaped("WEAKORB", ItemBracketHandler.getItem("dreamcraft:item.WeakOrb", 0),
                "aer 20, aqua 20, ignis 20, terra 20, perditio 20, ordo 20",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("gemDiamond"), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.RawOrbTier1", 0),
                                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("gemDiamond"), null)))
        Research.addArcanePage("WEAKORB", ItemBracketHandler.getItem("dreamcraft:item.WeakOrb", 0))
        Warp.addToResearch("WEAKORB", 1)
        Research.addResearch("APPRENTICEORB", "BLOODMAGIC", "vitreus 12, potentia 9, praecantatio 6, cognitio 3", 4, 0,
                3, ItemBracketHandler.getItem("dreamcraft:item.ApprenticeOrb", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.APPRENTICEORB", "Apprentice Orb")
        MineTweakerAPI.game.setLocalization("tc.research_text.APPRENTICEORB", "[BM] Orb transformation Tier II")
        Research.addPrereq("APPRENTICEORB", "WEAKORB", false)
        Research.setConcealed("APPRENTICEORB", true)
        Research.addPage("APPRENTICEORB", "bloodmagic.research_page.APPRENTICEORB")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.APPRENTICEORB",
                "When you have created a Raw Orb Tier 2 out of Gregtech materials you have to think about how it can become a Blood Orb. The first step is adding magic to the orb. After that you need to fill it with the Blood from the Blood Altar to get an Apprentice Blood Orb.")
        Arcane.addShaped("APPRENTICEORB", ItemBracketHandler.getItem("dreamcraft:item.ApprenticeOrb", 0),
                "aer 40, aqua 40, ignis 40, terra 40, perditio 40, ordo 40",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("gemFlawlessEmerald"), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.RawOrbTier2", 0),
                                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("gemFlawlessEmerald"), null)))
        Research.addArcanePage("APPRENTICEORB", ItemBracketHandler.getItem("dreamcraft:item.ApprenticeOrb", 0))
        Warp.addToResearch("APPRENTICEORB", 2)
        Research.addResearch("MAGICANORB", "BLOODMAGIC", "vitreus 15, potentia 12, praecantatio 9, cognitio 6, sano 3",
                6, 0, 3, ItemBracketHandler.getItem("dreamcraft:item.MagicianOrb", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.MAGICANORB", "Magician's Orb")
        MineTweakerAPI.game.setLocalization("tc.research_text.MAGICANORB", "[BM] Orb transformation Tier III")
        Research.addPrereq("MAGICANORB", "APPRENTICEORB", false)
        Research.setConcealed("MAGICANORB", true)
        Research.addPage("MAGICANORB", "bloodmagic.research_page.MAGICANORB")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.MAGICANORB",
                "When you have created a Raw Orb Tier 3 out of Gregtech materials you have to think about how it can become a Blood Orb. The first step is adding magic to the orb. After that you need to fill it with the Blood from the Blood Altar to get a Magician's Blood Orb.")
        Arcane.addShaped("MAGICANORB", ItemBracketHandler.getItem("dreamcraft:item.MagicianOrb", 0),
                "aer 60, aqua 60, ignis 60, terra 60, perditio 60, ordo 60",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockGold"), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.RawOrbTier3", 0),
                                ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("blockGold"), null)))
        Research.addArcanePage("MAGICANORB", ItemBracketHandler.getItem("dreamcraft:item.MagicianOrb", 0))
        Warp.addToResearch("MAGICANORB", 3)
        Research.addResearch("MASTERORB", "BLOODMAGIC",
                "vitreus 18, potentia 15, praecantatio 12, cognitio 9, sano 6, aqua 3", 8, 0, 3,
                ItemBracketHandler.getItem("dreamcraft:item.MasterOrb", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.MASTERORB", "Master Orb")
        MineTweakerAPI.game.setLocalization("tc.research_text.MASTERORB", "[BM] Orb transformation Tier IV")
        Research.addPrereq("MASTERORB", "MAGICANORB", false)
        Research.setConcealed("MASTERORB", true)
        Research.addPage("MASTERORB", "bloodmagic.research_page.MASTERORB")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.MASTERORB",
                "When you have created a Raw Orb Tier 4 out of Gregtech materials you have to think about how it can become a Blood Orb. The first step is adding magic to the orb. After that you need to fill it with the Blood from the Blood Altar to get a Master Blood Orb.")
        Arcane.addShaped("MASTERORB", ItemBracketHandler.getItem("dreamcraft:item.MasterOrb", 0),
                "aer 80, aqua 80, ignis 80, terra 80, perditio 80, ordo 80",
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                                ItemBracketHandler.getItem("dreamcraft:item.RawOrbTier4", 0),
                                ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0), null)))
        Research.addArcanePage("MASTERORB", ItemBracketHandler.getItem("dreamcraft:item.MasterOrb", 0))
        Warp.addToResearch("MASTERORB", 4)
        Research.addResearch("ARCHMAGEORB", "BLOODMAGIC",
                "vitreus 21, potentia 18, praecantatio 15, cognitio 12, sano 9, aqua 6, infernus 3", 10, 0, 4,
                ItemBracketHandler.getItem("dreamcraft:item.ArchmageOrb", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ARCHMAGEORB", "Archmage's Orb")
        MineTweakerAPI.game.setLocalization("tc.research_text.ARCHMAGEORB", "[BM] Orb transformation Tier V")
        Research.addPrereq("ARCHMAGEORB", "MASTERORB", false)
        Research.setConcealed("ARCHMAGEORB", true)
        Research.addPage("ARCHMAGEORB", "bloodmagic.research_page.ARCHMAGEORB")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ARCHMAGEORB",
                "When you have created a Raw Orb Tier 5 out of Gregtech materials you have to think about how it can become a Blood Orb. The first step is adding magic to the orb. After that you need to fill it with the Blood from the Blood Altar to get an Archmage's Blood Orb.")
        Arcane.addShaped("ARCHMAGEORB", ItemBracketHandler.getItem("dreamcraft:item.ArchmageOrb", 0),
                "aer 100, aqua 100, ignis 100, terra 100, perditio 100, ordo 100",
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                                ItemBracketHandler.getItem("dreamcraft:item.RawOrbTier5", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0),
                                null)))
        Research.addArcanePage("ARCHMAGEORB", ItemBracketHandler.getItem("dreamcraft:item.ArchmageOrb", 0))
        Warp.addToResearch("ARCHMAGEORB", 5)
        Research.addResearch("TRANSCENDENTORB", "BLOODMAGIC",
                "vitreus 24, potentia 21, praecantatio 18, cognitio 15, sano 12, aqua 9, infernus 6, electrum 3", 12, 0,
                4, ItemBracketHandler.getItem("dreamcraft:item.TranscendentOrb", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.TRANSCENDENTORB", "Transcendent Orb")
        MineTweakerAPI.game.setLocalization("tc.research_text.TRANSCENDENTORB", "[BM] Orb transformation Tier VI")
        Research.addPrereq("TRANSCENDENTORB", "ARCHMAGEORB", false)
        Research.setConcealed("TRANSCENDENTORB", true)
        Research.addPage("TRANSCENDENTORB", "bloodmagic.research_page.TRANSCENDENTORB")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.TRANSCENDENTORB",
                "When you have created a Raw Orb Tier 6 out of Gregtech materials you have to think about how it can become a Blood Orb. The first step is adding magic to the orb. After that you need to fill it with the Blood from the Blood Altar to get an Transcendent Blood Orb.")
        Arcane.addShaped("TRANSCENDENTORB", ItemBracketHandler.getItem("dreamcraft:item.TranscendentOrb", 0),
                "aer 150, aqua 150, ignis 150, terra 150, perditio 150, ordo 150",
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:blockCrystal", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("BloodArsenal:sigil_of_lightning", 1),
                                ItemBracketHandler.getItem("dreamcraft:item.RawOrbTier6", 0),
                                ItemBracketHandler.getItem("BloodArsenal:sigil_of_lightning", 1)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:blockCrystal", 0), null)))
        Research.addArcanePage("TRANSCENDENTORB", ItemBracketHandler.getItem("dreamcraft:item.TranscendentOrb", 0))
        Warp.addToResearch("TRANSCENDENTORB", 6)
        Research.addResearch("TRANSPARENTORB", "BLOODMAGIC",
                "vitreus 27, potentia 24, praecantatio 21, cognitio 18, sano 15, aqua 12, infernus 9, electrum 6, alienis 3",
                14, 0, 4, ItemBracketHandler.getItem("BloodArsenal:transparent_orb", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.TRANSPARENTORB", "Transparent Orb")
        MineTweakerAPI.game.setLocalization("tc.research_text.TRANSPARENTORB",
                "[BM] How much Life Points are in your Orb?")
        Research.addPrereq("TRANSPARENTORB", "TRANSCENDENTORB", false)
        Research.setConcealed("TRANSPARENTORB", true)
        Research.addPage("TRANSPARENTORB", "bloodmagic.research_page.TRANSPARENTORB")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.TRANSPARENTORB",
                "Transparent Orb: Did you ever want to know how much Liefe Essence is in your Blood Orb? Now you can. Dynamic measuring of Liefe Points! Magical.")
        Arcane.addShaped("TRANSPARENTORB", ItemBracketHandler.getItem("BloodArsenal:transparent_orb", 0),
                "aer 175, aqua 175, ignis 175, terra 175, perditio 175, ordo 175",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_lamp", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0),
                                ItemBracketHandler.getItem("AWWayofTime:transcendentBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                                ItemBracketHandler.getItem("AWWayofTime:divinationSigil", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0))))
        Research.addArcanePage("TRANSPARENTORB", ItemBracketHandler.getItem("BloodArsenal:transparent_orb", 0))
        Warp.addToResearch("TRANSPARENTORB", 7)
        Research.addResearch("EMPTYSOCKET", "BLOODMAGIC", "terra 15, tutamen 12, praecantatio 9, tenebrae 6, sano 3", 2,
                -6, 3, ItemBracketHandler.getItem("AWWayofTime:emptySocket", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.EMPTYSOCKET", "Empty Socket")
        MineTweakerAPI.game.setLocalization("tc.research_text.EMPTYSOCKET", "[BM] Hmm, this does not seem to work...")
        Research.addPrereq("EMPTYSOCKET", "BLOODLETTERSPACK", false)
        Research.setConcealed("EMPTYSOCKET", true)
        Research.addPage("EMPTYSOCKET", "bloodmagic.research_page.EMPTYSOCKET")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.EMPTYSOCKET",
                "The Empty Socket is a block added by Blood Magic that is used in the creation of the Filled Socket. The Empty Socket is the first step in creating Bound Armour, such as the Bound Chestplate.")
        Arcane.addShaped("EMPTYSOCKET", ItemBracketHandler.getItem("AWWayofTime:emptySocket", 0),
                "aer 50, aqua 50, ignis 50, terra 50, perditio 50, ordo 50",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                ItemBracketHandler.getItem("dreamcraft:tile.DiamondFrameBox", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0))))
        Research.addArcanePage("EMPTYSOCKET", ItemBracketHandler.getItem("AWWayofTime:emptySocket", 0))
        Warp.addToResearch("EMPTYSOCKET", 2)
        Research.addResearch("SOULARMORFORGE", "BLOODMAGIC",
                "tutamen 18, metallum 15, praecantatio 12, praecantatio 9, tenebrae 6, exanimis 3", 2, -8, 3,
                ItemBracketHandler.getItem("AWWayofTime:armourForge", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SOULARMORFORGE", "Soul Armor Forge")
        MineTweakerAPI.game.setLocalization("tc.research_text.SOULARMORFORGE", "[BM] Demonic Armor")
        Research.addPrereq("SOULARMORFORGE", "INFUSION", false)
        Research.addPrereq("SOULARMORFORGE", "EMPTYSOCKET", false)
        Research.setConcealed("SOULARMORFORGE", true)
        Research.addPage("SOULARMORFORGE", "bloodmagic.research_page.SOULARMORFORGE.1")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SOULARMORFORGE.1",
                "The Soul Armour Forge is a block added by Blood Magic. The Soul Armour Forge is used to create the pieces of the Bound Armour, such as the Bound Helmet and Bound Chestplate. To create the Soul Armour Forge and all pieces of Bound Armour, 28 Filled Sockets are required. n order to use the Soul Armour Forge, it must be placed in the world and surrounded with Filled Sockets forming the shape of the desired piece of armor. In order to function properly, the Soul Armour Forge must touch as many Filled Sockets as possible with the layout, such as the picture to the right. Laying the sockets both horizontally and vertically will work.")
        Research.addPage("SOULARMORFORGE", "bloodmagic.research_page.SOULARMORFORGE.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SOULARMORFORGE.2",
                " Once the sockets have been placed, right clicking on them with a sigil, blood orb, or blood shard will place them into the sockets, binding them to that piece of armor.")

        //TODO Replace ("TConstruct:ToolForgeBlock", 6)
        //Infusion.addRecipe("SOULARMORFORGE", ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 6),
        //        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodSocket", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
        //                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2),
        //                ItemBracketHandler.getItem("AWWayofTime:bloodSocket", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2),
        //                ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:bloodSocket", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2),
        //                ItemBracketHandler.getItem("AWWayofTime:bloodSocket", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2),
        //                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3)),
        //        "tutamen 64, metallum 40, praecantatio 32, auram 24, tenebrae 16, exanimis 8",
        //        ItemBracketHandler.getItem("AWWayofTime:armourForge", 0), 7)

        Research.addInfusionPage("SOULARMORFORGE", ItemBracketHandler.getItem("AWWayofTime:armourForge", 0))
        Warp.addToResearch("SOULARMORFORGE", 4)
        Research.addResearch("RUNEOFARGUMENTEDCAPACITY", "BLOODMAGIC",
                "aqua 18, fames 15, lucrum 12, praecantatio 9, terra 6, vacuos 3", -6, 0, 3,
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 1))
        MineTweakerAPI.game.setLocalization("tc.research_name.RUNEOFARGUMENTEDCAPACITY", "Rune of Augmented Capacity")
        MineTweakerAPI.game.setLocalization("tc.research_text.RUNEOFARGUMENTEDCAPACITY", "[BM] Pimp my Altar")
        Research.addPrereq("RUNEOFARGUMENTEDCAPACITY", "INFUSION", false)
        Research.addPrereq("RUNEOFARGUMENTEDCAPACITY", "RUNESACRIFICE", false)
        Research.setConcealed("RUNEOFARGUMENTEDCAPACITY", true)
        Research.addPage("RUNEOFARGUMENTEDCAPACITY", "bloodmagic.research_page.RUNEOFARGUMENTEDCAPACITY")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RUNEOFARGUMENTEDCAPACITY",
                "The Rune of Augmented Capacity is a rune added by Blood Magic that is used in upgrading the tier of the Blood Altar. This rune can be used in place of other runes, and can work alongside each rune in the upgrade process. The Rune of Augmented Capacity adds an additional 2,000 LP storage potential to the Blood Altar. This also increases the tank's internal buffer as it is always 10% of the altar's capacity.")
        Infusion.addRecipe("RUNEOFARGUMENTEDCAPACITY", ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                arrayOf(ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("BuildCraft|Factory:tankBlock", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
                "aqua 32, lucrum 24, fames 18, praecantatio 12, terra 8, vacuos 4",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 1), 7)
        Research.addInfusionPage("RUNEOFARGUMENTEDCAPACITY",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 1))
        Research.addResearch("RUNEOFDISLOCATION", "BLOODMAGIC",
                "aqua 18, praecantatio 15, motus 12 tempus 9, terra 9, cognitio 3", -6, 2, 3,
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 2))
        MineTweakerAPI.game.setLocalization("tc.research_name.RUNEOFDISLOCATION", "Rune of Dislocation")
        MineTweakerAPI.game.setLocalization("tc.research_text.RUNEOFDISLOCATION", "[BM] That was quick")
        Research.addPrereq("RUNEOFDISLOCATION", "INFUSION", false)
        Research.addPrereq("RUNEOFDISLOCATION", "RUNESACRIFICE", false)
        Research.setConcealed("RUNEOFDISLOCATION", true)
        Research.addPage("RUNEOFDISLOCATION", "bloodmagic.research_page.RUNEOFDISLOCATION")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RUNEOFDISLOCATION",
                "The Rune of Dislocation is a rune added by Blood Magic that is used in upgrading the tier of the Blood Altar. This rune can be used in place of other runes, and can work alongside each rune in the upgrade process. The Rune of Dislocation increases the speed by which LP can be pumped into and out of the Blood Altar at a multiplicative 20% rate.")
        Infusion.addRecipe("RUNEOFDISLOCATION", ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32613),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32613),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
                "aqua 32, praecantatio 24, motus 18, tempus 12, terra 8, cognitio 4",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 2), 7)
        Research.addInfusionPage("RUNEOFDISLOCATION",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 2))
        Research.addResearch("SIGILOFELEMENTALAFFINITY", "BLOODMAGIC",
                "volatus 27, ignis 24, aqua 21, aer 18, motus 15, praecantatio 12, iter 9, potentia 6, cognitio 3", 0,
                12, 4, ItemBracketHandler.getItem("AWWayofTime:sigilOfElementalAffinity", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFELEMENTALAFFINITY", "Sigil of Elemental Affinity")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFELEMENTALAFFINITY",
                "[BM] Burned, drowned or falling to death no more")
        Research.addPrereq("SIGILOFELEMENTALAFFINITY", "INFUSION", false)
        Research.addPrereq("SIGILOFELEMENTALAFFINITY", "AIRSIGIL", false)
        Research.setConcealed("SIGILOFELEMENTALAFFINITY", true)
        Research.addPage("SIGILOFELEMENTALAFFINITY", "bloodmagic.research_page.SIGILOFELEMENTALAFFINITY")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFELEMENTALAFFINITY",
                "The Sigil of Elemental Affinity is a sigil added by Blood Magic that grants the user several forms of environmental protection. These forms of protection range from fall damage negation, to water breathing, to fire immunity, all at a small LP cost while active. Upon right click, the sigil will activate and grant the user water breathing, fire (and lava) immunity, and fall damage negation at the cost of 300 LP every 10 seconds.")
        Infusion.addRecipe("SIGILOFELEMENTALAFFINITY", ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:earthScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:lavaSigil", 0),
                        ItemBracketHandler.getItem("AWWayofTime:fireScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:waterSigil", 0),
                        ItemBracketHandler.getItem("AWWayofTime:waterScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:airSigil", 0),
                        ItemBracketHandler.getItem("AWWayofTime:airScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
                "volatus 64, aer 48, aqua 48, ignis 48, motus 32, praecantatio 24, iter 18, potentia 12, cognitio 6",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfElementalAffinity", 0), 9)
        Research.addInfusionPage("SIGILOFELEMENTALAFFINITY",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfElementalAffinity", 0))
        Warp.addToResearch("SIGILOFELEMENTALAFFINITY", 8)
        Research.addResearch("SIGILOFLIGHTNING", "BLOODMAGIC",
                "tempestas 24, aer 21, aqua 18, terra 15, potentia 12, tenebrae 9, ira 6, electrum 3", 2, 14, 4,
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_lightning", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFLIGHTNING", "Sigil of Lightning")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFLIGHTNING", "[BA] Lightning Strike")
        Research.addPrereq("SIGILOFLIGHTNING", "INFUSION", false)
        Research.addPrereq("SIGILOFLIGHTNING", "SIGILOFELEMENTALAFFINITY", false)
        Research.setConcealed("SIGILOFLIGHTNING", true)
        Research.addPage("SIGILOFLIGHTNING", "bloodmagic.research_page.SIGILOFLIGHTNING")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFLIGHTNING",
                "The Lightning Sigil is a very powerful sigil that summons lightning wherever you point and click! It has 5 different modes. Mode 1 one Lighning Strike, mode 2 two lightning stricks....")
        Infusion.addRecipe("SIGILOFLIGHTNING", ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:airSigil", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
                        ItemBracketHandler.getItem("AWWayofTime:waterSigil", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0)),
                "tempestas 32, aer 72, aqua 72, terra 64, potentia 48, tenebrae 8, ira 8, electrum 16",
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_lightning", 0), 15)
        Research.addInfusionPage("SIGILOFLIGHTNING", ItemBracketHandler.getItem("BloodArsenal:sigil_of_lightning", 0))
        Warp.addToResearch("SIGILOFLIGHTNING", 12)
        Research.addResearch("SIGILOFHOLDING", "BLOODMAGIC",
                "lucrum 18, cognitio 15, gula 12, superbia 9, limus 6, praecantatio 3", 4, 6, 3,
                ItemBracketHandler.getItem("AWWayofTime:sigilOfHolding", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFHOLDING", "Sigil of Holding")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFHOLDING", "[BM] Up to 5 Slots")
        Research.addPrereq("SIGILOFHOLDING", "INFUSION", false)
        Research.addPrereq("SIGILOFHOLDING", "SIGILOFMAGNETISM", false)
        Research.setConcealed("SIGILOFHOLDING", true)
        Research.addPage("SIGILOFHOLDING", "bloodmagic.research_page.SIGILOFHOLDING")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFHOLDING",
                "The Sigil of Holding is a tool added by Blood Magic. The Sigil of Holding is used to save inventory space by combining several sigils into a single one. When used, the Sigil of Holding will consume a single sigil per sneak-right click, starting at the left of the hotbar, and ending at the right of the hotbar. Sneak-right clicking will filter between the stored sigils, while right clicking will activate the displayed sigil. To separate the stored sigils from the Sigil of Holding, a Ritual of Unbinding must be used.")
        Infusion.addRecipe("SIGILOFHOLDING", ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("IronChest:BlockIronChest", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crepitous", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crepitous", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                "lucrum 32, cognitio 24, gula 16, superbia 16, limus 16, praecantatio 8",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfHolding", 0), 9)
        Research.addInfusionPage("SIGILOFHOLDING", ItemBracketHandler.getItem("AWWayofTime:sigilOfHolding", 0))
        Warp.addToResearch("SIGILOFHOLDING", 2)
        Research.addResearch("SIGILOFAUGMENTETHOLDING", "BLOODMAGIC",
                "vacuos 21, lucrum 18, cognitio 15, gula 12, superbia 9, limus 6, praecantatio 3", 4, 8, 3,
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_augmented_holding", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFAUGMENTETHOLDING", "Sigil of Augmented Holding")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFAUGMENTETHOLDING", "[BA] Up to 9 Slots")
        Research.addPrereq("SIGILOFAUGMENTETHOLDING", "INFUSION", false)
        Research.addPrereq("SIGILOFAUGMENTETHOLDING", "SIGILOFHOLDING", false)
        Research.setConcealed("SIGILOFAUGMENTETHOLDING", true)
        Research.addPage("SIGILOFAUGMENTETHOLDING", "bloodmagic.research_page.SIGILOFAUGMENTETHOLDING")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFAUGMENTETHOLDING",
                "The Sigil of Augmented Holding is an upgraded variant of the Sigil of Holding and holds 9 sigils in total! When used, the Sigil of Augmented Holding will consume a single sigil per sneak-right click, starting at the left of the hotbar, and ending at the right of the hotbar. Sneak-right clicking will filter between the stored sigils, while right clicking will activate the displayed sigil. To separate the stored sigils from the Sigil of Holding, a Ritual of Unbinding must be used.")
        Infusion.addRecipe("SIGILOFAUGMENTETHOLDING", ItemBracketHandler.getItem("AWWayofTime:sigilOfHolding", 0),
                arrayOf(ItemBracketHandler.getItem("IronChest:BlockIronChest", 2),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17977),
                        ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_rod", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17977),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)),
                "vacuos 48, lucrum 32, cognitio 24, gula 16, superbia 16, limus 16, praecantatio 8",
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_augmented_holding", 0), 15)
        Research.addInfusionPage("SIGILOFAUGMENTETHOLDING",
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_augmented_holding", 0))
        Warp.addToResearch("SIGILOFAUGMENTETHOLDING", 4)
        Research.addResearch("SIGILOFPHANTOMBRIDGE", "BLOODMAGIC",
                "terra 18, alienis 15, iter 12, vitreus 9, potentia 6, praecantatio 3", -4, 6, 3,
                ItemBracketHandler.getItem("AWWayofTime:sigilOfTheBridge", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFPHANTOMBRIDGE", "Sigil of Phantom Bridge")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFPHANTOMBRIDGE", "[BM] Air Walker")
        Research.addPrereq("SIGILOFPHANTOMBRIDGE", "INFUSION", false)
        Research.addPrereq("SIGILOFPHANTOMBRIDGE", "VOIDSIGIL", false)
        Research.setConcealed("SIGILOFPHANTOMBRIDGE", true)
        Research.addPage("SIGILOFPHANTOMBRIDGE", "bloodmagic.research_page.SIGILOFPHANTOMBRIDGE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFPHANTOMBRIDGE",
                "The Sigil of the Phantom Bridge is an item added by the Blood Magic mod. When active, this Sigil creates a 5x5 platform of Spectral Block centered at the Player. Spectral Blocks outside of the platform will vanish after 5 seconds. These blocks can be broken instantly with a hit and 'Right-clicking' on one with another block will replace the Spectral Block. This can be used to build in mid-air. Crouching will create a layer below you. Activating this Sigil costs 150 LP every 10 seconds while active, plus 1 LP per block created, until deactivated.")
        Infusion.addRecipe("SIGILOFPHANTOMBRIDGE", ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1),
                        ItemBracketHandler.getItem("EnderIO:blockIngotStorage", 7),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1),
                        ItemBracketHandler.getItem("EnderIO:blockIngotStorage", 7),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1),
                        ItemBracketHandler.getItem("EnderIO:blockIngotStorage", 7),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1),
                        ItemBracketHandler.getItem("EnderIO:blockIngotStorage", 7)),
                "terra 48, alienis 32, iter 24, vitreus 16, potentia 8, praecantatio 8",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfTheBridge", 0), 9)
        Research.addInfusionPage("SIGILOFPHANTOMBRIDGE", ItemBracketHandler.getItem("AWWayofTime:sigilOfTheBridge", 0))
        Warp.addToResearch("SIGILOFPHANTOMBRIDGE", 4)
        Research.addResearch("SIGILOFMAGNETISM", "BLOODMAGIC",
                "magneto 21, potentia 18, electrum 15, praecantatio 12, auram 6, cognitio 3", 2, 6, 3,
                ItemBracketHandler.getItem("AWWayofTime:sigilOfMagnetism", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFMAGNETISM", "Sigil of Magnetism")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFMAGNETISM", "[BM] Magic Magnet")
        Research.addPrereq("SIGILOFMAGNETISM", "INFUSION", false)
        Research.addPrereq("SIGILOFMAGNETISM", "WATERSIGIL", false)
        Research.setConcealed("SIGILOFMAGNETISM", true)
        Research.addPage("SIGILOFMAGNETISM", "bloodmagic.research_page.SIGILOFMAGNETISM")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFMAGNETISM",
                "The Sigil of Magnetism is a tool added by Blood Magic. The Sigil of Magnetism acts as an item magnet with a radius of five blocks at the cost of Life Essence (LP). Upon activating the Sigil of Magnetism, 75 LP will be consumed from the owner's network to act as an item magnet for the user. Every ten seconds after activation, an additional 75 LP will be consumed to continue acting as an item magnet. This effect has a radius of five blocks, centered on the player.")
        Infusion.addRecipe("SIGILOFMAGNETISM", ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.blockmetal5", 1),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmetal5", 1),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmetal5", 1),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.blockmetal5", 1),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                "potentia 32, magneto 24, electrum 24, auram 16, cognitio 12, praecantatio 6",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfMagnetism", 0), 9)
        Research.addInfusionPage("SIGILOFMAGNETISM", ItemBracketHandler.getItem("AWWayofTime:sigilOfMagnetism", 0))
        Warp.addToResearch("SIGILOFMAGNETISM", 2)
        Research.addResearch("SIGILOFTHEBLOODLAMP", "BLOODMAGIC",
                "lux 18, ignis 15, aer 12, potentia 9, sensus 6, praecantatio 3, ", 0, 6, 3,
                ItemBracketHandler.getItem("AWWayofTime:itemBloodLightSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFTHEBLOODLAMP", "Sigil of the Blood Lamp")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFTHEBLOODLAMP", "[BM] Bloody light all around")
        Research.addPrereq("SIGILOFTHEBLOODLAMP", "INFUSION", false)
        Research.addPrereq("SIGILOFTHEBLOODLAMP", "WATERSIGIL", false)
        Research.setConcealed("SIGILOFTHEBLOODLAMP", true)
        Research.addPage("SIGILOFTHEBLOODLAMP", "bloodmagic.research_page.SIGILOFTHEBLOODLAMP")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFTHEBLOODLAMP",
                "The Sigil of the Blood Lamp is a tool added by Blood Magic. The sigil allows the user to create a Blood Light anywhere by right-clicking a block. The Blood Light emits light and is often used to light player's bases. It can also function as a ranged weapon. While holding the Sigil of the Blood Lamp, right clicking on a block will consume 30 LP to place a Blood Light at that location. Right clicking the sigil while not facing a block will shoot a small projectile from the sigil, dealing half a heart of damage on impact.")
        Infusion.addRecipe("SIGILOFTHEBLOODLAMP", ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                arrayOf(ItemBracketHandler.getItem("ThaumicTinkerer:brightNitor", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6),
                        ItemBracketHandler.getItem("ThaumicTinkerer:brightNitor", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6)),
                "lux 48, ignis 32, aer 32, potentia 24, sensus 16, praecantatio 8",
                ItemBracketHandler.getItem("AWWayofTime:itemBloodLightSigil", 0), 4)
        Research.addInfusionPage("SIGILOFTHEBLOODLAMP",
                ItemBracketHandler.getItem("AWWayofTime:itemBloodLightSigil", 0))
        Warp.addToResearch("SIGILOFTHEBLOODLAMP", 3)
        Research.addResearch("SIGILOFSIGHT", "BLOODMAGIC", "ordo 15, sensus 12, cognitio 9, vitreus 6, praecantatio 3",
                2, 2, 3, ItemBracketHandler.getItem("AWWayofTime:seerSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFSIGHT", "Sigil of Sight")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFSIGHT", "[BM] Blood Altar Infos for free")
        Research.addPrereq("SIGILOFSIGHT", "INFUSION", false)
        Research.addPrereq("SIGILOFSIGHT", "DIVINATIONSIGIL", false)
        Research.setConcealed("SIGILOFSIGHT", true)
        Research.addPage("SIGILOFSIGHT", "bloodmagic.research_page.SIGILOFSIGHT")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFSIGHT",
                "The Sigil of Sight is an item from Blood Magic. When used on a Blood Altar it shows the item progress, consumption rate, current essence, and input and output tanks. Using this Sigil costs 0 LP per use.When socketed into Bound Armor, the Sigil of Sight has no effect.")

        //TODO Replace ("TConstruct:GlassPane", 0)
        //Infusion.addRecipe("SIGILOFSIGHT", ItemBracketHandler.getItem("AWWayofTime:divinationSigil", 0),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:crystallos", 0),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("Thaumcraft:ItemZombieBrain", 0),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:crystallos", 0),
        //                ItemBracketHandler.getItem("TConstruct:GlassPane", 0)),
        //        "ordo 24, sensus 18, cognitio 12, vitreus 6, praecantatio 4",
        //        ItemBracketHandler.getItem("AWWayofTime:seerSigil", 0), 3)

        Research.addInfusionPage("SIGILOFSIGHT", ItemBracketHandler.getItem("AWWayofTime:seerSigil", 0))
        Research.addResearch("RITUALDIVINER", "BLOODMAGIC", "aer 18, ignis 15, terra 12, aqua 9, perditio 6, ordo 3",
                -2, -8, 3, ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.RITUALDIVINER", "Ritual Diviner")
        MineTweakerAPI.game.setLocalization("tc.research_text.RITUALDIVINER", "[BM] New Rituals")
        Research.addPrereq("RITUALDIVINER", "INFUSION", false)
        Research.addPrereq("RITUALDIVINER", "MASTERRITUALSTONE", false)
        Research.setConcealed("RITUALDIVINER", true)
        Research.addPage("RITUALDIVINER", "bloodmagic.research_page.RITUALDIVINER.1")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RITUALDIVINER.1",
                "The Ritual Diviner is an item added by the Blood Magic mod.\r\nA tool to help with the construction of Rituals. Shift+Right-clicking it will cycle through the available rituals. The tooltip will display the number and type of Ritual Stones required to build the selected ritual. Right-clicking on a Master Ritual Stone with it will place and ink the ritual stones needed for the ritual. Placing a stone will use Life Essence, a ritual stone from the user's inventory and will cause the diviner to animate and emit green particles. The ritual diviner will not replace existing blocks.")
        Infusion.addRecipe("RITUALDIVINER", ItemBracketHandler.getItem("AWWayofTime:seerSigil", 0),
                arrayOf(ItemBracketHandler.getItem("witchery:chalkritual", 0),
                        ItemBracketHandler.getItem("AWWayofTime:waterScribeTool", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("AWWayofTime:fireScribeTool", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501),
                        ItemBracketHandler.getItem("AWWayofTime:earthScribeTool", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("AWWayofTime:airScribeTool", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29501)),
                "aer 32, ignis 32, terra 32, aqua 32, perditio 16, ordo 16",
                ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 0), 3)
        Research.addInfusionPage("RITUALDIVINER", ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 0))
        Warp.addToResearch("RITUALDIVINER", 3)
        Research.addPage("RITUALDIVINER", "bloodmagic.research_page.RITUALDIVINER.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RITUALDIVINER.2",
                "If it tries and fails to place a stone it will animate but will not emit any particles. The mage will need to clear out the obstruction for placement to continue. Snow, tall grass and torches are common, yet easily overlooked, obstructions. There are 3 tiers of Diviner, tier 1 places elemental runes, tier 2 can place a dusk runes and tier 3 can place a dawn rune. There is a tooltip that indicates the tier of a diviner. Attempting to build a ritual that requires dusk runes with the diviner that can't place them will cause it to act as if the ritual is complete when it is not.")
        Infusion.addRecipe("RITUALDIVINER", ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)),
                "aer 48, ignis 48, terra 48, aqua 48, perditio 24, ordo 24",
                ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 1), 6)
        Research.addInfusionPage("RITUALDIVINER", ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 1))
        Infusion.addRecipe("RITUALDIVINER", ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 1),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0)),
                "aer 64, ignis 64, terra 64, aqua 64, perditio 32, ordo 32",
                ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 2), 9)
        Research.addInfusionPage("RITUALDIVINER", ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 2))
        Research.addResearch("RUNEOFTHEORB", "BLOODMAGIC", "potentia 15, victus 12, motus 9, lucrum 6, praecantatio 3",
                -6, -2, 3, ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 3))
        MineTweakerAPI.game.setLocalization("tc.research_name.RUNEOFTHEORB", "Rune of the Orb")
        MineTweakerAPI.game.setLocalization("tc.research_text.RUNEOFTHEORB", "[BM] More Runes")
        Research.addPrereq("RUNEOFTHEORB", "INFUSION", false)
        Research.addPrereq("RUNEOFTHEORB", "RUNESACRIFICE", false)
        Research.setConcealed("RUNEOFTHEORB", true)
        Research.addPage("RUNEOFTHEORB", "bloodmagic.research_page.RUNEOFTHEORB")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RUNEOFTHEORB",
                "The Rune of the Orb is an upgrade component for the Blood Altar.\r\nEach Rune of the Orb increases the amount of LP that can be transferred into a Soul Network by 2% of its original value. For the Weak Blood Orb this is 100 LP per rune, but for the Archmage's Blood Orb it is 200,000 LP.")
        Infusion.addRecipe("RUNEOFTHEORB", ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3)),
                "potentia 32, victus 24, motus 16, lucrum 8, praecantatio 4",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 3), 6)
        Research.addInfusionPage("RUNEOFTHEORB",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 3))
        Research.addResearch("RUNEOFSUPERIORCAPACITY", "BLOODMAGIC",
                "potentia 18, aqua 15, cognitio 12, lucrum 9, praecantatio 6, alienis 3", -8, -2, 3,
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 4))
        MineTweakerAPI.game.setLocalization("tc.research_name.RUNEOFSUPERIORCAPACITY", "Rune of Superior Capacity")
        MineTweakerAPI.game.setLocalization("tc.research_text.RUNEOFSUPERIORCAPACITY", "[BM] More Blood")
        Research.addPrereq("RUNEOFSUPERIORCAPACITY", "INFUSION", false)
        Research.addPrereq("RUNEOFSUPERIORCAPACITY", "RUNEOFARGUMENTEDCAPACITY", false)
        Research.setConcealed("RUNEOFSUPERIORCAPACITY", true)
        Research.addPage("RUNEOFSUPERIORCAPACITY", "bloodmagic.research_page.RUNEOFSUPERIORCAPACITY.1")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RUNEOFSUPERIORCAPACITY.1",
                "The Rune of Superior Capacity is an upgrade component for the Blood Altar. Each one increases the capacity of the altar by 10% LP. These are multiplicative: two is 21%, three is 33% and so on. With fewer than 15 runes dedicated to capacity, it is more efficient to use Runes of Augmented Capacity. The effects of having both runes of augmented capacity and runes of superior capacity stack, but runes of superior capacity do NOT multiply the 2,000 added by each rune of augmented capacity, only the original 10,000.")
        Research.addPage("RUNEOFSUPERIORCAPACITY", "bloodmagic.research_page.RUNEOFSUPERIORCAPACITY.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RUNEOFSUPERIORCAPACITY.2",
                "The capacity of your altar can be calculated with the formula: (2000*A) + (10000)*(1.1)^S\r\nWhere A is equal to the number of Runes of Augmented Capacity and S is equal to the number of Runes of Superior Capacity are in place.")
        Infusion.addRecipe("RUNEOFSUPERIORCAPACITY", ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                arrayOf(ItemBracketHandler.getItem("irontank:diamondTank", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 24),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("irontank:diamondTank", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 24),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)),
                "potentia 48, aqua 32, cognitio 24, lucrum 16, praecantatio 8, alienis 4, ",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 4), 8)
        Research.addInfusionPage("RUNEOFSUPERIORCAPACITY",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 4))
        Research.addResearch("RUNEOFACCELERATION", "BLOODMAGIC",
                "potentia 21, tempus 18, cognitio 15, aqua 12, motus 9, praecantatio 6, terra 3", -8, 0, 3,
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 5))
        MineTweakerAPI.game.setLocalization("tc.research_name.RUNEOFACCELERATION", "Rune of Acceleration")
        MineTweakerAPI.game.setLocalization("tc.research_text.RUNEOFACCELERATION", "[BM] More Speed")
        Research.addPrereq("RUNEOFACCELERATION", "INFUSION", false)
        Research.addPrereq("RUNEOFACCELERATION", "RUNEOFARGUMENTEDCAPACITY", false)
        Research.addPrereq("RUNEOFACCELERATION", "RUNEOFDISLOCATION", false)
        Research.setConcealed("RUNEOFACCELERATION", true)
        Research.addPage("RUNEOFACCELERATION", "bloodmagic.research_page.RUNEOFACCELERATION")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.RUNEOFACCELERATION",
                "Rune of Dislocation increases the amount of fluid that is moved from one tank to the other each action. Rune of Acceleration increases the frequency of those actions.")
        Infusion.addRecipe("RUNEOFACCELERATION", ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 2),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 24),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32614),
                        ItemBracketHandler.getItem("AWWayofTime:speedRune", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 24),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32614)),
                "potentia 64, aqua 48, motus 32, cognitio 24, tempus 16, praecantatio 8, terra 4",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 5), 10)
        Research.addInfusionPage("RUNEOFACCELERATION",
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 5))
        Research.addResearch("ARCANEPEDESTALANDPLINTH", "BLOODMAGIC",
                "ignis 15, terra 12, tenebrae 9, alienis 6, praecantatio 3", -4, -6, 3,
                ItemBracketHandler.getItem("AWWayofTime:blockPedestal", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ARCANEPEDESTALANDPLINTH", "Arcane Pedestal")
        MineTweakerAPI.game.setLocalization("tc.research_text.ARCANEPEDESTALANDPLINTH", "[BM] Let's summon some Demons")
        Research.addPrereq("ARCANEPEDESTALANDPLINTH", "INFUSION", false)
        Research.addPrereq("ARCANEPEDESTALANDPLINTH", "MASTERRITUALSTONE", false)
        Research.setConcealed("ARCANEPEDESTALANDPLINTH", true)
        Research.addPage("ARCANEPEDESTALANDPLINTH", "bloodmagic.research_page.ARCANEPEDESTALANDPLINTH.1")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ARCANEPEDESTALANDPLINTH.1",
                "The Arcane Pedestal is a block added by Blood Magic. When used in conjunction with an Arcane Plinth, the pedestals allow for the summoning of Demons and Elementals based upon what items are placed on them. The Arcane Pedestal is also used in the crafting of the Arcane Plinth.")
        Arcane.addShaped("ARCANEPEDESTALANDPLINTH", ItemBracketHandler.getItem("AWWayofTime:blockPedestal", 0),
                "ignis 30, terra 30, ordo 30, perditio 30,",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:largeBloodStoneBrick", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockStoneDevice", 1),
                                ItemBracketHandler.getItem("AWWayofTime:largeBloodStoneBrick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7))))
        Research.addArcanePage("ARCANEPEDESTALANDPLINTH", ItemBracketHandler.getItem("AWWayofTime:blockPedestal", 0))
        Research.addPage("ARCANEPEDESTALANDPLINTH", "bloodmagic.research_page.ARCANEPEDESTALANDPLINTH.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ARCANEPEDESTALANDPLINTH.2",
                "The Arcane Plinth is a block added by Blood Magic. It is used in conjunction with Arcane Pedestals to summon Demons and Elementals. The Arcane Plinth is the center of the summoning circle, and must have the correct tier or higher blood orb placed on it in order to finish the summon.")
        Infusion.addRecipe("ARCANEPEDESTALANDPLINTH", ItemBracketHandler.getItem("AWWayofTime:blockPedestal", 0),
                arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 130),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 130),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 130),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 130)),
                "metallum 64, ignis 48, terra 32, tenebrae 24, praecantatio 16, alienis 8",
                ItemBracketHandler.getItem("AWWayofTime:blockPlinth", 0), 10)
        Research.addInfusionPage("ARCANEPEDESTALANDPLINTH", ItemBracketHandler.getItem("AWWayofTime:blockPlinth", 0))
        Research.addPage("ARCANEPEDESTALANDPLINTH", "bloodmagic.research_page.ARCANEPEDESTALANDPLINTH.3")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ARCANEPEDESTALANDPLINTH.3",
                "The Arcane Plinth is the central block used to create a Summoning Circle in order to call forth demons from beyond. The Summoning Circle consists of three separate tiers, with each successive capable of summoning more powerful demons.Summoning a demon requires that you place a particular set of items upon the pedestals surrounding the Arcane Plinth. The items may be placed in any order and position. Placing an item onto a pedestal functions identically to placing items in a Blood Altar - right click with the item in hand to place it on the pedestal. You may also remove items from the Arcane Pedestal or Arcane Plinth by right clicking it with an empty hand. In addition to the required ingredients, each demon requires that a blood orb be placed atop the Arcane Plinth.")
        Research.addPage("ARCANEPEDESTALANDPLINTH", "bloodmagic.research_page.ARCANEPEDESTALANDPLINTH.4")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ARCANEPEDESTALANDPLINTH.4",
                "The blood orb can be placed at any time during the summoning process, or simply left atop the Arcane Plinth between summons. If the items were placed correctly lightning will strike each pedestal in turn, consuming the placed items as it strikes. When all items are consumed, the Arcane Plinth will be struck with lightning and the demon will be summoned.")
        Warp.addToResearch("ARCANEPEDESTALANDPLINTH", 2)
        Research.addResearch("ALCHEMICCALCINATOR", "BLOODMAGIC",
                "praecantatio 18, vitreus 15, terra 12, perditio 9, aqua 6, ignis 3", -4, -8, 3,
                ItemBracketHandler.getItem("AWWayofTime:blockAlchemicCalcinator", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ALCHEMICCALCINATOR", "Alchemic Calcinator")
        MineTweakerAPI.game.setLocalization("tc.research_text.ALCHEMICCALCINATOR", "[BM] Brewing some magical things")
        Research.addPrereq("ALCHEMICCALCINATOR", "ARCANEPEDESTALANDPLINTH", false)
        Research.setConcealed("ALCHEMICCALCINATOR", true)
        Research.addPage("ALCHEMICCALCINATOR", "bloodmagic.research_page.ALCHEMICCALCINATOR")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ALCHEMICCALCINATOR",
                "The Alchemic Calcinator converts one reagent into 1,000 AR, consuming 2,000 LP in the process. The produced AR flows into the internal buffer of 2,000 AR, from where it slowly goes into the 4,000 AR main tank. The main tank will output to a single target container. This can be disabled by applying a Redstone signal. To insert an orb or a reagent simply Right-click the Calcinator with it. An orb must be first inserted in order to activate it. The Calcinator needs to be hooked up to a target container such as a Crystal Belljar in order to tranfer AR, set the destination using an Alchemic Router. To clear already set destinations use an Alchemic Cleanser.")
        Arcane.addShaped("ALCHEMICCALCINATOR", ItemBracketHandler.getItem("AWWayofTime:blockAlchemicCalcinator", 0),
                "ignis 50, aqua 50, terra 50, aer 50, ordo 50, perditio 50",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 15),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 15)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                ItemBracketHandler.getItem("witchery:cauldron", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7))))
        Research.addArcanePage("ALCHEMICCALCINATOR",
                ItemBracketHandler.getItem("AWWayofTime:blockAlchemicCalcinator", 0))
        Warp.addToResearch("ALCHEMICCALCINATOR", 3)
        Research.addResearch("ALCHEMICTOOLS", "BLOODMAGIC",
                "terra 15, praecantatio 12, instrumentum 9, potentia 6, aer 3", -4, -12, 3,
                ItemBracketHandler.getItem("AWWayofTime:itemAttunedCrystal", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ALCHEMICTOOLS", "Alchemic Tools")
        MineTweakerAPI.game.setLocalization("tc.research_text.ALCHEMICTOOLS", "[BM] Let's link it")
        Research.addPrereq("ALCHEMICTOOLS", "ALCHEMICCALCINATOR", false)
        Research.setConcealed("ALCHEMICTOOLS", true)
        Research.addPage("ALCHEMICTOOLS", "bloodmagic.research_page.ALCHEMICTOOLS.1")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ALCHEMICTOOLS.1",
                "The Alchemic Router is the item needed to establish links between containers (Calcinators, Relays, Belljars & Master Ritual Stones). To create a new link, select the source container by right-clicking it with the Router. Next, select the destination container by right-clicking it with the router. The Router can be set to only create links for a certain reagent. Shift right-click a container to cycle through the different types of reagents stored. You can clear the router's saved source coordinates by shift right-clicking the router into the air. All links have a maximum range of 5 blocks (this may be subject to change).")
        Arcane.addShaped("ALCHEMICTOOLS", ItemBracketHandler.getItem("AWWayofTime:itemAttunedCrystal", 0),
                "terra 15, ordo 15, aer 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0), null),
                        arrayOf<IIngredient?>(null,
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0), null,
                                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0))))
        Research.addArcanePage("ALCHEMICTOOLS", ItemBracketHandler.getItem("AWWayofTime:itemAttunedCrystal", 0))
        Research.addPage("ALCHEMICTOOLS", "bloodmagic.research_page.ALCHEMICTOOLS.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ALCHEMICTOOLS.2",
                "The Alchemic cleanser is an item used to remove links created with the Alchemic Router. When right-clicked on any container, it removes all outgoing links from that container to others.")
        Arcane.addShaped("ALCHEMICTOOLS", ItemBracketHandler.getItem("AWWayofTime:itemDestinationClearer", 0),
                "terra 15, aer 15, perditio 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                                null, ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0))))
        Research.addArcanePage("ALCHEMICTOOLS", ItemBracketHandler.getItem("AWWayofTime:itemDestinationClearer", 0))
        Research.addPage("ALCHEMICTOOLS", "bloodmagic.research_page.ALCHEMICTOOLS.3")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ALCHEMICTOOLS.3",
                "The Alchemic Segmenter can be used to limit the number of tanks used for a certain type of AR. Shift right-click on a container to cycle through its reagent types until you have the one you want to restrict. Then, left-click the target container until you have the right max number of tanks. Example: You can limit a Relay (which has two tanks) to have a maximum of 1 tank of Praesidium, 1 tank of Potentia and 1 tank of Sanctus.")
        Arcane.addShaped("ALCHEMICTOOLS", ItemBracketHandler.getItem("AWWayofTime:itemTankSegmenter", 0),
                "terra 15, aer 15, ignis 15",
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("witchery:chalkheart", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0),
                        ItemBracketHandler.getItem("AWWayofTime:mundanePowerCatalyst", 0)), arrayOf<IIngredient?>(null,
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0), null,
                                ItemBracketHandler.getItem("witchery:chalkheart", 0))))
        Research.addArcanePage("ALCHEMICTOOLS", ItemBracketHandler.getItem("AWWayofTime:itemTankSegmenter", 0))
        Research.addResearch("BELLJAR", "BLOODMAGIC", "vitreus 18, aer 15, terra 12, ordo 9, lucrum 6, arbor 3", -6,
                -12, 3, ItemBracketHandler.getItem("AWWayofTime:blockCrystalBelljar", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.BELLJAR", "Bell Jar")
        MineTweakerAPI.game.setLocalization("tc.research_text.BELLJAR", "[BM] Demon Lamps")
        Research.addPrereq("BELLJAR", "ALCHEMICCALCINATOR", false)
        Research.setConcealed("BELLJAR", true)
        Research.addPage("BELLJAR", "bloodmagic.research_page.BELLJAR")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.BELLJAR",
                "The Crystal Belljar is a block added by the Blood Magic mod. It can hold up to 16,000 AR. It can only output to a single container. The Belljar outputs a Redstone signal which varies in strength, corresponding to how full its internal storage is.")
        Arcane.addShaped("BELLJAR", ItemBracketHandler.getItem("AWWayofTime:blockCrystalBelljar", 0),
                "aer 20, terra 15, ordo 20",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticOpaque", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0),
                                ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0),
                                ItemBracketHandler.getItem("minecraft:wooden_pressure_plate", 0))))
        Research.addArcanePage("BELLJAR", ItemBracketHandler.getItem("AWWayofTime:blockCrystalBelljar", 0))
        Research.addResearch("ALCHEMYRELAY", "BLOODMAGIC",
                "metallum 18, bestia 15, pannus 12, praecantatio 9, alienis 6, potentia 3", -2, -12, 3,
                ItemBracketHandler.getItem("AWWayofTime:blockReagentConduit", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ALCHEMYRELAY", " Alchemy Relay")
        MineTweakerAPI.game.setLocalization("tc.research_text.ALCHEMYRELAY", "[BM] More than one Calcinator")
        Research.addPrereq("ALCHEMYRELAY", "ALCHEMICCALCINATOR", false)
        Research.setConcealed("ALCHEMYRELAY", true)
        Research.addPage("ALCHEMYRELAY", "bloodmagic.research_page.ALCHEMYRELAY")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ALCHEMYRELAY",
                "The Relay has two 2,000AR tanks. Unlike the Calcinator and the Belljar, it can support multiple outgoing links. This makes this block especially useful for sorting reagents. Transmission can be stopped by applying a redstone signal.")
        Arcane.addShaped("ALCHEMYRELAY", ItemBracketHandler.getItem("AWWayofTime:blockReagentConduit", 0),
                "aer 25, terra 15, ordo 25, ignis 10",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                                ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0))))
        Research.addArcanePage("ALCHEMYRELAY", ItemBracketHandler.getItem("AWWayofTime:blockReagentConduit", 0))
        Research.addResearch("CRYSTALCLUSTER", "BLOODMAGIC",
                "victus 21, spiritus 18, alienis 15, potentia 12, praecantatio 9, tenebrae 6, cognitio 3", -10, 0, 4,
                ItemBracketHandler.getItem("AWWayofTime:blockCrystal", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.CRYSTALCLUSTER", "Crystal CLuster")
        MineTweakerAPI.game.setLocalization("tc.research_text.CRYSTALCLUSTER", "[BM] Tier 6. Ready set go!")
        Research.addPrereq("CRYSTALCLUSTER", "INFUSION", false)
        Research.addPrereq("CRYSTALCLUSTER", "RUNEOFACCELERATION", false)
        Research.setConcealed("CRYSTALCLUSTER", true)
        Research.addPage("CRYSTALCLUSTER", "bloodmagic.research_page.CRYSTALCLUSTER")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.CRYSTALCLUSTER",
                "Crystal Cluster is an item required to complete the tier 6 blood altar. Moade ou of 5 Soul and 5 Life Shards")
        Infusion.addRecipe("CRYSTALCLUSTER", ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29)),
                "potentia 72, victus 64, spiritus 64, praecantatio 32, tenebrae 32, alienis 16, cognitio 16",
                ItemBracketHandler.getItem("AWWayofTime:blockCrystal", 0), 15)
        Research.addInfusionPage("CRYSTALCLUSTER", ItemBracketHandler.getItem("AWWayofTime:blockCrystal", 0))
        Warp.addToResearch("CRYSTALCLUSTER", 5)
        Research.addResearch("ICHORIUMBLOCK", "BLOODMAGIC",
                "victus 21, fames 18, praecantatio 15, infernus 12, alienis 9, superbia 6, terra 3", -10, 2, 4,
                ItemBracketHandler.getItem("gregtech:gt.blockmetal8", 13))
        MineTweakerAPI.game.setLocalization("tc.research_name.ICHORIUMBLOCK", "Tier 6 Pillar")
        MineTweakerAPI.game.setLocalization("tc.research_text.ICHORIUMBLOCK", "[BM] The final Tier")
        Research.addPrereq("ICHORIUMBLOCK", "INFUSION", false)
        Research.addPrereq("ICHORIUMBLOCK", "CRYSTALCLUSTER", false)
        Research.setConcealed("ICHORIUMBLOCK", true)
        Research.addPage("ICHORIUMBLOCK", "bloodmagic.research_page.ICHORIUMBLOCK")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ICHORIUMBLOCK",
                "The sixth and final tier of your Blood Magic altar will require 76 additional Blood Runes, and 4 seven block pillars made of Blood-Soaked Ichorium Blocks capped with Crystal Clusters. The Tier 6 Altar allows you to unlock the full potential of your Blood Magic endeavors by way of unlocking even more and more powerful transfusion recipes. Like previous tier, the sixth ring of runes requires a two-block gap outward from the previous ring. The Ichorium Blocks need to be placed in a Tier 5 Altar to soak up the Blood and be Transformed in a Blood Soaked Ichorium Block")
        Infusion.addRecipe("ICHORIUMBLOCK", ItemBracketHandler.getItem("dreamcraft:tile.Mytryl", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                        ItemBracketHandler.getItem("AWWayofTime:standardBindingAgent", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                        ItemBracketHandler.getItem("ThaumicTinkerer:kamiResource", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4)),
                "victus 64, fames 48, praecantatio 32, infernus 24, alienis 16, superbia 16, terra 8",
                ItemBracketHandler.getItem("gregtech:gt.blockmetal8", 13), 12)
        Research.addInfusionPage("ICHORIUMBLOCK", ItemBracketHandler.getItem("gregtech:gt.blockmetal8", 13))
        Warp.addToResearch("ICHORIUMBLOCK", 3)
        Research.addResearch("GLYPHSTONE", "BLOODMAGIC",
                "terra 21, superbia 18, ordo 15, cognitio 12, auram 9, praecantatio 6, alienis 3", 2, -10, 4,
                ItemBracketHandler.getItem("AWWayofTime:blockStabilityGlyph", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.GLYPHSTONE", "Glyph Stone")
        MineTweakerAPI.game.setLocalization("tc.research_text.GLYPHSTONE", "[BM] Omega.... What?")
        Research.addPrereq("GLYPHSTONE", "INFUSION", false)
        Research.addPrereq("GLYPHSTONE", "SOULARMORFORGE", false)
        Research.setConcealed("GLYPHSTONE", true)
        Research.addPage("GLYPHSTONE", "bloodmagic.research_page.GLYPHSTONE.1")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.GLYPHSTONE.1",
                "Now its time for the Omega Ritual. So the Omega armor is an upgrade from the normal Bound Armor from Blood Magic. You hve to Building a the Omega Chamber the most complicated and most important part of the Omega ritual. The duration and protection of your Omega Armor will be almost completely based on this. The idea behind the ritual is that activating the ritual releases the reagents like a gas from the master ritual stone. However the gas must be contained in order to empower your armor, so the chamber must be completely sealed when you activate the ritual. Once the reagent gas has entered your armor, the chamber may be broken and you can exit. Because it is a gas, the volume of the chamber is not important. Every FACE of a block the is exposed to the gas once the ritual is activated counts for 1 point of stability.")
        Research.addPage("GLYPHSTONE", "bloodmagic.research_page.GLYPHSTONE.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.GLYPHSTONE.1",
                "In order for the ritual to successfully activate, the stability needs to be 151 or higher. The higher it is, the more time you get from it. If you use Glyphs of Rigid Stability, each face exposed is worth 2 points of stability. While these are significantly more expensive than using dirt or some other block, they essentially double the overall stability of the chamber. Therefore it is best to construct the entire exterior of the chamber out of these Glyphs of Rigid Stability(except the floor which has to be the ritual stones and bell jars.")
        Arcane.addShaped("GLYPHSTONE", ItemBracketHandler.getItem("AWWayofTime:blockStabilityGlyph", 0),
                "aer 20, terra 20, aqua 20, ignis 20, ordo 20, perditio 20",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:crepitous", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crepitous", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 30),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1))))
        Research.addArcanePage("GLYPHSTONE", ItemBracketHandler.getItem("AWWayofTime:blockStabilityGlyph", 0))
        Warp.addToResearch("GLYPHSTONE", 3)
        Research.addPage("GLYPHSTONE", "bloodmagic.research_page.GLYPHSTONE.2")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.GLYPHSTONE.2",
                "In order to increase the time the Omega state lasts before reverting back to normal Bound armor, the chamber's stability needs to increase. In order to increase the enchantability, which decides how good of enchantments are on the armor, you need Glyphs of the Adept Enchanter, and in order to increase the enchantment level you, need Glyphs of Arcane Potential. The reason you cannot make your entire chamber out of the other Glyphs which add the enchantments to your armor is because each face of the Adept Enchanter Glyphs count as -10 stability points and each face of Arcane Potential is worth -20 points. This is why you need all the Glyphs of Rigid Stability, because the more of those you have, the more of the other 2 Glyphs you can have without dipping below 151 stability points.")
        Research.addPage("GLYPHSTONE", "bloodmagic.research_page.GLYPHSTONE.3")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.GLYPHSTONE.3",
                "In order to achieve more than just level 1 enchantments on your armor, you need more surface area than an empty box chamber will provide, so you need to add blocks inside the chamber. But you can't just fill it with blocks because the gas needs a way to get to the faces. Think of it as if the gas flows from the Master Ritual Stone in blocks. Every time a gas block Connects with another block, the face that it connects to is counted towards the ritual.")
        Arcane.addShaped("GLYPHSTONE", ItemBracketHandler.getItem("AWWayofTime:blockEnchantmentGlyph", 0),
                "aer 30, terra 30, aqua 30, ignis 30, ordo 30, perditio 30",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 30),
                                ItemBracketHandler.getItem("AWWayofTime:magicales", 0))))
        Research.addArcanePage("GLYPHSTONE", ItemBracketHandler.getItem("AWWayofTime:blockEnchantmentGlyph", 0))
        Arcane.addShaped("GLYPHSTONE", ItemBracketHandler.getItem("AWWayofTime:blockEnchantmentGlyph", 1),
                "aer 30, terra 30, aqua 30, ignis 30, ordo 30, perditio 30",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 30),
                                ItemBracketHandler.getItem("AWWayofTime:magicales", 0))))
        Research.addArcanePage("GLYPHSTONE", ItemBracketHandler.getItem("AWWayofTime:blockEnchantmentGlyph", 1))
        Research.addResearch("KEYOFBINDING", "BLOODMAGIC", "vitreus 15, lucrum 12, metallum 9, terra 6, praecantatio 3",
                4, -2, 3, ItemBracketHandler.getItem("AWWayofTime:itemKeyOfDiablo", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.KEYOFBINDING", "Key of Binding")
        MineTweakerAPI.game.setLocalization("tc.research_text.KEYOFBINDING", "[BM] Binding all the Stuff")
        Research.addPrereq("KEYOFBINDING", "SACRIFICIALKNIFE", false)
        Research.setConcealed("KEYOFBINDING", true)
        Research.addPage("KEYOFBINDING", "bloodmagic.research_page.KEYOFBINDING")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.KEYOFBINDING",
                "The Key of Binding is a tool added by Blood Magic. The Key of Binding is used to bind unbound items to the owner's network.There are two types of the Key of Binding. The first being a standard, craft-able key. The second one must be spawned in, and comes pre-bound to Server-wide Soul Network, allowing for a server-wide soul network to be established by using the key. Upon right clicking, the Key of Binding will search the user's inventory for the first unbound item and will bind it to the owner of the key's network.")
        Arcane.addShaped("KEYOFBINDING", ItemBracketHandler.getItem("AWWayofTime:itemKeyOfDiablo", 0),
                "terra 15, ordo 15, ignis 15",
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateRoseGold"),
                        OreBracketHandler.getOre("gemFlawlessDiamond")),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("Thaumcraft:ArcaneDoorKey", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("gemFlawlessDiamond"),
                                OreBracketHandler.getOre("plateRoseGold"), null)))
        Research.addArcanePage("KEYOFBINDING", ItemBracketHandler.getItem("AWWayofTime:itemKeyOfDiablo", 0))
        Research.addResearch("ARMORINHIBITOR", "BLOODMAGIC",
                "metallum 15, lucrum 12, spiritus 9, alienis 6, praecantatio 3", 4, -8, 3,
                ItemBracketHandler.getItem("AWWayofTime:armourInhibitor", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ARMORINHIBITOR", "Armor Inhibitor")
        MineTweakerAPI.game.setLocalization("tc.research_text.ARMORINHIBITOR", "[BM] Used to suppress the souls")
        Research.addPrereq("ARMORINHIBITOR", "SOULARMORFORGE", false)
        Research.setConcealed("ARMORINHIBITOR", true)
        Research.addPage("ARMORINHIBITOR", "bloodmagic.research_page.ARMORINHIBITOR")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ARMORINHIBITOR",
                "While activated, the Armour Inhibitor will deactivate all armor upgrades on Bound Armor. For example, if wearing bound boots with a Sigil of Haste in them, the inhibitor will disable the haste effect. This can be useful if using armor with the Sigil of Magnetism or Sigil of the Phantom Bridge socketed. The inhibitor does not require any life essence to operate.")
        Arcane.addShaped("ARMORINHIBITOR", ItemBracketHandler.getItem("AWWayofTime:armourInhibitor", 0),
                "perditio 30, aer 30, aqua 30",
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        OreBracketHandler.getOre("plateRoseGold"), null),
                        arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                                OreBracketHandler.getOre("plateRoseGold")),
                        arrayOf(null, OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0))))
        Research.addArcanePage("ARMORINHIBITOR", ItemBracketHandler.getItem("AWWayofTime:armourInhibitor", 0))
        Research.addResearch("SIGILOFHASTE", "BLOODMAGIC",
                "iter 21, motus 18, aer 15, potentia 12, praecantatio 9, alienis 6, cognitio 3", -2, 12, 4,
                ItemBracketHandler.getItem("AWWayofTime:sigilOfHaste", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFHASTE", "Sigil of Haste")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFHASTE", "[BM] You are on speed?")
        Research.addPrereq("SIGILOFHASTE", "INFUSION", false)
        Research.addPrereq("SIGILOFHASTE", "AIRSIGIL", false)
        Research.setConcealed("SIGILOFHASTE", true)
        Research.addPage("SIGILOFHASTE", "bloodmagic.research_page.SIGILOFHASTE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFHASTE",
                "The Sigil of Haste is a tool added by Blood Magic. The Sigil of Haste grants the user Boost II at the cost of Life Essence (LP). Upon activating the Sigil of Haste, 300 LP will be consumed from the owner's network to grant the user Boost II. Every ten seconds after activation, an additional 300 LP will be consumed to continue granting the user Boost II. When socketed into Bound Armor, the Sigil of Haste grants Boost.")
        Infusion.addRecipe("SIGILOFHASTE", ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("minecraft:cookie", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("minecraft:sugar", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("minecraft:sugar", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("minecraft:cookie", 0)),
                "iter 64, motus 32, aer 24, potentia 24, praecantatio 16, alienis 8, cognitio 8",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfHaste", 0), 8)
        Research.addInfusionPage("SIGILOFHASTE", ItemBracketHandler.getItem("AWWayofTime:sigilOfHaste", 0))
        Warp.addToResearch("SIGILOFHASTE", 3)
        Research.addResearch("SIGILOFWHIRLWIND", "BLOODMAGIC",
                "aer 24, tutamen 21, potentia 18, victus 15, sano 12, cognitio 9, superbia 6, nebrisum 3", 2, 12, 4,
                ItemBracketHandler.getItem("AWWayofTime:sigilOfWind", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFWHIRLWIND", "Sigil of Whirlwind")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFWHIRLWIND", "[BM] Just blow away those arrows")
        Research.addPrereq("SIGILOFWHIRLWIND", "INFUSION", false)
        Research.addPrereq("SIGILOFWHIRLWIND", "AIRSIGIL", false)
        Research.setConcealed("SIGILOFWHIRLWIND", true)
        Research.addPage("SIGILOFWHIRLWIND", "bloodmagic.research_page.SIGILOFWHIRLWIND")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFWHIRLWIND",
                "The Sigil of the Whirlwind is an item added by the Blood Magic mod. When active, it deflects projectiles and arrows fired at the Player. Activating this Sigil costs 350 LP per use. When socketed into Bound Armor, the Sigil of the Whirlwind deflects projectiles and arrows fired at the Player.")
        Infusion.addRecipe("SIGILOFWHIRLWIND", ItemBracketHandler.getItem("AWWayofTime:airSigil", 0),
                arrayOf(ItemBracketHandler.getItem("TwilightForest:item.tfFeather", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("TwilightForest:item.tfFeather", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("EMT:EMTItems", 7),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0)),
                "aer 72, tutamen 48, potentia 32, victus 32, sano 16, cognitio 16, superbia 8, nebrisum 8",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfWind", 0), 12)
        Research.addInfusionPage("SIGILOFWHIRLWIND", ItemBracketHandler.getItem("AWWayofTime:sigilOfWind", 0))
        Warp.addToResearch("SIGILOFWHIRLWIND", 4)
        Research.addResearch("SIGILOFSUPRESSION", "BLOODMAGIC",
                "vacuos 21, auram 18, aqua 15, metallum 12, praecantatio 9, terra 6, motus 3", -2, 8, 4,
                ItemBracketHandler.getItem("AWWayofTime:sigilOfSupression", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFSUPRESSION", "Sigil of Supression")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFSUPRESSION", "[BM] Walk just like Jesus")
        Research.addPrereq("SIGILOFSUPRESSION", "INFUSION", false)
        Research.addPrereq("SIGILOFSUPRESSION", "VOIDSIGIL", false)
        Research.setConcealed("SIGILOFSUPRESSION", true)
        Research.addPage("SIGILOFSUPRESSION", "bloodmagic.research_page.SIGILOFSUPRESSION")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFSUPRESSION",
                "The Sigil of Supression is an item added by the Blood Magic mod. When activated, the Sigil temporarily removes any fluid source within a 5 block radius. Once it is disabled, or the Player moves out of range, the sources will return. It works on any fluid that uses the Forge fluid API, such as Water, Lava or Oil. Activating this Sigil costs 500 LP every 10 seconds until deactivated. When socketed into Bound Armor, the Sigil of Supression temporarily removes any fluid source within a 5 block radius of the Player.")
        Infusion.addRecipe("SIGILOFSUPRESSION", ItemBracketHandler.getItem("AWWayofTime:voidSigil", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:blockTeleposer", 0),
                        ItemBracketHandler.getItem("minecraft:bucket", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("minecraft:bucket", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("minecraft:bucket", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("minecraft:bucket", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("minecraft:bucket", 0)),
                "vacuos 72, auram 16, aqua 64, metallum 8, praecantatio 32, terra 32, motus 16",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfSupression", 0), 15)
        Research.addInfusionPage("SIGILOFSUPRESSION", ItemBracketHandler.getItem("AWWayofTime:sigilOfSupression", 0))
        Warp.addToResearch("SIGILOFSUPRESSION", 5)
        Research.addResearch("SIGILOFENDERSEVERANCE", "BLOODMAGIC",
                "alienis 21, cognitio 18, humanus 15, potentia 12, vinculum 9, limus 6, nebrisum 3", 0, 14, 4,
                ItemBracketHandler.getItem("AWWayofTime:sigilOfEnderSeverance", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFENDERSEVERANCE", "Sigil of Ender Serverance")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFENDERSEVERANCE",
                "[BM] Put those Endermen in a dire situation")
        Research.addPrereq("SIGILOFENDERSEVERANCE", "INFUSION", false)
        Research.addPrereq("SIGILOFENDERSEVERANCE", "SIGILOFELEMENTALAFFINITY", false)
        Research.addPrereq("SIGILOFENDERSEVERANCE", "OCULUS", false)
        Research.setConcealed("SIGILOFENDERSEVERANCE", true)
        Research.addPage("SIGILOFENDERSEVERANCE", "bloodmagic.research_page.SIGILOFENDERSEVERANCE")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFENDERSEVERANCE",
                "The Sigil of Ender Severance is an item added by the Blood Magic mod. This Sigil prevents teleporting. It has an effect range over an area of 11 x 11 x 11 meter, centered on the Player. This allows a Player to easily attack the Enderman, with a range weapon, without him jumping all over and sneaking up from behind. This sigil costs 300 LP per 10 seconds while active.")

        //TODO Replace ("StevesCarts:ModuleComponents", 45)
        //Infusion.addRecipe("SIGILOFENDERSEVERANCE", ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
        //        arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
        //                ItemBracketHandler.getItem("StevesCarts:ModuleComponents", 45),
        //                ItemBracketHandler.getItem("TConstruct:slime.gel", 2),
        //                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 7),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
        //                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 7),
        //                ItemBracketHandler.getItem("TConstruct:slime.gel", 2),
        //                ItemBracketHandler.getItem("StevesCarts:ModuleComponents", 45),
        //                ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)),
        //        "alienis 16, cognitio 72, humanus 16, potentia 64, vinculum 48, limus 32, nebrisum 8",
        //        ItemBracketHandler.getItem("AWWayofTime:sigilOfEnderSeverance", 0), 17)

        Research.addInfusionPage("SIGILOFENDERSEVERANCE",
                ItemBracketHandler.getItem("AWWayofTime:sigilOfEnderSeverance", 0))
        Warp.addToResearch("SIGILOFENDERSEVERANCE", 6)
        Research.addResearch("ENDERSIGIL", "BLOODMAGIC",
                "vacuos 24, alienis 21, cognitio 18, humanus 15, potentia 12, vinculum 9, limus 6, nebrisum 3", -2, 16,
                4, ItemBracketHandler.getItem("BloodArsenal:sigil_of_ender", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENDERSIGIL", "Ender Sigil")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENDERSIGIL", "[BA] Stick your hand into the End")
        Research.addPrereq("ENDERSIGIL", "INFUSION", false)
        Research.addPrereq("ENDERSIGIL", "SIGILOFENDERSEVERANCE", false)
        Research.setConcealed("ENDERSIGIL", true)
        Research.addPage("ENDERSIGIL", "bloodmagic.research_page.ENDERSIGIL")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ENDERSIGIL",
                "The Ender Sigil have two functions when this sigil is right-clicked, it opens up the player's Ender Chest; when it is shift-right-clicked, it teleports the player to whatever block they are facing.")
        Infusion.addRecipe("ENDERSIGIL", ItemBracketHandler.getItem("AWWayofTime:sigilOfEnderSeverance", 0),
                arrayOf(ItemBracketHandler.getItem("EnderStorage:enderChest", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32726),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17770),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                        ItemBracketHandler.getItem("minecraft:ender_eye", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32724),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17770),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32726)),
                "vacuos 16, alienis 16, cognitio 72, humanus 16, potentia 64, vinculum 48, limus 32, nebrisum 8",
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_ender", 0), 20)
        Research.addInfusionPage("ENDERSIGIL", ItemBracketHandler.getItem("BloodArsenal:sigil_of_ender", 0))
        Warp.addToResearch("ENDERSIGIL", 8)
        Research.addResearch("SIGILOFDIVINITY", "BLOODMAGIC",
                "tutamen 24, aer 21, ignis 18, aqua 15, terra 12, ordo 9, perditio 6, sano 3", 2, 16, 4,
                ItemBracketHandler.getItem("BloodArsenal:sigil_of_divinity", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFDIVINITY", "Sigil of Divinity")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFDIVINITY", "[BA] The Power be with you")
        Research.addPrereq("SIGILOFDIVINITY", "INFUSION", false)
        Research.addPrereq("SIGILOFDIVINITY", "SIGILOFENDERSEVERANCE", false)
        Research.setConcealed("SIGILOFDIVINITY", true)
        Research.addPage("SIGILOFDIVINITY", "bloodmagic.research_page.SIGILOFDIVINITY")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFDIVINITY",
                "The Sigil of Divinity is the ultimate form of protection, when activated, it puts up an absorption shield over the player. Even though this may protect against demons, it uses lots (don't say I didn't warn you) of LP!")

        //TODO Replace ("TConstruct:diamondApple", 0)
        //Infusion.addRecipe("SIGILOFDIVINITY", ItemBracketHandler.getItem("AWWayofTime:sigilOfElementalAffinity", 0),
        //        arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
        //                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
        //                ItemBracketHandler.getItem("TConstruct:diamondApple", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32726),
        //                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone", 0),
        //                ItemBracketHandler.getItem("TConstruct:diamondApple", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
        //                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0)),
        //        "tutamen 64, aer 72, ignis 64, aqua 48, terra 32, ordo 32, perditio 16, sano 8",
        //        ItemBracketHandler.getItem("BloodArsenal:sigil_of_divinity", 0), 25)

        Research.addInfusionPage("SIGILOFDIVINITY", ItemBracketHandler.getItem("BloodArsenal:sigil_of_divinity", 0))
        Warp.addToResearch("SIGILOFDIVINITY", 10)
        Research.addResearch("HARVESTGODDESSSIGIL", "BLOODMAGIC",
                "herba 21, arbor 18, meto 15, messis 12, cognitio 9, praecantatio 6, alienis 3", 0, 16, 4,
                ItemBracketHandler.getItem("AWWayofTime:itemHarvestSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.HARVESTGODDESSSIGIL", "Harvest Goddess Sigil")
        MineTweakerAPI.game.setLocalization("tc.research_text.HARVESTGODDESSSIGIL", "[BM] you sow what you reap")
        Research.addPrereq("HARVESTGODDESSSIGIL", "INFUSION", false)
        Research.addPrereq("HARVESTGODDESSSIGIL", "SIGILOFENDERSEVERANCE", false)
        Research.setConcealed("HARVESTGODDESSSIGIL", true)
        Research.addPage("HARVESTGODDESSSIGIL", "bloodmagic.research_page.HARVESTGODDESSSIGIL")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.HARVESTGODDESSSIGIL",
                "The Harvest Goddess Sigil is an item from Blood Magic. It is used to harvest and immediately replant mature crops within a 3-block radius of the holder. The Harvest Goddess Sigil does not pick up dropped plants or seeds. The effect of this sigil is very similar to ritual Reap of the Harvest Moon, trading off area of effect and automation for portability. Activating this Sigil costs 600 LP every 10 seconds while active. When used as an upgrade to a Bound Armor, the Harvest Goddess Sigil Harvests and replants nearby crops.")
        Infusion.addRecipe("HARVESTGODDESSSIGIL", ItemBracketHandler.getItem("AWWayofTime:growthSigil", 0),
                arrayOf(ItemBracketHandler.getItem("BloodArsenal:bound_sickle", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2)),
                "herba 72, arbor 64, meto 8, messis 16, cognitio 24, praecantatio 32, alienis 16",
                ItemBracketHandler.getItem("AWWayofTime:itemHarvestSigil", 0), 20)
        Research.addInfusionPage("HARVESTGODDESSSIGIL", ItemBracketHandler.getItem("AWWayofTime:itemHarvestSigil", 0))
        Warp.addToResearch("HARVESTGODDESSSIGIL", 7)
        Research.addResearch("SIGILOFCOMPRESSION", "BLOODMAGIC",
                "metallum 15, potentia 12, machina 9, lucrum 6, superbia 3", 2, 8, 3,
                ItemBracketHandler.getItem("AWWayofTime:itemCompressionSigil", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SIGILOFCOMPRESSION", "Sigil of Compression")
        MineTweakerAPI.game.setLocalization("tc.research_text.SIGILOFCOMPRESSION",
                "[BM] Are you trying to be the Hulk?")
        Research.addPrereq("SIGILOFCOMPRESSION", "INFUSION", false)
        Research.addPrereq("SIGILOFCOMPRESSION", "SIGILOFMAGNETISM", false)
        Research.setConcealed("SIGILOFCOMPRESSION", true)
        Research.addPage("SIGILOFCOMPRESSION", "bloodmagic.research_page.SIGILOFCOMPRESSION")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.SIGILOFCOMPRESSION",
                "The Sigil of Compression is an item added by the Blood Magic mod. This Sigil compresses any item picked-up into its block form if possible. Sadly this does not work for Gregtech ingots. Activating this Sigil costs 250 LP every 10 seconds while active.")
        Infusion.addRecipe("SIGILOFCOMPRESSION", ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32644),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32744),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32744),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32644)),
                "metallum 32, potentia 24, machina 16, lucrum 16, superbia 8",
                ItemBracketHandler.getItem("AWWayofTime:itemCompressionSigil", 0), 10)
        Research.addInfusionPage("SIGILOFCOMPRESSION",
                ItemBracketHandler.getItem("AWWayofTime:itemCompressionSigil", 0))
        Warp.addToResearch("SIGILOFCOMPRESSION", 2)
        Research.addResearch("ENERGYBAZOOKAI", "BLOODMAGIC",
                "potentia 21, instrumentum 18, telum 15 , superbia 12, fames 9, nebrisum 6, ira 3", -12, 0, 4,
                ItemBracketHandler.getItem("AWWayofTime:energyBazooka", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENERGYBAZOOKAI", "Energy Bazooka I")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENERGYBAZOOKAI", "[BM] Boooom I")
        Research.addPrereq("ENERGYBAZOOKAI", "CRYSTALCLUSTER", false)
        Research.addPrereq("ENERGYBAZOOKAI", "ICHOR_SWORD_GEM", false)
        Research.addPrereq("ENERGYBAZOOKAI", "PRIMALCRUSHER", false)
        Research.setConcealed("ENERGYBAZOOKAI", true)
        Research.addPage("ENERGYBAZOOKAI", "bloodmagic.research_page.ENERGYBAZOOKAI")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ENERGYBAZOOKAI",
                "The Energy Bazooka I is a stronger version of the Energy Blaster. This weapon uses 2,000 LP to fire a two-staged projectile. The primary projectile explodes into 20 secondary projectiles when it hits something. The secondary projectiles will rebound and explode on impact. Damage 200, Secondary Damage 250")
        Arcane.addShaped("ENERGYBAZOOKAI", ItemBracketHandler.getItem("AWWayofTime:energyBazooka", 0),
                "aqua 150, ignis 150, terra 150, aer 150, perditio 150, ordo 150",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                        ItemBracketHandler.getItem("Thaumcraft:ItemEldritchObject", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
                                ItemBracketHandler.getItem("AWWayofTime:energyBlasterThirdTier", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978),
                                ItemBracketHandler.getItem("AWWayofTime:demonicTelepositionFocus", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978))))
        Research.addArcanePage("ENERGYBAZOOKAI", ItemBracketHandler.getItem("AWWayofTime:energyBazooka", 0))
        Warp.addToResearch("ENERGYBAZOOKAI", 5)
        Research.addResearch("ENERGYBAZOOKAII", "BLOODMAGIC",
                "potentia 24, instrumentum 21, telum 18 , infernus 15, superbia 12, fames 9, nebrisum 6, ira 3", -14, 0,
                4, ItemBracketHandler.getItem("AWWayofTime:energyBazookaSecondTier", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENERGYBAZOOKAII", "Energy Bazooka II")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENERGYBAZOOKAII", "[BM] Boooom II")
        Research.addPrereq("ENERGYBAZOOKAII", "INFUSION", false)
        Research.addPrereq("ENERGYBAZOOKAII", "ENERGYBAZOOKAI", false)
        Research.setConcealed("ENERGYBAZOOKAII", true)
        Research.addPage("ENERGYBAZOOKAII", "bloodmagic.research_page.ENERGYBAZOOKAII")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ENERGYBAZOOKAII",
                "The Energy Bazooka II is a stronger version of the Energy Blaster. This weapon uses 20,000 LP to fire a two-staged projectile. The primary projectile explodes into 20 secondary projectiles when it hits something. The secondary projectiles will rebound and explode on impact. Damage 500, Secondary Damage 750")
        Infusion.addRecipe("ENERGYBAZOOKAII", ItemBracketHandler.getItem("AWWayofTime:energyBazooka", 0),
                arrayOf(ItemBracketHandler.getItem("DraconicEvolution:draconium", 2),
                        ItemBracketHandler.getItem("DraconicEvolution:draconicCore", 0),
                        ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0),
                        ItemBracketHandler.getItem("DraconicEvolution:wyvernCore", 0),
                        ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0),
                        ItemBracketHandler.getItem("DraconicEvolution:draconium", 2),
                        ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0),
                        ItemBracketHandler.getItem("DraconicEvolution:draconicCore", 0),
                        ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0),
                        ItemBracketHandler.getItem("DraconicEvolution:wyvernCore", 0)),
                "potentia 96, instrumentum 72, telum 64 , infernus 64, superbia 32, fames 32, nebrisum 16, ira 8",
                ItemBracketHandler.getItem("AWWayofTime:energyBazookaSecondTier", 0), 15)
        Research.addInfusionPage("ENERGYBAZOOKAII",
                ItemBracketHandler.getItem("AWWayofTime:energyBazookaSecondTier", 0))
        Warp.addToResearch("ENERGYBAZOOKAII", 10)
        Research.addResearch("ENERGYBAZOOKAIII", "BLOODMAGIC",
                "potentia 27, instrumentum 24, telum 21 , terminus 18, infernus 15, superbia 12, fames 9, nebrisum 6, ira 3",
                -16, 0, 4, ItemBracketHandler.getItem("AWWayofTime:energyBazookaThirdTier", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ENERGYBAZOOKAIII", "Energy Bazooka III")
        MineTweakerAPI.game.setLocalization("tc.research_text.ENERGYBAZOOKAIII", "[BM] Boooom III")
        Research.addPrereq("ENERGYBAZOOKAIII", "INFUSION", false)
        Research.addPrereq("ENERGYBAZOOKAIII", "ENERGYBAZOOKAII", false)
        Research.setConcealed("ENERGYBAZOOKAIII", true)
        Research.addPage("ENERGYBAZOOKAIII", "bloodmagic.research_page.ENERGYBAZOOKAIII")
        MineTweakerAPI.game.setLocalization("bloodmagic.research_page.ENERGYBAZOOKAIII",
                "The Energy Bazooka III is a stronger version of the Energy Blaster. This weapon uses 200,000 LP to fire a two-staged projectile. The primary projectile explodes into 20 secondary projectiles when it hits something. The secondary projectiles will rebound and explode on impact. Damage 1000, Secondary Damage 1500")
        Infusion.addRecipe("ENERGYBAZOOKAIII", ItemBracketHandler.getItem("AWWayofTime:energyBazookaSecondTier", 0),
                arrayOf(ItemBracketHandler.getItem("Avaritia:big_pearl", 0),
                        ItemBracketHandler.getItem("Avaritia:Resource", 6),
                        ItemBracketHandler.getItem("DraconicEvolution:awakenedCore", 0),
                        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                        ItemBracketHandler.getItem("Avaritia:Resource", 6),
                        ItemBracketHandler.getItem("Avaritia:Resource", 6),
                        ItemBracketHandler.getItem("Avaritia:Resource_Block", 0),
                        ItemBracketHandler.getItem("DraconicEvolution:chaoticCore", 0),
                        ItemBracketHandler.getItem("Avaritia:Resource", 6)),
                "potentia 128, instrumentum 96, telum 72 , terminus 64, infernus 72, superbia 48, fames 32, nebrisum 16, ira 8",
                ItemBracketHandler.getItem("AWWayofTime:energyBazookaThirdTier", 0), 20)
        Research.addInfusionPage("ENERGYBAZOOKAIII",
                ItemBracketHandler.getItem("AWWayofTime:energyBazookaThirdTier", 0))
        Warp.addToResearch("ENERGYBAZOOKAIII", 20)
        Research.clearPages("CAP_blood_iron")
        Research.addPage("CAP_blood_iron", "blood_arsenal.research_page.CAP_blood_iron.1")
        Infusion.addRecipe("CAP_blood_iron", ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 0),
                arrayOf(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17977),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28977),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17977),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17977),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 28977),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17977),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0)),
                "aqua 32, praecantatio 24, victus 24, metallum 16, ignis 8",
                ItemBracketHandler.getItem("BloodArsenal:wand_caps", 0), 10)
        Research.addInfusionPage("CAP_blood_iron", ItemBracketHandler.getItem("BloodArsenal:wand_caps", 0))
        Research.setAspects("CAP_blood_iron",
                "victus 18, aqua 15 , praecantatio 12, tenebrae 9, metallum 6, tenebrae 3")
        Research.setComplexity("CAP_blood_iron", 3)
        Warp.addToResearch("CAP_blood_iron", 3)
        Research.clearPages("ROD_blood_wood")
        Research.addPage("ROD_blood_wood", "blood_arsenal.research_page.ROD_blood_wood.1")
        Research.addPage("ROD_blood_wood", "blood_arsenal.research_page.ROD_blood_wood.2")
        Infusion.addRecipe("ROD_blood_wood", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 3),
                arrayOf(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0)),
                "praecantatio 32, instrumentum 24, victus 32, arbor 16, potentia 8",
                ItemBracketHandler.getItem("BloodArsenal:wand_cores", 0), 8)
        Research.addInfusionPage("ROD_blood_wood", ItemBracketHandler.getItem("BloodArsenal:wand_cores", 0))
        Research.setAspects("ROD_blood_wood",
                "victus 18, praecantatio 15, aqua 12, tenebrae 9, instrumentum 6, terra 3")
        Research.setComplexity("ROD_blood_wood", 3)
        Warp.addToResearch("ROD_blood_wood", 5)
        Research.orphanResearch("ROD_blood_wood_staff")
        Research.removeResearch("ROD_blood_wood_staff")
        Research.addResearch("RODBLOODWOODSTAFF", "FORBIDDEN",
                "victus 18, instrumentum 15, aqua 12, praecantatio 9, potentia 6, tenebrae 3", 7, -5, 3,
                ItemBracketHandler.getItem("BloodArsenal:wand_cores", 1))
        MineTweakerAPI.game.setLocalization("tc.research_name.RODBLOODWOODSTAFF", "Blood Infused Wood Staff Core")
        MineTweakerAPI.game.setLocalization("tc.research_text.RODBLOODWOODSTAFF", "Bringing Doom to the party")
        Research.addPrereq("RODBLOODWOODSTAFF", "ROD_blood_staff", false)
        Research.addPrereq("RODBLOODWOODSTAFF", "ROD_blood_wood", false)
        Research.setConcealed("RODBLOODWOODSTAFF", true)
        Research.setSpikey("RODBLOODWOODSTAFF", true)
        Research.addPage("RODBLOODWOODSTAFF", "blood_arsenal.research_page.ROD_blood_wood_staff.1")
        Infusion.addRecipe("RODBLOODWOODSTAFF", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 9),
                arrayOf(ItemBracketHandler.getItem("BloodArsenal:wand_cores", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:wand_cores", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0)),
                "victus 64, aqua 64, praecantatio 64, instrumentum 48, metallum 16, ignis 16, infernus 8, arbor 32",
                ItemBracketHandler.getItem("BloodArsenal:wand_cores", 1), 12)
        Research.addInfusionPage("RODBLOODWOODSTAFF", ItemBracketHandler.getItem("BloodArsenal:wand_cores", 1))
        Warp.addToResearch("RODBLOODWOODSTAFF", 7)
        Research.refreshResearchRecipe("CAP_blood_iron")
        Research.refreshResearchRecipe("ROD_blood_wood")
        Research.refreshResearchRecipe("RODBLOODWOODSTUFF")
        ItemBracketHandler.getItem("AWWayofTime:Altar", 0).displayName = "Altar of GregoriusT's Blood"
    }
}