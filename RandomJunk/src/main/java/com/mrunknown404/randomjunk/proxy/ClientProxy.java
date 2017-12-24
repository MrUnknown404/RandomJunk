package com.mrunknown404.randomjunk.proxy;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.client.gui.GuiHandler;

import init.ModArmor;
import init.ModBlocks;
import init.ModItems;
import init.ModTileEntities;
import init.ModTools;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(RandomJunk.instance, new GuiHandler());
		
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
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.WoodCrate), 
				new ResourceLocation(Reference.MOD_ID, "crate_oak"),
				new ResourceLocation(Reference.MOD_ID, "crate_birch"),
				new ResourceLocation(Reference.MOD_ID, "crate_spruce"),
				new ResourceLocation(Reference.MOD_ID, "crate_jungle"),
				new ResourceLocation(Reference.MOD_ID, "crate_acacia"),
				new ResourceLocation(Reference.MOD_ID, "crate_darkoak"));
	}
}
