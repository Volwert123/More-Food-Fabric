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
                        entries.add(MoreFoodItems.IRON_CARROT);
                        entries.add(MoreFoodItems.DIAMOND_CARROT);
                        entries.add(MoreFoodItems.EMERALD_CARROT);
                        entries.add(MoreFoodItems.COOKED_CARROT);
                        entries.add(MoreFoodItems.CARROT_PIECES);
                        entries.add(MoreFoodItems.CARROT_SOUP);
                        entries.add(MoreFoodItems.CARROT_BREAD);
                        entries.add(MoreFoodItems.CARROT_PIE);
                        entries.add(MoreFoodItems.IRON_APPLE);
                        entries.add(MoreFoodItems.DIAMOND_APPLE);
                        entries.add(MoreFoodItems.EMERALD_APPLE);
                        entries.add(MoreFoodItems.COOKED_APPLE);
                        entries.add(MoreFoodItems.APPLE_PIECES);
                        entries.add(MoreFoodItems.APPLE_SOUP);
                        entries.add(MoreFoodItems.APPLE_BREAD);
                        entries.add(MoreFoodItems.APPLE_PIE);
                        entries.add(MoreFoodItems.IRON_KELP);
                        entries.add(MoreFoodItems.Gold_KELP);
                        entries.add(MoreFoodItems.Diamond_KELP);
                        entries.add(MoreFoodItems.Emerald_KELP);
                        entries.add(MoreFoodItems.KELP_PIECES);
                        entries.add(MoreFoodItems.KELP_SOUP);
                        entries.add(MoreFoodItems.IRON_POTATO);
                        entries.add(MoreFoodItems.GOLD_POTATO);
                        entries.add(MoreFoodItems.DIAMOND_POTATO);
                        entries.add(MoreFoodItems.EMERALD_POTATO);
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
                        entries.add(MoreFoodItems.IRON_COOKED_RABBIT);
                        entries.add(MoreFoodItems.GOLD_COOKED_RABBIT);
                        entries.add(MoreFoodItems.DIAMOND_COOKED_RABBIT);
                        entries.add(MoreFoodItems.EMERALD_COOKED_RABBIT);
                        entries.add(MoreFoodItems.IRON_MELON_SLICE);
                        entries.add(MoreFoodItems.GOLD_MELON_SLICE);
                        entries.add(MoreFoodItems.DIAMOND_MELON_SLICE);
                        entries.add(MoreFoodItems.EMERALD_MELON_SLICE);
                        entries.add(MoreFoodItems.IRON_COOKED_CHICKEN);
                        entries.add(MoreFoodItems.GOLD_COOKED_CHICKEN);
                        entries.add(MoreFoodItems.DIAMOND_COOKED_CHICKEN);
                        entries.add(MoreFoodItems.EMERALD_COOKED_CHICKEN);
                        entries.add(MoreFoodItems.IRON_COOKED_MUTTON);
                        entries.add(MoreFoodItems.GOLD_COOKED_MUTTON);
                        entries.add(MoreFoodItems.DIAMOND_COOKED_MUTTON);
                        entries.add(MoreFoodItems.EMERALD_COOKED_MUTTON);
                        entries.add(MoreFoodItems.IRON_COOKED_PORKCHOP);
                        entries.add(MoreFoodItems.GOLD_COOKED_PORKCHOP);
                        entries.add(MoreFoodItems.DIAMOND_COOKED_PORKCHOP);
                        entries.add(MoreFoodItems.EMERALD_COOKED_PORKCHOP);
                        entries.add(MoreFoodItems.IRON_COOKED_BEEF);
                        entries.add(MoreFoodItems.GOLD_COOKED_BEEF);
                        entries.add(MoreFoodItems.DIAMOND_COOKED_BEEF);
                        entries.add(MoreFoodItems.EMERALD_COOKED_BEEF);
                    })).build());

    public static void registerItemGroups() {
        MoreFood.LOGGER.info("Registering ModItemGroups for " + MoreFood.MOD_ID);
    }
}
