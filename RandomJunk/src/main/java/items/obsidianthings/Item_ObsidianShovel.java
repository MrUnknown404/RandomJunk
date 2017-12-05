package items.obsidianthings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;



public class Item_ObsidianShovel extends ItemSpade {

	public Item_ObsidianShovel(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANSHOVEL.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
