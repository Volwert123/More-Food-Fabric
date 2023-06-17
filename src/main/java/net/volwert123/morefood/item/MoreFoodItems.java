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

    public static final Item COOKED_APPLE = registerItem("cooked_apple",
            new Item(new FabricItemSettings().maxCount(64).rarity(Rarity.COMMON)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(2.5f).build())));

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
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MoreFood.MOD_ID, name), item);
    }

    public static void registerMoreFoodItems() {
        MoreFood.LOGGER.info("Registering MoreFoodItems for " + MoreFood.MOD_ID);
    }
}
