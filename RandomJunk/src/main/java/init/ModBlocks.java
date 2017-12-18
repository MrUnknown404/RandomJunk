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
import blocks.compressed.Block_CompressedDirt1;
import blocks.compressed.Block_CompressedDirt10;
import blocks.compressed.Block_CompressedDirt11;
import blocks.compressed.Block_CompressedDirt12;
import blocks.compressed.Block_CompressedDirt2;
import blocks.compressed.Block_CompressedDirt3;
import blocks.compressed.Block_CompressedDirt4;
import blocks.compressed.Block_CompressedDirt5;
import blocks.compressed.Block_CompressedDirt6;
import blocks.compressed.Block_CompressedDirt7;
import blocks.compressed.Block_CompressedDirt8;
import blocks.compressed.Block_CompressedDirt9;
import blocks.compressed.Block_CompressedSand1;
import blocks.compressed.Block_CompressedSand10;
import blocks.compressed.Block_CompressedSand11;
import blocks.compressed.Block_CompressedSand12;
import blocks.compressed.Block_CompressedSand2;
import blocks.compressed.Block_CompressedSand3;
import blocks.compressed.Block_CompressedSand4;
import blocks.compressed.Block_CompressedSand5;
import blocks.compressed.Block_CompressedSand6;
import blocks.compressed.Block_CompressedSand7;
import blocks.compressed.Block_CompressedSand8;
import blocks.compressed.Block_CompressedSand9;
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
	
	public static Block CompressedDirt1;
	public static Block CompressedDirt2;
	public static Block CompressedDirt3;
	public static Block CompressedDirt4;
	public static Block CompressedDirt5;
	public static Block CompressedDirt6;
	public static Block CompressedDirt7;
	public static Block CompressedDirt8;
	public static Block CompressedDirt9;
	public static Block CompressedDirt10;
	public static Block CompressedDirt11;
	public static Block CompressedDirt12;
	
	public static Block CompressedSand1;
	public static Block CompressedSand2;
	public static Block CompressedSand3;
	public static Block CompressedSand4;
	public static Block CompressedSand5;
	public static Block CompressedSand6;
	public static Block CompressedSand7;
	public static Block CompressedSand8;
	public static Block CompressedSand9;
	public static Block CompressedSand10;
	public static Block CompressedSand11;
	public static Block CompressedSand12;
	
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
		
		CompressedDirt1 = new Block_CompressedDirt1();
		CompressedDirt2 = new Block_CompressedDirt2();
		CompressedDirt3 = new Block_CompressedDirt3();
		CompressedDirt4 = new Block_CompressedDirt4();
		CompressedDirt5 = new Block_CompressedDirt5();
		CompressedDirt6 = new Block_CompressedDirt6();
		CompressedDirt7 = new Block_CompressedDirt7();
		CompressedDirt8 = new Block_CompressedDirt8();
		CompressedDirt9 = new Block_CompressedDirt9();
		CompressedDirt10 = new Block_CompressedDirt10();
		CompressedDirt11 = new Block_CompressedDirt11();
		CompressedDirt12 = new Block_CompressedDirt12();
		
		CompressedSand1 = new Block_CompressedSand1();
		CompressedSand2 = new Block_CompressedSand2();
		CompressedSand3 = new Block_CompressedSand3();
		CompressedSand4 = new Block_CompressedSand4();
		CompressedSand5 = new Block_CompressedSand5();
		CompressedSand6 = new Block_CompressedSand6();
		CompressedSand7 = new Block_CompressedSand7();
		CompressedSand8 = new Block_CompressedSand8();
		CompressedSand9 = new Block_CompressedSand9();
		CompressedSand10 = new Block_CompressedSand10();
		CompressedSand11 = new Block_CompressedSand11();
		CompressedSand12 = new Block_CompressedSand12();
		
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
		
		RegisterBlock(CompressedDirt1);
		RegisterBlock(CompressedDirt2);
		RegisterBlock(CompressedDirt3);
		RegisterBlock(CompressedDirt4);
		RegisterBlock(CompressedDirt5);
		RegisterBlock(CompressedDirt6);
		RegisterBlock(CompressedDirt7);
		RegisterBlock(CompressedDirt8);
		RegisterBlock(CompressedDirt9);
		RegisterBlock(CompressedDirt10);
		RegisterBlock(CompressedDirt11);
		RegisterBlock(CompressedDirt12);
		
		RegisterBlock(CompressedSand1);
		RegisterBlock(CompressedSand2);
		RegisterBlock(CompressedSand3);
		RegisterBlock(CompressedSand4);
		RegisterBlock(CompressedSand5);
		RegisterBlock(CompressedSand6);
		RegisterBlock(CompressedSand7);
		RegisterBlock(CompressedSand8);
		RegisterBlock(CompressedSand9);
		RegisterBlock(CompressedSand10);
		RegisterBlock(CompressedSand11);
		RegisterBlock(CompressedSand12);
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
		
		RegisterRender(CompressedDirt1);
		RegisterRender(CompressedDirt2);
		RegisterRender(CompressedDirt3);
		RegisterRender(CompressedDirt4);
		RegisterRender(CompressedDirt5);
		RegisterRender(CompressedDirt6);
		RegisterRender(CompressedDirt7);
		RegisterRender(CompressedDirt8);
		RegisterRender(CompressedDirt9);
		RegisterRender(CompressedDirt10);
		RegisterRender(CompressedDirt11);
		RegisterRender(CompressedDirt12);
		
		RegisterRender(CompressedSand1);
		RegisterRender(CompressedSand2);
		RegisterRender(CompressedSand3);
		RegisterRender(CompressedSand4);
		RegisterRender(CompressedSand5);
		RegisterRender(CompressedSand6);
		RegisterRender(CompressedSand7);
		RegisterRender(CompressedSand8);
		RegisterRender(CompressedSand9);
		RegisterRender(CompressedSand10);
		RegisterRender(CompressedSand11);
		RegisterRender(CompressedSand12);
	}
	private static void RegisterRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
