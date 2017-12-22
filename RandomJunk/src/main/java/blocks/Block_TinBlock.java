package blocks;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Block_TinBlock extends Block {

	public Block_TinBlock() {
		super(Material.IRON);
		//
		setHardness(8.0f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 1);
		setSoundType(SoundType.METAL);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.TINBLOCK.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.TINBLOCK.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
}
