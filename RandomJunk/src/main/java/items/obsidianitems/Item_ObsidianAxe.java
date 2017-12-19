package items.obsidianitems;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class Item_ObsidianAxe extends ItemAxe {

	public Item_ObsidianAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
