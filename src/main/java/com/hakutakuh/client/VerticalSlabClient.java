package com.hakutakuh.client;

import com.hakutakuh.registry.BlocksRegistry;
import net.fabricmc.api.ClientModInitializer;

public class VerticalSlabClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlocksRegistry.registerRenderLayer();
    }
}
