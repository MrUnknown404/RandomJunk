package com.mrunknown404.randomjunk.init;

import java.util.ArrayList;
import java.util.List;

import com.mrunknown404.randomjunk.items.ItemFoodBase;
import com.mrunknown404.randomjunk.items.apples.Apple_Blaze;
import com.mrunknown404.randomjunk.items.apples.Apple_Clay;
import com.mrunknown404.randomjunk.items.apples.Apple_Coal;
import com.mrunknown404.randomjunk.items.apples.Apple_Diamond;
import com.mrunknown404.randomjunk.items.apples.Apple_Emerald;
import com.mrunknown404.randomjunk.items.apples.Apple_EnderPearl;
import com.mrunknown404.randomjunk.items.apples.Apple_Flint;
import com.mrunknown404.randomjunk.items.apples.Apple_Glowstone;
import com.mrunknown404.randomjunk.items.apples.Apple_Gunpowder;
import com.mrunknown404.randomjunk.items.apples.Apple_Ink;
import com.mrunknown404.randomjunk.items.apples.Apple_Iron;
import com.mrunknown404.randomjunk.items.apples.Apple_Lapis;
import com.mrunknown404.randomjunk.items.apples.Apple_Leather;
import com.mrunknown404.randomjunk.items.apples.Apple_MagmaCream;
import com.mrunknown404.randomjunk.items.apples.Apple_Obsidian;
import com.mrunknown404.randomjunk.items.apples.Apple_Paper;
import com.mrunknown404.randomjunk.items.apples.Apple_Prismarine;
import com.mrunknown404.randomjunk.items.apples.Apple_Quartz;
import com.mrunknown404.randomjunk.items.apples.Apple_Redstone;
import com.mrunknown404.randomjunk.items.apples.Apple_RottenFlesh;
import com.mrunknown404.randomjunk.items.apples.Apple_Slime;

import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//--> String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood, boolean always edible
	public static final Item APPLE_APPLE = new ItemFoodBase("appleapple", ModCreativeTabs.TabRandomJunkItems, 16, 0.6f, false, true);
	public static final Item APPLE_BLAZE = new Apple_Blaze("blazeapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_CLAY = new Apple_Clay("clayapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_COAL = new Apple_Coal("coalapple", ModCreativeTabs.TabRandomJunkItems, 3, 0.3f, false, true);
	public static final Item APPLE_DIAMOND = new Apple_Diamond("diamondapple", ModCreativeTabs.TabRandomJunkItems, 12, 0.7f, false, true);
	public static final Item APPLE_EMERALD = new Apple_Emerald("emeraldapple", ModCreativeTabs.TabRandomJunkItems, 10, 0.6f, false, true);
	public static final Item APPLE_ENDERPEARL = new Apple_EnderPearl("enderpearlapple", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_FLINT = new Apple_Flint("flintapple", ModCreativeTabs.TabRandomJunkItems, 2, 0.3f, false, true);
	public static final Item APPLE_GLOWSTONE = new Apple_Glowstone("glowstoneapple", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_GUNPOWDER = new Apple_Gunpowder("gunpowderapple", ModCreativeTabs.TabRandomJunkItems, 1, 0.1f, false, true);
	public static final Item APPLE_INK = new Apple_Ink("inkapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_IRON = new Apple_Iron("ironapple", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_LAPIS = new Apple_Lapis("lapisapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.8f, false, true);
	public static final Item APPLE_LEATHER = new Apple_Leather("leatherapple", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_MAGMACREAM = new Apple_MagmaCream("magmacreamapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_OBSIDIAN = new Apple_Obsidian("obsidianapple", ModCreativeTabs.TabRandomJunkItems, 8, 0.7f, false, true);
	public static final Item APPLE_PAPER = new Apple_Paper("paperapple", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
	public static final Item APPLE_PRISMARINE = new Apple_Prismarine("prismarineapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_QUARTZ = new Apple_Quartz("quartzapple", ModCreativeTabs.TabRandomJunkItems, 5, 0.4f, false, true);
	public static final Item APPLE_REDSTONE = new Apple_Redstone("redstoneapple", ModCreativeTabs.TabRandomJunkItems, 6, 0.5f, false, true);
	public static final Item APPLE_ROTTENFLESH = new Apple_RottenFlesh("rottenfleshapple", ModCreativeTabs.TabRandomJunkItems, 3, 0.4f, false, true);
	public static final Item APPLE_SLIME = new Apple_Slime("slimeapple", ModCreativeTabs.TabRandomJunkItems, 4, 0.4f, false, true);
}
