package items.steelitems;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_SteelNugget extends Item {

	public Item_SteelNugget() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELNUGGET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELNUGGET.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
