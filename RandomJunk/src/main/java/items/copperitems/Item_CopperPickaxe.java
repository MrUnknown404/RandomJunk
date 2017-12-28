package items.copperitems;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Item_CopperPickaxe extends ItemPickaxe {

	public Item_CopperPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

	//Achievement
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		if (!playerIn.hasAchievement(AchievementHandler.Achievement_CopperPickaxe)) {
			playerIn.addStat(AchievementHandler.Achievement_CopperPickaxe);
		}
	}
}
