package items.steelitems;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_SteelBoots extends ItemArmor {

	public Item_SteelBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.STEELBOOTS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.STEELBOOTS.getRegistryName());
	}

}
