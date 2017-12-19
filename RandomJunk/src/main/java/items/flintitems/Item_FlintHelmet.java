package items.flintitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_FlintHelmet extends ItemArmor {

	public Item_FlintHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.FLINTHELMET.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTHELMET.getRegistryName());
	}

}
