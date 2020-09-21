package com.github.GTNH2Mega.fromScripts

import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class IguanaTweaks : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketUnfired", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IguanaTweaksTConstruct:sawArdite", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IguanaTweaksTConstruct:sawCobalt", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("IguanaTweaksTConstruct:sawManyullyn", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketUnfired", 0), arrayOf(arrayOfNulls(3), arrayOf<IIngredient?>(OreBracketHandler.getOre("dustClay"), null, OreBracketHandler.getOre("dustClay")), arrayOf<IIngredient?>(OreBracketHandler.getOre("dustClay"), OreBracketHandler.getOre("dustClay"), OreBracketHandler.getOre("dustClay"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0), arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:waterdrop", 0), ItemBracketHandler.getItem("Natura:waterdrop", 0), ItemBracketHandler.getItem("Natura:waterdrop", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:waterdrop", 0), ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketFired", 0), ItemBracketHandler.getItem("Natura:waterdrop", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("Natura:waterdrop", 0), ItemBracketHandler.getItem("Natura:waterdrop", 0), ItemBracketHandler.getItem("Natura:waterdrop", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IguanaTweaksTConstruct:sawArdite", 0), arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")), arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("dreamcraft:item.SawBladeArdite", 0), OreBracketHandler.getOre("stickSteel")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IguanaTweaksTConstruct:sawCobalt", 0), arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")), arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("toolHeadSawCobalt"), OreBracketHandler.getOre("stickSteel")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("IguanaTweaksTConstruct:sawManyullyn", 0), arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("stickSteel"), OreBracketHandler.getOre("stickSteel")), arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("dreamcraft:item.SawBladeManyullyn", 0), OreBracketHandler.getOre("stickSteel")), arrayOfNulls(3)), null)
    }
}