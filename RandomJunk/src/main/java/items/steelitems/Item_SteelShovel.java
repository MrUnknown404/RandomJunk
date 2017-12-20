package items.steelitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;



public class Item_SteelShovel extends ItemSpade {

	public Item_SteelShovel(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELSHOVEL.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
