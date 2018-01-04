package init;
/*
	//TO DO
	//TO DO
	//TO DO
	//TO DO

	GameRegistry.addRecipe(new ItemStack(ModBlocks.GroundLantern, 1), "T","I", 'T',Blocks.TORCH,                         'I',Items.IRON_INGOT);

	GameRegistry.addRecipe(new ItemStack(ModBlocks.GlowstoneTorch, 4), "G","S",'G',Items.GLOWSTONE_DUST,                 'S',Items.STICK);
	GameRegistry.addRecipe(new ItemStack(ModBlocks.LapisTorch, 4),     "G","S",'G',new ItemStack(Items.DYE, 1, 4),       'S',Items.STICK);

	GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 1),          "OO","OO", 'O',ModItems.ObsidianShard);
	GameRegistry.addRecipe(new ItemStack(Blocks.WOOL, 1),              "SS","SS", 'S',Items.STRING);

	GameRegistry.addRecipe(new ItemStack(ModBlocks.CobblestoneFence, 3),          "FSF","FSF",'S',Items.STICK,'F',Blocks.COBBLESTONE);
	GameRegistry.addRecipe(new ItemStack(ModBlocks.CobblestoneFenceGate, 1),      "SFS","SFS",'S',Items.STICK,'F',Blocks.COBBLESTONE);
	GameRegistry.addRecipe(new ItemStack(ModBlocks.MossyCobblestoneFence, 3),     "FSF","FSF",'S',Items.STICK,'F',Blocks.MOSSY_COBBLESTONE);
	GameRegistry.addRecipe(new ItemStack(ModBlocks.MossyCobblestoneFenceGate, 1), "SFS","SFS",'S',Items.STICK,'F',Blocks.MOSSY_COBBLESTONE);
	GameRegistry.addRecipe(new ItemStack(Blocks.NETHER_BRICK_FENCE, 3),           "FSF","FSF",'S',Items.STICK,'F',Blocks.NETHER_BRICK);
	GameRegistry.addRecipe(new ItemStack(ModBlocks.NetherBrickFenceGate, 1),      "SFS","SFS",'S',Items.STICK,'F',Blocks.NETHER_BRICK);

	//Crates
	for (int i = 0; i < 6; i++) {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.WoodCrate,1 ,i ),                        "WWW","WCW","WWW",'W',new ItemStack(Blocks.PLANKS,1,i),'C',Blocks.CHEST);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BigWoodCrate,1 ,i ), "IOI","OCO","IOI",'I',Items.IRON_INGOT,'O',"ingotCopper",'C',new ItemStack(ModBlocks.WoodCrate,1,i)));
	}

	//Compressed Blocks
	GameRegistry.addRecipe(new ItemStack(ModBlocks.CompressedCobblestone,1,0), "CCC","CCC","CCC",'C',Blocks.COBBLESTONE);
	GameRegistry.addRecipe(new ItemStack(ModBlocks.CompressedDirt,1,0),        "CCC","CCC","CCC",'C',Blocks.DIRT);
	GameRegistry.addRecipe(new ItemStack(ModBlocks.CompressedSand,1,0),        "CCC","CCC","CCC",'C',Blocks.SAND);

	for (int i = 0; i < 11; i++) {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.CompressedCobblestone,1,i+1), "CCC","CCC","CCC",'C',new ItemStack(ModBlocks.CompressedCobblestone, 1, i));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.CompressedDirt,1,i+1),        "CCC","CCC","CCC",'C',new ItemStack(ModBlocks.CompressedDirt, 1, i));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.CompressedSand,1,i+1),        "CCC","CCC","CCC",'C',new ItemStack(ModBlocks.CompressedSand, 1, i));
	}

	//Slab Recipes
	for (int i = 0; i < 6; i++) {
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 1, i),"S","S",'S',new ItemStack(Blocks.WOODEN_SLAB, 1, i));
	}

	GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 1),        "S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 0)); //Stone Slab
	GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE, 1),  "S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 3)); //Cobblestone Slab
	GameRegistry.addRecipe(new ItemStack(Blocks.BRICK_BLOCK, 1),  "S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 4)); //Brick Slab
	GameRegistry.addRecipe(new ItemStack(Blocks.NETHER_BRICK, 1), "S","S",'S',new ItemStack(Blocks.STONE_SLAB, 1, 6)); //Netherbrick Slab

	//-//-//Shapeless
	//-//Items
	//Misc
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRAVEL, 1), new ItemStack(Items.FLINT, 1), new ItemStack(Blocks.COBBLESTONE, 1));
	GameRegistry.addShapelessRecipe(new ItemStack(Items.MAGMA_CREAM, 2), new ItemStack(Items.SLIME_BALL, 1), new ItemStack(Items.BLAZE_POWDER, 1));

	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BoneMix, 1), new ItemStack(Items.BONE, 1), new ItemStack(Items.BONE, 1), new ItemStack(Items.BONE, 1)); //Block Into Ingot
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ObsidianShard, 4), new ItemStack(Blocks.OBSIDIAN, 1));

	GameRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 1), new ItemStack(Blocks.GRAVEL, 1)); //Gravel Into Flint

	//Compressed
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 9), new ItemStack(ModBlocks.CompressedCobblestone, 1, 0));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT, 9),        new ItemStack(ModBlocks.CompressedDirt, 1, 0));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 9),        new ItemStack(ModBlocks.CompressedSand, 1, 0));

	for (int i = 0; i < 11; i++) {
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedCobblestone, 9, i), new ItemStack(ModBlocks.CompressedCobblestone, 1, i+1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedDirt, 9, i),        new ItemStack(ModBlocks.CompressedDirt, 1, i+1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedSand, 9, i),        new ItemStack(ModBlocks.CompressedSand, 1, i+1));
	}

	//-//Blocks
	//Misc
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.HangingLantern, 1), new ItemStack(ModBlocks.GroundLantern, 1));
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GroundLantern, 1),  new ItemStack(ModBlocks.HangingLantern, 1));

	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 1),    new ItemStack(Blocks.SAND, 1, 1));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 1, 1), new ItemStack(Blocks.SAND, 1));

	//Wools
	for (int i = 0; i < 15; i++) {
		if (i !=0) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 0 ), new ItemStack(Items.DYE, 1, 15),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=1) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 1 ), new ItemStack(Items.DYE, 1, 14),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=2) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 2 ), new ItemStack(Items.DYE, 1, 13),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=3) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 3 ), new ItemStack(Items.DYE, 1, 12),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=4) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 4 ), new ItemStack(Items.DYE, 1, 11),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=5) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 5 ), new ItemStack(Items.DYE, 1, 10),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=6) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 6 ), new ItemStack(Items.DYE, 1, 9 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=7) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 7 ), new ItemStack(Items.DYE, 1, 8 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=8) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 8 ), new ItemStack(Items.DYE, 1, 7 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=9) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 9 ), new ItemStack(Items.DYE, 1, 6 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=10) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(Items.DYE, 1, 5 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=11) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(Items.DYE, 1, 4 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=12) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(Items.DYE, 1, 3 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=13) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(Items.DYE, 1, 2 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=14) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(Items.DYE, 1, 1 ),new ItemStack(Blocks.WOOL, 1, i));
		}
		if (i !=15) {
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(Items.DYE, 1, 0 ),new ItemStack(Blocks.WOOL, 1, i));
		}
	}

	//-//-//Smelting
	//Misc
	GameRegistry.addSmelting(Items.ROTTEN_FLESH,     new ItemStack(Items.LEATHER),          0.1f);

	GameRegistry.addSmelting(ModBlocks.CopperOre,    new ItemStack(ModItems.CopperIngot),   0.6f);
	GameRegistry.addSmelting(ModBlocks.TinOre,       new ItemStack(ModItems.TinIngot),      0.6f);
	
	GameRegistry.addSmelting(Items.IRON_INGOT,       new ItemStack(ModItems.SteelIngot),    0.2f);
	GameRegistry.addSmelting(Items.field_191525_da,  new ItemStack(ModItems.SteelNugget),   0.0222f);
	
	GameRegistry.addSmelting(Blocks.OBSIDIAN,        new ItemStack(ModItems.ObsidianIngot), 0.35f);
	GameRegistry.addSmelting(ModItems.BoneMix,       new ItemStack(ModItems.BoneIngot),     0.25f);
	GameRegistry.addSmelting(Items.FLINT,            new ItemStack(ModItems.FlintIngot),    0.25f);
*/
