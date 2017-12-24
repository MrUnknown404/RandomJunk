package world;

import com.mrunknown404.randomjunk.handlers.ConfigHandler;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import world.biome.Biome_Dead;

public class ModBiomeRegistry {
	
	public static Biome Dead_Biome;
	
	public static final int Dead_BiomeID = ConfigHandler.ModBiomeID_Dead;
	
	public static void InitializeBiome() {
		Dead_Biome = new Biome_Dead(new BiomeProperties("Dead Biome"));
		Biome.registerBiome(Dead_BiomeID, "Dead Biome", Dead_Biome);
	}
	
	public static void RegisterBiome() {
		BiomeDictionary.addTypes(Dead_Biome, Type.SANDY ,Type.HOT, Type.DRY, Type.SPARSE, Type.RARE);
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(Dead_Biome, ConfigHandler.ModBiomeSpawnRate_Dead)); //1
		BiomeManager.addSpawnBiome(Dead_Biome);
		BiomeProvider.allowedBiomes.add(Dead_Biome);
	}
}
