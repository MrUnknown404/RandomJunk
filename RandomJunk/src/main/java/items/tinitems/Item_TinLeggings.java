package items.tinitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_TinLeggings extends ItemArmor {

	public Item_TinLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.TINLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINLEGGINGS.getRegistryName());
	}

}
