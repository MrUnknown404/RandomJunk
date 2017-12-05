package items.bonethings;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_BoneHelmet extends ItemArmor {

	public Item_BoneHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.BONEHELMET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONEHELMET.getRegistryName());
	}

}
