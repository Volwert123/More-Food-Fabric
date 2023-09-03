package net.volwert123.morefood;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.volwert123.morefood.datagen.MoreFoodBlockLootTableProvider;
import net.volwert123.morefood.datagen.MoreFoodModelProvider;
import net.volwert123.morefood.datagen.MoreFoodRecipeProvider;

public class MoreFoodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(MoreFoodBlockLootTableProvider::new);
		pack.addProvider(MoreFoodModelProvider::new);
		pack.addProvider(MoreFoodRecipeProvider::new);
	}
}