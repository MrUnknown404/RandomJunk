package blocks;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class Block_SteelBlock extends Block {

	public Block_SteelBlock() {
		super(Material.IRON);
		//
		setHardness(6.0f);
		setResistance(40.0f);
		setHarvestLevel("pickaxe", 1);
		setSoundType(SoundType.METAL);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.STEELBLOCK.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.STEELBLOCK.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
}
