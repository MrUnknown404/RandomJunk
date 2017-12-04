package items;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemGunpowderApple extends ItemFood {

	public ItemGunpowderApple() {
		super(4, 0.4f, false);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.GUNPOWDERAPPLE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.GUNPOWDERAPPLE.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkItems);
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
}
