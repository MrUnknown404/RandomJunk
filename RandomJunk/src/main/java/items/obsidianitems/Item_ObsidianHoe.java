package items.obsidianitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;


public class Item_ObsidianHoe extends ItemHoe {

	public Item_ObsidianHoe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANHOE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANHOE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
