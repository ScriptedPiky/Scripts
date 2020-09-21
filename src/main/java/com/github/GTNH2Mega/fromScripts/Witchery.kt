package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.CuttingSaw
import gttweaker.mods.gregtech.machines.FormingPress
import gttweaker.mods.gregtech.machines.Mixer
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientTransform
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandInt
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.*
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class Witchery : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:witchesovenidle", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:fumefunnel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:filteredfumefunnel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 73))
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("witchery:ingredient", 130),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 130),
                        ItemBracketHandler.getItem("minecraft:magma_cream", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0)), false)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:altar", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:kettle", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:arthana", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 153))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 16))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 26))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:spinningwheel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:distilleryidle", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 140))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 81))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 106))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 127))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 46))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 107))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:cauldronbook", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 47))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 48))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 49))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:chalkritual", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:circletalisman", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:earmuffs", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 92))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("witchery:ingredient", 12))
        Research.addTab("WITCHERY", "dreamcraft", "textures/thaumcraft/icon/icon_Witchery.png", "dreamcraft",
                "textures/thaumcraft/tab/tab_Witchery.png")
        MineTweakerAPI.game.setLocalization("tc.research_category.WITCHERY", "Witchery")
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:seedswormwood", 0),
                arrayOf(arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("witchery:mutator", 0)),
                        ItemBracketHandler.getItem("witchery:somniancotton", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("witchery:somniancotton", 0),
                                ItemBracketHandler.getItem("minecraft:wheat", 0),
                                ItemBracketHandler.getItem("witchery:somniancotton", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("witchery:somniancotton", 0), null)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("witchery:ingredient", 130).amount(2),
                arrayOf(ItemBracketHandler.getItem("witchery:ingredient", 130),
                        ItemBracketHandler.getItem("minecraft:magma_cream", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        OreBracketHandler.getOre("dustTinyNetherStar")), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 16),
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2622)),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2622),
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("witchery:ingredient", 16)),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 140),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("platePaper"), OreBracketHandler.getOre("string"),
                        OreBracketHandler.getOre("platePaper")), arrayOf(OreBracketHandler.getOre("string"),
                        ItemBracketHandler.getItem("witchery:ingredient", 163), OreBracketHandler.getOre("string")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("platePaper"), OreBracketHandler.getOre("string"),
                                OreBracketHandler.getOre("platePaper"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("witchery:ingredient", 7).amount(4),
                arrayOf(ItemBracketHandler.getItem("minecraft:bone", 0), OreBracketHandler.getOre("craftingToolKnife")),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 81),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 22),
                        ItemBracketHandler.getItem("witchery:ingredient", 21),
                        ItemBracketHandler.getItem("witchery:garlic", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
                                OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("craftingFeather")),
                        arrayOf(ItemBracketHandler.getItem("witchery:ingredient", 69),
                                ItemBracketHandler.getItem("witchery:ingredient", 156),
                                OreBracketHandler.getOre("listAllseed"))), null)

        //TODO Replace ("TConstruct:CraftedSoil", 5)
        //MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 106),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stained_hardened_clay", 0),
        //                ItemBracketHandler.getItem("BiomesOPlenty:mud", 1),
        //                ItemBracketHandler.getItem("minecraft:mycelium", 0)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
        //                        OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("craftingFeather")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:netherrack", 0),
        //                        ItemBracketHandler.getItem("minecraft:dirt", 2),
        //                        ItemBracketHandler.getItem("TConstruct:CraftedSoil", 5))), null)

        val recipes = MineTweakerAPI.recipes
        val item = ItemBracketHandler.getItem("witchery:ingredient", 127)
        val array: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        val n = 0
        val array2 = arrayOfNulls<IIngredient>(3)
        val n2 = 0
        val item2 = ItemBracketHandler.getItem("witchery:poppet", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["WITCDamage"] = ExpandInt.toData(0)
        array2[n2] = item2.withTag(ExpandAnyDict.asData(hashMap))
        array2[1] = ItemBracketHandler.getItem("witchery:ingredient", 7)
        array2[2] = ItemBracketHandler.getItem("witchery:ingredient", 14)
        array[n] = array2
        array[1] = arrayOf(OreBracketHandler.getOre("dyeBlack"), OreBracketHandler.getOre("craftingBook"),
                OreBracketHandler.getOre("craftingFeather"))
        array[2] = arrayOf(ItemBracketHandler.getItem("witchery:ingredient", 74),
                ItemBracketHandler.getItem("witchery:ingredient", 25), OreBracketHandler.getOre("flowerYellow"))
        recipes.addShaped(item, array, null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 46),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 27),
                        ItemBracketHandler.getItem("witchery:ingredient", 27),
                        ItemBracketHandler.getItem("witchery:ingredient", 27)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
                                OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("craftingFeather")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 27),
                                ItemBracketHandler.getItem("witchery:ingredient", 27),
                                ItemBracketHandler.getItem("witchery:ingredient", 27))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:cauldronbook", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 31),
                        ItemBracketHandler.getItem("witchery:ingredient", 33),
                        ItemBracketHandler.getItem("witchery:ingredient", 32)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
                                OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("craftingFeather")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 34),
                                ItemBracketHandler.getItem("witchery:ingredient", 35),
                                ItemBracketHandler.getItem("witchery:ingredient", 28))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 107),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:chalkritual", 0),
                        ItemBracketHandler.getItem("witchery:circletalisman", 0),
                        ItemBracketHandler.getItem("witchery:chalkritual", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
                                OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("craftingFeather")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:glintweed", 0),
                                ItemBracketHandler.getItem("witchery:ingredient", 78),
                                ItemBracketHandler.getItem("witchery:grassper", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 47),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 27),
                        ItemBracketHandler.getItem("witchery:ingredient", 10),
                        ItemBracketHandler.getItem("witchery:ingredient", 27)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
                                OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("craftingFeather")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 27),
                                ItemBracketHandler.getItem("minecraft:cauldron", 0),
                                ItemBracketHandler.getItem("witchery:ingredient", 27))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 48),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 17),
                        ItemBracketHandler.getItem("witchery:ingredient", 37),
                        ItemBracketHandler.getItem("witchery:ingredient", 17)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
                                OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("craftingFeather")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 17),
                                ItemBracketHandler.getItem("witchery:ingredient", 37),
                                ItemBracketHandler.getItem("witchery:ingredient", 17))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:ingredient", 49),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 34),
                        ItemBracketHandler.getItem("witchery:ingredient", 34),
                        ItemBracketHandler.getItem("witchery:ingredient", 34)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
                                OreBracketHandler.getOre("craftingBook"), OreBracketHandler.getOre("craftingFeather")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 21),
                                ItemBracketHandler.getItem("minecraft:cauldron", 0),
                                ItemBracketHandler.getItem("witchery:ingredient", 21))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("witchery:earmuffs", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
                        OreBracketHandler.getOre("springSteel"), OreBracketHandler.getOre("screwThaumium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("dyeBlack"),
                                OreBracketHandler.getOre("craftingToolWrench"),
                                OreBracketHandler.getOre("craftingFeather")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("ringThaumium"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("ringThaumium"))), null)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("witchery:ingredient", 7).amount(8), null,
                ItemBracketHandler.getItem("minecraft:bone", 0), LiquidBracketHandler.getLiquid("water").withAmount(32),
                100, 24)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("witchery:ingredient", 7).amount(8), null,
                ItemBracketHandler.getItem("minecraft:bone", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(16), 100, VoltageLevels.LV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("witchery:ingredient", 7).amount(8), null,
                ItemBracketHandler.getItem("minecraft:bone", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(8), 50, VoltageLevels.LV)
        FormingPress.addRecipe(ItemBracketHandler.getItem("witchery:ingredient", 26).amount(4),
                ItemBracketHandler.getItem("minecraft:clay_ball", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32305).amount(0), 400, VoltageLevels.LV)
        Mixer.addRecipe(ItemBracketHandler.getItem("witchery:ingredient", 153), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:seedsbelladonna", 0),
                        ItemBracketHandler.getItem("witchery:seedsmandrake", 0),
                        ItemBracketHandler.getItem("witchery:seedsartichoke", 0),
                        ItemBracketHandler.getItem("witchery:seedssnowbell", 0)),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 400, VoltageLevels.MV)
        Research.addResearch("ANOINTINGPASTE", "WITCHERY", "fabrico 12, aqua 9, praecantatio 6", 0, -4, 2,
                ItemBracketHandler.getItem("witchery:ingredient", 153))
        MineTweakerAPI.game.setLocalization("tc.research_name.ANOINTINGPASTE", "Anointing Paste")
        MineTweakerAPI.game.setLocalization("tc.research_text.ANOINTINGPASTE", "[WI] Magical Paste")
        Research.addPage("ANOINTINGPASTE", "Witchery.research_page.ANOINTINGPASTE.1")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.ANOINTINGPASTE.1",
                "Anointing Paste is smeared onto a regular cauldron to turn it into a Witches' Cauldron, ready for brewing interesting potions and spells. Simply place the Cauldron in the world, and then use the Anointing Paste on it to convert it into a Witches' Cauldron. Mixing different witchery seeds in a mixer with water will give anointing paste")
        Research.addResearch("OVEN", "WITCHERY", "metallum 15, fabrico 12, instrumentum 9, machina 6", -2, 2, 4,
                ItemBracketHandler.getItem("witchery:witchesovenidle", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.OVEN", "Witchery Oven")
        MineTweakerAPI.game.setLocalization("tc.research_text.OVEN", "[WI] The tales of Hansel and Gretel")
        Research.addPage("OVEN", "Witchery.research_page.OVEN.1")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.OVEN.1",
                "The witches oven, made infamous in the tale of Hansel and Gretel, is a very practical device for the would-be witch or warlock. While unable to smelt metals, the oven is particularly good at cooking food and making charcoal; cooking about 10% faster than a furnace. The second, and probably more important feature of a witches oven, is that it is able to capture the by-products produced in the cooking process. Activating the oven to show the interface screen, you will see an additional slot to the right of the fuel slot.")
        Research.addPage("OVEN", "Witchery.research_page.OVEN.2")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.OVEN.2",
                "Clay jars must be placed in this slot. If there are clay jars present when something is cooked, there is a chance a by-product will be captured in one of the jars. These by-products are important ingredients in other recipes. If there are no clay jars in the oven when something is cooked, no by-products will be produced.")
        Arcane.addShaped("OVEN", ItemBracketHandler.getItem("witchery:witchesovenidle", 0),
                "aer 20, ignis 20, terra 20", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateSteel"),
                OreBracketHandler.getOre("plateThaumium"), OreBracketHandler.getOre("plateSteel")),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("IC2:blockFenceIron", 0),
                        ItemBracketHandler.getItem("IC2:blockMachine", 1),
                        ItemBracketHandler.getItem("IC2:blockFenceIron", 0))))
        Research.addArcanePage("OVEN", ItemBracketHandler.getItem("witchery:witchesovenidle", 0))
        Warp.addToResearch("OVEN", 1)
        Research.addResearch("ATTUNEDSTONE", "WITCHERY", "instrumentum 15, vitreus 12, ordo 9, praecantatio 6", 2, 0, 4,
                ItemBracketHandler.getItem("witchery:ingredient", 10))
        MineTweakerAPI.game.setLocalization("tc.research_name.ATTUNEDSTONE", "Attuned Stone")
        MineTweakerAPI.game.setLocalization("tc.research_text.ATTUNEDSTONE", "[WI] Stone Tuning")
        Research.addPrereq("ATTUNEDSTONE", "OVEN", false)
        Research.addPage("ATTUNEDSTONE", "Witchery.research_page.ATTUNEDSTONE")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.ATTUNEDSTONE",
                "An attuned stone, is a diamond that has been infused with natural magic in a fiery medium. <BR>Attuned stones can be used to link non-magical devices to the magical currents present in the world, and are one of the main ingredients in crafting distilleries, kettles, altar foci and poppet shelves.<BR>The other main use of attuned stones is to act as a portable power source for circle magic rites, when a nearby altar is not available. To act in such a way, the attuned stone must first be charged with a Rite of Charging.")
        Arcane.addShaped("ATTUNEDSTONE", ItemBracketHandler.getItem("witchery:ingredient", 10),
                "aer 30, ignis 30, terra 30, ordo 30",
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("witchery:ingredient", 34), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:diamond", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:lava_bucket", 0), null)))
        Research.addArcanePage("ATTUNEDSTONE", ItemBracketHandler.getItem("witchery:ingredient", 10))
        Research.addResearch("QUARTZSPHERE", "WITCHERY", "vitreus 15, instrumentum 12, auram 9, ordo 6, praecantatio 3",
                2, -2, 4, ItemBracketHandler.getItem("witchery:ingredient", 92))
        MineTweakerAPI.game.setLocalization("tc.research_name.QUARTZSPHERE", "Quatz Sphere")
        MineTweakerAPI.game.setLocalization("tc.research_text.QUARTZSPHERE", "[WI] Calling The Witches")
        Research.addPrereq("QUARTZSPHERE", "ATTUNEDSTONE", false)
        Research.addPage("QUARTZSPHERE", "Witchery.research_page.QUARTZSPHERE")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.QUARTZSPHERE",
                "A Quartz Sphere is a component used in the Ritual production of a Crystal Ball.")
        Arcane.addShaped("QUARTZSPHERE", ItemBracketHandler.getItem("witchery:ingredient", 92),
                "aer 25, ignis 25, terra 25, ordo 25",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateNetherQuartz"),
                        OreBracketHandler.getOre("plateQuartzite"), OreBracketHandler.getOre("plateNetherQuartz")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateCertusQuartz"),
                                OreBracketHandler.getOre("lensGlass"), OreBracketHandler.getOre("plateCertusQuartz")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateNetherQuartz"),
                                OreBracketHandler.getOre("plateQuartzite"),
                                OreBracketHandler.getOre("plateNetherQuartz"))))
        Research.addArcanePage("QUARTZSPHERE", ItemBracketHandler.getItem("witchery:ingredient", 92))
        Research.addResearch("CANDELABRA", "WITCHERY", "praecantatio 15, lux 12, ordo 9, ignis 6", 0, -2, 4,
                ItemBracketHandler.getItem("witchery:ingredient", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.CANDELABRA", "Candelabra")
        MineTweakerAPI.game.setLocalization("tc.research_text.CANDELABRA", "[WI] It became light")
        Research.addPrereq("CANDELABRA", "ALTAR", false)
        Research.addPrereq("CANDELABRA", "TALLOW", false)
        Research.addPrereq("CANDELABRA", "ATTUNEDSTONE", false)
        Research.setConcealed("CANDELABRA", true)
        Research.addPage("CANDELABRA", "Witchery.research_page.CANDELABRA")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.CANDELABRA",
                "The candelabra is an upgrade for an altar that improves its recharge rate. The chalice will increase the recharge rate by 2x the base recharge rate.<BR>The candelabra is an upgrade to a torch. Only one torch upgrade will have an effect on an altar.")
        Arcane.addShaped("CANDELABRA", ItemBracketHandler.getItem("witchery:ingredient", 0),
                "terra 5, ignis 10, ordo 5",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCandle", 0)),
                        arrayOf(OreBracketHandler.getOre("stickIron"),
                                ItemBracketHandler.getItem("witchery:ingredient", 10),
                                OreBracketHandler.getOre("stickIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateIron"),
                                OreBracketHandler.getOre("stickThaumium"), OreBracketHandler.getOre("plateIron"))))
        Research.addArcanePage("CANDELABRA", ItemBracketHandler.getItem("witchery:ingredient", 0))
        Research.addResearch("KETTLE", "WITCHERY", "metallum 15, fabrico 12, instrumentum 9, ignis 6", 4, 0, 4,
                ItemBracketHandler.getItem("witchery:kettle", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.KETTLE", "Witchery Kettle")
        MineTweakerAPI.game.setLocalization("tc.research_text.KETTLE", "[WI] Hocus pocus")
        Research.addPrereq("KETTLE", "ATTUNEDSTONE", false)
        Research.setConcealed("KETTLE", true)
        Research.addPage("KETTLE", "Witchery.research_page.KETTLE.1")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.KETTLE.1",
                "Nothing invokes the image of witchcraft more than a bubbling witches kettle (or cauldron), which is used to make witches brews and later infusions.<BR>A kettle must be set up in the correct way, before it may be used. Firstly, a fire must be set under the kettle (netherrack is best for this, but wood will do just as well). Next the kettle must be filled by using a Water-filled Bucket on it. Thirdly, the ingredients for the brew or infusion must be thrown into the kettle (the liquid will change color according to the recipe being used). Finally, a glass bottle must be used on the kettle to bottle the resulting brew.")
        Research.addPage("KETTLE", "Witchery.research_page.KETTLE.2")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.KETTLE.2",
                "It is important to keep the fire going constantly while the recipe is being prepared, otherwise it will be ruined. Swirls coming from the kettle is a sign all is well, black smoke (and brown liquid) indicates the brew is ruined. When a brew is ruined, the kettle must be emptied with a glass bottle, or just filled with more water, and the whole process repeated. When a brew is complete, the liquid will be the color of the resulting brew and will splutter (in addition to white swirls). Some recipes will require magical energy from a nearby Altar before they are bottled. If the brew is bottled when insufficient energy is available, the brew will be ruined. Black swirls coming from the Kettle is a good sign there is not enough power.")
        Research.addPage("KETTLE", "Witchery.research_page.KETTLE.3")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.KETTLE.3",
                "A kettle must be within 14 (to 16) blocks of an Altar in order to obtain power from it (it can obtain power only from a single altar).")
        Arcane.addShaped("KETTLE", ItemBracketHandler.getItem("witchery:kettle", 0),
                "aer 40, ignis 40, aqua 40, perditio 40",
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(OreBracketHandler.getOre("plateSteel"),
                                ItemBracketHandler.getItem("witchery:ingredient", 10),
                                OreBracketHandler.getOre("plateSteel")),
                        arrayOf(OreBracketHandler.getOre("screwThaumium"),
                                ItemBracketHandler.getItem("minecraft:cauldron", 0),
                                OreBracketHandler.getOre("screwThaumium"))))
        Research.addArcanePage("KETTLE", ItemBracketHandler.getItem("witchery:kettle", 0))
        Warp.addToResearch("KETTLE", 2)
        Research.addResearch("SPINNINGWHEELW", "WITCHERY",
                "arbor 18, motus 15, fabrico 12, instrumentum 9, aer 6, praecantatio 3", 6, 0, 4,
                ItemBracketHandler.getItem("witchery:spinningwheel", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.SPINNINGWHEELW", "Witchery Spinning Wheel")
        MineTweakerAPI.game.setLocalization("tc.research_text.SPINNINGWHEELW", "[WI] Round and round...")
        Research.addPrereq("SPINNINGWHEELW", "KETTLE", false)
        Research.setConcealed("SPINNINGWHEELW", true)
        Research.addPage("SPINNINGWHEELW", "Witchery.research_page.SPINNINGWHEELW")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.SPINNINGWHEELW",
                "A Spinning Wheel is a device for spinning materials into thread. It is a magical device that draws power from a nearby Altar. To start spinning, place the raw material in the slot on the left, any additional ingredients in the bottom slots and the process will begin as long as there is sufficient power.<BR>The spinning wheel can be used to make Golden Thread, Fanciful Thread and Tormented Twine.")
        Arcane.addShaped("SPINNINGWHEELW", ItemBracketHandler.getItem("witchery:spinningwheel", 0),
                "aer 60, ignis 60, ordo 60, perditio 60",
                arrayOf(arrayOf(OreBracketHandler.getOre("stickStainlessSteel"),
                        ItemBracketHandler.getItem("witchery:ingredient", 10),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:item_frame", 0),
                                ItemBracketHandler.getItem("minecraft:item_frame", 0),
                                ItemBracketHandler.getItem("minecraft:item_frame", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stickStainlessSteel"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("stickStainlessSteel"))))
        Research.addArcanePage("SPINNINGWHEELW", ItemBracketHandler.getItem("witchery:spinningwheel", 0))
        Research.addResearch("DISTILLERY", "WITCHERY",
                "metallum 18, motus 15, fabrico 12, instrumentum 9, aqua 6, praecantatio 3", 8, 0, 4,
                ItemBracketHandler.getItem("witchery:distilleryidle", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.DISTILLERY", "Distillery")
        MineTweakerAPI.game.setLocalization("tc.research_text.DISTILLERY", "[WI] Blub...Blub...")
        Research.addPrereq("DISTILLERY", "SPINNINGWHEELW", false)
        Research.setConcealed("DISTILLERY", true)
        Research.addPage("DISTILLERY", "Witchery.research_page.DISTILLERY")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.DISTILLERY",
                "A distillery used by a witch is a construct used for distilling magical ingredients. It is unlike a normal distillery, because it heats itself using energy obtained from a nearby altar, the distillery must be within about 14 (to 16) blocks of an altar to draw power from it, a small icon is shown in the interface if no power is available.One or two ingredients are distilled together and will result in up to four distillates; or resulting materials. A supply of clay jars is also needed to capture the some or all of the distillates.A distillery is crafted using Iron Ingots, Gold Ingots, an Attuned Stone and Clay jars.")
        Arcane.addShaped("DISTILLERY", ItemBracketHandler.getItem("witchery:distilleryidle", 0),
                "aer 80, ignis 80, ordo 80, perditio 80, aqua 80",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 27),
                        ItemBracketHandler.getItem("witchery:ingredient", 10),
                        ItemBracketHandler.getItem("witchery:ingredient", 27)),
                        arrayOf(OreBracketHandler.getOre("pipeSmallStainlessSteel"),
                                ItemBracketHandler.getItem("witchery:cauldron", 0),
                                OreBracketHandler.getOre("pipeSmallStainlessSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseThaumium"),
                                OreBracketHandler.getOre("craftingIronFurnace"),
                                OreBracketHandler.getOre("plateDenseThaumium"))))
        Research.addArcanePage("DISTILLERY", ItemBracketHandler.getItem("witchery:distilleryidle", 0))
        Warp.addToResearch("DISTILLERY", 3)
        Research.addResearch("RITUALCHALK", "WITCHERY",
                "sensus 18, motus 15, auram 12, potentia 9, iter 6, praecantatio 3", 8, -2, 4,
                ItemBracketHandler.getItem("witchery:chalkritual", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.RITUALCHALK", "Ritual Chalk")
        MineTweakerAPI.game.setLocalization("tc.research_text.RITUALCHALK", "[WI] Drawing Signs")
        Research.addPrereq("RITUALCHALK", "DISTILLERY", false)
        Research.setConcealed("RITUALCHALK", true)
        Research.addPage("RITUALCHALK", "Witchery.research_page.RITUALCHALK.1")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.RITUALCHALK.1",
                "Ritual chalk is used to draw each of the white ritual glyphs that make up a ritual circle. It is also used as an ingredient in crafting the other types of chalk. To draw a ritual glyph, use the chalk on the ground. Ritual glyphs of various types will be drawn, although they all have the same function. If you use the chalk on an existing ritual glyph, a new one will be drawn in its place. <BR>Ritual chalk is crafted from Gypsum, Wood Ash and Tear of the Goddess.")
        Research.addPage("RITUALCHALK", "Witchery.research_page.RITUALCHALK.2")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.RITUALCHALK.2",
                "Ritual glyphs should be arranged in the roughly circular patterns as illustrated in the book Witchcraft: Circle Magic. With a heart glyph drawn with Golden Chalk in the center.")
        Arcane.addShaped("RITUALCHALK", ItemBracketHandler.getItem("witchery:chalkritual", 0).amount(2),
                "aer 50, terra 50, ordo 25, ignis 25",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 18),
                        ItemBracketHandler.getItem("witchery:ingredient", 37),
                        ItemBracketHandler.getItem("witchery:ingredient", 18)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 18),
                                ItemBracketHandler.getItem("witchery:ingredient", 17),
                                ItemBracketHandler.getItem("witchery:ingredient", 18)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 18),
                                ItemBracketHandler.getItem("witchery:ingredient", 17),
                                ItemBracketHandler.getItem("witchery:ingredient", 18))))
        Research.addArcanePage("RITUALCHALK", ItemBracketHandler.getItem("witchery:chalkritual", 0))
        Research.addResearch("CIRCLETALISMAN", "WITCHERY",
                "lucrum 18, motus 15, auram 12, potentia 9, aer 6, praecantatio 3", 10, -2, 4,
                ItemBracketHandler.getItem("witchery:circletalisman", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.CIRCLETALISMAN", "Circle Talisman")
        MineTweakerAPI.game.setLocalization("tc.research_text.CIRCLETALISMAN", "[WI] Oh Shiny Talisman")
        Research.addPrereq("CIRCLETALISMAN", "RITUALCHALK", false)
        Research.setConcealed("CIRCLETALISMAN", true)
        Research.addPage("CIRCLETALISMAN", "Witchery.research_page.CIRCLETALISMAN.1")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.CIRCLETALISMAN.1",
                "A circle talisman allows a pattern of glyphs drawn onto the ground to be bound instead to the talisman (the glyphs will disappear) and later be redrawn at a new location when then talisman is used. This makes it very easy for the witch or wizard to prepare time consuming circles in advance for rapid deployment later. <BR> To bind a circle talisman perform the Rite of Binding described in Witchcraft: Circle Magic with any pattern of circles.")
        Research.addPage("CIRCLETALISMAN", "Witchery.research_page.CIRCLETALISMAN.2")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.CIRCLETALISMAN.2",
                "To deploy a bound talisman, right-click on the ground in a place with enough space to contain the pattern. You will hear a fail sound if there are obstructions and the circles cannot be placed.")
        Arcane.addShaped("CIRCLETALISMAN", ItemBracketHandler.getItem("witchery:circletalisman", 0),
                "ordo 50, terra 50, ignis 50", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"),
                OreBracketHandler.getOre("stickGold"), OreBracketHandler.getOre("screwGold")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("stickGold"),
                        OreBracketHandler.getOre("gemExquisiteDiamond"), OreBracketHandler.getOre("stickGold")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("screwGold"), OreBracketHandler.getOre("stickGold"),
                        OreBracketHandler.getOre("screwGold"))))
        Research.addArcanePage("CIRCLETALISMAN", ItemBracketHandler.getItem("witchery:circletalisman", 0))
        Warp.addToResearch("CIRCLETALISMAN", 1)
        Research.addResearch("ALTAR", "WITCHERY", "praecantatio 15, fabrico 12, arbor 9, terra 6", -2, 0, 4,
                ItemBracketHandler.getItem("witchery:altar", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.ALTAR", "Witchery Altar")
        MineTweakerAPI.game.setLocalization("tc.research_text.ALTAR", "[WI] Our Father")
        Research.addPrereq("ALTAR", "OVEN", false)
        Research.addPrereq("ALTAR", "ARCANESTONE", false)
        Research.setConcealed("ALTAR", true)
        Research.addPage("ALTAR", "Witchery.research_page.ALTAR.1")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.ALTAR.1",
                "An altar is a focal point to concentrate the magic present in the surrounding area into single usable source of power. Since witchcraft is a method to harness the power of nature, placing an altar in a location with little or no living things will yield very little magic to work with. There is a reason why most witches huts are found deep in dark forests or swamps!<BR>An altar is created by placing six altar blocks in a 2x3 pattern; you will know it is correct when a red cloth appears over the top of the altar.")
        Research.addPage("ALTAR", "Witchery.research_page.ALTAR.2")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.ALTAR.2",
                "Activating the altar by right-clicking on it will bring up a screen showing how much power the altar has collected, how much it can collect and its current recharge rate. It is important to check that there is sufficient available power to perform a given rite or use a distillery or kettle recipe.<BR>The maximum amount of power available is determined by how many natural items are in the vicinity of the altar, dirt, grass, trees, plants, etc. all contribute; stone and sand do not. The important thing is to have a diverse mix of different plants, trees and crops (plants from other mods are supported to an extent as well).")
        Arcane.addShaped("ALTAR", ItemBracketHandler.getItem("witchery:altar", 0).amount(2),
                "terra 20, ignis 20, ordo 20",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 32),
                        ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                        ItemBracketHandler.getItem("witchery:ingredient", 31)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                ItemBracketHandler.getItem("witchery:witchlog", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7),
                                ItemBracketHandler.getItem("witchery:witchlog", 0),
                                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 7))))
        Research.addArcanePage("ALTAR", ItemBracketHandler.getItem("witchery:altar", 0))
        Warp.addToResearch("ALTAR", 2)
        Research.addResearch("CHALICE", "WITCHERY", "praecantatio 15, lucrum 12, metallum 9, terra 6", 0, 0, 4,
                ItemBracketHandler.getItem("witchery:ingredient", 1))
        MineTweakerAPI.game.setLocalization("tc.research_name.CHALICE", "Chalice")
        MineTweakerAPI.game.setLocalization("tc.research_text.CHALICE", "[WI] Cheers")
        Research.addPrereq("CHALICE", "ALTAR", false)
        Research.addPrereq("CHALICE", "ATTUNEDSTONE", false)
        Research.setConcealed("CHALICE", true)
        Research.addPage("CHALICE", "Witchery.research_page.CHALICE")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.CHALICE",
                "The chalice is an upgrade for an altar that improves the maximum amount of power an altar can hold. The chalice will increase the maximum power by 1x the base power rate.<BR>The chalice upgrades to the Filled Chalice. Only one chalice upgrade will have an effect on an altar.")
        Arcane.addShaped("CHALICE", ItemBracketHandler.getItem("witchery:ingredient", 1), "aqua 15, terra 10, ordo 5",
                arrayOf(arrayOf(OreBracketHandler.getOre("foilGold"),
                        ItemBracketHandler.getItem("witchery:ingredient", 10), OreBracketHandler.getOre("foilGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateGold"),
                                OreBracketHandler.getOre("plateGold"), OreBracketHandler.getOre("plateGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilThaumium"),
                                OreBracketHandler.getOre("ingotGold"), OreBracketHandler.getOre("foilThaumium"))))
        Research.addArcanePage("CHALICE", ItemBracketHandler.getItem("witchery:ingredient", 1))

        //TODO Replace ("TConstruct:handGuard", 16), ("TConstruct:knifeBlade", 202) and ("TConstruct:toolRod", 6)
        //Research.addResearch("ARTHANA", "WITCHERY", "praecantatio 15, lucrum 12, instrumentum 9, mortuus 6", -4, -2, 4,
        //        ItemBracketHandler.getItem("witchery:arthana", 0))
        //MineTweakerAPI.game.setLocalization("tc.research_name.ARTHANA", "Arthana")
        //MineTweakerAPI.game.setLocalization("tc.research_text.ARTHANA", "[WI] Ritualistic Knife")
        //Research.addPrereq("ARTHANA", "ALTAR", false)
        //Research.setConcealed("ARTHANA", true)
        //Research.addPage("ARTHANA", "Witchery.research_page.ARTHANA.1")
        //MineTweakerAPI.game.setLocalization("Witchery.research_page.ARTHANA.1",
        //        "An Arthana is a ritualistic knife use by witches and warlocks to both collect special ingredients and to perform some rites. It has the same general properties as a golden sword (damage, enchantability, etc.), although it has the durability of an iron sword. It is repaired with a Gold Ingot.<BR>The main purpose of the dagger is to collect specialist ingredients used in witchcraft, and to this end it will dramatically improve the chance of a mob dropping such ingredients (e.g. Wool of Bat, Tongue of Dog, etc.). It also gives a small chance of undead dropping Spectral Dust.")
        //Research.addPage("ARTHANA", "Witchery.research_page.ARTHANA.2")
        //MineTweakerAPI.game.setLocalization("Witchery.research_page.ARTHANA.2",
        //        "When only using vanilla Minecraft with Witchery (and no other mods), an Arthana dagger is the only way to get a skull to drop when a skeleton is killed, the drop chance is about 5% (the skull is a key upgrade for an altar). The dagger even gives a very small probability for other head drops (from mobs and players). All drop chances are increased with the Looting enchantment.<BR>An Arthana does not change the drop chance for Wither Skeleton Skulls, that will require the Looting enchantment as usual.<BR>Some Circle Magic rites use an Arthana as a foci, the Arthana is not consumed in the proces.")
        //Arcane.addShaped("ARTHANA", ItemBracketHandler.getItem("witchery:arthana", 0), "terra 20, perditio 15, ordo 10",
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:handGuard", 16),
        //                OreBracketHandler.getOre("craftingToolScrewdriver"),
        //                ItemBracketHandler.getItem("TConstruct:knifeBlade", 202)),
        //                arrayOf<IIngredient>(OreBracketHandler.getOre("screwThaumium"),
        //                        OreBracketHandler.getOre("gemEmerald"),
        //                        OreBracketHandler.getOre("craftingToolHardHammer")),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:toolRod", 6),
        //                        OreBracketHandler.getOre("screwThaumium"),
        //                        ItemBracketHandler.getItem("TConstruct:handGuard", 16))))
        //Research.addArcanePage("ARTHANA", ItemBracketHandler.getItem("witchery:arthana", 0))
        //Warp.addToResearch("ARTHANA", 2)

        //TODO Replace ("TConstruct:jerky", 7)
        //Research.addResearch("WARMBLOOD", "WITCHERY", "fames 15, lucrum 12, aqua 9, exanimis 6", -2, -2, 4,
        //        ItemBracketHandler.getItem("witchery:ingredient", 163))
        //MineTweakerAPI.game.setLocalization("tc.research_name.WARMBLOOD", "Warm Blood")
        //MineTweakerAPI.game.setLocalization("tc.research_text.WARMBLOOD", "[WI] Mhhh warm Blood")
        //Research.addPrereq("WARMBLOOD", "ALTAR", false)
        //Research.setConcealed("WARMBLOOD", true)
        //Research.addPage("WARMBLOOD", "Witchery.research_page.WARMBLOOD")
        //MineTweakerAPI.game.setLocalization("Witchery.research_page.WARMBLOOD",
        //        "The Bottle of Warm Blood is an item that can be drunk by a player. If the player is a vampire, they will restore 2 droplets of blood to the blood pool. If the player is not a vampire they will get a hunger debuff. This item allows a players to quickly get blood, or it can be used as a ingredient for the Demonic Contract.")
        //Crucible.addRecipe("WARMBLOOD", ItemBracketHandler.getItem("witchery:ingredient", 163),
        //        ItemBracketHandler.getItem("TConstruct:jerky", 7), "exanimis 4, fames 4, lucrum 4")
        //Research.addCruciblePage("WARMBLOOD", ItemBracketHandler.getItem("witchery:ingredient", 163))
        //Warp.addToResearch("WARMBLOOD", 3)

        Research.addResearch("FUMEFUNNEL", "WITCHERY", "metallum 15, ignis 12, lux 9, sensus 6", 0, 2, 4,
                ItemBracketHandler.getItem("witchery:fumefunnel", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.FUMEFUNNEL", "Fume Funnel")
        MineTweakerAPI.game.setLocalization("tc.research_text.FUMEFUNNEL", "[WI] Upgrades Yea")
        Research.addPrereq("FUMEFUNNEL", "OVEN", false)
        Research.setConcealed("FUMEFUNNEL", true)
        Research.addPage("FUMEFUNNEL", "Witchery.research_page.FUMEFUNNEL")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.FUMEFUNNEL",
                "A fume funnel is an upgrade for the Witches Oven that increases that increases the speed (over a normal furnace) by an additional 10%, and increases the chances of a by-product being produced by a further 25%.The Fume Funnel must be positioned next to the left or right of the witches oven with the same facing. Up to two funnels can be attached to one oven. It is possible to place a funnel between two ovens for it to benefit both. A third fume funnel can also be placed on top of an oven to make it look better and also to increase its speed by a further 10%.")
        Arcane.addShaped("FUMEFUNNEL", ItemBracketHandler.getItem("witchery:fumefunnel", 0),
                "aer 30, ignis 30, terra 30", arrayOf(arrayOf(OreBracketHandler.getOre("plateThaumium"),
                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0), OreBracketHandler.getOre("plateThaumium")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("plateGlowstone"), OreBracketHandler.getOre("bucketLava"),
                        OreBracketHandler.getOre("plateGlowstone")), arrayOf(OreBracketHandler.getOre("blockSteel"),
                ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0), OreBracketHandler.getOre("blockSteel"))))
        Research.addArcanePage("FUMEFUNNEL", ItemBracketHandler.getItem("witchery:fumefunnel", 0))
        Warp.addToResearch("FUMEFUNNEL", 1)
        Research.addResearch("FUMEFILTER", "WITCHERY", "metallum 9, vitreus 9, lucrum 6, praecantatio 3", 2, 2, 4,
                ItemBracketHandler.getItem("witchery:ingredient", 73))
        MineTweakerAPI.game.setLocalization("tc.research_name.FUMEFILTER", "Fume Filter")
        MineTweakerAPI.game.setLocalization("tc.research_text.FUMEFILTER", "[WI] More By-products")
        Research.addPrereq("FUMEFILTER", "DISTILESSENTIA", false)
        Research.addPrereq("FUMEFILTER", "FUMEFUNNEL", false)
        Research.addPrereq("FUMEFILTER", "ATTUNEDSTONE", false)
        Research.setConcealed("FUMEFILTER", true)
        Research.addPage("FUMEFILTER", "Witchery.research_page.FUMEFILTER")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.FUMEFILTER",
                "A Fume Filter is used to upgrade a Fume Funnel to a Filtered Fume Funnel in order to increase the by-product chance of a Witches Oven.")
        Arcane.addShaped("FUMEFILTER", ItemBracketHandler.getItem("witchery:ingredient", 73),
                "aer 16, ordo 16, terra 16", arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("paneGlass"),
                OreBracketHandler.getOre("paneGlass"), OreBracketHandler.getOre("paneGlass")),
                arrayOf(OreBracketHandler.getOre("plateThaumium"),
                        ItemBracketHandler.getItem("witchery:ingredient", 10),
                        OreBracketHandler.getOre("plateThaumium")),
                arrayOf<IIngredient>(OreBracketHandler.getOre("paneGlass"), OreBracketHandler.getOre("paneGlass"),
                        OreBracketHandler.getOre("paneGlass"))))
        Research.addArcanePage("FUMEFILTER", ItemBracketHandler.getItem("witchery:ingredient", 73))
        Research.addResearch("FILTEREDFUMEFUNNEL", "WITCHERY", "metallum 15, vitreus 12, lux 9, praecantatio 6", 2, 4,
                4, ItemBracketHandler.getItem("witchery:filteredfumefunnel", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.FILTEREDFUMEFUNNEL", "Filtered Fume Funnel")
        MineTweakerAPI.game.setLocalization("tc.research_text.FILTEREDFUMEFUNNEL", "[WI] Upgrades again? Yea!")
        Research.addPrereq("FILTEREDFUMEFUNNEL", "FUMEFILTER", false)
        Research.setConcealed("FILTEREDFUMEFUNNEL", true)
        Research.addPage("FILTEREDFUMEFUNNEL", "Witchery.research_page.FILTEREDFUMEFUNNEL")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.FILTEREDFUMEFUNNEL",
                "A Filtered Fume Funnel is an upgrade to the Fume Funnel that increases the chance of a by-product being produced by a connected witches Oven by a further 5% above the normal Fume Funnel (for a total of +10% cook speed and +30% by-product chance). As with a Fume Funnel, an oven can only accept two Fume Funnels (whether they are upgraded or not).")
        Infusion.addRecipe("FILTEREDFUMEFUNNEL", ItemBracketHandler.getItem("witchery:fumefunnel", 0),
                arrayOf(ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 73),
                        ItemBracketHandler.getItem("dreamcraft:item.SteelBars", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 8)),
                "metallum 32, vitreus 8, praecantatio 24, lux 16",
                ItemBracketHandler.getItem("witchery:filteredfumefunnel", 0), 3)
        Research.addInfusionPage("FILTEREDFUMEFUNNEL", ItemBracketHandler.getItem("witchery:filteredfumefunnel", 0))
        Warp.addToResearch("FILTEREDFUMEFUNNEL", 2)
        Research.addResearch("WAYSTONE", "WITCHERY", "motus 15, iter 12, tenebrae 9, praecantatio 6", 8, -4, 4,
                ItemBracketHandler.getItem("witchery:ingredient", 12))
        MineTweakerAPI.game.setLocalization("tc.research_name.WAYSTONE", "Waystone")
        MineTweakerAPI.game.setLocalization("tc.research_text.WAYSTONE", "[WI] Teleport")
        Research.addPrereq("WAYSTONE", "RITUALCHALK", false)
        Research.setConcealed("WAYSTONE", true)
        Research.addPage("WAYSTONE", "Witchery.research_page.WAYSTONE")
        MineTweakerAPI.game.setLocalization("Witchery.research_page.WAYSTONE",
                "A waystone is an etched piece of flint that is an important foci for circle magic involving transposition. A waystone can be bound to a specific location using the Rite of Binding described in the book, Witchcraft: Circle Magic.<BR>A bound waystone can also be made by dropping up to eight into a hollow 3x3 circle of Otherwhere runes and waiting.")
        Infusion.addRecipe("WAYSTONE", ItemBracketHandler.getItem("minecraft:flint", 0),
                arrayOf(ItemBracketHandler.getItem("witchery:chalkritual", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 7),
                        ItemBracketHandler.getItem("witchery:chalkritual", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 7),
                        ItemBracketHandler.getItem("witchery:chalkritual", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 7),
                        ItemBracketHandler.getItem("witchery:chalkritual", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 7)),
                "motus 32, iter 16, praecantatio 24, tenebrae 16",
                ItemBracketHandler.getItem("witchery:ingredient", 12), 5)
        Research.addInfusionPage("WAYSTONE", ItemBracketHandler.getItem("witchery:ingredient", 12))
        Warp.addToResearch("WAYSTONE", 5)
    }
}