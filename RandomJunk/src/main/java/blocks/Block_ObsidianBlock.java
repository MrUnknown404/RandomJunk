package blocks;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Block_ObsidianBlock extends Block {

	public Block_ObsidianBlock() {
		super(Material.ROCK);
		//
		setHardness(20.0f);
		setResistance(5000.0f);
		setHarvestLevel("pickaxe",3);
		setSoundType(SoundType.METAL);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.OBSIDIANBLOCK.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.OBSIDIANBLOCK.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkBlocks);
	}
}
