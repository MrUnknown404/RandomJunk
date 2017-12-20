package items.steelitems;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_SteelIngot extends Item {

	public Item_SteelIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELINGOT.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}

	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_SteelIngot)) {
			playerIn.addStat(AchievementHandler.Achievement_SteelIngot);
		}
	}
}
