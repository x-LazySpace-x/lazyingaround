package lazyspace.lazyingaround.registry;

import lazyspace.lazyingaround.Lazyingaround;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static Item registerItem(String name, Item.Settings settings) {
        Identifier id = Identifier.of("mymod", "test_item");
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static void registerModItems() {
        Lazyingaround.LOGGER.info(Lazyingaround.MOD_ID + " items got registered :>");
    }
}

