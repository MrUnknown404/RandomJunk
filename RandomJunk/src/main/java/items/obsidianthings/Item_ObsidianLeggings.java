package items.obsidianthings;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_ObsidianLeggings extends ItemArmor {

	public Item_ObsidianLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.RandomJunkItems.OBSIDIANLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkItems.OBSIDIANLEGGINGS.getRegistryName());
	}

}
