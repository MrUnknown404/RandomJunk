package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		//-//-//Shaped
		//-//Items
		GameRegistry.addRecipe(new ItemStack(ModItems.AppleApple),"XXX","XAX","XXX",'X',Items.APPLE,'A',Items.APPLE);
		GameRegistry.addRecipe(new ItemStack(ModItems.BlazeApple),"XXX","XAX","XXX",'X',Items.BLAZE_POWDER,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.ClayApple),"XXX","XAX","XXX",'X',Items.CLAY_BALL,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.CoalApple),"XXX","XAX","XXX",'X',Items.COAL,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.DiamondApple),"XXX","XAX","XXX",'X',Items.DIAMOND,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.EmeraldApple),"XXX","XAX","XXX",'X',Items.EMERALD,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.EnderPearlApple),"XXX","XAX","XXX",'X',Items.ENDER_PEARL,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.FlintApple),"XXX","XAX","XXX",'X',Items.FLINT,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.GlowstoneApple),"XXX","XAX","XXX",'X',Items.GLOWSTONE_DUST,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.GunpowderApple),"XXX","XAX","XXX",'X',Items.GUNPOWDER,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.InkApple),"XXX","XAX","XXX",'X',new ItemStack(Items.DYE, 1, 0), 'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.IronApple),"XXX","XAX","XXX",'X',Items.IRON_INGOT,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.LapisApple),"XXX","XAX","XXX",'X',new ItemStack(Items.DYE, 1, 4), 'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.LeatherApple),"XXX","XAX","XXX",'X',Items.LEATHER,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.MagmaCreamApple),"XXX","XAX","XXX",'X',Items.MAGMA_CREAM,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.ObsidianApple),"XXX","XAX","XXX",'X',ModItems.ObsidianIngot,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.PaperApple),"XXX","XAX","XXX",'X',Items.PAPER,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.PrismarineApple),"XXX","XAX", "XXX",'X',Items.PRISMARINE_SHARD,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.QuartzApple),"XXX","XAX","XXX",'X',Items.QUARTZ,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.RedstoneApple),"XXX","XAX","XXX",'X',Items.REDSTONE,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.RottenFleshApple),"XXX","XAX","XXX",'X',Items.ROTTEN_FLESH,'A',Items.APPLE );
		GameRegistry.addRecipe(new ItemStack(ModItems.SlimeApple),"XXX","XAX","XXX",'X',Items.SLIME_BALL,'A',Items.APPLE );

		//Obsidian
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianShovel),"O","S","S",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianPickaxe),"OOO","-S-","-S-",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianAxe),"OO-","OS-","-S-",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianHoe),"OO-","-S-","-S-",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianSword),"O","O","S",'O',ModItems.ObsidianIngot,'S',Items.STICK);

		//Bone
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneShovel),"O","S","S",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BonePickaxe),"OOO","-S-","-S-",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneAxe),"OO-","OS-","-S-",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneHoe),"OO-","-S-","-S-",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneSword),"O","O","S",'O',ModItems.BoneIngot,'S',Items.STICK);

		//Flint
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintShovel),"O","S","S",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintPickaxe),"OOO","-S-","-S-",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintAxe),"OO-","OS-","-S-",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintHoe),"OO-","-S-","-S-",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintSword),"O","O","S",'O',ModItems.FlintIngot,'S',Items.STICK);

		//-//Armor
		//Obsidian
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianHelmet),"OOO","O-O",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianChestplate),"O-O","OOO","OOO",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianLeggings),"OOO","O-O","O-O",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianBoots),"O-O","O-O",'O',ModItems.ObsidianIngot);

		//Bone
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneHelmet),"BBB","B-B",'B',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneChestplate),"B-B","BBB","BBB",'B',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneLeggings),"BBB","B-B","B-B",'B',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneBoots),"B-B","B-B",'B',ModItems.BoneIngot);

		//Flint
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintHelmet),"FFF","F-F",'F',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintChestplate),"F-F","F","F",'F',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintLeggings),"FFF","F-F","F-F",'F',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintBoots),"F-F","F-F",'F',ModItems.FlintIngot);

		//-//Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ObsidianBlock,1),"OOO","OOO","OOO",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BoneBlock,1),"BBB","BBB","BBB",'B',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.FlintBlock,1),"FFF","FFF","FFF",'F',ModItems.FlintIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.EmptyJar, 1),"W","G",'W',Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE,'G',Blocks.GLASS);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.GroundLantern, 1),"T","I",'T',Blocks.TORCH,'I',Items.IRON_INGOT);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.GlowstoneTorch, 4),"G","S",'G',Items.GLOWSTONE_DUST,'S',Items.STICK);

		//Slabs
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 0),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 0)); //Oak
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 1),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 1)); //Spruce
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 2),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 2)); //Birch
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 3),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 3)); //Jungle
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 4),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 4)); //Acacia
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, 5),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, 5)); //Dark Oak
		
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE),"S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 0)); //Stone Slab
		GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE),"S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 3)); //Cobblestone Slab
		GameRegistry.addRecipe(new ItemStack(Blocks.BRICK_BLOCK),"S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 3)); //Brick Slab
		GameRegistry.addRecipe(new ItemStack(Blocks.NETHER_BRICK),"S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 3)); //Netherbrick Slab
		
		//-//-//Shapeless
		//-//Misc
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BoneMix, 1), new ItemStack(Items.BONE, 1), new ItemStack(Items.BONE, 1), new ItemStack(Items.BONE, 1)); //Block Into Ingot

		GameRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 1), new ItemStack(Blocks.GRAVEL, 1)); //Gravel Into Flint

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ObsidianIngot, 9), new ItemStack(ModBlocks.ObsidianBlock, 1)); //Block Into Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BoneIngot, 9), new ItemStack(ModBlocks.BoneBlock, 1)); //Block Into Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.FlintIngot, 9), new ItemStack(ModBlocks.FlintBlock, 1)); //Block Into Ingot

		//-//Blocks

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.HangingLantern, 1),new ItemStack(ModBlocks.GroundLantern,1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GroundLantern, 1),new ItemStack(ModBlocks.HangingLantern,1));
		
		//-//-//Smelting
		//Misc
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 0.1f);

		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.ObsidianIngot), 0.4f);
		GameRegistry.addSmelting(ModItems.BoneMix, new ItemStack(ModItems.BoneIngot), 0.3f);
		GameRegistry.addSmelting(Items.FLINT, new ItemStack(ModItems.FlintIngot), 0.3f);
	}
}
