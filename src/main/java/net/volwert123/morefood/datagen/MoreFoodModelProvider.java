package net.volwert123.morefood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.volwert123.morefood.item.MoreFoodItems;

public class MoreFoodModelProvider extends FabricModelProvider {

    public MoreFoodModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MoreFoodItems.COOKED_CARROT, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.CARROT_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.CARROT_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.COOKED_APPLE, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.APPLE_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.APPLE_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.KELP_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.KELP_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.POTATO_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.POTATO_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PHANTOM_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PHANTOM_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PUFFERFISH_PIECES, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PUFFERFISH_SOUP, Models.GENERATED);
        itemModelGenerator.register(MoreFoodItems.PUMPKING_SOUP, Models.GENERATED);
    }
}
