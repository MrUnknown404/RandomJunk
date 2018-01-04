package items.apples;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_AppleApple extends ItemFood {

	public Item_AppleApple() {
		super(10, 0.6f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.APPLEAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.APPLEAPPLE.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
	
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
		super.onFoodEaten(itemStack, world, entity);
		float var4 = 1.0F;
		//Potion Effect Vars
		int i = (int) (entity.prevPosX + (entity.posX - entity.prevPosX) * (double) var4);
		int j = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) * (double) var4 + 1.62D - (double) entity.getYOffset());
		int k = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) var4);
	}
}
