package com.mrunknown404.randomjunk.client.gui;

import com.mrunknown404.randomjunk.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

import static com.mrunknown404.randomjunk.handlers.ConfigHandler.*;

public class ModGUIConfig extends GuiConfig {
	public ModGUIConfig(GuiScreen guiScreen) {
		super(guiScreen,
				new ConfigElement(getConfiguration().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(getConfiguration().toString()));
	}
}
