package init;

import items.ItemGunpowderApple;
import items.ItemObsidianIngot;
import items.ItemSlimeApple;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item GunpowderApple;
	public static Item SlimeApple;
	public static Item ObsidianIngot;
	
	public static void init() {
		//Items
		GunpowderApple = new ItemGunpowderApple();
		SlimeApple = new ItemSlimeApple();
		ObsidianIngot = new ItemObsidianIngot();
	}
	public static void register() {
		//Register Items
		GameRegistry.register(GunpowderApple);
		GameRegistry.register(SlimeApple);
		GameRegistry.register(ObsidianIngot);
	}
	public static void registerRenders() {
		//Register Render Items
		registerRender(GunpowderApple);
		registerRender(SlimeApple);
		registerRender(ObsidianIngot);
	}
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
