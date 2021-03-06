package blocks;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Block_CopperBlock extends Block {

	public Block_CopperBlock() {
		super(Material.IRON);
		//
		setHardness(8.0f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 1);
		setSoundType(SoundType.METAL);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.COPPERBLOCK.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.COPPERBLOCK.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
}
