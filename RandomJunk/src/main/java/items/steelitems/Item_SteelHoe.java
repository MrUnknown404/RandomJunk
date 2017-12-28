package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class Item_SteelHoe extends ItemHoe {

	public Item_SteelHoe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELHOE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELHOE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
