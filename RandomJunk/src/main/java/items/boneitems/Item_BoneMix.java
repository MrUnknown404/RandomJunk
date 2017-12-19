package items.boneitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_BoneMix extends Item {

	public Item_BoneMix() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONEMIX.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEMIX.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
