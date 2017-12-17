package com.mrunknown404.randomjunk;

import com.mrunknown404.randomjunk.handlers.AchievementHandler;
import com.mrunknown404.randomjunk.handlers.ConfigHandler;
import com.mrunknown404.randomjunk.handlers.FuelHandler;
import com.mrunknown404.randomjunk.handlers.PickupHandler;
import com.mrunknown404.randomjunk.handlers.BlockHarvestHandler;
import com.mrunknown404.randomjunk.proxy.CommonProxy;

import init.ModArmor;
import init.ModBlocks;
import init.ModCrafting;
import init.ModItems;
import init.ModTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, guiFactory = Reference.GUI_FACTORY_CLASS)

public class RandomJunk {
	
	@Instance
	public static RandomJunk instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Config
		String ConfigDir = event.getModConfigurationDirectory().toString();
		ConfigHandler.init(ConfigDir);
		//FMLCommonHandler.instance().bus().register(new ConfigHandler());
		MinecraftForge.EVENT_BUS.register(new ConfigHandler());
		MinecraftForge.EVENT_BUS.register(new PickupHandler());
		
		//Items/Blocks Init
		ModItems.Init();
		ModBlocks.Init();
		ModTools.Init();
		ModArmor.Init();
		
		ModItems.Register();
		ModBlocks.Register();
		ModTools.Register();
		ModArmor.Register();
		
		//Fuel
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		//Achievements
		AchievementHandler.RegisterAchievements();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		//Crafting Init
		ModCrafting.UnregisterRecipes();
		ModCrafting.Register();
		
		MinecraftForge.EVENT_BUS.register(new BlockHarvestHandler());
		
		if (ConfigHandler.MaxStack == true) {
			//Normally 16
			Items.BUCKET.setMaxStackSize(64);
			Items.SNOWBALL.setMaxStackSize(64);
			Items.ENDER_PEARL.setMaxStackSize(64);
			Items.IRON_HORSE_ARMOR.setMaxStackSize(64);
			Items.GOLDEN_HORSE_ARMOR.setMaxStackSize(64);
			Items.DIAMOND_HORSE_ARMOR.setMaxStackSize(64);
		}
		
		if (ConfigHandler.InfDurability == true) {
			//-//-//Vanilla
			//-//Tools
			//Diamond
			Items.DIAMOND_SHOVEL.setMaxDamage(1000000);
			Items.DIAMOND_PICKAXE.setMaxDamage(1000000);
			Items.DIAMOND_AXE.setMaxDamage(1000000);
			Items.DIAMOND_HOE.setMaxDamage(1000000);
			Items.DIAMOND_SWORD.setMaxDamage(1000000);
			
			//Iron
			Items.IRON_SHOVEL.setMaxDamage(1000000);
			Items.IRON_PICKAXE.setMaxDamage(1000000);
			Items.IRON_AXE.setMaxDamage(1000000);
			Items.IRON_HOE.setMaxDamage(1000000);
			Items.IRON_SWORD.setMaxDamage(1000000);
			
			//Stone
			Items.STONE_SHOVEL.setMaxDamage(1000000);
			Items.STONE_PICKAXE.setMaxDamage(1000000);
			Items.STONE_AXE.setMaxDamage(1000000);
			Items.STONE_HOE.setMaxDamage(1000000);
			Items.STONE_SWORD.setMaxDamage(1000000);
			
			//Gold
			Items.GOLDEN_SHOVEL.setMaxDamage(1000000);
			Items.GOLDEN_PICKAXE.setMaxDamage(1000000);
			Items.GOLDEN_AXE.setMaxDamage(1000000);
			Items.GOLDEN_HOE.setMaxDamage(1000000);
			Items.GOLDEN_SWORD.setMaxDamage(1000000);
			
			//Wood
			Items.WOODEN_SHOVEL.setMaxDamage(1000000);
			Items.WOODEN_PICKAXE.setMaxDamage(1000000);
			Items.WOODEN_AXE.setMaxDamage(1000000);
			Items.WOODEN_HOE.setMaxDamage(1000000);
			Items.WOODEN_SWORD.setMaxDamage(1000000);
			
			//Misc
			Items.SHEARS.setMaxDamage(1000000);
			Items.FISHING_ROD.setMaxDamage(1000000);
			Items.CARROT_ON_A_STICK.setMaxDamage(1000000);
			Items.FLINT_AND_STEEL.setMaxDamage(1000000);
			Items.BOW.setMaxDamage(1000000);
			Items.ELYTRA.setMaxDamage(1000000);
			Items.SHIELD.setMaxDamage(1000000);
			
			//-//Armor
			//Diamond
			Items.DIAMOND_HELMET.setMaxDamage(1000000);
			Items.DIAMOND_CHESTPLATE.setMaxDamage(1000000);
			Items.DIAMOND_LEGGINGS.setMaxDamage(1000000);
			Items.DIAMOND_BOOTS.setMaxDamage(1000000);
			
			//Iron
			Items.IRON_HELMET.setMaxDamage(1000000);
			Items.IRON_CHESTPLATE.setMaxDamage(1000000);
			Items.IRON_LEGGINGS.setMaxDamage(1000000);
			Items.IRON_BOOTS.setMaxDamage(1000000);
			
			//Chain
			Items.CHAINMAIL_HELMET.setMaxDamage(1000000);
			Items.CHAINMAIL_CHESTPLATE.setMaxDamage(1000000);
			Items.CHAINMAIL_LEGGINGS.setMaxDamage(1000000);
			Items.CHAINMAIL_BOOTS.setMaxDamage(1000000);
			
			//Gold
			Items.GOLDEN_HELMET.setMaxDamage(1000000);
			Items.GOLDEN_CHESTPLATE.setMaxDamage(1000000);
			Items.GOLDEN_LEGGINGS.setMaxDamage(1000000);
			Items.GOLDEN_BOOTS.setMaxDamage(1000000);
			
			//Leather
			Items.LEATHER_HELMET.setMaxDamage(1000000);
			Items.LEATHER_CHESTPLATE.setMaxDamage(1000000);
			Items.LEATHER_LEGGINGS.setMaxDamage(1000000);
			Items.LEATHER_BOOTS.setMaxDamage(1000000);
			
			//-//-//Modded
			//-//Items
			//Obsidian
			ModTools.ObsidianShovel.setMaxDamage(1000000);
			ModTools.ObsidianPickaxe.setMaxDamage(1000000);
			ModTools.ObsidianAxe.setMaxDamage(1000000);
			ModTools.ObsidianHoe.setMaxDamage(1000000);
			ModTools.ObsidianSword.setMaxDamage(1000000);
			
			//Bone
			ModTools.BoneShovel.setMaxDamage(1000000);
			ModTools.BonePickaxe.setMaxDamage(1000000);
			ModTools.BoneAxe.setMaxDamage(1000000);
			ModTools.BoneHoe.setMaxDamage(1000000);
			ModTools.BoneSword.setMaxDamage(1000000);
			
			//Flint
			ModTools.FlintShovel.setMaxDamage(1000000);
			ModTools.FlintPickaxe.setMaxDamage(1000000);
			ModTools.FlintAxe.setMaxDamage(1000000);
			ModTools.FlintHoe.setMaxDamage(1000000);
			ModTools.FlintSword.setMaxDamage(1000000);
			
			//-//Armor
			//Obsidian
			ModArmor.ObsidianHelmet.setMaxDamage(1000000);
			ModArmor.ObsidianChestplate.setMaxDamage(1000000);
			ModArmor.ObsidianLeggings.setMaxDamage(1000000);
			ModArmor.ObsidianBoots.setMaxDamage(1000000);
			
			//Bone
			ModArmor.BoneHelmet.setMaxDamage(1000000);
			ModArmor.BoneChestplate.setMaxDamage(1000000);
			ModArmor.BoneLeggings.setMaxDamage(1000000);
			ModArmor.BoneBoots.setMaxDamage(1000000);
			
			//Flint
			ModArmor.FlintHelmet.setMaxDamage(1000000);
			ModArmor.FlintChestplate.setMaxDamage(1000000);
			ModArmor.FlintLeggings.setMaxDamage(1000000);
			ModArmor.FlintBoots.setMaxDamage(1000000);
		}
	}
}
