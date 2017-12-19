package items.flintitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_FlintLeggings extends ItemArmor {

	public Item_FlintLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.FLINTLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.FLINTLEGGINGS.getRegistryName());
	}

}
