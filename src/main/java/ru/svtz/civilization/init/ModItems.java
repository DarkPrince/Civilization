package ru.svtz.civilization.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.svtz.civilization.Reference;
import ru.svtz.civilization.items.ItemCracker;
import ru.svtz.civilization.items.ItemFlag;

public class ModItems {

	public static Item flag;
	public static Item cracker;
	
	public static void init() {
		flag = new ItemFlag();
		cracker = new ItemCracker();
	}
	public static void register() {
		GameRegistry.register(flag);
		GameRegistry.register(cracker);
	}
	public static void registerRenders() {
		registerRender(cracker);		
		registerRender(flag);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}
