package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_SteelChestplate extends ItemArmor {

	public Item_SteelChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.STEELCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELCHESTPLATE.getRegistryName());
	}

}
