package items;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemIronApple extends ItemFood {

	public ItemIronApple() {
		super(4, 0.4f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.IRONAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.IRONAPPLE.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkItems);
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		
		//Add Potion Effect
		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 120*20, 4)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 120*20, 4)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 120*20, 4)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 120*20, 4)); //Time In Seconds * Tickspeed
			}
		}
	}
}