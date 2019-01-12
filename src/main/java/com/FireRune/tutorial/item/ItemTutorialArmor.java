package com.FireRune.tutorial.item;

import com.FireRune.tutorial.TutorialMod;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemTutorialArmor extends ItemArmor {

	public ItemTutorialArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot, String unlocalizedName, String registryName) {
		super(material, 0, equipmentSlot);
		
		setUnlocalizedName(TutorialMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}
	
}
