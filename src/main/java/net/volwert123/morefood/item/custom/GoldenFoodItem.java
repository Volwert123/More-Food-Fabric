package net.volwert123.morefood.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

public class GoldenFoodItem extends Item {
    public GoldenFoodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity player = user instanceof PlayerEntity ? (PlayerEntity) user : null;
        if (player instanceof ServerPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
        }
        if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800));
        if (world.isClient) user.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 1));
        if (player != null) {
            player.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        return super.finishUsing(stack, world, user);
    }
}