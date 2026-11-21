package dev.godsunder.core.registry;

import dev.godsunder.core.GodsunderCore;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class CoreItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GodsunderCore.MOD_ID);
    static {
        CoreBlocks.BLOCKS.getEntries().forEach(block -> ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties())));
    }
    private CoreItems() {}
}
