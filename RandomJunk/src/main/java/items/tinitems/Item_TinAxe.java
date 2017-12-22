package items.tinitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class Item_TinAxe extends ItemAxe {

	public Item_TinAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.TINAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
