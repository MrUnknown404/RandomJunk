package com.mrunknown404.randomjunk.handlers;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class CraftingHandler {
	
	public static void removeRecipes() {
		ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
		ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValues());
		
		//Magma Cream
		for (IRecipe r : recipes) {
			ItemStack output = r.getRecipeOutput();
			if (output.getItem() == Items.MAGMA_CREAM) {
				recipeRegistry.remove(r.getRegistryName());
			}
		}
		//Netherbrick Fence
		for (IRecipe r : recipes) {
			ItemStack output = r.getRecipeOutput();
			if (output.getItem() == Item.getItemFromBlock(Blocks.NETHER_BRICK_FENCE)) {
				recipeRegistry.remove(r.getRegistryName());
			}
		}
		//Ladder
		for (IRecipe r : recipes) {
			ItemStack output = r.getRecipeOutput();
			if (output.getItem() == Item.getItemFromBlock(Blocks.LADDER)) {
				recipeRegistry.remove(r.getRegistryName());
			}
		}
	}
}
