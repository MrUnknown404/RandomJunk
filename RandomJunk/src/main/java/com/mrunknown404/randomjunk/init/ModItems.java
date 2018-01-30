package com.mrunknown404.randomjunk.init;

import java.util.ArrayList;
import java.util.List;

import com.mrunknown404.randomjunk.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//--> String name, CreativeTabs tab
	public static final Item APPLE_APPLE = new ItemBase("apple_apple", CreativeTabs.MISC);
}
