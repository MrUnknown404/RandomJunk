package items.flintthings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.item.Item;


public class Item_FlintIngot extends Item {
	
	public Item_FlintIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.FLINTINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTINGOT.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkItems);
	}
}
