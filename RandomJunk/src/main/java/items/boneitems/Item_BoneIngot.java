package items.boneitems;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_BoneIngot extends Item {

	public Item_BoneIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONEINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEINGOT.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}

	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_BoneIngot)) {
			playerIn.addStat(AchievementHandler.Achievement_BoneIngot);
		}
	}
}
