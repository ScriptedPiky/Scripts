package com.github.GTNH2Mega.fromScripts

import WayofTime.alchemicalWizardry.common.tweaker.Alchemy
import WayofTime.alchemicalWizardry.common.tweaker.Binding
import WayofTime.alchemicalWizardry.common.tweaker.BloodAltar
import WayofTime.alchemicalWizardry.common.tweaker.BloodOrb
import gttweaker.mods.gregtech.machines.Assembler
import gttweaker.mods.gregtech.machines.CuttingSaw
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.expand.*
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import net.minecraftforge.oredict.OreDictionary
import java.util.*
import com.github.GTNH2Mega.VoltageLevels

class BloodMagic : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:Altar", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sacrificialKnife", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:weakBloodOrb", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:archmageBloodOrb", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:transcendentBloodOrb", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:energySword", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:boundPickaxe", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:boundAxe", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:boundShovel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockWritingTable", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:waterSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:lavaSigil", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:divinationSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:speedRune", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:masterStone", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:largeBloodStoneBrick", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockHomHeart", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:crystallos", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:sanctus", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:weakFillingAgent", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:alchemyFlask", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:weakBindingAgent", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:standardBindingAgent", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:mundaneLengtheningCatalyst", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:averageLengtheningCatalyst", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:greaterLengtheningCatalyst", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:mundanePowerCatalyst", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:averagePowerCatalyst", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:greaterPowerCatalyst", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:blankSpell", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:aether", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("minecraft:web", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 5))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("minecraft:leather", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("minecraft:fire_charge", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:daggerOfSacrifice", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:incendium", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:magicales", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:crepitous", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:terrae", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:lavaCrystal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:runeOfSacrifice", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:runeOfSelfSacrifice", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:airSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfTheFastMiner", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:growthSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:voidSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemBloodPack", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:activationCrystal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:emptySocket", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodSocket", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:armourForge", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfElementalAffinity", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfHolding", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfTheBridge", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfMagnetism", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemBloodLightSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:seerSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:imperfectRitualStone", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:waterScribeTool", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:fireScribeTool", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:earthScribeTool", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:airScribeTool", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:ritualDismantler", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 5))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:activationCrystal", 1))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:activationCrystal", 1))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:standardFillingAgent", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:enhancedFillingAgent", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 32))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockTeleposer", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:telepositionFocus", 0))
        BloodAltar.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:enhancedTelepositionFocus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:reinforcedTelepositionFocus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:demonicTelepositionFocus", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:itemComplexSpellCrystal", 0))
        Binding.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:energyBlaster", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:energyBazooka", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockPedestal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockPlinth", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockAlchemicCalcinator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemAttunedCrystal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemDestinationClearer", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemTankSegmenter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockCrystalBelljar", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockReagentConduit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockCrystal", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockStabilityGlyph", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockEnchantmentGlyph", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockEnchantmentGlyph", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 31))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 18))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 19))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 20))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 21))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 22))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 23))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 24))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 26))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemKeyOfDiablo", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:armourInhibitor", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 15))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 16))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 30))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 7))
        Alchemy.removeRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:inputRoutingFocus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:inputRoutingFocus", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfHaste", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfWind", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfSupression", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:sigilOfEnderSeverance", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemHarvestSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:itemCompressionSigil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockCrucible", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:blockConduit", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("AWWayofTime:bloodMagicIncenseItem", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellParadigm", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellParadigm", 1))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellParadigm", 2))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellParadigm", 3))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellModifier", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellModifier", 1))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellModifier", 2))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellModifier", 3))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellEffect", 0))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellEffect", 1))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellEffect", 2))
        MineTweakerAPI.recipes.remove(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellEffect", 3))
        BloodOrb.addShaped(ItemBracketHandler.getItem("dreamcraft:item.TeleposerFrame", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:telepositionFocus", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 32),
                        null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.TeleposerFrame", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0), null)))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:blockTeleposer", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                        OreBracketHandler.getOre("plateRoseGold")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 32),
                                ItemBracketHandler.getItem("AWWayofTime:telepositionFocus", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 32)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 4412),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:reinforcedTelepositionFocus", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:enhancedTelepositionFocus", 0),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:archmageBloodOrb", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:demonicTelepositionFocus", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:reinforcedTelepositionFocus", 0),
                                ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:archmageBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:transcendentBloodOrb", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("dreamcraft:item.Blaster", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crepitous", 0),
                        OreBracketHandler.getOre("gemFlawlessDiamond")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:crepitous", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 3),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 15)),
                        arrayOf(OreBracketHandler.getOre("gemFlawlessDiamond"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 15),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:energyBlasterSecondTier", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:archmageBloodOrb", 0),
                        ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                        OreBracketHandler.getOre("gemExquisiteDiamond")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:amorphic_catalyst", 0),
                                ItemBracketHandler.getItem("AWWayofTime:energyBlaster", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17)),
                        arrayOf(OreBracketHandler.getOre("gemExquisiteDiamond"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17),
                                ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:energyBlasterThirdTier", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:transcendentBloodOrb", 0),
                        ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                        OreBracketHandler.getOre("gemExquisiteDiamond")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("BloodArsenal:blood_infused_diamond_bound", 0),
                                ItemBracketHandler.getItem("AWWayofTime:energyBlasterSecondTier", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 30)),
                        arrayOf(OreBracketHandler.getOre("gemExquisiteDiamond"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 30),
                                ItemBracketHandler.getItem("AWWayofTime:demonPlacer", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 3),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:weakBloodOrb", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                        ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809),
                                ItemBracketHandler.getItem("dreamcraft:item.ArcaneSlate", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17809), null)))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                        OreBracketHandler.getOre("plateStone"),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                        arrayOf(OreBracketHandler.getOre("plateStone"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 3),
                                OreBracketHandler.getOre("plateStone")),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                                OreBracketHandler.getOre("plateStone"), null)))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                        OreBracketHandler.getOre("plateObsidian"),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0)),
                        arrayOf(OreBracketHandler.getOre("plateObsidian"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 4),
                                OreBracketHandler.getOre("plateObsidian")),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                                OreBracketHandler.getOre("plateObsidian"), null)))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 31),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                        OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)),
                        arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateRoseGold")),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                                OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 28))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 5),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 25028),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicales", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 6),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:sanctus", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("AWWayofTime:sanctus", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:sanctus", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:sanctus", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 7),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("minecraft:fire_charge", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:incendium", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 10),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("Railcraft:firestone.refined", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:incendium", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 11),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:crystallos", 0),
                        ItemBracketHandler.getItem("Thaumcraft:FocusFrost", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crystallos", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:crystallos", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:crystallos", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 12),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 30004),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:aether", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 13),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:terrae", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 18),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 19),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0),
                        ItemBracketHandler.getItem("Thaumcraft:ItemSwordThaumium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0))))

        //TODO Replace ("tinkersdefense:HeaterShield", 0)
        //val item = ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 20)
        //val array: Array<Array<IIngredient?>?> = arrayOfNulls(3)
        //val n = 0
        //val array2 = arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1),
        //        null, null)
        //val n2 = 1
        //val item2 = ItemBracketHandler.getItem("tinkersdefense:HeaterShield", 0)
        //val hashMap = HashMap<String, IData>()
        //val s = "InfiTool"
        //val hashMap2 = HashMap<String, IData>()
        //hashMap2["RenderExtra"] = ExpandInt.toData(31)
        //hashMap2["BaseDurability"] = ExpandInt.toData(663)
        //hashMap2["BaseAttack"] = ExpandInt.toData(4)
        //hashMap2["ToolEXP"] = ExpandLong.asData(0L)
        //hashMap2["HarvestLevel"] = ExpandInt.toData(3)
        //hashMap2["RenderHead"] = ExpandInt.toData(31)
        //hashMap2["ModDurability"] = ExpandFloat.asData(0.0.toFloat())
        //hashMap2["Shoddy"] = ExpandFloat.asData(0.0.toFloat())
        //hashMap2["RenderHandle"] = ExpandInt.toData(31)
        //hashMap2["Accessory"] = ExpandInt.toData(31)
        //hashMap2["MiningSpeed"] = ExpandInt.toData(650)
        //hashMap2["Unbreaking"] = ExpandInt.toData(0)
        //hashMap2["Damage"] = ExpandInt.toData(0)
        //hashMap2["HarvestLevel2"] = ExpandInt.toData(3)
        //hashMap2["BonusDurability"] = ExpandInt.toData(0)
        //hashMap2["TotalDurability"] = ExpandInt.toData(663)
        //hashMap2["MiningSpeed2"] = ExpandInt.toData(650)
        //hashMap2["Head"] = ExpandInt.toData(31)
        //hashMap2["Attack"] = ExpandInt.toData(4)
        //hashMap2["Handle"] = ExpandInt.toData(31)
        //hashMap2["Broken"] = ExpandByte.asData(0.toByte())
        //hashMap2["Extra"] = ExpandInt.toData(31)
        //hashMap2["RenderAccessory"] = ExpandInt.toData(31)
        //hashMap2["ToolLevel"] = ExpandInt.toData(1)
        //hashMap2["Modifiers"] = ExpandInt.toData(2)
        //hashMap[s] = ExpandAnyDict.asData(hashMap2)
        //val s2 = "display"
        //val hashMap3 = HashMap<String, IData>()
        //hashMap3["Name"] = ExpandString.asData("§fThaumium Heater Shield")
        //hashMap[s2] = ExpandAnyDict.asData(hashMap3)
        //array2[n2] = item2.withTag(ExpandAnyDict.asData(hashMap))
        //array2[2] = ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1)
        //array[n] = array2
        //array[1] = arrayOf(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
        //        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
        //        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0))
        //array[2] = arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1),
        //        ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
        //        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1))
        //BloodOrb.addShaped(item, array)

        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 21),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 8),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 22),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6),
                        ItemBracketHandler.getItem("IC2:itemBatCrystal", OreDictionary.WILDCARD_VALUE),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 23),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 7),
                        OreBracketHandler.getOre("plateSoularium"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 7),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 7))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 24),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("EnderIO:itemMaterial", 6),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
                                ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8))))

        //TODO Replace ("TConstruct:heavyPlate", 6)
        //BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 26),
        //        arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
        //                ItemBracketHandler.getItem("TConstruct:heavyPlate", 6),
        //                ItemBracketHandler.getItem("AWWayofTime:terrae", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 1),
        //                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)),
        //                arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
        //                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0))))

        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2).amount(3),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("platePlastic"),
                        OreBracketHandler.getOre("platePlastic"), OreBracketHandler.getOre("platePlastic")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicales", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("platePlastic"),
                                OreBracketHandler.getOre("platePlastic"), OreBracketHandler.getOre("platePlastic"))),
                null)
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 8),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        OreBracketHandler.getOre("plateTitanium"),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                                OreBracketHandler.getOre("plateTitanium"),
                                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                                ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2),
                                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0))))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("AWWayofTime:inputRoutingFocus", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 32),
                                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0))), null)
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:blockCrucible", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateAluminium"),
                        ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                        OreBracketHandler.getOre("plateAluminium")), arrayOf(OreBracketHandler.getOre("plateAluminium"),
                        ItemBracketHandler.getItem("Thaumcraft:blockMetalDevice", 0),
                        OreBracketHandler.getOre("plateAluminium")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                                ItemBracketHandler.getItem("minecraft:stone_slab", 0),
                                ItemBracketHandler.getItem("minecraft:stone_slab", 0))))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:blockConduit", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0))))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("AWWayofTime:bloodMagicIncenseItem", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("witchery:ingredient", 18),
                        ItemBracketHandler.getItem("witchery:ingredient", 18),
                        ItemBracketHandler.getItem("witchery:ingredient", 18),
                        ItemBracketHandler.getItem("witchery:ingredient", 18),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2816),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2816),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2815),
                        ItemBracketHandler.getItem("BiomesOPlenty:misc", 1)), null)
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellParadigm", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 8),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 5),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25), null)))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellParadigm", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 8),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 6),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25), null)))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellParadigm", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 8),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 7),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25), null)))
        BloodOrb.addShaped(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellParadigm", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 8),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 26),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25), null)))
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellModifier", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 18),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellModifier", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 19),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellModifier", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 20),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellModifier", 3),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        OreBracketHandler.getOre("plateRoseGold"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 21),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateRoseGold"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellEffect", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        OreBracketHandler.getOre("plateBlueSteel"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 10),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateBlueSteel"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellEffect", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        OreBracketHandler.getOre("plateBlueSteel"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 11),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateBlueSteel"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellEffect", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        OreBracketHandler.getOre("plateBlueSteel"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 12),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateBlueSteel"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))), null)
        MineTweakerAPI.recipes.addShaped(
                ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrytile.blockSpellEffect", 3),
                arrayOf(arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                        OreBracketHandler.getOre("plateBlueSteel"),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 14),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 13),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 9)),
                        arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25),
                                OreBracketHandler.getOre("plateBlueSteel"),
                                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 25))), null)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:weakBloodOrb", 0),
                ItemBracketHandler.getItem("dreamcraft:item.WeakOrb", 0), 1, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ApprenticeOrb", 0), 2, 10000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0),
                ItemBracketHandler.getItem("dreamcraft:item.MagicianOrb", 0), 3, 30000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0),
                ItemBracketHandler.getItem("dreamcraft:item.MasterOrb", 0), 4, 60000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:archmageBloodOrb", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ArchmageOrb", 0), 5, 120000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:transcendentBloodOrb", 0),
                ItemBracketHandler.getItem("dreamcraft:item.TranscendentOrb", 0), 6, 300000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                ItemBracketHandler.getItem("dreamcraft:item.ArcaneSlate", 0), 1, 2000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0), 2, 4000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0), 3, 10000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0),
                ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0), 4, 20000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0), 5, 50000, 0, 0)
        val item3 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap4 = HashMap<String, IData>()
        val s3 = "Fluid"
        val hashMap5 = HashMap<String, IData>()
        hashMap5["FluidName"] = ExpandString.asData("lifeessence")
        hashMap5["Amount"] = ExpandInt.toData(1000)
        hashMap4[s3] = ExpandAnyDict.asData(hashMap5)
        BloodAltar.addRecipe(item3.withTag(ExpandAnyDict.asData(hashMap4)),
                ItemBracketHandler.getItem("IC2:itemFluidCell", 0), 1, 1000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:alchemyFlask", 0),
                ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0), 2, 4000, 0, 0)
        val item4 = ItemBracketHandler.getItem("AWWayofTime:blankSpell", 0)
        val item5 = ItemBracketHandler.getItem("IC2:itemBatCrystal", 1)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["charge"] = ExpandDouble.asData(1000000.0)
        BloodAltar.addRecipe(item4, item5.withTag(ExpandAnyDict.asData(hashMap6)), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:daggerOfSacrifice", 0),
                ItemBracketHandler.getItem("AWWayofTime:sacrificialKnife", 0), 2, 10000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:activationCrystal", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSpell", 0), 3, 20000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodSocket", 0),
                ItemBracketHandler.getItem("AWWayofTime:emptySocket", 0), 3, 40000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:waterScribeTool", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 2), 3, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:fireScribeTool", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 1), 3, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:earthScribeTool", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 3), 3, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:airScribeTool", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 0), 3, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:duskScribeTool", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 5), 4, 10000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:dawnScribeTool", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCrystal", 6), 6, 100000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 32),
                ItemBracketHandler.getItem("EnderZoo:enderFragment", 0), 4, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("AWWayofTime:enhancedTelepositionFocus", 0),
                ItemBracketHandler.getItem("AWWayofTime:telepositionFocus", 0), 4, 20000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.BloodyThaumium", 0),
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 4), 2, 5000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.BloodyVoid", 0),
                ItemBracketHandler.getItem("thaumicbases:voidBlock", 0), 3, 10000, 0, 0)
        BloodAltar.addRecipe(ItemBracketHandler.getItem("dreamcraft:tile.BloodyIchorium", 0),
                ItemBracketHandler.getItem("gregtech:gt.blockmetal8", 13), 5, 50000, 0, 0)
        Binding.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemSwordElemental", 0),
                ItemBracketHandler.getItem("AWWayofTime:energySword", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemPickaxeElemental", 0),
                ItemBracketHandler.getItem("AWWayofTime:boundPickaxe", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemAxeElemental", 0),
                ItemBracketHandler.getItem("AWWayofTime:boundAxe", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemShovelElemental", 0),
                ItemBracketHandler.getItem("AWWayofTime:boundShovel", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.Blaster", 0),
                ItemBracketHandler.getItem("AWWayofTime:energyBlaster", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23522),
                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23516),
                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0))
        Binding.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23523),
                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 0))
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:largeBloodStoneBrick", 0).amount(4),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0),
                        ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0),
                        ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0),
                        ItemBracketHandler.getItem("AWWayofTime:ritualStone", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemEssence", 0),
                        ItemBracketHandler.getItem("Genetics:misc", 4),
                        ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)), 1, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:crystallos", 0),
                arrayOf(ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2702),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2702),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2702),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:sanctus", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2086),
                        ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2890),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:weakFillingAgent", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                        ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("minecraft:nether_wart", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:weakBindingAgent", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2020),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2805),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2805)), 2, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:mundaneLengtheningCatalyst", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2028),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("minecraft:redstone", 0),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBindingAgent", 0)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:averageLengtheningCatalyst", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:standardBindingAgent", 0),
                        ItemBracketHandler.getItem("AWWayofTime:mundaneLengtheningCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:mundaneLengtheningCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3)), 4, VoltageLevels.IV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:greaterLengtheningCatalyst", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:averageLengtheningCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:averageLengtheningCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3)), 4, VoltageLevels.IV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:mundanePowerCatalyst", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2028),
                        ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("minecraft:glowstone_dust", 0),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBindingAgent", 0)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:averagePowerCatalyst", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:standardBindingAgent", 0),
                        ItemBracketHandler.getItem("AWWayofTime:mundanePowerCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:mundanePowerCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3)), 4, VoltageLevels.IV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:greaterPowerCatalyst", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:averagePowerCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:averagePowerCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3)), 4, VoltageLevels.IV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:standardBindingAgent", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2028),
                        ItemBracketHandler.getItem("AWWayofTime:weakBindingAgent", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBindingAgent", 0),
                        ItemBracketHandler.getItem("AWWayofTime:sanctus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crystallos", 0)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                arrayOf(ItemBracketHandler.getItem("EMT:EMTItems", 8),
                        ItemBracketHandler.getItem("minecraft:feather", 0),
                        ItemBracketHandler.getItem("minecraft:feather", 0),
                        ItemBracketHandler.getItem("minecraft:ghast_tear", 0),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("minecraft:web", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:string", 0),
                        ItemBracketHandler.getItem("minecraft:string", 0),
                        ItemBracketHandler.getItem("minecraft:string", 0),
                        ItemBracketHandler.getItem("minecraft:string", 0),
                        ItemBracketHandler.getItem("minecraft:string", 0)), 1, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 5),
                arrayOf(ItemBracketHandler.getItem("minecraft:bone", 0),
                        ItemBracketHandler.getItem("minecraft:bone", 0),
                        ItemBracketHandler.getItem("minecraft:bone", 0),
                        ItemBracketHandler.getItem("minecraft:bone", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)), 1, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("minecraft:leather", 0).amount(3),
                arrayOf(ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                        ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                        ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:flint", 0)), 1, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("minecraft:fire_charge", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2535),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0)), 1, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                        ItemBracketHandler.getItem("minecraft:blaze_powder", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2347),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2807),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                arrayOf(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 1),
                        ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2330),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:crepitous", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("minecraft:gunpowder", 0),
                        ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                arrayOf(ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 45),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2935),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2936),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                arrayOf(ItemBracketHandler.getItem("minecraft:potion", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2543),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2543),
                        ItemBracketHandler.getItem("minecraft:dye", 0),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2804),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2535),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2536),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2538),
                        ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0)), 2, VoltageLevels.LEV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:activationCrystal", 1),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:activationCrystal", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0)), 4, VoltageLevels.LZPM)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:standardFillingAgent", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:weakFillingAgent", 0),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0)), 4, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:enhancedFillingAgent", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:standardFillingAgent", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:crystallos", 0),
                        ItemBracketHandler.getItem("AWWayofTime:aether", 0),
                        ItemBracketHandler.getItem("AWWayofTime:sanctus", 0)), 4, VoltageLevels.IV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:simpleCatalyst", 0),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("minecraft:dye", 15),
                        ItemBracketHandler.getItem("minecraft:nether_wart", 0)), 3, VoltageLevels.EV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 5),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1086)), 4, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:itemComplexSpellCrystal", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:blankSpell", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.EngravedGoldChip", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.EngravedDiamondCrystalChip", 0)), 3, VoltageLevels.LLUV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 15).amount(2),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 4),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0),
                        ItemBracketHandler.getItem("AWWayofTime:magicales", 0)), 4, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 16),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 15),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0)), 5, VoltageLevels.IV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 16),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 16),
                        ItemBracketHandler.getItem("AWWayofTime:aquasalus", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0)), 5, VoltageLevels.LLUV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 30),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 17),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 29),
                        ItemBracketHandler.getItem("AWWayofTime:weakBloodShard", 0),
                        ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27)), 6, VoltageLevels.LUV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 0),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("AWWayofTime:incendium", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 25028),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 25028)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 1),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:tennebrae", 0),
                        ItemBracketHandler.getItem("witchery:ingredient", 56),
                        ItemBracketHandler.getItem("witchery:ingredient", 56)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 2),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("AWWayofTime:terrae", 0),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2542),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2542)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 6),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2100),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2100),
                        ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0),
                        ItemBracketHandler.getItem("dreamcraft:item.ChargedCertusQuartzDust", 0)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 7),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2702),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2702),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2379),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2379)), 3, VoltageLevels.LIV)
        Alchemy.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 8),
                arrayOf(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseAlchemyItems", 3),
                        ItemBracketHandler.getItem("IC2:itemDust2", 2), ItemBracketHandler.getItem("IC2:itemDust2", 2),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2367),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2367)), 3, VoltageLevels.LIV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("AWWayofTime:weakBloodOrb", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("AWWayofTime:apprenticeBloodOrb", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("AWWayofTime:magicianBloodOrb", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("AWWayofTime:masterBloodOrb", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("AWWayofTime:archmageBloodOrb", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("AWWayofTime:transcendentBloodOrb", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("BloodArsenal:transparent_orb", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("ForbiddenMagic:EldritchOrb", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:AlchemicalWizardrybloodRune", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(4),
                ItemBracketHandler.getItem("Avaritia:Orb_Armok", 0).amount(0),
                LiquidBracketHandler.getLiquid("wet.concrete").withAmount(1152), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:ritualDismantler", 0),
                ItemBracketHandler.getItem("AWWayofTime:itemRitualDiviner", 0),
                ItemBracketHandler.getItem("minecraft:redstone_torch", 0).amount(2), 600, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 0),
                ItemBracketHandler.getItem("AWWayofTime:inputRoutingFocus", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 1),
                ItemBracketHandler.getItem("AWWayofTime:inputRoutingFocus", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 2).amount(0), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 2),
                ItemBracketHandler.getItem("AWWayofTime:inputRoutingFocus", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 3),
                ItemBracketHandler.getItem("AWWayofTime:inputRoutingFocus", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 4).amount(0), 200, VoltageLevels.MV)
        Assembler.addRecipe(ItemBracketHandler.getItem("AWWayofTime:outputRoutingFocus", 4),
                ItemBracketHandler.getItem("AWWayofTime:inputRoutingFocus", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 5).amount(0), 200, VoltageLevels.MV)
        Compressor.addRecipe(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                ItemBracketHandler.getItem("dreamcraft:item.ArcaneSlate", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 0),
                ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2),
                ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27).amount(9))
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ArcaneSlate", 0).amount(9), null,
                ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 6),
                LiquidBracketHandler.getLiquid("lifeessence").withAmount(1000), 1200, VoltageLevels.LMV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("AWWayofTime:blankSlate", 0).amount(9), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 0),
                LiquidBracketHandler.getLiquid("lifeessence").withAmount(1000), 1800, VoltageLevels.LMV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("AWWayofTime:reinforcedSlate", 0).amount(9), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 1),
                LiquidBracketHandler.getLiquid("lifeessence").withAmount(1000), 2400, VoltageLevels.MV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("AWWayofTime:imbuedSlate", 0).amount(9), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 2),
                LiquidBracketHandler.getLiquid("lifeessence").withAmount(1000), 3000,  VoltageLevels.HV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("AWWayofTime:demonicSlate", 0).amount(9), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 3),
                LiquidBracketHandler.getLiquid("lifeessence").withAmount(1000), 3600, VoltageLevels.EV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("AWWayofTime:bloodMagicBaseItems", 27).amount(9), null,
                ItemBracketHandler.getItem("BloodArsenal:blood_stone", 4),
                LiquidBracketHandler.getLiquid("lifeessence").withAmount(1000), 4800, VoltageLevels.IV)
    }
}