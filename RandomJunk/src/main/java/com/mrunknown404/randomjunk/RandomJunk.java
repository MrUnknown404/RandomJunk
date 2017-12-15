package com.mrunknown404.randomjunk;

import com.mrunknown404.randomjunk.proxy.CommonProxy;

import init.ModArmor;
import init.ModBlocks;
import init.ModCrafting;
import init.ModItems;
import init.ModTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class RandomJunk {
	
	@Instance
	public static RandomJunk instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Items Init
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModTools.init();
		ModTools.register();
		
		ModArmor.init();
		ModArmor.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.init();
		
		//Crafting Init
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		MinecraftForge.EVENT_BUS.register(new ObsidianEventHandler());
		
		//Normally 16
		Items.BUCKET.setMaxStackSize(64);
		Items.SNOWBALL.setMaxStackSize(64);
		Items.ENDER_PEARL.setMaxStackSize(64);
		Items.IRON_HORSE_ARMOR.setMaxStackSize(64);
		Items.GOLDEN_HORSE_ARMOR.setMaxStackSize(64);
		Items.DIAMOND_HORSE_ARMOR.setMaxStackSize(64);
	}
}
