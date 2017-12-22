package items.tinitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_TinChestplate extends ItemArmor {

	public Item_TinChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.TINCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINCHESTPLATE.getRegistryName());
	}

}
