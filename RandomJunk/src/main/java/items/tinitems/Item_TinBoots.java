package items.tinitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_TinBoots extends ItemArmor {

	public Item_TinBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.TINBOOTS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINBOOTS.getRegistryName());
	}

}
