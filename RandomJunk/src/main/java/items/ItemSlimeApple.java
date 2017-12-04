package items;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemSlimeApple extends ItemFood {

	public ItemSlimeApple() {
		super(5, 0.5f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.SLIMEAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.SLIMEAPPLE.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkItems);
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		float var4 = 1.0F;
		//Potion Effect Vars
		int i = (int) (entity.prevPosX + (entity.posX - entity.prevPosX) * (double) var4);
		int j = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) * (double) var4 + 1.62D - (double) entity.getYOffset());
		int k = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) var4);

		//Add Potion Effect
		if (true) {
			if (entity instanceof EntityLivingBase) {
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 60*20, 1)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60*20, 0)); //Time In Seconds * Tickspeed
			}
		}
	}
}
