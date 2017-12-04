package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		//-//Add Recipe
		//Shaped
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SlimeApple), "SSS", "SAS", "SSS", 'S',Items.SLIME_BALL,'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.GunpowderApple), "GGG", "GAG", "GGG", 'G',Items.GUNPOWDER,'A',Items.APPLE );
		//Shapeless
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
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 0.1f);
	}
}
