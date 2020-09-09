package com.github.GTNH2Mega.fromScripts

import WayofTime.alchemicalWizardry.common.tweaker.Binding
import WayofTime.alchemicalWizardry.common.tweaker.BloodAltar
import WayofTime.alchemicalWizardry.common.tweaker.BloodOrb
import gttweaker.mods.gregtech.machines.Centrifuge
import gttweaker.mods.gregtech.machines.CuttingSaw
import gttweaker.mods.gregtech.machines.Lathe
import gttweaker.mods.gregtech.machines.Pulverizer
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import com.github.GTNH2Mega.VoltageLevels

class BloodArsenal : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:bound_sickle", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:bound_bow", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_planks", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_stained_ice", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_stained_ice_packed", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:bound_igniter", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:bound_shears", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_lamp", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:life_infuser", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:lp_materializer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:compacter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_wood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_axe_wood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_wood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_sword_wood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_iron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_axe_iron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_iron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_sword_iron", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_diamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_axe_diamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_diamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_infused_sword_diamond", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_diamond", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_active", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_money", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_money", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_money", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:life_imbued_helmet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:life_imbued_chestplate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:life_imbued_leggings", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:life_imbued_boots", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:transparent_orb", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:sigil_of_augmented_holding", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:sigil_of_lightning", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:sigil_of_swimming", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:sigil_of_ender", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:sigil_of_divinity", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:self_sacrifice_amulet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:sacrifice_amulet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:empowered_sacrifice_amulet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:empowered_self_sacrifice_amulet", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:glass_sacrificial_dagger", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:glass_dagger_of_sacrifice", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:vampire_ring", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:soul_fragment", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_lamp", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateBloodInfusedIron"),
                        ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0),
                        OreBracketHandler.getOre("plateBloodInfusedIron")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0),
                                ItemBracketHandler.getItem("minecraft:redstone_lamp", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0)),
                        arrayOf(OreBracketHandler.getOre("plateBloodInfusedIron"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0),
                                OreBracketHandler.getOre("plateBloodInfusedIron"))), null)
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_wood", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0)),
                        arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0),
                                OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver"))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_axe_wood", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0),
                                ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_wood", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0),
                                null)))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_sword_wood", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwStainlessSteel"),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                        OreBracketHandler.getOre("screwStainlessSteel")),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                                OreBracketHandler.getOre("craftingToolScrewdriver")),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0),
                                null)))

        //TODO Replace ("TConstruct:heavyPlate", 251)
        //BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_iron", 0),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                OreBracketHandler.getOre("ingotBloodInfusedIron"),
        //                OreBracketHandler.getOre("ingotBloodInfusedIron")),
        //                arrayOf(OreBracketHandler.getOre("screwBloodInfusedIron"),
        //                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_wood", 0),
        //                        OreBracketHandler.getOre("craftingToolScrewdriver")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
        //                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))))
        //BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_axe_iron", 0),
        //        arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                OreBracketHandler.getOre("ingotBloodInfusedIron"),
        //                OreBracketHandler.getOre("screwBloodInfusedIron")),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_axe_wood", 0),
        //                        OreBracketHandler.getOre("craftingToolScrewdriver")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
        //                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))))
        //BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_iron", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("screwBloodInfusedIron"),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                OreBracketHandler.getOre("screwBloodInfusedIron")),
        //                arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
        //                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_wood", 0),
        //                        OreBracketHandler.getOre("screwBloodInfusedIron")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
        //                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))))
        //BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_sword_iron", 0),
        //        arrayOf(arrayOf(OreBracketHandler.getOre("screwBloodInfusedIron"),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                OreBracketHandler.getOre("craftingToolScrewdriver")),
        //                arrayOf(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_sword_wood", 0),
        //                        OreBracketHandler.getOre("screwBloodInfusedIron")),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
        //                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))))

        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_diamond", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTungstenSteel"),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
                        OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_pickaxe_iron", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_axe_diamond", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTungstenSteel"),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
                        OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_axe_iron", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_diamond", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTungstenSteel"),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
                        OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_shovel_iron", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:blood_infused_sword_diamond", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("screwTungstenSteel"),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_block", 0),
                        OreBracketHandler.getOre("screwTungstenSteel")),
                        arrayOf(OreBracketHandler.getOre("craftingToolScrewdriver"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_sword_iron", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:self_sacrifice_amulet", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                                ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0)),
                        arrayOf(OreBracketHandler.getOre("gemFlawlessGarnetYellow"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:sacrifice_amulet", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                                ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0)),
                        arrayOf(OreBracketHandler.getOre("gemFlawlessRuby"),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:empowered_sacrifice_amulet", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("AWWayofTime:runeOfSacrifice", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:runeOfSacrifice", 0),
                                ItemBracketHandler.getItem("BloodArsenal:sacrifice_amulet", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0)),
                        arrayOf(OreBracketHandler.getOre("gemExquisiteRuby"),
                                ItemBracketHandler.getItem("AWWayofTime:runeOfSacrifice", 0),
                                OreBracketHandler.getOre("stickLongBlaze"))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:empowered_self_sacrifice_amulet", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                        ItemBracketHandler.getItem("AWWayofTime:runeOfSelfSacrifice", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:runeOfSelfSacrifice", 0),
                                ItemBracketHandler.getItem("BloodArsenal:self_sacrifice_amulet", 0),
                                ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0)),
                        arrayOf(OreBracketHandler.getOre("gemExquisiteGarnetYellow"),
                                ItemBracketHandler.getItem("AWWayofTime:runeOfSelfSacrifice", 0),
                                OreBracketHandler.getOre("stickLongBlaze"))))

        //TODO Replace ("TConstruct:heavyPlate", 251)
        //BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:glass_sacrificial_dagger", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32200),
        //                ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:sacrificialKnife", 0),
        //                        ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251))))
        //BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:glass_dagger_of_sacrifice", 0),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0),
        //                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32200),
        //                ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:daggerOfSacrifice", 0),
        //                        ItemBracketHandler.getItem("BloodArsenal:glass_shard", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
        //                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
        //                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 251))))

        BloodOrb.addShaped(ItemBracketHandler.getItem("BloodArsenal:vampire_ring", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        OreBracketHandler.getOre("wireFineBloodInfusedIron"), null),
                        arrayOf(OreBracketHandler.getOre("wireFineBloodInfusedIron"),
                                ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 1),
                                OreBracketHandler.getOre("wireFineBloodInfusedIron")),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                OreBracketHandler.getOre("wireFineBloodInfusedIron"), null)))
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                ItemBracketHandler.getItem("minecraft:log", 0), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                ItemBracketHandler.getItem("minecraft:log", 1), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                ItemBracketHandler.getItem("minecraft:log", 2), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                ItemBracketHandler.getItem("minecraft:log", 3), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                ItemBracketHandler.getItem("minecraft:log2", 0), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                ItemBracketHandler.getItem("minecraft:log2", 1), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stained_glass", 0),
                ItemBracketHandler.getItem("minecraft:glass", 0), 1, 200, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stained_ice", 0),
                ItemBracketHandler.getItem("minecraft:ice", 0), 1, 400, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stained_ice_packed", 0),
                ItemBracketHandler.getItem("minecraft:packed_ice", 0), 1, 600, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0),
                ItemBracketHandler.getItem("minecraft:iron_block", 0), 4, 64000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone", 0),
                ItemBracketHandler.getItem("minecraft:glowstone", 0), 4, 28000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_active", 0),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_unactive", 0), 4, 120000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_diamond", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 30500), 4, 12000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_glowstone_dust", 0),
                ItemBracketHandler.getItem("minecraft:glowstone_dust", 0), 3, 7000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_burned_string", 0),
                ItemBracketHandler.getItem("minecraft:string", 0), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("BloodArsenal:soul_fragment", 0),
                ItemBracketHandler.getItem("BloodArsenal:heart", 0), 4, 100000, 0, 0)
        Binding.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemHoeElemental", 0),
                ItemBracketHandler.getItem("BloodArsenal:bound_sickle", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemBowBone", 0),
                ItemBracketHandler.getItem("BloodArsenal:bound_bow", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("Natura:natura.flintandblaze", 0),
                ItemBracketHandler.getItem("BloodArsenal:bound_igniter", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("EnderIO:item.darkSteel_shears", 0),
                ItemBracketHandler.getItem("BloodArsenal:bound_shears", 0))
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_money", 0),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 0),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 0),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 0)), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 1), null, null,
                intArrayOf(10000, 10000, 10000, 10000), 400, VoltageLevels.LV)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_money", 1),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 1),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 1),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 1)), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 2), null, null,
                intArrayOf(10000, 10000, 10000, 10000), 400, VoltageLevels.LV)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_money", 2),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 2),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 2),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 2)), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 3), null, null,
                intArrayOf(10000, 10000, 10000, 10000), 400, VoltageLevels.LV)
        Compressor.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_money", 1),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 0).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_money", 2),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 1).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_money", 3),
                ItemBracketHandler.getItem("BloodArsenal:blood_money", 2).amount(4))
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_planks", 0).amount(4), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(10), 200, VoltageLevels.MV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_planks", 0).amount(4), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(6), 200, VoltageLevels.MV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_planks", 0).amount(6), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_wood", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(2), 100, VoltageLevels.MV)
        Lathe.addRecipe(arrayOf(ItemBracketHandler.getItem("BloodArsenal:blood_infused_stick", 0).amount(2)),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_planks", 0), 20, VoltageLevels.ULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2977)),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2977).amount(9)),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0), intArrayOf(10000), 300, VoltageLevels.LULV)
    }
}