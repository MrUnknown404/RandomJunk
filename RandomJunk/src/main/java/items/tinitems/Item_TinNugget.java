package items.tinitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_TinNugget extends Item {

	public Item_TinNugget() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TINNUGGET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINNUGGET.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
