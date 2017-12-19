package items.flintitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;


public class Item_FlintHoe extends ItemHoe {

	public Item_FlintHoe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.FLINTHOE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTHOE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
