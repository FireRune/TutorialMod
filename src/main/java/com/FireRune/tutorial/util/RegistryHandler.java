package com.FireRune.tutorial.util;

import com.FireRune.tutorial.block.BlockBasic;
import com.FireRune.tutorial.init.TutorialBlocks;
import com.FireRune.tutorial.item.ItemBasic;
import com.FireRune.tutorial.item.ItemTutorialArmor;
import com.FireRune.tutorial.item.ItemTutorialAxe;
import com.FireRune.tutorial.item.ItemTutorialHoe;
import com.FireRune.tutorial.item.ItemTutorialPickaxe;
import com.FireRune.tutorial.item.ItemTutorialShovel;
import com.FireRune.tutorial.item.ItemTutorialSword;
import com.FireRune.tutorial.materials.TutorialMaterials;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks= {
				new BlockBasic(Material.ROCK, "blockBasic", "basic_block"),
				new BlockBasic(Material.IRON, SoundType.METAL, "blockCopper", "block_copper"),
				new BlockBasic(Material.ROCK, "oreCopper", "ore_copper")
		};
		
		event.getRegistry().registerAll(blocks);
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items= {
				new ItemBasic("itemBasic", "basic_item"),
				new ItemBasic("ingotCopper", "ingot_copper"),
				new ItemTutorialAxe(TutorialMaterials.TUTORIAL_TOOL, "axeTutorial", "tutorial_axe"),
				new ItemTutorialPickaxe(TutorialMaterials.TUTORIAL_TOOL, "pickaxeTutorial", "tutorial_pickaxe"),
				new ItemTutorialHoe(TutorialMaterials.TUTORIAL_TOOL, "hoeTutorial", "tutorial_hoe"),
				new ItemTutorialShovel(TutorialMaterials.TUTORIAL_TOOL, "shovelTutorial", "tutorial_shovel"),
				new ItemTutorialSword(TutorialMaterials.TUTORIAL_TOOL, "swordTutorial", "tutorial_sword"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.HEAD, "helmetTutorial", "tutorial_helmet"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.CHEST, "chestplateTutorial", "tutorial_chestplate"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.LEGS, "leggingsTutorial", "tutorial_leggings"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.FEET, "bootsTutorial", "tutorial_boots")
		};
		
		final Item[] itemBlocks= {
				new ItemBlock(TutorialBlocks.BASIC_BLOCK).setRegistryName(TutorialBlocks.BASIC_BLOCK.getRegistryName()),
				new ItemBlock(TutorialBlocks.BLOCK_COPPER).setRegistryName(TutorialBlocks.BLOCK_COPPER.getRegistryName()),
				new ItemBlock(TutorialBlocks.ORE_COPPER).setRegistryName(TutorialBlocks.ORE_COPPER.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
}
