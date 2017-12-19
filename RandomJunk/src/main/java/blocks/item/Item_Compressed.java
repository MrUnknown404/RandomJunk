package blocks.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class Item_Compressed extends ItemBlock {

	public Item_Compressed(Block block) {
		super(block);
		if(!(block instanceof IMetaBlockName)) {
			throw new IllegalArgumentException(String.format("The given Block %s is not an instance of IMetaBlockName! (Debuging is the best!)", block.getUnlocalizedName()));
		}
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + ((IMetaBlockName) this.block).getSpecialName(stack);
	}
	
	public int getMetadata(int damage) {
		return damage;
	}
}
