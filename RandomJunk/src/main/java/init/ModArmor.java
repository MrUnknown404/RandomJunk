package init;

import com.mrunknown404.randomjunk.Reference;

import items.boneitems.Item_BoneBoots;
import items.boneitems.Item_BoneChestplate;
import items.boneitems.Item_BoneHelmet;
import items.boneitems.Item_BoneLeggings;
import items.flintitems.Item_FlintBoots;
import items.flintitems.Item_FlintChestplate;
import items.flintitems.Item_FlintHelmet;
import items.flintitems.Item_FlintLeggings;
import items.obsidianitems.Item_ObsidianBoots;
import items.obsidianitems.Item_ObsidianChestplate;
import items.obsidianitems.Item_ObsidianHelmet;
import items.obsidianitems.Item_ObsidianLeggings;
import items.steelitems.Item_SteelBoots;
import items.steelitems.Item_SteelChestplate;
import items.steelitems.Item_SteelHelmet;
import items.steelitems.Item_SteelLeggings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
	//Texture, Durability, Damage Reduction, Enchantability, SoundEvent, Toughness
	
	public static ArmorMaterial ARMMAT_OBSIDIAN = EnumHelper.addArmorMaterial("ARMMAT_OBSIDIAN",  Reference.MOD_ID+":obsidian", 44 , new int[]{4, 6, 8, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0f);
	public static ArmorMaterial ARMMAT_BONE = EnumHelper.addArmorMaterial("ARMMAT_BONE",  Reference.MOD_ID+":bone", 18 , new int[]{3, 5, 6, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f);
	public static ArmorMaterial ARMMAT_FLINT = EnumHelper.addArmorMaterial("ARMMAT_FLINT",  Reference.MOD_ID+":flint", 9 , new int[]{2, 3, 4, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static ArmorMaterial ARMMAT_STEEL = EnumHelper.addArmorMaterial("ARMMAT_STEEL",  Reference.MOD_ID+":steel", 24 , new int[]{2, 4, 5, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f);
	//Items
	//Obsidian
	public static ItemArmor ObsidianHelmet;
	public static ItemArmor ObsidianChestplate;
	public static ItemArmor ObsidianLeggings;
	public static ItemArmor ObsidianBoots;
	
	//Steel
	public static ItemArmor SteelHelmet;
	public static ItemArmor SteelChestplate;
	public static ItemArmor SteelLeggings;
	public static ItemArmor SteelBoots;
	
	//Bone
	public static ItemArmor BoneHelmet;
	public static ItemArmor BoneChestplate;
	public static ItemArmor BoneLeggings;
	public static ItemArmor BoneBoots;

	//Flint
	public static ItemArmor FlintHelmet;
	public static ItemArmor FlintChestplate;
	public static ItemArmor FlintLeggings;
	public static ItemArmor FlintBoots;

	public static void Init() {
		//Obsidian
		ObsidianHelmet = new Item_ObsidianHelmet(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
		ObsidianChestplate = new Item_ObsidianChestplate(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
		ObsidianLeggings = new Item_ObsidianLeggings(ARMMAT_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
		ObsidianBoots = new Item_ObsidianBoots(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
		
		//Steel
		SteelHelmet = new Item_SteelHelmet(ARMMAT_STEEL, 1, EntityEquipmentSlot.HEAD);
		SteelChestplate = new Item_SteelChestplate(ARMMAT_STEEL, 1, EntityEquipmentSlot.CHEST);
		SteelLeggings = new Item_SteelLeggings(ARMMAT_STEEL, 2, EntityEquipmentSlot.LEGS);
		SteelBoots = new Item_SteelBoots(ARMMAT_STEEL, 1, EntityEquipmentSlot.FEET);
		
		//Bone
		BoneHelmet = new Item_BoneHelmet(ARMMAT_BONE, 1, EntityEquipmentSlot.HEAD);
		BoneChestplate = new Item_BoneChestplate(ARMMAT_BONE, 1, EntityEquipmentSlot.CHEST);
		BoneLeggings = new Item_BoneLeggings(ARMMAT_BONE, 2, EntityEquipmentSlot.LEGS);
		BoneBoots = new Item_BoneBoots(ARMMAT_BONE, 1, EntityEquipmentSlot.FEET);

		//Flint
		FlintHelmet = new Item_FlintHelmet(ARMMAT_FLINT, 1, EntityEquipmentSlot.HEAD);
		FlintChestplate = new Item_FlintChestplate(ARMMAT_FLINT, 1, EntityEquipmentSlot.CHEST);
		FlintLeggings = new Item_FlintLeggings(ARMMAT_FLINT, 2, EntityEquipmentSlot.LEGS);
		FlintBoots = new Item_FlintBoots(ARMMAT_FLINT, 1, EntityEquipmentSlot.FEET);

	}
	public static void Register() {
		//Obsidian
		GameRegistry.register(ObsidianHelmet);
		GameRegistry.register(ObsidianChestplate);
		GameRegistry.register(ObsidianLeggings);
		GameRegistry.register(ObsidianBoots);
		
		//Steel
		GameRegistry.register(SteelHelmet);
		GameRegistry.register(SteelChestplate);
		GameRegistry.register(SteelLeggings);
		GameRegistry.register(SteelBoots);
		
		//Bone
		GameRegistry.register(BoneHelmet);
		GameRegistry.register(BoneChestplate);
		GameRegistry.register(BoneLeggings);
		GameRegistry.register(BoneBoots);

		//Flint
		GameRegistry.register(FlintHelmet);
		GameRegistry.register(FlintChestplate);
		GameRegistry.register(FlintLeggings);
		GameRegistry.register(FlintBoots);

	}
	public static void RegisterRenders() {
		//Obsidian
		registerRender(ObsidianHelmet);
		registerRender(ObsidianChestplate);
		registerRender(ObsidianLeggings);
		registerRender(ObsidianBoots);
		
		//Steel
		registerRender(SteelHelmet);
		registerRender(SteelChestplate);
		registerRender(SteelLeggings);
		registerRender(SteelBoots);
		
		//Bone
		registerRender(BoneHelmet);
		registerRender(BoneChestplate);
		registerRender(BoneLeggings);
		registerRender(BoneBoots);

		//Flint
		registerRender(FlintHelmet);
		registerRender(FlintChestplate);
		registerRender(FlintLeggings);
		registerRender(FlintBoots);

	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
