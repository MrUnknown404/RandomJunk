package com.mrunknown404.randomjunk.items.apples;

import com.mrunknown404.randomjunk.items.ItemFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Apple_Emerald extends ItemFoodBase {

	public Apple_Emerald(String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood, boolean isAlwaysEdible) {
		super(name, tab, amount, saturation, isWolfFood, isAlwaysEdible);
	}

	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		
		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.LUCK, 120*20, 1)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 120*20, 0)); //Time In Seconds * Tickspeed
			}
		}
	}
}