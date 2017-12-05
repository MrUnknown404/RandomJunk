package blocks;

import com.mrunknown404.randomjunk.RandomJunk;
import com.mrunknown404.randomjunk.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Block_BoneBlock extends Block {

	public Block_BoneBlock() {
		super(Material.IRON);
		//
		setHardness(10.0f);
		setResistance(20.0f);
		setHarvestLevel("pickaxe", 1);
		setSoundType(SoundType.METAL);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.BONEBLOCK.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.BONEBLOCK.getRegistryName());
		setCreativeTab(RandomJunk.TabRandomJunkBlocks);
	}
}
