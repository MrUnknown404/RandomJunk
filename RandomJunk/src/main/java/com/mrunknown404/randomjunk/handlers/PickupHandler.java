package com.mrunknown404.randomjunk.handlers;

import init.ModItems;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PickupHandler {
	//Get Apple Achievement
	@SubscribeEvent
	public void pickup(EntityItemPickupEvent event) {
		//Try To Get ItemPickupEvent To Work Future Me!
		if(event.getItem().getEntityItem().getItem() == Items.APPLE) {
			if (!event.getEntityPlayer().hasAchievement(AchievementHandler.Achievement_GetApple)) {
				event.getEntityPlayer().addStat(AchievementHandler.Achievement_GetApple);
			}
		}
		if(event.getItem().getEntityItem().getItem() == Items.FLINT) {
			if (!event.getEntityPlayer().hasAchievement(AchievementHandler.Achievement_Flint)) {
				event.getEntityPlayer().addStat(AchievementHandler.Achievement_Flint);
			}
		}
		if(event.getItem().getEntityItem().getItem() == Items.BONE) {
			if (!event.getEntityPlayer().hasAchievement(AchievementHandler.Achievement_Bone)) {
				event.getEntityPlayer().addStat(AchievementHandler.Achievement_Bone);
			}
		}
		if(event.getItem().getEntityItem().getItem() == ModItems.ObsidianShard) {
			if (!event.getEntityPlayer().hasAchievement(AchievementHandler.Achievement_ObsidianShard)) {
				event.getEntityPlayer().addStat(AchievementHandler.Achievement_ObsidianShard);
			}
		}
	}
}
