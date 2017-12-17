package com.mrunknown404.randomjunk.handlers;

import init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == ModItems.CoalApple) {
			return 12800;
		}
		if (fuel.getItem() == ModItems.BlazeApple) {
			return 9600;
		}
	return 0;
	}
}
