package net.volwert123.morefood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
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
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.CARROT), RecipeCategory.FOOD, MoreFoodItems.COOKED_CARROT, 1.0f, 200)
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_CARROT) + "_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.CARROT), RecipeCategory.FOOD, MoreFoodItems.COOKED_CARROT, 1.0f, 100)
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_CARROT) + "_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.CARROT), RecipeCategory.FOOD, MoreFoodItems.COOKED_CARROT, 1.0f, 600)
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_CARROT) + "_campfire_cooking"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MoreFoodItems.CARROT_PIECES, 4)
                .input(Items.CARROT)
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.CARROT_PIECES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.CARROT_SOUP)
                .input(Items.BOWL)
                .input(MoreFoodItems.CARROT_PIECES)
                .input(Items.CARROT)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.CARROT_PIECES), conditionsFromItem(MoreFoodItems.CARROT_PIECES))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.CARROT_SOUP)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.APPLE), RecipeCategory.FOOD, MoreFoodItems.COOKED_APPLE, 1.0f, 200)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_APPLE) + "_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.APPLE), RecipeCategory.FOOD, MoreFoodItems.COOKED_APPLE, 1.0f, 100)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_APPLE) + "_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.APPLE), RecipeCategory.FOOD, MoreFoodItems.COOKED_APPLE, 1.0f, 600)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_APPLE) + "_campfire_cooking"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MoreFoodItems.APPLE_PIECES, 4)
                .input(Items.APPLE)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.APPLE_PIECES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.APPLE_SOUP)
                .input(Items.BOWL)
                .input(MoreFoodItems.APPLE_PIECES)
                .input(Items.APPLE)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.APPLE_PIECES), conditionsFromItem(MoreFoodItems.APPLE_PIECES))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.APPLE_SOUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MoreFoodItems.KELP_PIECES, 4)
                .input(Items.KELP)
                .criterion(hasItem(Items.KELP), conditionsFromItem(Items.KELP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.KELP_PIECES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.KELP_SOUP)
                .input(Items.BOWL)
                .input(MoreFoodItems.KELP_PIECES)
                .input(Items.KELP)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.KELP_PIECES), conditionsFromItem(MoreFoodItems.KELP_SOUP))
                .criterion(hasItem(Items.KELP), conditionsFromItem(Items.KELP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.KELP_SOUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MoreFoodItems.POTATO_PIECES, 4)
                .input(Items.POTATO)
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.POTATO_PIECES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.POTATO_SOUP)
                .input(Items.BOWL)
                .input(MoreFoodItems.POTATO_PIECES)
                .input(Items.POTATO)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.POTATO_PIECES), conditionsFromItem(MoreFoodItems.POTATO_PIECES))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.POTATO_SOUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MoreFoodItems.PHANTOM_PIECES, 4)
                .input(Items.PHANTOM_MEMBRANE)
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PHANTOM_PIECES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.PHANTOM_SOUP)
                .input(Items.BOWL)
                .input(MoreFoodItems.PHANTOM_PIECES)
                .input(Items.PHANTOM_MEMBRANE)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.PHANTOM_PIECES), conditionsFromItem(MoreFoodItems.PHANTOM_PIECES))
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PHANTOM_SOUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MoreFoodItems.PUFFERFISH_PIECES, 4)
                .input(Items.PUFFERFISH)
                .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PUFFERFISH_PIECES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.PUFFERFISH_SOUP)
                .input(Items.BOWL)
                .input(MoreFoodItems.PUFFERFISH_PIECES)
                .input(Items.PUFFERFISH)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.PUFFERFISH_PIECES), conditionsFromItem(MoreFoodItems.PUFFERFISH_PIECES))
                .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PUFFERFISH_SOUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.PUMPKING_SOUP)
                .input(Items.BOWL)
                .input(Items.PUMPKIN_SEEDS)
                .input(Items.PUMPKIN)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(Items.PUMPKIN_SEEDS), conditionsFromItem(Items.PUMPKIN_SEEDS))
                .criterion(hasItem(Items.PUMPKIN), conditionsFromItem(Items.PUMPKIN))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PUMPKING_SOUP)));

    }
}
