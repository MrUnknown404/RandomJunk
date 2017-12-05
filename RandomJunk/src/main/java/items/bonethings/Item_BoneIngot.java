package items.bonethings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.item.Item;


public class Item_BoneIngot extends Item {
	
	public Item_BoneIngot() {
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONEINGOT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEINGOT.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkItems);
	}
}
