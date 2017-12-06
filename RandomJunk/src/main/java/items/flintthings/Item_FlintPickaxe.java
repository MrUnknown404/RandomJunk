package items.flintthings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class Item_FlintPickaxe extends ItemPickaxe {

	public Item_FlintPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.FLINTPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}

}
