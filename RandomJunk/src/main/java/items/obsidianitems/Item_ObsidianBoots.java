package items.obsidianitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_ObsidianBoots extends ItemArmor {

	public Item_ObsidianBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANBOOTS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANBOOTS.getRegistryName());
	}

}
