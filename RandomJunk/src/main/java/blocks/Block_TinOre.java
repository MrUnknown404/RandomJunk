package blocks;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Block_TinOre extends Block {

	public Block_TinOre() {
		super(Material.ROCK);
		//
		setHardness(2.25f);
		setResistance(10.0f);
		setHarvestLevel("pickaxe", 1);
		setSoundType(SoundType.STONE);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.TINORE.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.TINORE.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
}
