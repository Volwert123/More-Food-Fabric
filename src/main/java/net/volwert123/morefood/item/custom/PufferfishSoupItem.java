package net.volwert123.morefood.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

public class PufferfishSoupItem extends Item {
    public PufferfishSoupItem(Settings settings) {
        super(settings.maxCount(1));
    }

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
            player.getHungerManager().add(6, 3f);
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
}