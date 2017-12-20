package blocks;

import com.mrunknown404.randomjunk.Reference;
import com.sk89q.worldedit.util.Direction;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;


public class Block_SandyDirt extends Block {

	public Block_SandyDirt() {
		super(Material.GROUND);
		//
		setHardness(0.5f);
		setResistance(2.5f);
		setHarvestLevel("shovel", -1);
		setSoundType(SoundType.GROUND);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.SANDYDIRT.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.SANDYDIRT.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
		return true;
	}
}
