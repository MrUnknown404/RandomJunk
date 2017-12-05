package com.mrunknown404.randomjunk.proxy;

import init.ModArmor;
import init.ModBlocks;
import init.ModItems;
import init.ModTools;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModArmor.registerRenders();
		ModTools.registerRenders();
	}
}
