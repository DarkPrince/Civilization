package ru.svtz.civilization.proxy;

import ru.svtz.civilization.init.ModItems;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init() {
		ModItems.registerRenders();
	}	
}
