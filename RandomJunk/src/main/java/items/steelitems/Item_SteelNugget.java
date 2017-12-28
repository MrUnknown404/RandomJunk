package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_SteelNugget extends Item {

	public Item_SteelNugget() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELNUGGET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELNUGGET.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
