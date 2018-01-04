package com.mrunknown404.randomjunk.client.gui;

import com.mrunknown404.randomjunk.Reference;

import container.ContainerWoodCrate;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import tileentity.TileEntityWoodCrate;

public class GuiWoodCrate extends GuiContainer {

	private TileEntityWoodCrate te;
	private IInventory playerInv;
	
	public GuiWoodCrate(IInventory playerInv, TileEntityWoodCrate te) {
		super(new ContainerWoodCrate(playerInv, te));
		
		this.xSize = 176;
		this.ySize = 222;
		
		this.te = te;
		this.playerInv = playerInv;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/gui/container/woodcrate.png"));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = I18n.format("container.WoodCrate");
		this.mc.fontRenderer.drawString(s, 8, 6, 4210752);
		this.mc.fontRenderer.drawString(this.playerInv.getDisplayName().getFormattedText(), 8, 129, 4210752);
	}
}
