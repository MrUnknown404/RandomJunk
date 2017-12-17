package items.flintthings;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_FlintIngot extends Item {
	
	public Item_FlintIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.FLINTINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTINGOT.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
	
	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_FlintIngot)) {
			playerIn.addStat(AchievementHandler.Achievement_FlintIngot);
		}
	}
}
