package items.flintthings;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_FlintIngot extends Item {
	
	public Item_FlintIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.FLINTINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTINGOT.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
