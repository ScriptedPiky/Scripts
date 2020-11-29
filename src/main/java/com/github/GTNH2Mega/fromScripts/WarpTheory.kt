package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import modtweaker2.mods.thaumcraft.handlers.Arcane
import minetweaker.mc1710.brackets.ItemBracketHandler
import modtweaker2.mods.thaumcraft.handlers.Infusion
import modtweaker2.mods.thaumcraft.handlers.Research
import minetweaker.api.item.IIngredient
import modtweaker2.mods.thaumcraft.handlers.Warp
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IItemStack
import minetweaker.api.data.IData
import minetweaker.expand.ExpandString
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandAnyDict
import java.util.HashMap

class WarpTheory : Runnable {
    override fun run() {
        Arcane.removeRecipe(ItemBracketHandler.getItem("WarpTheory:item.warptheory.paper", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanserminor", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanser", 0))
        Infusion.removeRecipe(ItemBracketHandler.getItem("WarpTheory:item.warptheory.amulet", 0))
        Research.clearPrereqs("warptheory.paper")
        Research.addPrereq("warptheory.paper", "RESEARCHER2", false)
        Research.clearPages("warptheory.paper")
        Research.addPage("warptheory.paper", "research.warptheory.paper")
        Arcane.addShaped("warptheory.paper", ItemBracketHandler.getItem("WarpTheory:item.warptheory.paper", 0).amount(2), "aqua 8, terra 8", arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14), null), arrayOf<IIngredient?>(ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14), ItemBracketHandler.getItem("minecraft:paper", 0), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14)), arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14), null)))
        Research.addArcanePage("warptheory.paper", ItemBracketHandler.getItem("WarpTheory:item.warptheory.paper", 0))
        Research.setAspects("warptheory.paper", "alienis 6, praecantatio 6, ordo 9, aqua 3, terra 3")
        Research.setComplexity("warptheory.paper", 2)
        Research.orphanResearch("FAKESOAP")
        Research.removeResearch("FAKESOAP")
        Research.orphanResearch("FAKEELDMAJOR")
        Research.removeResearch("FAKEELDMAJOR")
        Research.clearPrereqs("warptheory.something")
        Research.addPrereq("warptheory.something", "warptheory.paper", false)
        Research.setAspects("warptheory.something", "alienis 12, bestia 12, permutatio 9, victus 6, corpus 3")
        Research.setComplexity("warptheory.something", 2)
        Warp.addToResearch("warptheory.something", 3)
        Research.orphanResearch("warptheory.cleanserminor")
        Research.removeResearch("warptheory.cleanserminor")
        Research.addResearch("PURETEARMINOR", "WT_Category", "alienis 6, praecantatio 6, permutatio 4, sano 3, terra 2", -1, -2, 2, ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanserminor", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.PURETEARMINOR", "Impure Tear")
        MineTweakerAPI.game.setLocalization("tc.research_text.PURETEARMINOR", "Magical-ish Medicine")
        Research.addPrereq("PURETEARMINOR", "ELDRITCHMINOR", false)
        Research.addPrereq("PURETEARMINOR", "warptheory.paper", false)
        Research.addPage("PURETEARMINOR", "research.warptheory.warpcleanserminor")
        val iItemStack = ItemBracketHandler.getItem("BiomesOPlenty:hardIce", 0)
        val arriItemStack = arrayOfNulls<IItemStack>(12)
        arriItemStack[0] = ItemBracketHandler.getItem("thaumicbases:resource", 5)
        arriItemStack[1] = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32553)
        arriItemStack[2] = ItemBracketHandler.getItem("thaumicbases:quicksilverBlock", 0)
        val iItemStack2 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap = HashMap<String, IData>()
        val hashMap2 = HashMap<String, IData>()
        hashMap2["FluidName"] = ExpandString.asData("lifeessence")
        hashMap2["Amount"] = ExpandInt.toData(1000)
        hashMap["Fluid"] = ExpandAnyDict.asData(hashMap2)
        arriItemStack[3] = iItemStack2.withTag(ExpandAnyDict.asData(hashMap))
        arriItemStack[4] = ItemBracketHandler.getItem("AWWayofTime:magicales", 0)
        arriItemStack[5] = ItemBracketHandler.getItem("witchery:ingredient", 36)
        arriItemStack[6] = ItemBracketHandler.getItem("thaumicbases:resource", 5)
        arriItemStack[7] = ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 32553)
        arriItemStack[8] = ItemBracketHandler.getItem("thaumicbases:quicksilverBlock", 0)
        val iItemStack3 = ItemBracketHandler.getItem("IC2:itemFluidCell", 0)
        val hashMap3 = HashMap<String, IData>()
        val hashMap4 = HashMap<String, IData>()
        hashMap4["FluidName"] = ExpandString.asData("lifeessence")
        hashMap4["Amount"] = ExpandInt.toData(1000)
        hashMap3["Fluid"] = ExpandAnyDict.asData(hashMap4)
        arriItemStack[9] = iItemStack3.withTag(ExpandAnyDict.asData(hashMap3))
        arriItemStack[10] = ItemBracketHandler.getItem("AWWayofTime:magicales", 0)
        arriItemStack[11] = ItemBracketHandler.getItem("witchery:ingredient", 36)
        Infusion.addRecipe("PURETEARMINOR", iItemStack, arriItemStack, "auram 64, desidia 16, fames 16, gelum 16, permutatio 32, praecantatio 32, venenum 32", ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanserminor", 0), 10)
        Research.addInfusionPage("PURETEARMINOR", ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanserminor", 0))
        Research.orphanResearch("warptheory.cleanser")
        Research.removeResearch("warptheory.cleanser")
        Research.addResearch("PURETEAR", "WT_Category", "alienis 12, praecantatio 12, permutatio 9, sano 6, terra 3", -4, -1, 3, ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanser", 0))
        MineTweakerAPI.game.setLocalization("tc.research_name.PURETEAR", "Pure Tear")
        MineTweakerAPI.game.setLocalization("tc.research_text.PURETEAR", "Magical Medicine")
        Research.addPrereq("PURETEAR", "ELDRITCHMAJOR", false)
        Research.addPrereq("PURETEAR", "warptheory.paper", false)
        Research.addPrereq("PURETEAR", "ICHORIUM", false)
        Research.addPage("PURETEAR", "research.warptheory.warpcleanser")
        Infusion.addRecipe("PURETEAR", ItemBracketHandler.getItem("minecraft:nether_star", 0), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 10), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24500), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 11), ItemBracketHandler.getItem("minecraft:ghast_tear", 0), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14), ItemBracketHandler.getItem("minecraft:ghast_tear", 0), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 11), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24500), ItemBracketHandler.getItem("appliedenergistics2:item.ItemMultiMaterial", 10)), "alienis 32, permutatio 32, praecantatio 16, sano 16", ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanser", 0), 10)
        Research.addInfusionPage("PURETEAR", ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanser", 0))
        Research.orphanResearch("warptheory.amulet")
        Research.clearPrereqs("warptheory.amulet")
        Research.addPrereq("warptheory.amulet", "PURETEAR", false)
        Infusion.addRecipe("warptheory.amulet", ItemBracketHandler.getItem("Thaumcraft:ItemBaubleBlanks", 0), arrayOf(ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanser", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330), ItemBracketHandler.getItem("WarpTheory:item.warptheory.cleanser", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 29500), ItemBracketHandler.getItem("Thaumcraft:ItemResource", 14), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11978), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17086), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27330)), "alienis 64, auram 32, potentia 32, praecantatio 64, permutatio 32", ItemBracketHandler.getItem("WarpTheory:item.warptheory.amulet", 0), 16)
        Research.setAspects("warptheory.amulet", "alienis 15, auram 15, potentia 12, praecantatio 9, permutatio 6, terra 3")
        Research.setComplexity("warptheory.amulet", 4)
        Research.refreshResearchRecipe("warptheory.paper")
        Research.refreshResearchRecipe("warptheory.something")
        Research.refreshResearchRecipe("warptheory.cleanser")
        Research.refreshResearchRecipe("warptheory.amulet")
    }
}