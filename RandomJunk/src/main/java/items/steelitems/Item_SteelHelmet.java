package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_SteelHelmet extends ItemArmor {

	public Item_SteelHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.STEELHELMET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELHELMET.getRegistryName());
	}

}
