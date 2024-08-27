package io.thejustcube.github.whistle.blocks;

import io.thejustcube.github.whistle.items.ItemWhistle;
import io.thejustcube.github.whistle.registers.WhistleModItems;
import io.thejustcube.github.whistle.util.Whistle;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;

public class BlockWhistle extends Block {
    public BlockWhistle() {
        super(Settings.create()
                .strength(Integer.MAX_VALUE)
        );
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ItemWhistle whistle = (ItemWhistle) WhistleModItems.WHISTLE;

        if (player.getInventory().containsAny(Set.of(WhistleModItems.WHISTLE))) {
            if (!player.getItemCooldownManager().isCoolingDown(whistle)) {
                Whistle.use(world, player, whistle);
            }
        } else {
            player.sendMessage(Text.translatable("string.whistle.whistle_notfound"), true);
        }

        return ActionResult.SUCCESS;
    }
}
