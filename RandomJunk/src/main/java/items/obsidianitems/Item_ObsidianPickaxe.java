package items.obsidianitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Item_ObsidianPickaxe extends ItemPickaxe {

	public Item_ObsidianPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_ObsidianPickaxe)) {
			playerIn.addStat(AchievementHandler.Achievement_ObsidianPickaxe);
		}
	}
}
