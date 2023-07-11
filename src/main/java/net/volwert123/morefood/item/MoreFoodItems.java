package net.volwert123.morefood.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.volwert123.morefood.MoreFood;

public class MoreFoodItems {

    public static final Item IRON_CARROT = registerItem("iron_carrot",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_CARROT = registerItem("diamond_carrot",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000,2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_CARROT = registerItem("emerald_carrot",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200,3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item COOKED_CARROT = registerItem("cooked_carrot",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())));

    public static final Item CARROT_PIECES = registerItem("carrot_pieces",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));

    public static final Item CARROT_SOUP = registerItem("carrot_soup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));
                    }
                    if (player == null || !player.getAbilities().creativeMode){
                        if (stack.isEmpty()){
                            return new ItemStack(Items.BOWL);
                        }
                        if (player != null){
                            player.getInventory().insertStack(new ItemStack(Items.BOWL));
                        }
                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item CARROT_BREAD = registerItem("carrot_bread",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())));


    public static final Item COOKED_APPLE = registerItem("cooked_apple",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())));

    public static final Item CARROT_PIE = registerItem("carrot_pie",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(5f).build())));




    public static final Item IRON_APPLE = registerItem("iron_apple",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_APPLE = registerItem("diamond_apple",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000,2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_APPLE = registerItem("emerald_apple",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200,3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item APPLE_PIECES = registerItem("apple_pieces",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));

    public static final Item APPLE_SOUP = registerItem("apple_soup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));
                    }
                    if (player == null || !player.getAbilities().creativeMode){
                        if (stack.isEmpty()){
                            return new ItemStack(Items.BOWL);
                        }
                        if (player != null){
                            player.getInventory().insertStack(new ItemStack(Items.BOWL));
                        }
                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item APPLE_BREAD = registerItem("apple_bread",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())));

    public static final Item APPLE_PIE = registerItem("apple_pie",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(5f).build())));


    public static final Item IRON_KELP = registerItem("iron_kelp",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item Gold_KELP = registerItem("gold_kelp",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800,1));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item Diamond_KELP = registerItem("diamond_kelp",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000,2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item Emerald_KELP = registerItem("emerald_kelp",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200,3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item KELP_PIECES = registerItem("kelp_pieces",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));


    public static final Item KELP_SOUP = registerItem("kelp_soup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));
                    }
                    if (player == null || !player.getAbilities().creativeMode){
                        if (stack.isEmpty()){
                            return new ItemStack(Items.BOWL);
                        }
                        if (player != null){
                            player.getInventory().insertStack(new ItemStack(Items.BOWL));
                        }
                    }
                    return super.finishUsing(stack, world, user);
                }
            });


    public static final Item IRON_POTATO = registerItem("iron_potato",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item GOLD_POTATO = registerItem("gold_potato",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800,1));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_POTATO = registerItem("diamond_potato",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000,2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_POTATO = registerItem("emerald_potato",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200,3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item POTATO_PIECES = registerItem("potato_pieces",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));

    public static final Item POTATO_SOUP = registerItem("potato_soup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));
                    }
                    if (player == null || !player.getAbilities().creativeMode){
                        if (stack.isEmpty()){
                            return new ItemStack(Items.BOWL);
                        }
                        if (player != null){
                            player.getInventory().insertStack(new ItemStack(Items.BOWL));
                        }
                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item POTATO_BREAD = registerItem("potato_bread",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())));


    public static final Item COOKED_PHANTOM = registerItem("cooked_phantom",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())));


    public static final Item PHANTOM_PIECES = registerItem("phantom_pieces",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));

    public static final Item PHANTOM_SOUP = registerItem("phantom_soup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));
                    }
                    if (player == null || !player.getAbilities().creativeMode){
                        if (stack.isEmpty()){
                            return new ItemStack(Items.BOWL);
                        }
                        if (player != null){
                            player.getInventory().insertStack(new ItemStack(Items.BOWL));
                        }
                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item PUFFERFISH_PIECES = registerItem("pufferfish_pieces",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));

    public static final Item PUFFERFISH_SOUP = registerItem("pufferfish_soup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 700));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));
                    }
                    if (player == null || !player.getAbilities().creativeMode){
                        if (stack.isEmpty()){
                            return new ItemStack(Items.BOWL);
                        }
                        if (player != null){
                            player.getInventory().insertStack(new ItemStack(Items.BOWL));
                        }
                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item PUMPKING_SOUP = registerItem("pumpking_soup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));
                    }
                    if (player == null || !player.getAbilities().creativeMode){
                        if (stack.isEmpty()){
                            return new ItemStack(Items.BOWL);
                        }
                        if (player != null){
                            player.getInventory().insertStack(new ItemStack(Items.BOWL));
                        }
                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item PUMPKING_BREAD = registerItem("pumpking_bread",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())));

    public static final Item COOKED_BAMBOO = registerItem("cooked_bamboo",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())));

    public static final Item BAMBOO_PIECES = registerItem("bamboo_pieces",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)));

    public static final Item BAMBOO_SOUP = registerItem("bamboo_soup",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));
                    }
                    if (player == null || !player.getAbilities().creativeMode){
                        if (stack.isEmpty()){
                            return new ItemStack(Items.BOWL);
                        }
                        if (player != null){
                            player.getInventory().insertStack(new ItemStack(Items.BOWL));
                        }
                    }
                    return super.finishUsing(stack, world, user);
                }
            });


    public static final Item IRON_COOKED_RABBIT = registerItem("iron_cooked_rabbit",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item GOLD_COOKED_RABBIT = registerItem("gold_cooked_rabbit",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800,1));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_COOKED_RABBIT = registerItem("diamond_cooked_rabbit",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000,2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_COOKED_RABBIT = registerItem("emerald_cooked_rabbit",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200,3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item IRON_MELON_SLICE = registerItem("iron_melon_slice",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item GOLD_MELON_SLICE = registerItem("gold_melon_slice",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 1));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_MELON_SLICE = registerItem("diamond_melon_slice",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000, 2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_MELON_SLICE = registerItem("emerald_melon_slice",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item IRON_COOKED_CHICKEN = registerItem("iron_cooked_chicken",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item GOLD_COOKED_CHICKEN = registerItem("gold_cooked_chicken",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 1));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_COOKED_CHICKEN = registerItem("diamond_cooked_chicken",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000, 2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_COOKED_CHICKEN = registerItem("emerald_cooked_chicken",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item IRON_COOKED_MUTTON = registerItem("iron_cooked_mutton",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item GOLD_COOKED_MUTTON = registerItem("gold_cooked_mutton",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 1));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_COOKED_MUTTON = registerItem("diamond_cooked_mutton",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000, 2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_COOKED_MUTTON = registerItem("emerald_cooked_mutton",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(3f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });


    public static final Item IRON_COOKED_PORKCHOP = registerItem("iron_cooked_porkchop",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item GOLD_COOKED_PORKCHOP = registerItem("gold_cooked_porkchop",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 1));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_COOKED_PORKCHOP = registerItem("diamond_cooked_porkchop",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000, 2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_COOKED_PORKCHOP = registerItem("emerald_cooked_porkchop",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item IRON_COOKED_BEEF = registerItem("iron_cooked_beef",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item GOLD_COOKED_BEEF = registerItem("gold_cooked_beef",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 1));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item DIAMOND_COOKED_BEEF = registerItem("diamond_cooked_beef",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1000, 2));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    public static final Item EMERALD_COOKED_BEEF = registerItem("emerald_cooked_beef",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(4f).build())) {
                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
                    PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
                    if (player instanceof ServerPlayerEntity) {
                        Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                    }
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200));
                    if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 3));
                    if (player != null){
                        player.incrementStat(Stats.USED.getOrCreateStat(this));

                    }
                    return super.finishUsing(stack, world, user);
                }
            });

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MoreFood.MOD_ID, name), item);
    }

    public static void registerMoreFoodItems() {
        MoreFood.LOGGER.info("Registering MoreFoodItems for " + MoreFood.MOD_ID);
    }
    }

