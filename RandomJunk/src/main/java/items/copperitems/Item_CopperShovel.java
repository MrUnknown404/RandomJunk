package items.copperitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;



public class Item_CopperShovel extends ItemSpade {

	public Item_CopperShovel(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERSHOVEL.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
