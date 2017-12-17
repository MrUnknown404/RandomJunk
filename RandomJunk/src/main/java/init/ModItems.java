package init;

import net.minecraftforge.common.util.EnumHelper;
import items.apples.Item_AppleApple;
import items.apples.Item_BlazeApple;
import items.apples.Item_ClayApple;
import items.apples.Item_CoalApple;
import items.apples.Item_DiamondApple;
import items.apples.Item_EmeraldApple;
import items.apples.Item_EnderPearlApple;
import items.apples.Item_FlintApple;
import items.apples.Item_GlowstoneApple;
import items.apples.Item_GunpowderApple;
import items.apples.Item_InkApple;
import items.apples.Item_IronApple;
import items.apples.Item_LapisApple;
import items.apples.Item_LeatherApple;
import items.apples.Item_MagmaCreamApple;
import items.apples.Item_ObsidianApple;
import items.apples.Item_PaperApple;
import items.apples.Item_PrismarineApple;
import items.apples.Item_QuartzApple;
import items.apples.Item_RedstoneApple;
import items.apples.Item_RottenFleshApple;
import items.apples.Item_SlimeApple;
import items.bonethings.Item_BoneIngot;
import items.bonethings.Item_BoneMix;
import items.flintthings.Item_FlintIngot;
import items.obsidianthings.Item_ObsidianIngot;
import items.obsidianthings.Item_ObsidianShard;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	//Apples
	public static Item AppleApple;
	public static Item BlazeApple;
	public static Item ClayApple;
	public static Item CoalApple;
	public static Item DiamondApple;
	public static Item EmeraldApple;
	public static Item EnderPearlApple;
	public static Item FlintApple;
	public static Item GlowstoneApple;
	public static Item GunpowderApple;
	public static Item InkApple;
	public static Item IronApple;
	public static Item LapisApple;
	public static Item LeatherApple;
	public static Item MagmaCreamApple;
	public static Item ObsidianApple;
	public static Item PaperApple;
	public static Item PrismarineApple;
	public static Item QuartzApple;
	public static Item RedstoneApple;
	public static Item RottenFleshApple;
	public static Item SlimeApple;

	//Obsidian Items
	public static Item ObsidianIngot;
	public static Item ObsidianShard;

	//Bone Items
	public static Item BoneIngot;
	public static Item BoneMix;

	//Flint Items
	public static Item FlintIngot;

	public static void Init() {
		//Apples
		AppleApple = new Item_AppleApple();
		BlazeApple = new Item_BlazeApple();
		ClayApple = new Item_ClayApple();
		CoalApple = new Item_CoalApple();
		DiamondApple = new Item_DiamondApple();
		EmeraldApple = new Item_EmeraldApple();
		EnderPearlApple = new Item_EnderPearlApple();
		FlintApple = new Item_FlintApple();
		GlowstoneApple = new Item_GlowstoneApple();
		GunpowderApple = new Item_GunpowderApple();
		InkApple = new Item_InkApple();
		IronApple = new Item_IronApple();
		LapisApple = new Item_LapisApple();
		LeatherApple = new Item_LeatherApple();
		MagmaCreamApple = new Item_MagmaCreamApple();
		ObsidianApple = new Item_ObsidianApple();
		PaperApple = new Item_PaperApple();
		PrismarineApple = new Item_PrismarineApple();
		QuartzApple = new Item_QuartzApple();
		RedstoneApple = new Item_RedstoneApple();
		RottenFleshApple = new Item_RottenFleshApple();
		SlimeApple = new Item_SlimeApple();

		//Obsidian Things
		ObsidianIngot = new Item_ObsidianIngot();
		ObsidianShard = new Item_ObsidianShard();

		//Bone Things
		BoneIngot = new Item_BoneIngot();
		BoneMix = new Item_BoneMix();

		//Flint Things
		FlintIngot = new Item_FlintIngot();

	}
	public static void Register() {
		//-//Register Items
		//Apples
		GameRegistry.register(AppleApple);
		GameRegistry.register(BlazeApple);
		GameRegistry.register(ClayApple);
		GameRegistry.register(CoalApple);
		GameRegistry.register(DiamondApple);
		GameRegistry.register(EmeraldApple);
		GameRegistry.register(EnderPearlApple);
		GameRegistry.register(FlintApple);
		GameRegistry.register(GlowstoneApple);
		GameRegistry.register(GunpowderApple);
		GameRegistry.register(InkApple);
		GameRegistry.register(IronApple);
		GameRegistry.register(LapisApple);
		GameRegistry.register(LeatherApple);
		GameRegistry.register(MagmaCreamApple);
		GameRegistry.register(ObsidianApple);
		GameRegistry.register(PaperApple);
		GameRegistry.register(PrismarineApple);
		GameRegistry.register(QuartzApple);
		GameRegistry.register(RedstoneApple);
		GameRegistry.register(RottenFleshApple);
		GameRegistry.register(SlimeApple);

		//Obsidian Items
		GameRegistry.register(ObsidianShard);
		GameRegistry.register(ObsidianIngot);

		//Bone Items
		GameRegistry.register(BoneIngot);

		//Flint Items
		GameRegistry.register(FlintIngot);

		//Misc
		GameRegistry.register(BoneMix);
		
	}
	public static void RegisterRenders() {
		//-//Register Render Items
		//Apples
		registerRender(AppleApple);
		registerRender(BlazeApple);
		registerRender(ClayApple);
		registerRender(CoalApple);
		registerRender(DiamondApple);
		registerRender(EmeraldApple);
		registerRender(EnderPearlApple);
		registerRender(FlintApple);
		registerRender(GlowstoneApple);
		registerRender(GunpowderApple);
		registerRender(InkApple);
		registerRender(IronApple);
		registerRender(LapisApple);
		registerRender(LeatherApple);
		registerRender(MagmaCreamApple);
		registerRender(ObsidianApple);
		registerRender(PaperApple);
		registerRender(PrismarineApple);
		registerRender(QuartzApple);
		registerRender(RedstoneApple);
		registerRender(RottenFleshApple);
		registerRender(SlimeApple);

		//Obsidian Items
		registerRender(ObsidianIngot);
		registerRender(ObsidianShard);

		//Bone Items
		registerRender(BoneIngot);
		registerRender(BoneMix);

		//Flint Items
		registerRender(FlintIngot);
		
	}
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
