package items.apples;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class Item_ClayApple extends ItemFood {

	public Item_ClayApple() {
		super(3, 0.3f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.CLAYAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.CLAYAPPLE.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
		setAlwaysEdible();
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
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 60*20, 0)); //Time In Seconds * Tickspeed
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.LUCK, 60*20, 0)); //Time In Seconds * Tickspeed
			}
		}
	}
	
	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_ClayApple)) {
			playerIn.addStat(AchievementHandler.Achievement_ClayApple);
		}
	}
}
