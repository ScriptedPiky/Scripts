package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientAny
import minetweaker.api.item.IngredientTransform
import minetweaker.expand.ExpandAnyDict
import minetweaker.expand.ExpandString
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.nei.NEI
import modtweaker2.mods.chisel.handlers.Groups
import java.util.*
import net.minecraftforge.oredict.OreDictionary
import com.github.GTNH2Mega.VoltageLevels

class Natura : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("Natura:barleyFood", 3)
        val item2 = ItemBracketHandler.getItem("Natura:barleyFood", 6)
        OreBracketHandler.getOre("itemLeather")
        val item3 = ItemBracketHandler.getItem("minecraft:string", 0)
        val ore = OreBracketHandler.getOre("craftingToolSaw")
        val ore2 = OreBracketHandler.getOre("craftingToolScrewdriver")
        val ore3 = OreBracketHandler.getOre("itemFlint")
        val ore4 = OreBracketHandler.getOre("stickWood")
        val ore5 = OreBracketHandler.getOre("screwIron")
        val ore6 = OreBracketHandler.getOre("screwSteel")
        val ore7 = OreBracketHandler.getOre("ringCopper")
        val ore8 = OreBracketHandler.getOre("ringIron")
        val ore9 = OreBracketHandler.getOre("screwCopper")
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("minecraft:leather", 0),
                arrayOf(arrayOf<IIngredient>(item2, item2), arrayOf<IIngredient>(item2, item2)))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:planks", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:natura.stick", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:Natura.workbench", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:Natura.bookshelf", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:Natura.fence", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:plankSlab1", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:plankSlab2", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.maple", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.willow", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.maple", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.amaranth", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.silverbell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.tiger", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.willow", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.darkwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:trapdoor.fusewood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.eucalyptus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.sakura", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.ghostwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.redwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.bloodwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.hopseed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.maple", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.amaranth", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.silverbell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.tiger", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.willow", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.darkwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:button.fusewood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.eucalyptus", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.sakura", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.ghostwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.redwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.bloodwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.hopseed", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.maple", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.amaranth", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.silverbell", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.tiger", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.willow", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.darkwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:fenceGate.fusewood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:natura.emptybowl", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:redwoodDoorItem", OreDictionary.WILDCARD_VALUE))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("Natura:NetherGlass", 0), null)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("Natura:NetherGlass", 1), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:Blazerail", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:BrailPowered", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:BrailDetector", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:BrailActivator", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:NetherFurnace", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:Obelisk", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:NetherPressurePlate", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:NetherButton", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:NetherLever", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:natura.bow.ghostwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:natura.bow.bloodwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:natura.bow.darkwood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("Natura:natura.bow.fusewood", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("minecraft:coal", 1), IngredientAny.INSTANCE)
        MineTweakerAPI.recipes.removeShapeless(ItemBracketHandler.getItem("Natura:barleyFood", 8),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:Bluebells", 0)), false)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:barley.seed", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:barleyFood", 3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("minecraft:leather", 0),
                arrayOf(arrayOf<IIngredient>(item3, item3, item3), arrayOf<IIngredient>(item2, item2, item2),
                        arrayOf<IIngredient>(item3, item3, item3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 0).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:tree", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 0).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:tree", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 0).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 0),
                        ItemBracketHandler.getItem("Natura:planks", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 0).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 0), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 0),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:tree", 0),
                        ItemBracketHandler.getItem("Natura:tree", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 0),
                        ItemBracketHandler.getItem("Natura:planks", 0),
                        ItemBracketHandler.getItem("Natura:natura.stick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab1", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.eucalyptus", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.eucalyptus", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.eucalyptus", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 0),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 0),
                        ItemBracketHandler.getItem("Natura:natura.stick", 0),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 0)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 0), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 0),
                        ItemBracketHandler.getItem("Natura:natura.stick", 0),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 0)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 0), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 0),
                        ItemBracketHandler.getItem("Natura:natura.stick", 0),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 0)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 0), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 0),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.eucalyptus", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 1).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:tree", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 1).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:tree", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 1).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 1),
                        ItemBracketHandler.getItem("Natura:planks", 1)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 1).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 1), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 1), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 1),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:tree", 1),
                        ItemBracketHandler.getItem("Natura:tree", 1)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 1),
                        ItemBracketHandler.getItem("Natura:planks", 1),
                        ItemBracketHandler.getItem("Natura:natura.stick", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 1).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 1).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab1", 1).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 1), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.sakura", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.sakura", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.sakura", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.sakura", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 1), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 1),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 1),
                        ItemBracketHandler.getItem("Natura:natura.stick", 1),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 1)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 1), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 1),
                        ItemBracketHandler.getItem("Natura:natura.stick", 1),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 1)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 1), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 1),
                        ItemBracketHandler.getItem("Natura:natura.stick", 1),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 1)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 1), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 1)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 1),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.sakura", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.emptybowl", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Natura:planks", 2),
                        OreBracketHandler.getOre("craftingToolKnife"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 2).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:tree", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 2).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:tree", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 2).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 2),
                        ItemBracketHandler.getItem("Natura:planks", 2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 2).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 2), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 2), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 2),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:tree", 2),
                        ItemBracketHandler.getItem("Natura:tree", 2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 2),
                        ItemBracketHandler.getItem("Natura:planks", 2),
                        ItemBracketHandler.getItem("Natura:natura.stick", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 2).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 2).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab1", 2).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 2), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.ghostwood", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.ghostwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.ghostwood", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.ghostwood", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 2), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 2),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 2),
                        ItemBracketHandler.getItem("Natura:natura.stick", 2),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 2)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 2), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 2)),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 2), ore4,
                                ItemBracketHandler.getItem("Natura:plankSlab1", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 2),
                        ItemBracketHandler.getItem("Natura:natura.stick", 2),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 2)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 2), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 2),
                        ItemBracketHandler.getItem("Natura:natura.stick", 2),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 2)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 2), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 2),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.ghostwood", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 3).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:redwood", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 3).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:redwood", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 3).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 3),
                        ItemBracketHandler.getItem("Natura:planks", 3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 3).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 3), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 3), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 3),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:redwood", 1),
                        ItemBracketHandler.getItem("Natura:redwood", 1)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 3),
                        ItemBracketHandler.getItem("Natura:planks", 3),
                        ItemBracketHandler.getItem("Natura:natura.stick", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 3).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 3).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab1", 3).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 3), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.redwood", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.redwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.redwood", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.redwood", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 3), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3),
                                ItemBracketHandler.getItem("Natura:planks", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 3),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 3)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 3),
                        ItemBracketHandler.getItem("Natura:natura.stick", 3),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 3)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 3), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 3),
                        ItemBracketHandler.getItem("Natura:natura.stick", 3),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 3)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 3), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 3),
                        ItemBracketHandler.getItem("Natura:natura.stick", 3),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 3)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 3), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 3)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 3),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.redwood", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:bloodwood", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 4).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:bloodwood", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:bloodwood", 15)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 4).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:bloodwood", 15)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:bloodwood", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 4).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 4),
                        ItemBracketHandler.getItem("Natura:planks", 4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 4).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 4), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 4), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 4),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:bloodwood", 0),
                        ItemBracketHandler.getItem("Natura:bloodwood", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 4),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:bloodwood", 15),
                        ItemBracketHandler.getItem("Natura:bloodwood", 15)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 4),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 4),
                        ItemBracketHandler.getItem("Natura:planks", 4),
                        ItemBracketHandler.getItem("Natura:natura.stick", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 4).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 4).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab1", 4).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 4), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.bloodwood", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.bloodwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.bloodwood", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.bloodwood", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 4), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 4),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 4)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 4),
                        ItemBracketHandler.getItem("Natura:natura.stick", 4),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 4)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 4), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 4),
                        ItemBracketHandler.getItem("Natura:natura.stick", 4),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 4)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 4), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 4),
                        ItemBracketHandler.getItem("Natura:natura.stick", 4),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 4)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 4), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 4)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 4),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.bloodwood", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.emptybowl", 4),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Natura:planks", 4),
                        OreBracketHandler.getOre("craftingToolKnife"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 5).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:tree", 3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 5).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:tree", 3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 5).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 5),
                        ItemBracketHandler.getItem("Natura:planks", 5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 5).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 5), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 5), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 5),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:tree", 3),
                        ItemBracketHandler.getItem("Natura:tree", 3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 5),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 5),
                        ItemBracketHandler.getItem("Natura:planks", 5),
                        ItemBracketHandler.getItem("Natura:natura.stick", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 5).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 5).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab1", 5).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 5), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.hopseed", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.hopseed", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.hopseed", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.hopseed", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 5), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 5),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 5)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 5),
                        ItemBracketHandler.getItem("Natura:natura.stick", 5),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 5)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 5), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 5),
                        ItemBracketHandler.getItem("Natura:natura.stick", 5),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 5)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 5), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 5),
                        ItemBracketHandler.getItem("Natura:natura.stick", 5),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 5)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 5), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 5)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 5),
                                ItemBracketHandler.getItem("Natura:natura.stick", 5),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.hopseed", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 6).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:RareTree", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 6).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:RareTree", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 6).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 6),
                        ItemBracketHandler.getItem("Natura:planks", 6)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 6).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 6), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 6), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 6),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:RareTree", 0),
                        ItemBracketHandler.getItem("Natura:RareTree", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 6),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 6),
                        ItemBracketHandler.getItem("Natura:planks", 6),
                        ItemBracketHandler.getItem("Natura:natura.stick", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 6).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 6).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab1", 6).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 6), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.maple", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.maple", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.maple", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.maple", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 6), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6),
                                ItemBracketHandler.getItem("Natura:planks", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.maple", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 6),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 6)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.maple", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 6),
                        ItemBracketHandler.getItem("Natura:natura.stick", 6),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 6)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 6), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.maple", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 6),
                        ItemBracketHandler.getItem("Natura:natura.stick", 6),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 6)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 6), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.maple", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 6),
                        ItemBracketHandler.getItem("Natura:natura.stick", 6),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 6)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 6), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 6)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 6),
                                ItemBracketHandler.getItem("Natura:natura.stick", 6),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 6))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.maple", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.maple", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 7).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:RareTree", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 7).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:RareTree", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 7).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 7),
                        ItemBracketHandler.getItem("Natura:planks", 7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 7).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 7), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 7), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 7),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:RareTree", 1),
                        ItemBracketHandler.getItem("Natura:RareTree", 1)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 7),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 7),
                        ItemBracketHandler.getItem("Natura:planks", 7),
                        ItemBracketHandler.getItem("Natura:natura.stick", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 7).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 7).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab1", 7).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 7), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.silverbell", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.silverbell", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.silverbell", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.silverbell", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 7), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7),
                                ItemBracketHandler.getItem("Natura:planks", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab1", 7),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 7)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.silverbell", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 7),
                        ItemBracketHandler.getItem("Natura:natura.stick", 7),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 7)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 7), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.silverbell", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 7),
                        ItemBracketHandler.getItem("Natura:natura.stick", 7),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 7)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 7), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.silverbell", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 7),
                        ItemBracketHandler.getItem("Natura:natura.stick", 7),
                        ItemBracketHandler.getItem("Natura:plankSlab1", 7)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 7), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 7)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab1", 7),
                                ItemBracketHandler.getItem("Natura:natura.stick", 7),
                                ItemBracketHandler.getItem("Natura:plankSlab1", 7))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.silverbell", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 8).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:RareTree", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 8).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:RareTree", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 8).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 8),
                        ItemBracketHandler.getItem("Natura:planks", 8)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 8).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 8), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 8), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 8),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:RareTree", 2),
                        ItemBracketHandler.getItem("Natura:RareTree", 2)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 8),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 8),
                        ItemBracketHandler.getItem("Natura:planks", 8),
                        ItemBracketHandler.getItem("Natura:natura.stick", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 8).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 8).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab2", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 8), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.amaranth", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.amaranth", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.amaranth", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.amaranth", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 8), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8),
                                ItemBracketHandler.getItem("Natura:planks", 8))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab2", 0),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 0)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.amaranth", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 0),
                        ItemBracketHandler.getItem("Natura:natura.stick", 8),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 0)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 8), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.amaranth", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 0),
                        ItemBracketHandler.getItem("Natura:natura.stick", 8),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 0)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 8), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.amaranth", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 0),
                        ItemBracketHandler.getItem("Natura:natura.stick", 8),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 0)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 8), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 8)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 0),
                                ItemBracketHandler.getItem("Natura:natura.stick", 8),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.amaranth", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 9).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:RareTree", 3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 9).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:RareTree", 3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 9).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 9),
                        ItemBracketHandler.getItem("Natura:planks", 9)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 9).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 9), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 9), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 9),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:RareTree", 3),
                        ItemBracketHandler.getItem("Natura:RareTree", 3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 9),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 9),
                        ItemBracketHandler.getItem("Natura:planks", 9),
                        ItemBracketHandler.getItem("Natura:natura.stick", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 9).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 9).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab2", 1).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 9), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.tiger", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.tiger", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.tiger", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.tiger", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 9), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9),
                                ItemBracketHandler.getItem("Natura:planks", 9))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab2", 1),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 1)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.tiger", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 1),
                        ItemBracketHandler.getItem("Natura:natura.stick", 9),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 1)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 9), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.tiger", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 1),
                        ItemBracketHandler.getItem("Natura:natura.stick", 9),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 1)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 9), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.tiger", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 1),
                        ItemBracketHandler.getItem("Natura:natura.stick", 9),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 1)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 9), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 9)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 1),
                                ItemBracketHandler.getItem("Natura:natura.stick", 9),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.tiger", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 10).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:willow", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 10).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:willow", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 10).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 10),
                        ItemBracketHandler.getItem("Natura:planks", 10)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 10).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 10), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 10), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 10),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:willow", 0),
                        ItemBracketHandler.getItem("Natura:willow", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 10),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 10),
                        ItemBracketHandler.getItem("Natura:planks", 10),
                        ItemBracketHandler.getItem("Natura:natura.stick", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 10).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 10).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab2", 2).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 10), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.willow", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.willow", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.willow", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.willow", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 10), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10),
                                ItemBracketHandler.getItem("Natura:planks", 10))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.willow", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab2", 2),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.willow", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 2),
                        ItemBracketHandler.getItem("Natura:natura.stick", 10),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 2)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 10), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.willow", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 2),
                        ItemBracketHandler.getItem("Natura:natura.stick", 10),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 2)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 10), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.willow", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 2),
                        ItemBracketHandler.getItem("Natura:natura.stick", 10),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 2)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 10), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 10)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 2),
                                ItemBracketHandler.getItem("Natura:natura.stick", 10),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.willow", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.willow", 0), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 11).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:DarkTree", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 11).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:DarkTree", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 11).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 11),
                        ItemBracketHandler.getItem("Natura:planks", 11)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 11).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 11), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 11), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 11),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:DarkTree", 0),
                        ItemBracketHandler.getItem("Natura:DarkTree", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 11),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 11),
                        ItemBracketHandler.getItem("Natura:planks", 11),
                        ItemBracketHandler.getItem("Natura:natura.stick", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 11).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 11).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab2", 3).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 11), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.darkwood", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.darkwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.darkwood", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.darkwood", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 11), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11),
                                ItemBracketHandler.getItem("Natura:planks", 11))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab2", 3),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 3)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.darkwood", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 3),
                        ItemBracketHandler.getItem("Natura:natura.stick", 11),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 3)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 11), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.darkwood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 3),
                        ItemBracketHandler.getItem("Natura:natura.stick", 11),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 3)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 11), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.darkwood", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 3),
                        ItemBracketHandler.getItem("Natura:natura.stick", 11),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 3)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 11), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 11)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 3),
                                ItemBracketHandler.getItem("Natura:natura.stick", 11),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 3))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.darkwood", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.emptybowl", 11),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Natura:planks", 11),
                        OreBracketHandler.getOre("craftingToolKnife"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 12).amount(4),
                arrayOf(IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        ItemBracketHandler.getItem("Natura:DarkTree", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:planks", 12).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:DarkTree", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:natura.stick", 12).amount(2),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 12),
                        ItemBracketHandler.getItem("Natura:planks", 12)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.stick", 12).amount(4),
                arrayOf(arrayOf(
                        IngredientTransform.transformDamage(ItemBracketHandler.getItem("gregtech:gt.metatool.01", 10)),
                        null, null), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 12), null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Natura:planks", 12), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:Natura.workbench", 12),
                arrayOf(ore3, ore3, ItemBracketHandler.getItem("Natura:DarkTree", 1),
                        ItemBracketHandler.getItem("Natura:DarkTree", 1)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 12),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 12),
                        ItemBracketHandler.getItem("Natura:planks", 12),
                        ItemBracketHandler.getItem("Natura:natura.stick", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 12).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Natura.fence", 12).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:plankSlab2", 4).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 12), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.fusewood", 0),
                arrayOf(arrayOf<IIngredient?>(ore3, null, ore3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.fusewood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ore5, ore2, ore5),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:fenceGate.fusewood", 0).amount(4),
                arrayOf(arrayOf<IIngredient>(ore6, ore2, ore6),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:stair.fusewood", 0).amount(4),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 12), null, null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12),
                                ItemBracketHandler.getItem("Natura:planks", 12))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                        OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("screwWood")),
                        arrayOf(ItemBracketHandler.getItem("Natura:plankSlab2", 4),
                                OreBracketHandler.getOre("springAnyIron"),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 4)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.fusewood", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 4),
                        ItemBracketHandler.getItem("Natura:natura.stick", 12),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 4)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 12), ore3,
                                ItemBracketHandler.getItem("Natura:natura.stick", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.fusewood", 0).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 4),
                        ItemBracketHandler.getItem("Natura:natura.stick", 12),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 4)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 12), ore5,
                                ItemBracketHandler.getItem("Natura:natura.stick", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:trapdoor.fusewood", 0).amount(3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 4),
                        ItemBracketHandler.getItem("Natura:natura.stick", 12),
                        ItemBracketHandler.getItem("Natura:plankSlab2", 4)),
                        arrayOf(ItemBracketHandler.getItem("Natura:natura.stick", 12), ore6,
                                ItemBracketHandler.getItem("Natura:natura.stick", 12)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:plankSlab2", 4),
                                ItemBracketHandler.getItem("Natura:natura.stick", 12),
                                ItemBracketHandler.getItem("Natura:plankSlab2", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:button.fusewood", 0).amount(2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:natura.emptybowl", 12),
                arrayOf(arrayOf(ItemBracketHandler.getItem("Natura:planks", 12),
                        OreBracketHandler.getOre("craftingToolKnife"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:barley.seed", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:barleyFood", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:NetherFurnace", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("stoneNetherBrick"),
                        OreBracketHandler.getOre("stoneNetherBrick"), OreBracketHandler.getOre("stoneNetherBrick")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("itemFlint"),
                                OreBracketHandler.getOre("itemFlint"), OreBracketHandler.getOre("itemFlint")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("stoneNetherBrick"),
                                OreBracketHandler.getOre("stoneNetherBrick"),
                                OreBracketHandler.getOre("stoneNetherBrick"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:Obelisk", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:tree", 2),
                        ItemBracketHandler.getItem("Natura:tree", 2), ItemBracketHandler.getItem("Natura:tree", 2)),
                        arrayOf(ItemBracketHandler.getItem("Natura:tree", 2), OreBracketHandler.getOre("gemEnderPearl"),
                                ItemBracketHandler.getItem("Natura:tree", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:tree", 2),
                                ItemBracketHandler.getItem("Natura:tree", 2),
                                ItemBracketHandler.getItem("Natura:tree", 2))), null)
        val recipes = MineTweakerAPI.recipes
        val amount = ItemBracketHandler.getItem("Natura:NetherPressurePlate", 0).amount(2)
        val array = arrayOf<IIngredient?>(ore, null)
        val n = 1
        val item4 = ItemBracketHandler.getItem("ForgeMicroblock:microblock", 4)
        val hashMap = HashMap<String, IData>()
        hashMap["mat"] = ExpandString.asData("chisel:netherrack_7")
        array[n] = item4.withTag(ExpandAnyDict.asData(hashMap))
        recipes.addShapeless(amount, array, null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:NetherButton", 0).amount(2),
                arrayOf(ore, ItemBracketHandler.getItem("Natura:NetherPressurePlate", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("Natura:NetherLever", 0),
                arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("Natura:NetherButton", 0)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 0),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                        ItemBracketHandler.getItem("Natura:redwood", 1)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:redwood", 1)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:redwood", 1),
                                ItemBracketHandler.getItem("Natura:redwood", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 0),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                        ItemBracketHandler.getItem("Natura:redwood", 1)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:redwood", 1)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:redwood", 1),
                                ItemBracketHandler.getItem("Natura:redwood", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 0),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                        ItemBracketHandler.getItem("Natura:redwood", 1)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:redwood", 1)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:redwood", 1),
                                ItemBracketHandler.getItem("Natura:redwood", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 0),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                        ItemBracketHandler.getItem("Natura:redwood", 1)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:redwood", 1)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:redwood", 1),
                                ItemBracketHandler.getItem("Natura:redwood", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 1),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0),
                        ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 1),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0),
                        ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 1),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0),
                        ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 1),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0),
                        ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 0)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 0),
                                ItemBracketHandler.getItem("Natura:planks", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 2),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0),
                        ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 2),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0),
                        ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0),
                        ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 2),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0),
                        ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 5)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 5),
                                ItemBracketHandler.getItem("Natura:planks", 5))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 3),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0),
                        ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 3),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0),
                        ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 3),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0),
                        ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 3),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0),
                        ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 1)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 1),
                                ItemBracketHandler.getItem("Natura:planks", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 4),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0),
                        ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 4),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0),
                        ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 4),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0),
                        ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 4),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0),
                        ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 2)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 2),
                                ItemBracketHandler.getItem("Natura:planks", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 5),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0),
                        ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 5),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0),
                        ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 5),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0),
                        ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 5),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0),
                        ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:planks", 4)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:planks", 4),
                                ItemBracketHandler.getItem("Natura:planks", 4))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 6),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                        ItemBracketHandler.getItem("Natura:redwood", 0)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:redwood", 0)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:redwood", 0),
                                ItemBracketHandler.getItem("Natura:redwood", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 6),
                arrayOf(arrayOf(ore2, ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                        ItemBracketHandler.getItem("Natura:redwood", 0)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:redwood", 0)),
                        arrayOf(ore, ItemBracketHandler.getItem("Natura:redwood", 0),
                                ItemBracketHandler.getItem("Natura:redwood", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 6),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                        ItemBracketHandler.getItem("Natura:redwood", 0)),
                        arrayOf(ore9, ore7, ItemBracketHandler.getItem("Natura:redwood", 0)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:redwood", 0),
                                ItemBracketHandler.getItem("Natura:redwood", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 6),
                arrayOf(arrayOf(ore, ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                        ItemBracketHandler.getItem("Natura:redwood", 0)),
                        arrayOf(ore5, ore8, ItemBracketHandler.getItem("Natura:redwood", 0)),
                        arrayOf(ore2, ItemBracketHandler.getItem("Natura:redwood", 0),
                                ItemBracketHandler.getItem("Natura:redwood", 0))), null)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Natura:NetherGlass", 0),
                ItemBracketHandler.getItem("minecraft:glass", 0), ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                200, 16)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("Natura:NetherGlass", 1),
                ItemBracketHandler.getItem("minecraft:glass", 0), ItemBracketHandler.getItem("Natura:heatsand", 0), 200,
                16)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:natura.flintandblaze", 0),
                ItemBracketHandler.getItem("minecraft:flint_and_steel", 0),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0),
                LiquidBracketHandler.getLiquid("molten.blaze").withAmount(432), 200, VoltageLevels.LMV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 0),
                ItemBracketHandler.getItem("Natura:planks", 0).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 1),
                ItemBracketHandler.getItem("Natura:planks", 1).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 2),
                ItemBracketHandler.getItem("Natura:planks", 2).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 3),
                ItemBracketHandler.getItem("Natura:planks", 3).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 4),
                ItemBracketHandler.getItem("Natura:planks", 4).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 5),
                ItemBracketHandler.getItem("Natura:planks", 5).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 6),
                ItemBracketHandler.getItem("Natura:planks", 6).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 7),
                ItemBracketHandler.getItem("Natura:planks", 7).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 8),
                ItemBracketHandler.getItem("Natura:planks", 8).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 9),
                ItemBracketHandler.getItem("Natura:planks", 9).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 10),
                ItemBracketHandler.getItem("Natura:planks", 10).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 11),
                ItemBracketHandler.getItem("Natura:planks", 11).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.bookshelf", 12),
                ItemBracketHandler.getItem("Natura:planks", 12).amount(6),
                ItemBracketHandler.getItem("minecraft:book", 0).amount(3), 300, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 0),
                ItemBracketHandler.getItem("Natura:tree", 0),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 1),
                ItemBracketHandler.getItem("Natura:tree", 1),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 2),
                ItemBracketHandler.getItem("Natura:tree", 2),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 3),
                ItemBracketHandler.getItem("Natura:redwood", 1),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 4),
                ItemBracketHandler.getItem("Natura:bloodwood", 0),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 4),
                ItemBracketHandler.getItem("Natura:bloodwood", 15),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 5),
                ItemBracketHandler.getItem("Natura:tree", 3),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 6),
                ItemBracketHandler.getItem("Natura:RareTree", 0),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 7),
                ItemBracketHandler.getItem("Natura:RareTree", 1),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 8),
                ItemBracketHandler.getItem("Natura:RareTree", 2),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 9),
                ItemBracketHandler.getItem("Natura:RareTree", 3),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 10),
                ItemBracketHandler.getItem("Natura:willow", 0),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 11),
                ItemBracketHandler.getItem("Natura:DarkTree", 0),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.workbench", 12),
                ItemBracketHandler.getItem("Natura:DarkTree", 1),
                ItemBracketHandler.getItem("minecraft:flint", 0).amount(2), 200, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 0).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 1),
                ItemBracketHandler.getItem("Natura:natura.stick", 1).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 2),
                ItemBracketHandler.getItem("Natura:natura.stick", 2).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 3),
                ItemBracketHandler.getItem("Natura:natura.stick", 3).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 4),
                ItemBracketHandler.getItem("Natura:natura.stick", 4).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 5),
                ItemBracketHandler.getItem("Natura:natura.stick", 5).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 6),
                ItemBracketHandler.getItem("Natura:natura.stick", 6).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 7),
                ItemBracketHandler.getItem("Natura:natura.stick", 7).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 8),
                ItemBracketHandler.getItem("Natura:natura.stick", 8).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 9),
                ItemBracketHandler.getItem("Natura:natura.stick", 9).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 10),
                ItemBracketHandler.getItem("Natura:natura.stick", 10).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 11),
                ItemBracketHandler.getItem("Natura:natura.stick", 11).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:Natura.fence", 12),
                ItemBracketHandler.getItem("Natura:natura.stick", 12).amount(3),
                ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 3).amount(0), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.eucalyptus", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 0).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 0).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.sakura", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 1).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 1).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.ghostwood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 2).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 2).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.redwood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 3).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 3).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.bloodwood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 4).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 4).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.hopseed", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 5).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 5).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.maple", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 6).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 6).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.silverbell", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 7).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 7).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.amaranth", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 8).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 8).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.tiger", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 9).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 9).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.willow", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 10).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 10).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.darkwood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 11).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 11).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:fenceGate.fusewood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 12).amount(2),
                ItemBracketHandler.getItem("Natura:planks", 12).amount(2), 300, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab1", 0).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab1", 0).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab1", 1).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 1).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab1", 1).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 1).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab1", 2).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 2).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab1", 2).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 2).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab1", 3).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 3).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab1", 3).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 3).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab1", 4).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab1", 4).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 0).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab1", 5).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 5).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab1", 5).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 5).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.maple", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab1", 6).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 6).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.maple", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab1", 6).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 6).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.silverbell", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab1", 7).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 7).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.silverbell", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab1", 7).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 7).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.amaranth", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab2", 0).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 8).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.amaranth", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab2", 0).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 8).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.tiger", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab2", 1).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 9).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.tiger", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab2", 1).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 9).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.willow", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab2", 2).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 10).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.willow", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab2", 2).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 10).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.darkwood", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab2", 3).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 11).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.darkwood", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab2", 3).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 11).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.fusewood", 0).amount(4),
                ItemBracketHandler.getItem("Natura:plankSlab2", 4).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 12).amount(4),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:trapdoor.fusewood", 0).amount(6),
                ItemBracketHandler.getItem("Natura:plankSlab2", 4).amount(4),
                ItemBracketHandler.getItem("Natura:natura.stick", 12).amount(4),
                LiquidBracketHandler.getLiquid("molten.steel").withAmount(16), 600, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 0),
                ItemBracketHandler.getItem("Natura:redwood", 1).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 0),
                ItemBracketHandler.getItem("Natura:redwood", 1).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 1),
                ItemBracketHandler.getItem("Natura:planks", 0).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 1),
                ItemBracketHandler.getItem("Natura:planks", 0).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.eucalyptus", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 2),
                ItemBracketHandler.getItem("Natura:planks", 5).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 2),
                ItemBracketHandler.getItem("Natura:planks", 5).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.hopseed", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 3),
                ItemBracketHandler.getItem("Natura:planks", 1).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 3),
                ItemBracketHandler.getItem("Natura:planks", 1).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.sakura", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 4),
                ItemBracketHandler.getItem("Natura:planks", 2).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 4),
                ItemBracketHandler.getItem("Natura:planks", 2).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.ghostwood", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 5),
                ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 5),
                ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.bloodwood", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 6),
                ItemBracketHandler.getItem("Natura:redwood", 0).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                LiquidBracketHandler.getLiquid("molten.iron").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:redwoodDoorItem", 6),
                ItemBracketHandler.getItem("Natura:redwood", 0).amount(4),
                ItemBracketHandler.getItem("Natura:trapdoor.redwood", 0),
                LiquidBracketHandler.getLiquid("molten.copper").withAmount(16), 400, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:natura.bow.ghostwood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 2).amount(3),
                ItemBracketHandler.getItem("Natura:barleyFood", 7).amount(3), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:natura.bow.bloodwood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 4).amount(3),
                ItemBracketHandler.getItem("Natura:barleyFood", 7).amount(3), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:natura.bow.darkwood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 11).amount(3),
                ItemBracketHandler.getItem("Natura:barleyFood", 7).amount(3), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:natura.bow.fusewood", 0),
                ItemBracketHandler.getItem("Natura:natura.stick", 12).amount(3),
                ItemBracketHandler.getItem("Natura:barleyFood", 7).amount(3), 400, VoltageLevels.LLV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 1).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 1).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 2).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 2).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 3).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 3).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 4).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 4).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 5).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 5).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.maple", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 6).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.maple", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 6).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 7).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab1", 7).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 1).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 1).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.willow", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 2).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.willow", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 2).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 3).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 3).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 4).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24032), 100, VoltageLevels.ULV)
        Assembler.addRecipe(ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0).amount(2),
                ItemBracketHandler.getItem("Natura:plankSlab2", 4).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 24304), 100, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.eucalyptus", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.eucalyptus", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.eucalyptus", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.sakura", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.sakura", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.sakura", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.ghostwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.ghostwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.ghostwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.redwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.redwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.redwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.bloodwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.bloodwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.bloodwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.hopseed", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.hopseed", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.hopseed", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.maple", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.maple", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.maple", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.maple", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.maple", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.maple", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.silverbell", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.silverbell", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.silverbell", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.amaranth", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.amaranth", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.amaranth", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.tiger", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.tiger", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.tiger", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.willow", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.willow", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.willow", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.willow", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.willow", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.willow", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.darkwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.darkwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.darkwood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.fusewood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(4), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.fusewood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:button.fusewood", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:tree", 0), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 8)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 0).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:tree", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 0).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:tree", 0), LiquidBracketHandler.getLiquid("lubricant").withAmount(1),
                200, 8)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 1).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:tree", 1), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 8)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 1).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:tree", 1),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 1).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:tree", 1), LiquidBracketHandler.getLiquid("lubricant").withAmount(1),
                200, 8)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 2).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:tree", 2), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 2).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:tree", 2),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 2).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:tree", 2), LiquidBracketHandler.getLiquid("lubricant").withAmount(1),
                200, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 3).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:redwood", 0), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 3).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:redwood", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 3).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:redwood", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:bloodwood", 0),
                LiquidBracketHandler.getLiquid("water").withAmount(5), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:bloodwood", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 4).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:bloodwood", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:bloodwood", 15),
                LiquidBracketHandler.getLiquid("water").withAmount(5), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 4).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:bloodwood", 15),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 4).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:bloodwood", 15),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 5).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:tree", 3), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 5).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:tree", 3),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 5).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:tree", 3), LiquidBracketHandler.getLiquid("lubricant").withAmount(1),
                200, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 6).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:RareTree", 0), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 6).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:RareTree", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 6).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:RareTree", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 7).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:RareTree", 1), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 7).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:RareTree", 1),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 7).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:RareTree", 1),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 8).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:RareTree", 2), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 8).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:RareTree", 2),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 8).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:RareTree", 2),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 9).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:RareTree", 3), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 9).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:RareTree", 3),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 9).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:RareTree", 3),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 10).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:willow", 0), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 10).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:willow", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 10).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:willow", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 11).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:DarkTree", 0), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 11).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:DarkTree", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 11).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:DarkTree", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 12).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:DarkTree", 1), LiquidBracketHandler.getLiquid("water").withAmount(5),
                400, 4)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 12).amount(4),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(2)),
                ItemBracketHandler.getItem("Natura:DarkTree", 1),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 400, VoltageLevels.ULV)
        CuttingSaw.addRecipe(arrayOf(ItemBracketHandler.getItem("Natura:planks", 12).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(1)),
                ItemBracketHandler.getItem("Natura:DarkTree", 1),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 200, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 0), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 0),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 0),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 1).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 1), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 1).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 1),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 1).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 1),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 2).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 2), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 2).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 2),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 2).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 2),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 3).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 3), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 3).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 3),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 3).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 3),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 4).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 4), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 4).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 4),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 4).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 4),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 5).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 5), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 5).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 5),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 5).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 5),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 6).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 6), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 6).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 6),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 6).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 6),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 7).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 7), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 7).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 7),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab1", 7).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 7),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 8), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 8),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 0).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 8),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 1).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 9), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 1).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 9),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 1).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 9),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 2).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 10), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 2).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 10),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 2).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 10),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 3).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 11), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 3).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 11),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 3).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 11),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 4).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 12), LiquidBracketHandler.getLiquid("water").withAmount(4),
                50, 4)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 4).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 12),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(3), 50, VoltageLevels.ULV)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("Natura:plankSlab2", 4).amount(2), null,
                ItemBracketHandler.getItem("Natura:planks", 12),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(1), 25, VoltageLevels.ULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809)),
                ItemBracketHandler.getItem("Natura:tree", OreDictionary.WILDCARD_VALUE), intArrayOf(10000, 8000), 400, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809)),
                ItemBracketHandler.getItem("Natura:redwood", OreDictionary.WILDCARD_VALUE), intArrayOf(10000, 8000), 400, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809)),
                ItemBracketHandler.getItem("Natura:bloodwood", OreDictionary.WILDCARD_VALUE), intArrayOf(10000, 8000), 400, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809)),
                ItemBracketHandler.getItem("Natura:RareTree", OreDictionary.WILDCARD_VALUE), intArrayOf(10000, 8000), 400, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809)),
                ItemBracketHandler.getItem("Natura:willow", OreDictionary.WILDCARD_VALUE), intArrayOf(10000, 8000), 400, VoltageLevels.LULV)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809).amount(6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809)),
                ItemBracketHandler.getItem("Natura:DarkTree", OreDictionary.WILDCARD_VALUE), intArrayOf(10000, 8000), 400, VoltageLevels.LULV)
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 0))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 1))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 2))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 3))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 4))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 5))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 6))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 7))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 8))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 9))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 10))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 11))
        Groups.addVariation("bookshelf", ItemBracketHandler.getItem("Natura:Natura.bookshelf", 12))
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:NetherPressurePlate", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.eucalyptus", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.sakura", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.ghostwood", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.redwood", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.bloodwood", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.hopseed", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.maple", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.amaranth", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.silverbell", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.tiger", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.willow", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.darkwood", 0), 75)
        MineTweakerAPI.furnace.setFuel(ItemBracketHandler.getItem("Natura:pressureplate.fusewood", 0), 75)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:Bluebells", 0)), null)
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32418).amount(2),
                ItemBracketHandler.getItem("Natura:Bluebells", 0), 300, VoltageLevels.LULV)
        NEI.hide(ItemBracketHandler.getItem("Natura:barleyFood", 8))
    }
}