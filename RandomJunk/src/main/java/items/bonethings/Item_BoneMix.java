package items.bonethings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.item.Item;


public class Item_BoneMix extends Item {
	
	public Item_BoneMix() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONEMIX.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEMIX.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkItems);
	}
}
