package items.bonethings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Item_BoneSword extends ItemSword {

	public Item_BoneSword(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONESWORD.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONESWORD.getRegistryName());
		setCreativeTab(CreativeTabs.COMBAT);
	}

}
