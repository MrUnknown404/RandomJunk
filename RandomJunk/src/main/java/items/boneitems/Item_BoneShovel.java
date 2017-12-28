package items.boneitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;



public class Item_BoneShovel extends ItemSpade {

	public Item_BoneShovel(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONESHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONESHOVEL.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
