package init;

import com.mrunknown404.randomjunk.Reference;

import items.obsidianthings.Item_ObsidianBoots;
import items.obsidianthings.Item_ObsidianChestplate;
import items.obsidianthings.Item_ObsidianHelmet;
import items.obsidianthings.Item_ObsidianLeggings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {
	
	//durability * 11 for the helmet
	//durability * 16 for the chestplate
	//durability * 15 for the leggings
	//durability * 13 for the boots
	
	public static ArmorMaterial ARMMAT_OBSIDIAN = EnumHelper.addArmorMaterial("ARMMAT_OBSIDIAN",  Reference.MOD_ID+":obsidian", 44 , new int[]{4, 8, 6, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0f); //Texture, Durability, Damage Reduction, Enchantability, SoundEvent, Toughness
	
	//Items
	public static ItemArmor ObsidianHelmet;
	public static ItemArmor ObsidianChestplate;
	public static ItemArmor ObsidianLeggings;
	public static ItemArmor ObsidianBoots;
	
	public static void init() {
		ObsidianHelmet = new 		Item_ObsidianHelmet(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
		ObsidianChestplate = new 	Item_ObsidianChestplate(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
		ObsidianLeggings = new 	Item_ObsidianLeggings(ARMMAT_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
		ObsidianBoots = new 		Item_ObsidianBoots(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
	}
	public static void register() {
		GameRegistry.register(ObsidianHelmet);
		GameRegistry.register(ObsidianChestplate);
		GameRegistry.register(ObsidianLeggings);
		GameRegistry.register(ObsidianBoots);
	}
	public static void registerRenders() {
		registerRender(ObsidianHelmet);
		registerRender(ObsidianChestplate);
		registerRender(ObsidianLeggings);
		registerRender(ObsidianBoots);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
