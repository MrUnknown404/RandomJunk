package com.mrunknown404.randomjunk.handlers;

import init.ModBlocks;
import init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	public static void RegisterOreDictionary() {
		//Items
		OreDictionary.registerOre("ingotFlint",ModItems.FlintIngot);
		OreDictionary.registerOre("ingotBone",ModItems.BoneIngot);
		OreDictionary.registerOre("ingotSteel",ModItems.SteelIngot);
		OreDictionary.registerOre("ingotObsidian",ModItems.ObsidianIngot);
		
		//Blocks
		OreDictionary.registerOre("blockFlint",ModBlocks.FlintBlock);
		OreDictionary.registerOre("blockBone",ModBlocks.BoneBlock);
		OreDictionary.registerOre("blockSteel",ModBlocks.SteelBlock);
		OreDictionary.registerOre("blockObsidian",ModBlocks.ObsidianBlock);
	}
}
