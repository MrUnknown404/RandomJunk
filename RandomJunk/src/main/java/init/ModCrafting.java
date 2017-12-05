package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		//-//--//Add Recipe
		//-//Shaped
		//Items
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.AppleApple), 		"XXX", "XAX", "XXX", 'X',Items.APPLE,					'A',Items.APPLE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.BlazeApple), 		"XXX", "XAX", "XXX", 'X',Items.BLAZE_POWDER,			'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ClayApple), 			"XXX", "XAX", "XXX", 'X',Items.CLAY_BALL,				'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.CoalApple),		 	"XXX", "XAX", "XXX", 'X',Items.COAL,					'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.DiamondApple),  	 	"XXX", "XAX", "XXX", 'X',Items.DIAMOND,				'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.EmeraldApple),	 	"XXX", "XAX", "XXX", 'X',Items.EMERALD,				'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.EnderPearlApple), 	"XXX", "XAX", "XXX", 'X',Items.ENDER_PEARL,			'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.FlintApple), 			"XXX", "XAX", "XXX", 'X',Items.FLINT,					'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.GlowstoneApple), 	"XXX", "XAX", "XXX", 'X',Items.GLOWSTONE_DUST,		'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.GunpowderApple),	"XXX", "XAX", "XXX", 'X',Items.GUNPOWDER,			'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.InkApple), 			"XXX", "XAX", "XXX", 'X',new ItemStack(Items.DYE, 1, 0),	'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.IronApple),			"XXX", "XAX", "XXX", 'X',Items.IRON_INGOT,			'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.LapisApple),			"XXX", "XAX", "XXX", 'X',new ItemStack(Items.DYE, 1, 4),	'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.LeatherApple), 		"XXX", "XAX", "XXX", 'X',Items.LEATHER,				'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.MagmaCreamApple), 	"XXX", "XAX", "XXX", 'X',Items.MAGMA_CREAM,		'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ObsidianApple), 		"XXX", "XAX", "XXX", 'X',ModItems.ObsidianIngot,		'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.PaperApple), 		"XXX", "XAX", "XXX", 'X',Items.PAPER,					'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.PrismarineApple),		"XXX", "XAX", "XXX", 'X',Items.PRISMARINE_SHARD,		'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.QuartzApple),		"XXX", "XAX", "XXX", 'X',Items.QUARTZ,				'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.RedstoneApple),		"XXX", "XAX", "XXX", 'X',Items.REDSTONE,				'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.RottenFleshApple), 	"XXX", "XAX", "XXX", 'X',Items.ROTTEN_FLESH,			'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SlimeApple), 		"XXX", "XAX", "XXX", 'X',Items.SLIME_BALL,			'A',Items.APPLE );
		
		//Blocks
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ObsidianBlock), 		"XXX", "XXX", "XXX", 'X',ModItems.ObsidianIngot);
		
		//-//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ObsidianIngot, 9, 0), new ItemStack(ModBlocks.ObsidianBlock, 1, 0)); //Block Into Ingot
		
		//Blocks
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 0), new ItemStack(Blocks.WOODEN_SLAB, 1, 0), new ItemStack(Blocks.WOODEN_SLAB, 1, 0)); //Oak
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 1), new ItemStack(Blocks.WOODEN_SLAB, 1, 1), new ItemStack(Blocks.WOODEN_SLAB, 1, 1)); //Spruce
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 2), new ItemStack(Blocks.WOODEN_SLAB, 1, 2), new ItemStack(Blocks.WOODEN_SLAB, 1, 2)); //Birch
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 3), new ItemStack(Blocks.WOODEN_SLAB, 1, 3), new ItemStack(Blocks.WOODEN_SLAB, 1, 3)); //Jungle
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 4), new ItemStack(Blocks.WOODEN_SLAB, 1, 4), new ItemStack(Blocks.WOODEN_SLAB, 1, 4)); //Acacia
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 1, 5), new ItemStack(Blocks.WOODEN_SLAB, 1, 5), new ItemStack(Blocks.WOODEN_SLAB, 1, 5)); //Dark Oak
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE), new ItemStack(Blocks.STONE_SLAB, 1, 0), new ItemStack(Blocks.STONE_SLAB, 1, 0)); //Stone Slab
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.STONE_SLAB, 1, 3), new ItemStack(Blocks.STONE_SLAB, 1, 3)); //Cobblestone Slab
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BRICK_BLOCK), new ItemStack(Blocks.STONE_SLAB, 1, 4), new ItemStack(Blocks.STONE_SLAB, 1, 4)); //Brick Slab
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK), new ItemStack(Blocks.STONE_SLAB, 1, 6), new ItemStack(Blocks.STONE_SLAB, 1, 6)); //Netherbrick Slab
		
		//-//Smelting
		//Misc
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 0.1f);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.ObsidianIngot), 0.3f);
	}
}
