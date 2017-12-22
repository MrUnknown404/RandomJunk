package items.copperitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class Item_CopperAxe extends ItemAxe {

	public Item_CopperAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.COPPERAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
