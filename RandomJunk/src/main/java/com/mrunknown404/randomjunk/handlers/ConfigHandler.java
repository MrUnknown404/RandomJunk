package com.mrunknown404.randomjunk.handlers;

import java.io.File;

import com.mrunknown404.randomjunk.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler {
	
	public static Configuration Config;
	public static boolean InfDurability = false;
	public static boolean UpdateCheck = true;
	public static boolean DebugItems = false;
	public static boolean MaxStack = true;
	
	public static void init(String ConfigDir) {
		if (Config == null) {
			File path = new File(ConfigDir + "/" + Reference.MOD_ID + ".cfg");
			
			Config = new Configuration(path);
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		//Order Doesn't Matter
		InfDurability = Config.getBoolean("Infinite Durability (Beta)",Configuration.CATEGORY_GENERAL,false,"Enable/Disable Infinite Durabilty (Requires Restart, Also Buggy)");
		DebugItems = Config.getBoolean("Debug Items",Configuration.CATEGORY_GENERAL,false,"Enable/Disable Debug Items (Requires Restart)");
		UpdateCheck = Config.getBoolean("Update Check (Beta)",Configuration.CATEGORY_GENERAL,true,"Check For Updates (Does Nothing Currently)");
		UpdateCheck = Config.getBoolean("Max Stack",Configuration.CATEGORY_GENERAL,true,"Sets Max Stack Size to 64 for items that are normaly 16 (Requires Restart)");
		
		if (Config.hasChanged()) {
			Config.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
	
	public static Configuration getConfiguration() {
		return Config;
	}
}
