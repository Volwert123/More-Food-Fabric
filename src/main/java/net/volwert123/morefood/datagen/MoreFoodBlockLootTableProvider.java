package net.volwert123.morefood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.volwert123.morefood.block.MoreFoodBlocks;
import net.volwert123.morefood.block.RiceCropBlock;
import net.volwert123.morefood.item.MoreFoodItems;

public class MoreFoodBlockLootTableProvider extends FabricBlockLootTableProvider {
    public MoreFoodBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(MoreFoodBlocks.RICE_CROP).properties(StatePredicate.Builder.create().exactMatch(RiceCropBlock.AGE, 7));
        addDrop(MoreFoodBlocks.RICE_CROP, cropDrops(MoreFoodBlocks.RICE_CROP, MoreFoodItems.RICE, MoreFoodItems.RICE, builder));
    }
}