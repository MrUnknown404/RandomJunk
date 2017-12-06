package items.flintthings;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_FlintChestplate extends ItemArmor {

	public Item_FlintChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.FLINTCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTCHESTPLATE.getRegistryName());
	}

}
