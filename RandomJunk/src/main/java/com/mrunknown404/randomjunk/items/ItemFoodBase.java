package com.mrunknown404.randomjunk.items;

import com.mrunknown404.randomjunk.Main;
import com.mrunknown404.randomjunk.init.ModItems;
import com.mrunknown404.randomjunk.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood implements IHasModel{
	public ItemFoodBase(String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood, boolean isAlwaysEdible) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		if (isAlwaysEdible == true) {
			setAlwaysEdible();
		}
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
