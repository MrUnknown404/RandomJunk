package com.mrunknown404.randomjunk.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;

public class GuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
		
	}

	@Override
	public boolean hasConfigGui() {
		return true;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return new ModGUIConfig(parentScreen);
	}

	public Class<? extends GuiScreen> mainConfigGuiClass() {
		return ModGUIConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}

	//public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
	//	return null;
	//}
}
