package items.boneitems;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.item.Item;


public class Item_BoneIngot extends Item {

	public Item_BoneIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONEINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEINGOT.getRegistryName());

		setCreativeTab(ModCreativeTabs.TabRandomJunkItems);
	}
}
