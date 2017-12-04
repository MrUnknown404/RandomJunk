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
	
	//
	public static enum RandomJunkItems {
		//Items NAME("",""),
		BLAZEAPPLE			("BlazeApple",		"ItemBlazeApple"),
		COALAPPLE			("CoalApple",			"ItemCoalApple"),
		DIAMONDAPPLE		("DiamondApple",		"ItemDiamondApple"),
		EMERALDAPPLE		("EmeraldApple",		"ItemEmeraldApple"),
		GUNPOWDERAPPLE	("GunpowderApple", 	"ItemGunpowderApple"),
		IRONAPPLE			("IronApple",			"ItemIronApple"),
		LAPISAPPLE 			("LapisApple",			"ItemLapisApple"),
		PRISMARINEAPPLE 	("PrismarineApple",	"ItemPrismarineApple"),
		QUARTZAPPLE		("QuartzApple",		"ItemQuartzApple"),
		REDSTONEAPPLE 		("RedstoneApple",		"ItemRedstoneApple"),
		SLIMEAPPLE			("SlimeApple", 		"ItemSlimeApple"),
		//Obsidian Things
		OBSIDIANINGOT		("ObsidianIngot", 		"ItemObsidianIngot");
		
		
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
