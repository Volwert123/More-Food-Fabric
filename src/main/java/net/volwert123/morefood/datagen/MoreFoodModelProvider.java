package net.volwert123.morefood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.volwert123.morefood.block.MoreFoodBlocks;
import net.volwert123.morefood.block.RiceCropBlock;
import net.volwert123.morefood.item.MoreFoodItems;

public class MoreFoodModelProvider extends FabricModelProvider {

    public MoreFoodModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(MoreFoodBlocks.RICE_CROP, RiceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MoreFoodItems.IRON_CARROT, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_CARROT, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_CARROT, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.COOKED_CARROT, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.CARROT_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.CARROT_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.CARROT_BREAD, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.CARROT_PIE, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_APPLE, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_APPLE, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_APPLE, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.COOKED_APPLE, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.APPLE_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.APPLE_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.APPLE_BREAD, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.APPLE_PIE, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_KELP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.GOLD_KELP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_KELP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_KELP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.KELP_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.KELP_SOUP, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_POTATO, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.GOLD_POTATO, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_POTATO, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_POTATO, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.POTATO_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.POTATO_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.POTATO_BREAD, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.COOKED_PHANTOM, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PHANTOM_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PHANTOM_SOUP, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.PUFFERFISH_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PUFFERFISH_SOUP, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.PUMPKING_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PUMPKING_BREAD, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.COOKED_BAMBOO, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.BAMBOO_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.BAMBOO_SOUP, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_COOKED_RABBIT, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.GOLD_COOKED_RABBIT, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_COOKED_RABBIT, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_COOKED_RABBIT, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_MELON_SLICE, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.GOLD_MELON_SLICE, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_MELON_SLICE, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_MELON_SLICE, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_COOKED_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.GOLD_COOKED_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_COOKED_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_COOKED_CHICKEN, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_COOKED_MUTTON, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.GOLD_COOKED_MUTTON, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_COOKED_MUTTON, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_COOKED_MUTTON, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_COOKED_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.GOLD_COOKED_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_COOKED_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_COOKED_PORKCHOP, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.IRON_COOKED_BEEF, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.GOLD_COOKED_BEEF, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.DIAMOND_COOKED_BEEF, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.EMERALD_COOKED_BEEF, Models.GENERATED);

        itemModelGenerator.register(MoreFoodItems.RICE_CHICKENBOWL, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.RICE_CODBOWL, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.RICE_SALMONBOWL, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.RICE_VEGETABLEBOWL, Models.GENERATED);
    }
}