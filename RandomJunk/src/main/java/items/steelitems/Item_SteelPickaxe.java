package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class Item_SteelPickaxe extends ItemPickaxe {

	public Item_SteelPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
