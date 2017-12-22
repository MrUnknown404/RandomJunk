package blocks;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Block_CopperOre extends Block {

	public Block_CopperOre() {
		super(Material.ROCK);
		//
		setHardness(2.5f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 1);
		setSoundType(SoundType.STONE);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.COPPERORE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.COPPERORE.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
}
