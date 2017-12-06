package items.flintthings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Item_FlintSword extends ItemSword {

	public Item_FlintSword(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.FLINTSWORD.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTSWORD.getRegistryName());
		setCreativeTab(CreativeTabs.COMBAT);
	}

}
