package blocks.compressed;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Block_CompressedCobblestone11 extends Block {
	public Block_CompressedCobblestone11() {
		super(Material.ROCK);
		//
		setHardness(10.0f);
		setResistance(100.0f);
		setHarvestLevel("pickaxe", 0);
		setSoundType(SoundType.STONE);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.COMPRESSEDCOBBLESTONE11.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.COMPRESSEDCOBBLESTONE11.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
}
