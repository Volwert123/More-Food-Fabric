package net.volwert123.morefood.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreFoodDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(MoreFoodBlockLootTableProvider::new);
        pack.addProvider(MoreFoodModelProvider::new);
        pack.addProvider(MoreFoodRecipeProvider::new);
    }
}