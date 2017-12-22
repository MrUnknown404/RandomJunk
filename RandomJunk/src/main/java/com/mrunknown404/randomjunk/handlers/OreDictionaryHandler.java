package com.mrunknown404.randomjunk.handlers;

import init.ModBlocks;
import init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	public static void RegisterOreDictionary() {
		//Items
		OreDictionary.registerOre("ingotFlint",    ModItems.FlintIngot);
		OreDictionary.registerOre("ingotBone",     ModItems.BoneIngot);
		OreDictionary.registerOre("ingotSteel",    ModItems.SteelIngot);
		OreDictionary.registerOre("ingotObsidian", ModItems.ObsidianIngot);
		OreDictionary.registerOre("ingotTin",      ModItems.TinIngot);
		OreDictionary.registerOre("ingotCopper",   ModItems.CopperIngot);

		//Blocks
		OreDictionary.registerOre("blockFlint",    ModBlocks.FlintBlock);
		OreDictionary.registerOre("blockBone",     ModBlocks.BoneBlock);
		OreDictionary.registerOre("blockSteel",    ModBlocks.SteelBlock);
		OreDictionary.registerOre("blockObsidian", ModBlocks.ObsidianBlock);
		OreDictionary.registerOre("blockTin",      ModBlocks.TinBlock);
		OreDictionary.registerOre("blockCopper",   ModBlocks.CopperBlock);

		OreDictionary.registerOre("oreCopper",     ModBlocks.CopperOre);
		OreDictionary.registerOre("oreTin",        ModBlocks.TinOre);

		//Nuggets
		OreDictionary.registerOre("nuggetSteel",   ModItems.SteelNugget);
		OreDictionary.registerOre("nuggetTin",     ModItems.TinNugget);
		OreDictionary.registerOre("nuggetCopper",  ModItems.CopperNugget);
	}
}
