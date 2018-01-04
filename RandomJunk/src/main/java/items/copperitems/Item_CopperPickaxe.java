package items.copperitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class Item_CopperPickaxe extends ItemPickaxe {

	public Item_CopperPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
