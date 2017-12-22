package items.copperitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_CopperChestplate extends ItemArmor {

	public Item_CopperChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.COPPERCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERCHESTPLATE.getRegistryName());
	}

}
