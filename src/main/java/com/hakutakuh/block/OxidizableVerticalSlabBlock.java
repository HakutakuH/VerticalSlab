package com.hakutakuh.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableVerticalSlabBlock extends VerticalSlabBlock implements Oxidizable {

    public static final MapCodec<OxidizableVerticalSlabBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(OxidationLevel.CODEC.fieldOf("weathering_state").forGetter(Degradable::getDegradationLevel), createSettingsCodec()).apply(instance, OxidizableVerticalSlabBlock::new);
    });
    private final Oxidizable.OxidationLevel oxidationLevel;

    public MapCodec<OxidizableVerticalSlabBlock> getCodec() {
        return CODEC;
    }

    public OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel oxidationLevel, AbstractBlock.Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
