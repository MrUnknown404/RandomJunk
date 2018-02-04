package com.mrunknown404.randomjunk.init;

import java.util.ArrayList;
import java.util.List;

import com.mrunknown404.randomjunk.items.ItemBase;
import com.mrunknown404.randomjunk.items.ItemFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//--> String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood, boolean always edible
	public static final Item APPLE_APPLE = new ItemFoodBase("apple_apple", ModCreativeTabs.TabRandomJunkItems, 16, 0.6f, false, true);
	public static final Item APPLE_BLAZE = new ItemFoodBase("apple_blaze", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_CLAY = new ItemFoodBase("apple_clay", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_COAL = new ItemFoodBase("apple_coal", ModCreativeTabs.TabRandomJunkItems, 3, 0.3f, false, true);
	public static final Item APPLE_DIAMOND = new ItemFoodBase("apple_diamond", ModCreativeTabs.TabRandomJunkItems, 12, 0.7f, false, true);
	public static final Item APPLE_EMERALD = new ItemFoodBase("apple_emerald", ModCreativeTabs.TabRandomJunkItems, 10, 0.6f, false, true);
	public static final Item APPLE_ENDERPEARL = new ItemFoodBase("apple_enderpearl", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_FLINT = new ItemFoodBase("apple_flint", ModCreativeTabs.TabRandomJunkItems, 2, 0.3f, false, true);
	public static final Item APPLE_GLOWSTONE = new ItemFoodBase("apple_glowstone", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_GUNPOWDER = new ItemFoodBase("apple_gunpowder", ModCreativeTabs.TabRandomJunkItems, 1, 0.1f, false, true);
	public static final Item APPLE_INK = new ItemFoodBase("apple_ink", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_IRON = new ItemFoodBase("apple_iron", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_LAPIS = new ItemFoodBase("apple_lapis", ModCreativeTabs.TabRandomJunkItems, 5, 0.8f, false, true);
	public static final Item APPLE_LEATHER = new ItemFoodBase("apple_leather", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_MAGMACREAM = new ItemFoodBase("apple_magmacream", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_OBSIDIAN = new ItemFoodBase("apple_obsidian", ModCreativeTabs.TabRandomJunkItems, 8, 0.7f, false, true);
	public static final Item APPLE_PAPER = new ItemFoodBase("apple_paper", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_PRISMARINE = new ItemFoodBase("apple_prismarine", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_QUARTZ = new ItemFoodBase("apple_quartz", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_REDSTONE = new ItemFoodBase("apple_redstone", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_ROTTENFLESH = new ItemFoodBase("apple_rottenflesh", ModCreativeTabs.TabRandomJunkItems, 3, 0.4f, false, true);
	public static final Item APPLE_SLIME = new ItemFoodBase("apple_slime", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
}
