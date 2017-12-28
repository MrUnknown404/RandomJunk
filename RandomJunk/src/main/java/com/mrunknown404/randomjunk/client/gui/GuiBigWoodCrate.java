package com.mrunknown404.randomjunk.client.gui;

import com.mrunknown404.randomjunk.Reference;

import container.ContainerBigWoodCrate;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import tileentity.TileEntityBigWoodCrate;

public class GuiBigWoodCrate extends GuiContainer {

	private TileEntityBigWoodCrate te2;
	private IInventory playerInv;
	
	public GuiBigWoodCrate(IInventory playerInv, TileEntityBigWoodCrate te2) {
		super(new ContainerBigWoodCrate(playerInv, te2));
		
		this.xSize = 212;
		this.ySize = 256;
		
		this.te2 = te2;
		this.playerInv = playerInv;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/gui/container/bigwoodcrate.png"));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = I18n.format("container.BigWoodCrate");
		this.mc.fontRendererObj.drawString(s, 8, 6, 4210752);
		this.mc.fontRendererObj.drawString(this.playerInv.getDisplayName().getFormattedText(), 26, 147, 4210752);
	}
}
