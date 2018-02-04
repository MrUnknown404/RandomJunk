package com.mrunknown404.randomjunk.init;

import java.util.ArrayList;
import java.util.List;

import com.mrunknown404.randomjunk.items.ItemBase;
import com.mrunknown404.randomjunk.items.ItemFoodBase;
import com.mrunknown404.randomjunk.items.apples.Apple_Blaze;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//--> String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood, boolean always edible
	public static final Item APPLE_APPLE = new ItemFoodBase("appleapple", ModCreativeTabs.TabRandomJunkItems, 16, 0.6f, false, true);
	public static final Item APPLE_BLAZE = new Apple_Blaze("blazeapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_CLAY = new ItemFoodBase("clayapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_COAL = new ItemFoodBase("coalapple", ModCreativeTabs.TabRandomJunkItems, 3, 0.3f, false, true);
	public static final Item APPLE_DIAMOND = new ItemFoodBase("diamondapple", ModCreativeTabs.TabRandomJunkItems, 12, 0.7f, false, true);
	public static final Item APPLE_EMERALD = new ItemFoodBase("emeraldapple", ModCreativeTabs.TabRandomJunkItems, 10, 0.6f, false, true);
	public static final Item APPLE_ENDERPEARL = new ItemFoodBase("enderpearlapple", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_FLINT = new ItemFoodBase("flintapple", ModCreativeTabs.TabRandomJunkItems, 2, 0.3f, false, true);
	public static final Item APPLE_GLOWSTONE = new ItemFoodBase("glowstoneapple", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_GUNPOWDER = new ItemFoodBase("gunpowderapple", ModCreativeTabs.TabRandomJunkItems, 1, 0.1f, false, true);
	public static final Item APPLE_INK = new ItemFoodBase("inkapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_IRON = new ItemFoodBase("ironapple", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_LAPIS = new ItemFoodBase("lapisapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.8f, false, true);
	public static final Item APPLE_LEATHER = new ItemFoodBase("leatherapple", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_MAGMACREAM = new ItemFoodBase("magmacreamapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_OBSIDIAN = new ItemFoodBase("obsidianapple", ModCreativeTabs.TabRandomJunkItems, 8, 0.7f, false, true);
	public static final Item APPLE_PAPER = new ItemFoodBase("paperapple", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_PRISMARINE = new ItemFoodBase("prismarineapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_QUARTZ = new ItemFoodBase("quartzapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_REDSTONE = new ItemFoodBase("redstoneapple", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_ROTTENFLESH = new ItemFoodBase("rottenfleshapple", ModCreativeTabs.TabRandomJunkItems, 3, 0.4f, false, true);
	public static final Item APPLE_SLIME = new ItemFoodBase("slimeapple", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
}
