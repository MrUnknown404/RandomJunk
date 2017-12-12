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


public class Block_HangingLantern extends Block {

	//0.0625 * #
	private static final AxisAlignedBB BOUDNING_BOX = new AxisAlignedBB(0.0625*4.5, 0.0625*6, 0.0625*4.5, 0.0625*11.5, 0.0625*16, 0.0625*11.5);
	
	public Block_HangingLantern() {
		super(Material.IRON);
		//
		setHardness(0.75f);
		setResistance(0.1f);
		setHarvestLevel("pickaxe", 0);
		setSoundType(SoundType.METAL);
		setLightLevel(1);
		setLightOpacity(1);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.HANGINGLANTERN.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.HANGINGLANTERN.getRegistryName());
		
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
		return BOUDNING_BOX;
	}
}
