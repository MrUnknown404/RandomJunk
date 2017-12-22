package items.tinitems;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_TinNugget extends Item {

	public Item_TinNugget() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TINNUGGET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINNUGGET.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
