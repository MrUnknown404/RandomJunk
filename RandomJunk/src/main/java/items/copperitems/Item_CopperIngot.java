package items.copperitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_CopperIngot extends Item {

	public Item_CopperIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERINGOT.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
