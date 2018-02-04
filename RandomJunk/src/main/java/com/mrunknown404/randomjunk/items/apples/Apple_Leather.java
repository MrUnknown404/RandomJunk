package com.mrunknown404.randomjunk.items.apples;

import com.mrunknown404.randomjunk.items.ItemFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Apple_Leather extends ItemFoodBase {

	public Apple_Leather(String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood, boolean isAlwaysEdible) {
		super(name, tab, amount, saturation, isWolfFood, isAlwaysEdible);
	}

	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		float var4 = 1.0F;

		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 	60*20, 1)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION,		60*20, 1)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION,	10*20, 1)); //Time In Seconds * Tickspeed
			}
		}
	}
}
