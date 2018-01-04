package com.mrunknown404.randomjunk.handlers;
/*
import java.util.ArrayList;
import java.util.List;

import com.mrunknown404.randomjunk.Reference;

import init.ModItems;
import init.ModTools;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class AchievementHandler {
	
	private static List<Achievement> Achievements = new ArrayList<Achievement>();
	
	//-//Achievements
	//Apples
	public static Achievement Achievement_GetApple = CreateAchievement("GetApple", 1, -1, Items.APPLE, null);
	
	public static Achievement Achievement_AppleApple = CreateAchievement("AppleApple", 1-5, 0-4, ModItems.AppleApple, Achievement_GetApple);
	public static Achievement Achievement_BlazeApple = CreateAchievement("BlazeApple", 2-5, 0-4, ModItems.BlazeApple, Achievement_GetApple);
	public static Achievement Achievement_ClayApple = CreateAchievement("ClayApple", 3-5, 0-4, ModItems.ClayApple, Achievement_GetApple);
	public static Achievement Achievement_CoalApple = CreateAchievement("CoalApple", 4-5, 0-4, ModItems.CoalApple, Achievement_GetApple);
	public static Achievement Achievement_DiamondApple = CreateAchievement("DiamondApple", 5-5, 0-4, ModItems.DiamondApple, Achievement_GetApple);
	public static Achievement Achievement_EmeraldApple = CreateAchievement("EmeraldApple", 6-5, 0-4, ModItems.EmeraldApple, Achievement_GetApple);
	public static Achievement Achievement_EnderPearlApple = CreateAchievement("EnderPearlApple", 7-5, 0-4, ModItems.EnderPearlApple, Achievement_GetApple);
	public static Achievement Achievement_FlintApple = CreateAchievement("FlintApple", 8-5, 0-4, ModItems.FlintApple, Achievement_GetApple);
	public static Achievement Achievement_GlowstoneApple = CreateAchievement("GlowstoneApple", 9-5, 0-4, ModItems.GlowstoneApple, Achievement_GetApple);
	public static Achievement Achievement_GunpowderApple = CreateAchievement("GunpowderApple", 10-5, 0-4, ModItems.GunpowderApple, Achievement_GetApple);
	public static Achievement Achievement_InkApple = CreateAchievement("InkApple", 11-5, 0-4, ModItems.InkApple, Achievement_GetApple);
	public static Achievement Achievement_IronApple = CreateAchievement("IronApple", 1-5, 1-4, ModItems.IronApple, Achievement_GetApple);
	public static Achievement Achievement_LapisApple = CreateAchievement("LapisApple", 2-5, 1-4, ModItems.LapisApple, Achievement_GetApple);
	public static Achievement Achievement_LeatherApple = CreateAchievement("LeatherApple", 3-5, 1-4, ModItems.LeatherApple, Achievement_GetApple);
	public static Achievement Achievement_MagmaCreamApple = CreateAchievement("MagmaCreamApple", 4-5, 1-4, ModItems.MagmaCreamApple, Achievement_GetApple);
	public static Achievement Achievement_ObsidianApple = CreateAchievement("ObsidianApple", 5-5, 1-4, ModItems.ObsidianApple, Achievement_GetApple);
	public static Achievement Achievement_PaperApple = CreateAchievement("PaperApple", 6-5, 1-4, ModItems.PaperApple, Achievement_GetApple);
	public static Achievement Achievement_PrismarineApple = CreateAchievement("PrismarineApple", 7-5, 1-4, ModItems.PrismarineApple, Achievement_GetApple);
	public static Achievement Achievement_QuartzApple = CreateAchievement("QuartzApple", 8-5, 1-4, ModItems.QuartzApple, Achievement_GetApple);
	public static Achievement Achievement_RedstoneApple = CreateAchievement("RedstoneApple", 9-5, 1-4, ModItems.RedstoneApple, Achievement_GetApple);
	public static Achievement Achievement_RottenFleshApple = CreateAchievement("RottenFleshApple", 10-5, 1-4, ModItems.RottenFleshApple, Achievement_GetApple);
	public static Achievement Achievement_SlimeApple = CreateAchievement("SlimeApple", 11-5, 1-4, ModItems.SlimeApple, Achievement_GetApple);
	
	//Flint Items
	public static Achievement Achievement_Flint = CreateAchievement("Flint", -5, -1, Items.FLINT, null);
	public static Achievement Achievement_FlintIngot = CreateAchievement("FlintIngot", -3, -1, ModItems.FlintIngot, Achievement_Flint);
	public static Achievement Achievement_FlintPickaxe = CreateAchievement("FlintPickaxe", -1, -1, ModTools.FlintPickaxe, Achievement_FlintIngot);
	
	//Bone Items
	public static Achievement Achievement_Bone = CreateAchievement("Bone", -5, 1, Items.BONE, null);
	public static Achievement Achievement_BoneIngot = CreateAchievement("BoneIngot", -3, 1, ModItems.BoneIngot, Achievement_Bone);
	public static Achievement Achievement_BonePickaxe = CreateAchievement("BonePickaxe", -1, 1, ModTools.BonePickaxe, Achievement_BoneIngot);
	
	//Obsidian Items
	public static Achievement Achievement_ObsidianShard = CreateAchievement("ObsidianShard", -5, 3, ModItems.ObsidianShard, null);
	public static Achievement Achievement_ObsidianIngot = CreateAchievement("ObsidianIngot", -3, 3, ModItems.ObsidianIngot, Achievement_ObsidianShard);
	public static Achievement Achievement_ObsidianPickaxe = CreateAchievement("ObsidianPickaxe", -1, 3, ModTools.ObsidianPickaxe, Achievement_ObsidianIngot);
	
	//Steel Items
	public static Achievement Achievement_SteelIngot = CreateAchievement("SteelIngot", 5, -1, ModItems.SteelIngot, null);
	public static Achievement Achievement_SteelPickaxe = CreateAchievement("SteelPickaxe", 3, -1, ModTools.SteelPickaxe, Achievement_SteelIngot);
	
	//Tin Items
	public static Achievement Achievement_CopperIngot = CreateAchievement("CopperIngot", 5, 1, ModItems.CopperIngot, null);
	public static Achievement Achievement_CopperPickaxe = CreateAchievement("CopperPickaxe", 3, 1, ModTools.CopperPickaxe, Achievement_CopperIngot);
	
	//Copper Items
	public static Achievement Achievement_TinIngot = CreateAchievement("TinIngot", 5, 3, ModItems.TinIngot, null);
	public static Achievement Achievement_TinPickaxe = CreateAchievement("TinPickaxe", 3, 3, ModTools.TinPickaxe, Achievement_TinIngot);
	
	//Create Achievements
	public static void RegisterAchievements() {
		Achievement[] AchievementArray = new Achievement[Achievements.size()];
		for(Achievement achievement : Achievements) {
			achievement.registerStat();
			AchievementArray[Achievements.indexOf(achievement)] = achievement;
		}
		
		AchievementPage.registerAchievementPage(new AchievementPage(Reference.NAME, AchievementArray));
	}
	
	private static Achievement CreateAchievement(String name, int column, int row, Item item, Achievement parent) {
		Achievement achievement = new Achievement("achievement." + name, name, column, row, item, parent);
		Achievements.add(achievement);
		return achievement;
	}
	
	private static Achievement CreateAchievement(String name, int column, int row, Block block, Achievement parent) {
		Achievement achievement = new Achievement("achievement." + name, name, column, row, block, parent);
		Achievements.add(achievement);
		return achievement;
	}
	
	private static Achievement CreateAchievement(String name, int column, int row, ItemStack stack, Achievement parent) {
		Achievement achievement = new Achievement("achievement." + name, name, column, row, stack, parent);
		Achievements.add(achievement);
		return achievement;
	}
}
*/
