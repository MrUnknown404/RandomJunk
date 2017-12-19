package com.mrunknown404.randomjunk.proxy;

import com.mrunknown404.randomjunk.Reference;

import init.ModArmor;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.RegisterRenders();
		ModBlocks.RegisterRenders();
		ModArmor.RegisterRenders();
		ModTools.RegisterRenders();
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.CompressedCobblestone), 
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x1"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x2"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x3"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x4"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x5"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x6"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x7"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x8"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x9"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x10"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x11"),
				new ResourceLocation(Reference.MOD_ID, "cobblestone_compressed_x12"));
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.CompressedDirt), 
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x1"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x2"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x3"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x4"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x5"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x6"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x7"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x8"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x9"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x10"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x11"),
				new ResourceLocation(Reference.MOD_ID, "dirt_compressed_x12"));
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.CompressedSand), 
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x1"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x2"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x3"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x4"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x5"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x6"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x7"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x8"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x9"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x10"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x11"),
				new ResourceLocation(Reference.MOD_ID, "sand_compressed_x12"));
	}
}
