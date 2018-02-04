package com.mrunknown404.randomjunk.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
	
	public static CreativeTabs TabRandomJunkItems = new CreativeTabs("Tab_RandomJunkItems") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.APPLE_APPLE);
		}
	};
	
	public static CreativeTabs TabRandomJunkBlocks = new CreativeTabs("Tab_RandomJunkBlocks") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.SANDYDIRT);
		}
	};
}
