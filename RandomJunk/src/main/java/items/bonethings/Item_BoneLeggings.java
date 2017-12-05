package items.bonethings;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_BoneLeggings extends ItemArmor {

	public Item_BoneLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.BONELEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.BONELEGGINGS.getRegistryName());
	}

}
