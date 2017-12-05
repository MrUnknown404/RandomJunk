package init;

import blocks.Block_BoneBlock;
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
	public static Block BoneBlock;
	
	public static void init() {
		//Blocks
		ObsidianBlock = new 	Block_ObsidianBlock();
		BoneBlock = new 		Block_BoneBlock();
	}
	public static void register() {
		//Register Blocks
		registerBlock(ObsidianBlock);
		registerBlock(BoneBlock);
		
		//-//Register Items
		//Blocks
		///*
		GameRegistry.register(ObsidianBlock);
		GameRegistry.register(BoneBlock);
		//*/
	}
	private static void registerBlock(Block block) {
		
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	public static void registerRenders() {
		//-//Register Render Items
		//Blocks
		registerRender(ObsidianBlock);
		registerRender(BoneBlock);
	}
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
