package init;

import com.mrunknown404.randomjunk.Reference;

import items.bonethings.Item_BoneAxe;
import items.bonethings.Item_BoneHoe;
import items.bonethings.Item_BonePickaxe;
import items.bonethings.Item_BoneShovel;
import items.bonethings.Item_BoneSword;
import items.obsidianthings.Item_ObsidianAxe;
import items.obsidianthings.Item_ObsidianHoe;
import items.obsidianthings.Item_ObsidianPickaxe;
import items.obsidianthings.Item_ObsidianShovel;
import items.obsidianthings.Item_ObsidianSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	public static ToolMaterial MAT_OBSIDIAN = EnumHelper.addToolMaterial("MAT_OBSIDIAN", 4, 2341, 10.0f, 4.0f, 12); //HarvestLevel, Durability, Mining Speed, Damage, Enchantability
	public static ToolMaterial MAT_BONE = EnumHelper.addToolMaterial("MAT_BONE", 2, 333, 6.0f, 2.0f, 8); //HarvestLevel, Durability, Mining Speed, Damage, Enchantability
	
	//Items
	public static Item ObsidianShovel;
	public static Item ObsidianPickaxe;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	public static Item ObsidianSword;
	
	public static Item BoneShovel;
	public static Item BonePickaxe;
	public static Item BoneAxe;
	public static Item BoneHoe;
	public static Item BoneSword;
	
	public static void init() {
		//Obsidian
		ObsidianShovel = new 		Item_ObsidianShovel(MAT_OBSIDIAN);
		ObsidianPickaxe = new 		Item_ObsidianPickaxe(MAT_OBSIDIAN);
		ObsidianAxe = new 		Item_ObsidianAxe(MAT_OBSIDIAN, 9.0f, -3.2f); //Damage(+1), Attack Speed
		ObsidianHoe = new 		Item_ObsidianHoe(MAT_OBSIDIAN);
		ObsidianSword = new 		Item_ObsidianSword(MAT_OBSIDIAN);
		
		//Bone
		BoneShovel = new 			Item_BoneShovel(MAT_BONE);
		BonePickaxe = new 		Item_BonePickaxe(MAT_BONE);
		BoneAxe = new 			Item_BoneAxe(MAT_BONE, 5.0f, -3.2f); //Damage(+1), Attack Speed
		BoneHoe = new 			Item_BoneHoe(MAT_BONE);
		BoneSword = new 			Item_BoneSword(MAT_BONE);
	}
	public static void register() {
		//Obsidian
		GameRegistry.register(ObsidianShovel);
		GameRegistry.register(ObsidianPickaxe);
		GameRegistry.register(ObsidianAxe);
		GameRegistry.register(ObsidianHoe);
		GameRegistry.register(ObsidianSword);
		
		//Bone
		GameRegistry.register(BoneShovel);
		GameRegistry.register(BonePickaxe);
		GameRegistry.register(BoneAxe);
		GameRegistry.register(BoneHoe);
		GameRegistry.register(BoneSword);
		
	}
	public static void registerRenders() {
		//Obsidian
		registerRender(ObsidianShovel);
		registerRender(ObsidianPickaxe);
		registerRender(ObsidianAxe);
		registerRender(ObsidianHoe);
		registerRender(ObsidianSword);
		
		//Bone
		registerRender(BoneShovel);
		registerRender(BonePickaxe);
		registerRender(BoneAxe);
		registerRender(BoneHoe);
		registerRender(BoneSword);
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
