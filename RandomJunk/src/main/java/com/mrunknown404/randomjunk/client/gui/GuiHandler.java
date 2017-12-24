package com.mrunknown404.randomjunk.client.gui;

import container.ContainerWoodCrate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import tileentity.TileEntityWoodCrate;

public class GuiHandler implements IGuiHandler {

	public static final int WOODCRATE = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == WOODCRATE) {
			return new ContainerWoodCrate(player.inventory, (TileEntityWoodCrate) world.getTileEntity(new BlockPos(x,y,z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == WOODCRATE) {
			return new GuiWoodCrate(player.inventory, (TileEntityWoodCrate) world.getTileEntity(new BlockPos(x,y,z)));
		}
		return null;
	}
}
