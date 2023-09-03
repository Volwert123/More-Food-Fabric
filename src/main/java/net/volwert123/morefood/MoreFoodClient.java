package net.volwert123.morefood;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.volwert123.morefood.block.MoreFoodBlocks;

public class MoreFoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MoreFoodBlocks.RICE_CROP, RenderLayer.getCutout());
    }
}