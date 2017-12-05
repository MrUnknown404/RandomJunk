package items.bonethings;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class Item_BoneAxe extends ItemAxe {

	public Item_BoneAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.BONEAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEAXE.getRegistryName());
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
