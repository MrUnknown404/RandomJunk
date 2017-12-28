package items.steelitems;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Item_SteelPickaxe extends ItemPickaxe {

	public Item_SteelPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_SteelPickaxe)) {
			playerIn.addStat(AchievementHandler.Achievement_SteelPickaxe);
		}
	}
}
