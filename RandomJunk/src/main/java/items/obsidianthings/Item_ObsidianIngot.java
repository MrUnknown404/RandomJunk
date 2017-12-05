package items.obsidianthings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.item.Item;


public class Item_ObsidianIngot extends Item {
	
	public Item_ObsidianIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANINGOT.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkItems);
	}
}
