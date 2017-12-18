package com.mrunknown404.randomjunk;

public class Reference {
	//Strings
	public static final String MOD_ID = "randomjunk";
	public static final String NAME = "RandomJunk!";
	public static final String VERSION = "1.6.0-Beta";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";

	public static final String GUI_FACTORY_CLASS = "com.mrunknown404.randomjunk.client.gui.GuiFactory";
	
	//Proxy
	public static final String CLIENT_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ServerProxy";

	//Blocks
	public static enum RandomJunkBlocks {
		//Misc
		OBSIDIANBLOCK("ObsidianBlock","ObsidianBlock"),
		BONEBLOCK("BoneBlock","BoneBlock"),
		FLINTBLOCK("FlintBlock","FlintBlock"),

		EMPTYJAR("EmptyJar","EmptyJar"),
		GROUNDLANTERN("GroundLantern","GroundLantern"),
		HANGINGLANTERN("HangingLantern","HangingLantern"),
		GLOWSTONETORCH("GlowstoneTorch","GlowstoneTorch"),
		LAPISTORCH("LapisTorch","LapisTorch"),

		//Compressed Blocks
		COMPRESSEDCOBBLESTONE1 ("CompressedCobblestone1", "CompressedCobblestone1"),
		COMPRESSEDCOBBLESTONE2 ("CompressedCobblestone2", "CompressedCobblestone2"),
		COMPRESSEDCOBBLESTONE3 ("CompressedCobblestone3", "CompressedCobblestone3"),
		COMPRESSEDCOBBLESTONE4 ("CompressedCobblestone4", "CompressedCobblestone4"),
		COMPRESSEDCOBBLESTONE5 ("CompressedCobblestone5", "CompressedCobblestone5"),
		COMPRESSEDCOBBLESTONE6 ("CompressedCobblestone6", "CompressedCobblestone6"),
		COMPRESSEDCOBBLESTONE7 ("CompressedCobblestone7", "CompressedCobblestone7"),
		COMPRESSEDCOBBLESTONE8 ("CompressedCobblestone8", "CompressedCobblestone8"),
		COMPRESSEDCOBBLESTONE9 ("CompressedCobblestone9", "CompressedCobblestone9"),
		COMPRESSEDCOBBLESTONE10("CompressedCobblestone10","CompressedCobblestone10"),
		COMPRESSEDCOBBLESTONE11("CompressedCobblestone11","CompressedCobblestone11"),
		COMPRESSEDCOBBLESTONE12("CompressedCobblestone12","CompressedCobblestone12"),
		
		COMPRESSEDDIRT1 ("CompressedDirt1", "CompressedDirt1"),
		COMPRESSEDDIRT2 ("CompressedDirt2", "CompressedDirt2"),
		COMPRESSEDDIRT3 ("CompressedDirt3", "CompressedDirt3"),
		COMPRESSEDDIRT4 ("CompressedDirt4", "CompressedDirt4"),
		COMPRESSEDDIRT5 ("CompressedDirt5", "CompressedDirt5"),
		COMPRESSEDDIRT6 ("CompressedDirt6", "CompressedDirt6"),
		COMPRESSEDDIRT7 ("CompressedDirt7", "CompressedDirt7"),
		COMPRESSEDDIRT8 ("CompressedDirt8", "CompressedDirt8"),
		COMPRESSEDDIRT9 ("CompressedDirt9", "CompressedDirt9"),
		COMPRESSEDDIRT10("CompressedDirt10","CompressedDirt10"),
		COMPRESSEDDIRT11("CompressedDirt11","CompressedDirt11"),
		COMPRESSEDDIRT12("CompressedDirt12","CompressedDirt12"),
		
		COMPRESSEDSAND1 ("CompressedSand1", "CompressedSand1"),
		COMPRESSEDSAND2 ("CompressedSand2", "CompressedSand2"),
		COMPRESSEDSAND3 ("CompressedSand3", "CompressedSand3"),
		COMPRESSEDSAND4 ("CompressedSand4", "CompressedSand4"),
		COMPRESSEDSAND5 ("CompressedSand5", "CompressedSand5"),
		COMPRESSEDSAND6 ("CompressedSand6", "CompressedSand6"),
		COMPRESSEDSAND7 ("CompressedSand7", "CompressedSand7"),
		COMPRESSEDSAND8 ("CompressedSand8", "CompressedSand8"),
		COMPRESSEDSAND9 ("CompressedSand9", "CompressedSand9"),
		COMPRESSEDSAND10("CompressedSand10","CompressedSand10"),
		COMPRESSEDSAND11("CompressedSand11","CompressedSand11"),
		COMPRESSEDSAND12("CompressedSand12","CompressedSand12");
		
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
		//Items NAME         ("",""),
		APPLEAPPLE("AppleApple","AppleApple"),
		BLAZEAPPLE("BlazeApple","BlazeApple"),
		CLAYAPPLE("ClayApple","ClayApple"),
		COALAPPLE("CoalApple","CoalApple"),
		DIAMONDAPPLE("DiamondApple","DiamondApple"),
		EMERALDAPPLE("EmeraldApple","EmeraldApple"),
		ENDERPEARLAPPLE("EnderPearlApple","EnderPearlApple"),
		FLINTAPPLE("FlintApple","FlintApple"),
		GLOWSTONEAPPLE("GlowstoneApple","GlowstoneApple"),
		GUNPOWDERAPPLE("GunpowderApple","GunpowderApple"),
		INKAPPLE("InkApple","InkApple"),
		IRONAPPLE("IronApple","IronApple"),
		LAPISAPPLE("LapisApple","LapisApple"),
		LEATHERAPPLE("LeatherApple","LeatherApple"),
		MAGMACREAMAPPLE("MagmaCreamApple","MagmaCreamApple"),
		OBSIDIANAPPLE("ObsidianApple","ObsidianApple"),
		PAPERAPPLE("PaperApple","PaperApple"),
		PRISMARINEAPPLE("PrismarineApple","PrismarineApple"),
		QUARTZAPPLE("QuartzApple","QuartzApple"),
		REDSTONEAPPLE("RedstoneApple","RedstoneApple"),
		ROTTENFLESHAPPLE("RottenFleshApple","RottenFleshApple"),
		SLIMEAPPLE("SlimeApple","SlimeApple"),
		//Obsidian Things
		OBSIDIANINGOT("ObsidianIngot","ObsidianIngot"),
		OBSIDIANSHARD("ObsidianShard","ObsidianShard"),

		OBSIDIANSHOVEL("ObsidianShovel","ObsidianShovel"),
		OBSIDIANPICKAXE("ObsidianPickaxe","ObsidianPickaxe"),
		OBSIDIANAXE("ObsidianAxe","ObsidianAxe"),
		OBSIDIANHOE("ObsidianHoe","ObsidianHoe"),
		OBSIDIANSWORD("ObsidianSword","ObsidianSword"),

		OBSIDIANHELMET("ObsidianHelmet","ObsidianHelmet"),
		OBSIDIANCHESTPLATE("ObsidianChestplate","ObsidianChestplate"),
		OBSIDIANLEGGINGS("ObsidianLeggings","ObsidianLeggings"),
		OBSIDIANBOOTS("ObsidianBoots","ObsidianBoots"),

		BONEINGOT("BoneIngot","BoneIngot"),
		BONEMIX("BoneMix","BoneMix"),

		BONESHOVEL("BoneShovel","BoneShovel"),
		BONEPICKAXE("BonePickaxe","BonePickaxe"),
		BONEAXE("BoneAxe","BoneAxe"),
		BONEHOE("BoneHoe","BoneHoe"),
		BONESWORD("BoneSword","BoneSword"),

		BONEHELMET("BoneHelmet","BoneHelmet"),
		BONECHESTPLATE("BoneChestplate","BoneChestplate"),
		BONELEGGINGS("BoneLeggings","BoneLeggings"),
		BONEBOOTS("BoneBoots","BoneBoots"),

		//Flint
		FLINTINGOT("FlintIngot","FlintIngot"),

		FLINTSHOVEL("FlintShovel","FlintShovel"),
		FLINTPICKAXE("FlintPickaxe","FlintPickaxe"),
		FLINTAXE("FlintAxe","FlintAxe"),
		FLINTHOE("FlintHoe","FlintHoe"),
		FLINTSWORD("FlintSword","FlintSword"),

		FLINTHELMET("FlintHelmet","FlintHelmet"),
		FLINTCHESTPLATE("FlintChestplate","FlintChestplate"),
		FLINTLEGGINGS("FlintLeggings","FlintLeggings"),
		FLINTBOOTS("FlintBoots","FlintBoots"),

		//Debug Tools
		DEBUGPICKAXE("DebugPickaxe","DebugPickaxe");

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
