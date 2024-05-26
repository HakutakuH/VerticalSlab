package com.hakutakuh.registry;

import com.hakutakuh.block.OxidizableVerticalSlabBlock;
import com.hakutakuh.block.VerticalSlabBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

import static com.hakutakuh.VerticalSlab.MOD_ID;

public enum BlocksRegistry {
    //verticalslab
    OAK_VERTICAL_SLAB("oak_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)), true, flammable(90,80)),
    SPRUCE_VERTICAL_SLAB("spruce_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB)), true, flammable(90,80)),
    BIRCH_VERTICAL_SLAB("birch_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_SLAB)), true, flammable(90,80)),
    JUNGLE_VERTICAL_SLAB("jungle_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB)), true, flammable(90,80)),
    ACACIA_VERTICAL_SLAB("acacia_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_SLAB)), true, flammable(90,80)),
    CHERRY_VERTICAL_SLAB("cherry_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB)), true, flammable(90,80)),
    DARK_OAK_VERTICAL_SLAB("dark_oak_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_SLAB)), true, flammable(90,80)),
    MANGROVE_VERTICAL_SLAB("mangrove_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB)), true, flammable(90,80)),
    BAMBOO_VERTICAL_SLAB("bamboo_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB)), true, flammable(90,80)),
    BAMBOO_MOSAIC_VERTICAL_SLAB("bamboo_mosaic_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC_SLAB)), true, flammable(90,80)),
    STONE_VERTICAL_SLAB("stone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)), true),
    SMOOTH_STONE_VERTICAL_SLAB("smooth_stone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB)), true),
    SANDSTONE_VERTICAL_SLAB("sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB)), true),
    CUT_SANDSTONE_VERTICAL_SLAB("cut_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB)), true),
    PETRIFIED_OAK_VERTICAL_SLAB("petrified_oak_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)), true),
    COBBLESTONE_VERTICAL_SLAB("cobblestone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB)), true),
    BRICK_VERTICAL_SLAB("brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BRICK_SLAB)), true),
    STONE_BRICK_VERTICAL_SLAB("stone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB)), true),
    MUD_BRICK_VERTICAL_SLAB("mud_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICK_SLAB)), true),
    NETHER_BRICK_VERTICAL_SLAB("nether_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB)), true),
    QUARTZ_VERTICAL_SLAB("quartz_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB)), true),
    RED_SANDSTONE_VERTICAL_SLAB("red_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE_SLAB)), true),
    CUT_RED_SANDSTONE_VERTICAL_SLAB("cut_red_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB)), true),
    PURPUR_VERTICAL_SLAB("purpur_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB)), true),
    CRIMSON_VERTICAL_SLAB("crimson_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB)), true),
    WARPED_VERTICAL_SLAB("warped_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_SLAB)), true),
    MOSSY_COBBLESTONE_VERTICAL_SLAB("mossy_cobblestone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB)), true),
    MOSSY_STONE_BRICK_VERTICAL_SLAB("mossy_stone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB)), true),
    GRANITE_VERTICAL_SLAB("granite_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)), true),
    POLISHED_GRANITE_VERTICAL_SLAB("polished_granite_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB)), true),
    ANDESITE_VERTICAL_SLAB("andesite_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB)), true),
    POLISHED_ANDESITE_VERTICAL_SLAB("polished_andesite_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB)), true),
    DIORITE_VERTICAL_SLAB("diorite_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB)), true),
    POLISHED_DIORITE_VERTICAL_SLAB("polished_diorite_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE_SLAB)), true),
    COBBLED_DEEPSLATE_VERTICAL_SLAB("cobbled_deepslate_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)), true),
    POLISHED_DEEPSLATE_VERTICAL_SLAB("polished_deepslate_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB)), true),
    DEEPSLATE_BRICK_VERTICAL_SLAB("deepslate_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB)), true),
    DEEPSLATE_TILE_VERTICAL_SLAB("deepslate_tile_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB)), true),
    TUFF_VERTICAL_SLAB("tuff_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF_SLAB)), true),
    TUFF_BRICK_VERTICAL_SLAB("tuff_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF_BRICK_SLAB)), true),
    POLISHED_TUFF_VERTICAL_SLAB("polished_tuff_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_SLAB)), true),
    SMOOTH_SANDSTONE_VERTICAL_SLAB("smooth_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB)), true),
    SMOOTH_RED_SANDSTONE_VERTICAL_SLAB("smooth_red_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)), true),
    PRISMARINE_VERTICAL_SLAB("prismarine_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB)), true),
    PRISMARINE_BRICK_VERTICAL_SLAB("prismarine_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE_SLAB)), true),
    DARK_PRISMARINE_VERTICAL_SLAB("dark_prismarine_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)), true),
    RED_NETHER_BRICK_VERTICAL_SLAB("red_nether_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB)), true),
    BLACKSTONE_VERTICAL_SLAB("blackstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE_SLAB)), true),
    POLISHED_BLACKSTONE_VERTICAL_SLAB("polished_blackstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB)), true),
    POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB("polished_blackstone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)), true),
    END_STONE_BRICK_VERTICAL_SLAB("end_stone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB)), true),
    SMOOTH_QUARTZ_VERTICAL_SLAB("smooth_quartz_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB)), true),
    CUT_COPPER_VERTICAL_SLAB("cut_copper_vertical_slab", () -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED,AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)), true),
    WEATHERED_CUT_COPPER_VERTICAL_SLAB("weathered_cut_copper_vertical_slab", () -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.WEATHERED,AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)), true),
    EXPOSED_CUT_COPPER_VERTICAL_SLAB("exposed_cut_copper_vertical_slab", () -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.EXPOSED,AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)), true),
    OXIDIZED_CUT_COPPER_VERTICAL_SLAB("oxidized_cut_copper_vertical_slab", () -> new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.OXIDIZED,AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)), true),
    WAXED_CUT_COPPER_VERTICAL_SLAB("waxed_cut_copper_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB)), true),
    WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB("waxed_weathered_cut_copper_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB)), true),
    WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB("waxed_exposed_cut_copper_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB)), true),
    WAXED_OXIDIZED_COPPER_VERTICAL_SLAB("waxed_oxidized_cut_copper_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB)), true),
    ;

    private final String blockid;
    private final Supplier<Block> blockSupplier;
    private final FlammableBlockRegistry.Entry flammableRate;
    private final boolean isCutout;
    private Block block;

    private static FlammableBlockRegistry.Entry flammable(int burnChance, @SuppressWarnings("SameParameterValue") int spreadChance) {
        return new FlammableBlockRegistry.Entry(90, spreadChance);
    }

    private static boolean isValidFlammableEntry(FlammableBlockRegistry.Entry flammableRate) {
        return flammableRate != null && flammableRate.getBurnChance() > 0 && flammableRate.getSpreadChance() > 0;
    }

    BlocksRegistry(String pathName, Supplier<Block> blockSupplier, boolean isCutout) {
        this(pathName, blockSupplier, isCutout, new FlammableBlockRegistry.Entry(0, 0));
    }

    BlocksRegistry(String blockid, Supplier<Block> blockSupplier, boolean isCutout, FlammableBlockRegistry.Entry flammableRate){
        this.blockid = blockid;
        this.blockSupplier = blockSupplier;
        this.flammableRate = flammableRate;
        this.isCutout = isCutout;
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayer() {
        for (BlocksRegistry value : values()) {
            if (value.isCutout) {
                BlockRenderLayerMap.INSTANCE.putBlock(value.get(), RenderLayer.getCutout());
            }
        }
    }



    public static void registerAll(){
        for (BlocksRegistry value : values()){
            Registry.register(Registries.BLOCK, new Identifier(MOD_ID,value.blockid),value.get());
            if (isValidFlammableEntry(value.flammableRate)) {
                FlammableBlockRegistry.getDefaultInstance().add(value.get(), value.flammableRate);
            }
        }
    }



    public Block get() {
        if (block == null) {
            block = blockSupplier.get();
        }

        return block;
    }
}
