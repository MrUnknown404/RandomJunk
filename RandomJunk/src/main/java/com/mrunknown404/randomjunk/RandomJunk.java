package com.mrunknown404.randomjunk;

import com.mrunknown404.randomjunk.proxy.CommonProxy;

import init.ModCrafting;
import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
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
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.init();
		
		//Crafting Init
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs TabRandomJunkItems = new CreativeTabs("Tab_RandomJunkItems") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.GunpowderApple);
		}
	};
	public static CreativeTabs TabRandomJunkBlocks = new CreativeTabs("Tab_RandomJunkBlocks") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.GunpowderApple);
		}
	};
}
