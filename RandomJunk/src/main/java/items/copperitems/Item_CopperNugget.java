package items.copperitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_CopperNugget extends Item {

	public Item_CopperNugget() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERNUGGET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERNUGGET.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
