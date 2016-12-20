package ru.svtz.civilization;

import ru.svtz.civilization.items.ItemFlag;

public class Reference {

	public static final String MOD_ID = "civilization";
	public static final String NAME = "DarkPrince's Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10]";
	
	public static final String CLIENT_PROXY_CLASS = "ru.svtz.civilization.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "ru.svtz.civilization.proxy.ServerProxy";
	
	public static enum MainItems {
		FLAG("flag", "ItemFlag"), CRACKER("cracker", "ItemCracker");
		
		
		private String unlocalizedName;
		private String registryName;
		
		MainItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
