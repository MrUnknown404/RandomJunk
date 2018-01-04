package items.obsidianitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_ObsidianIngot extends Item {

	public Item_ObsidianIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANINGOT.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
