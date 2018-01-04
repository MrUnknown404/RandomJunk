package init;

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
import items.boneitems.Item_BoneIngot;
import items.boneitems.Item_BoneMix;
import items.copperitems.Item_CopperIngot;
import items.copperitems.Item_CopperNugget;
import items.flintitems.Item_FlintIngot;
import items.obsidianitems.Item_ObsidianIngot;
import items.obsidianitems.Item_ObsidianShard;
import items.steelitems.Item_SteelIngot;
import items.steelitems.Item_SteelNugget;
import items.tinitems.Item_TinIngot;
import items.tinitems.Item_TinNugget;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

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

	//Misc
	public static Item ObsidianShard;
	public static Item BoneMix;

	//Ingots
	public static Item ObsidianIngot;
	public static Item SteelIngot;
	public static Item CopperIngot;
	public static Item BoneIngot;
	public static Item TinIngot;
	public static Item FlintIngot;
	
	//Nuggets
	public static Item SteelNugget;
	public static Item TinNugget;
	public static Item CopperNugget;

	public static void Init() {
		//Apples
		AppleApple =       new Item_AppleApple();
		BlazeApple =       new Item_BlazeApple();
		ClayApple =        new Item_ClayApple();
		CoalApple =        new Item_CoalApple();
		DiamondApple =     new Item_DiamondApple();
		EmeraldApple =     new Item_EmeraldApple();
		EnderPearlApple =  new Item_EnderPearlApple();
		FlintApple =       new Item_FlintApple();
		GlowstoneApple =   new Item_GlowstoneApple();
		GunpowderApple =   new Item_GunpowderApple();
		InkApple =         new Item_InkApple();
		IronApple =        new Item_IronApple();
		LapisApple =       new Item_LapisApple();
		LeatherApple =     new Item_LeatherApple();
		MagmaCreamApple =  new Item_MagmaCreamApple();
		ObsidianApple =    new Item_ObsidianApple();
		PaperApple =       new Item_PaperApple();
		PrismarineApple =  new Item_PrismarineApple();
		QuartzApple =      new Item_QuartzApple();
		RedstoneApple =    new Item_RedstoneApple();
		RottenFleshApple = new Item_RottenFleshApple();
		SlimeApple =       new Item_SlimeApple();

		//Misc
		ObsidianShard =    new Item_ObsidianShard();
		BoneMix =          new Item_BoneMix();

		//Ingots
		ObsidianIngot =    new Item_ObsidianIngot();
		SteelIngot =       new Item_SteelIngot();
		CopperIngot =      new Item_CopperIngot();
		BoneIngot =        new Item_BoneIngot();
		TinIngot =         new Item_TinIngot();
		FlintIngot =       new Item_FlintIngot();

		//Nuggets
		SteelNugget =      new Item_SteelNugget();
		CopperNugget =     new Item_CopperNugget();
		TinNugget =        new Item_TinNugget();

	}
	public static void Register() {
		//-//Register Items
		//Apples
		ForgeRegistries.ITEMS.register(AppleApple);
		ForgeRegistries.ITEMS.register(BlazeApple);
		ForgeRegistries.ITEMS.register(ClayApple);
		ForgeRegistries.ITEMS.register(CoalApple);
		ForgeRegistries.ITEMS.register(DiamondApple);
		ForgeRegistries.ITEMS.register(EmeraldApple);
		ForgeRegistries.ITEMS.register(EnderPearlApple);
		ForgeRegistries.ITEMS.register(FlintApple);
		ForgeRegistries.ITEMS.register(GlowstoneApple);
		ForgeRegistries.ITEMS.register(GunpowderApple);
		ForgeRegistries.ITEMS.register(InkApple);
		ForgeRegistries.ITEMS.register(IronApple);
		ForgeRegistries.ITEMS.register(LapisApple);
		ForgeRegistries.ITEMS.register(LeatherApple);
		ForgeRegistries.ITEMS.register(MagmaCreamApple);
		ForgeRegistries.ITEMS.register(ObsidianApple);
		ForgeRegistries.ITEMS.register(PaperApple);
		ForgeRegistries.ITEMS.register(PrismarineApple);
		ForgeRegistries.ITEMS.register(QuartzApple);
		ForgeRegistries.ITEMS.register(RedstoneApple);
		ForgeRegistries.ITEMS.register(RottenFleshApple);
		ForgeRegistries.ITEMS.register(SlimeApple);

		//Misc
		ForgeRegistries.ITEMS.register(ObsidianShard);
		ForgeRegistries.ITEMS.register(BoneMix);
		
		//Ingots
		ForgeRegistries.ITEMS.register(ObsidianIngot);
		ForgeRegistries.ITEMS.register(SteelIngot);
		ForgeRegistries.ITEMS.register(BoneIngot);
		ForgeRegistries.ITEMS.register(CopperIngot);
		ForgeRegistries.ITEMS.register(TinIngot);
		ForgeRegistries.ITEMS.register(FlintIngot);

		//Nuggets
		ForgeRegistries.ITEMS.register(SteelNugget);
		ForgeRegistries.ITEMS.register(CopperNugget);
		ForgeRegistries.ITEMS.register(TinNugget);

	}
	public static void RegisterRenders() {
		//-//Register Render Items
		//Apples
		RegisterRender(AppleApple);
		RegisterRender(BlazeApple);
		RegisterRender(ClayApple);
		RegisterRender(CoalApple);
		RegisterRender(DiamondApple);
		RegisterRender(EmeraldApple);
		RegisterRender(EnderPearlApple);
		RegisterRender(FlintApple);
		RegisterRender(GlowstoneApple);
		RegisterRender(GunpowderApple);
		RegisterRender(InkApple);
		RegisterRender(IronApple);
		RegisterRender(LapisApple);
		RegisterRender(LeatherApple);
		RegisterRender(MagmaCreamApple);
		RegisterRender(ObsidianApple);
		RegisterRender(PaperApple);
		RegisterRender(PrismarineApple);
		RegisterRender(QuartzApple);
		RegisterRender(RedstoneApple);
		RegisterRender(RottenFleshApple);
		RegisterRender(SlimeApple);

		//Misc
		RegisterRender(ObsidianShard);
		RegisterRender(BoneMix);

		//Ingots
		RegisterRender(ObsidianIngot);
		RegisterRender(SteelIngot);
		RegisterRender(CopperIngot);
		RegisterRender(BoneIngot);
		RegisterRender(TinIngot);
		RegisterRender(FlintIngot);

		//Nuggets
		RegisterRender(SteelNugget);
		RegisterRender(CopperNugget);
		RegisterRender(TinNugget);

	}
	private static void RegisterRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
