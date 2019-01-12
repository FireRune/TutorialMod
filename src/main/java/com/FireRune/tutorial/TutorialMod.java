package com.FireRune.tutorial;

import org.apache.logging.log4j.Logger;

import com.FireRune.tutorial.proxy.IProxy;
import com.FireRune.tutorial.recipes.TutorialRecipes;
import com.FireRune.tutorial.tabs.TutorialTab;
import com.FireRune.tutorial.world.gen.TutorialWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=TutorialMod.MODID, name=TutorialMod.NAME, version=TutorialMod.VERSION, acceptedMinecraftVersions=TutorialMod.MC_VERSION)
public class TutorialMod {

	public static final String MODID="tutorialmod";
	public static final String NAME="FireRune's Tutorial Mod";
	public static final String VERSION="1.0";
	public static final String MC_VERSION="[1.12.2]";
	
	public static final String CLIENT="com.FireRune.tutorial.proxy.ClientProxy";
	public static final String SERVER="com.FireRune.tutorial.proxy.ServerProxy";
	
	public static final CreativeTabs TUTORIAL_TAB=new TutorialTab("tabTutorialMod");
	
	@SidedProxy(clientSide=TutorialMod.CLIENT, serverSide=TutorialMod.SERVER)
	public static IProxy proxy;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger=event.getModLog();
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		TutorialRecipes.initSmelting();
		GameRegistry.registerWorldGenerator(new TutorialWorldGen(), 0);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
