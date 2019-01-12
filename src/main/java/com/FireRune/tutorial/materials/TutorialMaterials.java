package com.FireRune.tutorial.materials;

import com.FireRune.tutorial.TutorialMod;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TutorialMaterials {

	public static final ToolMaterial TUTORIAL_TOOL=EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "tutorial_tool", 2, 200, 7.0F, 1.5F, 10);
	
	public static final ArmorMaterial TUTORIAL_ARMOR=EnumHelper.addArmorMaterial(TutorialMod.MODID + ":" + "tutorial_armor", TutorialMod.MODID + ":tutorial", 16, new int[] {2, 5, 6 ,3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	
}
