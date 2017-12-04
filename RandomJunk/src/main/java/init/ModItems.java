package init;

import items.ItemBlazeApple;
import items.ItemCoalApple;
import items.ItemDiamondApple;
import items.ItemEmeraldApple;
import items.ItemGunpowderApple;
import items.ItemIronApple;
import items.ItemLapisApple;
import items.ItemObsidianIngot;
import items.ItemPrismarineApple;
import items.ItemQuartzApple;
import items.ItemRedstoneApple;
import items.ItemSlimeApple;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Apples
	public static Item BlazeApple;
	public static Item CoalApple;
	public static Item DiamondApple;
	public static Item EmeraldApple;
	public static Item GunpowderApple;
	public static Item IronApple;
	public static Item LapisApple;
	public static Item PrismarineApple;
	public static Item QuartzApple;
	public static Item RedstoneApple;
	public static Item SlimeApple;
	
	//Obsidian Stuff
	public static Item ObsidianIngot;
	
	public static void init() {
		//Apples
		BlazeApple = new 		ItemBlazeApple();
		CoalApple = new 		ItemCoalApple();
		DiamondApple = new 	ItemDiamondApple();
		EmeraldApple = new 	ItemEmeraldApple();
		GunpowderApple = new ItemGunpowderApple();
		IronApple = new 		ItemIronApple();
		LapisApple = new		ItemLapisApple();
		PrismarineApple = new  ItemPrismarineApple();
		QuartzApple = new		ItemQuartzApple();
		RedstoneApple = new	ItemRedstoneApple();
		SlimeApple = new 		ItemSlimeApple();
		//Obsidian Stuff
		ObsidianIngot = new 	ItemObsidianIngot();
	}
	public static void register() {
		//-//Register Items
		//Apples
		GameRegistry.register(BlazeApple);
		GameRegistry.register(CoalApple);
		GameRegistry.register(DiamondApple);
		GameRegistry.register(EmeraldApple);
		GameRegistry.register(GunpowderApple);
		GameRegistry.register(IronApple);
		GameRegistry.register(LapisApple);
		GameRegistry.register(PrismarineApple);
		GameRegistry.register(QuartzApple);
		GameRegistry.register(RedstoneApple);
		GameRegistry.register(SlimeApple);
		//Obsidian Stuff
		GameRegistry.register(ObsidianIngot);
	}
	public static void registerRenders() {
		//-//Register Render Items
		//Apples
		registerRender(BlazeApple);
		registerRender(CoalApple);
		registerRender(DiamondApple);
		registerRender(EmeraldApple);
		registerRender(GunpowderApple);
		registerRender(IronApple);
		registerRender(LapisApple);
		registerRender(PrismarineApple);
		registerRender(QuartzApple);
		registerRender(RedstoneApple);
		registerRender(SlimeApple);
		//Obsidian Stuff
		registerRender(ObsidianIngot);
	}
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
