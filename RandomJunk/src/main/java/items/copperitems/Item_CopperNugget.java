package items.copperitems;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.AchievementHandler;

import init.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_CopperNugget extends Item {

	public Item_CopperNugget() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERNUGGET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERNUGGET.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
