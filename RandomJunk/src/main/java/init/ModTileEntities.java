package init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import tileentity.TileEntityBigWoodCrate;
import tileentity.TileEntityQuickFurnace;
import tileentity.TileEntityWoodCrate;

public class ModTileEntities {
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityQuickFurnace.class, "QuickFurnace");
		GameRegistry.registerTileEntity(TileEntityWoodCrate.class, "WoodCrate");
		GameRegistry.registerTileEntity(TileEntityBigWoodCrate.class, "BigWoodCrate");
	}
}
