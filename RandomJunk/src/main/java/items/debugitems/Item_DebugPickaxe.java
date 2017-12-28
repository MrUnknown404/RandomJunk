package items.debugitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.item.ItemPickaxe;

public class Item_DebugPickaxe extends ItemPickaxe {

	public Item_DebugPickaxe(ToolMaterial material) {
		super(material);
		//Get Names
		setUnlocalizedName(Reference.RandomJunkItems.DEBUGPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.DEBUGPICKAXE.getRegistryName());
	}
}
