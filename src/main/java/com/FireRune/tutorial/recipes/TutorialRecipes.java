package com.FireRune.tutorial.recipes;

import com.FireRune.tutorial.init.TutorialBlocks;
import com.FireRune.tutorial.init.TutorialItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialRecipes {

	public static void initSmelting() {
		GameRegistry.addSmelting(TutorialBlocks.ORE_COPPER, new ItemStack(TutorialItems.INGOT_COPPER), 10.0F);
	}
	
}
