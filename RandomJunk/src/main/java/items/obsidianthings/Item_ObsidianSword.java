package items.obsidianthings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Item_ObsidianSword extends ItemSword {

	public Item_ObsidianSword(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANSWORD.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANSWORD.getRegistryName());
		setCreativeTab(CreativeTabs.COMBAT);
	}

}
