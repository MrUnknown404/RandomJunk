package items.tinitems;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_TinIngot extends Item {

	public Item_TinIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TININGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TININGOT.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}

	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_TinIngot)) {
			playerIn.addStat(AchievementHandler.Achievement_TinIngot);
		}
	}
}
