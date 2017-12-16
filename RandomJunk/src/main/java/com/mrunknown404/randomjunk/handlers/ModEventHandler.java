package com.mrunknown404.randomjunk.handlers;

import java.util.Random;

import init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModEventHandler {
	
	Random rand = new Random();
	
	@SubscribeEvent
	public void yourPlayerHarvestEvent(HarvestDropsEvent event) {
		if (event.getHarvester() != null) {
			
			if (event.getState() == Blocks.OBSIDIAN.getDefaultState()) {
				if (event.isSilkTouching() == false) {
					event.getDrops().clear();
					event.getDrops().add(new ItemStack(ModItems.ObsidianShard, rand.nextInt(3) + 4));
				} else if (event.isSilkTouching() == true) {
					event.getDrops().clear();
					event.getDrops().add(new ItemStack(Blocks.OBSIDIAN,1));
				}
			}
		}
	}
}
