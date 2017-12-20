package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_SteelLeggings extends ItemArmor {

	public Item_SteelLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.STEELLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELLEGGINGS.getRegistryName());
	}

}
