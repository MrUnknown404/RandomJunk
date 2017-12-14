package blocks;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;


public class Block_GlowstoneTorch extends Block {

	//0.0625 * #
	private static final AxisAlignedBB BOUDNING_BOX = new AxisAlignedBB(0.0625*6.5, 0, 0.0625*6.5, 0.0625*9.5, 0.0625*10, 0.0625*9.5);
	
	public Block_GlowstoneTorch() {
		super(Material.WOOD);
		//
		setSoundType(SoundType.WOOD);
		setLightLevel(1);
		setLightOpacity(1);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.GLOWSTONETORCH.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.GLOWSTONETORCH.getRegistryName());
		
		setCreativeTab(ModCreativeTabs.TabRandomJunkBlocks);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUDNING_BOX;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return null;
	}
}
