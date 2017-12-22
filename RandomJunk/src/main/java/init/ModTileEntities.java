package init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import tileentity.TileEntityQuickFurnace;

public class ModTileEntities {
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityQuickFurnace.class, "QuickFurnace");
	}
}
