package items.tinitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;


public class Item_TinHoe extends ItemHoe {

	public Item_TinHoe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TINHOE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINHOE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
