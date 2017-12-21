package items.apples;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;


public class Item_EnderPearlApple extends ItemFood {

	public Item_EnderPearlApple() {
		super(6, 0.4f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.ENDERPEARLAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.ENDERPEARLAPPLE.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
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
	
	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_EnderPearlApple)) {
			playerIn.addStat(AchievementHandler.Achievement_EnderPearlApple);
		}
	}
}
