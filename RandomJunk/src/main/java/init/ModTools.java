package init;

import com.mrunknown404.randomjunk.Reference;

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
	
	//Items
	public static Item ObsidianShovel;
	public static Item ObsidianPickaxe;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	public static Item ObsidianSword;
	
	public static void init() {
		ObsidianShovel = new 		Item_ObsidianShovel(MAT_OBSIDIAN);
		ObsidianPickaxe = new 		Item_ObsidianPickaxe(MAT_OBSIDIAN);
		ObsidianAxe = new 		Item_ObsidianAxe(MAT_OBSIDIAN, 9.0f, -3.2f); //Damage(+1), Attack Speed
		ObsidianHoe = new 		Item_ObsidianHoe(MAT_OBSIDIAN);
		ObsidianSword = new 		Item_ObsidianSword(MAT_OBSIDIAN);
	}
	public static void register() {
		GameRegistry.register(ObsidianShovel);
		GameRegistry.register(ObsidianPickaxe);
		GameRegistry.register(ObsidianAxe);
		GameRegistry.register(ObsidianHoe);
		GameRegistry.register(ObsidianSword);
	}
	public static void registerRenders() {
		registerRender(ObsidianShovel);
		registerRender(ObsidianPickaxe);
		registerRender(ObsidianAxe);
		registerRender(ObsidianHoe);
		registerRender(ObsidianSword);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
