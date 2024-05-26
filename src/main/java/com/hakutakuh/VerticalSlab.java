package com.hakutakuh;

import com.hakutakuh.registry.BlocksRegistry;
import com.hakutakuh.registry.ItemsRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticalSlab implements ModInitializer {

	public static final String MOD_ID = "verticalslab";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		BlocksRegistry.registerAll();
		ItemsRegistry.registerAll();
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.addAfter(Items.OAK_SLAB,ItemsRegistry.OAK_VERTICAL_SLAB.get());
			content.addAfter(Items.SPRUCE_SLAB,ItemsRegistry.SPRUCE_VERTICAL_SLAB.get());
			content.addAfter(Items.BIRCH_SLAB,ItemsRegistry.BIRCH_VERTICAL_SLAB.get());
			content.addAfter(Items.JUNGLE_SLAB,ItemsRegistry.JUNGLE_VERTICAL_SLAB.get());
			content.addAfter(Items.ACACIA_SLAB,ItemsRegistry.ACACIA_VERTICAL_SLAB.get());
			content.addAfter(Items.CHERRY_SLAB,ItemsRegistry.CHERRY_VERTICAL_SLAB.get());
			content.addAfter(Items.DARK_OAK_SLAB,ItemsRegistry.DARK_OAK_VERTICAL_SLAB.get());
			content.addAfter(Items.MANGROVE_SLAB,ItemsRegistry.MANGROVE_VERTICAL_SLAB.get());
			content.addAfter(Items.BAMBOO_SLAB,ItemsRegistry.BAMBOO_VERTICAL_SLAB.get());
			content.addAfter(Items.BAMBOO_MOSAIC_SLAB,ItemsRegistry.BAMBOO_MOSAIC_VERTICAL_SLAB.get());
			content.addAfter(Items.STONE_SLAB,ItemsRegistry.STONE_VERTICAL_SLAB.get());
			content.addAfter(Items.SMOOTH_STONE_SLAB,ItemsRegistry.SMOOTH_STONE_VERTICAL_SLAB.get());
			content.addAfter(Items.SANDSTONE_SLAB,ItemsRegistry.SANDSTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.CUT_SANDSTONE_SLAB,ItemsRegistry.CUT_SANDSTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.PETRIFIED_OAK_SLAB,ItemsRegistry.PETRIFIED_OAK_VERTICAL_SLAB.get());
			content.addAfter(Items.COBBLESTONE_SLAB,ItemsRegistry.COBBLESTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.BRICK_SLAB,ItemsRegistry.BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.STONE_BRICK_SLAB,ItemsRegistry.STONE_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.MUD_BRICK_SLAB,ItemsRegistry.MUD_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.NETHER_BRICK_SLAB,ItemsRegistry.NETHER_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.QUARTZ_SLAB,ItemsRegistry.QUARTZ_VERTICAL_SLAB.get());
			content.addAfter(Items.RED_SANDSTONE_SLAB,ItemsRegistry.RED_SANDSTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.CUT_RED_SANDSTONE_SLAB,ItemsRegistry.CUT_RED_SANDSTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.PURPUR_SLAB,ItemsRegistry.PURPUR_VERTICAL_SLAB.get());
			content.addAfter(Items.CRIMSON_SLAB,ItemsRegistry.CRIMSON_VERTICAL_SLAB.get());
			content.addAfter(Items.WARPED_SLAB,ItemsRegistry.WARPED_VERTICAL_SLAB.get());
			content.addAfter(Items.MOSSY_COBBLESTONE_SLAB,ItemsRegistry.MOSSY_COBBLESTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.MOSSY_STONE_BRICK_SLAB,ItemsRegistry.MOSSY_STONE_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.ANDESITE_SLAB,ItemsRegistry.ANDESITE_VERTICAL_SLAB.get());
			content.addAfter(Items.POLISHED_ANDESITE_SLAB,ItemsRegistry.POLISHED_ANDESITE_VERTICAL_SLAB.get());
			content.addAfter(Items.DIORITE_SLAB,ItemsRegistry.DIORITE_VERTICAL_SLAB.get());
			content.addAfter(Items.POLISHED_DIORITE_SLAB,ItemsRegistry.POLISHED_DIORITE_VERTICAL_SLAB.get());
			content.addAfter(Items.GRANITE_SLAB,ItemsRegistry.GRANITE_VERTICAL_SLAB.get());
			content.addAfter(Items.POLISHED_GRANITE_SLAB,ItemsRegistry.POLISHED_GRANITE_VERTICAL_SLAB.get());
			content.addAfter(Items.COBBLED_DEEPSLATE_SLAB,ItemsRegistry.COBBLED_DEEPSLATE_VERTICAL_SLAB.get());
			content.addAfter(Items.POLISHED_DEEPSLATE_SLAB,ItemsRegistry.POLISHED_DEEPSLATE_VERTICAL_SLAB.get());
			content.addAfter(Items.DEEPSLATE_TILE_SLAB,ItemsRegistry.DEEPSLATE_TILE_VERTICAL_SLAB.get());
			content.addAfter(Items.TUFF_SLAB,ItemsRegistry.TUFF_VERTICAL_SLAB.get());
			content.addAfter(Items.TUFF_BRICK_SLAB,ItemsRegistry.TUFF_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.POLISHED_TUFF_SLAB,ItemsRegistry.POLISHED_TUFF_VERTICAL_SLAB.get());
			content.addAfter(Items.SMOOTH_SANDSTONE_SLAB,ItemsRegistry.SMOOTH_SANDSTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.SMOOTH_RED_SANDSTONE_SLAB,ItemsRegistry.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.PRISMARINE_SLAB,ItemsRegistry.PRISMARINE_VERTICAL_SLAB.get());
			content.addAfter(Items.PRISMARINE_BRICK_SLAB,ItemsRegistry.PRISMARINE_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.DARK_PRISMARINE_SLAB,ItemsRegistry.DARK_PRISMARINE_VERTICAL_SLAB.get());
			content.addAfter(Items.RED_NETHER_BRICK_SLAB,ItemsRegistry.RED_NETHER_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.BLACKSTONE_SLAB,ItemsRegistry.BLACKSTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.POLISHED_BLACKSTONE_SLAB,ItemsRegistry.POLISHED_BLACKSTONE_VERTICAL_SLAB.get());
			content.addAfter(Items.POLISHED_BLACKSTONE_BRICK_SLAB,ItemsRegistry.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.END_STONE_BRICK_SLAB,ItemsRegistry.END_STONE_BRICK_VERTICAL_SLAB.get());
			content.addAfter(Items.SMOOTH_QUARTZ_SLAB,ItemsRegistry.SMOOTH_QUARTZ_VERTICAL_SLAB.get());
			content.addAfter(Items.CUT_COPPER_SLAB,ItemsRegistry.CUT_COPPER_VERTICAL_SLAB.get());
			content.addAfter(Items.WEATHERED_CUT_COPPER_SLAB,ItemsRegistry.WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
			content.addAfter(Items.EXPOSED_CUT_COPPER_SLAB,ItemsRegistry.EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
			content.addAfter(Items.OXIDIZED_CUT_COPPER_SLAB,ItemsRegistry.OXIDIZED_CUT_COPPER_VERTICAL_SLAB.get());
			content.addAfter(Items.WAXED_CUT_COPPER_SLAB,ItemsRegistry.WAXED_CUT_COPPER_VERTICAL_SLAB.get());
			content.addAfter(Items.WAXED_WEATHERED_CUT_COPPER_SLAB,ItemsRegistry.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB.get());
			content.addAfter(Items.WAXED_EXPOSED_CUT_COPPER_SLAB,ItemsRegistry.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB.get());
			content.addAfter(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB,ItemsRegistry.WAXED_OXIDIZED_COPPER_VERTICAL_SLAB.get());
		});
	}
}