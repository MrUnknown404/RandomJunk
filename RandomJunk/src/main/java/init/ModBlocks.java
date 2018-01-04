package init;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.EnumHandler;

import blocks.Block_BigWoodCrate;
import blocks.Block_BoneBlock;
import blocks.Block_CompressedCobblestone;
import blocks.Block_CompressedDirt;
import blocks.Block_CompressedSand;
import blocks.Block_CopperBlock;
import blocks.Block_CopperOre;
import blocks.Block_EmptyJar;
import blocks.Block_FlintBlock;
import blocks.Block_GlowstoneTorch;
import blocks.Block_GroundLantern;
import blocks.Block_HangingLantern;
import blocks.Block_LapisTorch;
import blocks.Block_ObsidianBlock;
import blocks.Block_QuickFurnace;
import blocks.Block_SandyDirt;
import blocks.Block_SteelBlock;
import blocks.Block_TinBlock;
import blocks.Block_TinOre;
import blocks.Block_WoodCrate;
import blocks.fences.Block_CobblestoneFence;
import blocks.fences.Block_CobblestoneFenceGate;
import blocks.fences.Block_MossyCobblestoneFence;
import blocks.fences.Block_MossyCobblestoneFenceGate;
import blocks.fences.Block_NetherBrickFenceGate;
import blocks.item.Item_Metadata;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks {

	//Blocks
	public static Block SandyDirt;

	public static Block ObsidianBlock;
	public static Block SteelBlock;
	public static Block BoneBlock;
	public static Block FlintBlock;
	public static Block CopperBlock;
	public static Block TinBlock;

	public static Block CopperOre;
	public static Block TinOre;

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

	public static Block NetherBrickFenceGate;

	public static Block QuickFurnace;
	public static Block LitQuickFurnace;
	
	public static Block WoodCrate;
	public static Block BigWoodCrate;

	public static void Init() {
		//Blocks
		SandyDirt =                 new Block_SandyDirt();

		ObsidianBlock =             new Block_ObsidianBlock();
		SteelBlock =                new Block_SteelBlock();
		BoneBlock =                 new Block_BoneBlock();
		FlintBlock =                new Block_FlintBlock();
		CopperBlock =               new Block_CopperBlock();
		TinBlock =                  new Block_TinBlock();
		
		CopperOre =                 new Block_CopperOre();
		TinOre =                    new Block_TinOre();
		
		EmptyJar =                  new Block_EmptyJar();
		GroundLantern =             new Block_GroundLantern();
		HangingLantern =            new Block_HangingLantern();
		
		GlowstoneTorch =            new Block_GlowstoneTorch();
		LapisTorch =                new Block_LapisTorch();
		
		CompressedCobblestone =     new Block_CompressedCobblestone();
		CompressedDirt =            new Block_CompressedDirt();
		CompressedSand =            new Block_CompressedSand();
		
		CobblestoneFence =          new Block_CobblestoneFence();
		CobblestoneFenceGate =      new Block_CobblestoneFenceGate();

		MossyCobblestoneFence =     new Block_MossyCobblestoneFence();
		MossyCobblestoneFenceGate = new Block_MossyCobblestoneFenceGate();
		
		NetherBrickFenceGate =      new Block_NetherBrickFenceGate();
		
		QuickFurnace =              new Block_QuickFurnace(false);
		LitQuickFurnace =           new Block_QuickFurnace(true);
		
		WoodCrate =                 new Block_WoodCrate();
		BigWoodCrate =              new Block_BigWoodCrate();
	}
	
	public static void Register() {
		//Register Blocks
		RegisterBlock(SandyDirt);
		
		RegisterBlock(ObsidianBlock);
		RegisterBlock(SteelBlock);
		RegisterBlock(BoneBlock);
		RegisterBlock(FlintBlock);
		RegisterBlock(CopperBlock);
		RegisterBlock(TinBlock);
		
		RegisterBlock(CopperOre);
		RegisterBlock(TinOre);
		
		RegisterBlock(QuickFurnace);
		RegisterBlock(LitQuickFurnace);
		
		RegisterBlock(WoodCrate,             new Item_Metadata(WoodCrate));
		RegisterBlock(BigWoodCrate,          new Item_Metadata(BigWoodCrate));
		
		RegisterBlock(EmptyJar);
		RegisterBlock(GroundLantern);
		RegisterBlock(HangingLantern);
		
		RegisterBlock(GlowstoneTorch);
		RegisterBlock(LapisTorch);
		
		RegisterBlock(CobblestoneFence);
		RegisterBlock(CobblestoneFenceGate);
		
		RegisterBlock(MossyCobblestoneFence);
		RegisterBlock(MossyCobblestoneFenceGate);
		
		RegisterBlock(NetherBrickFenceGate);
		
		RegisterBlock(CompressedCobblestone, new Item_Metadata(CompressedCobblestone));
		RegisterBlock(CompressedDirt,        new Item_Metadata(CompressedDirt));
		RegisterBlock(CompressedSand,        new Item_Metadata(CompressedSand));
		
	}
	private static void RegisterBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		
		ItemBlock item = new ItemBlock(block);
		ForgeRegistries.ITEMS.register(item.setRegistryName(block.getRegistryName()));
	}
	
	private static void RegisterBlock(Block block, ItemBlock itemBlock) {
		block.setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
		
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(itemBlock.setRegistryName(block.getRegistryName()));
	}
	
	public static void RegisterRenders() {
		//-//Register Render Items
		//Blocks
		RegisterRender(SandyDirt);
		
		RegisterRender(ObsidianBlock);
		RegisterRender(SteelBlock);
		RegisterRender(BoneBlock);
		RegisterRender(FlintBlock);
		RegisterRender(CopperBlock);
		RegisterRender(TinBlock);
		
		RegisterRender(CopperOre);
		RegisterRender(TinOre);
		
		RegisterRender(EmptyJar);
		RegisterRender(GroundLantern);
		RegisterRender(HangingLantern);
		
		RegisterRender(GlowstoneTorch);
		RegisterRender(LapisTorch);
		
		RegisterRender(CobblestoneFence);
		RegisterRender(CobblestoneFenceGate);
		
		RegisterRender(MossyCobblestoneFence);
		RegisterRender(MossyCobblestoneFenceGate);
		
		RegisterRender(NetherBrickFenceGate);
		
		RegisterRender(QuickFurnace);
		RegisterRender(LitQuickFurnace);
		
		for (int i = 0; i < EnumHandler.CompBlockTypes.values().length; i++) {
			RegisterRender(CompressedCobblestone, i, "cobblestone_" + EnumHandler.CompBlockTypes.values()[i].getName());
			RegisterRender(CompressedDirt, i, "dirt_" + EnumHandler.CompBlockTypes.values()[i].getName());
			RegisterRender(CompressedSand, i, "sand_" + EnumHandler.CompBlockTypes.values()[i].getName());
		}
		for (int i = 0; i < EnumHandler.CrateWoodTypes.values().length; i++) {
			RegisterRender(WoodCrate, i, "crate_" + EnumHandler.CrateWoodTypes.values()[i].getName());
			RegisterRender(BigWoodCrate, i, "bigcrate_" + EnumHandler.CrateWoodTypes.values()[i].getName());
		}
	}
	
	private static void RegisterRender(Block block, int meta, String fileName) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher() .register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, fileName), "inventory"));
	}
	
	private static void RegisterRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
