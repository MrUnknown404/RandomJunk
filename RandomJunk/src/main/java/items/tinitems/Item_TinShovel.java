package items.tinitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;



public class Item_TinShovel extends ItemSpade {

	public Item_TinShovel(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TINSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINSHOVEL.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
