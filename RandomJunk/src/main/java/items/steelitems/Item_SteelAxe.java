package items.steelitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class Item_SteelAxe extends ItemAxe {

	public Item_SteelAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.STEELAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
