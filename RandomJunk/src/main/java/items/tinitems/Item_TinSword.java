package items.tinitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Item_TinSword extends ItemSword {

	public Item_TinSword(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TINSWORD.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINSWORD.getRegistryName());
		setCreativeTab(CreativeTabs.COMBAT);
	}

}
