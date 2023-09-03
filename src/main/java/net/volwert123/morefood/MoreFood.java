package net.volwert123.morefood;

import net.fabricmc.api.ModInitializer;

import net.volwert123.morefood.block.MoreFoodBlocks;
import net.volwert123.morefood.item.MoreFoodItemGroups;
import net.volwert123.morefood.item.MoreFoodItems;
import net.volwert123.morefood.loot.MoreFoodLootModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFood implements ModInitializer {
	public static final String MOD_ID = "morefood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MoreFoodBlocks.registerMoreFoodBlocks();
		MoreFoodItemGroups.registerItemGroups();
		MoreFoodItems.registerMoreFoodItems();
		MoreFoodLootModifiers.modifyLootTables();
	}
}