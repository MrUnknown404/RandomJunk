package items.copperitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_CopperHelmet extends ItemArmor {

	public Item_CopperHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.COPPERHELMET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.COPPERHELMET.getRegistryName());
	}

}
