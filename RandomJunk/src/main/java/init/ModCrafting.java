package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		//-//-//-//Add Recipe
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
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianShovel),"OXX","SXX","SXX",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianShovel),"XOX","XSX","XSX",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianShovel),"XXO","XXS","XXS",'O',ModItems.ObsidianIngot,'S',Items.STICK);

		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianPickaxe),"OOO","XSX","XSX",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianAxe),"OOX","OSX","XSX",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianHoe),"OOX","XSX","XSX",'O',ModItems.ObsidianIngot,'S',Items.STICK);

		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianSword),"OXX","OXX","SXX",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianSword),"XOX","XOX","XSX",'O',ModItems.ObsidianIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.ObsidianSword),"XXO","XXO","XXS",'O',ModItems.ObsidianIngot,'S',Items.STICK);

		//Bone
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneShovel),"OXX","SXX","SXX",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneShovel),"XOX","XSX","XSX",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneShovel),"XXO","XXS","XXS",'O',ModItems.BoneIngot,'S',Items.STICK);

		GameRegistry.addRecipe(new ItemStack(ModTools.BonePickaxe),"OOO","XSX","XSX",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneAxe),"OOX","OSX","XSX",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneHoe),"OOX","XSX","XSX",'O',ModItems.BoneIngot,'S',Items.STICK);

		GameRegistry.addRecipe(new ItemStack(ModTools.BoneSword),"OXX","OXX","SXX",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneSword),"XOX","XOX","XSX",'O',ModItems.BoneIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.BoneSword),"XXO","XXO","XXS",'O',ModItems.BoneIngot,'S',Items.STICK);

		//Flint
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintShovel),"OXX","SXX","SXX",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintShovel),"XOX","XSX","XSX",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintShovel),"XXO","XXS","XXS",'O',ModItems.FlintIngot,'S',Items.STICK);

		GameRegistry.addRecipe(new ItemStack(ModTools.FlintPickaxe),"OOO","XSX","XSX",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintAxe),"OOX","OSX","XSX",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintHoe),"OOX","XSX","XSX",'O',ModItems.FlintIngot,'S',Items.STICK);

		GameRegistry.addRecipe(new ItemStack(ModTools.FlintSword),"OXX","OXX","SXX",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintSword),"XOX","XOX","XSX",'O',ModItems.FlintIngot,'S',Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.FlintSword),"XXO","XXO","XXS",'O',ModItems.FlintIngot,'S',Items.STICK);

		//-//Armor
		//Obsidian
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianHelmet),"OOO","OXO","XXX",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianHelmet),"XXX","OOO","OXO",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianChestplate),"OXO","OOO","OOO",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianLeggings),"OOO","OXO","OXO",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianBoots),"OXO","OXO","XXX",'O',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.ObsidianBoots),"XXX","OXO","OXO",'O',ModItems.ObsidianIngot);

		//Bone
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneHelmet),"OOO","OXO","XXX",'O',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneHelmet),"XXX","OOO","OXO",'O',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneChestplate),"OXO","OOO","OOO",'O',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneLeggings),"OOO","OXO","OXO",'O',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneBoots),"OXO","OXO","XXX",'O',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.BoneBoots),"XXX","OXO","OXO",'O',ModItems.BoneIngot);

		//Flint
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintHelmet),"OOO","OXO","XXX",'O',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintHelmet),"XXX","OOO","OXO",'O',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintChestplate),"OXO","OOO","OOO",'O',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintLeggings),"OOO","OXO","OXO",'O',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintBoots),"OXO","OXO","XXX",'O',ModItems.FlintIngot);
		GameRegistry.addRecipe(new ItemStack(ModArmor.FlintBoots),"XXX","OXO","OXO",'O',ModItems.FlintIngot);

		//Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ObsidianBlock,1),"XXX","XXX","XXX",'X',ModItems.ObsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BoneBlock,1),"XXX","XXX","XXX",'X',ModItems.BoneIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.FlintBlock,1),"XXX","XXX","XXX",'X',ModItems.FlintIngot);

		//-//-//Shapeless
		//-//Misc
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BoneMix, 1), new ItemStack(Items.BONE, 1), new ItemStack(Items.BONE, 1), new ItemStack(Items.BONE, 1)); //Block Into Ingot

		GameRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 1), new ItemStack(Blocks.GRAVEL, 1)); //Gravel Into Flint

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ObsidianIngot, 9), new ItemStack(ModBlocks.ObsidianBlock, 1)); //Block Into Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BoneIngot, 9), new ItemStack(ModBlocks.BoneBlock, 1)); //Block Into Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.FlintIngot, 9), new ItemStack(ModBlocks.FlintBlock, 1)); //Block Into Ingot

		//-//Blocks
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

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.EmptyJar, 1),new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE,1),new ItemStack(Blocks.GLASS,1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GroundLantern, 1),new ItemStack(Blocks.TORCH,1),new ItemStack(Items.IRON_INGOT,1));
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
