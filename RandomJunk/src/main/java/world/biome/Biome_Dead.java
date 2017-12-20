package world.biome;

import java.util.Random;

import com.mrunknown404.randomjunk.Reference;

import init.ModBlocks;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.world.biome.Biome;


public class Biome_Dead extends Biome {
	
	public Biome_Dead(BiomeProperties properties) {
		super(properties);
		topBlock = ModBlocks.SandyDirt.getDefaultState();
		fillerBlock = ModBlocks.SandyDirt.getDefaultState();

		spawnableCreatureList.clear();
		theBiomeDecorator.treesPerChunk = -999;
		theBiomeDecorator.deadBushPerChunk = 128;
		
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHusk.class, 4, 2, 3));
	}
}
