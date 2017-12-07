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


public class Item_PrismarineApple extends ItemFood {

	public Item_PrismarineApple() {
		super(3, 0.3f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.PRISMARINEAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.PRISMARINEAPPLE.getRegistryName());

		setCreativeTab(RandomJunk.TabRandomJunkItems);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		
		//Add Potion Effect
		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 300*20, 0)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SATURATION, 300*20, 0)); //Time In Seconds * Tickspeed
			}
		}
	}
}
