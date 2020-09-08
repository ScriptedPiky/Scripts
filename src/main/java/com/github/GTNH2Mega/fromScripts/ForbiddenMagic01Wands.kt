package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.thaumcraft.handlers.*

class ForbiddenMagic01Wands : Runnable {
    override fun run() {
        ItemBracketHandler.getItem("thaumicbases:resource", 2)
        val item = ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 3)
        val item2 = ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 2)
        val item3 = ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 1)
        val item4 = ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 5)
        val item5 = ItemBracketHandler.getItem("Thaumcraft:ItemResource", 15)
        Arcane.addShaped("CAP_elementium", ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 6),
                "aer 60, terra 60, ignis 60, aqua 60, ordo 60, perditio 60",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwTungstenSteel"),
                        OreBracketHandler.getOre("plateInfusedAir"), OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf(OreBracketHandler.getOre("plateInfusedWater"), item,
                                OreBracketHandler.getOre("plateInfusedFire")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwTungstenSteel"),
                                OreBracketHandler.getOre("plateInfusedEarth"),
                                OreBracketHandler.getOre("screwTungstenSteel"))))
        Arcane.addShaped("CAP_vinteum", item3, "aer 40, terra 40, ignis 40, aqua 40, ordo 40, perditio 40",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwTitanium"),
                        OreBracketHandler.getOre("foilVinteum"), OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilVinteum"),
                                OreBracketHandler.getOre("ringVinteum"), OreBracketHandler.getOre("foilVinteum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwTitanium"),
                                OreBracketHandler.getOre("foilVinteum"), OreBracketHandler.getOre("screwTitanium"))))
        Arcane.addShaped("ROD_witchwood_staff", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 10),
                "aer 125, terra 125, ignis 125, aqua 125, ordo 125, perditio 125",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1), item5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Arcane.addShaped("ROD_dreamwood_staff", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 13),
                "aer 125, terra 125, ignis 125, aqua 125, ordo 125, perditio 125",
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1), item5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 11),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 11),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 4),
                                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5))))
        Arcane.addShaped("ROD_witchwood_staff", ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 10),
                "aer 40, terra 40, ignis 40, aqua 40, ordo 40, perditio 40",
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwTitanium"),
                        OreBracketHandler.getOre("foilVinteum"), OreBracketHandler.getOre("screwTitanium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("foilVinteum"),
                                OreBracketHandler.getOre("ringVinteum"), OreBracketHandler.getOre("foilVinteum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwTitanium"),
                                OreBracketHandler.getOre("foilVinteum"), OreBracketHandler.getOre("screwTitanium"))))
        Crucible.addRecipe("VINTEUM", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9529),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9330), "permutatio 4, ordo 2, vitreus 2")

        //TODO Replace ("TConstruct:materials", 6)
        //Infusion.addRecipe("ROD_livingwood", ItemBracketHandler.getItem("Thaumcraft:WandRod", 0),
        //        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bucketLife", 0),
        //                ItemBracketHandler.getItem("TConstruct:materials", 6),
        //                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:bucketLife", 0),
        //                ItemBracketHandler.getItem("TConstruct:materials", 6),
        //                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0),
        //                ItemBracketHandler.getItem("AWWayofTime:bucketLife", 0),
        //                ItemBracketHandler.getItem("TConstruct:materials", 6),
        //                ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 0)),
        //        "victus 64, herba 32, arbor 32, praecantatio 24, instrumentum 24",
        //        ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 7), 6)

        Infusion.addRecipe("ROD_dreamwood", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 7),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 5),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 6),
                        ItemBracketHandler.getItem("Thaumcraft:blockMagicalLog", 1),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 5),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 6)),
                "auram 64, praecantatio 48, tempestas 32, instrumentum 24, lux 24",
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 11), 7)
        Infusion.addRecipe("ROD_witchwood", ItemBracketHandler.getItem("witchery:ingredient", 82),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8529),
                        ItemBracketHandler.getItem("witchery:witchsapling", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 34),
                        ItemBracketHandler.getItem("witchery:witchsapling", 1),
                        ItemBracketHandler.getItem("witchery:ingredient", 36),
                        ItemBracketHandler.getItem("witchery:witchsapling", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8529),
                        ItemBracketHandler.getItem("witchery:witchsapling", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 34),
                        ItemBracketHandler.getItem("witchery:witchsapling", 1),
                        ItemBracketHandler.getItem("witchery:ingredient", 36),
                        ItemBracketHandler.getItem("witchery:witchsapling", 2)),
                "arbor 64, praecantatio 48, herba 32, instrumentum 24,vacuos 24",
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 4), 6)
        Infusion.addRecipe("CAP_manasteel", ItemBracketHandler.getItem("Thaumcraft:WandCap", 4),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2333),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2333),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2333),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2333),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2333),
                        ItemBracketHandler.getItem("ProjRed|Core:projectred.core.part", 56)),
                "potentia 64, praecantatio 48, electrum 32, instrumentum 24, machina 24", item, 6)
        Infusion.addRecipe("CAP_terrasteel", item, arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17339),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30501),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17339),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3)),
                "praecantatio 256, ordo 64, metallum 64, superbia 20, strontio 10", item2, 6)
        Infusion.addRecipe("CAP_elementium", ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 6),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)),
                "ignis 32, aqua 32 , aer 32, terra 32, ordo 32 , perditio 32, praecantatio 32, potentia 24", item4, 7)
        Research.addResearch("JOURNEY", "FORBIDDEN", "iter 5, praecantatio 10, instrumentum 3", -3, 3, 8,
                ItemBracketHandler.getItem("BiomesOPlenty:food", 7))
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.JOURNEY", "A long Journey")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.JOURNEY", "[FM] There must be more Magic!")
        Research.addPage("JOURNEY", "derp.research_page.JOURNEY")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.JOURNEY",
                "The Thaumonomicon told you about purple trees with white leaves and about colorful sparkeling flowers, but you simple were unable to find them in the world, it seems that they don't exist.<BR> You decited to create these Objects yourself. You're a Thaumaturge, you don't care if things exist or not, you can simpley create them on your own, but it will take further investigation to do so.")
        Research.addPrereq("JOURNEY", "SCHOOLS", false)
        Research.setRound("JOURNEY", true)
        Research.setStub("JOURNEY", true)
        Research.setAutoUnlock("JOURNEY", true)
        Research.addResearch("ROD_livingwood", "FORBIDDEN",
                "victus 5, praecantatio 10, herba 3,instrumentum 4, arbor 5", -1, 3, 8,
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 7))
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.ROD_livingwood", "Livingwood Rod")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.ROD_livingwood", "[FM] A living Wand Rod?")
        Research.addPage("ROD_livingwood", "derp.research_page.ROD_livingwood")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.ROD_livingwood",
                "You know you could do it! Livingwood could only be created by a flower, until now. By infusing a mundane greatwood rod with, the essence of life, some moss and victus essentia, you were able to create a wandrod out of Livingwood, that can store up to 100 vis. That result is astounding, but you think that you can do better.")
        Research.addInfusionPage("ROD_livingwood", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 7))
        Research.setConcealed("ROD_livingwood", true)
        Research.addPrereq("ROD_livingwood", "JOURNEY", false)
        Research.addPrereq("ROD_livingwood", "BLOODALTAR", false)
        Research.addPrereq("ROD_livingwood", "BALLOFMOSS", false)
        Research.addPrereq("ROD_livingwood", "ROD_greatwood", false)
        Warp.addToResearch("ROD_livingwood", 2)
        Research.addResearch("ROD_dreamwood", "FORBIDDEN", "auram 5, praecantatio 10, herba 3,instrumentum 4, arbor 5",
                1, 4, 8, ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 11))
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.ROD_dreamwood", "Dreamwood Rod")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.ROD_dreamwood",
                "[FM] Sweet dreams are made of these")
        Research.addPage("ROD_dreamwood", "derp.research_page.ROD_dreamwood")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.ROD_dreamwood",
                "Livingwood is quite useful, but it can't be turned into a staff, it's just to unstable. You heard about dreamwood, which is quite stable, but requires elven magic and you have no idea where you can get an elve from. Maybe it is possible to just stabalize your livingwood rod with some magical crystals and a bit of Silverwood. The thaumonomicon told you that this has to be done in the elven world, but you simply tried to use more auram, which seemed to work aswell. <BR> You new rod now holds exact the same amount of vis than the old one, but it can be turnd into a staff and looks much more stylish.")
        Research.addInfusionPage("ROD_dreamwood", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 11))
        Research.setConcealed("ROD_dreamwood", true)
        Research.addPrereq("ROD_dreamwood", "ROD_livingwood", false)
        Research.addPrereq("ROD_dreamwood", "ROD_silverwood", false)
        Research.addResearch("ROD_dreamwood_staff", "FORBIDDEN",
                "auram 5, praecantatio 10, herba 3,instrumentum 4, arbor 5", 3, 4, 8,
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 13))
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.ROD_dreamwood_staff", "Dreamwood Staff")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.ROD_dreamwood_staff",
                "[FM] Oh, fantasy free me!")
        Research.addPage("ROD_dreamwood_staff", "derp.research_page.ROD_dreamwood_staff")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.ROD_dreamwood_staff",
                "You finally are able to build a staff out of dreamwood, just add a primal charm, some crystal clusters and two rods together and you've got you new staff, that holds up to 250 vis of each type.")
        Research.addPrereq("ROD_dreamwood_staff", "ROD_dreamwood", false)
        Research.addArcanePage("ROD_dreamwood_staff", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 13))
        Research.setSpikey("ROD_dreamwood_staff", true)
        Research.setConcealed("ROD_dreamwood_staff", true)
        Research.addPrereq("ROD_dreamwood_staff", "ROD_silverwood_staff", false)
        Warp.addToResearch("ROD_dreamwood_staff", 3)
        Research.addResearch("CAP_manasteel", "FORBIDDEN",
                "metallum 5, praecantatio 10, lucrum 3,instrumentum 4, auram 5", 1, 2, 8, item)
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.CAP_manasteel", "Manasteel Caps")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.CAP_manasteel", "[FM] The secret of Mana")
        Research.addPage("CAP_manasteel", "derp.research_page.CAP_manasteel")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.CAP_manasteel",
                "Manasteel is the Botanical equivalent to Thaumium, so it should be possible to create caps out of it, by infusing some silver caps with some electrotine and astral silver you were able to create a cap with the strength of blue alloy and a higher magical conductivity than mundane silver. The vis discount is the same as Thaumium, you think thats the reason why it is call Botanical Thaumium.")
        Research.addInfusionPage("CAP_manasteel", item)
        Research.setConcealed("CAP_manasteel", true)
        Research.addPrereq("CAP_manasteel", "ROD_livingwood", false)
        Research.addPrereq("CAP_manasteel", "CAP_silver", false)
        Research.addPrereq("CAP_manasteel", "THAUMIUM", false)
        Warp.addToResearch("CAP_manasteel", 2)
        Research.addResearch("CAP_terrasteel", "FORBIDDEN",
                "terra 5, praecantatio 10, superbia 3,instrumentum 4,strontio 2, vitreus 5", 3, 2, 8, item2)
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.CAP_terrasteel", "Terrasteel Wand Caps")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.CAP_terrasteel", "[FM] Completion!")
        Research.addPage("CAP_terrasteel", "derp.research_page.CAP_terrasteel")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.CAP_terrasteel",
                "You've read about a metal, that's completely charged with magical energies that it could even summon demons, you don't think that's true, but it's worth a try. Just infuse you manasteel caps again with some steel leafs, crystal clusters and add a few jars of praecantatio essentia and see what happens, maybe it will be the best wand cap existing in this world.")
        Research.addInfusionPage("CAP_terrasteel", item2)
        Research.setConcealed("CAP_terrasteel", true)
        Research.addPrereq("CAP_terrasteel", "CAP_manasteel", false)
        Research.addPrereq("CAP_terrasteel", "TRANSEMERALD", true)
        Warp.addToResearch("CAP_terrasteel", 4)
        Research.addResearch("CAP_elementium", "FORBIDDEN",
                "auram 5, praecantatio 10, victus 3,instrumentum 4, humanus 5", 3, 1, 8, item4)
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.CAP_elementium", "Elementium Wand Caps")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.CAP_elementium", "[FM] Eco Friendly Wand Caps")
        Research.addPage("CAP_elementium", "derp.research_page.CAP_elementium")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.CAP_elementium",
                "What would happen if you combine you Manasteel caps with power of elemental shards? Instead of thinking about what could happen, you simply tried it, since the shards seem to resist the cap you decided to use some tungstensteel screws to bind it all together. The result is a metal, that has a higher vis discount than thaumium. Sadly it has to be reinfused, due to it's new non magical components.")
        Research.addPrereq("CAP_elementium", "CAP_manasteel", false)
        Research.addArcanePage("CAP_elementium", ItemBracketHandler.getItem("ForbiddenMagic:WandCaps", 6))
        Research.addInfusionPage("CAP_elementium", item4)
        Research.setConcealed("CAP_elementium", true)
        Research.addResearch("VINTEUM", "FORBIDDEN", "metallum 5, permutatio 10, praecantatio 3, lucrum 2", -4, 2, 8,
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 8529))
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.VINTEUM", "Vinteum")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.VINTEUM", "[FM] Thaumium's smaller brother")
        Research.addPage("VINTEUM", "derp.research_page.VINTEUM")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.VINTEUM",
                "Every Thaumaturge knows about Thaumium, it is fairly easy to produce and is a great magical conductor. More skilled Thaumaturges prefer using vinteum instead. Vintum is similar to Thaumium, but can also be turned into gems, due to it's more ordered molecular structure. You just have to reorganize some Thaumium to turn it into vinteum, just throw it into a cauldron with some Permutatio and Ordo in it, that should be enough.")
        Research.addCruciblePage("VINTEUM", ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9529))
        Research.setConcealed("VINTEUM", true)
        Research.addPrereq("VINTEUM", "JOURNEY", false)
        Research.addPrereq("VINTEUM", "THAUMIUM", false)
        Research.addPrereq("VINTEUM", "GT_ADVANCEDMETALLURGY", false)
        Warp.addToResearch("VINTEUM", 1)
        Research.addResearch("CAP_vinteum", "FORBIDDEN",
                "permutatio 5, praecantatio 10,lucrum 3,instrumentum 4, metallum 5", -5, 3, 8, item3)
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.CAP_vinteum", "Vinteum Caps")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.CAP_vinteum", "[FM] They're blue!")
        Research.addPage("CAP_vinteum", "derp.research_page.CAP_vinteum")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.CAP_vinteum",
                "Since vinteum is just reorganized Thaumium, you can't expect that it gives you a higher vis discount, but since it is much more ordered you can directly use it's full magical potential, which means no infusion required")
        Research.addArcanePage("CAP_vinteum", item3)
        Research.setConcealed("CAP_vinteum", true)
        Research.addPrereq("CAP_vinteum", "VINTEUM", false)
        Research.addPrereq("CAP_vinteum", "CAP_thaumium", false)
        Warp.addToResearch("CAP_vinteum", 3)
        Research.addResearch("ROD_witchwood", "FORBIDDEN", "victus 5, praecantatio 10, herba 3,instrumentum 4, arbor 5",
                -4, 0, 8, ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 4))
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.ROD_witchwood", "Witchwood Rod")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.ROD_witchwood", "[FM] That's witchcraft")
        Research.addPage("ROD_witchwood", "derp.research_page.ROD_witchwood")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.ROD_witchwood",
                "You had no luck finding a purple tree to make a wand of, now it's time to create it on your own. With the twig of a mighty tree creature, you should have the best possible starting material. Combined with some of the most magical trees you know it should make a pretty good wand rod. <BR> This Wand is able to store 100 vis of each type, quite a nice result.")
        Research.addInfusionPage("ROD_witchwood", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 4))
        Research.setConcealed("ROD_witchwood", true)
        Research.addPrereq("ROD_witchwood", "VINTEUM", false)
        Research.addPrereq("ROD_witchwood", "ANOINTINGPASTE", false)
        Research.addPrereq("ROD_witchwood", "OVEN", false)
        Warp.addToResearch("ROD_witchwood", 2)
        Research.addResearch("ROD_witchwood_staff", "FORBIDDEN",
                "victus 5, praecantatio 10, herba 3,instrumentum 4, arbor 5", -2, 0, 8,
                ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 10))
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_name.ROD_witchwood_staff", "Witchwood Staff")
        MineTweakerAPI.game.setLocalization("en_US", "tc.research_text.ROD_witchwood_staff",
                "[FM] Without Circle Magic")
        Research.addPage("ROD_witchwood_staff", "derp.research_page.ROD_witchwood_staff")
        MineTweakerAPI.game.setLocalization("en_US", "derp.research_page.ROD_witchwood_staff",
                "Witchwood doesn't like Elemental shards, that's interesting, but a fundamental problem when it comes to create a staff out of it. It loses some capacity when doing so, but it works.")
        Research.addArcanePage("ROD_witchwood_staff", ItemBracketHandler.getItem("ForbiddenMagic:WandCores", 10))
        Research.setSpikey("ROD_witchwood_staff", true)
        Research.setConcealed("ROD_witchwood_staff", true)
        Research.addPrereq("ROD_witchwood_staff", "ROD_witchwood", false)
        Research.addPrereq("ROD_witchwood_staff", "ROD_silverwood_staff", false)
        Warp.addToResearch("ROD_witchwood_staff", 4)
    }
}