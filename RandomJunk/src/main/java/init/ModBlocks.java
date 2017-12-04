package init;

import blocks.Block_ObsidianBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	//Blocks
	public static Block ObsidianBlock;
	
	public static void init() {
		//Blocks
		ObsidianBlock = new 	Block_ObsidianBlock();
	}
	public static void register() {
		registerBlock(ObsidianBlock);
	}
	private static void registerBlock(Block block) {
		//-//Register Items
		//Blocks
		///*
		GameRegistry.register(ObsidianBlock);
		//*/
		
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	public static void registerRenders() {
		//-//Register Render Items
		//Blocks
		registerRender(ObsidianBlock);
	}
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
