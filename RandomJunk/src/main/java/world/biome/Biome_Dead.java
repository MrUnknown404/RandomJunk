package world.biome;

import com.mrunknown404.randomjunk.Reference;

import init.ModBlocks;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.world.biome.Biome;

public class Biome_Dead extends Biome {
	
	public Biome_Dead(BiomeProperties properties) {
		super(properties);
		setRegistryName(Reference.RandomJunkBiomes.DEADBIOME.getRegistryName());
		
		topBlock = ModBlocks.SandyDirt.getDefaultState();
		fillerBlock = ModBlocks.SandyDirt.getDefaultState();
		
		decorator.treesPerChunk = -999;
		decorator.deadBushPerChunk = 128;
		
		spawnableCreatureList.clear();
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHusk.class, 4, 2, 3));
		
		properties.setBaseHeight(0.025F);
		properties.setHeightVariation(0.015F);
		properties.setTemperature(2.5F);
		properties.setRainfall(0.0F);
		properties.setRainDisabled();
		properties.setWaterColor(5193500);
	}
}
