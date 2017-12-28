package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Item_SteelSword extends ItemSword {

	public Item_SteelSword(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELSWORD.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELSWORD.getRegistryName());
		setCreativeTab(CreativeTabs.COMBAT);
	}

}
