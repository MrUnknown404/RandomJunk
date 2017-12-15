package init;

import blocks.Block_BoneBlock;
import blocks.Block_EmptyJar;
import blocks.Block_FlintBlock;
import blocks.Block_GlowstoneTorch;
import blocks.Block_GroundLantern;
import blocks.Block_ObsidianBlock;
import blocks.Block_HangingLantern;
import blocks.Block_LapisTorch;
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
	public static Block HangingLantern;
	
	public static Block GlowstoneTorch;
	public static Block LapisTorch;
	
	public static void init() {
		//Blocks
		ObsidianBlock = new Block_ObsidianBlock();
		BoneBlock = new Block_BoneBlock();
		FlintBlock = new Block_FlintBlock();
		
		EmptyJar = new Block_EmptyJar();
		GroundLantern = new Block_GroundLantern();
		HangingLantern = new Block_HangingLantern();
		
		GlowstoneTorch = new Block_GlowstoneTorch();
		LapisTorch = new Block_LapisTorch();
	}
	public static void register() {
		//Register Blocks
		registerBlock(ObsidianBlock);
		registerBlock(BoneBlock);
		registerBlock(FlintBlock);
		
		registerBlock(EmptyJar);
		registerBlock(GroundLantern);
		registerBlock(HangingLantern);
		
		registerBlock(GlowstoneTorch);
		registerBlock(LapisTorch);
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
		registerRender(HangingLantern);
		
		registerRender(GlowstoneTorch);
		registerRender(LapisTorch);
	}
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
