package items.boneitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_BoneChestplate extends ItemArmor {

	public Item_BoneChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.BONECHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONECHESTPLATE.getRegistryName());
	}

}
