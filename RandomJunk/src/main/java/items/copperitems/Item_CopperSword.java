package items.copperitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Item_CopperSword extends ItemSword {

	public Item_CopperSword(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERSWORD.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERSWORD.getRegistryName());
		setCreativeTab(CreativeTabs.COMBAT);
	}

}
