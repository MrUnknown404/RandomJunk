package items.tinitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class Item_TinPickaxe extends ItemPickaxe {

	public Item_TinPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TINPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
