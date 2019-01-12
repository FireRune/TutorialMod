package com.FireRune.tutorial.block;

import com.FireRune.tutorial.TutorialMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

	public BlockBasic(Material material, String unlocalizedName, String registryName) {
		this(material, SoundType.STONE, unlocalizedName, registryName);
	}
	
	public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName) {
		super(material);
		setUnlocalizedName(TutorialMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setSoundType(sound);
	}
	
}
