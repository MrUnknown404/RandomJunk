package items.copperitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;


public class Item_CopperHoe extends ItemHoe {

	public Item_CopperHoe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERHOE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERHOE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
