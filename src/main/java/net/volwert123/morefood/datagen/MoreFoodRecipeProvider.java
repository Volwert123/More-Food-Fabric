package net.volwert123.morefood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.MoreFoodItems;

import java.util.function.Consumer;

public class MoreFoodRecipeProvider extends FabricRecipeProvider {

    public MoreFoodRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        createIronFoodRecipe(MoreFoodItems.IRON_CARROT, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_CARROT)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_CARROT, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_CARROT)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_CARROT, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_CARROT)));
        createSmeltingRecipe(MoreFoodItems.COOKED_CARROT, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_CARROT) + "_smelting"));
        createSmokingRecipe(MoreFoodItems.COOKED_CARROT, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_CARROT) + "_smoking"));
        createCampfireCookingRecipe(MoreFoodItems.COOKED_CARROT, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_CARROT) + "_campfire_cooking"));
        createPiecesRecipe(MoreFoodItems.CARROT_PIECES, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.CARROT_PIECES)));
        createSoupRecipe(MoreFoodItems.CARROT_SOUP, Items.CARROT, MoreFoodItems.CARROT_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.CARROT_SOUP)));
        createBreadRecipe(MoreFoodItems.CARROT_BREAD, Items.CARROT, MoreFoodItems.CARROT_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.CARROT_BREAD)));
        createPieRecipe(MoreFoodItems.CARROT_PIE, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.CARROT_PIE)));

        createIronFoodRecipe(MoreFoodItems.IRON_APPLE, Items.APPLE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_APPLE)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_APPLE, Items.APPLE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_APPLE)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_APPLE, Items.APPLE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_APPLE)));
        createSmeltingRecipe(MoreFoodItems.COOKED_APPLE, Items.APPLE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_APPLE) + "_smelting"));
        createSmokingRecipe(MoreFoodItems.COOKED_APPLE, Items.APPLE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_APPLE) + "_smoking"));
        createCampfireCookingRecipe(MoreFoodItems.COOKED_APPLE, Items.APPLE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_APPLE) + "_campfire_cooking"));
        createPiecesRecipe(MoreFoodItems.APPLE_PIECES, Items.APPLE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.APPLE_PIECES)));
        createSoupRecipe(MoreFoodItems.APPLE_SOUP, Items.APPLE, MoreFoodItems.APPLE_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.APPLE_SOUP)));
        createBreadRecipe(MoreFoodItems.APPLE_BREAD, Items.APPLE, MoreFoodItems.APPLE_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.APPLE_BREAD)));
        createPieRecipe(MoreFoodItems.APPLE_PIE, Items.APPLE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.APPLE_PIE)));

        createIronFoodRecipe(MoreFoodItems.IRON_KELP, Items.DRIED_KELP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_KELP)));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_KELP, Items.DRIED_KELP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_KELP)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_KELP, Items.DRIED_KELP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_KELP)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_KELP, Items.DRIED_KELP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_KELP)));
        createPiecesRecipe(MoreFoodItems.KELP_PIECES, Items.KELP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.KELP_PIECES)));
        createSoupRecipe(MoreFoodItems.KELP_SOUP, Items.KELP, MoreFoodItems.KELP_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.KELP_SOUP)));

        createIronFoodRecipe(MoreFoodItems.IRON_POTATO, Items.POTATO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_POTATO)));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_POTATO, Items.POTATO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_POTATO)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_POTATO, Items.POTATO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_POTATO)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_POTATO, Items.POTATO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_POTATO)));
        createPiecesRecipe(MoreFoodItems.POTATO_PIECES, Items.POTATO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.POTATO_PIECES)));
        createSoupRecipe(MoreFoodItems.POTATO_SOUP, Items.POTATO, MoreFoodItems.POTATO_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.POTATO_SOUP)));
        createBreadRecipe(MoreFoodItems.POTATO_BREAD, Items.POTATO, MoreFoodItems.POTATO_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.POTATO_BREAD)));

        createSmeltingRecipe(MoreFoodItems.COOKED_PHANTOM, Items.PHANTOM_MEMBRANE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_PHANTOM) + "_smelting"));
        createSmokingRecipe(MoreFoodItems.COOKED_PHANTOM, Items.PHANTOM_MEMBRANE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_PHANTOM) + "_smoking"));
        createCampfireCookingRecipe(MoreFoodItems.COOKED_PHANTOM, Items.PHANTOM_MEMBRANE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_PHANTOM) + "_campfire_cooking"));
        createPiecesRecipe(MoreFoodItems.PHANTOM_PIECES, Items.PHANTOM_MEMBRANE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PHANTOM_PIECES)));
        createSoupRecipe(MoreFoodItems.PHANTOM_SOUP, Items.PHANTOM_MEMBRANE, MoreFoodItems.PHANTOM_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PHANTOM_SOUP)));

        createPiecesRecipe(MoreFoodItems.PUFFERFISH_PIECES, Items.PUFFERFISH).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PUFFERFISH_PIECES)));
        createSoupRecipe(MoreFoodItems.PUFFERFISH_SOUP, Items.PUFFERFISH, MoreFoodItems.PUFFERFISH_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PUFFERFISH_SOUP)));

        createSoupRecipe(MoreFoodItems.PUMPKING_SOUP, Items.PUMPKIN, Items.PUMPKIN_SEEDS).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PUMPKING_SOUP)));
        createBreadRecipe(MoreFoodItems.PUMPKING_BREAD, Items.PUMPKIN, Items.PUMPKIN_SEEDS).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PUMPKING_BREAD)));

        createSmeltingRecipe(MoreFoodItems.COOKED_BAMBOO, Items.BAMBOO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_BAMBOO) + "_smelting"));
        createSmokingRecipe(MoreFoodItems.COOKED_BAMBOO, Items.BAMBOO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_BAMBOO) + "_smoking"));
        createCampfireCookingRecipe(MoreFoodItems.COOKED_BAMBOO, Items.BAMBOO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_BAMBOO) + "_campfire_cooking"));
        createPiecesRecipe(MoreFoodItems.BAMBOO_PIECES, Items.BAMBOO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.BAMBOO_PIECES)));
        createSoupRecipe(MoreFoodItems.BAMBOO_SOUP, Items.BAMBOO, MoreFoodItems.BAMBOO_PIECES).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.BAMBOO_SOUP)));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_RABBIT, Items.COOKED_RABBIT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_RABBIT)));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_RABBIT, Items.COOKED_RABBIT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_RABBIT)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_RABBIT, Items.COOKED_RABBIT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_RABBIT)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_RABBIT, Items.COOKED_RABBIT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_RABBIT)));

        createIronFoodRecipe(MoreFoodItems.IRON_MELON_SLICE, Items.MELON_SLICE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_MELON_SLICE)));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_MELON_SLICE, Items.MELON_SLICE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_MELON_SLICE)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_MELON_SLICE, Items.MELON_SLICE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_MELON_SLICE)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_MELON_SLICE, Items.MELON_SLICE).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_MELON_SLICE)));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_CHICKEN, Items.COOKED_CHICKEN).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_CHICKEN)));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_CHICKEN, Items.COOKED_CHICKEN).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_CHICKEN)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_CHICKEN, Items.COOKED_CHICKEN).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_CHICKEN)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_CHICKEN, Items.COOKED_CHICKEN).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_CHICKEN)));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_MUTTON, Items.COOKED_MUTTON).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_MUTTON)));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_MUTTON, Items.COOKED_MUTTON).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_MUTTON)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_MUTTON, Items.COOKED_MUTTON).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_MUTTON)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_MUTTON, Items.COOKED_MUTTON).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_MUTTON)));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_PORKCHOP, Items.COOKED_PORKCHOP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_PORKCHOP)));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_PORKCHOP, Items.COOKED_PORKCHOP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_PORKCHOP)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_PORKCHOP, Items.COOKED_PORKCHOP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_PORKCHOP)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_PORKCHOP, Items.COOKED_PORKCHOP).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_PORKCHOP)));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_BEEF, Items.COOKED_BEEF).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_BEEF)));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_BEEF, Items.COOKED_BEEF).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_BEEF)));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_BEEF, Items.COOKED_BEEF).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_BEEF)));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_BEEF, Items.COOKED_BEEF).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_BEEF)));

        createRiceBowlRecipe(MoreFoodItems.RICE_CHICKENBOWL, Items.COOKED_CHICKEN).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.RICE_CHICKENBOWL)));
        createRiceBowlRecipe(MoreFoodItems.RICE_CODBOWL, Items.COOKED_COD).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.RICE_CODBOWL)));
        createRiceBowlRecipe(MoreFoodItems.RICE_SALMONBOWL, Items.COOKED_SALMON).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.RICE_SALMONBOWL)));
        createRiceVegetableBowlRecipe().offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.RICE_VEGETABLEBOWL)));

        createSushiRecipe(MoreFoodItems.SUSHI_BAMBOO, Items.BAMBOO).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.SUSHI_BAMBOO)));
        createSushiRecipe(MoreFoodItems.SUSHI_BEETROOT, Items.BEETROOT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.SUSHI_BEETROOT)));
        createSushiRecipe(MoreFoodItems.SUSHI_CARROT, Items.CARROT).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.SUSHI_CARROT)));
        createSushiRecipe(MoreFoodItems.SUSHI_SALMON, Items.SALMON).offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.SUSHI_SALMON)));
    }

    private static ShapedRecipeJsonBuilder createIronFoodRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input('I', Items.IRON_INGOT)
                .input('#', input)
                .pattern("III")
                .pattern("I#I")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(input), conditionsFromItem(input));
    }

    private static ShapedRecipeJsonBuilder createGoldenFoodRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input('G', Items.GOLD_INGOT)
                .input('#', input)
                .pattern("GGG")
                .pattern("G#G")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(input), conditionsFromItem(input));
    }

    private static ShapedRecipeJsonBuilder createDiamondFoodRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input('D', Items.DIAMOND)
                .input('#', input)
                .pattern("DDD")
                .pattern("D#D")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(input), conditionsFromItem(input));
    }

    private static ShapedRecipeJsonBuilder createEmeraldFoodRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input('E', Items.EMERALD)
                .input('#', input)
                .pattern("EEE")
                .pattern("E#E")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(input), conditionsFromItem(input));
    }

    private static CookingRecipeJsonBuilder createSmeltingRecipe(ItemConvertible output, ItemConvertible input) {
        return CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(input), RecipeCategory.FOOD, output, 1.0f, 200).criterion(hasItem(input), conditionsFromItem(input));
    }

    private static CookingRecipeJsonBuilder createSmokingRecipe(ItemConvertible output, ItemConvertible input) {
        return CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(input), RecipeCategory.FOOD, output, 1.0f, 100).criterion(hasItem(input), conditionsFromItem(input));
    }

    private static CookingRecipeJsonBuilder createCampfireCookingRecipe(ItemConvertible output, ItemConvertible input) {
        return CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(input), RecipeCategory.FOOD, output, 1.0f, 600).criterion(hasItem(input), conditionsFromItem(input));
    }

    private static ShapelessRecipeJsonBuilder createPiecesRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 4)
                .input(input)
                .criterion(hasItem(input), conditionsFromItem(input));
    }

    private static ShapelessRecipeJsonBuilder createSoupRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible material) {
        return ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(Items.BOWL)
                .input(input)
                .input(material)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(material), conditionsFromItem(material));
    }

    private static ShapelessRecipeJsonBuilder createBreadRecipe(ItemConvertible output, ItemConvertible input, ItemConvertible material) {
        return ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(Items.WHEAT)
                .input(input)
                .input(material)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(material), conditionsFromItem(material));
    }

    private static ShapelessRecipeJsonBuilder createPieRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(input)
                .input(Items.EGG)
                .input(Items.SUGAR)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR));
    }

    private static ShapedRecipeJsonBuilder createRiceBowlRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input('B', Items.BOWL)
                .input('R', MoreFoodItems.RICE)
                .input('#', input)
                .pattern("  #")
                .pattern("RRR")
                .pattern(" B ")
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.RICE), conditionsFromItem(MoreFoodItems.RICE))
                .criterion(hasItem(input), conditionsFromItem(input));
    }
    private static ShapedRecipeJsonBuilder createRiceVegetableBowlRecipe() {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.RICE_VEGETABLEBOWL)
                .input('B', Items.BOWL)
                .input('R', MoreFoodItems.RICE)
                .input('A', MoreFoodItems.COOKED_BAMBOO)
                .input('C', Items.CARROT)
                .pattern(" AC")
                .pattern("RRR")
                .pattern(" B ")
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.RICE), conditionsFromItem(MoreFoodItems.RICE))
                .criterion(hasItem(MoreFoodItems.COOKED_BAMBOO), conditionsFromItem(MoreFoodItems.COOKED_BAMBOO))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT));
    }
    private static ShapedRecipeJsonBuilder createSushiRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input('K', Items.KELP)
                .input('R', MoreFoodItems.RICE)
                .input('#', input)
                .pattern("   ")
                .pattern("R#R")
                .pattern("KKK")
                .criterion(hasItem(Items.KELP), conditionsFromItem(Items.KELP))
                .criterion(hasItem(MoreFoodItems.RICE), conditionsFromItem(MoreFoodItems.RICE))
                .criterion(hasItem(input), conditionsFromItem(input));
    }
}