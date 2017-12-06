package items.flintthings;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_FlintBoots extends ItemArmor {

	public Item_FlintBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.FLINTBOOTS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTBOOTS.getRegistryName());
	}

}
