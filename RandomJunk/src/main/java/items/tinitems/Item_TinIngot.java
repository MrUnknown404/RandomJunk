package items.tinitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_TinIngot extends Item {

	public Item_TinIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TININGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TININGOT.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
