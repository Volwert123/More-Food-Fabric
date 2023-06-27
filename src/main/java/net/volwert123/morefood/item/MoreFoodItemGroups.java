package net.volwert123.morefood.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.volwert123.morefood.MoreFood;

public class MoreFoodItemGroups {
    public static ItemGroup MORE_FOOD_TAB = Registry.register(Registries.ITEM_GROUP, new Identifier(MoreFood.MOD_ID, "morefood"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("More Food"))
                    .icon(() -> new ItemStack(MoreFoodItems.COOKED_CARROT))
                    .entries(((displayContext, entries) -> {
                        entries.add(MoreFoodItems.COOKED_CARROT);
                        entries.add(MoreFoodItems.CARROT_PIECES);
                        entries.add(MoreFoodItems.CARROT_SOUP);
                        entries.add(MoreFoodItems.CARROT_BREAD);
                        entries.add(MoreFoodItems.CARROT_PIE);
                        entries.add(MoreFoodItems.COOKED_APPLE);
                        entries.add(MoreFoodItems.APPLE_PIECES);
                        entries.add(MoreFoodItems.APPLE_SOUP);
                        entries.add(MoreFoodItems.APPLE_BREAD);
                        entries.add(MoreFoodItems.APPLE_PIE);
                        entries.add(MoreFoodItems.KELP_PIECES);
                        entries.add(MoreFoodItems.KELP_SOUP);
                        entries.add(MoreFoodItems.POTATO_PIECES);
                        entries.add(MoreFoodItems.POTATO_SOUP);
                        entries.add(MoreFoodItems.POTATO_BREAD);
                        entries.add(MoreFoodItems.COOKED_PHANTOM);
                        entries.add(MoreFoodItems.PHANTOM_PIECES);
                        entries.add(MoreFoodItems.PHANTOM_SOUP);
                        entries.add(MoreFoodItems.PUFFERFISH_PIECES);
                        entries.add(MoreFoodItems.PUFFERFISH_SOUP);
                        entries.add(MoreFoodItems.PUMPKING_SOUP);
                        entries.add(MoreFoodItems.PUMPKING_BREAD);
                        entries.add(MoreFoodItems.COOKED_BAMBOO);
                        entries.add(MoreFoodItems.BAMBOO_PIECES);
                        entries.add(MoreFoodItems.BAMBOO_SOUP);
                    })).build());

    public static void registerItemGroups() {
        MoreFood.LOGGER.info("Registering ModItemGroups for " + MoreFood.MOD_ID);
    }
}
