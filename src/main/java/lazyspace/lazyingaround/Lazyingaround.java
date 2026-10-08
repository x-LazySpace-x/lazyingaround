package lazyspace.lazyingaround;

import lazyspace.lazyingaround.registry.ModBlocks;
import lazyspace.lazyingaround.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lazyingaround implements ModInitializer {

	public static final String MOD_ID = "lazyingaround";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		LOGGER.info("_LazySpace_ fell asleep, mod initializing failed...");
		LOGGER.info("Nvm it worked!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
