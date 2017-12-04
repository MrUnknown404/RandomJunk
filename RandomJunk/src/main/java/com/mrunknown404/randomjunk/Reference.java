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
		BLAZEAPPLE			("BlazeApple",		"Item_BlazeApple"),
		COALAPPLE			("CoalApple",			"Item_CoalApple"),
		DIAMONDAPPLE		("DiamondApple",		"Item_DiamondApple"),
		EMERALDAPPLE		("EmeraldApple",		"Item_EmeraldApple"),
		GUNPOWDERAPPLE	("GunpowderApple", 	"Item_GunpowderApple"),
		IRONAPPLE			("IronApple",			"Item_IronApple"),
		LAPISAPPLE 			("LapisApple",			"Item_LapisApple"),
		PRISMARINEAPPLE 	("PrismarineApple",	"Item_PrismarineApple"),
		QUARTZAPPLE		("QuartzApple",		"Item_QuartzApple"),
		REDSTONEAPPLE 		("RedstoneApple",		"Item_RedstoneApple"),
		SLIMEAPPLE			("SlimeApple", 		"Item_SlimeApple"),
		//Obsidian Things
		OBSIDIANINGOT		("ObsidianIngot", 		"Item_ObsidianIngot");
		
		
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
