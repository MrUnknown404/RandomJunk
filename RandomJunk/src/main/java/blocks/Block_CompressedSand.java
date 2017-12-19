package blocks;

import com.mrunknown404.randomjunk.Reference;
import com.mrunknown404.randomjunk.handlers.EnumHandler.CompBlockTypes;

import blocks.item.IMetaBlockName;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class Block_CompressedSand extends Block implements IMetaBlockName {
	
	public static final PropertyEnum TYPE = PropertyEnum.create("type", CompBlockTypes.class);
	
	public Block_CompressedSand() {
		super(Material.ROCK);
		//
		setHardness(8.0f);
		setResistance(100.0f);
		setHarvestLevel("pickaxe", 0);
		
		setSoundType(SoundType.STONE);
		setDefaultState(this.blockState.getBaseState().withProperty(TYPE, CompBlockTypes.COMPRESSED_X1));
		//Get Names
		setUnlocalizedName(Reference.RandomJunkBlocks.COMPRESSEDSAND.getUnlocalizedName());
		setRegistryName(Reference.RandomJunkBlocks.COMPRESSEDSAND.getRegistryName());
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {TYPE});
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		CompBlockTypes type = (CompBlockTypes) state.getValue(TYPE);
		return type.getID();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TYPE, CompBlockTypes.values()[meta]);
	}
	
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
		for(int i = 0; i < CompBlockTypes.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		return CompBlockTypes.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
}
