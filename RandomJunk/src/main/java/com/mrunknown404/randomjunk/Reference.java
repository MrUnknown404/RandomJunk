package com.mrunknown404.randomjunk;

public class Reference {
	//Strings
	public static final String MOD_ID = "randomjunk";
	public static final String NAME = "RandomJunk!";
	public static final String VERSION = "1.11.0-Beta";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";

	public static final String GUI_FACTORY_CLASS = "com.mrunknown404.randomjunk.client.gui.GuiFactory";

	//Proxy
	public static final String CLIENT_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mrunknown404.randomjunk.proxy.ServerProxy";

	//Blocks
	public static enum RandomJunkBlocks {
		//Misc
		QUICKFURNACE("QuickFurnace","QuickFurnace"),
		LITQUICKFURNACE("LitQuickFurnace","LitQuickFurnace"),
		
		WOODCRATE("WoodCrate","WoodCrate"),
		BIGWOODCRATE("BigWoodCrate","BigWoodCrate"),
		
		SANDYDIRT("SandyDirt","SandyDirt"),

		OBSIDIANBLOCK("ObsidianBlock","ObsidianBlock"),
		BONEBLOCK("BoneBlock","BoneBlock"),
		FLINTBLOCK("FlintBlock","FlintBlock"),
		STEELBLOCK("SteelBlock","SteelBlock"),
		COPPERBLOCK("CopperBlock","CopperBlock"),
		TINBLOCK("TinBlock","TinBlock"),
		
		COPPERORE("CopperOre","CopperOre"),
		TINORE("TinOre","TinOre"),
		
		EMPTYJAR("EmptyJar","EmptyJar"),
		GROUNDLANTERN("GroundLantern","GroundLantern"),
		HANGINGLANTERN("HangingLantern","HangingLantern"),
		GLOWSTONETORCH("GlowstoneTorch","GlowstoneTorch"),
		LAPISTORCH("LapisTorch","LapisTorch"),

		COMPRESSEDCOBBLESTONE("CompressedCobblestone","CompressedCobblestone"),
		COMPRESSEDDIRT("CompressedDirt","CompressedDirt"),
		COMPRESSEDSAND ("CompressedSand", "CompressedSand"),

		COBBLESTONEFENCE("CobblestoneFence","CobblestoneFence"),
		COBBLESTONEFENCEGATE("CobblestoneFenceGate","CobblestoneFenceGate"),

		MOSSYCOBBLESTONEFENCE("MossyCobblestoneFence","MossyCobblestoneFence"),
		MOSSYCOBBLESTONEFENCEGATE("MossyCobblestoneFenceGate","MossyCobblestoneFenceGate"),

		NETHERBRICKFENCEGATE("NetherBrickFenceGate","NetherBrickFenceGate");

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

		//Steel
		STEELINGOT("SteelIngot","SteelIngot"),
		STEELNUGGET("SteelNugget","SteelNugget"),

		STEELSHOVEL("SteelShovel","SteelShovel"),
		STEELPICKAXE("SteelPickaxe","SteelPickaxe"),
		STEELAXE("SteelAxe","SteelAxe"),
		STEELHOE("SteelHoe","SteelHoe"),
		STEELSWORD("SteelSword","SteelSword"),

		STEELHELMET("SteelHelmet","SteelHelmet"),
		STEELCHESTPLATE("SteelChestplate","SteelChestplate"),
		STEELLEGGINGS("SteelLeggings","SteelLeggings"),
		STEELBOOTS("SteelBoots","SteelBoots"),

		COPPERINGOT("CopperIngot","CopperIngot"),
		COPPERNUGGET("CopperNugget","CopperNugget"),

		COPPERSHOVEL("CopperShovel","CopperShovel"),
		COPPERPICKAXE("CopperPickaxe","CopperPickaxe"),
		COPPERAXE("CopperAxe","CopperAxe"),
		COPPERHOE("CopperHoe","CopperHoe"),
		COPPERSWORD("CopperSword","CopperSword"),

		COPPERHELMET("CopperHelmet","CopperHelmet"),
		COPPERCHESTPLATE("CopperChestplate","CopperChestplate"),
		COPPERLEGGINGS("CopperLeggings","CopperLeggings"),
		COPPERBOOTS("CopperBoots","CopperBoots"),
		
		TININGOT("TinIngot","TinIngot"),
		TINNUGGET("TinNugget","TinNugget"),

		TINSHOVEL("TinShovel","TinShovel"),
		TINPICKAXE("TinPickaxe","TinPickaxe"),
		TINAXE("TinAxe","TinAxe"),
		TINHOE("TinHoe","TinHoe"),
		TINSWORD("TinSword","TinSword"),

		TINHELMET("TinHelmet","TinHelmet"),
		TINCHESTPLATE("TinChestplate","TinChestplate"),
		TINLEGGINGS("TinLeggings","TinLeggings"),
		TINBOOTS("TinBoots","TinBoots"),
		
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
