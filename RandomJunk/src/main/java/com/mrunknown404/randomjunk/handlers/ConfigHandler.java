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
	
	public static void init(String ConfigDir) {
		if (Config == null) {
			File path = new File(ConfigDir + "/" + Reference.MOD_ID + ".cfg");
			
			Config = new Configuration(path);
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		InfDurability = Config.getBoolean("Infinite Durability",Configuration.CATEGORY_GENERAL,false,"Enable/Disable Infinite Durabilty (Requires Restart)");
		UpdateCheck = Config.getBoolean("UpdateCheck",Configuration.CATEGORY_GENERAL,true,"Check For Updates");
		
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
