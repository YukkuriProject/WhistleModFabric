package io.thejustcube.github.whistle.items;

import io.thejustcube.github.whistle.util.Whistle;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ItemWhistle extends Item {

    public ItemWhistle() {
        super(new Settings()
                .rarity(Rarity.COMMON)
                .maxCount(1)
        );
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);

        if (!world.isClient()) {
            Whistle.use(world, player, this);
        }

        return TypedActionResult.consume(itemStack);
    }
}
