package net.volwert123.morefood.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.volwert123.morefood.MoreFood;

public class MoreFoodBlocks {
    public static final Block RICE_CROP = registerBlockWithoutBlockItem("rice_crop", new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MoreFood.MOD_ID, name), block);
    }

    public static void registerMoreFoodBlocks() {
        MoreFood.LOGGER.info("Registering Blocks for " + MoreFood.MOD_ID);
    }
}