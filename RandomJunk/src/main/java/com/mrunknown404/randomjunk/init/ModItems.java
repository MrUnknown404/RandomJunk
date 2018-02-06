package com.mrunknown404.randomjunk.init;

import java.util.ArrayList;
import java.util.List;

import com.mrunknown404.randomjunk.items.ItemAxeBase;
import com.mrunknown404.randomjunk.items.ItemBase;
import com.mrunknown404.randomjunk.items.ItemFoodBase;
import com.mrunknown404.randomjunk.items.ItemHoeBase;
import com.mrunknown404.randomjunk.items.ItemPickaxeBase;
import com.mrunknown404.randomjunk.items.ItemShovelBase;
import com.mrunknown404.randomjunk.items.ItemSwordBase;
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

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static ToolMaterial MAT_OBSIDIAN = EnumHelper.addToolMaterial("MAT_OBSIDIAN", 4, 2341, 11.0f, 4.0f, 12);
	public static ToolMaterial MAT_STEEL = EnumHelper.addToolMaterial("MAT_STEEL", 2, 320,  5.0F , 2.0F, 13);
	public static ToolMaterial MAT_COPPER = EnumHelper.addToolMaterial("MAT_COPPER", 2, 180,  4.5F,  2.0F, 9);
	public static ToolMaterial MAT_BONE = EnumHelper.addToolMaterial("MAT_BONE", 2, 333,  6.0f,  2.0f, 8);
	public static ToolMaterial MAT_TIN = EnumHelper.addToolMaterial("MAT_TIN", 1, 166,  5.0F,  1.5F, 10);
	public static ToolMaterial MAT_FLINT = EnumHelper.addToolMaterial("MAT_FLINT", 1, 156,  4.0f,  2.0f, 8);
	
	public static ToolMaterial MAT_DEBUG = EnumHelper.addToolMaterial("MAT_DEBUG", 5, -1, 500.0f, 99.0f, 0);
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//-//Items
	//Food
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
	
	//Misc
	public static final Item BONEMIX = new ItemBase("bonemix", ModCreativeTabs.TabRandomJunkItems);
	public static final Item OBSIDIANSHARD = new ItemBase("obsidianshard", ModCreativeTabs.TabRandomJunkItems);
	public static final Item NUGGET_COPPER = new ItemBase("coppernugget", ModCreativeTabs.TabRandomJunkItems);
	public static final Item NUGGET_STEEL = new ItemBase("steelnugget", ModCreativeTabs.TabRandomJunkItems);
	public static final Item NUGGET_TIN = new ItemBase("tinnugget", ModCreativeTabs.TabRandomJunkItems);
	
	public static final Item INGOT_BONE = new ItemBase("boneingot", ModCreativeTabs.TabRandomJunkItems);
	public static final Item INGOT_COPPER = new ItemBase("copperingot", ModCreativeTabs.TabRandomJunkItems);
	public static final Item INGOT_FLINT = new ItemBase("flintingot", ModCreativeTabs.TabRandomJunkItems);
	public static final Item INGOT_OBSIDIAN = new ItemBase("obsidianingot", ModCreativeTabs.TabRandomJunkItems);
	public static final Item INGOT_STEEL = new ItemBase("steelingot", ModCreativeTabs.TabRandomJunkItems);
	public static final Item INGOT_TIN = new ItemBase("tiningot", ModCreativeTabs.TabRandomJunkItems);
	
	//-//Tools
	//Shovels
	public static final Item SHOVEL_BONE = new ItemShovelBase("boneshovel", CreativeTabs.TOOLS, MAT_BONE);
	public static final Item SHOVEL_COPPER = new ItemShovelBase("coppershovel", CreativeTabs.TOOLS, MAT_COPPER);
	public static final Item SHOVEL_FLINT = new ItemShovelBase("flintshovel", CreativeTabs.TOOLS, MAT_FLINT);
	public static final Item SHOVEL_OBSIDIAN = new ItemShovelBase("obsidianshovel", CreativeTabs.TOOLS, MAT_OBSIDIAN);
	public static final Item SHOVEL_STEEL = new ItemShovelBase("steelshovel", CreativeTabs.TOOLS, MAT_STEEL);
	public static final Item SHOVEL_TIN = new ItemShovelBase("tinshovel", CreativeTabs.TOOLS, MAT_TIN);
	
	//Pickaxes
	public static final Item PICKAXE_BONE = new ItemPickaxeBase("bonepickaxe", CreativeTabs.TOOLS, MAT_BONE);
	
	public static final Item PICKAXE_DEBUG = new ItemPickaxeBase("debugpickaxe", CreativeTabs.TOOLS, MAT_DEBUG);
	
	//Axes
	public static final Item AXE_BONE = new ItemAxeBase("boneaxe", CreativeTabs.TOOLS, MAT_BONE, 8.0f, -3.2f);
	
	//Hoes
	public static final Item HOE_BONE = new ItemHoeBase("bonehoe", CreativeTabs.TOOLS, MAT_BONE);
	
	//Swords
	public static final Item SWORD_BONE = new ItemSwordBase("bonesword", CreativeTabs.COMBAT, MAT_BONE);
	
}
