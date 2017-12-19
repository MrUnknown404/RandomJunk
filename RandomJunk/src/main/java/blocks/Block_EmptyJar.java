package blocks;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;


public class Block_EmptyJar extends Block {

	//0.0625 * #
	private static final AxisAlignedBB BOUDNING_BOX = new AxisAlignedBB(0.0625*(3.7-0.5), 0, 0.0625*(3.7-0.5), 0.0625*(12.3+0.5), 0.0625*10.75, 0.0625*(12.3+0.5));
	
	public Block_EmptyJar() {
		super(Material.GLASS);
		//
		setHardness(0.35f);
		setResistance(0.1f);
		setHarvestLevel("pickaxe", -1);
		setSoundType(SoundType.GLASS);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.EMPTYJAR.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.EMPTYJAR.getRegistryName());
		
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
		return BlockRenderLayer.CUTOUT;
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
