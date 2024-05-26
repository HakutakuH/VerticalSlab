package com.hakutakuh.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

import static com.hakutakuh.VerticalSlab.MOD_ID;

public enum ItemsRegistry {
    //verticalslab
    OAK_VERTICAL_SLAB("oak_vertical_slab", () -> new BlockItem(BlocksRegistry.OAK_VERTICAL_SLAB.get(), new Item.Settings())),
    SPRUCE_VERTICAL_SLAB("spruce_vertical_slab", () -> new BlockItem(BlocksRegistry.SPRUCE_VERTICAL_SLAB.get(), new Item.Settings())),
    BIRCH_VERTICAL_SLAB("birch_vertical_slab", () -> new BlockItem(BlocksRegistry.BIRCH_VERTICAL_SLAB.get(), new Item.Settings())),
    JUNGLE_VERTICAL_SLAB("jungle_vertical_slab", () -> new BlockItem(BlocksRegistry.JUNGLE_VERTICAL_SLAB.get(), new Item.Settings())),
    ACACIA_VERTICAL_SLAB("acacia_vertical_slab", () -> new BlockItem(BlocksRegistry.ACACIA_VERTICAL_SLAB.get(), new Item.Settings())),
    CHERRY_VERTICAL_SLAB("cherry_vertical_slab", () -> new BlockItem(BlocksRegistry.CHERRY_VERTICAL_SLAB.get(), new Item.Settings())),
    DARK_OAK_VERTICAL_SLAB("dark_oak_vertical_slab", () -> new BlockItem(BlocksRegistry.DARK_OAK_VERTICAL_SLAB.get(), new Item.Settings())),
    MANGROVE_VERTICAL_SLAB("mangrove_vertical_slab", () -> new BlockItem(BlocksRegistry.MANGROVE_VERTICAL_SLAB.get(), new Item.Settings())),
    BAMBOO_VERTICAL_SLAB("bamboo_vertical_slab", () -> new BlockItem(BlocksRegistry.BAMBOO_VERTICAL_SLAB.get(), new Item.Settings())),
    BAMBOO_MOSAIC_VERTICAL_SLAB("bamboo_mosaic_vertical_slab", () -> new BlockItem(BlocksRegistry.BAMBOO_MOSAIC_VERTICAL_SLAB.get(), new Item.Settings())),
    STONE_VERTICAL_SLAB("stone_vertical_slab", () -> new BlockItem(BlocksRegistry.STONE_VERTICAL_SLAB.get(), new Item.Settings())),
    SMOOTH_STONE_VERTICAL_SLAB("smooth_stone_vertical_slab", () -> new BlockItem(BlocksRegistry.SMOOTH_STONE_VERTICAL_SLAB.get(), new Item.Settings())),
    SANDSTONE_VERTICAL_SLAB("sandstone_vertical_slab", () -> new BlockItem(BlocksRegistry.SANDSTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    CUT_SANDSTONE_VERTICAL_SLAB("cut_sandstone_vertical_slab", () -> new BlockItem(BlocksRegistry.CUT_SANDSTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    PETRIFIED_OAK_VERTICAL_SLAB("petrified_oak_vertical_slab", () -> new BlockItem(BlocksRegistry.PETRIFIED_OAK_VERTICAL_SLAB.get(), new Item.Settings())),
    COBBLESTONE_VERTICAL_SLAB("cobblestone_vertical_slab", () -> new BlockItem(BlocksRegistry.COBBLESTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    BRICK_VERTICAL_SLAB("brick_vertical_slab", () -> new BlockItem(BlocksRegistry.BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    STONE_BRICK_VERTICAL_SLAB("stone_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.STONE_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    MUD_BRICK_VERTICAL_SLAB("mud_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.MUD_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    NETHER_BRICK_VERTICAL_SLAB("nether_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.NETHER_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    QUARTZ_VERTICAL_SLAB("quartz_vertical_slab", () -> new BlockItem(BlocksRegistry.QUARTZ_VERTICAL_SLAB.get(), new Item.Settings())),
    RED_SANDSTONE_VERTICAL_SLAB("red_sandstone_vertical_slab", () -> new BlockItem(BlocksRegistry.RED_SANDSTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    CUT_RED_SANDSTONE_VERTICAL_SLAB("cut_red_sandstone_vertical_slab", () -> new BlockItem(BlocksRegistry.CUT_RED_SANDSTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    PURPUR_VERTICAL_SLAB("purpur_vertical_slab", () -> new BlockItem(BlocksRegistry.PURPUR_VERTICAL_SLAB.get(), new Item.Settings())),
    CRIMSON_VERTICAL_SLAB("crimson_vertical_slab", () -> new BlockItem(BlocksRegistry.CRIMSON_VERTICAL_SLAB.get(), new Item.Settings())),
    WARPED_VERTICAL_SLAB("warped_vertical_slab", () -> new BlockItem(BlocksRegistry.WARPED_VERTICAL_SLAB.get(), new Item.Settings())),
    MOSSY_COBBLESTONE_VERTICAL_SLAB("mossy_cobblestone_vertical_slab", () -> new BlockItem(BlocksRegistry.MOSSY_COBBLESTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    MOSSY_STONE_BRICK_VERTICAL_SLAB("mossy_stone_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.MOSSY_STONE_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    GRANITE_VERTICAL_SLAB("granite_vertical_slab", () -> new BlockItem(BlocksRegistry.GRANITE_VERTICAL_SLAB.get(), new Item.Settings())),
    POLISHED_GRANITE_VERTICAL_SLAB("polished_granite_vertical_slab", () -> new BlockItem(BlocksRegistry.POLISHED_GRANITE_VERTICAL_SLAB.get(), new Item.Settings())),
    DIORITE_VERTICAL_SLAB("diorite_vertical_slab", () -> new BlockItem(BlocksRegistry.DIORITE_VERTICAL_SLAB.get(), new Item.Settings())),
    POLISHED_DIORITE_VERTICAL_SLAB("polished_diorite_vertical_slab", () -> new BlockItem(BlocksRegistry.POLISHED_DIORITE_VERTICAL_SLAB.get(), new Item.Settings())),
    ANDESITE_VERTICAL_SLAB("andesite_vertical_slab", () -> new BlockItem(BlocksRegistry.ANDESITE_VERTICAL_SLAB.get(), new Item.Settings())),
    POLISHED_ANDESITE_VERTICAL_SLAB("polished_andesite_vertical_slab", () -> new BlockItem(BlocksRegistry.POLISHED_ANDESITE_VERTICAL_SLAB.get(), new Item.Settings())),
    COBBLED_DEEPSLATE_VERTICAL_SLAB("cobbled_deepslate_vertical_slab", () -> new BlockItem(BlocksRegistry.COBBLED_DEEPSLATE_VERTICAL_SLAB.get(), new Item.Settings())),
    POLISHED_DEEPSLATE_VERTICAL_SLAB("polished_deepslate_vertical_slab", () -> new BlockItem(BlocksRegistry.POLISHED_DEEPSLATE_VERTICAL_SLAB.get(), new Item.Settings())),
    DEEPSLATE_BRICK_VERTICAL_SLAB("deepslate_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.DEEPSLATE_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    DEEPSLATE_TILE_VERTICAL_SLAB("deepslate_tile_vertical_slab", () -> new BlockItem(BlocksRegistry.DEEPSLATE_TILE_VERTICAL_SLAB.get(), new Item.Settings())),
    TUFF_VERTICAL_SLAB("tuff_vertical_slab", () -> new BlockItem(BlocksRegistry.TUFF_VERTICAL_SLAB.get(), new Item.Settings())),
    TUFF_BRICK_VERTICAL_SLAB("tuff_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.TUFF_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    POLISHED_TUFF_VERTICAL_SLAB("polished_tuff_vertical_slab", () -> new BlockItem(BlocksRegistry.POLISHED_TUFF_VERTICAL_SLAB.get(), new Item.Settings())),
    SMOOTH_SANDSTONE_VERTICAL_SLAB("smooth_sandstone_vertical_slab", () -> new BlockItem(BlocksRegistry.SMOOTH_SANDSTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    SMOOTH_RED_SANDSTONE_VERTICAL_SLAB("smooth_red_sandstone_vertical_slab", () -> new BlockItem(BlocksRegistry.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    PRISMARINE_VERTICAL_SLAB("prismarine_vertical_slab", () -> new BlockItem(BlocksRegistry.PRISMARINE_VERTICAL_SLAB.get(), new Item.Settings())),
    PRISMARINE_BRICK_VERTICAL_SLAB("prismarine_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.PRISMARINE_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    DARK_PRISMARINE_VERTICAL_SLAB("dark_prismarine_vertical_slab", () -> new BlockItem(BlocksRegistry.DARK_PRISMARINE_VERTICAL_SLAB.get(), new Item.Settings())),
    RED_NETHER_BRICK_VERTICAL_SLAB("red_nether_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.RED_NETHER_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    BLACKSTONE_VERTICAL_SLAB("blackstone_vertical_slab", () -> new BlockItem(BlocksRegistry.BLACKSTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    POLISHED_BLACKSTONE_VERTICAL_SLAB("polished_blackstone_vertical_slab", () -> new BlockItem(BlocksRegistry.POLISHED_BLACKSTONE_VERTICAL_SLAB.get(), new Item.Settings())),
    POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB("polished_blackstone_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    END_STONE_BRICK_VERTICAL_SLAB("end_stone_brick_vertical_slab", () -> new BlockItem(BlocksRegistry.END_STONE_BRICK_VERTICAL_SLAB.get(), new Item.Settings())),
    SMOOTH_QUARTZ_VERTICAL_SLAB("smooth_quartz_vertical_slab", () -> new BlockItem(BlocksRegistry.SMOOTH_QUARTZ_VERTICAL_SLAB.get(), new Item.Settings())),
    CUT_COPPER_VERTICAL_SLAB("cut_copper_vertical_slab", () -> new BlockItem(BlocksRegistry.CUT_COPPER_VERTICAL_SLAB.get(), new Item.Settings())),
    WEATHERED_CUT_COPPER_VERTICAL_SLAB("weathered_cut_copper_vertical_slab", () -> new BlockItem(BlocksRegistry.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), new Item.Settings())),
    EXPOSED_CUT_COPPER_VERTICAL_SLAB("exposed_cut_copper_vertical_slab", () -> new BlockItem(BlocksRegistry.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), new Item.Settings())),
    OXIDIZED_CUT_COPPER_VERTICAL_SLAB("oxidized_cut_copper_vertical_slab", () -> new BlockItem(BlocksRegistry.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get(), new Item.Settings())),
    WAXED_CUT_COPPER_VERTICAL_SLAB("waxed_cut_copper_vertical_slab", () -> new BlockItem(BlocksRegistry.WAXED_CUT_COPPER_VERTICAL_SLAB.get(), new Item.Settings())),
    WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB("waxed_weathered_cut_copper_vertical_slab", () -> new BlockItem(BlocksRegistry.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get(), new Item.Settings())),
    WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB("waxed_exposed_cut_copper_vertical_slab", () -> new BlockItem(BlocksRegistry.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get(), new Item.Settings())),
    WAXED_OXIDIZED_COPPER_VERTICAL_SLAB("waxed_oxidized_cut_copper_vertical_slab", () -> new BlockItem(BlocksRegistry.WAXED_OXIDIZED_COPPER_VERTICAL_SLAB.get(), new Item.Settings())),
    ;

    private final String itemId;
    private final Supplier<Item> itemSupplier;
    private Item item;

    ItemsRegistry(String itemId, Supplier<Item> itemSupplier){
        this.itemId = itemId;
        this.itemSupplier = itemSupplier;

    }

    public static void registerAll(){
        for (ItemsRegistry value : values()){
            Registry.register(Registries.ITEM, new Identifier(MOD_ID,value.itemId),value.get());
        }
    }

    public Item get() {
        if (item == null) {
            item = itemSupplier.get();
        }

        return item;
    }
}
