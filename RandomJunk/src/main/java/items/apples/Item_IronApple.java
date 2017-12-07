package items.apples;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class Item_IronApple extends ItemFood {

	public Item_IronApple() {
		super(5, 0.2f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.IRONAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.IRONAPPLE.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		
		//Add Potion Effect
		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 120*20, 2)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 120*20, 2)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 120*20, 2)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 120*20, 2)); //Time In Seconds * Tickspeed
			}
		}
	}
}
