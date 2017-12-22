package world.gen;

import java.util.Random;

import init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {
	
	//
	private WorldGenerator Tin_Overworld;
	private WorldGenerator Copper_Overworld;
	
	public OreGen() {
		Tin_Overworld = new WorldGenMinable(ModBlocks.TinOre.getDefaultState(), 8);
		Copper_Overworld = new WorldGenMinable(ModBlocks.CopperOre.getDefaultState(), 8);
		
		//Test_Nether = new WorldGenMinable(ModBlocks.TestBlock.getDefaultState(), 8 new NetherGenPredicate());
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
			case 0: { //Overworld
				this.runGenerator(Tin_Overworld, world, random, chunkX, chunkZ, 20, 0, 64);
				this.runGenerator(Copper_Overworld, world, random, chunkX, chunkZ, 20, 0, 64);
			}
			case -1: { //Nether
				
			}
			case 1: { //End
				
			}
		}
	}
}
