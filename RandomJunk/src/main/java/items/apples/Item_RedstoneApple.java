package items.apples;

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


public class Item_RedstoneApple extends ItemFood {

	public Item_RedstoneApple() {
		super(4, 0.4f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.REDSTONEAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.REDSTONEAPPLE.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkItems);
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		
		//Add Potion Effect
		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HASTE, 240*20, 2)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, 240*20, 2)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 240*20, 0)); //Time In Seconds * Tickspeed
			}
		}
	}
}
