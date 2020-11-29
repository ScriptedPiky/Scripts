package com.github.GTNH2Mega.fromScripts;
import minetweaker.api.item.IIngredient;
import minetweaker.api.item.IItemStack;
import minetweaker.mc1710.brackets.ItemBracketHandler;
import minetweaker.mc1710.brackets.OreBracketHandler;
import modtweaker2.mods.thaumcraft.handlers.Arcane;
import modtweaker2.mods.thaumcraft.handlers.Research;
import modtweaker2.mods.thaumcraft.handlers.Warp;
import static com.github.GTNH2Mega.VoltageLevels.*;
public class ThaumicMachina
implements Runnable {
    public void run() {
        Research.orphanResearch((String)"@TMTHAUMATURGY");
        Research.removeResearch((String)"@TMTHAUMATURGY");
        Arcane.removeRecipe((IIngredient)ItemBracketHandler.getItem((String)"ThaumicMachina:wandAugmentationCore", (int)0));
        Research.setAspects((String)"@WAND_STABILITY", (String)"perditio 3, ordo 12, instrumentum 6, praecantatio 9");
        Research.setComplexity((String)"@WAND_STABILITY", (int)3);
        Research.setAspects((String)"@WAND_STUDIES", (String)"perditio 3, auram 9, cognitio 15, ordo 12, instrumentum 6");
        Research.setComplexity((String)"@WAND_STUDIES", (int)3);
        Research.clearPages((String)"@WAND_AUGMENTATION");
        Research.addPrereq((String)"@WAND_AUGMENTATION", (String)"MIRROR", (boolean)false);
        Research.setConcealed((String)"@WAND_AUGMENTATION", (boolean)true);
        Research.addPage((String)"@WAND_AUGMENTATION", (String)"tm.research.page.WAND_AUGMENTATION.1");
        Research.addPage((String)"@WAND_AUGMENTATION", (String)"tm.research.page.WAND_AUGMENTATION.2");
        Research.addPage((String)"@WAND_AUGMENTATION", (String)"tm.research.page.WAND_AUGMENTATION.3");
        Arcane.addShaped((String)"@WAND_AUGMENTATION", (IItemStack)ItemBracketHandler.getItem((String)"ThaumicMachina:wandAugmentationCore", (int)0), (String)"ordo 35, perditio 35", (IIngredient[][])new IIngredient[][]{{ItemBracketHandler.getItem((String)"Thaumcraft:ItemResource", (int)14), OreBracketHandler.getOre((String)"plateEnergeticAlloy"), ItemBracketHandler.getItem((String)"Thaumcraft:ItemResource", (int)14)}, {OreBracketHandler.getOre((String)"plateEnergeticAlloy"), ItemBracketHandler.getItem((String)"Thaumcraft:ItemResource", (int)10), OreBracketHandler.getOre((String)"plateEnergeticAlloy")}, {ItemBracketHandler.getItem((String)"Thaumcraft:ItemResource", (int)14), OreBracketHandler.getOre((String)"plateEnergeticAlloy"), ItemBracketHandler.getItem((String)"Thaumcraft:ItemResource", (int)14)}});
        Research.addArcanePage((String)"@WAND_AUGMENTATION", (IItemStack)ItemBracketHandler.getItem((String)"ThaumicMachina:wandAugmentationCore", (int)0));
        Research.setAspects((String)"@WAND_AUGMENTATION", (String)"instrumentum 3, praecantatio 6, ordo 9, machina 12, perditio 15");
        Research.setComplexity((String)"@WAND_AUGMENTATION", (int)3);
        Research.setAspects((String)"@VIS", (String)"alienis 3, auram 9, praecantatio 6");
        Research.setComplexity((String)"@VIS", (int)2);
        Research.setAspects((String)"@VIS_STUDIES", (String)"alienis 3, auram 12, cognitio 6, potentia 9, praecantatio 15");
        Research.setComplexity((String)"@VIS_STUDIES", (int)3);
        Research.setAspects((String)"@VIS_CHARGE", (String)"alienis 3, auram 12, potentia 6, perditio 9, praecantatio 15");
        Research.setComplexity((String)"@VIS_CHARGE", (int)3);
        Research.setAspects((String)"@NODAL_STUDIES", (String)"alienis 3, auram 12, cognitio 6, cognitio 9, praecantatio 15");
        Research.setComplexity((String)"@NODAL_STUDIES", (int)3);
        Research.setAspects((String)"@AURA_FIELD", (String)"alienis 3, auram 12, potentia 6, vacuos 9, praecantatio 15");
        Research.setComplexity((String)"@AURA_FIELD", (int)3);
        Research.setAspects((String)"@CRIMSON_ASTRONOMY", (String)"alienis 3, auram 12, tenebrae 6, vacuos 9, praecantatio 15");
        Research.setComplexity((String)"@CRIMSON_ASTRONOMY", (int)3);
        Research.setAspects((String)"@CRIMSON_REALISATION", (String)"alienis 3, auram 12, tenebrae 6, praecantatio 9, potentia 15");
        Research.setComplexity((String)"@CRIMSON_REALISATION", (int)3);
        Research.setAspects((String)"@CRIMSON_CELESTIAL_FIELD", (String)"alienis 3, auram 12, tenebrae 6, praecantatio 9, ordo 15, vacuos 18");
        Research.setComplexity((String)"@CRIMSON_CELESTIAL_FIELD", (int)3);
        Research.setAspects((String)"@CRIMSON_THAUMATURGY", (String)"alienis 3, instrumentum 12, tenebrae 6, praecantatio 9, ordo 15");
        Research.setComplexity((String)"@CRIMSON_THAUMATURGY", (int)3);
        Research.setAspects((String)"@CRIMSON_WAND_AUGMENTATION", (String)"alienis 3, tenebrae 6, instrumentum 12, praecantatio 9, ordo 15, machina 18, cognitio 21");
        Research.setComplexity((String)"@CRIMSON_WAND_AUGMENTATION", (int)3);
        Research.setAspects((String)"@WAND_AUGMENTATION_TAINTED_CORE", (String)"instrumentum 3, praecantatio 6, perditio 12, vitium 9, tenebrae 15, alienis 18, cognitio 21");
        Research.setComplexity((String)"@WAND_AUGMENTATION_TAINTED_CORE", (int)3);
        Warp.addToResearch((String)"@WAND_AUGMENTATION_TAINTED_CORE", (int)5);
        Research.setAspects((String)"@WAND_AUGMENTATION_CHARGE_BUFFER", (String)"instrumentum 3, praecantatio 6, potentia 12, vacuos 9, tenebrae 15, alienis 18");
        Research.setComplexity((String)"@WAND_AUGMENTATION_CHARGE_BUFFER", (int)3);
        Research.setAspects((String)"@WAND_AUGMENTATION_VIS_CHANNEL", (String)"instrumentum 3, praecantatio 6, aqua 9, tenebrae 12, alienis 15");
        Research.setComplexity((String)"@WAND_AUGMENTATION_VIS_CHANNEL", (int)3);
        Research.setAspects((String)"@WAND_AUGMENTATION_CONTACT_DISCHARGE", (String)"instrumentum 3, praecantatio 6, potentia 12, tenebrae 15, alienis 18, telum 21");
        Research.setComplexity((String)"@WAND_AUGMENTATION_CONTACT_DISCHARGE", (int)3);
        Warp.addToResearch((String)"@WAND_AUGMENTATION_CONTACT_DISCHARGE", (int)5);
        Research.setAspects((String)"@WAND_AUGMENTATION_TAINT_CAPPING", (String)"instrumentum 3, praecantatio 6, vitium 9, auram 12, alienis 15, potentia 18, cognitio 21");
        Research.setComplexity((String)"@WAND_AUGMENTATION_TAINT_CAPPING", (int)3);
        Warp.addToResearch((String)"@WAND_AUGMENTATION_TAINT_CAPPING", (int)5);
    }
}

