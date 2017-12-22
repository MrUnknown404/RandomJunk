package items.tinitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_TinHelmet extends ItemArmor {

	public Item_TinHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.TINHELMET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.TINHELMET.getRegistryName());
	}

}
