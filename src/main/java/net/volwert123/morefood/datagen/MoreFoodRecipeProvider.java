package net.volwert123.morefood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_CARROT)
                .input('I', Items.IRON_INGOT)
                .input('C', Items.CARROT)
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_CARROT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_CARROT)
                .input('D', Items.DIAMOND)
                .input('C', Items.CARROT)
                .pattern("DDD")
                .pattern("DCD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_CARROT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_CARROT)
                .input('E', Items.EMERALD)
                .input('C', Items.CARROT)
                .pattern("EEE")
                .pattern("ECE")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_CARROT)));


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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.CARROT_BREAD)
                .input(Items.WHEAT)
                .input(Items.CARROT)
                .input(MoreFoodItems.CARROT_PIECES)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .criterion(hasItem(MoreFoodItems.CARROT_PIECES), conditionsFromItem(MoreFoodItems.CARROT_PIECES))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.CARROT_BREAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.CARROT_PIE)
                .input(Items.CARROT)
                .input(Items.EGG)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.CARROT_PIE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_APPLE)
                .input('I', Items.IRON_INGOT)
                .input('A', Items.APPLE)
                .pattern("III")
                .pattern("IAI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_APPLE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_APPLE)
                .input('D', Items.DIAMOND)
                .input('A', Items.APPLE)
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_APPLE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_APPLE)
                .input('E', Items.EMERALD)
                .input('A', Items.APPLE)
                .pattern("EEE")
                .pattern("EAE")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_APPLE)));


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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.APPLE_BREAD)
                .input(Items.WHEAT)
                .input(Items.APPLE)
                .input(MoreFoodItems.APPLE_PIECES)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .criterion(hasItem(MoreFoodItems.APPLE_PIECES), conditionsFromItem(MoreFoodItems.APPLE_PIECES))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.APPLE_BREAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.APPLE_PIE)
                .input(Items.APPLE)
                .input(Items.EGG)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.APPLE_PIE)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_KELP)
                .input('I', Items.IRON_INGOT)
                .input('K', Items.DRIED_KELP)
                .pattern("III")
                .pattern("IKI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.DRIED_KELP), conditionsFromItem(Items.DRIED_KELP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_KELP)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.Gold_KELP)
                .input('G', Items.GOLD_INGOT)
                .input('K', Items.DRIED_KELP)
                .pattern("GGG")
                .pattern("GKG")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.DRIED_KELP), conditionsFromItem(Items.DRIED_KELP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.Gold_KELP)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.Diamond_KELP)
                .input('D', Items.DIAMOND)
                .input('K', Items.DRIED_KELP)
                .pattern("DDD")
                .pattern("DKD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.DRIED_KELP), conditionsFromItem(Items.DRIED_KELP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.Diamond_KELP)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.Emerald_KELP)
                .input('E', Items.EMERALD)
                .input('K', Items.DRIED_KELP)
                .pattern("EEE")
                .pattern("EKE")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.DRIED_KELP), conditionsFromItem(Items.DRIED_KELP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.Emerald_KELP)));



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



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_POTATO)
                .input('I', Items.IRON_INGOT)
                .input('P', Items.POTATO)
                .pattern("III")
                .pattern("IPI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_POTATO)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.GOLD_POTATO)
                .input('G', Items.GOLD_INGOT)
                .input('P', Items.POTATO)
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_POTATO)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_POTATO)
                .input('D', Items.DIAMOND)
                .input('P', Items.POTATO)
                .pattern("DDD")
                .pattern("DPD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_POTATO)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_POTATO)
                .input('E', Items.EMERALD)
                .input('P', Items.POTATO)
                .pattern("EEE")
                .pattern("EPE")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_POTATO)));


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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.POTATO_BREAD)
                .input(Items.WHEAT)
                .input(Items.POTATO)
                .input(MoreFoodItems.POTATO_PIECES)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .criterion(hasItem(MoreFoodItems.POTATO_PIECES), conditionsFromItem(MoreFoodItems.POTATO_PIECES))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.POTATO_BREAD)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.PHANTOM_MEMBRANE), RecipeCategory.FOOD, MoreFoodItems.COOKED_PHANTOM, 1.0f, 200)
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_PHANTOM) + "_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.PHANTOM_MEMBRANE), RecipeCategory.FOOD, MoreFoodItems.COOKED_PHANTOM, 1.0f, 100)
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_PHANTOM) + "_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.PHANTOM_MEMBRANE), RecipeCategory.FOOD, MoreFoodItems.COOKED_PHANTOM, 1.0f, 600)
                .criterion(hasItem(Items.PHANTOM_MEMBRANE), conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_PHANTOM) + "_campfire_cooking"));


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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.PUMPKING_BREAD)
                .input(Items.WHEAT)
                .input(Items.PUMPKIN)
                .input(Items.PUMPKIN_SEEDS)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.PUMPKIN), conditionsFromItem(Items.PUMPKIN))
                .criterion(hasItem(Items.PUMPKIN_SEEDS), conditionsFromItem(Items.PUMPKIN_SEEDS))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.PUMPKING_BREAD)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BAMBOO), RecipeCategory.FOOD, MoreFoodItems.COOKED_BAMBOO, 1.0f, 200)
                .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_BAMBOO) + "_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.BAMBOO), RecipeCategory.FOOD, MoreFoodItems.COOKED_BAMBOO, 1.0f, 100)
                .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_BAMBOO) + "_smoking"));

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.BAMBOO), RecipeCategory.FOOD, MoreFoodItems.COOKED_BAMBOO, 1.0f, 600)
                .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.COOKED_BAMBOO) + "_campfire_cooking"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MoreFoodItems.BAMBOO_PIECES, 4)
                .input(Items.BAMBOO)
                .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.BAMBOO_PIECES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.BAMBOO_SOUP)
                .input(Items.BOWL)
                .input(MoreFoodItems.BAMBOO_PIECES)
                .input(Items.BAMBOO)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(MoreFoodItems.BAMBOO_PIECES), conditionsFromItem(MoreFoodItems.BAMBOO_PIECES))
                .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.BAMBOO_SOUP)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_COOKED_RABBIT)
                .input('I', Items.IRON_INGOT)
                .input('R', Items.COOKED_RABBIT)
                .pattern("III")
                .pattern("IRI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.COOKED_RABBIT), conditionsFromItem(Items.COOKED_RABBIT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_RABBIT)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.GOLD_COOKED_RABBIT)
                .input('G', Items.GOLD_INGOT)
                .input('R', Items.COOKED_RABBIT)
                .pattern("GGG")
                .pattern("GRG")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.COOKED_RABBIT), conditionsFromItem(Items.COOKED_RABBIT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_RABBIT)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_COOKED_RABBIT)
                .input('D', Items.DIAMOND)
                .input('R', Items.COOKED_RABBIT)
                .pattern("DDD")
                .pattern("DRD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.COOKED_RABBIT), conditionsFromItem(Items.COOKED_RABBIT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_RABBIT)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_COOKED_RABBIT)
                .input('E', Items.EMERALD)
                .input('R', Items.COOKED_RABBIT)
                .pattern("EEE")
                .pattern("ERE")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.COOKED_RABBIT), conditionsFromItem(Items.COOKED_RABBIT))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_RABBIT)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_MELON_SLICE)
                .input('I', Items.IRON_INGOT)
                .input('M', Items.MELON_SLICE)
                .pattern("III")
                .pattern("IMI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(Items.MELON_SLICE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_MELON_SLICE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.GOLD_MELON_SLICE)
                .input('G', Items.GOLD_INGOT)
                .input('M', Items.MELON_SLICE)
                .pattern("GGG")
                .pattern("GMG")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(Items.MELON_SLICE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_MELON_SLICE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_MELON_SLICE)
                .input('D', Items.DIAMOND)
                .input('M', Items.MELON_SLICE)
                .pattern("DDD")
                .pattern("DMD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(Items.MELON_SLICE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_MELON_SLICE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_MELON_SLICE)
                .input('E', Items.EMERALD)
                .input('M', Items.MELON_SLICE)
                .pattern("EEE")
                .pattern("EME")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(Items.MELON_SLICE))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_MELON_SLICE)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_COOKED_CHICKEN)
                .input('I', Items.IRON_INGOT)
                .input('C', Items.COOKED_CHICKEN)
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_CHICKEN)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.GOLD_COOKED_CHICKEN)
                .input('G', Items.GOLD_INGOT)
                .input('C', Items.COOKED_CHICKEN)
                .pattern("GGG")
                .pattern("GCG")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_CHICKEN)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_COOKED_CHICKEN)
                .input('D', Items.DIAMOND)
                .input('C', Items.COOKED_CHICKEN)
                .pattern("DDD")
                .pattern("DCD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_CHICKEN)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_COOKED_CHICKEN)
                .input('E', Items.EMERALD)
                .input('C', Items.COOKED_CHICKEN)
                .pattern("EEE")
                .pattern("ECE")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_CHICKEN)));




        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_COOKED_MUTTON)
                .input('I', Items.IRON_INGOT)
                .input('M', Items.COOKED_MUTTON)
                .pattern("III")
                .pattern("IMI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.COOKED_MUTTON), conditionsFromItem(Items.COOKED_MUTTON))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_MUTTON)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.GOLD_COOKED_MUTTON)
                .input('G', Items.GOLD_INGOT)
                .input('M', Items.COOKED_MUTTON)
                .pattern("GGG")
                .pattern("GMG")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.COOKED_MUTTON), conditionsFromItem(Items.COOKED_MUTTON))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_MUTTON)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_COOKED_MUTTON)
                .input('D', Items.DIAMOND)
                .input('M', Items.COOKED_MUTTON)
                .pattern("DDD")
                .pattern("DMD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.COOKED_MUTTON), conditionsFromItem(Items.COOKED_MUTTON))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_MUTTON)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_COOKED_MUTTON)
                .input('E', Items.EMERALD)
                .input('M', Items.COOKED_MUTTON)
                .pattern("EEE")
                .pattern("EME")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.COOKED_MUTTON), conditionsFromItem(Items.COOKED_MUTTON))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_MUTTON)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_COOKED_PORKCHOP)
                .input('I', Items.IRON_INGOT)
                .input('P', Items.COOKED_PORKCHOP)
                .pattern("III")
                .pattern("IPI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.COOKED_PORKCHOP), conditionsFromItem(Items.COOKED_PORKCHOP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_PORKCHOP)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.GOLD_COOKED_PORKCHOP)
                .input('G', Items.GOLD_INGOT)
                .input('P', Items.COOKED_PORKCHOP)
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.COOKED_PORKCHOP), conditionsFromItem(Items.COOKED_PORKCHOP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_PORKCHOP)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_COOKED_PORKCHOP)
                .input('D', Items.DIAMOND)
                .input('P', Items.COOKED_PORKCHOP)
                .pattern("DDD")
                .pattern("DPD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.COOKED_PORKCHOP), conditionsFromItem(Items.COOKED_PORKCHOP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_PORKCHOP)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_COOKED_PORKCHOP)
                .input('E', Items.EMERALD)
                .input('P', Items.COOKED_PORKCHOP)
                .pattern("EEE")
                .pattern("EPE")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.COOKED_PORKCHOP), conditionsFromItem(Items.COOKED_PORKCHOP))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_PORKCHOP)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.IRON_COOKED_BEEF)
                .input('I', Items.IRON_INGOT)
                .input('B', Items.COOKED_BEEF)
                .pattern("III")
                .pattern("IBI")
                .pattern("III")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.IRON_COOKED_BEEF)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.GOLD_COOKED_BEEF)
                .input('G', Items.GOLD_INGOT)
                .input('B', Items.COOKED_BEEF)
                .pattern("GGG")
                .pattern("GBG")
                .pattern("GGG")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.GOLD_COOKED_BEEF)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.DIAMOND_COOKED_BEEF)
                .input('D', Items.DIAMOND)
                .input('B', Items.COOKED_BEEF)
                .pattern("DDD")
                .pattern("DBD")
                .pattern("DDD")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.DIAMOND_COOKED_BEEF)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, MoreFoodItems.EMERALD_COOKED_BEEF)
                .input('E', Items.EMERALD)
                .input('B', Items.COOKED_BEEF)
                .pattern("EEE")
                .pattern("EBE")
                .pattern("EEE")
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(MoreFood.MOD_ID, getRecipeName(MoreFoodItems.EMERALD_COOKED_BEEF)));

    }
}
