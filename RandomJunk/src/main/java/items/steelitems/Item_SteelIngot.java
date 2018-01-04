package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_SteelIngot extends Item {

	public Item_SteelIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELINGOT.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
