package items.obsidianthings;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_ObsidianChestplate extends ItemArmor {

	public Item_ObsidianChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANCHESTPLATE.getRegistryName());
	}

}
