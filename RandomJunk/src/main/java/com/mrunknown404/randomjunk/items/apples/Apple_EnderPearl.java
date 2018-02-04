package com.mrunknown404.randomjunk.items.apples;

import java.util.concurrent.ThreadLocalRandom;

import com.mrunknown404.randomjunk.items.ItemFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Apple_EnderPearl extends ItemFoodBase {

	public Apple_EnderPearl(String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood, boolean isAlwaysEdible) {
		super(name, tab, amount, saturation, isWolfFood, isAlwaysEdible);
	}

	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		
		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 10*20, 0)); //Time In Seconds * Tickspeed
			}
		}
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
		if (!worldIn.isRemote) {
			double d0 = entityLiving.posX;
			double d1 = entityLiving.posY;
			double d2 = entityLiving.posZ;
			
			for (int i = 0; i < 16; ++i) {
				double random1 = ThreadLocalRandom.current().nextDouble(-32, 32);
				double random2 = ThreadLocalRandom.current().nextDouble(-32, 32);
				double d3 = entityLiving.posX + random1;
				double d4 = MathHelper.clamp(entityLiving.posY + (double)(entityLiving.getRNG().nextInt(16) - 8), 0.0D, (double)(worldIn.getActualHeight() - 1));
				double d5 = entityLiving.posZ + random2;
				
				if (entityLiving.isRiding()) {
					entityLiving.dismountRidingEntity();
				}
				
				if (entityLiving.attemptTeleport(d3, d4, d5)) {
					worldIn.playSound((EntityPlayer)null, d0, d1, d2, SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
					entityLiving.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
					break;
				}
			}
			
			if (entityLiving instanceof EntityPlayer) {
				((EntityPlayer)entityLiving).getCooldownTracker().setCooldown(this, 25);
			}
		}
		return itemstack;
	}
}
