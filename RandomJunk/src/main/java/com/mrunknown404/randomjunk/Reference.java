package com.mrunknown404.randomjunk;

public class Reference {
	//Strings
	public static final String MOD_ID  = "randomjunk";
	public static final String NAME  = "RandomJunk!";
	public static final String VERSION  = "1.0.2-Beta";
	public static final String  ACCEPTED_VERSIONS  = "[1.11.2]";

	//Proxy
	public static final String CLIENT_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ServerProxy";

	//Blocks
	public static enum RandomJunkBlocks {
		//Block NAME			("",""),
		OBSIDIANBLOCK ("ObsidianBlock", "Block_ObsidianBlock"),
		BONEBLOCK ("BoneBlock", "Block_BoneBlock"),
		FLINTBLOCK ("FlintBlock", "Block_FlintBlock");

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
		//Items NAME			("",""),
		APPLEAPPLE("AppleApple","Item_AppleApple"),
		BLAZEAPPLE("BlazeApple","Item_BlazeApple"),
		CLAYAPPLE("ClayApple","Item_ClayApple"),
		COALAPPLE("CoalApple","Item_CoalApple"),
		DIAMONDAPPLE("DiamondApple","Item_DiamondApple"),
		EMERALDAPPLE("EmeraldApple","Item_EmeraldApple"),
		ENDERPEARLAPPLE("EnderPearlApple","Item_EnderPearlApple"),
		FLINTAPPLE("FlintApple","Item_FlintApple"),
		GLOWSTONEAPPLE("GlowstoneApple","Item_GlowstoneApple"),
		GUNPOWDERAPPLE("GunpowderApple","Item_GunpowderApple"),
		INKAPPLE("InkApple","Item_InkApple"),
		IRONAPPLE("IronApple","Item_IronApple"),
		LAPISAPPLE("LapisApple","Item_LapisApple"),
		LEATHERAPPLE("LeatherApple","Item_LeatherApple"),
		MAGMACREAMAPPLE("MagmaCreamApple","Item_MagmaCreamApple"),
		OBSIDIANAPPLE("ObsidianApple","Item_ObsidianApple"),
		PAPERAPPLE("PaperApple","Item_PaperApple"),
		PRISMARINEAPPLE("PrismarineApple","Item_PrismarineApple"),
		QUARTZAPPLE("QuartzApple","Item_QuartzApple"),
		REDSTONEAPPLE("RedstoneApple","Item_RedstoneApple"),
		ROTTENFLESHAPPLE("RottenFleshApple","Item_RottenFleshApple"),
		SLIMEAPPLE("SlimeApple","Item_SlimeApple"),
		//Obsidian Things
		OBSIDIANINGOT("ObsidianIngot","Item_ObsidianIngot"),

		OBSIDIANSHOVEL("ObsidianShovel","Item_ObsidianShovel"),
		OBSIDIANPICKAXE("ObsidianPickaxe","Item_ObsidianPickaxe"),
		OBSIDIANAXE("ObsidianAxe","Item_ObsidianAxe"),
		OBSIDIANHOE("ObsidianHoe","Item_ObsidianHoe"),
		OBSIDIANSWORD("ObsidianSword","Item_ObsidianSword"),

		OBSIDIANHELMET("ObsidianHelmet","Item_ObsidianHelmet"),
		OBSIDIANCHESTPLATE("ObsidianChestplate","Item_ObsidianChestplate"),
		OBSIDIANLEGGINGS("ObsidianLeggings","Item_ObsidianLeggings"),
		OBSIDIANBOOTS("ObsidianBoots","Item_ObsidianBoots"),

		BONEINGOT("BoneIngot","Item_BoneIngot"),
		BONEMIX("BoneMix","Item_BoneMix"),

		BONESHOVEL("BoneShovel","Item_BoneShovel"),
		BONEPICKAXE("BonePickaxe","Item_BonePickaxe"),
		BONEAXE("BoneAxe","Item_BoneAxe"),
		BONEHOE("BoneHoe","Item_BoneHoe"),
		BONESWORD("BoneSword","Item_BoneSword"),

		BONEHELMET("BoneHelmet","Item_BoneHelmet"),
		BONECHESTPLATE("BoneChestplate","Item_BoneChestplate"),
		BONELEGGINGS("BoneLeggings","Item_BoneLeggings"),
		BONEBOOTS("BoneBoots","Item_BoneBoots"),

		//Flint
		FLINTINGOT("FlintIngot","Item_FlintIngot"),

		FLINTSHOVEL("FlintShovel","Item_FlintShovel"),
		FLINTPICKAXE("FlintPickaxe","Item_FlintPickaxe"),
		FLINTAXE("FlintAxe","Item_FlintAxe"),
		FLINTHOE("FlintHoe","Item_FlintHoe"),
		FLINTSWORD("FlintSword","Item_FlintSword"),

		FLINTHELMET("FlintHelmet","Item_FlintHelmet"),
		FLINTCHESTPLATE("FlintChestplate","Item_FlintChestplate"),
		FLINTLEGGINGS("FlintLeggings","Item_FlintLeggings"),
		FLINTBOOTS("FlintBoots","Item_FlintBoots");

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
