package items.obsidianitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class Item_ObsidianPickaxe extends ItemPickaxe {

	public Item_ObsidianPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANPICKAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
