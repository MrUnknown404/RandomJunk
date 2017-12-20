package init;

import com.mrunknown404.randomjunk.handlers.ConfigHandler;

import items.boneitems.Item_BoneAxe;
import items.boneitems.Item_BoneHoe;
import items.boneitems.Item_BonePickaxe;
import items.boneitems.Item_BoneShovel;
import items.boneitems.Item_BoneSword;
import items.debugitems.Item_DebugPickaxe;
import items.flintitems.Item_FlintAxe;
import items.flintitems.Item_FlintHoe;
import items.flintitems.Item_FlintPickaxe;
import items.flintitems.Item_FlintShovel;
import items.flintitems.Item_FlintSword;
import items.obsidianitems.Item_ObsidianAxe;
import items.obsidianitems.Item_ObsidianHoe;
import items.obsidianitems.Item_ObsidianPickaxe;
import items.obsidianitems.Item_ObsidianShovel;
import items.obsidianitems.Item_ObsidianSword;
import items.steelitems.Item_SteelAxe;
import items.steelitems.Item_SteelHoe;
import items.steelitems.Item_SteelPickaxe;
import items.steelitems.Item_SteelShovel;
import items.steelitems.Item_SteelSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	//HarvestLevel, Durability, Mining Speed, Damage, Enchantability
	
	public static ToolMaterial MAT_OBSIDIAN = EnumHelper.addToolMaterial("MAT_OBSIDIAN", 4, 2341, 11.0f, 4.0f, 12);
	public static ToolMaterial MAT_BONE = EnumHelper.addToolMaterial("MAT_BONE", 2, 333, 6.0f, 2.0f, 8);
	public static ToolMaterial MAT_FLINT = EnumHelper.addToolMaterial("MAT_FLINT", 1, 188, 4.0f, 2.0f, 8);
	public static ToolMaterial MAT_STEEL = EnumHelper.addToolMaterial("MAT_STEEL", 2, 320, 5.0F, 2.0F, 13);
	
	public static ToolMaterial MAT_DEBUG = EnumHelper.addToolMaterial("MAT_DEBUG", 5, -1, 500.0f, 99.0f, 0);
	
	//Items
	public static Item ObsidianShovel;
	public static Item ObsidianPickaxe;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	public static Item ObsidianSword;
	
	public static Item SteelShovel;
	public static Item SteelPickaxe;
	public static Item SteelAxe;
	public static Item SteelHoe;
	public static Item SteelSword;
	
	public static Item BoneShovel;
	public static Item BonePickaxe;
	public static Item BoneAxe;
	public static Item BoneHoe;
	public static Item BoneSword;
	
	public static Item FlintShovel;
	public static Item FlintPickaxe;
	public static Item FlintAxe;
	public static Item FlintHoe;
	public static Item FlintSword;
	
	public static Item DebugPickaxe;
	
	public static void Init() {
		//Obsidian
		ObsidianShovel = new Item_ObsidianShovel(MAT_OBSIDIAN);
		ObsidianPickaxe = new Item_ObsidianPickaxe(MAT_OBSIDIAN);
		ObsidianAxe = new Item_ObsidianAxe(MAT_OBSIDIAN, 9.0f, -3.2f); //Damage(+1), Attack Speed
		ObsidianHoe = new Item_ObsidianHoe(MAT_OBSIDIAN);
		ObsidianSword = new Item_ObsidianSword(MAT_OBSIDIAN);
		
		//Steel
		SteelShovel = new Item_SteelShovel(MAT_STEEL);
		SteelPickaxe = new Item_SteelPickaxe(MAT_STEEL);
		SteelAxe = new Item_SteelAxe(MAT_STEEL, 7.0f, -3.2f); //Damage(+1), Attack Speed
		SteelHoe = new Item_SteelHoe(MAT_STEEL);
		SteelSword = new Item_SteelSword(MAT_STEEL);
		
		//Bone
		BoneShovel = new Item_BoneShovel(MAT_BONE);
		BonePickaxe = new Item_BonePickaxe(MAT_BONE);
		BoneAxe = new Item_BoneAxe(MAT_BONE, 8.0f, -3.2f); //Damage(+1), Attack Speed
		BoneHoe = new Item_BoneHoe(MAT_BONE);
		BoneSword = new Item_BoneSword(MAT_BONE);
		
		//Flint
		FlintShovel = new Item_FlintShovel(MAT_FLINT);
		FlintPickaxe = new Item_FlintPickaxe(MAT_FLINT);
		FlintAxe = new Item_FlintAxe(MAT_FLINT, 7.0f, -3.2f); //Damage(+1), Attack Speed
		FlintHoe = new Item_FlintHoe(MAT_FLINT);
		FlintSword = new Item_FlintSword(MAT_FLINT);
		
		DebugPickaxe = new Item_DebugPickaxe(MAT_DEBUG);
	}
	public static void Register() {
		//Obsidian
		GameRegistry.register(ObsidianShovel);
		GameRegistry.register(ObsidianPickaxe);
		GameRegistry.register(ObsidianAxe);
		GameRegistry.register(ObsidianHoe);
		GameRegistry.register(ObsidianSword);
		
		//Steel
		GameRegistry.register(SteelShovel);
		GameRegistry.register(SteelPickaxe);
		GameRegistry.register(SteelAxe);
		GameRegistry.register(SteelHoe);
		GameRegistry.register(SteelSword);
		
		//Bone
		GameRegistry.register(BoneShovel);
		GameRegistry.register(BonePickaxe);
		GameRegistry.register(BoneAxe);
		GameRegistry.register(BoneHoe);
		GameRegistry.register(BoneSword);
		
		//Flint
		GameRegistry.register(FlintShovel);
		GameRegistry.register(FlintPickaxe);
		GameRegistry.register(FlintAxe);
		GameRegistry.register(FlintHoe);
		GameRegistry.register(FlintSword);
		
		//Debug Items
		if (ConfigHandler.DebugItems == true) {
			GameRegistry.register(DebugPickaxe);
		}
		
	}
	public static void RegisterRenders() {
		//Obsidian
		registerRender(ObsidianShovel);
		registerRender(ObsidianPickaxe);
		registerRender(ObsidianAxe);
		registerRender(ObsidianHoe);
		registerRender(ObsidianSword);
		
		//Steel
		registerRender(SteelShovel);
		registerRender(SteelPickaxe);
		registerRender(SteelAxe);
		registerRender(SteelHoe);
		registerRender(SteelSword);
		
		//Bone
		registerRender(BoneShovel);
		registerRender(BonePickaxe);
		registerRender(BoneAxe);
		registerRender(BoneHoe);
		registerRender(BoneSword);
		 
		//Flint
		registerRender(FlintShovel);
		registerRender(FlintPickaxe);
		registerRender(FlintAxe);
		registerRender(FlintHoe);
		registerRender(FlintSword);
		
		registerRender(DebugPickaxe);
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
