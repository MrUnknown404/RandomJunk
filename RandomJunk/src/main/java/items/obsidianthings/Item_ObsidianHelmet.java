package items.obsidianthings;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_ObsidianHelmet extends ItemArmor {

	public Item_ObsidianHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANHELMET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANHELMET.getRegistryName());
	}

}
