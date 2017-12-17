package items.apples;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_GunpowderApple extends ItemFood {

	public Item_GunpowderApple() {
		super(4, 0.4f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.GUNPOWDERAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.GUNPOWDERAPPLE.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		float var4 = 1.0F;
		//Explosion Vars
		int i = (int) (entity.prevPosX + (entity.posX - entity.prevPosX) * (double) var4);
		int j = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) * (double) var4 + 1.62D - (double) entity.getYOffset());
		int k = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) var4);
		
		//Create Explosion
		if (true) {
			world.createExplosion((Entity) null, i, j, k, 5F, true);
		}
	}
	
	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_InkApple)) {
			playerIn.addStat(AchievementHandler.Achievement_InkApple);
		}
	}
}
