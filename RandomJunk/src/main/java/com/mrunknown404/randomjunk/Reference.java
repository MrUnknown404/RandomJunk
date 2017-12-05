package com.mrunknown404.randomjunk;

public class Reference {
	//Strings
	public static final String MOD_ID  = "mrj";
	public static final String NAME  = "RandomJunk!";
	public static final String VERSION  = "1.0-Alpha";
	public static final String  ACCEPTED_VERSIONS  = "[1.11.2]";
	
	//Proxy
	public static final String CLIENT_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ServerProxy";
	
	//Blocks
	public static enum RandomJunkBlocks {
		//Items NAME			("",""),
		OBSIDIANBLOCK		("ObsidianBlock",		"Block_ObsidianBlock");
		
		
		private String unlocalizedName;
		private String registryName;
		
		RandomJunkBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	//Items
	public static enum RandomJunkItems {
		//Items NAME("",""),
		APPLEAPPLE 			("AppleApple",		"Item_AppleApple"),
		BLAZEAPPLE			("BlazeApple",		"Item_BlazeApple"),
		CLAYAPPLE			("ClayApple",			"Item_ClayApple"),
		COALAPPLE			("CoalApple",			"Item_CoalApple"),
		DIAMONDAPPLE		("DiamondApple",		"Item_DiamondApple"),
		EMERALDAPPLE		("EmeraldApple",		"Item_EmeraldApple"),
		ENDERPEARLAPPLE	("EnderPearlApple",	"Item_EnderPearlApple"),
		FLINTAPPLE			("FlintApple",			"Item_FlintApple"),
		GLOWSTONEAPPLE	("GlowstoneApple",	"Item_GlowstoneApple"),
		GUNPOWDERAPPLE	("GunpowderApple", 	"Item_GunpowderApple"),
		INKAPPLE			("InkApple",			"Item_InkApple"),
		IRONAPPLE			("IronApple",			"Item_IronApple"),
		LAPISAPPLE 			("LapisApple",			"Item_LapisApple"),
		LEATHERAPPLE		("LeatherApple",		"Item_LeatherApple"),
		MAGMACREAMAPPLE	("MagmaCreamApple",	"Item_MagmaCreamApple"),
		OBSIDIANAPPLE		("ObsidianApple",		"Item_ObsidianApple"),
		PAPERAPPLE			("PaperApple",		"Item_PaperApple"),
		PRISMARINEAPPLE 	("PrismarineApple",	"Item_PrismarineApple"),
		QUARTZAPPLE		("QuartzApple",		"Item_QuartzApple"),
		REDSTONEAPPLE 		("RedstoneApple",		"Item_RedstoneApple"),
		ROTTENFLESHAPPLE	("RottenFleshApple",	"Item_RottenFleshApple"),
		SLIMEAPPLE			("SlimeApple", 		"Item_SlimeApple"),
		//Obsidian Things shovel pickaxe axe hoe
		OBSIDIANINGOT		("ObsidianIngot", 		"Item_ObsidianIngot"),
		OBSIDIANSHOVEL	("ObsidianShovel",		"Item_ObsidianShovel"),
		OBSIDIANPICKAXE	("ObsidianPickaxe",	"Item_ObsidianPickaxe"),
		OBSIDIANAXE		("ObsidianAxe",		"Item_ObsidianAxe"),
		OBSIDIANHOE		("ObsidianHoe",		"Item_ObsidianHoe"),
		OBSIDIANSWORD	("ObsidianSword",		"Item_ObsidianSword");
		
		
		private String unlocalizedName;
		private String registryName;
		
		RandomJunkItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
