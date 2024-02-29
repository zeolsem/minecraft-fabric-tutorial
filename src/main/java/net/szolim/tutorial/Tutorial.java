package net.szolim.tutorial;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorial implements ModInitializer {
	public static final String MOD_ID = "tutorial";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorial");
	public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);
	}
}