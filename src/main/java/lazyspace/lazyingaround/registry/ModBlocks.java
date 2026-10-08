package lazyspace.lazyingaround.registry;

import lazyspace.lazyingaround.Lazyingaround;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block registerBlock(String name, Block block) {
        Identifier id = Identifier.of(Lazyingaround.MOD_ID, name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);

        Block.Settings settings = new Block.Settings()
                .registryKey(key);

        Registry.register(Registries.BLOCK, key, new Block(settings));
    }

    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.of(Lazyingaround.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        Item.Settings settings = new Item.Settings()
                .useBlockPrefixedTranslationKey()
                .registryKey(key);

        Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static void registerModBlocks() {
        Lazyingaround.LOGGER.info(Lazyingaround.MOD_ID + " blocks got registered :>");
    }

}
