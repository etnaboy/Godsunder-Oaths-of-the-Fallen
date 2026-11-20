package dev.godsunder.core;

import dev.godsunder.core.registry.CoreBlocks;
import dev.godsunder.core.registry.CoreItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GodsunderCore.MOD_ID)
public final class GodsunderCore {
    public static final String MOD_ID = "godsunder_core";

    public GodsunderCore() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        CoreBlocks.BLOCKS.register(modBus);
        CoreItems.ITEMS.register(modBus);
    }
}
