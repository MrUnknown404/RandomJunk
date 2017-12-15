package blocks;

import java.util.Random;

import com.mrunknown404.randomjunk.Reference;

import init.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class Block_LapisTorch extends Block {

	//0.0625 * #
	private static final AxisAlignedBB BOUDNING_BOX = new AxisAlignedBB(0.0625*6.5, 0, 0.0625*6.5, 0.0625*9.5, 0.0625*10, 0.0625*9.5);
	
	public Block_LapisTorch() {
		super(Material.CIRCUITS);
		//
		setSoundType(SoundType.WOOD);
		setLightLevel(0.5f);
		setLightOpacity(1);
		
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.LAPISTORCH.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.LAPISTORCH.getRegistryName());
		
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
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUDNING_BOX;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return null;
	}
	
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
		World par1World = world;
		int par2 = pos.getX();
		int par3 = pos.getY();
		int par4 = pos.getZ();
		Random par5Random = random;
		if (true) {
			for (int la = 0; la < 1; ++la) {
				double d0 = (double) ((float) par2+0.725f) + (double) (par5Random.nextFloat()) * 0.1D;
				double d1 = ((double) ((float) par3-0.1f) + (double) (par5Random.nextFloat()) * 0.1D) + 0.5D;
				double d2 = (double) ((float) par4+0.425f) + (double) (par5Random.nextFloat()) * 0.1D;
				double d3 = 0.22D;
				double d4 = 0.27D;
				par1World.spawnParticle(EnumParticleTypes.REDSTONE, d0 - d4, d1 + d3, d2, -1.0D, 0.0D, 1.0D);
			}
		}
	}
}
