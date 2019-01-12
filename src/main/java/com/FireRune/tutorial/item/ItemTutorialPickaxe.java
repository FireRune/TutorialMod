package com.FireRune.tutorial.item;

import com.FireRune.tutorial.TutorialMod;

import net.minecraft.item.ItemPickaxe;

public class ItemTutorialPickaxe extends ItemPickaxe {

	public ItemTutorialPickaxe(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		
		setUnlocalizedName(TutorialMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}
	
}
