package com.mrunknown404.randomjunk;

public class Reference {
	//Strings
	public static final String MOD_ID  = "murj";
	public static final String NAME  = "RandomJunk!";
	public static final String VERSION  = "1.0-Alpha";
	public static final String  ACCEPTED_VERSIONS  = "[1.11.2]";
	
	//Proxy
	public static final String CLIENT_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ServerProxy";
	
	//
	public static enum RandomJunkItems {
		//Items
		GUNPOWDERAPPLE("GunpowderApple", "ItemGunpowderApple"),
		SLIMEAPPLE("SlimeApple", "ItemSlimeApple");
		
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
