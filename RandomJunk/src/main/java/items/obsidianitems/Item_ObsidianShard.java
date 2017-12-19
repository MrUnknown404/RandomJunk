package items.obsidianitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_ObsidianShard extends Item {

	public Item_ObsidianShard() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANSHARD.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANSHARD.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
