package com.mrunknown404.randomjunk.handlers;

import java.io.File;

import com.mrunknown404.randomjunk.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler {
	
	public static Configuration Config;
	
	public static boolean InfDurability;
	public static boolean UpdateCheck;
	public static boolean DebugItems;
	public static boolean MaxStack;
	
	public static int ModBiomeID_Dead;
	public static int ModBiomeSpawnRate_Dead;
	public static int OreGenCopper;
	public static int OreGenTin;
	
	public static final String category_general = "general";
	public static final String category_debug = "debug";
	public static final String category_worldgen = "worldgen";
	
	public static void init(String ConfigDir) {
		if (Config == null) {
			File path = new File(ConfigDir + "/" + Reference.MOD_ID + ".cfg");
			Config = new Configuration(path);
			
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		//general
		InfDurability = Config.getBoolean("Infinite Durability (Beta)", category_general, false,"Enable/Disable infinite durabilty (Can be Buggy)");
		UpdateCheck = Config.getBoolean("Update Check (Beta)", category_general, true,"Check for Updates (Does nothing currently)");
		MaxStack = Config.getBoolean("Max Stack", category_general, true,"Sets Max Stack Size to 64 for items that are normaly 16");
		
		//debug
		DebugItems = Config.getBoolean("Debug Items", category_debug, false, "Enable/Disable Debug Items");
		
		//biomeid
		ModBiomeID_Dead = Config.getInt("ModBiomeID Dead", category_worldgen, 40, 40, 126, "Dead Biome ID (Can break existing Worlds)");
		ModBiomeSpawnRate_Dead = Config.getInt("ModBiomeSpawnRate Dead", category_worldgen, 1, 1, 1000, "Dead Biome Spawn Rate (Can break existing Worlds)");
		OreGenCopper = Config.getInt("Ore Gen Copper", category_worldgen, 20, 1, 100, "Change Copper Ore spawn rates (Can break existing Worlds)");
		OreGenTin = Config.getInt("Ore Gen Tin", category_worldgen, 30, 1, 100, "Change Tin Ore spawn rates (Can break existing Worlds)");
		
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
