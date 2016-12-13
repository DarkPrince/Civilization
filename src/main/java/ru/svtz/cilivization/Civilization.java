package ru.svtz.cilivization;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = "civilization",
        name = "Civilization",
        version = "0.0"
)
 
public class Civilization {
	 
    @SidedProxy(
            serverSide = "com.virysd.civilization.CommonProxy",
            clientSide = "com.virysd.civilization.ClientProxy"
    )
    public static CommonProxy proxy;
 
    public void preInit(FMLPreInitializationEvent event) {
 
    }
 
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }
 
    public void postInit(FMLPostInitializationEvent event) {
 
    }
}