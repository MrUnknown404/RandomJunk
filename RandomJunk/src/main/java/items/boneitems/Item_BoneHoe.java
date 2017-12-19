package items.boneitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;


public class Item_BoneHoe extends ItemHoe {

	public Item_BoneHoe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONEHOE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEHOE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
