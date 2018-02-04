package com.mrunknown404.randomjunk.init;

import java.util.ArrayList;
import java.util.List;

import com.mrunknown404.randomjunk.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//--> String name, Material material, SoundType soundType, CreativeTabs tab, float hardness, float resistance, String toolType, int harvestLevel
	public static final Block SANDYDIRT = new BlockBase("sandydirt", Material.GROUND, SoundType.GROUND, ModCreativeTabs.TabRandomJunkBlocks, 0.5f, 2.5f, "shovel", -1);
}
