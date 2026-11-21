package dev.godsunder.core.block;

import dev.shadowsoffire.apotheosis.ench.api.IEnchantingBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

/**
 * A shelf block that contributes enchanting stats to an Apotheosis enchanting table.
 * <p>
 * Numerical values (Eterna, Quanta, Arcana, Rectification, Clues) are supplied by
 * data files under {@code data/godsunder_core/enchanting_stats/}. The interface
 * methods here act as fallbacks and for the table particle type.
 */
public class EnchantingShelfBlock extends Block implements IEnchantingBlock {

    private final ParticleOptions particle;

    public EnchantingShelfBlock(Properties properties, ParticleOptions particle) {
        super(properties);
        this.particle = particle;
    }

    @Override
    public ParticleOptions getTableParticle(BlockState state) {
        return particle;
    }

    @Override
    public float getMaxEnchantingPower(BlockState state, LevelReader world, BlockPos pos) {
        return 15.0F;
    }
}
