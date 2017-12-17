package init;

import java.util.Iterator;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	//Remove Recipes
	public static void UnregisterRecipes() {
		//Magma Cream
		Iterator recipes = CraftingManager.getInstance().getRecipeList().iterator();
		while (recipes.hasNext()) {
		ItemStack output = ((IRecipe) recipes.next()).getRecipeOutput();
			if (output != null && output.getItem() != null) {
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Items.MAGMA_CREAM))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 0))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 1))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 2))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 3))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 4))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 5))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 6))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 7))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 8))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 9))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 10))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 11))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 12))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 13))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 14))) {
					recipes.remove();
				}
				if (ItemStack.areItemStacksEqual(output, new ItemStack(Blocks.WOOL, 1, 15))) {
					recipes.remove();
				}
			}
		}
	}
	
	public static void Register() {
		//-//-//Shaped
		//-//Items
		GameRegistry.addRecipe(new ItemStack(ModItems.AppleApple, 1),"XXX","XAX","XXX",'X',Items.APPLE,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.BlazeApple, 1),"XXX","XAX","XXX",'X',Items.BLAZE_POWDER,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.ClayApple, 1),"XXX","XAX","XXX",'X',Items.CLAY_BALL,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.CoalApple, 1),"XXX","XAX","XXX",'X',Items.COAL,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.DiamondApple, 1),"XXX","XAX","XXX",'X',Items.DIAMOND,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldApple, 1),"XXX","XAX","XXX",'X',Items.EMERALD,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.EnderPearlApple, 1),"XXX","XAX","XXX",'X',Items.ENDER_PEARL,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.FlintApple, 1),"XXX","XAX","XXX",'X',Items.FLINT,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.GlowstoneApple, 1),"XXX","XAX","XXX",'X',Items.GLOWSTONE_DUST,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.GunpowderApple, 1),"XXX","XAX","XXX",'X',Items.GUNPOWDER,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.InkApple, 1),"XXX","XAX","XXX",'X',new ItemStack(Items.DYE, 1, 0), 'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.IronApple, 1),"XXX","XAX","XXX",'X',Items.IRON_INGOT,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.LapisApple, 1),"XXX","XAX","XXX",'X',new ItemStack(Items.DYE, 1, 4), 'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.LeatherApple, 1),"XXX","XAX","XXX",'X',Items.LEATHER,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.MagmaCreamApple, 1),"XXX","XAX","XXX",'X',Items.MAGMA_CREAM,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianApple, 1),"XXX","XAX","XXX",'X',ModItems.ObsidianShard,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.PaperApple, 1),"XXX","XAX","XXX",'X',Items.PAPER,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.PrismarineApple, 1),"XXX","XAX", "XXX",'X',Items.PRISMARINE_SHARD,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.QuartzApple, 1),"XXX","XAX","XXX",'X',Items.QUARTZ,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.RedstoneApple, 1),"XXX","XAX","XXX",'X',Items.REDSTONE,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.RottenFleshApple, 1),"XXX","XAX","XXX",'X',Items.ROTTEN_FLESH,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.SlimeApple, 1),"XXX","XAX","XXX",'X',Items.SLIME_BALL,'A',Items.APPLE);

		//Obsidian Recipes
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianShovel, 1),"O","S","S",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianPickaxe, 1),"OOO","-S-","-S-",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianAxe, 1),"OO-","OS-","-S-",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianHoe, 1),"OO-","-S-","-S-",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianSword, 1),"O","O","S",'O',ModItems.ObsidianIngot,'S',Items.STICK);

		//Bone Recipes
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneShovel, 1),"O","S","S",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BonePickaxe, 1),"OOO","-S-","-S-",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneAxe, 1),"OO-","OS-","-S-",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneHoe, 1),"OO-","-S-","-S-",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneSword, 1),"O","O","S",'O',ModItems.BoneIngot,'S',Items.STICK);

		//Flint Recipes
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintShovel, 1),"O","S","S",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintPickaxe, 1),"OOO","-S-","-S-",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintAxe, 1),"OO-","OS-","-S-",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintHoe, 1),"OO-","-S-","-S-",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintSword, 1),"O","O","S",'O',ModItems.FlintIngot,'S',Items.STICK);

		//-//Armor
		//Obsidian Recipes
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianHelmet, 1),"OOO","O-O",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianChestplate, 1),"O-O","OOO","OOO",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianLeggings, 1),"OOO","O-O","O-O",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianBoots, 1),"O-O","O-O",'O',ModItems.ObsidianIngot);

		//Bone Recipes
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneHelmet, 1),"BBB","B-B",'B',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneChestplate, 1),"B-B","BBB","BBB",'B',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneLeggings, 1),"BBB","B-B","B-B",'B',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneBoots, 1),"B-B","B-B",'B',ModItems.BoneIngot);

		//Flint Recipes
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintHelmet, 1),"FFF","F-F",'F',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintChestplate, 1),"F-F","F","F",'F',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintLeggings, 1),"FFF","F-F","F-F",'F',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintBoots, 1),"F-F","F-F",'F',ModItems.FlintIngot);

		//-//Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ObsidianBlock,1),"OOO","OOO","OOO",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BoneBlock,1),"BBB","BBB","BBB",'B',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.FlintBlock,1),"FFF","FFF","FFF",'F',ModItems.FlintIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.EmptyJar, 1),"W","G",'W',Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE,'G',Blocks.GLASS);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.GroundLantern, 1),"T","I",'T',Blocks.TORCH,'I',Items.IRON_INGOT);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.GlowstoneTorch, 4),"G","S",'G',Items.GLOWSTONE_DUST,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.LapisTorch, 4),"G","S",'G',new ItemStack(Items.DYE, 1, 4),'S',Items.STICK);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 1),"OO","OO",'O',ModItems.ObsidianShard);

		GameRegistry.addRecipe(new ItemStack(Blocks.WOOL, 1),"SS","SS",'S',Items.STRING);
		
		//Slab Recipes
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 0),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 0)); //Oak
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 1),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 1)); //Spruce
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 2),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 2)); //Birch
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 3),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 3)); //Jungle
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 4),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 4)); //Acacia
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 5),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 5)); //Dark Oak
		
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 1),"S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 0)); //Stone Slab
		GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE, 1),"S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 3)); //Cobblestone Slab
		GameRegistry.addRecipe(new ItemStack(Blocks.BRICK_BLOCK, 1),"S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 3)); //Brick Slab
		GameRegistry.addRecipe(new ItemStack(Blocks.NETHER_BRICK, 1),"S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 3)); //Netherbrick Slab
		
		//-//-//Shapeless
		//-//Items
		//Misc
		GameRegistry.addShapelessRecipe(new ItemStack(Items.MAGMA_CREAM, 2), new ItemStack(Items.SLIME_BALL, 1), new ItemStack(Items.BLAZE_POWDER, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BoneMix, 1), new ItemStack(Items.BONE, 1), new ItemStack(Items.BONE, 1), new ItemStack(Items.BONE, 1)); //Block Into Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ObsidianShard, 4), new ItemStack(Blocks.OBSIDIAN, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 1), new ItemStack(Blocks.GRAVEL, 1)); //Gravel Into Flint

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ObsidianIngot, 9), new ItemStack(ModBlocks.ObsidianBlock, 1)); //Block Into Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BoneIngot, 9), new ItemStack(ModBlocks.BoneBlock, 1)); //Block Into Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.FlintIngot, 9), new ItemStack(ModBlocks.FlintBlock, 1)); //Block Into Ingot
		
		//-//Blocks
		//Misc
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.HangingLantern, 1),new ItemStack(ModBlocks.GroundLantern, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GroundLantern, 1),new ItemStack(ModBlocks.HangingLantern, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 1),new ItemStack(Blocks.SAND, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 1, 1),new ItemStack(Blocks.SAND, 1));
		
		//Wools
		//White
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, 15));

		//Orange
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Magenta
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Light Blue
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Yellow
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Lime
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Pink
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(Items.DYE, 1, 9),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Gray
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(Items.DYE, 1, 8),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Light Gray
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(Items.DYE, 1, 7),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Cyan
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(Items.DYE, 1, 6),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Purple
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Blue
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Brown
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Green
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Red
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1),new ItemStack(Blocks.WOOL, 1, 15));
		
		//Black
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 0 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 1 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 2 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 3 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 4 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 5 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 6 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 7 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 8 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 9 ));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0),new ItemStack(Blocks.WOOL, 1, 14));
		
		//-//-//Smelting
		//Misc
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 0.1f);

		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.ObsidianShard), 0.4f);
		GameRegistry.addSmelting(ModItems.BoneMix, new ItemStack(ModItems.BoneIngot), 0.3f);
		GameRegistry.addSmelting(Items.FLINT, new ItemStack(ModItems.FlintIngot), 0.3f);
	}
}
