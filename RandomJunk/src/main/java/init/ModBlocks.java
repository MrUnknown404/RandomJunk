package init;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.EnumHandler;

import blocks.Block_BoneBlock;
import blocks.Block_CompressedCobblestone;
import blocks.Block_CompressedDirt;
import blocks.Block_CompressedSand;
import blocks.Block_EmptyJar;
import blocks.Block_FlintBlock;
import blocks.Block_GlowstoneTorch;
import blocks.Block_GroundLantern;
import blocks.Block_HangingLantern;
import blocks.Block_LapisTorch;
import blocks.Block_ObsidianBlock;
import blocks.fences.Block_CobblestoneFence;
import blocks.fences.Block_CobblestoneFenceGate;
import blocks.fences.Block_MossyCobblestoneFence;
import blocks.fences.Block_MossyCobblestoneFenceGate;
import blocks.item.Item_Compressed;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
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
	
	public static Block CompressedCobblestone;
	public static Block CompressedDirt;
	public static Block CompressedSand;
	
	public static Block CobblestoneFence;
	public static Block CobblestoneFenceGate;
	
	public static Block MossyCobblestoneFence;
	public static Block MossyCobblestoneFenceGate;
	
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
		
		CompressedCobblestone = new Block_CompressedCobblestone();
		CompressedDirt = new Block_CompressedDirt();
		CompressedSand = new Block_CompressedSand();
		
		CobblestoneFence = new Block_CobblestoneFence();
		CobblestoneFenceGate = new Block_CobblestoneFenceGate();
		
		MossyCobblestoneFence = new Block_MossyCobblestoneFence();
		MossyCobblestoneFenceGate = new Block_MossyCobblestoneFenceGate();
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
		
		RegisterBlock(CompressedCobblestone, new Item_Compressed(CompressedCobblestone));
		RegisterBlock(CompressedDirt, new Item_Compressed(CompressedDirt));
		RegisterBlock(CompressedSand, new Item_Compressed(CompressedSand));
		
		RegisterBlock(CobblestoneFence);
		RegisterBlock(CobblestoneFenceGate);
		
		RegisterBlock(MossyCobblestoneFence);
		RegisterBlock(MossyCobblestoneFenceGate);
		
	}
	private static void RegisterBlock(Block block) {
		GameRegistry.register(block);
		
		ItemBlock item = new ItemBlock(block);
		GameRegistry.register(item.setRegistryName(block.getRegistryName()));
	}
	
	private static void RegisterBlock(Block block, ItemBlock itemBlock) {
		block.setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
		
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
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
		
		RegisterRender(CobblestoneFence);
		RegisterRender(CobblestoneFenceGate);
		
		RegisterRender(MossyCobblestoneFence);
		RegisterRender(MossyCobblestoneFenceGate);
		
		for (int i = 0; i < EnumHandler.CompBlockTypes.values().length; i++) {
			RegisterRender(CompressedCobblestone, i, "cobblestone_" + EnumHandler.CompBlockTypes.values()[i].getName());
			RegisterRender(CompressedDirt, i, "dirt_" + EnumHandler.CompBlockTypes.values()[i].getName());
			RegisterRender(CompressedSand, i, "sand_" + EnumHandler.CompBlockTypes.values()[i].getName());
		}
	}
	
	private static void RegisterRender(Block block, int meta, String fileName) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, fileName), "inventory"));
	}
	
	private static void RegisterRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
