package init;

import blocks.Block_BoneBlock;
import blocks.Block_EmptyJar;
import blocks.Block_FlintBlock;
import blocks.Block_GlowstoneTorch;
import blocks.Block_GroundLantern;
import blocks.Block_HangingLantern;
import blocks.Block_LapisTorch;
import blocks.Block_ObsidianBlock;
import blocks.compressed.Block_CompressedCobblestone1;
import blocks.compressed.Block_CompressedCobblestone10;
import blocks.compressed.Block_CompressedCobblestone11;
import blocks.compressed.Block_CompressedCobblestone12;
import blocks.compressed.Block_CompressedCobblestone2;
import blocks.compressed.Block_CompressedCobblestone3;
import blocks.compressed.Block_CompressedCobblestone4;
import blocks.compressed.Block_CompressedCobblestone5;
import blocks.compressed.Block_CompressedCobblestone6;
import blocks.compressed.Block_CompressedCobblestone7;
import blocks.compressed.Block_CompressedCobblestone8;
import blocks.compressed.Block_CompressedCobblestone9;
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
	
	public static Block CompressedCobblestone1;
	public static Block CompressedCobblestone2;
	public static Block CompressedCobblestone3;
	public static Block CompressedCobblestone4;
	public static Block CompressedCobblestone5;
	public static Block CompressedCobblestone6;
	public static Block CompressedCobblestone7;
	public static Block CompressedCobblestone8;
	public static Block CompressedCobblestone9;
	public static Block CompressedCobblestone10;
	public static Block CompressedCobblestone11;
	public static Block CompressedCobblestone12;
	
	public static void Init() {
		//Blocks
		ObsidianBlock = new Block_ObsidianBlock();
		BoneBlock = new Block_BoneBlock();
		FlintBlock = new Block_FlintBlock();
		
		EmptyJar = new Block_EmptyJar();
		GroundLantern = new Block_GroundLantern();
		HangingLantern = new Block_HangingLantern();
		
		GlowstoneTorch = new Block_GlowstoneTorch();
		LapisTorch = new Block_LapisTorch();
		
		CompressedCobblestone1 = new Block_CompressedCobblestone1();
		CompressedCobblestone2 = new Block_CompressedCobblestone2();
		CompressedCobblestone3 = new Block_CompressedCobblestone3();
		CompressedCobblestone4 = new Block_CompressedCobblestone4();
		CompressedCobblestone5 = new Block_CompressedCobblestone5();
		CompressedCobblestone6 = new Block_CompressedCobblestone6();
		CompressedCobblestone7 = new Block_CompressedCobblestone7();
		CompressedCobblestone8 = new Block_CompressedCobblestone8();
		CompressedCobblestone9 = new Block_CompressedCobblestone9();
		CompressedCobblestone10 = new Block_CompressedCobblestone10();
		CompressedCobblestone11 = new Block_CompressedCobblestone11();
		CompressedCobblestone12 = new Block_CompressedCobblestone12();
	}
	public static void Register() {
		//Register Blocks
		RegisterBlock(ObsidianBlock);
		RegisterBlock(BoneBlock);
		RegisterBlock(FlintBlock);
		
		RegisterBlock(EmptyJar);
		RegisterBlock(GroundLantern);
		RegisterBlock(HangingLantern);
		
		RegisterBlock(GlowstoneTorch);
		RegisterBlock(LapisTorch);
		
		RegisterBlock(CompressedCobblestone1);
		RegisterBlock(CompressedCobblestone2);
		RegisterBlock(CompressedCobblestone3);
		RegisterBlock(CompressedCobblestone4);
		RegisterBlock(CompressedCobblestone5);
		RegisterBlock(CompressedCobblestone6);
		RegisterBlock(CompressedCobblestone7);
		RegisterBlock(CompressedCobblestone8);
		RegisterBlock(CompressedCobblestone9);
		RegisterBlock(CompressedCobblestone10);
		RegisterBlock(CompressedCobblestone11);
		RegisterBlock(CompressedCobblestone12);
	}
	private static void RegisterBlock(Block block) {
		GameRegistry.register(block);
		
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	public static void RegisterRenders() {
		//-//Register Render Items
		//Blocks
		RegisterRender(ObsidianBlock);
		RegisterRender(BoneBlock);
		RegisterRender(FlintBlock);
		
		RegisterRender(EmptyJar);
		RegisterRender(GroundLantern);
		RegisterRender(HangingLantern);
		
		RegisterRender(GlowstoneTorch);
		RegisterRender(LapisTorch);
		
		RegisterRender(CompressedCobblestone1);
		RegisterRender(CompressedCobblestone2);
		RegisterRender(CompressedCobblestone3);
		RegisterRender(CompressedCobblestone4);
		RegisterRender(CompressedCobblestone5);
		RegisterRender(CompressedCobblestone6);
		RegisterRender(CompressedCobblestone7);
		RegisterRender(CompressedCobblestone8);
		RegisterRender(CompressedCobblestone9);
		RegisterRender(CompressedCobblestone10);
		RegisterRender(CompressedCobblestone11);
		RegisterRender(CompressedCobblestone12);
	}
	private static void RegisterRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
