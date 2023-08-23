package net.volwert123.morefood.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.custom.*;

public class MoreFoodItems {
    public static final Item IRON_CARROT = registerItem("iron_carrot", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(3, 1.5f).build())));
    public static final Item DIAMOND_CARROT = registerItem("diamond_carrot", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(3, 1.5f).build())));
    public static final Item EMERALD_CARROT = registerItem("emerald_carrot", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(3, 1.5f).build())));
    public static final Item COOKED_CARROT = registerItem("cooked_carrot", new Item(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item CARROT_PIECES = registerItem("carrot_pieces", new Item(new FabricItemSettings()));
    public static final Item CARROT_SOUP = registerItem("carrot_soup", new SoupItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item CARROT_BREAD = registerItem("carrot_bread", new Item(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item CARROT_PIE = registerItem("carrot_pie", new Item(new FabricItemSettings().food(registerFoodValues(10, 5f).build())));

    public static final Item COOKED_APPLE = registerItem("cooked_apple", new Item(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item IRON_APPLE = registerItem("iron_apple", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(4, 2f).build())));
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(4, 2f).build())));
    public static final Item EMERALD_APPLE = registerItem("emerald_apple", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(4, 2f).build())));
    public static final Item APPLE_PIECES = registerItem("apple_pieces", new Item(new FabricItemSettings()));
    public static final Item APPLE_SOUP = registerItem("apple_soup", new SoupItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item APPLE_BREAD = registerItem("apple_bread", new Item(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new FabricItemSettings().food(registerFoodValues(10, 5f).build())));

    public static final Item IRON_KELP = registerItem("iron_kelp", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item GOLD_KELP = registerItem("gold_kelp", new GoldenFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item DIAMOND_KELP = registerItem("diamond_kelp", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item EMERALD_KELP = registerItem("emerald_kelp", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item KELP_PIECES = registerItem("kelp_pieces", new Item(new FabricItemSettings()));
    public static final Item KELP_SOUP = registerItem("kelp_soup", new SoupItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));

    public static final Item IRON_POTATO = registerItem("iron_potato", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item GOLD_POTATO = registerItem("gold_potato", new GoldenFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item DIAMOND_POTATO = registerItem("diamond_potato", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item EMERALD_POTATO = registerItem("emerald_potato", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item POTATO_PIECES = registerItem("potato_pieces", new Item(new FabricItemSettings()));
    public static final Item POTATO_SOUP = registerItem("potato_soup", new SoupItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item POTATO_BREAD = registerItem("potato_bread", new Item(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));

    public static final Item COOKED_PHANTOM = registerItem("cooked_phantom", new Item(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item PHANTOM_PIECES = registerItem("phantom_pieces", new Item(new FabricItemSettings()));
    public static final Item PHANTOM_SOUP = registerItem("phantom_soup", new SoupItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));

    public static final Item PUFFERFISH_PIECES = registerItem("pufferfish_pieces", new Item(new FabricItemSettings()));
    public static final Item PUFFERFISH_SOUP = registerItem("pufferfish_soup", new PufferfishSoupItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));

    public static final Item PUMPKING_SOUP = registerItem("pumpking_soup", new SoupItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item PUMPKING_BREAD = registerItem("pumpking_bread", new Item(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));

    public static final Item COOKED_BAMBOO = registerItem("cooked_bamboo", new Item(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item BAMBOO_PIECES = registerItem("bamboo_pieces", new Item(new FabricItemSettings()));
    public static final Item BAMBOO_SOUP = registerItem("bamboo_soup", new SoupItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));

    public static final Item IRON_COOKED_RABBIT = registerItem("iron_cooked_rabbit", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item GOLD_COOKED_RABBIT = registerItem("gold_cooked_rabbit", new GoldenFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item DIAMOND_COOKED_RABBIT = registerItem("diamond_cooked_rabbit", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item EMERALD_COOKED_RABBIT = registerItem("emerald_cooked_rabbit", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));

    public static final Item IRON_MELON_SLICE = registerItem("iron_melon_slice", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item GOLD_MELON_SLICE = registerItem("gold_melon_slice", new GoldenFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item DIAMOND_MELON_SLICE = registerItem("diamond_melon_slice", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));
    public static final Item EMERALD_MELON_SLICE = registerItem("emerald_melon_slice", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(5, 2.5f).build())));

    public static final Item IRON_COOKED_CHICKEN = registerItem("iron_cooked_chicken", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item GOLD_COOKED_CHICKEN = registerItem("gold_cooked_chicken", new GoldenFoodItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item DIAMOND_COOKED_CHICKEN = registerItem("diamond_cooked_chicken", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item EMERALD_COOKED_CHICKEN = registerItem("emerald_cooked_chicken", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));

    public static final Item IRON_COOKED_MUTTON = registerItem("iron_cooked_mutton", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item GOLD_COOKED_MUTTON = registerItem("gold_cooked_mutton", new GoldenFoodItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item DIAMOND_COOKED_MUTTON = registerItem("diamond_cooked_mutton", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));
    public static final Item EMERALD_COOKED_MUTTON = registerItem("emerald_cooked_mutton", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(6, 3f).build())));

    public static final Item IRON_COOKED_PORKCHOP = registerItem("iron_cooked_porkchop", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item GOLD_COOKED_PORKCHOP = registerItem("gold_cooked_porkchop", new GoldenFoodItem(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item DIAMOND_COOKED_PORKCHOP = registerItem("diamond_cooked_porkchop", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item EMERALD_COOKED_PORKCHOP = registerItem("emerald_cooked_porkchop", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));

    public static final Item IRON_COOKED_BEEF = registerItem("iron_cooked_beef", new IronFoodItem(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item GOLD_COOKED_BEEF = registerItem("gold_cooked_beef", new GoldenFoodItem(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item DIAMOND_COOKED_BEEF = registerItem("diamond_cooked_beef", new DiamondFoodItem(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));
    public static final Item EMERALD_COOKED_BEEF = registerItem("emerald_cooked_beef", new EmeraldFoodItem(new FabricItemSettings().food(registerFoodValues(8, 4f).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreFood.MOD_ID, name), item);
    }

    private static FoodComponent.Builder registerFoodValues(Integer hunger, Float saturation) {
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);
    }

    public static void registerMoreFoodItems() {
        MoreFood.LOGGER.info("Registering Items for " + MoreFood.MOD_ID);
    }
}