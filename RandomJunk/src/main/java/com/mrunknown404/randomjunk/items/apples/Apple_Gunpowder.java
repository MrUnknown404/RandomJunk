package com.mrunknown404.randomjunk.items.apples;

import com.mrunknown404.randomjunk.items.ItemFoodBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Apple_Gunpowder extends ItemFoodBase {

	public Apple_Gunpowder(String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood, boolean isAlwaysEdible) {
		super(name, tab, amount, saturation, isWolfFood, isAlwaysEdible);
	}

	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		if (!world.isRemote) {
			float var4 = 1.0F;
			int i = (int) (entity.prevPosX + (entity.posX - entity.prevPosX) * (double) var4);
			int j = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) * (double) var4 + 1.62D - (double) entity.getYOffset());
			int k = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) var4);
			
			if (true) {
				world.createExplosion((Entity) null, i, j, k, 5F, true);
			}
		}
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
		if (!worldIn.isRemote) {
			if (entityLiving instanceof EntityPlayer) {
				((EntityPlayer)entityLiving).getCooldownTracker().setCooldown(this, 25);
			}
		}
		return itemstack;
	}
}
