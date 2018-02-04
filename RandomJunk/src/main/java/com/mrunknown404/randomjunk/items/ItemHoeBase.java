package com.mrunknown404.randomjunk.items;

import com.mrunknown404.randomjunk.Main;
import com.mrunknown404.randomjunk.init.ModItems;
import com.mrunknown404.randomjunk.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemHoeBase extends ItemHoe implements IHasModel {

	public ItemHoeBase(String name, CreativeTabs tab, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
