package blocks.fences;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Block_MossyCobblestoneFence extends BlockFence {
	
	public Block_MossyCobblestoneFence() {
		super(Material.ROCK, Material.ROCK.getMaterialMapColor());
		//
		setHardness(1.5f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 0);
		setSoundType(SoundType.STONE);
	
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.MOSSYCOBBLESTONEFENCE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.MOSSYCOBBLESTONEFENCE.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
}