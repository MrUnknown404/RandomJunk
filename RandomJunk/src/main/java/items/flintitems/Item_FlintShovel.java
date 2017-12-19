package items.flintitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;



public class Item_FlintShovel extends ItemSpade {

	public Item_FlintShovel(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.FLINTSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTSHOVEL.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
