package items.bonethings;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_BoneBoots extends ItemArmor {

	public Item_BoneBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.BONEBOOTS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEBOOTS.getRegistryName());
	}

}
