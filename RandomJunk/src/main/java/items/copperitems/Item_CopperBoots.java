package items.copperitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_CopperBoots extends ItemArmor {

	public Item_CopperBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.COPPERBOOTS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERBOOTS.getRegistryName());
	}

}
