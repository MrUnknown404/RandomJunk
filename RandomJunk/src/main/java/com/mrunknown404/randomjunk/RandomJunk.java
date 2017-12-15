package com.mrunknown404.randomjunk;

import com.mrunknown404.randomjunk.handlers.ConfigHandler;
import com.mrunknown404.randomjunk.handlers.ObsidianEventHandler;
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
		
		//Items/Blocks Init
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModTools.init();
		ModTools.register();
		
		ModArmor.init();
		ModArmor.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.init();
		
		//Crafting Init
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		MinecraftForge.EVENT_BUS.register(new ObsidianEventHandler());
		
		//Normally 16
		Items.BUCKET.setMaxStackSize(64);
		Items.SNOWBALL.setMaxStackSize(64);
		Items.ENDER_PEARL.setMaxStackSize(64);
		Items.IRON_HORSE_ARMOR.setMaxStackSize(64);
		Items.GOLDEN_HORSE_ARMOR.setMaxStackSize(64);
		Items.DIAMOND_HORSE_ARMOR.setMaxStackSize(64);
		
		if (ConfigHandler.InfDurability == true) {
			//-//-//Vanilla
			//-//Tools
			//Diamond
			
			Items.DIAMOND_SHOVEL.setMaxDamage(-1);
			Items.DIAMOND_PICKAXE.setMaxDamage(-1);
			Items.DIAMOND_AXE.setMaxDamage(-1);
			Items.DIAMOND_HOE.setMaxDamage(-1);
			Items.DIAMOND_SWORD.setMaxDamage(-1);
			
			//Iron
			Items.IRON_SHOVEL.setMaxDamage(-1);
			Items.IRON_PICKAXE.setMaxDamage(-1);
			Items.IRON_AXE.setMaxDamage(-1);
			Items.IRON_HOE.setMaxDamage(-1);
			Items.IRON_SWORD.setMaxDamage(-1);
			
			//Stone
			Items.STONE_SHOVEL.setMaxDamage(-1);
			Items.STONE_PICKAXE.setMaxDamage(-1);
			Items.STONE_AXE.setMaxDamage(-1);
			Items.STONE_HOE.setMaxDamage(-1);
			Items.STONE_SWORD.setMaxDamage(-1);
			
			//Gold
			Items.GOLDEN_SHOVEL.setMaxDamage(-1);
			Items.GOLDEN_PICKAXE.setMaxDamage(-1);
			Items.GOLDEN_AXE.setMaxDamage(-1);
			Items.GOLDEN_HOE.setMaxDamage(-1);
			Items.GOLDEN_SWORD.setMaxDamage(-1);
			
			//Wood
			Items.WOODEN_SHOVEL.setMaxDamage(-1);
			Items.WOODEN_PICKAXE.setMaxDamage(-1);
			Items.WOODEN_AXE.setMaxDamage(-1);
			Items.WOODEN_HOE.setMaxDamage(-1);
			Items.WOODEN_SWORD.setMaxDamage(-1);
			
			//Misc
			Items.SHEARS.setMaxDamage(-1);
			Items.FISHING_ROD.setMaxDamage(-1);
			Items.CARROT_ON_A_STICK.setMaxDamage(-1);
			Items.FLINT_AND_STEEL.setMaxDamage(-1);
			Items.BOW.setMaxDamage(-1);
			Items.ELYTRA.setMaxDamage(-1);
			Items.SHIELD.setMaxDamage(-1);
			
			//-//Armor
			//Diamond
			Items.DIAMOND_HELMET.setMaxDamage(-1);
			Items.DIAMOND_CHESTPLATE.setMaxDamage(-1);
			Items.DIAMOND_LEGGINGS.setMaxDamage(-1);
			Items.DIAMOND_BOOTS.setMaxDamage(-1);
			
			//Iron
			Items.IRON_HELMET.setMaxDamage(-1);
			Items.IRON_CHESTPLATE.setMaxDamage(-1);
			Items.IRON_LEGGINGS.setMaxDamage(-1);
			Items.IRON_BOOTS.setMaxDamage(-1);
			
			//Chain
			Items.CHAINMAIL_HELMET.setMaxDamage(-1);
			Items.CHAINMAIL_CHESTPLATE.setMaxDamage(-1);
			Items.CHAINMAIL_LEGGINGS.setMaxDamage(-1);
			Items.CHAINMAIL_BOOTS.setMaxDamage(-1);
			
			//Gold
			Items.GOLDEN_HELMET.setMaxDamage(-1);
			Items.GOLDEN_CHESTPLATE.setMaxDamage(-1);
			Items.GOLDEN_LEGGINGS.setMaxDamage(-1);
			Items.GOLDEN_BOOTS.setMaxDamage(-1);
			
			//Leather
			Items.LEATHER_HELMET.setMaxDamage(-1);
			Items.LEATHER_CHESTPLATE.setMaxDamage(-1);
			Items.LEATHER_LEGGINGS.setMaxDamage(-1);
			Items.LEATHER_BOOTS.setMaxDamage(-1);
			
			//-//-//Modded
			//-//Items
			//Obsidian
			ModTools.ObsidianShovel.setMaxDamage(-1);
			ModTools.ObsidianPickaxe.setMaxDamage(-1);
			ModTools.ObsidianAxe.setMaxDamage(-1);
			ModTools.ObsidianHoe.setMaxDamage(-1);
			ModTools.ObsidianSword.setMaxDamage(-1);
			
			//Bone
			ModTools.BoneShovel.setMaxDamage(-1);
			ModTools.BonePickaxe.setMaxDamage(-1);
			ModTools.BoneAxe.setMaxDamage(-1);
			ModTools.BoneHoe.setMaxDamage(-1);
			ModTools.BoneSword.setMaxDamage(-1);
			
			//Flint
			ModTools.FlintShovel.setMaxDamage(-1);
			ModTools.FlintPickaxe.setMaxDamage(-1);
			ModTools.FlintAxe.setMaxDamage(-1);
			ModTools.FlintHoe.setMaxDamage(-1);
			ModTools.FlintSword.setMaxDamage(-1);
			
			//-//Armor
			//Obsidian
			ModArmor.ObsidianHelmet.setMaxDamage(-1);
			ModArmor.ObsidianChestplate.setMaxDamage(-1);
			ModArmor.ObsidianLeggings.setMaxDamage(-1);
			ModArmor.ObsidianBoots.setMaxDamage(-1);
			
			//Bone
			ModArmor.BoneHelmet.setMaxDamage(-1);
			ModArmor.BoneChestplate.setMaxDamage(-1);
			ModArmor.BoneLeggings.setMaxDamage(-1);
			ModArmor.BoneBoots.setMaxDamage(-1);
			
			//Flint
			ModArmor.FlintHelmet.setMaxDamage(-1);
			ModArmor.FlintChestplate.setMaxDamage(-1);
			ModArmor.FlintLeggings.setMaxDamage(-1);
			ModArmor.FlintBoots.setMaxDamage(-1);
		}
	}
}
