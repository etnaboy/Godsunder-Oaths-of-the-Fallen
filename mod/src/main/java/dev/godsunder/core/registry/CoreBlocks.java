package dev.godsunder.core.registry;

import dev.godsunder.core.GodsunderCore;
import dev.godsunder.core.block.EnchantingShelfBlock;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class CoreBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GodsunderCore.MOD_ID);

    public static final RegistryObject<Block> BEESHELF = wood("beeshelf", MapColor.COLOR_YELLOW, 0.75F);
    public static final RegistryObject<Block> BLAZING_HELLSHELF = stone("blazing_hellshelf", MapColor.COLOR_BLACK, 1.5F, ParticleTypes.FLAME);
    public static final RegistryObject<Block> CRYSTAL_SEASHELF = stone("crystal_seashelf", MapColor.COLOR_CYAN, 1.5F, ParticleTypes.BUBBLE);
    public static final RegistryObject<Block> DEEPSHELF = stone("deepshelf", MapColor.COLOR_BLACK, 2.5F, ParticleTypes.SCULK_SOUL);
    public static final RegistryObject<Block> DORMANT_DEEPSHELF = stone("dormant_deepshelf", MapColor.COLOR_BLACK, 2.5F, ParticleTypes.SCULK_SOUL);
    public static final RegistryObject<Block> DRACONIC_ENDSHELF = stone("draconic_endshelf", MapColor.SAND, 5.0F, ParticleTypes.PORTAL);
    public static final RegistryObject<Block> ECHOING_DEEPSHELF = stone("echoing_deepshelf", MapColor.COLOR_BLACK, 2.5F, ParticleTypes.SCULK_SOUL);
    public static final RegistryObject<Block> ENDSHELF = stone("endshelf", MapColor.SAND, 4.5F, ParticleTypes.PORTAL);
    public static final RegistryObject<Block> GLOWING_HELLSHELF = stone("glowing_hellshelf", MapColor.COLOR_BLACK, 1.5F, ParticleTypes.FLAME);
    public static final RegistryObject<Block> HEART_SEASHELF = stone("heart_seashelf", MapColor.COLOR_CYAN, 1.5F, ParticleTypes.BUBBLE);
    public static final RegistryObject<Block> HELLSHELF = stone("hellshelf", MapColor.COLOR_BLACK, 1.5F, ParticleTypes.FLAME);
    public static final RegistryObject<Block> INFUSED_HELLSHELF = stone("infused_hellshelf", MapColor.COLOR_BLACK, 1.5F, ParticleTypes.FLAME);
    public static final RegistryObject<Block> INFUSED_SEASHELF = stone("infused_seashelf", MapColor.COLOR_CYAN, 1.5F, ParticleTypes.BUBBLE);
    public static final RegistryObject<Block> MELONSHELF = wood("melonshelf", MapColor.COLOR_GREEN, 0.75F);
    public static final RegistryObject<Block> PEARL_ENDSHELF = stone("pearl_endshelf", MapColor.SAND, 4.5F, ParticleTypes.PORTAL);
    public static final RegistryObject<Block> SEASHELF = stone("seashelf", MapColor.COLOR_CYAN, 1.5F, ParticleTypes.BUBBLE);
    public static final RegistryObject<Block> SIGHTSHELF = stone("sightshelf", MapColor.COLOR_BLACK, 1.5F, ParticleTypes.FLAME);
    public static final RegistryObject<Block> SIGHTSHELF_T2 = stone("sightshelf_t2", MapColor.COLOR_BLACK, 1.5F, ParticleTypes.FLAME);
    public static final RegistryObject<Block> SOUL_TOUCHED_DEEPSHELF = stone("soul_touched_deepshelf", MapColor.COLOR_BLACK, 2.5F, ParticleTypes.SCULK_SOUL);
    public static final RegistryObject<Block> STONESHELF = stone("stoneshelf", MapColor.STONE, 1.75F, ParticleTypes.ENCHANT);

    private static RegistryObject<Block> stone(String name, MapColor color, float strength, ParticleOptions particle) {
        return BLOCKS.register(name, () -> new EnchantingShelfBlock(Block.Properties.of().mapColor(color).sound(SoundType.STONE).strength(strength).requiresCorrectToolForDrops(), particle));
    }
    private static RegistryObject<Block> wood(String name, MapColor color, float strength) {
        return BLOCKS.register(name, () -> new EnchantingShelfBlock(Block.Properties.of().mapColor(color).sound(SoundType.WOOD).strength(strength), ParticleTypes.ENCHANT));
    }
    private CoreBlocks() {}
}
