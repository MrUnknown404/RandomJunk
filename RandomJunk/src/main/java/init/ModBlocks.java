package init;

import blocks.Block_BoneBlock;
import blocks.Block_EmptyJar;
import blocks.Block_FlintBlock;
import blocks.Block_GroundLantern;
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
	public static Block FlintBlock;
	
	public static Block EmptyJar;
	public static Block GroundLantern;

	public static void init() {
		//Blocks
		ObsidianBlock = new Block_ObsidianBlock();
		BoneBlock = new Block_BoneBlock();
		FlintBlock = new Block_FlintBlock();
		
		EmptyJar = new Block_EmptyJar();
		GroundLantern = new Block_GroundLantern();
	}
	public static void register() {
		//Register Blocks
		registerBlock(ObsidianBlock);
		registerBlock(BoneBlock);
		registerBlock(FlintBlock);
		
		registerBlock(EmptyJar);
		registerBlock(GroundLantern);
	}
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	public static void registerRenders() {
		//-//Register Render Items
		//Blocks
		registerRender(ObsidianBlock);
		registerRender(BoneBlock);
		registerRender(FlintBlock);
		
		registerRender(EmptyJar);
		registerRender(GroundLantern);
	}
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
