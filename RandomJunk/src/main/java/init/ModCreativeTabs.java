package init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs{

	public static CreativeTabs TabRandomJunkItems = new CreativeTabs("Tab_RandomJunkItems") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.GunpowderApple);
		}
	};
	
	public static CreativeTabs TabRandomJunkBlocks = new CreativeTabs("Tab_RandomJunkBlocks") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.ObsidianBlock);
		}
	};
}
