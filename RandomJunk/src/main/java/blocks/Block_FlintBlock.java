package blocks;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Block_FlintBlock extends Block {

	public Block_FlintBlock() {
		super(Material.IRON);
		//
		setHardness(8.0f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 1);
		setSoundType(SoundType.METAL);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.FLINTBLOCK.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.FLINTBLOCK.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
}
