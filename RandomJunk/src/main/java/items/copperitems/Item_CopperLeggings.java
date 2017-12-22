package items.copperitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_CopperLeggings extends ItemArmor {

	public Item_CopperLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.COPPERLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERLEGGINGS.getRegistryName());
	}

}
