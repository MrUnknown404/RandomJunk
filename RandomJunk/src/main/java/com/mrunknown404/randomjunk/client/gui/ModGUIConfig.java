package com.mrunknown404.randomjunk.client.gui;

import static com.mrunknown404.randomjunk.handlers.ConfigHandler.Config;
import static com.mrunknown404.randomjunk.handlers.ConfigHandler.category_general;
import static com.mrunknown404.randomjunk.handlers.ConfigHandler.getConfiguration;

import java.util.ArrayList;
import java.util.List;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.ConfigHandler;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ModGUIConfig extends GuiConfig {
	public ModGUIConfig(GuiScreen guiScreen) {
		super(guiScreen, getConfigElements(), Reference.MOD_ID, false, true, GuiConfig.getAbridgedConfigPath(getConfiguration().toString()));
	}
	
	private static List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(categoryElement(ConfigHandler.category_general, "General", "General"));
		list.add(categoryElement(ConfigHandler.category_debug, "Debug", "Debug"));
		list.add(categoryElement(ConfigHandler.category_worldgen, "WorldGen", "WorldGen"));
		return list;
	}
	
	private static IConfigElement categoryElement(String category, String name, String tooltip_key) {
		return new DummyConfigElement.DummyCategoryElement(name, tooltip_key, new ConfigElement(ConfigHandler.Config.getCategory(category)).getChildElements());
	}
}
