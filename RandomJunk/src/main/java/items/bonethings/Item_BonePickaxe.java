package items.bonethings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class Item_BonePickaxe extends ItemPickaxe {

	public Item_BonePickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONEPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
