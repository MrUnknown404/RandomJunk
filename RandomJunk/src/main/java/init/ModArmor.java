package init;

import com.mrunknown404.randomjunk.Reference;

import items.bonethings.Item_BoneBoots;
import items.bonethings.Item_BoneChestplate;
import items.bonethings.Item_BoneHelmet;
import items.bonethings.Item_BoneLeggings;
import items.flintthings.Item_FlintBoots;
import items.flintthings.Item_FlintChestplate;
import items.flintthings.Item_FlintHelmet;
import items.flintthings.Item_FlintLeggings;
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
	
	public static ArmorMaterial ARMMAT_OBSIDIAN = EnumHelper.addArmorMaterial("ARMMAT_OBSIDIAN",  Reference.MOD_ID+":obsidian", 44 , new int[]{4, 6, 8, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0f); //Texture, Durability, Damage Reduction, Enchantability, SoundEvent, Toughness
	public static ArmorMaterial ARMMAT_BONE = EnumHelper.addArmorMaterial("ARMMAT_BONE",  Reference.MOD_ID+":bone", 16 , new int[]{3, 5, 6, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f); //Texture, Durability, Damage Reduction, Enchantability, SoundEvent, Toughness
	public static ArmorMaterial ARMMAT_FLINT = EnumHelper.addArmorMaterial("ARMMAT_FLINT",  Reference.MOD_ID+":flint", 9 , new int[]{2, 3, 4, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f); //Texture, Durability, Damage Reduction, Enchantability, SoundEvent, Toughness
	
	//Items
	//Obsidian
	public static ItemArmor ObsidianHelmet;
	public static ItemArmor ObsidianChestplate;
	public static ItemArmor ObsidianLeggings;
	public static ItemArmor ObsidianBoots;
	
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
	
	public static void init() {
		//Obsidian
		ObsidianHelmet = new 			Item_ObsidianHelmet(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
		ObsidianChestplate = new 	Item_ObsidianChestplate(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
		ObsidianLeggings = new 		Item_ObsidianLeggings(ARMMAT_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
		ObsidianBoots = new 			Item_ObsidianBoots(ARMMAT_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
		
		//Bone
		BoneHelmet = new 				Item_BoneHelmet(ARMMAT_BONE, 1, EntityEquipmentSlot.HEAD);
		BoneChestplate = new 			Item_BoneChestplate(ARMMAT_BONE, 1, EntityEquipmentSlot.CHEST);
		BoneLeggings = new 				Item_BoneLeggings(ARMMAT_BONE, 2, EntityEquipmentSlot.LEGS);
		BoneBoots = new 					Item_BoneBoots(ARMMAT_BONE, 1, EntityEquipmentSlot.FEET);
		
		//Flint
		FlintHelmet = new 					Item_FlintHelmet(ARMMAT_FLINT, 1, EntityEquipmentSlot.HEAD);
		FlintChestplate = new 			Item_FlintChestplate(ARMMAT_FLINT, 1, EntityEquipmentSlot.CHEST);
		FlintLeggings = new 				Item_FlintLeggings(ARMMAT_FLINT, 2, EntityEquipmentSlot.LEGS);
		FlintBoots = new 					Item_FlintBoots(ARMMAT_FLINT, 1, EntityEquipmentSlot.FEET);
		
	}
	public static void register() {
		//Obsidian
		GameRegistry.register(ObsidianHelmet);
		GameRegistry.register(ObsidianChestplate);
		GameRegistry.register(ObsidianLeggings);
		GameRegistry.register(ObsidianBoots);
		
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
	public static void registerRenders() {
		//Obsidian
		registerRender(ObsidianHelmet);
		registerRender(ObsidianChestplate);
		registerRender(ObsidianLeggings);
		registerRender(ObsidianBoots);
		
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
