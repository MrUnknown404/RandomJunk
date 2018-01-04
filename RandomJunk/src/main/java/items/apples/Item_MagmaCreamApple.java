package items.apples;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class Item_MagmaCreamApple extends ItemFood {

	public Item_MagmaCreamApple() {
		super(5, 0.4f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.MAGMACREAMAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.MAGMACREAMAPPLE.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		
		//Add Potion Effect
		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 300*20, 1)); //Time In Seconds * Tickspeed
			}
		}
	}
}
