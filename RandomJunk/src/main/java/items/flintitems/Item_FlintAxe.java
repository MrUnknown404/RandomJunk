package items.flintitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class Item_FlintAxe extends ItemAxe {

	public Item_FlintAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.FLINTAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
