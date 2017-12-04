package init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		//Add Recipe
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SlimeApple), "SSS", "SAS", "SSS", 'S',Items.SLIME_BALL,'A',Items.APPLE );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.GunpowderApple), "GGG", "GAG", "GGG", 'G',Items.GUNPOWDER,'A',Items.APPLE );
		//Smelting
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER), 0.1f);
	}
}
